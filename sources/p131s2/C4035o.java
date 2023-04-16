package p131s2;

import java.util.concurrent.Executor;

/* renamed from: s2.o */
final class C4035o<TResult, TContinuationResult> implements C4026f<TContinuationResult>, C4025e, C4022c, C4044x {

    /* renamed from: a */
    private final Executor f22215a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C4018a<TResult, C4028h<TContinuationResult>> f22216b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C4021b0<TContinuationResult> f22217c;

    public C4035o(Executor executor, C4018a<TResult, C4028h<TContinuationResult>> aVar, C4021b0<TContinuationResult> b0Var) {
        this.f22215a = executor;
        this.f22216b = aVar;
        this.f22217c = b0Var;
    }

    /* renamed from: a */
    public final void mo15521a() {
        this.f22217c.mo15520r();
    }

    /* renamed from: b */
    public final void mo15530b(C4028h<TResult> hVar) {
        this.f22215a.execute(new C4034n(this, hVar));
    }

    /* renamed from: c */
    public final void mo15523c(TContinuationResult tcontinuationresult) {
        this.f22217c.mo15516n(tcontinuationresult);
    }

    /* renamed from: d */
    public final void mo7781d(Exception exc) {
        this.f22217c.mo15518p(exc);
    }
}
