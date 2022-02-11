import jagex.Buffer;
import jagex.Utility;
import java.io.IOException;

public class GameData {
    public final int shb = 12345678;
    public static int thb;
    public static int uhb;
    public static String[][] vhb;
    public static String[] whb;
    public static String[] xhb;
    public static String[] yhb;
    public static int[] zhb;
    public static int[] aib;
    public static int[] itemStackable;
    public static int[] cib;
    public static int[] dib;
    public static int[] eib;
    public static int[] fib;
    public static int[] gib;
    public static int[] hib;
    public static int[] iib;
    public static int[] itemWieldable;
    public static int[] kib;
    public static int[] lib;
    public static int[] mib;
    public static int[] nib;
    public static int oib;
    public static String[][] pib;
    public static String[] qib;
    public static int[] rib;
    public static int[] sib;
    public static int[] tib;
    public static int[] uib;
    public static int[] vib;
    public static int[] wib;
    public static int[] xib;
    public static int[] yib;
    public static int[] zib;
    public static int[] ajb;
    public static int[] bjb;
    public static int[] cjb;
    public static int[] djb;
    public static int[] ejb;
    public static int[] fjb;
    public static int[][] gjb;
    public static int[] hjb;
    public static int[] ijb;
    public static int[] jjb;
    public static int[] kjb;
    public static int[] ljb;
    public static int[] mjb;
    public static int[] njb;
    public static int[] ojb;
    public static int[] pjb;
    public static int[][] qjb;
    public static int[][] rjb;
    public static int sjb;
    public static String[] tjb;
    public static String[] ujb;
    public static int[] vjb;
    public static int[] wjb;
    public static int[] xjb;
    public static int[] yjb;
    public static int[] zjb;
    public static int akb;
    public static String[][] bkb;
    public static String[] ckb;
    public static String[] dkb;
    public static String[] ekb;
    public static int[] fkb;
    public static int[] gkb;
    public static int[] hkb;
    public static int[] ikb;
    public static int[] jkb;
    public static int[] kkb;
    public static int lkb;
    public static String[][] mkb;
    public static String[] nkb;
    public static String[] okb;
    public static String[] pkb;
    public static int[] qkb;
    public static int[] rkb;
    public static int[] skb;
    public static int[] tkb;
    public static int[] ukb;
    public static int[] vkb;
    public static int wkb;
    public static String[] xkb;
    public static int[] ykb;
    public static int[] zkb;
    public static int[] alb;
    public static int blb;
    public static String[] clb;
    public static int[] dlb;
    public static int[] elb;
    public static int[] flb;
    public static int glb;
    public static int hlb;
    public static String[] ilb;
    public static String[] jlb;
    public static int[] klb;
    public static int[] llb;
    public static int[] mlb;
    public static int[] nlb;
    public static int[] olb;
    public static int[] plb;
    public static int qlb;
    public static String[] rlb;
    public static String[] slb;
    public static int[] tlb;
    public static int[] ulb;
    public static int[] vlb;
    public static int[][] wlb;
    public static int[][] xlb;
    public static int ylb;
    public static String[] zlb;
    public static int[] amb;
    public static int[] bmb;
    public static int[] cmb;
    public static int[] dmb;
    public static int[] emb;
    public static int[][] fmb;
    public static int[][] gmb;
    public static int[][] hmb;
    public static int imb;
    public static String[] jmb;
    public static String[] kmb;
    public static int[] lmb;
    public static int[] mmb;
    static String[] nmb = new String[]{"attack", "defense", "strength", "hits", "ranged", "prayer", "magic", "cooking", "woodcutting", "fletching", "fishing", "firemaking", "crafting", "smithing", "mining", "herblaw"};
    public static String[] omb = new String[]{"attack", "defense", "strength", "hits", "aggression", "bravery", "regenerate", "perception"};
    public static int pmb;
    public static String[] qmb = new String[200];

