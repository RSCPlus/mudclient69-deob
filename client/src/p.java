import jagex.o;
import jagex.client.h;
import jagex.client.i;
import jagex.client.j;
import java.io.IOException;

public class p {
    boolean ufb = true;
    boolean vfb = false;
    i wfb;
    j xfb;
    int yfb = 750;
    final int zfb = 12345678;
    final int agb = 128;
    int[] bgb = new int[256];
    int cgb;
    int[] dgb;
    int[] egb;
    int[] fgb;
    byte[] ggb;
    byte[][] hgb = new byte[4][2304];
    byte[][] igb = new byte[4][2304];
    byte[][] jgb = new byte[4][2304];
    byte[][] kgb = new byte[4][2304];
    byte[][] lgb = new byte[4][2304];
    byte[][] mgb = new byte[4][2304];
    byte[][] ngb = new byte[4][2304];
    int[][] ogb = new int[4][2304];
    int pgb = 96;
    int qgb = 96;
    int[] rgb;
    int[] sgb;
    int[][] tgb;
    int[][] ugb;
    int[][] vgb;
    boolean wgb;
    h[] xgb;
    h[][] ygb;
    h[][] zgb;
    h ahb;

    public p(j var1, i var2) {
        this.rgb = new int[this.pgb * this.qgb * 2];
        this.sgb = new int[this.pgb * this.qgb * 2];
        this.tgb = new int[this.pgb][this.qgb];
        this.ugb = new int[this.pgb][this.qgb];
        this.vgb = new int[this.pgb][this.qgb];
        this.wgb = false;
        this.xgb = new h[64];
        this.ygb = new h[4][64];
        this.zgb = new h[4][64];
        this.xfb = var1;
        this.wfb = var2;

        for(int var3 = 0; var3 < 64; ++var3) {
            this.bgb[var3] = j.ji(255 - var3 * 4, 255 - (int)((double)var3 * 1.75D), 255 - var3 * 4);
        }

        for(int var4 = 0; var4 < 64; ++var4) {
            this.bgb[var4 + 64] = j.ji(var4 * 3, 144, 0);
        }

        for(int var5 = 0; var5 < 64; ++var5) {
            this.bgb[var5 + 128] = j.ji(192 - (int)((double)var5 * 1.5D), 144 - (int)((double)var5 * 1.5D), 0);
        }

        for(int var6 = 0; var6 < 64; ++var6) {
            this.bgb[var6 + 192] = j.ji(96 - (int)((double)var6 * 1.5D), 48 + (int)((double)var6 * 1.5D), 0);
        }

    }

    public int ao(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8, boolean var9) {
        int var11;
        for(int var10 = 0; var10 < this.pgb; ++var10) {
            for(var11 = 0; var11 < this.qgb; ++var11) {
                this.tgb[var10][var11] = 0;
            }
        }

        byte var19 = 0;
        int var12 = 0;
        int var13 = var1;
        int var14 = var2;
        this.tgb[var1][var2] = 99;
        var7[var19] = var1;
        var11 = var19 + 1;
        var8[var19] = var2;
        int var15 = var7.length;
        boolean var16 = false;

        while(var12 != var11) {
            var13 = var7[var12];
            var14 = var8[var12];
            var12 = (var12 + 1) % var15;
            if (var13 >= var3 && var13 <= var5 && var14 >= var4 && var14 <= var6) {
                var16 = true;
                break;
            }

            if (var9) {
                if (var13 > 0 && var13 - 1 >= var3 && var13 - 1 <= var5 && var14 >= var4 && var14 <= var6 && (this.ugb[var13 - 1][var14] & 8) == 0) {
                    var16 = true;
                    break;
                }

                if (var13 < this.pgb - 1 && var13 + 1 >= var3 && var13 + 1 <= var5 && var14 >= var4 && var14 <= var6 && (this.ugb[var13 + 1][var14] & 2) == 0) {
                    var16 = true;
                    break;
                }

                if (var14 > 0 && var13 >= var3 && var13 <= var5 && var14 - 1 >= var4 && var14 - 1 <= var6 && (this.ugb[var13][var14 - 1] & 4) == 0) {
                    var16 = true;
                    break;
                }

                if (var14 < this.qgb - 1 && var13 >= var3 && var13 <= var5 && var14 + 1 >= var4 && var14 + 1 <= var6 && (this.ugb[var13][var14 + 1] & 1) == 0) {
                    var16 = true;
                    break;
                }
            }

            if (var13 > 0 && this.tgb[var13 - 1][var14] == 0 && (this.ugb[var13 - 1][var14] & 120) == 0) {
                var7[var11] = var13 - 1;
                var8[var11] = var14;
                var11 = (var11 + 1) % var15;
                this.tgb[var13 - 1][var14] = 2;
            }

            if (var13 < this.pgb - 1 && this.tgb[var13 + 1][var14] == 0 && (this.ugb[var13 + 1][var14] & 114) == 0) {
                var7[var11] = var13 + 1;
                var8[var11] = var14;
                var11 = (var11 + 1) % var15;
                this.tgb[var13 + 1][var14] = 8;
            }

            if (var14 > 0 && this.tgb[var13][var14 - 1] == 0 && (this.ugb[var13][var14 - 1] & 116) == 0) {
                var7[var11] = var13;
                var8[var11] = var14 - 1;
                var11 = (var11 + 1) % var15;
                this.tgb[var13][var14 - 1] = 1;
            }

            if (var14 < this.qgb - 1 && this.tgb[var13][var14 + 1] == 0 && (this.ugb[var13][var14 + 1] & 113) == 0) {
                var7[var11] = var13;
                var8[var11] = var14 + 1;
                var11 = (var11 + 1) % var15;
                this.tgb[var13][var14 + 1] = 4;
            }

            if (var13 > 0 && var14 > 0 && (this.ugb[var13][var14 - 1] & 116) == 0 && (this.ugb[var13 - 1][var14] & 120) == 0 && (this.ugb[var13 - 1][var14 - 1] & 124) == 0 && this.tgb[var13 - 1][var14 - 1] == 0) {
                var7[var11] = var13 - 1;
                var8[var11] = var14 - 1;
                var11 = (var11 + 1) % var15;
                this.tgb[var13 - 1][var14 - 1] = 3;
            }

            if (var13 < this.pgb - 1 && var14 > 0 && (this.ugb[var13][var14 - 1] & 116) == 0 && (this.ugb[var13 + 1][var14] & 114) == 0 && (this.ugb[var13 + 1][var14 - 1] & 118) == 0 && this.tgb[var13 + 1][var14 - 1] == 0) {
                var7[var11] = var13 + 1;
                var8[var11] = var14 - 1;
                var11 = (var11 + 1) % var15;
                this.tgb[var13 + 1][var14 - 1] = 9;
            }

            if (var13 > 0 && var14 < this.qgb - 1 && (this.ugb[var13][var14 + 1] & 113) == 0 && (this.ugb[var13 - 1][var14] & 120) == 0 && (this.ugb[var13 - 1][var14 + 1] & 121) == 0 && this.tgb[var13 - 1][var14 + 1] == 0) {
                var7[var11] = var13 - 1;
                var8[var11] = var14 + 1;
                var11 = (var11 + 1) % var15;
                this.tgb[var13 - 1][var14 + 1] = 6;
            }

            if (var13 < this.pgb - 1 && var14 < this.qgb - 1 && (this.ugb[var13][var14 + 1] & 113) == 0 && (this.ugb[var13 + 1][var14] & 114) == 0 && (this.ugb[var13 + 1][var14 + 1] & 115) == 0 && this.tgb[var13 + 1][var14 + 1] == 0) {
                var7[var11] = var13 + 1;
                var8[var11] = var14 + 1;
                var11 = (var11 + 1) % var15;
                this.tgb[var13 + 1][var14 + 1] = 12;
            }
        }

        if (!var16) {
            return -1;
        } else {
            byte var20 = 0;
            var7[var20] = var13;
            var12 = var20 + 1;
            var8[var20] = var14;

            int var18;
            for(int var17 = var18 = this.tgb[var13][var14]; var13 != var1 || var14 != var2; var17 = this.tgb[var13][var14]) {
                if (var17 != var18) {
                    var18 = var17;
                    var7[var12] = var13;
                    var8[var12++] = var14;
                }

                if ((var17 & 2) != 0) {
                    ++var13;
                } else if ((var17 & 8) != 0) {
                    --var13;
                }

                if ((var17 & 1) != 0) {
                    ++var14;
                } else if ((var17 & 4) != 0) {
                    --var14;
                }
            }

            return var12;
        }
    }

