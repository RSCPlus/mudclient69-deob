import jagex.Utility;
import jagex.client.GameConnection;
import jagex.client.Panel;
import jagex.client.GameModel;
import jagex.client.Surface;
import jagex.client.Scene;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

public class mudclient extends GameConnection {
    final boolean wantToLoadFromJag = true; // inauthentic boolean placed so that it's not necessary to extract jag files
    boolean xs = false;
    int ys;
    int zs;
    boolean at = false;
    boolean bt = false;
    public boolean ct = true;
    int dt;
    int et = 12345678;
    int ft;
    int gt = 8000;
    int[] ht;
    int[] it;
    Graphics jt;
    Scene kt;
    SurfaceSprite lt;
    Image mt;
    int nt;
    int ot;
    int pt;
    int qt;
    int rt;
    int st;
    int tt;
    int ut;
    int vt;
    int wt;
    int xt;
    int yt;
    int zt;
    int au;
    int bu;
    int cu;
    int du;
    int eu;
    World fu;
    int gu;
    int hu;
    int iu;
    int ju;
    int ku;
    int lu;
    int mu;
    int nu;
    int ou;
    int pu;
    int qu;
    int ru;
    int su;
    int tu;
    int uu;
    boolean vu;
    int wu;
    int xu;
    int yu;
    int zu;
    int av;
    int bv;
    int cv;
    int dv;
    int ev;
    int fv;
    int gv;
    Character[] hv;
    Character[] iv;
    Character[] jv;
    Character kv;
    int lv;
    int mv;
    int nv;
    int ov;
    int pv;
    int qv;
    int rv;
    Character[] sv;
    Character[] tv;
    Character[] uv;
    int[] vv;
    int wv;
    int xv;
    int yv;
    int[] zv;
    int[] aw;
    int[] bw;
    int[] cw;
    int dw;
    int ew;
    GameModel[] fw;
    int[] gw;
    int[] hw;
    int[] iw;
    int[] jw;
    GameModel[] kw;
    boolean[] lw;
    int mw;
    int nw;
    GameModel[] ow;
    int[] pw;
    int[] qw;
    int[] rw;
    int[] sw;
    boolean[] tw;
    int uw;
    int vw;
    int ww;
    int[] xw;
    int[] yw;
    int[] zw;
    int ax;
    String bx;
    int[] cx;
    int[] dx;
    int[] ex;
    int fx;
    String[] gx;
    String[] hx;
    Panel ix;
    int jx;
    int kx;
    int lx;
    Panel mx;
    int nx;
    int ox;
    long px;
    Panel qx;
    int rx;
    int sx;
    int tx;
    String[] ux;
    boolean[] vx;
    boolean[] wx;
    boolean xx;
    boolean yx;
    boolean zx;
    boolean ay;
    int by;
    int cy;
    int dy;
    int ey;
    int fy;
    int gy;
    boolean hy;
    String[] iy;
    String[] jy;
    int[] ky;
    int[] ly;
    int[] my;
    int[] ny;
    int[] oy;
    int[] py;
    int[] qy;
    int ry;
    int sy;
    int ty;
    int uy;
    Panel vy;
    int wy;
    int xy;
    int yy;
    int zy;
    int az;
    int bz;
    String[] cz;
    int[] dz;
    boolean ez;
    String fz;
    int gz;
    int[] hz;
    int[] iz;
    int jz;
    int[] kz;
    int[] lz;
    boolean mz;
    boolean nz;
    int oz;
    int pz;
    boolean qz;
    int rz;
    int sz;
    int[] tz;
    int[] uz;
    int[] vz;
    int wz;
    int xz;
    boolean yz;
    int zz;
    String[] aab;
    int bab;
    int cab;
    int dab;
    int eab;
    int fab;
    String gab;
    int hab;
    int iab;
    int jab;
    boolean kab;
    int lab;
    int mab;
    Panel nab;
    int oab;
    int pab;
    Panel qab;
    int rab;
    int sab;
    int tab;
    int uab;
    int vab;
    int wab;
    int xab;
    int yab;
    Panel zab;
    int abb;
    int bbb;
    int cbb;
    int dbb;
    int ebb;
    int fbb;
    int gbb;
    int hbb;
    String ibb;
    String jbb;
    String kbb;
    String lbb;
    Panel mbb;
    int nbb;
    int obb;
    int pbb;
    int qbb;
    int rbb;
    int sbb;
    int tbb;
    int ubb;
    int vbb;
    int wbb;
    int xbb;
    int ybb;
    int zbb;
    int acb;
    int bcb;
    int ccb;
    Panel dcb;
    Panel ecb;
    Panel fcb;
    Panel gcb;
    Panel hcb;
    int icb;
    int jcb;
    int kcb;
    int lcb;
    int mcb;
    int ncb;
    int ocb;
    int pcb;
    int qcb;
    int rcb;
    int scb;
    int tcb;
    int ucb;
    int vcb;
    int wcb;
    int xcb;
    int ycb;
    int zcb;
    int adb;
    int[] bdb;
    int cdb;
    int ddb;
    int edb;
    int fdb;
    int gdb;
    int hdb;
    int idb;
    int jdb;
    int kdb;
    int ldb;
    int mdb;
    int ndb;
    int odb;
    int pdb;
    boolean qdb;
    Panel rdb;
    int sdb;
    int tdb;
    int udb;
    int[] vdb;
    int[] wdb;
    int[] xdb;
    int[] ydb;
    int[] zdb;
    String[] aeb;
    int beb;
    String[] ceb;
    int[] deb;
    int[] eeb;
    int[] feb;
    int[] geb;
    int heb;
    int[] ieb;
    int[] jeb;
    int[] keb;
    int[] leb;
    int meb;
    int[] neb;
    int[] oeb;
    int[] peb;
    int qeb;
    int reb;
    int[][] seb;
    boolean teb;
    int ueb;
    int veb;
    int web;
    int xeb;
    int yeb;
    int zeb;
    int afb;
    int bfb;
    public int[] cfb;
    public int[] dfb;
    public int[] efb;
    int[] ffb;
    int[] gfb;
    int[] hfb;
    String[] ifb;

    public static void main(String[] var0) {
        mudclient var1 = new mudclient();
        var1.ct = false;
        var1.ej(var1.qt, var1.rt + 22, "Runescape by Andrew Gower", false);
        var1.jq = 10;
    }

    public void ij() {
        if (this.ct) {
            String var1 = this.getDocumentBase().getHost().toLowerCase();
            if (!var1.endsWith("jagex.com") && !var1.endsWith("jagex.co.uk") && !var1.endsWith("runescape.com") && !var1.endsWith("runescape.co.uk") && !var1.endsWith("runescape.net") && !var1.endsWith("runescape.org") && !var1.endsWith("64.23.81.81") && !var1.endsWith("64.23.81.89") && !var1.endsWith("penguin.local") && !var1.endsWith("puffin.local") && !var1.endsWith("jagex.dnsalias.com")) {
                this.at = true;
                return;
            }
        }

        super.bd = 43594;
        super.pp = -11;
        GameConnection.wc = 1000;
        GameConnection.vc = false;
        GameConnection.yc = Version.hc;
        this.cl();
        this.ut = 2000;
        this.tt = this.ut + 100;
        this.yv = this.tt + 50;
        this.wt = this.yv + 300;
        this.jt = this.getGraphics();
        this.vj(50);
        this.lt = new SurfaceSprite(this.qt, this.rt + 12, 2600, this);
        this.lt.gs = this;
        this.lt.vf(0, 0, this.qt, this.rt + 12);
        Panel.bg = false;
        Panel.cg = this.tt;
        this.ix = new Panel(this.lt, 5);
        int var3 = this.lt.qj - 199;
        byte var2 = 36;
        this.jx = this.ix.tc(var3, var2 + 24, 196, 90, 1, 500, true);
        this.mx = new Panel(this.lt, 5);
        this.nx = this.mx.tc(var3, var2 + 40, 196, 126, 1, 500, true);
        this.qx = new Panel(this.lt, 5);
        this.rx = this.qx.tc(var3, var2 + 24, 196, 182, 1, 500, true);
        this.nm();
        this.fm(true);
        this.kt = new Scene(this.lt, 15000, 15000, 1000);
        this.kt.ii(this.qt / 2, this.rt / 2, this.qt / 2, this.rt / 2, this.qt, this.st);
        this.kt.bm = 2400;
        this.kt.cm = 2400;
        this.kt.dm = 1;
        this.kt.em = 2300;
        this.kt.hi(-50, -10, -50);
        this.fu = new World(this.kt, this.lt);
        this.fu.yfb = this.ut;
        this.hm();
        this.pl();
        this.dn();
        this.qj(100, "Starting game...");
        this.rl();
        this.al();
        this.ql();
        this.ll();
        this.zl();
        this.wk();
        this.ck();
        this.bm();
    }

    public void cl() {
        if (this.ak() || wantToLoadFromJag) {
            byte[] var1 = null;

            try {
                var1 = this.gj("config" + Version.ic + ".jag", "Configuration", 10);
            } catch (IOException var3) {
                System.out.println("Load error:" + var3);
            }

            GameData.op(var1);
        } else {
            this.rj(10, "Loading configuration");
            GameData.vp();
        }
    }

    public void nm() {
        byte[] var1;
        int var2;
        int var3;
        int var4;
        if (this.ak() || wantToLoadFromJag) {
            var1 = null;

            try {
                var1 = this.gj("media" + Version.kc + ".jag", "2d graphics", 20);
            } catch (IOException var5) {
                System.out.println("Load error:" + var5);
            }

            this.lt.mg(var1, Utility.hn("inv1.tga", var1), this.ut, true, false);
            this.lt.kg(var1, Utility.hn("inv2.tga", var1), this.ut + 1, true, 1, 6, false);
            this.lt.mg(var1, Utility.hn("bubble.tga", var1), this.ut + 9, true, false);
            this.lt.mg(var1, Utility.hn("runescape.tga", var1), this.ut + 10, true, false);
            this.lt.rg(var1, Utility.hn("splat.tga", var1), this.ut + 11, true, 3, false);
            this.lt.kg(var1, Utility.hn("icon.tga", var1), this.ut + 14, true, 4, 2, false);
            this.lt.mg(var1, Utility.hn("hbar.tga", var1), this.ut + 22, false, false);
            this.lt.mg(var1, Utility.hn("hbar2.tga", var1), this.ut + 23, true, false);
            this.lt.mg(var1, Utility.hn("compass.tga", var1), this.ut + 24, true, false);
            this.lt.rg(var1, Utility.hn("scrollbar.tga", var1), this.tt, true, 2, false);
            this.lt.rg(var1, Utility.hn("corners.tga", var1), this.tt + 2, true, 4, false);
            this.lt.rg(var1, Utility.hn("arrows.tga", var1), this.tt + 6, true, 2, false);
            this.mt = this.lj(Utility.gn("hbar.tga", 0, var1));
            var2 = GameData.uhb;

            for(var3 = 1; var2 > 0; ++var3) {
                var4 = var2;
                var2 -= 30;
                if (var4 > 30) {
                    var4 = 30;
                }

                this.lt.kg(var1, Utility.hn("objects" + var3 + ".tga", var1), this.yv + (var3 - 1) * 30, true, 10, (var4 + 9) / 10, false);
            }

            this.lt.rg(var1, Utility.hn("projectile.tga", var1), this.wt, true, GameData.hlb, false);
        } else {
            var1 = new byte[100000];
            this.qj(20, "Loading 2d graphics");

            try {
                Utility.en("../gamedata/media/inv1.tga", var1, 100000);
                this.lt.mg(var1, 0, this.ut, true, false);
                Utility.en("../gamedata/media/inv2.tga", var1, 100000);
                this.lt.kg(var1, 0, this.ut + 1, true, 1, 6, false);
                Utility.en("../gamedata/media/bubble.tga", var1, 100000);
                this.lt.mg(var1, 0, this.ut + 9, true, false);
                Utility.en("../gamedata/media/runescape.tga", var1, 100000);
                this.lt.mg(var1, 0, this.ut + 10, true, false);
                Utility.en("../gamedata/media/splat.tga", var1, 100000);
                this.lt.rg(var1, 0, this.ut + 11, true, 3, false);
                Utility.en("../gamedata/media/icon.tga", var1, 100000);
                this.lt.kg(var1, 0, this.ut + 14, true, 4, 2, false);
                Utility.en("../gamedata/media/hbar.tga", var1, 100000);
                this.lt.mg(var1, 0, this.ut + 22, false, false);
                this.mt = this.lj(var1);
                Utility.en("../gamedata/media/hbar2.tga", var1, 100000);
                this.lt.mg(var1, 0, this.ut + 23, true, false);
                Utility.en("../gamedata/media/compass.tga", var1, 100000);
                this.lt.mg(var1, 0, this.ut + 24, true, false);
                Utility.en("../gamedata/media/scrollbar.tga", var1, 100000);
                this.lt.rg(var1, 0, this.tt, true, 2, false);
                Utility.en("../gamedata/media/corners.tga", var1, 100000);
                this.lt.rg(var1, 0, this.tt + 2, true, 4, false);
                Utility.en("../gamedata/media/arrows.tga", var1, 100000);
                this.lt.rg(var1, 0, this.tt + 6, true, 2, false);
                var2 = GameData.uhb;

                for(var3 = 1; var2 > 0; ++var3) {
                    var4 = var2;
                    var2 -= 30;
                    if (var4 > 30) {
                        var4 = 30;
                    }

                    Utility.en("../gamedata/media/objects" + var3 + ".tga", var1, 100000);
                    this.lt.kg(var1, 0, this.yv + (var3 - 1) * 30, true, 10, (var4 + 9) / 10, false);
                }

                Utility.en("../gamedata/media/projectile.tga", var1, 100000);
                this.lt.rg(var1, 0, this.wt, true, GameData.hlb, false);
            } catch (IOException var6) {
                var6.printStackTrace(); // AAAAA
                System.out.println("ERROR: in raw media loader");
            }
        }
    }

    public void fm(boolean var1) {
        this.qeb = 0;
        this.reb = this.qeb;
        byte[] var2 = null;
        if ((this.ak() || wantToLoadFromJag) && var1) {
            String var3 = "entity" + Version.nc + ".jag";

            try {
                var2 = this.gj(var3, "people and monsters", 30);
            } catch (IOException var10) {
                System.out.println("Load error:" + var10);
            }
        } else {
            this.qj(30, "Loading people and monsters");
        }

        int var11 = 0;

        label68:
        for(int var4 = 0; var4 < GameData.sjb; ++var4) {
            String var5 = GameData.ujb[var4];

            for(int var6 = 0; var6 < var4; ++var6) {
                if (GameData.ujb[var6].equalsIgnoreCase(var5)) {
                    GameData.zjb[var4] = GameData.zjb[var6];
                    continue label68;
                }
            }

            if (var1) {
                if (this.ak() || wantToLoadFromJag) {
                    boolean var7 = true;
                    if (GameData.wjb[var4] != 0) {
                        var7 = false;
                    }

                    this.lt.rg(Utility.gn(var5 + ".tga", 0, var2), 0, this.reb, true, 15, var7);
                    var11 += 15;
                    if (GameData.xjb[var4] == 1) {
                        this.lt.rg(Utility.gn(var5 + "a.tga", 0, var2), 0, this.reb + 15, true, 3, true);
                        var11 += 3;
                    }

                    if (GameData.yjb[var4] == 1) {
                        this.lt.rg(Utility.gn(var5 + "f.tga", 0, var2), 0, this.reb + 18, true, 9, true);
                        var11 += 9;
                    }
                } else {
                    try {
                        byte[] var12 = new byte[300000];
                        Utility.en("../gamedata/entity/" + var5 + ".tga", var12, 300000);
                        var11 += 15;
                        boolean var8 = true;
                        if (GameData.wjb[var4] != 0) {
                            var8 = false;
                        }

                        this.lt.rg(var12, 0, this.reb, true, 15, var8);
                        if (GameData.xjb[var4] == 1) {
                            Utility.en("../gamedata/entity/" + var5 + "a.tga", var12, 300000);
                            var11 += 3;
                            this.lt.rg(var12, 0, this.reb + 15, true, 3, true);
                        }

                        if (GameData.yjb[var4] == 1) {
                            Utility.en("../gamedata/entity/" + var5 + "f.tga", var12, 300000);
                            var11 += 9;
                            this.lt.rg(var12, 0, this.reb + 18, true, 9, true);
                        }
                    } catch (IOException var9) {
                        System.out.println("ERROR: in raw entity loader - no:" + var4 + " " + var5);
                    }
                }
            }

            GameData.zjb[var4] = this.reb;
            this.reb += 27;
        }

        System.out.println("Loaded: " + var11 + " frames of animation");
    }

    public void hm() {
        if (this.ak() || wantToLoadFromJag) {
            this.kt.ih("textures" + Version.mc + ".jag", 7, 11, 50, this);
        } else {
            this.qj(50, "Loading textures");
            this.kt.qi("../gamedata/textures");
        }
    }

    public void pl() {
        GameData.mp("torcha2");
        GameData.mp("torcha3");
        GameData.mp("torcha4");
        GameData.mp("skulltorcha2");
        GameData.mp("skulltorcha3");
        GameData.mp("skulltorcha4");
        GameData.mp("firea2");
        GameData.mp("firea3");
        if (this.ak() || wantToLoadFromJag) {
            byte[] var5 = null;

            try {
                var5 = this.gj("models" + Version.lc + ".jag", "3d models", 70);
            } catch (IOException var4) {
                System.out.println("Load error:" + var4);
            }

            for(int var2 = 0; var2 < GameData.pmb; ++var2) {
                int var3 = Utility.hn(GameData.qmb[var2] + ".ob2", var5);
                if (var3 != 0) {
                    this.kw[var2] = new GameModel(var5, var3);
                } else {
                    this.kw[var2] = new GameModel(1, 1);
                }
            }

        } else {
            this.qj(70, "Loading 3d models");

            for(int var1 = 0; var1 < GameData.pmb; ++var1) {
                this.kw[var1] = new GameModel("../gamedata/models/" + GameData.qmb[var1] + ".ob2");
            }

        }
    }

    public void dn() {
        if (this.ak() || wantToLoadFromJag) {
            this.fu.ggb = null;

            try {
                this.fu.ggb = this.gj("maps" + Version.jc + ".jag", "map", 90);
            } catch (IOException var2) {
                System.out.println("Load error:" + var2);
            }
        } else {
            this.fu.ufb = false;
        }
    }

    public void rl() {
        this.vy = new Panel(this.lt, 10);
        this.wy = this.vy.dc(5, 269, 502, 56, 1, 20, true);
        this.xy = this.vy.ec(7, 324, 498, 14, 1, 80, false, true);
        this.yy = this.vy.dc(5, 269, 502, 56, 1, 20, true);
        this.zy = this.vy.dc(5, 269, 502, 56, 1, 20, true);
        this.vy.qc(this.xy);
    }

    public void nj() {
        if (!this.at) {
            if (!this.bt) {
                try {
                    ++this.dt;
                    if (this.pt == 0) {
                        super.qp = 0;
                        this.ol();
                    }

                    if (this.pt == 1) {
                        ++this.jab;
                        ++super.qp;
                        this.um();
                    }

                    if (this.ys > 0) {
                        --this.ys;
                    }

                    if (this.xs && this.ys == 0) {
                        this.xs = false;
                        super.ed.e();
                        this.ys = 24;
                    }

                    super.nq = 0;
                    super.pq = 0;
                    if (this.ry > 0) {
                        --this.ry;
                    }

                    if (this.sy > 0) {
                        --this.sy;
                    }

                    if (this.ty > 0) {
                        --this.ty;
                    }

                    if (this.uy > 0) {
                        --this.uy;
                        return;
                    }
                } catch (OutOfMemoryError var1) {
                    this.mm();
                    this.bt = true;
                }

            }
        }
    }

    public void tj() {
        Graphics var1;
        if (this.at) {
            var1 = this.getGraphics();
            var1.setColor(Color.black);
            var1.fillRect(0, 0, 512, 356);
            var1.setFont(new Font("Helvetica", 1, 20));
            var1.setColor(Color.white);
            var1.drawString("Error - unable to load game!", 50, 50);
            var1.drawString("To play RuneScape make sure you play from", 50, 100);
            var1.drawString("http://www.runescape.com", 50, 150);
            this.vj(1);
        } else if (this.bt) {
            var1 = this.getGraphics();
            var1.setColor(Color.black);
            var1.fillRect(0, 0, 512, 356);
            var1.setFont(new Font("Helvetica", 1, 20));
            var1.setColor(Color.white);
            var1.drawString("Error - out of memory!", 50, 50);
            var1.drawString("Close ALL unnecessary programs", 50, 100);
            var1.drawString("and windows before loading the game", 50, 150);
            var1.drawString("RuneScape needs about 48meg of spare RAM", 50, 200);
            this.vj(1);
        } else {
            try {
                if (this.pt == 0) {
                    this.lt.tk = false;
                    this.vm();
                }

                if (this.pt == 1) {
                    this.lt.tk = true;
                    this.el();
                    return;
                }
            } catch (OutOfMemoryError var2) {
                this.mm();
                this.bt = true;
            }

        }
    }

    public void uj() {
        this.ob();
        this.mm();
    }

    public void mm() {
        try {
            if (this.lt != null) {
                this.lt.lg();
                this.lt.wj = null;
                this.lt = null;
            }

            if (this.kt != null) {
                this.kt.xi();
                this.kt = null;
            }

            this.kw = null;
            this.fw = null;
            this.ow = null;
            this.hv = null;
            this.iv = null;
            this.sv = null;
            this.tv = null;
            this.kv = null;
            if (this.fu != null) {
                this.fu.xgb = null;
                this.fu.ygb = null;
                this.fu.zgb = null;
                this.fu.ahb = null;
                this.fu = null;
            }

            System.gc();
        } catch (Exception var1) {
            ;
        }
    }

    public void ck() {
        this.jt.drawImage(this.mt, 0, 0, this);
    }

    public void bk(int var1) {
        if (this.pt == 0) {
            if (this.mab == 0) {
                this.nab.td(var1);
            }

            if (this.mab == 1) {
                this.qab.td(var1);
            }

            if (this.mab == 2) {
                this.zab.td(var1);
            }
        }

        if (this.pt == 1) {
            if (this.ccb == 1) {
                this.dcb.td(var1);
                return;
            }

            if (this.ccb == 2) {
                this.ecb.td(var1);
                return;
            }

            if (this.ccb == 3) {
                this.fcb.td(var1);
                return;
            }

            if (this.ccb == 4) {
                this.gcb.td(var1);
                return;
            }

            if (this.teb) {
                this.mbb.td(var1);
                return;
            }

            if (this.qdb) {
                if (this.udb == -1) {
                    this.rdb.td(var1);
                }

                return;
            }

            if (this.fab == 0 && this.eab == 0) {
                this.vy.td(var1);
            }

            if (this.fab == 3 || this.fab == 4 || this.fab == 5) {
                this.fab = 0;
            }
        }

    }

    public void sk() {
        super.ed.h();
        this.xs = true;
        this.kb();
    }

    public void wk() {
        this.pt = 0;
        this.mab = 0;
        this.kbb = "";
        this.lbb = "";
        this.ibb = "Please enter a username:";
        this.jbb = "*" + this.kbb + "*";
        this.ev = 0;
        this.qv = 0;
    }

    public void dm() {
        super.tq = "";
        super.uq = "";
    }

    public void trylogout() {
        if (this.pt != 0) {
            if (this.iab > 450) {
                this.pk("@cya@You can't logout during combat!", 3);
            } else if (this.iab > 0) {
                this.pk("@cya@You can't logout for 10 seconds after combat", 3);
            } else {
                super.ed.a(6);
                super.ed.d();
                this.hab = 1000;
            }
        }
    }

    public void zl() {
        this.rdb = new Panel(this.lt, 100);
        byte var1 = 8;
        this.sdb = this.rdb.nd(256, var1, "@yel@Please provide 5 security questions in case you lose your password", 1, true);
        int var3 = var1 + 22;
        this.rdb.nd(256, var3, "If you ever lose your password, you will need these to prove you own your account.", 1, true);
        var3 += 13;
        this.rdb.nd(256, var3, "Your answers are encrypted and are ONLY used for password recovery purposes.", 1, true);
        var3 += 22;
        this.rdb.nd(256, var3, "@ora@IMPORTANT:@whi@ To recover your password you must give the EXACT same answers you", 1, true);
        var3 += 13;
        this.rdb.nd(256, var3, "give here. If you think you might forget an answer, or someone else could guess the", 1, true);
        var3 += 13;
        this.rdb.nd(256, var3, "answer, then press the 'different question' button to get a better question.", 1, true);
        var3 += 35;

        for(int var2 = 0; var2 < 5; ++var2) {
            this.rdb.ed(170, var3, 310, 30);
            this.aeb[var2] = "~:" + this.zdb[var2];
            this.vdb[var2] = this.rdb.nd(170, var3 - 7, var2 + 1 + ": " + this.ifb[this.zdb[var2]], 1, true);
            this.wdb[var2] = this.rdb.cd(170, var3 + 7, 310, 30, 1, 80, false, true);
            this.rdb.ed(370, var3, 80, 30);
            this.rdb.nd(370, var3 - 7, "Different", 1, true);
            this.rdb.nd(370, var3 + 7, "Question", 1, true);
            this.xdb[var2] = this.rdb.qd(370, var3, 80, 30);
            this.rdb.ed(455, var3, 80, 30);
            this.rdb.nd(455, var3 - 7, "Enter own", 1, true);
            this.rdb.nd(455, var3 + 7, "Question", 1, true);
            this.ydb[var2] = this.rdb.qd(455, var3, 80, 30);
            var3 += 35;
        }

        this.rdb.qc(this.wdb[0]);
        var3 += 10;
        this.rdb.ed(256, var3, 250, 30);
        this.rdb.nd(256, var3, "Click here when finished", 4, true);
        this.tdb = this.rdb.qd(256, var3, 250, 30);
    }

    public void xk() {
        if (this.udb != -1) {
            if (super.uq.length() > 0) {
                this.aeb[this.udb] = super.uq;
                this.rdb.od(this.vdb[this.udb], this.udb + 1 + ": " + this.aeb[this.udb]);
                this.rdb.od(this.wdb[this.udb], "");
                this.udb = -1;
            }

        } else {
            this.rdb.ud(super.kq, super.lq, super.nq, super.mq);

            int var3;
            for(int var1 = 0; var1 < 5; ++var1) {
                if (this.rdb.wd(this.xdb[var1])) {
                    boolean var2 = false;

                    while(!var2) {
                        this.zdb[var1] = (this.zdb[var1] + 1) % this.ifb.length;
                        var2 = true;

                        for(var3 = 0; var3 < 5; ++var3) {
                            if (var3 != var1 && this.zdb[var3] == this.zdb[var1]) {
                                var2 = false;
                            }
                        }
                    }

                    this.aeb[var1] = "~:" + this.zdb[var1];
                    this.rdb.od(this.vdb[var1], var1 + 1 + ": " + this.ifb[this.zdb[var1]]);
                    this.rdb.od(this.wdb[var1], "");
                }
            }

            for(int var8 = 0; var8 < 5; ++var8) {
                if (this.rdb.wd(this.ydb[var8])) {
                    this.udb = var8;
                    super.tq = "";
                    super.uq = "";
                }
            }

            if (this.rdb.wd(this.tdb)) {
                var3 = 0;

                while(true) {
                    if (var3 >= 5) {
                        int var6;
                        for(int var9 = 0; var9 < 5; ++var9) {
                            String var5 = this.rdb.sc(this.wdb[var9]);

                            for(var6 = 0; var6 < var9; ++var6) {
                                String var7 = this.rdb.sc(this.wdb[var6]);
                                if (var5.equalsIgnoreCase(var7)) {
                                    this.rdb.od(this.sdb, "@yel@Each question must have a different answer");
                                    return;
                                }
                            }
                        }

                        super.ed.a(208);

                        for(int var10 = 0; var10 < 5; ++var10) {
                            String var11 = this.aeb[var10];
                            if (var11 == null || var11.length() == 0) {
                                var11 = String.valueOf(var10 + 1);
                            }

                            if (var11.length() > 50) {
                                var11 = var11.substring(0, 50);
                            }

                            super.ed.m(var11.length());
                            super.ed.i(var11);
                            super.ed.c(Utility.ln(this.rdb.sc(this.wdb[var10])));
                        }

                        super.ed.d();

                        for(var6 = 0; var6 < 5; ++var6) {
                            this.zdb[var6] = var6;
                            this.aeb[var6] = "~:" + this.zdb[var6];
                            this.rdb.od(this.wdb[var6], "");
                            this.rdb.od(this.vdb[var6], var6 + 1 + ": " + this.ifb[this.zdb[var6]]);
                        }

                        this.lt.pf();
                        this.qdb = false;
                        break;
                    }

                    String var4 = this.rdb.sc(this.wdb[var3]);
                    if (var4 == null || var4.length() < 3) {
                        this.rdb.od(this.sdb, "@yel@Please provide a longer answer to question: " + (var3 + 1));
                        return;
                    }

                    ++var3;
                }
            }

        }
    }

    public void mk() {
        this.lt.pk = false;
        this.lt.pf();
        this.rdb.hc();
        if (this.udb != -1) {
            short var1 = 150;
            this.lt.bg(26, var1, 460, 60, 0);
            this.lt.uf(26, var1, 460, 60, 16777215);
            int var2 = var1 + 22;
            this.lt.xg("Please enter your question", 256, var2, 4, 16777215);
            var2 += 25;
            this.lt.xg(super.tq + "*", 256, var2, 4, 16777215);
        }

        this.lt.bh(0, this.rt, this.ut + 22);
        this.lt.nf(this.jt, 0, 11);
    }