    public static void vp() {
        try {
            tp(new Buffer("../gamedata/config/projectile.txt"));
            sp(new Buffer("../gamedata/config/entity.txt"));
            lp(new Buffer("../gamedata/config/objects.txt"));
            up(new Buffer("../gamedata/config/npc.txt"));
            hp(new Buffer("../gamedata/config/location.txt"));
            pp(new Buffer("../gamedata/config/boundary.txt"));
            gp(new Buffer("../gamedata/config/roof.txt"));
            jp(new Buffer("../gamedata/config/floor.txt"));
            kp(new Buffer("../gamedata/config/spells.txt"));
            qp(new Buffer("../gamedata/config/shop.txt"));
            rp(new Buffer("../gamedata/config/prayers.txt"));
            wp();
        } catch (IOException var1) {
            System.out.println("Error loading config files");
            var1.printStackTrace();
        }
    }

    public static void op(byte[] var0) {
        try {
            tp(new Buffer(var0, Utility.hn("projectile.txt", var0)));
            sp(new Buffer(var0, Utility.hn("entity.txt", var0)));
            lp(new Buffer(var0, Utility.hn("objects.txt", var0)));
            up(new Buffer(var0, Utility.hn("npc.txt", var0)));
            hp(new Buffer(var0, Utility.hn("location.txt", var0)));
            pp(new Buffer(var0, Utility.hn("boundary.txt", var0)));
            gp(new Buffer(var0, Utility.hn("roof.txt", var0)));
            jp(new Buffer(var0, Utility.hn("floor.txt", var0)));
            kp(new Buffer(var0, Utility.hn("spells.txt", var0)));
            qp(new Buffer(var0, Utility.hn("shop.txt", var0)));
            rp(new Buffer(var0, Utility.hn("prayers.txt", var0)));
            wp();
        } catch (IOException var2) {
            System.out.println("Error loading config files");
            var2.printStackTrace();
        }
    }

    public static void qp(Buffer var0) throws IOException {
        var0.sb();
        int var1 = var0.xb();
        ylb = var1;
        System.out.println("Found " + var1 + " shops");
        zlb = new String[var1];
        amb = new int[var1];
        emb = new int[var1];
        bmb = new int[var1];
        cmb = new int[var1];
        dmb = new int[var1];
        fmb = new int[var1][40];
        gmb = new int[var1][40];
        hmb = new int[var1][40];

        for(int var2 = 0; var2 < var1; ++var2) {
            var0.sb();
            zlb[var2] = var0.yb();
            int var3 = amb[var2] = var0.xb();
            bmb[var2] = var0.xb();
            cmb[var2] = var0.xb();
            dmb[var2] = var0.xb();
            emb[var2] = var0.xb();

            for(int var4 = 0; var4 < var3; ++var4) {
                var0.sb();
                fmb[var2][var4] = fp(var0.yb());
                gmb[var2][var4] = var0.xb();
                hmb[var2][var4] = var0.xb();
            }
        }

    }

    public static void kp(Buffer var0) throws IOException {
        var0.sb();
        int var1 = var0.xb();
        qlb = var1;
        System.out.println("Found " + var1 + " spells");
        rlb = new String[var1];
        slb = new String[var1];
        tlb = new int[var1];
        vlb = new int[var1];
        ulb = new int[var1];
        wlb = new int[var1][];
        xlb = new int[var1][];

        for(int var2 = 0; var2 < var1; ++var2) {
            var0.sb();
            rlb[var2] = var0.yb();
            tlb[var2] = var0.xb();
            slb[var2] = var0.yb();
            vlb[var2] = var0.xb();
            var0.sb();
            int var3 = ulb[var2] = var0.xb();
            wlb[var2] = new int[var3];
            xlb[var2] = new int[var3];

            for(int var4 = 0; var4 < var3; ++var4) {
                wlb[var2][var4] = fp(var0.yb());
                xlb[var2][var4] = var0.xb();
            }
        }

        var0.zb();
    }