    public void zo(int var1, int var2, int var3) {
        this.ugb[var1][var2] |= var3;
    }

    public void so(int var1, int var2, int var3) {
        this.ugb[var1][var2] &= '\uffff' - var3;
    }

    public void ap(int var1, int var2, int var3, int var4) {
        if (var1 >= 0 && var2 >= 0 && var1 < this.pgb - 1 && var2 < this.qgb - 1) {
            if (r.tkb[var4] == 1) {
                if (var3 == 0) {
                    this.ugb[var1][var2] |= 1;
                    if (var2 > 0) {
                        this.zo(var1, var2 - 1, 4);
                    }
                } else if (var3 == 1) {
                    this.ugb[var1][var2] |= 2;
                    if (var1 > 0) {
                        this.zo(var1 - 1, var2, 8);
                    }
                } else if (var3 == 2) {
                    this.ugb[var1][var2] |= 16;
                } else if (var3 == 3) {
                    this.ugb[var1][var2] |= 32;
                }

                this.go(var1, var2, 1, 1);
            }

        }
    }

    public void yn(int var1, int var2, int var3, int var4) {
        if (var1 >= 0 && var2 >= 0 && var1 < this.pgb - 1 && var2 < this.qgb - 1) {
            if (r.tkb[var4] == 1) {
                if (var3 == 0) {
                    this.ugb[var1][var2] &= 65534;
                    if (var2 > 0) {
                        this.so(var1, var2 - 1, 4);
                    }
                } else if (var3 == 1) {
                    this.ugb[var1][var2] &= 65533;
                    if (var1 > 0) {
                        this.so(var1 - 1, var2, 8);
                    }
                } else if (var3 == 2) {
                    this.ugb[var1][var2] &= 65519;
                } else if (var3 == 3) {
                    this.ugb[var1][var2] &= 65503;
                }

                this.go(var1, var2, 1, 1);
            }

        }
    }

    public void oo(int var1, int var2, int var3) {
        if (var1 >= 0 && var2 >= 0 && var1 < this.pgb - 1 && var2 < this.qgb - 1) {
            if (r.ikb[var3] == 1 || r.ikb[var3] == 2) {
                int var4 = this.bo(var1, var2);
                int var5;
                int var6;
                if (var4 != 0 && var4 != 4) {
                    var6 = r.gkb[var3];
                    var5 = r.hkb[var3];
                } else {
                    var5 = r.gkb[var3];
                    var6 = r.hkb[var3];
                }

                for(int var7 = var1; var7 < var1 + var5; ++var7) {
                    for(int var8 = var2; var8 < var2 + var6; ++var8) {
                        if (r.ikb[var3] == 1) {
                            this.ugb[var7][var8] |= 64;
                        } else if (var4 == 0) {
                            this.ugb[var7][var8] |= 2;
                            if (var7 > 0) {
                                this.zo(var7 - 1, var8, 8);
                            }
                        } else if (var4 == 2) {
                            this.ugb[var7][var8] |= 4;
                            if (var8 < this.qgb - 1) {
                                this.zo(var7, var8 + 1, 1);
                            }
                        } else if (var4 == 4) {
                            this.ugb[var7][var8] |= 8;
                            if (var7 < this.pgb - 1) {
                                this.zo(var7 + 1, var8, 2);
                            }
                        } else if (var4 == 6) {
                            this.ugb[var7][var8] |= 1;
                            if (var8 > 0) {
                                this.zo(var7, var8 - 1, 4);
                            }
                        }
                    }
                }

                this.go(var1, var2, var5, var6);
            }

        }
    }

    public void yo(int var1, int var2, int var3) {
        if (var1 >= 0 && var2 >= 0 && var1 < this.pgb - 1 && var2 < this.qgb - 1) {
            if (r.ikb[var3] == 1 || r.ikb[var3] == 2) {
                int var4 = this.bo(var1, var2);
                int var5;
                int var6;
                if (var4 != 0 && var4 != 4) {
                    var6 = r.gkb[var3];
                    var5 = r.hkb[var3];
                } else {
                    var5 = r.gkb[var3];
                    var6 = r.hkb[var3];
                }

                for(int var7 = var1; var7 < var1 + var5; ++var7) {
                    for(int var8 = var2; var8 < var2 + var6; ++var8) {
                        if (r.ikb[var3] == 1) {
                            this.ugb[var7][var8] &= 65471;
                        } else if (var4 == 0) {
                            this.ugb[var7][var8] &= 65533;
                            if (var7 > 0) {
                                this.so(var7 - 1, var8, 8);
                            }
                        } else if (var4 == 2) {
                            this.ugb[var7][var8] &= 65531;
                            if (var8 < this.qgb - 1) {
                                this.so(var7, var8 + 1, 1);
                            }
                        } else if (var4 == 4) {
                            this.ugb[var7][var8] &= 65527;
                            if (var7 < this.pgb - 1) {
                                this.so(var7 + 1, var8, 2);
                            }
                        } else if (var4 == 6) {
                            this.ugb[var7][var8] &= 65534;
                            if (var8 > 0) {
                                this.so(var7, var8 - 1, 4);
                            }
                        }
                    }
                }

                this.go(var1, var2, var5, var6);
            }

        }
    }

    public void go(int var1, int var2, int var3, int var4) {
        if (var1 >= 1 && var2 >= 1 && var1 + var3 < this.pgb && var2 + var4 < this.qgb) {
            for(int var5 = var1; var5 <= var1 + var3; ++var5) {
                for(int var6 = var2; var6 <= var2 + var4; ++var6) {
                    if ((this.ep(var5, var6) & 99) == 0 && (this.ep(var5 - 1, var6) & 89) == 0 && (this.ep(var5, var6 - 1) & 86) == 0 && (this.ep(var5 - 1, var6 - 1) & 108) == 0) {
                        this.mo(var5, var6, 0);
                    } else {
                        this.mo(var5, var6, 35);
                    }
                }
            }

        }
    }