    public void ll() {
        this.dcb = new Panel(this.lt, 100);
        this.dcb.nd(256, 10, "Carry 5 extra objects at once in RuneScape!", 4, true);
        byte var1 = 45;
        byte var2 = 15;
        this.dcb.kc(256, var1 + var2 * 7 - 4, 400, (int)((double)var2 * 16.5D - 9.0D));
        this.dcb.nd(256, var1, "Please consider taking the time to answer a few questions and", 1, true);
        int var21 = var1 + var2;
        this.dcb.nd(256, var21, "sign up for some great email offers with Yoptin. It's free!", 1, true);
        var21 += var2;
        var21 += 12;
        this.dcb.nd(256, var21, "You will be sent the information YOU want about products,", 1, true);
        var21 += var2;
        this.dcb.nd(256, var21, "services, and special-offers that fit your interests.", 1, true);
        var21 += var2;
        this.dcb.nd(256, var21, "Should you ever decide that you don't want", 1, true);
        var21 += var2;
        this.dcb.nd(256, var21, "to receive any additional Yoptin email, you can simply optout.", 1, true);
        var21 += var2;
        var21 += 12;
        this.dcb.nd(256, var21, "@yel@Signing up will help us to continue to run the game for", 1, true);
        var21 += var2;
        this.dcb.nd(256, var21, "@yel@free. So as a special thank-you, as long as you are a yoptin", 1, true);
        var21 += var2;
        this.dcb.nd(256, var21, "@yel@member your player will be able to carry 5 extra items at once!", 1, true);
        var21 += var2;
        var21 += 12;
        this.dcb.nd(256, var21, "After you have signed up we will email you a special personalised", 1, true);
        var21 += var2;
        this.dcb.nd(256, var21, "code which you can use to active this bonus, so be sure to enter all", 1, true);
        var21 += var2;
        this.dcb.nd(256, var21, "your details correctly.", 1, true);
        var21 += var2;
        var21 += 30;
        this.dcb.ed(160, var21, 150, 35);
        this.dcb.nd(160, var21, "Yes, sounds great!", 1, true);
        this.wcb = this.dcb.qd(160, var21, 150, 35);
        this.dcb.ed(352, var21, 150, 35);
        this.dcb.nd(352, var21, "No thank-you", 1, true);
        this.xcb = this.dcb.qd(352, var21, 150, 35);
        var21 += 30;
        this.dcb.nd(256, var21, "View Yoptin Privacy Statement", 1, true);
        this.ycb = this.dcb.qd(256, var21, 250, 20);
        this.ecb = new Panel(this.lt, 100);
        this.icb = this.ecb.nd(256, 5, "Please fill in the details below", 4, true);
        byte var3 = 85;
        short var4 = 155;
        var1 = 39;
        String[] var5 = new String[]{"Mr", "Ms", "Miss", "Mrs"};
        this.ecb.kc(var3, var1, var4, 35);
        this.jcb = this.ecb.wc(var3, var1, var5, 1, true);
        var21 = var1 + 39;
        this.ecb.kc(var3, var21, var4, 35);
        this.ecb.nd(var3, var21 - 9, "First Name", 1, true);
        this.kcb = this.ecb.cd(var3, var21 + 9, var4, 20, 1, 30, false, true);
        this.ecb.qc(this.kcb);
        var21 += 39;
        short var22 = 247;
        var4 = 155;
        var1 = 39;
        this.ecb.kc(var22, var1, var4, 35);
        this.ecb.nd(var22, var1 - 9, "Surname", 1, true);
        this.lcb = this.ecb.cd(var22, var1 + 9, var4, 20, 1, 30, false, true);
        var21 = var1 + 39;
        this.ecb.kc(var22, var21, var4, 35);
        this.ecb.nd(var22, var21 - 9, "Postcode", 1, true);
        this.mcb = this.ecb.cd(var22, var21 + 9, var4, 20, 1, 20, false, true);
        var21 += 39;
        var22 = 165;
        var4 = 315;
        String[] var6 = new String[]{"None", "1", "2", "3", "4", "5", "6 or more"};
        this.ecb.kc(var22, var21, var4, 35);
        this.ecb.nd(var22, var21 - 9, "How many children live in your household?", 1, true);
        this.ncb = this.ecb.wc(var22, var21 + 9, var6, 1, true);
        var21 += 39;
        String[] var7 = new String[]{"0", "1-50", "51-100", "101-250", "51-500", "500+"};
        this.ecb.kc(var22, var21, var4, 35);
        this.ecb.nd(var22, var21 - 9, "What is the size of your company?", 1, true);
        this.ocb = this.ecb.wc(var22, var21 + 9, var7, 1, true);
        var21 += 39;
        this.ecb.kc(var22, var21, var4, 35);
        this.edb = 15;
        this.ecb.mc(var22 - 95 - 25, var21 + 6, Panel.cg + 7);
        this.hdb = this.ecb.oc(var22 - 95 - 25, var21 + 6, 20, 20);
        this.ndb = this.ecb.nd(var22 - 95, var21 + 6, "15th", 1, true);
        this.ecb.mc(var22 - 95 + 25, var21 + 6, Panel.cg + 6);
        this.kdb = this.ecb.oc(var22 - 95 + 25, var21 + 6, 20, 20);
        this.fdb = 6;
        this.ecb.mc(var22 - 40, var21 + 6, Panel.cg + 7);
        this.idb = this.ecb.oc(var22 - 40, var21 + 6, 20, 20);
        this.odb = this.ecb.nd(var22, var21 + 6, "June", 1, true);
        this.ecb.mc(var22 + 40, var21 + 6, Panel.cg + 6);
        this.ldb = this.ecb.oc(var22 + 40, var21 + 6, 20, 20);
        this.gdb = 1980;
        this.ecb.mc(var22 + 95 - 30, var21 + 6, Panel.cg + 7);
        this.jdb = this.ecb.oc(var22 + 95 - 30, var21 + 6, 20, 20);
        this.pdb = this.ecb.nd(var22 + 95, var21 + 6, "1980", 1, true);
        this.ecb.mc(var22 + 95 + 30, var21 + 6, Panel.cg + 6);
        this.mdb = this.ecb.oc(var22 + 95 + 30, var21 + 6, 20, 20);
        this.ecb.nd(var22, var21 - 9, "Date of birth", 1, true);
        var21 += 39;
        String[] var8 = new String[]{"Would consider", "Have done already", "No"};
        this.ecb.kc(var22, var21, var4, 35);
        this.ecb.nd(var22, var21 - 9, "Would you consider buying over the internet?", 1, true);
        this.pcb = this.ecb.wc(var22, var21 + 9, var8, 1, true);
        var21 += 39;
        this.ecb.kc(var22, var21, var4, 35);
        this.ecb.nd(var22, var21 - 9, "Your email address", 1, true);
        this.qcb = this.ecb.cd(var22, var21 + 9, var4, 20, 0, 80, false, true);
        var21 += 39;
        var3 = 85;
        var4 = 155;
        String[] var9 = new String[]{"Text", "Html", "AOL"};
        this.ecb.kc(var3, var21, var4, 35);
        this.ecb.nd(var3, var21 - 9, "You receive email in", 1, true);
        this.rcb = this.ecb.wc(var3, var21 + 9, var9, 1, true);
        var22 = 247;
        var4 = 155;
        this.ecb.ed(var22, var21, var4, 35);
        this.ecb.nd(var22, var21, "Register me", 4, false);
        this.scb = this.ecb.qd(var22, var21, var4, 35);
        var22 = 420;
        var1 = 27;
        var4 = 175;
        this.ecb.nd(var22, var1 - 11, "Country", 1, true);
        var21 = var1 + 40;
        String[] var10 = new String[]{"Albania", "Andorra", "Armenia", "Austria", "Azerbaijan", "Belgium", "Bosnia and Herzogvina", "Belarus", "Bulgaria", "Canada", "Croatia", "Cyprus", "Czech Republic", "Denmark", "Finland", "France", "Georgia", "Germany", "Gibraltar", "Greece", "Hungary", "Iceland", "Ireland", "Italy", "Latvia", "LIechtenstein", "Lithuania", "Luxembourg", "Macedonia", "Malta", "Moldova", "Monaco", "Netherlands", "Norway", "Portugal", "Romania", "Russia", "Slovakia", "Slovenia", "Spain", "Sweden", "Switzerland", "Turkey", "Ukraine", "United Kingdom", "United States", "Vatican", "Yugoslavia", "Other Country"};
        this.ecb.kc(var22, var21, var4, 90);
        this.tcb = this.ecb.pc(var22 + 3, var21, var4 - 6, 90, 0, 50, true);

        for(int var11 = 0; var11 < var10.length; ++var11) {
            this.ecb.hd(this.tcb, var11, var10[var11]);
        }

        this.ecb.zc(this.tcb, var10.length - 5);
        this.ecb.ue[this.tcb] = var10.length - 7;
        var21 += 70;
        this.ecb.nd(var22, var21 - 11, "Your Profession", 1, true);
        var21 += 40;
        String[] var12 = new String[]{"Craftsman/Tradesman", "Farmer", "Housewife", "Manual/Factory worker", "Middle Manager/Technician", "Office/Clerical", "Profession/Senior Manager", "Self-employed/Business owner", "Shop worker", "Student", "Other"};
        this.ecb.kc(var22, var21, var4, 90);
        this.ucb = this.ecb.pc(var22 + 3, var21, var4 - 6, 90, 0, 50, true);

        for(int var13 = 0; var13 < var12.length; ++var13) {
            this.ecb.hd(this.ucb, var13, var12[var13]);
        }

        this.ecb.zc(this.ucb, 0);
        var21 += 70;
        this.ecb.nd(var22, var21 - 11, "Industry sector", 1, true);
        var21 += 40;
        String[] var14 = new String[]{"Agriculture", "Bank/Finance", "Computers/Software/Internet", "Construction", "Corporate Services/Consulting", "Health", "Legal/Insurance", "Manufacturing/Industries", "Marketing/Advertising", "News/Media", "Supply/Trade", "Telecommunications/Networks", "Travel/Transportation", "Other"};
        this.ecb.kc(var22, var21, var4, 90);
        this.vcb = this.ecb.pc(var22 + 3, var21, var4 - 6, 90, 0, 50, true);

        for(int var15 = 0; var15 < var14.length; ++var15) {
            this.ecb.hd(this.vcb, var15, var14[var15]);
        }

        this.ecb.zc(this.vcb, 0);
        var21 += 70;
        String[] var16 = new String[]{"Home computing", "Internet", "Telecommunication, IT", "CD-Rom, Games", "Music, CD, Video, DVD", "Books, Newspapers", "Sport", "Beauty, Health, Fitness", "Food and Wine", "Gifts, Flowers", "Pets", "Fashion, Clothing", "DIY, Interior Design, Gardening", "Cars, Motorbikes", "Leisure activities", "Travel, Holidays, Short Breaks", "Charity, Voluntary work", "Finances, Insurance", "Career, Jobs", "Lottery, Gambling, Betting"};
        this.fcb = new Panel(this.lt, 100);
        this.zcb = this.fcb.nd(256, 10, "@yel@Please indicate your interests", 4, true);
        this.fcb.nd(256, 25, "Your bonus code will then be emailed to you", 4, true);
        var22 = 32;
        var21 = 60;

        for(int var17 = 0; var17 < 20; ++var17) {
            this.bdb[var17] = this.fcb.pd(var22, var21 - 9, 16);
            this.fcb.lc(var22 + 20, var21, var16[var17], 3, true);
            var21 += 23;
            if (var17 == 9) {
                var22 = 256;
                var21 = 60;
            }
        }

        this.fcb.ed(256, 310, 100, 32);
        this.fcb.nd(256, 310, "Ok", 4, true);
        this.adb = this.fcb.qd(256, 310, 100, 32);
        this.gcb = new Panel(this.lt, 50);
        byte var18 = 20;
        this.gcb.nd(250, var18, "Yoptin Privacy Statement", 5, true);
        int var23 = var18 + 30;
        this.gcb.ic(40, var23 - 10, 420, 220);
        this.cdb = this.gcb.dc(50, var23, 400, 200, 1, 1000, true);
        var23 += 240;
        this.gcb.ed(256, var23, 170, 40);
        this.gcb.nd(256, var23, "Ok", 1, false);
        this.ddb = this.gcb.qd(256, var23, 170, 40);
        Panel var19 = this.gcb;
        int var20 = this.cdb;
        var19.gc(var20, "@yel@Privacy statement", false);
        var19.gc(var20, "Yoptin is a service offered by Consodata UK Ltd., a company that", false);
        var19.gc(var20, "specialises in the collection of households' and Internet users", false);
        var19.gc(var20, "consumption patterns. At Yoptin, we are committed to maintaining", false);
        var19.gc(var20, "your privacy. If we make changes to this policy, we will", false);
        var19.gc(var20, "immediately notify you by updating this statement on this web site.", false);
        var19.gc(var20, "", false);
        var19.gc(var20, "@yel@What will the data be used for?", false);
        var19.gc(var20, "Yoptin collects data about you, your interests and the subjects you", false);
        var19.gc(var20, "would like to receive email communications about. We use the", false);
        var19.gc(var20, "information you give us to make sure that what is sent to you is", false);
        var19.gc(var20, "relevant and as useful as possible. We may also merge the data we", false);
        var19.gc(var20, "gain from you with other data sources for profiling and marketing", false);
        var19.gc(var20, "purposes. Yoptin will manage the data under the guidelines of the", false);
        var19.gc(var20, "Data Protection Act 1988 and all information is processed in", false);
        var19.gc(var20, "accordance with the principles laid down by the Act.", false);
        var19.gc(var20, "Consodata UK Ltd will act as data controller and may pass the", false);
        var19.gc(var20, "information you provide to other companies, who will use the data", false);
        var19.gc(var20, "for their own market research and analysis purposes. These", false);
        var19.gc(var20, "carefully chosen companies may send you, by mail or other media,", false);
        var19.gc(var20, "details of their products and services where you have indicated", false);
        var19.gc(var20, "that you are happy to receive such communications.", false);
        var19.gc(var20, "", false);
        var19.gc(var20, "We comply with the standards, procedures and requirements laid", false);
        var19.gc(var20, "down by the UK Data Protection Act 1988, to ensure that the", false);
        var19.gc(var20, "personal information you give us is kept secure and processed", false);
        var19.gc(var20, "fairly and lawfully.", false);
        var19.gc(var20, "", false);
        var19.gc(var20, "@yel@Security", false);
        var19.gc(var20, "Your information is held on secure internal servers and is not", false);
        var19.gc(var20, "publicly available through this site.", false);
        var19.gc(var20, "", false);
        var19.gc(var20, "@yel@Your Feedback", false);
        var19.gc(var20, "By subscribing to this site, you consent to the information you", false);
        var19.gc(var20, "give us being processed for any of the purposes we have explained", false);
        var19.gc(var20, "above except where we have received your 'unsubscribe message'.", false);
        var19.gc(var20, "To unsubscribe simply send an email entitled UNSUBSCRIBE to us", false);
        var19.gc(var20, "at unsubscribe_uk@yoptin.com. If you have any queries or", false);
        var19.gc(var20, "complaints relating to our privacy policy, please email", false);
        var19.gc(var20, "membercare_uk@yoptin.com.", false);
        var19.gc(var20, "", false);
        var19.gc(var20, "Updated: 18 may 2001", false);
        var19.gc(var20, "To be reviewed: 18th October 2001", false);
    }

    public void cm() {
        this.lt.pk = false;
        this.lt.pf();
        if (this.ccb == 1) {
            this.dcb.hc();
        }

        if (this.ccb == 2) {
            this.ecb.hc();
        }

        if (this.ccb == 3) {
            this.fcb.hc();
        }

        if (this.ccb == 4) {
            this.gcb.hc();
        }

        this.lt.bh(0, this.rt, this.ut + 22);
        this.lt.nf(this.jt, 0, 11);
    }

    public void hl() {
        if (this.ccb == 1) {
            this.dcb.ud(super.kq, super.lq, super.nq, super.mq);
            if (this.dcb.wd(this.wcb)) {
                this.ccb = 2;
            }

            if (this.dcb.wd(this.xcb)) {
                this.lt.pf();
                this.ccb = 0;
                super.ed.a(209);
                super.ed.d();
            }

            if (this.dcb.wd(this.ycb)) {
                this.ccb = 4;
                return;
            }
        } else if (this.ccb == 2) {
            String[] var1 = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
            this.ecb.ud(super.kq, super.lq, super.nq, super.mq);
            if (this.ecb.wd(this.hdb) && this.edb > 1) {
                --this.edb;
                if (this.edb == 1) {
                    this.ecb.od(this.ndb, "1st");
                } else if (this.edb == 2) {
                    this.ecb.od(this.ndb, "2nd");
                } else {
                    this.ecb.od(this.ndb, this.edb + "th");
                }
            }

            if (this.ecb.wd(this.kdb) && this.edb < 31) {
                ++this.edb;
                if (this.edb == 1) {
                    this.ecb.od(this.ndb, "1st");
                } else if (this.edb == 2) {
                    this.ecb.od(this.ndb, "2nd");
                } else {
                    this.ecb.od(this.ndb, this.edb + "th");
                }
            }

            if (this.ecb.wd(this.idb) && this.fdb > 1) {
                --this.fdb;
                this.ecb.od(this.odb, var1[this.fdb - 1]);
            }

            if (this.ecb.wd(this.ldb) && this.fdb < 12) {
                ++this.fdb;
                this.ecb.od(this.odb, var1[this.fdb - 1]);
            }

            if (this.ecb.wd(this.jdb) && this.gdb > 1900) {
                --this.gdb;
                this.ecb.od(this.pdb, String.valueOf(this.gdb));
            }

            if (this.ecb.wd(this.mdb) && this.gdb < 2000) {
                ++this.gdb;
                this.ecb.od(this.pdb, String.valueOf(this.gdb));
            }

            if (this.ecb.wd(this.scb)) {
                if ((this.ecb.sc(this.kcb) == null || this.ecb.sc(this.kcb).length() != 0) && (this.ecb.sc(this.lcb) == null || this.ecb.sc(this.lcb).length() != 0) && (this.ecb.sc(this.mcb) == null || this.ecb.sc(this.mcb).length() != 0) && (this.ecb.sc(this.qcb) == null || this.ecb.sc(this.qcb).length() != 0) && this.ecb.xc(this.jcb) != -1 && this.ecb.xc(this.ncb) != -1 && this.ecb.xc(this.ocb) != -1 && this.ecb.xc(this.pcb) != -1 && this.ecb.xc(this.rcb) != -1 && this.ecb.xc(this.tcb) != -1 && this.ecb.xc(this.ucb) != -1 && this.ecb.xc(this.vcb) != -1) {
                    this.ccb = 3;
                    return;
                }

                this.ecb.od(this.icb, "@yel@Please fill in ALL requested details");
                return;
            }
        } else if (this.ccb == 3) {
            this.fcb.ud(super.kq, super.lq, super.nq, super.mq);
            if (this.fcb.wd(this.adb)) {
                boolean var4 = false;

                for(int var2 = 0; var2 < 20; ++var2) {
                    if (this.fcb.xc(this.bdb[var2]) == 1) {
                        var4 = true;
                    }
                }

                if (!var4) {
                    this.fcb.od(this.zcb, "@red@Use the tickboxes below to indicate your interests");
                    return;
                }

                super.ed.a(210);
                super.ed.i(Utility.mn(this.ecb.sc(this.kcb), 30));
                super.ed.i(Utility.mn(this.ecb.sc(this.lcb), 30));
                super.ed.i(Utility.mn(this.ecb.sc(this.mcb), 20));
                super.ed.i(Utility.mn(this.ecb.sc(this.qcb), 80));
                super.ed.m(this.ecb.xc(this.jcb));
                super.ed.m(this.ecb.xc(this.ncb));
                super.ed.m(this.ecb.xc(this.ocb));
                super.ed.m(this.ecb.xc(this.pcb));
                super.ed.m(this.ecb.xc(this.rcb));
                super.ed.m(this.ecb.xc(this.tcb));
                super.ed.m(this.ecb.xc(this.ucb));
                super.ed.m(this.ecb.xc(this.vcb));
                super.ed.m(this.edb);
                super.ed.m(this.fdb);
                super.ed.l(this.gdb);

                for(int var3 = 0; var3 < 20; ++var3) {
                    super.ed.m(this.fcb.xc(this.bdb[var3]));
                }

                super.ed.d();
                this.ccb = 0;
                return;
            }
        } else if (this.ccb == 4) {
            this.gcb.ud(super.kq, super.lq, super.nq, super.mq);
            if (this.gcb.wd(this.ddb)) {
                this.ccb = 1;
            }
        }

    }

    public void ql() {
        this.mbb = new Panel(this.lt, 100);
        this.mbb.nd(256, 10, "Design Your Character", 4, true);
        short var1 = 140;
        byte var2 = 34;
        this.mbb.ed(var1, var2, 200, 25);
        this.mbb.nd(var1, var2, "Appearance", 4, false);
        int var6 = var2 + 15;
        this.mbb.nd(var1 - 55, var6 + 110, "Front", 3, true);
        this.mbb.nd(var1, var6 + 110, "Side", 3, true);
        this.mbb.nd(var1 + 55, var6 + 110, "Back", 3, true);
        byte var3 = 54;
        var6 += 145;
        this.mbb.kc(var1 - var3, var6, 53, 41);
        this.mbb.nd(var1 - var3, var6 - 8, "Head", 1, true);
        this.mbb.nd(var1 - var3, var6 + 8, "Type", 1, true);
        this.mbb.mc(var1 - var3 - 40, var6, Panel.cg + 7);
        this.nbb = this.mbb.qd(var1 - var3 - 40, var6, 20, 20);
        this.mbb.mc(var1 - var3 + 40, var6, Panel.cg + 6);
        this.obb = this.mbb.qd(var1 - var3 + 40, var6, 20, 20);
        this.mbb.kc(var1 + var3, var6, 53, 41);
        this.mbb.nd(var1 + var3, var6 - 8, "Hair", 1, true);
        this.mbb.nd(var1 + var3, var6 + 8, "Color", 1, true);
        this.mbb.mc(var1 + var3 - 40, var6, Panel.cg + 7);
        this.pbb = this.mbb.qd(var1 + var3 - 40, var6, 20, 20);
        this.mbb.mc(var1 + var3 + 40, var6, Panel.cg + 6);
        this.qbb = this.mbb.qd(var1 + var3 + 40, var6, 20, 20);
        var6 += 50;
        this.mbb.kc(var1 - var3, var6, 53, 41);
        this.mbb.nd(var1 - var3, var6, "Gender", 1, true);
        this.mbb.mc(var1 - var3 - 40, var6, Panel.cg + 7);
        this.rbb = this.mbb.qd(var1 - var3 - 40, var6, 20, 20);
        this.mbb.mc(var1 - var3 + 40, var6, Panel.cg + 6);
        this.sbb = this.mbb.qd(var1 - var3 + 40, var6, 20, 20);
        this.mbb.kc(var1 + var3, var6, 53, 41);
        this.mbb.nd(var1 + var3, var6 - 8, "Top", 1, true);
        this.mbb.nd(var1 + var3, var6 + 8, "Color", 1, true);
        this.mbb.mc(var1 + var3 - 40, var6, Panel.cg + 7);
        this.tbb = this.mbb.qd(var1 + var3 - 40, var6, 20, 20);
        this.mbb.mc(var1 + var3 + 40, var6, Panel.cg + 6);
        this.ubb = this.mbb.qd(var1 + var3 + 40, var6, 20, 20);
        var6 += 50;
        this.mbb.kc(var1 - var3, var6, 53, 41);
        this.mbb.nd(var1 - var3, var6 - 8, "Skin", 1, true);
        this.mbb.nd(var1 - var3, var6 + 8, "Color", 1, true);
        this.mbb.mc(var1 - var3 - 40, var6, Panel.cg + 7);
        this.vbb = this.mbb.qd(var1 - var3 - 40, var6, 20, 20);
        this.mbb.mc(var1 - var3 + 40, var6, Panel.cg + 6);
        this.wbb = this.mbb.qd(var1 - var3 + 40, var6, 20, 20);
        this.mbb.kc(var1 + var3, var6, 53, 41);
        this.mbb.nd(var1 + var3, var6 - 8, "Bottom", 1, true);
        this.mbb.nd(var1 + var3, var6 + 8, "Color", 1, true);
        this.mbb.mc(var1 + var3 - 40, var6, Panel.cg + 7);
        this.xbb = this.mbb.qd(var1 + var3 - 40, var6, 20, 20);
        this.mbb.mc(var1 + var3 + 40, var6, Panel.cg + 6);
        this.ybb = this.mbb.qd(var1 + var3 + 40, var6, 20, 20);
        var1 = 372;
        var2 = 35;
        this.mbb.ed(var1, var2, 200, 25);
        this.mbb.nd(var1, var2, "Character Type", 4, false);
        var6 = var2 + 22;
        this.mbb.nd(var1, var6, "Each character type has different starting", 0, true);
        var6 += 13;
        this.mbb.nd(var1, var6, "bonuses. But the choice you make here", 0, true);
        var6 += 13;
        this.mbb.nd(var1, var6, "isn't permanent, and will change depending", 0, true);
        var6 += 13;
        this.mbb.nd(var1, var6, "on how you play the game.", 0, true);
        var6 += 73;
        this.mbb.kc(var1, var6, 215, 125);
        String[] var4 = new String[]{"Adventurer", "Warrior", "Wizard", "Ranger", "Miner"};
        this.acb = this.mbb.cc(var1, var6 + 2, var4, 3, true);
        var6 += 75;
        this.mbb.kc(var1, var6 + 21, 215, 60);
        this.mbb.nd(var1, var6, "Do you wish to be able to fight with other", 0, true);
        var6 += 13;
        this.mbb.nd(var1, var6, "players? Warning! If you choose 'yes' then", 0, true);
        var6 += 13;
        this.mbb.nd(var1, var6, "other players will be able to attack you too!", 0, true);
        var6 += 13;
        String[] var5 = new String[]{"No thanks", "Yes I'll fight"};
        this.bcb = this.mbb.wc(var1, var6, var5, 1, true);
        var6 += 32;
        this.mbb.ed(var1, var6, 200, 30);
        this.mbb.nd(var1, var6, "Start Game", 4, false);
        this.zbb = this.mbb.qd(var1, var6, 200, 30);
    }

    public void qk() {
        this.lt.pk = false;
        this.lt.pf();
        this.mbb.hc();
        short var1 = 140;
        byte var2 = 50;
        this.lt.pg(var1 - 32 - 55, var2, 64, 102, GameData.zjb[this.web], this.cfb[this.zeb]);
        this.lt.zf(var1 - 32 - 55, var2, 64, 102, GameData.zjb[this.veb], this.cfb[this.yeb], this.efb[this.afb], 0, false);
        this.lt.zf(var1 - 32 - 55, var2, 64, 102, GameData.zjb[this.ueb], this.dfb[this.xeb], this.efb[this.afb], 0, false);
        this.lt.pg(var1 - 32, var2, 64, 102, GameData.zjb[this.web] + 6, this.cfb[this.zeb]);
        this.lt.zf(var1 - 32, var2, 64, 102, GameData.zjb[this.veb] + 6, this.cfb[this.yeb], this.efb[this.afb], 0, false);
        this.lt.zf(var1 - 32, var2, 64, 102, GameData.zjb[this.ueb] + 6, this.dfb[this.xeb], this.efb[this.afb], 0, false);
        this.lt.pg(var1 - 32 + 55, var2, 64, 102, GameData.zjb[this.web] + 12, this.cfb[this.zeb]);
        this.lt.zf(var1 - 32 + 55, var2, 64, 102, GameData.zjb[this.veb] + 12, this.cfb[this.yeb], this.efb[this.afb], 0, false);
        this.lt.zf(var1 - 32 + 55, var2, 64, 102, GameData.zjb[this.ueb] + 12, this.dfb[this.xeb], this.efb[this.afb], 0, false);
        this.lt.bh(0, this.rt, this.ut + 22);
        this.lt.nf(this.jt, 0, 11);
    }

    public void bl() {
        this.mbb.ud(super.kq, super.lq, super.nq, super.mq);
        if (this.mbb.wd(this.nbb)) {
            do {
                do {
                    this.ueb = (this.ueb - 1 + GameData.sjb) % GameData.sjb;
                } while((GameData.wjb[this.ueb] & 3) != 1);
            } while((GameData.wjb[this.ueb] & 4 * this.bfb) == 0);
        }

        if (this.mbb.wd(this.obb)) {
            do {
                do {
                    this.ueb = (this.ueb + 1) % GameData.sjb;
                } while((GameData.wjb[this.ueb] & 3) != 1);
            } while((GameData.wjb[this.ueb] & 4 * this.bfb) == 0);
        }

        if (this.mbb.wd(this.pbb)) {
            this.xeb = (this.xeb - 1 + this.dfb.length) % this.dfb.length;
        }

        if (this.mbb.wd(this.qbb)) {
            this.xeb = (this.xeb + 1) % this.dfb.length;
        }

        if (this.mbb.wd(this.rbb) || this.mbb.wd(this.sbb)) {
            for(this.bfb = 3 - this.bfb; (GameData.wjb[this.ueb] & 3) != 1 || (GameData.wjb[this.ueb] & 4 * this.bfb) == 0; this.ueb = (this.ueb + 1) % GameData.sjb) {
                ;
            }

            while((GameData.wjb[this.veb] & 3) != 2 || (GameData.wjb[this.veb] & 4 * this.bfb) == 0) {
                this.veb = (this.veb + 1) % GameData.sjb;
            }
        }

        if (this.mbb.wd(this.tbb)) {
            this.yeb = (this.yeb - 1 + this.cfb.length) % this.cfb.length;
        }

        if (this.mbb.wd(this.ubb)) {
            this.yeb = (this.yeb + 1) % this.cfb.length;
        }

        if (this.mbb.wd(this.vbb)) {
            this.afb = (this.afb - 1 + this.efb.length) % this.efb.length;
        }

        if (this.mbb.wd(this.wbb)) {
            this.afb = (this.afb + 1) % this.efb.length;
        }

        if (this.mbb.wd(this.xbb)) {
            this.zeb = (this.zeb - 1 + this.cfb.length) % this.cfb.length;
        }

        if (this.mbb.wd(this.ybb)) {
            this.zeb = (this.zeb + 1) % this.cfb.length;
        }

        if (this.mbb.wd(this.zbb)) {
            super.ed.a(236);
            super.ed.m(this.bfb);
            super.ed.m(this.ueb);
            super.ed.m(this.veb);
            super.ed.m(this.web);
            super.ed.m(this.xeb);
            super.ed.m(this.yeb);
            super.ed.m(this.zeb);
            super.ed.m(this.afb);
            super.ed.m(this.mbb.xc(this.acb));
            super.ed.m(this.mbb.xc(this.bcb));
            super.ed.d();
            this.lt.pf();
            this.teb = false;
        }

    }

    public void al() {
        this.nab = new Panel(this.lt, 50);
        byte var1 = 40;
        this.nab.nd(256, 200 + var1, "Click on an option", 5, true);
        this.nab.ed(156, 240 + var1, 120, 35);
        this.nab.ed(356, 240 + var1, 120, 35);
        this.nab.nd(156, 240 + var1, "New User", 5, false);
        this.nab.nd(356, 240 + var1, "Existing User", 5, false);
        this.oab = this.nab.qd(156, 240 + var1, 120, 35);
        this.pab = this.nab.qd(356, 240 + var1, 120, 35);
        this.qab = new Panel(this.lt, 50);
        var1 = 5;
        this.rab = this.qab.nd(256, var1 + 8, "To create an account please enter all the requested details", 4, true);
        int var2 = var1 + 25;
        this.qab.ed(256, var2 + 17, 250, 34);
        this.qab.nd(256, var2 + 8, "Choose a Username", 4, false);
        this.vab = this.qab.cd(256, var2 + 25, 200, 40, 4, 12, false, false);
        this.qab.qc(this.vab);
        var2 += 40;
        this.qab.ed(141, var2 + 17, 220, 34);
        this.qab.nd(141, var2 + 8, "Choose a Password", 4, false);
        this.wab = this.qab.cd(141, var2 + 25, 220, 40, 4, 20, true, false);
        this.qab.ed(371, var2 + 17, 220, 34);
        this.qab.nd(371, var2 + 8, "Confirm Password", 4, false);
        this.xab = this.qab.cd(371, var2 + 25, 220, 40, 4, 20, true, false);
        var2 += 40;
        this.qab.ic(46, var2, 420, 150);
        this.sab = this.qab.dc(56, var2 + 5, 400, 140, 1, 1000, true);
        this.yk(this.qab, this.sab);
        var2 += 160;
        this.yab = this.qab.vc(120, var2, 14);
        this.qab.lc(135, var2, "I agree to the terms+conditions above", 4, true);
        var2 += 20;
        this.qab.ed(156, var2 + 17, 150, 34);
        this.qab.nd(156, var2 + 17, "Submit", 5, false);
        this.uab = this.qab.qd(156, var2 + 17, 150, 34);
        this.qab.ed(356, var2 + 17, 150, 34);
        this.qab.nd(356, var2 + 17, "Cancel", 5, false);
        this.tab = this.qab.qd(356, var2 + 17, 150, 34);
        this.zab = new Panel(this.lt, 50);
        short var3 = 230;
        this.abb = this.zab.nd(256, var3 - 10, "Please enter your username and password", 4, true);
        var2 = var3 + 28;
        this.zab.ed(146, var2, 200, 40);
        this.zab.nd(146, var2 - 10, "Username:", 4, false);
        this.bbb = this.zab.cd(146, var2 + 10, 200, 40, 4, 12, false, false);
        var2 += 47;
        this.zab.ed(195, var2, 200, 40);
        this.zab.nd(195, var2 - 10, "Password:", 4, false);
        this.cbb = this.zab.cd(195, var2 + 10, 200, 40, 4, 20, true, false);
        var2 -= 45;
        this.zab.ed(410, var2, 110, 25);
        this.zab.nd(410, var2, "Ok", 4, false);
        this.dbb = this.zab.qd(410, var2, 110, 25);
        var2 += 30;
        this.zab.ed(410, var2, 110, 25);
        this.zab.nd(410, var2, "Cancel", 4, false);
        this.ebb = this.zab.qd(410, var2, 110, 25);
        this.zab.qc(this.bbb);
    }

