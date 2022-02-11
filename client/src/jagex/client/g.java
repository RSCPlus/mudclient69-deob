package jagex.client;

public class g {
    protected i ne;
    int oe;
    int pe;
    boolean[] qe;
    boolean[] re;
    boolean[] se;
    boolean[] te;
    public int[] ue;
    public int[] ve;
    public int[] we;
    public int[] xe;
    boolean[] ye;
    int[] ze;
    int[] af;
    int[] bf;
    int[] cf;
    int[] df;
    int[] ef;
    int[] ff;
    String[] gf;
    String[][] hf;
    int if_;
    int jf;
    int kf;
    int lf;
    int mf = -1;
    int nf;
    int of;
    int pf;
    int qf;
    int rf;
    int sf;
    int tf;
    int uf;
    int vf;
    int wf;
    int xf;
    int yf;
    int zf;
    public boolean ag = true;
    public static boolean bg = true;
    public static int cg;
    public static int dg = 114;
    public static int eg = 114;
    public static int fg = 176;
    public static int gg;

    public g(i var1, int var2) {
        this.ne = var1;
        this.pe = var2;
        this.qe = new boolean[var2];
        this.re = new boolean[var2];
        this.se = new boolean[var2];
        this.te = new boolean[var2];
        this.ye = new boolean[var2];
        this.ue = new int[var2];
        this.ve = new int[var2];
        this.we = new int[var2];
        this.xe = new int[var2];
        this.ze = new int[var2];
        this.af = new int[var2];
        this.bf = new int[var2];
        this.cf = new int[var2];
        this.df = new int[var2];
        this.ef = new int[var2];
        this.ff = new int[var2];
        this.gf = new String[var2];
        this.hf = new String[var2][];
        this.of = this.ad(114, 114, 176);
        this.pf = this.ad(14, 14, 62);
        this.qf = this.ad(200, 208, 232);
        this.rf = this.ad(96, 129, 184);
        this.sf = this.ad(53, 95, 115);
        this.tf = this.ad(117, 142, 171);
        this.uf = this.ad(98, 122, 158);
        this.vf = this.ad(86, 100, 136);
        this.wf = this.ad(135, 146, 179);
        this.xf = this.ad(97, 112, 151);
        this.yf = this.ad(88, 102, 136);
        this.zf = this.ad(84, 93, 120);
    }

    public int ad(int var1, int var2, int var3) {
        return i.ng(dg * var1 / 114, eg * var2 / 114, fg * var3 / 176);
    }

    public void sd() {
        this.kf = 0;
    }

    public void ud(int var1, int var2, int var3, int var4) {
        this.if_ = var1;
        this.jf = var2;
        this.lf = var4;
        if (var3 != 0) {
            this.kf = var3;
        }

        int var5;
        if (var3 == 1) {
            for(var5 = 0; var5 < this.oe; ++var5) {
                if (this.qe[var5] && this.bf[var5] == 10 && this.if_ >= this.ze[var5] && this.jf >= this.af[var5] && this.if_ <= this.ze[var5] + this.cf[var5] && this.jf <= this.af[var5] + this.df[var5]) {
                    this.te[var5] = true;
                }

                if (this.qe[var5] && this.bf[var5] == 14 && this.if_ >= this.ze[var5] && this.jf >= this.af[var5] && this.if_ <= this.ze[var5] + this.cf[var5] && this.jf <= this.af[var5] + this.df[var5]) {
                    this.we[var5] = 1 - this.we[var5];
                }
            }
        }

        if (var4 == 1) {
            ++this.nf;
        } else {
            this.nf = 0;
        }

        if (var3 == 1 || this.nf > 20) {
            for(var5 = 0; var5 < this.oe; ++var5) {
                if (this.qe[var5] && this.bf[var5] == 15 && this.if_ >= this.ze[var5] && this.jf >= this.af[var5] && this.if_ <= this.ze[var5] + this.cf[var5] && this.jf <= this.af[var5] + this.df[var5]) {
                    this.te[var5] = true;
                }
            }

            this.nf -= 5;
        }

    }

    public boolean wd(int var1) {
        if (this.qe[var1] && this.te[var1]) {
            this.te[var1] = false;
            return true;
        } else {
            return false;
        }
    }

