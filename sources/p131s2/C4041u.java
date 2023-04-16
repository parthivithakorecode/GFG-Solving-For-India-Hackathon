package p131s2;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: s2.u */
final class C4041u<TResult> implements C4044x<TResult> {

    /* renamed from: a */
    private final Executor f22229a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f22230b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: c */
    public C4025e f22231c;

    public C4041u(Executor executor, C4025e eVar) {
        this.f22229a = executor;
        this.f22231c = eVar;
    }

    /* renamed from: b */
    public final void mo15530b(C4028h<TResult> hVar) {
        if (!hVar.mo15515m() && !hVar.mo15513k()) {
            synchronized (this.f22230b) {
                if (this.f22231c != null) {
                    this.f22229a.execute(new C4040t(this, hVar));
                }
            }
        }
    }
}