    public void vm() {
        this.lt.pk = false;
        this.lt.pf();
        if (this.mab == 0 || this.mab == 2) {
            int var1 = this.dt * 2 % 3072;
            if (var1 < 1024) {
                this.lt.bh(0, 10, 2500);
                if (var1 > 768) {
                    this.lt.tg(0, 10, 2501, var1 - 768);
                }
            } else if (var1 < 2048) {
                this.lt.bh(0, 10, 2501);
                if (var1 > 1792) {
                    this.lt.tg(0, 10, this.ut + 10, var1 - 1792);
                }
            } else {
                this.lt.bh(0, 10, this.ut + 10);
                if (var1 > 2816) {
                    this.lt.tg(0, 10, 2500, var1 - 2816);
                }
            }
        }

        if (this.mab == 0) {
            this.nab.hc();
        }

        if (this.mab == 1) {
            this.qab.hc();
        }

        if (this.mab == 2) {
            this.zab.hc();
        }

        this.lt.bh(0, this.rt, this.ut + 22);
        this.lt.nf(this.jt, 0, 11);
    }

    public void bm() {
        byte var1 = 0;
        byte var2 = 50;
        byte var3 = 50;
        this.fu.qo(var2 * 48 + 23, var3 * 48 + 23, var1);
        this.fu.jo(this.kw);
        short var4 = 9728;
        short var5 = 6400;
        short var6 = 1100;
        short var7 = 888;
        this.kt.bm = 4100;
        this.kt.cm = 4100;
        this.kt.dm = 1;
        this.kt.em = 4000;
        this.kt.ei(var4, -this.fu.ho(var4, var5), var5, 912, var7, 0, var6 * 2);
        this.kt.aj();
        this.lt.jf();
        this.lt.jf();
        this.lt.bg(0, 0, 512, 6, 0);

        for(int var8 = 6; var8 >= 1; --var8) {
            this.lt.vg(0, var8, 0, var8, 512, 8);
        }

        this.lt.bg(0, 194, 512, 20, 0);

        for(int var9 = 6; var9 >= 1; --var9) {
            this.lt.vg(0, var9, 0, 194 - var9, 512, 8);
        }

        this.lt.bh(15, 15, this.ut + 10);
        this.lt.yg(2500, 0, 0, 512, 200);
        var4 = 9216;
        var5 = 9216;
        var6 = 1100;
        var7 = 888;
        this.kt.bm = 4100;
        this.kt.cm = 4100;
        this.kt.dm = 1;
        this.kt.em = 4000;
        this.kt.ei(var4, -this.fu.ho(var4, var5), var5, 912, var7, 0, var6 * 2);
        this.kt.aj();
        this.lt.jf();
        this.lt.jf();
        this.lt.bg(0, 0, 512, 6, 0);

        for(int var10 = 6; var10 >= 1; --var10) {
            this.lt.vg(0, var10, 0, var10, 512, 8);
        }

        this.lt.bg(0, 194, 512, 20, 0);

        for(int var11 = 6; var11 >= 1; --var11) {
            this.lt.vg(0, var11, 0, 194 - var11, 512, 8);
        }

        this.lt.bh(15, 15, this.ut + 10);
        this.lt.yg(2501, 0, 0, 512, 200);

        for(int var12 = 0; var12 < 64; ++var12) {
            this.kt.ci(this.fu.zgb[0][var12]);
            this.kt.ci(this.fu.ygb[1][var12]);
            this.kt.ci(this.fu.zgb[1][var12]);
            this.kt.ci(this.fu.ygb[2][var12]);
            this.kt.ci(this.fu.zgb[2][var12]);
        }

        var4 = 11136;
        var5 = 10368;
        var6 = 500;
        var7 = 376;
        this.kt.bm = 4100;
        this.kt.cm = 4100;
        this.kt.dm = 1;
        this.kt.em = 4000;
        this.kt.ei(var4, -this.fu.ho(var4, var5), var5, 912, var7, 0, var6 * 2);
        this.kt.aj();
        this.lt.jf();
        this.lt.jf();
        this.lt.bg(0, 0, 512, 6, 0);

        for(int var13 = 6; var13 >= 1; --var13) {
            this.lt.vg(0, var13, 0, var13, 512, 8);
        }

        this.lt.bg(0, 194, 512, 20, 0);

        for(int var14 = 6; var14 >= 1; --var14) {
            this.lt.vg(0, var14, 0, 194, 512, 8);
        }

        this.lt.bh(15, 15, this.ut + 10);
        this.lt.yg(this.ut + 10, 0, 0, 512, 200);
    }

    public void ol() {
        if (this.mab == 0) {
            this.nab.ud(super.kq, super.lq, super.nq, super.mq);
            if (this.nab.wd(this.oab)) {
                this.mab = 1;
                this.qab.od(this.vab, "");
                this.qab.od(this.wab, "");
                this.qab.od(this.xab, "");
                this.qab.qc(this.vab);
                this.qab.zc(this.yab, 0);
                this.qab.od(this.rab, "To create an account please enter all the requested details");
            }

            if (this.nab.wd(this.pab)) {
                this.mab = 2;
                this.zab.od(this.abb, "Please enter your username and password");
                this.zab.od(this.bbb, "");
                this.zab.od(this.cbb, "");
                this.zab.qc(this.bbb);
                return;
            }
        } else if (this.mab == 1) {
            this.qab.ud(super.kq, super.lq, super.nq, super.mq);
            if (this.qab.wd(this.vab)) {
                this.qab.qc(this.wab);
            }

            if (this.qab.wd(this.wab)) {
                this.qab.qc(this.xab);
            }

            if (this.qab.wd(this.xab)) {
                this.qab.qc(this.vab);
            }

            if (this.qab.wd(this.tab)) {
                this.mab = 0;
            }

            if (this.qab.wd(this.uab)) {
                if (this.qab.sc(this.vab) != null && this.qab.sc(this.vab).length() != 0 && this.qab.sc(this.wab) != null && this.qab.sc(this.wab).length() != 0) {
                    if (!this.qab.sc(this.wab).equalsIgnoreCase(this.qab.sc(this.xab))) {
                        this.qab.od(this.rab, "@yel@The two passwords entered are not the same as each other!");
                        return;
                    }

                    if (this.qab.sc(this.wab).length() < 5) {
                        this.qab.od(this.rab, "@yel@Your password must be at least 5 letters long");
                        return;
                    }

                    if (this.qab.xc(this.yab) == 0) {
                        this.qab.od(this.rab, "@yel@You must agree to the terms+conditions to continue");
                        return;
                    }

                    this.qab.od(this.rab, "Please wait... Creating new account");
                    this.vm();
                    this.zj();
                    String var1 = this.qab.sc(this.vab);
                    String var2 = this.qab.sc(this.wab);
                    this.fb(var1, var2, "null", 0, 0, 0);
                    return;
                }

                this.qab.od(this.rab, "@yel@Please fill in ALL requested information to continue!");
                return;
            }
        } else if (this.mab == 2) {
            this.zab.ud(super.kq, super.lq, super.nq, super.mq);
            if (this.zab.wd(this.ebb)) {
                this.mab = 0;
            }

            if (this.zab.wd(this.bbb)) {
                this.zab.qc(this.cbb);
            }

            if (this.zab.wd(this.cbb) || this.zab.wd(this.dbb)) {
                this.kbb = this.zab.sc(this.bbb);
                this.lbb = this.zab.sc(this.cbb);
                this.hb(this.kbb, this.lbb);
            }
        }

    }

    public void qb(String var1, String var2) {
        if (this.mab == 1) {
            this.qab.od(this.rab, var1 + " " + var2);
        }

        if (this.mab == 2) {
            this.zab.od(this.abb, var1 + " " + var2);
        }

        this.jbb = var2;
        this.vm();
        this.zj();
    }

    public void r() {
        this.v();
    }

    public void bb() {
        this.hab = 0;
        this.pk("@cya@Sorry, you can't logout at the moment", 3);
    }

    public void gb() {
        if (this.hab != 0) {
            this.kbb = "";
            this.lbb = "";
            this.w();
        } else {
            System.out.println("Lost connection");
            this.s(this.kbb, this.lbb);
        }
    }

    public void w() {
        this.mab = 0;
        this.pt = 0;
        this.hab = 0;
    }

    public void v() {
        this.bab = 0;
        this.hab = 0;
        this.mab = 0;
        this.pt = 1;
        this.dm();
        this.lt.pf();
        this.lt.nf(this.jt, 0, 11);

        for(int var1 = 0; var1 < this.ew; ++var1) {
            this.kt.ci(this.fw[var1]);
            this.fu.yo(this.gw[var1], this.hw[var1], this.iw[var1]);
        }

        for(int var2 = 0; var2 < this.nw; ++var2) {
            this.kt.ci(this.ow[var2]);
            this.fu.yn(this.pw[var2], this.qw[var2], this.rw[var2], this.sw[var2]);
        }

        this.ew = 0;
        this.nw = 0;
        this.xv = 0;
        this.ev = 0;

        for(int var3 = 0; var3 < this.cv; ++var3) {
            this.hv[var3] = null;
        }

        for(int var4 = 0; var4 < this.dv; ++var4) {
            this.iv[var4] = null;
        }

        this.qv = 0;

        for(int var5 = 0; var5 < this.ov; ++var5) {
            this.sv[var5] = null;
        }

        for(int var6 = 0; var6 < this.pv; ++var6) {
            this.tv[var6] = null;
        }

        for(int var7 = 0; var7 < 50; ++var7) {
            this.wx[var7] = false;
        }

        this.ft = 0;
        super.nq = 0;
        super.mq = 0;
    }

    public void jb() {
        String var1 = this.qab.sc(this.vab);
        String var2 = this.qab.sc(this.wab);
        this.mab = 2;
        this.zab.od(this.abb, "Please enter your username and password");
        this.zab.od(this.bbb, var1);
        this.zab.od(this.cbb, var2);
        this.vm();
        this.zj();
        this.hb(var1, var2);
    }

    public void yk(Panel var1, int var2) {
        var1.gc(var2, "Runescape rules of use", false);
        var1.gc(var2, "", false);
        var1.gc(var2, "In order to keep runescape enjoyable for everyone there are a few", false);
        var1.gc(var2, "rules you must observe. You must agree to these rules to play", false);
        var1.gc(var2, "", false);
        var1.gc(var2, "When using the built in chat facility you must not use any language", false);
        var1.gc(var2, "which may be considered by others to be offensive, racist or", false);
        var1.gc(var2, "obscene. You must not use the chat facility to harass, threaten or", false);
        var1.gc(var2, "deceive other players.", false);
        var1.gc(var2, "", false);
        var1.gc(var2, "You must not exploit any cheats or errors which you find in the", false);
        var1.gc(var2, "game, to give yourself an unfair advantage. Any exploits which you", false);
        var1.gc(var2, "find must be immediately reported to Jagex Software.", false);
        var1.gc(var2, "", false);
        var1.gc(var2, "You must not attempt to use other programs in conjunction with", false);
        var1.gc(var2, "RuneScape to give yourself an unfair advantage at the game. You", false);
        var1.gc(var2, "may not use any bots or macros to control your character for you.", false);
        var1.gc(var2, "When you are not playing the game you must log-out. You may not", false);
        var1.gc(var2, "circumvent any of our mechanisms designed to log out inactive", false);
        var1.gc(var2, "players automatically.", false);
        var1.gc(var2, "", false);
        var1.gc(var2, "You must not create multiple characters and use them to help each", false);
        var1.gc(var2, "other. You may create more than one character, but if you do, you", false);
        var1.gc(var2, "may not log in more than one at any time, and they must not interact", false);
        var1.gc(var2, "with each other in any way. If you wish to form an adventuring", false);
        var1.gc(var2, "party you should do so by cooperating with other players in the game", false);
        var1.gc(var2, "", false);
        var1.gc(var2, "Terms and conditions", false);
        var1.gc(var2, "", false);
        var1.gc(var2, "You agree that your character and account in runescape, is the", false);
        var1.gc(var2, "property of, and remains the property of Jagex Software. You may", false);
        var1.gc(var2, "not sell, transfer, or lend your character to anyone else. We may", false);
        var1.gc(var2, "delete or modify your character at any time for any reason.", false);
        var1.gc(var2, "For instance failing to follow the rules above may be cause for", false);
        var1.gc(var2, "IMMEDIATE DELETION of all your characters.", false);
        var1.gc(var2, "", false);
        var1.gc(var2, "You agree that for purposes such as preventing offensive language", false);
        var1.gc(var2, "we may automatically or manually censor the chat as we see fit,", false);
        var1.gc(var2, "and that we may record the chat to help us identify offenders.", false);
        var1.gc(var2, "", false);
        var1.gc(var2, "No Warranty is supplied with this Software. All implied warranties", false);
        var1.gc(var2, "conditions or terms are excluded to the fullest extent permitted by", false);
        var1.gc(var2, "law. We do not warrant that the operation of the Software will be", false);
        var1.gc(var2, "uninterrupted or error free. We accept no responsibility for any", false);
        var1.gc(var2, "consequential or indirect loss or damages. You use this software at", false);
        var1.gc(var2, "your own risk, and assume full responsibility for any and all real,", false);
        var1.gc(var2, "claimed, or supposed damages that may occur as a result of running", false);
        var1.gc(var2, "this software.", false);
        var1.gc(var2, "", false);
        var1.gc(var2, "We reserve all rights related to the runescape name, logo, web site,", false);
        var1.gc(var2, "and game. All materials associated with runescape are protected", false);
        var1.gc(var2, "by UK copyright laws and all other applicable national laws, and", false);
        var1.gc(var2, "may not be copied, reproduced, republished, uploaded, posted,", false);
        var1.gc(var2, "transmitted, or distributed in any way without our prior written", false);
        var1.gc(var2, "consent. We reserve the right to modify or remove this game at any", false);
        var1.gc(var2, "time. You agree that we may change this service, and these terms", false);
        var1.gc(var2, "and conditions, as and when we deem necessary.", false);
        var1.gc(var2, "", false);
        var1.gc(var2, "We accept no responsibility for the actions of other users of our", false);
        var1.gc(var2, "website. You acknowledge that it is inpractical for us to control", false);
        var1.gc(var2, "and monitor everything that users do in our game or post on our", false);
        var1.gc(var2, "message boards, and that we therefore cannot be held responsible", false);
        var1.gc(var2, "for any abusive or inappropriate content which appears on our site", false);
        var1.gc(var2, "as a result.", false);
        var1.gc(var2, "", false);
        var1.gc(var2, "Occasionally we may accept ideas and game additions from the", false);
        var1.gc(var2, "players. You agree that by submitting material for inclusion in", false);
        var1.gc(var2, "runescape you are giving us a non-exclusive, perpetual, worldwide,", false);
        var1.gc(var2, "royalty-free license to use or modify the submission as we see", false);
        var1.gc(var2, "fit. You agree that you will not withdraw the submission or attempt", false);
        var1.gc(var2, "to make a charge for its use. Furthermore you warrant that you", false);
        var1.gc(var2, "are the exclusive copyright holder of the submission, and that the", false);
        var1.gc(var2, "submission in no way violates any other person or entity's rights", false);
        var1.gc(var2, "", false);
        var1.gc(var2, "These Terms shall be governed by the laws of England, and the", false);
        var1.gc(var2, "courts of England shall have exclusive jurisdiction in all matters", false);
        var1.gc(var2, "arising.", false);
    }

    public void um() {
        this.ab();
        if (this.hab > 0) {
            --this.hab;
        }

        if (super.qp > 4500 && this.iab == 0 && this.hab == 0) {
            super.qp -= 500;
            this.trylogout();
        } else {
            if (this.kv.er == 8 || this.kv.er == 9) {
                this.iab = 500;
            }

            if (this.iab > 0) {
                --this.iab;
            }

            if (this.ccb != 0) {
                this.hl();
            } else if (this.teb) {
                this.bl();
            } else if (this.qdb) {
                this.xk();
            } else {
                int var3;
                int var5;
                int var6;
                int var7;
                for(int var1 = 0; var1 < this.ev; ++var1) {
                    Character var2 = this.iv[var1];
                    var3 = (var2.hr + 1) % 10;
                    if (var2.gr != var3) {
                        byte var4 = -1;
                        var5 = var2.gr;
                        if (var5 < var3) {
                            var6 = var3 - var5;
                        } else {
                            var6 = 10 + var3 - var5;
                        }

                        var7 = 4;
                        if (var6 > 2) {
                            var7 = (var6 - 1) * 4;
                        }

                        if (var2.ir[var5] - var2.ar <= this.ot * 3 && var2.jr[var5] - var2.br <= this.ot * 3 && var2.ir[var5] - var2.ar >= -this.ot * 3 && var2.jr[var5] - var2.br >= -this.ot * 3 && var6 <= 8) {
                            if (var2.ar < var2.ir[var5]) {
                                var2.ar += var7;
                                ++var2.dr;
                                var4 = 2;
                            } else if (var2.ar > var2.ir[var5]) {
                                var2.ar -= var7;
                                ++var2.dr;
                                var4 = 6;
                            }

                            if (var2.ar - var2.ir[var5] < var7 && var2.ar - var2.ir[var5] > -var7) {
                                var2.ar = var2.ir[var5];
                            }

                            if (var2.br < var2.jr[var5]) {
                                var2.br += var7;
                                ++var2.dr;
                                if (var4 == -1) {
                                    var4 = 4;
                                } else if (var4 == 2) {
                                    var4 = 3;
                                } else {
                                    var4 = 5;
                                }
                            } else if (var2.br > var2.jr[var5]) {
                                var2.br -= var7;
                                ++var2.dr;
                                if (var4 == -1) {
                                    var4 = 0;
                                } else if (var4 == 2) {
                                    var4 = 1;
                                } else {
                                    var4 = 7;
                                }
                            }

                            if (var2.br - var2.jr[var5] < var7 && var2.br - var2.jr[var5] > -var7) {
                                var2.br = var2.jr[var5];
                            }
                        } else {
                            var2.ar = var2.ir[var5];
                            var2.br = var2.jr[var5];
                        }

                        if (var4 != -1) {
                            var2.er = var4;
                        }

                        if (var2.ar == var2.ir[var5] && var2.br == var2.jr[var5]) {
                            var2.gr = (var5 + 1) % 10;
                        }
                    } else {
                        var2.er = var2.fr;
                    }

                    if (var2.mr > 0) {
                        --var2.mr;
                    }

                    if (var2.or > 0) {
                        --var2.or;
                    }

                    if (var2.sr > 0) {
                        --var2.sr;
                    }

                    if (this.lab > 0) {
                        --this.lab;
                        if (this.lab == 0) {
                            this.pk("You have been granted another life. Be more careful this time!", 3);
                        }

                        if (this.lab == 0) {
                            this.pk("You retain your skills. Unless you attacked another player recently,", 3);
                        }

                        if (this.lab == 0) {
                            this.pk("you also keep your best 3 items. Everything else lands where you died.", 3);
                        }
                    }
                }

                int var13;
                for(int var9 = 0; var9 < this.qv; ++var9) {
                    Character var10 = this.tv[var9];
                    var13 = (var10.hr + 1) % 10;
                    if (var10.gr != var13) {
                        byte var11 = -1;
                        var6 = var10.gr;
                        if (var6 < var13) {
                            var7 = var13 - var6;
                        } else {
                            var7 = 10 + var13 - var6;
                        }

                        int var8 = 4;
                        if (var7 > 2) {
                            var8 = (var7 - 1) * 4;
                        }

                        if (var10.ir[var6] - var10.ar <= this.ot * 3 && var10.jr[var6] - var10.br <= this.ot * 3 && var10.ir[var6] - var10.ar >= -this.ot * 3 && var10.jr[var6] - var10.br >= -this.ot * 3 && var7 <= 8) {
                            if (var10.ar < var10.ir[var6]) {
                                var10.ar += var8;
                                ++var10.dr;
                                var11 = 2;
                            } else if (var10.ar > var10.ir[var6]) {
                                var10.ar -= var8;
                                ++var10.dr;
                                var11 = 6;
                            }

                            if (var10.ar - var10.ir[var6] < var8 && var10.ar - var10.ir[var6] > -var8) {
                                var10.ar = var10.ir[var6];
                            }

                            if (var10.br < var10.jr[var6]) {
                                var10.br += var8;
                                ++var10.dr;
                                if (var11 == -1) {
                                    var11 = 4;
                                } else if (var11 == 2) {
                                    var11 = 3;
                                } else {
                                    var11 = 5;
                                }
                            } else if (var10.br > var10.jr[var6]) {
                                var10.br -= var8;
                                ++var10.dr;
                                if (var11 == -1) {
                                    var11 = 0;
                                } else if (var11 == 2) {
                                    var11 = 1;
                                } else {
                                    var11 = 7;
                                }
                            }

                            if (var10.br - var10.jr[var6] < var8 && var10.br - var10.jr[var6] > -var8) {
                                var10.br = var10.jr[var6];
                            }
                        } else {
                            var10.ar = var10.ir[var6];
                            var10.br = var10.jr[var6];
                        }

                        if (var11 != -1) {
                            var10.er = var11;
                        }

                        if (var10.ar == var10.ir[var6] && var10.br == var10.jr[var6]) {
                            var10.gr = (var6 + 1) % 10;
                        }
                    } else {
                        var10.er = var10.fr;
                    }

                    if (var10.mr > 0) {
                        --var10.mr;
                    }

                    if (var10.or > 0) {
                        --var10.or;
                    }

                    if (var10.sr > 0) {
                        --var10.sr;
                    }
                }

                for(var3 = 0; var3 < this.ev; ++var3) {
                    Character var14 = this.iv[var3];
                    if (var14.cs > 0) {
                        --var14.cs;
                    }
                }

                if (this.xx) {
                    if (this.wu - this.kv.ar < -500 || this.wu - this.kv.ar > 500 || this.xu - this.kv.br < -500 || this.xu - this.kv.br > 500) {
                        this.wu = this.kv.ar;
                        this.xu = this.kv.br;
                    }
                } else {
                    if (this.wu - this.kv.ar < -500 || this.wu - this.kv.ar > 500 || this.xu - this.kv.br < -500 || this.xu - this.kv.br > 500) {
                        this.wu = this.kv.ar;
                        this.xu = this.kv.br;
                    }

                    if (this.wu != this.kv.ar) {
                        this.wu += (this.kv.ar - this.wu) / (16 + (this.uu - 500) / 15);
                    }

                    if (this.xu != this.kv.br) {
                        this.xu += (this.kv.br - this.xu) / (16 + (this.uu - 500) / 15);
                    }

                    if (this.yx) {
                        var13 = this.yu * 32;
                        var5 = var13 - this.av;
                        byte var12 = 1;
                        if (var5 != 0) {
                            ++this.zu;
                            if (var5 > 128) {
                                var12 = -1;
                                var5 = 256 - var5;
                            } else if (var5 > 0) {
                                var12 = 1;
                            } else if (var5 < -128) {
                                var12 = 1;
                                var5 += 256;
                            } else if (var5 < 0) {
                                var12 = -1;
                                var5 = -var5;
                            }

                            this.av += (this.zu * var5 + 255) / 256 * var12;
                            this.av &= 255;
                        } else {
                            this.zu = 0;
                        }
                    }
                }

                if (super.lq > this.rt - 4) {
                    if (super.kq > 15 && super.kq < 96 && super.nq == 1) {
                        this.az = 0;
                    }

                    if (super.kq > 110 && super.kq < 194 && super.nq == 1) {
                        this.az = 1;
                        this.vy.ue[this.wy] = 999999;
                    }

                    if (super.kq > 215 && super.kq < 295 && super.nq == 1) {
                        this.az = 2;
                        this.vy.ue[this.yy] = 999999;
                    }

                    if (super.kq > 315 && super.kq < 395 && super.nq == 1) {
                        this.az = 3;
                        this.vy.ue[this.zy] = 999999;
                    }

                    super.nq = 0;
                    super.mq = 0;
                }

                this.vy.ud(super.kq, super.lq, super.nq, super.mq);
                if (this.az > 0 && super.kq >= 494 && super.lq >= this.rt - 66) {
                    super.nq = 0;
                }

                if (this.vy.wd(this.xy)) {
                    String var15 = this.vy.sc(this.xy);
                    this.vy.od(this.xy, "");
                    if (var15.equalsIgnoreCase("lostcon99") && !this.ct) {
                        super.ed.zb();
                    } else if (var15.equalsIgnoreCase("closecon99") && !this.ct) {
                        this.ob();
                    } else if (!this.y(var15)) {
                        this.kv.mr = 150;
                        this.kv.lr = var15;
                        this.pk(this.kv.xq + ": " + var15, 2);
                    }
                }

                if (this.az == 0) {
                    for(var13 = 0; var13 < this.bz; ++var13) {
                        if (this.dz[var13] > 0) {
                            --this.dz[var13];
                        }
                    }
                }

                if (this.lab != 0) {
                    super.nq = 0;
                }

                if (this.ez) {
                    if (super.mq != 0) {
                        ++this.oz;
                    } else {
                        this.oz = 0;
                    }

                    if (this.oz > 300) {
                        this.pz += 50;
                    } else if (this.oz > 150) {
                        this.pz += 5;
                    } else if (this.oz > 50) {
                        ++this.pz;
                    } else if (this.oz > 20 && (this.oz & 5) == 0) {
                        ++this.pz;
                    }
                } else {
                    this.oz = 0;
                    this.pz = 0;
                }

                if (super.nq == 1) {
                    this.ft = 1;
                } else if (super.nq == 2) {
                    this.ft = 2;
                }

                this.kt.zh(super.kq, super.lq);
                super.nq = 0;
                if (this.yx) {
                    if (this.zu == 0 || this.xx) {
                        if (super.dq) {
                            this.yu = this.yu + 1 & 7;
                            super.dq = false;
                            if (!this.vu) {
                                if ((this.yu & 1) == 0) {
                                    this.yu = this.yu + 1 & 7;
                                }

                                for(var13 = 0; var13 < 8 && !this.lm(this.yu); ++var13) {
                                    this.yu = this.yu + 1 & 7;
                                }
                            }
                        }

                        if (super.eq) {
                            this.yu = this.yu + 7 & 7;
                            super.eq = false;
                            if (!this.vu) {
                                if ((this.yu & 1) == 0) {
                                    this.yu = this.yu + 7 & 7;
                                }

                                for(var13 = 0; var13 < 8 && !this.lm(this.yu); ++var13) {
                                    this.yu = this.yu + 7 & 7;
                                }
                            }
                        }
                    }
                } else if (super.dq) {
                    this.av = this.av + 2 & 255;
                } else if (super.eq) {
                    this.av = this.av - 2 & 255;
                }

                if (this.vu && this.uu > 550) {
                    this.uu -= 4;
                } else if (!this.vu && this.uu < 750) {
                    this.uu += 4;
                }

                if (this.cu > 0) {
                    --this.cu;
                } else if (this.cu < 0) {
                    ++this.cu;
                }

                this.kt.ki(17);
                ++this.xt;
                if (this.xt > 5) {
                    this.xt = 0;
                    this.yt = this.yt + 1 & 3;
                    this.zt = (this.zt + 1) % 3;
                }

                for(var13 = 0; var13 < this.ew; ++var13) {
                    var5 = this.gw[var13];
                    var6 = this.hw[var13];
                    if (var5 >= 0 && var6 >= 0 && var5 < 96 && var6 < 96 && this.iw[var13] == 74) {
                        this.fw[var13].ze(1, 0, 0);
                    }
                }

            }
        }
    }

    public void pk(String var1, int var2) {
        int var3;
        if (var2 == 2 || var2 == 4 || var2 == 6) {
            while(true) {
                if (var1.length() <= 5 || var1.charAt(0) != '@' || var1.charAt(4) != '@') {
                    var3 = var1.indexOf(":");
                    if (var3 != -1) {
                        String var4 = var1.substring(0, var3);
                        long var5 = Utility.on(var4);

                        for(int var7 = 0; var7 < super.nd; ++var7) {
                            if (super.od[var7] == var5) {
                                return;
                            }
                        }
                    }
                    break;
                }

                var1 = var1.substring(5);
            }
        }

        if (var2 == 2) {
            var1 = "@yel@" + var1;
        }

        if (var2 == 3 || var2 == 4) {
            var1 = "@whi@" + var1;
        }

        if (var2 == 6) {
            var1 = "@cya@" + var1;
        }

        if (this.az != 0) {
            if (var2 == 4 || var2 == 3) {
                this.ry = 200;
            }

            if (var2 == 2 && this.az != 1) {
                this.sy = 200;
            }

            if (var2 == 5 && this.az != 2) {
                this.ty = 200;
            }

            if (var2 == 6 && this.az != 3) {
                this.uy = 200;
            }

            if (var2 == 3 && this.az != 0) {
                this.az = 0;
            }

            if (var2 == 6 && this.az != 3 && this.az != 0) {
                this.az = 3;
            }
        }

        for(var3 = this.bz - 1; var3 > 0; --var3) {
            this.cz[var3] = this.cz[var3 - 1];
            this.dz[var3] = this.dz[var3 - 1];
        }

        this.cz[0] = var1;
        this.dz[0] = 300;
        if (var2 == 2) {
            if (this.vy.ue[this.wy] == this.vy.ve[this.wy] - 4) {
                this.vy.gc(this.wy, var1, true);
            } else {
                this.vy.gc(this.wy, var1, false);
            }
        }

        if (var2 == 5) {
            if (this.vy.ue[this.yy] == this.vy.ve[this.yy] - 4) {
                this.vy.gc(this.yy, var1, true);
            } else {
                this.vy.gc(this.yy, var1, false);
            }
        }

        if (var2 == 6) {
            if (this.vy.ue[this.zy] == this.vy.ve[this.zy] - 4) {
                this.vy.gc(this.zy, var1, true);
                return;
            }

            this.vy.gc(this.zy, var1, false);
        }

    }

    public void x(String var1) {
        if (var1.startsWith("@cha@")) {
            this.pk(var1, 2);
        } else if (var1.startsWith("@bor@")) {
            this.pk(var1, 4);
        } else if (var1.startsWith("@que@")) {
            this.pk("@whi@" + var1, 5);
        } else if (var1.startsWith("@pri@")) {
            this.pk(var1, 6);
        } else {
            this.pk(var1, 3);
        }
    }

    public Character vk(int var1, int var2, int var3, int var4) {
        if (this.hv[var1] == null) {
            this.hv[var1] = new Character();
            this.hv[var1].yq = var1;
            this.hv[var1].zq = 0;
        }

        Character var5 = this.hv[var1];
        boolean var6 = false;

        for(int var7 = 0; var7 < this.fv; ++var7) {
            if (this.jv[var7].yq == var1) {
                var6 = true;
                break;
            }
        }

        if (var6) {
            var5.fr = var4;
            int var8 = var5.hr;
            if (var2 != var5.ir[var8] || var3 != var5.jr[var8]) {
                var5.hr = var8 = (var8 + 1) % 10;
                var5.ir[var8] = var2;
                var5.jr[var8] = var3;
            }
        } else {
            var5.yq = var1;
            var5.gr = 0;
            var5.hr = 0;
            var5.ir[0] = var5.ar = var2;
            var5.jr[0] = var5.br = var3;
            var5.fr = var5.er = var4;
            var5.dr = 0;
        }

        this.iv[this.ev++] = var5;
        return var5;
    }

    public Character sm(int var1, int var2, int var3, int var4, int var5) {
        if (this.sv[var1] == null) {
            this.sv[var1] = new Character();
            this.sv[var1].yq = var1;
        }

        Character var6 = this.sv[var1];
        boolean var7 = false;

        for(int var8 = 0; var8 < this.rv; ++var8) {
            if (this.uv[var8].yq == var1) {
                var7 = true;
                break;
            }
        }

        if (var7) {
            var6.cr = var5;
            var6.fr = var4;
            int var9 = var6.hr;
            if (var2 != var6.ir[var9] || var3 != var6.jr[var9]) {
                var6.hr = var9 = (var9 + 1) % 10;
                var6.ir[var9] = var2;
                var6.jr[var9] = var3;
            }
        } else {
            var6.yq = var1;
            var6.gr = 0;
            var6.hr = 0;
            var6.ir[0] = var6.ar = var2;
            var6.jr[0] = var6.br = var3;
            var6.cr = var5;
            var6.fr = var6.er = var4;
            var6.dr = 0;
        }

        this.tv[this.qv++] = var6;
        return var6;
    }

