package jagex.client;

import jagex.Utility;
import java.io.IOException;

public class Scene {
    int vl = 50;
    int[] wl;
    int[][] xl;
    int[] yl;
    public int zl;
    public int am;
    public int bm;
    public int cm;
    public int dm;
    public int em;
    public static int[] fm = new int[2048];
    private static int[] gm = new int[512];
    public boolean hm;
    public double im;
    public int jm;
    private boolean km;
    private int lm;
    private int mm;
    private int nm;
    private int om;
    private GameModel[] pm;
    private int[] qm;
    private int rm;
    private int sm;
    private int tm;
    private int um;
    private int vm;
    private int wm;
    private int xm;
    private int ym;
    private int zm;
    private int an;
    private int bn;
    private int cn;
    private int dn;
    private int en;
    private int fn;
    private GameModel[] gn;
    private int[] hn;
    private int in;
    private Polygon[] jn;
    private int kn;
    private int ln;
    private int[] mn;
    private int[] nn;
    private int[] on;
    private int[] pn;
    private int[] qn;
    private int[] rn;
    private int[] sn;
    public GameModel tn;
    private static final int un = 16;
    private static final int vn = 4;
    private static final int wn = 5;
    private static final int xn = 12345678;
    int yn;
    String[] zn;
    int[] ao;
    int[] bo;
    long[] co;
    boolean[] do_;
    int[][] eo;
    private static long fo;
    byte[] go;
    int[][] ho;
    int[][] io;
    private static byte[] jo;
    private static int[] ko = new int[256];
    Surface lo;
    public int[] mo;
    Scanline[] no;
    int oo;
    int po;
    int[] qo;
    int[] ro;
    int[] so;
    int[] to;
    int[] uo;
    int[] vo;
    boolean wo;
    static int xo;
    static int yo;
    static int zo;
    static int ap;
    static int bp;
    static int cp;
    int dp;
    int ep;

    public Scene(Surface var1, int var2, int var3, int var4) {
        this.wl = new int[this.vl];
        this.xl = new int[this.vl][256];
        this.am = 5;
        this.bm = 1000;
        this.cm = 1000;
        this.dm = 20;
        this.em = 10;
        this.hm = false;
        this.im = 1.1D;
        this.jm = 1;
        this.km = false;
        this.om = 100;
        this.pm = new GameModel[this.om];
        this.qm = new int[this.om];
        this.rm = 512;
        this.sm = 256;
        this.tm = 192;
        this.um = 256;
        this.vm = 256;
        this.wm = 8;
        this.xm = 4;
        this.qo = new int[40];
        this.ro = new int[40];
        this.so = new int[40];
        this.to = new int[40];
        this.uo = new int[40];
        this.vo = new int[40];
        this.wo = false;
        this.lo = var1;
        this.sm = var1.qj / 2;
        this.tm = var1.rj / 2;
        this.mo = var1.wj;
        this.en = 0;
        this.fn = var2;
        this.gn = new GameModel[this.fn];
        this.hn = new int[this.fn];
        this.in = 0;
        this.jn = new Polygon[var3];

        for(int var5 = 0; var5 < var3; ++var5) {
            this.jn[var5] = new Polygon();
        }

        this.ln = 0;
        this.tn = new GameModel(var4 * 2, var4);
        this.mn = new int[var4];
        this.qn = new int[var4];
        this.rn = new int[var4];
        this.nn = new int[var4];
        this.on = new int[var4];
        this.pn = new int[var4];
        this.sn = new int[var4];
        if (jo == null) {
            jo = new byte[17691];
        }

        this.ym = 0;
        this.zm = 0;
        this.an = 0;
        this.bn = 0;
        this.cn = 0;
        this.dn = 0;

        for(int var6 = 0; var6 < 256; ++var6) {
            gm[var6] = (int)(Math.sin((double)var6 * 0.02454369D) * 32768.0D);
            gm[var6 + 256] = (int)(Math.cos((double)var6 * 0.02454369D) * 32768.0D);
        }

        for(int var7 = 0; var7 < 1024; ++var7) {
            fm[var7] = (int)(Math.sin((double)var7 * 0.00613592315D) * 32768.0D);
            fm[var7 + 1024] = (int)(Math.cos((double)var7 * 0.00613592315D) * 32768.0D);
        }

    }

    public void yh(GameModel var1) {
        if (this.en < this.fn) {
            this.hn[this.en] = 0;
            this.gn[this.en++] = var1;
        }

    }

    public void ci(GameModel var1) {
        for(int var2 = 0; var2 < this.en; ++var2) {
            if (this.gn[var2] == var1) {
                --this.en;

                for(int var3 = var2; var3 < this.en; ++var3) {
                    this.gn[var3] = this.gn[var3 + 1];
                    this.hn[var3] = this.hn[var3 + 1];
                }
            }
        }

    }

    public void xi() {
        this.fi();

        for(int var1 = 0; var1 < this.en; ++var1) {
            this.gn[var1] = null;
        }

        this.en = 0;
    }

    public void fi() {
        this.ln = 0;
        this.tn.bf();
    }

    public void oi(int var1) {
        this.ln -= var1;
        this.tn.pe(var1, var1 * 2);
        if (this.ln < 0) {
            this.ln = 0;
        }

    }

    public int cj(int var1, int var2, int var3, int var4, int var5, int var6) {
        this.mn[this.ln] = var1;
        this.nn[this.ln] = var2;
        this.on[this.ln] = var3;
        this.pn[this.ln] = var4;
        this.qn[this.ln] = var5;
        this.rn[this.ln] = var6;
        this.sn[this.ln] = 0;
        int var7 = this.tn.he(var2, var3, var4);
        int var8 = this.tn.he(var2, var3 - var6, var4);
        int[] var9 = new int[]{var7, var8};
        this.tn.re(2, var9, 0, 0);
        this.tn.ph[this.ln++] = 0;
        return this.ln - 1;
    }

    public int ph(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        this.mn[this.ln] = var1;
        this.nn[this.ln] = var2;
        this.on[this.ln] = var3;
        this.pn[this.ln] = var4;
        this.qn[this.ln] = var5;
        this.rn[this.ln] = var6;
        this.sn[this.ln] = 0;
        int var8 = this.tn.he(var2, var3, var4);
        int var9 = this.tn.he(var2, var3 - var6, var4);
        int[] var10 = new int[]{var8, var9};
        this.tn.re(2, var10, 0, 0);
        this.tn.oh[this.ln] = var7;
        this.tn.ph[this.ln++] = 0;
        return this.ln - 1;
    }

    public void qh(int var1) {
        this.tn.ph[var1] = 1;
    }

    public void si(int var1, int var2) {
        this.sn[var1] = var2;
    }

    public void zh(int var1, int var2) {
        this.lm = var1 - this.um;
        this.mm = var2;
        this.nm = 0;
        this.km = true;
    }

    public int wi() {
        return this.nm;
    }

    public int[] ri() {
        return this.qm;
    }

    public GameModel[] sh() {
        return this.pm;
    }

    public void ii(int var1, int var2, int var3, int var4, int var5, int var6) {
        this.sm = var3;
        this.tm = var4;
        this.um = var1;
        this.vm = var2;
        this.rm = var5;
        this.wm = var6;
        this.no = new Scanline[var4 + var2];

        for(int var7 = 0; var7 < var4 + var2; ++var7) {
            this.no[var7] = new Scanline();
        }

    }

    private void uh(Polygon[] var1, int var2, int var3) {
        if (var2 < var3) {
            int var4 = var2 - 1;
            int var5 = var3 + 1;
            int var6 = (var2 + var3) / 2;
            Polygon var7 = var1[var6];
            var1[var6] = var1[var2];
            var1[var2] = var7;
            int var8 = var7.jhb;

            while(var4 < var5) {
                do {
                    --var5;
                } while(var1[var5].jhb < var8);

                do {
                    ++var4;
                } while(var1[var4].jhb > var8);

                if (var4 < var5) {
                    Polygon var9 = var1[var4];
                    var1[var4] = var1[var5];
                    var1[var5] = var9;
                }
            }

            this.uh(var1, var2, var5);
            this.uh(var1, var5 + 1, var3);
        }

    }

    public void lh(int var1, Polygon[] var2, int var3) {
        for(int var4 = 0; var4 <= var3; ++var4) {
            var2[var4].phb = false;
            var2[var4].qhb = var4;
            var2[var4].rhb = -1;
        }

        int var5 = 0;

        while(true) {
            while(var2[var5].phb) {
                ++var5;
            }

            if (var5 == var3) {
                return;
            }

            Polygon var6 = var2[var5];
            var6.phb = true;
            int var7 = var5;
            int var8 = var5 + var1;
            if (var8 >= var3) {
                var8 = var3 - 1;
            }

            for(int var9 = var8; var9 >= var7 + 1; --var9) {
                Polygon var10 = var2[var9];
                if (var6.bhb < var10.dhb && var10.bhb < var6.dhb && var6.chb < var10.ehb && var10.chb < var6.ehb && var6.qhb != var10.rhb && !this.mh(var6, var10) && this.kh(var10, var6)) {
                    this.zi(var2, var7, var9);
                    if (var2[var9] != var10) {
                        ++var9;
                    }

                    var7 = this.dp;
                    var10.rhb = var6.qhb;
                }
            }
        }
    }

    public boolean zi(Polygon[] var1, int var2, int var3) {
        while(true) {
            Polygon var4 = var1[var2];

            Polygon var6;
            for(int var5 = var2 + 1; var5 <= var3; ++var5) {
                var6 = var1[var5];
                if (!this.mh(var6, var4)) {
                    break;
                }

                var1[var2] = var6;
                var1[var5] = var4;
                var2 = var5;
                if (var5 == var3) {
                    this.dp = var5;
                    this.ep = var5 - 1;
                    return true;
                }
            }

            var6 = var1[var3];

            for(int var7 = var3 - 1; var7 >= var2; --var7) {
                Polygon var8 = var1[var7];
                if (!this.mh(var6, var8)) {
                    break;
                }

                var1[var3] = var8;
                var1[var7] = var6;
                var3 = var7;
                if (var2 == var7) {
                    this.dp = var7 + 1;
                    this.ep = var7;
                    return true;
                }
            }

            if (var2 + 1 >= var3) {
                this.dp = var2;
                this.ep = var3;
                return false;
            }

            if (!this.zi(var1, var2 + 1, var3)) {
                this.dp = var2;
                return false;
            }

            var3 = this.ep;
        }
    }

    public void vi(int var1, int var2, int var3) {
        int var4 = -this.bn + 1024 & 1023;
        int var5 = -this.cn + 1024 & 1023;
        int var6 = -this.dn + 1024 & 1023;
        int var7;
        int var8;
        int var9;
        if (var6 != 0) {
            var7 = fm[var6];
            var8 = fm[var6 + 1024];
            var9 = var2 * var7 + var1 * var8 >> 15;
            var2 = var2 * var8 - var1 * var7 >> 15;
            var1 = var9;
        }

        if (var4 != 0) {
            var7 = fm[var4];
            var8 = fm[var4 + 1024];
            var9 = var2 * var8 - var3 * var7 >> 15;
            var3 = var2 * var7 + var3 * var8 >> 15;
            var2 = var9;
        }

        if (var5 != 0) {
            var7 = fm[var5];
            var8 = fm[var5 + 1024];
            var9 = var3 * var7 + var1 * var8 >> 15;
            var3 = var3 * var8 - var1 * var7 >> 15;
            var1 = var9;
        }

        if (var1 < xo) {
            xo = var1;
        }

        if (var1 > yo) {
            yo = var1;
        }

        if (var2 < zo) {
            zo = var2;
        }

        if (var2 > ap) {
            ap = var2;
        }

        if (var3 < bp) {
            bp = var3;
        }

        if (var3 > cp) {
            cp = var3;
        }

    }