    public static void rp(Buffer var0) throws IOException {
        var0.sb();
        int var1 = var0.xb();
        imb = var1;
        System.out.println("Found " + var1 + " prayers");
        jmb = new String[var1];
        kmb = new String[var1];
        lmb = new int[var1];
        mmb = new int[var1];

        for(int var2 = 0; var2 < var1; ++var2) {
            var0.sb();
            jmb[var2] = var0.yb();
            lmb[var2] = var0.xb();
            kmb[var2] = var0.yb();
            mmb[var2] = var0.xb();
        }

        var0.zb();
    }

    public static void tp(Buffer var0) throws IOException {
        var0.sb();
        int var1 = var0.xb();
        glb = var1;
        System.out.println("Found " + var1 + " projectiles");
        ilb = new String[var1];
        jlb = new String[var1];
        klb = new int[var1];
        llb = new int[var1];
        mlb = new int[var1];
        nlb = new int[var1];
        olb = new int[var1];
        plb = new int[var1];

        for(int var2 = 0; var2 < var1; ++var2) {
            var0.sb();
            ilb[var2] = var0.yb();
            klb[var2] = var0.xb();
            llb[var2] = var0.xb();
            mlb[var2] = var0.xb();
            nlb[var2] = var0.xb();
            jlb[var2] = var0.yb();
            plb[var2] = var0.xb();
            if (klb[var2] + 1 > hlb) {
                hlb = klb[var2] + 1;
            }
        }

        var0.zb();
    }

    public static void wp() {
        for(int var0 = 0; var0 < glb; ++var0) {
            olb[var0] = fp(jlb[var0]);
        }

    }

    public static void sp(Buffer var0) throws IOException {
        var0.sb();
        int var1 = var0.xb();
        sjb = var1;
        System.out.println("Found " + var1 + " entities");
        tjb = new String[var1];
        ujb = new String[var1];
        wjb = new int[var1];
        vjb = new int[var1];
        xjb = new int[var1];
        yjb = new int[var1];
        zjb = new int[var1];

        for(int var2 = 0; var2 < var1; ++var2) {
            var0.sb();
            tjb[var2] = var0.yb();
            ujb[var2] = var0.yb();
            vjb[var2] = var0.tb();
            wjb[var2] = var0.xb();
            xjb[var2] = var0.xb();
            yjb[var2] = var0.xb();
        }

        var0.zb();
    }

    public static void up(Buffer var0) throws IOException {
        var0.sb();
        int var1 = var0.xb();
        oib = var1;
        System.out.println("Found " + var1 + " npcs");
        pib = new String[var1][];
        qib = new String[var1];
        rib = new int[var1];
        sib = new int[var1];
        tib = new int[var1];
        uib = new int[var1];
        vib = new int[var1];
        wib = new int[var1];
        xib = new int[var1];
        yib = new int[var1];
        zib = new int[var1];
        ajb = new int[var1];
        bjb = new int[var1];
        cjb = new int[var1];
        djb = new int[var1];
        ejb = new int[var1];
        fjb = new int[var1];
        gjb = new int[var1][12];
        hjb = new int[var1];
        ijb = new int[var1];
        jjb = new int[var1];
        kjb = new int[var1];
        ljb = new int[var1];
        mjb = new int[var1];
        njb = new int[var1];
        ojb = new int[var1];
        pjb = new int[var1];
        qjb = new int[var1][];
        rjb = new int[var1][];

        for(int var2 = 0; var2 < var1; ++var2) {
            var0.sb();
            int var3 = var0.xb();
            pib[var2] = new String[var3];

            for(int var4 = 0; var4 < var3; ++var4) {
                pib[var2][var4] = var0.yb();
            }

            qib[var2] = var0.yb();
            var0.sb();
            rib[var2] = var0.xb();
            sib[var2] = var0.xb();
            tib[var2] = var0.xb();
            uib[var2] = var0.xb();
            vib[var2] = var0.xb();
            wib[var2] = var0.xb();
            xib[var2] = var0.xb();
            yib[var2] = var0.xb();
            zib[var2] = var0.xb();
            ajb[var2] = var0.xb();
            bjb[var2] = var0.xb();
            cjb[var2] = var0.xb();
            djb[var2] = var0.xb();
            ejb[var2] = var0.xb();
            fjb[var2] = var0.xb();
            var0.sb();

            for(int var5 = 0; var5 < 12; ++var5) {
                gjb[var2][var5] = np(var0.yb());
            }

            hjb[var2] = var0.tb();
            ijb[var2] = var0.tb();
            jjb[var2] = var0.tb();
            kjb[var2] = var0.tb();
            var0.sb();
            ljb[var2] = var0.xb();
            mjb[var2] = var0.xb();
            njb[var2] = var0.xb();
            ojb[var2] = var0.xb();
            pjb[var2] = var0.xb();
            var0.sb();
            int var6 = var0.xb();
            qjb[var2] = new int[var6];
            rjb[var2] = new int[var6];

            for(int var7 = 0; var7 < var6; ++var7) {
                qjb[var2][var7] = fp(var0.yb());
                rjb[var2][var7] = var0.xb();
            }
        }

        var0.zb();
    }

