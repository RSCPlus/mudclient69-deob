import jagex.client.i;
import java.awt.Component;

public class m extends i {
    public mudclient gs;

    public m(int var1, int var2, int var3, Component var4) {
        super(var1, var2, var3, var4);
        boolean var5 = false;
        if (var5) {
            new i(var1, var2, var3, var4);
        }

    }

    public void gg(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        if (var5 >= 40000) {
            this.gs.xm(var1, var2, var3, var4, var5 - '鱀', var6, var7);
        } else if (var5 >= 20000) {
            this.gs.cn(var1, var2, var3, var4, var5 - 20000, var6, var7);
        } else if (var5 >= 5000) {
            this.gs.tl(var1, var2, var3, var4, var5 - 5000, var6, var7);
        } else {
            super.rf(var1, var2, var3, var4, var5);
        }
    }
}
