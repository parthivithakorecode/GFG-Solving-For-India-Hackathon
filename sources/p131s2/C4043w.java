package p131s2;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: s2.w */
final class C4043w<TResult> implements C4044x<TResult> {

    /* renamed from: a */
    private final Executor f22234a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f22235b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: c */
    public C4026f<? super TResult> f22236c;

    public C4043w(Executor executor, C4026f<? super TResult> fVar) {
        this.f22234a = executor;
        this.f22236c = fVar;
    }

    /* renamed from: b */
    public final void mo15530b(C4028h<TResult> hVar) {
        if (hVar.mo15515m()) {
            synchronized (this.f22235b) {
                if (this.f22236c != null) {
                    this.f22234a.execute(new C4042v(this, hVar));
                }
            }
        }
    }
}
