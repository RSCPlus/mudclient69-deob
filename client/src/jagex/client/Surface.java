package jagex.client;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;

public class Surface implements ImageProducer, ImageObserver {
    public int qj;
    public int rj;
    public int sj;
    public int tj;
    public int uj;
    ColorModel vj;
    public int[] wj;
    ImageConsumer xj;
    private Component yj;
    public Image zj;
    private int[][] ak;
    private byte[][] bk;
    private int[][] ck;
    public int[] dk;
    public int[] ek;
    public int[] fk;
    public int[] gk;
    public int[] hk;
    public int[] ik;
    public boolean[] jk;
    private boolean kk = true;
    private int lk;
    private int mk;
    private int nk;
    private int ok;
    public boolean pk = false;
    static byte[][] qk = new byte[50][];
    static int[] rk;
    static int sk;
    public boolean tk = false;
    int[] uk;
    int[] vk;
    int[] wk;
    int[] xk;
    int[] yk;
    int[] zk;
    int[] al;
    public static final int bl = 0;
    public static final int cl = 16777215;
    public static final int dl = 16711680;
    public static final int el = 12582912;
    public static final int fl = 65280;
    public static final int gl = 255;
    public static final int hl = 16776960;
    public static final int il = 65535;
    public static final int jl = 16711935;
    public static final int kl = 12632256;
    public static final int ll = 8421504;
    public static final int ml = 4210752;
    public static final int nl = 0;
    public static final int ol = 1;
    public static final int pl = 2;
    public static final int ql = 3;
    public static final int rl = 4;
    public static final int sl = 5;
    public static final int tl = 6;
    public static final int ul = 7;

    public Surface(int var1, int var2, int var3, Component var4) {
        this.yj = var4;
        this.mk = var2;
        this.ok = var1;
        this.tj = this.qj = var1;
        this.uj = this.rj = var2;
        this.sj = var1 * var2;
        this.wj = new int[var1 * var2];
        this.ak = new int[var3][];
        this.jk = new boolean[var3];
        this.bk = new byte[var3][];
        this.ck = new int[var3][];
        this.dk = new int[var3];
        this.ek = new int[var3];
        this.hk = new int[var3];
        this.ik = new int[var3];
        this.fk = new int[var3];
        this.gk = new int[var3];
        if (var1 > 1 && var2 > 1 && var4 != null) {
            this.vj = new DirectColorModel(32, 16711680, 65280, 255);
            int var5 = this.qj * this.rj;

            for(int var6 = 0; var6 < var5; ++var6) {
                this.wj[var6] = 0;
            }

            this.zj = var4.createImage(this);
            this.yf();
            var4.prepareImage(this.zj, var4);
            this.yf();
            var4.prepareImage(this.zj, var4);
            this.yf();
            var4.prepareImage(this.zj, var4);
        }

    }

    public synchronized void ah(int var1, int var2) {
        if (this.qj > this.tj) {
            this.qj = this.tj;
        }

        if (this.rj > this.uj) {
            this.rj = this.uj;
        }

        this.qj = var1;
        this.rj = var2;
        this.sj = var1 * var2;
    }

    public synchronized void addConsumer(ImageConsumer var1) {
        this.xj = var1;
        var1.setDimensions(this.qj, this.rj);
        var1.setProperties((Hashtable)null);
        var1.setColorModel(this.vj);
        var1.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer var1) {
        return this.xj == var1;
    }

    public synchronized void removeConsumer(ImageConsumer var1) {
        if (this.xj == var1) {
            this.xj = null;
        }

    }

    public void startProduction(ImageConsumer var1) {
        this.addConsumer(var1);
    }

    public void requestTopDownLeftRightResend(ImageConsumer var1) {
        System.out.println("TDLR");
    }

    public synchronized void yf() {
        if (this.xj != null) {
            this.xj.setPixels(0, 0, this.qj, this.rj, this.vj, this.wj, 0, this.qj);
            this.xj.imageComplete(2);
        }
    }

    public void vf(int var1, int var2, int var3, int var4) {
        if (var1 < 0) {
            var1 = 0;
        }

        if (var2 < 0) {
            var2 = 0;
        }

        if (var3 > this.qj) {
            var3 = this.qj;
        }

        if (var4 > this.rj) {
            var4 = this.rj;
        }

        this.nk = var1;
        this.lk = var2;
        this.ok = var3;
        this.mk = var4;
    }

    public void wf() {
        this.nk = 0;
        this.lk = 0;
        this.ok = this.qj;
        this.mk = this.rj;
    }

    public void nf(Graphics var1, int var2, int var3) {
        this.yf();
        var1.drawImage(this.zj, var2, var3, this);
    }

    public void pf() {
        int var1 = this.qj * this.rj;
        int var2;
        if (!this.pk) {
            for(var2 = 0; var2 < var1; ++var2) {
                this.wj[var2] = 0;
            }

        } else {
            var2 = 0;

            for(int var3 = -this.rj; var3 < 0; var3 += 2) {
                for(int var4 = -this.qj; var4 < 0; ++var4) {
                    this.wj[var2++] = 0;
                }

                var2 += this.qj;
            }

        }
    }

    public void cg(int var1, int var2, int var3, int var4, int var5) {
        int var6 = 256 - var5;
        int var7 = (var4 >> 16 & 255) * var5;
        int var8 = (var4 >> 8 & 255) * var5;
        int var9 = (var4 & 255) * var5;
        int var13 = var2 - var3;
        if (var13 < 0) {
            var13 = 0;
        }

        int var14 = var2 + var3;
        if (var14 >= this.rj) {
            var14 = this.rj - 1;
        }

        byte var15 = 1;
        if (this.pk) {
            var15 = 2;
            if ((var13 & 1) != 0) {
                ++var13;
            }
        }

        for(int var16 = var13; var16 <= var14; var16 += var15) {
            int var17 = var16 - var2;
            int var18 = (int)Math.sqrt((double)(var3 * var3 - var17 * var17));
            int var19 = var1 - var18;
            if (var19 < 0) {
                var19 = 0;
            }

            int var20 = var1 + var18;
            if (var20 >= this.qj) {
                var20 = this.qj - 1;
            }

            int var21 = var19 + var16 * this.qj;

            for(int var22 = var19; var22 <= var20; ++var22) {
                int var10 = (this.wj[var21] >> 16 & 255) * var6;
                int var11 = (this.wj[var21] >> 8 & 255) * var6;
                int var12 = (this.wj[var21] & 255) * var6;
                int var23 = (var7 + var10 >> 8 << 16) + (var8 + var11 >> 8 << 8) + (var9 + var12 >> 8);
                this.wj[var21++] = var23;
            }
        }

    }

    public void xf(int var1, int var2, int var3, int var4, int var5, int var6) {
        if (var1 < this.nk) {
            var3 -= this.nk - var1;
            var1 = this.nk;
        }

        if (var2 < this.lk) {
            var4 -= this.lk - var2;
            var2 = this.lk;
        }

        if (var1 + var3 > this.ok) {
            var3 = this.ok - var1;
        }

        if (var2 + var4 > this.mk) {
            var4 = this.mk - var2;
        }

        int var7 = 256 - var6;
        int var8 = (var5 >> 16 & 255) * var6;
        int var9 = (var5 >> 8 & 255) * var6;
        int var10 = (var5 & 255) * var6;
        int var14 = this.qj - var3;
        byte var15 = 1;
        if (this.pk) {
            var15 = 2;
            var14 += this.qj;
            if ((var2 & 1) != 0) {
                ++var2;
                --var4;
            }
        }

        int var16 = var1 + var2 * this.qj;

        for(int var17 = 0; var17 < var4; var17 += var15) {
            for(int var18 = -var3; var18 < 0; ++var18) {
                int var11 = (this.wj[var16] >> 16 & 255) * var7;
                int var12 = (this.wj[var16] >> 8 & 255) * var7;
                int var13 = (this.wj[var16] & 255) * var7;
                int var19 = (var8 + var11 >> 8 << 16) + (var9 + var12 >> 8 << 8) + (var10 + var13 >> 8);
                this.wj[var16++] = var19;
            }

            var16 += var14;
        }

    }

