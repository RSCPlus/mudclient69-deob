package jagex.client;

import jagex.o;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.IOException;
import java.net.InetAddress;

public class e extends k {
    public static String[] uc = new String[50];
    public static boolean vc = true;
    public static int wc = 99999999;
    public static int xc;
    public static int yc = 1;
    public String zc = "127.0.0.1";
    public String ad = "server3.runescape.com";
    public int bd = 43594;
    String cd = "";
    String dd = "";
    public a ed;
    int fd;
    int gd;
    byte[] hd = new byte[5000];
    long id;
    long jd;
    public int kd;
    public long[] ld = new long[50];
    public int[] md = new int[50];
    public int nd;
    public long[] od = new long[50];
    public int pd;
    public int qd;
    public int rd;
    public int sd;
    public int td;

    public void hb(String var1, String var2) {
        try {
            this.cd = var1;
            var1 = o.vn(var1, 20);
            this.dd = var2;
            var2 = o.vn(var2, 20);
            if (var1.trim().length() != 0 && var2.trim().length() != 0) {
                this.qb(uc[6], uc[7]);
                if (this.ak()) {
                    this.ed = a.n(this.zc, this, this.bd);
                } else {
                    this.ed = a.n(this.zc, (Applet)null, this.bd);
                }

                byte[] var3 = new byte[]{127, 0, 0, 1};

                InetAddress var4;
                try {
                    var4 = this.ed.o();
                    var3 = var4.getAddress();
                } catch (Exception var7) {
                    ;
                }

                if (var3[0] == 127 && var3[1] == 0 && var3[2] == 0 && var3[3] == 1) {
                    try {
                        var4 = InetAddress.getLocalHost();
                        var3 = var4.getAddress();
                    } catch (Exception var6) {
                        ;
                    }
                }

                try {
                    if (var3[0] == 127 && var3[1] == 0 && var3[2] == 0 && var3[3] == 1 && this.ak()) {
                        String var9 = this.getParameter("client");
                        if (var9 != null && var9.equals("exe")) {
                            var3[0] = (byte)((int)(Math.random() * 256.0D));
                            var3[1] = (byte)((int)(Math.random() * 256.0D));
                            var3[2] = (byte)((int)(Math.random() * 256.0D));
                            var3[3] = (byte)((int)(Math.random() * 256.0D));
                        }
                    }
                } catch (Exception var5) {
                    ;
                }

                this.ed.a(0);
                this.ed.c(o.on(var1));
                this.ed.i(var2);
                this.ed.l(yc);
                this.ed.m(var3[0]);
                this.ed.m(var3[1]);
                this.ed.m(var3[2]);
                this.ed.m(var3[3]);
                this.ed.f();
                this.ed.vb();
                int var10 = this.ed.ac();
                System.out.println("Login response: " + var10);
                if (var10 == 0) {
                    this.mb();
                    this.v();
                } else if (var10 == 2) {
                    this.qb(uc[8], uc[9]);
                } else if (var10 == 3) {
                    this.qb(uc[10], uc[11]);
                } else if (var10 == 4) {
                    this.qb(uc[4], uc[5]);
                } else if (var10 == 5) {
                    this.qb(uc[16], uc[17]);
                } else if (var10 == 6) {
                    this.qb(uc[18], uc[19]);
                } else if (var10 == 7) {
                    this.qb(uc[20], uc[21]);
                } else {
                    this.qb(uc[12], uc[13]);
                }
            } else {
                this.qb(uc[0], uc[1]);
            }
        } catch (Exception var8) {
            this.zc = this.ad;
            System.out.println(String.valueOf(var8));
            this.qb(uc[12], uc[13]);
        }
    }

