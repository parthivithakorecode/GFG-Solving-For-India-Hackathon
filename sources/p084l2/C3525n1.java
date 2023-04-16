package p084l2;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* renamed from: l2.n1 */
final class C3525n1 extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f21147a;

    public C3525n1(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        Objects.requireNonNull(th, "The referent cannot be null");
        this.f21147a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C3525n1.class) {
            if (this == obj) {
                return true;
            }
            C3525n1 n1Var = (C3525n1) obj;
            return this.f21147a == n1Var.f21147a && get() == n1Var.get();
        }
    }

    public final int hashCode() {
        return this.f21147a;
    }
}
