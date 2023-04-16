package p016b5;

import java.util.concurrent.locks.LockSupport;
import p016b5.C1327c1;

/* renamed from: b5.d1 */
public abstract class C1335d1 extends C1320b1 {
    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public abstract Thread mo4700a0();

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public void mo4701b0(long j, C1327c1.C1328a aVar) {
        C1390q0.f3591l.mo4678n0(j, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c0 */
    public final void mo4702c0() {
        Thread a0 = mo4700a0();
        if (Thread.currentThread() != a0) {
            C1322c.m5284a();
            LockSupport.unpark(a0);
        }
    }
}
