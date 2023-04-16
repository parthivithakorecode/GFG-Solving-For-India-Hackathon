package p131s2;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: s2.s */
final class C4039s<TResult> implements C4044x<TResult> {

    /* renamed from: a */
    private final Executor f22224a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f22225b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: c */
    public C4024d<TResult> f22226c;

    public C4039s(Executor executor, C4024d<TResult> dVar) {
        this.f22224a = executor;
        this.f22226c = dVar;
    }

    /* renamed from: b */
    public final void mo15530b(C4028h<TResult> hVar) {
        synchronized (this.f22225b) {
            if (this.f22226c != null) {
                this.f22224a.execute(new C4038r(this, hVar));
            }
        }
    }
}
