package p086l4;

import java.util.Set;
import kotlin.jvm.internal.C3357i;

/* renamed from: l4.e0 */
class C3580e0 extends C3578d0 {
    /* renamed from: b */
    public static <T> Set<T> m25003b() {
        return C3597u.f21272f;
    }

    /* renamed from: c */
    public static final <T> Set<T> m25004c(Set<? extends T> set) {
        C3357i.m24508e(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : C3578d0.m24994a(set.iterator().next()) : m25003b();
    }
}
