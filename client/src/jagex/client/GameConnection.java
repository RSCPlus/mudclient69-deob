package jagex.client;

import jagex.Utility;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.IOException;
import java.net.InetAddress;

public class GameConnection extends GameApplet {
    public static String[] loginScreenStatuses = new String[50];
    public static boolean vc = true;
    public static int wc = 99999999;
    public static int xc;
    public static int protocolVersion = 1;
    public String serverAddress = "127.0.0.1";
    public String fallbackServerAddress = "server3.runescape.com";
    public int port = 43594;
    String loginUsername = "";
    String loginPassword = "";
    public ClientStream clientStream;
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

    public void login(String username, String password) {
        try {
            this.loginUsername = username;
            username = Utility.sanitize(username, 20);
            this.loginPassword = password;
            password = Utility.sanitize(password, 20);
            if (username.trim().length() != 0 && password.trim().length() != 0) {
                this.showLoginScreenStatus(loginScreenStatuses[6], loginScreenStatuses[7]);
                if (this.inAppletMode()) {
                    this.clientStream = ClientStream.create(this.serverAddress, this, this.port);
                } else {
                    this.clientStream = ClientStream.create(this.serverAddress, (Applet)null, this.port);
                }

                byte[] randomNonce = new byte[]{127, 0, 0, 1};

                InetAddress var4;
                try {
                    var4 = this.clientStream.o();
                    randomNonce = var4.getAddress();
                } catch (Exception var7) {
                    ;
                }

                if (randomNonce[0] == 127 && randomNonce[1] == 0 && randomNonce[2] == 0 && randomNonce[3] == 1) {
                    try {
                        var4 = InetAddress.getLocalHost();
                        randomNonce = var4.getAddress();
                    } catch (Exception var6) {
                        ;
                    }
                }

                try {
                    if (randomNonce[0] == 127 && randomNonce[1] == 0 && randomNonce[2] == 0 && randomNonce[3] == 1 && this.inAppletMode()) {
                        String var9 = this.getParameter("client");
                        if (var9 != null && var9.equals("exe")) {
                            randomNonce[0] = (byte)((int)(Math.random() * 256.0D));
                            randomNonce[1] = (byte)((int)(Math.random() * 256.0D));
                            randomNonce[2] = (byte)((int)(Math.random() * 256.0D));
                            randomNonce[3] = (byte)((int)(Math.random() * 256.0D));
                        }
                    }
                } catch (Exception var5) {
                    ;
                }

                this.clientStream.createOutgoingPacket(0);
                this.clientStream.c(Utility.username2hash(username));
                this.clientStream.putString(password);
                this.clientStream.putShort(protocolVersion);
                this.clientStream.putByte(randomNonce[0]);
                this.clientStream.putByte(randomNonce[1]);
                this.clientStream.putByte(randomNonce[2]);
                this.clientStream.putByte(randomNonce[3]);
                this.clientStream.f();
                this.clientStream.vb();
                int var10 = this.clientStream.ac();
                System.out.println("Login response: " + var10);
                if (var10 == 0) {
                    this.mb();
                    this.v();
                } else if (var10 == 2) {
                    this.showLoginScreenStatus(loginScreenStatuses[8], loginScreenStatuses[9]);
                } else if (var10 == 3) {
                    this.showLoginScreenStatus(loginScreenStatuses[10], loginScreenStatuses[11]);
                } else if (var10 == 4) {
                    this.showLoginScreenStatus(loginScreenStatuses[4], loginScreenStatuses[5]);
                } else if (var10 == 5) {
                    this.showLoginScreenStatus(loginScreenStatuses[16], loginScreenStatuses[17]);
                } else if (var10 == 6) {
                    this.showLoginScreenStatus(loginScreenStatuses[18], loginScreenStatuses[19]);
                } else if (var10 == 7) {
                    this.showLoginScreenStatus(loginScreenStatuses[20], loginScreenStatuses[21]);
                } else {
                    this.showLoginScreenStatus(loginScreenStatuses[12], loginScreenStatuses[13]);
                }
            } else {
                this.showLoginScreenStatus(loginScreenStatuses[0], loginScreenStatuses[1]);
            }
        } catch (Exception var8) {
            // this.serverAddress = this.fallbackServerAddress; // Commented out, not useful for us...!
            System.out.println(String.valueOf(var8));
            this.showLoginScreenStatus(loginScreenStatuses[12], loginScreenStatuses[13]);
        }
    }