    public void jg(int var1, int var2, int var3, int var4, int var5, int var6) {
        if (var1 < this.nk) {
            var3 -= this.nk - var1;
            var1 = this.nk;
        }

        if (var1 + var3 > this.ok) {
            var3 = this.ok - var1;
        }

        int var7 = var6 >> 16 & 255;
        int var8 = var6 >> 8 & 255;
        int var9 = var6 & 255;
        int var10 = var5 >> 16 & 255;
        int var11 = var5 >> 8 & 255;
        int var12 = var5 & 255;
        int var13 = this.qj - var3;
        byte var14 = 1;
        if (this.pk) {
            var14 = 2;
            var13 += this.qj;
            if ((var2 & 1) != 0) {
                ++var2;
                --var4;
            }
        }

        int var15 = var1 + var2 * this.qj;

        for(int var16 = 0; var16 < var4; var16 += var14) {
            if (var16 + var2 >= this.lk && var16 + var2 < this.mk) {
                int var17 = ((var7 * var16 + var10 * (var4 - var16)) / var4 << 16) + ((var8 * var16 + var11 * (var4 - var16)) / var4 << 8) + (var9 * var16 + var12 * (var4 - var16)) / var4;

                for(int var18 = -var3; var18 < 0; ++var18) {
                    this.wj[var15++] = var17;
                }

                var15 += var13;
            } else {
                var15 += this.qj;
            }
        }

    }

    public void drawBox(int var1, int var2, int var3, int var4, int var5) {
        if (var1 < this.nk) {
            var3 -= this.nk - var1;
            var1 = this.nk;
        }

        if (var2 < this.lk) {
            var4 -= this.lk - var2;
            var2 = this.lk;
        }

        if (var1 + var3 > this.ok) {
            var3 = this.ok - var1;
        }

        if (var2 + var4 > this.mk) {
            var4 = this.mk - var2;
        }

        int var6 = this.qj - var3;
        byte var7 = 1;
        if (this.pk) {
            var7 = 2;
            var6 += this.qj;
            if ((var2 & 1) != 0) {
                ++var2;
                --var4;
            }
        }

        int var8 = var1 + var2 * this.qj;

        for(int var9 = -var4; var9 < 0; var9 += var7) {
            for(int var10 = -var3; var10 < 0; ++var10) {
                this.wj[var8++] = var5;
            }

            var8 += var6;
        }

    }

    public void uf(int var1, int var2, int var3, int var4, int var5) {
        this.ug(var1, var2, var3, var5);
        this.ug(var1, var2 + var4 - 1, var3, var5);
        this.zg(var1, var2, var4, var5);
        this.zg(var1 + var3 - 1, var2, var4, var5);
    }

    public void ug(int var1, int var2, int var3, int var4) {
        if (var2 >= this.lk && var2 < this.mk) {
            if (var1 < this.nk) {
                var3 -= this.nk - var1;
                var1 = this.nk;
            }

            if (var1 + var3 > this.ok) {
                var3 = this.ok - var1;
            }

            int var5 = var1 + var2 * this.qj;

            for(int var6 = 0; var6 < var3; ++var6) {
                this.wj[var5 + var6] = var4;
            }

        }
    }

    public void zg(int var1, int var2, int var3, int var4) {
        if (var1 >= this.nk && var1 < this.ok) {
            if (var2 < this.lk) {
                var3 -= this.lk - var2;
                var2 = this.lk;
            }

            if (var2 + var3 > this.ok) {
                var3 = this.mk - var2;
            }

            int var5 = var1 + var2 * this.qj;

            for(int var6 = 0; var6 < var3; ++var6) {
                this.wj[var5 + var6 * this.qj] = var4;
            }

        }
    }

    public void og(int var1, int var2, int var3) {
        if (var1 >= this.nk && var2 >= this.lk && var1 < this.ok && var2 < this.mk) {
            this.wj[var1 + var2 * this.qj] = var3;
        }
    }

    public void fade2black() {
        int var3 = this.qj * this.rj;

        for(int var2 = 0; var2 < var3; ++var2) {
            int var1 = this.wj[var2] & 16777215;
            this.wj[var2] = (var1 >>> 1 & 8355711) + (var1 >>> 2 & 4144959) + (var1 >>> 3 & 2039583) + (var1 >>> 4 & 986895);
        }

    }

    public void drawLineAlpha(int var1, int var2, int var3, int var4, int var5, int var6) {
        for(int var7 = var3; var7 < var3 + var5; ++var7) {
            for(int var8 = var4; var8 < var4 + var6; ++var8) {
                int var9 = 0;
                int var10 = 0;
                int var11 = 0;
                int var12 = 0;

                for(int var13 = var7 - var1; var13 <= var7 + var1; ++var13) {
                    if (var13 >= 0 && var13 < this.qj) {
                        for(int var14 = var8 - var2; var14 <= var8 + var2; ++var14) {
                            if (var14 >= 0 && var14 < this.rj) {
                                int var15 = this.wj[var13 + this.qj * var14];
                                var9 += var15 >> 16 & 255;
                                var10 += var15 >> 8 & 255;
                                var11 += var15 & 255;
                                ++var12;
                            }
                        }
                    }
                }

                this.wj[var7 + this.qj * var8] = (var9 / var12 << 16) + (var10 / var12 << 8) + var11 / var12;
            }
        }

    }

    public static int ng(int var0, int var1, int var2) {
        return (var0 << 16) + (var1 << 8) + var2;
    }

    public void lg() {
        for(int var1 = 0; var1 < this.ak.length; ++var1) {
            this.ak[var1] = null;
            this.dk[var1] = 0;
            this.ek[var1] = 0;
            this.bk[var1] = null;
            this.ck[var1] = null;
        }

    }

    public void mg(byte[] var1, int var2, int var3, boolean var4, boolean var5) {
        this.kg(var1, var2, var3, var4, 1, 1, var5);
    }

    public void rg(byte[] var1, int var2, int var3, boolean var4, int var5, boolean var6) {
        this.kg(var1, var2, var3, var4, var5, 1, var6);
    }

    public void kg(byte[] var1, int var2, int var3, boolean var4, int var5, int var6, boolean var7) {
        int var8 = (var1[13 + var2] & 255) * 256 + (var1[12 + var2] & 255);
        int var9 = (var1[15 + var2] & 255) * 256 + (var1[14 + var2] & 255);
        int var10 = -1;
        int[] var11 = new int[256];

        for(int var12 = 0; var12 < 256; ++var12) {
            var11[var12] = -16777216 + ((var1[var2 + 20 + var12 * 3] & 255) << 16) + ((var1[var2 + 19 + var12 * 3] & 255) << 8) + (var1[var2 + 18 + var12 * 3] & 255);
            if (var11[var12] == -65281) {
                var10 = var12;
            }
        }

        if (var10 == -1) {
            var4 = false;
        }

        if (var7 && var4) {
            var11[var10] = var11[0];
        }

        int var13 = var8 / var5;
        int var14 = var9 / var6;
        int[] var15 = new int[var13 * var14];

        for(int var16 = 0; var16 < var6; ++var16) {
            for(int var17 = 0; var17 < var5; ++var17) {
                int var18 = 0;

                for(int var19 = var14 * var16; var19 < var14 * (var16 + 1); ++var19) {
                    for(int var20 = var13 * var17; var20 < var13 * (var17 + 1); ++var20) {
                        if (var7) {
                            var15[var18++] = var1[var2 + 786 + var20 + (var9 - var19 - 1) * var8] & 255;
                        } else {
                            var15[var18++] = var11[var1[var2 + 786 + var20 + (var9 - var19 - 1) * var8] & 255];
                        }
                    }
                }

                if (var7) {
                    this.lf(var15, var13, var14, var3++, var4, var11, var10);
                } else {
                    this.lf(var15, var13, var14, var3++, var4, (int[])null, -65281);
                }
            }
        }

    }

