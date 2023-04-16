package p016b5;

import kotlinx.coroutines.internal.C3382h;
import p100n4.C3773d;

/* renamed from: b5.n */
public final class C1380n {
    /* renamed from: a */
    public static final <T> C1371l<T> m5422a(C3773d<? super T> dVar) {
        if (!(dVar instanceof C3382h)) {
            return new C1371l<>(dVar, 1);
        }
        C1371l<T> n = ((C3382h) dVar).mo14413n();
        if (n == null || !n.mo4741G()) {
            n = null;
        }
        return n == null ? new C1371l<>(dVar, 2) : n;
    }
}