    public void mo(int var1, int var2, int var3) {
        int var4 = var1 / 12;
        int var5 = var2 / 12;
        int var6 = (var1 - 1) / 12;
        int var7 = (var2 - 1) / 12;
        this.bp(var4, var5, var1, var2, var3);
        if (var4 != var6) {
            this.bp(var6, var5, var1, var2, var3);
        }

        if (var5 != var7) {
            this.bp(var4, var7, var1, var2, var3);
        }

        if (var4 != var6 && var5 != var7) {
            this.bp(var6, var7, var1, var2, var3);
        }

    }

    public void bp(int var1, int var2, int var3, int var4, int var5) {
        h var6 = this.xgb[var1 + var2 * 8];

        for(int var7 = 0; var7 < var6.hg; ++var7) {
            if (var6.ci[var7] == var3 * 128 && var6.ei[var7] == var4 * 128) {
                var6.ce(var7, var5);
                return;
            }
        }

    }

    public int ep(int var1, int var2) {
        return var1 >= 0 && var2 >= 0 && var1 < this.pgb && var2 < this.qgb ? this.ugb[var1][var2] : 0;
    }

    public int ho(int var1, int var2) {
        int var3 = var1 >> 7;
        int var4 = var2 >> 7;
        int var5 = var1 & 127;
        int var6 = var2 & 127;
        if (var3 >= 0 && var4 >= 0 && var3 < this.pgb - 1 && var4 < this.qgb - 1) {
            int var7;
            int var8;
            int var9;
            if (var5 <= 128 - var6) {
                var7 = this.no(var3, var4);
                var8 = this.no(var3 + 1, var4) - var7;
                var9 = this.no(var3, var4 + 1) - var7;
            } else {
                var7 = this.no(var3 + 1, var4 + 1);
                var8 = this.no(var3, var4 + 1) - var7;
                var9 = this.no(var3 + 1, var4) - var7;
                var5 = 128 - var5;
                var6 = 128 - var6;
            }

            int var10 = var7 + var8 * var5 / 128 + var9 * var6 / 128;
            return var10;
        } else {
            return 0;
        }
    }

    public int no(int var1, int var2) {
        if (var1 >= 0 && var1 < 96 && var2 >= 0 && var2 < 96) {
            byte var3 = 0;
            if (var1 >= 48 && var2 < 48) {
                var3 = 1;
                var1 -= 48;
            } else if (var1 < 48 && var2 >= 48) {
                var3 = 2;
                var2 -= 48;
            } else if (var1 >= 48 && var2 >= 48) {
                var3 = 3;
                var1 -= 48;
                var2 -= 48;
            }

            return (this.hgb[var3][var1 * 48 + var2] & 255) * 3;
        } else {
            return 0;
        }
    }

    public int zn(int var1, int var2) {
        if (var1 >= 0 && var1 < 96 && var2 >= 0 && var2 < 96) {
            byte var3 = 0;
            if (var1 >= 48 && var2 < 48) {
                var3 = 1;
                var1 -= 48;
            } else if (var1 < 48 && var2 >= 48) {
                var3 = 2;
                var2 -= 48;
            } else if (var1 >= 48 && var2 >= 48) {
                var3 = 3;
                var1 -= 48;
                var2 -= 48;
            }

            return this.igb[var3][var1 * 48 + var2] & 255;
        } else {
            return 0;
        }
    }

    public int po(int var1, int var2, int var3) {
        if (var1 >= 0 && var1 < 96 && var2 >= 0 && var2 < 96) {
            byte var4 = 0;
            if (var1 >= 48 && var2 < 48) {
                var4 = 1;
                var1 -= 48;
            } else if (var1 < 48 && var2 >= 48) {
                var4 = 2;
                var2 -= 48;
            } else if (var1 >= 48 && var2 >= 48) {
                var4 = 3;
                var1 -= 48;
                var2 -= 48;
            }

            return this.mgb[var4][var1 * 48 + var2] & 255;
        } else {
            return 0;
        }
    }

    public void lo(int var1, int var2, int var3) {
        if (var1 >= 0 && var1 < 96 && var2 >= 0 && var2 < 96) {
            byte var4 = 0;
            if (var1 >= 48 && var2 < 48) {
                var4 = 1;
                var1 -= 48;
            } else if (var1 < 48 && var2 >= 48) {
                var4 = 2;
                var2 -= 48;
            } else if (var1 >= 48 && var2 >= 48) {
                var4 = 3;
                var1 -= 48;
                var2 -= 48;
            }

            this.mgb[var4][var1 * 48 + var2] = (byte)var3;
        }
    }

    public int vo(int var1, int var2, int var3) {
        int var4 = this.po(var1, var2, var3);
        if (var4 == 0) {
            return -1;
        } else {
            int var5 = r.elb[var4 - 1];
            return var5 == 2 ? 1 : 0;
        }
    }

    public int fo(int var1, int var2, int var3, int var4) {
        int var5 = this.po(var1, var2, var3);
        return var5 == 0 ? var4 : r.dlb[var5 - 1];
    }

    public int eo(int var1, int var2) {
        if (var1 >= 0 && var1 < 96 && var2 >= 0 && var2 < 96) {
            byte var3 = 0;
            if (var1 >= 48 && var2 < 48) {
                var3 = 1;
                var1 -= 48;
            } else if (var1 < 48 && var2 >= 48) {
                var3 = 2;
                var2 -= 48;
            } else if (var1 >= 48 && var2 >= 48) {
                var3 = 3;
                var1 -= 48;
                var2 -= 48;
            }

            return this.ogb[var3][var1 * 48 + var2];
        } else {
            return 0;
        }
    }

    public int uo(int var1, int var2) {
        if (var1 >= 0 && var1 < 96 && var2 >= 0 && var2 < 96) {
            byte var3 = 0;
            if (var1 >= 48 && var2 < 48) {
                var3 = 1;
                var1 -= 48;
            } else if (var1 < 48 && var2 >= 48) {
                var3 = 2;
                var2 -= 48;
            } else if (var1 >= 48 && var2 >= 48) {
                var3 = 3;
                var1 -= 48;
                var2 -= 48;
            }

            return this.lgb[var3][var1 * 48 + var2];
        } else {
            return 0;
        }
    }

    public int bo(int var1, int var2) {
        if (var1 >= 0 && var1 < 96 && var2 >= 0 && var2 < 96) {
            byte var3 = 0;
            if (var1 >= 48 && var2 < 48) {
                var3 = 1;
                var1 -= 48;
            } else if (var1 < 48 && var2 >= 48) {
                var3 = 2;
                var2 -= 48;
            } else if (var1 >= 48 && var2 >= 48) {
                var3 = 3;
                var1 -= 48;
                var2 -= 48;
            }

            return this.ngb[var3][var1 * 48 + var2];
        } else {
            return 0;
        }
    }

    public boolean xo(int var1, int var2) {
        return this.uo(var1, var2) > 0 || this.uo(var1 - 1, var2) > 0 || this.uo(var1 - 1, var2 - 1) > 0 || this.uo(var1, var2 - 1) > 0;
    }

    public boolean wo(int var1, int var2) {
        return this.uo(var1, var2) > 0 && this.uo(var1 - 1, var2) > 0 && this.uo(var1 - 1, var2 - 1) > 0 && this.uo(var1, var2 - 1) > 0;
    }