    public void fb(String var1, String var2, String var3, int var4, int var5, int var6) {
        try {
            if (this.inAppletMode()) {
                this.clientStream = ClientStream.create(this.serverAddress, this, this.port);
            } else {
                this.clientStream = ClientStream.create(this.serverAddress, (Applet)null, this.port);
            }

            this.clientStream.createOutgoingPacket(2);
            var1 = Utility.sanitize(var1, 20);
            var2 = Utility.sanitize(var2, 20);
            this.clientStream.c(Utility.username2hash(var1));
            this.clientStream.putString(var2);

            while(var3.length() < 40) {
                var3 = var3 + " ";
            }

            this.clientStream.putString(var3);
            this.clientStream.k(var4);
            this.clientStream.k(var5);
            this.clientStream.k(var6);
            this.clientStream.sendPacket();
            this.clientStream.vb();
            int var7 = this.clientStream.ac();
            this.clientStream.zb();
            System.out.println("Newplayer response: " + var7);
            if (var7 == 0) {
                this.jb();
            } else if (var7 == 2) {
                this.showLoginScreenStatus(loginScreenStatuses[8], loginScreenStatuses[9]);
            } else if (var7 == 3) {
                this.showLoginScreenStatus(loginScreenStatuses[14], loginScreenStatuses[15]);
            } else if (var7 == 4) {
                this.showLoginScreenStatus(loginScreenStatuses[4], loginScreenStatuses[5]);
            } else if (var7 == 5) {
                this.showLoginScreenStatus(loginScreenStatuses[16], loginScreenStatuses[17]);
            } else if (var7 == 6) {
                this.showLoginScreenStatus(loginScreenStatuses[18], loginScreenStatuses[19]);
            } else if (var7 == 7) {
                this.showLoginScreenStatus(loginScreenStatuses[20], loginScreenStatuses[21]);
            } else {
                this.showLoginScreenStatus(loginScreenStatuses[12], loginScreenStatuses[13]);
            }
        } catch (Exception var8) {
            // this.serverAddress = this.fallbackServerAddress; // Commented out, not useful for us...!
            System.out.println(String.valueOf(var8));
            this.showLoginScreenStatus(loginScreenStatuses[12], loginScreenStatuses[13]);
        }
    }

    public void ob() {
        if (this.clientStream != null) {
            this.clientStream.createOutgoingPacket(1);
            this.clientStream.sendPacket();
            this.loginUsername = "";
            this.loginPassword = "";
            this.w();
        }

    }

