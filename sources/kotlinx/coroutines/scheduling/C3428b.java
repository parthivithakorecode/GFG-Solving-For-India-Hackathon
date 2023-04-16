package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlinx.coroutines.internal.C3379f0;
import p016b5.C1332d0;
import p016b5.C1352h1;
import p100n4.C3778g;
import p100n4.C3784h;

/* renamed from: kotlinx.coroutines.scheduling.b */
public final class C3428b extends C1352h1 implements Executor {

    /* renamed from: h */
    public static final C3428b f20956h = new C3428b();

    /* renamed from: i */
    private static final C1332d0 f20957i = C3439m.f20976g.mo4695Q(C3383h0.m24597d("kotlinx.coroutines.io.parallelism", C4357f.m26993a(64, C3379f0.m24574a()), 0, 0, 12, (Object) null));

    private C3428b() {
    }

    /* renamed from: O */
    public void mo4673O(C3778g gVar, Runnable runnable) {
        f20957i.mo4673O(gVar, runnable);
    }

    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    public void execute(Runnable runnable) {
        mo4673O(C3784h.f21692f, runnable);
    }

    public String toString() {
        return "Dispatchers.IO";
    }
}