    public void db(int var1, int var2, byte[] var3) {
        int var6;
        try {
            int var8;
            int var9;
            int var10;
            int var12;
            int var13;
            int var14;
            int var15;
            int var20;
            int var21;
            byte var26;
            int var27;
            boolean var33;
            if (var1 == 255) {
                this.fv = this.ev;

                for(var20 = 0; var20 < this.fv; ++var20) {
                    this.jv[var20] = this.iv[var20];
                }

                var26 = 8;
                this.lv = Utility.pn(var3, var26, 10);
                var21 = var26 + 10;
                this.mv = Utility.pn(var3, var21, 12);
                var21 += 12;
                var6 = Utility.pn(var3, var21, 4);
                var21 += 4;
                boolean var28 = this.wm(this.lv, this.mv);
                this.lv -= this.ku;
                this.mv -= this.lu;
                var8 = this.lv * this.ot + 64;
                var9 = this.mv * this.ot + 64;
                if (var28) {
                    this.kv.hr = 0;
                    this.kv.gr = 0;
                    this.kv.ar = this.kv.ir[0] = var8;
                    this.kv.br = this.kv.jr[0] = var9;
                }

                this.ev = 0;
                this.kv = this.vk(this.nv, var8, var9, var6);
                var10 = Utility.pn(var3, var21, 8);
                var21 += 8;
                var27 = 0;

                while(true) {
                    int var34;
                    if (var27 >= var10) {
                        var12 = 0;

                        while(var21 + 24 < var2 * 8) {
                            var13 = Utility.pn(var3, var21, 11);
                            var21 += 11;
                            var14 = Utility.pn(var3, var21, 5);
                            var21 += 5;
                            if (var14 > 15) {
                                var14 -= 32;
                            }

                            var15 = Utility.pn(var3, var21, 5);
                            var21 += 5;
                            if (var15 > 15) {
                                var15 -= 32;
                            }

                            var6 = Utility.pn(var3, var21, 4);
                            var21 += 4;
                            var34 = Utility.pn(var3, var21, 1);
                            ++var21;
                            var8 = (this.lv + var14) * this.ot + 64;
                            var9 = (this.mv + var15) * this.ot + 64;
                            this.vk(var13, var8, var9, var6);
                            if (var34 == 0) {
                                this.vv[var12++] = var13;
                            }
                        }

                        if (var12 > 0) {
                            super.ed.a(254);
                            super.ed.l(var12);

                            for(var13 = 0; var13 < var12; ++var13) {
                                Character var38 = this.hv[this.vv[var13]];
                                super.ed.l(var38.yq);
                                super.ed.l(var38.zq);
                            }

                            super.ed.d();
                            var33 = false;
                            return;
                        }
                        break;
                    }

                    label878: {
                        Character var37 = this.jv[var27 + 1];
                        var13 = Utility.pn(var3, var21, 1);
                        ++var21;
                        if (var13 != 0) {
                            var14 = Utility.pn(var3, var21, 1);
                            ++var21;
                            if (var14 == 0) {
                                var15 = Utility.pn(var3, var21, 3);
                                var21 += 3;
                                var34 = var37.hr;
                                int var17 = var37.ir[var34];
                                int var18 = var37.jr[var34];
                                if (var15 == 2 || var15 == 1 || var15 == 3) {
                                    var17 += this.ot;
                                }

                                if (var15 == 6 || var15 == 5 || var15 == 7) {
                                    var17 -= this.ot;
                                }

                                if (var15 == 4 || var15 == 3 || var15 == 5) {
                                    var18 += this.ot;
                                }

                                if (var15 == 0 || var15 == 1 || var15 == 7) {
                                    var18 -= this.ot;
                                }

                                var37.fr = var15;
                                var37.hr = var34 = (var34 + 1) % 10;
                                var37.ir[var34] = var17;
                                var37.jr[var34] = var18;
                            } else {
                                var15 = Utility.pn(var3, var21, 4);
                                if ((var15 & 12) == 12) {
                                    var21 += 2;
                                    break label878;
                                }

                                var37.fr = Utility.pn(var3, var21, 4);
                                var21 += 4;
                            }
                        }

                        this.iv[this.ev++] = var37;
                    }

                    ++var27;
                }
            } else {
                int var7;
                if (var1 == 254) {
                    var20 = 1;

                    while(true) {
                        while(var20 < var2) {
                            if (Utility.qn(var3[var20]) == 255) {
                                var21 = 0;
                                var6 = this.lv + var3[var20 + 1] >> 3;
                                var7 = this.mv + var3[var20 + 2] >> 3;
                                var20 += 3;

                                for(var8 = 0; var8 < this.xv; ++var8) {
                                    var9 = (this.zv[var8] >> 3) - var6;
                                    var10 = (this.aw[var8] >> 3) - var7;
                                    if (var9 != 0 || var10 != 0) {
                                        if (var8 != var21) {
                                            this.zv[var21] = this.zv[var8];
                                            this.aw[var21] = this.aw[var8];
                                            this.bw[var21] = this.bw[var8];
                                            this.cw[var21] = this.cw[var8];
                                        }

                                        ++var21;
                                    }
                                }

                                this.xv = var21;
                            } else {
                                var21 = Utility.tn(var3, var20);
                                var20 += 2;
                                var6 = this.lv + var3[var20++];
                                var7 = this.mv + var3[var20++];
                                if ((var21 & '耀') == 0) {
                                    this.zv[this.xv] = var6;
                                    this.aw[this.xv] = var7;
                                    this.bw[this.xv] = var21;
                                    this.cw[this.xv] = 0;

                                    for(var8 = 0; var8 < this.ew; ++var8) {
                                        if (this.gw[var8] == var6 && this.hw[var8] == var7) {
                                            this.cw[this.xv] = GameData.kkb[this.iw[var8]];
                                            break;
                                        }
                                    }

                                    ++this.xv;
                                } else {
                                    var21 &= 32767;
                                    var8 = 0;

                                    for(var9 = 0; var9 < this.xv; ++var9) {
                                        if (this.zv[var9] == var6 && this.aw[var9] == var7 && this.bw[var9] == var21) {
                                            var21 = -123;
                                        } else {
                                            if (var9 != var8) {
                                                this.zv[var8] = this.zv[var9];
                                                this.aw[var8] = this.aw[var9];
                                                this.bw[var8] = this.bw[var9];
                                                this.cw[var8] = this.cw[var9];
                                            }

                                            ++var8;
                                        }
                                    }

                                    this.xv = var8;
                                }
                            }
                        }

                        return;
                    }
                }

                if (var1 == 253) {
                    var20 = 1;

                    while(true) {
                        while(var20 < var2) {
                            if (Utility.qn(var3[var20]) == 255) {
                                var21 = 0;
                                var6 = this.lv + var3[var20 + 1] >> 3;
                                var7 = this.mv + var3[var20 + 2] >> 3;
                                var20 += 3;

                                for(var8 = 0; var8 < this.ew; ++var8) {
                                    var9 = (this.gw[var8] >> 3) - var6;
                                    var10 = (this.hw[var8] >> 3) - var7;
                                    if (var9 == 0 && var10 == 0) {
                                        this.kt.ci(this.fw[var8]);
                                        this.fu.yo(this.gw[var8], this.hw[var8], this.iw[var8]);
                                    } else {
                                        if (var8 != var21) {
                                            this.fw[var21] = this.fw[var8];
                                            this.fw[var21].nh = var21;
                                            this.gw[var21] = this.gw[var8];
                                            this.hw[var21] = this.hw[var8];
                                            this.iw[var21] = this.iw[var8];
                                            this.jw[var21] = this.jw[var8];
                                        }

                                        ++var21;
                                    }
                                }

                                this.ew = var21;
                            } else {
                                var21 = Utility.tn(var3, var20);
                                var20 += 2;
                                var6 = this.lv + var3[var20++];
                                var7 = this.mv + var3[var20++];
                                var8 = 0;

                                for(var9 = 0; var9 < this.ew; ++var9) {
                                    if (this.gw[var9] == var6 && this.hw[var9] == var7) {
                                        this.kt.ci(this.fw[var9]);
                                        this.fu.yo(this.gw[var9], this.hw[var9], this.iw[var9]);
                                    } else {
                                        if (var9 != var8) {
                                            this.fw[var8] = this.fw[var9];
                                            this.fw[var8].nh = var8;
                                            this.gw[var8] = this.gw[var9];
                                            this.hw[var8] = this.hw[var9];
                                            this.iw[var8] = this.iw[var9];
                                            this.jw[var8] = this.jw[var9];
                                        }

                                        ++var8;
                                    }
                                }

                                this.ew = var8;
                                if (var21 != 60000) {
                                    var10 = this.fu.bo(var6, var7);
                                    if (var10 != 0 && var10 != 4) {
                                        var12 = GameData.gkb[var21];
                                        var27 = GameData.hkb[var21];
                                    } else {
                                        var27 = GameData.gkb[var21];
                                        var12 = GameData.hkb[var21];
                                    }

                                    var13 = (var6 + var6 + var27) * this.ot / 2;
                                    var14 = (var7 + var7 + var12) * this.ot / 2;
                                    var15 = GameData.fkb[var21];
                                    GameModel var16 = this.kw[var15].ue();
                                    this.kt.yh(var16);
                                    var16.nh = this.ew;
                                    var16.ze(0, var10 * 32, 0);
                                    var16.ee(var13, -this.fu.ho(var13, var14), var14);
                                    var16.we(true, 48, 48, -50, -10, -50);
                                    this.fu.oo(var6, var7, var21);
                                    if (var21 == 74) {
                                        var16.ee(0, -480, 0);
                                    }

                                    this.gw[this.ew] = var6;
                                    this.hw[this.ew] = var7;
                                    this.iw[this.ew] = var21;
                                    this.jw[this.ew] = var10;
                                    this.fw[this.ew++] = var16;
                                }
                            }
                        }

                        return;
                    }
                }

                if (var1 == 252) {
                    this.ww = 0;

                    for(var20 = 8; var20 + 9 < var2 * 8; ++this.ww) {
                        var21 = Utility.pn(var3, var20, 10);
                        var20 += 10;
                        var6 = 0;
                        if (GameData.jib[var21] != 0) {
                            var6 = Utility.pn(var3, var20, 1);
                            ++var20;
                        }

                        var7 = 1;
                        if (GameData.bib[var21] == 0) {
                            var7 = Utility.pn(var3, var20, 16);
                            var20 += 16;
                        }

                        this.xw[this.ww] = var21;
                        this.zw[this.ww] = var6;
                        this.yw[this.ww] = var7;
                    }

                    return;
                }

                Character var24;
                if (var1 == 250) {
                    var20 = Utility.tn(var3, 1);
                    var21 = 3;

                    for(var6 = 0; var6 < var20; ++var6) {
                        var7 = Utility.tn(var3, var21);
                        var21 += 2;
                        var24 = this.hv[var7];
                        byte var29 = var3[var21];
                        ++var21;
                        if (var29 == 0) {
                            var10 = Utility.tn(var3, var21);
                            var21 += 2;
                            if (var24 != null) {
                                var24.or = 150;
                                var24.nr = var10;
                            }
                        } else if (var29 == 1) {
                            byte var35 = var3[var21];
                            ++var21;
                            if (var24 != null) {
                                String var36 = new String(var3, var21, var35);
                                if (var36.startsWith("@que@")) {
                                    var24.mr = 150;
                                    var24.lr = var36;
                                    if (var24 == this.kv) {
                                        this.pk("@yel@" + var24.xq + ": " + var24.lr, 5);
                                    }
                                } else if (var24 != this.kv) {
                                    var33 = false;

                                    for(var13 = 0; var13 < super.nd; ++var13) {
                                        if (super.od[var13] == var24.wq) {
                                            var33 = true;
                                        }
                                    }

                                    if (!var33) {
                                        var36 = Utility.in(var36, true);
                                        var24.mr = 150;
                                        var24.lr = var36;
                                        this.pk(var24.xq + ": " + var24.lr, 2);
                                    }
                                }
                            }

                            var21 += var35;
                        } else if (var29 == 2) {
                            var10 = Utility.qn(var3[var21]);
                            ++var21;
                            var27 = Utility.qn(var3[var21]);
                            ++var21;
                            var12 = Utility.qn(var3[var21]);
                            ++var21;
                            if (var24 != null) {
                                var24.pr = var10;
                                var24.qr = var27;
                                var24.rr = var12;
                                var24.sr = 200;
                                if (var24 == this.kv) {
                                    this.cx[3] = var27;
                                    this.dx[3] = var12;
                                }
                            }
                        } else if (var29 == 3) {
                            var10 = Utility.tn(var3, var21);
                            var21 += 2;
                            var27 = Utility.tn(var3, var21);
                            var21 += 2;
                            if (var24 != null) {
                                var24.zr = var10;
                                var24.bs = var27;
                                var24.as = -1;
                                var24.cs = this.vt;
                            }
                        } else if (var29 == 4) {
                            var10 = Utility.tn(var3, var21);
                            var21 += 2;
                            var27 = Utility.tn(var3, var21);
                            var21 += 2;
                            if (var24 != null) {
                                var24.zr = var10;
                                var24.as = var27;
                                var24.bs = -1;
                                var24.cs = this.vt;
                            }
                        } else if (var29 == 5) {
                            if (var24 == null) {
                                var21 += 14;
                                var10 = Utility.qn(var3[var21]);
                                var21 += var10 + 1;
                            } else {
                                var24.zq = Utility.tn(var3, var21);
                                var21 += 2;
                                var24.wq = Utility.nn(var3, var21);
                                var21 += 8;
                                var24.xq = Utility.rn(var24.wq);
                                var10 = Utility.qn(var3[var21]);
                                ++var21;

                                for(var27 = 0; var27 < var10; ++var27) {
                                    var24.kr[var27] = Utility.qn(var3[var21]);
                                    ++var21;
                                }

                                for(var12 = var10; var12 < 12; ++var12) {
                                    var24.kr[var12] = 0;
                                }

                                var24.vr = var3[var21++] & 255;
                                var24.wr = var3[var21++] & 255;
                                var24.xr = var3[var21++] & 255;
                                var24.yr = var3[var21++] & 255;
                                var24.tr = var3[var21++] & 255;
                                var24.ur = var3[var21++] & 255;
                                var24.fs = var3[var21++] & 255;
                            }
                        }
                    }

                    return;
                }

                if (var1 == 249) {
                    var20 = 1;

                    while(true) {
                        while(var20 < var2) {
                            if (Utility.qn(var3[var20]) == 255) {
                                var21 = 0;
                                var6 = this.lv + var3[var20 + 1] >> 3;
                                var7 = this.mv + var3[var20 + 2] >> 3;
                                var20 += 3;

                                for(var8 = 0; var8 < this.nw; ++var8) {
                                    var9 = (this.pw[var8] >> 3) - var6;
                                    var10 = (this.qw[var8] >> 3) - var7;
                                    if (var9 == 0 && var10 == 0) {
                                        this.kt.ci(this.ow[var8]);
                                        this.fu.yn(this.pw[var8], this.qw[var8], this.rw[var8], this.sw[var8]);
                                    } else {
                                        if (var8 != var21) {
                                            this.ow[var21] = this.ow[var8];
                                            this.ow[var21].nh = var21 + 10000;
                                            this.pw[var21] = this.pw[var8];
                                            this.qw[var21] = this.qw[var8];
                                            this.rw[var21] = this.rw[var8];
                                            this.sw[var21] = this.sw[var8];
                                        }

                                        ++var21;
                                    }
                                }

                                this.nw = var21;
                            } else {
                                var21 = Utility.tn(var3, var20);
                                var20 += 2;
                                var6 = this.lv + var3[var20++];
                                var7 = this.mv + var3[var20++];
                                byte var25 = var3[var20++];
                                var9 = 0;

                                for(var10 = 0; var10 < this.nw; ++var10) {
                                    if (this.pw[var10] == var6 && this.qw[var10] == var7 && this.rw[var10] == var25) {
                                        this.kt.ci(this.ow[var10]);
                                        this.fu.yn(this.pw[var10], this.qw[var10], this.rw[var10], this.sw[var10]);
                                    } else {
                                        if (var10 != var9) {
                                            this.ow[var9] = this.ow[var10];
                                            this.ow[var9].nh = var9 + 10000;
                                            this.pw[var9] = this.pw[var10];
                                            this.qw[var9] = this.qw[var10];
                                            this.rw[var9] = this.rw[var10];
                                            this.sw[var9] = this.sw[var10];
                                        }

                                        ++var9;
                                    }
                                }

                                this.nw = var9;
                                if (var21 != 65535) {
                                    this.fu.ap(var6, var7, var25, var21);
                                    GameModel var32 = this.km(var6, var7, var25, var21, this.nw);
                                    this.ow[this.nw] = var32;
                                    this.pw[this.nw] = var6;
                                    this.qw[this.nw] = var7;
                                    this.sw[this.nw] = var21;
                                    this.rw[this.nw++] = var25;
                                }
                            }
                        }

                        return;
                    }
                }

                if (var1 == 248) {
                    this.rv = this.qv;
                    this.qv = 0;

                    for(var20 = 0; var20 < this.rv; ++var20) {
                        this.uv[var20] = this.tv[var20];
                    }

                    var26 = 8;
                    var6 = Utility.pn(var3, var26, 8);
                    var21 = var26 + 8;

                    for(var7 = 0; var7 < var6; ++var7) {
                        var24 = this.uv[var7];
                        var9 = Utility.pn(var3, var21, 1);
                        ++var21;
                        if (var9 != 0) {
                            var10 = Utility.pn(var3, var21, 1);
                            ++var21;
                            if (var10 == 0) {
                                var27 = Utility.pn(var3, var21, 3);
                                var21 += 3;
                                var12 = var24.hr;
                                var13 = var24.ir[var12];
                                var14 = var24.jr[var12];
                                if (var27 == 2 || var27 == 1 || var27 == 3) {
                                    var13 += this.ot;
                                }

                                if (var27 == 6 || var27 == 5 || var27 == 7) {
                                    var13 -= this.ot;
                                }

                                if (var27 == 4 || var27 == 3 || var27 == 5) {
                                    var14 += this.ot;
                                }

                                if (var27 == 0 || var27 == 1 || var27 == 7) {
                                    var14 -= this.ot;
                                }

                                var24.fr = var27;
                                var24.hr = var12 = (var12 + 1) % 10;
                                var24.ir[var12] = var13;
                                var24.jr[var12] = var14;
                            } else {
                                var27 = Utility.pn(var3, var21, 4);
                                if ((var27 & 12) == 12) {
                                    var21 += 2;
                                    continue;
                                }

                                var24.fr = Utility.pn(var3, var21, 4);
                                var21 += 4;
                            }
                        }

                        this.tv[this.qv++] = var24;
                    }

                    for(; var21 + 31 < var2 * 8; this.sm(var8, var12, var13, var27, var14)) {
                        var8 = Utility.pn(var3, var21, 10);
                        var21 += 10;
                        var9 = Utility.pn(var3, var21, 5);
                        var21 += 5;
                        if (var9 > 15) {
                            var9 -= 32;
                        }

                        var10 = Utility.pn(var3, var21, 5);
                        var21 += 5;
                        if (var10 > 15) {
                            var10 -= 32;
                        }

                        var27 = Utility.pn(var3, var21, 4);
                        var21 += 4;
                        var12 = (this.lv + var9) * this.ot + 64;
                        var13 = (this.mv + var10) * this.ot + 64;
                        var14 = Utility.pn(var3, var21, 8);
                        var21 += 8;
                        if (var14 >= GameData.oib) {
                            var14 = 24;
                        }
                    }

                    return;
                }

                if (var1 == 247) {
                    var20 = Utility.tn(var3, 1);
                    var21 = 3;

                    for(var6 = 0; var6 < var20; ++var6) {
                        var7 = Utility.tn(var3, var21);
                        var21 += 2;
                        var24 = this.sv[var7];
                        var9 = Utility.qn(var3[var21]);
                        ++var21;
                        if (var9 == 1) {
                            var10 = Utility.tn(var3, var21);
                            var21 += 2;
                            byte var31 = var3[var21];
                            ++var21;
                            if (var24 != null) {
                                String var30 = new String(var3, var21, var31);
                                var24.mr = 150;
                                var24.lr = var30;
                                if (var10 == this.kv.yq) {
                                    this.pk("@yel@" + GameData.pib[var24.cr][0] + ": " + var24.lr, 5);
                                }
                            }

                            var21 += var31;
                        } else if (var9 == 2) {
                            var10 = Utility.qn(var3[var21]);
                            ++var21;
                            var27 = Utility.qn(var3[var21]);
                            ++var21;
                            var12 = Utility.qn(var3[var21]);
                            ++var21;
                            if (var24 != null) {
                                var24.pr = var10;
                                var24.qr = var27;
                                var24.rr = var12;
                                var24.sr = 200;
                            }
                        }
                    }

                    return;
                }

                if (var1 == 246) {
                    this.yz = true;
                    var20 = Utility.qn(var3[1]);
                    this.zz = var20;
                    var21 = 2;

                    for(var6 = 0; var6 < var20; ++var6) {
                        var7 = Utility.qn(var3[var21]);
                        ++var21;
                        this.aab[var6] = new String(var3, var21, var7);
                        var21 += var7;
                    }

                    return;
                }

                if (var1 == 245) {
                    this.yz = false;
                    return;
                }

                if (var1 == 244) {
                    this.nv = Utility.tn(var3, 1);
                    this.gu = Utility.tn(var3, 3);
                    this.hu = Utility.tn(var3, 5);
                    this.mu = Utility.tn(var3, 7);
                    this.iu = Utility.tn(var3, 9);
                    this.hu -= this.mu * this.iu;
                    return;
                }

                if (var1 == 243) {
                    var20 = 1;

                    for(var21 = 0; var21 < 16; ++var21) {
                        this.cx[var21] = Utility.qn(var3[var20++]);
                    }

                    for(var6 = 0; var6 < 16; ++var6) {
                        this.dx[var6] = Utility.qn(var3[var20++]);
                    }

                    this.fx = Utility.qn(var3[var20++]);
                    return;
                }

                if (var1 == 242) {
                    for(var20 = 0; var20 < 5; ++var20) {
                        this.ex[var20] = Utility.qn(var3[1 + var20]);
                    }

                    return;
                }

                if (var1 == 241) {
                    this.lab = 250;
                    return;
                }

                if (var1 == 240) {
                    var20 = (var2 - 1) / 4;

                    for(var21 = 0; var21 < var20; ++var21) {
                        var6 = this.lv + Utility.un(var3, 1 + var21 * 4) >> 3;
                        var7 = this.mv + Utility.un(var3, 3 + var21 * 4) >> 3;
                        var8 = 0;

                        for(var9 = 0; var9 < this.xv; ++var9) {
                            var10 = (this.zv[var9] >> 3) - var6;
                            var27 = (this.aw[var9] >> 3) - var7;
                            if (var10 != 0 || var27 != 0) {
                                if (var9 != var8) {
                                    this.zv[var8] = this.zv[var9];
                                    this.aw[var8] = this.aw[var9];
                                    this.bw[var8] = this.bw[var9];
                                    this.cw[var8] = this.cw[var9];
                                }

                                ++var8;
                            }
                        }

                        this.xv = var8;
                        var8 = 0;

                        for(var10 = 0; var10 < this.ew; ++var10) {
                            var27 = (this.gw[var10] >> 3) - var6;
                            var12 = (this.hw[var10] >> 3) - var7;
                            if (var27 == 0 && var12 == 0) {
                                this.kt.ci(this.fw[var10]);
                                this.fu.yo(this.gw[var10], this.hw[var10], this.iw[var10]);
                            } else {
                                if (var10 != var8) {
                                    this.fw[var8] = this.fw[var10];
                                    this.fw[var8].nh = var8;
                                    this.gw[var8] = this.gw[var10];
                                    this.hw[var8] = this.hw[var10];
                                    this.iw[var8] = this.iw[var10];
                                    this.jw[var8] = this.jw[var10];
                                }

                                ++var8;
                            }
                        }

                        this.ew = var8;
                        var8 = 0;

                        for(var27 = 0; var27 < this.nw; ++var27) {
                            var12 = (this.pw[var27] >> 3) - var6;
                            var13 = (this.qw[var27] >> 3) - var7;
                            if (var12 == 0 && var13 == 0) {
                                this.kt.ci(this.ow[var27]);
                                this.fu.yn(this.pw[var27], this.qw[var27], this.rw[var27], this.sw[var27]);
                            } else {
                                if (var27 != var8) {
                                    this.ow[var8] = this.ow[var27];
                                    this.ow[var8].nh = var8 + 10000;
                                    this.pw[var8] = this.pw[var27];
                                    this.qw[var8] = this.qw[var27];
                                    this.rw[var8] = this.rw[var27];
                                    this.sw[var8] = this.sw[var27];
                                }

                                ++var8;
                            }
                        }

                        this.nw = var8;
                    }

                    return;
                }

                if (var1 == 239) {
                    this.teb = true;
                    return;
                }

                if (var1 == 238) {
                    var20 = Utility.tn(var3, 1);
                    if (this.hv[var20] != null) {
                        this.fz = this.hv[var20].xq;
                    }

                    this.ez = true;
                    this.mz = false;
                    this.nz = false;
                    this.gz = 0;
                    this.jz = 0;
                    return;
                }

                if (var1 == 237) {
                    this.ez = false;
                    return;
                }

                if (var1 == 236) {
                    this.jz = var3[1] & 255;
                    var20 = 2;

                    for(var21 = 0; var21 < this.jz; ++var21) {
                        this.kz[var21] = Utility.tn(var3, var20);
                        var20 += 2;
                        this.lz[var21] = Utility.tn(var3, var20);
                        var20 += 2;
                    }

                    this.mz = false;
                    this.nz = false;
                    return;
                }

                byte var23;
                if (var1 == 235) {
                    var23 = var3[1];
                    if (var23 == 1) {
                        this.mz = true;
                        return;
                    }

                    this.mz = false;
                    return;
                }

                if (var1 != 234) {
                    if (var1 == 233) {
                        this.qz = false;
                        return;
                    }

                    if (var1 == 229) {
                        var23 = var3[1];
                        if (var23 == 1) {
                            this.nz = true;
                            return;
                        }

                        this.nz = false;
                        return;
                    }

                    if (var1 == 228) {
                        System.out.println("Got config");
                        this.zx = Utility.qn(var3[1]) == 1;
                        this.yx = Utility.qn(var3[2]) == 1;
                        this.cab = Utility.qn(var3[3]);
                        this.hy = Utility.qn(var3[4]) == 1;
                        return;
                    }

                    if (var1 == 227) {
                        for(var20 = 0; var20 < var2 - 1; ++var20) {
                            this.wx[var20] = var3[var20 + 1] == 1;
                        }

                        return;
                    }

                    if (var1 == 226) {
                        for(var20 = 0; var20 < this.tx; ++var20) {
                            this.vx[var20] = var3[var20 + 1] == 1;
                        }

                        return;
                    }

                    if (var1 == 225) {
                        this.ccb = 1;
                        return;
                    }

                    if (var1 == 224) {
                        this.qdb = true;

                        for(var20 = 0; var20 < 5; ++var20) {
                            this.zdb[var20] = var20;
                            this.aeb[var20] = "~:" + this.zdb[var20];
                            this.rdb.od(this.wdb[var20], "");
                            this.rdb.od(this.vdb[var20], var20 + 1 + ": " + this.ifb[this.zdb[var20]]);
                        }

                        return;
                    }

                    if (var1 != 223) {
                        return;
                    }

                    this.vw = var3[1] & 255;
                } else {
                    this.qz = true;
                    byte var4 = 1;
                    var20 = var4 + 1;
                    var21 = var3[var4] & 255;
                    byte var22 = var3[var20++];
                    this.rz = var3[var20++] & 255;
                    this.sz = var3[var20++] & 255;

                    for(var7 = 0; var7 < 40; ++var7) {
                        this.tz[var7] = -1;
                    }

                    for(var8 = 0; var8 < var21; ++var8) {
                        this.tz[var8] = Utility.tn(var3, var20);
                        var20 += 2;
                        this.uz[var8] = Utility.tn(var3, var20);
                        var20 += 2;
                        this.vz[var8] = var3[var20++];
                    }

                    if (var22 == 1) {
                        var9 = 39;

                        for(var10 = 0; var10 < this.ww && var9 >= var21; ++var10) {
                            boolean var11 = false;

                            for(var12 = 0; var12 < 40; ++var12) {
                                if (this.tz[var12] == this.xw[var10]) {
                                    var11 = true;
                                    break;
                                }
                            }

                            if (this.xw[var10] == 10) {
                                var11 = true;
                            }

                            if (!var11) {
                                this.tz[var9] = this.xw[var10] & 32767;
                                this.uz[var9] = 0;
                                this.vz[var9] = 0;
                                --var9;
                            }
                        }
                    }

                    if (this.wz >= 0 && this.wz < 40 && this.tz[this.wz] != this.xz) {
                        this.wz = -1;
                        this.xz = -2;
                        return;
                    }
                }
            }

            return;
        } catch (RuntimeException var19) {
            if (this.zs < 3) {
                super.ed.a(17);
                super.ed.i(var19.toString());
                this.sk();
                super.ed.a(17);
                super.ed.i("p-type:" + var1 + " p-size:" + var2);
                this.sk();
                super.ed.a(17);
                super.ed.i("rx:" + this.lv + " ry:" + this.mv + " num3l:" + this.ew);
                this.sk();
                String var5 = "";

                for(var6 = 0; var6 < 80 && var6 < var2; ++var6) {
                    var5 = var5 + var3[var6] + " ";
                }

                super.ed.a(17);
                super.ed.i(var5);
                this.sk();
                ++this.zs;
            }
        }

    }

    public boolean lm(int var1) {
        int var2 = this.kv.ar / 128;
        int var3 = this.kv.br / 128;

        for(int var4 = 2; var4 >= 1; --var4) {
            if (var1 == 1 && ((this.fu.ugb[var2][var3 - var4] & 128) == 128 || (this.fu.ugb[var2 - var4][var3] & 128) == 128 || (this.fu.ugb[var2 - var4][var3 - var4] & 128) == 128)) {
                return false;
            }

            if (var1 == 3 && ((this.fu.ugb[var2][var3 + var4] & 128) == 128 || (this.fu.ugb[var2 - var4][var3] & 128) == 128 || (this.fu.ugb[var2 - var4][var3 + var4] & 128) == 128)) {
                return false;
            }

            if (var1 == 5 && ((this.fu.ugb[var2][var3 + var4] & 128) == 128 || (this.fu.ugb[var2 + var4][var3] & 128) == 128 || (this.fu.ugb[var2 + var4][var3 + var4] & 128) == 128)) {
                return false;
            }

            if (var1 == 7 && ((this.fu.ugb[var2][var3 - var4] & 128) == 128 || (this.fu.ugb[var2 + var4][var3] & 128) == 128 || (this.fu.ugb[var2 + var4][var3 - var4] & 128) == 128)) {
                return false;
            }

            if (var1 == 0 && (this.fu.ugb[var2][var3 - var4] & 128) == 128) {
                return false;
            }

            if (var1 == 2 && (this.fu.ugb[var2 - var4][var3] & 128) == 128) {
                return false;
            }

            if (var1 == 4 && (this.fu.ugb[var2][var3 + var4] & 128) == 128) {
                return false;
            }

            if (var1 == 6 && (this.fu.ugb[var2 + var4][var3] & 128) == 128) {
                return false;
            }
        }

        return true;
    }

    public void sl() {
        if ((this.yu & 1) != 1 || !this.lm(this.yu)) {
            if ((this.yu & 1) == 0 && this.lm(this.yu)) {
                if (this.lm(this.yu + 1 & 7)) {
                    this.yu = this.yu + 1 & 7;
                } else {
                    if (this.lm(this.yu + 7 & 7)) {
                        this.yu = this.yu + 7 & 7;
                    }

                }
            } else {
                int[] var1 = new int[]{1, -1, 2, -2, 3, -3, 4};

                for(int var2 = 0; var2 < 7; ++var2) {
                    if (this.lm(this.yu + var1[var2] + 8 & 7)) {
                        this.yu = this.yu + var1[var2] + 8 & 7;
                        break;
                    }
                }

                if ((this.yu & 1) == 0 && this.lm(this.yu)) {
                    if (this.lm(this.yu + 1 & 7)) {
                        this.yu = this.yu + 1 & 7;
                    } else {
                        if (this.lm(this.yu + 7 & 7)) {
                            this.yu = this.yu + 7 & 7;
                        }

                    }
                }
            }
        }
    }

