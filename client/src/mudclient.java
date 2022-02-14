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
    final boolean disableAppletHostCheck = true; // inauthentic boolean controlling if applet will launch

    boolean xs = false;
    int ys;
    int zs;
    boolean at = false;
    boolean bt = false;
    public boolean appletMode = true;
    int dt;
    int et = 12345678;
    int ft;
    int gt = 8000;
    int[] ht;
    int[] it;
    Graphics jt;
    Scene scene;
    SurfaceSprite surface;
    Image mt;
    int nt;
    int ot;
    int loggedIn;
    int gameWidth;
    int gameHeight;
    int st;
    int tt;
    int spriteMedia;
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
    World world;
    int planeWidth;
    int planeHeight;
    int distanceBetweenFloors;
    int ju;
    int ku;
    int lu;
    int planeFloor;
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
    int playerCount;
    int fv;
    int gv;
    Character[] hv;
    Character[] players;
    Character[] jv;
    Character localPlayer;
    int localRegionX;
    int localRegionY;
    int serverIndex;
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
    int maxInventorySpaces;
    int inventoryItemsCount;
    int[] inventoryItemIds;
    int[] inventoryItemStackAmount;
    int[] inventoryItemWielded;
    int ax;
    String bx;
    int[] playerStatCur;
    int[] playerStatMax;
    int[] ex;
    int questPoints;
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
    boolean cameraModeAuto;
    boolean playerKiller;
    boolean ay;
    int by;
    int cy;
    int dy;
    int ey;
    int fy;
    int gy;
    boolean mouseButtonOne;
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
    int pkChangesLeft;
    int dab;
    int eab;
    int fab;
    String gab;
    int hab;
    int iab;
    int jab;
    boolean kab;
    int lab;
    int currentLoginScreen;
    Panel panelLoginWelcome;
    int controlWelcomeNewUser;
    int controlWelcomeExistingUser;
    Panel panelLoginNewUser;
    int rab;
    int sab;
    int tab;
    int uab;
    int vab;
    int wab;
    int xab;
    int yab;
    Panel panelLoginExistingUser;
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
    Panel panelAppearance;
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
    int yoptinOnboardingStage;
    Panel yoptinIncentiveExplanationPanel;
    Panel yoptinDemographicsPanel;
    Panel yoptinInterestsPanel;
    Panel yoptinPrivacyStatementPanel;
    Panel hcb;
    int yoptinDemographicsDetailsText;
    int yoptinDemographicsHonorific;
    int yoptinDemographicsFirstName;
    int yoptinDemographicsSurname;
    int yoptinDemographicsPostcode;
    int yoptinDemographicsHowManyChildren;
    int yoptinDemographicsCompanySize;
    int yoptinDemographicsWouldYouBuyOnInternet;
    int yoptinDemographicsEmailAddress;
    int yoptinDemographicsEmailRenderingCapabilities;
    int yoptinDemographicsRegisterMe;
    int yoptinDemographicsCountry;
    int yoptinDemographicsProfession;
    int yoptinDemographicsIndustrySector;
    int yoptinIncentiveYesSoundsGreatButton;
    int yoptinIncentiveNoThankyouButton;
    int viewYoptinPrivacyStatementButton;
    int yoptinInterestsPleaseIndicateText;
    int yoptinInterestsOkButton;
    int[] yoptinInterestsSelectedValues;
    int yoptinPrivacyStatementTextField;
    int yoptinPrivacyStatementOkButton;
    int yoptinDemographicsDayofBirth;
    int yoptinDemographicsMonthofBirth;
    int yoptinDemographicsYearofBirth;
    int hdb;
    int idb;
    int jdb;
    int yoptinDemographicsDayOfBirthButton;
    int yoptinDemographicsMonthofBirthButton;
    int yoptinDemographicsYearofBirthButton;
    int yoptinDemographicsDayofBirthText;
    int yoptinDemographicsMonthofBirthText;
    int yoptinDemographicsYearofBirthText;
    boolean qdb;
    Panel securityQuestionsPanel;
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
    boolean showAppearanceChange;
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

    public static void main(String[] args) {
        mudclient mc = new mudclient();
        mc.appletMode = false;
        // BEGIN INAUTHENTIC COMMAND LINE ARGUMENTS
        if(args.length > 0) {
            mc.serverAddress = args[0];
            System.out.println("Server set to: " + mc.serverAddress);
        }

        if(args.length > 1) {
            mc.port = Integer.parseInt(args[1]);
            System.out.println("Port set to: " + mc.port);
        }
        // END INAUTHENTIC COMMAND LINE ARGUMENTS
        mc.startApplication(mc.gameWidth, mc.gameHeight + 22, "Runescape by Andrew Gower", false);
        mc.jq = 10;
    }

    public void startGame() {
        if (this.appletMode && !disableAppletHostCheck) {
            String var1 = this.getDocumentBase().getHost().toLowerCase();
            if (!var1.endsWith("jagex.com") && !var1.endsWith("jagex.co.uk") && !var1.endsWith("runescape.com") && !var1.endsWith("runescape.co.uk") && !var1.endsWith("runescape.net") && !var1.endsWith("runescape.org") && !var1.endsWith("64.23.81.81") && !var1.endsWith("64.23.81.89") && !var1.endsWith("penguin.local") && !var1.endsWith("puffin.local") && !var1.endsWith("jagex.dnsalias.com")) {
                this.at = true;
                return;
            }
        }

        // super.port = 43594; // Inauthentic, commented out. Doesn't seem necessary since the port is already set to this value by default & interferes with inauthentic port argument
        super.pp = -11;
        GameConnection.wc = 1000;
        GameConnection.vc = false;
        GameConnection.protocolVersion = Version.hc;
        this.cl();
        this.spriteMedia = 2000;
        this.tt = this.spriteMedia + 100;
        this.yv = this.tt + 50;
        this.wt = this.yv + 300;
        this.jt = this.getGraphics();
        this.vj(50);
        this.surface = new SurfaceSprite(this.gameWidth, this.gameHeight + 12, 2600, this);
        this.surface.gs = this;
        this.surface.vf(0, 0, this.gameWidth, this.gameHeight + 12);
        Panel.bg = false;
        Panel.cg = this.tt;
        this.ix = new Panel(this.surface, 5);
        int var3 = this.surface.qj - 199;
        byte var2 = 36;
        this.jx = this.ix.tc(var3, var2 + 24, 196, 90, 1, 500, true);
        this.mx = new Panel(this.surface, 5);
        this.nx = this.mx.tc(var3, var2 + 40, 196, 126, 1, 500, true);
        this.qx = new Panel(this.surface, 5);
        this.rx = this.qx.tc(var3, var2 + 24, 196, 182, 1, 500, true);
        this.nm();
        this.fm(true);
        this.scene = new Scene(this.surface, 15000, 15000, 1000);
        this.scene.ii(this.gameWidth / 2, this.gameHeight / 2, this.gameWidth / 2, this.gameHeight / 2, this.gameWidth, this.st);
        this.scene.clipFar3d = 2400;
        this.scene.clipFar2d = 2400;
        this.scene.fogZFalloff = 1;
        this.scene.fogZDistance = 2300;
        this.scene.hi(-50, -10, -50);
        this.world = new World(this.scene, this.surface);
        this.world.yfb = this.spriteMedia;
        this.hm();
        this.pl();
        this.dn();
        this.qj(100, "Starting game...");
        this.createMessageTabPanel();
        this.createLoginPanels();
        this.createAppearancePanel();
        this.createYoptinPanel();
        this.createSecurityQuestionsPanel();
        this.resetLoginScreenVariables();
        this.drawHbar();
        this.bm();
    }

    public void cl() {
        if (this.inAppletMode() || wantToLoadFromJag) {
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
        if (this.inAppletMode() || wantToLoadFromJag) {
            var1 = null;

            try {
                var1 = this.gj("media" + Version.kc + ".jag", "2d graphics", 20);
            } catch (IOException var5) {
                System.out.println("Load error:" + var5);
            }

            this.surface.mg(var1, Utility.hn("inv1.tga", var1), this.spriteMedia, true, false);
            this.surface.kg(var1, Utility.hn("inv2.tga", var1), this.spriteMedia + 1, true, 1, 6, false);
            this.surface.mg(var1, Utility.hn("bubble.tga", var1), this.spriteMedia + 9, true, false);
            this.surface.mg(var1, Utility.hn("runescape.tga", var1), this.spriteMedia + 10, true, false);
            this.surface.rg(var1, Utility.hn("splat.tga", var1), this.spriteMedia + 11, true, 3, false);
            this.surface.kg(var1, Utility.hn("icon.tga", var1), this.spriteMedia + 14, true, 4, 2, false);
            this.surface.mg(var1, Utility.hn("hbar.tga", var1), this.spriteMedia + 22, false, false);
            this.surface.mg(var1, Utility.hn("hbar2.tga", var1), this.spriteMedia + 23, true, false);
            this.surface.mg(var1, Utility.hn("compass.tga", var1), this.spriteMedia + 24, true, false);
            this.surface.rg(var1, Utility.hn("scrollbar.tga", var1), this.tt, true, 2, false);
            this.surface.rg(var1, Utility.hn("corners.tga", var1), this.tt + 2, true, 4, false);
            this.surface.rg(var1, Utility.hn("arrows.tga", var1), this.tt + 6, true, 2, false);
            this.mt = this.lj(Utility.gn("hbar.tga", 0, var1));
            var2 = GameData.uhb;

            for(var3 = 1; var2 > 0; ++var3) {
                var4 = var2;
                var2 -= 30;
                if (var4 > 30) {
                    var4 = 30;
                }

                this.surface.kg(var1, Utility.hn("objects" + var3 + ".tga", var1), this.yv + (var3 - 1) * 30, true, 10, (var4 + 9) / 10, false);
            }

            this.surface.rg(var1, Utility.hn("projectile.tga", var1), this.wt, true, GameData.hlb, false);
        } else {
            var1 = new byte[100000];
            this.qj(20, "Loading 2d graphics");

            try {
                Utility.en("../gamedata/media/inv1.tga", var1, 100000);
                this.surface.mg(var1, 0, this.spriteMedia, true, false);
                Utility.en("../gamedata/media/inv2.tga", var1, 100000);
                this.surface.kg(var1, 0, this.spriteMedia + 1, true, 1, 6, false);
                Utility.en("../gamedata/media/bubble.tga", var1, 100000);
                this.surface.mg(var1, 0, this.spriteMedia + 9, true, false);
                Utility.en("../gamedata/media/runescape.tga", var1, 100000);
                this.surface.mg(var1, 0, this.spriteMedia + 10, true, false);
                Utility.en("../gamedata/media/splat.tga", var1, 100000);
                this.surface.rg(var1, 0, this.spriteMedia + 11, true, 3, false);
                Utility.en("../gamedata/media/icon.tga", var1, 100000);
                this.surface.kg(var1, 0, this.spriteMedia + 14, true, 4, 2, false);
                Utility.en("../gamedata/media/hbar.tga", var1, 100000);
                this.surface.mg(var1, 0, this.spriteMedia + 22, false, false);
                this.mt = this.lj(var1);
                Utility.en("../gamedata/media/hbar2.tga", var1, 100000);
                this.surface.mg(var1, 0, this.spriteMedia + 23, true, false);
                Utility.en("../gamedata/media/compass.tga", var1, 100000);
                this.surface.mg(var1, 0, this.spriteMedia + 24, true, false);
                Utility.en("../gamedata/media/scrollbar.tga", var1, 100000);
                this.surface.rg(var1, 0, this.tt, true, 2, false);
                Utility.en("../gamedata/media/corners.tga", var1, 100000);
                this.surface.rg(var1, 0, this.tt + 2, true, 4, false);
                Utility.en("../gamedata/media/arrows.tga", var1, 100000);
                this.surface.rg(var1, 0, this.tt + 6, true, 2, false);
                var2 = GameData.uhb;

                for(var3 = 1; var2 > 0; ++var3) {
                    var4 = var2;
                    var2 -= 30;
                    if (var4 > 30) {
                        var4 = 30;
                    }

                    Utility.en("../gamedata/media/objects" + var3 + ".tga", var1, 100000);
                    this.surface.kg(var1, 0, this.yv + (var3 - 1) * 30, true, 10, (var4 + 9) / 10, false);
                }

                Utility.en("../gamedata/media/projectile.tga", var1, 100000);
                this.surface.rg(var1, 0, this.wt, true, GameData.hlb, false);
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
        if ((this.inAppletMode() || wantToLoadFromJag) && var1) {
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
                if (this.inAppletMode() || wantToLoadFromJag) {
                    boolean var7 = true;
                    if (GameData.wjb[var4] != 0) {
                        var7 = false;
                    }

                    this.surface.rg(Utility.gn(var5 + ".tga", 0, var2), 0, this.reb, true, 15, var7);
                    var11 += 15;
                    if (GameData.xjb[var4] == 1) {
                        this.surface.rg(Utility.gn(var5 + "a.tga", 0, var2), 0, this.reb + 15, true, 3, true);
                        var11 += 3;
                    }

                    if (GameData.yjb[var4] == 1) {
                        this.surface.rg(Utility.gn(var5 + "f.tga", 0, var2), 0, this.reb + 18, true, 9, true);
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

                        this.surface.rg(var12, 0, this.reb, true, 15, var8);
                        if (GameData.xjb[var4] == 1) {
                            Utility.en("../gamedata/entity/" + var5 + "a.tga", var12, 300000);
                            var11 += 3;
                            this.surface.rg(var12, 0, this.reb + 15, true, 3, true);
                        }

                        if (GameData.yjb[var4] == 1) {
                            Utility.en("../gamedata/entity/" + var5 + "f.tga", var12, 300000);
                            var11 += 9;
                            this.surface.rg(var12, 0, this.reb + 18, true, 9, true);
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
        if (this.inAppletMode() || wantToLoadFromJag) {
            this.scene.ih("textures" + Version.mc + ".jag", 7, 11, 50, this);
        } else {
            this.qj(50, "Loading textures");
            this.scene.qi("../gamedata/textures");
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
        if (this.inAppletMode() || wantToLoadFromJag) {
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
        if (this.inAppletMode() || wantToLoadFromJag) {
            this.world.ggb = null;

            try {
                this.world.ggb = this.gj("maps" + Version.jc + ".jag", "map", 90);
            } catch (IOException var2) {
                System.out.println("Load error:" + var2);
            }
        } else {
            this.world.ufb = false;
        }
    }

    public void createMessageTabPanel() {
        this.vy = new Panel(this.surface, 10);
        this.wy = this.vy.dc(5, 269, 502, 56, 1, 20, true);
        this.xy = this.vy.ec(7, 324, 498, 14, 1, 80, false, true);
        this.yy = this.vy.dc(5, 269, 502, 56, 1, 20, true);
        this.zy = this.vy.dc(5, 269, 502, 56, 1, 20, true);
        this.vy.setFocus(this.xy);
    }

    public void nj() {
        if (!this.at) {
            if (!this.bt) {
                try {
                    ++this.dt;
                    if (this.loggedIn == 0) {
                        super.qp = 0;
                        this.handleLoginScreenInput();
                    }

                    if (this.loggedIn == 1) {
                        ++this.jab;
                        ++super.qp;
                        this.um();
                    }

                    if (this.ys > 0) {
                        --this.ys;
                    }

                    if (this.xs && this.ys == 0) {
                        this.xs = false;
                        super.clientStream.e();
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
                if (this.loggedIn == 0) {
                    this.surface.tk = false;
                    this.vm();
                }

                if (this.loggedIn == 1) {
                    this.surface.tk = true;
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
            if (this.surface != null) {
                this.surface.lg();
                this.surface.wj = null;
                this.surface = null;
            }

            if (this.scene != null) {
                this.scene.xi();
                this.scene = null;
            }

            this.kw = null;
            this.fw = null;
            this.ow = null;
            this.hv = null;
            this.players = null;
            this.sv = null;
            this.tv = null;
            this.localPlayer = null;
            if (this.world != null) {
                this.world.xgb = null;
                this.world.wallModels = null;
                this.world.roofModels = null;
                this.world.ahb = null;
                this.world = null;
            }

            System.gc();
        } catch (Exception var1) {
            ;
        }
    }

    public void drawHbar() {
        this.jt.drawImage(this.mt, 0, 0, this);
    }

    public void handleKeyPress(int keycode) {
        if (this.loggedIn == 0) {
            if (this.currentLoginScreen == 0) {
                this.panelLoginWelcome.handleKey(keycode);
            }

            if (this.currentLoginScreen == 1) {
                this.panelLoginNewUser.handleKey(keycode);
            }

            if (this.currentLoginScreen == 2) {
                this.panelLoginExistingUser.handleKey(keycode);
            }
        }

        if (this.loggedIn == 1) {
            if (this.yoptinOnboardingStage == 1) {
                this.yoptinIncentiveExplanationPanel.handleKey(keycode);
                return;
            }

            if (this.yoptinOnboardingStage == 2) {
                this.yoptinDemographicsPanel.handleKey(keycode);
                return;
            }

            if (this.yoptinOnboardingStage == 3) {
                this.yoptinInterestsPanel.handleKey(keycode);
                return;
            }

            if (this.yoptinOnboardingStage == 4) {
                this.yoptinPrivacyStatementPanel.handleKey(keycode);
                return;
            }

            if (this.showAppearanceChange) {
                this.panelAppearance.handleKey(keycode);
                return;
            }

            if (this.qdb) {
                if (this.udb == -1) {
                    this.securityQuestionsPanel.handleKey(keycode);
                }

                return;
            }

            if (this.fab == 0 && this.eab == 0) {
                this.vy.handleKey(keycode);
            }

            if (this.fab == 3 || this.fab == 4 || this.fab == 5) {
                this.fab = 0;
            }
        }

    }

    public void sk() {
        super.clientStream.h();
        this.xs = true;
        this.kb();
    }

    public void resetLoginScreenVariables() {
        this.loggedIn = 0;
        this.currentLoginScreen = 0;
        this.kbb = "";
        this.lbb = "";
        this.ibb = "Please enter a username:";
        this.jbb = "*" + this.kbb + "*";
        this.playerCount = 0;
        this.qv = 0;
    }

    public void dm() {
        super.tq = "";
        super.uq = "";
    }

    public void trylogout() {
        if (this.loggedIn != 0) {
            if (this.iab > 450) {
                this.pk("@cya@You can't logout during combat!", 3);
            } else if (this.iab > 0) {
                this.pk("@cya@You can't logout for 10 seconds after combat", 3);
            } else {
                super.clientStream.createOutgoingPacket(6);
                super.clientStream.sendPacket();
                this.hab = 1000;
            }
        }
    }

    public void createSecurityQuestionsPanel() {
        this.securityQuestionsPanel = new Panel(this.surface, 100);
        byte var1 = 8;
        this.sdb = this.securityQuestionsPanel.addText(256, var1, "@yel@Please provide 5 security questions in case you lose your password", 1, true);
        int var3 = var1 + 22;
        this.securityQuestionsPanel.addText(256, var3, "If you ever lose your password, you will need these to prove you own your account.", 1, true);
        var3 += 13;
        this.securityQuestionsPanel.addText(256, var3, "Your answers are encrypted and are ONLY used for password recovery purposes.", 1, true);
        var3 += 22;
        this.securityQuestionsPanel.addText(256, var3, "@ora@IMPORTANT:@whi@ To recover your password you must give the EXACT same answers you", 1, true);
        var3 += 13;
        this.securityQuestionsPanel.addText(256, var3, "give here. If you think you might forget an answer, or someone else could guess the", 1, true);
        var3 += 13;
        this.securityQuestionsPanel.addText(256, var3, "answer, then press the 'different question' button to get a better question.", 1, true);
        var3 += 35;

        for(int var2 = 0; var2 < 5; ++var2) {
            this.securityQuestionsPanel.addButtonBackground(170, var3, 310, 30);
            this.aeb[var2] = "~:" + this.zdb[var2];
            this.vdb[var2] = this.securityQuestionsPanel.addText(170, var3 - 7, var2 + 1 + ": " + this.ifb[this.zdb[var2]], 1, true);
            this.wdb[var2] = this.securityQuestionsPanel.cd(170, var3 + 7, 310, 30, 1, 80, false, true);
            this.securityQuestionsPanel.addButtonBackground(370, var3, 80, 30);
            this.securityQuestionsPanel.addText(370, var3 - 7, "Different", 1, true);
            this.securityQuestionsPanel.addText(370, var3 + 7, "Question", 1, true);
            this.xdb[var2] = this.securityQuestionsPanel.addButton(370, var3, 80, 30);
            this.securityQuestionsPanel.addButtonBackground(455, var3, 80, 30);
            this.securityQuestionsPanel.addText(455, var3 - 7, "Enter own", 1, true);
            this.securityQuestionsPanel.addText(455, var3 + 7, "Question", 1, true);
            this.ydb[var2] = this.securityQuestionsPanel.addButton(455, var3, 80, 30);
            var3 += 35;
        }

        this.securityQuestionsPanel.setFocus(this.wdb[0]);
        var3 += 10;
        this.securityQuestionsPanel.addButtonBackground(256, var3, 250, 30);
        this.securityQuestionsPanel.addText(256, var3, "Click here when finished", 4, true);
        this.tdb = this.securityQuestionsPanel.addButton(256, var3, 250, 30);
    }

    public void xk() {
        if (this.udb != -1) {
            if (super.uq.length() > 0) {
                this.aeb[this.udb] = super.uq;
                this.securityQuestionsPanel.updateText(this.vdb[this.udb], this.udb + 1 + ": " + this.aeb[this.udb]);
                this.securityQuestionsPanel.updateText(this.wdb[this.udb], "");
                this.udb = -1;
            }

        } else {
            this.securityQuestionsPanel.ud(super.kq, super.lq, super.nq, super.mq);

            int var3;
            for(int var1 = 0; var1 < 5; ++var1) {
                if (this.securityQuestionsPanel.isClicked(this.xdb[var1])) {
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
                    this.securityQuestionsPanel.updateText(this.vdb[var1], var1 + 1 + ": " + this.ifb[this.zdb[var1]]);
                    this.securityQuestionsPanel.updateText(this.wdb[var1], "");
                }
            }

            for(int var8 = 0; var8 < 5; ++var8) {
                if (this.securityQuestionsPanel.isClicked(this.ydb[var8])) {
                    this.udb = var8;
                    super.tq = "";
                    super.uq = "";
                }
            }

            if (this.securityQuestionsPanel.isClicked(this.tdb)) {
                var3 = 0;

                while(true) {
                    if (var3 >= 5) {
                        int var6;
                        for(int var9 = 0; var9 < 5; ++var9) {
                            String var5 = this.securityQuestionsPanel.getString(this.wdb[var9]);

                            for(var6 = 0; var6 < var9; ++var6) {
                                String var7 = this.securityQuestionsPanel.getString(this.wdb[var6]);
                                if (var5.equalsIgnoreCase(var7)) {
                                    this.securityQuestionsPanel.updateText(this.sdb, "@yel@Each question must have a different answer");
                                    return;
                                }
                            }
                        }

                        super.clientStream.createOutgoingPacket(208);

                        for(int var10 = 0; var10 < 5; ++var10) {
                            String var11 = this.aeb[var10];
                            if (var11 == null || var11.length() == 0) {
                                var11 = String.valueOf(var10 + 1);
                            }

                            if (var11.length() > 50) {
                                var11 = var11.substring(0, 50);
                            }

                            super.clientStream.putByte(var11.length());
                            super.clientStream.putString(var11);
                            super.clientStream.c(Utility.ln(this.securityQuestionsPanel.getString(this.wdb[var10])));
                        }

                        super.clientStream.sendPacket();

                        for(var6 = 0; var6 < 5; ++var6) {
                            this.zdb[var6] = var6;
                            this.aeb[var6] = "~:" + this.zdb[var6];
                            this.securityQuestionsPanel.updateText(this.wdb[var6], "");
                            this.securityQuestionsPanel.updateText(this.vdb[var6], var6 + 1 + ": " + this.ifb[this.zdb[var6]]);
                        }

                        this.surface.pf();
                        this.qdb = false;
                        break;
                    }

                    String var4 = this.securityQuestionsPanel.getString(this.wdb[var3]);
                    if (var4 == null || var4.length() < 3) {
                        this.securityQuestionsPanel.updateText(this.sdb, "@yel@Please provide a longer answer to question: " + (var3 + 1));
                        return;
                    }

                    ++var3;
                }
            }

        }
    }

    public void mk() {
        this.surface.pk = false;
        this.surface.pf();
        this.securityQuestionsPanel.hc();
        if (this.udb != -1) {
            short var1 = 150;
            this.surface.drawBox(26, var1, 460, 60, 0);
            this.surface.uf(26, var1, 460, 60, 16777215);
            int var2 = var1 + 22;
            this.surface.xg("Please enter your question", 256, var2, 4, 16777215);
            var2 += 25;
            this.surface.xg(super.tq + "*", 256, var2, 4, 16777215);
        }

        this.surface.drawSprite(0, this.gameHeight, this.spriteMedia + 22);
        this.surface.nf(this.jt, 0, 11);
    }

    public void createYoptinPanel() {
        this.yoptinIncentiveExplanationPanel = new Panel(this.surface, 100);
        this.yoptinIncentiveExplanationPanel.addText(256, 10, "Carry 5 extra objects at once in RuneScape!", 4, true);
        byte y_init = 45;
        byte spacing = 15;
        this.yoptinIncentiveExplanationPanel.addBoxRounded(256, y_init + spacing * 7 - 4, 400, (int)((double)spacing * 16.5D - 9.0D));
        this.yoptinIncentiveExplanationPanel.addText(256, y_init, "Please consider taking the time to answer a few questions and", 1, true);
        int y = y_init + spacing;
        this.yoptinIncentiveExplanationPanel.addText(256, y, "sign up for some great email offers with Yoptin. It's free!", 1, true);
        y += spacing;
        y += 12;
        this.yoptinIncentiveExplanationPanel.addText(256, y, "You will be sent the information YOU want about products,", 1, true);
        y += spacing;
        this.yoptinIncentiveExplanationPanel.addText(256, y, "services, and special-offers that fit your interests.", 1, true);
        y += spacing;
        this.yoptinIncentiveExplanationPanel.addText(256, y, "Should you ever decide that you don't want", 1, true);
        y += spacing;
        this.yoptinIncentiveExplanationPanel.addText(256, y, "to receive any additional Yoptin email, you can simply optout.", 1, true);
        y += spacing;
        y += 12;
        this.yoptinIncentiveExplanationPanel.addText(256, y, "@yel@Signing up will help us to continue to run the game for", 1, true);
        y += spacing;
        this.yoptinIncentiveExplanationPanel.addText(256, y, "@yel@free. So as a special thank-you, as long as you are a yoptin", 1, true);
        y += spacing;
        this.yoptinIncentiveExplanationPanel.addText(256, y, "@yel@member your player will be able to carry 5 extra items at once!", 1, true);
        y += spacing;
        y += 12;
        this.yoptinIncentiveExplanationPanel.addText(256, y, "After you have signed up we will email you a special personalised", 1, true);
        y += spacing;
        this.yoptinIncentiveExplanationPanel.addText(256, y, "code which you can use to active this bonus, so be sure to enter all", 1, true);
        y += spacing;
        this.yoptinIncentiveExplanationPanel.addText(256, y, "your details correctly.", 1, true);
        y += spacing;
        y += 30;
        this.yoptinIncentiveExplanationPanel.addButtonBackground(160, y, 150, 35);
        this.yoptinIncentiveExplanationPanel.addText(160, y, "Yes, sounds great!", 1, true);
        this.yoptinIncentiveYesSoundsGreatButton = this.yoptinIncentiveExplanationPanel.addButton(160, y, 150, 35);
        this.yoptinIncentiveExplanationPanel.addButtonBackground(352, y, 150, 35);
        this.yoptinIncentiveExplanationPanel.addText(352, y, "No thank-you", 1, true);
        this.yoptinIncentiveNoThankyouButton = this.yoptinIncentiveExplanationPanel.addButton(352, y, 150, 35);
        y += 30;
        this.yoptinIncentiveExplanationPanel.addText(256, y, "View Yoptin Privacy Statement", 1, true);
        this.viewYoptinPrivacyStatementButton = this.yoptinIncentiveExplanationPanel.addButton(256, y, 250, 20);
        this.yoptinDemographicsPanel = new Panel(this.surface, 100);
        this.yoptinDemographicsDetailsText = this.yoptinDemographicsPanel.addText(256, 5, "Please fill in the details below", 4, true);
        byte var3 = 85;
        short var4 = 155;
        y_init = 39;
        String[] honorifics = new String[]{"Mr", "Ms", "Miss", "Mrs"};
        this.yoptinDemographicsPanel.addBoxRounded(var3, y_init, var4, 35);
        this.yoptinDemographicsHonorific = this.yoptinDemographicsPanel.wc(var3, y_init, honorifics, 1, true);
        y = y_init + 39;
        this.yoptinDemographicsPanel.addBoxRounded(var3, y, var4, 35);
        this.yoptinDemographicsPanel.addText(var3, y - 9, "First Name", 1, true);
        this.yoptinDemographicsFirstName = this.yoptinDemographicsPanel.cd(var3, y + 9, var4, 20, 1, 30, false, true);
        this.yoptinDemographicsPanel.setFocus(this.yoptinDemographicsFirstName);
        y += 39;
        short var22 = 247;
        var4 = 155;
        y_init = 39;
        this.yoptinDemographicsPanel.addBoxRounded(var22, y_init, var4, 35);
        this.yoptinDemographicsPanel.addText(var22, y_init - 9, "Surname", 1, true);
        this.yoptinDemographicsSurname = this.yoptinDemographicsPanel.cd(var22, y_init + 9, var4, 20, 1, 30, false, true);
        y = y_init + 39;
        this.yoptinDemographicsPanel.addBoxRounded(var22, y, var4, 35);
        this.yoptinDemographicsPanel.addText(var22, y - 9, "Postcode", 1, true);
        this.yoptinDemographicsPostcode = this.yoptinDemographicsPanel.cd(var22, y + 9, var4, 20, 1, 20, false, true);
        y += 39;
        var22 = 165;
        var4 = 315;
        String[] childNumbers = new String[]{"None", "1", "2", "3", "4", "5", "6 or more"};
        this.yoptinDemographicsPanel.addBoxRounded(var22, y, var4, 35);
        this.yoptinDemographicsPanel.addText(var22, y - 9, "How many children live in your household?", 1, true);
        this.yoptinDemographicsHowManyChildren = this.yoptinDemographicsPanel.wc(var22, y + 9, childNumbers, 1, true);
        y += 39;
        String[] var7 = new String[]{"0", "1-50", "51-100", "101-250", "51-500", "500+"};
        this.yoptinDemographicsPanel.addBoxRounded(var22, y, var4, 35);
        this.yoptinDemographicsPanel.addText(var22, y - 9, "What is the size of your company?", 1, true);
        this.yoptinDemographicsCompanySize = this.yoptinDemographicsPanel.wc(var22, y + 9, var7, 1, true);
        y += 39;
        this.yoptinDemographicsPanel.addBoxRounded(var22, y, var4, 35);
        this.yoptinDemographicsDayofBirth = 15;
        this.yoptinDemographicsPanel.addSprite(var22 - 95 - 25, y + 6, Panel.cg + 7);
        this.hdb = this.yoptinDemographicsPanel.oc(var22 - 95 - 25, y + 6, 20, 20);
        this.yoptinDemographicsDayofBirthText = this.yoptinDemographicsPanel.addText(var22 - 95, y + 6, "15th", 1, true);
        this.yoptinDemographicsPanel.addSprite(var22 - 95 + 25, y + 6, Panel.cg + 6);
        this.yoptinDemographicsDayOfBirthButton = this.yoptinDemographicsPanel.oc(var22 - 95 + 25, y + 6, 20, 20);
        this.yoptinDemographicsMonthofBirth = 6;
        this.yoptinDemographicsPanel.addSprite(var22 - 40, y + 6, Panel.cg + 7);
        this.idb = this.yoptinDemographicsPanel.oc(var22 - 40, y + 6, 20, 20);
        this.yoptinDemographicsMonthofBirthText = this.yoptinDemographicsPanel.addText(var22, y + 6, "June", 1, true);
        this.yoptinDemographicsPanel.addSprite(var22 + 40, y + 6, Panel.cg + 6);
        this.yoptinDemographicsMonthofBirthButton = this.yoptinDemographicsPanel.oc(var22 + 40, y + 6, 20, 20);
        this.yoptinDemographicsYearofBirth = 1980;
        this.yoptinDemographicsPanel.addSprite(var22 + 95 - 30, y + 6, Panel.cg + 7);
        this.jdb = this.yoptinDemographicsPanel.oc(var22 + 95 - 30, y + 6, 20, 20);
        this.yoptinDemographicsYearofBirthText = this.yoptinDemographicsPanel.addText(var22 + 95, y + 6, "1980", 1, true);
        this.yoptinDemographicsPanel.addSprite(var22 + 95 + 30, y + 6, Panel.cg + 6);
        this.yoptinDemographicsYearofBirthButton = this.yoptinDemographicsPanel.oc(var22 + 95 + 30, y + 6, 20, 20);
        this.yoptinDemographicsPanel.addText(var22, y - 9, "Date of birth", 1, true);
        y += 39;
        String[] var8 = new String[]{"Would consider", "Have done already", "No"};
        this.yoptinDemographicsPanel.addBoxRounded(var22, y, var4, 35);
        this.yoptinDemographicsPanel.addText(var22, y - 9, "Would you consider buying over the internet?", 1, true);
        this.yoptinDemographicsWouldYouBuyOnInternet = this.yoptinDemographicsPanel.wc(var22, y + 9, var8, 1, true);
        y += 39;
        this.yoptinDemographicsPanel.addBoxRounded(var22, y, var4, 35);
        this.yoptinDemographicsPanel.addText(var22, y - 9, "Your email address", 1, true);
        this.yoptinDemographicsEmailAddress = this.yoptinDemographicsPanel.cd(var22, y + 9, var4, 20, 0, 80, false, true);
        y += 39;
        var3 = 85;
        var4 = 155;
        String[] emailRenderingCapabilities = new String[]{"Text", "Html", "AOL"};
        this.yoptinDemographicsPanel.addBoxRounded(var3, y, var4, 35);
        this.yoptinDemographicsPanel.addText(var3, y - 9, "You receive email in", 1, true);
        this.yoptinDemographicsEmailRenderingCapabilities = this.yoptinDemographicsPanel.wc(var3, y + 9, emailRenderingCapabilities, 1, true);
        var22 = 247;
        var4 = 155;
        this.yoptinDemographicsPanel.addButtonBackground(var22, y, var4, 35);
        this.yoptinDemographicsPanel.addText(var22, y, "Register me", 4, false);
        this.yoptinDemographicsRegisterMe = this.yoptinDemographicsPanel.addButton(var22, y, var4, 35);
        var22 = 420;
        y_init = 27;
        var4 = 175;
        this.yoptinDemographicsPanel.addText(var22, y_init - 11, "Country", 1, true);
        y = y_init + 40;
        String[] var10 = new String[]{"Albania", "Andorra", "Armenia", "Austria", "Azerbaijan", "Belgium", "Bosnia and Herzogvina", "Belarus", "Bulgaria", "Canada", "Croatia", "Cyprus", "Czech Republic", "Denmark", "Finland", "France", "Georgia", "Germany", "Gibraltar", "Greece", "Hungary", "Iceland", "Ireland", "Italy", "Latvia", "LIechtenstein", "Lithuania", "Luxembourg", "Macedonia", "Malta", "Moldova", "Monaco", "Netherlands", "Norway", "Portugal", "Romania", "Russia", "Slovakia", "Slovenia", "Spain", "Sweden", "Switzerland", "Turkey", "Ukraine", "United Kingdom", "United States", "Vatican", "Yugoslavia", "Other Country"};
        this.yoptinDemographicsPanel.addBoxRounded(var22, y, var4, 90);
        this.yoptinDemographicsCountry = this.yoptinDemographicsPanel.pc(var22 + 3, y, var4 - 6, 90, 0, 50, true);

        for(int var11 = 0; var11 < var10.length; ++var11) {
            this.yoptinDemographicsPanel.hd(this.yoptinDemographicsCountry, var11, var10[var11]);
        }

        this.yoptinDemographicsPanel.zc(this.yoptinDemographicsCountry, var10.length - 5);
        this.yoptinDemographicsPanel.ue[this.yoptinDemographicsCountry] = var10.length - 7;
        y += 70;
        this.yoptinDemographicsPanel.addText(var22, y - 11, "Your Profession", 1, true);
        y += 40;
        String[] var12 = new String[]{"Craftsman/Tradesman", "Farmer", "Housewife", "Manual/Factory worker", "Middle Manager/Technician", "Office/Clerical", "Profession/Senior Manager", "Self-employed/Business owner", "Shop worker", "Student", "Other"};
        this.yoptinDemographicsPanel.addBoxRounded(var22, y, var4, 90);
        this.yoptinDemographicsProfession = this.yoptinDemographicsPanel.pc(var22 + 3, y, var4 - 6, 90, 0, 50, true);

        for(int var13 = 0; var13 < var12.length; ++var13) {
            this.yoptinDemographicsPanel.hd(this.yoptinDemographicsProfession, var13, var12[var13]);
        }

        this.yoptinDemographicsPanel.zc(this.yoptinDemographicsProfession, 0);
        y += 70;
        this.yoptinDemographicsPanel.addText(var22, y - 11, "Industry sector", 1, true);
        y += 40;
        String[] var14 = new String[]{"Agriculture", "Bank/Finance", "Computers/Software/Internet", "Construction", "Corporate Services/Consulting", "Health", "Legal/Insurance", "Manufacturing/Industries", "Marketing/Advertising", "News/Media", "Supply/Trade", "Telecommunications/Networks", "Travel/Transportation", "Other"};
        this.yoptinDemographicsPanel.addBoxRounded(var22, y, var4, 90);
        this.yoptinDemographicsIndustrySector = this.yoptinDemographicsPanel.pc(var22 + 3, y, var4 - 6, 90, 0, 50, true);

        for(int var15 = 0; var15 < var14.length; ++var15) {
            this.yoptinDemographicsPanel.hd(this.yoptinDemographicsIndustrySector, var15, var14[var15]);
        }

        this.yoptinDemographicsPanel.zc(this.yoptinDemographicsIndustrySector, 0);
        y += 70;
        String[] var16 = new String[]{"Home computing", "Internet", "Telecommunication, IT", "CD-Rom, Games", "Music, CD, Video, DVD", "Books, Newspapers", "Sport", "Beauty, Health, Fitness", "Food and Wine", "Gifts, Flowers", "Pets", "Fashion, Clothing", "DIY, Interior Design, Gardening", "Cars, Motorbikes", "Leisure activities", "Travel, Holidays, Short Breaks", "Charity, Voluntary work", "Finances, Insurance", "Career, Jobs", "Lottery, Gambling, Betting"};
        this.yoptinInterestsPanel = new Panel(this.surface, 100);
        this.yoptinInterestsPleaseIndicateText = this.yoptinInterestsPanel.addText(256, 10, "@yel@Please indicate your interests", 4, true);
        this.yoptinInterestsPanel.addText(256, 25, "Your bonus code will then be emailed to you", 4, true);
        var22 = 32;
        y = 60;

        for(int var17 = 0; var17 < 20; ++var17) {
            this.yoptinInterestsSelectedValues[var17] = this.yoptinInterestsPanel.pd(var22, y - 9, 16);
            this.yoptinInterestsPanel.lc(var22 + 20, y, var16[var17], 3, true);
            y += 23;
            if (var17 == 9) {
                var22 = 256;
                y = 60;
            }
        }

        this.yoptinInterestsPanel.addButtonBackground(256, 310, 100, 32);
        this.yoptinInterestsPanel.addText(256, 310, "Ok", 4, true);
        this.yoptinInterestsOkButton = this.yoptinInterestsPanel.addButton(256, 310, 100, 32);
        this.yoptinPrivacyStatementPanel = new Panel(this.surface, 50);
        byte privY_init = 20;
        this.yoptinPrivacyStatementPanel.addText(250, privY_init, "Yoptin Privacy Statement", 5, true);
        int privY = privY_init + 30;
        this.yoptinPrivacyStatementPanel.ic(40, privY - 10, 420, 220);
        this.yoptinPrivacyStatementTextField = this.yoptinPrivacyStatementPanel.dc(50, privY, 400, 200, 1, 1000, true);
        privY += 240;
        this.yoptinPrivacyStatementPanel.addButtonBackground(256, privY, 170, 40);
        this.yoptinPrivacyStatementPanel.addText(256, privY, "Ok", 1, false);
        this.yoptinPrivacyStatementOkButton = this.yoptinPrivacyStatementPanel.addButton(256, privY, 170, 40);
        Panel pPanel = this.yoptinPrivacyStatementPanel;
        int pText = this.yoptinPrivacyStatementTextField;
        pPanel.addText(pText, "@yel@Privacy statement", false);
        pPanel.addText(pText, "Yoptin is a service offered by Consodata UK Ltd., a company that", false);
        pPanel.addText(pText, "specialises in the collection of households' and Internet users", false);
        pPanel.addText(pText, "consumption patterns. At Yoptin, we are committed to maintaining", false);
        pPanel.addText(pText, "your privacy. If we make changes to this policy, we will", false);
        pPanel.addText(pText, "immediately notify you by updating this statement on this web site.", false);
        pPanel.addText(pText, "", false);
        pPanel.addText(pText, "@yel@What will the data be used for?", false);
        pPanel.addText(pText, "Yoptin collects data about you, your interests and the subjects you", false);
        pPanel.addText(pText, "would like to receive email communications about. We use the", false);
        pPanel.addText(pText, "information you give us to make sure that what is sent to you is", false);
        pPanel.addText(pText, "relevant and as useful as possible. We may also merge the data we", false);
        pPanel.addText(pText, "gain from you with other data sources for profiling and marketing", false);
        pPanel.addText(pText, "purposes. Yoptin will manage the data under the guidelines of the", false);
        pPanel.addText(pText, "Data Protection Act 1988 and all information is processed in", false);
        pPanel.addText(pText, "accordance with the principles laid down by the Act.", false);
        pPanel.addText(pText, "Consodata UK Ltd will act as data controller and may pass the", false);
        pPanel.addText(pText, "information you provide to other companies, who will use the data", false);
        pPanel.addText(pText, "for their own market research and analysis purposes. These", false);
        pPanel.addText(pText, "carefully chosen companies may send you, by mail or other media,", false);
        pPanel.addText(pText, "details of their products and services where you have indicated", false);
        pPanel.addText(pText, "that you are happy to receive such communications.", false);
        pPanel.addText(pText, "", false);
        pPanel.addText(pText, "We comply with the standards, procedures and requirements laid", false);
        pPanel.addText(pText, "down by the UK Data Protection Act 1988, to ensure that the", false);
        pPanel.addText(pText, "personal information you give us is kept secure and processed", false);
        pPanel.addText(pText, "fairly and lawfully.", false);
        pPanel.addText(pText, "", false);
        pPanel.addText(pText, "@yel@Security", false);
        pPanel.addText(pText, "Your information is held on secure internal servers and is not", false);
        pPanel.addText(pText, "publicly available through this site.", false);
        pPanel.addText(pText, "", false);
        pPanel.addText(pText, "@yel@Your Feedback", false);
        pPanel.addText(pText, "By subscribing to this site, you consent to the information you", false);
        pPanel.addText(pText, "give us being processed for any of the purposes we have explained", false);
        pPanel.addText(pText, "above except where we have received your 'unsubscribe message'.", false);
        pPanel.addText(pText, "To unsubscribe simply send an email entitled UNSUBSCRIBE to us", false);
        pPanel.addText(pText, "at unsubscribe_uk@yoptin.com. If you have any queries or", false);
        pPanel.addText(pText, "complaints relating to our privacy policy, please email", false);
        pPanel.addText(pText, "membercare_uk@yoptin.com.", false);
        pPanel.addText(pText, "", false);
        pPanel.addText(pText, "Updated: 18 may 2001", false);
        pPanel.addText(pText, "To be reviewed: 18th October 2001", false);
    }

    public void cm() {
        this.surface.pk = false;
        this.surface.pf();
        if (this.yoptinOnboardingStage == 1) {
            this.yoptinIncentiveExplanationPanel.hc();
        }

        if (this.yoptinOnboardingStage == 2) {
            this.yoptinDemographicsPanel.hc();
        }

        if (this.yoptinOnboardingStage == 3) {
            this.yoptinInterestsPanel.hc();
        }

        if (this.yoptinOnboardingStage == 4) {
            this.yoptinPrivacyStatementPanel.hc();
        }

        this.surface.drawSprite(0, this.gameHeight, this.spriteMedia + 22);
        this.surface.nf(this.jt, 0, 11);
    }

    public void handleYoptinClicks() {
        if (this.yoptinOnboardingStage == 1) {
            this.yoptinIncentiveExplanationPanel.ud(super.kq, super.lq, super.nq, super.mq);
            if (this.yoptinIncentiveExplanationPanel.isClicked(this.yoptinIncentiveYesSoundsGreatButton)) {
                this.yoptinOnboardingStage = 2;
            }

            if (this.yoptinIncentiveExplanationPanel.isClicked(this.yoptinIncentiveNoThankyouButton)) {
                this.surface.pf();
                this.yoptinOnboardingStage = 0;
                super.clientStream.createOutgoingPacket(209);
                super.clientStream.sendPacket();
            }

            if (this.yoptinIncentiveExplanationPanel.isClicked(this.viewYoptinPrivacyStatementButton)) {
                this.yoptinOnboardingStage = 4;
                return;
            }
        } else if (this.yoptinOnboardingStage == 2) {
            String[] var1 = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
            this.yoptinDemographicsPanel.ud(super.kq, super.lq, super.nq, super.mq);
            if (this.yoptinDemographicsPanel.isClicked(this.hdb) && this.yoptinDemographicsDayofBirth > 1) {
                --this.yoptinDemographicsDayofBirth;
                if (this.yoptinDemographicsDayofBirth == 1) {
                    this.yoptinDemographicsPanel.updateText(this.yoptinDemographicsDayofBirthText, "1st");
                } else if (this.yoptinDemographicsDayofBirth == 2) {
                    this.yoptinDemographicsPanel.updateText(this.yoptinDemographicsDayofBirthText, "2nd");
                } else {
                    this.yoptinDemographicsPanel.updateText(this.yoptinDemographicsDayofBirthText, this.yoptinDemographicsDayofBirth + "th");
                }
            }

            if (this.yoptinDemographicsPanel.isClicked(this.yoptinDemographicsDayOfBirthButton) && this.yoptinDemographicsDayofBirth < 31) {
                ++this.yoptinDemographicsDayofBirth;
                if (this.yoptinDemographicsDayofBirth == 1) {
                    this.yoptinDemographicsPanel.updateText(this.yoptinDemographicsDayofBirthText, "1st");
                } else if (this.yoptinDemographicsDayofBirth == 2) {
                    this.yoptinDemographicsPanel.updateText(this.yoptinDemographicsDayofBirthText, "2nd");
                } else {
                    this.yoptinDemographicsPanel.updateText(this.yoptinDemographicsDayofBirthText, this.yoptinDemographicsDayofBirth + "th");
                }
            }

            if (this.yoptinDemographicsPanel.isClicked(this.idb) && this.yoptinDemographicsMonthofBirth > 1) {
                --this.yoptinDemographicsMonthofBirth;
                this.yoptinDemographicsPanel.updateText(this.yoptinDemographicsMonthofBirthText, var1[this.yoptinDemographicsMonthofBirth - 1]);
            }

            if (this.yoptinDemographicsPanel.isClicked(this.yoptinDemographicsMonthofBirthButton) && this.yoptinDemographicsMonthofBirth < 12) {
                ++this.yoptinDemographicsMonthofBirth;
                this.yoptinDemographicsPanel.updateText(this.yoptinDemographicsMonthofBirthText, var1[this.yoptinDemographicsMonthofBirth - 1]);
            }

            if (this.yoptinDemographicsPanel.isClicked(this.jdb) && this.yoptinDemographicsYearofBirth > 1900) {
                --this.yoptinDemographicsYearofBirth;
                this.yoptinDemographicsPanel.updateText(this.yoptinDemographicsYearofBirthText, String.valueOf(this.yoptinDemographicsYearofBirth));
            }

            if (this.yoptinDemographicsPanel.isClicked(this.yoptinDemographicsYearofBirthButton) && this.yoptinDemographicsYearofBirth < 2000) {
                ++this.yoptinDemographicsYearofBirth;
                this.yoptinDemographicsPanel.updateText(this.yoptinDemographicsYearofBirthText, String.valueOf(this.yoptinDemographicsYearofBirth));
            }

            if (this.yoptinDemographicsPanel.isClicked(this.yoptinDemographicsRegisterMe)) {
                if ((this.yoptinDemographicsPanel.getString(this.yoptinDemographicsFirstName) == null || this.yoptinDemographicsPanel.getString(this.yoptinDemographicsFirstName).length() != 0) && (this.yoptinDemographicsPanel.getString(this.yoptinDemographicsSurname) == null || this.yoptinDemographicsPanel.getString(this.yoptinDemographicsSurname).length() != 0) && (this.yoptinDemographicsPanel.getString(this.yoptinDemographicsPostcode) == null || this.yoptinDemographicsPanel.getString(this.yoptinDemographicsPostcode).length() != 0) && (this.yoptinDemographicsPanel.getString(this.yoptinDemographicsEmailAddress) == null || this.yoptinDemographicsPanel.getString(this.yoptinDemographicsEmailAddress).length() != 0) && this.yoptinDemographicsPanel.getSelection(this.yoptinDemographicsHonorific) != -1 && this.yoptinDemographicsPanel.getSelection(this.yoptinDemographicsHowManyChildren) != -1 && this.yoptinDemographicsPanel.getSelection(this.yoptinDemographicsCompanySize) != -1 && this.yoptinDemographicsPanel.getSelection(this.yoptinDemographicsWouldYouBuyOnInternet) != -1 && this.yoptinDemographicsPanel.getSelection(this.yoptinDemographicsEmailRenderingCapabilities) != -1 && this.yoptinDemographicsPanel.getSelection(this.yoptinDemographicsCountry) != -1 && this.yoptinDemographicsPanel.getSelection(this.yoptinDemographicsProfession) != -1 && this.yoptinDemographicsPanel.getSelection(this.yoptinDemographicsIndustrySector) != -1) {
                    this.yoptinOnboardingStage = 3;
                    return;
                }

                this.yoptinDemographicsPanel.updateText(this.yoptinDemographicsDetailsText, "@yel@Please fill in ALL requested details");
                return;
            }
        } else if (this.yoptinOnboardingStage == 3) {
            this.yoptinInterestsPanel.ud(super.kq, super.lq, super.nq, super.mq);
            if (this.yoptinInterestsPanel.isClicked(this.yoptinInterestsOkButton)) {
                boolean var4 = false;

                for(int var2 = 0; var2 < 20; ++var2) {
                    if (this.yoptinInterestsPanel.getSelection(this.yoptinInterestsSelectedValues[var2]) == 1) {
                        var4 = true;
                    }
                }

                if (!var4) {
                    this.yoptinInterestsPanel.updateText(this.yoptinInterestsPleaseIndicateText, "@red@Use the tickboxes below to indicate your interests");
                    return;
                }

                super.clientStream.createOutgoingPacket(210);
                super.clientStream.putString(Utility.makeLength(this.yoptinDemographicsPanel.getString(this.yoptinDemographicsFirstName), 30));
                super.clientStream.putString(Utility.makeLength(this.yoptinDemographicsPanel.getString(this.yoptinDemographicsSurname), 30));
                super.clientStream.putString(Utility.makeLength(this.yoptinDemographicsPanel.getString(this.yoptinDemographicsPostcode), 20));
                super.clientStream.putString(Utility.makeLength(this.yoptinDemographicsPanel.getString(this.yoptinDemographicsEmailAddress), 80));
                super.clientStream.putByte(this.yoptinDemographicsPanel.getSelection(this.yoptinDemographicsHonorific));
                super.clientStream.putByte(this.yoptinDemographicsPanel.getSelection(this.yoptinDemographicsHowManyChildren));
                super.clientStream.putByte(this.yoptinDemographicsPanel.getSelection(this.yoptinDemographicsCompanySize));
                super.clientStream.putByte(this.yoptinDemographicsPanel.getSelection(this.yoptinDemographicsWouldYouBuyOnInternet));
                super.clientStream.putByte(this.yoptinDemographicsPanel.getSelection(this.yoptinDemographicsEmailRenderingCapabilities));
                super.clientStream.putByte(this.yoptinDemographicsPanel.getSelection(this.yoptinDemographicsCountry));
                super.clientStream.putByte(this.yoptinDemographicsPanel.getSelection(this.yoptinDemographicsProfession));
                super.clientStream.putByte(this.yoptinDemographicsPanel.getSelection(this.yoptinDemographicsIndustrySector));
                super.clientStream.putByte(this.yoptinDemographicsDayofBirth);
                super.clientStream.putByte(this.yoptinDemographicsMonthofBirth);
                super.clientStream.putShort(this.yoptinDemographicsYearofBirth);

                for(int i = 0; i < 20; ++i) {
                    super.clientStream.putByte(this.yoptinInterestsPanel.getSelection(this.yoptinInterestsSelectedValues[i]));
                }

                super.clientStream.sendPacket();
                this.yoptinOnboardingStage = 0;
                return;
            }
        } else if (this.yoptinOnboardingStage == 4) {
            this.yoptinPrivacyStatementPanel.ud(super.kq, super.lq, super.nq, super.mq);
            if (this.yoptinPrivacyStatementPanel.isClicked(this.yoptinPrivacyStatementOkButton)) {
                this.yoptinOnboardingStage = 1;
            }
        }

    }

    public void createAppearancePanel() {
        this.panelAppearance = new Panel(this.surface, 100);
        this.panelAppearance.addText(256, 10, "Design Your Character", 4, true);
        short var1 = 140;
        byte var2 = 34;
        this.panelAppearance.addButtonBackground(var1, var2, 200, 25);
        this.panelAppearance.addText(var1, var2, "Appearance", 4, false);
        int var6 = var2 + 15;
        this.panelAppearance.addText(var1 - 55, var6 + 110, "Front", 3, true);
        this.panelAppearance.addText(var1, var6 + 110, "Side", 3, true);
        this.panelAppearance.addText(var1 + 55, var6 + 110, "Back", 3, true);
        byte var3 = 54;
        var6 += 145;
        this.panelAppearance.addBoxRounded(var1 - var3, var6, 53, 41);
        this.panelAppearance.addText(var1 - var3, var6 - 8, "Head", 1, true);
        this.panelAppearance.addText(var1 - var3, var6 + 8, "Type", 1, true);
        this.panelAppearance.addSprite(var1 - var3 - 40, var6, Panel.cg + 7);
        this.nbb = this.panelAppearance.addButton(var1 - var3 - 40, var6, 20, 20);
        this.panelAppearance.addSprite(var1 - var3 + 40, var6, Panel.cg + 6);
        this.obb = this.panelAppearance.addButton(var1 - var3 + 40, var6, 20, 20);
        this.panelAppearance.addBoxRounded(var1 + var3, var6, 53, 41);
        this.panelAppearance.addText(var1 + var3, var6 - 8, "Hair", 1, true);
        this.panelAppearance.addText(var1 + var3, var6 + 8, "Color", 1, true);
        this.panelAppearance.addSprite(var1 + var3 - 40, var6, Panel.cg + 7);
        this.pbb = this.panelAppearance.addButton(var1 + var3 - 40, var6, 20, 20);
        this.panelAppearance.addSprite(var1 + var3 + 40, var6, Panel.cg + 6);
        this.qbb = this.panelAppearance.addButton(var1 + var3 + 40, var6, 20, 20);
        var6 += 50;
        this.panelAppearance.addBoxRounded(var1 - var3, var6, 53, 41);
        this.panelAppearance.addText(var1 - var3, var6, "Gender", 1, true);
        this.panelAppearance.addSprite(var1 - var3 - 40, var6, Panel.cg + 7);
        this.rbb = this.panelAppearance.addButton(var1 - var3 - 40, var6, 20, 20);
        this.panelAppearance.addSprite(var1 - var3 + 40, var6, Panel.cg + 6);
        this.sbb = this.panelAppearance.addButton(var1 - var3 + 40, var6, 20, 20);
        this.panelAppearance.addBoxRounded(var1 + var3, var6, 53, 41);
        this.panelAppearance.addText(var1 + var3, var6 - 8, "Top", 1, true);
        this.panelAppearance.addText(var1 + var3, var6 + 8, "Color", 1, true);
        this.panelAppearance.addSprite(var1 + var3 - 40, var6, Panel.cg + 7);
        this.tbb = this.panelAppearance.addButton(var1 + var3 - 40, var6, 20, 20);
        this.panelAppearance.addSprite(var1 + var3 + 40, var6, Panel.cg + 6);
        this.ubb = this.panelAppearance.addButton(var1 + var3 + 40, var6, 20, 20);
        var6 += 50;
        this.panelAppearance.addBoxRounded(var1 - var3, var6, 53, 41);
        this.panelAppearance.addText(var1 - var3, var6 - 8, "Skin", 1, true);
        this.panelAppearance.addText(var1 - var3, var6 + 8, "Color", 1, true);
        this.panelAppearance.addSprite(var1 - var3 - 40, var6, Panel.cg + 7);
        this.vbb = this.panelAppearance.addButton(var1 - var3 - 40, var6, 20, 20);
        this.panelAppearance.addSprite(var1 - var3 + 40, var6, Panel.cg + 6);
        this.wbb = this.panelAppearance.addButton(var1 - var3 + 40, var6, 20, 20);
        this.panelAppearance.addBoxRounded(var1 + var3, var6, 53, 41);
        this.panelAppearance.addText(var1 + var3, var6 - 8, "Bottom", 1, true);
        this.panelAppearance.addText(var1 + var3, var6 + 8, "Color", 1, true);
        this.panelAppearance.addSprite(var1 + var3 - 40, var6, Panel.cg + 7);
        this.xbb = this.panelAppearance.addButton(var1 + var3 - 40, var6, 20, 20);
        this.panelAppearance.addSprite(var1 + var3 + 40, var6, Panel.cg + 6);
        this.ybb = this.panelAppearance.addButton(var1 + var3 + 40, var6, 20, 20);
        var1 = 372;
        var2 = 35;
        this.panelAppearance.addButtonBackground(var1, var2, 200, 25);
        this.panelAppearance.addText(var1, var2, "Character Type", 4, false);
        var6 = var2 + 22;
        this.panelAppearance.addText(var1, var6, "Each character type has different starting", 0, true);
        var6 += 13;
        this.panelAppearance.addText(var1, var6, "bonuses. But the choice you make here", 0, true);
        var6 += 13;
        this.panelAppearance.addText(var1, var6, "isn't permanent, and will change depending", 0, true);
        var6 += 13;
        this.panelAppearance.addText(var1, var6, "on how you play the game.", 0, true);
        var6 += 73;
        this.panelAppearance.addBoxRounded(var1, var6, 215, 125);
        String[] var4 = new String[]{"Adventurer", "Warrior", "Wizard", "Ranger", "Miner"};
        this.acb = this.panelAppearance.cc(var1, var6 + 2, var4, 3, true);
        var6 += 75;
        this.panelAppearance.addBoxRounded(var1, var6 + 21, 215, 60);
        this.panelAppearance.addText(var1, var6, "Do you wish to be able to fight with other", 0, true);
        var6 += 13;
        this.panelAppearance.addText(var1, var6, "players? Warning! If you choose 'yes' then", 0, true);
        var6 += 13;
        this.panelAppearance.addText(var1, var6, "other players will be able to attack you too!", 0, true);
        var6 += 13;
        String[] var5 = new String[]{"No thanks", "Yes I'll fight"};
        this.bcb = this.panelAppearance.wc(var1, var6, var5, 1, true);
        var6 += 32;
        this.panelAppearance.addButtonBackground(var1, var6, 200, 30);
        this.panelAppearance.addText(var1, var6, "Start Game", 4, false);
        this.zbb = this.panelAppearance.addButton(var1, var6, 200, 30);
    }

    public void qk() {
        this.surface.pk = false;
        this.surface.pf();
        this.panelAppearance.hc();
        short var1 = 140;
        byte var2 = 50;
        this.surface.pg(var1 - 32 - 55, var2, 64, 102, GameData.zjb[this.web], this.cfb[this.zeb]);
        this.surface.zf(var1 - 32 - 55, var2, 64, 102, GameData.zjb[this.veb], this.cfb[this.yeb], this.efb[this.afb], 0, false);
        this.surface.zf(var1 - 32 - 55, var2, 64, 102, GameData.zjb[this.ueb], this.dfb[this.xeb], this.efb[this.afb], 0, false);
        this.surface.pg(var1 - 32, var2, 64, 102, GameData.zjb[this.web] + 6, this.cfb[this.zeb]);
        this.surface.zf(var1 - 32, var2, 64, 102, GameData.zjb[this.veb] + 6, this.cfb[this.yeb], this.efb[this.afb], 0, false);
        this.surface.zf(var1 - 32, var2, 64, 102, GameData.zjb[this.ueb] + 6, this.dfb[this.xeb], this.efb[this.afb], 0, false);
        this.surface.pg(var1 - 32 + 55, var2, 64, 102, GameData.zjb[this.web] + 12, this.cfb[this.zeb]);
        this.surface.zf(var1 - 32 + 55, var2, 64, 102, GameData.zjb[this.veb] + 12, this.cfb[this.yeb], this.efb[this.afb], 0, false);
        this.surface.zf(var1 - 32 + 55, var2, 64, 102, GameData.zjb[this.ueb] + 12, this.dfb[this.xeb], this.efb[this.afb], 0, false);
        this.surface.drawSprite(0, this.gameHeight, this.spriteMedia + 22);
        this.surface.nf(this.jt, 0, 11);
    }

    public void bl() {
        this.panelAppearance.ud(super.kq, super.lq, super.nq, super.mq);
        if (this.panelAppearance.isClicked(this.nbb)) {
            do {
                do {
                    this.ueb = (this.ueb - 1 + GameData.sjb) % GameData.sjb;
                } while((GameData.wjb[this.ueb] & 3) != 1);
            } while((GameData.wjb[this.ueb] & 4 * this.bfb) == 0);
        }

        if (this.panelAppearance.isClicked(this.obb)) {
            do {
                do {
                    this.ueb = (this.ueb + 1) % GameData.sjb;
                } while((GameData.wjb[this.ueb] & 3) != 1);
            } while((GameData.wjb[this.ueb] & 4 * this.bfb) == 0);
        }

        if (this.panelAppearance.isClicked(this.pbb)) {
            this.xeb = (this.xeb - 1 + this.dfb.length) % this.dfb.length;
        }

        if (this.panelAppearance.isClicked(this.qbb)) {
            this.xeb = (this.xeb + 1) % this.dfb.length;
        }

        if (this.panelAppearance.isClicked(this.rbb) || this.panelAppearance.isClicked(this.sbb)) {
            for(this.bfb = 3 - this.bfb; (GameData.wjb[this.ueb] & 3) != 1 || (GameData.wjb[this.ueb] & 4 * this.bfb) == 0; this.ueb = (this.ueb + 1) % GameData.sjb) {
                ;
            }

            while((GameData.wjb[this.veb] & 3) != 2 || (GameData.wjb[this.veb] & 4 * this.bfb) == 0) {
                this.veb = (this.veb + 1) % GameData.sjb;
            }
        }

        if (this.panelAppearance.isClicked(this.tbb)) {
            this.yeb = (this.yeb - 1 + this.cfb.length) % this.cfb.length;
        }

        if (this.panelAppearance.isClicked(this.ubb)) {
            this.yeb = (this.yeb + 1) % this.cfb.length;
        }

        if (this.panelAppearance.isClicked(this.vbb)) {
            this.afb = (this.afb - 1 + this.efb.length) % this.efb.length;
        }

        if (this.panelAppearance.isClicked(this.wbb)) {
            this.afb = (this.afb + 1) % this.efb.length;
        }

        if (this.panelAppearance.isClicked(this.xbb)) {
            this.zeb = (this.zeb - 1 + this.cfb.length) % this.cfb.length;
        }

        if (this.panelAppearance.isClicked(this.ybb)) {
            this.zeb = (this.zeb + 1) % this.cfb.length;
        }

        if (this.panelAppearance.isClicked(this.zbb)) {
            super.clientStream.createOutgoingPacket(236);
            super.clientStream.putByte(this.bfb);
            super.clientStream.putByte(this.ueb);
            super.clientStream.putByte(this.veb);
            super.clientStream.putByte(this.web);
            super.clientStream.putByte(this.xeb);
            super.clientStream.putByte(this.yeb);
            super.clientStream.putByte(this.zeb);
            super.clientStream.putByte(this.afb);
            super.clientStream.putByte(this.panelAppearance.getSelection(this.acb));
            super.clientStream.putByte(this.panelAppearance.getSelection(this.bcb));
            super.clientStream.sendPacket();
            this.surface.pf();
            this.showAppearanceChange = false;
        }

    }

    public void createLoginPanels() {
        this.panelLoginWelcome = new Panel(this.surface, 50);
        byte var1 = 40;
        this.panelLoginWelcome.addText(256, 200 + var1, "Click on an option", 5, true);
        this.panelLoginWelcome.addButtonBackground(156, 240 + var1, 120, 35);
        this.panelLoginWelcome.addButtonBackground(356, 240 + var1, 120, 35);
        this.panelLoginWelcome.addText(156, 240 + var1, "New User", 5, false);
        this.panelLoginWelcome.addText(356, 240 + var1, "Existing User", 5, false);
        this.controlWelcomeNewUser = this.panelLoginWelcome.addButton(156, 240 + var1, 120, 35);
        this.controlWelcomeExistingUser = this.panelLoginWelcome.addButton(356, 240 + var1, 120, 35);
        this.panelLoginNewUser = new Panel(this.surface, 50);
        var1 = 5;
        this.rab = this.panelLoginNewUser.addText(256, var1 + 8, "To create an account please enter all the requested details", 4, true);
        int var2 = var1 + 25;
        this.panelLoginNewUser.addButtonBackground(256, var2 + 17, 250, 34);
        this.panelLoginNewUser.addText(256, var2 + 8, "Choose a Username", 4, false);
        this.vab = this.panelLoginNewUser.cd(256, var2 + 25, 200, 40, 4, 12, false, false);
        this.panelLoginNewUser.setFocus(this.vab);
        var2 += 40;
        this.panelLoginNewUser.addButtonBackground(141, var2 + 17, 220, 34);
        this.panelLoginNewUser.addText(141, var2 + 8, "Choose a Password", 4, false);
        this.wab = this.panelLoginNewUser.cd(141, var2 + 25, 220, 40, 4, 20, true, false);
        this.panelLoginNewUser.addButtonBackground(371, var2 + 17, 220, 34);
        this.panelLoginNewUser.addText(371, var2 + 8, "Confirm Password", 4, false);
        this.xab = this.panelLoginNewUser.cd(371, var2 + 25, 220, 40, 4, 20, true, false);
        var2 += 40;
        this.panelLoginNewUser.ic(46, var2, 420, 150);
        this.sab = this.panelLoginNewUser.dc(56, var2 + 5, 400, 140, 1, 1000, true);
        this.yk(this.panelLoginNewUser, this.sab);
        var2 += 160;
        this.yab = this.panelLoginNewUser.vc(120, var2, 14);
        this.panelLoginNewUser.lc(135, var2, "I agree to the terms+conditions above", 4, true);
        var2 += 20;
        this.panelLoginNewUser.addButtonBackground(156, var2 + 17, 150, 34);
        this.panelLoginNewUser.addText(156, var2 + 17, "Submit", 5, false);
        this.uab = this.panelLoginNewUser.addButton(156, var2 + 17, 150, 34);
        this.panelLoginNewUser.addButtonBackground(356, var2 + 17, 150, 34);
        this.panelLoginNewUser.addText(356, var2 + 17, "Cancel", 5, false);
        this.tab = this.panelLoginNewUser.addButton(356, var2 + 17, 150, 34);
        this.panelLoginExistingUser = new Panel(this.surface, 50);
        short var3 = 230;
        this.abb = this.panelLoginExistingUser.addText(256, var3 - 10, "Please enter your username and password", 4, true);
        var2 = var3 + 28;
        this.panelLoginExistingUser.addButtonBackground(146, var2, 200, 40);
        this.panelLoginExistingUser.addText(146, var2 - 10, "Username:", 4, false);
        this.bbb = this.panelLoginExistingUser.cd(146, var2 + 10, 200, 40, 4, 12, false, false);
        var2 += 47;
        this.panelLoginExistingUser.addButtonBackground(195, var2, 200, 40);
        this.panelLoginExistingUser.addText(195, var2 - 10, "Password:", 4, false);
        this.cbb = this.panelLoginExistingUser.cd(195, var2 + 10, 200, 40, 4, 20, true, false);
        var2 -= 45;
        this.panelLoginExistingUser.addButtonBackground(410, var2, 110, 25);
        this.panelLoginExistingUser.addText(410, var2, "Ok", 4, false);
        this.dbb = this.panelLoginExistingUser.addButton(410, var2, 110, 25);
        var2 += 30;
        this.panelLoginExistingUser.addButtonBackground(410, var2, 110, 25);
        this.panelLoginExistingUser.addText(410, var2, "Cancel", 4, false);
        this.ebb = this.panelLoginExistingUser.addButton(410, var2, 110, 25);
        this.panelLoginExistingUser.setFocus(this.bbb);
    }

    public void vm() {
        this.surface.pk = false;
        this.surface.pf();
        if (this.currentLoginScreen == 0 || this.currentLoginScreen == 2) {
            int var1 = this.dt * 2 % 3072;
            if (var1 < 1024) {
                this.surface.drawSprite(0, 10, 2500);
                if (var1 > 768) {
                    this.surface.tg(0, 10, 2501, var1 - 768);
                }
            } else if (var1 < 2048) {
                this.surface.drawSprite(0, 10, 2501);
                if (var1 > 1792) {
                    this.surface.tg(0, 10, this.spriteMedia + 10, var1 - 1792);
                }
            } else {
                this.surface.drawSprite(0, 10, this.spriteMedia + 10);
                if (var1 > 2816) {
                    this.surface.tg(0, 10, 2500, var1 - 2816);
                }
            }
        }

        if (this.currentLoginScreen == 0) {
            this.panelLoginWelcome.hc();
        }

        if (this.currentLoginScreen == 1) {
            this.panelLoginNewUser.hc();
        }

        if (this.currentLoginScreen == 2) {
            this.panelLoginExistingUser.hc();
        }

        this.surface.drawSprite(0, this.gameHeight, this.spriteMedia + 22);
        this.surface.nf(this.jt, 0, 11);
    }

    public void bm() {
        byte var1 = 0;
        byte var2 = 50;
        byte var3 = 50;
        this.world.loadSections(var2 * 48 + 23, var3 * 48 + 23, var1);
        this.world.addModels(this.kw);
        short var4 = 9728;
        short var5 = 6400;
        short var6 = 1100;
        short var7 = 888;
        this.scene.clipFar3d = 4100;
        this.scene.clipFar2d = 4100;
        this.scene.fogZFalloff = 1;
        this.scene.fogZDistance = 4000;
        this.scene.setCamera(var4, -this.world.getElevation(var4, var5), var5, 912, var7, 0, var6 * 2);
        this.scene.render();
        this.surface.fade2black();
        this.surface.fade2black();
        this.surface.drawBox(0, 0, 512, 6, 0);

        for(int var8 = 6; var8 >= 1; --var8) {
            this.surface.drawLineAlpha(0, var8, 0, var8, 512, 8);
        }

        this.surface.drawBox(0, 194, 512, 20, 0);

        for(int var9 = 6; var9 >= 1; --var9) {
            this.surface.drawLineAlpha(0, var9, 0, 194 - var9, 512, 8);
        }

        this.surface.drawSprite(15, 15, this.spriteMedia + 10);
        this.surface.drawSprite(2500, 0, 0, 512, 200);
        var4 = 9216;
        var5 = 9216;
        var6 = 1100;
        var7 = 888;
        this.scene.clipFar3d = 4100;
        this.scene.clipFar2d = 4100;
        this.scene.fogZFalloff = 1;
        this.scene.fogZDistance = 4000;
        this.scene.setCamera(var4, -this.world.getElevation(var4, var5), var5, 912, var7, 0, var6 * 2);
        this.scene.render();
        this.surface.fade2black();
        this.surface.fade2black();
        this.surface.drawBox(0, 0, 512, 6, 0);

        for(int var10 = 6; var10 >= 1; --var10) {
            this.surface.drawLineAlpha(0, var10, 0, var10, 512, 8);
        }

        this.surface.drawBox(0, 194, 512, 20, 0);

        for(int var11 = 6; var11 >= 1; --var11) {
            this.surface.drawLineAlpha(0, var11, 0, 194 - var11, 512, 8);
        }

        this.surface.drawSprite(15, 15, this.spriteMedia + 10);
        this.surface.drawSprite(2501, 0, 0, 512, 200);

        for(int var12 = 0; var12 < 64; ++var12) {
            this.scene.freeModel(this.world.roofModels[0][var12]);
            this.scene.freeModel(this.world.wallModels[1][var12]);
            this.scene.freeModel(this.world.roofModels[1][var12]);
            this.scene.freeModel(this.world.wallModels[2][var12]);
            this.scene.freeModel(this.world.roofModels[2][var12]);
        }

        var4 = 11136;
        var5 = 10368;
        var6 = 500;
        var7 = 376;
        this.scene.clipFar3d = 4100;
        this.scene.clipFar2d = 4100;
        this.scene.fogZFalloff = 1;
        this.scene.fogZDistance = 4000;
        this.scene.setCamera(var4, -this.world.getElevation(var4, var5), var5, 912, var7, 0, var6 * 2);
        this.scene.render();
        this.surface.fade2black();
        this.surface.fade2black();
        this.surface.drawBox(0, 0, 512, 6, 0);

        for(int var13 = 6; var13 >= 1; --var13) {
            this.surface.drawLineAlpha(0, var13, 0, var13, 512, 8);
        }

        this.surface.drawBox(0, 194, 512, 20, 0);

        for(int var14 = 6; var14 >= 1; --var14) {
            this.surface.drawLineAlpha(0, var14, 0, 194, 512, 8);
        }

        this.surface.drawSprite(15, 15, this.spriteMedia + 10);
        this.surface.drawSprite(this.spriteMedia + 10, 0, 0, 512, 200);
    }

    public void handleLoginScreenInput() {
        if (this.currentLoginScreen == 0) {
            this.panelLoginWelcome.ud(super.kq, super.lq, super.nq, super.mq);
            if (this.panelLoginWelcome.isClicked(this.controlWelcomeNewUser)) {
                this.currentLoginScreen = 1;
                this.panelLoginNewUser.updateText(this.vab, "");
                this.panelLoginNewUser.updateText(this.wab, "");
                this.panelLoginNewUser.updateText(this.xab, "");
                this.panelLoginNewUser.setFocus(this.vab);
                this.panelLoginNewUser.zc(this.yab, 0);
                this.panelLoginNewUser.updateText(this.rab, "To create an account please enter all the requested details");
            }

            if (this.panelLoginWelcome.isClicked(this.controlWelcomeExistingUser)) {
                this.currentLoginScreen = 2;
                this.panelLoginExistingUser.updateText(this.abb, "Please enter your username and password");
                this.panelLoginExistingUser.updateText(this.bbb, "");
                this.panelLoginExistingUser.updateText(this.cbb, "");
                this.panelLoginExistingUser.setFocus(this.bbb);
                return;
            }
        } else if (this.currentLoginScreen == 1) {
            this.panelLoginNewUser.ud(super.kq, super.lq, super.nq, super.mq);
            if (this.panelLoginNewUser.isClicked(this.vab)) {
                this.panelLoginNewUser.setFocus(this.wab);
            }

            if (this.panelLoginNewUser.isClicked(this.wab)) {
                this.panelLoginNewUser.setFocus(this.xab);
            }

            if (this.panelLoginNewUser.isClicked(this.xab)) {
                this.panelLoginNewUser.setFocus(this.vab);
            }

            if (this.panelLoginNewUser.isClicked(this.tab)) {
                this.currentLoginScreen = 0;
            }

            if (this.panelLoginNewUser.isClicked(this.uab)) {
                if (this.panelLoginNewUser.getString(this.vab) != null && this.panelLoginNewUser.getString(this.vab).length() != 0 && this.panelLoginNewUser.getString(this.wab) != null && this.panelLoginNewUser.getString(this.wab).length() != 0) {
                    if (!this.panelLoginNewUser.getString(this.wab).equalsIgnoreCase(this.panelLoginNewUser.getString(this.xab))) {
                        this.panelLoginNewUser.updateText(this.rab, "@yel@The two passwords entered are not the same as each other!");
                        return;
                    }

                    if (this.panelLoginNewUser.getString(this.wab).length() < 5) {
                        this.panelLoginNewUser.updateText(this.rab, "@yel@Your password must be at least 5 letters long");
                        return;
                    }

                    if (this.panelLoginNewUser.getSelection(this.yab) == 0) {
                        this.panelLoginNewUser.updateText(this.rab, "@yel@You must agree to the terms+conditions to continue");
                        return;
                    }

                    this.panelLoginNewUser.updateText(this.rab, "Please wait... Creating new account");
                    this.vm();
                    this.zj();
                    String var1 = this.panelLoginNewUser.getString(this.vab);
                    String var2 = this.panelLoginNewUser.getString(this.wab);
                    this.fb(var1, var2, "null", 0, 0, 0);
                    return;
                }

                this.panelLoginNewUser.updateText(this.rab, "@yel@Please fill in ALL requested information to continue!");
                return;
            }
        } else if (this.currentLoginScreen == 2) {
            this.panelLoginExistingUser.ud(super.kq, super.lq, super.nq, super.mq);
            if (this.panelLoginExistingUser.isClicked(this.ebb)) {
                this.currentLoginScreen = 0;
            }

            if (this.panelLoginExistingUser.isClicked(this.bbb)) {
                this.panelLoginExistingUser.setFocus(this.cbb);
            }

            if (this.panelLoginExistingUser.isClicked(this.cbb) || this.panelLoginExistingUser.isClicked(this.dbb)) {
                this.kbb = this.panelLoginExistingUser.getString(this.bbb);
                this.lbb = this.panelLoginExistingUser.getString(this.cbb);
                this.login(this.kbb, this.lbb);
            }
        }

    }

    public void showLoginScreenStatus(String var1, String var2) {
        if (this.currentLoginScreen == 1) {
            this.panelLoginNewUser.updateText(this.rab, var1 + " " + var2);
        }

        if (this.currentLoginScreen == 2) {
            this.panelLoginExistingUser.updateText(this.abb, var1 + " " + var2);
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
        this.currentLoginScreen = 0;
        this.loggedIn = 0;
        this.hab = 0;
    }

    public void v() {
        this.bab = 0;
        this.hab = 0;
        this.currentLoginScreen = 0;
        this.loggedIn = 1;
        this.dm();
        this.surface.pf();
        this.surface.nf(this.jt, 0, 11);

        for(int var1 = 0; var1 < this.ew; ++var1) {
            this.scene.freeModel(this.fw[var1]);
            this.world.yo(this.gw[var1], this.hw[var1], this.iw[var1]);
        }

        for(int var2 = 0; var2 < this.nw; ++var2) {
            this.scene.freeModel(this.ow[var2]);
            this.world.yn(this.pw[var2], this.qw[var2], this.rw[var2], this.sw[var2]);
        }

        this.ew = 0;
        this.nw = 0;
        this.xv = 0;
        this.playerCount = 0;

        for(int var3 = 0; var3 < this.cv; ++var3) {
            this.hv[var3] = null;
        }

        for(int var4 = 0; var4 < this.dv; ++var4) {
            this.players[var4] = null;
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
        String var1 = this.panelLoginNewUser.getString(this.vab);
        String var2 = this.panelLoginNewUser.getString(this.wab);
        this.currentLoginScreen = 2;
        this.panelLoginExistingUser.updateText(this.abb, "Please enter your username and password");
        this.panelLoginExistingUser.updateText(this.bbb, var1);
        this.panelLoginExistingUser.updateText(this.cbb, var2);
        this.vm();
        this.zj();
        this.login(var1, var2);
    }

    public void yk(Panel var1, int var2) {
        var1.addText(var2, "Runescape rules of use", false);
        var1.addText(var2, "", false);
        var1.addText(var2, "In order to keep runescape enjoyable for everyone there are a few", false);
        var1.addText(var2, "rules you must observe. You must agree to these rules to play", false);
        var1.addText(var2, "", false);
        var1.addText(var2, "When using the built in chat facility you must not use any language", false);
        var1.addText(var2, "which may be considered by others to be offensive, racist or", false);
        var1.addText(var2, "obscene. You must not use the chat facility to harass, threaten or", false);
        var1.addText(var2, "deceive other players.", false);
        var1.addText(var2, "", false);
        var1.addText(var2, "You must not exploit any cheats or errors which you find in the", false);
        var1.addText(var2, "game, to give yourself an unfair advantage. Any exploits which you", false);
        var1.addText(var2, "find must be immediately reported to Jagex Software.", false);
        var1.addText(var2, "", false);
        var1.addText(var2, "You must not attempt to use other programs in conjunction with", false);
        var1.addText(var2, "RuneScape to give yourself an unfair advantage at the game. You", false);
        var1.addText(var2, "may not use any bots or macros to control your character for you.", false);
        var1.addText(var2, "When you are not playing the game you must log-out. You may not", false);
        var1.addText(var2, "circumvent any of our mechanisms designed to log out inactive", false);
        var1.addText(var2, "players automatically.", false);
        var1.addText(var2, "", false);
        var1.addText(var2, "You must not create multiple characters and use them to help each", false);
        var1.addText(var2, "other. You may create more than one character, but if you do, you", false);
        var1.addText(var2, "may not log in more than one at any time, and they must not interact", false);
        var1.addText(var2, "with each other in any way. If you wish to form an adventuring", false);
        var1.addText(var2, "party you should do so by cooperating with other players in the game", false);
        var1.addText(var2, "", false);
        var1.addText(var2, "Terms and conditions", false);
        var1.addText(var2, "", false);
        var1.addText(var2, "You agree that your character and account in runescape, is the", false);
        var1.addText(var2, "property of, and remains the property of Jagex Software. You may", false);
        var1.addText(var2, "not sell, transfer, or lend your character to anyone else. We may", false);
        var1.addText(var2, "delete or modify your character at any time for any reason.", false);
        var1.addText(var2, "For instance failing to follow the rules above may be cause for", false);
        var1.addText(var2, "IMMEDIATE DELETION of all your characters.", false);
        var1.addText(var2, "", false);
        var1.addText(var2, "You agree that for purposes such as preventing offensive language", false);
        var1.addText(var2, "we may automatically or manually censor the chat as we see fit,", false);
        var1.addText(var2, "and that we may record the chat to help us identify offenders.", false);
        var1.addText(var2, "", false);
        var1.addText(var2, "No Warranty is supplied with this Software. All implied warranties", false);
        var1.addText(var2, "conditions or terms are excluded to the fullest extent permitted by", false);
        var1.addText(var2, "law. We do not warrant that the operation of the Software will be", false);
        var1.addText(var2, "uninterrupted or error free. We accept no responsibility for any", false);
        var1.addText(var2, "consequential or indirect loss or damages. You use this software at", false);
        var1.addText(var2, "your own risk, and assume full responsibility for any and all real,", false);
        var1.addText(var2, "claimed, or supposed damages that may occur as a result of running", false);
        var1.addText(var2, "this software.", false);
        var1.addText(var2, "", false);
        var1.addText(var2, "We reserve all rights related to the runescape name, logo, web site,", false);
        var1.addText(var2, "and game. All materials associated with runescape are protected", false);
        var1.addText(var2, "by UK copyright laws and all other applicable national laws, and", false);
        var1.addText(var2, "may not be copied, reproduced, republished, uploaded, posted,", false);
        var1.addText(var2, "transmitted, or distributed in any way without our prior written", false);
        var1.addText(var2, "consent. We reserve the right to modify or remove this game at any", false);
        var1.addText(var2, "time. You agree that we may change this service, and these terms", false);
        var1.addText(var2, "and conditions, as and when we deem necessary.", false);
        var1.addText(var2, "", false);
        var1.addText(var2, "We accept no responsibility for the actions of other users of our", false);
        var1.addText(var2, "website. You acknowledge that it is inpractical for us to control", false);
        var1.addText(var2, "and monitor everything that users do in our game or post on our", false);
        var1.addText(var2, "message boards, and that we therefore cannot be held responsible", false);
        var1.addText(var2, "for any abusive or inappropriate content which appears on our site", false);
        var1.addText(var2, "as a result.", false);
        var1.addText(var2, "", false);
        var1.addText(var2, "Occasionally we may accept ideas and game additions from the", false);
        var1.addText(var2, "players. You agree that by submitting material for inclusion in", false);
        var1.addText(var2, "runescape you are giving us a non-exclusive, perpetual, worldwide,", false);
        var1.addText(var2, "royalty-free license to use or modify the submission as we see", false);
        var1.addText(var2, "fit. You agree that you will not withdraw the submission or attempt", false);
        var1.addText(var2, "to make a charge for its use. Furthermore you warrant that you", false);
        var1.addText(var2, "are the exclusive copyright holder of the submission, and that the", false);
        var1.addText(var2, "submission in no way violates any other person or entity's rights", false);
        var1.addText(var2, "", false);
        var1.addText(var2, "These Terms shall be governed by the laws of England, and the", false);
        var1.addText(var2, "courts of England shall have exclusive jurisdiction in all matters", false);
        var1.addText(var2, "arising.", false);
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
            if (this.localPlayer.er == 8 || this.localPlayer.er == 9) {
                this.iab = 500;
            }

            if (this.iab > 0) {
                --this.iab;
            }

            if (this.yoptinOnboardingStage != 0) {
                this.handleYoptinClicks();
            } else if (this.showAppearanceChange) {
                this.bl();
            } else if (this.qdb) {
                this.xk();
            } else {
                int var3;
                int var5;
                int var6;
                int var7;
                for(int var1 = 0; var1 < this.playerCount; ++var1) {
                    Character var2 = this.players[var1];
                    var3 = (var2.waypointCurrent + 1) % 10;
                    if (var2.movingStep != var3) {
                        byte var4 = -1;
                        var5 = var2.movingStep;
                        if (var5 < var3) {
                            var6 = var3 - var5;
                        } else {
                            var6 = 10 + var3 - var5;
                        }

                        var7 = 4;
                        if (var6 > 2) {
                            var7 = (var6 - 1) * 4;
                        }

                        if (var2.waypointsX[var5] - var2.currentX <= this.ot * 3 && var2.waypointsY[var5] - var2.currentY <= this.ot * 3 && var2.waypointsX[var5] - var2.currentX >= -this.ot * 3 && var2.waypointsY[var5] - var2.currentY >= -this.ot * 3 && var6 <= 8) {
                            if (var2.currentX < var2.waypointsX[var5]) {
                                var2.currentX += var7;
                                ++var2.dr;
                                var4 = 2;
                            } else if (var2.currentX > var2.waypointsX[var5]) {
                                var2.currentX -= var7;
                                ++var2.dr;
                                var4 = 6;
                            }

                            if (var2.currentX - var2.waypointsX[var5] < var7 && var2.currentX - var2.waypointsX[var5] > -var7) {
                                var2.currentX = var2.waypointsX[var5];
                            }

                            if (var2.currentY < var2.waypointsY[var5]) {
                                var2.currentY += var7;
                                ++var2.dr;
                                if (var4 == -1) {
                                    var4 = 4;
                                } else if (var4 == 2) {
                                    var4 = 3;
                                } else {
                                    var4 = 5;
                                }
                            } else if (var2.currentY > var2.waypointsY[var5]) {
                                var2.currentY -= var7;
                                ++var2.dr;
                                if (var4 == -1) {
                                    var4 = 0;
                                } else if (var4 == 2) {
                                    var4 = 1;
                                } else {
                                    var4 = 7;
                                }
                            }

                            if (var2.currentY - var2.waypointsY[var5] < var7 && var2.currentY - var2.waypointsY[var5] > -var7) {
                                var2.currentY = var2.waypointsY[var5];
                            }
                        } else {
                            var2.currentX = var2.waypointsX[var5];
                            var2.currentY = var2.waypointsY[var5];
                        }

                        if (var4 != -1) {
                            var2.er = var4;
                        }

                        if (var2.currentX == var2.waypointsX[var5] && var2.currentY == var2.waypointsY[var5]) {
                            var2.movingStep = (var5 + 1) % 10;
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
                    var13 = (var10.waypointCurrent + 1) % 10;
                    if (var10.movingStep != var13) {
                        byte var11 = -1;
                        var6 = var10.movingStep;
                        if (var6 < var13) {
                            var7 = var13 - var6;
                        } else {
                            var7 = 10 + var13 - var6;
                        }

                        int var8 = 4;
                        if (var7 > 2) {
                            var8 = (var7 - 1) * 4;
                        }

                        if (var10.waypointsX[var6] - var10.currentX <= this.ot * 3 && var10.waypointsY[var6] - var10.currentY <= this.ot * 3 && var10.waypointsX[var6] - var10.currentX >= -this.ot * 3 && var10.waypointsY[var6] - var10.currentY >= -this.ot * 3 && var7 <= 8) {
                            if (var10.currentX < var10.waypointsX[var6]) {
                                var10.currentX += var8;
                                ++var10.dr;
                                var11 = 2;
                            } else if (var10.currentX > var10.waypointsX[var6]) {
                                var10.currentX -= var8;
                                ++var10.dr;
                                var11 = 6;
                            }

                            if (var10.currentX - var10.waypointsX[var6] < var8 && var10.currentX - var10.waypointsX[var6] > -var8) {
                                var10.currentX = var10.waypointsX[var6];
                            }

                            if (var10.currentY < var10.waypointsY[var6]) {
                                var10.currentY += var8;
                                ++var10.dr;
                                if (var11 == -1) {
                                    var11 = 4;
                                } else if (var11 == 2) {
                                    var11 = 3;
                                } else {
                                    var11 = 5;
                                }
                            } else if (var10.currentY > var10.waypointsY[var6]) {
                                var10.currentY -= var8;
                                ++var10.dr;
                                if (var11 == -1) {
                                    var11 = 0;
                                } else if (var11 == 2) {
                                    var11 = 1;
                                } else {
                                    var11 = 7;
                                }
                            }

                            if (var10.currentY - var10.waypointsY[var6] < var8 && var10.currentY - var10.waypointsY[var6] > -var8) {
                                var10.currentY = var10.waypointsY[var6];
                            }
                        } else {
                            var10.currentX = var10.waypointsX[var6];
                            var10.currentY = var10.waypointsY[var6];
                        }

                        if (var11 != -1) {
                            var10.er = var11;
                        }

                        if (var10.currentX == var10.waypointsX[var6] && var10.currentY == var10.waypointsY[var6]) {
                            var10.movingStep = (var6 + 1) % 10;
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

                for(var3 = 0; var3 < this.playerCount; ++var3) {
                    Character var14 = this.players[var3];
                    if (var14.cs > 0) {
                        --var14.cs;
                    }
                }

                if (this.xx) {
                    if (this.wu - this.localPlayer.currentX < -500 || this.wu - this.localPlayer.currentX > 500 || this.xu - this.localPlayer.currentY < -500 || this.xu - this.localPlayer.currentY > 500) {
                        this.wu = this.localPlayer.currentX;
                        this.xu = this.localPlayer.currentY;
                    }
                } else {
                    if (this.wu - this.localPlayer.currentX < -500 || this.wu - this.localPlayer.currentX > 500 || this.xu - this.localPlayer.currentY < -500 || this.xu - this.localPlayer.currentY > 500) {
                        this.wu = this.localPlayer.currentX;
                        this.xu = this.localPlayer.currentY;
                    }

                    if (this.wu != this.localPlayer.currentX) {
                        this.wu += (this.localPlayer.currentX - this.wu) / (16 + (this.uu - 500) / 15);
                    }

                    if (this.xu != this.localPlayer.currentY) {
                        this.xu += (this.localPlayer.currentY - this.xu) / (16 + (this.uu - 500) / 15);
                    }

                    if (this.cameraModeAuto) {
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

                if (super.lq > this.gameHeight - 4) {
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
                if (this.az > 0 && super.kq >= 494 && super.lq >= this.gameHeight - 66) {
                    super.nq = 0;
                }

                if (this.vy.isClicked(this.xy)) {
                    String var15 = this.vy.getString(this.xy);
                    this.vy.updateText(this.xy, "");
                    if (var15.equalsIgnoreCase("lostcon99") && !this.appletMode) {
                        super.clientStream.zb();
                    } else if (var15.equalsIgnoreCase("closecon99") && !this.appletMode) {
                        this.ob();
                    } else if (!this.y(var15)) {
                        this.localPlayer.mr = 150;
                        this.localPlayer.lr = var15;
                        this.pk(this.localPlayer.xq + ": " + var15, 2);
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

                this.scene.zh(super.kq, super.lq);
                super.nq = 0;
                if (this.cameraModeAuto) {
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

                this.scene.ki(17);
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
                        long var5 = Utility.username2hash(var4);

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
                this.vy.addText(this.wy, var1, true);
            } else {
                this.vy.addText(this.wy, var1, false);
            }
        }

        if (var2 == 5) {
            if (this.vy.ue[this.yy] == this.vy.ve[this.yy] - 4) {
                this.vy.addText(this.yy, var1, true);
            } else {
                this.vy.addText(this.yy, var1, false);
            }
        }

        if (var2 == 6) {
            if (this.vy.ue[this.zy] == this.vy.ve[this.zy] - 4) {
                this.vy.addText(this.zy, var1, true);
                return;
            }

            this.vy.addText(this.zy, var1, false);
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
            this.hv[var1].pid = var1;
            this.hv[var1].appearanceId = 0;
        }

        Character var5 = this.hv[var1];
        boolean var6 = false;

        for(int var7 = 0; var7 < this.fv; ++var7) {
            if (this.jv[var7].pid == var1) {
                var6 = true;
                break;
            }
        }

        if (var6) {
            var5.fr = var4;
            int var8 = var5.waypointCurrent;
            if (var2 != var5.waypointsX[var8] || var3 != var5.waypointsY[var8]) {
                var5.waypointCurrent = var8 = (var8 + 1) % 10;
                var5.waypointsX[var8] = var2;
                var5.waypointsY[var8] = var3;
            }
        } else {
            var5.pid = var1;
            var5.movingStep = 0;
            var5.waypointCurrent = 0;
            var5.waypointsX[0] = var5.currentX = var2;
            var5.waypointsY[0] = var5.currentY = var3;
            var5.fr = var5.er = var4;
            var5.dr = 0;
        }

        this.players[this.playerCount++] = var5;
        return var5;
    }

    public Character sm(int var1, int var2, int var3, int var4, int var5) {
        if (this.sv[var1] == null) {
            this.sv[var1] = new Character();
            this.sv[var1].pid = var1;
        }

        Character var6 = this.sv[var1];
        boolean var7 = false;

        for(int var8 = 0; var8 < this.rv; ++var8) {
            if (this.uv[var8].pid == var1) {
                var7 = true;
                break;
            }
        }

        if (var7) {
            var6.cr = var5;
            var6.fr = var4;
            int var9 = var6.waypointCurrent;
            if (var2 != var6.waypointsX[var9] || var3 != var6.waypointsY[var9]) {
                var6.waypointCurrent = var9 = (var9 + 1) % 10;
                var6.waypointsX[var9] = var2;
                var6.waypointsY[var9] = var3;
            }
        } else {
            var6.pid = var1;
            var6.movingStep = 0;
            var6.waypointCurrent = 0;
            var6.waypointsX[0] = var6.currentX = var2;
            var6.waypointsY[0] = var6.currentY = var3;
            var6.cr = var5;
            var6.fr = var6.er = var4;
            var6.dr = 0;
        }

        this.tv[this.qv++] = var6;
        return var6;
    }

    public void handleIncomingPacket(int opcode, int psize, byte[] pdata) {
        System.out.println(opcode); // TODO: remove
        int reusableInt1;
        try {
            int var8;
            int var9;
            int var10;
            int var12;
            int var13;
            int var14;
            int var15;
            int pdataIdx;
            int reusableInt0;
            byte var26;
            int var27;
            boolean var33;
            if (opcode == 255) {
                this.fv = this.playerCount;

                for(pdataIdx = 0; pdataIdx < this.fv; ++pdataIdx) {
                    this.jv[pdataIdx] = this.players[pdataIdx];
                }

                var26 = 8;
                this.localRegionX = Utility.readBits(pdata, var26, 10);
                reusableInt0 = var26 + 10;
                this.localRegionY = Utility.readBits(pdata, reusableInt0, 12);
                reusableInt0 += 12;
                reusableInt1 = Utility.readBits(pdata, reusableInt0, 4); // animation
                reusableInt0 += 4;
                boolean var28 = this.wm(this.localRegionX, this.localRegionY);
                this.localRegionX -= this.ku;
                this.localRegionY -= this.lu;
                var8 = this.localRegionX * this.ot + 64;
                var9 = this.localRegionY * this.ot + 64;
                if (var28) {
                    this.localPlayer.waypointCurrent = 0;
                    this.localPlayer.movingStep = 0;
                    this.localPlayer.currentX = this.localPlayer.waypointsX[0] = var8;
                    this.localPlayer.currentY = this.localPlayer.waypointsY[0] = var9;
                }

                this.playerCount = 0;
                this.localPlayer = this.vk(this.serverIndex, var8, var9, reusableInt1);
                var10 = Utility.readBits(pdata, reusableInt0, 8); // server's understood known players count
                reusableInt0 += 8;
                var27 = 0;

                while(true) {
                    int var34;
                    if (var27 >= var10) {
                        var12 = 0;

                        while(reusableInt0 + 24 < psize * 8) {
                            var13 = Utility.readBits(pdata, reusableInt0, 11); // pid
                            reusableInt0 += 11;
                            var14 = Utility.readBits(pdata, reusableInt0, 5); // x coord
                            reusableInt0 += 5;
                            if (var14 > 15) {
                                var14 -= 32;
                            }

                            var15 = Utility.readBits(pdata, reusableInt0, 5); // y coord
                            reusableInt0 += 5;
                            if (var15 > 15) {
                                var15 -= 32;
                            }

                            reusableInt1 = Utility.readBits(pdata, reusableInt0, 4); // animation
                            reusableInt0 += 4;
                            var34 = Utility.readBits(pdata, reusableInt0, 1); // new player (need to add to known players)
                            ++reusableInt0;
                            var8 = (this.localRegionX + var14) * this.ot + 64;
                            var9 = (this.localRegionY + var15) * this.ot + 64;
                            this.vk(var13, var8, var9, reusableInt1);
                            if (var34 == 0) {
                                this.vv[var12++] = var13;
                            }
                        }

                        if (var12 > 0) {
                            super.clientStream.createOutgoingPacket(254);
                            super.clientStream.putShort(var12); // number of known players

                            for(var13 = 0; var13 < var12; ++var13) {
                                Character player = this.hv[this.vv[var13]];
                                super.clientStream.putShort(player.pid);
                                super.clientStream.putShort(player.appearanceId);
                            }

                            super.clientStream.sendPacket();
                            var33 = false;
                            return;
                        }
                        break;
                    }

                    label878: {
                        Character var37 = this.jv[var27 + 1];
                        var13 = Utility.readBits(pdata, reusableInt0, 1);
                        ++reusableInt0;
                        if (var13 != 0) {
                            var14 = Utility.readBits(pdata, reusableInt0, 1);
                            ++reusableInt0;
                            if (var14 == 0) {
                                var15 = Utility.readBits(pdata, reusableInt0, 3);
                                reusableInt0 += 3;
                                var34 = var37.waypointCurrent;
                                int var17 = var37.waypointsX[var34];
                                int var18 = var37.waypointsY[var34];
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
                                var37.waypointCurrent = var34 = (var34 + 1) % 10;
                                var37.waypointsX[var34] = var17;
                                var37.waypointsY[var34] = var18;
                            } else {
                                var15 = Utility.readBits(pdata, reusableInt0, 4);
                                if ((var15 & 12) == 12) {
                                    reusableInt0 += 2;
                                    break label878;
                                }

                                var37.fr = Utility.readBits(pdata, reusableInt0, 4);
                                reusableInt0 += 4;
                            }
                        }

                        this.players[this.playerCount++] = var37;
                    }

                    ++var27;
                }
            } else {
                int reusableInt2;
                if (opcode == 254) {
                    pdataIdx = 1;

                    while(true) {
                        while(pdataIdx < psize) {
                            if (Utility.readByte(pdata[pdataIdx]) == 255) {
                                reusableInt0 = 0;
                                reusableInt1 = this.localRegionX + pdata[pdataIdx + 1] >> 3;
                                reusableInt2 = this.localRegionY + pdata[pdataIdx + 2] >> 3;
                                pdataIdx += 3;

                                for(var8 = 0; var8 < this.xv; ++var8) {
                                    var9 = (this.zv[var8] >> 3) - reusableInt1;
                                    var10 = (this.aw[var8] >> 3) - reusableInt2;
                                    if (var9 != 0 || var10 != 0) {
                                        if (var8 != reusableInt0) {
                                            this.zv[reusableInt0] = this.zv[var8];
                                            this.aw[reusableInt0] = this.aw[var8];
                                            this.bw[reusableInt0] = this.bw[var8];
                                            this.cw[reusableInt0] = this.cw[var8];
                                        }

                                        ++reusableInt0;
                                    }
                                }

                                this.xv = reusableInt0;
                            } else {
                                reusableInt0 = Utility.readShort(pdata, pdataIdx);
                                pdataIdx += 2;
                                reusableInt1 = this.localRegionX + pdata[pdataIdx++];
                                reusableInt2 = this.localRegionY + pdata[pdataIdx++];
                                if ((reusableInt0 & '耀') == 0) {
                                    this.zv[this.xv] = reusableInt1;
                                    this.aw[this.xv] = reusableInt2;
                                    this.bw[this.xv] = reusableInt0;
                                    this.cw[this.xv] = 0;

                                    for(var8 = 0; var8 < this.ew; ++var8) {
                                        if (this.gw[var8] == reusableInt1 && this.hw[var8] == reusableInt2) {
                                            this.cw[this.xv] = GameData.kkb[this.iw[var8]];
                                            break;
                                        }
                                    }

                                    ++this.xv;
                                } else {
                                    reusableInt0 &= 32767;
                                    var8 = 0;

                                    for(var9 = 0; var9 < this.xv; ++var9) {
                                        if (this.zv[var9] == reusableInt1 && this.aw[var9] == reusableInt2 && this.bw[var9] == reusableInt0) {
                                            reusableInt0 = -123;
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

                if (opcode == 253) {
                    pdataIdx = 1;

                    while(true) {
                        while(pdataIdx < psize) {
                            if (Utility.readByte(pdata[pdataIdx]) == 255) {
                                reusableInt0 = 0;
                                reusableInt1 = this.localRegionX + pdata[pdataIdx + 1] >> 3;
                                reusableInt2 = this.localRegionY + pdata[pdataIdx + 2] >> 3;
                                pdataIdx += 3;

                                for(var8 = 0; var8 < this.ew; ++var8) {
                                    var9 = (this.gw[var8] >> 3) - reusableInt1;
                                    var10 = (this.hw[var8] >> 3) - reusableInt2;
                                    if (var9 == 0 && var10 == 0) {
                                        this.scene.freeModel(this.fw[var8]);
                                        this.world.yo(this.gw[var8], this.hw[var8], this.iw[var8]);
                                    } else {
                                        if (var8 != reusableInt0) {
                                            this.fw[reusableInt0] = this.fw[var8];
                                            this.fw[reusableInt0].nh = reusableInt0;
                                            this.gw[reusableInt0] = this.gw[var8];
                                            this.hw[reusableInt0] = this.hw[var8];
                                            this.iw[reusableInt0] = this.iw[var8];
                                            this.jw[reusableInt0] = this.jw[var8];
                                        }

                                        ++reusableInt0;
                                    }
                                }

                                this.ew = reusableInt0;
                            } else {
                                reusableInt0 = Utility.readShort(pdata, pdataIdx);
                                pdataIdx += 2;
                                reusableInt1 = this.localRegionX + pdata[pdataIdx++];
                                reusableInt2 = this.localRegionY + pdata[pdataIdx++];
                                var8 = 0;

                                for(var9 = 0; var9 < this.ew; ++var9) {
                                    if (this.gw[var9] == reusableInt1 && this.hw[var9] == reusableInt2) {
                                        this.scene.freeModel(this.fw[var9]);
                                        this.world.yo(this.gw[var9], this.hw[var9], this.iw[var9]);
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
                                if (reusableInt0 != 60000) {
                                    var10 = this.world.bo(reusableInt1, reusableInt2);
                                    if (var10 != 0 && var10 != 4) {
                                        var12 = GameData.gkb[reusableInt0];
                                        var27 = GameData.hkb[reusableInt0];
                                    } else {
                                        var27 = GameData.gkb[reusableInt0];
                                        var12 = GameData.hkb[reusableInt0];
                                    }

                                    var13 = (reusableInt1 + reusableInt1 + var27) * this.ot / 2;
                                    var14 = (reusableInt2 + reusableInt2 + var12) * this.ot / 2;
                                    var15 = GameData.fkb[reusableInt0];
                                    GameModel var16 = this.kw[var15].ue();
                                    this.scene.yh(var16);
                                    var16.nh = this.ew;
                                    var16.ze(0, var10 * 32, 0);
                                    var16.ee(var13, -this.world.getElevation(var13, var14), var14);
                                    var16.we(true, 48, 48, -50, -10, -50);
                                    this.world.oo(reusableInt1, reusableInt2, reusableInt0);
                                    if (reusableInt0 == 74) {
                                        var16.ee(0, -480, 0);
                                    }

                                    this.gw[this.ew] = reusableInt1;
                                    this.hw[this.ew] = reusableInt2;
                                    this.iw[this.ew] = reusableInt0;
                                    this.jw[this.ew] = var10;
                                    this.fw[this.ew++] = var16;
                                }
                            }
                        }

                        return;
                    }
                }

                if (opcode == 252) { // inventory items
                    this.inventoryItemsCount = 0;

                    for(pdataIdx = 8; pdataIdx + 9 < psize * 8; ++this.inventoryItemsCount) {
                        reusableInt0 = Utility.readBits(pdata, pdataIdx, 10); // itemId
                        pdataIdx += 10;
                        reusableInt1 = 0; // wielded
                        if (GameData.itemWieldable[reusableInt0] != 0) {
                            reusableInt1 = Utility.readBits(pdata, pdataIdx, 1);
                            ++pdataIdx;
                        }

                        reusableInt2 = 1; // number in stack
                        if (GameData.itemStackable[reusableInt0] == 0) {
                            reusableInt2 = Utility.readBits(pdata, pdataIdx, 16);
                            pdataIdx += 16;
                        }

                        this.inventoryItemIds[this.inventoryItemsCount] = reusableInt0;
                        this.inventoryItemWielded[this.inventoryItemsCount] = reusableInt1;
                        this.inventoryItemStackAmount[this.inventoryItemsCount] = reusableInt2;
                    }

                    return;
                }

                Character var24;
                if (opcode == 250) {
                    pdataIdx = Utility.readShort(pdata, 1);
                    reusableInt0 = 3;

                    for(reusableInt1 = 0; reusableInt1 < pdataIdx; ++reusableInt1) {
                        reusableInt2 = Utility.readShort(pdata, reusableInt0);
                        reusableInt0 += 2;
                        var24 = this.hv[reusableInt2];
                        byte var29 = pdata[reusableInt0];
                        ++reusableInt0;
                        if (var29 == 0) {
                            var10 = Utility.readShort(pdata, reusableInt0);
                            reusableInt0 += 2;
                            if (var24 != null) {
                                var24.or = 150;
                                var24.nr = var10;
                            }
                        } else if (var29 == 1) {
                            byte var35 = pdata[reusableInt0];
                            ++reusableInt0;
                            if (var24 != null) {
                                String var36 = new String(pdata, reusableInt0, var35);
                                if (var36.startsWith("@que@")) {
                                    var24.mr = 150;
                                    var24.lr = var36;
                                    if (var24 == this.localPlayer) {
                                        this.pk("@yel@" + var24.xq + ": " + var24.lr, 5);
                                    }
                                } else if (var24 != this.localPlayer) {
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

                            reusableInt0 += var35;
                        } else if (var29 == 2) {
                            var10 = Utility.readByte(pdata[reusableInt0]);
                            ++reusableInt0;
                            var27 = Utility.readByte(pdata[reusableInt0]);
                            ++reusableInt0;
                            var12 = Utility.readByte(pdata[reusableInt0]);
                            ++reusableInt0;
                            if (var24 != null) {
                                var24.pr = var10;
                                var24.qr = var27;
                                var24.rr = var12;
                                var24.sr = 200;
                                if (var24 == this.localPlayer) {
                                    this.playerStatCur[3] = var27;
                                    this.playerStatMax[3] = var12;
                                }
                            }
                        } else if (var29 == 3) {
                            var10 = Utility.readShort(pdata, reusableInt0);
                            reusableInt0 += 2;
                            var27 = Utility.readShort(pdata, reusableInt0);
                            reusableInt0 += 2;
                            if (var24 != null) {
                                var24.zr = var10;
                                var24.bs = var27;
                                var24.as = -1;
                                var24.cs = this.vt;
                            }
                        } else if (var29 == 4) {
                            var10 = Utility.readShort(pdata, reusableInt0);
                            reusableInt0 += 2;
                            var27 = Utility.readShort(pdata, reusableInt0);
                            reusableInt0 += 2;
                            if (var24 != null) {
                                var24.zr = var10;
                                var24.as = var27;
                                var24.bs = -1;
                                var24.cs = this.vt;
                            }
                        } else if (var29 == 5) {
                            if (var24 == null) {
                                reusableInt0 += 14;
                                var10 = Utility.readByte(pdata[reusableInt0]);
                                reusableInt0 += var10 + 1;
                            } else {
                                var24.appearanceId = Utility.readShort(pdata, reusableInt0);
                                reusableInt0 += 2;
                                var24.wq = Utility.readLong(pdata, reusableInt0);
                                reusableInt0 += 8;
                                var24.xq = Utility.rn(var24.wq);
                                var10 = Utility.readByte(pdata[reusableInt0]);
                                ++reusableInt0;

                                for(var27 = 0; var27 < var10; ++var27) {
                                    var24.kr[var27] = Utility.readByte(pdata[reusableInt0]);
                                    ++reusableInt0;
                                }

                                for(var12 = var10; var12 < 12; ++var12) {
                                    var24.kr[var12] = 0;
                                }

                                var24.vr = pdata[reusableInt0++] & 255;
                                var24.wr = pdata[reusableInt0++] & 255;
                                var24.xr = pdata[reusableInt0++] & 255;
                                var24.yr = pdata[reusableInt0++] & 255;
                                var24.tr = pdata[reusableInt0++] & 255;
                                var24.ur = pdata[reusableInt0++] & 255;
                                var24.fs = pdata[reusableInt0++] & 255;
                            }
                        }
                    }

                    return;
                }

                if (opcode == 249) {
                    pdataIdx = 1;

                    while(true) {
                        while(pdataIdx < psize) {
                            if (Utility.readByte(pdata[pdataIdx]) == 255) {
                                reusableInt0 = 0;
                                reusableInt1 = this.localRegionX + pdata[pdataIdx + 1] >> 3;
                                reusableInt2 = this.localRegionY + pdata[pdataIdx + 2] >> 3;
                                pdataIdx += 3;

                                for(var8 = 0; var8 < this.nw; ++var8) {
                                    var9 = (this.pw[var8] >> 3) - reusableInt1;
                                    var10 = (this.qw[var8] >> 3) - reusableInt2;
                                    if (var9 == 0 && var10 == 0) {
                                        this.scene.freeModel(this.ow[var8]);
                                        this.world.yn(this.pw[var8], this.qw[var8], this.rw[var8], this.sw[var8]);
                                    } else {
                                        if (var8 != reusableInt0) {
                                            this.ow[reusableInt0] = this.ow[var8];
                                            this.ow[reusableInt0].nh = reusableInt0 + 10000;
                                            this.pw[reusableInt0] = this.pw[var8];
                                            this.qw[reusableInt0] = this.qw[var8];
                                            this.rw[reusableInt0] = this.rw[var8];
                                            this.sw[reusableInt0] = this.sw[var8];
                                        }

                                        ++reusableInt0;
                                    }
                                }

                                this.nw = reusableInt0;
                            } else {
                                reusableInt0 = Utility.readShort(pdata, pdataIdx);
                                pdataIdx += 2;
                                reusableInt1 = this.localRegionX + pdata[pdataIdx++];
                                reusableInt2 = this.localRegionY + pdata[pdataIdx++];
                                byte var25 = pdata[pdataIdx++];
                                var9 = 0;

                                for(var10 = 0; var10 < this.nw; ++var10) {
                                    if (this.pw[var10] == reusableInt1 && this.qw[var10] == reusableInt2 && this.rw[var10] == var25) {
                                        this.scene.freeModel(this.ow[var10]);
                                        this.world.yn(this.pw[var10], this.qw[var10], this.rw[var10], this.sw[var10]);
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
                                if (reusableInt0 != 65535) {
                                    this.world.ap(reusableInt1, reusableInt2, var25, reusableInt0);
                                    GameModel var32 = this.km(reusableInt1, reusableInt2, var25, reusableInt0, this.nw);
                                    this.ow[this.nw] = var32;
                                    this.pw[this.nw] = reusableInt1;
                                    this.qw[this.nw] = reusableInt2;
                                    this.sw[this.nw] = reusableInt0;
                                    this.rw[this.nw++] = var25;
                                }
                            }
                        }

                        return;
                    }
                }

                if (opcode == 248) {
                    this.rv = this.qv;
                    this.qv = 0;

                    for(pdataIdx = 0; pdataIdx < this.rv; ++pdataIdx) {
                        this.uv[pdataIdx] = this.tv[pdataIdx];
                    }

                    var26 = 8;
                    reusableInt1 = Utility.readBits(pdata, var26, 8);
                    reusableInt0 = var26 + 8;

                    for(reusableInt2 = 0; reusableInt2 < reusableInt1; ++reusableInt2) {
                        var24 = this.uv[reusableInt2];
                        var9 = Utility.readBits(pdata, reusableInt0, 1);
                        ++reusableInt0;
                        if (var9 != 0) {
                            var10 = Utility.readBits(pdata, reusableInt0, 1);
                            ++reusableInt0;
                            if (var10 == 0) {
                                var27 = Utility.readBits(pdata, reusableInt0, 3);
                                reusableInt0 += 3;
                                var12 = var24.waypointCurrent;
                                var13 = var24.waypointsX[var12];
                                var14 = var24.waypointsY[var12];
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
                                var24.waypointCurrent = var12 = (var12 + 1) % 10;
                                var24.waypointsX[var12] = var13;
                                var24.waypointsY[var12] = var14;
                            } else {
                                var27 = Utility.readBits(pdata, reusableInt0, 4);
                                if ((var27 & 12) == 12) {
                                    reusableInt0 += 2;
                                    continue;
                                }

                                var24.fr = Utility.readBits(pdata, reusableInt0, 4);
                                reusableInt0 += 4;
                            }
                        }

                        this.tv[this.qv++] = var24;
                    }

                    for(; reusableInt0 + 31 < psize * 8; this.sm(var8, var12, var13, var27, var14)) {
                        var8 = Utility.readBits(pdata, reusableInt0, 10);
                        reusableInt0 += 10;
                        var9 = Utility.readBits(pdata, reusableInt0, 5);
                        reusableInt0 += 5;
                        if (var9 > 15) {
                            var9 -= 32;
                        }

                        var10 = Utility.readBits(pdata, reusableInt0, 5);
                        reusableInt0 += 5;
                        if (var10 > 15) {
                            var10 -= 32;
                        }

                        var27 = Utility.readBits(pdata, reusableInt0, 4);
                        reusableInt0 += 4;
                        var12 = (this.localRegionX + var9) * this.ot + 64;
                        var13 = (this.localRegionY + var10) * this.ot + 64;
                        var14 = Utility.readBits(pdata, reusableInt0, 8);
                        reusableInt0 += 8;
                        if (var14 >= GameData.oib) {
                            var14 = 24;
                        }
                    }

                    return;
                }

                if (opcode == 247) {
                    pdataIdx = Utility.readShort(pdata, 1);
                    reusableInt0 = 3;

                    for(reusableInt1 = 0; reusableInt1 < pdataIdx; ++reusableInt1) {
                        reusableInt2 = Utility.readShort(pdata, reusableInt0);
                        reusableInt0 += 2;
                        var24 = this.sv[reusableInt2];
                        var9 = Utility.readByte(pdata[reusableInt0]);
                        ++reusableInt0;
                        if (var9 == 1) {
                            var10 = Utility.readShort(pdata, reusableInt0);
                            reusableInt0 += 2;
                            byte var31 = pdata[reusableInt0];
                            ++reusableInt0;
                            if (var24 != null) {
                                String var30 = new String(pdata, reusableInt0, var31);
                                var24.mr = 150;
                                var24.lr = var30;
                                if (var10 == this.localPlayer.pid) {
                                    this.pk("@yel@" + GameData.pib[var24.cr][0] + ": " + var24.lr, 5);
                                }
                            }

                            reusableInt0 += var31;
                        } else if (var9 == 2) {
                            var10 = Utility.readByte(pdata[reusableInt0]);
                            ++reusableInt0;
                            var27 = Utility.readByte(pdata[reusableInt0]);
                            ++reusableInt0;
                            var12 = Utility.readByte(pdata[reusableInt0]);
                            ++reusableInt0;
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

                if (opcode == 246) {
                    this.yz = true;
                    pdataIdx = Utility.readByte(pdata[1]);
                    this.zz = pdataIdx;
                    reusableInt0 = 2;

                    for(reusableInt1 = 0; reusableInt1 < pdataIdx; ++reusableInt1) {
                        reusableInt2 = Utility.readByte(pdata[reusableInt0]);
                        ++reusableInt0;
                        this.aab[reusableInt1] = new String(pdata, reusableInt0, reusableInt2);
                        reusableInt0 += reusableInt2;
                    }

                    return;
                }

                if (opcode == 245) {
                    this.yz = false;
                    return;
                }

                if (opcode == 244) {
                    this.serverIndex = Utility.readShort(pdata, 1);
                    this.planeWidth = Utility.readShort(pdata, 3);
                    this.planeHeight = Utility.readShort(pdata, 5);
                    this.planeFloor = Utility.readShort(pdata, 7);
                    this.distanceBetweenFloors = Utility.readShort(pdata, 9);
                    this.planeHeight -= this.planeFloor * this.distanceBetweenFloors;
                    return;
                }

                if (opcode == 243) {
                    pdataIdx = 1;

                    for(reusableInt0 = 0; reusableInt0 < 16; ++reusableInt0) {
                        this.playerStatCur[reusableInt0] = Utility.readByte(pdata[pdataIdx++]);
                    }

                    for(reusableInt1 = 0; reusableInt1 < 16; ++reusableInt1) {
                        this.playerStatMax[reusableInt1] = Utility.readByte(pdata[pdataIdx++]);
                    }

                    this.questPoints = Utility.readByte(pdata[pdataIdx++]);
                    return;
                }

                if (opcode == 242) {
                    for(pdataIdx = 0; pdataIdx < 5; ++pdataIdx) {
                        this.ex[pdataIdx] = Utility.readByte(pdata[1 + pdataIdx]);
                    }
                    return;
                }

                if (opcode == 241) {
                    this.lab = 250;
                    return;
                }

                if (opcode == 240) {
                    pdataIdx = (psize - 1) / 4;

                    for(reusableInt0 = 0; reusableInt0 < pdataIdx; ++reusableInt0) {
                        reusableInt1 = this.localRegionX + Utility.readUnsignedShort(pdata, 1 + reusableInt0 * 4) >> 3;
                        reusableInt2 = this.localRegionY + Utility.readUnsignedShort(pdata, 3 + reusableInt0 * 4) >> 3;
                        var8 = 0;

                        for(var9 = 0; var9 < this.xv; ++var9) {
                            var10 = (this.zv[var9] >> 3) - reusableInt1;
                            var27 = (this.aw[var9] >> 3) - reusableInt2;
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
                            var27 = (this.gw[var10] >> 3) - reusableInt1;
                            var12 = (this.hw[var10] >> 3) - reusableInt2;
                            if (var27 == 0 && var12 == 0) {
                                this.scene.freeModel(this.fw[var10]);
                                this.world.yo(this.gw[var10], this.hw[var10], this.iw[var10]);
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
                            var12 = (this.pw[var27] >> 3) - reusableInt1;
                            var13 = (this.qw[var27] >> 3) - reusableInt2;
                            if (var12 == 0 && var13 == 0) {
                                this.scene.freeModel(this.ow[var27]);
                                this.world.yn(this.pw[var27], this.qw[var27], this.rw[var27], this.sw[var27]);
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

                if (opcode == 239) {
                    this.showAppearanceChange = true;
                    return;
                }

                if (opcode == 238) {
                    pdataIdx = Utility.readShort(pdata, 1);
                    if (this.hv[pdataIdx] != null) {
                        this.fz = this.hv[pdataIdx].xq;
                    }

                    this.ez = true;
                    this.mz = false;
                    this.nz = false;
                    this.gz = 0;
                    this.jz = 0;
                    return;
                }

                if (opcode == 237) {
                    this.ez = false;
                    return;
                }

                if (opcode == 236) {
                    this.jz = pdata[1] & 255;
                    pdataIdx = 2;

                    for(reusableInt0 = 0; reusableInt0 < this.jz; ++reusableInt0) {
                        this.kz[reusableInt0] = Utility.readShort(pdata, pdataIdx);
                        pdataIdx += 2;
                        this.lz[reusableInt0] = Utility.readShort(pdata, pdataIdx);
                        pdataIdx += 2;
                    }

                    this.mz = false;
                    this.nz = false;
                    return;
                }

                byte var23;
                if (opcode == 235) {
                    var23 = pdata[1];
                    if (var23 == 1) {
                        this.mz = true;
                        return;
                    }

                    this.mz = false;
                    return;
                }

                if (opcode != 234) {
                    if (opcode == 233) {
                        this.qz = false;
                        return;
                    }

                    if (opcode == 229) {
                        var23 = pdata[1];
                        if (var23 == 1) {
                            this.nz = true;
                            return;
                        }

                        this.nz = false;
                        return;
                    }

                    if (opcode == 228) {
                        System.out.println("Got config");
                        this.playerKiller = Utility.readByte(pdata[1]) == 1;
                        this.cameraModeAuto = Utility.readByte(pdata[2]) == 1;
                        this.pkChangesLeft = Utility.readByte(pdata[3]);
                        this.mouseButtonOne = Utility.readByte(pdata[4]) == 1;
                        return;
                    }

                    if (opcode == 227) {
                        for(pdataIdx = 0; pdataIdx < psize - 1; ++pdataIdx) {
                            this.wx[pdataIdx] = pdata[pdataIdx + 1] == 1;
                        }

                        return;
                    }

                    if (opcode == 226) {
                        for(pdataIdx = 0; pdataIdx < this.tx; ++pdataIdx) {
                            this.vx[pdataIdx] = pdata[pdataIdx + 1] == 1;
                        }

                        return;
                    }

                    if (opcode == 225) {
                        this.yoptinOnboardingStage = 1;
                        return;
                    }

                    if (opcode == 224) {
                        this.qdb = true;

                        for(pdataIdx = 0; pdataIdx < 5; ++pdataIdx) {
                            this.zdb[pdataIdx] = pdataIdx;
                            this.aeb[pdataIdx] = "~:" + this.zdb[pdataIdx];
                            this.securityQuestionsPanel.updateText(this.wdb[pdataIdx], "");
                            this.securityQuestionsPanel.updateText(this.vdb[pdataIdx], pdataIdx + 1 + ": " + this.ifb[this.zdb[pdataIdx]]);
                        }

                        return;
                    }

                    if (opcode != 223) {
                        return;
                    }

                    this.maxInventorySpaces = pdata[1] & 255;
                } else {
                    this.qz = true;
                    byte var4 = 1;
                    pdataIdx = var4 + 1;
                    reusableInt0 = pdata[var4] & 255;
                    byte var22 = pdata[pdataIdx++];
                    this.rz = pdata[pdataIdx++] & 255;
                    this.sz = pdata[pdataIdx++] & 255;

                    for(reusableInt2 = 0; reusableInt2 < 40; ++reusableInt2) {
                        this.tz[reusableInt2] = -1;
                    }

                    for(var8 = 0; var8 < reusableInt0; ++var8) {
                        this.tz[var8] = Utility.readShort(pdata, pdataIdx);
                        pdataIdx += 2;
                        this.uz[var8] = Utility.readShort(pdata, pdataIdx);
                        pdataIdx += 2;
                        this.vz[var8] = pdata[pdataIdx++];
                    }

                    if (var22 == 1) {
                        var9 = 39;

                        for(var10 = 0; var10 < this.inventoryItemsCount && var9 >= reusableInt0; ++var10) {
                            boolean var11 = false;

                            for(var12 = 0; var12 < 40; ++var12) {
                                if (this.tz[var12] == this.inventoryItemIds[var10]) {
                                    var11 = true;
                                    break;
                                }
                            }

                            if (this.inventoryItemIds[var10] == 10) {
                                var11 = true;
                            }

                            if (!var11) {
                                this.tz[var9] = this.inventoryItemIds[var10] & 32767;
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
                super.clientStream.createOutgoingPacket(17);
                super.clientStream.putString(var19.toString());
                this.sk();
                super.clientStream.createOutgoingPacket(17);
                super.clientStream.putString("p-type:" + opcode + " p-size:" + psize);
                this.sk();
                super.clientStream.createOutgoingPacket(17);
                super.clientStream.putString("rx:" + this.localRegionX + " ry:" + this.localRegionY + " num3l:" + this.ew);
                this.sk();
                String var5 = "";

                for(reusableInt1 = 0; reusableInt1 < 80 && reusableInt1 < psize; ++reusableInt1) {
                    var5 = var5 + pdata[reusableInt1] + " ";
                }

                super.clientStream.createOutgoingPacket(17);
                super.clientStream.putString(var5);
                this.sk();
                ++this.zs;
            }
        }

    }

    public boolean lm(int var1) {
        int var2 = this.localPlayer.currentX / 128;
        int var3 = this.localPlayer.currentY / 128;

        for(int var4 = 2; var4 >= 1; --var4) {
            if (var1 == 1 && ((this.world.ugb[var2][var3 - var4] & 128) == 128 || (this.world.ugb[var2 - var4][var3] & 128) == 128 || (this.world.ugb[var2 - var4][var3 - var4] & 128) == 128)) {
                return false;
            }

            if (var1 == 3 && ((this.world.ugb[var2][var3 + var4] & 128) == 128 || (this.world.ugb[var2 - var4][var3] & 128) == 128 || (this.world.ugb[var2 - var4][var3 + var4] & 128) == 128)) {
                return false;
            }

            if (var1 == 5 && ((this.world.ugb[var2][var3 + var4] & 128) == 128 || (this.world.ugb[var2 + var4][var3] & 128) == 128 || (this.world.ugb[var2 + var4][var3 + var4] & 128) == 128)) {
                return false;
            }

            if (var1 == 7 && ((this.world.ugb[var2][var3 - var4] & 128) == 128 || (this.world.ugb[var2 + var4][var3] & 128) == 128 || (this.world.ugb[var2 + var4][var3 - var4] & 128) == 128)) {
                return false;
            }

            if (var1 == 0 && (this.world.ugb[var2][var3 - var4] & 128) == 128) {
                return false;
            }

            if (var1 == 2 && (this.world.ugb[var2 - var4][var3] & 128) == 128) {
                return false;
            }

            if (var1 == 4 && (this.world.ugb[var2][var3 + var4] & 128) == 128) {
                return false;
            }

            if (var1 == 6 && (this.world.ugb[var2 + var4][var3] & 128) == 128) {
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
            this.surface.fade2black();
            this.surface.xg("Oh dear! You are dead...", this.gameWidth / 2, this.gameHeight / 2, 7, 16711680);
            this.gl();
            this.surface.nf(this.jt, 0, 11);
        } else if (this.yoptinOnboardingStage != 0) {
            this.cm();
        } else if (this.showAppearanceChange) {
            this.qk();
        } else if (this.qdb) {
            this.mk();
        } else if (this.world.wgb) {
            for(int var1 = 0; var1 < 64; ++var1) {
                this.scene.freeModel(this.world.roofModels[this.ju][var1]);
                if (this.ju == 0) {
                    this.scene.freeModel(this.world.wallModels[1][var1]);
                    this.scene.freeModel(this.world.roofModels[1][var1]);
                    this.scene.freeModel(this.world.wallModels[2][var1]);
                    this.scene.freeModel(this.world.roofModels[2][var1]);
                }

                this.vu = true;
                if (this.ju == 0 && (this.world.ugb[this.localPlayer.currentX / 128][this.localPlayer.currentY / 128] & 128) == 0) {
                    this.scene.yh(this.world.roofModels[this.ju][var1]);
                    if (this.ju == 0) {
                        this.scene.yh(this.world.wallModels[1][var1]);
                        this.scene.yh(this.world.roofModels[1][var1]);
                        this.scene.yh(this.world.wallModels[2][var1]);
                        this.scene.yh(this.world.roofModels[2][var1]);
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
                        var5 = var3 - this.localPlayer.currentX / 128;
                        var6 = var4 - this.localPlayer.currentY / 128;
                        var7 = 7;
                        if (var3 >= 0 && var4 >= 0 && var3 < 96 && var4 < 96 && var5 > -var7 && var5 < var7 && var6 > -var7 && var6 < var7) {
                            this.scene.freeModel(this.fw[var2]);
                            var8 = "torcha" + (this.yt + 1);
                            var9 = GameData.mp(var8);
                            var10 = this.kw[var9].ue();
                            this.scene.yh(var10);
                            var10.we(true, 48, 48, -50, -10, -50);
                            var10.de(this.fw[var2]);
                            var10.nh = var2;
                            this.fw[var2] = var10;
                        }
                    }

                    if (this.iw[var2] == 143) {
                        var3 = this.gw[var2];
                        var4 = this.hw[var2];
                        var5 = var3 - this.localPlayer.currentX / 128;
                        var6 = var4 - this.localPlayer.currentY / 128;
                        var7 = 7;
                        if (var3 >= 0 && var4 >= 0 && var3 < 96 && var4 < 96 && var5 > -var7 && var5 < var7 && var6 > -var7 && var6 < var7) {
                            this.scene.freeModel(this.fw[var2]);
                            var8 = "skulltorcha" + (this.yt + 1);
                            var9 = GameData.mp(var8);
                            var10 = this.kw[var9].ue();
                            this.scene.yh(var10);
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
                        var5 = var3 - this.localPlayer.currentX / 128;
                        var6 = var4 - this.localPlayer.currentY / 128;
                        var7 = 9;
                        if (var3 >= 0 && var4 >= 0 && var3 < 96 && var4 < 96 && var5 > -var7 && var5 < var7 && var6 > -var7 && var6 < var7) {
                            this.scene.freeModel(this.fw[var2]);
                            var8 = "firea" + (this.zt + 1);
                            var9 = GameData.mp(var8);
                            var10 = this.kw[var9].ue();
                            this.scene.yh(var10);
                            var10.we(true, 48, 48, -50, -10, -50);
                            var10.de(this.fw[var2]);
                            var10.nh = var2;
                            this.fw[var2] = var10;
                        }
                    }
                }
            }

            this.scene.oi(this.gv);
            this.gv = 0;

            int var18;
            for(var2 = 0; var2 < this.playerCount; ++var2) {
                Character var15 = this.players[var2];
                if (var15.xr != 255) {
                    var4 = var15.currentX;
                    var5 = var15.currentY;
                    var6 = -this.world.getElevation(var4, var5);
                    var18 = this.scene.ph(5000 + var2, var4, var6, var5, 145, 220, var2 + 10000);
                    ++this.gv;
                    if (var15 == this.localPlayer) {
                        this.scene.qh(var18);
                    }

                    if (var15.er == 8) {
                        this.scene.si(var18, -30);
                    }

                    if (var15.er == 9) {
                        this.scene.si(var18, 30);
                    }
                }
            }

            Character var17;
            int var19;
            for(var3 = 0; var3 < this.playerCount; ++var3) {
                Character var16 = this.players[var3];
                if (var16.cs > 0) {
                    var17 = null;
                    if (var16.bs != -1) {
                        var17 = this.sv[var16.bs];
                    } else if (var16.as != -1) {
                        var17 = this.hv[var16.as];
                    }

                    if (var17 != null) {
                        var6 = var16.currentX;
                        var18 = var16.currentY;
                        var19 = -this.world.getElevation(var6, var18) - 110;
                        var9 = var17.currentX;
                        int var21 = var17.currentY;
                        int var11 = -this.world.getElevation(var9, var21) - GameData.mjb[var17.cr] / 2;
                        int var12 = (var6 * var16.cs + var9 * (this.vt - var16.cs)) / this.vt;
                        int var13 = (var19 * var16.cs + var11 * (this.vt - var16.cs)) / this.vt;
                        int var14 = (var18 * var16.cs + var21 * (this.vt - var16.cs)) / this.vt;
                        this.scene.ph(this.wt + var16.zr, var12, var13, var14, 32, 32, 0);
                        ++this.gv;
                    }
                }
            }

            for(var4 = 0; var4 < this.qv; ++var4) {
                var17 = this.tv[var4];
                var6 = var17.currentX;
                var18 = var17.currentY;
                var19 = -this.world.getElevation(var6, var18);
                var9 = this.scene.ph(20000 + var4, var6, var19, var18, GameData.ljb[var17.cr], GameData.mjb[var17.cr], var4 + 30000);
                ++this.gv;
                if (var17.er == 8) {
                    this.scene.si(var9, -30);
                }

                if (var17.er == 9) {
                    this.scene.si(var9, 30);
                }
            }

            for(var5 = 0; var5 < this.xv; ++var5) {
                var6 = this.zv[var5] * this.ot + 64;
                var18 = this.aw[var5] * this.ot + 64;
                this.scene.ph('鱀' + this.bw[var5], var6, -this.world.getElevation(var6, var18) - this.cw[var5], var18, 96, 64, var5 + 20000);
                ++this.gv;
            }

            this.surface.pk = false;
            this.surface.pf();
            this.surface.pk = super.qq;
            if (this.ju == 3) {
                var6 = 40 + (int)(Math.random() * 3.0D);
                var18 = 40 + (int)(Math.random() * 7.0D);
                this.scene.di(true, var6, var18, -50, -10, -50);
            }

            this.heb = 0;
            this.beb = 0;
            this.meb = 0;
            if (this.xx) {
                if (this.cameraModeAuto && !this.vu) {
                    var6 = this.yu;
                    this.sl();
                    if (this.yu != var6) {
                        this.wu = this.localPlayer.currentX;
                        this.xu = this.localPlayer.currentY;
                    }
                }

                this.scene.clipFar3d = 3000;
                this.scene.clipFar2d = 3000;
                this.scene.fogZFalloff = 1;
                this.scene.fogZDistance = 2800;
                this.av = this.yu * 32;
                this.scene.setCamera(this.wu, -this.world.getElevation(this.wu, this.xu), this.xu, 912, this.av * 4, 0, 2000);
            } else {
                if (this.cameraModeAuto && !this.vu) {
                    this.sl();
                }

                if (!super.qq) {
                    this.scene.clipFar3d = 2400;
                    this.scene.clipFar2d = 2400;
                    this.scene.fogZFalloff = 1;
                    this.scene.fogZDistance = 2300;
                } else {
                    this.scene.clipFar3d = 2200;
                    this.scene.clipFar2d = 2200;
                    this.scene.fogZFalloff = 1;
                    this.scene.fogZDistance = 2100;
                }

                this.scene.setCamera(this.wu, -this.world.getElevation(this.wu, this.xu), this.xu, 912, this.av * 4, 0, this.uu * 2);
            }

            this.scene.render();
            this.ul();
            if (this.cu > 0) {
                this.surface.drawSprite(this.du - 8, this.eu - 8, this.spriteMedia + 14 + (24 - this.cu) / 6);
            }

            if (this.cu < 0) {
                this.surface.drawSprite(this.du - 8, this.eu - 8, this.spriteMedia + 18 + (24 + this.cu) / 6);
            }

            this.surface.qf("Fps: " + super.vq, 450, this.gameHeight - 10, 1, 16776960);
            if (this.az == 0) {
                for(var6 = 0; var6 < this.bz; ++var6) {
                    if (this.dz[var6] > 0) {
                        String var20 = this.cz[var6];
                        this.surface.qf(var20, 7, this.gameHeight - 18 - var6 * 12, 1, 16776960);
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
            this.surface.tg(this.surface.qj - 3 - 197, 3, this.spriteMedia, 128);
            this.nk();
            this.surface.tk = false;
            this.gl();
            this.surface.nf(this.jt, 0, 11);
        }
    }

    public void gl() {
        this.surface.drawSprite(0, this.gameHeight - 4, this.spriteMedia + 23);
        int var1 = Surface.ng(200, 200, 255);
        if (this.az == 0) {
            var1 = Surface.ng(255, 200, 50);
        }

        if (this.ry % 30 > 15) {
            var1 = Surface.ng(255, 50, 50);
        }

        this.surface.xg("All messages", 54, this.gameHeight + 6, 0, var1);
        var1 = Surface.ng(200, 200, 255);
        if (this.az == 1) {
            var1 = Surface.ng(255, 200, 50);
        }

        if (this.sy % 30 > 15) {
            var1 = Surface.ng(255, 50, 50);
        }

        this.surface.xg("Chat history", 155, this.gameHeight + 6, 0, var1);
        var1 = Surface.ng(200, 200, 255);
        if (this.az == 2) {
            var1 = Surface.ng(255, 200, 50);
        }

        if (this.ty % 30 > 15) {
            var1 = Surface.ng(255, 50, 50);
        }

        this.surface.xg("Quest history", 255, this.gameHeight + 6, 0, var1);
        var1 = Surface.ng(200, 200, 255);
        if (this.az == 3) {
            var1 = Surface.ng(255, 200, 50);
        }

        if (this.uy % 30 > 15) {
            var1 = Surface.ng(255, 50, 50);
        }

        this.surface.xg("Private history", 355, this.gameHeight + 6, 0, var1);
    }

    public void xm(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        int var8 = GameData.zhb[var5] + this.yv;
        int var9 = GameData.lib[var5];
        this.surface.zf(var1, var2, var3, var4, var8, var9, 0, 0, false);
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
                    int var24 = var16 * var3 / this.surface.hk[var19];
                    int var25 = var17 * var4 / this.surface.ik[var19];
                    int var20 = var3 * this.surface.hk[var19] / this.surface.hk[GameData.zjb[var15]];
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

                    this.surface.zf(var1 + var24, var2 + var25, var20, var4, var19, var21, var22, var6, var10);
                }
            }
        }

        if (var8.mr > 0) {
            this.feb[this.beb] = this.surface.hf(var8.lr, 1) / 2;
            this.geb[this.beb] = this.surface.qg(1);
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

                this.surface.drawSprite(var14 + var3 / 2 - 12, var2 + var4 / 2 - 12, this.spriteMedia + 12);
                this.surface.xg(String.valueOf(var8.pr), var14 + var3 / 2 - 1, var2 + var4 / 2 + 5, 3, 16777215);
            }
        }

    }

    public void tl(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        Character var8 = this.players[var5];
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
                        var23 = var16 * var3 / this.surface.hk[var19];
                        int var24 = var17 * var4 / this.surface.ik[var19];
                        int var20 = var3 * this.surface.hk[var19] / this.surface.hk[GameData.zjb[var15]];
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

                        this.surface.zf(var1 + var23, var2 + var24, var20, var4, var19, var21, var22, var6, var10);
                    }
                }
            }

            if (var8.mr > 0) {
                this.feb[this.beb] = this.surface.hf(var8.lr, 1) / 2;
                this.geb[this.beb] = this.surface.qg(1);
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

                    this.surface.drawSprite(var14 + var3 / 2 - 12, var2 + var4 / 2 - 12, this.spriteMedia + 11);
                    this.surface.xg(String.valueOf(var8.pr), var14 + var3 / 2 - 1, var2 + var4 / 2 + 5, 3, 16777215);
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
                this.surface.rf(var14 - var15 / 2, var2 - var23 / 2 - 10 * var7 / 100, var15, var23, this.spriteMedia + 13);
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
            this.surface.dh(this.ceb[var1], var2, var3, 1, 16776960, 300);
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
            this.surface.sg(var3 - var7 / 2, var9, var7, var8, this.spriteMedia + 9, 85);
            int var10 = 36 * var5 / 100;
            int var11 = 24 * var5 / 100;
            this.surface.zf(var3 - var10 / 2, var9 + var8 / 2 - var11 / 2, var10, var11, GameData.zhb[var12] + this.yv, GameData.lib[var12], 0, 0, false);
        }

        for(var3 = 0; var3 < this.meb; ++var3) {
            var4 = this.neb[var3];
            var5 = this.oeb[var3];
            var12 = this.peb[var3];
            this.surface.xf(var4 - 15, var5 - 3, var12, 5, 65280, 192);
            this.surface.xf(var4 - 15 + var12, var5 - 3, 30 - var12, 5, 16711680, 192);
        }

    }

    public int ml(int var1) {
        int var2 = 0;

        for(int var3 = 0; var3 < this.inventoryItemsCount; ++var3) {
            if (this.inventoryItemIds[var3] == var1) {
                if (GameData.itemStackable[var1] == 1) {
                    ++var2;
                } else {
                    var2 += this.inventoryItemStackAmount[var3];
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
        for(int var2 = 0; var2 < this.inventoryItemsCount; ++var2) {
            if (this.inventoryItemIds[var2] == var1 && this.inventoryItemWielded[var2] == 1) {
                return true;
            }
        }

        return false;
    }

    public void bn(int var1, int var2, int var3) {
        this.surface.og(var1, var2, var3);
        this.surface.og(var1 - 1, var2, var3);
        this.surface.og(var1 + 1, var2, var3);
        this.surface.og(var1, var2 - 1, var3);
        this.surface.og(var1, var2 + 1, var3);
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
            this.em(this.localRegionX, this.localRegionY, var1, var2, var1 + var5 - 1, var2 + var6 - 1, true, true);
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

            this.em(this.localRegionX, this.localRegionY, var1, var2, var1 + var5 - 1, var2 + var6 - 1, false, true);
        }
    }

    public void fl(int var1, int var2, int var3) {
        if (var3 == 0) {
            this.em(this.localRegionX, this.localRegionY, var1, var2 - 1, var1, var2, false, true);
        } else if (var3 == 1) {
            this.em(this.localRegionX, this.localRegionY, var1 - 1, var2, var1, var2, false, true);
        } else {
            this.em(this.localRegionX, this.localRegionY, var1, var2, var1, var2, true, true);
        }
    }

    public boolean em(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
        int var9 = this.world.ao(var1, var2, var3, var4, var5, var6, this.ht, this.it, var7);
        if (var9 == -1) {
            return false;
        } else {
            --var9;
            var1 = this.ht[var9];
            var2 = this.it[var9];
            --var9;
            if (var8) {
                super.clientStream.createOutgoingPacket(215);
            } else {
                super.clientStream.createOutgoingPacket(255);
            }

            super.clientStream.putShort(var1 + this.ku);
            super.clientStream.putShort(var2 + this.lu);

            for(int var10 = var9; var10 >= 0 && var10 > var9 - 25; --var10) {
                super.clientStream.putByte(this.ht[var10] - var1);
                super.clientStream.putByte(this.it[var10] - var2);
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
            this.world.wgb = false;
            return false;
        } else {
            var1 += this.planeWidth;
            var2 += this.planeHeight;
            if (this.ju == this.planeFloor && var1 > this.nu && var1 < this.pu && var2 > this.ou && var2 < this.qu) {
                this.world.wgb = true;
                return false;
            } else {
                this.surface.xg("Loading... Please wait", 256, 192, 1, 16777215);
                this.gl();
                this.surface.nf(this.jt, 0, 11);
                int var3 = this.ku;
                int var4 = this.lu;
                int var5 = (var1 + 24) / 48;
                int var6 = (var2 + 24) / 48;
                this.ju = this.planeFloor;
                this.ku = var5 * 48 - 48;
                this.lu = var6 * 48 - 48;
                this.nu = var5 * 48 - 32;
                this.ou = var6 * 48 - 32;
                this.pu = var5 * 48 + 32;
                this.qu = var6 * 48 + 32;
                this.world.loadSections(var1, var2, this.ju);
                this.ku -= this.planeWidth;
                this.lu -= this.planeHeight;
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
                            this.scene.yh(var13);
                            var13.ke(var17, -this.world.getElevation(var17, var18), var18);
                            this.world.oo(var10, var11, var12);
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
                        this.world.ap(var11, var12, var14, var21);
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

                for(var12 = 0; var12 < this.playerCount; ++var12) {
                    Character var22 = this.players[var12];
                    var22.currentX -= var7 * this.ot;
                    var22.currentY -= var8 * this.ot;

                    for(var14 = 0; var14 <= var22.waypointCurrent; ++var14) {
                        var22.waypointsX[var14] -= var7 * this.ot;
                        var22.waypointsY[var14] -= var8 * this.ot;
                    }
                }

                for(var21 = 0; var21 < this.qv; ++var21) {
                    Character var23 = this.tv[var21];
                    var23.currentX -= var7 * this.ot;
                    var23.currentY -= var8 * this.ot;

                    for(var15 = 0; var15 <= var23.waypointCurrent; ++var15) {
                        var23.waypointsX[var15] -= var7 * this.ot;
                        var23.waypointsY[var15] -= var8 * this.ot;
                    }
                }

                this.world.wgb = true;
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
        int var14 = var13.se(var6, -this.world.getElevation(var6, var7), var7);
        int var15 = var13.se(var6, -this.world.getElevation(var6, var7) - var12, var7);
        int var16 = var13.se(var8, -this.world.getElevation(var8, var9) - var12, var9);
        int var17 = var13.se(var8, -this.world.getElevation(var8, var9), var9);
        int[] var18 = new int[]{var14, var15, var16, var17};
        var13.re(4, var18, var10, var11);
        var13.we(false, 60, 24, -50, -10, -50);
        if (var1 >= 0 && var2 >= 0 && var1 < 96 && var2 < 96) {
            this.scene.yh(var13);
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

            if (this.localPlayer.sr > 0) {
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
                if (super.kq < this.surface.hf(this.aab[var1], 1) && super.lq > var1 * 12 && super.lq < 12 + var1 * 12) {
                    var2 = 16711680;
                }

                this.surface.qf(this.aab[var1], 6, 12 + var1 * 12, 1, var2);
            }

        } else {
            for(var1 = 0; var1 < this.zz; ++var1) {
                if (super.kq < this.surface.hf(this.aab[var1], 1) && super.lq > var1 * 12 && super.lq < 12 + var1 * 12) {
                    super.clientStream.createOutgoingPacket(237);
                    super.clientStream.putByte(var1);
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
                    super.clientStream.createOutgoingPacket(231);
                    super.clientStream.putByte(this.bab);
                    this.sk();
                    break;
                }
            }
        }

        for(var4 = 0; var4 < 5; ++var4) {
            if (var4 == this.bab + 1) {
                this.surface.xf(var1, var2 + var4 * 20, var3, 20, Surface.ng(255, 0, 0), 128);
            } else {
                this.surface.xf(var1, var2 + var4 * 20, var3, 20, Surface.ng(190, 190, 190), 128);
            }

            this.surface.ug(var1, var2 + var4 * 20, var3, 0);
            this.surface.ug(var1, var2 + var4 * 20 + 20, var3, 0);
        }

        this.surface.xg("Select combat style", var1 + var3 / 2, var2 + 16, 3, 16777215);
        this.surface.xg("Controlled (+1 of each)", var1 + var3 / 2, var2 + 36, 3, 0);
        this.surface.xg("Aggressive (+3 strength)", var1 + var3 / 2, var2 + 56, 3, 0);
        this.surface.xg("Accurate   (+3 attack)", var1 + var3 / 2, var2 + 76, 3, 0);
        this.surface.xg("Defensive  (+3 defense)", var1 + var3 / 2, var2 + 96, 3, 0);
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
        this.surface.drawBox(106, 70, 300, 190, 0);
        this.surface.uf(106, 70, 300, 190, 16777215);
        this.surface.xg("You have been playing for", 256, var1, 4, 16777215);
        int var3 = var1 + 20;
        this.surface.xg("over 1 hour. Please consider", 256, var3, 4, 16777215);
        var3 += 20;
        this.surface.xg("visiting our advertiser if you", 256, var3, 4, 16777215);
        var3 += 20;
        this.surface.xg("see an advert which interests you.", 256, var3, 4, 16777215);
        var3 += 40;
        this.surface.xg("Doing so will help ensure", 256, var3, 4, 16777215);
        var3 += 20;
        this.surface.xg("Runescape remains free.", 256, var3, 4, 16777215);
        var3 += 40;
        int var2 = 16777215;
        if (super.kq > 200 && super.kq < 300 && super.lq > var3 - 20 && super.lq < var3 + 3) {
            var2 = 16776960;
        }

        this.surface.xg("Close", 256, var3, 4, var2);
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
                this.playerKiller = !this.playerKiller;
                super.clientStream.createOutgoingPacket(213);
                super.clientStream.putByte(1);
                super.clientStream.putByte(this.playerKiller ? 1 : 0);
                super.clientStream.sendPacket();
                this.dab = 0;
                return;
            }
        }

        this.surface.drawBox(56, 70, 400, 190, 0);
        this.surface.uf(56, 70, 400, 190, 16777215);
        int var3 = 90;
        if (!this.playerKiller) {
            this.surface.xg("Are you sure you want to change", 256, var3, 4, 16777215);
            var3 += 20;
            this.surface.xg("to being able to fight other players?", 256, var3, 4, 16777215);
            var3 += 40;
            this.surface.xg("If you do other players will be able to", 256, var3, 4, 16777215);
            var3 += 20;
            this.surface.xg("attack you, and you will probably die", 256, var3, 4, 16777215);
            var3 += 20;
            this.surface.xg("much more often.", 256, var3, 4, 16777215);
            var3 += 40;
        }

        if (this.playerKiller) {
            this.surface.xg("Are you sure you want to change", 256, var3, 4, 16777215);
            var3 += 20;
            this.surface.xg("to not fighting other players?", 256, var3, 4, 16777215);
            var3 += 40;
            this.surface.xg("This will make you safe from attack,", 256, var3, 4, 16777215);
            var3 += 20;
            this.surface.xg("but will also preventing you from attacking", 256, var3, 4, 16777215);
            var3 += 20;
            this.surface.xg("others (except in the arena - coming soon)", 256, var3, 4, 16777215);
            var3 += 40;
        }

        if (this.pkChangesLeft == 2) {
            this.surface.xg("You can only change a total of 2 times", 256, var3, 4, 16777215);
            var3 += 20;
        }

        if (this.pkChangesLeft == 1) {
            this.surface.xg("You will not be allowed to change back again", 256, var3, 4, 16777215);
            var3 += 20;
        }

        var1 = 250;
        int var2 = 16777215;
        if (super.kq > 150 && super.kq < 250 && super.lq > var1 - 20 && super.lq < var1 + 3) {
            var2 = 16776960;
        }

        this.surface.xg("Yes I'm sure", 200, var1, 4, var2);
        var2 = 16777215;
        if (super.kq > 250 && super.kq < 350 && super.lq > var1 - 20 && super.lq < var1 + 3) {
            var2 = 16776960;
        }

        this.surface.xg("No thanks", 300, var1, 4, var2);
    }

    public void im() {
        this.surface.drawBox(126, 137, 260, 60, 0);
        this.surface.uf(126, 137, 260, 60, 16777215);
        this.surface.xg("Logging out...", 256, 173, 5, 16777215);
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
        this.surface.drawBox(106, var1, 300, 60, 0);
        this.surface.uf(106, var1, 300, 60, 16777215);
        int var4 = var1 + 22;
        String var2;
        int var3;
        if (this.fab == 1) {
            this.surface.xg("Please enter your new password", 256, var4, 4, 16777215);
            var4 += 25;
            var2 = "*";

            for(var3 = 0; var3 < super.rq.length(); ++var3) {
                var2 = "X" + var2;
            }

            this.surface.xg(var2, 256, var4, 4, 16777215);
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
            this.surface.xg("Enter password again to confirm", 256, var4, 4, 16777215);
            var4 += 25;
            var2 = "*";

            for(var3 = 0; var3 < super.rq.length(); ++var3) {
                var2 = "X" + var2;
            }

            this.surface.xg(var2, 256, var4, 4, 16777215);
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
                this.surface.xg("Passwords do not match!", 256, var4, 4, 16777215);
                var4 += 25;
                this.surface.xg("Press any key to close", 256, var4, 4, 16777215);
                return;
            }

            if (this.fab == 4) {
                this.surface.xg("Ok, your request has been sent", 256, var4, 4, 16777215);
                var4 += 25;
                this.surface.xg("Press any key to close", 256, var4, 4, 16777215);
                return;
            }

            if (this.fab == 5) {
                this.surface.xg("Password must be at", 256, var4, 4, 16777215);
                var4 += 25;
                this.surface.xg("least 5 letters long", 256, var4, 4, 16777215);
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
            this.surface.drawBox(106, var1, 300, 70, 0);
            this.surface.uf(106, var1, 300, 70, 16777215);
            var1 += 20;
            this.surface.xg("Enter name to add to friends list", 256, var1, 4, 16777215);
            var1 += 20;
            this.surface.xg(super.rq + "*", 256, var1, 4, 16777215);
            if (super.sq.length() > 0) {
                var2 = super.sq.trim();
                super.rq = "";
                super.sq = "";
                this.eab = 0;
                if (var2.length() > 0 && Utility.username2hash(var2) != this.localPlayer.wq) {
                    this.ib(var2);
                }
            }
        }

        if (this.eab == 2) {
            this.surface.drawBox(6, var1, 500, 70, 0);
            this.surface.uf(6, var1, 500, 70, 16777215);
            var1 += 20;
            this.surface.xg("Enter message to send to " + Utility.rn(this.px), 256, var1, 4, 16777215);
            var1 += 20;
            this.surface.xg(super.tq + "*", 256, var1, 4, 16777215);
            if (super.uq.length() > 0) {
                var2 = super.uq;
                super.tq = "";
                super.uq = "";
                this.eab = 0;
                this.u(this.px, var2);
            }
        }

        if (this.eab == 3) {
            this.surface.drawBox(106, var1, 300, 70, 0);
            this.surface.uf(106, var1, 300, 70, 16777215);
            var1 += 20;
            this.surface.xg("Enter name to add to ignore list", 256, var1, 4, 16777215);
            var1 += 20;
            this.surface.xg(super.rq + "*", 256, var1, 4, 16777215);
            if (super.sq.length() > 0) {
                var2 = super.sq.trim();
                super.rq = "";
                super.sq = "";
                this.eab = 0;
                if (var2.length() > 0 && Utility.username2hash(var2) != this.localPlayer.wq) {
                    this.nb(var2);
                }
            }
        }

        int var3 = 16777215;
        if (super.kq > 236 && super.kq < 276 && super.lq > 193 && super.lq < 213) {
            var3 = 16776960;
        }

        this.surface.xg("Cancel", 256, 208, 1, var3);
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
                super.clientStream.createOutgoingPacket(218);
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
                        super.clientStream.createOutgoingPacket(217);
                        super.clientStream.putShort(this.tz[this.wz]);
                        super.clientStream.putShort(var7);
                        this.sk();
                    }

                    if (this.ml(var5) > 0 && var1 > 2 && var2 >= 229 && var1 < 112 && var2 <= 240) {
                        var6 = this.rz + this.vz[this.wz];
                        if (var6 < 10) {
                            var6 = 10;
                        }

                        var7 = var6 * GameData.aib[var5] / 100;
                        super.clientStream.createOutgoingPacket(216);
                        super.clientStream.putShort(this.tz[this.wz]);
                        super.clientStream.putShort(var7);
                        this.sk();
                    }
                }
            }
        }

        byte var11 = 52;
        byte var12 = 44;
        this.surface.drawBox(var11, var12, 408, 12, 192);
        var3 = 10000536;
        this.surface.xf(var11, var12 + 12, 408, 17, var3, 160);
        this.surface.xf(var11, var12 + 29, 8, 170, var3, 160);
        this.surface.xf(var11 + 399, var12 + 29, 9, 170, var3, 160);
        this.surface.xf(var11, var12 + 199, 408, 47, var3, 160);
        this.surface.qf("Buying and selling items", var11 + 1, var12 + 10, 1, 16777215);
        var4 = 16777215;
        if (super.kq > var11 + 320 && super.lq >= var12 && super.kq < var11 + 408 && super.lq < var12 + 12) {
            var4 = 16711680;
        }

        this.surface.ch("Close window", var11 + 406, var12 + 10, 1, var4);
        this.surface.qf("Shops stock in green", var11 + 2, var12 + 24, 1, 65280);
        this.surface.qf("Number you own in blue", var11 + 135, var12 + 24, 1, 65535);
        this.surface.qf("Your money: " + this.ml(10) + "gp", var11 + 280, var12 + 24, 1, 16776960);
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
                    this.surface.xf(var9, var10, 49, 34, 16711680, 160);
                } else {
                    this.surface.xf(var9, var10, 49, 34, var5, 160);
                }

                this.surface.uf(var9, var10, 50, 35, 0);
                if (this.tz[var6] != -1) {
                    this.surface.zf(var9, var10, 48, 32, this.yv + GameData.zhb[this.tz[var6]], GameData.lib[this.tz[var6]], 0, 0, false);
                    this.surface.qf(String.valueOf(this.uz[var6]), var9 + 1, var10 + 10, 1, 65280);
                    this.surface.ch(String.valueOf(this.ml(this.tz[var6])), var9 + 47, var10 + 10, 1, 65535);
                }

                ++var6;
            }
        }

        this.surface.ug(var11 + 5, var12 + 222, 398, 0);
        if (this.wz == -1) {
            this.surface.xg("Select an object to buy or sell", var11 + 204, var12 + 214, 3, 16776960);
        } else {
            var8 = this.tz[this.wz];
            if (var8 != -1) {
                if (this.uz[this.wz] > 0) {
                    var9 = this.sz + this.vz[this.wz];
                    if (var9 < 10) {
                        var9 = 10;
                    }

                    var10 = var9 * GameData.aib[var8] / 100;
                    this.surface.qf("Buy a new " + GameData.vhb[var8][0] + " for " + var10 + "gp", var11 + 2, var12 + 214, 1, 16776960);
                    var4 = 16777215;
                    if (super.kq > var11 + 298 && super.lq >= var12 + 204 && super.kq < var11 + 408 && super.lq <= var12 + 215) {
                        var4 = 16711680;
                    }

                    this.surface.ch("Click here to buy", var11 + 405, var12 + 214, 3, var4);
                } else {
                    this.surface.xg("This item is not currently available to buy", var11 + 204, var12 + 214, 3, 16776960);
                }

                if (this.ml(var8) > 0) {
                    var9 = this.rz + this.vz[this.wz];
                    if (var9 < 10) {
                        var9 = 10;
                    }

                    var10 = var9 * GameData.aib[var8] / 100;
                    this.surface.ch("Sell your " + GameData.vhb[var8][0] + " for " + var10 + "gp", var11 + 405, var12 + 239, 1, 16776960);
                    var4 = 16777215;
                    if (super.kq > var11 + 2 && super.lq >= var12 + 229 && super.kq < var11 + 112 && super.lq <= var12 + 240) {
                        var4 = 16711680;
                    }

                    this.surface.qf("Click here to sell", var11 + 2, var12 + 239, 3, var4);
                    return;
                }

                this.surface.xg("You do not have any of this item to sell", var11 + 204, var12 + 239, 3, 16776960);
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
                    if (var3 >= 0 && var3 < this.inventoryItemsCount) {
                        boolean var4 = false;
                        var5 = 0;
                        var6 = this.inventoryItemIds[var3];

                        for(var7 = 0; var7 < this.gz; ++var7) {
                            if (this.hz[var7] == var6) {
                                if (GameData.itemStackable[var6] == 0) {
                                    for(var8 = 0; var8 < this.pz; ++var8) {
                                        if (this.iz[var7] < this.inventoryItemStackAmount[var3]) {
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
                            super.clientStream.createOutgoingPacket(234);
                            super.clientStream.putByte(this.gz);

                            for(var8 = 0; var8 < this.gz; ++var8) {
                                super.clientStream.putShort(this.hz[var8]);
                                super.clientStream.putShort(this.iz[var8]);
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
                            if (GameData.itemStackable[var16] != 0 || this.iz[var3] <= 1) {
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

                        super.clientStream.createOutgoingPacket(234);
                        super.clientStream.putByte(this.gz);

                        for(var6 = 0; var6 < this.gz; ++var6) {
                            super.clientStream.putShort(this.hz[var6]);
                            super.clientStream.putShort(this.iz[var6]);
                        }

                        this.sk();
                        this.mz = false;
                        this.nz = false;
                    }
                }

                if (var1 > 143 && var2 > 141 && var1 < 154 && var2 < 152) {
                    this.nz = !this.nz;
                    super.clientStream.createOutgoingPacket(232);
                    super.clientStream.putByte(this.nz ? 1 : 0);
                    this.sk();
                }

                if (var1 > 413 && var2 > 237 && var1 < 462 && var2 < 258) {
                    this.ez = false;
                    super.clientStream.createOutgoingPacket(233);
                    this.sk();
                }
            } else if (this.ft != 0) {
                this.ez = false;
                super.clientStream.createOutgoingPacket(233);
                this.sk();
            }

            this.ft = 0;
            this.pz = 0;
        }

        if (this.ez) {
            byte var14 = 22;
            byte var15 = 36;
            this.surface.drawBox(var14, var15, 468, 12, 192);
            var3 = 10000536;
            this.surface.xf(var14, var15 + 12, 468, 18, var3, 160);
            this.surface.xf(var14, var15 + 30, 8, 248, var3, 160);
            this.surface.xf(var14 + 205, var15 + 30, 11, 248, var3, 160);
            this.surface.xf(var14 + 462, var15 + 30, 6, 248, var3, 160);
            this.surface.xf(var14 + 8, var15 + 133, 197, 22, var3, 160);
            this.surface.xf(var14 + 8, var15 + 258, 197, 20, var3, 160);
            this.surface.xf(var14 + 216, var15 + 235, 246, 43, var3, 160);
            var16 = 13684944;
            this.surface.xf(var14 + 8, var15 + 30, 197, 103, var16, 160);
            this.surface.xf(var14 + 8, var15 + 155, 197, 103, var16, 160);
            this.surface.xf(var14 + 216, var15 + 30, 246, 205, var16, 160);

            for(var5 = 0; var5 < 4; ++var5) {
                this.surface.ug(var14 + 8, var15 + 30 + var5 * 34, 197, 0);
            }

            for(var6 = 0; var6 < 4; ++var6) {
                this.surface.ug(var14 + 8, var15 + 155 + var6 * 34, 197, 0);
            }

            for(var7 = 0; var7 < 7; ++var7) {
                this.surface.ug(var14 + 216, var15 + 30 + var7 * 34, 246, 0);
            }

            for(var8 = 0; var8 < 6; ++var8) {
                if (var8 < 5) {
                    this.surface.zg(var14 + 8 + var8 * 49, var15 + 30, 103, 0);
                }

                if (var8 < 5) {
                    this.surface.zg(var14 + 8 + var8 * 49, var15 + 155, 103, 0);
                }

                this.surface.zg(var14 + 216 + var8 * 49, var15 + 30, 205, 0);
            }

            this.surface.qf("Trading with: " + this.fz, var14 + 1, var15 + 10, 1, 16777215);
            this.surface.qf("Your Offer", var14 + 9, var15 + 27, 4, 16777215);
            this.surface.qf("Opponent's Offer", var14 + 9, var15 + 152, 4, 16777215);
            this.surface.qf("Your Inventory", var14 + 216, var15 + 27, 4, 16777215);
            this.surface.ch("Accepted", var14 + 204, var15 + 27, 4, 65280);
            this.surface.uf(var14 + 125, var15 + 16, 11, 11, 65280);
            if (this.mz) {
                this.surface.drawBox(var14 + 127, var15 + 18, 7, 7, 65280);
            }

            this.surface.ch("Accept", var14 + 204, var15 + 152, 4, 65280);
            this.surface.uf(var14 + 143, var15 + 141, 11, 11, 65280);
            if (this.nz) {
                this.surface.drawBox(var14 + 145, var15 + 143, 7, 7, 65280);
            }

            this.surface.ch("Close", var14 + 408 + 49, var15 + 251, 4, 12582912);
            this.surface.uf(var14 + 364 + 49, var15 + 237, 49, 21, 12582912);

            int var10;
            int var11;
            for(int var9 = 0; var9 < this.inventoryItemsCount; ++var9) {
                var10 = 217 + var14 + var9 % 5 * 49;
                var11 = 31 + var15 + var9 / 5 * 34;
                this.surface.zf(var10, var11, 48, 32, this.yv + GameData.zhb[this.inventoryItemIds[var9]], GameData.lib[this.inventoryItemIds[var9]], 0, 0, false);
                if (GameData.itemStackable[this.inventoryItemIds[var9]] == 0) {
                    this.surface.qf(String.valueOf(this.inventoryItemStackAmount[var9]), var10 + 1, var11 + 10, 1, 16776960);
                }
            }

            int var12;
            for(var10 = 0; var10 < this.gz; ++var10) {
                var11 = 9 + var14 + var10 % 4 * 49;
                var12 = 31 + var15 + var10 / 4 * 34;
                this.surface.zf(var11, var12, 48, 32, this.yv + GameData.zhb[this.hz[var10]], GameData.lib[this.hz[var10]], 0, 0, false);
                if (GameData.itemStackable[this.hz[var10]] == 0) {
                    this.surface.qf(String.valueOf(this.iz[var10]), var11 + 1, var12 + 10, 1, 16776960);
                }

                if (super.kq > var11 && super.kq < var11 + 48 && super.lq > var12 && super.lq < var12 + 32) {
                    this.surface.qf(GameData.vhb[this.hz[var10]][0] + ": @whi@" + GameData.whb[this.hz[var10]], var14 + 8, var15 + 273, 1, 16776960);
                }
            }

            for(var11 = 0; var11 < this.jz; ++var11) {
                var12 = 9 + var14 + var11 % 4 * 49;
                int var13 = 156 + var15 + var11 / 4 * 34;
                this.surface.zf(var12, var13, 48, 32, this.yv + GameData.zhb[this.kz[var11]], GameData.lib[this.kz[var11]], 0, 0, false);
                if (GameData.itemStackable[this.kz[var11]] == 0) {
                    this.surface.qf(String.valueOf(this.lz[var11]), var12 + 1, var13 + 10, 1, 16776960);
                }

                if (super.kq > var12 && super.kq < var12 + 48 && super.lq > var13 && super.lq < var13 + 32) {
                    this.surface.qf(GameData.vhb[this.kz[var11]][0] + ": @whi@" + GameData.whb[this.kz[var11]], var14 + 8, var15 + 273, 1, 16776960);
                }
            }

        }
    }

    public void zk() {
        if (this.uw == 0 && super.kq >= this.surface.qj - 35 && super.lq >= 3 && super.kq < this.surface.qj - 3 && super.lq < 35) {
            this.uw = 1;
        }

        if (this.uw == 0 && super.kq >= this.surface.qj - 35 - 33 && super.lq >= 3 && super.kq < this.surface.qj - 3 - 33 && super.lq < 35) {
            this.uw = 2;
        }

        if (this.uw == 0 && super.kq >= this.surface.qj - 35 - 66 && super.lq >= 3 && super.kq < this.surface.qj - 3 - 66 && super.lq < 35) {
            this.uw = 3;
        }

        if (this.uw == 0 && super.kq >= this.surface.qj - 35 - 99 && super.lq >= 3 && super.kq < this.surface.qj - 3 - 99 && super.lq < 35) {
            this.uw = 4;
        }

        if (this.uw == 0 && super.kq >= this.surface.qj - 35 - 132 && super.lq >= 3 && super.kq < this.surface.qj - 3 - 132 && super.lq < 35) {
            this.uw = 5;
        }

        if (this.uw == 0 && super.kq >= this.surface.qj - 35 - 165 && super.lq >= 3 && super.kq < this.surface.qj - 3 - 165 && super.lq < 35) {
            this.uw = 6;
        }

        if (this.uw != 0 && super.kq >= this.surface.qj - 35 && super.lq >= 3 && super.kq < this.surface.qj - 3 && super.lq < 26) {
            this.uw = 1;
        }

        if (this.uw != 0 && super.kq >= this.surface.qj - 35 - 33 && super.lq >= 3 && super.kq < this.surface.qj - 3 - 33 && super.lq < 26) {
            this.uw = 2;
        }

        if (this.uw != 0 && super.kq >= this.surface.qj - 35 - 66 && super.lq >= 3 && super.kq < this.surface.qj - 3 - 66 && super.lq < 26) {
            this.uw = 3;
        }

        if (this.uw != 0 && super.kq >= this.surface.qj - 35 - 99 && super.lq >= 3 && super.kq < this.surface.qj - 3 - 99 && super.lq < 26) {
            this.uw = 4;
        }

        if (this.uw != 0 && super.kq >= this.surface.qj - 35 - 132 && super.lq >= 3 && super.kq < this.surface.qj - 3 - 132 && super.lq < 26) {
            this.uw = 5;
        }

        if (this.uw != 0 && super.kq >= this.surface.qj - 35 - 165 && super.lq >= 3 && super.kq < this.surface.qj - 3 - 165 && super.lq < 26) {
            this.uw = 6;
        }

        if (this.uw == 1 && (super.kq < this.surface.qj - 248 || super.lq > 36 + this.maxInventorySpaces / 5 * 34)) {
            this.uw = 0;
        }

        if (this.uw >= 2 && this.uw <= 5 && (super.kq < this.surface.qj - 199 || super.lq > 240)) {
            this.uw = 0;
        }

        if (this.uw == 6 && (super.kq < this.surface.qj - 199 || super.lq > 267)) {
            this.uw = 0;
        }

    }

    public void am(boolean var1) {
        int var2 = this.surface.qj - 248;
        this.surface.drawSprite(var2, 3, this.spriteMedia + 1);

        int var4;
        int var5;
        for(int var3 = 0; var3 < this.maxInventorySpaces; ++var3) {
            var4 = var2 + var3 % 5 * 49;
            var5 = 36 + var3 / 5 * 34;
            if (var3 < this.inventoryItemsCount && this.inventoryItemWielded[var3] == 1) {
                this.surface.xf(var4, var5, 49, 34, 16711680, 128);
            } else {
                this.surface.xf(var4, var5, 49, 34, Surface.ng(181, 181, 181), 128);
            }

            if (var3 < this.inventoryItemsCount) {
                this.surface.zf(var4, var5, 48, 32, this.yv + GameData.zhb[this.inventoryItemIds[var3]], GameData.lib[this.inventoryItemIds[var3]], 0, 0, false);
                if (GameData.itemStackable[this.inventoryItemIds[var3]] == 0) {
                    this.surface.qf(String.valueOf(this.inventoryItemStackAmount[var3]), var4 + 1, var5 + 10, 1, 16776960);
                }
            }
        }

        for(var4 = 1; var4 <= 4; ++var4) {
            this.surface.zg(var2 + var4 * 49, 36, this.maxInventorySpaces / 5 * 34, 0);
        }

        for(var5 = 1; var5 <= this.maxInventorySpaces / 5 - 1; ++var5) {
            this.surface.ug(var2, 36 + var5 * 34, 245, 0);
        }

        if (var1) {
            var2 = super.kq - (this.surface.qj - 248);
            int var6 = super.lq - 36;
            if (var2 >= 0 && var6 >= 0 && var2 < 248 && var6 < this.maxInventorySpaces / 5 * 34) {
                int var7 = var2 / 49 + var6 / 34 * 5;
                if (var7 < this.inventoryItemsCount) {
                    int var8 = this.inventoryItemIds[var7];
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

                        if (this.inventoryItemWielded[var7] == 1) {
                            this.jy[this.fy] = "Remove";
                            this.iy[this.fy] = "@lre@" + GameData.vhb[var8][0];
                            this.ky[this.fy] = 620;
                            this.ny[this.fy] = var7;
                            ++this.fy;
                        } else if (GameData.itemWieldable[var8] != 0) {
                            if ((GameData.itemWieldable[var8] & 24) != 0) {
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
        int var2 = this.surface.qj - 199;
        short var3 = 156;
        short var4 = 152;
        this.surface.drawSprite(var2 - 49, 3, this.spriteMedia + 2);
        var2 += 40;
        this.surface.drawBox(var2, 36, var3, var4, 0);
        this.surface.vf(var2, 36, var2 + var3, 36 + var4);
        short var5 = 192;
        int var6 = (this.localPlayer.currentX - 6040) * 3 * var5 / 2048;
        int var7 = (this.localPlayer.currentY - 6040) * 3 * var5 / 2048;
        int var8 = Scene.fm[1024 - this.av * 4 & 1023];
        int var9 = Scene.fm[(1024 - this.av * 4 & 1023) + 1024];
        int var10 = var7 * var8 + var6 * var9 >> 18;
        var7 = var7 * var9 - var6 * var8 >> 18;
        this.surface.sf(var2 + var3 / 2 - var10, 36 + var4 / 2 + var7, this.spriteMedia - 1, this.av + 64 & 255, var5);

        for(int var11 = 0; var11 < this.ew; ++var11) {
            var6 = (this.gw[var11] * this.ot + 64 - this.localPlayer.currentX) * 3 * var5 / 2048;
            var7 = (this.hw[var11] * this.ot + 64 - this.localPlayer.currentY) * 3 * var5 / 2048;
            var10 = var7 * var8 + var6 * var9 >> 18;
            var7 = var7 * var9 - var6 * var8 >> 18;
            this.bn(var2 + var3 / 2 + var10, 36 + var4 / 2 - var7, 65535);
        }

        for(int var12 = 0; var12 < this.xv; ++var12) {
            var6 = (this.zv[var12] * this.ot + 64 - this.localPlayer.currentX) * 3 * var5 / 2048;
            var7 = (this.aw[var12] * this.ot + 64 - this.localPlayer.currentY) * 3 * var5 / 2048;
            var10 = var7 * var8 + var6 * var9 >> 18;
            var7 = var7 * var9 - var6 * var8 >> 18;
            this.bn(var2 + var3 / 2 + var10, 36 + var4 / 2 - var7, 16711680);
        }

        for(int var13 = 0; var13 < this.qv; ++var13) {
            Character var14 = this.tv[var13];
            var6 = (var14.currentX - this.localPlayer.currentX) * 3 * var5 / 2048;
            var7 = (var14.currentY - this.localPlayer.currentY) * 3 * var5 / 2048;
            var10 = var7 * var8 + var6 * var9 >> 18;
            var7 = var7 * var9 - var6 * var8 >> 18;
            this.bn(var2 + var3 / 2 + var10, 36 + var4 / 2 - var7, 16776960);
        }

        for(int var16 = 0; var16 < this.playerCount; ++var16) {
            Character var15 = this.players[var16];
            var6 = (var15.currentX - this.localPlayer.currentX) * 3 * var5 / 2048;
            var7 = (var15.currentY - this.localPlayer.currentY) * 3 * var5 / 2048;
            var10 = var7 * var8 + var6 * var9 >> 18;
            var7 = var7 * var9 - var6 * var8 >> 18;
            this.bn(var2 + var3 / 2 + var10, 36 + var4 / 2 - var7, 16777215);
        }

        this.surface.cg(var2 + var3 / 2, 36 + var4 / 2, 2, 16777215, 255);
        this.surface.sf(var2 + 19, 55, this.spriteMedia + 24, this.av + 128 & 255, 128);
        this.surface.vf(0, 0, this.gameWidth, this.gameHeight + 12);
        if (var1) {
            var2 = super.kq - (this.surface.qj - 199);
            int var17 = super.lq - 36;
            if (var2 >= 40 && var17 >= 0 && var2 < 196 && var17 < 152) {
                var3 = 156;
                var4 = 152;
                var5 = 192;
                var2 = this.surface.qj - 199;
                var2 += 40;
                var6 = (super.kq - (var2 + var3 / 2)) * 16384 / (3 * var5);
                var7 = (super.lq - (36 + var4 / 2)) * 16384 / (3 * var5);
                var8 = Scene.fm[1024 - this.av * 4 & 1023];
                var9 = Scene.fm[(1024 - this.av * 4 & 1023) + 1024];
                var10 = var7 * var8 + var6 * var9 >> 15;
                var7 = var7 * var9 - var6 * var8 >> 15;
                var6 = var10 + this.localPlayer.currentX;
                var7 = this.localPlayer.currentY - var7;
                if (this.ft == 1) {
                    this.jl(this.localRegionX, this.localRegionY, var6 / 128, var7 / 128, false);
                }

                this.ft = 0;
            }

        }
    }

    public void vl(boolean var1) {
        int var2 = this.surface.qj - 199;
        byte var3 = 36;
        this.surface.drawSprite(var2 - 49, 3, this.spriteMedia + 3);
        short var4 = 196;
        short var5 = 206;
        int var7;
        int var6 = var7 = Surface.ng(160, 160, 160);
        if (this.sx == 0) {
            var6 = Surface.ng(220, 220, 220);
        } else {
            var7 = Surface.ng(220, 220, 220);
        }

        this.surface.xf(var2, var3, var4 / 2, 24, var6, 128);
        this.surface.xf(var2 + var4 / 2, var3, var4 / 2, 24, var7, 128);
        this.surface.xf(var2, var3 + 24, var4, var5 - 24, Surface.ng(220, 220, 220), 128);
        this.surface.ug(var2, var3 + 24, var4, 0);
        this.surface.zg(var2 + var4 / 2, var3, 24, 0);
        this.surface.xg("Stats", var2 + var4 / 4, var3 + 16, 4, 0);
        this.surface.xg("Quests", var2 + var4 / 4 + var4 / 2, var3 + 16, 4, 0);
        int var12;
        if (this.sx == 0) {
            byte var8 = 72;
            this.surface.qf("Skills", var2 + 5, var8, 3, 16776960);
            var12 = var8 + 13;

            for(int var9 = 0; var9 < 8; ++var9) {
                this.surface.qf(this.gx[var9] + ":@yel@" + this.playerStatCur[var9] + "/" + this.playerStatMax[var9], var2 + 5, var12, 1, 16777215);
                this.surface.qf(this.gx[var9 + 8] + ":@yel@" + this.playerStatCur[var9 + 8] + "/" + this.playerStatMax[var9 + 8], var2 + var4 / 2 - 8, var12 - 13, 1, 16777215);
                var12 += 13;
            }

            this.surface.qf("Quest Points:@yel@" + this.questPoints, var2 + var4 / 2 - 8, var12 - 13, 1, 16777215);
            var12 += 8;
            this.surface.qf("Equipment Status", var2 + 5, var12, 3, 16776960);
            var12 += 12;

            for(int var10 = 0; var10 < 3; ++var10) {
                this.surface.qf(this.hx[var10] + ":@yel@" + this.ex[var10], var2 + 5, var12, 1, 16777215);
                if (var10 < 2) {
                    this.surface.qf(this.hx[var10 + 3] + ":@yel@" + this.ex[var10 + 3], var2 + var4 / 2 + 25, var12, 1, 16777215);
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
            var2 = super.kq - (this.surface.qj - 199);
            int var11 = super.lq - 36;
            if (var2 >= 0 && var11 >= 0 && var2 < var4 && var11 < var5) {
                if (this.sx == 1) {
                    this.qx.ud(var2 + (this.surface.qj - 199), var11 + 36, super.nq, super.mq);
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
        int var2 = this.surface.qj - 199;
        byte var3 = 36;
        this.surface.drawSprite(var2 - 49, 3, this.spriteMedia + 4);
        short var4 = 196;
        short var5 = 182;
        int var7;
        int var6 = var7 = Surface.ng(160, 160, 160);
        if (this.kx == 0) {
            var6 = Surface.ng(220, 220, 220);
        } else {
            var7 = Surface.ng(220, 220, 220);
        }

        this.surface.xf(var2, var3, var4 / 2, 24, var6, 128);
        this.surface.xf(var2 + var4 / 2, var3, var4 / 2, 24, var7, 128);
        this.surface.xf(var2, var3 + 24, var4, 90, Surface.ng(220, 220, 220), 128);
        this.surface.xf(var2, var3 + 24 + 90, var4, var5 - 90 - 24, Surface.ng(160, 160, 160), 128);
        this.surface.ug(var2, var3 + 24, var4, 0);
        this.surface.zg(var2 + var4 / 2, var3, 24, 0);
        this.surface.ug(var2, var3 + 113, var4, 0);
        this.surface.xg("Magic", var2 + var4 / 4, var3 + 16, 4, 0);
        this.surface.xg("Prayers", var2 + var4 / 4 + var4 / 2, var3 + 16, 4, 0);
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

                var12 = this.playerStatCur[6];
                if (GameData.tlb[var9] > var12) {
                    var10 = "@bla@";
                }

                this.ix.hd(this.jx, var8++, var10 + "Level " + GameData.tlb[var9] + ": " + GameData.rlb[var9]);
            }

            this.ix.hc();
            var17 = this.ix.jc(this.jx);
            if (var17 != -1) {
                this.surface.qf("Level " + GameData.tlb[var17] + ": " + GameData.rlb[var17], var2 + 2, var3 + 124, 1, 16776960);
                this.surface.qf(GameData.slb[var17], var2 + 2, var3 + 136, 0, 16777215);

                for(var11 = 0; var11 < GameData.ulb[var17]; ++var11) {
                    var12 = GameData.wlb[var17][var11];
                    this.surface.drawSprite(var2 + 2 + var11 * 44, var3 + 150, this.yv + GameData.zhb[var12]);
                    int var13 = this.ml(var12);
                    int var14 = GameData.xlb[var17][var11];
                    String var15 = "@red@";
                    if (this.rm(var12, var14)) {
                        var15 = "@gre@";
                    }

                    this.surface.qf(var15 + var13 + "/" + var14, var2 + 2 + var11 * 44, var3 + 150, 1, 16777215);
                }
            } else {
                this.surface.qf("Point at a spell for a description", var2 + 2, var3 + 124, 1, 0);
            }
        }

        if (this.kx == 1) {
            this.ix.nc(this.jx);
            var8 = 0;

            for(var9 = 0; var9 < GameData.imb; ++var9) {
                var10 = "@whi@";
                if (GameData.lmb[var9] > this.playerStatMax[5]) {
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
                this.surface.xg("Level " + GameData.lmb[var17] + ": " + GameData.jmb[var17], var2 + var4 / 2, var3 + 130, 1, 16776960);
                this.surface.xg(GameData.kmb[var17], var2 + var4 / 2, var3 + 145, 0, 16777215);
                this.surface.xg("Drain rate: " + GameData.mmb[var17], var2 + var4 / 2, var3 + 160, 1, 0);
            } else {
                this.surface.qf("Point at a prayer for a description", var2 + 2, var3 + 124, 1, 0);
            }
        }

        if (var1) {
            var2 = super.kq - (this.surface.qj - 199);
            int var16 = super.lq - 36;
            if (var2 >= 0 && var16 >= 0 && var2 < 196 && var16 < 182) {
                this.ix.ud(var2 + (this.surface.qj - 199), var16 + 36, super.nq, super.mq);
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
                        var9 = this.playerStatCur[6];
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
                        var9 = this.playerStatMax[5];
                        if (GameData.lmb[var8] > var9) {
                            this.pk("Your prayer ability is not high enough for this prayer", 3);
                        } else if (this.playerStatCur[5] == 0) {
                            this.pk("You have run out of prayer points. Return to a church to recharge", 3);
                        } else if (this.wx[var8]) {
                            super.clientStream.createOutgoingPacket(211);
                            super.clientStream.putByte(var8);
                            super.clientStream.sendPacket();
                            this.wx[var8] = false;
                        } else {
                            super.clientStream.createOutgoingPacket(212);
                            super.clientStream.putByte(var8);
                            super.clientStream.sendPacket();
                            this.wx[var8] = true;
                        }
                    }
                }

                this.ft = 0;
            }

        }
    }

    public void tk(boolean var1) {
        int var2 = this.surface.qj - 199;
        byte var3 = 36;
        this.surface.drawSprite(var2 - 49, 3, this.spriteMedia + 5);
        short var4 = 196;
        short var5 = 182;
        int var7;
        int var6 = var7 = Surface.ng(160, 160, 160);
        if (this.ox == 0) {
            var6 = Surface.ng(220, 220, 220);
        } else {
            var7 = Surface.ng(220, 220, 220);
        }

        this.surface.xf(var2, var3, var4 / 2, 24, var6, 128);
        this.surface.xf(var2 + var4 / 2, var3, var4 / 2, 24, var7, 128);
        this.surface.xf(var2, var3 + 24, var4, var5 - 24, Surface.ng(220, 220, 220), 128);
        this.surface.ug(var2, var3 + 24, var4, 0);
        this.surface.zg(var2 + var4 / 2, var3, 24, 0);
        this.surface.ug(var2, var3 + var5 - 16, var4, 0);
        this.surface.xg("Friends", var2 + var4 / 4, var3 + 16, 4, 0);
        this.surface.xg("Ignore", var2 + var4 / 4 + var4 / 2, var3 + 16, 4, 0);
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
                    this.surface.xg("Click to remove " + Utility.rn(super.ld[var8]), var2 + var4 / 2, var3 + 35, 1, 16777215);
                } else if (super.md[var8] == 2) {
                    this.surface.xg("Click to message " + Utility.rn(super.ld[var8]), var2 + var4 / 2, var3 + 35, 1, 16777215);
                } else if (super.md[var8] == 1) {
                    this.surface.xg(Utility.rn(super.ld[var8]) + " is on a different server", var2 + var4 / 2, var3 + 35, 1, 16777215);
                } else {
                    this.surface.xg(Utility.rn(super.ld[var8]) + " is offline", var2 + var4 / 2, var3 + 35, 1, 16777215);
                }
            } else {
                this.surface.xg("Click a name to send a message", var2 + var4 / 2, var3 + 35, 1, 16777215);
            }

            if (super.kq > var2 && super.kq < var2 + var4 && super.lq > var3 + var5 - 16 && super.lq < var3 + var5) {
                var11 = 16776960;
            } else {
                var11 = 16777215;
            }

            this.surface.xg("Click here to add a friend", var2 + var4 / 2, var3 + var5 - 3, 1, var11);
        }

        if (this.ox == 1) {
            var8 = this.mx.jc(this.nx);
            if (var8 >= 0 && super.kq < 489 && super.kq > 429) {
                if (super.kq > 429) {
                    this.surface.xg("Click to remove " + Utility.rn(super.od[var8]), var2 + var4 / 2, var3 + 35, 1, 16777215);
                }
            } else {
                this.surface.xg("Blocking messages from:", var2 + var4 / 2, var3 + 35, 1, 16777215);
            }

            if (super.kq > var2 && super.kq < var2 + var4 && super.lq > var3 + var5 - 16 && super.lq < var3 + var5) {
                var11 = 16776960;
            } else {
                var11 = 16777215;
            }

            this.surface.xg("Click here to add a name", var2 + var4 / 2, var3 + var5 - 3, 1, var11);
        }

        if (var1) {
            var2 = super.kq - (this.surface.qj - 199);
            int var10 = super.lq - 36;
            if (var2 >= 0 && var10 >= 0 && var2 < 196 && var10 < 182) {
                this.mx.ud(var2 + (this.surface.qj - 199), var10 + 36, super.nq, super.mq);
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
        int var2 = this.surface.qj - 199;
        byte var3 = 36;
        this.surface.drawSprite(var2 - 49, 3, this.spriteMedia + 6);
        short var4 = 196;
        this.surface.xf(var2, 36, var4, 90, Surface.ng(181, 181, 181), 160);
        this.surface.xf(var2, 126, var4, 105, Surface.ng(201, 2011, 201), 160);
        this.surface.xf(var2, 231, var4, 30, Surface.ng(181, 181, 181), 160);
        int var5 = var2 + 3;
        int var6 = var3 + 15;
        this.surface.qf("Game options - click to toggle", var5, var6, 1, 0);
        var6 += 15;
        if (this.cameraModeAuto) {
            this.surface.qf("Camera angle mode - @gre@Auto", var5, var6, 1, 16777215);
        } else {
            this.surface.qf("Camera angle mode - @red@Manual", var5, var6, 1, 16777215);
        }

        var6 += 15;
        if (this.mouseButtonOne) {
            this.surface.qf("Mouse buttons - @red@One", var5, var6, 1, 16777215);
        } else {
            this.surface.qf("Mouse buttons - @gre@Two", var5, var6, 1, 16777215);
        }

        var6 += 15;
        if (this.playerKiller) {
            this.surface.qf("Player type: @red@Player-Killer", var5, var6, 1, 16777215);
        } else {
            this.surface.qf("Player type: @gre@Non Player-Killer", var5, var6, 1, 16777215);
        }

        var6 += 15;
        int var7 = 16777215;
        if (super.kq > var5 && super.kq < var5 + var4 && super.lq > var6 - 12 && super.lq < var6 + 4) {
            var7 = 16776960;
        }

        this.surface.qf("Change password", var5, var6, 1, var7);
        var6 += 15;
        var6 += 15;
        this.surface.qf("Privacy settings. Will be applied to", var2 + 3, var6, 1, 0);
        var6 += 15;
        this.surface.qf("all people not on your friends list", var2 + 3, var6, 1, 0);
        var6 += 15;
        if (super.pd == 0) {
            this.surface.qf("Hide online-status: @red@<off>", var2 + 3, var6, 1, 16777215);
        } else {
            this.surface.qf("Hide online-status: @gre@<on>", var2 + 3, var6, 1, 16777215);
        }

        var6 += 15;
        if (super.qd == 0) {
            this.surface.qf("Block chat messages: @red@<off>", var2 + 3, var6, 1, 16777215);
        } else {
            this.surface.qf("Block chat messages: @gre@<on>", var2 + 3, var6, 1, 16777215);
        }

        var6 += 15;
        if (super.rd == 0) {
            this.surface.qf("Block private messages: @red@<off>", var2 + 3, var6, 1, 16777215);
        } else {
            this.surface.qf("Block private messages: @gre@<on>", var2 + 3, var6, 1, 16777215);
        }

        var6 += 15;
        if (super.sd == 0) {
            this.surface.qf("Block trade requests: @red@<off>", var2 + 3, var6, 1, 16777215);
        } else {
            this.surface.qf("Block trade requests: @gre@<on>", var2 + 3, var6, 1, 16777215);
        }

        var6 += 15;
        var6 += 15;
        var7 = 16777215;
        if (super.kq > var5 && super.kq < var5 + var4 && super.lq > var6 - 12 && super.lq < var6 + 4) {
            var7 = 16776960;
        }

        this.surface.qf("Click here to logout", var2 + 3, var6, 1, var7);
        if (var1) {
            var2 = super.kq - (this.surface.qj - 199);
            int var11 = super.lq - 36;
            if (var2 >= 0 && var11 >= 0 && var2 < 196 && var11 < 231) {
                int var8 = this.surface.qj - 199;
                byte var9 = 36;
                var4 = 196;
                var5 = var8 + 3;
                var6 = var9 + 30;
                if (super.kq > var5 && super.kq < var5 + var4 && super.lq > var6 - 12 && super.lq < var6 + 4 && this.ft == 1) {
                    this.cameraModeAuto = !this.cameraModeAuto;
                    super.clientStream.createOutgoingPacket(213);
                    super.clientStream.putByte(0);
                    super.clientStream.putByte(this.cameraModeAuto ? 1 : 0);
                    super.clientStream.sendPacket();
                }

                var6 += 15;
                if (super.kq > var5 && super.kq < var5 + var4 && super.lq > var6 - 12 && super.lq < var6 + 4 && this.ft == 1) {
                    this.mouseButtonOne = !this.mouseButtonOne;
                    super.clientStream.createOutgoingPacket(213);
                    super.clientStream.putByte(2);
                    super.clientStream.putByte(this.mouseButtonOne ? 1 : 0);
                    super.clientStream.sendPacket();
                }

                var6 += 15;
                if (super.kq > var5 && super.kq < var5 + var4 && super.lq > var6 - 12 && super.lq < var6 + 4 && this.ft == 1 && this.pkChangesLeft > 0) {
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

        int var4 = this.scene.wi();
        GameModel[] var5 = this.scene.sh();
        int[] var6 = this.scene.ri();

        for(int var7 = 0; var7 < var4; ++var7) {
            int var8 = var6[var7];
            GameModel var9 = var5[var7];
            if (var9.oh[var8] <= 65535 || var9.oh[var8] >= 200000 && var9.oh[var8] <= 300000) {
                int var10;
                int var11;
                if (var9 != this.scene.tn) {
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
                        var14 = this.players[var10].tr;
                        if (var14 == 1) {
                            var13 = 0;
                            if (this.localPlayer.ur > 0 && this.players[var10].ur > 0) {
                                var13 = this.localPlayer.ur - this.players[var10].ur;
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

                            var12 = " " + var12 + "(level-" + this.players[var10].ur + ")";
                        }

                        if (this.lx >= 0) {
                            if (GameData.vlb[this.lx] == 1 || GameData.vlb[this.lx] == 2 && var14 == 1 && this.localPlayer.tr == 1) {
                                this.jy[this.fy] = "Cast " + GameData.rlb[this.lx] + " on";
                                this.iy[this.fy] = "@whi@" + this.players[var10].xq;
                                this.ky[this.fy] = 800;
                                this.ly[this.fy] = this.players[var10].currentX;
                                this.my[this.fy] = this.players[var10].currentY;
                                this.ny[this.fy] = this.players[var10].pid;
                                this.oy[this.fy] = this.lx;
                                ++this.fy;
                            }
                        } else if (this.ax >= 0) {
                            this.jy[this.fy] = "Use " + this.bx + " with";
                            this.iy[this.fy] = "@whi@" + this.players[var10].xq;
                            this.ky[this.fy] = 810;
                            this.ly[this.fy] = this.players[var10].currentX;
                            this.my[this.fy] = this.players[var10].currentY;
                            this.ny[this.fy] = this.players[var10].pid;
                            this.oy[this.fy] = this.ax;
                            ++this.fy;
                        } else {
                            if (var14 == 1 && this.localPlayer.tr == 1) {
                                this.jy[this.fy] = "Attack";
                                this.iy[this.fy] = "@whi@" + this.players[var10].xq + var12;
                                if (var13 >= 0 && var13 < 5) {
                                    this.ky[this.fy] = 805;
                                } else {
                                    this.ky[this.fy] = 2805;
                                }

                                this.ly[this.fy] = this.players[var10].currentX;
                                this.my[this.fy] = this.players[var10].currentY;
                                this.ny[this.fy] = this.players[var10].pid;
                                ++this.fy;
                            }

                            this.jy[this.fy] = "Trade with";
                            this.iy[this.fy] = "@whi@" + this.players[var10].xq;
                            this.ky[this.fy] = 2810;
                            this.ny[this.fy] = this.players[var10].pid;
                            ++this.fy;
                            this.jy[this.fy] = "Follow";
                            this.iy[this.fy] = "@whi@" + this.players[var10].xq;
                            this.ky[this.fy] = 2820;
                            this.ny[this.fy] = this.players[var10].pid;
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
                            int var16 = (this.playerStatMax[0] + this.playerStatMax[1] + this.playerStatMax[2] + this.playerStatMax[3] + 27) / 4;
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
                                this.ly[this.fy] = this.tv[var10].currentX;
                                this.my[this.fy] = this.tv[var10].currentY;
                                this.ny[this.fy] = this.tv[var10].pid;
                                this.oy[this.fy] = this.lx;
                                ++this.fy;
                            }
                        } else if (this.ax >= 0) {
                            this.jy[this.fy] = "Use " + this.bx + " with";
                            this.iy[this.fy] = "@yel@" + GameData.pib[this.tv[var10].cr][0];
                            this.ky[this.fy] = 710;
                            this.ly[this.fy] = this.tv[var10].currentX;
                            this.my[this.fy] = this.tv[var10].currentY;
                            this.ny[this.fy] = this.tv[var10].pid;
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

                                this.ly[this.fy] = this.tv[var10].currentX;
                                this.my[this.fy] = this.tv[var10].currentY;
                                this.ny[this.fy] = this.tv[var10].pid;
                                ++this.fy;
                            }

                            this.jy[this.fy] = "Talk-to";
                            this.iy[this.fy] = "@yel@" + GameData.pib[this.tv[var10].cr][0];
                            this.ky[this.fy] = 720;
                            this.ly[this.fy] = this.tv[var10].currentX;
                            this.my[this.fy] = this.tv[var10].currentY;
                            this.ny[this.fy] = this.tv[var10].pid;
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
                    this.ly[this.fy] = this.world.rgb[var1];
                    this.my[this.fy] = this.world.sgb[var1];
                    this.ny[this.fy] = this.lx;
                    ++this.fy;
                    return;
                }
            } else if (this.ax < 0) {
                this.jy[this.fy] = "Walk here";
                this.iy[this.fy] = "";
                this.ky[this.fy] = 920;
                this.ly[this.fy] = this.world.rgb[var1];
                this.my[this.fy] = this.world.sgb[var1];
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
                this.surface.xf(this.by, this.cy, this.dy, this.ey, 13684944, 160);
                this.surface.qf("Choose option", this.by + 2, this.cy + 12, 1, 65535);

                for(var1 = 0; var1 < this.fy; ++var1) {
                    var2 = this.by + 2;
                    var3 = this.cy + 27 + var1 * 15;
                    int var4 = 16777215;
                    if (super.kq > var2 - 2 && super.lq > var3 - 12 && super.lq < var3 + 4 && super.kq < var2 - 3 + this.dy) {
                        var4 = 16776960;
                    }

                    this.surface.qf(this.jy[this.qy[var1]] + " " + this.iy[this.qy[var1]], var2, var3, 1, var4);
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
                this.surface.qf(var8, 6, 14, 1, 16776960);
            }

            if (!this.mouseButtonOne && this.ft == 1 || this.mouseButtonOne && this.ft == 1 && this.fy == 1) {
                this.jm(this.qy[0]);
                this.ft = 0;
                return;
            }

            if (!this.mouseButtonOne && this.ft == 2 || this.mouseButtonOne && this.ft == 1) {
                this.ey = (this.fy + 1) * 15;
                this.dy = this.surface.hf("Choose option", 1) + 5;

                for(int var6 = 0; var6 < this.fy; ++var6) {
                    int var7 = this.surface.hf(this.jy[var6] + " " + this.iy[var6], 1) + 5;
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
            this.om(this.localRegionX, this.localRegionY, var2, var3, true);
            super.clientStream.createOutgoingPacket(224);
            super.clientStream.putShort(var2 + this.ku);
            super.clientStream.putShort(var3 + this.lu);
            super.clientStream.putShort(var4);
            super.clientStream.putShort(var5);
            this.sk();
            this.lx = -1;
        }

        if (var7 == 210) {
            this.om(this.localRegionX, this.localRegionY, var2, var3, true);
            super.clientStream.createOutgoingPacket(250);
            super.clientStream.putShort(var2 + this.ku);
            super.clientStream.putShort(var3 + this.lu);
            super.clientStream.putShort(var4);
            super.clientStream.putShort(var5);
            this.sk();
            this.ax = -1;
        }

        if (var7 == 220) {
            this.om(this.localRegionX, this.localRegionY, var2, var3, true);
            super.clientStream.createOutgoingPacket(252);
            super.clientStream.putShort(var2 + this.ku);
            super.clientStream.putShort(var3 + this.lu);
            super.clientStream.putShort(var4);
            this.sk();
        }

        if (var7 == 3200) {
            this.pk(GameData.whb[var4], 3);
        }

        if (var7 == 300) {
            this.fl(var2, var3, var4);
            super.clientStream.createOutgoingPacket(223);
            super.clientStream.putShort(var2 + this.ku);
            super.clientStream.putShort(var3 + this.lu);
            super.clientStream.putByte(var4);
            super.clientStream.putShort(var5);
            this.sk();
            this.lx = -1;
        }

        if (var7 == 310) {
            this.fl(var2, var3, var4);
            super.clientStream.createOutgoingPacket(239);
            super.clientStream.putShort(var2 + this.ku);
            super.clientStream.putShort(var3 + this.lu);
            super.clientStream.putByte(var4);
            super.clientStream.putShort(var5);
            this.sk();
            this.ax = -1;
        }

        if (var7 == 320) {
            this.fl(var2, var3, var4);
            super.clientStream.createOutgoingPacket(238);
            super.clientStream.putShort(var2 + this.ku);
            super.clientStream.putShort(var3 + this.lu);
            super.clientStream.putByte(var4);
            this.sk();
        }

        if (var7 == 2300) {
            this.fl(var2, var3, var4);
            super.clientStream.createOutgoingPacket(229);
            super.clientStream.putShort(var2 + this.ku);
            super.clientStream.putShort(var3 + this.lu);
            super.clientStream.putByte(var4);
            this.sk();
        }

        if (var7 == 3300) {
            this.pk(GameData.nkb[var4], 3);
        }

        if (var7 == 400) {
            this.rk(var2, var3, var4, var5);
            super.clientStream.createOutgoingPacket(222);
            super.clientStream.putShort(var2 + this.ku);
            super.clientStream.putShort(var3 + this.lu);
            super.clientStream.putShort(var6);
            this.sk();
            this.lx = -1;
        }

        if (var7 == 410) {
            this.rk(var2, var3, var4, var5);
            super.clientStream.createOutgoingPacket(241);
            super.clientStream.putShort(var2 + this.ku);
            super.clientStream.putShort(var3 + this.lu);
            super.clientStream.putShort(var6);
            this.sk();
            this.ax = -1;
        }

        if (var7 == 420) {
            this.rk(var2, var3, var4, var5);
            super.clientStream.createOutgoingPacket(242);
            super.clientStream.putShort(var2 + this.ku);
            super.clientStream.putShort(var3 + this.lu);
            this.sk();
        }

        if (var7 == 2400) {
            this.rk(var2, var3, var4, var5);
            super.clientStream.createOutgoingPacket(230);
            super.clientStream.putShort(var2 + this.ku);
            super.clientStream.putShort(var3 + this.lu);
            this.sk();
        }

        if (var7 == 3400) {
            this.pk(GameData.ckb[var4], 3);
        }

        if (var7 == 600) {
            super.clientStream.createOutgoingPacket(220);
            super.clientStream.putShort(var4);
            super.clientStream.putShort(var5);
            this.sk();
            this.lx = -1;
        }

        if (var7 == 610) {
            super.clientStream.createOutgoingPacket(240);
            super.clientStream.putShort(var4);
            super.clientStream.putShort(var5);
            this.sk();
            this.ax = -1;
        }

        if (var7 == 620) {
            super.clientStream.createOutgoingPacket(248);
            super.clientStream.putShort(var4);
            this.sk();
        }

        if (var7 == 630) {
            super.clientStream.createOutgoingPacket(249);
            super.clientStream.putShort(var4);
            this.sk();
        }

        if (var7 == 640) {
            super.clientStream.createOutgoingPacket(246);
            super.clientStream.putShort(var4);
            this.sk();
        }

        if (var7 == 650) {
            this.ax = var4;
            this.uw = 0;
            this.bx = GameData.vhb[this.inventoryItemIds[this.ax]][0];
        }

        if (var7 == 660) {
            super.clientStream.createOutgoingPacket(251);
            super.clientStream.putShort(var4);
            this.sk();
            this.ax = -1;
            this.uw = 0;
            this.pk("Dropping " + GameData.vhb[this.inventoryItemIds[var4]][0], 4);
        }

        if (var7 == 3600) {
            this.pk(GameData.whb[var4], 3);
        }

        int var8;
        int var9;
        if (var7 == 700) {
            var8 = (var2 - 64) / this.ot;
            var9 = (var3 - 64) / this.ot;
            this.jl(this.localRegionX, this.localRegionY, var8, var9, true);
            super.clientStream.createOutgoingPacket(225);
            super.clientStream.putShort(var4);
            super.clientStream.putShort(var5);
            this.sk();
            this.lx = -1;
        }

        if (var7 == 710) {
            var8 = (var2 - 64) / this.ot;
            var9 = (var3 - 64) / this.ot;
            this.jl(this.localRegionX, this.localRegionY, var8, var9, true);
            super.clientStream.createOutgoingPacket(243);
            super.clientStream.putShort(var4);
            super.clientStream.putShort(var5);
            this.sk();
            this.ax = -1;
        }

        if (var7 == 720) {
            var8 = (var2 - 64) / this.ot;
            var9 = (var3 - 64) / this.ot;
            this.jl(this.localRegionX, this.localRegionY, var8, var9, true);
            super.clientStream.createOutgoingPacket(245);
            super.clientStream.putShort(var4);
            this.sk();
        }

        if (var7 == 715 || var7 == 2715) {
            var8 = (var2 - 64) / this.ot;
            var9 = (var3 - 64) / this.ot;
            this.jl(this.localRegionX, this.localRegionY, var8, var9, true);
            super.clientStream.createOutgoingPacket(244);
            super.clientStream.putShort(var4);
            this.sk();
        }

        if (var7 == 3700) {
            this.pk(GameData.qib[var4], 3);
        }

        if (var7 == 800) {
            var8 = (var2 - 64) / this.ot;
            var9 = (var3 - 64) / this.ot;
            this.jl(this.localRegionX, this.localRegionY, var8, var9, true);
            super.clientStream.createOutgoingPacket(226);
            super.clientStream.putShort(var4);
            super.clientStream.putShort(var5);
            this.sk();
            this.lx = -1;
        }

        if (var7 == 810) {
            var8 = (var2 - 64) / this.ot;
            var9 = (var3 - 64) / this.ot;
            this.jl(this.localRegionX, this.localRegionY, var8, var9, true);
            super.clientStream.createOutgoingPacket(219);
            super.clientStream.putShort(var4);
            super.clientStream.putShort(var5);
            this.sk();
            this.ax = -1;
        }

        if (var7 == 805 || var7 == 2805) {
            var8 = (var2 - 64) / this.ot;
            var9 = (var3 - 64) / this.ot;
            this.jl(this.localRegionX, this.localRegionY, var8, var9, true);
            super.clientStream.createOutgoingPacket(228);
            super.clientStream.putShort(var4);
            this.sk();
        }

        if (var7 == 2810) {
            super.clientStream.createOutgoingPacket(235);
            super.clientStream.putShort(var4);
            this.sk();
        }

        if (var7 == 2820) {
            super.clientStream.createOutgoingPacket(214);
            super.clientStream.putShort(var4);
            this.sk();
        }

        if (var7 == 900) {
            this.jl(this.localRegionX, this.localRegionY, var2, var3, true);
            super.clientStream.createOutgoingPacket(221);
            super.clientStream.putShort(var2 + this.ku);
            super.clientStream.putShort(var3 + this.lu);
            super.clientStream.putShort(var4);
            this.sk();
            this.lx = -1;
        }

        if (var7 == 920) {
            this.jl(this.localRegionX, this.localRegionY, var2, var3, false);
            if (this.cu == -24) {
                this.cu = 24;
            }
        }

        if (var7 == 1000) {
            super.clientStream.createOutgoingPacket(227);
            super.clientStream.putShort(var4);
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
        this.gameWidth = 512;
        this.gameHeight = 334;
        this.st = 9;
        this.vt = 40;
        this.au = -1;
        this.bu = -1;
        this.ju = -1;
        this.planeFloor = -1;
        this.uu = 550;
        this.vu = false;
        this.yu = 1;
        this.av = 128;
        this.cv = 4000;
        this.dv = 500;
        this.hv = new Character[this.cv];
        this.players = new Character[this.dv];
        this.jv = new Character[this.dv];
        this.localPlayer = new Character();
        this.serverIndex = -1;
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
        this.maxInventorySpaces = 30;
        this.inventoryItemIds = new int[35];
        this.inventoryItemStackAmount = new int[35];
        this.inventoryItemWielded = new int[35];
        this.ax = -1;
        this.bx = "";
        this.playerStatCur = new int[16];
        this.playerStatMax = new int[16];
        this.ex = new int[5];
        this.gx = new String[]{"Attack", "Defense", "Strength", "Hits", "Ranged", "Prayer", "Magic", "Cooking", "Woodcutting", "Fletching", "Fishing", "Firemaking", "Crafting", "Smithing", "Mining", "Herblaw"};
        this.hx = new String[]{"Armour", "WeaponAim", "WeaponPower", "Magic", "Prayer"};
        this.lx = -1;
        this.tx = 16;
        this.ux = new String[]{"Black knight's fortress", "Cook's assistant", "Demon slayer", "Doric's quest", "The restless ghost", "Goblin diplomacy", "Ernest the chicken", "Imp catcher", "Pirate's treasure", "Prince Ali rescue", "Romeo & Juliet", "Sheep shearer", "Shield of Arrav", "The knight's sword", "Vampire slayer", "Witch's potion"};
        this.vx = new boolean[this.tx];
        this.wx = new boolean[50];
        this.xx = false;
        this.cameraModeAuto = true;
        this.playerKiller = false;
        this.ay = false;
        this.gy = 200;
        this.mouseButtonOne = false;
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
        this.yoptinInterestsSelectedValues = new int[20];
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
        this.showAppearanceChange = false;
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
