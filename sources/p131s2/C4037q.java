package p131s2;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: s2.q */
final class C4037q<TResult> implements C4044x<TResult> {

    /* renamed from: a */
    private final Executor f22219a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f22220b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: c */
    public C4022c f22221c;

    public C4037q(Executor executor, C4022c cVar) {
        this.f22219a = executor;
        this.f22221c = cVar;
    }

    /* renamed from: b */
    public final void mo15530b(C4028h<TResult> hVar) {
        if (hVar.mo15513k()) {
            synchronized (this.f22220b) {
                if (this.f22221c != null) {
                    this.f22219a.execute(new C4036p(this));
                }
            }
        }
    }
}