    public void el() {
        if (this.lab != 0) {
            this.lt.jf();
            this.lt.xg("Oh dear! You are dead...", this.qt / 2, this.rt / 2, 7, 16711680);
            this.gl();
            this.lt.nf(this.jt, 0, 11);
        } else if (this.ccb != 0) {
            this.cm();
        } else if (this.teb) {
            this.qk();
        } else if (this.qdb) {
            this.mk();
        } else if (this.fu.wgb) {
            for(int var1 = 0; var1 < 64; ++var1) {
                this.kt.ci(this.fu.zgb[this.ju][var1]);
                if (this.ju == 0) {
                    this.kt.ci(this.fu.ygb[1][var1]);
                    this.kt.ci(this.fu.zgb[1][var1]);
                    this.kt.ci(this.fu.ygb[2][var1]);
                    this.kt.ci(this.fu.zgb[2][var1]);
                }

                this.vu = true;
                if (this.ju == 0 && (this.fu.ugb[this.kv.ar / 128][this.kv.br / 128] & 128) == 0) {
                    this.kt.yh(this.fu.zgb[this.ju][var1]);
                    if (this.ju == 0) {
                        this.kt.yh(this.fu.ygb[1][var1]);
                        this.kt.yh(this.fu.zgb[1][var1]);
                        this.kt.yh(this.fu.ygb[2][var1]);
                        this.kt.yh(this.fu.zgb[2][var1]);
                    }

                    this.vu = false;
                }
            }

            int var2;
            int var3;
            int var4;
            int var5;
            int var6;
            byte var7;
            String var8;
            int var9;
            GameModel var10;
            if (this.yt != this.au) {
                this.au = this.yt;

                for(var2 = 0; var2 < this.ew; ++var2) {
                    if (this.iw[var2] == 51) {
                        var3 = this.gw[var2];
                        var4 = this.hw[var2];
                        var5 = var3 - this.kv.ar / 128;
                        var6 = var4 - this.kv.br / 128;
                        var7 = 7;
                        if (var3 >= 0 && var4 >= 0 && var3 < 96 && var4 < 96 && var5 > -var7 && var5 < var7 && var6 > -var7 && var6 < var7) {
                            this.kt.ci(this.fw[var2]);
                            var8 = "torcha" + (this.yt + 1);
                            var9 = GameData.mp(var8);
                            var10 = this.kw[var9].ue();
                            this.kt.yh(var10);
                            var10.we(true, 48, 48, -50, -10, -50);
                            var10.de(this.fw[var2]);
                            var10.nh = var2;
                            this.fw[var2] = var10;
                        }
                    }

                    if (this.iw[var2] == 143) {
                        var3 = this.gw[var2];
                        var4 = this.hw[var2];
                        var5 = var3 - this.kv.ar / 128;
                        var6 = var4 - this.kv.br / 128;
                        var7 = 7;
                        if (var3 >= 0 && var4 >= 0 && var3 < 96 && var4 < 96 && var5 > -var7 && var5 < var7 && var6 > -var7 && var6 < var7) {
                            this.kt.ci(this.fw[var2]);
                            var8 = "skulltorcha" + (this.yt + 1);
                            var9 = GameData.mp(var8);
                            var10 = this.kw[var9].ue();
                            this.kt.yh(var10);
                            var10.we(true, 48, 48, -50, -10, -50);
                            var10.de(this.fw[var2]);
                            var10.nh = var2;
                            this.fw[var2] = var10;
                        }
                    }
                }
            }

            if (this.zt != this.bu) {
                this.bu = this.zt;

                for(var2 = 0; var2 < this.ew; ++var2) {
                    if (this.iw[var2] == 97) {
                        var3 = this.gw[var2];
                        var4 = this.hw[var2];
                        var5 = var3 - this.kv.ar / 128;
                        var6 = var4 - this.kv.br / 128;
                        var7 = 9;
                        if (var3 >= 0 && var4 >= 0 && var3 < 96 && var4 < 96 && var5 > -var7 && var5 < var7 && var6 > -var7 && var6 < var7) {
                            this.kt.ci(this.fw[var2]);
                            var8 = "firea" + (this.zt + 1);
                            var9 = GameData.mp(var8);
                            var10 = this.kw[var9].ue();
                            this.kt.yh(var10);
                            var10.we(true, 48, 48, -50, -10, -50);
                            var10.de(this.fw[var2]);
                            var10.nh = var2;
                            this.fw[var2] = var10;
                        }
                    }
                }
            }

            this.kt.oi(this.gv);
            this.gv = 0;

            int var18;
            for(var2 = 0; var2 < this.ev; ++var2) {
                Character var15 = this.iv[var2];
                if (var15.xr != 255) {
                    var4 = var15.ar;
                    var5 = var15.br;
                    var6 = -this.fu.ho(var4, var5);
                    var18 = this.kt.ph(5000 + var2, var4, var6, var5, 145, 220, var2 + 10000);
                    ++this.gv;
                    if (var15 == this.kv) {
                        this.kt.qh(var18);
                    }

                    if (var15.er == 8) {
                        this.kt.si(var18, -30);
                    }

                    if (var15.er == 9) {
                        this.kt.si(var18, 30);
                    }
                }
            }

            Character var17;
            int var19;
            for(var3 = 0; var3 < this.ev; ++var3) {
                Character var16 = this.iv[var3];
                if (var16.cs > 0) {
                    var17 = null;
                    if (var16.bs != -1) {
                        var17 = this.sv[var16.bs];
                    } else if (var16.as != -1) {
                        var17 = this.hv[var16.as];
                    }

                    if (var17 != null) {
                        var6 = var16.ar;
                        var18 = var16.br;
                        var19 = -this.fu.ho(var6, var18) - 110;
                        var9 = var17.ar;
                        int var21 = var17.br;
                        int var11 = -this.fu.ho(var9, var21) - GameData.mjb[var17.cr] / 2;
                        int var12 = (var6 * var16.cs + var9 * (this.vt - var16.cs)) / this.vt;
                        int var13 = (var19 * var16.cs + var11 * (this.vt - var16.cs)) / this.vt;
                        int var14 = (var18 * var16.cs + var21 * (this.vt - var16.cs)) / this.vt;
                        this.kt.ph(this.wt + var16.zr, var12, var13, var14, 32, 32, 0);
                        ++this.gv;
                    }
                }
            }

            for(var4 = 0; var4 < this.qv; ++var4) {
                var17 = this.tv[var4];
                var6 = var17.ar;
                var18 = var17.br;
                var19 = -this.fu.ho(var6, var18);
                var9 = this.kt.ph(20000 + var4, var6, var19, var18, GameData.ljb[var17.cr], GameData.mjb[var17.cr], var4 + 30000);
                ++this.gv;
                if (var17.er == 8) {
                    this.kt.si(var9, -30);
                }

                if (var17.er == 9) {
                    this.kt.si(var9, 30);
                }
            }

            for(var5 = 0; var5 < this.xv; ++var5) {
                var6 = this.zv[var5] * this.ot + 64;
                var18 = this.aw[var5] * this.ot + 64;
                this.kt.ph('鱀' + this.bw[var5], var6, -this.fu.ho(var6, var18) - this.cw[var5], var18, 96, 64, var5 + 20000);
                ++this.gv;
            }

            this.lt.pk = false;
            this.lt.pf();
            this.lt.pk = super.qq;
            if (this.ju == 3) {
                var6 = 40 + (int)(Math.random() * 3.0D);
                var18 = 40 + (int)(Math.random() * 7.0D);
                this.kt.di(true, var6, var18, -50, -10, -50);
            }

            this.heb = 0;
            this.beb = 0;
            this.meb = 0;
            if (this.xx) {
                if (this.yx && !this.vu) {
                    var6 = this.yu;
                    this.sl();
                    if (this.yu != var6) {
                        this.wu = this.kv.ar;
                        this.xu = this.kv.br;
                    }
                }

                this.kt.bm = 3000;
                this.kt.cm = 3000;
                this.kt.dm = 1;
                this.kt.em = 2800;
                this.av = this.yu * 32;
                this.kt.ei(this.wu, -this.fu.ho(this.wu, this.xu), this.xu, 912, this.av * 4, 0, 2000);
            } else {
                if (this.yx && !this.vu) {
                    this.sl();
                }

                if (!super.qq) {
                    this.kt.bm = 2400;
                    this.kt.cm = 2400;
                    this.kt.dm = 1;
                    this.kt.em = 2300;
                } else {
                    this.kt.bm = 2200;
                    this.kt.cm = 2200;
                    this.kt.dm = 1;
                    this.kt.em = 2100;
                }

                this.kt.ei(this.wu, -this.fu.ho(this.wu, this.xu), this.xu, 912, this.av * 4, 0, this.uu * 2);
            }

            this.kt.aj();
            this.ul();
            if (this.cu > 0) {
                this.lt.bh(this.du - 8, this.eu - 8, this.ut + 14 + (24 - this.cu) / 6);
            }

            if (this.cu < 0) {
                this.lt.bh(this.du - 8, this.eu - 8, this.ut + 18 + (24 + this.cu) / 6);
            }

            this.lt.qf("Fps: " + super.vq, 450, this.rt - 10, 1, 16776960);
            if (this.az == 0) {
                for(var6 = 0; var6 < this.bz; ++var6) {
                    if (this.dz[var6] > 0) {
                        String var20 = this.cz[var6];
                        this.lt.qf(var20, 7, this.rt - 18 - var6 * 12, 1, 16776960);
                    }
                }
            }

            this.vy.vd(this.wy);
            this.vy.vd(this.yy);
            this.vy.vd(this.zy);
            if (this.az == 1) {
                this.vy.id(this.wy);
            } else if (this.az == 2) {
                this.vy.id(this.yy);
            } else if (this.az == 3) {
                this.vy.id(this.zy);
            }

            Panel.gg = 2;
            this.vy.hc();
            Panel.gg = 0;
            this.lt.tg(this.lt.qj - 3 - 197, 3, this.ut, 128);
            this.nk();
            this.lt.tk = false;
            this.gl();
            this.lt.nf(this.jt, 0, 11);
        }
    }

    public void gl() {
        this.lt.bh(0, this.rt - 4, this.ut + 23);
        int var1 = Surface.ng(200, 200, 255);
        if (this.az == 0) {
            var1 = Surface.ng(255, 200, 50);
        }

        if (this.ry % 30 > 15) {
            var1 = Surface.ng(255, 50, 50);
        }

        this.lt.xg("All messages", 54, this.rt + 6, 0, var1);
        var1 = Surface.ng(200, 200, 255);
        if (this.az == 1) {
            var1 = Surface.ng(255, 200, 50);
        }

        if (this.sy % 30 > 15) {
            var1 = Surface.ng(255, 50, 50);
        }

        this.lt.xg("Chat history", 155, this.rt + 6, 0, var1);
        var1 = Surface.ng(200, 200, 255);
        if (this.az == 2) {
            var1 = Surface.ng(255, 200, 50);
        }

        if (this.ty % 30 > 15) {
            var1 = Surface.ng(255, 50, 50);
        }

        this.lt.xg("Quest history", 255, this.rt + 6, 0, var1);
        var1 = Surface.ng(200, 200, 255);
        if (this.az == 3) {
            var1 = Surface.ng(255, 200, 50);
        }

        if (this.uy % 30 > 15) {
            var1 = Surface.ng(255, 50, 50);
        }

        this.lt.xg("Private history", 355, this.rt + 6, 0, var1);
    }

    public void xm(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        int var8 = GameData.zhb[var5] + this.yv;
        int var9 = GameData.lib[var5];
        this.lt.zf(var1, var2, var3, var4, var8, var9, 0, 0, false);
    }

    public void cn(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        Character var8 = this.tv[var5];
        int var9 = var8.er + (this.av + 16) / 32 & 7;
        boolean var10 = false;
        int var11 = var9;
        if (var9 == 5) {
            var11 = 3;
            var10 = true;
        } else if (var9 == 6) {
            var11 = 2;
            var10 = true;
        } else if (var9 == 7) {
            var11 = 1;
            var10 = true;
        }

        int var12 = var11 * 3 + this.ffb[var8.dr / GameData.njb[var8.cr] % 4];
        boolean var23;
        if (var8.er == 8) {
            var11 = 5;
            var23 = true;
            var10 = false;
            var1 -= GameData.pjb[var8.cr] * var7 / 100;
            var12 = var11 * 3 + this.gfb[this.dt / (GameData.ojb[var8.cr] - 1) % 8];
        } else if (var8.er == 9) {
            var11 = 5;
            var23 = true;
            var10 = true;
            var1 += GameData.pjb[var8.cr] * var7 / 100;
            var12 = var11 * 3 + this.hfb[this.dt / GameData.ojb[var8.cr] % 8];
        }

        int var14;
        int var15;
        for(int var13 = 0; var13 < 12; ++var13) {
            var14 = this.seb[var11][var13];
            var15 = GameData.gjb[var8.cr][var14];
            if (var15 >= 0) {
                byte var16 = 0;
                byte var17 = 0;
                int var18 = var12;
                if (var10 && var11 >= 1 && var11 <= 3 && GameData.yjb[var15] == 1) {
                    var18 = var12 + 15;
                }

                if (var11 != 5 || GameData.xjb[var15] == 1) {
                    int var19 = var18 + GameData.zjb[var15];
                    int var24 = var16 * var3 / this.lt.hk[var19];
                    int var25 = var17 * var4 / this.lt.ik[var19];
                    int var20 = var3 * this.lt.hk[var19] / this.lt.hk[GameData.zjb[var15]];
                    var24 -= (var20 - var3) / 2;
                    int var21 = GameData.vjb[var15];
                    int var22 = 0;
                    if (var21 == 1) {
                        var21 = GameData.hjb[var8.cr];
                        var22 = GameData.kjb[var8.cr];
                    } else if (var21 == 2) {
                        var21 = GameData.ijb[var8.cr];
                        var22 = GameData.kjb[var8.cr];
                    } else if (var21 == 3) {
                        var21 = GameData.jjb[var8.cr];
                        var22 = GameData.kjb[var8.cr];
                    }

                    this.lt.zf(var1 + var24, var2 + var25, var20, var4, var19, var21, var22, var6, var10);
                }
            }
        }

        if (var8.mr > 0) {
            this.feb[this.beb] = this.lt.hf(var8.lr, 1) / 2;
            this.geb[this.beb] = this.lt.qg(1);
            if (this.feb[this.beb] > 300) {
                this.feb[this.beb] = 300;
                this.geb[this.beb] *= 2;
            }

            this.deb[this.beb] = var1 + var3 / 2;
            this.eeb[this.beb] = var2;
            this.ceb[this.beb++] = var8.lr;
        }

        if (var8.er == 8 || var8.er == 9 || var8.sr != 0) {
            if (var8.sr > 0) {
                var14 = var1;
                if (var8.er == 8) {
                    var14 = var1 - 20 * var7 / 100;
                } else if (var8.er == 9) {
                    var14 = var1 + 20 * var7 / 100;
                }

                var15 = var8.qr * 30 / var8.rr;
                this.neb[this.meb] = var14 + var3 / 2;
                this.oeb[this.meb] = var2;
                this.peb[this.meb++] = var15;
            }

            if (var8.sr > 150) {
                var14 = var1;
                if (var8.er == 8) {
                    var14 = var1 - 10 * var7 / 100;
                } else if (var8.er == 9) {
                    var14 = var1 + 10 * var7 / 100;
                }

                this.lt.bh(var14 + var3 / 2 - 12, var2 + var4 / 2 - 12, this.ut + 12);
                this.lt.xg(String.valueOf(var8.pr), var14 + var3 / 2 - 1, var2 + var4 / 2 + 5, 3, 16777215);
            }
        }

    }

    public void tl(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        Character var8 = this.iv[var5];
        if (var8.xr != 255) {
            int var9 = var8.er + (this.av + 16) / 32 & 7;
            boolean var10 = false;
            int var11 = var9;
            if (var9 == 5) {
                var11 = 3;
                var10 = true;
            } else if (var9 == 6) {
                var11 = 2;
                var10 = true;
            } else if (var9 == 7) {
                var11 = 1;
                var10 = true;
            }

            int var12 = var11 * 3 + this.ffb[var8.dr / 6 % 4];
            if (var8.er == 8) {
                var11 = 5;
                var9 = 2;
                var10 = false;
                var1 -= 5 * var7 / 100;
                var12 = var11 * 3 + this.gfb[this.dt / 5 % 8];
            } else if (var8.er == 9) {
                var11 = 5;
                var9 = 2;
                var10 = true;
                var1 += 5 * var7 / 100;
                var12 = var11 * 3 + this.hfb[this.dt / 6 % 8];
            }

            int var14;
            int var15;
            int var23;
            for(int var13 = 0; var13 < 12; ++var13) {
                var14 = this.seb[var9][var13];
                var15 = var8.kr[var14] - 1;
                if (var15 >= 0) {
                    byte var16 = 0;
                    byte var17 = 0;
                    int var18 = var12;
                    if (var10 && var11 >= 1 && var11 <= 3) {
                        if (GameData.yjb[var15] == 1) {
                            var18 = var12 + 15;
                        } else if (var14 == 4 && var11 == 1) {
                            var16 = -22;
                            var17 = -3;
                            var18 = var11 * 3 + this.ffb[(2 + var8.dr / 6) % 4];
                        } else if (var14 == 4 && var11 == 2) {
                            var16 = 0;
                            var17 = -8;
                            var18 = var11 * 3 + this.ffb[(2 + var8.dr / 6) % 4];
                        } else if (var14 == 4 && var11 == 3) {
                            var16 = 26;
                            var17 = -5;
                            var18 = var11 * 3 + this.ffb[(2 + var8.dr / 6) % 4];
                        } else if (var14 == 3 && var11 == 1) {
                            var16 = 22;
                            var17 = 3;
                            var18 = var11 * 3 + this.ffb[(2 + var8.dr / 6) % 4];
                        } else if (var14 == 3 && var11 == 2) {
                            var16 = 0;
                            var17 = 8;
                            var18 = var11 * 3 + this.ffb[(2 + var8.dr / 6) % 4];
                        } else if (var14 == 3 && var11 == 3) {
                            var16 = -26;
                            var17 = 5;
                            var18 = var11 * 3 + this.ffb[(2 + var8.dr / 6) % 4];
                        }
                    }

                    if (var11 != 5 || GameData.xjb[var15] == 1) {
                        int var19 = var18 + GameData.zjb[var15];
                        var23 = var16 * var3 / this.lt.hk[var19];
                        int var24 = var17 * var4 / this.lt.ik[var19];
                        int var20 = var3 * this.lt.hk[var19] / this.lt.hk[GameData.zjb[var15]];
                        var23 -= (var20 - var3) / 2;
                        int var21 = GameData.vjb[var15];
                        int var22 = this.efb[var8.yr];
                        if (var21 == 1) {
                            var21 = this.dfb[var8.vr];
                        } else if (var21 == 2) {
                            var21 = this.cfb[var8.wr];
                        } else if (var21 == 3) {
                            var21 = this.cfb[var8.xr];
                        }

                        this.lt.zf(var1 + var23, var2 + var24, var20, var4, var19, var21, var22, var6, var10);
                    }
                }
            }

            if (var8.mr > 0) {
                this.feb[this.beb] = this.lt.hf(var8.lr, 1) / 2;
                this.geb[this.beb] = this.lt.qg(1);
                if (this.feb[this.beb] > 300) {
                    this.feb[this.beb] = 300;
                    this.geb[this.beb] *= 2;
                }

                this.deb[this.beb] = var1 + var3 / 2;
                this.eeb[this.beb] = var2;
                this.ceb[this.beb++] = var8.lr;
            }

            if (var8.or > 0) {
                this.ieb[this.heb] = var1 + var3 / 2;
                this.jeb[this.heb] = var2;
                this.keb[this.heb] = var7;
                this.leb[this.heb++] = var8.nr;
            }

            if (var8.er == 8 || var8.er == 9 || var8.sr != 0) {
                if (var8.sr > 0) {
                    var14 = var1;
                    if (var8.er == 8) {
                        var14 = var1 - 20 * var7 / 100;
                    } else if (var8.er == 9) {
                        var14 = var1 + 20 * var7 / 100;
                    }

                    var15 = var8.qr * 30 / var8.rr;
                    this.neb[this.meb] = var14 + var3 / 2;
                    this.oeb[this.meb] = var2;
                    this.peb[this.meb++] = var15;
                }

                if (var8.sr > 150) {
                    var14 = var1;
                    if (var8.er == 8) {
                        var14 = var1 - 10 * var7 / 100;
                    } else if (var8.er == 9) {
                        var14 = var1 + 10 * var7 / 100;
                    }

                    this.lt.bh(var14 + var3 / 2 - 12, var2 + var4 / 2 - 12, this.ut + 11);
                    this.lt.xg(String.valueOf(var8.pr), var14 + var3 / 2 - 1, var2 + var4 / 2 + 5, 3, 16777215);
                }
            }

            if (var8.fs == 1 && var8.or == 0) {
                var14 = var6 + var1 + var3 / 2;
                if (var8.er == 8) {
                    var14 -= 20 * var7 / 100;
                } else if (var8.er == 9) {
                    var14 += 20 * var7 / 100;
                }

                var15 = 16 * var7 / 100;
                var23 = 16 * var7 / 100;
                this.lt.rf(var14 - var15 / 2, var2 - var23 / 2 - 10 * var7 / 100, var15, var23, this.ut + 13);
            }

        }
    }

    public void ul() {
        int var2;
        int var3;
        int var4;
        int var5;
        int var7;
        for(int var1 = 0; var1 < this.beb; ++var1) {
            var2 = this.deb[var1];
            var3 = this.eeb[var1];
            var4 = this.feb[var1];
            var5 = this.geb[var1];
            boolean var6 = true;

            while(var6) {
                var6 = false;

                for(var7 = 0; var7 < var1; ++var7) {
                    if (var3 > this.eeb[var7] - this.geb[var7] && var3 - var5 < this.eeb[var7] && var2 - var4 < this.deb[var7] + this.feb[var7] && var2 + var4 > this.deb[var7] - this.feb[var7]) {
                        var3 = this.eeb[var7] - var5;
                        var6 = true;
                    }
                }
            }

            this.eeb[var1] = var3;
            this.lt.dh(this.ceb[var1], var2, var3, 1, 16776960, 300);
        }

        int var12;
        for(var2 = 0; var2 < this.heb; ++var2) {
            var3 = this.ieb[var2];
            var4 = this.jeb[var2];
            var5 = this.keb[var2];
            var12 = this.leb[var2];
            var7 = 39 * var5 / 100;
            int var8 = 27 * var5 / 100;
            int var9 = var4 - var8;
            this.lt.sg(var3 - var7 / 2, var9, var7, var8, this.ut + 9, 85);
            int var10 = 36 * var5 / 100;
            int var11 = 24 * var5 / 100;
            this.lt.zf(var3 - var10 / 2, var9 + var8 / 2 - var11 / 2, var10, var11, GameData.zhb[var12] + this.yv, GameData.lib[var12], 0, 0, false);
        }

        for(var3 = 0; var3 < this.meb; ++var3) {
            var4 = this.neb[var3];
            var5 = this.oeb[var3];
            var12 = this.peb[var3];
            this.lt.xf(var4 - 15, var5 - 3, var12, 5, 65280, 192);
            this.lt.xf(var4 - 15 + var12, var5 - 3, 30 - var12, 5, 16711680, 192);
        }

    }

    public int ml(int var1) {
        int var2 = 0;

        for(int var3 = 0; var3 < this.ww; ++var3) {
            if (this.xw[var3] == var1) {
                if (GameData.bib[var1] == 1) {
                    ++var2;
                } else {
                    var2 += this.yw[var3];
                }
            }
        }

        return var2;
    }

    public boolean rm(int var1, int var2) {
        if (var1 == 31 && this.zm(197)) {
            return true;
        } else if (var1 == 32 && this.zm(102)) {
            return true;
        } else if (var1 == 33 && this.zm(101)) {
            return true;
        } else if (var1 == 34 && this.zm(103)) {
            return true;
        } else {
            return this.ml(var1) >= var2;
        }
    }

    public boolean zm(int var1) {
        for(int var2 = 0; var2 < this.ww; ++var2) {
            if (this.xw[var2] == var1 && this.zw[var2] == 1) {
                return true;
            }
        }

        return false;
    }

    public void bn(int var1, int var2, int var3) {
        this.lt.og(var1, var2, var3);
        this.lt.og(var1 - 1, var2, var3);
        this.lt.og(var1 + 1, var2, var3);
        this.lt.og(var1, var2 - 1, var3);
        this.lt.og(var1, var2 + 1, var3);
    }

    public void jl(int var1, int var2, int var3, int var4, boolean var5) {
        this.em(var1, var2, var3, var4, var3, var4, false, var5);
    }

    public void om(int var1, int var2, int var3, int var4, boolean var5) {
        if (!this.em(var1, var2, var3, var4, var3, var4, false, var5)) {
            this.em(var1, var2, var3, var4, var3, var4, true, var5);
        }
    }

    public void rk(int var1, int var2, int var3, int var4) {
        int var5;
        int var6;
        if (var3 != 0 && var3 != 4) {
            var6 = GameData.gkb[var4];
            var5 = GameData.hkb[var4];
        } else {
            var5 = GameData.gkb[var4];
            var6 = GameData.hkb[var4];
        }

        if (GameData.ikb[var4] != 2 && GameData.ikb[var4] != 3) {
            this.em(this.lv, this.mv, var1, var2, var1 + var5 - 1, var2 + var6 - 1, true, true);
        } else {
            if (var3 == 0) {
                --var1;
                ++var5;
            }

            if (var3 == 2) {
                ++var6;
            }

            if (var3 == 4) {
                ++var5;
            }

            if (var3 == 6) {
                --var2;
                ++var6;
            }

            this.em(this.lv, this.mv, var1, var2, var1 + var5 - 1, var2 + var6 - 1, false, true);
        }
    }

    public void fl(int var1, int var2, int var3) {
        if (var3 == 0) {
            this.em(this.lv, this.mv, var1, var2 - 1, var1, var2, false, true);
        } else if (var3 == 1) {
            this.em(this.lv, this.mv, var1 - 1, var2, var1, var2, false, true);
        } else {
            this.em(this.lv, this.mv, var1, var2, var1, var2, true, true);
        }
    }

    public boolean em(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
        int var9 = this.fu.ao(var1, var2, var3, var4, var5, var6, this.ht, this.it, var7);
        if (var9 == -1) {
            return false;
        } else {
            --var9;
            var1 = this.ht[var9];
            var2 = this.it[var9];
            --var9;
            if (var8) {
                super.ed.a(215);
            } else {
                super.ed.a(255);
            }

            super.ed.l(var1 + this.ku);
            super.ed.l(var2 + this.lu);

            for(int var10 = var9; var10 >= 0 && var10 > var9 - 25; --var10) {
                super.ed.m(this.ht[var10] - var1);
                super.ed.m(this.it[var10] - var2);
            }

            this.sk();
            this.cu = -24;
            this.du = super.kq;
            this.eu = super.lq;
            return true;
        }
    }

    public boolean wm(int var1, int var2) {
        if (this.lab != 0) {
            this.fu.wgb = false;
            return false;
        } else {
            var1 += this.gu;
            var2 += this.hu;
            if (this.ju == this.mu && var1 > this.nu && var1 < this.pu && var2 > this.ou && var2 < this.qu) {
                this.fu.wgb = true;
                return false;
            } else {
                this.lt.xg("Loading... Please wait", 256, 192, 1, 16777215);
                this.gl();
                this.lt.nf(this.jt, 0, 11);
                int var3 = this.ku;
                int var4 = this.lu;
                int var5 = (var1 + 24) / 48;
                int var6 = (var2 + 24) / 48;
                this.ju = this.mu;
                this.ku = var5 * 48 - 48;
                this.lu = var6 * 48 - 48;
                this.nu = var5 * 48 - 32;
                this.ou = var6 * 48 - 32;
                this.pu = var5 * 48 + 32;
                this.qu = var6 * 48 + 32;
                this.fu.qo(var1, var2, this.ju);
                this.ku -= this.gu;
                this.lu -= this.hu;
                int var7 = this.ku - var3;
                int var8 = this.lu - var4;

                int var10;
                int var11;
                int var12;
                int var14;
                int var15;
                for(int var9 = 0; var9 < this.ew; ++var9) {
                    this.gw[var9] -= var7;
                    this.hw[var9] -= var8;
                    var10 = this.gw[var9];
                    var11 = this.hw[var9];
                    var12 = this.iw[var9];
                    GameModel var13 = this.fw[var9];

                    try {
                        var14 = this.jw[var9];
                        int var16;
                        if (var14 != 0 && var14 != 4) {
                            var16 = GameData.gkb[var12];
                            var15 = GameData.hkb[var12];
                        } else {
                            var15 = GameData.gkb[var12];
                            var16 = GameData.hkb[var12];
                        }

                        int var17 = (var10 + var10 + var15) * this.ot / 2;
                        int var18 = (var11 + var11 + var16) * this.ot / 2;
                        if (var10 >= 0 && var11 >= 0 && var10 < 96 && var11 < 96) {
                            this.kt.yh(var13);
                            var13.ke(var17, -this.fu.ho(var17, var18), var18);
                            this.fu.oo(var10, var11, var12);
                            if (var12 == 74) {
                                var13.ee(0, -480, 0);
                            }
                        }
                    } catch (RuntimeException var20) {
                        System.out.println("Loc Error: " + var20.getMessage());
                        System.out.println("i:" + var9 + " obj:" + var13);
                        var20.printStackTrace();
                    }
                }

                int var21;
                for(var10 = 0; var10 < this.nw; ++var10) {
                    this.pw[var10] -= var7;
                    this.qw[var10] -= var8;
                    var11 = this.pw[var10];
                    var12 = this.qw[var10];
                    var21 = this.sw[var10];
                    var14 = this.rw[var10];

                    try {
                        this.fu.ap(var11, var12, var14, var21);
                        GameModel var24 = this.km(var11, var12, var14, var21, var10);
                        this.ow[var10] = var24;
                    } catch (RuntimeException var19) {
                        System.out.println("Bound Error: " + var19.getMessage());
                        var19.printStackTrace();
                    }
                }

                for(var11 = 0; var11 < this.xv; ++var11) {
                    this.zv[var11] -= var7;
                    this.aw[var11] -= var8;
                }

                for(var12 = 0; var12 < this.ev; ++var12) {
                    Character var22 = this.iv[var12];
                    var22.ar -= var7 * this.ot;
                    var22.br -= var8 * this.ot;

                    for(var14 = 0; var14 <= var22.hr; ++var14) {
                        var22.ir[var14] -= var7 * this.ot;
                        var22.jr[var14] -= var8 * this.ot;
                    }
                }

                for(var21 = 0; var21 < this.qv; ++var21) {
                    Character var23 = this.tv[var21];
                    var23.ar -= var7 * this.ot;
                    var23.br -= var8 * this.ot;

                    for(var15 = 0; var15 <= var23.hr; ++var15) {
                        var23.ir[var15] -= var7 * this.ot;
                        var23.jr[var15] -= var8 * this.ot;
                    }
                }

                this.fu.wgb = true;
                return true;
            }
        }
    }