    public static void lp(Buffer var0) throws IOException {
        var0.sb();
        int var1 = var0.xb();
        thb = var1;
        System.out.println("Found " + var1 + " objects");
        vhb = new String[var1][];
        whb = new String[var1];
        yhb = new String[var1];
        zhb = new int[var1];
        aib = new int[var1];
        itemStackable = new int[var1];
        cib = new int[var1];
        dib = new int[var1];
        eib = new int[var1];
        fib = new int[var1];
        gib = new int[var1];
        hib = new int[var1];
        iib = new int[var1];
        itemWieldable = new int[var1];
        kib = new int[var1];
        lib = new int[var1];
        mib = new int[var1];
        nib = new int[var1];

        for(int var2 = 0; var2 < var1; ++var2) {
            var0.sb();
            int var3 = var0.xb();
            vhb[var2] = new String[var3];

            for(int var4 = 0; var4 < var3; ++var4) {
                vhb[var2][var4] = var0.yb();
            }

            whb[var2] = var0.yb();
            var0.sb();
            zhb[var2] = var0.xb();
            if (zhb[var2] >= uhb) {
                uhb = zhb[var2] + 1;
            }

            aib[var2] = var0.xb();
            itemStackable[var2] = var0.xb();
            yhb[var2] = var0.yb();
            var0.sb();
            cib[var2] = var0.xb();
            dib[var2] = var0.xb();
            eib[var2] = var0.xb();
            fib[var2] = var0.xb();
            gib[var2] = var0.xb();
            hib[var2] = var0.xb();
            iib[var2] = ip(var0.yb()) + 1;
            var0.sb();
            itemWieldable[var2] = var0.xb();
            kib[var2] = np(var0.yb());
            lib[var2] = var0.tb();
            mib[var2] = var0.xb();
            nib[var2] = var0.xb();
        }

        var0.zb();
    }

    public static void hp(Buffer var0) throws IOException {
        var0.sb();
        int var1 = var0.xb();
        akb = var1;
        System.out.println("Found " + var1 + " locations");
        bkb = new String[var1][];
        ckb = new String[var1];
        dkb = new String[var1];
        ekb = new String[var1];
        fkb = new int[var1];
        gkb = new int[var1];
        hkb = new int[var1];
        ikb = new int[var1];
        jkb = new int[var1];
        kkb = new int[var1];

        for(int var2 = 0; var2 < var1; ++var2) {
            var0.sb();
            int var3 = var0.xb();
            bkb[var2] = new String[var3];

            for(int var4 = 0; var4 < var3; ++var4) {
                bkb[var2][var4] = var0.yb();
            }

            ckb[var2] = var0.yb();
            var0.sb();
            fkb[var2] = mp(var0.yb());
            gkb[var2] = var0.xb();
            hkb[var2] = var0.xb();
            ikb[var2] = var0.xb();
            jkb[var2] = var0.xb();
            dkb[var2] = var0.yb();
            if (dkb[var2].equals("_")) {
                dkb[var2] = "WalkTo";
            }

            ekb[var2] = var0.yb();
            if (ekb[var2].equals("_")) {
                ekb[var2] = "Examine";
            }

            kkb[var2] = var0.xb();
        }

        var0.zb();
    }

