package p084l2;

import android.app.Activity;
import p137t2.C4065c;
import p137t2.C4068d;

/* renamed from: l2.m2 */
final /* synthetic */ class C3522m2 implements Runnable {

    /* renamed from: f */
    private final C3509j2 f21138f;

    /* renamed from: g */
    private final Activity f21139g;

    /* renamed from: h */
    private final C4068d f21140h;

    /* renamed from: i */
    private final C4065c.C4067b f21141i;

    /* renamed from: j */
    private final C4065c.C4066a f21142j;

    C3522m2(C3509j2 j2Var, Activity activity, C4068d dVar, C4065c.C4067b bVar, C4065c.C4066a aVar) {
        this.f21138f = j2Var;
        this.f21139g = activity;
        this.f21140h = dVar;
        this.f21141i = bVar;
        this.f21142j = aVar;
    }

    public final void run() {
        this.f21138f.mo14600e(this.f21139g, this.f21140h, this.f21141i, this.f21142j);
    }
}
