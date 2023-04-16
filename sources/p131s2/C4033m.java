package p131s2;

import java.util.concurrent.Executor;

/* renamed from: s2.m */
final class C4033m<TResult, TContinuationResult> implements C4044x<TResult> {

    /* renamed from: a */
    private final Executor f22210a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C4018a<TResult, TContinuationResult> f22211b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C4021b0<TContinuationResult> f22212c;

    public C4033m(Executor executor, C4018a<TResult, TContinuationResult> aVar, C4021b0<TContinuationResult> b0Var) {
        this.f22210a = executor;
        this.f22211b = aVar;
        this.f22212c = b0Var;
    }

    /* renamed from: b */
    public final void mo15530b(C4028h<TResult> hVar) {
        this.f22210a.execute(new C4032l(this, hVar));
    }
}
