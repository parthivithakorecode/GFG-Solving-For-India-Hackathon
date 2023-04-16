package p084l2;

import java.util.concurrent.atomic.AtomicReference;
import p137t2.C4071f;

/* renamed from: l2.a0 */
public final class C3470a0 {

    /* renamed from: a */
    private final C3556v1<C3554v> f21017a;

    /* renamed from: b */
    private final AtomicReference<C3483d0> f21018b = new AtomicReference<>();

    C3470a0(C3556v1<C3554v> v1Var) {
        this.f21017a = v1Var;
    }

    /* renamed from: a */
    public final void mo14559a(C3483d0 d0Var) {
        this.f21018b.set(d0Var);
    }

    /* renamed from: b */
    public final void mo14560b(C4071f.C4073b bVar, C4071f.C4072a aVar) {
        C3496g1.m24889a();
        C3483d0 d0Var = this.f21018b.get();
        if (d0Var == null) {
            aVar.mo12402b(new C3489e2(3, "No available form can be built.").mo14578a());
        } else {
            this.f21017a.zza().mo14590a(d0Var).zza().zza().mo14628f(bVar, aVar);
        }
    }

    /* renamed from: c */
    public final boolean mo14561c() {
        return this.f21018b.get() != null;
    }
}