    private void lf(int[] var1, int var2, int var3, int var4, boolean var5, int[] var6, int var7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = var2;
        int var11 = var3;
        int var12;
        int var13;
        int var14;
        int var15;
        if (var5 && this.kk) {
            label146:
            for(var12 = 0; var12 < var3; ++var12) {
                for(var13 = 0; var13 < var2; ++var13) {
                    var14 = var1[var13 + var12 * var2];
                    if (var14 != var7) {
                        var9 = var12;
                        break label146;
                    }
                }
            }

            label132:
            for(var13 = 0; var13 < var2; ++var13) {
                for(var14 = 0; var14 < var3; ++var14) {
                    var15 = var1[var13 + var14 * var2];
                    if (var15 != var7) {
                        var8 = var13;
                        break label132;
                    }
                }
            }

            int var16;
            label118:
            for(var14 = var3 - 1; var14 >= 0; --var14) {
                for(var15 = 0; var15 < var2; ++var15) {
                    var16 = var1[var15 + var14 * var2];
                    if (var16 != var7) {
                        var11 = var14 + 1;
                        break label118;
                    }
                }
            }

            label105:
            for(var15 = var2 - 1; var15 >= 0; --var15) {
                for(var16 = 0; var16 < var3; ++var16) {
                    int var17 = var1[var15 + var16 * var2];
                    if (var17 != var7) {
                        var10 = var15 + 1;
                        break label105;
                    }
                }
            }
        }

        this.dk[var4] = var10 - var8;
        this.ek[var4] = var11 - var9;
        this.jk[var4] = var5;
        this.fk[var4] = var8;
        this.gk[var4] = var9;
        this.hk[var4] = var2;
        this.ik[var4] = var3;
        if (var6 == null) {
            this.ak[var4] = new int[(var10 - var8) * (var11 - var9)];
            var12 = 0;

            for(var13 = var9; var13 < var11; ++var13) {
                for(var14 = var8; var14 < var10; ++var14) {
                    var15 = var1[var14 + var13 * var2];
                    if (var5) {
                        if (var15 == var7) {
                            var15 = 0;
                        }

                        if (var15 == -16777216) {
                            var15 = -16711423;
                        }
                    }

                    this.ak[var4][var12++] = var15 & 16777215;
                }
            }

        } else {
            this.bk[var4] = new byte[(var10 - var8) * (var11 - var9)];
            this.ck[var4] = var6;
            var12 = 0;

            for(var13 = var9; var13 < var11; ++var13) {
                for(var14 = var8; var14 < var10; ++var14) {
                    var15 = var1[var14 + var13 * var2];
                    if (var5) {
                        if (var15 == var7) {
                            var15 = 0;
                        } else if (var15 == 0) {
                            var15 = var7;
                        }
                    }

                    this.bk[var4][var12++] = (byte)var15;
                }
            }

        }
    }

    public void drawSprite(int var1, int var2, int var3, int var4, int var5) {
        int[] var6 = new int['耀'];
        int var7 = var2 + var3 * this.qj;

        for(int var8 = var3; var8 < var3 + var5; ++var8) {
            for(int var9 = var2; var9 < var2 + var4; ++var9) {
                int var10 = this.wj[var7++];
                ++var6[((var10 & 16252928) >> 9) + ((var10 & '\uf800') >> 6) + ((var10 & 248) >> 3)];
            }

            var7 += this.qj - var4;
        }

        int[] var29 = new int[256];
        int[] var30 = new int[256];

        int var12;
        int var14;
        for(int var11 = 0; var11 < 32768; ++var11) {
            var12 = var6[var11];
            if (var12 > var30[255]) {
                for(int var13 = 1; var13 < 256; ++var13) {
                    if (var12 > var30[var13]) {
                        for(var14 = 255; var14 > var13; --var14) {
                            var29[var14] = var29[var14 - 1];
                            var30[var14] = var30[var14 - 1];
                        }

                        var29[var13] = ((var11 & 31744) << 9) + ((var11 & 992) << 6) + ((var11 & 31) << 3) + 263172;
                        var30[var13] = var12;
                        break;
                    }
                }
            }

            var6[var11] = 0;
        }

        var12 = var4 * var5;
        var7 = 0;
        byte[] var31 = new byte[var12];

        for(var14 = var3; var14 < var3 + var5; ++var14) {
            for(int var15 = var2; var15 < var2 + var4; ++var15) {
                int var16 = this.wj[var15 + var14 * this.qj];
                int var17 = ((var16 & 16252928) >> 9) + ((var16 & '\uf800') >> 6) + ((var16 & 248) >> 3);
                int var18 = var6[var17];
                if (var18 == 0) {
                    int var19 = 999999999;
                    int var20 = var16 >> 16 & 255;
                    int var21 = var16 >> 8 & 255;
                    int var22 = var16 & 255;

                    for(int var23 = 1; var23 < 256; ++var23) {
                        int var24 = var29[var23];
                        int var25 = var24 >> 16 & 255;
                        int var26 = var24 >> 8 & 255;
                        int var27 = var24 & 255;
                        int var28 = (var20 - var25) * (var20 - var25) + (var21 - var26) * (var21 - var26) + (var22 - var27) * (var22 - var27);
                        if (var28 < var19) {
                            var19 = var28;
                            var18 = var23;
                        }
                    }

                    var6[var17] = var18;
                }

                var31[var7++] = (byte)var18;
            }
        }

        this.dk[var1] = var4;
        this.ek[var1] = var5;
        this.jk[var1] = false;
        this.fk[var1] = 0;
        this.gk[var1] = 0;
        this.hk[var1] = var4;
        this.ik[var1] = var5;
        this.bk[var1] = var31;
        this.ck[var1] = var29;
        this.ak[var1] = null;
    }

    public void of(int var1, int var2, int var3, int var4, int var5) {
        this.dk[var1] = var4;
        this.ek[var1] = var5;
        this.jk[var1] = false;
        this.fk[var1] = 0;
        this.gk[var1] = 0;
        this.hk[var1] = var4;
        this.ik[var1] = var5;
        int var6 = var4 * var5;
        int var7 = 0;
        this.ak[var1] = new int[var6];

        for(int var8 = var2; var8 < var2 + var4; ++var8) {
            for(int var9 = var3; var9 < var3 + var5; ++var9) {
                this.ak[var1][var7++] = this.wj[var8 + var9 * this.qj];
            }
        }

    }

    public void drawSprite(int var1, int var2, int var3) {
        if (this.jk[var3]) {
            var1 += this.fk[var3];
            var2 += this.gk[var3];
        }

        int var4 = var1 + var2 * this.qj;
        int var5 = 0;
        int var6 = this.ek[var3];
        int var7 = this.dk[var3];
        int var8 = this.qj - var7;
        int var9 = 0;
        int var10;
        if (var2 < this.lk) {
            var10 = this.lk - var2;
            var6 -= var10;
            var2 = this.lk;
            var5 += var10 * var7;
            var4 += var10 * this.qj;
        }

        if (var2 + var6 >= this.mk) {
            var6 -= var2 + var6 - this.mk + 1;
        }

        if (var1 < this.nk) {
            var10 = this.nk - var1;
            var7 -= var10;
            var1 = this.nk;
            var5 += var10;
            var4 += var10;
            var9 += var10;
            var8 += var10;
        }

        if (var1 + var7 >= this.ok) {
            var10 = var1 + var7 - this.ok + 1;
            var7 -= var10;
            var9 += var10;
            var8 += var10;
        }

        if (var7 > 0 && var6 > 0) {
            byte var11 = 1;
            if (this.pk) {
                var11 = 2;
                var8 += this.qj;
                var9 += this.dk[var3];
                if ((var2 & 1) != 0) {
                    var4 += this.qj;
                    --var6;
                }
            }

            if (this.ak[var3] == null) {
                this.fg(this.wj, this.bk[var3], this.ck[var3], var5, var4, var7, var6, var8, var9, var11);
            } else {
                this.kf(this.wj, this.ak[var3], 0, var5, var4, var7, var6, var8, var9, var11);
            }
        }
    }

    public void rf(int var1, int var2, int var3, int var4, int var5) {
        try {
            int var6 = this.dk[var5];
            int var7 = this.ek[var5];
            int var8 = 0;
            int var9 = 0;
            int var10 = (var6 << 16) / var3;
            int var11 = (var7 << 16) / var4;
            int var12;
            int var13;
            if (this.jk[var5]) {
                var12 = this.hk[var5];
                var13 = this.ik[var5];
                var10 = (var12 << 16) / var3;
                var11 = (var13 << 16) / var4;
                var1 += (this.fk[var5] * var3 + var12 - 1) / var12;
                var2 += (this.gk[var5] * var4 + var13 - 1) / var13;
                if (this.fk[var5] * var3 % var12 != 0) {
                    var8 = (var12 - this.fk[var5] * var3 % var12 << 16) / var3;
                }

                if (this.gk[var5] * var4 % var13 != 0) {
                    var9 = (var13 - this.gk[var5] * var4 % var13 << 16) / var4;
                }

                var3 = var3 * (this.dk[var5] - (var8 >> 16)) / var12;
                var4 = var4 * (this.ek[var5] - (var9 >> 16)) / var13;
            }

            var12 = var1 + var2 * this.qj;
            var13 = this.qj - var3;
            int var14;
            if (var2 < this.lk) {
                var14 = this.lk - var2;
                var4 -= var14;
                var2 = 0;
                var12 += var14 * this.qj;
                var9 += var11 * var14;
            }

            if (var2 + var4 >= this.mk) {
                var4 -= var2 + var4 - this.mk + 1;
            }

            if (var1 < this.nk) {
                var14 = this.nk - var1;
                var3 -= var14;
                var1 = 0;
                var12 += var14;
                var8 += var10 * var14;
                var13 += var14;
            }

            if (var1 + var3 >= this.ok) {
                var14 = var1 + var3 - this.ok + 1;
                var3 -= var14;
                var13 += var14;
            }

            byte var16 = 1;
            if (this.pk) {
                var16 = 2;
                var13 += this.qj;
                var11 += var11;
                if ((var2 & 1) != 0) {
                    var12 += this.qj;
                    --var4;
                }
            }

            this.tf(this.wj, this.ak[var5], 0, var8, var9, var12, var13, var3, var4, var10, var11, var6, var16);
        } catch (Exception var15) {
            System.out.println("error in sprite clipping routine");
        }
    }