    public void fb(String var1, String var2, String var3, int var4, int var5, int var6) {
        try {
            if (this.ak()) {
                this.ed = a.n(this.zc, this, this.bd);
            } else {
                this.ed = a.n(this.zc, (Applet)null, this.bd);
            }

            this.ed.a(2);
            var1 = o.vn(var1, 20);
            var2 = o.vn(var2, 20);
            this.ed.c(o.on(var1));
            this.ed.i(var2);

            while(var3.length() < 40) {
                var3 = var3 + " ";
            }

            this.ed.i(var3);
            this.ed.k(var4);
            this.ed.k(var5);
            this.ed.k(var6);
            this.ed.d();
            this.ed.vb();
            int var7 = this.ed.ac();
            this.ed.zb();
            System.out.println("Newplayer response: " + var7);
            if (var7 == 0) {
                this.jb();
            } else if (var7 == 2) {
                this.qb(uc[8], uc[9]);
            } else if (var7 == 3) {
                this.qb(uc[14], uc[15]);
            } else if (var7 == 4) {
                this.qb(uc[4], uc[5]);
            } else if (var7 == 5) {
                this.qb(uc[16], uc[17]);
            } else if (var7 == 6) {
                this.qb(uc[18], uc[19]);
            } else if (var7 == 7) {
                this.qb(uc[20], uc[21]);
            } else {
                this.qb(uc[12], uc[13]);
            }
        } catch (Exception var8) {
            this.zc = this.ad;
            System.out.println(String.valueOf(var8));
            this.qb(uc[12], uc[13]);
        }
    }

    public void ob() {
        if (this.ed != null) {
            this.ed.a(1);
            this.ed.d();
            this.cd = "";
            this.dd = "";
            this.w();
        }

    }

    public void s(String var1, String var2) {
        this.cd = var1;
        var1 = o.vn(var1, 20);
        this.dd = var2;
        var2 = o.vn(var2, 20);
        if (var1.length() != 0 && var2.length() != 0) {
            long var3 = System.currentTimeMillis();

            while(System.currentTimeMillis() - var3 < 60000L) {
                this.t(uc[2], uc[3]);

                try {
                    if (this.ak()) {
                        this.ed = a.n(this.zc, this, this.bd);
                    } else {
                        this.ed = a.n(this.zc, (Applet)null, this.bd);
                    }

                    byte[] var5 = new byte[]{127, 0, 0, 1};

                    InetAddress var6;
                    try {
                        var6 = this.ed.o();
                        var5 = var6.getAddress();
                    } catch (Exception var9) {
                        ;
                    }

                    if (var5[0] == 127 && var5[1] == 0 && var5[2] == 0 && var5[3] == 1) {
                        try {
                            var6 = InetAddress.getLocalHost();
                            var5 = var6.getAddress();
                        } catch (Exception var8) {
                            ;
                        }
                    }

                    this.ed.a(19);
                    this.ed.c(o.on(var1));
                    this.ed.i(var2);
                    this.ed.l(yc);
                    this.ed.m(var5[0]);
                    this.ed.m(var5[1]);
                    this.ed.m(var5[2]);
                    this.ed.m(var5[3]);
                    this.ed.f();
                    this.ed.vb();
                    int var11 = this.ed.ac();
                    if (var11 == 0) {
                        this.mb();
                        this.r();
                        return;
                    }

                    if (var11 >= 1 && var11 <= 6) {
                        var1 = "";
                        var2 = "";
                        this.w();
                        return;
                    }
                } catch (Exception var10) {
                    this.t(uc[2], uc[3]);
                }

                this.t(uc[2], uc[3]);

                try {
                    Thread.sleep(5000L);
                } catch (Exception var7) {
                    ;
                }
            }

            var1 = "";
            var2 = "";
            this.w();
        } else {
            this.w();
        }
    }

    public void gb() {
        System.out.println("Lost connection");
        this.s(this.cd, this.dd);
    }

    public void t(String var1, String var2) {
        Graphics var3 = this.getGraphics();
        Font var4 = new Font("Helvetica", 1, 15);
        int var5 = this.oj();
        int var6 = this.yj();
        var3.setColor(Color.black);
        var3.fillRect(var5 / 2 - 140, var6 / 2 - 25, 280, 50);
        var3.setColor(Color.white);
        var3.drawRect(var5 / 2 - 140, var6 / 2 - 25, 280, 50);
        this.jj(var3, var1, var4, var5 / 2, var6 / 2 - 10);
        this.jj(var3, var2, var4, var5 / 2, var6 / 2 + 10);
    }

