package p069j1;

import android.content.Context;

/* renamed from: j1.z1 */
final class C3226z1 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ Context f20600f;

    /* renamed from: g */
    final /* synthetic */ C3163g2 f20601g;

    C3226z1(C3163g2 g2Var, Context context) {
        this.f20601g = g2Var;
        this.f20600f = context;
    }

    public final void run() {
        synchronized (this.f20601g.f20470d) {
            this.f20601g.f20471e = C3163g2.m23946v(this.f20600f);
            this.f20601g.f20470d.notifyAll();
        }
    }
}
