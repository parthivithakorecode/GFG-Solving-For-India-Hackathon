package p016b5;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import kotlinx.coroutines.internal.C3376e;
import p100n4.C3778g;

/* renamed from: b5.i1 */
public final class C1359i1 extends C1352h1 implements C1398s0 {

    /* renamed from: h */
    private final Executor f3559h;

    public C1359i1(Executor executor) {
        this.f3559h = executor;
        C3376e.m24572a(mo4718S());
    }

    /* renamed from: R */
    private final void m5355R(C3778g gVar, RejectedExecutionException rejectedExecutionException) {
        C1405u1.m5475c(gVar, C1348g1.m5340a("The task was rejected", rejectedExecutionException));
    }

    /* renamed from: O */
    public void mo4673O(C3778g gVar, Runnable runnable) {
        try {
            Executor S = mo4718S();
            C1322c.m5284a();
            S.execute(runnable);
        } catch (RejectedExecutionException e) {
            C1322c.m5284a();
            m5355R(gVar, e);
            C1419y0.m5578b().mo4673O(gVar, runnable);
        }
    }

    /* renamed from: S */
    public Executor mo4718S() {
        return this.f3559h;
    }

    public void close() {
        Executor S = mo4718S();
        ExecutorService executorService = S instanceof ExecutorService ? (ExecutorService) S : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1359i1) && ((C1359i1) obj).mo4718S() == mo4718S();
    }

    public int hashCode() {
        return System.identityHashCode(mo4718S());
    }

    public String toString() {
        return mo4718S().toString();
    }
}