    public void mb() {
        this.fd = 0;
        this.gd = 0;
        xc = -500;
        this.kd = 0;
    }

    public void kb() {
        long var1 = System.currentTimeMillis();
        this.jd = var1;
    }

    public void ab() {
        try {
            long var1 = System.currentTimeMillis();
            if (var1 - this.jd > 5000L) {
                this.jd = var1;
                this.ed.a(5);
                this.ed.f();
            }

            if (!this.lb()) {
                return;
            }

            ++xc;
            if (xc > wc) {
                this.mb();
                this.gb();
                return;
            }

            if (this.fd == 0 && this.ed.rb() >= 2) {
                this.fd = this.ed.vb();
            }

            if (this.fd > 0 && this.ed.rb() >= this.fd) {
                this.ed.ub(this.fd, this.hd);
                this.gd = o.qn(this.hd[0]);
                xc = 0;
                if (this.gd == 8) {
                    String var3 = new String(this.hd, 1, this.fd - 1);
                    this.x(o.in(var3, true));
                }

                if (this.gd == 9) {
                    this.ob();
                }

                if (this.gd == 10) {
                    this.bb();
                } else {
                    int var9;
                    if (this.gd == 23) {
                        this.kd = o.qn(this.hd[1]);

                        for(var9 = 0; var9 < this.kd; ++var9) {
                            this.ld[var9] = o.nn(this.hd, 2 + var9 * 9);
                            this.md[var9] = o.qn(this.hd[10 + var9 * 9]);
                        }
                    } else {
                        long var8;
                        if (this.gd != 24) {
                            if (this.gd == 26) {
                                this.nd = o.qn(this.hd[1]);

                                for(var9 = 0; var9 < this.nd; ++var9) {
                                    this.od[var9] = o.nn(this.hd, 2 + var9 * 8);
                                }
                            } else if (this.gd == 27) {
                                this.pd = this.hd[1];
                                this.qd = this.hd[2];
                                this.rd = this.hd[3];
                                this.sd = this.hd[4];
                                this.td = this.hd[5];
                            } else if (this.gd == 28) {
                                var8 = o.nn(this.hd, 1);
                                String var10 = new String(this.hd, 9, this.fd - 9);
                                if (var8 != o.on(this.cd)) {
                                    var10 = o.in(var10, true);
                                }

                                this.x("@pri@" + o.rn(var8) + ": tells you " + var10);
                            } else {
                                this.db(this.gd, this.fd, this.hd);
                            }
                        } else {
                            var8 = o.nn(this.hd, 1);
                            int var5 = this.hd[9] & 255;

                            for(int var6 = 0; var6 < this.kd; ++var6) {
                                if (this.ld[var6] == var8) {
                                    if (this.md[var6] == 0 && var5 != 0) {
                                        this.x("@pri@" + o.rn(var8) + " has logged in");
                                    }

                                    if (this.md[var6] != 0 && var5 == 0) {
                                        this.x("@pri@" + o.rn(var8) + " has logged out");
                                    }

                                    this.md[var6] = var5;
                                    this.fd = 0;
                                    return;
                                }
                            }

                            this.ld[this.kd] = var8;
                            this.md[this.kd] = var5;
                            ++this.kd;
                            this.x("@pri@" + o.rn(var8) + " has been added to your friends list");
                        }
                    }
                }

                this.fd = 0;
                return;
            }
        } catch (IOException var7) {
            this.gb();
        }

    }

    public void cb(String var1) {
        var1 = o.vn(var1, 20);
        this.ed.a(25);
        this.ed.i(var1);
        this.ed.d();
    }

    public void pb(int var1, int var2, int var3, int var4, int var5) {
        this.ed.a(31);
        this.ed.m(var1);
        this.ed.m(var2);
        this.ed.m(var3);
        this.ed.m(var4);
        this.ed.m(var5);
        this.ed.d();
    }