    public void tg(int var1, int var2, int var3, int var4) {
        if (this.jk[var3]) {
            var1 += this.fk[var3];
            var2 += this.gk[var3];
        }

        int var5 = var1 + var2 * this.qj;
        int var6 = 0;
        int var7 = this.ek[var3];
        int var8 = this.dk[var3];
        int var9 = this.qj - var8;
        int var10 = 0;
        int var11;
        if (var2 < this.lk) {
            var11 = this.lk - var2;
            var7 -= var11;
            var2 = this.lk;
            var6 += var11 * var8;
            var5 += var11 * this.qj;
        }

        if (var2 + var7 >= this.mk) {
            var7 -= var2 + var7 - this.mk + 1;
        }

        if (var1 < this.nk) {
            var11 = this.nk - var1;
            var8 -= var11;
            var1 = this.nk;
            var6 += var11;
            var5 += var11;
            var10 += var11;
            var9 += var11;
        }

        if (var1 + var8 >= this.ok) {
            var11 = var1 + var8 - this.ok + 1;
            var8 -= var11;
            var10 += var11;
            var9 += var11;
        }

        if (var8 > 0 && var7 > 0) {
            byte var12 = 1;
            if (this.pk) {
                var12 = 2;
                var9 += this.qj;
                var10 += this.dk[var3];
                if ((var2 & 1) != 0) {
                    var5 += this.qj;
                    --var7;
                }
            }

            if (this.ak[var3] == null) {
                this.fh(this.wj, this.bk[var3], this.ck[var3], var6, var5, var8, var7, var9, var10, var12, var4);
            } else {
                this.ig(this.wj, this.ak[var3], 0, var6, var5, var8, var7, var9, var10, var12, var4);
            }
        }
    }

    public void sg(int var1, int var2, int var3, int var4, int var5, int var6) {
        try {
            int var7 = this.dk[var5];
            int var8 = this.ek[var5];
            int var9 = 0;
            int var10 = 0;
            int var11 = (var7 << 16) / var3;
            int var12 = (var8 << 16) / var4;
            int var13;
            int var14;
            if (this.jk[var5]) {
                var13 = this.hk[var5];
                var14 = this.ik[var5];
                var11 = (var13 << 16) / var3;
                var12 = (var14 << 16) / var4;
                var1 += (this.fk[var5] * var3 + var13 - 1) / var13;
                var2 += (this.gk[var5] * var4 + var14 - 1) / var14;
                if (this.fk[var5] * var3 % var13 != 0) {
                    var9 = (var13 - this.fk[var5] * var3 % var13 << 16) / var3;
                }

                if (this.gk[var5] * var4 % var14 != 0) {
                    var10 = (var14 - this.gk[var5] * var4 % var14 << 16) / var4;
                }

                var3 = var3 * (this.dk[var5] - (var9 >> 16)) / var13;
                var4 = var4 * (this.ek[var5] - (var10 >> 16)) / var14;
            }

            var13 = var1 + var2 * this.qj;
            var14 = this.qj - var3;
            int var15;
            if (var2 < this.lk) {
                var15 = this.lk - var2;
                var4 -= var15;
                var2 = 0;
                var13 += var15 * this.qj;
                var10 += var12 * var15;
            }

            if (var2 + var4 >= this.mk) {
                var4 -= var2 + var4 - this.mk + 1;
            }

            if (var1 < this.nk) {
                var15 = this.nk - var1;
                var3 -= var15;
                var1 = 0;
                var13 += var15;
                var9 += var11 * var15;
                var14 += var15;
            }

            if (var1 + var3 >= this.ok) {
                var15 = var1 + var3 - this.ok + 1;
                var3 -= var15;
                var14 += var15;
            }

            byte var17 = 1;
            if (this.pk) {
                var17 = 2;
                var14 += this.qj;
                var12 += var12;
                if ((var2 & 1) != 0) {
                    var13 += this.qj;
                    --var4;
                }
            }

            this.ag(this.wj, this.ak[var5], 0, var9, var10, var13, var14, var3, var4, var11, var12, var7, var17, var6);
        } catch (Exception var16) {
            System.out.println("error in sprite clipping routine");
        }
    }

    public void pg(int var1, int var2, int var3, int var4, int var5, int var6) {
        try {
            int var7 = this.dk[var5];
            int var8 = this.ek[var5];
            int var9 = 0;
            int var10 = 0;
            int var11 = (var7 << 16) / var3;
            int var12 = (var8 << 16) / var4;
            int var13;
            int var14;
            if (this.jk[var5]) {
                var13 = this.hk[var5];
                var14 = this.ik[var5];
                var11 = (var13 << 16) / var3;
                var12 = (var14 << 16) / var4;
                var1 += (this.fk[var5] * var3 + var13 - 1) / var13;
                var2 += (this.gk[var5] * var4 + var14 - 1) / var14;
                if (this.fk[var5] * var3 % var13 != 0) {
                    var9 = (var13 - this.fk[var5] * var3 % var13 << 16) / var3;
                }

                if (this.gk[var5] * var4 % var14 != 0) {
                    var10 = (var14 - this.gk[var5] * var4 % var14 << 16) / var4;
                }

                var3 = var3 * (this.dk[var5] - (var9 >> 16)) / var13;
                var4 = var4 * (this.ek[var5] - (var10 >> 16)) / var14;
            }

            var13 = var1 + var2 * this.qj;
            var14 = this.qj - var3;
            int var15;
            if (var2 < this.lk) {
                var15 = this.lk - var2;
                var4 -= var15;
                var2 = 0;
                var13 += var15 * this.qj;
                var10 += var12 * var15;
            }

            if (var2 + var4 >= this.mk) {
                var4 -= var2 + var4 - this.mk + 1;
            }

            if (var1 < this.nk) {
                var15 = this.nk - var1;
                var3 -= var15;
                var1 = 0;
                var13 += var15;
                var9 += var11 * var15;
                var14 += var15;
            }

            if (var1 + var3 >= this.ok) {
                var15 = var1 + var3 - this.ok + 1;
                var3 -= var15;
                var14 += var15;
            }

            byte var17 = 1;
            if (this.pk) {
                var17 = 2;
                var14 += this.qj;
                var12 += var12;
                if ((var2 & 1) != 0) {
                    var13 += this.qj;
                    --var4;
                }
            }

            this.hh(this.wj, this.ak[var5], 0, var9, var10, var13, var14, var3, var4, var11, var12, var7, var17, var6);
        } catch (Exception var16) {
            System.out.println("error in sprite clipping routine");
        }
    }

    private void kf(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
        int var11 = -(var6 >> 2);
        var6 = -(var6 & 3);

        for(int var12 = -var7; var12 < 0; var12 += var10) {
            for(int var13 = var11; var13 < 0; ++var13) {
                var3 = var2[var4++];
                if (var3 != 0) {
                    var1[var5++] = var3;
                } else {
                    ++var5;
                }

                var3 = var2[var4++];
                if (var3 != 0) {
                    var1[var5++] = var3;
                } else {
                    ++var5;
                }

                var3 = var2[var4++];
                if (var3 != 0) {
                    var1[var5++] = var3;
                } else {
                    ++var5;
                }

                var3 = var2[var4++];
                if (var3 != 0) {
                    var1[var5++] = var3;
                } else {
                    ++var5;
                }
            }

            for(int var14 = var6; var14 < 0; ++var14) {
                var3 = var2[var4++];
                if (var3 != 0) {
                    var1[var5++] = var3;
                } else {
                    ++var5;
                }
            }

            var5 += var8;
            var4 += var9;
        }

    }

