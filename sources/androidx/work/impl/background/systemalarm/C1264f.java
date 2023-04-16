package androidx.work.impl.background.systemalarm;

import android.content.Context;
import p089m0.C3646j;
import p096n0.C3752e;
import p141u0.C4108p;

/* renamed from: androidx.work.impl.background.systemalarm.f */
public class C1264f implements C3752e {

    /* renamed from: g */
    private static final String f3429g = C3646j.m25231f("SystemAlarmScheduler");

    /* renamed from: f */
    private final Context f3430f;

    public C1264f(Context context) {
        this.f3430f = context.getApplicationContext();
    }

    /* renamed from: a */
    private void m5089a(C4108p pVar) {
        C3646j.m25229c().mo14806a(f3429g, String.format("Scheduling work with workSpecId %s", new Object[]{pVar.f22314a}), new Throwable[0]);
        this.f3430f.startService(C1256b.m5055f(this.f3430f, pVar.f22314a));
    }

    /* renamed from: b */
    public void mo4546b(String str) {
        this.f3430f.startService(C1256b.m5056g(this.f3430f, str));
    }

    /* renamed from: c */
    public void mo4547c(C4108p... pVarArr) {
        for (C4108p a : pVarArr) {
            m5089a(a);
        }
    }

    /* renamed from: f */
    public boolean mo4548f() {
        return true;
    }
}