    public GameModel km(int var1, int var2, int var3, int var4, int var5) {
        int var6 = var1;
        int var8 = var1;
        int var9 = var2;
        int var10 = GameData.rkb[var4];
        int var11 = GameData.skb[var4];
        int var12 = GameData.qkb[var4];
        GameModel var13 = new GameModel(4, 1);
        if (var3 == 0) {
            var8 = var1 + 1;
        }

        if (var3 == 1) {
            var9 = var2 + 1;
        }

        if (var3 == 2) {
            var6 = var1 + 1;
            var9 = var2 + 1;
        }

        if (var3 == 3) {
            var8 = var1 + 1;
            var9 = var2 + 1;
        }

        var6 *= this.ot;
        int var7 = var2 * this.ot;
        var8 *= this.ot;
        var9 *= this.ot;
        int var14 = var13.se(var6, -this.fu.ho(var6, var7), var7);
        int var15 = var13.se(var6, -this.fu.ho(var6, var7) - var12, var7);
        int var16 = var13.se(var8, -this.fu.ho(var8, var9) - var12, var9);
        int var17 = var13.se(var8, -this.fu.ho(var8, var9), var9);
        int[] var18 = new int[]{var14, var15, var16, var17};
        var13.re(4, var18, var10, var11);
        var13.we(false, 60, 24, -50, -10, -50);
        if (var1 >= 0 && var2 >= 0 && var1 < 96 && var2 < 96) {
            this.kt.yh(var13);
        }

        var13.nh = var5 + 10000;
        return var13;
    }

    public void nk() {
        if (this.hab != 0) {
            this.im();
        } else if (this.qz && this.iab == 0) {
            this.wl();
        } else if (this.ez) {
            this.pm();
        } else if (this.fab != 0) {
            this.yl();
        } else if (this.eab != 0) {
            this.ok();
        } else if (this.dab == 1) {
            this.xl();
        } else if (!this.kab && this.jab > 180000 && this.iab == 0) {
            this.gm();
        } else {
            if (this.yz) {
                this.nl();
            }

            if (this.kv.sr > 0) {
                this.dl();
            }

            this.zk();
            boolean var1 = !this.yz && !this.ay;
            if (var1) {
                this.fy = 0;
            }

            if (this.uw == 0 && var1) {
                this.kl();
            }

            if (this.uw == 1) {
                this.am(var1);
            }

            if (this.uw == 2) {
                this.uk(var1);
            }

            if (this.uw == 3) {
                this.vl(var1);
            }

            if (this.uw == 4) {
                this.an(var1);
            }

            if (this.uw == 5) {
                this.tk(var1);
            }

            if (this.uw == 6) {
                this.ym(var1);
            }

            if (!this.ay && !this.yz) {
                this.il();
            }

            if (this.ay && !this.yz) {
                this.tm();
            }
        }

        this.ft = 0;
    }

    public void nl() {
        int var1;
        if (this.ft == 0) {
            for(var1 = 0; var1 < this.zz; ++var1) {
                int var2 = 65535;
                if (super.kq < this.lt.hf(this.aab[var1], 1) && super.lq > var1 * 12 && super.lq < 12 + var1 * 12) {
                    var2 = 16711680;
                }

                this.lt.qf(this.aab[var1], 6, 12 + var1 * 12, 1, var2);
            }

        } else {
            for(var1 = 0; var1 < this.zz; ++var1) {
                if (super.kq < this.lt.hf(this.aab[var1], 1) && super.lq > var1 * 12 && super.lq < 12 + var1 * 12) {
                    super.ed.a(237);
                    super.ed.m(var1);
                    this.sk();
                    break;
                }
            }

            this.ft = 0;
            this.yz = false;
        }
    }

    public void dl() {
        byte var1 = 7;
        byte var2 = 15;
        short var3 = 175;
        int var4;
        if (this.ft != 0) {
            for(var4 = 0; var4 < 5; ++var4) {
                if (var4 > 0 && super.kq > var1 && super.kq < var1 + var3 && super.lq > var2 + var4 * 20 && super.lq < var2 + var4 * 20 + 20) {
                    this.bab = var4 - 1;
                    this.ft = 0;
                    super.ed.a(231);
                    super.ed.m(this.bab);
                    this.sk();
                    break;
                }
            }
        }

        for(var4 = 0; var4 < 5; ++var4) {
            if (var4 == this.bab + 1) {
                this.lt.xf(var1, var2 + var4 * 20, var3, 20, Surface.ng(255, 0, 0), 128);
            } else {
                this.lt.xf(var1, var2 + var4 * 20, var3, 20, Surface.ng(190, 190, 190), 128);
            }

            this.lt.ug(var1, var2 + var4 * 20, var3, 0);
            this.lt.ug(var1, var2 + var4 * 20 + 20, var3, 0);
        }

        this.lt.xg("Select combat style", var1 + var3 / 2, var2 + 16, 3, 16777215);
        this.lt.xg("Controlled (+1 of each)", var1 + var3 / 2, var2 + 36, 3, 0);
        this.lt.xg("Aggressive (+3 strength)", var1 + var3 / 2, var2 + 56, 3, 0);
        this.lt.xg("Accurate   (+3 attack)", var1 + var3 / 2, var2 + 76, 3, 0);
        this.lt.xg("Defensive  (+3 defense)", var1 + var3 / 2, var2 + 96, 3, 0);
    }

    public void gm() {
        if (this.ft != 0) {
            this.ft = 0;
            if (super.kq > 200 && super.kq < 300 && super.lq > 230 && super.lq < 253) {
                this.kab = true;
                return;
            }
        }

        byte var1 = 90;
        this.lt.bg(106, 70, 300, 190, 0);
        this.lt.uf(106, 70, 300, 190, 16777215);
        this.lt.xg("You have been playing for", 256, var1, 4, 16777215);
        int var3 = var1 + 20;
        this.lt.xg("over 1 hour. Please consider", 256, var3, 4, 16777215);
        var3 += 20;
        this.lt.xg("visiting our advertiser if you", 256, var3, 4, 16777215);
        var3 += 20;
        this.lt.xg("see an advert which interests you.", 256, var3, 4, 16777215);
        var3 += 40;
        this.lt.xg("Doing so will help ensure", 256, var3, 4, 16777215);
        var3 += 20;
        this.lt.xg("Runescape remains free.", 256, var3, 4, 16777215);
        var3 += 40;
        int var2 = 16777215;
        if (super.kq > 200 && super.kq < 300 && super.lq > var3 - 20 && super.lq < var3 + 3) {
            var2 = 16776960;
        }

        this.lt.xg("Close", 256, var3, 4, var2);
    }

    public void xl() {
        short var1;
        if (this.ft != 0) {
            this.ft = 0;
            var1 = 250;
            if (super.kq < 56 || super.lq < 70 || super.kq > 456 || super.lq > 260) {
                this.dab = 0;
                return;
            }

            if (super.kq > 250 && super.kq < 350 && super.lq > var1 - 20 && super.lq < var1 + 3) {
                this.dab = 0;
                return;
            }

            if (super.kq > 150 && super.kq < 250 && super.lq > var1 - 20 && super.lq < var1 + 3) {
                this.zx = !this.zx;
                super.ed.a(213);
                super.ed.m(1);
                super.ed.m(this.zx ? 1 : 0);
                super.ed.d();
                this.dab = 0;
                return;
            }
        }

        this.lt.bg(56, 70, 400, 190, 0);
        this.lt.uf(56, 70, 400, 190, 16777215);
        int var3 = 90;
        if (!this.zx) {
            this.lt.xg("Are you sure you want to change", 256, var3, 4, 16777215);
            var3 += 20;
            this.lt.xg("to being able to fight other players?", 256, var3, 4, 16777215);
            var3 += 40;
            this.lt.xg("If you do other players will be able to", 256, var3, 4, 16777215);
            var3 += 20;
            this.lt.xg("attack you, and you will probably die", 256, var3, 4, 16777215);
            var3 += 20;
            this.lt.xg("much more often.", 256, var3, 4, 16777215);
            var3 += 40;
        }

        if (this.zx) {
            this.lt.xg("Are you sure you want to change", 256, var3, 4, 16777215);
            var3 += 20;
            this.lt.xg("to not fighting other players?", 256, var3, 4, 16777215);
            var3 += 40;
            this.lt.xg("This will make you safe from attack,", 256, var3, 4, 16777215);
            var3 += 20;
            this.lt.xg("but will also preventing you from attacking", 256, var3, 4, 16777215);
            var3 += 20;
            this.lt.xg("others (except in the arena - coming soon)", 256, var3, 4, 16777215);
            var3 += 40;
        }

        if (this.cab == 2) {
            this.lt.xg("You can only change a total of 2 times", 256, var3, 4, 16777215);
            var3 += 20;
        }

        if (this.cab == 1) {
            this.lt.xg("You will not be allowed to change back again", 256, var3, 4, 16777215);
            var3 += 20;
        }

        var1 = 250;
        int var2 = 16777215;
        if (super.kq > 150 && super.kq < 250 && super.lq > var1 - 20 && super.lq < var1 + 3) {
            var2 = 16776960;
        }

        this.lt.xg("Yes I'm sure", 200, var1, 4, var2);
        var2 = 16777215;
        if (super.kq > 250 && super.kq < 350 && super.lq > var1 - 20 && super.lq < var1 + 3) {
            var2 = 16776960;
        }

        this.lt.xg("No thanks", 300, var1, 4, var2);
    }

    public void im() {
        this.lt.bg(126, 137, 260, 60, 0);
        this.lt.uf(126, 137, 260, 60, 16777215);
        this.lt.xg("Logging out...", 256, 173, 5, 16777215);
    }

    public void yl() {
        if (this.ft != 0) {
            this.ft = 0;
            if (super.kq < 106 || super.lq < 150 || super.kq > 406 || super.lq > 210) {
                this.fab = 0;
                return;
            }
        }

        short var1 = 150;
        this.lt.bg(106, var1, 300, 60, 0);
        this.lt.uf(106, var1, 300, 60, 16777215);
        int var4 = var1 + 22;
        String var2;
        int var3;
        if (this.fab == 1) {
            this.lt.xg("Please enter your new password", 256, var4, 4, 16777215);
            var4 += 25;
            var2 = "*";

            for(var3 = 0; var3 < super.rq.length(); ++var3) {
                var2 = "X" + var2;
            }

            this.lt.xg(var2, 256, var4, 4, 16777215);
            if (super.sq.length() > 0) {
                this.gab = super.sq;
                super.rq = "";
                super.sq = "";
                if (this.gab.length() >= 5) {
                    this.fab = 2;
                    return;
                }

                this.fab = 5;
                return;
            }
        } else if (this.fab == 2) {
            this.lt.xg("Enter password again to confirm", 256, var4, 4, 16777215);
            var4 += 25;
            var2 = "*";

            for(var3 = 0; var3 < super.rq.length(); ++var3) {
                var2 = "X" + var2;
            }

            this.lt.xg(var2, 256, var4, 4, 16777215);
            if (super.sq.length() > 0) {
                if (super.sq.equalsIgnoreCase(this.gab)) {
                    this.fab = 4;
                    this.cb(this.gab);
                    return;
                }

                this.fab = 3;
                return;
            }
        } else {
            if (this.fab == 3) {
                this.lt.xg("Passwords do not match!", 256, var4, 4, 16777215);
                var4 += 25;
                this.lt.xg("Press any key to close", 256, var4, 4, 16777215);
                return;
            }

            if (this.fab == 4) {
                this.lt.xg("Ok, your request has been sent", 256, var4, 4, 16777215);
                var4 += 25;
                this.lt.xg("Press any key to close", 256, var4, 4, 16777215);
                return;
            }

            if (this.fab == 5) {
                this.lt.xg("Password must be at", 256, var4, 4, 16777215);
                var4 += 25;
                this.lt.xg("least 5 letters long", 256, var4, 4, 16777215);
            }
        }

    }

    public void ok() {
        if (this.ft != 0) {
            label118: {
                this.ft = 0;
                if (this.eab != 1 || super.kq >= 106 && super.lq >= 145 && super.kq <= 406 && super.lq <= 215) {
                    if (this.eab == 2 && (super.kq < 6 || super.lq < 145 || super.kq > 506 || super.lq > 215)) {
                        this.eab = 0;
                        return;
                    }

                    if (this.eab != 3 || super.kq >= 106 && super.lq >= 145 && super.kq <= 406 && super.lq <= 215) {
                        if (super.kq > 236 && super.kq < 276 && super.lq > 193 && super.lq < 213) {
                            this.eab = 0;
                            return;
                        }
                        break label118;
                    }

                    this.eab = 0;
                    return;
                }

                this.eab = 0;
                return;
            }
        }

        int var1 = 145;
        String var2;
        if (this.eab == 1) {
            this.lt.bg(106, var1, 300, 70, 0);
            this.lt.uf(106, var1, 300, 70, 16777215);
            var1 += 20;
            this.lt.xg("Enter name to add to friends list", 256, var1, 4, 16777215);
            var1 += 20;
            this.lt.xg(super.rq + "*", 256, var1, 4, 16777215);
            if (super.sq.length() > 0) {
                var2 = super.sq.trim();
                super.rq = "";
                super.sq = "";
                this.eab = 0;
                if (var2.length() > 0 && Utility.on(var2) != this.kv.wq) {
                    this.ib(var2);
                }
            }
        }

        if (this.eab == 2) {
            this.lt.bg(6, var1, 500, 70, 0);
            this.lt.uf(6, var1, 500, 70, 16777215);
            var1 += 20;
            this.lt.xg("Enter message to send to " + Utility.rn(this.px), 256, var1, 4, 16777215);
            var1 += 20;
            this.lt.xg(super.tq + "*", 256, var1, 4, 16777215);
            if (super.uq.length() > 0) {
                var2 = super.uq;
                super.tq = "";
                super.uq = "";
                this.eab = 0;
                this.u(this.px, var2);
            }
        }

        if (this.eab == 3) {
            this.lt.bg(106, var1, 300, 70, 0);
            this.lt.uf(106, var1, 300, 70, 16777215);
            var1 += 20;
            this.lt.xg("Enter name to add to ignore list", 256, var1, 4, 16777215);
            var1 += 20;
            this.lt.xg(super.rq + "*", 256, var1, 4, 16777215);
            if (super.sq.length() > 0) {
                var2 = super.sq.trim();
                super.rq = "";
                super.sq = "";
                this.eab = 0;
                if (var2.length() > 0 && Utility.on(var2) != this.kv.wq) {
                    this.nb(var2);
                }
            }
        }

        int var3 = 16777215;
        if (super.kq > 236 && super.kq < 276 && super.lq > 193 && super.lq < 213) {
            var3 = 16776960;
        }

        this.lt.xg("Cancel", 256, 208, 1, var3);
    }

    public void wl() {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        if (this.ft != 0) {
            this.ft = 0;
            int var1 = super.kq - 52;
            int var2 = super.lq - 44;
            if (var1 < 0 || var2 < 12 || var1 >= 408 || var2 >= 246) {
                super.ed.a(218);
                this.sk();
                this.qz = false;
                return;
            }

            var3 = 0;

            for(var4 = 0; var4 < 5; ++var4) {
                for(var5 = 0; var5 < 8; ++var5) {
                    var6 = 7 + var5 * 49;
                    var7 = 28 + var4 * 34;
                    if (var1 > var6 && var1 < var6 + 49 && var2 > var7 && var2 < var7 + 34 && this.tz[var3] != -1) {
                        this.wz = var3;
                        this.xz = this.tz[var3];
                    }

                    ++var3;
                }
            }

            if (this.wz >= 0) {
                var5 = this.tz[this.wz];
                if (var5 != -1) {
                    if (this.uz[this.wz] > 0 && var1 > 298 && var2 >= 204 && var1 < 408 && var2 <= 215) {
                        var6 = this.sz + this.vz[this.wz];
                        if (var6 < 10) {
                            var6 = 10;
                        }

                        var7 = var6 * GameData.aib[var5] / 100;
                        super.ed.a(217);
                        super.ed.l(this.tz[this.wz]);
                        super.ed.l(var7);
                        this.sk();
                    }

                    if (this.ml(var5) > 0 && var1 > 2 && var2 >= 229 && var1 < 112 && var2 <= 240) {
                        var6 = this.rz + this.vz[this.wz];
                        if (var6 < 10) {
                            var6 = 10;
                        }

                        var7 = var6 * GameData.aib[var5] / 100;
                        super.ed.a(216);
                        super.ed.l(this.tz[this.wz]);
                        super.ed.l(var7);
                        this.sk();
                    }
                }
            }
        }

        byte var11 = 52;
        byte var12 = 44;
        this.lt.bg(var11, var12, 408, 12, 192);
        var3 = 10000536;
        this.lt.xf(var11, var12 + 12, 408, 17, var3, 160);
        this.lt.xf(var11, var12 + 29, 8, 170, var3, 160);
        this.lt.xf(var11 + 399, var12 + 29, 9, 170, var3, 160);
        this.lt.xf(var11, var12 + 199, 408, 47, var3, 160);
        this.lt.qf("Buying and selling items", var11 + 1, var12 + 10, 1, 16777215);
        var4 = 16777215;
        if (super.kq > var11 + 320 && super.lq >= var12 && super.kq < var11 + 408 && super.lq < var12 + 12) {
            var4 = 16711680;
        }

        this.lt.ch("Close window", var11 + 406, var12 + 10, 1, var4);
        this.lt.qf("Shops stock in green", var11 + 2, var12 + 24, 1, 65280);
        this.lt.qf("Number you own in blue", var11 + 135, var12 + 24, 1, 65535);
        this.lt.qf("Your money: " + this.ml(10) + "gp", var11 + 280, var12 + 24, 1, 16776960);
        var5 = 13684944;
        var6 = 0;

        int var8;
        int var9;
        int var10;
        for(var7 = 0; var7 < 5; ++var7) {
            for(var8 = 0; var8 < 8; ++var8) {
                var9 = var11 + 7 + var8 * 49;
                var10 = var12 + 28 + var7 * 34;
                if (this.wz == var6) {
                    this.lt.xf(var9, var10, 49, 34, 16711680, 160);
                } else {
                    this.lt.xf(var9, var10, 49, 34, var5, 160);
                }

                this.lt.uf(var9, var10, 50, 35, 0);
                if (this.tz[var6] != -1) {
                    this.lt.zf(var9, var10, 48, 32, this.yv + GameData.zhb[this.tz[var6]], GameData.lib[this.tz[var6]], 0, 0, false);
                    this.lt.qf(String.valueOf(this.uz[var6]), var9 + 1, var10 + 10, 1, 65280);
                    this.lt.ch(String.valueOf(this.ml(this.tz[var6])), var9 + 47, var10 + 10, 1, 65535);
                }

                ++var6;
            }
        }

        this.lt.ug(var11 + 5, var12 + 222, 398, 0);
        if (this.wz == -1) {
            this.lt.xg("Select an object to buy or sell", var11 + 204, var12 + 214, 3, 16776960);
        } else {
            var8 = this.tz[this.wz];
            if (var8 != -1) {
                if (this.uz[this.wz] > 0) {
                    var9 = this.sz + this.vz[this.wz];
                    if (var9 < 10) {
                        var9 = 10;
                    }

                    var10 = var9 * GameData.aib[var8] / 100;
                    this.lt.qf("Buy a new " + GameData.vhb[var8][0] + " for " + var10 + "gp", var11 + 2, var12 + 214, 1, 16776960);
                    var4 = 16777215;
                    if (super.kq > var11 + 298 && super.lq >= var12 + 204 && super.kq < var11 + 408 && super.lq <= var12 + 215) {
                        var4 = 16711680;
                    }

                    this.lt.ch("Click here to buy", var11 + 405, var12 + 214, 3, var4);
                } else {
                    this.lt.xg("This item is not currently available to buy", var11 + 204, var12 + 214, 3, 16776960);
                }

                if (this.ml(var8) > 0) {
                    var9 = this.rz + this.vz[this.wz];
                    if (var9 < 10) {
                        var9 = 10;
                    }

                    var10 = var9 * GameData.aib[var8] / 100;
                    this.lt.ch("Sell your " + GameData.vhb[var8][0] + " for " + var10 + "gp", var11 + 405, var12 + 239, 1, 16776960);
                    var4 = 16777215;
                    if (super.kq > var11 + 2 && super.lq >= var12 + 229 && super.kq < var11 + 112 && super.lq <= var12 + 240) {
                        var4 = 16711680;
                    }

                    this.lt.qf("Click here to sell", var11 + 2, var12 + 239, 3, var4);
                    return;
                }

                this.lt.xg("You do not have any of this item to sell", var11 + 204, var12 + 239, 3, 16776960);
            }

        }
    }

    public void pm() {
        if (this.ft != 0 && this.pz == 0) {
            this.pz = 1;
        }

        int var3;
        int var5;
        int var6;
        int var7;
        int var8;
        int var16;
        if (this.pz > 0) {
            int var1 = super.kq - 22;
            int var2 = super.lq - 36;
            if (var1 >= 0 && var2 >= 0 && var1 < 468 && var2 < 262) {
                if (var1 > 216 && var2 > 30 && var1 < 462 && var2 < 235) {
                    var3 = (var1 - 217) / 49 + (var2 - 31) / 34 * 5;
                    if (var3 >= 0 && var3 < this.ww) {
                        boolean var4 = false;
                        var5 = 0;
                        var6 = this.xw[var3];

                        for(var7 = 0; var7 < this.gz; ++var7) {
                            if (this.hz[var7] == var6) {
                                if (GameData.bib[var6] == 0) {
                                    for(var8 = 0; var8 < this.pz; ++var8) {
                                        if (this.iz[var7] < this.yw[var3]) {
                                            ++this.iz[var7];
                                        }

                                        var4 = true;
                                    }
                                } else {
                                    ++var5;
                                }
                            }
                        }

                        if (this.ml(var6) <= var5) {
                            var4 = true;
                        }

                        if (!var4 && this.gz < 12) {
                            this.hz[this.gz] = var6;
                            this.iz[this.gz] = 1;
                            ++this.gz;
                            var4 = true;
                        }

                        if (var4) {
                            super.ed.a(234);
                            super.ed.m(this.gz);

                            for(var8 = 0; var8 < this.gz; ++var8) {
                                super.ed.l(this.hz[var8]);
                                super.ed.l(this.iz[var8]);
                            }

                            this.sk();
                            this.mz = false;
                            this.nz = false;
                        }
                    }
                }

                if (var1 > 8 && var2 > 30 && var1 < 205 && var2 < 133) {
                    var3 = (var1 - 9) / 49 + (var2 - 31) / 34 * 4;
                    if (var3 >= 0 && var3 < this.gz) {
                        var16 = this.hz[var3];

                        for(var5 = 0; var5 < this.pz; ++var5) {
                            if (GameData.bib[var16] != 0 || this.iz[var3] <= 1) {
                                --this.gz;
                                this.oz = 0;

                                for(var6 = var3; var6 < this.gz; ++var6) {
                                    this.hz[var6] = this.hz[var6 + 1];
                                    this.iz[var6] = this.iz[var6 + 1];
                                }
                                break;
                            }

                            --this.iz[var3];
                        }

                        super.ed.a(234);
                        super.ed.m(this.gz);

                        for(var6 = 0; var6 < this.gz; ++var6) {
                            super.ed.l(this.hz[var6]);
                            super.ed.l(this.iz[var6]);
                        }

                        this.sk();
                        this.mz = false;
                        this.nz = false;
                    }
                }

                if (var1 > 143 && var2 > 141 && var1 < 154 && var2 < 152) {
                    this.nz = !this.nz;
                    super.ed.a(232);
                    super.ed.m(this.nz ? 1 : 0);
                    this.sk();
                }

                if (var1 > 413 && var2 > 237 && var1 < 462 && var2 < 258) {
                    this.ez = false;
                    super.ed.a(233);
                    this.sk();
                }
            } else if (this.ft != 0) {
                this.ez = false;
                super.ed.a(233);
                this.sk();
            }

            this.ft = 0;
            this.pz = 0;
        }

        if (this.ez) {
            byte var14 = 22;
            byte var15 = 36;
            this.lt.bg(var14, var15, 468, 12, 192);
            var3 = 10000536;
            this.lt.xf(var14, var15 + 12, 468, 18, var3, 160);
            this.lt.xf(var14, var15 + 30, 8, 248, var3, 160);
            this.lt.xf(var14 + 205, var15 + 30, 11, 248, var3, 160);
            this.lt.xf(var14 + 462, var15 + 30, 6, 248, var3, 160);
            this.lt.xf(var14 + 8, var15 + 133, 197, 22, var3, 160);
            this.lt.xf(var14 + 8, var15 + 258, 197, 20, var3, 160);
            this.lt.xf(var14 + 216, var15 + 235, 246, 43, var3, 160);
            var16 = 13684944;
            this.lt.xf(var14 + 8, var15 + 30, 197, 103, var16, 160);
            this.lt.xf(var14 + 8, var15 + 155, 197, 103, var16, 160);
            this.lt.xf(var14 + 216, var15 + 30, 246, 205, var16, 160);

            for(var5 = 0; var5 < 4; ++var5) {
                this.lt.ug(var14 + 8, var15 + 30 + var5 * 34, 197, 0);
            }

            for(var6 = 0; var6 < 4; ++var6) {
                this.lt.ug(var14 + 8, var15 + 155 + var6 * 34, 197, 0);
            }

            for(var7 = 0; var7 < 7; ++var7) {
                this.lt.ug(var14 + 216, var15 + 30 + var7 * 34, 246, 0);
            }

            for(var8 = 0; var8 < 6; ++var8) {
                if (var8 < 5) {
                    this.lt.zg(var14 + 8 + var8 * 49, var15 + 30, 103, 0);
                }

                if (var8 < 5) {
                    this.lt.zg(var14 + 8 + var8 * 49, var15 + 155, 103, 0);
                }

                this.lt.zg(var14 + 216 + var8 * 49, var15 + 30, 205, 0);
            }

            this.lt.qf("Trading with: " + this.fz, var14 + 1, var15 + 10, 1, 16777215);
            this.lt.qf("Your Offer", var14 + 9, var15 + 27, 4, 16777215);
            this.lt.qf("Opponent's Offer", var14 + 9, var15 + 152, 4, 16777215);
            this.lt.qf("Your Inventory", var14 + 216, var15 + 27, 4, 16777215);
            this.lt.ch("Accepted", var14 + 204, var15 + 27, 4, 65280);
            this.lt.uf(var14 + 125, var15 + 16, 11, 11, 65280);
            if (this.mz) {
                this.lt.bg(var14 + 127, var15 + 18, 7, 7, 65280);
            }

            this.lt.ch("Accept", var14 + 204, var15 + 152, 4, 65280);
            this.lt.uf(var14 + 143, var15 + 141, 11, 11, 65280);
            if (this.nz) {
                this.lt.bg(var14 + 145, var15 + 143, 7, 7, 65280);
            }

            this.lt.ch("Close", var14 + 408 + 49, var15 + 251, 4, 12582912);
            this.lt.uf(var14 + 364 + 49, var15 + 237, 49, 21, 12582912);

            int var10;
            int var11;
            for(int var9 = 0; var9 < this.ww; ++var9) {
                var10 = 217 + var14 + var9 % 5 * 49;
                var11 = 31 + var15 + var9 / 5 * 34;
                this.lt.zf(var10, var11, 48, 32, this.yv + GameData.zhb[this.xw[var9]], GameData.lib[this.xw[var9]], 0, 0, false);
                if (GameData.bib[this.xw[var9]] == 0) {
                    this.lt.qf(String.valueOf(this.yw[var9]), var10 + 1, var11 + 10, 1, 16776960);
                }
            }

            int var12;
            for(var10 = 0; var10 < this.gz; ++var10) {
                var11 = 9 + var14 + var10 % 4 * 49;
                var12 = 31 + var15 + var10 / 4 * 34;
                this.lt.zf(var11, var12, 48, 32, this.yv + GameData.zhb[this.hz[var10]], GameData.lib[this.hz[var10]], 0, 0, false);
                if (GameData.bib[this.hz[var10]] == 0) {
                    this.lt.qf(String.valueOf(this.iz[var10]), var11 + 1, var12 + 10, 1, 16776960);
                }

                if (super.kq > var11 && super.kq < var11 + 48 && super.lq > var12 && super.lq < var12 + 32) {
                    this.lt.qf(GameData.vhb[this.hz[var10]][0] + ": @whi@" + GameData.whb[this.hz[var10]], var14 + 8, var15 + 273, 1, 16776960);
                }
            }

            for(var11 = 0; var11 < this.jz; ++var11) {
                var12 = 9 + var14 + var11 % 4 * 49;
                int var13 = 156 + var15 + var11 / 4 * 34;
                this.lt.zf(var12, var13, 48, 32, this.yv + GameData.zhb[this.kz[var11]], GameData.lib[this.kz[var11]], 0, 0, false);
                if (GameData.bib[this.kz[var11]] == 0) {
                    this.lt.qf(String.valueOf(this.lz[var11]), var12 + 1, var13 + 10, 1, 16776960);
                }

                if (super.kq > var12 && super.kq < var12 + 48 && super.lq > var13 && super.lq < var13 + 32) {
                    this.lt.qf(GameData.vhb[this.kz[var11]][0] + ": @whi@" + GameData.whb[this.kz[var11]], var14 + 8, var15 + 273, 1, 16776960);
                }
            }

        }
    }

    public void zk() {
        if (this.uw == 0 && super.kq >= this.lt.qj - 35 && super.lq >= 3 && super.kq < this.lt.qj - 3 && super.lq < 35) {
            this.uw = 1;
        }

        if (this.uw == 0 && super.kq >= this.lt.qj - 35 - 33 && super.lq >= 3 && super.kq < this.lt.qj - 3 - 33 && super.lq < 35) {
            this.uw = 2;
        }

        if (this.uw == 0 && super.kq >= this.lt.qj - 35 - 66 && super.lq >= 3 && super.kq < this.lt.qj - 3 - 66 && super.lq < 35) {
            this.uw = 3;
        }

        if (this.uw == 0 && super.kq >= this.lt.qj - 35 - 99 && super.lq >= 3 && super.kq < this.lt.qj - 3 - 99 && super.lq < 35) {
            this.uw = 4;
        }

        if (this.uw == 0 && super.kq >= this.lt.qj - 35 - 132 && super.lq >= 3 && super.kq < this.lt.qj - 3 - 132 && super.lq < 35) {
            this.uw = 5;
        }

        if (this.uw == 0 && super.kq >= this.lt.qj - 35 - 165 && super.lq >= 3 && super.kq < this.lt.qj - 3 - 165 && super.lq < 35) {
            this.uw = 6;
        }

        if (this.uw != 0 && super.kq >= this.lt.qj - 35 && super.lq >= 3 && super.kq < this.lt.qj - 3 && super.lq < 26) {
            this.uw = 1;
        }

        if (this.uw != 0 && super.kq >= this.lt.qj - 35 - 33 && super.lq >= 3 && super.kq < this.lt.qj - 3 - 33 && super.lq < 26) {
            this.uw = 2;
        }

        if (this.uw != 0 && super.kq >= this.lt.qj - 35 - 66 && super.lq >= 3 && super.kq < this.lt.qj - 3 - 66 && super.lq < 26) {
            this.uw = 3;
        }

        if (this.uw != 0 && super.kq >= this.lt.qj - 35 - 99 && super.lq >= 3 && super.kq < this.lt.qj - 3 - 99 && super.lq < 26) {
            this.uw = 4;
        }

        if (this.uw != 0 && super.kq >= this.lt.qj - 35 - 132 && super.lq >= 3 && super.kq < this.lt.qj - 3 - 132 && super.lq < 26) {
            this.uw = 5;
        }

        if (this.uw != 0 && super.kq >= this.lt.qj - 35 - 165 && super.lq >= 3 && super.kq < this.lt.qj - 3 - 165 && super.lq < 26) {
            this.uw = 6;
        }

        if (this.uw == 1 && (super.kq < this.lt.qj - 248 || super.lq > 36 + this.vw / 5 * 34)) {
            this.uw = 0;
        }

        if (this.uw >= 2 && this.uw <= 5 && (super.kq < this.lt.qj - 199 || super.lq > 240)) {
            this.uw = 0;
        }

        if (this.uw == 6 && (super.kq < this.lt.qj - 199 || super.lq > 267)) {
            this.uw = 0;
        }

    }

