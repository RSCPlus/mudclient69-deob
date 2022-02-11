package jagex;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Buffer {
    protected InputStream ud;
    protected OutputStream vd;
    protected Socket wd;
    protected boolean xd = false;
    protected byte[] yd;
    int zd;
    final int ae = 61;
    final int be = 59;
    final int ce = 42;
    final int de = 43;
    final int ee = 44;
    final int fe = 45;
    final int ge = 46;
    final int he = 47;
    final int ie = 92;
    final int je = 32;
    final int ke = 124;
    final int le = 34;
    static char[] me = new char[256];

    public Buffer(InputStream var1) {
        this.ud = var1;
    }

    public Buffer(Socket var1) throws IOException {
        this.wd = var1;
        this.ud = var1.getInputStream();
        this.vd = var1.getOutputStream();
    }

    public Buffer(String var1) throws IOException {
        this.ud = Utility.fn(var1);
    }

    public Buffer(byte[] var1) {
        this.yd = var1;
        this.zd = 0;
        this.xd = true;
    }

    public Buffer(byte[] var1, int var2) {
        this.yd = var1;
        this.zd = var2;
        this.xd = true;
    }

    public void zb() {
        if (!this.xd) {
            if (this.vd != null) {
                try {
                    this.vd.flush();
                } catch (IOException var2) {
                    ;
                }
            }

            try {
                if (this.wd != null) {
                    this.wd.close();
                }

                if (this.ud != null) {
                    this.ud.close();
                }

                if (this.vd != null) {
                    this.vd.close();
                    return;
                }
            } catch (IOException var1) {
                System.out.println("Error closing stream");
            }

        }
    }

    public int ac() throws IOException {
        if (this.yd != null) {
            return this.yd[this.zd++];
        } else {
            return this.xd ? 0 : this.ud.read();
        }
    }

    public int wb() throws IOException {
        return this.ac();
    }

    public int vb() throws IOException {
        int var1 = this.wb();
        int var2 = this.wb();
        return var1 * 256 + var2;
    }

    public int rb() throws IOException {
        return this.xd ? 0 : this.ud.available();
    }

    public void ub(int var1, byte[] var2) throws IOException {
        if (!this.xd) {
            int var3 = 0;

            int var5;
            for(boolean var4 = false; var3 < var1; var3 += var5) {
                if ((var5 = this.ud.read(var2, var3, var1 - var3)) <= 0) {
                    throw new IOException("EOF");
                }
            }

        }
    }

    public void sb() throws IOException {
        for(int var1 = this.ac(); var1 != 61 && var1 != -1; var1 = this.ac()) {
            ;
        }

    }

    public int xb() throws IOException {
        int var1 = 0;
        boolean var3 = false;
        int var2 = this.ac();

        do {
            if (var2 >= 48 && var2 <= 57) {
                while(var2 >= 48 && var2 <= 57) {
                    var1 = var1 * 10 + var2 - 48;
                    var2 = this.ac();
                }

                if (var3) {
                    var1 = -var1;
                }

                return var1;
            }

            if (var2 == 45) {
                var3 = true;
            }

            var2 = this.ac();
        } while(var2 != -1);

        throw new IOException("Eof!");
    }

    public String yb() throws IOException {
        String var1 = "";
        boolean var3 = false;
        int var2 = this.ac();

        do {
            if (var2 >= 32 && var2 != 44 && var2 != 59 && var2 != 61) {
                if (var2 == 34) {
                    var3 = true;
                    var2 = this.ac();
                }

                while(var2 != -1 && (var3 || var2 != 44 && var2 != 61 && var2 != 59) && (!var3 || var2 != 34)) {
                    var1 = var1 + me[var2];
                    var2 = this.ac();
                }

                return var1;
            }

            var2 = this.ac();
        } while(var2 != -1);

        throw new IOException("Eof!");
    }

    public int tb() throws IOException {
        int var1 = 0;
        int var2 = this.ac();

        while((var2 < 48 || var2 > 57) && (var2 < 97 || var2 > 102) && (var2 < 65 || var2 > 70)) {
            var2 = this.ac();
            if (var2 == -1) {
                throw new IOException("Eof!");
            }
        }

        while(true) {
            if (var2 >= 48 && var2 <= 57) {
                var1 = var1 * 16 + var2 - 48;
            } else if (var2 >= 97 && var2 <= 102) {
                var1 = var1 * 16 + var2 + 10 - 97;
            } else {
                if (var2 < 65 || var2 > 70) {
                    return var1;
                }

                var1 = var1 * 16 + var2 + 10 - 65;
            }

            var2 = this.ac();
        }
    }

    static {
        for(int var0 = 0; var0 < 256; ++var0) {
            me[var0] = (char)var0;
        }

        me[61] = '=';
        me[59] = ';';
        me[42] = '*';
        me[43] = '+';
        me[44] = ',';
        me[45] = '-';
        me[46] = '.';
        me[47] = '/';
        me[92] = '\\';
        me[124] = '|';
        me[33] = '!';
        me[34] = '"';
    }
}
