package p016b5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.internal.C3372c0;
import kotlinx.coroutines.internal.C3384i;
import p145u4.C4150l;

/* renamed from: b5.u0 */
public final class C1404u0<T> extends C3372c0<T> {

    /* renamed from: i */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f3606i = AtomicIntegerFieldUpdater.newUpdater(C1404u0.class, "_decision");
    private volatile /* synthetic */ int _decision;

    /* renamed from: z0 */
    private final boolean m5470z0() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f3606i.compareAndSet(this, 0, 2));
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo4784p(Object obj) {
        mo4646u0(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public void mo4646u0(Object obj) {
        if (!m5470z0()) {
            C3384i.m24601c(C3855c.m25870b(this.f20858h), C1421z.m5587a(obj, this.f20858h), (C4150l) null, 2, (Object) null);
        }
    }
}
