package jagex.client;

import java.awt.Event;
import java.awt.Frame;
import java.awt.Graphics;

public class GameFrame extends Frame {
    int oc;
    int pc;
    int qc;
    int rc = 28;
    GameApplet sc;
    Graphics tc;

    public GameFrame(GameApplet var1, int var2, int var3, String var4, boolean var5, boolean var6) {
        this.oc = var2;
        this.pc = var3;
        this.sc = var1;
        if (var6) {
            this.rc = 48;
        } else {
            this.rc = 28;
        }

        this.setTitle(var4);
        this.setResizable(var5);
        this.show();
        this.toFront();
        this.resize(this.oc, this.pc);
        this.tc = this.getGraphics();
    }

    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        if (this.qc == 0) {
            var1.translate(0, 24);
        } else {
            var1.translate(-5, 0);
        }

        return var1;
    }

    public void resize(int var1, int var2) {
        super.resize(var1, var2 + this.rc);
    }

    public int p() {
        return this.size().width;
    }

    public int q() {
        return this.size().height - this.rc;
    }

    public boolean handleEvent(Event var1) {
        if (var1.id == 401) {
            this.sc.keyDown(var1, var1.key);
        } else if (var1.id == 402) {
            this.sc.keyUp(var1, var1.key);
        } else if (var1.id == 501) {
            this.sc.mouseDown(var1, var1.x, var1.y - 24);
        } else if (var1.id == 506) {
            this.sc.mouseDrag(var1, var1.x, var1.y - 24);
        } else if (var1.id == 502) {
            this.sc.mouseUp(var1, var1.x, var1.y - 24);
        } else if (var1.id == 503) {
            this.sc.mouseMove(var1, var1.x, var1.y - 24);
        } else if (var1.id == 201) {
            this.sc.destroy();
        } else if (var1.id == 1001) {
            this.sc.action(var1, var1.target);
        } else if (var1.id == 403) {
            this.sc.keyDown(var1, var1.key);
        } else if (var1.id == 404) {
            this.sc.keyUp(var1, var1.key);
        }

        return true;
    }

    public final void paint(Graphics var1) {
        this.sc.paint(var1);
    }
}