    public void s(String var1, String var2) {
        this.loginUsername = var1;
        var1 = Utility.sanitize(var1, 20);
        this.loginPassword = var2;
        var2 = Utility.sanitize(var2, 20);
        if (var1.length() != 0 && var2.length() != 0) {
            long var3 = System.currentTimeMillis();

            while(System.currentTimeMillis() - var3 < 60000L) {
                this.t(loginScreenStatuses[2], loginScreenStatuses[3]);

                try {
                    if (this.inAppletMode()) {
                        this.clientStream = ClientStream.create(this.serverAddress, this, this.port);
                    } else {
                        this.clientStream = ClientStream.create(this.serverAddress, (Applet)null, this.port);
                    }

                    byte[] var5 = new byte[]{127, 0, 0, 1};

                    InetAddress var6;
                    try {
                        var6 = this.clientStream.o();
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

                    this.clientStream.createOutgoingPacket(19);
                    this.clientStream.c(Utility.username2hash(var1));
                    this.clientStream.putString(var2);
                    this.clientStream.putShort(protocolVersion);
                    this.clientStream.putByte(var5[0]);
                    this.clientStream.putByte(var5[1]);
                    this.clientStream.putByte(var5[2]);
                    this.clientStream.putByte(var5[3]);
                    this.clientStream.f();
                    this.clientStream.vb();
                    int var11 = this.clientStream.ac();
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
                    this.t(loginScreenStatuses[2], loginScreenStatuses[3]);
                }

                this.t(loginScreenStatuses[2], loginScreenStatuses[3]);

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
        this.s(this.loginUsername, this.loginPassword);
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
                this.clientStream.createOutgoingPacket(5);
                this.clientStream.f();
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

            if (this.fd == 0 && this.clientStream.rb() >= 2) {
                this.fd = this.clientStream.vb();
            }

            if (this.fd > 0 && this.clientStream.rb() >= this.fd) {
                this.clientStream.ub(this.fd, this.hd);
                this.gd = Utility.readByte(this.hd[0]);
                xc = 0;
                if (this.gd == 8) {
                    String var3 = new String(this.hd, 1, this.fd - 1);
                    this.x(Utility.in(var3, true));
                }

                if (this.gd == 9) {
                    this.ob();
                }

                if (this.gd == 10) {
                    this.bb();
                } else {
                    int var9;
                    if (this.gd == 23) {
                        this.kd = Utility.readByte(this.hd[1]);

                        for(var9 = 0; var9 < this.kd; ++var9) {
                            this.ld[var9] = Utility.readLong(this.hd, 2 + var9 * 9);
                            this.md[var9] = Utility.readByte(this.hd[10 + var9 * 9]);
                        }
                    } else {
                        long var8;
                        if (this.gd != 24) {
                            if (this.gd == 26) {
                                this.nd = Utility.readByte(this.hd[1]);

                                for(var9 = 0; var9 < this.nd; ++var9) {
                                    this.od[var9] = Utility.readLong(this.hd, 2 + var9 * 8);
                                }
                            } else if (this.gd == 27) {
                                this.pd = this.hd[1];
                                this.qd = this.hd[2];
                                this.rd = this.hd[3];
                                this.sd = this.hd[4];
                                this.td = this.hd[5];
                            } else if (this.gd == 28) {
                                var8 = Utility.readLong(this.hd, 1);
                                String var10 = new String(this.hd, 9, this.fd - 9);
                                if (var8 != Utility.username2hash(this.loginUsername)) {
                                    var10 = Utility.in(var10, true);
                                }

                                this.x("@pri@" + Utility.rn(var8) + ": tells you " + var10);
                            } else {
                                this.handleIncomingPacket(this.gd, this.fd, this.hd);
                            }
                        } else {
                            var8 = Utility.readLong(this.hd, 1);
                            int var5 = this.hd[9] & 255;

                            for(int var6 = 0; var6 < this.kd; ++var6) {
                                if (this.ld[var6] == var8) {
                                    if (this.md[var6] == 0 && var5 != 0) {
                                        this.x("@pri@" + Utility.rn(var8) + " has logged in");
                                    }

                                    if (this.md[var6] != 0 && var5 == 0) {
                                        this.x("@pri@" + Utility.rn(var8) + " has logged out");
                                    }

                                    this.md[var6] = var5;
                                    this.fd = 0;
                                    return;
                                }
                            }

                            this.ld[this.kd] = var8;
                            this.md[this.kd] = var5;
                            ++this.kd;
                            this.x("@pri@" + Utility.rn(var8) + " has been added to your friends list");
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
        var1 = Utility.sanitize(var1, 20);
        this.clientStream.createOutgoingPacket(25);
        this.clientStream.putString(var1);
        this.clientStream.sendPacket();
    }

    public void pb(int var1, int var2, int var3, int var4, int var5) {
        this.clientStream.createOutgoingPacket(31);
        this.clientStream.putByte(var1);
        this.clientStream.putByte(var2);
        this.clientStream.putByte(var3);
        this.clientStream.putByte(var4);
        this.clientStream.putByte(var5);
        this.clientStream.sendPacket();
    }

    public void nb(String var1) {
        long var2 = Utility.username2hash(var1);
        this.clientStream.createOutgoingPacket(29);
        this.clientStream.c(var2);
        this.clientStream.sendPacket();

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
        this.clientStream.createOutgoingPacket(30);
        this.clientStream.c(var1);
        this.clientStream.sendPacket();

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
        this.clientStream.createOutgoingPacket(26);
        this.clientStream.c(Utility.username2hash(var1));
        this.clientStream.sendPacket();
    }

    public void z(long var1) {
        this.clientStream.createOutgoingPacket(27);
        this.clientStream.c(var1);
        this.clientStream.sendPacket();

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

        this.x("@pri@" + Utility.rn(var1) + " has been removed from your friends list");
    }

    public void u(long var1, String var3) {
        if (var3.length() > 80) {
            var3 = var3.substring(0, 80);
        }

        this.clientStream.createOutgoingPacket(28);
        this.clientStream.c(var1);
        this.clientStream.putByte(var3.length());
        this.clientStream.putString(var3);
        this.clientStream.sendPacket();
        this.x("@pri@You tell " + Utility.rn(var1) + ": " + var3);
    }

    public boolean y(String var1) {
        if (var1.toLowerCase().startsWith("tell ")) {
            var1 = var1.substring(5);
            int var2 = var1.indexOf(32);
            if (var2 != -1 && var2 < var1.length() - 1) {
                String var3 = var1.substring(0, var2);
                var1 = var1.substring(var2 + 1);
                this.u(Utility.username2hash(var3), var1);
                return true;
            } else {
                this.x("You must type a message too!");
                return true;
            }
        } else {
            this.clientStream.createOutgoingPacket(3);
            this.clientStream.putString(var1);
            this.clientStream.sendPacket();
            this.jd = this.id = System.currentTimeMillis();
            if (vc) {
                this.x("@yel@" + this.loginUsername.trim() + ": @whi@" + var1);
            }

            return false;
        }
    }

    public void showLoginScreenStatus(String var1, String var2) {
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

    public void handleIncomingPacket(int var1, int var2, byte[] var3) {
    }

    public void x(String var1) {
    }

    public boolean lb() {
        return true;
    }

    public GameConnection() {
    }

    static {
        loginScreenStatuses[0] = "You must enter both a username";
        loginScreenStatuses[1] = "and a password - Please try again";
        loginScreenStatuses[2] = "Connection lost! Please wait...";
        loginScreenStatuses[3] = "Attempting to re-establish";
        loginScreenStatuses[4] = "That username is already in use.";
        loginScreenStatuses[5] = "Wait 60 seconds then retry";
        loginScreenStatuses[6] = "Please wait...";
        loginScreenStatuses[7] = "Connecting to server";
        loginScreenStatuses[8] = "Sorry! The server is currently full.";
        loginScreenStatuses[9] = "Please try again later";
        loginScreenStatuses[10] = "Invalid username or password.";
        loginScreenStatuses[11] = "Try again, or create a new account";
        loginScreenStatuses[12] = "Sorry! Unable to connect to server.";
        loginScreenStatuses[13] = "Check your internet settings";
        loginScreenStatuses[14] = "Username already taken.";
        loginScreenStatuses[15] = "Please choose another username";
        loginScreenStatuses[16] = "The client has been updated.";
        loginScreenStatuses[17] = "Please reload this page";
        loginScreenStatuses[18] = "You may only use 1 character at once.";
        loginScreenStatuses[19] = "Your ip-address is already in use";
        loginScreenStatuses[20] = "Connection limit exceeded!";
        loginScreenStatuses[21] = "Please try again in 1 minute";
    }
}