    private void fg(int[] var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
        int var11 = -(var6 >> 2);
        var6 = -(var6 & 3);

        for(int var12 = -var7; var12 < 0; var12 += var10) {
            for(int var13 = var11; var13 < 0; ++var13) {
                byte var14 = var2[var4++];
                if (var14 != 0) {
                    var1[var5++] = var3[var14 & 255];
                } else {
                    ++var5;
                }

                var14 = var2[var4++];
                if (var14 != 0) {
                    var1[var5++] = var3[var14 & 255];
                } else {
                    ++var5;
                }

                var14 = var2[var4++];
                if (var14 != 0) {
                    var1[var5++] = var3[var14 & 255];
                } else {
                    ++var5;
                }

                var14 = var2[var4++];
                if (var14 != 0) {
                    var1[var5++] = var3[var14 & 255];
                } else {
                    ++var5;
                }
            }

            for(int var16 = var6; var16 < 0; ++var16) {
                byte var15 = var2[var4++];
                if (var15 != 0) {
                    var1[var5++] = var3[var15 & 255];
                } else {
                    ++var5;
                }
            }

            var5 += var8;
            var4 += var9;
        }

    }

    private void tf(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
        try {
            int var14 = var4;

            for(int var15 = -var9; var15 < 0; var15 += var13) {
                int var16 = (var5 >> 16) * var12;

                for(int var17 = -var8; var17 < 0; ++var17) {
                    var3 = var2[(var4 >> 16) + var16];
                    if (var3 != 0) {
                        var1[var6++] = var3;
                    } else {
                        ++var6;
                    }

                    var4 += var10;
                }

                var5 += var11;
                var4 = var14;
                var6 += var7;
            }

        } catch (Exception var18) {
            System.out.println("error in plot_scale");
        }
    }

    private void ig(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
        int var12 = 256 - var11;

        for(int var13 = -var7; var13 < 0; var13 += var10) {
            for(int var14 = -var6; var14 < 0; ++var14) {
                var3 = var2[var4++];
                if (var3 != 0) {
                    int var15 = var1[var5];
                    var1[var5++] = ((var3 & 16711935) * var11 + (var15 & 16711935) * var12 & -16711936) + ((var3 & '\uff00') * var11 + (var15 & '\uff00') * var12 & 16711680) >> 8;
                } else {
                    ++var5;
                }
            }

            var5 += var8;
            var4 += var9;
        }

    }

    private void fh(int[] var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
        int var12 = 256 - var11;

        for(int var13 = -var7; var13 < 0; var13 += var10) {
            for(int var14 = -var6; var14 < 0; ++var14) {
                byte var15 = var2[var4++];
                if (var15 != 0) {
                    int var17 = var3[var15 & 255];
                    int var16 = var1[var5];
                    var1[var5++] = ((var17 & 16711935) * var11 + (var16 & 16711935) * var12 & -16711936) + ((var17 & '\uff00') * var11 + (var16 & '\uff00') * var12 & 16711680) >> 8;
                } else {
                    ++var5;
                }
            }

            var5 += var8;
            var4 += var9;
        }

    }

