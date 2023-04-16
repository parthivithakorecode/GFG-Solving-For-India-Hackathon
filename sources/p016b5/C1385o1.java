package p016b5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p079k4.C3330q;
import p145u4.C4150l;

/* renamed from: b5.o1 */
final class C1385o1 extends C1399s1 {

    /* renamed from: k */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f3587k = AtomicIntegerFieldUpdater.newUpdater(C1385o1.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: j */
    private final C4150l<Throwable, C3330q> f3588j;

    public C1385o1(C4150l<? super Throwable, C3330q> lVar) {
        this.f3588j = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo4761y((Throwable) obj);
        return C3330q.f20829a;
    }

    /* renamed from: y */
    public void mo4761y(Throwable th) {
        if (f3587k.compareAndSet(this, 0, 1)) {
            this.f3588j.invoke(th);
        }
    }
}