    public void td(int var1) {
        if (var1 != 0) {
            if (this.mf != -1 && this.gf[this.mf] != null && this.qe[this.mf]) {
                int var2 = this.gf[this.mf].length();
                if (var1 == 8 && var2 > 0) {
                    this.gf[this.mf] = this.gf[this.mf].substring(0, var2 - 1);
                }

                if ((var1 == 10 || var1 == 13) && var2 > 0) {
                    this.te[this.mf] = true;
                }

                String var3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
                if (var2 < this.ef[this.mf]) {
                    for(int var4 = 0; var4 < var3.length(); ++var4) {
                        if (var1 == var3.charAt(var4)) {
                            StringBuffer var10000 = new StringBuffer(String.valueOf(this.gf[this.mf]));
                            String[] var5 = this.gf;
                            int var6 = this.mf;
                            var5[var6] = var10000.append((char)var1).toString();
                        }
                    }
                }

                if (var1 == 9) {
                    while(true) {
                        this.mf = (this.mf + 1) % this.oe;
                        if (this.bf[this.mf] == 5) {
                            break;
                        }

                        if (this.bf[this.mf] == 6) {
                            return;
                        }
                    }
                }
            }

        }
    }

    public void hc() {
        for(int var1 = 0; var1 < this.oe; ++var1) {
            if (this.qe[var1]) {
                if (this.bf[var1] == 0) {
                    this.kd(var1, this.ze[var1], this.af[var1], this.gf[var1], this.ff[var1]);
                } else if (this.bf[var1] == 1) {
                    this.kd(var1, this.ze[var1] - this.ne.hf(this.gf[var1], this.ff[var1]) / 2, this.af[var1], this.gf[var1], this.ff[var1]);
                } else if (this.bf[var1] == 2) {
                    this.ld(this.ze[var1], this.af[var1], this.cf[var1], this.df[var1]);
                } else if (this.bf[var1] == 3) {
                    this.yc(this.ze[var1], this.af[var1], this.cf[var1]);
                } else if (this.bf[var1] == 4) {
                    this.gd(var1, this.ze[var1], this.af[var1], this.cf[var1], this.df[var1], this.ff[var1], this.hf[var1], this.ve[var1], this.ue[var1]);
                } else if (this.bf[var1] != 5 && this.bf[var1] != 6) {
                    if (this.bf[var1] == 7) {
                        this.rc(var1, this.ze[var1], this.af[var1], this.ff[var1], this.hf[var1]);
                    } else if (this.bf[var1] == 8) {
                        this.bc(var1, this.ze[var1], this.af[var1], this.ff[var1], this.hf[var1]);
                    } else if (this.bf[var1] == 9) {
                        this.fc(var1, this.ze[var1], this.af[var1], this.cf[var1], this.df[var1], this.ff[var1], this.hf[var1], this.ve[var1], this.ue[var1]);
                    } else if (this.bf[var1] == 11) {
                        this.jd(this.ze[var1], this.af[var1], this.cf[var1], this.df[var1]);
                    } else if (this.bf[var1] == 12) {
                        this.bd(this.ze[var1], this.af[var1], this.ff[var1]);
                    } else if (this.bf[var1] == 14) {
                        this.fd(var1, this.ze[var1], this.af[var1], this.cf[var1], this.df[var1]);
                    }
                } else {
                    this.uc(var1, this.ze[var1], this.af[var1], this.cf[var1], this.df[var1], this.gf[var1], this.ff[var1]);
                }
            }
        }

        this.kf = 0;
    }

    protected void fd(int var1, int var2, int var3, int var4, int var5) {
        this.ne.bg(var2, var3, var4, var5, 16777215);
        this.ne.ug(var2, var3, var4, this.wf);
        this.ne.zg(var2, var3, var5, this.wf);
        this.ne.ug(var2, var3 + var5 - 1, var4, this.zf);
        this.ne.zg(var2 + var4 - 1, var3, var5, this.zf);
        if (this.we[var1] == 1) {
            for(int var6 = 0; var6 < var5; ++var6) {
                this.ne.ug(var2 + var6, var3 + var6, 1, 0);
                this.ne.ug(var2 + var4 - 1 - var6, var3 + var6, 1, 0);
            }
        }

    }

    protected void kd(int var1, int var2, int var3, String var4, int var5) {
        int var6 = var3 + this.ne.qg(var5) / 3;
        this.md(var1, var2, var6, var4, var5);
    }

