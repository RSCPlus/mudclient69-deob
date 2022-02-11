package jagex.client;

import jagex.Utility;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class GameModel {
    public int hg;
    public int[] ig;
    public int[] jg;
    public int[] kg;
    public int[] lg;
    public int[] mg;
    public int[] ng;
    public byte[] og;
    public int pg;
    public int[] qg;
    public int[][] rg;
    public int[] sg;
    public int[] tg;
    public int[] ug;
    public int[] vg;
    public int[] wg;
    public int[] xg;
    public int[] yg;
    public int[] zg;
    public int ah;
    public int bh;
    public int ch;
    public boolean dh;
    public int eh;
    public int fh;
    public int gh;
    public int hh;
    public int ih;
    public int jh;
    public boolean kh;
    public boolean lh;
    public boolean mh;
    public int nh;
    public int[] oh;
    public byte[] ph;
    private boolean qh;
    public boolean rh;
    public boolean sh;
    public boolean th;
    public boolean uh;
    private static int[] vh = new int[512];
    private static int[] wh = new int[2048];
    private static byte[] xh = new byte[64];
    private static int[] yh = new int[256];
    private int zh;
    private int ai;
    public int bi;
    public int[] ci;
    public int[] di;
    public int[] ei;
    public int[] fi;
    public int[] gi;
    public int[] hi;
    private int ii;
    private int[][] ji;
    private int[] ki;
    private int[] li;
    private int[] mi;
    private int[] ni;
    private int[] oi;
    private int[] pi;
    private int qi;
    private int ri;
    private int si;
    private int ti;
    private int ui;
    private int vi;
    private int wi;
    private int xi;
    private int yi;
    private int zi;
    private int aj;
    private int bj;
    private int cj;
    private int dj;
    private int ej;
    private int fj;
    private int gj;
    private int hj;
    private int ij;
    private int jj;
    private int kj;
    protected int lj;
    protected int mj;
    private byte[] nj;
    private int oj;
    private int pj;

    public GameModel(int var1, int var2) {
        this.ch = 1;
        this.dh = true;
        this.kh = true;
        this.lh = false;
        this.mh = false;
        this.nh = -1;
        this.qh = false;
        this.rh = false;
        this.sh = false;
        this.th = false;
        this.uh = false;
        this.zh = 4;
        this.ai = 12345678;
        this.gj = 12345678;
        this.hj = 180;
        this.ij = 155;
        this.jj = 95;
        this.kj = 256;
        this.lj = 512;
        this.mj = 32;
        this.be(var1, var2);
        this.ji = new int[var2][1];

        for(int var3 = 0; var3 < var2; this.ji[var3][0] = var3++) {
            ;
        }

    }

    public GameModel(int var1, int var2, boolean var3, boolean var4, boolean var5, boolean var6, boolean var7) {
        this.ch = 1;
        this.dh = true;
        this.kh = true;
        this.lh = false;
        this.mh = false;
        this.nh = -1;
        this.qh = false;
        this.rh = false;
        this.sh = false;
        this.th = false;
        this.uh = false;
        this.zh = 4;
        this.ai = 12345678;
        this.gj = 12345678;
        this.hj = 180;
        this.ij = 155;
        this.jj = 95;
        this.kj = 256;
        this.lj = 512;
        this.mj = 32;
        this.qh = var3;
        this.rh = var4;
        this.sh = var5;
        this.th = var6;
        this.uh = var7;
        this.be(var1, var2);
    }

    private void be(int var1, int var2) {
        this.ci = new int[var1];
        this.di = new int[var1];
        this.ei = new int[var1];
        this.ng = new int[var1];
        this.og = new byte[var1];
        this.qg = new int[var2];
        this.rg = new int[var2][];
        this.sg = new int[var2];
        this.tg = new int[var2];
        this.wg = new int[var2];
        this.vg = new int[var2];
        this.ug = new int[var2];
        if (!this.uh) {
            this.ig = new int[var1];
            this.jg = new int[var1];
            this.kg = new int[var1];
            this.lg = new int[var1];
            this.mg = new int[var1];
        }

        if (!this.th) {
            this.ph = new byte[var2];
            this.oh = new int[var2];
        }

        if (this.qh) {
            this.fi = this.ci;
            this.gi = this.di;
            this.hi = this.ei;
        } else {
            this.fi = new int[var1];
            this.gi = new int[var1];
            this.hi = new int[var1];
        }

        if (!this.sh || !this.rh) {
            this.xg = new int[var2];
            this.yg = new int[var2];
            this.zg = new int[var2];
        }

        if (!this.rh) {
            this.ki = new int[var2];
            this.li = new int[var2];
            this.mi = new int[var2];
            this.ni = new int[var2];
            this.oi = new int[var2];
            this.pi = new int[var2];
        }

        this.pg = 0;
        this.hg = 0;
        this.bi = var1;
        this.ii = var2;
        this.qi = this.ri = this.si = 0;
        this.ti = this.ui = this.vi = 0;
        this.wi = this.xi = this.yi = 256;
        this.zi = this.aj = this.bj = this.cj = this.dj = this.ej = 256;
        this.fj = 0;
    }

    public void xe() {
        this.ig = new int[this.hg];
        this.jg = new int[this.hg];
        this.kg = new int[this.hg];
        this.lg = new int[this.hg];
        this.mg = new int[this.hg];
    }

    public void bf() {
        this.pg = 0;
        this.hg = 0;
    }

    public void pe(int var1, int var2) {
        this.pg -= var1;
        if (this.pg < 0) {
            this.pg = 0;
        }

        this.hg -= var2;
        if (this.hg < 0) {
            this.hg = 0;
        }

    }

    public GameModel(byte[] var1, int var2) {
        this.ch = 1;
        this.dh = true;
        this.kh = true;
        this.lh = false;
        this.mh = false;
        this.nh = -1;
        this.qh = false;
        this.rh = false;
        this.sh = false;
        this.th = false;
        this.uh = false;
        this.zh = 4;
        this.ai = 12345678;
        this.gj = 12345678;
        this.hj = 180;
        this.ij = 155;
        this.jj = 95;
        this.kj = 256;
        this.lj = 512;
        this.mj = 32;
        this.nj = var1;
        this.oj = var2;
        this.pj = 0;
        this.ve(this.nj);
        int var3 = this.ve(this.nj);
        int var4 = this.ve(this.nj);
        boolean var12 = false;
        this.be(var3, var4);
        this.ji = new int[var4][];

        for(int var13 = 0; var13 < var3; ++var13) {
            int var5 = this.ve(this.nj);
            int var6 = this.ve(this.nj);
            int var7 = this.ve(this.nj);
            this.se(var5, var6, var7);
        }

        for(int var14 = 0; var14 < var4; ++var14) {
            int var8 = this.ve(this.nj);
            int var9 = this.ve(this.nj);
            int var10 = this.ve(this.nj);
            int var11 = this.ve(this.nj);
            this.lj = this.ve(this.nj);
            this.mj = this.ve(this.nj);
            int var20 = this.ve(this.nj);
            int[] var15 = new int[var8];

            for(int var16 = 0; var16 < var8; ++var16) {
                var15[var16] = this.ve(this.nj);
            }

            int[] var17 = new int[var11];

            for(int var18 = 0; var18 < var11; ++var18) {
                var17[var18] = this.ve(this.nj);
            }

            int var19 = this.re(var8, var15, var9, var10);
            this.ji[var14] = var17;
            if (var20 == 0) {
                this.wg[var19] = 0;
            } else {
                this.wg[var19] = this.ai;
            }
        }

        this.ch = 1;
    }

    public GameModel(String var1) {
        this.ch = 1;
        this.dh = true;
        this.kh = true;
        this.lh = false;
        this.mh = false;
        this.nh = -1;
        this.qh = false;
        this.rh = false;
        this.sh = false;
        this.th = false;
        this.uh = false;
        this.zh = 4;
        this.ai = 12345678;
        this.gj = 12345678;
        this.hj = 180;
        this.ij = 155;
        this.jj = 95;
        this.kj = 256;
        this.lj = 512;
        this.mj = 32;
        boolean var2 = false;
        boolean var3 = false;
        Object var4 = null;

        byte[] var25;
        try {
            InputStream var5 = Utility.fn(var1);
            DataInputStream var6 = new DataInputStream(var5);
            var25 = new byte[3];
            this.oj = 0;
            this.pj = 0;
            int var23 = 0;

            while(true) {
                if (var23 >= 3) {
                    int var24 = this.ve(var25);
                    var25 = new byte[var24];
                    this.oj = 0;
                    this.pj = 0;

                    for(var23 = 0; var23 < var24; var23 += var6.read(var25, var23, var24 - var23)) {
                        ;
                    }

                    var6.close();
                    break;
                }

                var23 += var6.read(var25, var23, 3 - var23);
            }
        } catch (IOException var22) {
            this.hg = 0;
            this.pg = 0;
            return;
        }

        int var26 = this.ve(var25);
        int var27 = this.ve(var25);
        boolean var14 = false;
        this.be(var26, var27);
        this.ji = new int[var27][];

        for(int var15 = 0; var15 < var26; ++var15) {
            int var7 = this.ve(var25);
            int var8 = this.ve(var25);
            int var9 = this.ve(var25);
            this.se(var7, var8, var9);
        }

        for(int var16 = 0; var16 < var27; ++var16) {
            int var10 = this.ve(var25);
            int var11 = this.ve(var25);
            int var12 = this.ve(var25);
            int var13 = this.ve(var25);
            this.lj = this.ve(var25);
            this.mj = this.ve(var25);
            int var28 = this.ve(var25);
            int[] var17 = new int[var10];

            for(int var18 = 0; var18 < var10; ++var18) {
                var17[var18] = this.ve(var25);
            }

            int[] var19 = new int[var13];

            for(int var20 = 0; var20 < var13; ++var20) {
                var19[var20] = this.ve(var25);
            }

            int var21 = this.re(var10, var17, var11, var12);
            this.ji[var16] = var19;
            if (var28 == 0) {
                this.wg[var21] = 0;
            } else {
                this.wg[var21] = this.ai;
            }
        }

        this.ch = 1;
    }

    public GameModel(GameModel[] var1, int var2, boolean var3, boolean var4, boolean var5, boolean var6) {
        this.ch = 1;
        this.dh = true;
        this.kh = true;
        this.lh = false;
        this.mh = false;
        this.nh = -1;
        this.qh = false;
        this.rh = false;
        this.sh = false;
        this.th = false;
        this.uh = false;
        this.zh = 4;
        this.ai = 12345678;
        this.gj = 12345678;
        this.hj = 180;
        this.ij = 155;
        this.jj = 95;
        this.kj = 256;
        this.lj = 512;
        this.mj = 32;
        this.qh = var3;
        this.rh = var4;
        this.sh = var5;
        this.th = var6;
        this.je(var1, var2, false);
    }

    public GameModel(GameModel[] var1, int var2) {
        this.ch = 1;
        this.dh = true;
        this.kh = true;
        this.lh = false;
        this.mh = false;
        this.nh = -1;
        this.qh = false;
        this.rh = false;
        this.sh = false;
        this.th = false;
        this.uh = false;
        this.zh = 4;
        this.ai = 12345678;
        this.gj = 12345678;
        this.hj = 180;
        this.ij = 155;
        this.jj = 95;
        this.kj = 256;
        this.lj = 512;
        this.mj = 32;
        this.je(var1, var2, true);
    }

    public void je(GameModel[] var1, int var2, boolean var3) {
        int var4 = 0;
        int var5 = 0;

        for(int var6 = 0; var6 < var2; ++var6) {
            var4 += var1[var6].pg;
            var5 += var1[var6].hg;
        }

        this.be(var5, var4);
        if (var3) {
            this.ji = new int[var4][];
        }

        for(int var7 = 0; var7 < var2; ++var7) {
            GameModel var8 = var1[var7];
            var8.me();
            this.mj = var8.mj;
            this.lj = var8.lj;
            this.hj = var8.hj;
            this.ij = var8.ij;
            this.jj = var8.jj;
            this.kj = var8.kj;

            for(int var9 = 0; var9 < var8.pg; ++var9) {
                int[] var10 = new int[var8.qg[var9]];
                int[] var11 = var8.rg[var9];

                for(int var12 = 0; var12 < var8.qg[var9]; ++var12) {
                    var10[var12] = this.se(var8.ci[var11[var12]], var8.di[var11[var12]], var8.ei[var11[var12]]);
                }

                int var13 = this.re(var8.qg[var9], var10, var8.sg[var9], var8.tg[var9]);
                this.wg[var13] = var8.wg[var9];
                this.vg[var13] = var8.vg[var9];
                this.ug[var13] = var8.ug[var9];
                if (var3) {
                    int var14;
                    if (var2 > 1) {
                        this.ji[var13] = new int[var8.ji[var9].length + 1];
                        this.ji[var13][0] = var7;

                        for(var14 = 0; var14 < var8.ji[var9].length; ++var14) {
                            this.ji[var13][var14 + 1] = var8.ji[var9][var14];
                        }
                    } else {
                        this.ji[var13] = new int[var8.ji[var9].length];

                        for(var14 = 0; var14 < var8.ji[var9].length; ++var14) {
                            this.ji[var13][var14] = var8.ji[var9][var14];
                        }
                    }
                }
            }
        }

        this.ch = 1;
    }

    public GameModel(int var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
        this(var1, 1);
        this.hg = var1;

        for(int var7 = 0; var7 < var1; ++var7) {
            this.ci[var7] = var2[var7];
            this.di[var7] = var3[var7];
            this.ei[var7] = var4[var7];
        }

        this.pg = 1;
        this.qg[0] = var1;
        int[] var8 = new int[var1];

        for(int var9 = 0; var9 < var1; var8[var9] = var9++) {
            ;
        }

        this.rg[0] = var8;
        this.sg[0] = var5;
        this.tg[0] = var6;
        this.ch = 1;
    }

    public int se(int var1, int var2, int var3) {
        for(int var4 = 0; var4 < this.hg; ++var4) {
            if (this.ci[var4] == var1 && this.di[var4] == var2 && this.ei[var4] == var3) {
                return var4;
            }
        }

        if (this.hg >= this.bi) {
            return -1;
        } else {
            this.ci[this.hg] = var1;
            this.di[this.hg] = var2;
            this.ei[this.hg] = var3;
            return this.hg++;
        }
    }

    public int he(int var1, int var2, int var3) {
        if (this.hg >= this.bi) {
            return -1;
        } else {
            this.ci[this.hg] = var1;
            this.di[this.hg] = var2;
            this.ei[this.hg] = var3;
            return this.hg++;
        }
    }

    public int re(int var1, int[] var2, int var3, int var4) {
        if (this.pg >= this.ii) {
            return -1;
        } else {
            this.qg[this.pg] = var1;
            this.rg[this.pg] = var2;
            this.sg[this.pg] = var3;
            this.tg[this.pg] = var4;
            this.ch = 1;
            return this.pg++;
        }
    }

    public GameModel[] zd(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
        this.me();
        int[] var9 = new int[var6];
        int[] var10 = new int[var6];

        for(int var11 = 0; var11 < var6; ++var11) {
            var9[var11] = 0;
            var10[var11] = 0;
        }

        int var14;
        int var15;
        int var17;
        int var18;
        for(int var12 = 0; var12 < this.pg; ++var12) {
            int var13 = 0;
            var14 = 0;
            var15 = this.qg[var12];
            int[] var16 = this.rg[var12];

            for(var17 = 0; var17 < var15; ++var17) {
                var13 += this.ci[var16[var17]];
                var14 += this.ei[var16[var17]];
            }

            var18 = var13 / (var15 * var3) + var14 / (var15 * var4) * var5;
            var9[var18] += var15;
            ++var10[var18];
        }

        GameModel[] var22 = new GameModel[var6];

        for(var14 = 0; var14 < var6; ++var14) {
            if (var9[var14] > var7) {
                var9[var14] = var7;
            }

            var22[var14] = new GameModel(var9[var14], var10[var14], true, true, true, var8, true);
            var22[var14].lj = this.lj;
            var22[var14].mj = this.mj;
        }

        int var23;
        for(var15 = 0; var15 < this.pg; ++var15) {
            var23 = 0;
            var17 = 0;
            var18 = this.qg[var15];
            int[] var19 = this.rg[var15];

            for(int var20 = 0; var20 < var18; ++var20) {
                var23 += this.ci[var19[var20]];
                var17 += this.ei[var19[var20]];
            }

            int var21 = var23 / (var18 * var3) + var17 / (var18 * var4) * var5;
            this.df(var22[var21], var19, var18, var15);
        }

        for(var23 = 0; var23 < var6; ++var23) {
            var22[var23].xe();
        }

        return var22;
    }

    public void df(GameModel var1, int[] var2, int var3, int var4) {
        int[] var5 = new int[var3];

        int var7;
        for(int var6 = 0; var6 < var3; ++var6) {
            var7 = var5[var6] = var1.se(this.ci[var2[var6]], this.di[var2[var6]], this.ei[var2[var6]]);
            var1.ng[var7] = this.ng[var2[var6]];
            var1.og[var7] = this.og[var2[var6]];
        }

        var7 = var1.re(var3, var5, this.sg[var4], this.tg[var4]);
        if (!var1.th && !this.th) {
            var1.oh[var7] = this.oh[var4];
        }

        var1.wg[var7] = this.wg[var4];
        var1.vg[var7] = this.vg[var4];
        var1.ug[var7] = this.ug[var4];
    }

    public void we(boolean var1, int var2, int var3, int var4, int var5, int var6) {
        this.mj = 256 - var2 * 4;
        this.lj = (64 - var3) * 16 + 128;
        if (!this.sh) {
            for(int var7 = 0; var7 < this.pg; ++var7) {
                if (var1) {
                    this.wg[var7] = this.ai;
                } else {
                    this.wg[var7] = 0;
                }
            }

            this.hj = var4;
            this.ij = var5;
            this.jj = var6;
            this.kj = (int)Math.sqrt((double)(var4 * var4 + var5 * var5 + var6 * var6));
            this.qe();
        }
    }

    public void cf(int var1, int var2, int var3) {
        if (!this.sh) {
            this.hj = var1;
            this.ij = var2;
            this.jj = var3;
            this.kj = (int)Math.sqrt((double)(var1 * var1 + var2 * var2 + var3 * var3));
            this.qe();
        }
    }

    public void ce(int var1, int var2) {
        this.og[var1] = (byte)var2;
    }

    public void ze(int var1, int var2, int var3) {
        this.ti = this.ti + var1 & 255;
        this.ui = this.ui + var2 & 255;
        this.vi = this.vi + var3 & 255;
        this.af();
        this.ch = 1;
    }

    public void oe(int var1, int var2, int var3) {
        this.ti = var1 & 255;
        this.ui = var2 & 255;
        this.vi = var3 & 255;
        this.af();
        this.ch = 1;
    }

    public void ee(int var1, int var2, int var3) {
        this.qi += var1;
        this.ri += var2;
        this.si += var3;
        this.af();
        this.ch = 1;
    }

    public void ke(int var1, int var2, int var3) {
        this.qi = var1;
        this.ri = var2;
        this.si = var3;
        this.af();
        this.ch = 1;
    }

    public int ef() {
        return this.qi;
    }

    public void ae(int var1, int var2, int var3) {
        this.wi = var1;
        this.xi = var2;
        this.yi = var3;
        this.af();
        this.ch = 1;
    }

    public void fe(int var1, int var2, int var3, int var4, int var5, int var6) {
        this.zi = var1;
        this.aj = var2;
        this.bj = var3;
        this.cj = var4;
        this.dj = var5;
        this.ej = var6;
        this.af();
        this.ch = 1;
    }

    private void af() {
        if (this.zi == 256 && this.aj == 256 && this.bj == 256 && this.cj == 256 && this.dj == 256 && this.ej == 256) {
            if (this.wi == 256 && this.xi == 256 && this.yi == 256) {
                if (this.ti == 0 && this.ui == 0 && this.vi == 0) {
                    if (this.qi == 0 && this.ri == 0 && this.si == 0) {
                        this.fj = 0;
                    } else {
                        this.fj = 1;
                    }
                } else {
                    this.fj = 2;
                }
            } else {
                this.fj = 3;
            }
        } else {
            this.fj = 4;
        }
    }

    private void ff(int var1, int var2, int var3) {
        for(int var4 = 0; var4 < this.hg; ++var4) {
            this.fi[var4] += var1;
            this.gi[var4] += var2;
            this.hi[var4] += var3;
        }

    }

    private void ie(int var1, int var2, int var3) {
        for(int var7 = 0; var7 < this.hg; ++var7) {
            int var4;
            int var5;
            int var6;
            if (var3 != 0) {
                var4 = vh[var3];
                var5 = vh[var3 + 256];
                var6 = this.gi[var7] * var4 + this.fi[var7] * var5 >> 15;
                this.gi[var7] = this.gi[var7] * var5 - this.fi[var7] * var4 >> 15;
                this.fi[var7] = var6;
            }

            if (var1 != 0) {
                var4 = vh[var1];
                var5 = vh[var1 + 256];
                var6 = this.gi[var7] * var5 - this.hi[var7] * var4 >> 15;
                this.hi[var7] = this.gi[var7] * var4 + this.hi[var7] * var5 >> 15;
                this.gi[var7] = var6;
            }

            if (var2 != 0) {
                var4 = vh[var2];
                var5 = vh[var2 + 256];
                var6 = this.hi[var7] * var4 + this.fi[var7] * var5 >> 15;
                this.hi[var7] = this.hi[var7] * var5 - this.fi[var7] * var4 >> 15;
                this.fi[var7] = var6;
            }
        }

    }

    private void ge(int var1, int var2, int var3, int var4, int var5, int var6) {
        for(int var7 = 0; var7 < this.hg; ++var7) {
            if (var1 != 0) {
                this.fi[var7] += this.gi[var7] * var1 >> 8;
            }

            if (var2 != 0) {
                this.hi[var7] += this.gi[var7] * var2 >> 8;
            }

            if (var3 != 0) {
                this.fi[var7] += this.hi[var7] * var3 >> 8;
            }

            if (var4 != 0) {
                this.gi[var7] += this.hi[var7] * var4 >> 8;
            }

            if (var5 != 0) {
                this.hi[var7] += this.fi[var7] * var5 >> 8;
            }

            if (var6 != 0) {
                this.gi[var7] += this.fi[var7] * var6 >> 8;
            }
        }

    }

    private void ne(int var1, int var2, int var3) {
        for(int var4 = 0; var4 < this.hg; ++var4) {
            this.fi[var4] = this.fi[var4] * var1 >> 8;
            this.gi[var4] = this.gi[var4] * var2 >> 8;
            this.hi[var4] = this.hi[var4] * var3 >> 8;
        }

    }

    private void yd() {
        this.eh = this.gh = this.ih = 999999;
        this.gj = this.fh = this.hh = this.jh = -999999;

        for(int var2 = 0; var2 < this.pg; ++var2) {
            int[] var1 = this.rg[var2];
            int var4 = var1[0];
            int var5 = this.qg[var2];
            int var6;
            int var7 = var6 = this.fi[var4];
            int var8;
            int var9 = var8 = this.gi[var4];
            int var10;
            int var11 = var10 = this.hi[var4];

            for(int var3 = 0; var3 < var5; ++var3) {
                var4 = var1[var3];
                if (this.fi[var4] < var6) {
                    var6 = this.fi[var4];
                } else if (this.fi[var4] > var7) {
                    var7 = this.fi[var4];
                }

                if (this.gi[var4] < var8) {
                    var8 = this.gi[var4];
                } else if (this.gi[var4] > var9) {
                    var9 = this.gi[var4];
                }

                if (this.hi[var4] < var10) {
                    var10 = this.hi[var4];
                } else if (this.hi[var4] > var11) {
                    var11 = this.hi[var4];
                }
            }

            if (!this.rh) {
                this.ki[var2] = var6;
                this.li[var2] = var7;
                this.mi[var2] = var8;
                this.ni[var2] = var9;
                this.oi[var2] = var10;
                this.pi[var2] = var11;
            }

            if (var7 - var6 > this.gj) {
                this.gj = var7 - var6;
            }

            if (var9 - var8 > this.gj) {
                this.gj = var9 - var8;
            }

            if (var11 - var10 > this.gj) {
                this.gj = var11 - var10;
            }

            if (var6 < this.eh) {
                this.eh = var6;
            }

            if (var7 > this.fh) {
                this.fh = var7;
            }

            if (var8 < this.gh) {
                this.gh = var8;
            }

            if (var9 > this.hh) {
                this.hh = var9;
            }

            if (var10 < this.ih) {
                this.ih = var10;
            }

            if (var11 > this.jh) {
                this.jh = var11;
            }
        }

    }

    public void qe() {
        if (!this.sh) {
            int var1 = this.lj * this.kj >> 8;

            for(int var2 = 0; var2 < this.pg; ++var2) {
                if (this.wg[var2] != this.ai) {
                    this.wg[var2] = (this.xg[var2] * this.hj + this.yg[var2] * this.ij + this.zg[var2] * this.jj) / var1;
                }
            }

            int[] var3 = new int[this.hg];
            int[] var4 = new int[this.hg];
            int[] var5 = new int[this.hg];
            int[] var6 = new int[this.hg];

            for(int var7 = 0; var7 < this.hg; ++var7) {
                var3[var7] = 0;
                var4[var7] = 0;
                var5[var7] = 0;
                var6[var7] = 0;
            }

            int var9;
            for(int var8 = 0; var8 < this.pg; ++var8) {
                if (this.wg[var8] == this.ai) {
                    for(var9 = 0; var9 < this.qg[var8]; ++var9) {
                        int var10 = this.rg[var8][var9];
                        var3[var10] += this.xg[var8];
                        var4[var10] += this.yg[var8];
                        var5[var10] += this.zg[var8];
                        ++var6[var10];
                    }
                }
            }

            for(var9 = 0; var9 < this.hg; ++var9) {
                if (var6[var9] > 0) {
                    this.ng[var9] = (var3[var9] * this.hj + var4[var9] * this.ij + var5[var9] * this.jj) / (var1 * var6[var9]);
                }
            }

        }
    }

    public void te() {
        if (!this.sh || !this.rh) {
            for(int var1 = 0; var1 < this.pg; ++var1) {
                int[] var2 = this.rg[var1];
                int var3 = this.fi[var2[0]];
                int var4 = this.gi[var2[0]];
                int var5 = this.hi[var2[0]];
                int var6 = this.fi[var2[1]] - var3;
                int var7 = this.gi[var2[1]] - var4;
                int var8 = this.hi[var2[1]] - var5;
                int var9 = this.fi[var2[2]] - var3;
                int var10 = this.gi[var2[2]] - var4;
                int var11 = this.hi[var2[2]] - var5;
                int var12 = var7 * var11 - var10 * var8;
                int var13 = var8 * var9 - var11 * var6;

                int var14;
                for(var14 = var6 * var10 - var9 * var7; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 1) {
                    var12 >>= 1;
                    var13 >>= 1;
                }

                int var15 = (int)(256.0D * Math.sqrt((double)(var12 * var12 + var13 * var13 + var14 * var14)));
                if (var15 <= 0) {
                    var15 = 1;
                }

                this.xg[var1] = var12 * 65536 / var15;
                this.yg[var1] = var13 * 65536 / var15;
                this.zg[var1] = var14 * '\uffff' / var15;
                this.vg[var1] = -1;
            }

            this.qe();
        }
    }

    public void xd() {
        int var1;
        if (this.ch == 2) {
            this.ch = 0;

            for(var1 = 0; var1 < this.hg; ++var1) {
                this.fi[var1] = this.ci[var1];
                this.gi[var1] = this.di[var1];
                this.hi[var1] = this.ei[var1];
            }

            this.eh = this.gh = this.ih = -9999999;
            this.gj = this.fh = this.hh = this.jh = 9999999;
        } else {
            if (this.ch == 1) {
                this.ch = 0;

                for(var1 = 0; var1 < this.hg; ++var1) {
                    this.fi[var1] = this.ci[var1];
                    this.gi[var1] = this.di[var1];
                    this.hi[var1] = this.ei[var1];
                }

                if (this.fj >= 2) {
                    this.ie(this.ti, this.ui, this.vi);
                }

                if (this.fj >= 3) {
                    this.ne(this.wi, this.xi, this.yi);
                }

                if (this.fj >= 4) {
                    this.ge(this.zi, this.aj, this.bj, this.cj, this.dj, this.ej);
                }

                if (this.fj >= 1) {
                    this.ff(this.qi, this.ri, this.si);
                }

                this.yd();
                this.te();
            }

        }
    }

    public void le(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
        this.xd();
        if (this.ih <= Scene.cp && this.jh >= Scene.bp && this.eh <= Scene.yo && this.fh >= Scene.xo && this.gh <= Scene.ap && this.hh >= Scene.zo) {
            this.dh = true;
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            int var14 = 0;
            int var15 = 0;
            if (var6 != 0) {
                var10 = wh[var6];
                var11 = wh[var6 + 1024];
            }

            if (var5 != 0) {
                var14 = wh[var5];
                var15 = wh[var5 + 1024];
            }

            if (var4 != 0) {
                var12 = wh[var4];
                var13 = wh[var4 + 1024];
            }

            for(int var16 = 0; var16 < this.hg; ++var16) {
                int var17 = this.fi[var16] - var1;
                int var18 = this.gi[var16] - var2;
                int var19 = this.hi[var16] - var3;
                int var9;
                if (var6 != 0) {
                    var9 = var18 * var10 + var17 * var11 >> 15;
                    var18 = var18 * var11 - var17 * var10 >> 15;
                    var17 = var9;
                }

                if (var5 != 0) {
                    var9 = var19 * var14 + var17 * var15 >> 15;
                    var19 = var19 * var15 - var17 * var14 >> 15;
                    var17 = var9;
                }

                if (var4 != 0) {
                    var9 = var18 * var13 - var19 * var12 >> 15;
                    var19 = var18 * var12 + var19 * var13 >> 15;
                    var18 = var9;
                }

                if (var19 >= var8) {
                    this.lg[var16] = (var17 << var7) / var19;
                } else {
                    this.lg[var16] = var17 << var7;
                }

                if (var19 >= var8) {
                    this.mg[var16] = (var18 << var7) / var19;
                } else {
                    this.mg[var16] = var18 << var7;
                }

                this.ig[var16] = var17;
                this.jg[var16] = var18;
                this.kg[var16] = var19;
            }

        } else {
            this.dh = false;
        }
    }

    public void me() {
        this.xd();

        for(int var1 = 0; var1 < this.hg; ++var1) {
            this.ci[var1] = this.fi[var1];
            this.di[var1] = this.gi[var1];
            this.ei[var1] = this.hi[var1];
        }

        this.qi = this.ri = this.si = 0;
        this.ti = this.ui = this.vi = 0;
        this.wi = this.xi = this.yi = 256;
        this.zi = this.aj = this.bj = this.cj = this.dj = this.ej = 256;
        this.fj = 0;
    }

    public GameModel ue() {
        GameModel[] var1 = new GameModel[]{this};
        GameModel var2 = new GameModel(var1, 1);
        var2.bh = this.bh;
        return var2;
    }

    public GameModel ye(boolean var1, boolean var2, boolean var3, boolean var4) {
        GameModel[] var5 = new GameModel[]{this};
        GameModel var6 = new GameModel(var5, 1, var1, var2, var3, var4);
        var6.bh = this.bh;
        return var6;
    }

    public void de(GameModel var1) {
        this.ti = var1.ti;
        this.ui = var1.ui;
        this.vi = var1.vi;
        this.qi = var1.qi;
        this.ri = var1.ri;
        this.si = var1.si;
        this.af();
        this.ch = 1;
    }

    public int ve(byte[] var1) {
        while(var1[this.oj] == 10 || var1[this.oj] == 13) {
            ++this.oj;
        }

        int var2 = yh[var1[this.oj++] & 255];
        int var3 = yh[var1[this.oj++] & 255];
        int var4 = yh[var1[this.oj++] & 255];
        int var5 = var2 * 4096 + var3 * 64 + var4 - 131072;
        if (var5 == 123456) {
            var5 = this.ai;
        }

        return var5;
    }

    static {
        for(int var0 = 0; var0 < 256; ++var0) {
            vh[var0] = (int)(Math.sin((double)var0 * 0.02454369D) * 32768.0D);
            vh[var0 + 256] = (int)(Math.cos((double)var0 * 0.02454369D) * 32768.0D);
        }

        for(int var1 = 0; var1 < 1024; ++var1) {
            wh[var1] = (int)(Math.sin((double)var1 * 0.00613592315D) * 32768.0D);
            wh[var1 + 1024] = (int)(Math.cos((double)var1 * 0.00613592315D) * 32768.0D);
        }

        for(int var2 = 0; var2 < 10; ++var2) {
            xh[var2] = (byte)(48 + var2);
        }

        for(int var3 = 0; var3 < 26; ++var3) {
            xh[var3 + 10] = (byte)(65 + var3);
        }

        for(int var4 = 0; var4 < 26; ++var4) {
            xh[var4 + 36] = (byte)(97 + var4);
        }

        xh[62] = -93;
        xh[63] = 36;

        for(int var5 = 0; var5 < 10; yh[48 + var5] = var5++) {
            ;
        }

        for(int var6 = 0; var6 < 26; ++var6) {
            yh[65 + var6] = var6 + 10;
        }

        for(int var7 = 0; var7 < 26; ++var7) {
            yh[97 + var7] = var7 + 36;
        }

        yh[163] = 62;
        yh[36] = 63;
    }
}
