package p084l2;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: l2.o1 */
final class C3529o1 {

    /* renamed from: a */
    private final ConcurrentHashMap<C3525n1, List<Throwable>> f21151a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f21152b = new ReferenceQueue<>();

    C3529o1() {
    }

    /* renamed from: a */
    public final List<Throwable> mo14621a(Throwable th, boolean z) {
        while (true) {
            Reference<? extends Throwable> poll = this.f21152b.poll();
            if (poll == null) {
                break;
            }
            this.f21151a.remove(poll);
        }
        List<Throwable> list = this.f21151a.get(new C3525n1(th, (ReferenceQueue<Throwable>) null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f21151a.putIfAbsent(new C3525n1(th, this.f21152b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