    public void aj() {
        this.wo = this.lo.pk;
        int var7 = this.sm * this.bm >> this.wm;
        int var8 = this.tm * this.bm >> this.wm;
        xo = 0;
        yo = 0;
        zo = 0;
        ap = 0;
        bp = 0;
        cp = 0;
        this.vi(-var7, -var8, this.bm);
        this.vi(-var7, var8, this.bm);
        this.vi(var7, -var8, this.bm);
        this.vi(var7, var8, this.bm);
        this.vi(-this.sm, -this.tm, 0);
        this.vi(-this.sm, this.tm, 0);
        this.vi(this.sm, -this.tm, 0);
        this.vi(this.sm, this.tm, 0);
        xo += this.ym;
        yo += this.ym;
        zo += this.zm;
        ap += this.zm;
        bp += this.an;
        cp += this.an;
        this.gn[this.en] = this.tn;
        this.tn.ch = 2;

        int var2;
        for(var2 = 0; var2 < this.en; ++var2) {
            this.gn[var2].le(this.ym, this.zm, this.an, this.bn, this.cn, this.dn, this.wm, this.am);
        }

        this.gn[this.en].le(this.ym, this.zm, this.an, this.bn, this.cn, this.dn, this.wm, this.am);
        this.in = 0;

        GameModel var1;
        int var5;
        int var10;
        int var12;
        int var13;
        int var14;
        int var16;
        int var17;
        for(int var9 = 0; var9 < this.en; ++var9) {
            var1 = this.gn[var9];
            if (var1.dh) {
                for(var2 = 0; var2 < var1.pg; ++var2) {
                    var10 = var1.qg[var2];
                    int[] var11 = var1.rg[var2];
                    boolean var4 = false;

                    int var3;
                    for(var12 = 0; var12 < var10; ++var12) {
                        var3 = var1.kg[var11[var12]];
                        if (var3 > this.am && var3 < this.bm) {
                            var4 = true;
                            break;
                        }
                    }

                    if (var4) {
                        int var23 = 0;

                        for(var13 = 0; var13 < var10; ++var13) {
                            var3 = var1.lg[var11[var13]];
                            if (var3 > -this.sm) {
                                var23 |= 1;
                            }

                            if (var3 < this.sm) {
                                var23 |= 2;
                            }

                            if (var23 == 3) {
                                break;
                            }
                        }

                        if (var23 == 3) {
                            var23 = 0;

                            for(var14 = 0; var14 < var10; ++var14) {
                                var3 = var1.mg[var11[var14]];
                                if (var3 > -this.tm) {
                                    var23 |= 1;
                                }

                                if (var3 < this.tm) {
                                    var23 |= 2;
                                }

                                if (var23 == 3) {
                                    break;
                                }
                            }

                            if (var23 == 3) {
                                Polygon var15 = this.jn[this.in];
                                var15.hhb = var1;
                                var15.ihb = var2;
                                this.bj(this.in);
                                if (var15.nhb < 0) {
                                    var16 = var1.sg[var2];
                                } else {
                                    var16 = var1.tg[var2];
                                }

                                if (var16 != 12345678) {
                                    var5 = 0;

                                    for(var17 = 0; var17 < var10; ++var17) {
                                        var5 += var1.kg[var11[var17]];
                                    }

                                    var15.jhb = var5 / var10 + var1.bh;
                                    var15.ohb = var16;
                                    ++this.in;
                                }
                            }
                        }
                    }
                }
            }
        }

        var1 = this.tn;
        int var28;
        if (var1.dh) {
            for(var2 = 0; var2 < var1.pg; ++var2) {
                int[] var24 = var1.rg[var2];
                int var25 = var24[0];
                var12 = var1.lg[var25];
                var13 = var1.mg[var25];
                var14 = var1.kg[var25];
                if (var14 > this.am && var14 < this.cm) {
                    var28 = (this.qn[var2] << this.wm) / var14;
                    var16 = (this.rn[var2] << this.wm) / var14;
                    if (var12 - var28 / 2 <= this.sm && var12 + var28 / 2 >= -this.sm && var13 - var16 <= this.tm && var13 >= -this.tm) {
                        Polygon var29 = this.jn[this.in];
                        var29.hhb = var1;
                        var29.ihb = var2;
                        this.dj(this.in);
                        var29.jhb = (var14 + var1.kg[var24[1]]) / 2;
                        ++this.in;
                    }
                }
            }
        }

        if (this.in != 0) {
            this.zl = this.in;
            this.uh(this.jn, 0, this.in - 1);
            this.lh(100, this.jn, this.in);

            for(var10 = 0; var10 < this.in; ++var10) {
                Polygon var26 = this.jn[var10];
                var1 = var26.hhb;
                var2 = var26.ihb;
                int var18;
                int var20;
                int var21;
                if (var1 == this.tn) {
                    int[] var27 = var1.rg[var2];
                    var13 = var27[0];
                    var14 = var1.lg[var13];
                    var28 = var1.mg[var13];
                    var16 = var1.kg[var13];
                    var17 = (this.qn[var2] << this.wm) / var16;
                    var18 = (this.rn[var2] << this.wm) / var16;
                    int var30 = var28 - var1.mg[var27[1]];
                    var20 = (var1.lg[var27[1]] - var14) * var30 / var18;
                    var20 = var1.lg[var27[1]] - var14;
                    var21 = var14 - var17 / 2;
                    int var22 = this.vm + var28 - var18;
                    this.lo.gg(var21 + this.um, var22, var17, var18, this.mn[var2], var20, (256 << this.wm) / var16);
                    if (this.km && this.nm < this.om) {
                        var21 += (this.sn[var2] << this.wm) / var16;
                        if (this.mm >= var22 && this.mm <= var22 + var18 && this.lm >= var21 && this.lm <= var21 + var17 && !var1.th && var1.ph[var2] == 0) {
                            this.pm[this.nm] = var1;
                            this.qm[this.nm] = var2;
                            ++this.nm;
                        }
                    }
                } else {
                    var28 = 0;
                    var17 = 0;
                    var18 = var1.qg[var2];
                    int[] var19 = var1.rg[var2];
                    if (var1.wg[var2] != 12345678) {
                        if (var26.nhb < 0) {
                            var17 = var1.mj - var1.wg[var2];
                        } else {
                            var17 = var1.mj + var1.wg[var2];
                        }
                    }

                    for(var20 = 0; var20 < var18; ++var20) {
                        var5 = var19[var20];
                        this.to[var20] = var1.ig[var5];
                        this.uo[var20] = var1.jg[var5];
                        this.vo[var20] = var1.kg[var5];
                        if (var1.wg[var2] == 12345678) {
                            if (var26.nhb < 0) {
                                var17 = var1.mj - var1.ng[var5] + var1.og[var5];
                            } else {
                                var17 = var1.mj + var1.ng[var5] + var1.og[var5];
                            }
                        }

                        if (var1.kg[var5] >= this.am) {
                            this.qo[var28] = var1.lg[var5];
                            this.ro[var28] = var1.mg[var5];
                            this.so[var28] = var17;
                            if (var1.kg[var5] > this.em) {
                                this.so[var28] += (var1.kg[var5] - this.em) / this.dm;
                            }

                            ++var28;
                        } else {
                            if (var20 == 0) {
                                var16 = var19[var18 - 1];
                            } else {
                                var16 = var19[var20 - 1];
                            }

                            if (var1.kg[var16] >= this.am) {
                                var14 = var1.kg[var5] - var1.kg[var16];
                                var12 = var1.ig[var5] - (var1.ig[var5] - var1.ig[var16]) * (var1.kg[var5] - this.am) / var14;
                                var13 = var1.jg[var5] - (var1.jg[var5] - var1.jg[var16]) * (var1.kg[var5] - this.am) / var14;
                                this.qo[var28] = (var12 << this.wm) / this.am;
                                this.ro[var28] = (var13 << this.wm) / this.am;
                                this.so[var28] = var17;
                                ++var28;
                            }

                            if (var20 == var18 - 1) {
                                var16 = var19[0];
                            } else {
                                var16 = var19[var20 + 1];
                            }

                            if (var1.kg[var16] >= this.am) {
                                var14 = var1.kg[var5] - var1.kg[var16];
                                var12 = var1.ig[var5] - (var1.ig[var5] - var1.ig[var16]) * (var1.kg[var5] - this.am) / var14;
                                var13 = var1.jg[var5] - (var1.jg[var5] - var1.jg[var16]) * (var1.kg[var5] - this.am) / var14;
                                this.qo[var28] = (var12 << this.wm) / this.am;
                                this.ro[var28] = (var13 << this.wm) / this.am;
                                this.so[var28] = var17;
                                ++var28;
                            }
                        }
                    }

                    for(var21 = 0; var21 < var18; ++var21) {
                        if (this.so[var21] < 0) {
                            this.so[var21] = 0;
                        } else if (this.so[var21] > 255) {
                            this.so[var21] = 255;
                        }

                        if (var26.ohb >= 0) {
                            if (this.bo[var26.ohb] == 1) {
                                this.so[var21] <<= 9;
                            } else {
                                this.so[var21] <<= 6;
                            }
                        }
                    }

                    this.jh(0, 0, 0, 0, var28, this.qo, this.ro, this.so, var1, var2);
                    if (this.po > this.oo) {
                        this.th(0, 0, var18, this.to, this.uo, this.vo, var26.ohb, var1);
                    }
                }
            }

            this.km = false;
        }
    }

    private void jh(int var1, int var2, int var3, int var4, int var5, int[] var6, int[] var7, int[] var8, GameModel var9, int var10) {
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var27;
        int var28;
        int var29;
        int var30;
        int var31;
        int var32;
        int var33;
        int var34;
        int var35;
        int var36;
        int var37;
        int var38;
        int var39;
        Scanline var50;
        if (var5 == 3) {
            var11 = var7[0] + this.vm;
            var12 = var7[1] + this.vm;
            var13 = var7[2] + this.vm;
            var14 = var6[0];
            var15 = var6[1];
            var16 = var6[2];
            var17 = var8[0];
            var18 = var8[1];
            var19 = var8[2];
            var20 = this.vm + this.tm - 1;
            var21 = 0;
            var22 = 0;
            var23 = 0;
            var24 = 0;
            var25 = 12345678;
            var26 = -12345678;
            if (var13 != var11) {
                var22 = (var16 - var14 << 8) / (var13 - var11);
                var24 = (var19 - var17 << 8) / (var13 - var11);
                if (var11 < var13) {
                    var21 = var14 << 8;
                    var23 = var17 << 8;
                    var25 = var11;
                    var26 = var13;
                } else {
                    var21 = var16 << 8;
                    var23 = var19 << 8;
                    var25 = var13;
                    var26 = var11;
                }

                if (var25 < 0) {
                    var21 -= var22 * var25;
                    var23 -= var24 * var25;
                    var25 = 0;
                }

                if (var26 > var20) {
                    var26 = var20;
                }
            }

            var27 = 0;
            var28 = 0;
            var29 = 0;
            var30 = 0;
            var31 = 12345678;
            var32 = -12345678;
            if (var12 != var11) {
                var28 = (var15 - var14 << 8) / (var12 - var11);
                var30 = (var18 - var17 << 8) / (var12 - var11);
                if (var11 < var12) {
                    var27 = var14 << 8;
                    var29 = var17 << 8;
                    var31 = var11;
                    var32 = var12;
                } else {
                    var27 = var15 << 8;
                    var29 = var18 << 8;
                    var31 = var12;
                    var32 = var11;
                }

                if (var31 < 0) {
                    var27 -= var28 * var31;
                    var29 -= var30 * var31;
                    var31 = 0;
                }

                if (var32 > var20) {
                    var32 = var20;
                }
            }

            var33 = 0;
            var34 = 0;
            var35 = 0;
            var36 = 0;
            var37 = 12345678;
            var38 = -12345678;
            if (var13 != var12) {
                var34 = (var16 - var15 << 8) / (var13 - var12);
                var36 = (var19 - var18 << 8) / (var13 - var12);
                if (var12 < var13) {
                    var33 = var15 << 8;
                    var35 = var18 << 8;
                    var37 = var12;
                    var38 = var13;
                } else {
                    var33 = var16 << 8;
                    var35 = var19 << 8;
                    var37 = var13;
                    var38 = var12;
                }

                if (var37 < 0) {
                    var33 -= var34 * var37;
                    var35 -= var36 * var37;
                    var37 = 0;
                }

                if (var38 > var20) {
                    var38 = var20;
                }
            }

            this.oo = var25;
            if (var31 < this.oo) {
                this.oo = var31;
            }

            if (var37 < this.oo) {
                this.oo = var37;
            }

            this.po = var26;
            if (var32 > this.po) {
                this.po = var32;
            }

            if (var38 > this.po) {
                this.po = var38;
            }

            var39 = 0;

            for(var3 = this.oo; var3 < this.po; ++var3) {
                if (var3 >= var25 && var3 < var26) {
                    var2 = var21;
                    var1 = var21;
                    var39 = var23;
                    var4 = var23;
                    var21 += var22;
                    var23 += var24;
                } else {
                    var1 = 655360;
                    var2 = -655360;
                }

                if (var3 >= var31 && var3 < var32) {
                    if (var27 < var1) {
                        var1 = var27;
                        var4 = var29;
                    }

                    if (var27 > var2) {
                        var2 = var27;
                        var39 = var29;
                    }

                    var27 += var28;
                    var29 += var30;
                }

                if (var3 >= var37 && var3 < var38) {
                    if (var33 < var1) {
                        var1 = var33;
                        var4 = var35;
                    }

                    if (var33 > var2) {
                        var2 = var33;
                        var39 = var35;
                    }

                    var33 += var34;
                    var35 += var36;
                }

                Scanline var40 = this.no[var3];
                var40.rmb = var1;
                var40.smb = var2;
                var40.tmb = var4;
                var40.umb = var39;
            }

            if (this.oo < this.vm - this.tm) {
                this.oo = this.vm - this.tm;
            }
        } else if (var5 == 4) {
            var11 = var7[0] + this.vm;
            var12 = var7[1] + this.vm;
            var13 = var7[2] + this.vm;
            var14 = var7[3] + this.vm;
            var15 = var6[0];
            var16 = var6[1];
            var17 = var6[2];
            var18 = var6[3];
            var19 = var8[0];
            var20 = var8[1];
            var21 = var8[2];
            var22 = var8[3];
            var23 = this.vm + this.tm - 1;
            var24 = 0;
            var25 = 0;
            var26 = 0;
            var27 = 0;
            var28 = 12345678;
            var29 = -12345678;
            if (var14 != var11) {
                var25 = (var18 - var15 << 8) / (var14 - var11);
                var27 = (var22 - var19 << 8) / (var14 - var11);
                if (var11 < var14) {
                    var24 = var15 << 8;
                    var26 = var19 << 8;
                    var28 = var11;
                    var29 = var14;
                } else {
                    var24 = var18 << 8;
                    var26 = var22 << 8;
                    var28 = var14;
                    var29 = var11;
                }

                if (var28 < 0) {
                    var24 -= var25 * var28;
                    var26 -= var27 * var28;
                    var28 = 0;
                }

                if (var29 > var23) {
                    var29 = var23;
                }
            }

            var30 = 0;
            var31 = 0;
            var32 = 0;
            var33 = 0;
            var34 = 12345678;
            var35 = -12345678;
            if (var12 != var11) {
                var31 = (var16 - var15 << 8) / (var12 - var11);
                var33 = (var20 - var19 << 8) / (var12 - var11);
                if (var11 < var12) {
                    var30 = var15 << 8;
                    var32 = var19 << 8;
                    var34 = var11;
                    var35 = var12;
                } else {
                    var30 = var16 << 8;
                    var32 = var20 << 8;
                    var34 = var12;
                    var35 = var11;
                }

                if (var34 < 0) {
                    var30 -= var31 * var34;
                    var32 -= var33 * var34;
                    var34 = 0;
                }

                if (var35 > var23) {
                    var35 = var23;
                }
            }

            var36 = 0;
            var37 = 0;
            var38 = 0;
            var39 = 0;
            int var53 = 12345678;
            int var41 = -12345678;
            if (var13 != var12) {
                var37 = (var17 - var16 << 8) / (var13 - var12);
                var39 = (var21 - var20 << 8) / (var13 - var12);
                if (var12 < var13) {
                    var36 = var16 << 8;
                    var38 = var20 << 8;
                    var53 = var12;
                    var41 = var13;
                } else {
                    var36 = var17 << 8;
                    var38 = var21 << 8;
                    var53 = var13;
                    var41 = var12;
                }

                if (var53 < 0) {
                    var36 -= var37 * var53;
                    var38 -= var39 * var53;
                    var53 = 0;
                }

                if (var41 > var23) {
                    var41 = var23;
                }
            }

            int var42 = 0;
            int var43 = 0;
            int var44 = 0;
            int var45 = 0;
            int var46 = 12345678;
            int var47 = -12345678;
            if (var14 != var13) {
                var43 = (var18 - var17 << 8) / (var14 - var13);
                var45 = (var22 - var21 << 8) / (var14 - var13);
                if (var13 < var14) {
                    var42 = var17 << 8;
                    var44 = var21 << 8;
                    var46 = var13;
                    var47 = var14;
                } else {
                    var42 = var18 << 8;
                    var44 = var22 << 8;
                    var46 = var14;
                    var47 = var13;
                }

                if (var46 < 0) {
                    var42 -= var43 * var46;
                    var44 -= var45 * var46;
                    var46 = 0;
                }

                if (var47 > var23) {
                    var47 = var23;
                }
            }

            this.oo = var28;
            if (var34 < this.oo) {
                this.oo = var34;
            }

            if (var53 < this.oo) {
                this.oo = var53;
            }

            if (var46 < this.oo) {
                this.oo = var46;
            }

            this.po = var29;
            if (var35 > this.po) {
                this.po = var35;
            }

            if (var41 > this.po) {
                this.po = var41;
            }

            if (var47 > this.po) {
                this.po = var47;
            }

            int var48 = 0;

            for(var3 = this.oo; var3 < this.po; ++var3) {
                if (var3 >= var28 && var3 < var29) {
                    var2 = var24;
                    var1 = var24;
                    var48 = var26;
                    var4 = var26;
                    var24 += var25;
                    var26 += var27;
                } else {
                    var1 = 655360;
                    var2 = -655360;
                }

                if (var3 >= var34 && var3 < var35) {
                    if (var30 < var1) {
                        var1 = var30;
                        var4 = var32;
                    }

                    if (var30 > var2) {
                        var2 = var30;
                        var48 = var32;
                    }

                    var30 += var31;
                    var32 += var33;
                }

                if (var3 >= var53 && var3 < var41) {
                    if (var36 < var1) {
                        var1 = var36;
                        var4 = var38;
                    }

                    if (var36 > var2) {
                        var2 = var36;
                        var48 = var38;
                    }

                    var36 += var37;
                    var38 += var39;
                }

                if (var3 >= var46 && var3 < var47) {
                    if (var42 < var1) {
                        var1 = var42;
                        var4 = var44;
                    }

                    if (var42 > var2) {
                        var2 = var42;
                        var48 = var44;
                    }

                    var42 += var43;
                    var44 += var45;
                }

                Scanline var49 = this.no[var3];
                var49.rmb = var1;
                var49.smb = var2;
                var49.tmb = var4;
                var49.umb = var48;
            }

            if (this.oo < this.vm - this.tm) {
                this.oo = this.vm - this.tm;
            }
        } else {
            this.po = this.oo = var7[0] += this.vm;

            for(var3 = 1; var3 < var5; ++var3) {
                if ((var11 = var7[var3] += this.vm) < this.oo) {
                    this.oo = var11;
                } else if (var11 > this.po) {
                    this.po = var11;
                }
            }

            if (this.oo < this.vm - this.tm) {
                this.oo = this.vm - this.tm;
            }

            if (this.po >= this.vm + this.tm) {
                this.po = this.vm + this.tm - 1;
            }

            if (this.oo >= this.po) {
                return;
            }

            for(var3 = this.oo; var3 < this.po; ++var3) {
                var50 = this.no[var3];
                var50.rmb = 655360;
                var50.smb = -655360;
            }

            var11 = var5 - 1;
            var12 = var7[0];
            var13 = var7[var11];
            Scanline var51;
            if (var12 < var13) {
                var14 = var6[0] << 8;
                var15 = (var6[var11] - var6[0] << 8) / (var13 - var12);
                var16 = var8[0] << 8;
                var17 = (var8[var11] - var8[0] << 8) / (var13 - var12);
                if (var12 < 0) {
                    var14 -= var15 * var12;
                    var16 -= var17 * var12;
                    var12 = 0;
                }

                if (var13 > this.po) {
                    var13 = this.po;
                }

                for(var3 = var12; var3 <= var13; ++var3) {
                    var51 = this.no[var3];
                    var51.rmb = var51.smb = var14;
                    var51.tmb = var51.umb = var16;
                    var14 += var15;
                    var16 += var17;
                }
            } else if (var12 > var13) {
                var14 = var6[var11] << 8;
                var15 = (var6[0] - var6[var11] << 8) / (var12 - var13);
                var16 = var8[var11] << 8;
                var17 = (var8[0] - var8[var11] << 8) / (var12 - var13);
                if (var13 < 0) {
                    var14 -= var15 * var13;
                    var16 -= var17 * var13;
                    var13 = 0;
                }

                if (var12 > this.po) {
                    var12 = this.po;
                }

                for(var3 = var13; var3 <= var12; ++var3) {
                    var51 = this.no[var3];
                    var51.rmb = var51.smb = var14;
                    var51.tmb = var51.umb = var16;
                    var14 += var15;
                    var16 += var17;
                }
            }

            for(var3 = 0; var3 < var11; ++var3) {
                var14 = var3 + 1;
                var12 = var7[var3];
                var13 = var7[var14];
                Scanline var52;
                if (var12 < var13) {
                    var15 = var6[var3] << 8;
                    var16 = (var6[var14] - var6[var3] << 8) / (var13 - var12);
                    var17 = var8[var3] << 8;
                    var18 = (var8[var14] - var8[var3] << 8) / (var13 - var12);
                    if (var12 < 0) {
                        var15 -= var16 * var12;
                        var17 -= var18 * var12;
                        var12 = 0;
                    }

                    if (var13 > this.po) {
                        var13 = this.po;
                    }

                    for(var19 = var12; var19 <= var13; ++var19) {
                        var52 = this.no[var19];
                        if (var15 < var52.rmb) {
                            var52.rmb = var15;
                            var52.tmb = var17;
                        }

                        if (var15 > var52.smb) {
                            var52.smb = var15;
                            var52.umb = var17;
                        }

                        var15 += var16;
                        var17 += var18;
                    }
                } else if (var12 > var13) {
                    var15 = var6[var14] << 8;
                    var16 = (var6[var3] - var6[var14] << 8) / (var12 - var13);
                    var17 = var8[var14] << 8;
                    var18 = (var8[var3] - var8[var14] << 8) / (var12 - var13);
                    if (var13 < 0) {
                        var15 -= var16 * var13;
                        var17 -= var18 * var13;
                        var13 = 0;
                    }

                    if (var12 > this.po) {
                        var12 = this.po;
                    }

                    for(var19 = var13; var19 <= var12; ++var19) {
                        var52 = this.no[var19];
                        if (var15 < var52.rmb) {
                            var52.rmb = var15;
                            var52.tmb = var17;
                        }

                        if (var15 > var52.smb) {
                            var52.smb = var15;
                            var52.umb = var17;
                        }

                        var15 += var16;
                        var17 += var18;
                    }
                }
            }

            if (this.oo < this.vm - this.tm) {
                this.oo = this.vm - this.tm;
            }
        }

        if (this.km && this.nm < this.om && this.mm >= this.oo && this.mm < this.po) {
            var50 = this.no[this.mm];
            if (this.lm >= var50.rmb >> 8 && this.lm <= var50.smb >> 8 && var50.rmb <= var50.smb && !var9.th && var9.ph[var10] == 0) {
                this.pm[this.nm] = var9;
                this.qm[this.nm] = var10;
                ++this.nm;
            }
        }

    }

