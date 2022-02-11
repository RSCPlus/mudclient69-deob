package jagex.client;

import jagex.BZLib;
import jagex.Utility;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Component;
import java.awt.Event;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.IndexColorModel;
import java.awt.image.MemoryImageSource;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class GameApplet extends Applet implements Runnable {
    private int fp = 512;
    private int gp = 384;
    private Thread hp;
    private int ip = 20;
    private int jp = 1000;
    private long[] kp = new long[10];
    static GameFrame lp = null;
    private boolean mp;
    private int np;
    private int op;
    public int pp;
    public int qp;
    public int rp = 1;
    public String sp;
    private boolean tp = false;
    private int up;
    private String vp = "Loading";
    private Font wp = new Font("TimesRoman", 0, 15);
    private Font xp = new Font("Helvetica", 1, 13);
    private Font yp = new Font("Helvetica", 0, 12);
    private Image zp;
    private Graphics aq;
    public boolean bq = false;
    public boolean cq = false;
    public boolean dq = false;
    public boolean eq = false;
    public boolean fq = false;
    public boolean gq = false;
    public boolean hq = false;
    public boolean iq = false;
    public int jq = 1;
    public int kq;
    public int lq;
    public int mq;
    public int nq;
    public int oq;
    public int pq;
    public boolean qq = false;
    public String rq = "";
    public String sq = "";
    public String tq = "";
    public String uq = "";
    public int vq;

    public void startGame() {
    }

    public synchronized void nj() {
    }

    public void uj() {
    }

    public synchronized void tj() {
    }

    public void drawHbar() {
    }

    public final void startApplication(int var1, int var2, String var3, boolean var4) {
        this.mp = false;
        System.out.println("Started application");
        this.fp = var1;
        this.gp = var2;
        lp = new GameFrame(this, var1, var2, var3, var4, false);
        this.rp = 1;
        this.hp = new Thread(this);
        this.hp.start();
        this.hp.setPriority(1);
    }

    public final boolean inAppletMode() {
        return this.mp;
    }

    public final void pj(int var1, int var2, String var3, boolean var4) {
        if (lp == null) {
            this.fp = var1;
            this.gp = var2;
            lp = new GameFrame(this, var1, var2, var3, var4, this.mp);
        }
    }

    public final void fj(int var1, int var2) {
        if (lp != null) {
            lp.resize(var1, var2);
            this.fp = var1;
            this.gp = var2;
        }
    }

    public final void hj(Image var1) {
        if (lp != null) {
            lp.setIconImage(var1);
        }
    }

    public void wj(int var1, int var2) {
        this.fj(var1, var2);
    }

    public final Graphics getGraphics() {
        return lp == null ? super.getGraphics() : lp.getGraphics();
    }

    public final int oj() {
        return this.fp;
    }

    public final int yj() {
        return this.gp;
    }

    public final Image createImage(int var1, int var2) {
        return lp == null ? super.createImage(var1, var2) : lp.createImage(var1, var2);
    }

    public Frame sj() {
        return lp;
    }

    public final void vj(int var1) {
        this.ip = 1000 / var1;
    }

    public final void xj(int var1) {
        this.jp = var1;
    }

    public final void zj() {
        for(int var1 = 0; var1 < 10; ++var1) {
            this.kp[var1] = 0L;
        }

    }

    public synchronized boolean keyDown(Event var1, int var2) {
        this.handleKeyPress(var2);
        this.oq = var2;
        this.pq = var2;
        this.qp = 0;
        if (var2 == 1006) {
            this.dq = true;
        }

        if (var2 == 1007) {
            this.eq = true;
        }

        if (var2 == 1004) {
            this.fq = true;
        }

        if (var2 == 1005) {
            this.gq = true;
        }

        if ((char)var2 == ' ') {
            this.hq = true;
        }

        if ((char)var2 == 'n' || (char)var2 == 'm') {
            this.iq = true;
        }

        if ((char)var2 == 'N' || (char)var2 == 'M') {
            this.iq = true;
        }

        if ((char)var2 == '{') {
            this.bq = true;
        }

        if ((char)var2 == '}') {
            this.cq = true;
        }

        if ((char)var2 == 1008) {
            this.qq = !this.qq;
        }

        if ((var2 >= 97 && var2 <= 122 || var2 >= 65 && var2 <= 90 || var2 >= 48 && var2 <= 57 || var2 == 32) && this.rq.length() < 20) {
            this.rq = this.rq + (char)var2;
        }

        if (var2 >= 32 && var2 <= 122 && this.tq.length() < 80) {
            this.tq = this.tq + (char)var2;
        }

        if (var2 == 8 && this.rq.length() > 0) {
            this.rq = this.rq.substring(0, this.rq.length() - 1);
        }

        if (var2 == 8 && this.tq.length() > 0) {
            this.tq = this.tq.substring(0, this.tq.length() - 1);
        }

        if (var2 == 10 || var2 == 13) {
            this.sq = this.rq;
            this.uq = this.tq;
        }

        return true;
    }

    public void handleKeyPress(int var1) {
    }

    public synchronized boolean keyUp(Event var1, int var2) {
        this.oq = 0;
        if (var2 == 1006) {
            this.dq = false;
        }

        if (var2 == 1007) {
            this.eq = false;
        }

        if (var2 == 1004) {
            this.fq = false;
        }

        if (var2 == 1005) {
            this.gq = false;
        }

        if ((char)var2 == ' ') {
            this.hq = false;
        }

        if ((char)var2 == 'n' || (char)var2 == 'm') {
            this.iq = false;
        }

        if ((char)var2 == 'N' || (char)var2 == 'M') {
            this.iq = false;
        }

        if ((char)var2 == '{') {
            this.bq = false;
        }

        if ((char)var2 == '}') {
            this.cq = false;
        }

        return true;
    }

    public synchronized boolean mouseMove(Event var1, int var2, int var3) {
        this.kq = var2;
        this.lq = var3 + this.pp;
        this.mq = 0;
        this.qp = 0;
        return true;
    }

    public synchronized boolean mouseUp(Event var1, int var2, int var3) {
        this.kq = var2;
        this.lq = var3 + this.pp;
        this.mq = 0;
        return true;
    }

    public synchronized boolean mouseDown(Event var1, int var2, int var3) {
        this.kq = var2;
        this.lq = var3 + this.pp;
        if (var1.metaDown()) {
            this.mq = 2;
        } else {
            this.mq = 1;
        }

        this.nq = this.mq;
        this.qp = 0;
        return true;
    }

    public synchronized boolean mouseDrag(Event var1, int var2, int var3) {
        this.kq = var2;
        this.lq = var3 + this.pp;
        if (var1.metaDown()) {
            this.mq = 2;
        } else {
            this.mq = 1;
        }

        return true;
    }

    public final void init() {
        this.mp = true;
        System.out.println("Started applet");
        this.fp = this.size().width;
        this.gp = this.size().height;
        this.rp = 1;
        Utility.jfb = this.getCodeBase();
        this.hp = new Thread(this);
        this.hp.start();
    }

    public final void start() {
        if (this.np >= 0) {
            this.np = 0;
        }

    }

    public final void stop() {
        if (this.np >= 0) {
            this.np = 4000 / this.ip;
        }

    }

    public final void destroy() {
        this.np = -1;

        try {
            Thread.sleep(5000L);
        } catch (Exception var1) {
            ;
        }

        if (this.np == -1) {
            System.out.println("5 seconds expired, forcing kill");
            this.kj();
            if (this.hp != null) {
                this.hp.stop();
                this.hp = null;
            }
        }

    }

    public final void kj() {
        this.np = -2;
        System.out.println("Closing program");
        this.uj();

        try {
            Thread.sleep(1000L);
        } catch (Exception var1) {
            ;
        }

        if (lp != null) {
            lp.dispose();
        }

        if (!this.mp) {
            System.exit(0);
        }

    }

    public final void run() {
        if (this.rp == 1) {
            this.rp = 2;
            this.aq = this.getGraphics();
            this.mj();
            this.rj(0, "Loading...");
            this.startGame();
            this.rp = 0;
        }

        int var3 = 0;
        int var4 = 256;
        int var5 = 1;
        int var6 = 0;

        for(int var7 = 0; var7 < 10; ++var7) {
            this.kp[var7] = System.currentTimeMillis();
        }

        long var1 = System.currentTimeMillis();

        while(true) {
            do {
                do {
                    if (this.np < 0) {
                        if (this.np == -1) {
                            this.kj();
                        }

                        this.hp = null;
                        return;
                    }

                    if (this.np > 0) {
                        --this.np;
                        if (this.np == 0) {
                            this.kj();
                            this.hp = null;
                            return;
                        }
                    }

                    int var8 = var4;
                    int var9 = var5;
                    var4 = 300;
                    var5 = 1;
                    var1 = System.currentTimeMillis();
                    if (this.kp[var3] == 0L) {
                        var4 = var8;
                        var5 = var9;
                    } else if (var1 > this.kp[var3]) {
                        var4 = (int)((long)(2560 * this.ip) / (var1 - this.kp[var3]));
                    }

                    if (var4 < 25) {
                        var4 = 25;
                    }

                    if (var4 > 256) {
                        var4 = 256;
                        var5 = (int)((long)this.ip - (var1 - this.kp[var3]) / 10L);
                        if (var5 < this.jq) {
                            var5 = this.jq;
                        }
                    }

                    try {
                        Thread.sleep((long)var5);
                    } catch (InterruptedException var11) {
                        ;
                    }

                    this.kp[var3] = var1;
                    var3 = (var3 + 1) % 10;
                    int var10;
                    if (var5 > 1) {
                        for(var10 = 0; var10 < 10; ++var10) {
                            if (this.kp[var10] != 0L) {
                                this.kp[var10] += (long)var5;
                            }
                        }
                    }

                    var10 = 0;

                    while(var6 < 256) {
                        this.nj();
                        var6 += var4;
                        ++var10;
                        if (var10 > this.jp) {
                            var6 = 0;
                            this.op += 6;
                            if (this.op > 25) {
                                this.op = 0;
                                this.qq = true;
                            }
                            break;
                        }
                    }

                    --this.op;
                    var6 &= 255;
                    this.tj();
                    this.vq = 1000 * var4 / (this.ip * 256);
                    if (this.mp && var3 == 0) {
                        this.showStatus("Fps:" + this.vq + "Del:" + var5);
                    }
                } while(lp == null);
            } while(lp.p() == this.fp && lp.q() == this.gp);

            this.wj(lp.p(), lp.q());
        }
    }

    public final void update(Graphics var1) {
        this.paint(var1);
    }

    public final void paint(Graphics var1) {
        if (this.rp == 2 && this.zp != null) {
            this.rj(this.up, this.vp);
        } else {
            if (this.rp == 0) {
                this.drawHbar();
            }

        }
    }

    public void mj() {
        try {
            byte[] var1 = Utility.kn("jagex.jag");
            byte[] var2 = Utility.gn("logo.tga", 0, var1);
            this.zp = this.lj(var2);
            Surface.if_(Utility.gn("h11p.jf", 0, var1));
            Surface.if_(Utility.gn("h12b.jf", 0, var1));
            Surface.if_(Utility.gn("h12p.jf", 0, var1));
            Surface.if_(Utility.gn("h13b.jf", 0, var1));
            Surface.if_(Utility.gn("h14b.jf", 0, var1));
            Surface.if_(Utility.gn("h16b.jf", 0, var1));
            Surface.if_(Utility.gn("h20b.jf", 0, var1));
            Surface.if_(Utility.gn("h24b.jf", 0, var1));
        } catch (IOException var3) {
            System.out.println("Error loading jagex.dat");
        }
    }

    public void rj(int var1, String var2) {
        int var3 = (this.fp - 281) / 2;
        int var4 = (this.gp - 148) / 2;
        this.aq.setColor(Color.black);
        this.aq.fillRect(0, 0, this.fp, this.gp);
        if (!this.tp) {
            this.aq.drawImage(this.zp, var3, var4, this);
        }

        var3 += 2;
        var4 += 90;
        this.up = var1;
        this.vp = var2;
        this.aq.setColor(new Color(132, 132, 132));
        if (this.tp) {
            this.aq.setColor(new Color(220, 0, 0));
        }

        this.aq.drawRect(var3 - 2, var4 - 2, 280, 23);
        this.aq.fillRect(var3, var4, 277 * var1 / 100, 20);
        this.aq.setColor(new Color(198, 198, 198));
        if (this.tp) {
            this.aq.setColor(new Color(255, 255, 255));
        }

        this.jj(this.aq, var2, this.wp, var3 + 138, var4 + 10);
        if (!this.tp) {
            this.jj(this.aq, "Created by JAGeX - visit www.jagex.com", this.xp, var3 + 138, var4 + 30);
            this.jj(this.aq, "Copyright ©2000 Andrew Gower", this.xp, var3 + 138, var4 + 44);
        } else {
            this.aq.setColor(new Color(132, 132, 152));
            this.jj(this.aq, "Copyright ©2000 Andrew Gower", this.yp, var3 + 138, this.gp - 20);
        }

        if (this.sp != null) {
            this.aq.setColor(Color.white);
            this.jj(this.aq, this.sp, this.xp, var3 + 138, var4 - 120);
        }

    }

    public void qj(int var1, String var2) {
        int var3 = (this.fp - 281) / 2;
        int var4 = (this.gp - 148) / 2;
        var3 += 2;
        var4 += 90;
        this.up = var1;
        this.vp = var2;
        int var5 = 277 * var1 / 100;
        this.aq.setColor(new Color(132, 132, 132));
        if (this.tp) {
            this.aq.setColor(new Color(220, 0, 0));
        }

        this.aq.fillRect(var3, var4, var5, 20);
        this.aq.setColor(Color.black);
        this.aq.fillRect(var3 + var5, var4, 277 - var5, 20);
        this.aq.setColor(new Color(198, 198, 198));
        if (this.tp) {
            this.aq.setColor(new Color(255, 255, 255));
        }

        this.jj(this.aq, var2, this.wp, var3 + 138, var4 + 10);
    }

    public void jj(Graphics var1, String var2, Font var3, int var4, int var5) {
        Object var6;
        if (lp == null) {
            var6 = this;
        } else {
            var6 = lp;
        }

        FontMetrics var7 = ((Component)var6).getFontMetrics(var3);
        var7.stringWidth(var2);
        var1.setFont(var3);
        var1.drawString(var2, var4 - var7.stringWidth(var2) / 2, var5 + var7.getHeight() / 4);
    }

    public Image lj(byte[] var1) {
        int var2 = var1[13] * 256 + var1[12];
        int var3 = var1[15] * 256 + var1[14];
        byte[] var4 = new byte[256];
        byte[] var5 = new byte[256];
        byte[] var6 = new byte[256];

        for(int var7 = 0; var7 < 256; ++var7) {
            var4[var7] = var1[20 + var7 * 3];
            var5[var7] = var1[19 + var7 * 3];
            var6[var7] = var1[18 + var7 * 3];
        }

        IndexColorModel var8 = new IndexColorModel(8, 256, var4, var5, var6);
        byte[] var9 = new byte[var2 * var3];
        int var10 = 0;

        for(int var11 = var3 - 1; var11 >= 0; --var11) {
            for(int var12 = 0; var12 < var2; ++var12) {
                var9[var10++] = var1[786 + var12 + var11 * var2];
            }
        }

        MemoryImageSource var14 = new MemoryImageSource(var2, var3, var8, var9, 0, var2);
        Image var13 = this.createImage(var14);
        return var13;
    }

    public byte[] gj(String var1, String var2, int var3) throws IOException {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;

        while(var4 < 2) {
            try {
                this.qj(var3, "Loading " + var2 + " - 0%");
                if (var4 == 1) {
                    var1 = var1.toUpperCase();
                }

                InputStream var8 = Utility.fn(var1);
                DataInputStream var9 = new DataInputStream(var8);
                byte[] var10 = new byte[6];
                var9.readFully(var10, 0, 6);
                var5 = ((var10[0] & 255) << 16) + ((var10[1] & 255) << 8) + (var10[2] & 255);
                var6 = ((var10[3] & 255) << 16) + ((var10[4] & 255) << 8) + (var10[5] & 255);
                this.qj(var3, "Loading " + var2 + " - 5%");
                int var11 = 0;
                var7 = new byte[var6];

                while(var11 < var6) {
                    int var12 = var6 - var11;
                    if (var12 > 1000) {
                        var12 = 1000;
                    }

                    var9.readFully(var7, var11, var12);
                    var11 += var12;
                    this.qj(var3, "Loading " + var2 + " - " + (5 + var11 * 95 / var6) + "%");
                }

                var4 = 2;
                var9.close();
            } catch (IOException var13) {
                ++var4;
            }
        }

        this.qj(var3, "Unpacking " + var2);
        if (var6 != var5) {
            byte[] var14 = new byte[var5];
            BZLib.ek(var14, var5, var7, var6, 0);
            return var14;
        } else {
            return var7;
        }
    }

    public GameApplet() {
    }
}