    public void nb(String var1) {
        long var2 = o.on(var1);
        this.ed.a(29);
        this.ed.c(var2);
        this.ed.d();

        for(int var4 = 0; var4 < this.nd; ++var4) {
            if (this.od[var4] == var2) {
                return;
            }
        }

        if (this.nd < 50) {
            this.od[this.nd++] = var2;
        }
    }

    public void eb(long var1) {
        this.ed.a(30);
        this.ed.c(var1);
        this.ed.d();

        for(int var3 = 0; var3 < this.nd; ++var3) {
            if (this.od[var3] == var1) {
                --this.nd;

                for(int var4 = var3; var4 < this.nd; ++var4) {
                    this.od[var4] = this.od[var4 + 1];
                }

                return;
            }
        }

    }

    public void ib(String var1) {
        this.ed.a(26);
        this.ed.c(o.on(var1));
        this.ed.d();
    }

    public void z(long var1) {
        this.ed.a(27);
        this.ed.c(var1);
        this.ed.d();

        label23:
        for(int var3 = 0; var3 < this.kd; ++var3) {
            if (this.ld[var3] == var1) {
                --this.kd;
                int var4 = var3;

                while(true) {
                    if (var4 >= this.kd) {
                        break label23;
                    }

                    this.ld[var4] = this.ld[var4 + 1];
                    this.md[var4] = this.md[var4 + 1];
                    ++var4;
                }
            }
        }

        this.x("@pri@" + o.rn(var1) + " has been removed from your friends list");
    }

    public void u(long var1, String var3) {
        if (var3.length() > 80) {
            var3 = var3.substring(0, 80);
        }

        this.ed.a(28);
        this.ed.c(var1);
        this.ed.m(var3.length());
        this.ed.i(var3);
        this.ed.d();
        this.x("@pri@You tell " + o.rn(var1) + ": " + var3);
    }

    public boolean y(String var1) {
        if (var1.toLowerCase().startsWith("tell ")) {
            var1 = var1.substring(5);
            int var2 = var1.indexOf(32);
            if (var2 != -1 && var2 < var1.length() - 1) {
                String var3 = var1.substring(0, var2);
                var1 = var1.substring(var2 + 1);
                this.u(o.on(var3), var1);
                return true;
            } else {
                this.x("You must type a message too!");
                return true;
            }
        } else {
            this.ed.a(3);
            this.ed.i(var1);
            this.ed.d();
            this.jd = this.id = System.currentTimeMillis();
            if (vc) {
                this.x("@yel@" + this.cd.trim() + ": @whi@" + var1);
            }

            return false;
        }
    }

    public void qb(String var1, String var2) {
    }

    public void r() {
    }

    public void v() {
    }

    public void w() {
    }

    public void bb() {
    }

    public void jb() {
    }

    public void db(int var1, int var2, byte[] var3) {
    }

    public void x(String var1) {
    }

    public boolean lb() {
        return true;
    }

    public e() {
    }

    static {
        uc[0] = "You must enter both a username";
        uc[1] = "and a password - Please try again";
        uc[2] = "Connection lost! Please wait...";
        uc[3] = "Attempting to re-establish";
        uc[4] = "That username is already in use.";
        uc[5] = "Wait 60 seconds then retry";
        uc[6] = "Please wait...";
        uc[7] = "Connecting to server";
        uc[8] = "Sorry! The server is currently full.";
        uc[9] = "Please try again later";
        uc[10] = "Invalid username or password.";
        uc[11] = "Try again, or create a new account";
        uc[12] = "Sorry! Unable to connect to server.";
        uc[13] = "Check your internet settings";
        uc[14] = "Username already taken.";
        uc[15] = "Please choose another username";
        uc[16] = "The client has been updated.";
        uc[17] = "Please reload this page";
        uc[18] = "You may only use 1 character at once.";
        uc[19] = "Your ip-address is already in use";
        uc[20] = "Connection limit exceeded!";
        uc[21] = "Please try again in 1 minute";
    }
}