    protected void md(int var1, int var2, int var3, String var4, int var5) {
        int var6;
        if (this.ye[var1]) {
            var6 = 16777215;
        } else {
            var6 = 0;
        }

        this.ne.qf(var4, var2, var3, var5, var6);
    }

    protected void uc(int var1, int var2, int var3, int var4, int var5, String var6, int var7) {
        int var8;
        if (this.se[var1]) {
            var8 = var6.length();
            var6 = "";

            for(int var9 = 0; var9 < var8; ++var9) {
                var6 = var6 + "X";
            }
        }

        if (this.bf[var1] == 5) {
            if (this.kf == 1 && this.if_ >= var2 && this.jf >= var3 - var5 / 2 && this.if_ <= var2 + var4 && this.jf <= var3 + var5 / 2) {
                this.mf = var1;
            }
        } else if (this.bf[var1] == 6) {
            if (this.kf == 1 && this.if_ >= var2 - var4 / 2 && this.jf >= var3 - var5 / 2 && this.if_ <= var2 + var4 / 2 && this.jf <= var3 + var5 / 2) {
                this.mf = var1;
            }

            var2 -= this.ne.hf(var6, var7) / 2;
        }

        if (this.mf == var1) {
            var6 = var6 + "*";
        }

        var8 = var3 + this.ne.qg(var7) / 3;
        this.md(var1, var2, var8, var6, var7);
    }

    public void ld(int var1, int var2, int var3, int var4) {
        this.ne.vf(var1, var2, var1 + var3, var2 + var4);
        this.ne.jg(var1, var2, var3, var4, this.zf, this.wf);
        if (bg) {
            for(int var5 = var1 - (var2 & 63); var5 < var1 + var3; var5 += 128) {
                for(int var6 = var2 - (var2 & 31); var6 < var2 + var4; var6 += 128) {
                    this.ne.tg(var5, var6, 6 + cg, 128);
                }
            }
        }

        this.ne.ug(var1, var2, var3, this.wf);
        this.ne.ug(var1 + 1, var2 + 1, var3 - 2, this.wf);
        this.ne.ug(var1 + 2, var2 + 2, var3 - 4, this.xf);
        this.ne.zg(var1, var2, var4, this.wf);
        this.ne.zg(var1 + 1, var2 + 1, var4 - 2, this.wf);
        this.ne.zg(var1 + 2, var2 + 2, var4 - 4, this.xf);
        this.ne.ug(var1, var2 + var4 - 1, var3, this.zf);
        this.ne.ug(var1 + 1, var2 + var4 - 2, var3 - 2, this.zf);
        this.ne.ug(var1 + 2, var2 + var4 - 3, var3 - 4, this.yf);
        this.ne.zg(var1 + var3 - 1, var2, var4, this.zf);
        this.ne.zg(var1 + var3 - 2, var2 + 1, var4 - 2, this.zf);
        this.ne.zg(var1 + var3 - 3, var2 + 2, var4 - 4, this.yf);
        this.ne.wf();
    }

    public void jd(int var1, int var2, int var3, int var4) {
        this.ne.bg(var1, var2, var3, var4, 0);
        this.ne.uf(var1, var2, var3, var4, this.tf);
        this.ne.uf(var1 + 1, var2 + 1, var3 - 2, var4 - 2, this.uf);
        this.ne.uf(var1 + 2, var2 + 2, var3 - 4, var4 - 4, this.vf);
        this.ne.bh(var1, var2, 2 + cg);
        this.ne.bh(var1 + var3 - 7, var2, 3 + cg);
        this.ne.bh(var1, var2 + var4 - 7, 4 + cg);
        this.ne.bh(var1 + var3 - 7, var2 + var4 - 7, 5 + cg);
    }

    protected void bd(int var1, int var2, int var3) {
        this.ne.bh(var1, var2, var3);
    }

    protected void yc(int var1, int var2, int var3) {
        this.ne.ug(var1, var2, var3, 0);
    }