    public int io(int var1, int var2) {
        if (var1 >= 0 && var1 < 96 && var2 >= 0 && var2 < 96) {
            byte var3 = 0;
            if (var1 >= 48 && var2 < 48) {
                var3 = 1;
                var1 -= 48;
            } else if (var1 < 48 && var2 >= 48) {
                var3 = 2;
                var2 -= 48;
            } else if (var1 >= 48 && var2 >= 48) {
                var3 = 3;
                var1 -= 48;
                var2 -= 48;
            }

            return this.kgb[var3][var1 * 48 + var2] & 255;
        } else {
            return 0;
        }
    }

    public int ro(int var1, int var2) {
        if (var1 >= 0 && var1 < 96 && var2 >= 0 && var2 < 96) {
            byte var3 = 0;
            if (var1 >= 48 && var2 < 48) {
                var3 = 1;
                var1 -= 48;
            } else if (var1 < 48 && var2 >= 48) {
                var3 = 2;
                var2 -= 48;
            } else if (var1 >= 48 && var2 >= 48) {
                var3 = 3;
                var1 -= 48;
                var2 -= 48;
            }

            return this.jgb[var3][var1 * 48 + var2] & 255;
        } else {
            return 0;
        }
    }

    public void xn(int var1, int var2, int var3, int var4) {
        String var5 = "m" + var3 + var1 / 10 + var1 % 10 + var2 / 10 + var2 % 10;

        try {
            byte[] var18;
            if (this.ufb) {
                var18 = o.gn(var5 + ".jm", 0, this.ggb);
                if (var18 == null || var18.length == 0) {
                    throw new IOException("Map not defined");
                }
            } else {
                var18 = new byte[20736];
                o.en("../gamedata/maps/" + var5 + ".jm", var18, 20736);
            }

            int var7 = 0;
            int var8 = 0;

            for(int var9 = 0; var9 < 2304; ++var9) {
                var7 = var7 + var18[var8++] & 255;
                this.hgb[var4][var9] = (byte)var7;
            }

            var7 = 0;

            for(int var10 = 0; var10 < 2304; ++var10) {
                var7 = var7 + var18[var8++] & 255;
                this.igb[var4][var10] = (byte)var7;
            }

            for(int var11 = 0; var11 < 2304; ++var11) {
                this.jgb[var4][var11] = var18[var8++];
            }

            for(int var12 = 0; var12 < 2304; ++var12) {
                this.kgb[var4][var12] = var18[var8++];
            }

            for(int var13 = 0; var13 < 2304; ++var13) {
                this.ogb[var4][var13] = (var18[var8] & 255) * 256 + (var18[var8 + 1] & 255);
                var8 += 2;
            }

            for(int var14 = 0; var14 < 2304; ++var14) {
                this.lgb[var4][var14] = var18[var8++];
            }

            for(int var15 = 0; var15 < 2304; ++var15) {
                this.mgb[var4][var15] = var18[var8++];
            }

            for(int var16 = 0; var16 < 2304; ++var16) {
                this.ngb[var4][var16] = var18[var8++];
            }

        } catch (IOException var17) {
            for(int var6 = 0; var6 < 2304; ++var6) {
                this.hgb[var4][var6] = 0;
                this.igb[var4][var6] = 0;
                this.jgb[var4][var6] = 0;
                this.kgb[var4][var6] = 0;
                this.ogb[var4][var6] = 0;
                this.lgb[var4][var6] = 0;
                this.mgb[var4][var6] = 0;
                if (var3 == 0) {
                    this.mgb[var4][var6] = -6;
                }

                if (var3 == 3) {
                    this.mgb[var4][var6] = 8;
                }

                this.ngb[var4][var6] = 0;
            }

        }
    }

    public void dp() {
        this.xfb.xi();

        for(int var1 = 0; var1 < 64; ++var1) {
            this.xgb[var1] = null;

            for(int var2 = 0; var2 < 4; ++var2) {
                this.ygb[var2][var1] = null;
            }

            for(int var3 = 0; var3 < 4; ++var3) {
                this.zgb[var3][var1] = null;
            }
        }

        System.gc();
    }

    public void qo(int var1, int var2, int var3) {
        this.dp();
        int var4 = (var1 + 24) / 48;
        int var5 = (var2 + 24) / 48;
        this.do_(var1, var2, var3, true);
        if (var3 == 0) {
            this.do_(var1, var2, 1, false);
            this.do_(var1, var2, 2, false);
            this.xn(var4 - 1, var5 - 1, var3, 0);
            this.xn(var4, var5 - 1, var3, 1);
            this.xn(var4 - 1, var5, var3, 2);
            this.xn(var4, var5, var3, 3);
            this.ko();
        }

    }

    public void ko() {
        for(int var1 = 0; var1 < 96; ++var1) {
            for(int var2 = 0; var2 < 96; ++var2) {
                if (this.po(var1, var2, 0) == 250) {
                    if (var1 == 47 && this.po(var1 + 1, var2, 0) != 250 && this.po(var1 + 1, var2, 0) != 2) {
                        this.lo(var1, var2, 9);
                    } else if (var2 == 47 && this.po(var1, var2 + 1, 0) != 250 && this.po(var1, var2 + 1, 0) != 2) {
                        this.lo(var1, var2, 9);
                    } else {
                        this.lo(var1, var2, 2);
                    }
                }
            }
        }

    }

    public void co(int var1, int var2, int var3, int var4, int var5) {
        int var6 = var1 * 3;
        int var7 = var2 * 3;
        int var8 = this.xfb.yi(var4);
        int var9 = this.xfb.yi(var5);
        var8 = var8 >> 1 & 8355711;
        var9 = var9 >> 1 & 8355711;
        if (var3 == 0) {
            this.wfb.ug(var6, var7, 3, var8);
            this.wfb.ug(var6, var7 + 1, 2, var8);
            this.wfb.ug(var6, var7 + 2, 1, var8);
            this.wfb.ug(var6 + 2, var7 + 1, 1, var9);
            this.wfb.ug(var6 + 1, var7 + 2, 2, var9);
        } else {
            if (var3 == 1) {
                this.wfb.ug(var6, var7, 3, var9);
                this.wfb.ug(var6 + 1, var7 + 1, 2, var9);
                this.wfb.ug(var6 + 2, var7 + 2, 1, var9);
                this.wfb.ug(var6, var7 + 1, 1, var8);
                this.wfb.ug(var6, var7 + 2, 2, var8);
            }

        }
    }

