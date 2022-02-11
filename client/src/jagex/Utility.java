package jagex;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Utility {
    public static URL jfb = null;
    static int[] kfb = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535};
    static String[] lfb = new String[]{"fuck", "bastard", "lesbian", "prostitut", "spastic", "vagina", "retard", "arsehole", "asshole", "tosser", "homosex", "hetrosex", "hitler", "urinate"};
    static String[] mfb = new String[]{"shit", "lesbo", "phuck", "bitch", "penis", "bisex", "sperm", "rapist", "shag", "slag", "slut", "clit", "cunt", "piss", "nazi", "urine"};
    static String[] nfb = new String[]{"wank", "naked", "fag", "niga", "nige", "gay", "rape", "cock", "homo", "twat", "arse", "crap"};
    static int ofb;
    static int[] pfb = new int[1000];
    static int[] qfb = new int[1000];
    static String[] rfb = new String[1000];
    static int[] sfb = new int[1000];
    static int[] tfb = new int[1000];

    public static InputStream fn(String var0) throws IOException {
        Object var1;
        if (jfb == null) {
            var1 = new FileInputStream(var0);
        } else {
            URL var2 = new URL(jfb, var0);
            var1 = var2.openStream();
        }

        return (InputStream)var1;
    }

    public static void en(String var0, byte[] var1, int var2) throws IOException {
        InputStream var3 = fn(var0);
        DataInputStream var4 = new DataInputStream(var3);

        try {
            var4.readFully(var1, 0, var2);
        } catch (EOFException var5) {
            ;
        }

        var4.close();
    }

    public static int qn(byte var0) {
        return var0 & 255;
    }

    public static int tn(byte[] var0, int var1) {
        return ((var0[var1] & 255) << 8) + (var0[var1 + 1] & 255);
    }

    public static int sn(byte[] var0, int var1) {
        return ((var0[var1] & 255) << 24) + ((var0[var1 + 1] & 255) << 16) + ((var0[var1 + 2] & 255) << 8) + (var0[var1 + 3] & 255);
    }

    public static long nn(byte[] var0, int var1) {
        return (((long)sn(var0, var1) & 4294967295L) << 32) + ((long)sn(var0, var1 + 4) & 4294967295L);
    }

    public static int un(byte[] var0, int var1) {
        int var2 = qn(var0[var1]) * 256 + qn(var0[var1 + 1]);
        if (var2 > 32767) {
            var2 -= 65536;
        }

        return var2;
    }

    public static int pn(byte[] var0, int var1, int var2) {
        int var3 = var1 >> 3;
        int var4 = 8 - (var1 & 7);

        int var5;
        for(var5 = 0; var2 > var4; var4 = 8) {
            var5 += (var0[var3++] & kfb[var4]) << var2 - var4;
            var2 -= var4;
        }

        if (var2 == var4) {
            var5 += var0[var3] & kfb[var4];
        } else {
            var5 += var0[var3] >> var4 - var2 & kfb[var2];
        }

        return var5;
    }

    public static String vn(String var0, int var1) {
        String var2 = "";

        for(int var3 = 0; var3 < var1; ++var3) {
            if (var3 >= var0.length()) {
                var2 = var2 + " ";
            } else {
                char var4 = var0.charAt(var3);
                if (var4 >= 'a' && var4 <= 'z') {
                    var2 = var2 + var4;
                } else if (var4 >= 'A' && var4 <= 'Z') {
                    var2 = var2 + var4;
                } else if (var4 >= '0' && var4 <= '9') {
                    var2 = var2 + var4;
                } else {
                    var2 = var2 + '_';
                }
            }
        }

        return var2;
    }

    public static String makeLength(String var0, int desiredLength) {
        while(var0.length() < desiredLength) {
            var0 = var0 + " ";
        }

        if (var0.length() > desiredLength) {
            var0 = var0.substring(0, desiredLength);
        }

        return var0;
    }

    public static long ln(String var0) {
        var0 = var0.trim();
        var0 = var0.toLowerCase();
        long var1 = 0L;

        for(int var3 = 0; var3 < var0.length(); ++var3) {
            char var4 = var0.charAt(var3);
            var1 = var1 * 47L * (var1 - (long)(var4 * 6) - (long)(var3 * 7));
            var1 += (long)(var4 - 32 + var3 * var4);
        }

        return var1;
    }

    public static long on(String var0) {
        String var1 = "";

        for(int var2 = 0; var2 < var0.length(); ++var2) {
            char var3 = var0.charAt(var2);
            if (var3 >= 'a' && var3 <= 'z') {
                var1 = var1 + var3;
            } else if (var3 >= 'A' && var3 <= 'Z') {
                var1 = var1 + (char)(var3 + 97 - 65);
            } else if (var3 >= '0' && var3 <= '9') {
                var1 = var1 + var3;
            } else {
                var1 = var1 + ' ';
            }
        }

        var1 = var1.trim();
        if (var1.length() > 12) {
            var1 = var1.substring(0, 12);
        }

        long var7 = 0L;

        for(int var5 = 0; var5 < var1.length(); ++var5) {
            char var6 = var1.charAt(var5);
            var7 *= 37L;
            if (var6 >= 'a' && var6 <= 'z') {
                var7 += (long)(1 + var6 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var7 += (long)(27 + var6 - 48);
            }
        }

        return var7;
    }

    public static String rn(long var0) {
        String var2 = "";

        while(var0 != 0L) {
            int var3 = (int)(var0 % 37L);
            var0 /= 37L;
            if (var3 == 0) {
                var2 = " " + var2;
            } else if (var3 < 27) {
                if (var0 % 37L == 0L) {
                    var2 = (char)(var3 + 65 - 1) + var2;
                } else {
                    var2 = (char)(var3 + 97 - 1) + var2;
                }
            } else {
                var2 = (char)(var3 + 48 - 27) + var2;
            }
        }

        return var2;
    }

    public static byte[] kn(String var0) throws IOException {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;

        while(var1 < 2) {
            try {
                if (var1 == 1) {
                    var0 = var0.toUpperCase();
                }

                InputStream var5 = fn(var0);
                DataInputStream var6 = new DataInputStream(var5);
                byte[] var7 = new byte[6];
                var6.readFully(var7, 0, 6);
                var2 = ((var7[0] & 255) << 16) + ((var7[1] & 255) << 8) + (var7[2] & 255);
                var3 = ((var7[3] & 255) << 16) + ((var7[4] & 255) << 8) + (var7[5] & 255);
                int var8 = 0;

                int var9;
                for(var4 = new byte[var3]; var8 < var3; var8 += var9) {
                    var9 = var3 - var8;
                    if (var9 > 1000) {
                        var9 = 1000;
                    }

                    var6.readFully(var4, var8, var9);
                }

                var1 = 2;
                var6.close();
            } catch (IOException var10) {
                ++var1;
            }
        }

        if (var3 != var2) {
            byte[] var11 = new byte[var2];
            BZLib.ek(var11, var2, var4, var3, 0);
            return var11;
        } else {
            return var4;
        }
    }

    public static int hn(String var0, byte[] var1) {
        int var2 = var1[0] * 256 + var1[1];
        int var3 = 0;
        var0 = var0.toUpperCase();

        for(int var4 = 0; var4 < var0.length(); ++var4) {
            var3 = var3 * 61 + var0.charAt(var4) - 32;
        }

        int var5 = 2 + var2 * 10;

        for(int var6 = 0; var6 < var2; ++var6) {
            int var7 = (var1[var6 * 10 + 2] & 255) * 16777216 + (var1[var6 * 10 + 3] & 255) * 65536 + (var1[var6 * 10 + 4] & 255) * 256 + (var1[var6 * 10 + 5] & 255);
            int var8 = (var1[var6 * 10 + 9] & 255) * 65536 + (var1[var6 * 10 + 10] & 255) * 256 + (var1[var6 * 10 + 11] & 255);
            if (var7 == var3) {
                return var5;
            }

            var5 += var8;
        }

        return 0;
    }

    public static byte[] wn(String var0, int var1, byte[] var2, byte[] var3) {
        int var4 = var2[0] * 256 + var2[1];
        int var5 = 0;
        var0 = var0.toUpperCase();

        for(int var6 = 0; var6 < var0.length(); ++var6) {
            var5 = var5 * 61 + var0.charAt(var6) - 32;
        }

        int var7 = 2 + var4 * 10;

        for(int var8 = 0; var8 < var4; ++var8) {
            int var9 = (var2[var8 * 10 + 2] & 255) * 16777216 + (var2[var8 * 10 + 3] & 255) * 65536 + (var2[var8 * 10 + 4] & 255) * 256 + (var2[var8 * 10 + 5] & 255);
            int var10 = (var2[var8 * 10 + 6] & 255) * 65536 + (var2[var8 * 10 + 7] & 255) * 256 + (var2[var8 * 10 + 8] & 255);
            int var11 = (var2[var8 * 10 + 9] & 255) * 65536 + (var2[var8 * 10 + 10] & 255) * 256 + (var2[var8 * 10 + 11] & 255);
            if (var9 == var5) {
                if (var10 != var11) {
                    BZLib.ek(var3, var10, var2, var11, var7);
                } else {
                    for(int var12 = 0; var12 < var10; ++var12) {
                        var3[var12] = var2[var7 + var12];
                    }
                }

                return var3;
            }

            var7 += var11;
        }

        return null;
    }

    public static byte[] gn(String var0, int var1, byte[] var2) {
        int var3 = var2[0] * 256 + var2[1];
        int var4 = 0;
        var0 = var0.toUpperCase();

        for(int var5 = 0; var5 < var0.length(); ++var5) {
            var4 = var4 * 61 + var0.charAt(var5) - 32;
        }

        int var6 = 2 + var3 * 10;

        for(int var7 = 0; var7 < var3; ++var7) {
            int var8 = (var2[var7 * 10 + 2] & 255) * 16777216 + (var2[var7 * 10 + 3] & 255) * 65536 + (var2[var7 * 10 + 4] & 255) * 256 + (var2[var7 * 10 + 5] & 255);
            int var9 = (var2[var7 * 10 + 6] & 255) * 65536 + (var2[var7 * 10 + 7] & 255) * 256 + (var2[var7 * 10 + 8] & 255);
            int var10 = (var2[var7 * 10 + 9] & 255) * 65536 + (var2[var7 * 10 + 10] & 255) * 256 + (var2[var7 * 10 + 11] & 255);
            if (var8 == var4) {
                byte[] var11 = new byte[var9 + var1];
                if (var9 != var10) {
                    BZLib.ek(var11, var9, var2, var10, var6);
                } else {
                    for(int var12 = 0; var12 < var9; ++var12) {
                        var11[var12] = var2[var6 + var12];
                    }
                }

                return var11;
            }

            var6 += var10;
        }

        return null;
    }

    public static String in(String var0, boolean var1) {
        var0 = var0.replace('~', '@');

        for(int var2 = 0; var2 < 2; ++var2) {
            String var3 = var0;
            ofb = 0;
            byte var4 = 0;

            for(int var5 = 0; var5 < var0.length(); ++var5) {
                char var6 = var0.charAt(var5);
                if (var6 >= 'A' && var6 <= 'Z') {
                    var6 = (char)(var6 + 97 - 65);
                }

                if (var1 && var6 == '@' && var5 + 4 < var0.length() && var0.charAt(var5 + 4) == '@') {
                    var5 += 4;
                } else {
                    byte var7;
                    if (var6 >= 'a' && var6 <= 'z' || var6 >= '0' && var6 <= '9') {
                        var7 = 0;
                    } else if (var6 == '\'') {
                        var7 = 1;
                    } else if (var6 != '\r' && var6 != ' ' && var6 != '.' && var6 != ',' && var6 != '-' && var6 != '(' && var6 != ')' && var6 != '?' && var6 != '!') {
                        var7 = 3;
                    } else {
                        var7 = 2;
                    }

                    int var8 = ofb;

                    for(int var9 = 0; var9 < var8; ++var9) {
                        if (var7 == 3) {
                            if (tfb[var9] > 0 && tfb[var9] < pfb[var9] + rfb[var9].length() / 2) {
                                tfb[ofb] = tfb[var9] + 1;
                                sfb[ofb] = sfb[var9];
                                qfb[ofb] = qfb[var9] + 1;
                                pfb[ofb] = pfb[var9];
                                rfb[ofb++] = rfb[var9];
                                tfb[var9] = -tfb[var9];
                            }
                        } else {
                            char var10 = rfb[var9].charAt(qfb[var9]);
                            if (jn(var6, var10)) {
                                ++qfb[var9];
                                if (tfb[var9] < 0) {
                                    tfb[var9] = -tfb[var9];
                                }
                            } else if ((var6 == ' ' || var6 == '\r') && pfb[var9] == 0) {
                                qfb[var9] = 99999;
                            } else {
                                char var11 = rfb[var9].charAt(qfb[var9] - 1);
                                if (var7 == 0 && !jn(var6, var11)) {
                                    qfb[var9] = 99999;
                                }
                            }
                        }
                    }

                    if (var7 >= 2) {
                        var4 = 1;
                    }

                    int var12;
                    int var13;
                    int var14;
                    if (var7 <= 2) {
                        for(var13 = 0; var13 < lfb.length; ++var13) {
                            if (jn(var6, lfb[var13].charAt(0))) {
                                tfb[ofb] = 1;
                                sfb[ofb] = var5;
                                qfb[ofb] = 1;
                                pfb[ofb] = 1;
                                rfb[ofb++] = lfb[var13];
                            }
                        }

                        for(var14 = 0; var14 < mfb.length; ++var14) {
                            if (jn(var6, mfb[var14].charAt(0))) {
                                tfb[ofb] = 1;
                                sfb[ofb] = var5;
                                qfb[ofb] = 1;
                                pfb[ofb] = var4;
                                rfb[ofb++] = mfb[var14];
                            }
                        }

                        if (var4 == 1) {
                            for(var12 = 0; var12 < nfb.length; ++var12) {
                                if (jn(var6, nfb[var12].charAt(0))) {
                                    tfb[ofb] = 1;
                                    sfb[ofb] = var5;
                                    qfb[ofb] = 1;
                                    pfb[ofb] = 1;
                                    rfb[ofb++] = nfb[var12];
                                }
                            }
                        }

                        if (var7 == 0) {
                            var4 = 0;
                        }
                    }

                    for(var13 = 0; var13 < ofb; ++var13) {
                        if (qfb[var13] >= rfb[var13].length()) {
                            if (qfb[var13] < 99999) {
                                String var15 = "";

                                for(var12 = 0; var12 < var0.length(); ++var12) {
                                    if (var12 >= sfb[var13] && var12 <= var5) {
                                        var15 = var15 + "*";
                                    } else {
                                        var15 = var15 + var0.charAt(var12);
                                    }
                                }

                                var0 = var15;
                            }

                            --ofb;

                            for(var14 = var13; var14 < ofb; ++var14) {
                                pfb[var14] = pfb[var14 + 1];
                                qfb[var14] = qfb[var14 + 1];
                                rfb[var14] = rfb[var14 + 1];
                                sfb[var14] = sfb[var14 + 1];
                                tfb[var14] = tfb[var14 + 1];
                            }

                            --var13;
                        }
                    }
                }
            }

            if (var0.equalsIgnoreCase(var3)) {
                break;
            }
        }

        return var0;
    }

    static boolean jn(char var0, char var1) {
        if (var0 == var1) {
            return true;
        } else if (var1 == 'i' && (var0 == 'l' || var0 == '1' || var0 == '!' || var0 == '|' || var0 == ':' || var0 == 166 || var0 == ';')) {
            return true;
        } else if (var1 == 's' && (var0 == '5' || var0 == '$')) {
            return true;
        } else if (var1 == 'a' && (var0 == '4' || var0 == '@')) {
            return true;
        } else if (var1 == 'c' && (var0 == '(' || var0 == '<' || var0 == '[')) {
            return true;
        } else if (var1 == 'o' && var0 == '0') {
            return true;
        } else {
            return var1 == 'u' && var0 == 'v';
        }
    }

    public Utility() {
    }
}