    protected void gd(int var1, int var2, int var3, int var4, int var5, int var6, String[] var7, int var8, int var9) {
        int var10 = var5 / this.ne.qg(var6);
        if (var9 > var8 - var10) {
            var9 = var8 - var10;
        }

        if (var9 < 0) {
            var9 = 0;
        }

        this.ue[var1] = var9;
        int var11;
        int var12;
        int var13;
        if (var10 < var8) {
            var11 = var2 + var4 - 12;
            var12 = (var5 - 27) * var10 / var8;
            if (var12 < 6) {
                var12 = 6;
            }

            var13 = (var5 - 27 - var12) * var9 / (var8 - var10);
            if (this.lf == 1 && this.if_ >= var11 && this.if_ <= var11 + 12) {
                if (this.jf > var3 && this.jf < var3 + 12 && var9 > 0) {
                    --var9;
                }

                if (this.jf > var3 + var5 - 12 && this.jf < var3 + var5 && var9 < var8 - var10) {
                    ++var9;
                }

                this.ue[var1] = var9;
            }

            if (this.lf == 1 && (this.if_ >= var11 && this.if_ <= var11 + 12 || this.if_ >= var11 - 12 && this.if_ <= var11 + 24 && this.re[var1])) {
                if (this.jf > var3 + 12 && this.jf < var3 + var5 - 12) {
                    this.re[var1] = true;
                    int var14 = this.jf - var3 - 12 - var12 / 2;
                    var9 = var14 * var8 / (var5 - 24);
                    if (var9 > var8 - var10) {
                        var9 = var8 - var10;
                    }

                    if (var9 < 0) {
                        var9 = 0;
                    }

                    this.ue[var1] = var9;
                }
            } else {
                this.re[var1] = false;
            }

            var13 = (var5 - 27 - var12) * var9 / (var8 - var10);
            this.rd(var2, var3, var4, var5, var13, var12);
        }

        var11 = var5 - var10 * this.ne.qg(var6);
        var12 = var3 + this.ne.qg(var6) * 5 / 6 + var11 / 2;

        for(var13 = var9; var13 < var8; ++var13) {
            this.md(var1, var2 + 2, var12, var7[var13], var6);
            var12 += this.ne.qg(var6) - gg;
            if (var12 >= var3 + var5) {
                return;
            }
        }

    }

    protected void rd(int var1, int var2, int var3, int var4, int var5, int var6) {
        int var7 = var1 + var3 - 12;
        this.ne.uf(var7, var2, 12, var4, 0);
        this.ne.bh(var7 + 1, var2 + 1, cg);
        this.ne.bh(var7 + 1, var2 + var4 - 12, 1 + cg);
        this.ne.ug(var7, var2 + 13, 12, 0);
        this.ne.ug(var7, var2 + var4 - 13, 12, 0);
        this.ne.jg(var7 + 1, var2 + 14, 11, var4 - 27, this.of, this.pf);
        this.ne.bg(var7 + 3, var5 + var2 + 14, 7, var6, this.rf);
        this.ne.zg(var7 + 2, var5 + var2 + 14, var6, this.qf);
        this.ne.zg(var7 + 2 + 8, var5 + var2 + 14, var6, this.sf);
    }

    protected void rc(int var1, int var2, int var3, int var4, String[] var5) {
        int var6 = 0;
        int var7 = var5.length;

        for(int var8 = 0; var8 < var7; ++var8) {
            var6 += this.ne.hf(var5[var8], var4);
            if (var8 < var7 - 1) {
                var6 += this.ne.hf("  ", var4);
            }
        }

        int var9 = var2 - var6 / 2;
        int var10 = var3 + this.ne.qg(var4) / 3;

        for(int var11 = 0; var11 < var7; ++var11) {
            int var12;
            if (this.ye[var1]) {
                var12 = 16777215;
            } else {
                var12 = 0;
            }

            if (this.if_ >= var9 && this.if_ <= var9 + this.ne.hf(var5[var11], var4) && this.jf <= var10 && this.jf > var10 - this.ne.qg(var4)) {
                if (this.ye[var1]) {
                    var12 = 8421504;
                } else {
                    var12 = 16777215;
                }

                if (this.kf == 1) {
                    this.we[var1] = var11;
                    this.te[var1] = true;
                }
            }

            if (this.we[var1] == var11) {
                if (this.ye[var1]) {
                    var12 = 16711680;
                } else {
                    var12 = 12582912;
                }
            }

            this.ne.qf(var5[var11], var9, var10, var4, var12);
            var9 += this.ne.hf(var5[var11] + "  ", var4);
        }

    }

