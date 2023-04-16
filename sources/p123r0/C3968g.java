package p123r0;

import android.content.Context;
import android.os.Build;
import p089m0.C3648k;
import p117q0.C3937b;
import p129s0.C4015g;
import p141u0.C4108p;
import p153w0.C4260a;

/* renamed from: r0.g */
public class C3968g extends C3963c<C3937b> {
    public C3968g(Context context, C4260a aVar) {
        super(C4015g.m26289c(context, aVar).mo15500d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo15423b(C4108p pVar) {
        return pVar.f22323j.mo14767b() == C3648k.UNMETERED || (Build.VERSION.SDK_INT >= 30 && pVar.f22323j.mo14767b() == C3648k.TEMPORARILY_UNMETERED);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo15424c(C3937b bVar) {
        return !bVar.mo15393a() || bVar.mo15394b();
    }
}