    public void do_(int var1, int var2, int var3, boolean var4) {
        int var5 = (var1 + 24) / 48;
        int var6 = (var2 + 24) / 48;
        this.xn(var5 - 1, var6 - 1, var3, 0);
        this.xn(var5, var6 - 1, var3, 1);
        this.xn(var5 - 1, var6, var3, 2);
        this.xn(var5, var6, var3, 3);
        this.ko();
        if (this.ahb == null) {
            this.ahb = new h(this.pgb * this.qgb * 2 + 256, this.pgb * this.qgb * 2 + 256, true, true, false, false, true);
        }

        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var17;
        int var18;
        int var20;
        int var42;
        int var43;
        if (var4) {
            this.wfb.pf();

            for(var7 = 0; var7 < 96; ++var7) {
                for(var8 = 0; var8 < 96; ++var8) {
                    this.ugb[var7][var8] = 0;
                }
            }

            h var40 = this.ahb;
            var40.bf();

            for(var9 = 0; var9 < 96; ++var9) {
                for(var10 = 0; var10 < 96; ++var10) {
                    var11 = -this.no(var9, var10);
                    if (this.po(var9, var10, var3) > 0 && r.elb[this.po(var9, var10, var3) - 1] == 4) {
                        var11 = 0;
                    }

                    if (this.po(var9 - 1, var10, var3) > 0 && r.elb[this.po(var9 - 1, var10, var3) - 1] == 4) {
                        var11 = 0;
                    }

                    if (this.po(var9, var10 - 1, var3) > 0 && r.elb[this.po(var9, var10 - 1, var3) - 1] == 4) {
                        var11 = 0;
                    }

                    if (this.po(var9 - 1, var10 - 1, var3) > 0 && r.elb[this.po(var9 - 1, var10 - 1, var3) - 1] == 4) {
                        var11 = 0;
                    }

                    var12 = var40.se(var9 * 128, var11, var10 * 128);
                    var13 = (int)(Math.random() * 10.0D) - 5;
                    var40.ce(var12, var13);
                }
            }

            int[] var41;
            for(var10 = 0; var10 < 95; ++var10) {
                for(var11 = 0; var11 < 95; ++var11) {
                    var12 = this.zn(var10, var11);
                    var13 = this.bgb[var12];
                    var14 = var13;
                    var15 = var13;
                    byte var16 = 0;
                    if (var3 == 1 || var3 == 2) {
                        var13 = 12345678;
                        var14 = 12345678;
                        var15 = 12345678;
                    }

                    if (this.po(var10, var11, var3) > 0) {
                        var17 = this.po(var10, var11, var3);
                        var12 = r.elb[var17 - 1];
                        var18 = this.vo(var10, var11, var3);
                        var13 = var14 = r.dlb[var17 - 1];
                        if (var12 == 4) {
                            var13 = 1;
                            var14 = 1;
                        }

                        if (var12 == 5) {
                            if (this.eo(var10, var11) > 0 && this.eo(var10, var11) < 24000) {
                                if (this.fo(var10 - 1, var11, var3, var15) != 12345678 && this.fo(var10, var11 - 1, var3, var15) != 12345678) {
                                    var13 = this.fo(var10 - 1, var11, var3, var15);
                                    var16 = 0;
                                } else if (this.fo(var10 + 1, var11, var3, var15) != 12345678 && this.fo(var10, var11 + 1, var3, var15) != 12345678) {
                                    var14 = this.fo(var10 + 1, var11, var3, var15);
                                    var16 = 0;
                                } else if (this.fo(var10 + 1, var11, var3, var15) != 12345678 && this.fo(var10, var11 - 1, var3, var15) != 12345678) {
                                    var14 = this.fo(var10 + 1, var11, var3, var15);
                                    var16 = 1;
                                } else if (this.fo(var10 - 1, var11, var3, var15) != 12345678 && this.fo(var10, var11 + 1, var3, var15) != 12345678) {
                                    var13 = this.fo(var10 - 1, var11, var3, var15);
                                    var16 = 1;
                                }
                            }
                        } else if (var12 != 2 || this.eo(var10, var11) > 0 && this.eo(var10, var11) < 24000) {
                            if (this.vo(var10 - 1, var11, var3) != var18 && this.vo(var10, var11 - 1, var3) != var18) {
                                var13 = var15;
                                var16 = 0;
                            } else if (this.vo(var10 + 1, var11, var3) != var18 && this.vo(var10, var11 + 1, var3) != var18) {
                                var14 = var15;
                                var16 = 0;
                            } else if (this.vo(var10 + 1, var11, var3) != var18 && this.vo(var10, var11 - 1, var3) != var18) {
                                var14 = var15;
                                var16 = 1;
                            } else if (this.vo(var10 - 1, var11, var3) != var18 && this.vo(var10, var11 + 1, var3) != var18) {
                                var13 = var15;
                                var16 = 1;
                            }
                        }

                        if (r.flb[var17 - 1] != 0) {
                            this.ugb[var10][var11] |= 64;
                        }

                        if (r.elb[var17 - 1] == 2) {
                            this.ugb[var10][var11] |= 128;
                        }
                    }

                    this.co(var10, var11, var16, var13, var14);
                    var17 = this.no(var10 + 1, var11 + 1) - this.no(var10 + 1, var11) + this.no(var10, var11 + 1) - this.no(var10, var11);
                    if (var13 == var14 && var17 == 0) {
                        if (var13 != 12345678) {
                            var41 = new int[]{var11 + var10 * this.pgb + this.pgb, var11 + var10 * this.pgb, var11 + var10 * this.pgb + 1, var11 + var10 * this.pgb + this.pgb + 1};
                            var42 = var40.re(4, var41, 12345678, var13);
                            this.rgb[var42] = var10;
                            this.sgb[var42] = var11;
                            var40.oh[var42] = 200000 + var42;
                        }
                    } else {
                        var41 = new int[3];
                        int[] var19 = new int[3];
                        if (var16 == 0) {
                            if (var13 != 12345678) {
                                var41[0] = var11 + var10 * this.pgb + this.pgb;
                                var41[1] = var11 + var10 * this.pgb;
                                var41[2] = var11 + var10 * this.pgb + 1;
                                var20 = var40.re(3, var41, 12345678, var13);
                                this.rgb[var20] = var10;
                                this.sgb[var20] = var11;
                                var40.oh[var20] = 200000 + var20;
                            }

                            if (var14 != 12345678) {
                                var19[0] = var11 + var10 * this.pgb + 1;
                                var19[1] = var11 + var10 * this.pgb + this.pgb + 1;
                                var19[2] = var11 + var10 * this.pgb + this.pgb;
                                var20 = var40.re(3, var19, 12345678, var14);
                                this.rgb[var20] = var10;
                                this.sgb[var20] = var11;
                                var40.oh[var20] = 200000 + var20;
                            }
                        } else {
                            if (var13 != 12345678) {
                                var41[0] = var11 + var10 * this.pgb + 1;
                                var41[1] = var11 + var10 * this.pgb + this.pgb + 1;
                                var41[2] = var11 + var10 * this.pgb;
                                var20 = var40.re(3, var41, 12345678, var13);
                                this.rgb[var20] = var10;
                                this.sgb[var20] = var11;
                                var40.oh[var20] = 200000 + var20;
                            }

                            if (var14 != 12345678) {
                                var19[0] = var11 + var10 * this.pgb + this.pgb;
                                var19[1] = var11 + var10 * this.pgb;
                                var19[2] = var11 + var10 * this.pgb + this.pgb + 1;
                                var20 = var40.re(3, var19, 12345678, var14);
                                this.rgb[var20] = var10;
                                this.sgb[var20] = var11;
                                var40.oh[var20] = 200000 + var20;
                            }
                        }
                    }
                }
            }

            for(var11 = 1; var11 < 95; ++var11) {
                for(var12 = 1; var12 < 95; ++var12) {
                    if (this.po(var11, var12, var3) > 0 && r.elb[this.po(var11, var12, var3) - 1] == 4) {
                        var13 = r.dlb[this.po(var11, var12, var3) - 1];
                        var14 = var40.se(var11 * 128, -this.no(var11, var12), var12 * 128);
                        var15 = var40.se((var11 + 1) * 128, -this.no(var11 + 1, var12), var12 * 128);
                        var43 = var40.se((var11 + 1) * 128, -this.no(var11 + 1, var12 + 1), (var12 + 1) * 128);
                        var17 = var40.se(var11 * 128, -this.no(var11, var12 + 1), (var12 + 1) * 128);
                        var41 = new int[]{var14, var15, var43, var17};
                        var42 = var40.re(4, var41, var13, 12345678);
                        this.rgb[var42] = var11;
                        this.sgb[var42] = var12;
                        var40.oh[var42] = 200000 + var42;
                        this.co(var11, var12, 0, var13, var13);
                    } else if (this.po(var11, var12, var3) == 0 || r.elb[this.po(var11, var12, var3) - 1] != 3) {
                        if (this.po(var11, var12 + 1, var3) > 0 && r.elb[this.po(var11, var12 + 1, var3) - 1] == 4) {
                            var13 = r.dlb[this.po(var11, var12 + 1, var3) - 1];
                            var14 = var40.se(var11 * 128, -this.no(var11, var12), var12 * 128);
                            var15 = var40.se((var11 + 1) * 128, -this.no(var11 + 1, var12), var12 * 128);
                            var43 = var40.se((var11 + 1) * 128, -this.no(var11 + 1, var12 + 1), (var12 + 1) * 128);
                            var17 = var40.se(var11 * 128, -this.no(var11, var12 + 1), (var12 + 1) * 128);
                            var41 = new int[]{var14, var15, var43, var17};
                            var42 = var40.re(4, var41, var13, 12345678);
                            this.rgb[var42] = var11;
                            this.sgb[var42] = var12;
                            var40.oh[var42] = 200000 + var42;
                            this.co(var11, var12, 0, var13, var13);
                        }

                        if (this.po(var11, var12 - 1, var3) > 0 && r.elb[this.po(var11, var12 - 1, var3) - 1] == 4) {
                            var13 = r.dlb[this.po(var11, var12 - 1, var3) - 1];
                            var14 = var40.se(var11 * 128, -this.no(var11, var12), var12 * 128);
                            var15 = var40.se((var11 + 1) * 128, -this.no(var11 + 1, var12), var12 * 128);
                            var43 = var40.se((var11 + 1) * 128, -this.no(var11 + 1, var12 + 1), (var12 + 1) * 128);
                            var17 = var40.se(var11 * 128, -this.no(var11, var12 + 1), (var12 + 1) * 128);
                            var41 = new int[]{var14, var15, var43, var17};
                            var42 = var40.re(4, var41, var13, 12345678);
                            this.rgb[var42] = var11;
                            this.sgb[var42] = var12;
                            var40.oh[var42] = 200000 + var42;
                            this.co(var11, var12, 0, var13, var13);
                        }

                        if (this.po(var11 + 1, var12, var3) > 0 && r.elb[this.po(var11 + 1, var12, var3) - 1] == 4) {
                            var13 = r.dlb[this.po(var11 + 1, var12, var3) - 1];
                            var14 = var40.se(var11 * 128, -this.no(var11, var12), var12 * 128);
                            var15 = var40.se((var11 + 1) * 128, -this.no(var11 + 1, var12), var12 * 128);
                            var43 = var40.se((var11 + 1) * 128, -this.no(var11 + 1, var12 + 1), (var12 + 1) * 128);
                            var17 = var40.se(var11 * 128, -this.no(var11, var12 + 1), (var12 + 1) * 128);
                            var41 = new int[]{var14, var15, var43, var17};
                            var42 = var40.re(4, var41, var13, 12345678);
                            this.rgb[var42] = var11;
                            this.sgb[var42] = var12;
                            var40.oh[var42] = 200000 + var42;
                            this.co(var11, var12, 0, var13, var13);
                        }

                        if (this.po(var11 - 1, var12, var3) > 0 && r.elb[this.po(var11 - 1, var12, var3) - 1] == 4) {
                            var13 = r.dlb[this.po(var11 - 1, var12, var3) - 1];
                            var14 = var40.se(var11 * 128, -this.no(var11, var12), var12 * 128);
                            var15 = var40.se((var11 + 1) * 128, -this.no(var11 + 1, var12), var12 * 128);
                            var43 = var40.se((var11 + 1) * 128, -this.no(var11 + 1, var12 + 1), (var12 + 1) * 128);
                            var17 = var40.se(var11 * 128, -this.no(var11, var12 + 1), (var12 + 1) * 128);
                            var41 = new int[]{var14, var15, var43, var17};
                            var42 = var40.re(4, var41, var13, 12345678);
                            this.rgb[var42] = var11;
                            this.sgb[var42] = var12;
                            var40.oh[var42] = 200000 + var42;
                            this.co(var11, var12, 0, var13, var13);
                        }
                    }
                }
            }

            var40.we(true, 40, 48, -50, -10, -50);
            this.xgb = this.ahb.zd(0, 0, 1536, 1536, 8, 64, 233, false);

            for(var12 = 0; var12 < 64; ++var12) {
                this.xfb.yh(this.xgb[var12]);
            }

            for(var13 = 0; var13 < 96; ++var13) {
                for(var14 = 0; var14 < 96; ++var14) {
                    this.vgb[var13][var14] = this.no(var13, var14);
                }
            }
        }

        this.ahb.bf();
        var7 = 6316128;

        for(var8 = 0; var8 < 95; ++var8) {
            for(var9 = 0; var9 < 95; ++var9) {
                var10 = this.io(var8, var9);
                if (var10 > 0 && (r.vkb[var10 - 1] == 0 || this.vfb)) {
                    this.cp(this.ahb, var10 - 1, var8, var9, var8 + 1, var9);
                    if (var4 && r.tkb[var10 - 1] != 0) {
                        this.ugb[var8][var9] |= 1;
                        if (var9 > 0) {
                            this.zo(var8, var9 - 1, 4);
                        }
                    }

                    if (var4) {
                        this.wfb.ug(var8 * 3, var9 * 3, 3, var7);
                    }
                }

                var10 = this.ro(var8, var9);
                if (var10 > 0 && (r.vkb[var10 - 1] == 0 || this.vfb)) {
                    this.cp(this.ahb, var10 - 1, var8, var9, var8, var9 + 1);
                    if (var4 && r.tkb[var10 - 1] != 0) {
                        this.ugb[var8][var9] |= 2;
                        if (var8 > 0) {
                            this.zo(var8 - 1, var9, 8);
                        }
                    }

                    if (var4) {
                        this.wfb.zg(var8 * 3, var9 * 3, 3, var7);
                    }
                }

                var10 = this.eo(var8, var9);
                if (var10 > 0 && var10 < 12000 && (r.vkb[var10 - 1] == 0 || this.vfb)) {
                    this.cp(this.ahb, var10 - 1, var8, var9, var8 + 1, var9 + 1);
                    if (var4 && r.tkb[var10 - 1] != 0) {
                        this.ugb[var8][var9] |= 32;
                    }

                    if (var4) {
                        this.wfb.og(var8 * 3, var9 * 3, var7);
                        this.wfb.og(var8 * 3 + 1, var9 * 3 + 1, var7);
                        this.wfb.og(var8 * 3 + 2, var9 * 3 + 2, var7);
                    }
                }

                if (var10 > 12000 && var10 < 24000 && (r.vkb[var10 - 12001] == 0 || this.vfb)) {
                    this.cp(this.ahb, var10 - 12001, var8 + 1, var9, var8, var9 + 1);
                    if (var4 && r.tkb[var10 - 12001] != 0) {
                        this.ugb[var8][var9] |= 16;
                    }

                    if (var4) {
                        this.wfb.og(var8 * 3 + 2, var9 * 3, var7);
                        this.wfb.og(var8 * 3 + 1, var9 * 3 + 1, var7);
                        this.wfb.og(var8 * 3, var9 * 3 + 2, var7);
                    }
                }
            }
        }

        if (var4) {
            this.wfb.of(this.yfb - 1, 0, 0, 285, 285);
        }

        this.ahb.we(false, 60, 24, -50, -10, -50);
        this.ygb[var3] = this.ahb.zd(0, 0, 1536, 1536, 8, 64, 338, true);

        for(var9 = 0; var9 < 64; ++var9) {
            this.xfb.yh(this.ygb[var3][var9]);
        }

        for(var10 = 0; var10 < 95; ++var10) {
            for(var11 = 0; var11 < 95; ++var11) {
                var12 = this.io(var10, var11);
                if (var12 > 0) {
                    this.to(var12 - 1, var10, var11, var10 + 1, var11);
                }

                var12 = this.ro(var10, var11);
                if (var12 > 0) {
                    this.to(var12 - 1, var10, var11, var10, var11 + 1);
                }

                var12 = this.eo(var10, var11);
                if (var12 > 0 && var12 < 12000) {
                    this.to(var12 - 1, var10, var11, var10 + 1, var11 + 1);
                }

                if (var12 > 12000 && var12 < 24000) {
                    this.to(var12 - 12001, var10 + 1, var11, var10, var11 + 1);
                }
            }
        }

        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        for(var11 = 1; var11 < 95; ++var11) {
            for(var12 = 1; var12 < 95; ++var12) {
                var13 = this.uo(var11, var12);
                if (var13 > 0) {
                    var43 = var11 + 1;
                    var18 = var11 + 1;
                    var42 = var12 + 1;
                    int var21 = var12 + 1;
                    var22 = 0;
                    var23 = this.vgb[var11][var12];
                    var24 = this.vgb[var43][var12];
                    var25 = this.vgb[var18][var42];
                    var26 = this.vgb[var11][var21];
                    if (var23 > 80000) {
                        var23 -= 80000;
                    }

                    if (var24 > 80000) {
                        var24 -= 80000;
                    }

                    if (var25 > 80000) {
                        var25 -= 80000;
                    }

                    if (var26 > 80000) {
                        var26 -= 80000;
                    }

                    if (var23 > var22) {
                        var22 = var23;
                    }

                    if (var24 > var22) {
                        var22 = var24;
                    }

                    if (var25 > var22) {
                        var22 = var25;
                    }

                    if (var26 > var22) {
                        var22 = var26;
                    }

                    if (var22 >= 80000) {
                        var22 -= 80000;
                    }

                    if (var23 < 80000) {
                        this.vgb[var11][var12] = var22;
                    } else {
                        this.vgb[var11][var12] -= 80000;
                    }

                    if (var24 < 80000) {
                        this.vgb[var43][var12] = var22;
                    } else {
                        this.vgb[var43][var12] -= 80000;
                    }

                    if (var25 < 80000) {
                        this.vgb[var18][var42] = var22;
                    } else {
                        this.vgb[var18][var42] -= 80000;
                    }

                    if (var26 < 80000) {
                        this.vgb[var11][var21] = var22;
                    } else {
                        this.vgb[var11][var21] -= 80000;
                    }
                }
            }
        }

        this.ahb.bf();

        for(var12 = 1; var12 < 95; ++var12) {
            for(var13 = 1; var13 < 95; ++var13) {
                var14 = this.uo(var12, var13);
                if (var14 > 0) {
                    var17 = var12 + 1;
                    var42 = var12 + 1;
                    var20 = var13 + 1;
                    var22 = var13 + 1;
                    var23 = var12 * 128;
                    var24 = var13 * 128;
                    var25 = var23 + 128;
                    var26 = var24 + 128;
                    int var27 = var23;
                    int var28 = var24;
                    int var29 = var25;
                    int var30 = var26;
                    int var31 = this.vgb[var12][var13];
                    int var32 = this.vgb[var17][var13];
                    int var33 = this.vgb[var42][var20];
                    int var34 = this.vgb[var12][var22];
                    int var35 = r.ykb[var14 - 1];
                    if (this.wo(var12, var13) && var31 < 80000) {
                        var31 += var35 + 80000;
                        this.vgb[var12][var13] = var31;
                    }

                    if (this.wo(var17, var13) && var32 < 80000) {
                        var32 += var35 + 80000;
                        this.vgb[var17][var13] = var32;
                    }

                    if (this.wo(var42, var20) && var33 < 80000) {
                        var33 += var35 + 80000;
                        this.vgb[var42][var20] = var33;
                    }

                    if (this.wo(var12, var22) && var34 < 80000) {
                        var34 += var35 + 80000;
                        this.vgb[var12][var22] = var34;
                    }

                    if (var31 >= 80000) {
                        var31 -= 80000;
                    }

                    if (var32 >= 80000) {
                        var32 -= 80000;
                    }

                    if (var33 >= 80000) {
                        var33 -= 80000;
                    }

                    if (var34 >= 80000) {
                        var34 -= 80000;
                    }

                    byte var36 = 16;
                    if (!this.xo(var12 - 1, var13)) {
                        var23 -= var36;
                    }

                    if (!this.xo(var12 + 1, var13)) {
                        var23 += var36;
                    }

                    if (!this.xo(var12, var13 - 1)) {
                        var24 -= var36;
                    }

                    if (!this.xo(var12, var13 + 1)) {
                        var24 += var36;
                    }

                    if (!this.xo(var17 - 1, var13)) {
                        var25 -= var36;
                    }

                    if (!this.xo(var17 + 1, var13)) {
                        var25 += var36;
                    }

                    if (!this.xo(var17, var13 - 1)) {
                        var28 = var24 - var36;
                    }

                    if (!this.xo(var17, var13 + 1)) {
                        var28 += var36;
                    }

                    if (!this.xo(var42 - 1, var20)) {
                        var29 = var25 - var36;
                    }

                    if (!this.xo(var42 + 1, var20)) {
                        var29 += var36;
                    }

                    if (!this.xo(var42, var20 - 1)) {
                        var26 -= var36;
                    }

                    if (!this.xo(var42, var20 + 1)) {
                        var26 += var36;
                    }

                    if (!this.xo(var12 - 1, var22)) {
                        var27 = var23 - var36;
                    }

                    if (!this.xo(var12 + 1, var22)) {
                        var27 += var36;
                    }

                    if (!this.xo(var12, var22 - 1)) {
                        var30 = var26 - var36;
                    }

                    if (!this.xo(var12, var22 + 1)) {
                        var30 += var36;
                    }

                    var14 = r.alb[var14 - 1];
                    var31 = -var31;
                    var32 = -var32;
                    var33 = -var33;
                    var34 = -var34;
                    int[] var44;
                    if (this.eo(var12, var13) > 12000 && this.eo(var12, var13) < 24000 && this.uo(var12 - 1, var13 - 1) == 0) {
                        var44 = new int[]{this.ahb.se(var29, var33, var26), this.ahb.se(var27, var34, var30), this.ahb.se(var25, var32, var28)};
                        this.ahb.re(3, var44, var14, 12345678);
                    } else if (this.eo(var12, var13) > 12000 && this.eo(var12, var13) < 24000 && this.uo(var12 + 1, var13 + 1) == 0) {
                        var44 = new int[]{this.ahb.se(var23, var31, var24), this.ahb.se(var25, var32, var28), this.ahb.se(var27, var34, var30)};
                        this.ahb.re(3, var44, var14, 12345678);
                    } else if (this.eo(var12, var13) > 0 && this.eo(var12, var13) < 12000 && this.uo(var12 + 1, var13 - 1) == 0) {
                        var44 = new int[]{this.ahb.se(var27, var34, var30), this.ahb.se(var23, var31, var24), this.ahb.se(var29, var33, var26)};
                        this.ahb.re(3, var44, var14, 12345678);
                    } else if (this.eo(var12, var13) > 0 && this.eo(var12, var13) < 12000 && this.uo(var12 - 1, var13 + 1) == 0) {
                        var44 = new int[]{this.ahb.se(var25, var32, var28), this.ahb.se(var29, var33, var26), this.ahb.se(var23, var31, var24)};
                        this.ahb.re(3, var44, var14, 12345678);
                    } else if (var31 == var32 && var33 == var34) {
                        var44 = new int[]{this.ahb.se(var23, var31, var24), this.ahb.se(var25, var32, var28), this.ahb.se(var29, var33, var26), this.ahb.se(var27, var34, var30)};
                        this.ahb.re(4, var44, var14, 12345678);
                    } else if (var31 == var34 && var32 == var33) {
                        var44 = new int[]{this.ahb.se(var27, var34, var30), this.ahb.se(var23, var31, var24), this.ahb.se(var25, var32, var28), this.ahb.se(var29, var33, var26)};
                        this.ahb.re(4, var44, var14, 12345678);
                    } else {
                        boolean var37 = true;
                        if (this.uo(var12 - 1, var13 - 1) > 0) {
                            var37 = false;
                        }

                        if (this.uo(var12 + 1, var13 + 1) > 0) {
                            var37 = false;
                        }

                        int[] var38;
                        int[] var39;
                        if (!var37) {
                            var38 = new int[]{this.ahb.se(var25, var32, var28), this.ahb.se(var29, var33, var26), this.ahb.se(var23, var31, var24)};
                            this.ahb.re(3, var38, var14, 12345678);
                            var39 = new int[]{this.ahb.se(var27, var34, var30), this.ahb.se(var23, var31, var24), this.ahb.se(var29, var33, var26)};
                            this.ahb.re(3, var39, var14, 12345678);
                        } else {
                            var38 = new int[]{this.ahb.se(var23, var31, var24), this.ahb.se(var25, var32, var28), this.ahb.se(var27, var34, var30)};
                            this.ahb.re(3, var38, var14, 12345678);
                            var39 = new int[]{this.ahb.se(var29, var33, var26), this.ahb.se(var27, var34, var30), this.ahb.se(var25, var32, var28)};
                            this.ahb.re(3, var39, var14, 12345678);
                        }
                    }
                }
            }
        }

        this.ahb.we(true, 50, 50, -50, -10, -50);
        this.zgb[var3] = this.ahb.zd(0, 0, 1536, 1536, 8, 64, 169, true);

        for(var13 = 0; var13 < 64; ++var13) {
            this.xfb.yh(this.zgb[var3][var13]);
        }

        for(var14 = 0; var14 < 96; ++var14) {
            for(var15 = 0; var15 < 96; ++var15) {
                if (this.vgb[var14][var15] >= 80000) {
                    this.vgb[var14][var15] -= 80000;
                }
            }
        }

    }