    protected void bc(int var1, int var2, int var3, int var4, String[] var5) {
        int var6 = var5.length;
        int var7 = var3 - this.ne.qg(var4) * (var6 - 1) / 2;

        for(int var8 = 0; var8 < var6; ++var8) {
            int var9;
            if (this.ye[var1]) {
                var9 = 16777215;
            } else {
                var9 = 0;
            }

            int var10 = this.ne.hf(var5[var8], var4);
            if (this.if_ >= var2 - var10 / 2 && this.if_ <= var2 + var10 / 2 && this.jf - 2 <= var7 && this.jf - 2 > var7 - this.ne.qg(var4)) {
                if (this.ye[var1]) {
                    var9 = 8421504;
                } else {
                    var9 = 16777215;
                }

                if (this.kf == 1) {
                    this.we[var1] = var8;
                    this.te[var1] = true;
                }
            }

            if (this.we[var1] == var8) {
                if (this.ye[var1]) {
                    var9 = 16711680;
                } else {
                    var9 = 12582912;
                }
            }

            this.ne.qf(var5[var8], var2 - var10 / 2, var7, var4, var9);
            var7 += this.ne.qg(var4);
        }

    }

    protected void fc(int var1, int var2, int var3, int var4, int var5, int var6, String[] var7, int var8, int var9) {
        int var10 = var5 / this.ne.qg(var6);
        int var11;
        int var12;
        int var13;
        int var14;
        if (var10 < var8) {
            var11 = var2 + var4 - 12;
            var12 = (var5 - 27) * var10 / var8;
            if (var12 < 6) {
                var12 = 6;
            }

            var13 = (var5 - 27 - var12) * var9 / (var8 - var10);
            if (this.lf == 1 && this.if_ >= var11 && this.if_ <= var11 + 12) {
                if (this.jf > var3 && this.jf < var3 + 12 && var9 > 0) {
                    --var9;
                }

                if (this.jf > var3 + var5 - 12 && this.jf < var3 + var5 && var9 < var8 - var10) {
                    ++var9;
                }

                this.ue[var1] = var9;
            }

            if (this.lf != 1 || (this.if_ < var11 || this.if_ > var11 + 12) && (this.if_ < var11 - 12 || this.if_ > var11 + 24 || !this.re[var1])) {
                this.re[var1] = false;
            } else if (this.jf > var3 + 12 && this.jf < var3 + var5 - 12) {
                this.re[var1] = true;
                var14 = this.jf - var3 - 12 - var12 / 2;
                var9 = var14 * var8 / (var5 - 24);
                if (var9 < 0) {
                    var9 = 0;
                }

                if (var9 > var8 - var10) {
                    var9 = var8 - var10;
                }

                this.ue[var1] = var9;
            }

            var13 = (var5 - 27 - var12) * var9 / (var8 - var10);
            this.rd(var2, var3, var4, var5, var13, var12);
        } else {
            var9 = 0;
            this.ue[var1] = 0;
        }

        this.xe[var1] = -1;
        var11 = var5 - var10 * this.ne.qg(var6);
        var12 = var3 + this.ne.qg(var6) * 5 / 6 + var11 / 2;

        for(var13 = var9; var13 < var8; ++var13) {
            if (this.ye[var1]) {
                var14 = 16777215;
            } else {
                var14 = 0;
            }

            if (this.if_ >= var2 + 2 && this.if_ <= var2 + 2 + this.ne.hf(var7[var13], var6) && this.jf - 2 <= var12 && this.jf - 2 > var12 - this.ne.qg(var6)) {
                if (this.ye[var1]) {
                    var14 = 8421504;
                } else {
                    var14 = 16777215;
                }

                this.xe[var1] = var13;
                if (this.kf == 1) {
                    this.we[var1] = var13;
                    this.te[var1] = true;
                }
            }

            if (this.we[var1] == var13 && this.ag) {
                var14 = 16711680;
            }

            this.ne.qf(var7[var13], var2 + 2, var12, var6, var14);
            var12 += this.ne.qg(var6);
            if (var12 >= var3 + var5) {
                return;
            }
        }

    }

    public int lc(int var1, int var2, String var3, int var4, boolean var5) {
        this.bf[this.oe] = 0;
        this.qe[this.oe] = true;
        this.te[this.oe] = false;
        this.ff[this.oe] = var4;
        this.ye[this.oe] = var5;
        this.ze[this.oe] = var1;
        this.af[this.oe] = var2;
        this.gf[this.oe] = var3;
        return this.oe++;
    }