    private void ag(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
        int var15 = 256 - var14;

        try {
            int var16 = var4;

            for(int var17 = -var9; var17 < 0; var17 += var13) {
                int var18 = (var5 >> 16) * var12;

                for(int var19 = -var8; var19 < 0; ++var19) {
                    var3 = var2[(var4 >> 16) + var18];
                    if (var3 != 0) {
                        int var20 = var1[var6];
                        var1[var6++] = ((var3 & 16711935) * var14 + (var20 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var14 + (var20 & '\uff00') * var15 & 16711680) >> 8;
                    } else {
                        ++var6;
                    }

                    var4 += var10;
                }

                var5 += var11;
                var4 = var16;
                var6 += var7;
            }

        } catch (Exception var21) {
            System.out.println("error in tran_scale");
        }
    }

    private void hh(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
        int var15 = var14 >> 16 & 255;
        int var16 = var14 >> 8 & 255;
        int var17 = var14 & 255;

        try {
            int var18 = var4;

            for(int var19 = -var9; var19 < 0; var19 += var13) {
                int var20 = (var5 >> 16) * var12;

                for(int var21 = -var8; var21 < 0; ++var21) {
                    var3 = var2[(var4 >> 16) + var20];
                    if (var3 != 0) {
                        int var22 = var3 >> 16 & 255;
                        int var23 = var3 >> 8 & 255;
                        int var24 = var3 & 255;
                        if (var22 == var23 && var23 == var24) {
                            var1[var6++] = (var22 * var15 >> 8 << 16) + (var23 * var16 >> 8 << 8) + (var24 * var17 >> 8);
                        } else {
                            var1[var6++] = var3;
                        }
                    } else {
                        ++var6;
                    }

                    var4 += var10;
                }

                var5 += var11;
                var4 = var18;
                var6 += var7;
            }

        } catch (Exception var25) {
            System.out.println("error in plot_scale");
        }
    }

    public void sf(int var1, int var2, int var3, int var4, int var5) {
        int var6 = this.qj;
        int var7 = this.rj;
        int var8;
        if (this.uk == null) {
            this.uk = new int[512];

            for(var8 = 0; var8 < 256; ++var8) {
                this.uk[var8] = (int)(Math.sin((double)var8 * 0.02454369D) * 32768.0D);
                this.uk[var8 + 256] = (int)(Math.cos((double)var8 * 0.02454369D) * 32768.0D);
            }
        }

        var8 = -this.hk[var3] / 2;
        int var9 = -this.ik[var3] / 2;
        if (this.jk[var3]) {
            var8 += this.fk[var3];
            var9 += this.gk[var3];
        }

        int var10 = var8 + this.dk[var3];
        int var11 = var9 + this.ek[var3];
        var4 &= 255;
        int var16 = this.uk[var4] * var5;
        int var17 = this.uk[var4 + 256] * var5;
        int var18 = var1 + (var9 * var16 + var8 * var17 >> 22);
        int var19 = var2 + (var9 * var17 - var8 * var16 >> 22);
        int var20 = var1 + (var9 * var16 + var10 * var17 >> 22);
        int var21 = var2 + (var9 * var17 - var10 * var16 >> 22);
        int var22 = var1 + (var11 * var16 + var10 * var17 >> 22);
        int var23 = var2 + (var11 * var17 - var10 * var16 >> 22);
        int var24 = var1 + (var11 * var16 + var8 * var17 >> 22);
        int var25 = var2 + (var11 * var17 - var8 * var16 >> 22);
        int var26 = var19;
        int var27 = var19;
        if (var21 < var19) {
            var26 = var21;
        } else if (var21 > var19) {
            var27 = var21;
        }

        if (var23 < var26) {
            var26 = var23;
        } else if (var23 > var27) {
            var27 = var23;
        }

        if (var25 < var26) {
            var26 = var25;
        } else if (var25 > var27) {
            var27 = var25;
        }

        if (var26 < this.lk) {
            var26 = this.lk;
        }

        if (var27 > this.mk) {
            var27 = this.mk;
        }

        if (this.vk == null || this.vk.length != var7 + 1) {
            this.vk = new int[var7 + 1];
            this.wk = new int[var7 + 1];
            this.xk = new int[var7 + 1];
            this.yk = new int[var7 + 1];
            this.zk = new int[var7 + 1];
            this.al = new int[var7 + 1];
        }

        for(int var28 = var26; var28 <= var27; ++var28) {
            this.vk[var28] = 99999999;
            this.wk[var28] = -99999999;
        }

        int var32 = 0;
        int var34 = 0;
        int var36 = 0;
        int var37 = this.dk[var3];
        int var38 = this.ek[var3];
        byte var52 = 0;
        byte var53 = 0;
        int var12 = var37 - 1;
        byte var13 = 0;
        var10 = var37 - 1;
        var11 = var38 - 1;
        byte var14 = 0;
        int var15 = var38 - 1;
        if (var25 != var19) {
            var32 = (var24 - var18 << 8) / (var25 - var19);
            var36 = (var15 - var53 << 8) / (var25 - var19);
        }

        int var29;
        int var30;
        int var31;
        int var35;
        if (var19 > var25) {
            var31 = var24 << 8;
            var35 = var15 << 8;
            var29 = var25;
            var30 = var19;
        } else {
            var31 = var18 << 8;
            var35 = var53 << 8;
            var29 = var19;
            var30 = var25;
        }

        if (var29 < 0) {
            var31 -= var32 * var29;
            var35 -= var36 * var29;
            var29 = 0;
        }

        if (var30 > var7 - 1) {
            var30 = var7 - 1;
        }

        for(int var39 = var29; var39 <= var30; ++var39) {
            this.vk[var39] = this.wk[var39] = var31;
            var31 += var32;
            this.xk[var39] = this.yk[var39] = 0;
            this.zk[var39] = this.al[var39] = var35;
            var35 += var36;
        }

        if (var21 != var19) {
            var32 = (var20 - var18 << 8) / (var21 - var19);
            var34 = (var12 - var52 << 8) / (var21 - var19);
        }

        int var33;
        if (var19 > var21) {
            var31 = var20 << 8;
            var33 = var12 << 8;
            var29 = var21;
            var30 = var19;
        } else {
            var31 = var18 << 8;
            var33 = var52 << 8;
            var29 = var19;
            var30 = var21;
        }

        if (var29 < 0) {
            var31 -= var32 * var29;
            var33 -= var34 * var29;
            var29 = 0;
        }

        if (var30 > var7 - 1) {
            var30 = var7 - 1;
        }

        for(int var40 = var29; var40 <= var30; ++var40) {
            if (var31 < this.vk[var40]) {
                this.vk[var40] = var31;
                this.xk[var40] = var33;
                this.zk[var40] = 0;
            }

            if (var31 > this.wk[var40]) {
                this.wk[var40] = var31;
                this.yk[var40] = var33;
                this.al[var40] = 0;
            }

            var31 += var32;
            var33 += var34;
        }

        if (var23 != var21) {
            var32 = (var22 - var20 << 8) / (var23 - var21);
            var36 = (var11 - var13 << 8) / (var23 - var21);
        }

        if (var21 > var23) {
            var31 = var22 << 8;
            var33 = var10 << 8;
            var35 = var11 << 8;
            var29 = var23;
            var30 = var21;
        } else {
            var31 = var20 << 8;
            var33 = var12 << 8;
            var35 = var13 << 8;
            var29 = var21;
            var30 = var23;
        }

        if (var29 < 0) {
            var31 -= var32 * var29;
            var35 -= var36 * var29;
            var29 = 0;
        }

        if (var30 > var7 - 1) {
            var30 = var7 - 1;
        }

        for(int var41 = var29; var41 <= var30; ++var41) {
            if (var31 < this.vk[var41]) {
                this.vk[var41] = var31;
                this.xk[var41] = var33;
                this.zk[var41] = var35;
            }

            if (var31 > this.wk[var41]) {
                this.wk[var41] = var31;
                this.yk[var41] = var33;
                this.al[var41] = var35;
            }

            var31 += var32;
            var35 += var36;
        }

        if (var25 != var23) {
            var32 = (var24 - var22 << 8) / (var25 - var23);
            var34 = (var14 - var10 << 8) / (var25 - var23);
        }

        if (var23 > var25) {
            var31 = var24 << 8;
            var33 = var14 << 8;
            var35 = var15 << 8;
            var29 = var25;
            var30 = var23;
        } else {
            var31 = var22 << 8;
            var33 = var10 << 8;
            var35 = var11 << 8;
            var29 = var23;
            var30 = var25;
        }

        if (var29 < 0) {
            var31 -= var32 * var29;
            var33 -= var34 * var29;
            var29 = 0;
        }

        if (var30 > var7 - 1) {
            var30 = var7 - 1;
        }

        for(int var42 = var29; var42 <= var30; ++var42) {
            if (var31 < this.vk[var42]) {
                this.vk[var42] = var31;
                this.xk[var42] = var33;
                this.zk[var42] = var35;
            }

            if (var31 > this.wk[var42]) {
                this.wk[var42] = var31;
                this.yk[var42] = var33;
                this.al[var42] = var35;
            }

            var31 += var32;
            var33 += var34;
        }

        int var43 = var26 * var6;
        int[] var44 = this.ak[var3];

        for(int var45 = var26; var45 < var27; ++var45) {
            int var46 = this.vk[var45] >> 8;
            int var47 = this.wk[var45] >> 8;
            if (var47 - var46 <= 0) {
                var43 += var6;
            } else {
                int var48 = this.xk[var45] << 9;
                int var49 = ((this.yk[var45] << 9) - var48) / (var47 - var46);
                int var50 = this.zk[var45] << 9;
                int var51 = ((this.al[var45] << 9) - var50) / (var47 - var46);
                if (var46 < this.nk) {
                    var48 += (this.nk - var46) * var49;
                    var50 += (this.nk - var46) * var51;
                    var46 = this.nk;
                }

                if (var47 > this.ok) {
                    var47 = this.ok;
                }

                if (!this.pk || (var45 & 1) == 0) {
                    if (!this.jk[var3]) {
                        this.dg(this.wj, var44, 0, var43 + var46, var48, var50, var49, var51, var46 - var47, var37);
                    } else {
                        this.hg(this.wj, var44, 0, var43 + var46, var48, var50, var49, var51, var46 - var47, var37);
                    }
                }

                var43 += var6;
            }
        }

    }

    private void dg(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
        for(var3 = var9; var3 < 0; ++var3) {
            this.wj[var4++] = var2[(var5 >> 17) + (var6 >> 17) * var10];
            var5 += var7;
            var6 += var8;
        }

    }

    private void hg(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
        for(int var11 = var9; var11 < 0; ++var11) {
            var3 = var2[(var5 >> 17) + (var6 >> 17) * var10];
            if (var3 != 0) {
                this.wj[var4++] = var3;
            } else {
                ++var4;
            }

            var5 += var7;
            var6 += var8;
        }

    }

    public void gg(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        this.rf(var1, var2, var3, var4, var5);
    }

    public void zf(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
        try {
            if (var6 == 0) {
                var6 = 16777215;
            }

            if (var7 == 0) {
                var7 = 16777215;
            }

            int var10 = this.dk[var5];
            int var11 = this.ek[var5];
            int var12 = 0;
            int var13 = 0;
            int var14 = var8 << 16;
            int var15 = (var10 << 16) / var3;
            int var16 = (var11 << 16) / var4;
            int var17 = -(var8 << 16) / var4;
            int var18;
            int var19;
            if (this.jk[var5]) {
                var18 = this.hk[var5];
                var19 = this.ik[var5];
                var15 = (var18 << 16) / var3;
                var16 = (var19 << 16) / var4;
                int var20 = this.fk[var5];
                int var21 = this.gk[var5];
                if (var9) {
                    var20 = var18 - this.dk[var5] - var20;
                }

                var1 += (var20 * var3 + var18 - 1) / var18;
                int var22 = (var21 * var4 + var19 - 1) / var19;
                var2 += var22;
                var14 += var22 * var17;
                if (var20 * var3 % var18 != 0) {
                    var12 = (var18 - var20 * var3 % var18 << 16) / var3;
                }

                if (var21 * var4 % var19 != 0) {
                    var13 = (var19 - var21 * var4 % var19 << 16) / var4;
                }

                var3 = ((this.dk[var5] << 16) - var12 + var15 - 1) / var15;
                var4 = ((this.ek[var5] << 16) - var13 + var16 - 1) / var16;
            }

            var18 = var2 * this.qj;
            var14 += var1 << 16;
            if (var2 < this.lk) {
                var19 = this.lk - var2;
                var4 -= var19;
                var2 = this.lk;
                var18 += var19 * this.qj;
                var13 += var16 * var19;
                var14 += var17 * var19;
            }

            if (var2 + var4 >= this.mk) {
                var4 -= var2 + var4 - this.mk + 1;
            }

            var19 = var18 / this.qj & 1;
            if (!this.pk) {
                var19 = 2;
            }

            if (var7 == 16777215) {
                if (this.ak[var5] != null) {
                    if (!var9) {
                        this.gh(this.wj, this.ak[var5], 0, var12, var13, var18, var3, var4, var15, var16, var10, var6, var14, var17, var19);
                    } else {
                        this.gh(this.wj, this.ak[var5], 0, (this.dk[var5] << 16) - var12 - 1, var13, var18, var3, var4, -var15, var16, var10, var6, var14, var17, var19);
                    }
                } else if (!var9) {
                    this.mf(this.wj, this.bk[var5], this.ck[var5], 0, var12, var13, var18, var3, var4, var15, var16, var10, var6, var14, var17, var19);
                } else {
                    this.mf(this.wj, this.bk[var5], this.ck[var5], 0, (this.dk[var5] << 16) - var12 - 1, var13, var18, var3, var4, -var15, var16, var10, var6, var14, var17, var19);
                }
            } else if (this.ak[var5] != null) {
                if (!var9) {
                    this.eg(this.wj, this.ak[var5], 0, var12, var13, var18, var3, var4, var15, var16, var10, var6, var7, var14, var17, var19);
                } else {
                    this.eg(this.wj, this.ak[var5], 0, (this.dk[var5] << 16) - var12 - 1, var13, var18, var3, var4, -var15, var16, var10, var6, var7, var14, var17, var19);
                }
            } else if (!var9) {
                this.eh(this.wj, this.bk[var5], this.ck[var5], 0, var12, var13, var18, var3, var4, var15, var16, var10, var6, var7, var14, var17, var19);
            } else {
                this.eh(this.wj, this.bk[var5], this.ck[var5], 0, (this.dk[var5] << 16) - var12 - 1, var13, var18, var3, var4, -var15, var16, var10, var6, var7, var14, var17, var19);
            }
        } catch (Exception var23) {
            System.out.println("error in sprite clipping routine");
        }
    }

    private void gh(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
        int var19 = var12 >> 16 & 255;
        int var20 = var12 >> 8 & 255;
        int var21 = var12 & 255;

        try {
            int var22 = var4;

            for(int var23 = -var8; var23 < 0; ++var23) {
                int var24 = (var5 >> 16) * var11;
                int var25 = var13 >> 16;
                int var26 = var7;
                int var27;
                if (var25 < this.nk) {
                    var27 = this.nk - var25;
                    var26 = var7 - var27;
                    var25 = this.nk;
                    var4 += var9 * var27;
                }

                if (var25 + var26 >= this.ok) {
                    var27 = var25 + var26 - this.ok;
                    var26 -= var27;
                }

                var15 = 1 - var15;
                if (var15 != 0) {
                    for(var27 = var25; var27 < var25 + var26; ++var27) {
                        var3 = var2[(var4 >> 16) + var24];
                        if (var3 != 0) {
                            int var16 = var3 >> 16 & 255;
                            int var17 = var3 >> 8 & 255;
                            int var18 = var3 & 255;
                            if (var16 == var17 && var17 == var18) {
                                var1[var27 + var6] = (var16 * var19 >> 8 << 16) + (var17 * var20 >> 8 << 8) + (var18 * var21 >> 8);
                            } else {
                                var1[var27 + var6] = var3;
                            }
                        }

                        var4 += var9;
                    }
                }

                var5 += var10;
                var4 = var22;
                var6 += this.qj;
                var13 += var14;
            }

        } catch (Exception var28) {
            System.out.println("error in transparent sprite plot routine");
        }
    }

    private void eg(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16) {
        int var20 = var12 >> 16 & 255;
        int var21 = var12 >> 8 & 255;
        int var22 = var12 & 255;
        int var23 = var13 >> 16 & 255;
        int var24 = var13 >> 8 & 255;
        int var25 = var13 & 255;

        try {
            int var26 = var4;

            for(int var27 = -var8; var27 < 0; ++var27) {
                int var28 = (var5 >> 16) * var11;
                int var29 = var14 >> 16;
                int var30 = var7;
                int var31;
                if (var29 < this.nk) {
                    var31 = this.nk - var29;
                    var30 = var7 - var31;
                    var29 = this.nk;
                    var4 += var9 * var31;
                }

                if (var29 + var30 >= this.ok) {
                    var31 = var29 + var30 - this.ok;
                    var30 -= var31;
                }

                var16 = 1 - var16;
                if (var16 != 0) {
                    for(var31 = var29; var31 < var29 + var30; ++var31) {
                        var3 = var2[(var4 >> 16) + var28];
                        if (var3 != 0) {
                            int var17 = var3 >> 16 & 255;
                            int var18 = var3 >> 8 & 255;
                            int var19 = var3 & 255;
                            if (var17 == var18 && var18 == var19) {
                                var1[var31 + var6] = (var17 * var20 >> 8 << 16) + (var18 * var21 >> 8 << 8) + (var19 * var22 >> 8);
                            } else if (var17 == 255 && var18 == var19) {
                                var1[var31 + var6] = (var17 * var23 >> 8 << 16) + (var18 * var24 >> 8 << 8) + (var19 * var25 >> 8);
                            } else {
                                var1[var31 + var6] = var3;
                            }
                        }

                        var4 += var9;
                    }
                }

                var5 += var10;
                var4 = var26;
                var6 += this.qj;
                var14 += var15;
            }

        } catch (Exception var32) {
            System.out.println("error in transparent sprite plot routine");
        }
    }

    private void mf(int[] var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16) {
        int var20 = var13 >> 16 & 255;
        int var21 = var13 >> 8 & 255;
        int var22 = var13 & 255;

        try {
            int var23 = var5;

            for(int var24 = -var9; var24 < 0; ++var24) {
                int var25 = (var6 >> 16) * var12;
                int var26 = var14 >> 16;
                int var27 = var8;
                int var28;
                if (var26 < this.nk) {
                    var28 = this.nk - var26;
                    var27 = var8 - var28;
                    var26 = this.nk;
                    var5 += var10 * var28;
                }

                if (var26 + var27 >= this.ok) {
                    var28 = var26 + var27 - this.ok;
                    var27 -= var28;
                }

                var16 = 1 - var16;
                if (var16 != 0) {
                    for(var28 = var26; var28 < var26 + var27; ++var28) {
                        var4 = var2[(var5 >> 16) + var25] & 255;
                        if (var4 != 0) {
                            var4 = var3[var4];
                            int var17 = var4 >> 16 & 255;
                            int var18 = var4 >> 8 & 255;
                            int var19 = var4 & 255;
                            if (var17 == var18 && var18 == var19) {
                                var1[var28 + var7] = (var17 * var20 >> 8 << 16) + (var18 * var21 >> 8 << 8) + (var19 * var22 >> 8);
                            } else {
                                var1[var28 + var7] = var4;
                            }
                        }

                        var5 += var10;
                    }
                }

                var6 += var11;
                var5 = var23;
                var7 += this.qj;
                var14 += var15;
            }

        } catch (Exception var29) {
            System.out.println("error in transparent sprite plot routine");
        }
    }

    private void eh(int[] var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17) {
        int var21 = var13 >> 16 & 255;
        int var22 = var13 >> 8 & 255;
        int var23 = var13 & 255;
        int var24 = var14 >> 16 & 255;
        int var25 = var14 >> 8 & 255;
        int var26 = var14 & 255;

        try {
            int var27 = var5;

            for(int var28 = -var9; var28 < 0; ++var28) {
                int var29 = (var6 >> 16) * var12;
                int var30 = var15 >> 16;
                int var31 = var8;
                int var32;
                if (var30 < this.nk) {
                    var32 = this.nk - var30;
                    var31 = var8 - var32;
                    var30 = this.nk;
                    var5 += var10 * var32;
                }

                if (var30 + var31 >= this.ok) {
                    var32 = var30 + var31 - this.ok;
                    var31 -= var32;
                }

                var17 = 1 - var17;
                if (var17 != 0) {
                    for(var32 = var30; var32 < var30 + var31; ++var32) {
                        var4 = var2[(var5 >> 16) + var29] & 255;
                        if (var4 != 0) {
                            var4 = var3[var4];
                            int var18 = var4 >> 16 & 255;
                            int var19 = var4 >> 8 & 255;
                            int var20 = var4 & 255;
                            if (var18 == var19 && var19 == var20) {
                                var1[var32 + var7] = (var18 * var21 >> 8 << 16) + (var19 * var22 >> 8 << 8) + (var20 * var23 >> 8);
                            } else if (var18 == 255 && var19 == var20) {
                                var1[var32 + var7] = (var18 * var24 >> 8 << 16) + (var19 * var25 >> 8 << 8) + (var20 * var26 >> 8);
                            } else {
                                var1[var32 + var7] = var4;
                            }
                        }

                        var5 += var10;
                    }
                }

                var6 += var11;
                var5 = var27;
                var7 += this.qj;
                var15 += var16;
            }

        } catch (Exception var33) {
            System.out.println("error in transparent sprite plot routine");
        }
    }

    public static int if_(byte[] var0) {
        qk[sk] = var0;
        return sk++;
    }

    public void ch(String var1, int var2, int var3, int var4, int var5) {
        this.qf(var1, var2 - this.hf(var1, var4), var3, var4, var5);
    }

    public void xg(String var1, int var2, int var3, int var4, int var5) {
        this.qf(var1, var2 - this.hf(var1, var4) / 2, var3, var4, var5);
    }

    public void dh(String var1, int var2, int var3, int var4, int var5, int var6) {
        int var7 = 0;
        byte[] var8 = qk[var4];
        int var9 = 0;
        int var10 = 0;

        for(int var11 = 0; var11 < var1.length(); ++var11) {
            if (var1.charAt(var11) == '@' && var11 + 4 < var1.length() && var1.charAt(var11 + 4) == '@') {
                var11 += 4;
            } else if (var1.charAt(var11) == '~' && var11 + 4 < var1.length() && var1.charAt(var11 + 4) == '~') {
                var11 += 4;
            } else {
                var7 += var8[rk[var1.charAt(var11)] + 7];
            }

            if (var1.charAt(var11) == ' ') {
                var10 = var11;
            }

            if (var7 > var6) {
                if (var10 <= var9) {
                    var10 = var11;
                }

                this.xg(var1.substring(var9, var10), var2, var3, var4, var5);
                var7 = 0;
                var9 = var11 = var10 + 1;
                var3 += this.qg(var4);
            }
        }

        if (var7 > 0) {
            this.xg(var1.substring(var9), var2, var3, var4, var5);
        }

    }

    public void qf(String var1, int var2, int var3, int var4, int var5) {
        byte[] var6 = qk[var4];

        for(int var7 = 0; var7 < var1.length(); ++var7) {
            if (var1.charAt(var7) == '@' && var7 + 4 < var1.length() && var1.charAt(var7 + 4) == '@') {
                if (var1.substring(var7 + 1, var7 + 4).equalsIgnoreCase("red")) {
                    var5 = 16711680;
                } else if (var1.substring(var7 + 1, var7 + 4).equalsIgnoreCase("lre")) {
                    var5 = 16748608;
                } else if (var1.substring(var7 + 1, var7 + 4).equalsIgnoreCase("yel")) {
                    var5 = 16776960;
                } else if (var1.substring(var7 + 1, var7 + 4).equalsIgnoreCase("gre")) {
                    var5 = 65280;
                } else if (var1.substring(var7 + 1, var7 + 4).equalsIgnoreCase("blu")) {
                    var5 = 255;
                } else if (var1.substring(var7 + 1, var7 + 4).equalsIgnoreCase("cya")) {
                    var5 = 65535;
                } else if (var1.substring(var7 + 1, var7 + 4).equalsIgnoreCase("mag")) {
                    var5 = 16711935;
                } else if (var1.substring(var7 + 1, var7 + 4).equalsIgnoreCase("whi")) {
                    var5 = 16777215;
                } else if (var1.substring(var7 + 1, var7 + 4).equalsIgnoreCase("bla")) {
                    var5 = 0;
                } else if (var1.substring(var7 + 1, var7 + 4).equalsIgnoreCase("dre")) {
                    var5 = 12582912;
                } else if (var1.substring(var7 + 1, var7 + 4).equalsIgnoreCase("ora")) {
                    var5 = 16748608;
                } else if (var1.substring(var7 + 1, var7 + 4).equalsIgnoreCase("ran")) {
                    var5 = (int)(Math.random() * 1.6777215E7D);
                } else if (var1.substring(var7 + 1, var7 + 4).equalsIgnoreCase("or1")) {
                    var5 = 16756736;
                } else if (var1.substring(var7 + 1, var7 + 4).equalsIgnoreCase("or2")) {
                    var5 = 16740352;
                } else if (var1.substring(var7 + 1, var7 + 4).equalsIgnoreCase("or3")) {
                    var5 = 16723968;
                } else if (var1.substring(var7 + 1, var7 + 4).equalsIgnoreCase("gr1")) {
                    var5 = 12648192;
                } else if (var1.substring(var7 + 1, var7 + 4).equalsIgnoreCase("gr2")) {
                    var5 = 8453888;
                } else if (var1.substring(var7 + 1, var7 + 4).equalsIgnoreCase("gr3")) {
                    var5 = 4259584;
                }

                var7 += 4;
            } else if (var1.charAt(var7) == '~' && var7 + 4 < var1.length() && var1.charAt(var7 + 4) == '~') {
                char var11 = var1.charAt(var7 + 1);
                char var9 = var1.charAt(var7 + 2);
                char var10 = var1.charAt(var7 + 3);
                if (var11 >= '0' && var11 <= '9' && var9 >= '0' && var9 <= '9' && var10 >= '0' && var10 <= '9') {
                    var2 = Integer.parseInt(var1.substring(var7 + 1, var7 + 4));
                }

                var7 += 4;
            } else {
                int var8 = rk[var1.charAt(var7)];
                if (this.tk && var5 != 0) {
                    this.wg(var8, var2 + 1, var3, 0, var6);
                }

                if (this.tk && var5 != 0) {
                    this.wg(var8, var2, var3 + 1, 0, var6);
                }

                this.wg(var8, var2, var3, var5, var6);
                var2 += var6[var8 + 7];
            }
        }

    }

    private void wg(int var1, int var2, int var3, int var4, byte[] var5) {
        int var6 = var2 + var5[var1 + 5];
        int var7 = var3 - var5[var1 + 6];
        int var8 = var5[var1 + 3];
        int var9 = var5[var1 + 4];
        int var10 = var5[var1] * 16384 + var5[var1 + 1] * 128 + var5[var1 + 2];
        int var11 = var6 + var7 * this.qj;
        int var12 = this.qj - var8;
        int var13 = 0;
        int var14;
        if (var7 < this.lk) {
            var14 = this.lk - var7;
            var9 -= var14;
            var7 = this.lk;
            var10 += var14 * var8;
            var11 += var14 * this.qj;
        }

        if (var7 + var9 >= this.mk) {
            var9 -= var7 + var9 - this.mk + 1;
        }

        if (var6 < this.nk) {
            var14 = this.nk - var6;
            var8 -= var14;
            var6 = this.nk;
            var10 += var14;
            var11 += var14;
            var13 += var14;
            var12 += var14;
        }

        if (var6 + var8 >= this.ok) {
            var14 = var6 + var8 - this.ok + 1;
            var8 -= var14;
            var13 += var14;
            var12 += var14;
        }

        if (var8 > 0 && var9 > 0) {
            this.gf(this.wj, var5, var4, var10, var11, var8, var9, var12, var13);
        }

    }

    private void gf(int[] var1, byte[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
        int var10 = -(var6 >> 2);
        var6 = -(var6 & 3);

        for(int var11 = -var7; var11 < 0; ++var11) {
            for(int var12 = var10; var12 < 0; ++var12) {
                if (var2[var4++] != 0) {
                    var1[var5++] = var3;
                } else {
                    ++var5;
                }

                if (var2[var4++] != 0) {
                    var1[var5++] = var3;
                } else {
                    ++var5;
                }

                if (var2[var4++] != 0) {
                    var1[var5++] = var3;
                } else {
                    ++var5;
                }

                if (var2[var4++] != 0) {
                    var1[var5++] = var3;
                } else {
                    ++var5;
                }
            }

            for(int var13 = var6; var13 < 0; ++var13) {
                if (var2[var4++] != 0) {
                    var1[var5++] = var3;
                } else {
                    ++var5;
                }
            }

            var5 += var8;
            var4 += var9;
        }

    }

    public int qg(int var1) {
        return var1 == 0 ? qk[var1][8] - 2 : qk[var1][8] - 1;
    }

    public int hf(String var1, int var2) {
        int var3 = 0;
        byte[] var4 = qk[var2];

        for(int var5 = 0; var5 < var1.length(); ++var5) {
            if (var1.charAt(var5) == '@' && var5 + 4 < var1.length() && var1.charAt(var5 + 4) == '@') {
                var5 += 4;
            } else if (var1.charAt(var5) == '~' && var5 + 4 < var1.length() && var1.charAt(var5 + 4) == '~') {
                var5 += 4;
            } else {
                var3 += var4[rk[var1.charAt(var5)] + 7];
            }
        }

        return var3;
    }

    public boolean imageUpdate(Image var1, int var2, int var3, int var4, int var5, int var6) {
        return true;
    }

    static {
        String var0 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        rk = new int[256];

        for(int var1 = 0; var1 < 256; ++var1) {
            int var2 = var0.indexOf(var1);
            if (var2 == -1) {
                var2 = 74;
            }

            rk[var1] = var2 * 9;
        }

    }
}