    public void jo(h[] var1) {
        for(int var2 = 0; var2 < this.pgb - 2; ++var2) {
            for(int var3 = 0; var3 < this.qgb - 2; ++var3) {
                if (this.eo(var2, var3) > 48000 && this.eo(var2, var3) < 60000) {
                    int var4 = this.eo(var2, var3) - '뮁';
                    int var5 = this.bo(var2, var3);
                    int var6;
                    int var7;
                    if (var5 != 0 && var5 != 4) {
                        var7 = r.gkb[var4];
                        var6 = r.hkb[var4];
                    } else {
                        var6 = r.gkb[var4];
                        var7 = r.hkb[var4];
                    }

                    this.oo(var2, var3, var4);
                    h var8 = var1[r.fkb[var4]].ye(false, true, false, false);
                    int var9 = (var2 + var2 + var6) * 128 / 2;
                    int var10 = (var3 + var3 + var7) * 128 / 2;
                    var8.ee(var9, -this.ho(var9, var10), var10);
                    var8.oe(0, this.bo(var2, var3) * 32, 0);
                    this.xfb.yh(var8);
                    var8.we(true, 48, 48, -50, -10, -50);
                    if (var6 > 1 || var7 > 1) {
                        for(int var11 = var2; var11 < var2 + var6; ++var11) {
                            for(int var12 = var3; var12 < var3 + var7; ++var12) {
                                if ((var11 > var2 || var12 > var3) && this.eo(var11, var12) - '뮁' == var4) {
                                    var9 = var11;
                                    var10 = var12;
                                    byte var13 = 0;
                                    if (var11 >= 48 && var12 < 48) {
                                        var13 = 1;
                                        var9 = var11 - 48;
                                    } else if (var11 < 48 && var12 >= 48) {
                                        var13 = 2;
                                        var10 = var12 - 48;
                                    } else if (var11 >= 48 && var12 >= 48) {
                                        var13 = 3;
                                        var9 = var11 - 48;
                                        var10 = var12 - 48;
                                    }

                                    this.ogb[var13][var9 * 48 + var10] = 0;
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    public void cp(h var1, int var2, int var3, int var4, int var5, int var6) {
        this.mo(var3, var4, 40);
        this.mo(var5, var6, 40);
        int var7 = r.qkb[var2];
        int var8 = r.rkb[var2];
        int var9 = r.skb[var2];
        int var10 = var3 * 128;
        int var11 = var4 * 128;
        int var12 = var5 * 128;
        int var13 = var6 * 128;
        int var14 = var1.se(var10, -this.vgb[var3][var4], var11);
        int var15 = var1.se(var10, -this.vgb[var3][var4] - var7, var11);
        int var16 = var1.se(var12, -this.vgb[var5][var6] - var7, var13);
        int var17 = var1.se(var12, -this.vgb[var5][var6], var13);
        int[] var18 = new int[]{var14, var15, var16, var17};
        int var19 = var1.re(4, var18, var8, var9);
        if (r.vkb[var2] == 5) {
            var1.oh[var19] = 30000 + var2;
        } else {
            var1.oh[var19] = 0;
        }
    }

    public void to(int var1, int var2, int var3, int var4, int var5) {
        int var6 = r.qkb[var1];
        if (this.vgb[var2][var3] < 80000) {
            this.vgb[var2][var3] += 80000 + var6;
        }

        if (this.vgb[var4][var5] < 80000) {
            this.vgb[var4][var5] += 80000 + var6;
        }

    }
}