    public static void pp(Buffer var0) throws IOException {
        var0.sb();
        int var1 = var0.xb();
        lkb = var1;
        System.out.println("Found " + var1 + " boundaries");
        mkb = new String[var1][];
        nkb = new String[var1];
        okb = new String[var1];
        pkb = new String[var1];
        qkb = new int[var1];
        rkb = new int[var1];
        skb = new int[var1];
        tkb = new int[var1];
        ukb = new int[var1];
        vkb = new int[var1];

        for(int var2 = 0; var2 < var1; ++var2) {
            var0.sb();
            int var3 = var0.xb();
            mkb[var2] = new String[var3];

            for(int var4 = 0; var4 < var3; ++var4) {
                mkb[var2][var4] = var0.yb();
            }

            nkb[var2] = var0.yb();
            var0.sb();
            qkb[var2] = var0.xb();
            rkb[var2] = var0.xb();
            skb[var2] = var0.xb();
            tkb[var2] = var0.xb();
            ukb[var2] = var0.xb();
            vkb[var2] = var0.xb();
            okb[var2] = var0.yb();
            if (okb[var2].equals("_")) {
                okb[var2] = "WalkTo";
            }

            pkb[var2] = var0.yb();
            if (pkb[var2].equals("_")) {
                pkb[var2] = "Examine";
            }
        }

        var0.zb();
    }

    public static void gp(Buffer var0) throws IOException {
        var0.sb();
        int var1 = var0.xb();
        wkb = var1;
        System.out.println("Found " + var1 + " roofs");
        xkb = new String[var1];
        ykb = new int[var1];
        zkb = new int[var1];
        alb = new int[var1];

        for(int var2 = 0; var2 < var1; ++var2) {
            var0.sb();
            xkb[var2] = var0.yb();
            ykb[var2] = var0.xb();
            zkb[var2] = var0.xb();
            alb[var2] = var0.xb();
        }

        var0.zb();
    }

    public static void jp(Buffer var0) throws IOException {
        var0.sb();
        int var1 = var0.xb();
        blb = var1;
        System.out.println("Found " + var1 + " floors");
        clb = new String[var1];
        dlb = new int[var1];
        elb = new int[var1];
        flb = new int[var1];

        for(int var2 = 0; var2 < var1; ++var2) {
            var0.sb();
            clb[var2] = var0.yb();
            dlb[var2] = var0.xb();
            elb[var2] = var0.xb();
            flb[var2] = var0.xb();
        }

        var0.zb();
    }

    public static int np(String var0) {
        if (var0.equalsIgnoreCase("na")) {
            return -1;
        } else {
            for(int var1 = 0; var1 < sjb; ++var1) {
                if (var0.equalsIgnoreCase(tjb[var1])) {
                    return var1;
                }
            }

            System.out.println("WARNING: unable to match entity " + var0);
            return 0;
        }
    }

    public static int mp(String var0) {
        if (var0.equalsIgnoreCase("na")) {
            return 0;
        } else {
            for(int var1 = 0; var1 < pmb; ++var1) {
                if (qmb[var1].equalsIgnoreCase(var0)) {
                    return var1;
                }
            }

            qmb[pmb++] = var0;
            return pmb - 1;
        }
    }

    public static int fp(String var0) {
        if (var0.equalsIgnoreCase("na")) {
            return 0;
        } else {
            for(int var1 = 0; var1 < thb; ++var1) {
                for(int var2 = 0; var2 < vhb[var1].length; ++var2) {
                    if (vhb[var1][var2].equalsIgnoreCase(var0)) {
                        return var1;
                    }
                }
            }

            System.out.println("WARNING: unable to match object: " + var0);
            return 0;
        }
    }

    public static int ip(String var0) {
        if (var0.equals("_")) {
            return -1;
        } else {
            for(int var1 = 0; var1 < glb; ++var1) {
                if (ilb[var1].equalsIgnoreCase(var0)) {
                    return var1;
                }
            }

            System.out.println("WARNING: unable to match projectile: " + var0);
            return -1;
        }
    }

    public GameData() {
    }
}
