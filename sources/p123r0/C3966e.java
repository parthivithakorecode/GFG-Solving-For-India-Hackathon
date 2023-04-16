package p123r0;

import android.content.Context;
import android.os.Build;
import p089m0.C3646j;
import p089m0.C3648k;
import p117q0.C3937b;
import p129s0.C4015g;
import p141u0.C4108p;
import p153w0.C4260a;

/* renamed from: r0.e */
public class C3966e extends C3963c<C3937b> {

    /* renamed from: e */
    private static final String f22128e = C3646j.m25231f("NetworkMeteredCtrlr");

    public C3966e(Context context, C4260a aVar) {
        super(C4015g.m26289c(context, aVar).mo15500d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo15423b(C4108p pVar) {
        return pVar.f22323j.mo14767b() == C3648k.METERED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo15424c(C3937b bVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            return !bVar.mo15393a() || !bVar.mo15394b();
        }
        C3646j.m25229c().mo14806a(f22128e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
        return !bVar.mo15393a();
    }
}
