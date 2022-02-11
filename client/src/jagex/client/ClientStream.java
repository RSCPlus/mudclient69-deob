package jagex.client;

import jagex.Buffer;
import java.applet.Applet;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

public class ClientStream extends Buffer implements Runnable {
    private boolean a = false;
    private String b = "error in twriter";
    private byte[] c;
    private int d;
    private int e;
    private Thread f;
    private boolean g = true;
    public int h = 3;
    public byte[] i;

    public ClientStream(InputStream var1) {
        super(var1);
    }

    public ClientStream(Socket var1) throws IOException {
        super(var1);
    }

    public ClientStream(String var1) throws IOException {
        super(var1);
    }

    public ClientStream(byte[] var1) {
        super(var1);
    }

    public static ClientStream n(String var0, Applet var1, int var2) throws IOException {
        Socket var3;
        if (var1 != null) {
            var3 = new Socket(InetAddress.getByName(var1.getCodeBase().getHost()), var2);
        } else {
            var3 = new Socket(InetAddress.getByName(var0), var2);
        }

        var3.setSoTimeout(30000);
        return new ClientStream(var3);
    }

    public void zb() {
        if (!super.xd) {
            try {
                if (super.wd != null) {
                    super.wd.close();
                }

                if (this.f != null) {
                    this.g = true;
                    synchronized(this){}

                    try {
                        this.notify();
                    } catch (Throwable var4) {
                        throw var4;
                    }

                    this.f = null;
                }

                if (super.ud != null) {
                    super.ud.close();
                }

                if (super.vd != null) {
                    super.vd.close();
                }

                this.c = null;
                this.i = null;
            } catch (IOException var5) {
                System.out.println("Error closing stream");
            }
        }
    }

    public InetAddress o() {
        return super.wd.getLocalAddress();
    }

    public void j(byte[] var1, int var2, int var3) throws IOException {
        if (!super.xd) {
            super.vd.write(var1, var2, var3);
        }
    }

    public void b(byte[] var1, int var2, int var3, boolean var4) throws IOException {
        if (!super.xd) {
            if (this.c == null) {
                this.c = new byte[5000];
            }

            synchronized(this){}

            try {
                for(int var7 = 0; var7 < var3; ++var7) {
                    this.c[this.e] = var1[var7 + var2];
                    this.e = (this.e + 1) % 5000;
                    if (this.e == (this.d + 4900) % 5000) {
                        this.a = true;
                        this.b = "Write buffer full! " + var3;
                        var7 = var3 + 1;
                        this.g = true;
                        super.ud.close();
                        super.vd.close();
                        super.xd = true;
                        break;
                    }
                }

                if (var4) {
                    if (this.f == null) {
                        this.g = false;
                        this.f = new Thread(this);
                        this.f.setDaemon(true);
                        this.f.setPriority(4);
                        this.f.start();
                    }

                    this.notify();
                }
            } catch (Throwable var9) {
                throw var9;
            }

            if (this.a) {
                throw new IOException(this.b);
            }
        }
    }

    public void e() {
        synchronized(this){}

        try {
            if (this.e != this.d && this.c != null) {
                if (this.f == null) {
                    this.g = false;
                    this.f = new Thread(this);
                    this.f.setDaemon(true);
                    this.f.setPriority(4);
                    this.f.start();
                }

                this.notify();
                return;
            }
        } catch (Throwable var4) {
            throw var4;
        }

    }

    public void run() {
        while(this.f != null && !this.g) {
            synchronized(this){}

            int var1;
            int var2;
            try {
                if (this.e == this.d) {
                    try {
                        this.wait();
                    } catch (InterruptedException var11) {
                        ;
                    }
                }

                if (this.f == null || this.g) {
                    return;
                }

                var2 = this.d;
                if (this.e >= this.d) {
                    var1 = this.e - this.d;
                } else {
                    var1 = 5000 - this.d;
                }
            } catch (Throwable var12) {
                throw var12;
            }

            if (var1 > 0) {
                try {
                    super.vd.write(this.c, var2, var1);
                } catch (IOException var10) {
                    this.a = true;
                    this.b = "Twriter IOEx:" + var10;
                }

                this.d = (this.d + var1) % 5000;

                try {
                    if (this.e == this.d) {
                        super.vd.flush();
                    }
                } catch (IOException var9) {
                    this.a = true;
                    this.b = "Twriter IOEx:" + var9;
                }
            }
        }

    }

    public void a(int var1) {
        if (this.i == null) {
            this.i = new byte[4000];
        }

        this.i[2] = (byte)var1;
        this.h = 3;
    }

    public void m(int var1) {
        this.i[this.h++] = (byte)var1;
    }

    public void l(int var1) {
        this.i[this.h++] = (byte)(var1 >> 8);
        this.i[this.h++] = (byte)var1;
    }

    public void k(int var1) {
        this.i[this.h++] = (byte)(var1 >> 24);
        this.i[this.h++] = (byte)(var1 >> 16);
        this.i[this.h++] = (byte)(var1 >> 8);
        this.i[this.h++] = (byte)var1;
    }

    public void c(long var1) {
        this.k((int)(var1 >> 32));
        this.k((int)(var1 & -1L));
    }

    public void i(String var1) {
        var1.getBytes(0, var1.length(), this.i, this.h);
        this.h += var1.length();
    }

    public void g(int var1, int var2) {
        this.i[var2++] = (byte)(var1 >> 8);
        this.i[var2++] = (byte)var1;
    }

    public void f() throws IOException {
        this.i[0] = (byte)((this.h - 2) / 256);
        this.i[1] = (byte)(this.h - 2 & 255);
        this.b(this.i, 0, this.h, true);
    }

    public void d() {
        this.i[0] = (byte)((this.h - 2) / 256);
        this.i[1] = (byte)(this.h - 2 & 255);

        try {
            this.b(this.i, 0, this.h, true);
        } catch (IOException var1) {
            ;
        }
    }

    public void h() {
        this.i[0] = (byte)((this.h - 2) / 256);
        this.i[1] = (byte)(this.h - 2 & 255);

        try {
            this.b(this.i, 0, this.h, false);
        } catch (IOException var1) {
            ;
        }
    }
}
