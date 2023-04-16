package p175z4;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C3357i;

/* renamed from: z4.a */
public final class C4600a<T> implements C4601b<T> {

    /* renamed from: a */
    private final AtomicReference<C4601b<T>> f23254a;

    public C4600a(C4601b<? extends T> bVar) {
        C3357i.m24508e(bVar, "sequence");
        this.f23254a = new AtomicReference<>(bVar);
    }

    public Iterator<T> iterator() {
        C4601b andSet = this.f23254a.getAndSet((Object) null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
