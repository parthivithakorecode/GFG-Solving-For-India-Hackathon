package p123r0;

import android.content.Context;
import android.os.Build;
import p089m0.C3646j;
import p089m0.C3648k;
import p117q0.C3937b;
import p129s0.C4015g;
import p141u0.C4108p;
import p153w0.C4260a;

/* renamed from: r0.f */
public class C3967f extends C3963c<C3937b> {

    /* renamed from: e */
    private static final String f22129e = C3646j.m25231f("NetworkNotRoamingCtrlr");

    public C3967f(Context context, C4260a aVar) {
        super(C4015g.m26289c(context, aVar).mo15500d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo15423b(C4108p pVar) {
        return pVar.f22323j.mo14767b() == C3648k.NOT_ROAMING;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo15424c(C3937b bVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            return !bVar.mo15393a() || !bVar.mo15395c();
        }
        C3646j.m25229c().mo14806a(f22129e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
        return !bVar.mo15393a();
    }
}
