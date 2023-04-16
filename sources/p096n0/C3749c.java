package p096n0;

import androidx.lifecycle.C1117s;
import androidx.work.impl.utils.futures.C1284d;
import p089m0.C3651m;

/* renamed from: n0.c */
public class C3749c implements C3651m {

    /* renamed from: c */
    private final C1117s<C3651m.C3653b> f21590c = new C1117s<>();

    /* renamed from: d */
    private final C1284d<C3651m.C3653b.C3656c> f21591d = C1284d.m5161u();

    public C3749c() {
        mo14955a(C3651m.f21401b);
    }

    /* renamed from: a */
    public void mo14955a(C3651m.C3653b bVar) {
        this.f21590c.mo3787h(bVar);
        if (bVar instanceof C3651m.C3653b.C3656c) {
            this.f21591d.mo4583q((C3651m.C3653b.C3656c) bVar);
        } else if (bVar instanceof C3651m.C3653b.C3654a) {
            this.f21591d.mo4584r(((C3651m.C3653b.C3654a) bVar).mo14815a());
        }
    }
}
