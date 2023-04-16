package p086l4;

import java.util.Collection;
import kotlin.jvm.internal.C3357i;

/* renamed from: l4.j */
class C3586j extends C3585i {
    /* renamed from: h */
    public static <T> int m25035h(Iterable<? extends T> iterable, int i) {
        C3357i.m24508e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}