    public void am(boolean var1) {
        int var2 = this.lt.qj - 248;
        this.lt.bh(var2, 3, this.ut + 1);

        int var4;
        int var5;
        for(int var3 = 0; var3 < this.vw; ++var3) {
            var4 = var2 + var3 % 5 * 49;
            var5 = 36 + var3 / 5 * 34;
            if (var3 < this.ww && this.zw[var3] == 1) {
                this.lt.xf(var4, var5, 49, 34, 16711680, 128);
            } else {
                this.lt.xf(var4, var5, 49, 34, Surface.ng(181, 181, 181), 128);
            }

            if (var3 < this.ww) {
                this.lt.zf(var4, var5, 48, 32, this.yv + GameData.zhb[this.xw[var3]], GameData.lib[this.xw[var3]], 0, 0, false);
                if (GameData.bib[this.xw[var3]] == 0) {
                    this.lt.qf(String.valueOf(this.yw[var3]), var4 + 1, var5 + 10, 1, 16776960);
                }
            }
        }

        for(var4 = 1; var4 <= 4; ++var4) {
            this.lt.zg(var2 + var4 * 49, 36, this.vw / 5 * 34, 0);
        }

        for(var5 = 1; var5 <= this.vw / 5 - 1; ++var5) {
            this.lt.ug(var2, 36 + var5 * 34, 245, 0);
        }

        if (var1) {
            var2 = super.kq - (this.lt.qj - 248);
            int var6 = super.lq - 36;
            if (var2 >= 0 && var6 >= 0 && var2 < 248 && var6 < this.vw / 5 * 34) {
                int var7 = var2 / 49 + var6 / 34 * 5;
                if (var7 < this.ww) {
                    int var8 = this.xw[var7];
                    if (this.lx >= 0) {
                        if (GameData.vlb[this.lx] == 3) {
                            this.jy[this.fy] = "Cast " + GameData.rlb[this.lx] + " on";
                            this.iy[this.fy] = "@lre@" + GameData.vhb[var8][0];
                            this.ky[this.fy] = 600;
                            this.ny[this.fy] = var7;
                            this.oy[this.fy] = this.lx;
                            ++this.fy;
                            return;
                        }
                    } else {
                        if (this.ax >= 0) {
                            this.jy[this.fy] = "Use " + this.bx + " with";
                            this.iy[this.fy] = "@lre@" + GameData.vhb[var8][0];
                            this.ky[this.fy] = 610;
                            this.ny[this.fy] = var7;
                            this.oy[this.fy] = this.ax;
                            ++this.fy;
                            return;
                        }

                        if (this.zw[var7] == 1) {
                            this.jy[this.fy] = "Remove";
                            this.iy[this.fy] = "@lre@" + GameData.vhb[var8][0];
                            this.ky[this.fy] = 620;
                            this.ny[this.fy] = var7;
                            ++this.fy;
                        } else if (GameData.jib[var8] != 0) {
                            if ((GameData.jib[var8] & 24) != 0) {
                                this.jy[this.fy] = "Wield";
                            } else {
                                this.jy[this.fy] = "Wear";
                            }

                            this.iy[this.fy] = "@lre@" + GameData.vhb[var8][0];
                            this.ky[this.fy] = 630;
                            this.ny[this.fy] = var7;
                            ++this.fy;
                        }

                        if (!GameData.yhb[var8].equals("_")) {
                            this.jy[this.fy] = GameData.yhb[var8];
                            this.iy[this.fy] = "@lre@" + GameData.vhb[var8][0];
                            this.ky[this.fy] = 640;
                            this.ny[this.fy] = var7;
                            ++this.fy;
                        }

                        this.jy[this.fy] = "Use";
                        this.iy[this.fy] = "@lre@" + GameData.vhb[var8][0];
                        this.ky[this.fy] = 650;
                        this.ny[this.fy] = var7;
                        ++this.fy;
                        this.jy[this.fy] = "Drop";
                        this.iy[this.fy] = "@lre@" + GameData.vhb[var8][0];
                        this.ky[this.fy] = 660;
                        this.ny[this.fy] = var7;
                        ++this.fy;
                        this.jy[this.fy] = "Examine";
                        this.iy[this.fy] = "@lre@" + GameData.vhb[var8][0];
                        this.ky[this.fy] = 3600;
                        this.ny[this.fy] = var8;
                        ++this.fy;
                    }
                }
            }

        }
    }

    public void uk(boolean var1) {
        int var2 = this.lt.qj - 199;
        short var3 = 156;
        short var4 = 152;
        this.lt.bh(var2 - 49, 3, this.ut + 2);
        var2 += 40;
        this.lt.bg(var2, 36, var3, var4, 0);
        this.lt.vf(var2, 36, var2 + var3, 36 + var4);
        short var5 = 192;
        int var6 = (this.kv.ar - 6040) * 3 * var5 / 2048;
        int var7 = (this.kv.br - 6040) * 3 * var5 / 2048;
        int var8 = Scene.fm[1024 - this.av * 4 & 1023];
        int var9 = Scene.fm[(1024 - this.av * 4 & 1023) + 1024];
        int var10 = var7 * var8 + var6 * var9 >> 18;
        var7 = var7 * var9 - var6 * var8 >> 18;
        this.lt.sf(var2 + var3 / 2 - var10, 36 + var4 / 2 + var7, this.ut - 1, this.av + 64 & 255, var5);

        for(int var11 = 0; var11 < this.ew; ++var11) {
            var6 = (this.gw[var11] * this.ot + 64 - this.kv.ar) * 3 * var5 / 2048;
            var7 = (this.hw[var11] * this.ot + 64 - this.kv.br) * 3 * var5 / 2048;
            var10 = var7 * var8 + var6 * var9 >> 18;
            var7 = var7 * var9 - var6 * var8 >> 18;
            this.bn(var2 + var3 / 2 + var10, 36 + var4 / 2 - var7, 65535);
        }

        for(int var12 = 0; var12 < this.xv; ++var12) {
            var6 = (this.zv[var12] * this.ot + 64 - this.kv.ar) * 3 * var5 / 2048;
            var7 = (this.aw[var12] * this.ot + 64 - this.kv.br) * 3 * var5 / 2048;
            var10 = var7 * var8 + var6 * var9 >> 18;
            var7 = var7 * var9 - var6 * var8 >> 18;
            this.bn(var2 + var3 / 2 + var10, 36 + var4 / 2 - var7, 16711680);
        }

        for(int var13 = 0; var13 < this.qv; ++var13) {
            Character var14 = this.tv[var13];
            var6 = (var14.ar - this.kv.ar) * 3 * var5 / 2048;
            var7 = (var14.br - this.kv.br) * 3 * var5 / 2048;
            var10 = var7 * var8 + var6 * var9 >> 18;
            var7 = var7 * var9 - var6 * var8 >> 18;
            this.bn(var2 + var3 / 2 + var10, 36 + var4 / 2 - var7, 16776960);
        }

        for(int var16 = 0; var16 < this.ev; ++var16) {
            Character var15 = this.iv[var16];
            var6 = (var15.ar - this.kv.ar) * 3 * var5 / 2048;
            var7 = (var15.br - this.kv.br) * 3 * var5 / 2048;
            var10 = var7 * var8 + var6 * var9 >> 18;
            var7 = var7 * var9 - var6 * var8 >> 18;
            this.bn(var2 + var3 / 2 + var10, 36 + var4 / 2 - var7, 16777215);
        }

        this.lt.cg(var2 + var3 / 2, 36 + var4 / 2, 2, 16777215, 255);
        this.lt.sf(var2 + 19, 55, this.ut + 24, this.av + 128 & 255, 128);
        this.lt.vf(0, 0, this.qt, this.rt + 12);
        if (var1) {
            var2 = super.kq - (this.lt.qj - 199);
            int var17 = super.lq - 36;
            if (var2 >= 40 && var17 >= 0 && var2 < 196 && var17 < 152) {
                var3 = 156;
                var4 = 152;
                var5 = 192;
                var2 = this.lt.qj - 199;
                var2 += 40;
                var6 = (super.kq - (var2 + var3 / 2)) * 16384 / (3 * var5);
                var7 = (super.lq - (36 + var4 / 2)) * 16384 / (3 * var5);
                var8 = Scene.fm[1024 - this.av * 4 & 1023];
                var9 = Scene.fm[(1024 - this.av * 4 & 1023) + 1024];
                var10 = var7 * var8 + var6 * var9 >> 15;
                var7 = var7 * var9 - var6 * var8 >> 15;
                var6 = var10 + this.kv.ar;
                var7 = this.kv.br - var7;
                if (this.ft == 1) {
                    this.jl(this.lv, this.mv, var6 / 128, var7 / 128, false);
                }

                this.ft = 0;
            }

        }
    }

    public void vl(boolean var1) {
        int var2 = this.lt.qj - 199;
        byte var3 = 36;
        this.lt.bh(var2 - 49, 3, this.ut + 3);
        short var4 = 196;
        short var5 = 206;
        int var7;
        int var6 = var7 = Surface.ng(160, 160, 160);
        if (this.sx == 0) {
            var6 = Surface.ng(220, 220, 220);
        } else {
            var7 = Surface.ng(220, 220, 220);
        }

        this.lt.xf(var2, var3, var4 / 2, 24, var6, 128);
        this.lt.xf(var2 + var4 / 2, var3, var4 / 2, 24, var7, 128);
        this.lt.xf(var2, var3 + 24, var4, var5 - 24, Surface.ng(220, 220, 220), 128);
        this.lt.ug(var2, var3 + 24, var4, 0);
        this.lt.zg(var2 + var4 / 2, var3, 24, 0);
        this.lt.xg("Stats", var2 + var4 / 4, var3 + 16, 4, 0);
        this.lt.xg("Quests", var2 + var4 / 4 + var4 / 2, var3 + 16, 4, 0);
        int var12;
        if (this.sx == 0) {
            byte var8 = 72;
            this.lt.qf("Skills", var2 + 5, var8, 3, 16776960);
            var12 = var8 + 13;

            for(int var9 = 0; var9 < 8; ++var9) {
                this.lt.qf(this.gx[var9] + ":@yel@" + this.cx[var9] + "/" + this.dx[var9], var2 + 5, var12, 1, 16777215);
                this.lt.qf(this.gx[var9 + 8] + ":@yel@" + this.cx[var9 + 8] + "/" + this.dx[var9 + 8], var2 + var4 / 2 - 8, var12 - 13, 1, 16777215);
                var12 += 13;
            }

            this.lt.qf("Quest Points:@yel@" + this.fx, var2 + var4 / 2 - 8, var12 - 13, 1, 16777215);
            var12 += 8;
            this.lt.qf("Equipment Status", var2 + 5, var12, 3, 16776960);
            var12 += 12;

            for(int var10 = 0; var10 < 3; ++var10) {
                this.lt.qf(this.hx[var10] + ":@yel@" + this.ex[var10], var2 + 5, var12, 1, 16777215);
                if (var10 < 2) {
                    this.lt.qf(this.hx[var10 + 3] + ":@yel@" + this.ex[var10 + 3], var2 + var4 / 2 + 25, var12, 1, 16777215);
                }

                var12 += 13;
            }
        }

        if (this.sx == 1) {
            this.qx.nc(this.rx);
            this.qx.hd(this.rx, 0, "@whi@Quest-list (green=completed)");

            for(var12 = 0; var12 < this.tx; ++var12) {
                this.qx.hd(this.rx, var12 + 1, (this.vx[var12] ? "@gre@" : "@red@") + this.ux[var12]);
            }

            this.qx.hc();
        }

        if (var1) {
            var2 = super.kq - (this.lt.qj - 199);
            int var11 = super.lq - 36;
            if (var2 >= 0 && var11 >= 0 && var2 < var4 && var11 < var5) {
                if (this.sx == 1) {
                    this.qx.ud(var2 + (this.lt.qj - 199), var11 + 36, super.nq, super.mq);
                }

                if (var11 <= 24 && this.ft == 1) {
                    if (var2 < 98) {
                        this.sx = 0;
                        return;
                    }

                    if (var2 > 98) {
                        this.sx = 1;
                    }
                }
            }

        }
    }

    public void an(boolean var1) {
        int var2 = this.lt.qj - 199;
        byte var3 = 36;
        this.lt.bh(var2 - 49, 3, this.ut + 4);
        short var4 = 196;
        short var5 = 182;
        int var7;
        int var6 = var7 = Surface.ng(160, 160, 160);
        if (this.kx == 0) {
            var6 = Surface.ng(220, 220, 220);
        } else {
            var7 = Surface.ng(220, 220, 220);
        }

        this.lt.xf(var2, var3, var4 / 2, 24, var6, 128);
        this.lt.xf(var2 + var4 / 2, var3, var4 / 2, 24, var7, 128);
        this.lt.xf(var2, var3 + 24, var4, 90, Surface.ng(220, 220, 220), 128);
        this.lt.xf(var2, var3 + 24 + 90, var4, var5 - 90 - 24, Surface.ng(160, 160, 160), 128);
        this.lt.ug(var2, var3 + 24, var4, 0);
        this.lt.zg(var2 + var4 / 2, var3, 24, 0);
        this.lt.ug(var2, var3 + 113, var4, 0);
        this.lt.xg("Magic", var2 + var4 / 4, var3 + 16, 4, 0);
        this.lt.xg("Prayers", var2 + var4 / 4 + var4 / 2, var3 + 16, 4, 0);
        int var8;
        int var9;
        String var10;
        int var11;
        int var17;
        if (this.kx == 0) {
            this.ix.nc(this.jx);
            var8 = 0;

            int var12;
            for(var9 = 0; var9 < GameData.qlb; ++var9) {
                var10 = "@yel@";

                for(var11 = 0; var11 < GameData.ulb[var9]; ++var11) {
                    var12 = GameData.wlb[var9][var11];
                    if (!this.rm(var12, GameData.xlb[var9][var11])) {
                        var10 = "@whi@";
                        break;
                    }
                }

                var12 = this.cx[6];
                if (GameData.tlb[var9] > var12) {
                    var10 = "@bla@";
                }

                this.ix.hd(this.jx, var8++, var10 + "Level " + GameData.tlb[var9] + ": " + GameData.rlb[var9]);
            }

            this.ix.hc();
            var17 = this.ix.jc(this.jx);
            if (var17 != -1) {
                this.lt.qf("Level " + GameData.tlb[var17] + ": " + GameData.rlb[var17], var2 + 2, var3 + 124, 1, 16776960);
                this.lt.qf(GameData.slb[var17], var2 + 2, var3 + 136, 0, 16777215);

                for(var11 = 0; var11 < GameData.ulb[var17]; ++var11) {
                    var12 = GameData.wlb[var17][var11];
                    this.lt.bh(var2 + 2 + var11 * 44, var3 + 150, this.yv + GameData.zhb[var12]);
                    int var13 = this.ml(var12);
                    int var14 = GameData.xlb[var17][var11];
                    String var15 = "@red@";
                    if (this.rm(var12, var14)) {
                        var15 = "@gre@";
                    }

                    this.lt.qf(var15 + var13 + "/" + var14, var2 + 2 + var11 * 44, var3 + 150, 1, 16777215);
                }
            } else {
                this.lt.qf("Point at a spell for a description", var2 + 2, var3 + 124, 1, 0);
            }
        }

        if (this.kx == 1) {
            this.ix.nc(this.jx);
            var8 = 0;

            for(var9 = 0; var9 < GameData.imb; ++var9) {
                var10 = "@whi@";
                if (GameData.lmb[var9] > this.dx[5]) {
                    var10 = "@bla@";
                }

                if (this.wx[var9]) {
                    var10 = "@gre@";
                }

                this.ix.hd(this.jx, var8++, var10 + "Level " + GameData.lmb[var9] + ": " + GameData.jmb[var9]);
            }

            this.ix.hc();
            var17 = this.ix.jc(this.jx);
            if (var17 != -1) {
                this.lt.xg("Level " + GameData.lmb[var17] + ": " + GameData.jmb[var17], var2 + var4 / 2, var3 + 130, 1, 16776960);
                this.lt.xg(GameData.kmb[var17], var2 + var4 / 2, var3 + 145, 0, 16777215);
                this.lt.xg("Drain rate: " + GameData.mmb[var17], var2 + var4 / 2, var3 + 160, 1, 0);
            } else {
                this.lt.qf("Point at a prayer for a description", var2 + 2, var3 + 124, 1, 0);
            }
        }

        if (var1) {
            var2 = super.kq - (this.lt.qj - 199);
            int var16 = super.lq - 36;
            if (var2 >= 0 && var16 >= 0 && var2 < 196 && var16 < 182) {
                this.ix.ud(var2 + (this.lt.qj - 199), var16 + 36, super.nq, super.mq);
                if (var16 <= 24 && this.ft == 1) {
                    if (var2 < 98 && this.kx == 1) {
                        this.kx = 0;
                        this.ix.dd(this.jx);
                    } else if (var2 > 98 && this.kx == 0) {
                        this.kx = 1;
                        this.ix.dd(this.jx);
                    }
                }

                if (this.ft == 1 && this.kx == 0) {
                    var8 = this.ix.jc(this.jx);
                    if (var8 != -1) {
                        var9 = this.cx[6];
                        if (GameData.tlb[var8] > var9) {
                            this.pk("Your magic ability is not high enough for this spell", 3);
                        } else {
                            for(var17 = 0; var17 < GameData.ulb[var8]; ++var17) {
                                var11 = GameData.wlb[var8][var17];
                                if (!this.rm(var11, GameData.xlb[var8][var17])) {
                                    this.pk("You don't have all the reagents you need for this spell", 3);
                                    var17 = -1;
                                    break;
                                }
                            }

                            if (var17 == GameData.ulb[var8]) {
                                this.lx = var8;
                                this.ax = -1;
                            }
                        }
                    }
                }

                if (this.ft == 1 && this.kx == 1) {
                    var8 = this.ix.jc(this.jx);
                    if (var8 != -1) {
                        var9 = this.dx[5];
                        if (GameData.lmb[var8] > var9) {
                            this.pk("Your prayer ability is not high enough for this prayer", 3);
                        } else if (this.cx[5] == 0) {
                            this.pk("You have run out of prayer points. Return to a church to recharge", 3);
                        } else if (this.wx[var8]) {
                            super.ed.a(211);
                            super.ed.m(var8);
                            super.ed.d();
                            this.wx[var8] = false;
                        } else {
                            super.ed.a(212);
                            super.ed.m(var8);
                            super.ed.d();
                            this.wx[var8] = true;
                        }
                    }
                }

                this.ft = 0;
            }

        }
    }

    public void tk(boolean var1) {
        int var2 = this.lt.qj - 199;
        byte var3 = 36;
        this.lt.bh(var2 - 49, 3, this.ut + 5);
        short var4 = 196;
        short var5 = 182;
        int var7;
        int var6 = var7 = Surface.ng(160, 160, 160);
        if (this.ox == 0) {
            var6 = Surface.ng(220, 220, 220);
        } else {
            var7 = Surface.ng(220, 220, 220);
        }

        this.lt.xf(var2, var3, var4 / 2, 24, var6, 128);
        this.lt.xf(var2 + var4 / 2, var3, var4 / 2, 24, var7, 128);
        this.lt.xf(var2, var3 + 24, var4, var5 - 24, Surface.ng(220, 220, 220), 128);
        this.lt.ug(var2, var3 + 24, var4, 0);
        this.lt.zg(var2 + var4 / 2, var3, 24, 0);
        this.lt.ug(var2, var3 + var5 - 16, var4, 0);
        this.lt.xg("Friends", var2 + var4 / 4, var3 + 16, 4, 0);
        this.lt.xg("Ignore", var2 + var4 / 4 + var4 / 2, var3 + 16, 4, 0);
        this.mx.nc(this.nx);
        int var8;
        if (this.ox == 0) {
            for(var8 = 0; var8 < super.kd; ++var8) {
                String var9;
                if (super.md[var8] == 2) {
                    var9 = "@gre@";
                } else if (super.md[var8] == 1) {
                    var9 = "@yel@";
                } else {
                    var9 = "@red@";
                }

                this.mx.hd(this.nx, var8, var9 + Utility.rn(super.ld[var8]) + "~439~@whi@Remove         WWWWWWWWWW");
            }
        }

        if (this.ox == 1) {
            for(var8 = 0; var8 < super.nd; ++var8) {
                this.mx.hd(this.nx, var8, "@yel@" + Utility.rn(super.od[var8]) + "~439~@whi@Remove         WWWWWWWWWW");
            }
        }

        this.mx.hc();
        int var11;
        if (this.ox == 0) {
            var8 = this.mx.jc(this.nx);
            if (var8 >= 0 && super.kq < 489) {
                if (super.kq > 429) {
                    this.lt.xg("Click to remove " + Utility.rn(super.ld[var8]), var2 + var4 / 2, var3 + 35, 1, 16777215);
                } else if (super.md[var8] == 2) {
                    this.lt.xg("Click to message " + Utility.rn(super.ld[var8]), var2 + var4 / 2, var3 + 35, 1, 16777215);
                } else if (super.md[var8] == 1) {
                    this.lt.xg(Utility.rn(super.ld[var8]) + " is on a different server", var2 + var4 / 2, var3 + 35, 1, 16777215);
                } else {
                    this.lt.xg(Utility.rn(super.ld[var8]) + " is offline", var2 + var4 / 2, var3 + 35, 1, 16777215);
                }
            } else {
                this.lt.xg("Click a name to send a message", var2 + var4 / 2, var3 + 35, 1, 16777215);
            }

            if (super.kq > var2 && super.kq < var2 + var4 && super.lq > var3 + var5 - 16 && super.lq < var3 + var5) {
                var11 = 16776960;
            } else {
                var11 = 16777215;
            }

            this.lt.xg("Click here to add a friend", var2 + var4 / 2, var3 + var5 - 3, 1, var11);
        }

        if (this.ox == 1) {
            var8 = this.mx.jc(this.nx);
            if (var8 >= 0 && super.kq < 489 && super.kq > 429) {
                if (super.kq > 429) {
                    this.lt.xg("Click to remove " + Utility.rn(super.od[var8]), var2 + var4 / 2, var3 + 35, 1, 16777215);
                }
            } else {
                this.lt.xg("Blocking messages from:", var2 + var4 / 2, var3 + 35, 1, 16777215);
            }

            if (super.kq > var2 && super.kq < var2 + var4 && super.lq > var3 + var5 - 16 && super.lq < var3 + var5) {
                var11 = 16776960;
            } else {
                var11 = 16777215;
            }

            this.lt.xg("Click here to add a name", var2 + var4 / 2, var3 + var5 - 3, 1, var11);
        }

        if (var1) {
            var2 = super.kq - (this.lt.qj - 199);
            int var10 = super.lq - 36;
            if (var2 >= 0 && var10 >= 0 && var2 < 196 && var10 < 182) {
                this.mx.ud(var2 + (this.lt.qj - 199), var10 + 36, super.nq, super.mq);
                if (var10 <= 24 && this.ft == 1) {
                    if (var2 < 98 && this.ox == 1) {
                        this.ox = 0;
                        this.mx.dd(this.nx);
                    } else if (var2 > 98 && this.ox == 0) {
                        this.ox = 1;
                        this.mx.dd(this.nx);
                    }
                }

                if (this.ft == 1 && this.ox == 0) {
                    var8 = this.mx.jc(this.nx);
                    if (var8 >= 0 && super.kq < 489) {
                        if (super.kq > 429) {
                            this.z(super.ld[var8]);
                        } else if (super.md[var8] != 0) {
                            this.eab = 2;
                            this.px = super.ld[var8];
                            super.tq = "";
                            super.uq = "";
                        }
                    }
                }

                if (this.ft == 1 && this.ox == 1) {
                    var8 = this.mx.jc(this.nx);
                    if (var8 >= 0 && super.kq < 489 && super.kq > 429) {
                        this.eb(super.od[var8]);
                    }
                }

                if (var10 > 166 && this.ft == 1 && this.ox == 0) {
                    this.eab = 1;
                    super.rq = "";
                    super.sq = "";
                }

                if (var10 > 166 && this.ft == 1 && this.ox == 1) {
                    this.eab = 3;
                    super.rq = "";
                    super.sq = "";
                }

                this.ft = 0;
            }

        }
    }

    public void ym(boolean var1) {
        int var2 = this.lt.qj - 199;
        byte var3 = 36;
        this.lt.bh(var2 - 49, 3, this.ut + 6);
        short var4 = 196;
        this.lt.xf(var2, 36, var4, 90, Surface.ng(181, 181, 181), 160);
        this.lt.xf(var2, 126, var4, 105, Surface.ng(201, 2011, 201), 160);
        this.lt.xf(var2, 231, var4, 30, Surface.ng(181, 181, 181), 160);
        int var5 = var2 + 3;
        int var6 = var3 + 15;
        this.lt.qf("Game options - click to toggle", var5, var6, 1, 0);
        var6 += 15;
        if (this.yx) {
            this.lt.qf("Camera angle mode - @gre@Auto", var5, var6, 1, 16777215);
        } else {
            this.lt.qf("Camera angle mode - @red@Manual", var5, var6, 1, 16777215);
        }

        var6 += 15;
        if (this.hy) {
            this.lt.qf("Mouse buttons - @red@One", var5, var6, 1, 16777215);
        } else {
            this.lt.qf("Mouse buttons - @gre@Two", var5, var6, 1, 16777215);
        }

        var6 += 15;
        if (this.zx) {
            this.lt.qf("Player type: @red@Player-Killer", var5, var6, 1, 16777215);
        } else {
            this.lt.qf("Player type: @gre@Non Player-Killer", var5, var6, 1, 16777215);
        }

        var6 += 15;
        int var7 = 16777215;
        if (super.kq > var5 && super.kq < var5 + var4 && super.lq > var6 - 12 && super.lq < var6 + 4) {
            var7 = 16776960;
        }

        this.lt.qf("Change password", var5, var6, 1, var7);
        var6 += 15;
        var6 += 15;
        this.lt.qf("Privacy settings. Will be applied to", var2 + 3, var6, 1, 0);
        var6 += 15;
        this.lt.qf("all people not on your friends list", var2 + 3, var6, 1, 0);
        var6 += 15;
        if (super.pd == 0) {
            this.lt.qf("Hide online-status: @red@<off>", var2 + 3, var6, 1, 16777215);
        } else {
            this.lt.qf("Hide online-status: @gre@<on>", var2 + 3, var6, 1, 16777215);
        }

        var6 += 15;
        if (super.qd == 0) {
            this.lt.qf("Block chat messages: @red@<off>", var2 + 3, var6, 1, 16777215);
        } else {
            this.lt.qf("Block chat messages: @gre@<on>", var2 + 3, var6, 1, 16777215);
        }

        var6 += 15;
        if (super.rd == 0) {
            this.lt.qf("Block private messages: @red@<off>", var2 + 3, var6, 1, 16777215);
        } else {
            this.lt.qf("Block private messages: @gre@<on>", var2 + 3, var6, 1, 16777215);
        }

        var6 += 15;
        if (super.sd == 0) {
            this.lt.qf("Block trade requests: @red@<off>", var2 + 3, var6, 1, 16777215);
        } else {
            this.lt.qf("Block trade requests: @gre@<on>", var2 + 3, var6, 1, 16777215);
        }

        var6 += 15;
        var6 += 15;
        var7 = 16777215;
        if (super.kq > var5 && super.kq < var5 + var4 && super.lq > var6 - 12 && super.lq < var6 + 4) {
            var7 = 16776960;
        }

        this.lt.qf("Click here to logout", var2 + 3, var6, 1, var7);
        if (var1) {
            var2 = super.kq - (this.lt.qj - 199);
            int var11 = super.lq - 36;
            if (var2 >= 0 && var11 >= 0 && var2 < 196 && var11 < 231) {
                int var8 = this.lt.qj - 199;
                byte var9 = 36;
                var4 = 196;
                var5 = var8 + 3;
                var6 = var9 + 30;
                if (super.kq > var5 && super.kq < var5 + var4 && super.lq > var6 - 12 && super.lq < var6 + 4 && this.ft == 1) {
                    this.yx = !this.yx;
                    super.ed.a(213);
                    super.ed.m(0);
                    super.ed.m(this.yx ? 1 : 0);
                    super.ed.d();
                }

                var6 += 15;
                if (super.kq > var5 && super.kq < var5 + var4 && super.lq > var6 - 12 && super.lq < var6 + 4 && this.ft == 1) {
                    this.hy = !this.hy;
                    super.ed.a(213);
                    super.ed.m(2);
                    super.ed.m(this.hy ? 1 : 0);
                    super.ed.d();
                }

                var6 += 15;
                if (super.kq > var5 && super.kq < var5 + var4 && super.lq > var6 - 12 && super.lq < var6 + 4 && this.ft == 1 && this.cab > 0) {
                    this.dab = 1;
                }

                var6 += 15;
                if (super.kq > var5 && super.kq < var5 + var4 && super.lq > var6 - 12 && super.lq < var6 + 4 && this.ft == 1) {
                    this.fab = 1;
                    super.rq = "";
                    super.sq = "";
                }

                boolean var10 = false;
                var6 += 60;
                if (super.kq > var5 && super.kq < var5 + var4 && super.lq > var6 - 12 && super.lq < var6 + 4 && this.ft == 1) {
                    super.pd = 1 - super.pd;
                    var10 = true;
                }

                var6 += 15;
                if (super.kq > var5 && super.kq < var5 + var4 && super.lq > var6 - 12 && super.lq < var6 + 4 && this.ft == 1) {
                    super.qd = 1 - super.qd;
                    var10 = true;
                }

                var6 += 15;
                if (super.kq > var5 && super.kq < var5 + var4 && super.lq > var6 - 12 && super.lq < var6 + 4 && this.ft == 1) {
                    super.rd = 1 - super.rd;
                    var10 = true;
                }

                var6 += 15;
                if (super.kq > var5 && super.kq < var5 + var4 && super.lq > var6 - 12 && super.lq < var6 + 4 && this.ft == 1) {
                    super.sd = 1 - super.sd;
                    var10 = true;
                }

                if (var10) {
                    this.pb(super.pd, super.qd, super.rd, super.sd, 0);
                }

                var6 += 30;
                if (super.kq > var5 && super.kq < var5 + var4 && super.lq > var6 - 12 && super.lq < var6 + 4 && this.ft == 1) {
                    this.trylogout();
                }

                this.ft = 0;
            }

        }
    }