    public int nd(int var1, int var2, String var3, int var4, boolean var5) {
        this.bf[this.oe] = 1;
        this.qe[this.oe] = true;
        this.te[this.oe] = false;
        this.ff[this.oe] = var4;
        this.ye[this.oe] = var5;
        this.ze[this.oe] = var1;
        this.af[this.oe] = var2;
        this.gf[this.oe] = var3;
        return this.oe++;
    }

    public int ed(int var1, int var2, int var3, int var4) {
        this.bf[this.oe] = 2;
        this.qe[this.oe] = true;
        this.te[this.oe] = false;
        this.ze[this.oe] = var1 - var3 / 2;
        this.af[this.oe] = var2 - var4 / 2;
        this.cf[this.oe] = var3;
        this.df[this.oe] = var4;
        return this.oe++;
    }

    public int ic(int var1, int var2, int var3, int var4) {
        this.bf[this.oe] = 11;
        this.qe[this.oe] = true;
        this.te[this.oe] = false;
        this.ze[this.oe] = var1;
        this.af[this.oe] = var2;
        this.cf[this.oe] = var3;
        this.df[this.oe] = var4;
        return this.oe++;
    }

    public int kc(int var1, int var2, int var3, int var4) {
        this.bf[this.oe] = 11;
        this.qe[this.oe] = true;
        this.te[this.oe] = false;
        this.ze[this.oe] = var1 - var3 / 2;
        this.af[this.oe] = var2 - var4 / 2;
        this.cf[this.oe] = var3;
        this.df[this.oe] = var4;
        return this.oe++;
    }

    public int mc(int var1, int var2, int var3) {
        int var4 = this.ne.dk[var3];
        int var5 = this.ne.ek[var3];
        this.bf[this.oe] = 12;
        this.qe[this.oe] = true;
        this.te[this.oe] = false;
        this.ze[this.oe] = var1 - var4 / 2;
        this.af[this.oe] = var2 - var5 / 2;
        this.cf[this.oe] = var4;
        this.df[this.oe] = var5;
        this.ff[this.oe] = var3;
        return this.oe++;
    }

    public int dc(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
        this.bf[this.oe] = 4;
        this.qe[this.oe] = true;
        this.te[this.oe] = false;
        this.ze[this.oe] = var1;
        this.af[this.oe] = var2;
        this.cf[this.oe] = var3;
        this.df[this.oe] = var4;
        this.ye[this.oe] = var7;
        this.ff[this.oe] = var5;
        this.ef[this.oe] = var6;
        this.ve[this.oe] = 0;
        this.ue[this.oe] = 0;
        this.hf[this.oe] = new String[var6];
        return this.oe++;
    }

    public int ec(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
        this.bf[this.oe] = 5;
        this.qe[this.oe] = true;
        this.se[this.oe] = var7;
        this.te[this.oe] = false;
        this.ff[this.oe] = var5;
        this.ye[this.oe] = var8;
        this.ze[this.oe] = var1;
        this.af[this.oe] = var2;
        this.cf[this.oe] = var3;
        this.df[this.oe] = var4;
        this.ef[this.oe] = var6;
        this.gf[this.oe] = "";
        return this.oe++;
    }

    public int cd(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
        this.bf[this.oe] = 6;
        this.qe[this.oe] = true;
        this.se[this.oe] = var7;
        this.te[this.oe] = false;
        this.ff[this.oe] = var5;
        this.ye[this.oe] = var8;
        this.ze[this.oe] = var1;
        this.af[this.oe] = var2;
        this.cf[this.oe] = var3;
        this.df[this.oe] = var4;
        this.ef[this.oe] = var6;
        this.gf[this.oe] = "";
        return this.oe++;
    }

    public int wc(int var1, int var2, String[] var3, int var4, boolean var5) {
        this.bf[this.oe] = 7;
        this.qe[this.oe] = true;
        this.te[this.oe] = false;
        this.ff[this.oe] = var4;
        this.ye[this.oe] = var5;
        this.ze[this.oe] = var1;
        this.af[this.oe] = var2;
        this.hf[this.oe] = var3;
        this.we[this.oe] = 0;
        return this.oe++;
    }

    public int cc(int var1, int var2, String[] var3, int var4, boolean var5) {
        this.bf[this.oe] = 8;
        this.qe[this.oe] = true;
        this.te[this.oe] = false;
        this.ff[this.oe] = var4;
        this.ye[this.oe] = var5;
        this.ze[this.oe] = var1;
        this.af[this.oe] = var2;
        this.hf[this.oe] = var3;
        this.we[this.oe] = 0;
        return this.oe++;
    }