    private void th(int var1, int var2, int var3, int[] var4, int[] var5, int[] var6, int var7, GameModel var8) {
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        if (var7 >= 0) {
            if (var7 >= this.yn) {
                var7 = 0;
            }

            this.pi(var7);
            var9 = var4[0];
            var10 = var5[0];
            var11 = var6[0];
            var12 = var9 - var4[1];
            var13 = var10 - var5[1];
            var14 = var11 - var6[1];
            --var3;
            var15 = var4[var3] - var9;
            var16 = var5[var3] - var10;
            var17 = var6[var3] - var11;
            int var19;
            int var20;
            int var21;
            int var22;
            int var23;
            int var24;
            int var25;
            int var26;
            int var27;
            int var28;
            int var29;
            int var30;
            int var31;
            int var32;
            byte var33;
            Scanline var34;
            int var35;
            int var36;
            int var37;
            int var38;
            if (this.bo[var7] == 1) {
                var18 = var15 * var10 - var16 * var9 << 12;
                var19 = var16 * var11 - var17 * var10 << 5 - this.wm + 7 + 4;
                var20 = var17 * var9 - var15 * var11 << 5 - this.wm + 7;
                var21 = var12 * var10 - var13 * var9 << 12;
                var22 = var13 * var11 - var14 * var10 << 5 - this.wm + 7 + 4;
                var23 = var14 * var9 - var12 * var11 << 5 - this.wm + 7;
                var24 = var13 * var15 - var12 * var16 << 5;
                var25 = var14 * var16 - var13 * var17 << 5 - this.wm + 4;
                var26 = var12 * var17 - var14 * var15 >> this.wm - 5;
                var27 = var19 >> 4;
                var28 = var22 >> 4;
                var29 = var25 >> 4;
                var30 = this.oo - this.vm;
                var31 = this.rm;
                var32 = this.um + this.oo * var31;
                var33 = 1;
                var18 += var20 * var30;
                var21 += var23 * var30;
                var24 += var26 * var30;
                if (this.wo) {
                    if ((this.oo & 1) == 1) {
                        ++this.oo;
                        var18 += var20;
                        var21 += var23;
                        var24 += var26;
                        var32 += var31;
                    }

                    var20 <<= 1;
                    var23 <<= 1;
                    var26 <<= 1;
                    var31 <<= 1;
                    var33 = 2;
                }

                if (var8.lh) {
                    for(var1 = this.oo; var1 < this.po; var1 += var33) {
                        var34 = this.no[var1];
                        var2 = var34.rmb >> 8;
                        var35 = var34.smb >> 8;
                        var36 = var35 - var2;
                        if (var36 <= 0) {
                            var18 += var20;
                            var21 += var23;
                            var24 += var26;
                            var32 += var31;
                        } else {
                            var37 = var34.tmb;
                            var38 = (var34.umb - var37) / var36;
                            if (var2 < -this.sm) {
                                var37 += (-this.sm - var2) * var38;
                                var2 = -this.sm;
                                var36 = var35 - var2;
                            }

                            if (var35 > this.sm) {
                                var35 = this.sm;
                                var36 = var35 - var2;
                            }

                            ti(this.mo, this.eo[var7], 0, 0, var18 + var27 * var2, var21 + var28 * var2, var24 + var29 * var2, var19, var22, var25, var36, var32 + var2, var37, var38 << 2);
                            var18 += var20;
                            var21 += var23;
                            var24 += var26;
                            var32 += var31;
                        }
                    }

                } else if (!this.do_[var7]) {
                    for(var1 = this.oo; var1 < this.po; var1 += var33) {
                        var34 = this.no[var1];
                        var2 = var34.rmb >> 8;
                        var35 = var34.smb >> 8;
                        var36 = var35 - var2;
                        if (var36 <= 0) {
                            var18 += var20;
                            var21 += var23;
                            var24 += var26;
                            var32 += var31;
                        } else {
                            var37 = var34.tmb;
                            var38 = (var34.umb - var37) / var36;
                            if (var2 < -this.sm) {
                                var37 += (-this.sm - var2) * var38;
                                var2 = -this.sm;
                                var36 = var35 - var2;
                            }

                            if (var35 > this.sm) {
                                var35 = this.sm;
                                var36 = var35 - var2;
                            }

                            xh(this.mo, this.eo[var7], 0, 0, var18 + var27 * var2, var21 + var28 * var2, var24 + var29 * var2, var19, var22, var25, var36, var32 + var2, var37, var38 << 2);
                            var18 += var20;
                            var21 += var23;
                            var24 += var26;
                            var32 += var31;
                        }
                    }

                } else {
                    for(var1 = this.oo; var1 < this.po; var1 += var33) {
                        var34 = this.no[var1];
                        var2 = var34.rmb >> 8;
                        var35 = var34.smb >> 8;
                        var36 = var35 - var2;
                        if (var36 <= 0) {
                            var18 += var20;
                            var21 += var23;
                            var24 += var26;
                            var32 += var31;
                        } else {
                            var37 = var34.tmb;
                            var38 = (var34.umb - var37) / var36;
                            if (var2 < -this.sm) {
                                var37 += (-this.sm - var2) * var38;
                                var2 = -this.sm;
                                var36 = var35 - var2;
                            }

                            if (var35 > this.sm) {
                                var35 = this.sm;
                                var36 = var35 - var2;
                            }

                            mi(this.mo, 0, 0, 0, this.eo[var7], var18 + var27 * var2, var21 + var28 * var2, var24 + var29 * var2, var19, var22, var25, var36, var32 + var2, var37, var38);
                            var18 += var20;
                            var21 += var23;
                            var24 += var26;
                            var32 += var31;
                        }
                    }

                }
            } else {
                var18 = var15 * var10 - var16 * var9 << 11;
                var19 = var16 * var11 - var17 * var10 << 5 - this.wm + 6 + 4;
                var20 = var17 * var9 - var15 * var11 << 5 - this.wm + 6;
                var21 = var12 * var10 - var13 * var9 << 11;
                var22 = var13 * var11 - var14 * var10 << 5 - this.wm + 6 + 4;
                var23 = var14 * var9 - var12 * var11 << 5 - this.wm + 6;
                var24 = var13 * var15 - var12 * var16 << 5;
                var25 = var14 * var16 - var13 * var17 << 5 - this.wm + 4;
                var26 = var12 * var17 - var14 * var15 >> this.wm - 5;
                var27 = var19 >> 4;
                var28 = var22 >> 4;
                var29 = var25 >> 4;
                var30 = this.oo - this.vm;
                var31 = this.rm;
                var32 = this.um + this.oo * var31;
                var33 = 1;
                var18 += var20 * var30;
                var21 += var23 * var30;
                var24 += var26 * var30;
                if (this.wo) {
                    if ((this.oo & 1) == 1) {
                        ++this.oo;
                        var18 += var20;
                        var21 += var23;
                        var24 += var26;
                        var32 += var31;
                    }

                    var20 <<= 1;
                    var23 <<= 1;
                    var26 <<= 1;
                    var31 <<= 1;
                    var33 = 2;
                }

                if (var8.lh) {
                    for(var1 = this.oo; var1 < this.po; var1 += var33) {
                        var34 = this.no[var1];
                        var2 = var34.rmb >> 8;
                        var35 = var34.smb >> 8;
                        var36 = var35 - var2;
                        if (var36 <= 0) {
                            var18 += var20;
                            var21 += var23;
                            var24 += var26;
                            var32 += var31;
                        } else {
                            var37 = var34.tmb;
                            var38 = (var34.umb - var37) / var36;
                            if (var2 < -this.sm) {
                                var37 += (-this.sm - var2) * var38;
                                var2 = -this.sm;
                                var36 = var35 - var2;
                            }

                            if (var35 > this.sm) {
                                var35 = this.sm;
                                var36 = var35 - var2;
                            }

                            ai(this.mo, this.eo[var7], 0, 0, var18 + var27 * var2, var21 + var28 * var2, var24 + var29 * var2, var19, var22, var25, var36, var32 + var2, var37, var38);
                            var18 += var20;
                            var21 += var23;
                            var24 += var26;
                            var32 += var31;
                        }
                    }

                } else if (!this.do_[var7]) {
                    for(var1 = this.oo; var1 < this.po; var1 += var33) {
                        var34 = this.no[var1];
                        var2 = var34.rmb >> 8;
                        var35 = var34.smb >> 8;
                        var36 = var35 - var2;
                        if (var36 <= 0) {
                            var18 += var20;
                            var21 += var23;
                            var24 += var26;
                            var32 += var31;
                        } else {
                            var37 = var34.tmb;
                            var38 = (var34.umb - var37) / var36;
                            if (var2 < -this.sm) {
                                var37 += (-this.sm - var2) * var38;
                                var2 = -this.sm;
                                var36 = var35 - var2;
                            }

                            if (var35 > this.sm) {
                                var35 = this.sm;
                                var36 = var35 - var2;
                            }

                            ui(this.mo, this.eo[var7], 0, 0, var18 + var27 * var2, var21 + var28 * var2, var24 + var29 * var2, var19, var22, var25, var36, var32 + var2, var37, var38);
                            var18 += var20;
                            var21 += var23;
                            var24 += var26;
                            var32 += var31;
                        }
                    }

                } else {
                    for(var1 = this.oo; var1 < this.po; var1 += var33) {
                        var34 = this.no[var1];
                        var2 = var34.rmb >> 8;
                        var35 = var34.smb >> 8;
                        var36 = var35 - var2;
                        if (var36 <= 0) {
                            var18 += var20;
                            var21 += var23;
                            var24 += var26;
                            var32 += var31;
                        } else {
                            var37 = var34.tmb;
                            var38 = (var34.umb - var37) / var36;
                            if (var2 < -this.sm) {
                                var37 += (-this.sm - var2) * var38;
                                var2 = -this.sm;
                                var36 = var35 - var2;
                            }

                            if (var35 > this.sm) {
                                var35 = this.sm;
                                var36 = var35 - var2;
                            }

                            wh(this.mo, 0, 0, 0, this.eo[var7], var18 + var27 * var2, var21 + var28 * var2, var24 + var29 * var2, var19, var22, var25, var36, var32 + var2, var37, var38);
                            var18 += var20;
                            var21 += var23;
                            var24 += var26;
                            var32 += var31;
                        }
                    }

                }
            }
        } else {
            for(var9 = 0; var9 < this.vl; ++var9) {
                if (this.wl[var9] == var7) {
                    this.yl = this.xl[var9];
                    break;
                }

                if (var9 == this.vl - 1) {
                    var10 = (int)(Math.random() * (double)this.vl);
                    this.wl[var10] = var7;
                    var7 = -1 - var7;
                    var11 = (var7 >> 10 & 31) * 8;
                    var12 = (var7 >> 5 & 31) * 8;
                    var13 = (var7 & 31) * 8;

                    for(var14 = 0; var14 < 256; ++var14) {
                        var15 = var14 * var14;
                        var16 = var11 * var15 / 65536;
                        var17 = var12 * var15 / 65536;
                        var18 = var13 * var15 / 65536;
                        this.xl[var10][255 - var14] = (var16 << 16) + (var17 << 8) + var18;
                    }

                    this.yl = this.xl[var10];
                }
            }

            var10 = this.rm;
            var11 = this.um + this.oo * var10;
            byte var39 = 1;
            if (this.wo) {
                if ((this.oo & 1) == 1) {
                    ++this.oo;
                    var11 += var10;
                }

                var10 <<= 1;
                var39 = 2;
            }

            Scanline var40;
            if (var8.mh) {
                for(var1 = this.oo; var1 < this.po; var1 += var39) {
                    var40 = this.no[var1];
                    var2 = var40.rmb >> 8;
                    var14 = var40.smb >> 8;
                    var15 = var14 - var2;
                    if (var15 <= 0) {
                        var11 += var10;
                    } else {
                        var16 = var40.tmb;
                        var17 = (var40.umb - var16) / var15;
                        if (var2 < -this.sm) {
                            var16 += (-this.sm - var2) * var17;
                            var2 = -this.sm;
                            var15 = var14 - var2;
                        }

                        if (var14 > this.sm) {
                            var14 = this.sm;
                            var15 = var14 - var2;
                        }

                        li(this.mo, -var15, var11 + var2, 0, this.yl, var16, var17);
                        var11 += var10;
                    }
                }

            } else if (this.hm) {
                for(var1 = this.oo; var1 < this.po; var1 += var39) {
                    var40 = this.no[var1];
                    var2 = var40.rmb >> 8;
                    var14 = var40.smb >> 8;
                    var15 = var14 - var2;
                    if (var15 <= 0) {
                        var11 += var10;
                    } else {
                        var16 = var40.tmb;
                        var17 = (var40.umb - var16) / var15;
                        if (var2 < -this.sm) {
                            var16 += (-this.sm - var2) * var17;
                            var2 = -this.sm;
                            var15 = var14 - var2;
                        }

                        if (var14 > this.sm) {
                            var14 = this.sm;
                            var15 = var14 - var2;
                        }

                        nh(this.mo, -var15, var11 + var2, 0, this.yl, var16, var17);
                        var11 += var10;
                    }
                }

            } else {
                for(var1 = this.oo; var1 < this.po; var1 += var39) {
                    var40 = this.no[var1];
                    var2 = var40.rmb >> 8;
                    var14 = var40.smb >> 8;
                    var15 = var14 - var2;
                    if (var15 <= 0) {
                        var11 += var10;
                    } else {
                        var16 = var40.tmb;
                        var17 = (var40.umb - var16) / var15;
                        if (var2 < -this.sm) {
                            var16 += (-this.sm - var2) * var17;
                            var2 = -this.sm;
                            var15 = var14 - var2;
                        }

                        if (var14 > this.sm) {
                            var14 = this.sm;
                            var15 = var14 - var2;
                        }

                        bi(this.mo, -var15, var11 + var2, 0, this.yl, var16, var17);
                        var11 += var10;
                    }
                }

            }
        }
    }