    public void kl() {
        int var1 = -1;

        for(int var2 = 0; var2 < this.ew; ++var2) {
            this.lw[var2] = false;
        }

        for(int var3 = 0; var3 < this.nw; ++var3) {
            this.tw[var3] = false;
        }

        int var4 = this.kt.wi();
        GameModel[] var5 = this.kt.sh();
        int[] var6 = this.kt.ri();

        for(int var7 = 0; var7 < var4; ++var7) {
            int var8 = var6[var7];
            GameModel var9 = var5[var7];
            if (var9.oh[var8] <= 65535 || var9.oh[var8] >= 200000 && var9.oh[var8] <= 300000) {
                int var10;
                int var11;
                if (var9 != this.kt.tn) {
                    if (var9 != null && var9.nh >= 10000) {
                        var10 = var9.nh - 10000;
                        var11 = this.sw[var10];
                        if (!this.tw[var10]) {
                            if (this.lx >= 0) {
                                if (GameData.vlb[this.lx] == 4) {
                                    this.jy[this.fy] = "Cast " + GameData.rlb[this.lx] + " on";
                                    this.iy[this.fy] = "@cya@" + GameData.mkb[var11][0];
                                    this.ky[this.fy] = 300;
                                    this.ly[this.fy] = this.pw[var10];
                                    this.my[this.fy] = this.qw[var10];
                                    this.ny[this.fy] = this.rw[var10];
                                    this.oy[this.fy] = this.lx;
                                    ++this.fy;
                                }
                            } else if (this.ax >= 0) {
                                this.jy[this.fy] = "Use " + this.bx + " with";
                                this.iy[this.fy] = "@cya@" + GameData.mkb[var11][0];
                                this.ky[this.fy] = 310;
                                this.ly[this.fy] = this.pw[var10];
                                this.my[this.fy] = this.qw[var10];
                                this.ny[this.fy] = this.rw[var10];
                                this.oy[this.fy] = this.ax;
                                ++this.fy;
                            } else {
                                if (!GameData.okb[var11].equalsIgnoreCase("WalkTo")) {
                                    this.jy[this.fy] = GameData.okb[var11];
                                    this.iy[this.fy] = "@cya@" + GameData.mkb[var11][0];
                                    this.ky[this.fy] = 320;
                                    this.ly[this.fy] = this.pw[var10];
                                    this.my[this.fy] = this.qw[var10];
                                    this.ny[this.fy] = this.rw[var10];
                                    ++this.fy;
                                }

                                if (!GameData.pkb[var11].equalsIgnoreCase("Examine")) {
                                    this.jy[this.fy] = GameData.pkb[var11];
                                    this.iy[this.fy] = "@cya@" + GameData.mkb[var11][0];
                                    this.ky[this.fy] = 2300;
                                    this.ly[this.fy] = this.pw[var10];
                                    this.my[this.fy] = this.qw[var10];
                                    this.ny[this.fy] = this.rw[var10];
                                    ++this.fy;
                                }

                                this.jy[this.fy] = "Examine";
                                this.iy[this.fy] = "@cya@" + GameData.mkb[var11][0];
                                this.ky[this.fy] = 3300;
                                this.ny[this.fy] = var11;
                                ++this.fy;
                            }

                            this.tw[var10] = true;
                        }
                    } else if (var9 != null && var9.nh >= 0) {
                        var10 = var9.nh;
                        var11 = this.iw[var10];
                        if (!this.lw[var10]) {
                            if (this.lx >= 0) {
                                if (GameData.vlb[this.lx] == 5) {
                                    this.jy[this.fy] = "Cast " + GameData.rlb[this.lx] + " on";
                                    this.iy[this.fy] = "@cya@" + GameData.bkb[var11][0];
                                    this.ky[this.fy] = 400;
                                    this.ly[this.fy] = this.gw[var10];
                                    this.my[this.fy] = this.hw[var10];
                                    this.ny[this.fy] = this.jw[var10];
                                    this.oy[this.fy] = this.iw[var10];
                                    this.py[this.fy] = this.lx;
                                    ++this.fy;
                                }
                            } else if (this.ax >= 0) {
                                this.jy[this.fy] = "Use " + this.bx + " with";
                                this.iy[this.fy] = "@cya@" + GameData.bkb[var11][0];
                                this.ky[this.fy] = 410;
                                this.ly[this.fy] = this.gw[var10];
                                this.my[this.fy] = this.hw[var10];
                                this.ny[this.fy] = this.jw[var10];
                                this.oy[this.fy] = this.iw[var10];
                                this.py[this.fy] = this.ax;
                                ++this.fy;
                            } else {
                                if (!GameData.dkb[var11].equalsIgnoreCase("WalkTo")) {
                                    this.jy[this.fy] = GameData.dkb[var11];
                                    this.iy[this.fy] = "@cya@" + GameData.bkb[var11][0];
                                    this.ky[this.fy] = 420;
                                    this.ly[this.fy] = this.gw[var10];
                                    this.my[this.fy] = this.hw[var10];
                                    this.ny[this.fy] = this.jw[var10];
                                    this.oy[this.fy] = this.iw[var10];
                                    ++this.fy;
                                }

                                if (!GameData.ekb[var11].equalsIgnoreCase("Examine")) {
                                    this.jy[this.fy] = GameData.ekb[var11];
                                    this.iy[this.fy] = "@cya@" + GameData.bkb[var11][0];
                                    this.ky[this.fy] = 2400;
                                    this.ly[this.fy] = this.gw[var10];
                                    this.my[this.fy] = this.hw[var10];
                                    this.ny[this.fy] = this.jw[var10];
                                    this.oy[this.fy] = this.iw[var10];
                                    ++this.fy;
                                }

                                this.jy[this.fy] = "Examine";
                                this.iy[this.fy] = "@cya@" + GameData.bkb[var11][0];
                                this.ky[this.fy] = 3400;
                                this.ny[this.fy] = var11;
                                ++this.fy;
                            }

                            this.lw[var10] = true;
                        }
                    } else {
                        if (var8 >= 0) {
                            var8 = var9.oh[var8] - 200000;
                        }

                        if (var8 >= 0) {
                            var1 = var8;
                        }
                    }
                } else {
                    var10 = var9.oh[var8] % 10000;
                    var11 = var9.oh[var8] / 10000;
                    String var12;
                    int var13;
                    int var14;
                    if (var11 == 1) {
                        var12 = "";
                        var13 = -1;
                        var14 = this.iv[var10].tr;
                        if (var14 == 1) {
                            var13 = 0;
                            if (this.kv.ur > 0 && this.iv[var10].ur > 0) {
                                var13 = this.kv.ur - this.iv[var10].ur;
                            }

                            if (var13 < 0) {
                                var12 = "@or1@";
                            }

                            if (var13 < -3) {
                                var12 = "@or2@";
                            }

                            if (var13 < -6) {
                                var12 = "@or3@";
                            }

                            if (var13 < -9) {
                                var12 = "@red@";
                            }

                            if (var13 > 0) {
                                var12 = "@gr1@";
                            }

                            if (var13 > 3) {
                                var12 = "@gr2@";
                            }

                            if (var13 > 6) {
                                var12 = "@gr3@";
                            }

                            if (var13 > 9) {
                                var12 = "@gre@";
                            }

                            var12 = " " + var12 + "(level-" + this.iv[var10].ur + ")";
                        }

                        if (this.lx >= 0) {
                            if (GameData.vlb[this.lx] == 1 || GameData.vlb[this.lx] == 2 && var14 == 1 && this.kv.tr == 1) {
                                this.jy[this.fy] = "Cast " + GameData.rlb[this.lx] + " on";
                                this.iy[this.fy] = "@whi@" + this.iv[var10].xq;
                                this.ky[this.fy] = 800;
                                this.ly[this.fy] = this.iv[var10].ar;
                                this.my[this.fy] = this.iv[var10].br;
                                this.ny[this.fy] = this.iv[var10].yq;
                                this.oy[this.fy] = this.lx;
                                ++this.fy;
                            }
                        } else if (this.ax >= 0) {
                            this.jy[this.fy] = "Use " + this.bx + " with";
                            this.iy[this.fy] = "@whi@" + this.iv[var10].xq;
                            this.ky[this.fy] = 810;
                            this.ly[this.fy] = this.iv[var10].ar;
                            this.my[this.fy] = this.iv[var10].br;
                            this.ny[this.fy] = this.iv[var10].yq;
                            this.oy[this.fy] = this.ax;
                            ++this.fy;
                        } else {
                            if (var14 == 1 && this.kv.tr == 1) {
                                this.jy[this.fy] = "Attack";
                                this.iy[this.fy] = "@whi@" + this.iv[var10].xq + var12;
                                if (var13 >= 0 && var13 < 5) {
                                    this.ky[this.fy] = 805;
                                } else {
                                    this.ky[this.fy] = 2805;
                                }

                                this.ly[this.fy] = this.iv[var10].ar;
                                this.my[this.fy] = this.iv[var10].br;
                                this.ny[this.fy] = this.iv[var10].yq;
                                ++this.fy;
                            }

                            this.jy[this.fy] = "Trade with";
                            this.iy[this.fy] = "@whi@" + this.iv[var10].xq;
                            this.ky[this.fy] = 2810;
                            this.ny[this.fy] = this.iv[var10].yq;
                            ++this.fy;
                            this.jy[this.fy] = "Follow";
                            this.iy[this.fy] = "@whi@" + this.iv[var10].xq;
                            this.ky[this.fy] = 2820;
                            this.ny[this.fy] = this.iv[var10].yq;
                            ++this.fy;
                        }
                    } else if (var11 == 2) {
                        if (this.lx >= 0) {
                            if (GameData.vlb[this.lx] == 3) {
                                this.jy[this.fy] = "Cast " + GameData.rlb[this.lx] + " on";
                                this.iy[this.fy] = "@lre@" + GameData.vhb[this.bw[var10]][0];
                                this.ky[this.fy] = 200;
                                this.ly[this.fy] = this.zv[var10];
                                this.my[this.fy] = this.aw[var10];
                                this.ny[this.fy] = this.bw[var10];
                                this.oy[this.fy] = this.lx;
                                ++this.fy;
                            }
                        } else if (this.ax >= 0) {
                            this.jy[this.fy] = "Use " + this.bx + " with";
                            this.iy[this.fy] = "@lre@" + GameData.vhb[this.bw[var10]][0];
                            this.ky[this.fy] = 210;
                            this.ly[this.fy] = this.zv[var10];
                            this.my[this.fy] = this.aw[var10];
                            this.ny[this.fy] = this.bw[var10];
                            this.oy[this.fy] = this.ax;
                            ++this.fy;
                        } else {
                            this.jy[this.fy] = "Take";
                            this.iy[this.fy] = "@lre@" + GameData.vhb[this.bw[var10]][0];
                            this.ky[this.fy] = 220;
                            this.ly[this.fy] = this.zv[var10];
                            this.my[this.fy] = this.aw[var10];
                            this.ny[this.fy] = this.bw[var10];
                            ++this.fy;
                            this.jy[this.fy] = "Examine";
                            this.iy[this.fy] = "@lre@" + GameData.vhb[this.bw[var10]][0];
                            this.ky[this.fy] = 3200;
                            this.ny[this.fy] = this.bw[var10];
                            ++this.fy;
                        }
                    } else if (var11 == 3) {
                        var12 = "";
                        var13 = -1;
                        var14 = this.tv[var10].cr;
                        if (GameData.vib[var14] > 0) {
                            int var15 = (GameData.rib[var14] + GameData.uib[var14] + GameData.sib[var14] + GameData.tib[var14]) / 4;
                            int var16 = (this.dx[0] + this.dx[1] + this.dx[2] + this.dx[3] + 27) / 4;
                            var13 = var16 - var15;
                            var12 = "@yel@";
                            if (var13 < 0) {
                                var12 = "@or1@";
                            }

                            if (var13 < -3) {
                                var12 = "@or2@";
                            }

                            if (var13 < -6) {
                                var12 = "@or3@";
                            }

                            if (var13 < -9) {
                                var12 = "@red@";
                            }

                            if (var13 > 0) {
                                var12 = "@gr1@";
                            }

                            if (var13 > 3) {
                                var12 = "@gr2@";
                            }

                            if (var13 > 6) {
                                var12 = "@gr3@";
                            }

                            if (var13 > 9) {
                                var12 = "@gre@";
                            }

                            var12 = " " + var12 + "(level-" + var15 + ")";
                        }

                        if (this.lx >= 0) {
                            if (GameData.vlb[this.lx] == 2) {
                                this.jy[this.fy] = "Cast " + GameData.rlb[this.lx] + " on";
                                this.iy[this.fy] = "@yel@" + GameData.pib[this.tv[var10].cr][0];
                                this.ky[this.fy] = 700;
                                this.ly[this.fy] = this.tv[var10].ar;
                                this.my[this.fy] = this.tv[var10].br;
                                this.ny[this.fy] = this.tv[var10].yq;
                                this.oy[this.fy] = this.lx;
                                ++this.fy;
                            }
                        } else if (this.ax >= 0) {
                            this.jy[this.fy] = "Use " + this.bx + " with";
                            this.iy[this.fy] = "@yel@" + GameData.pib[this.tv[var10].cr][0];
                            this.ky[this.fy] = 710;
                            this.ly[this.fy] = this.tv[var10].ar;
                            this.my[this.fy] = this.tv[var10].br;
                            this.ny[this.fy] = this.tv[var10].yq;
                            this.oy[this.fy] = this.ax;
                            ++this.fy;
                        } else {
                            if (GameData.vib[var14] > 0) {
                                this.jy[this.fy] = "Attack";
                                this.iy[this.fy] = "@yel@" + GameData.pib[this.tv[var10].cr][0] + var12;
                                if (var13 >= 0) {
                                    this.ky[this.fy] = 715;
                                } else {
                                    this.ky[this.fy] = 2715;
                                }

                                this.ly[this.fy] = this.tv[var10].ar;
                                this.my[this.fy] = this.tv[var10].br;
                                this.ny[this.fy] = this.tv[var10].yq;
                                ++this.fy;
                            }

                            this.jy[this.fy] = "Talk-to";
                            this.iy[this.fy] = "@yel@" + GameData.pib[this.tv[var10].cr][0];
                            this.ky[this.fy] = 720;
                            this.ly[this.fy] = this.tv[var10].ar;
                            this.my[this.fy] = this.tv[var10].br;
                            this.ny[this.fy] = this.tv[var10].yq;
                            ++this.fy;
                            this.jy[this.fy] = "Examine";
                            this.iy[this.fy] = "@yel@" + GameData.pib[this.tv[var10].cr][0];
                            this.ky[this.fy] = 3700;
                            this.ny[this.fy] = this.tv[var10].cr;
                            ++this.fy;
                        }
                    }
                }
            }
        }

        if (this.lx >= 0 && GameData.vlb[this.lx] <= 1) {
            this.jy[this.fy] = "Cast " + GameData.rlb[this.lx] + " on self";
            this.iy[this.fy] = "";
            this.ky[this.fy] = 1000;
            this.ny[this.fy] = this.lx;
            ++this.fy;
        }

        if (var1 != -1) {
            if (this.lx >= 0) {
                if (GameData.vlb[this.lx] == 6) {
                    this.jy[this.fy] = "Cast " + GameData.rlb[this.lx] + " on ground";
                    this.iy[this.fy] = "";
                    this.ky[this.fy] = 900;
                    this.ly[this.fy] = this.fu.rgb[var1];
                    this.my[this.fy] = this.fu.sgb[var1];
                    this.ny[this.fy] = this.lx;
                    ++this.fy;
                    return;
                }
            } else if (this.ax < 0) {
                this.jy[this.fy] = "Walk here";
                this.iy[this.fy] = "";
                this.ky[this.fy] = 920;
                this.ly[this.fy] = this.fu.rgb[var1];
                this.my[this.fy] = this.fu.sgb[var1];
                ++this.fy;
            }
        }

    }

    public void tm() {
        int var1;
        int var2;
        int var3;
        if (this.ft == 0) {
            if (super.kq >= this.by - 10 && super.lq >= this.cy - 10 && super.kq <= this.by + this.dy + 10 && super.lq <= this.cy + this.ey + 10) {
                this.lt.xf(this.by, this.cy, this.dy, this.ey, 13684944, 160);
                this.lt.qf("Choose option", this.by + 2, this.cy + 12, 1, 65535);

                for(var1 = 0; var1 < this.fy; ++var1) {
                    var2 = this.by + 2;
                    var3 = this.cy + 27 + var1 * 15;
                    int var4 = 16777215;
                    if (super.kq > var2 - 2 && super.lq > var3 - 12 && super.lq < var3 + 4 && super.kq < var2 - 3 + this.dy) {
                        var4 = 16776960;
                    }

                    this.lt.qf(this.jy[this.qy[var1]] + " " + this.iy[this.qy[var1]], var2, var3, 1, var4);
                }

            } else {
                this.ay = false;
            }
        } else {
            for(var1 = 0; var1 < this.fy; ++var1) {
                var2 = this.by + 2;
                var3 = this.cy + 27 + var1 * 15;
                if (super.kq > var2 - 2 && super.lq > var3 - 12 && super.lq < var3 + 4 && super.kq < var2 - 3 + this.dy) {
                    this.jm(this.qy[var1]);
                    break;
                }
            }

            this.ft = 0;
            this.ay = false;
        }
    }

    public void il() {
        if (this.lx >= 0 || this.ax >= 0) {
            this.jy[this.fy] = "Cancel";
            this.iy[this.fy] = "";
            this.ky[this.fy] = 4000;
            ++this.fy;
        }

        for(int var1 = 0; var1 < this.fy; this.qy[var1] = var1++) {
            ;
        }

        boolean var2 = false;

        int var3;
        int var4;
        while(!var2) {
            var2 = true;

            for(var3 = 0; var3 < this.fy - 1; ++var3) {
                var4 = this.qy[var3];
                int var5 = this.qy[var3 + 1];
                if (this.ky[var4] > this.ky[var5]) {
                    this.qy[var3] = var5;
                    this.qy[var3 + 1] = var4;
                    var2 = false;
                }
            }
        }

        if (this.fy > 20) {
            this.fy = 20;
        }

        if (this.fy > 0) {
            var3 = -1;

            for(var4 = 0; var4 < this.fy; ++var4) {
                if (this.iy[this.qy[var4]] != null && this.iy[this.qy[var4]].length() > 0) {
                    var3 = var4;
                    break;
                }
            }

            String var8 = null;
            if ((this.ax >= 0 || this.lx >= 0) && this.fy == 1) {
                var8 = "Choose a target";
            } else if ((this.ax >= 0 || this.lx >= 0) && this.fy > 1) {
                var8 = "@whi@" + this.jy[this.qy[0]] + " " + this.iy[this.qy[0]];
            } else if (var3 != -1) {
                var8 = this.iy[this.qy[var3]] + ": @whi@" + this.jy[this.qy[0]];
            }

            if (this.fy == 2 && var8 != null) {
                var8 = var8 + "@whi@ / 1 more option";
            }

            if (this.fy > 2 && var8 != null) {
                var8 = var8 + "@whi@ / " + (this.fy - 1) + " more options";
            }

            if (var8 != null) {
                this.lt.qf(var8, 6, 14, 1, 16776960);
            }

            if (!this.hy && this.ft == 1 || this.hy && this.ft == 1 && this.fy == 1) {
                this.jm(this.qy[0]);
                this.ft = 0;
                return;
            }

            if (!this.hy && this.ft == 2 || this.hy && this.ft == 1) {
                this.ey = (this.fy + 1) * 15;
                this.dy = this.lt.hf("Choose option", 1) + 5;

                for(int var6 = 0; var6 < this.fy; ++var6) {
                    int var7 = this.lt.hf(this.jy[var6] + " " + this.iy[var6], 1) + 5;
                    if (var7 > this.dy) {
                        this.dy = var7;
                    }
                }

                this.by = super.kq - this.dy / 2;
                this.cy = super.lq - 7;
                this.ay = true;
                if (this.by < 0) {
                    this.by = 0;
                }

                if (this.cy < 0) {
                    this.cy = 0;
                }

                if (this.by + this.dy > 510) {
                    this.by = 510 - this.dy;
                }

                if (this.cy + this.ey > 315) {
                    this.cy = 315 - this.ey;
                }

                this.ft = 0;
            }
        }

    }

    public void jm(int var1) {
        int var2 = this.ly[var1];
        int var3 = this.my[var1];
        int var4 = this.ny[var1];
        int var5 = this.oy[var1];
        int var6 = this.py[var1];
        int var7 = this.ky[var1];
        if (var7 == 200) {
            this.om(this.lv, this.mv, var2, var3, true);
            super.ed.a(224);
            super.ed.l(var2 + this.ku);
            super.ed.l(var3 + this.lu);
            super.ed.l(var4);
            super.ed.l(var5);
            this.sk();
            this.lx = -1;
        }

        if (var7 == 210) {
            this.om(this.lv, this.mv, var2, var3, true);
            super.ed.a(250);
            super.ed.l(var2 + this.ku);
            super.ed.l(var3 + this.lu);
            super.ed.l(var4);
            super.ed.l(var5);
            this.sk();
            this.ax = -1;
        }

        if (var7 == 220) {
            this.om(this.lv, this.mv, var2, var3, true);
            super.ed.a(252);
            super.ed.l(var2 + this.ku);
            super.ed.l(var3 + this.lu);
            super.ed.l(var4);
            this.sk();
        }

        if (var7 == 3200) {
            this.pk(GameData.whb[var4], 3);
        }

        if (var7 == 300) {
            this.fl(var2, var3, var4);
            super.ed.a(223);
            super.ed.l(var2 + this.ku);
            super.ed.l(var3 + this.lu);
            super.ed.m(var4);
            super.ed.l(var5);
            this.sk();
            this.lx = -1;
        }

        if (var7 == 310) {
            this.fl(var2, var3, var4);
            super.ed.a(239);
            super.ed.l(var2 + this.ku);
            super.ed.l(var3 + this.lu);
            super.ed.m(var4);
            super.ed.l(var5);
            this.sk();
            this.ax = -1;
        }

        if (var7 == 320) {
            this.fl(var2, var3, var4);
            super.ed.a(238);
            super.ed.l(var2 + this.ku);
            super.ed.l(var3 + this.lu);
            super.ed.m(var4);
            this.sk();
        }

        if (var7 == 2300) {
            this.fl(var2, var3, var4);
            super.ed.a(229);
            super.ed.l(var2 + this.ku);
            super.ed.l(var3 + this.lu);
            super.ed.m(var4);
            this.sk();
        }

        if (var7 == 3300) {
            this.pk(GameData.nkb[var4], 3);
        }

        if (var7 == 400) {
            this.rk(var2, var3, var4, var5);
            super.ed.a(222);
            super.ed.l(var2 + this.ku);
            super.ed.l(var3 + this.lu);
            super.ed.l(var6);
            this.sk();
            this.lx = -1;
        }

        if (var7 == 410) {
            this.rk(var2, var3, var4, var5);
            super.ed.a(241);
            super.ed.l(var2 + this.ku);
            super.ed.l(var3 + this.lu);
            super.ed.l(var6);
            this.sk();
            this.ax = -1;
        }

        if (var7 == 420) {
            this.rk(var2, var3, var4, var5);
            super.ed.a(242);
            super.ed.l(var2 + this.ku);
            super.ed.l(var3 + this.lu);
            this.sk();
        }

        if (var7 == 2400) {
            this.rk(var2, var3, var4, var5);
            super.ed.a(230);
            super.ed.l(var2 + this.ku);
            super.ed.l(var3 + this.lu);
            this.sk();
        }

        if (var7 == 3400) {
            this.pk(GameData.ckb[var4], 3);
        }

        if (var7 == 600) {
            super.ed.a(220);
            super.ed.l(var4);
            super.ed.l(var5);
            this.sk();
            this.lx = -1;
        }

        if (var7 == 610) {
            super.ed.a(240);
            super.ed.l(var4);
            super.ed.l(var5);
            this.sk();
            this.ax = -1;
        }

        if (var7 == 620) {
            super.ed.a(248);
            super.ed.l(var4);
            this.sk();
        }

        if (var7 == 630) {
            super.ed.a(249);
            super.ed.l(var4);
            this.sk();
        }

        if (var7 == 640) {
            super.ed.a(246);
            super.ed.l(var4);
            this.sk();
        }

        if (var7 == 650) {
            this.ax = var4;
            this.uw = 0;
            this.bx = GameData.vhb[this.xw[this.ax]][0];
        }

        if (var7 == 660) {
            super.ed.a(251);
            super.ed.l(var4);
            this.sk();
            this.ax = -1;
            this.uw = 0;
            this.pk("Dropping " + GameData.vhb[this.xw[var4]][0], 4);
        }

        if (var7 == 3600) {
            this.pk(GameData.whb[var4], 3);
        }

        int var8;
        int var9;
        if (var7 == 700) {
            var8 = (var2 - 64) / this.ot;
            var9 = (var3 - 64) / this.ot;
            this.jl(this.lv, this.mv, var8, var9, true);
            super.ed.a(225);
            super.ed.l(var4);
            super.ed.l(var5);
            this.sk();
            this.lx = -1;
        }

        if (var7 == 710) {
            var8 = (var2 - 64) / this.ot;
            var9 = (var3 - 64) / this.ot;
            this.jl(this.lv, this.mv, var8, var9, true);
            super.ed.a(243);
            super.ed.l(var4);
            super.ed.l(var5);
            this.sk();
            this.ax = -1;
        }

        if (var7 == 720) {
            var8 = (var2 - 64) / this.ot;
            var9 = (var3 - 64) / this.ot;
            this.jl(this.lv, this.mv, var8, var9, true);
            super.ed.a(245);
            super.ed.l(var4);
            this.sk();
        }

        if (var7 == 715 || var7 == 2715) {
            var8 = (var2 - 64) / this.ot;
            var9 = (var3 - 64) / this.ot;
            this.jl(this.lv, this.mv, var8, var9, true);
            super.ed.a(244);
            super.ed.l(var4);
            this.sk();
        }

        if (var7 == 3700) {
            this.pk(GameData.qib[var4], 3);
        }

        if (var7 == 800) {
            var8 = (var2 - 64) / this.ot;
            var9 = (var3 - 64) / this.ot;
            this.jl(this.lv, this.mv, var8, var9, true);
            super.ed.a(226);
            super.ed.l(var4);
            super.ed.l(var5);
            this.sk();
            this.lx = -1;
        }

        if (var7 == 810) {
            var8 = (var2 - 64) / this.ot;
            var9 = (var3 - 64) / this.ot;
            this.jl(this.lv, this.mv, var8, var9, true);
            super.ed.a(219);
            super.ed.l(var4);
            super.ed.l(var5);
            this.sk();
            this.ax = -1;
        }

        if (var7 == 805 || var7 == 2805) {
            var8 = (var2 - 64) / this.ot;
            var9 = (var3 - 64) / this.ot;
            this.jl(this.lv, this.mv, var8, var9, true);
            super.ed.a(228);
            super.ed.l(var4);
            this.sk();
        }

        if (var7 == 2810) {
            super.ed.a(235);
            super.ed.l(var4);
            this.sk();
        }

        if (var7 == 2820) {
            super.ed.a(214);
            super.ed.l(var4);
            this.sk();
        }

        if (var7 == 900) {
            this.jl(this.lv, this.mv, var2, var3, true);
            super.ed.a(221);
            super.ed.l(var2 + this.ku);
            super.ed.l(var3 + this.lu);
            super.ed.l(var4);
            this.sk();
            this.lx = -1;
        }

        if (var7 == 920) {
            this.jl(this.lv, this.mv, var2, var3, false);
            if (this.cu == -24) {
                this.cu = 24;
            }
        }

        if (var7 == 1000) {
            super.ed.a(227);
            super.ed.l(var4);
            this.sk();
            this.lx = -1;
        }

        if (var7 == 4000) {
            this.ax = -1;
            this.lx = -1;
        }

    }

    public mudclient() {
        this.ht = new int[this.gt];
        this.it = new int[this.gt];
        this.ot = 128;
        this.qt = 512;
        this.rt = 334;
        this.st = 9;
        this.vt = 40;
        this.au = -1;
        this.bu = -1;
        this.ju = -1;
        this.mu = -1;
        this.uu = 550;
        this.vu = false;
        this.yu = 1;
        this.av = 128;
        this.cv = 4000;
        this.dv = 500;
        this.hv = new Character[this.cv];
        this.iv = new Character[this.dv];
        this.jv = new Character[this.dv];
        this.kv = new Character();
        this.nv = -1;
        this.ov = 1000;
        this.pv = 500;
        this.sv = new Character[this.ov];
        this.tv = new Character[this.pv];
        this.uv = new Character[this.pv];
        this.vv = new int[500];
        this.wv = 500;
        this.zv = new int[this.wv];
        this.aw = new int[this.wv];
        this.bw = new int[this.wv];
        this.cw = new int[this.wv];
        this.dw = 1500;
        this.fw = new GameModel[this.dw];
        this.gw = new int[this.dw];
        this.hw = new int[this.dw];
        this.iw = new int[this.dw];
        this.jw = new int[this.dw];
        this.kw = new GameModel[200];
        this.lw = new boolean[this.dw];
        this.mw = 500;
        this.ow = new GameModel[this.mw];
        this.pw = new int[this.mw];
        this.qw = new int[this.mw];
        this.rw = new int[this.mw];
        this.sw = new int[this.mw];
        this.tw = new boolean[this.mw];
        this.vw = 30;
        this.xw = new int[35];
        this.yw = new int[35];
        this.zw = new int[35];
        this.ax = -1;
        this.bx = "";
        this.cx = new int[16];
        this.dx = new int[16];
        this.ex = new int[5];
        this.gx = new String[]{"Attack", "Defense", "Strength", "Hits", "Ranged", "Prayer", "Magic", "Cooking", "Woodcutting", "Fletching", "Fishing", "Firemaking", "Crafting", "Smithing", "Mining", "Herblaw"};
        this.hx = new String[]{"Armour", "WeaponAim", "WeaponPower", "Magic", "Prayer"};
        this.lx = -1;
        this.tx = 16;
        this.ux = new String[]{"Black knight's fortress", "Cook's assistant", "Demon slayer", "Doric's quest", "The restless ghost", "Goblin diplomacy", "Ernest the chicken", "Imp catcher", "Pirate's treasure", "Prince Ali rescue", "Romeo & Juliet", "Sheep shearer", "Shield of Arrav", "The knight's sword", "Vampire slayer", "Witch's potion"};
        this.vx = new boolean[this.tx];
        this.wx = new boolean[50];
        this.xx = false;
        this.yx = true;
        this.zx = false;
        this.ay = false;
        this.gy = 200;
        this.hy = false;
        this.iy = new String[this.gy];
        this.jy = new String[this.gy];
        this.ky = new int[this.gy];
        this.ly = new int[this.gy];
        this.my = new int[this.gy];
        this.ny = new int[this.gy];
        this.oy = new int[this.gy];
        this.py = new int[this.gy];
        this.qy = new int[this.gy];
        this.bz = 5;
        this.cz = new String[this.bz];
        this.dz = new int[this.bz];
        this.ez = false;
        this.fz = "";
        this.hz = new int[14];
        this.iz = new int[14];
        this.kz = new int[14];
        this.lz = new int[14];
        this.mz = false;
        this.nz = false;
        this.qz = false;
        this.tz = new int[256];
        this.uz = new int[256];
        this.vz = new int[256];
        this.wz = -1;
        this.xz = -2;
        this.yz = false;
        this.aab = new String[5];
        this.gab = "";
        this.kab = false;
        this.ibb = "";
        this.jbb = "";
        this.kbb = "";
        this.lbb = "";
        this.bdb = new int[20];
        this.qdb = false;
        this.udb = -1;
        this.vdb = new int[5];
        this.wdb = new int[5];
        this.xdb = new int[5];
        this.ydb = new int[5];
        this.zdb = new int[]{0, 1, 2, 3, 4};
        this.aeb = new String[5];
        this.ceb = new String[50];
        this.deb = new int[50];
        this.eeb = new int[50];
        this.feb = new int[50];
        this.geb = new int[50];
        this.ieb = new int[50];
        this.jeb = new int[50];
        this.keb = new int[50];
        this.leb = new int[50];
        this.neb = new int[50];
        this.oeb = new int[50];
        this.peb = new int[50];
        this.seb = new int[][]{{11, 2, 9, 7, 1, 6, 10, 0, 5, 8, 3, 4}, {11, 2, 9, 7, 1, 6, 10, 0, 5, 8, 3, 4}, {11, 3, 2, 9, 7, 1, 6, 10, 0, 5, 8, 4}, {3, 4, 2, 9, 7, 1, 6, 10, 8, 11, 0, 5}, {3, 4, 2, 9, 7, 1, 6, 10, 8, 11, 0, 5}, {4, 3, 2, 9, 7, 1, 6, 10, 8, 11, 0, 5}, {11, 4, 2, 9, 7, 1, 6, 10, 0, 5, 8, 3}, {11, 2, 9, 7, 1, 6, 10, 0, 5, 8, 4, 3}};
        this.teb = false;
        this.veb = 1;
        this.web = 2;
        this.xeb = 2;
        this.yeb = 8;
        this.zeb = 14;
        this.bfb = 1;
        this.cfb = new int[]{16711680, 16744448, 16769024, 10543104, 57344, 32768, 41088, 45311, 33023, 12528, 14680288, 3158064, 6307840, 8409088, 16777215};
        this.dfb = new int[]{16760880, 16752704, 8409136, 6307872, 3158064, 16736288, 16728064, 16777215, 65280, 65535};
        this.efb = new int[]{15523536, 13415270, 11766848, 10056486, 9461792};
        this.ffb = new int[]{0, 1, 2, 1};
        this.gfb = new int[]{0, 1, 2, 1, 0, 0, 0, 0};
        this.hfb = new int[]{0, 0, 0, 0, 0, 1, 2, 1};
        this.ifb = new String[]{"Where were you born?", "What was your first teacher's name?", "What is your father's middle name?", "Who was your first best friend?", "What is your favourite vacation spot?", "What is your mother's middle name?", "What was your first pet's name?", "What was the name of your first school?", "What is your mother's maiden name?", "Who was your first boyfriend/girlfriend?", "What was the first computer game you purchased?", "Who is your favourite actor/actress?", "Who is your favourite author?", "Who is your favourite musician?", "Who is your favourite cartoon character?", "What is your favourite book?", "What is your favourite food?", "What is your favourite movie?"};
    }
}