    public int tc(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
        this.bf[this.oe] = 9;
        this.qe[this.oe] = true;
        this.te[this.oe] = false;
        this.ff[this.oe] = var5;
        this.ye[this.oe] = var7;
        this.ze[this.oe] = var1;
        this.af[this.oe] = var2;
        this.cf[this.oe] = var3;
        this.df[this.oe] = var4;
        this.ef[this.oe] = var6;
        this.hf[this.oe] = new String[var6];
        this.ve[this.oe] = 0;
        this.ue[this.oe] = 0;
        this.we[this.oe] = -1;
        this.xe[this.oe] = -1;
        return this.oe++;
    }

    public int pc(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
        this.bf[this.oe] = 9;
        this.qe[this.oe] = true;
        this.te[this.oe] = false;
        this.ff[this.oe] = var5;
        this.ye[this.oe] = var7;
        this.ze[this.oe] = var1 - var3 / 2;
        this.af[this.oe] = var2 - var4 / 2;
        this.cf[this.oe] = var3;
        this.df[this.oe] = var4;
        this.ef[this.oe] = var6;
        this.hf[this.oe] = new String[var6];
        this.ve[this.oe] = 0;
        this.ue[this.oe] = 0;
        this.we[this.oe] = -1;
        return this.oe++;
    }

    public int qd(int var1, int var2, int var3, int var4) {
        this.bf[this.oe] = 10;
        this.qe[this.oe] = true;
        this.te[this.oe] = false;
        this.ze[this.oe] = var1 - var3 / 2;
        this.af[this.oe] = var2 - var4 / 2;
        this.cf[this.oe] = var3;
        this.df[this.oe] = var4;
        return this.oe++;
    }

    public int pd(int var1, int var2, int var3) {
        this.bf[this.oe] = 14;
        this.qe[this.oe] = true;
        this.te[this.oe] = false;
        this.ze[this.oe] = var1;
        this.af[this.oe] = var2;
        this.cf[this.oe] = var3;
        this.df[this.oe] = var3;
        return this.oe++;
    }

    public int vc(int var1, int var2, int var3) {
        this.bf[this.oe] = 14;
        this.qe[this.oe] = true;
        this.te[this.oe] = false;
        this.ze[this.oe] = var1 - var3 / 2;
        this.af[this.oe] = var2 - var3 / 2;
        this.cf[this.oe] = var3;
        this.df[this.oe] = var3;
        return this.oe++;
    }

    public int oc(int var1, int var2, int var3, int var4) {
        this.bf[this.oe] = 15;
        this.qe[this.oe] = true;
        this.te[this.oe] = false;
        this.ze[this.oe] = var1 - var3 / 2;
        this.af[this.oe] = var2 - var4 / 2;
        this.cf[this.oe] = var3;
        this.df[this.oe] = var4;
        return this.oe++;
    }

    public void nc(int var1) {
        this.ve[var1] = 0;
    }

    public void dd(int var1) {
        this.ue[var1] = 0;
        this.xe[var1] = -1;
    }

    public void hd(int var1, int var2, String var3) {
        this.hf[var1][var2] = var3;
        if (var2 + 1 > this.ve[var1]) {
            this.ve[var1] = var2 + 1;
        }

    }

    public void gc(int var1, String var2, boolean var3) {
        int var4 = this.ve[var1]++;
        if (var4 >= this.ef[var1]) {
            --var4;
            --this.ve[var1];

            for(int var5 = 0; var5 < var4; ++var5) {
                this.hf[var1][var5] = this.hf[var1][var5 + 1];
            }
        }

        this.hf[var1][var4] = var2;
        if (var3) {
            this.ue[var1] = 999999;
        }

    }

    public void od(int var1, String var2) {
        this.gf[var1] = var2;
    }

    public String sc(int var1) {
        return this.gf[var1] == null ? "null" : this.gf[var1];
    }

    public void id(int var1) {
        this.qe[var1] = true;
    }

    public void vd(int var1) {
        this.qe[var1] = false;
    }

    public void qc(int var1) {
        this.mf = var1;
    }

    public int xc(int var1) {
        return this.we[var1];
    }

    public int jc(int var1) {
        int var2 = this.xe[var1];
        return var2;
    }

    public void zc(int var1, int var2) {
        this.we[var1] = var2;
    }
}