    private static void xh(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
        if (var10 > 0) {
            int var14 = 0;
            int var15 = 0;
            int var18 = 0;
            if (var6 != 0) {
                var2 = var4 / var6 << 7;
                var3 = var5 / var6 << 7;
            }

            if (var2 < 0) {
                var2 = 0;
            } else if (var2 > 16256) {
                var2 = 16256;
            }

            var4 += var7;
            var5 += var8;
            var6 += var9;
            if (var6 != 0) {
                var14 = var4 / var6 << 7;
                var15 = var5 / var6 << 7;
            }

            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 16256) {
                var14 = 16256;
            }

            int var16 = var14 - var2 >> 4;
            int var17 = var15 - var3 >> 4;

            for(int var19 = var10 >> 4; var19 > 0; --var19) {
                var2 += var12 & 6291456;
                var18 = var12 >> 23;
                var12 += var13;
                var0[var11++] = var1[(var3 & 16256) + (var2 >> 7)] >>> var18;
                var2 += var16;
                var3 += var17;
                var0[var11++] = var1[(var3 & 16256) + (var2 >> 7)] >>> var18;
                var2 += var16;
                var3 += var17;
                var0[var11++] = var1[(var3 & 16256) + (var2 >> 7)] >>> var18;
                var2 += var16;
                var3 += var17;
                var0[var11++] = var1[(var3 & 16256) + (var2 >> 7)] >>> var18;
                var2 += var16;
                var3 += var17;
                var2 = (var2 & 16383) + (var12 & 6291456);
                var18 = var12 >> 23;
                var12 += var13;
                var0[var11++] = var1[(var3 & 16256) + (var2 >> 7)] >>> var18;
                var2 += var16;
                var3 += var17;
                var0[var11++] = var1[(var3 & 16256) + (var2 >> 7)] >>> var18;
                var2 += var16;
                var3 += var17;
                var0[var11++] = var1[(var3 & 16256) + (var2 >> 7)] >>> var18;
                var2 += var16;
                var3 += var17;
                var0[var11++] = var1[(var3 & 16256) + (var2 >> 7)] >>> var18;
                var2 += var16;
                var3 += var17;
                var2 = (var2 & 16383) + (var12 & 6291456);
                var18 = var12 >> 23;
                var12 += var13;
                var0[var11++] = var1[(var3 & 16256) + (var2 >> 7)] >>> var18;
                var2 += var16;
                var3 += var17;
                var0[var11++] = var1[(var3 & 16256) + (var2 >> 7)] >>> var18;
                var2 += var16;
                var3 += var17;
                var0[var11++] = var1[(var3 & 16256) + (var2 >> 7)] >>> var18;
                var2 += var16;
                var3 += var17;
                var0[var11++] = var1[(var3 & 16256) + (var2 >> 7)] >>> var18;
                var2 += var16;
                var3 += var17;
                var2 = (var2 & 16383) + (var12 & 6291456);
                var18 = var12 >> 23;
                var12 += var13;
                var0[var11++] = var1[(var3 & 16256) + (var2 >> 7)] >>> var18;
                var2 += var16;
                var3 += var17;
                var0[var11++] = var1[(var3 & 16256) + (var2 >> 7)] >>> var18;
                var2 += var16;
                var3 += var17;
                var0[var11++] = var1[(var3 & 16256) + (var2 >> 7)] >>> var18;
                var2 += var16;
                var3 += var17;
                var0[var11++] = var1[(var3 & 16256) + (var2 >> 7)] >>> var18;
                var2 = var14;
                var3 = var15;
                var4 += var7;
                var5 += var8;
                var6 += var9;
                if (var6 != 0) {
                    var14 = var4 / var6 << 7;
                    var15 = var5 / var6 << 7;
                }

                if (var14 < 0) {
                    var14 = 0;
                } else if (var14 > 16256) {
                    var14 = 16256;
                }

                var16 = var14 - var2 >> 4;
                var17 = var15 - var3 >> 4;
            }

            for(int var20 = 0; var20 < (var10 & 15); ++var20) {
                if ((var20 & 3) == 0) {
                    var2 = (var2 & 16383) + (var12 & 6291456);
                    var18 = var12 >> 23;
                    var12 += var13;
                }

                var0[var11++] = var1[(var3 & 16256) + (var2 >> 7)] >>> var18;
                var2 += var16;
                var3 += var17;
            }

        }
    }

    private static void ti(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
        if (var10 > 0) {
            int var14 = 0;
            int var15 = 0;
            int var18 = 0;
            if (var6 != 0) {
                var2 = var4 / var6 << 7;
                var3 = var5 / var6 << 7;
            }

            if (var2 < 0) {
                var2 = 0;
            } else if (var2 > 16256) {
                var2 = 16256;
            }

            var4 += var7;
            var5 += var8;
            var6 += var9;
            if (var6 != 0) {
                var14 = var4 / var6 << 7;
                var15 = var5 / var6 << 7;
            }

            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 16256) {
                var14 = 16256;
            }

            int var16 = var14 - var2 >> 4;
            int var17 = var15 - var3 >> 4;

            for(int var19 = var10 >> 4; var19 > 0; --var19) {
                var2 += var12 & 6291456;
                var18 = var12 >> 23;
                var12 += var13;
                var0[var11++] = (var1[(var3 & 16256) + (var2 >> 7)] >>> var18) + (var0[var11] >> 1 & 8355711);
                var2 += var16;
                var3 += var17;
                var0[var11++] = (var1[(var3 & 16256) + (var2 >> 7)] >>> var18) + (var0[var11] >> 1 & 8355711);
                var2 += var16;
                var3 += var17;
                var0[var11++] = (var1[(var3 & 16256) + (var2 >> 7)] >>> var18) + (var0[var11] >> 1 & 8355711);
                var2 += var16;
                var3 += var17;
                var0[var11++] = (var1[(var3 & 16256) + (var2 >> 7)] >>> var18) + (var0[var11] >> 1 & 8355711);
                var2 += var16;
                var3 += var17;
                var2 = (var2 & 16383) + (var12 & 6291456);
                var18 = var12 >> 23;
                var12 += var13;
                var0[var11++] = (var1[(var3 & 16256) + (var2 >> 7)] >>> var18) + (var0[var11] >> 1 & 8355711);
                var2 += var16;
                var3 += var17;
                var0[var11++] = (var1[(var3 & 16256) + (var2 >> 7)] >>> var18) + (var0[var11] >> 1 & 8355711);
                var2 += var16;
                var3 += var17;
                var0[var11++] = (var1[(var3 & 16256) + (var2 >> 7)] >>> var18) + (var0[var11] >> 1 & 8355711);
                var2 += var16;
                var3 += var17;
                var0[var11++] = (var1[(var3 & 16256) + (var2 >> 7)] >>> var18) + (var0[var11] >> 1 & 8355711);
                var2 += var16;
                var3 += var17;
                var2 = (var2 & 16383) + (var12 & 6291456);
                var18 = var12 >> 23;
                var12 += var13;
                var0[var11++] = (var1[(var3 & 16256) + (var2 >> 7)] >>> var18) + (var0[var11] >> 1 & 8355711);
                var2 += var16;
                var3 += var17;
                var0[var11++] = (var1[(var3 & 16256) + (var2 >> 7)] >>> var18) + (var0[var11] >> 1 & 8355711);
                var2 += var16;
                var3 += var17;
                var0[var11++] = (var1[(var3 & 16256) + (var2 >> 7)] >>> var18) + (var0[var11] >> 1 & 8355711);
                var2 += var16;
                var3 += var17;
                var0[var11++] = (var1[(var3 & 16256) + (var2 >> 7)] >>> var18) + (var0[var11] >> 1 & 8355711);
                var2 += var16;
                var3 += var17;
                var2 = (var2 & 16383) + (var12 & 6291456);
                var18 = var12 >> 23;
                var12 += var13;
                var0[var11++] = (var1[(var3 & 16256) + (var2 >> 7)] >>> var18) + (var0[var11] >> 1 & 8355711);
                var2 += var16;
                var3 += var17;
                var0[var11++] = (var1[(var3 & 16256) + (var2 >> 7)] >>> var18) + (var0[var11] >> 1 & 8355711);
                var2 += var16;
                var3 += var17;
                var0[var11++] = (var1[(var3 & 16256) + (var2 >> 7)] >>> var18) + (var0[var11] >> 1 & 8355711);
                var2 += var16;
                var3 += var17;
                var0[var11++] = (var1[(var3 & 16256) + (var2 >> 7)] >>> var18) + (var0[var11] >> 1 & 8355711);
                var2 = var14;
                var3 = var15;
                var4 += var7;
                var5 += var8;
                var6 += var9;
                if (var6 != 0) {
                    var14 = var4 / var6 << 7;
                    var15 = var5 / var6 << 7;
                }

                if (var14 < 0) {
                    var14 = 0;
                } else if (var14 > 16256) {
                    var14 = 16256;
                }

                var16 = var14 - var2 >> 4;
                var17 = var15 - var3 >> 4;
            }

            for(int var20 = 0; var20 < (var10 & 15); ++var20) {
                if ((var20 & 3) == 0) {
                    var2 = (var2 & 16383) + (var12 & 6291456);
                    var18 = var12 >> 23;
                    var12 += var13;
                }

                var0[var11++] = (var1[(var3 & 16256) + (var2 >> 7)] >>> var18) + (var0[var11] >> 1 & 8355711);
                var2 += var16;
                var3 += var17;
            }

        }
    }

    private static void mi(int[] var0, int var1, int var2, int var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
        if (var11 > 0) {
            int var15 = 0;
            int var16 = 0;
            var14 <<= 2;
            if (var7 != 0) {
                var15 = var5 / var7 << 7;
                var16 = var6 / var7 << 7;
            }

            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 16256) {
                var15 = 16256;
            }

            for(int var19 = var11; var19 > 0; var19 -= 16) {
                var5 += var8;
                var6 += var9;
                var7 += var10;
                var2 = var15;
                var3 = var16;
                if (var7 != 0) {
                    var15 = var5 / var7 << 7;
                    var16 = var6 / var7 << 7;
                }

                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 16256) {
                    var15 = 16256;
                }

                int var17 = var15 - var2 >> 4;
                int var18 = var16 - var3 >> 4;
                int var20 = var13 >> 23;
                var2 += var13 & 6291456;
                var13 += var14;
                if (var19 < 16) {
                    for(int var21 = 0; var21 < var19; ++var21) {
                        if ((var1 = var4[(var3 & 16256) + (var2 >> 7)] >>> var20) != 0) {
                            var0[var12] = var1;
                        }

                        ++var12;
                        var2 += var17;
                        var3 += var18;
                        if ((var21 & 3) == 3) {
                            var2 = (var2 & 16383) + (var13 & 6291456);
                            var20 = var13 >> 23;
                            var13 += var14;
                        }
                    }
                } else {
                    if ((var1 = var4[(var3 & 16256) + (var2 >> 7)] >>> var20) != 0) {
                        var0[var12] = var1;
                    }

                    ++var12;
                    var2 += var17;
                    var3 += var18;
                    if ((var1 = var4[(var3 & 16256) + (var2 >> 7)] >>> var20) != 0) {
                        var0[var12] = var1;
                    }

                    ++var12;
                    var2 += var17;
                    var3 += var18;
                    if ((var1 = var4[(var3 & 16256) + (var2 >> 7)] >>> var20) != 0) {
                        var0[var12] = var1;
                    }

                    ++var12;
                    var2 += var17;
                    var3 += var18;
                    if ((var1 = var4[(var3 & 16256) + (var2 >> 7)] >>> var20) != 0) {
                        var0[var12] = var1;
                    }

                    ++var12;
                    var2 += var17;
                    var3 += var18;
                    var2 = (var2 & 16383) + (var13 & 6291456);
                    var20 = var13 >> 23;
                    var13 += var14;
                    if ((var1 = var4[(var3 & 16256) + (var2 >> 7)] >>> var20) != 0) {
                        var0[var12] = var1;
                    }

                    ++var12;
                    var2 += var17;
                    var3 += var18;
                    if ((var1 = var4[(var3 & 16256) + (var2 >> 7)] >>> var20) != 0) {
                        var0[var12] = var1;
                    }

                    ++var12;
                    var2 += var17;
                    var3 += var18;
                    if ((var1 = var4[(var3 & 16256) + (var2 >> 7)] >>> var20) != 0) {
                        var0[var12] = var1;
                    }

                    ++var12;
                    var2 += var17;
                    var3 += var18;
                    if ((var1 = var4[(var3 & 16256) + (var2 >> 7)] >>> var20) != 0) {
                        var0[var12] = var1;
                    }

                    ++var12;
                    var2 += var17;
                    var3 += var18;
                    var2 = (var2 & 16383) + (var13 & 6291456);
                    var20 = var13 >> 23;
                    var13 += var14;
                    if ((var1 = var4[(var3 & 16256) + (var2 >> 7)] >>> var20) != 0) {
                        var0[var12] = var1;
                    }

                    ++var12;
                    var2 += var17;
                    var3 += var18;
                    if ((var1 = var4[(var3 & 16256) + (var2 >> 7)] >>> var20) != 0) {
                        var0[var12] = var1;
                    }

                    ++var12;
                    var2 += var17;
                    var3 += var18;
                    if ((var1 = var4[(var3 & 16256) + (var2 >> 7)] >>> var20) != 0) {
                        var0[var12] = var1;
                    }

                    ++var12;
                    var2 += var17;
                    var3 += var18;
                    if ((var1 = var4[(var3 & 16256) + (var2 >> 7)] >>> var20) != 0) {
                        var0[var12] = var1;
                    }

                    ++var12;
                    var2 += var17;
                    var3 += var18;
                    var2 = (var2 & 16383) + (var13 & 6291456);
                    var20 = var13 >> 23;
                    var13 += var14;
                    if ((var1 = var4[(var3 & 16256) + (var2 >> 7)] >>> var20) != 0) {
                        var0[var12] = var1;
                    }

                    ++var12;
                    var2 += var17;
                    var3 += var18;
                    if ((var1 = var4[(var3 & 16256) + (var2 >> 7)] >>> var20) != 0) {
                        var0[var12] = var1;
                    }

                    ++var12;
                    var2 += var17;
                    var3 += var18;
                    if ((var1 = var4[(var3 & 16256) + (var2 >> 7)] >>> var20) != 0) {
                        var0[var12] = var1;
                    }

                    ++var12;
                    var2 += var17;
                    var3 += var18;
                    if ((var1 = var4[(var3 & 16256) + (var2 >> 7)] >>> var20) != 0) {
                        var0[var12] = var1;
                    }

                    ++var12;
                }
            }

        }
    }

    private static void ui(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
        if (var10 > 0) {
            int var14 = 0;
            int var15 = 0;
            var13 <<= 2;
            if (var6 != 0) {
                var14 = var4 / var6 << 6;
                var15 = var5 / var6 << 6;
            }

            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 4032) {
                var14 = 4032;
            }

            for(int var18 = var10; var18 > 0; var18 -= 16) {
                var4 += var7;
                var5 += var8;
                var6 += var9;
                var2 = var14;
                var3 = var15;
                if (var6 != 0) {
                    var14 = var4 / var6 << 6;
                    var15 = var5 / var6 << 6;
                }

                if (var14 < 0) {
                    var14 = 0;
                } else if (var14 > 4032) {
                    var14 = 4032;
                }

                int var16 = var14 - var2 >> 4;
                int var17 = var15 - var3 >> 4;
                int var19 = var12 >> 20;
                var2 += var12 & 786432;
                var12 += var13;
                if (var18 < 16) {
                    for(int var20 = 0; var20 < var18; ++var20) {
                        var0[var11++] = var1[(var3 & 4032) + (var2 >> 6)] >>> var19;
                        var2 += var16;
                        var3 += var17;
                        if ((var20 & 3) == 3) {
                            var2 = (var2 & 4095) + (var12 & 786432);
                            var19 = var12 >> 20;
                            var12 += var13;
                        }
                    }
                } else {
                    var0[var11++] = var1[(var3 & 4032) + (var2 >> 6)] >>> var19;
                    var2 += var16;
                    var3 += var17;
                    var0[var11++] = var1[(var3 & 4032) + (var2 >> 6)] >>> var19;
                    var2 += var16;
                    var3 += var17;
                    var0[var11++] = var1[(var3 & 4032) + (var2 >> 6)] >>> var19;
                    var2 += var16;
                    var3 += var17;
                    var0[var11++] = var1[(var3 & 4032) + (var2 >> 6)] >>> var19;
                    var2 += var16;
                    var3 += var17;
                    var2 = (var2 & 4095) + (var12 & 786432);
                    var19 = var12 >> 20;
                    var12 += var13;
                    var0[var11++] = var1[(var3 & 4032) + (var2 >> 6)] >>> var19;
                    var2 += var16;
                    var3 += var17;
                    var0[var11++] = var1[(var3 & 4032) + (var2 >> 6)] >>> var19;
                    var2 += var16;
                    var3 += var17;
                    var0[var11++] = var1[(var3 & 4032) + (var2 >> 6)] >>> var19;
                    var2 += var16;
                    var3 += var17;
                    var0[var11++] = var1[(var3 & 4032) + (var2 >> 6)] >>> var19;
                    var2 += var16;
                    var3 += var17;
                    var2 = (var2 & 4095) + (var12 & 786432);
                    var19 = var12 >> 20;
                    var12 += var13;
                    var0[var11++] = var1[(var3 & 4032) + (var2 >> 6)] >>> var19;
                    var2 += var16;
                    var3 += var17;
                    var0[var11++] = var1[(var3 & 4032) + (var2 >> 6)] >>> var19;
                    var2 += var16;
                    var3 += var17;
                    var0[var11++] = var1[(var3 & 4032) + (var2 >> 6)] >>> var19;
                    var2 += var16;
                    var3 += var17;
                    var0[var11++] = var1[(var3 & 4032) + (var2 >> 6)] >>> var19;
                    var2 += var16;
                    var3 += var17;
                    var2 = (var2 & 4095) + (var12 & 786432);
                    var19 = var12 >> 20;
                    var12 += var13;
                    var0[var11++] = var1[(var3 & 4032) + (var2 >> 6)] >>> var19;
                    var2 += var16;
                    var3 += var17;
                    var0[var11++] = var1[(var3 & 4032) + (var2 >> 6)] >>> var19;
                    var2 += var16;
                    var3 += var17;
                    var0[var11++] = var1[(var3 & 4032) + (var2 >> 6)] >>> var19;
                    var2 += var16;
                    var3 += var17;
                    var0[var11++] = var1[(var3 & 4032) + (var2 >> 6)] >>> var19;
                }
            }

        }
    }

    private static void ai(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
        if (var10 > 0) {
            int var14 = 0;
            int var15 = 0;
            var13 <<= 2;
            if (var6 != 0) {
                var14 = var4 / var6 << 6;
                var15 = var5 / var6 << 6;
            }

            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 4032) {
                var14 = 4032;
            }

            for(int var18 = var10; var18 > 0; var18 -= 16) {
                var4 += var7;
                var5 += var8;
                var6 += var9;
                var2 = var14;
                var3 = var15;
                if (var6 != 0) {
                    var14 = var4 / var6 << 6;
                    var15 = var5 / var6 << 6;
                }

                if (var14 < 0) {
                    var14 = 0;
                } else if (var14 > 4032) {
                    var14 = 4032;
                }

                int var16 = var14 - var2 >> 4;
                int var17 = var15 - var3 >> 4;
                int var19 = var12 >> 20;
                var2 += var12 & 786432;
                var12 += var13;
                if (var18 < 16) {
                    for(int var20 = 0; var20 < var18; ++var20) {
                        var0[var11++] = (var1[(var3 & 4032) + (var2 >> 6)] >>> var19) + (var0[var11] >> 1 & 8355711);
                        var2 += var16;
                        var3 += var17;
                        if ((var20 & 3) == 3) {
                            var2 = (var2 & 4095) + (var12 & 786432);
                            var19 = var12 >> 20;
                            var12 += var13;
                        }
                    }
                } else {
                    var0[var11++] = (var1[(var3 & 4032) + (var2 >> 6)] >>> var19) + (var0[var11] >> 1 & 8355711);
                    var2 += var16;
                    var3 += var17;
                    var0[var11++] = (var1[(var3 & 4032) + (var2 >> 6)] >>> var19) + (var0[var11] >> 1 & 8355711);
                    var2 += var16;
                    var3 += var17;
                    var0[var11++] = (var1[(var3 & 4032) + (var2 >> 6)] >>> var19) + (var0[var11] >> 1 & 8355711);
                    var2 += var16;
                    var3 += var17;
                    var0[var11++] = (var1[(var3 & 4032) + (var2 >> 6)] >>> var19) + (var0[var11] >> 1 & 8355711);
                    var2 += var16;
                    var3 += var17;
                    var2 = (var2 & 4095) + (var12 & 786432);
                    var19 = var12 >> 20;
                    var12 += var13;
                    var0[var11++] = (var1[(var3 & 4032) + (var2 >> 6)] >>> var19) + (var0[var11] >> 1 & 8355711);
                    var2 += var16;
                    var3 += var17;
                    var0[var11++] = (var1[(var3 & 4032) + (var2 >> 6)] >>> var19) + (var0[var11] >> 1 & 8355711);
                    var2 += var16;
                    var3 += var17;
                    var0[var11++] = (var1[(var3 & 4032) + (var2 >> 6)] >>> var19) + (var0[var11] >> 1 & 8355711);
                    var2 += var16;
                    var3 += var17;
                    var0[var11++] = (var1[(var3 & 4032) + (var2 >> 6)] >>> var19) + (var0[var11] >> 1 & 8355711);
                    var2 += var16;
                    var3 += var17;
                    var2 = (var2 & 4095) + (var12 & 786432);
                    var19 = var12 >> 20;
                    var12 += var13;
                    var0[var11++] = (var1[(var3 & 4032) + (var2 >> 6)] >>> var19) + (var0[var11] >> 1 & 8355711);
                    var2 += var16;
                    var3 += var17;
                    var0[var11++] = (var1[(var3 & 4032) + (var2 >> 6)] >>> var19) + (var0[var11] >> 1 & 8355711);
                    var2 += var16;
                    var3 += var17;
                    var0[var11++] = (var1[(var3 & 4032) + (var2 >> 6)] >>> var19) + (var0[var11] >> 1 & 8355711);
                    var2 += var16;
                    var3 += var17;
                    var0[var11++] = (var1[(var3 & 4032) + (var2 >> 6)] >>> var19) + (var0[var11] >> 1 & 8355711);
                    var2 += var16;
                    var3 += var17;
                    var2 = (var2 & 4095) + (var12 & 786432);
                    var19 = var12 >> 20;
                    var12 += var13;
                    var0[var11++] = (var1[(var3 & 4032) + (var2 >> 6)] >>> var19) + (var0[var11] >> 1 & 8355711);
                    var2 += var16;
                    var3 += var17;
                    var0[var11++] = (var1[(var3 & 4032) + (var2 >> 6)] >>> var19) + (var0[var11] >> 1 & 8355711);
                    var2 += var16;
                    var3 += var17;
                    var0[var11++] = (var1[(var3 & 4032) + (var2 >> 6)] >>> var19) + (var0[var11] >> 1 & 8355711);
                    var2 += var16;
                    var3 += var17;
                    var0[var11++] = (var1[(var3 & 4032) + (var2 >> 6)] >>> var19) + (var0[var11] >> 1 & 8355711);
                }
            }

        }
    }

    private static void wh(int[] var0, int var1, int var2, int var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
        if (var11 > 0) {
            int var15 = 0;
            int var16 = 0;
            var14 <<= 2;
            if (var7 != 0) {
                var15 = var5 / var7 << 6;
                var16 = var6 / var7 << 6;
            }

            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 4032) {
                var15 = 4032;
            }

            for(int var19 = var11; var19 > 0; var19 -= 16) {
                var5 += var8;
                var6 += var9;
                var7 += var10;
                var2 = var15;
                var3 = var16;
                if (var7 != 0) {
                    var15 = var5 / var7 << 6;
                    var16 = var6 / var7 << 6;
                }

                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 4032) {
                    var15 = 4032;
                }

                int var17 = var15 - var2 >> 4;
                int var18 = var16 - var3 >> 4;
                int var20 = var13 >> 20;
                var2 += var13 & 786432;
                var13 += var14;
                if (var19 < 16) {
                    for(int var21 = 0; var21 < var19; ++var21) {
                        if ((var1 = var4[(var3 & 4032) + (var2 >> 6)] >>> var20) != 0) {
                            var0[var12] = var1;
                        }

                        ++var12;
                        var2 += var17;
                        var3 += var18;
                        if ((var21 & 3) == 3) {
                            var2 = (var2 & 4095) + (var13 & 786432);
                            var20 = var13 >> 20;
                            var13 += var14;
                        }
                    }
                } else {
                    if ((var1 = var4[(var3 & 4032) + (var2 >> 6)] >>> var20) != 0) {
                        var0[var12] = var1;
                    }

                    ++var12;
                    var2 += var17;
                    var3 += var18;
                    if ((var1 = var4[(var3 & 4032) + (var2 >> 6)] >>> var20) != 0) {
                        var0[var12] = var1;
                    }

                    ++var12;
                    var2 += var17;
                    var3 += var18;
                    if ((var1 = var4[(var3 & 4032) + (var2 >> 6)] >>> var20) != 0) {
                        var0[var12] = var1;
                    }

                    ++var12;
                    var2 += var17;
                    var3 += var18;
                    if ((var1 = var4[(var3 & 4032) + (var2 >> 6)] >>> var20) != 0) {
                        var0[var12] = var1;
                    }

                    ++var12;
                    var2 += var17;
                    var3 += var18;
                    var2 = (var2 & 4095) + (var13 & 786432);
                    var20 = var13 >> 20;
                    var13 += var14;
                    if ((var1 = var4[(var3 & 4032) + (var2 >> 6)] >>> var20) != 0) {
                        var0[var12] = var1;
                    }

                    ++var12;
                    var2 += var17;
                    var3 += var18;
                    if ((var1 = var4[(var3 & 4032) + (var2 >> 6)] >>> var20) != 0) {
                        var0[var12] = var1;
                    }

                    ++var12;
                    var2 += var17;
                    var3 += var18;
                    if ((var1 = var4[(var3 & 4032) + (var2 >> 6)] >>> var20) != 0) {
                        var0[var12] = var1;
                    }

                    ++var12;
                    var2 += var17;
                    var3 += var18;
                    if ((var1 = var4[(var3 & 4032) + (var2 >> 6)] >>> var20) != 0) {
                        var0[var12] = var1;
                    }

                    ++var12;
                    var2 += var17;
                    var3 += var18;
                    var2 = (var2 & 4095) + (var13 & 786432);
                    var20 = var13 >> 20;
                    var13 += var14;
                    if ((var1 = var4[(var3 & 4032) + (var2 >> 6)] >>> var20) != 0) {
                        var0[var12] = var1;
                    }

                    ++var12;
                    var2 += var17;
                    var3 += var18;
                    if ((var1 = var4[(var3 & 4032) + (var2 >> 6)] >>> var20) != 0) {
                        var0[var12] = var1;
                    }

                    ++var12;
                    var2 += var17;
                    var3 += var18;
                    if ((var1 = var4[(var3 & 4032) + (var2 >> 6)] >>> var20) != 0) {
                        var0[var12] = var1;
                    }

                    ++var12;
                    var2 += var17;
                    var3 += var18;
                    if ((var1 = var4[(var3 & 4032) + (var2 >> 6)] >>> var20) != 0) {
                        var0[var12] = var1;
                    }

                    ++var12;
                    var2 += var17;
                    var3 += var18;
                    var2 = (var2 & 4095) + (var13 & 786432);
                    var20 = var13 >> 20;
                    var13 += var14;
                    if ((var1 = var4[(var3 & 4032) + (var2 >> 6)] >>> var20) != 0) {
                        var0[var12] = var1;
                    }

                    ++var12;
                    var2 += var17;
                    var3 += var18;
                    if ((var1 = var4[(var3 & 4032) + (var2 >> 6)] >>> var20) != 0) {
                        var0[var12] = var1;
                    }

                    ++var12;
                    var2 += var17;
                    var3 += var18;
                    if ((var1 = var4[(var3 & 4032) + (var2 >> 6)] >>> var20) != 0) {
                        var0[var12] = var1;
                    }

                    ++var12;
                    var2 += var17;
                    var3 += var18;
                    if ((var1 = var4[(var3 & 4032) + (var2 >> 6)] >>> var20) != 0) {
                        var0[var12] = var1;
                    }

                    ++var12;
                }
            }

        }
    }

    private static void nh(int[] var0, int var1, int var2, int var3, int[] var4, int var5, int var6) {
        if (var1 < 0) {
            var6 <<= 1;
            var3 = var4[var5 >> 8 & 255];
            var5 += var6;
            int var7 = var1 / 8;

            for(int var8 = var7; var8 < 0; ++var8) {
                var0[var2++] = var3;
                var0[var2++] = var3;
                var3 = var4[var5 >> 8 & 255];
                var5 += var6;
                var0[var2++] = var3;
                var0[var2++] = var3;
                var3 = var4[var5 >> 8 & 255];
                var5 += var6;
                var0[var2++] = var3;
                var0[var2++] = var3;
                var3 = var4[var5 >> 8 & 255];
                var5 += var6;
                var0[var2++] = var3;
                var0[var2++] = var3;
                var3 = var4[var5 >> 8 & 255];
                var5 += var6;
            }

            var7 = -(var1 % 8);

            for(int var9 = 0; var9 < var7; ++var9) {
                var0[var2++] = var3;
                if ((var9 & 1) == 1) {
                    var3 = var4[var5 >> 8 & 255];
                    var5 += var6;
                }
            }

        }
    }

    private static void li(int[] var0, int var1, int var2, int var3, int[] var4, int var5, int var6) {
        if (var1 < 0) {
            var6 <<= 2;
            var3 = var4[var5 >> 8 & 255];
            var5 += var6;
            int var7 = var1 / 16;

            for(int var8 = var7; var8 < 0; ++var8) {
                var0[var2++] = var3 + (var0[var2] >> 1 & 8355711);
                var0[var2++] = var3 + (var0[var2] >> 1 & 8355711);
                var0[var2++] = var3 + (var0[var2] >> 1 & 8355711);
                var0[var2++] = var3 + (var0[var2] >> 1 & 8355711);
                var3 = var4[var5 >> 8 & 255];
                var5 += var6;
                var0[var2++] = var3 + (var0[var2] >> 1 & 8355711);
                var0[var2++] = var3 + (var0[var2] >> 1 & 8355711);
                var0[var2++] = var3 + (var0[var2] >> 1 & 8355711);
                var0[var2++] = var3 + (var0[var2] >> 1 & 8355711);
                var3 = var4[var5 >> 8 & 255];
                var5 += var6;
                var0[var2++] = var3 + (var0[var2] >> 1 & 8355711);
                var0[var2++] = var3 + (var0[var2] >> 1 & 8355711);
                var0[var2++] = var3 + (var0[var2] >> 1 & 8355711);
                var0[var2++] = var3 + (var0[var2] >> 1 & 8355711);
                var3 = var4[var5 >> 8 & 255];
                var5 += var6;
                var0[var2++] = var3 + (var0[var2] >> 1 & 8355711);
                var0[var2++] = var3 + (var0[var2] >> 1 & 8355711);
                var0[var2++] = var3 + (var0[var2] >> 1 & 8355711);
                var0[var2++] = var3 + (var0[var2] >> 1 & 8355711);
                var3 = var4[var5 >> 8 & 255];
                var5 += var6;
            }

            var7 = -(var1 % 16);

            for(int var9 = 0; var9 < var7; ++var9) {
                var0[var2++] = var3 + (var0[var2] >> 1 & 8355711);
                if ((var9 & 3) == 3) {
                    var3 = var4[var5 >> 8 & 255];
                    var5 += var6;
                    var5 += var6;
                }
            }

        }
    }

    private static void bi(int[] var0, int var1, int var2, int var3, int[] var4, int var5, int var6) {
        if (var1 < 0) {
            var6 <<= 2;
            var3 = var4[var5 >> 8 & 255];
            var5 += var6;
            int var7 = var1 / 16;

            for(int var8 = var7; var8 < 0; ++var8) {
                var0[var2++] = var3;
                var0[var2++] = var3;
                var0[var2++] = var3;
                var0[var2++] = var3;
                var3 = var4[var5 >> 8 & 255];
                var5 += var6;
                var0[var2++] = var3;
                var0[var2++] = var3;
                var0[var2++] = var3;
                var0[var2++] = var3;
                var3 = var4[var5 >> 8 & 255];
                var5 += var6;
                var0[var2++] = var3;
                var0[var2++] = var3;
                var0[var2++] = var3;
                var0[var2++] = var3;
                var3 = var4[var5 >> 8 & 255];
                var5 += var6;
                var0[var2++] = var3;
                var0[var2++] = var3;
                var0[var2++] = var3;
                var0[var2++] = var3;
                var3 = var4[var5 >> 8 & 255];
                var5 += var6;
            }

            var7 = -(var1 % 16);

            for(int var9 = 0; var9 < var7; ++var9) {
                var0[var2++] = var3;
                if ((var9 & 3) == 3) {
                    var3 = var4[var5 >> 8 & 255];
                    var5 += var6;
                }
            }

        }
    }

    public void ei(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        this.bn = 1024 - var4 & 1023;
        this.cn = 1024 - var5 & 1023;
        this.dn = 1024 - var6 & 1023;
        int var8 = 0;
        int var9 = 0;
        int var10 = var7;
        int var11;
        int var12;
        int var13;
        if (var4 != 0) {
            var11 = fm[var4];
            var12 = fm[var4 + 1024];
            var13 = var9 * var12 - var7 * var11 >> 15;
            var10 = var9 * var11 + var7 * var12 >> 15;
            var9 = var13;
        }

        if (var5 != 0) {
            var11 = fm[var5];
            var12 = fm[var5 + 1024];
            var13 = var10 * var11 + var8 * var12 >> 15;
            var10 = var10 * var12 - var8 * var11 >> 15;
            var8 = var13;
        }

        if (var6 != 0) {
            var11 = fm[var6];
            var12 = fm[var6 + 1024];
            var13 = var9 * var11 + var8 * var12 >> 15;
            var9 = var9 * var12 - var8 * var11 >> 15;
            var8 = var13;
        }

        this.ym = var1 - var8;
        this.zm = var2 - var9;
        this.an = var3 - var10;
    }

    private void bj(int var1) {
        Polygon var2 = this.jn[var1];
        GameModel var3 = var2.hhb;
        int var4 = var2.ihb;
        int[] var5 = var3.rg[var4];
        int var6 = var3.qg[var4];
        int var7 = var3.vg[var4];
        int var9 = var3.ig[var5[0]];
        int var10 = var3.jg[var5[0]];
        int var11 = var3.kg[var5[0]];
        int var12 = var3.ig[var5[1]] - var9;
        int var13 = var3.jg[var5[1]] - var10;
        int var14 = var3.kg[var5[1]] - var11;
        int var15 = var3.ig[var5[2]] - var9;
        int var16 = var3.jg[var5[2]] - var10;
        int var17 = var3.kg[var5[2]] - var11;
        int var18 = var13 * var17 - var16 * var14;
        int var19 = var14 * var15 - var17 * var12;
        int var20 = var12 * var16 - var15 * var13;
        if (var7 == -1) {
            for(var7 = 0; var18 > 25000 || var19 > 25000 || var20 > 25000 || var18 < -25000 || var19 < -25000 || var20 < -25000; var20 >>= 1) {
                ++var7;
                var18 >>= 1;
                var19 >>= 1;
            }

            var3.vg[var4] = var7;
            var3.ug[var4] = (int)((double)this.xm * Math.sqrt((double)(var18 * var18 + var19 * var19 + var20 * var20)));
        } else {
            var18 >>= var7;
            var19 >>= var7;
            var20 >>= var7;
        }

        var2.nhb = var9 * var18 + var10 * var19 + var11 * var20;
        var2.khb = var18;
        var2.lhb = var19;
        var2.mhb = var20;
        int var21 = var3.kg[var5[0]];
        int var22 = var21;
        int var23 = var3.lg[var5[0]];
        int var24 = var23;
        int var25 = var3.mg[var5[0]];
        int var26 = var25;

        for(int var27 = 1; var27 < var6; ++var27) {
            int var8 = var3.kg[var5[var27]];
            if (var8 > var22) {
                var22 = var8;
            } else if (var8 < var21) {
                var21 = var8;
            }

            var8 = var3.lg[var5[var27]];
            if (var8 > var24) {
                var24 = var8;
            } else if (var8 < var23) {
                var23 = var8;
            }

            var8 = var3.mg[var5[var27]];
            if (var8 > var26) {
                var26 = var8;
            } else if (var8 < var25) {
                var25 = var8;
            }
        }

        var2.fhb = var21;
        var2.ghb = var22;
        var2.bhb = var23;
        var2.dhb = var24;
        var2.chb = var25;
        var2.ehb = var26;
    }

    private void dj(int var1) {
        Polygon var2 = this.jn[var1];
        GameModel var3 = var2.hhb;
        int var4 = var2.ihb;
        int[] var5 = var3.rg[var4];
        byte var7 = 0;
        byte var8 = 0;
        byte var9 = 1;
        int var10 = var3.ig[var5[0]];
        int var11 = var3.jg[var5[0]];
        int var12 = var3.kg[var5[0]];
        var3.ug[var4] = 1;
        var3.vg[var4] = 0;
        var2.nhb = var10 * var7 + var11 * var8 + var12 * var9;
        var2.khb = var7;
        var2.lhb = var8;
        var2.mhb = var9;
        int var13 = var3.kg[var5[0]];
        int var14 = var13;
        int var15 = var3.lg[var5[0]];
        int var16 = var15;
        if (var3.lg[var5[1]] < var15) {
            var15 = var3.lg[var5[1]];
        } else {
            var16 = var3.lg[var5[1]];
        }

        int var17 = var3.mg[var5[1]];
        int var18 = var3.mg[var5[0]];
        int var6 = var3.kg[var5[1]];
        if (var6 > var13) {
            var14 = var6;
        } else if (var6 < var13) {
            var13 = var6;
        }

        var6 = var3.lg[var5[1]];
        if (var6 > var16) {
            var16 = var6;
        } else if (var6 < var15) {
            var15 = var6;
        }

        var6 = var3.mg[var5[1]];
        if (var6 > var18) {
            var18 = var6;
        } else if (var6 < var17) {
            var17 = var6;
        }

        var2.fhb = var13;
        var2.ghb = var14;
        var2.bhb = var15 - 20;
        var2.dhb = var16 + 20;
        var2.chb = var17;
        var2.ehb = var18;
    }

    private boolean mh(Polygon var1, Polygon var2) {
        if (var1.bhb >= var2.dhb) {
            return true;
        } else if (var2.bhb >= var1.dhb) {
            return true;
        } else if (var1.chb >= var2.ehb) {
            return true;
        } else if (var2.chb >= var1.ehb) {
            return true;
        } else if (var1.fhb >= var2.ghb) {
            return true;
        } else if (var2.fhb > var1.ghb) {
            return false;
        } else {
            GameModel var3 = var1.hhb;
            GameModel var4 = var2.hhb;
            int var5 = var1.ihb;
            int var6 = var2.ihb;
            int[] var7 = var3.rg[var5];
            int[] var8 = var4.rg[var6];
            int var9 = var3.qg[var5];
            int var10 = var4.qg[var6];
            int var14 = var4.ig[var8[0]];
            int var15 = var4.jg[var8[0]];
            int var16 = var4.kg[var8[0]];
            int var17 = var2.khb;
            int var18 = var2.lhb;
            int var19 = var2.mhb;
            int var20 = var4.ug[var6];
            int var21 = var2.nhb;
            boolean var13 = false;

            int var11;
            int var12;
            for(int var22 = 0; var22 < var9; ++var22) {
                var11 = var7[var22];
                var12 = (var14 - var3.ig[var11]) * var17 + (var15 - var3.jg[var11]) * var18 + (var16 - var3.kg[var11]) * var19;
                if (var12 < -var20 && var21 < 0 || var12 > var20 && var21 > 0) {
                    var13 = true;
                    break;
                }
            }

            if (!var13) {
                return true;
            } else {
                var14 = var3.ig[var7[0]];
                var15 = var3.jg[var7[0]];
                var16 = var3.kg[var7[0]];
                var17 = var1.khb;
                var18 = var1.lhb;
                var19 = var1.mhb;
                var20 = var3.ug[var5];
                var21 = var1.nhb;
                var13 = false;

                for(int var23 = 0; var23 < var10; ++var23) {
                    var11 = var8[var23];
                    var12 = (var14 - var4.ig[var11]) * var17 + (var15 - var4.jg[var11]) * var18 + (var16 - var4.kg[var11]) * var19;
                    if (var12 < -var20 && var21 > 0 || var12 > var20 && var21 < 0) {
                        var13 = true;
                        break;
                    }
                }

                if (!var13) {
                    return true;
                } else {
                    int[] var24;
                    int[] var25;
                    int var28;
                    int var29;
                    if (var9 == 2) {
                        var24 = new int[4];
                        var25 = new int[4];
                        var28 = var7[0];
                        var11 = var7[1];
                        var24[0] = var3.lg[var28] - 20;
                        var24[1] = var3.lg[var11] - 20;
                        var24[2] = var3.lg[var11] + 20;
                        var24[3] = var3.lg[var28] + 20;
                        var25[0] = var25[3] = var3.mg[var28];
                        var25[1] = var25[2] = var3.mg[var11];
                    } else {
                        var24 = new int[var9];
                        var25 = new int[var9];

                        for(var28 = 0; var28 < var9; ++var28) {
                            var29 = var7[var28];
                            var24[var28] = var3.lg[var29];
                            var25[var28] = var3.mg[var29];
                        }
                    }

                    int[] var26;
                    int[] var27;
                    if (var10 == 2) {
                        var26 = new int[4];
                        var27 = new int[4];
                        var28 = var8[0];
                        var11 = var8[1];
                        var26[0] = var4.lg[var28] - 20;
                        var26[1] = var4.lg[var11] - 20;
                        var26[2] = var4.lg[var11] + 20;
                        var26[3] = var4.lg[var28] + 20;
                        var27[0] = var27[3] = var4.mg[var28];
                        var27[1] = var27[2] = var4.mg[var11];
                    } else {
                        var26 = new int[var10];
                        var27 = new int[var10];

                        for(var28 = 0; var28 < var10; ++var28) {
                            var29 = var8[var28];
                            var26[var28] = var4.lg[var29];
                            var27[var28] = var4.mg[var29];
                        }
                    }

                    return !this.oh(var24, var25, var26, var27);
                }
            }
        }
    }

    private boolean kh(Polygon var1, Polygon var2) {
        GameModel var3 = var1.hhb;
        GameModel var4 = var2.hhb;
        int var5 = var1.ihb;
        int var6 = var2.ihb;
        int[] var7 = var3.rg[var5];
        int[] var8 = var4.rg[var6];
        int var9 = var3.qg[var5];
        int var10 = var4.qg[var6];
        int var14 = var4.ig[var8[0]];
        int var15 = var4.jg[var8[0]];
        int var16 = var4.kg[var8[0]];
        int var17 = var2.khb;
        int var18 = var2.lhb;
        int var19 = var2.mhb;
        int var20 = var4.ug[var6];
        int var21 = var2.nhb;
        boolean var13 = false;

        int var11;
        int var12;
        for(int var22 = 0; var22 < var9; ++var22) {
            var11 = var7[var22];
            var12 = (var14 - var3.ig[var11]) * var17 + (var15 - var3.jg[var11]) * var18 + (var16 - var3.kg[var11]) * var19;
            if (var12 < -var20 && var21 < 0 || var12 > var20 && var21 > 0) {
                var13 = true;
                break;
            }
        }

        if (!var13) {
            return true;
        } else {
            var14 = var3.ig[var7[0]];
            var15 = var3.jg[var7[0]];
            var16 = var3.kg[var7[0]];
            var17 = var1.khb;
            var18 = var1.lhb;
            var19 = var1.mhb;
            var20 = var3.ug[var5];
            var21 = var1.nhb;
            var13 = false;

            for(int var23 = 0; var23 < var10; ++var23) {
                var11 = var8[var23];
                var12 = (var14 - var4.ig[var11]) * var17 + (var15 - var4.jg[var11]) * var18 + (var16 - var4.kg[var11]) * var19;
                if (var12 < -var20 && var21 > 0 || var12 > var20 && var21 < 0) {
                    var13 = true;
                    break;
                }
            }

            return !var13;
        }
    }

    public void ih(String var1, int var2, int var3, int var4, GameApplet var5) {
        try {
            this.go = var5.gj(var1, "textures", var4);
            byte[] var6 = Utility.gn("textures.txt", 0, this.go);
            ClientStream var7 = new ClientStream(var6);
            var7.sb();
            this.yn = var7.xb();
            this.zn = new String[this.yn];
            this.do_ = new boolean[this.yn];
            this.co = new long[this.yn];
            this.ao = new int[this.yn];
            this.bo = new int[this.yn];
            this.eo = new int[this.yn][];

            for(int var8 = 0; var8 < this.yn; ++var8) {
                var7.sb();
                this.zn[var8] = var7.yb();
                this.ao[var8] = var7.tb();
                this.bo[var8] = var7.xb();
                this.do_[var8] = false;
                this.eo[var8] = null;
                this.co[var8] = 0L;
            }

            fo = 0L;
            this.ho = new int[var2][];
            this.io = new int[var3][];

            for(int var9 = 0; var9 < this.yn; ++var9) {
                this.pi(var9);
            }

        } catch (IOException var10) {
            System.out.println("Error loading texture set");
        }
    }

    public void ki(int var1) {
        if (this.eo[var1] != null) {
            int[] var2 = this.eo[var1];

            int var5;
            int var6;
            for(int var3 = 0; var3 < 64; ++var3) {
                int var4 = var3 + 4032;
                var5 = var2[var4];

                for(var6 = 0; var6 < 63; ++var6) {
                    var2[var4] = var2[var4 - 64];
                    var4 -= 64;
                }

                this.eo[var1][var4] = var5;
            }

            short var7 = 4096;

            for(var5 = 0; var5 < var7; ++var5) {
                var6 = var2[var5];
                var2[var7 + var5] = var6 - (var6 >>> 3) & 16316671;
                var2[var7 * 2 + var5] = var6 - (var6 >>> 2) & 16316671;
                var2[var7 * 3 + var5] = var6 - (var6 >>> 2) - (var6 >>> 3) & 16316671;
            }

        }
    }

    public void pi(int var1) {
        if (var1 >= 0) {
            this.co[var1] = (long)(fo++);
            if (this.eo[var1] == null) {
                int var2;
                long var3;
                int var5;
                int var6;
                if (this.bo[var1] == 0) {
                    for(var2 = 0; var2 < this.ho.length; ++var2) {
                        if (this.ho[var2] == null) {
                            this.ho[var2] = new int[16384];
                            this.eo[var1] = this.ho[var2];
                            Utility.wn(this.zn[var1] + ".tga", 0, this.go, jo);
                            this.ni(var1);
                            return;
                        }
                    }

                    var3 = 1L << 30;
                    var5 = 0;

                    for(var6 = 0; var6 < this.yn; ++var6) {
                        if (var6 != var1 && this.bo[var6] == 0 && this.eo[var6] != null && this.co[var6] < var3) {
                            var3 = this.co[var6];
                            var5 = var6;
                        }
                    }

                    this.eo[var1] = this.eo[var5];
                    this.eo[var5] = null;
                    Utility.wn(this.zn[var1] + ".tga", 0, this.go, jo);
                    this.ni(var1);
                } else {
                    for(var2 = 0; var2 < this.io.length; ++var2) {
                        if (this.io[var2] == null) {
                            this.io[var2] = new int[65536];
                            this.eo[var1] = this.io[var2];
                            Utility.wn(this.zn[var1] + ".tga", 0, this.go, jo);
                            this.ni(var1);
                            return;
                        }
                    }

                    var3 = 1L << 30;
                    var5 = 0;

                    for(var6 = 0; var6 < this.yn; ++var6) {
                        if (var6 != var1 && this.bo[var6] == 1 && this.eo[var6] != null && this.co[var6] < var3) {
                            var3 = this.co[var6];
                            var5 = var6;
                        }
                    }

                    this.eo[var1] = this.eo[var5];
                    this.eo[var5] = null;
                    Utility.wn(this.zn[var1] + ".tga", 0, this.go, jo);
                    this.ni(var1);
                }
            }
        }
    }

    public void qi(String var1) {
        try {
            ClientStream var2 = new ClientStream(var1 + "/textures.txt");
            var2.sb();
            this.yn = var2.xb();
            this.zn = new String[this.yn];
            this.do_ = new boolean[this.yn];
            this.co = new long[this.yn];
            this.ao = new int[this.yn];
            this.bo = new int[this.yn];
            this.eo = new int[this.yn][];

            for(int var3 = 0; var3 < this.yn; ++var3) {
                var2.sb();
                this.zn[var3] = var2.yb();
                this.ao[var3] = var2.tb();
                this.bo[var3] = var2.xb();
                this.do_[var3] = false;
            }

            var2.zb();

            for(int var4 = 0; var4 < this.yn; ++var4) {
                short var5;
                if (this.bo[var4] == 0) {
                    var5 = 5403;
                } else {
                    var5 = 17691;
                }

                short var6;
                if (this.bo[var4] == 0) {
                    var6 = 64;
                } else {
                    var6 = 128;
                }

                this.eo[var4] = new int[var6 * var6 * 4];
                Utility.en(var1 + "/" + this.zn[var4] + ".tga", jo, var5);
                this.ni(var4);
            }

        } catch (IOException var7) {
            System.out.println("Error loading texture set");
        }
    }

    private void ni(int var1) {
        short var2;
        if (this.bo[var1] == 0) {
            var2 = 64;
        } else {
            var2 = 128;
        }

        int[] var3 = this.eo[var1];
        int var4 = 0;

        for(int var5 = 0; var5 < 256; ++var5) {
            ko[var5] = ((jo[20 + var5 * 3] & 255) << 16) + ((jo[19 + var5 * 3] & 255) << 8) + (jo[18 + var5 * 3] & 255);
        }

        int var7;
        int var8;
        for(int var6 = var2 - 1; var6 >= 0; --var6) {
            for(var7 = 0; var7 < var2; ++var7) {
                var8 = ko[jo[786 + var7 + var6 * var2] & 255];
                if (var8 != 16711935 && this.ao[var1] != 0) {
                    int var9 = var8 >> 16 & 255;
                    int var10 = var8 >> 8 & 255;
                    int var11 = var8 & 255;
                    if (var9 == var10 && var10 == var11) {
                        int var12 = this.ao[var1] >> 16 & 255;
                        int var13 = this.ao[var1] >> 8 & 255;
                        int var14 = this.ao[var1] & 255;
                        var8 = (var9 * var12 >> 8 << 16) + (var10 * var13 >> 8 << 8) + (var11 * var14 >> 8);
                    }
                }

                var8 &= 16316671;
                if (var8 == 0) {
                    var8 = 1;
                } else if (var8 == 16253183) {
                    var8 = 0;
                    this.do_[var1] = true;
                }

                var3[var4++] = var8;
            }
        }

        for(var7 = 0; var7 < var4; ++var7) {
            var8 = var3[var7];
            var3[var4 + var7] = var8 - (var8 >>> 3) & 16316671;
            var3[var4 * 2 + var7] = var8 - (var8 >>> 2) & 16316671;
            var3[var4 * 3 + var7] = var8 - (var8 >>> 2) - (var8 >>> 3) & 16316671;
        }

    }

    public int yi(int var1) {
        if (var1 == 12345678) {
            return 0;
        } else {
            this.pi(var1);
            if (var1 >= 0) {
                return this.eo[var1][0];
            } else if (var1 < 0) {
                var1 = -(var1 + 1);
                int var2 = var1 >> 10 & 31;
                int var3 = var1 >> 5 & 31;
                int var4 = var1 & 31;
                return (var2 << 19) + (var3 << 11) + (var4 << 3);
            } else {
                return 0;
            }
        }
    }

    public void hi(int var1, int var2, int var3) {
        if (var1 == 0 && var2 == 0 && var3 == 0) {
            var1 = 32;
        }

        for(int var4 = 0; var4 < this.en; ++var4) {
            this.gn[var4].cf(var1, var2, var3);
        }

    }

    public void di(boolean var1, int var2, int var3, int var4, int var5, int var6) {
        if (var4 == 0 && var5 == 0 && var6 == 0) {
            var4 = 32;
        }

        for(int var7 = 0; var7 < this.en; ++var7) {
            this.gn[var7].we(var1, var2, var3, var4, var5, var6);
        }

    }

    public static int ji(int var0, int var1, int var2) {
        return -1 - var0 / 8 * 1024 - var1 / 8 * 32 - var2 / 8;
    }

    public int rh(int var1, int var2, int var3, int var4, int var5) {
        return var4 == var2 ? var1 : var1 + (var3 - var1) * (var5 - var2) / (var4 - var2);
    }

    public boolean gi(int var1, int var2, int var3, int var4, boolean var5) {
        if ((!var5 || var1 > var3) && var1 >= var3) {
            if (var1 < var4) {
                return true;
            } else if (var2 < var3) {
                return true;
            } else {
                return var2 < var4 ? true : var5;
            }
        } else if (var1 > var4) {
            return true;
        } else if (var2 > var3) {
            return true;
        } else if (var2 > var4) {
            return true;
        } else {
            return !var5;
        }
    }

    public boolean vh(int var1, int var2, int var3, boolean var4) {
        if ((!var4 || var1 > var3) && var1 >= var3) {
            return var2 < var3 ? true : var4;
        } else if (var2 > var3) {
            return true;
        } else {
            return !var4;
        }
    }

    public boolean oh(int[] var1, int[] var2, int[] var3, int[] var4) {
        int var5 = var1.length;
        int var6 = var3.length;
        byte var15 = 0;
        int var17;
        int var19 = var17 = var2[0];
        int var7 = 0;
        int var18;
        int var20 = var18 = var4[0];
        int var9 = 0;

        for(int var21 = 1; var21 < var5; ++var21) {
            if (var2[var21] < var17) {
                var17 = var2[var21];
                var7 = var21;
            } else if (var2[var21] > var19) {
                var19 = var2[var21];
            }
        }

        for(int var22 = 1; var22 < var6; ++var22) {
            if (var4[var22] < var18) {
                var18 = var4[var22];
                var9 = var22;
            } else if (var4[var22] > var20) {
                var20 = var4[var22];
            }
        }

        if (var18 >= var19) {
            return false;
        } else if (var17 >= var20) {
            return false;
        } else {
            int var8;
            int var10;
            int var11;
            int var12;
            int var13;
            int var14;
            boolean var16;
            if (var2[var7] < var4[var9]) {
                for(var8 = var7; var2[var8] < var4[var9]; var8 = (var8 + 1) % var5) {
                    ;
                }

                while(var2[var7] < var4[var9]) {
                    var7 = (var7 - 1 + var5) % var5;
                }

                var11 = this.rh(var1[(var7 + 1) % var5], var2[(var7 + 1) % var5], var1[var7], var2[var7], var4[var9]);
                var12 = this.rh(var1[(var8 - 1 + var5) % var5], var2[(var8 - 1 + var5) % var5], var1[var8], var2[var8], var4[var9]);
                var13 = var3[var9];
                var16 = var11 < var13 | var12 < var13;
                if (this.vh(var11, var12, var13, var16)) {
                    return true;
                }

                var10 = (var9 + 1) % var6;
                var9 = (var9 - 1 + var6) % var6;
                if (var7 == var8) {
                    var15 = 1;
                }
            } else {
                for(var10 = var9; var4[var10] < var2[var7]; var10 = (var10 + 1) % var6) {
                    ;
                }

                while(var4[var9] < var2[var7]) {
                    var9 = (var9 - 1 + var6) % var6;
                }

                var11 = var1[var7];
                var13 = this.rh(var3[(var9 + 1) % var6], var4[(var9 + 1) % var6], var3[var9], var4[var9], var2[var7]);
                var14 = this.rh(var3[(var10 - 1 + var6) % var6], var4[(var10 - 1 + var6) % var6], var3[var10], var4[var10], var2[var7]);
                var16 = var11 < var13 | var11 < var14;
                if (this.vh(var13, var14, var11, !var16)) {
                    return true;
                }

                var8 = (var7 + 1) % var5;
                var7 = (var7 - 1 + var5) % var5;
                if (var9 == var10) {
                    var15 = 2;
                }
            }

            while(var15 == 0) {
                if (var2[var7] < var2[var8]) {
                    if (var2[var7] < var4[var9]) {
                        if (var2[var7] < var4[var10]) {
                            var11 = var1[var7];
                            var12 = this.rh(var1[(var8 - 1 + var5) % var5], var2[(var8 - 1 + var5) % var5], var1[var8], var2[var8], var2[var7]);
                            var13 = this.rh(var3[(var9 + 1) % var6], var4[(var9 + 1) % var6], var3[var9], var4[var9], var2[var7]);
                            var14 = this.rh(var3[(var10 - 1 + var6) % var6], var4[(var10 - 1 + var6) % var6], var3[var10], var4[var10], var2[var7]);
                            if (this.gi(var11, var12, var13, var14, var16)) {
                                return true;
                            }

                            var7 = (var7 - 1 + var5) % var5;
                            if (var7 == var8) {
                                var15 = 1;
                            }
                        } else {
                            var11 = this.rh(var1[(var7 + 1) % var5], var2[(var7 + 1) % var5], var1[var7], var2[var7], var4[var10]);
                            var12 = this.rh(var1[(var8 - 1 + var5) % var5], var2[(var8 - 1 + var5) % var5], var1[var8], var2[var8], var4[var10]);
                            var13 = this.rh(var3[(var9 + 1) % var6], var4[(var9 + 1) % var6], var3[var9], var4[var9], var4[var10]);
                            var14 = var3[var10];
                            if (this.gi(var11, var12, var13, var14, var16)) {
                                return true;
                            }

                            var10 = (var10 + 1) % var6;
                            if (var9 == var10) {
                                var15 = 2;
                            }
                        }
                    } else if (var4[var9] < var4[var10]) {
                        var11 = this.rh(var1[(var7 + 1) % var5], var2[(var7 + 1) % var5], var1[var7], var2[var7], var4[var9]);
                        var12 = this.rh(var1[(var8 - 1 + var5) % var5], var2[(var8 - 1 + var5) % var5], var1[var8], var2[var8], var4[var9]);
                        var13 = var3[var9];
                        var14 = this.rh(var3[(var10 - 1 + var6) % var6], var4[(var10 - 1 + var6) % var6], var3[var10], var4[var10], var4[var9]);
                        if (this.gi(var11, var12, var13, var14, var16)) {
                            return true;
                        }

                        var9 = (var9 - 1 + var6) % var6;
                        if (var9 == var10) {
                            var15 = 2;
                        }
                    } else {
                        var11 = this.rh(var1[(var7 + 1) % var5], var2[(var7 + 1) % var5], var1[var7], var2[var7], var4[var10]);
                        var12 = this.rh(var1[(var8 - 1 + var5) % var5], var2[(var8 - 1 + var5) % var5], var1[var8], var2[var8], var4[var10]);
                        var13 = this.rh(var3[(var9 + 1) % var6], var4[(var9 + 1) % var6], var3[var9], var4[var9], var4[var10]);
                        var14 = var3[var10];
                        if (this.gi(var11, var12, var13, var14, var16)) {
                            return true;
                        }

                        var10 = (var10 + 1) % var6;
                        if (var9 == var10) {
                            var15 = 2;
                        }
                    }
                } else if (var2[var8] < var4[var9]) {
                    if (var2[var8] < var4[var10]) {
                        var11 = this.rh(var1[(var7 + 1) % var5], var2[(var7 + 1) % var5], var1[var7], var2[var7], var2[var8]);
                        var12 = var1[var8];
                        var13 = this.rh(var3[(var9 + 1) % var6], var4[(var9 + 1) % var6], var3[var9], var4[var9], var2[var8]);
                        var14 = this.rh(var3[(var10 - 1 + var6) % var6], var4[(var10 - 1 + var6) % var6], var3[var10], var4[var10], var2[var8]);
                        if (this.gi(var11, var12, var13, var14, var16)) {
                            return true;
                        }

                        var8 = (var8 + 1) % var5;
                        if (var7 == var8) {
                            var15 = 1;
                        }
                    } else {
                        var11 = this.rh(var1[(var7 + 1) % var5], var2[(var7 + 1) % var5], var1[var7], var2[var7], var4[var10]);
                        var12 = this.rh(var1[(var8 - 1 + var5) % var5], var2[(var8 - 1 + var5) % var5], var1[var8], var2[var8], var4[var10]);
                        var13 = this.rh(var3[(var9 + 1) % var6], var4[(var9 + 1) % var6], var3[var9], var4[var9], var4[var10]);
                        var14 = var3[var10];
                        if (this.gi(var11, var12, var13, var14, var16)) {
                            return true;
                        }

                        var10 = (var10 + 1) % var6;
                        if (var9 == var10) {
                            var15 = 2;
                        }
                    }
                } else if (var4[var9] < var4[var10]) {
                    var11 = this.rh(var1[(var7 + 1) % var5], var2[(var7 + 1) % var5], var1[var7], var2[var7], var4[var9]);
                    var12 = this.rh(var1[(var8 - 1 + var5) % var5], var2[(var8 - 1 + var5) % var5], var1[var8], var2[var8], var4[var9]);
                    var13 = var3[var9];
                    var14 = this.rh(var3[(var10 - 1 + var6) % var6], var4[(var10 - 1 + var6) % var6], var3[var10], var4[var10], var4[var9]);
                    if (this.gi(var11, var12, var13, var14, var16)) {
                        return true;
                    }

                    var9 = (var9 - 1 + var6) % var6;
                    if (var9 == var10) {
                        var15 = 2;
                    }
                } else {
                    var11 = this.rh(var1[(var7 + 1) % var5], var2[(var7 + 1) % var5], var1[var7], var2[var7], var4[var10]);
                    var12 = this.rh(var1[(var8 - 1 + var5) % var5], var2[(var8 - 1 + var5) % var5], var1[var8], var2[var8], var4[var10]);
                    var13 = this.rh(var3[(var9 + 1) % var6], var4[(var9 + 1) % var6], var3[var9], var4[var9], var4[var10]);
                    var14 = var3[var10];
                    if (this.gi(var11, var12, var13, var14, var16)) {
                        return true;
                    }

                    var10 = (var10 + 1) % var6;
                    if (var9 == var10) {
                        var15 = 2;
                    }
                }
            }

            while(var15 == 1) {
                if (var2[var7] < var4[var9]) {
                    if (var2[var7] < var4[var10]) {
                        var11 = var1[var7];
                        var13 = this.rh(var3[(var9 + 1) % var6], var4[(var9 + 1) % var6], var3[var9], var4[var9], var2[var7]);
                        var14 = this.rh(var3[(var10 - 1 + var6) % var6], var4[(var10 - 1 + var6) % var6], var3[var10], var4[var10], var2[var7]);
                        if (this.vh(var13, var14, var11, !var16)) {
                            return true;
                        }

                        return false;
                    }

                    var11 = this.rh(var1[(var7 + 1) % var5], var2[(var7 + 1) % var5], var1[var7], var2[var7], var4[var10]);
                    var12 = this.rh(var1[(var8 - 1 + var5) % var5], var2[(var8 - 1 + var5) % var5], var1[var8], var2[var8], var4[var10]);
                    var13 = this.rh(var3[(var9 + 1) % var6], var4[(var9 + 1) % var6], var3[var9], var4[var9], var4[var10]);
                    var14 = var3[var10];
                    if (this.gi(var11, var12, var13, var14, var16)) {
                        return true;
                    }

                    var10 = (var10 + 1) % var6;
                    if (var9 == var10) {
                        var15 = 0;
                    }
                } else if (var4[var9] < var4[var10]) {
                    var11 = this.rh(var1[(var7 + 1) % var5], var2[(var7 + 1) % var5], var1[var7], var2[var7], var4[var9]);
                    var12 = this.rh(var1[(var8 - 1 + var5) % var5], var2[(var8 - 1 + var5) % var5], var1[var8], var2[var8], var4[var9]);
                    var13 = var3[var9];
                    var14 = this.rh(var3[(var10 - 1 + var6) % var6], var4[(var10 - 1 + var6) % var6], var3[var10], var4[var10], var4[var9]);
                    if (this.gi(var11, var12, var13, var14, var16)) {
                        return true;
                    }

                    var9 = (var9 - 1 + var6) % var6;
                    if (var9 == var10) {
                        var15 = 0;
                    }
                } else {
                    var11 = this.rh(var1[(var7 + 1) % var5], var2[(var7 + 1) % var5], var1[var7], var2[var7], var4[var10]);
                    var12 = this.rh(var1[(var8 - 1 + var5) % var5], var2[(var8 - 1 + var5) % var5], var1[var8], var2[var8], var4[var10]);
                    var13 = this.rh(var3[(var9 + 1) % var6], var4[(var9 + 1) % var6], var3[var9], var4[var9], var4[var10]);
                    var14 = var3[var10];
                    if (this.gi(var11, var12, var13, var14, var16)) {
                        return true;
                    }

                    var10 = (var10 + 1) % var6;
                    if (var9 == var10) {
                        var15 = 0;
                    }
                }
            }

            while(var15 == 2) {
                if (var4[var9] < var2[var7]) {
                    if (var4[var9] < var2[var8]) {
                        var11 = this.rh(var1[(var7 + 1) % var5], var2[(var7 + 1) % var5], var1[var7], var2[var7], var4[var9]);
                        var12 = this.rh(var1[(var8 - 1 + var5) % var5], var2[(var8 - 1 + var5) % var5], var1[var8], var2[var8], var4[var9]);
                        var13 = var3[var9];
                        if (this.vh(var11, var12, var13, var16)) {
                            return true;
                        }

                        return false;
                    }

                    var11 = this.rh(var1[(var7 + 1) % var5], var2[(var7 + 1) % var5], var1[var7], var2[var7], var2[var8]);
                    var12 = var1[var8];
                    var13 = this.rh(var3[(var9 + 1) % var6], var4[(var9 + 1) % var6], var3[var9], var4[var9], var2[var8]);
                    var14 = this.rh(var3[(var10 - 1 + var6) % var6], var4[(var10 - 1 + var6) % var6], var3[var10], var4[var10], var2[var8]);
                    if (this.gi(var11, var12, var13, var14, var16)) {
                        return true;
                    }

                    var8 = (var8 + 1) % var5;
                    if (var7 == var8) {
                        var15 = 0;
                    }
                } else if (var2[var7] < var2[var8]) {
                    var11 = var1[var7];
                    var12 = this.rh(var1[(var8 - 1 + var5) % var5], var2[(var8 - 1 + var5) % var5], var1[var8], var2[var8], var2[var7]);
                    var13 = this.rh(var3[(var9 + 1) % var6], var4[(var9 + 1) % var6], var3[var9], var4[var9], var2[var7]);
                    var14 = this.rh(var3[(var10 - 1 + var6) % var6], var4[(var10 - 1 + var6) % var6], var3[var10], var4[var10], var2[var7]);
                    if (this.gi(var11, var12, var13, var14, var16)) {
                        return true;
                    }

                    var7 = (var7 - 1 + var5) % var5;
                    if (var7 == var8) {
                        var15 = 0;
                    }
                } else {
                    var11 = this.rh(var1[(var7 + 1) % var5], var2[(var7 + 1) % var5], var1[var7], var2[var7], var2[var8]);
                    var12 = var1[var8];
                    var13 = this.rh(var3[(var9 + 1) % var6], var4[(var9 + 1) % var6], var3[var9], var4[var9], var2[var8]);
                    var14 = this.rh(var3[(var10 - 1 + var6) % var6], var4[(var10 - 1 + var6) % var6], var3[var10], var4[var10], var2[var8]);
                    if (this.gi(var11, var12, var13, var14, var16)) {
                        return true;
                    }

                    var8 = (var8 + 1) % var5;
                    if (var7 == var8) {
                        var15 = 0;
                    }
                }
            }

            if (var2[var7] < var4[var9]) {
                var11 = var1[var7];
                var13 = this.rh(var3[(var9 + 1) % var6], var4[(var9 + 1) % var6], var3[var9], var4[var9], var2[var7]);
                var14 = this.rh(var3[(var10 - 1 + var6) % var6], var4[(var10 - 1 + var6) % var6], var3[var10], var4[var10], var2[var7]);
                if (this.vh(var13, var14, var11, !var16)) {
                    return true;
                } else {
                    return false;
                }
            } else {
                var11 = this.rh(var1[(var7 + 1) % var5], var2[(var7 + 1) % var5], var1[var7], var2[var7], var4[var9]);
                var12 = this.rh(var1[(var8 - 1 + var5) % var5], var2[(var8 - 1 + var5) % var5], var1[var8], var2[var8], var4[var9]);
                var13 = var3[var9];
                if (this.vh(var11, var12, var13, var16)) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }
}
