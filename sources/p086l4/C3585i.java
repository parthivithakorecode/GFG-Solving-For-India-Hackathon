package p086l4;

import java.util.List;
import kotlin.jvm.internal.C3357i;

/* renamed from: l4.i */
class C3585i extends C3584h {
    /* renamed from: b */
    public static <T> List<T> m25029b() {
        return C3595s.f21270f;
    }

    /* renamed from: c */
    public static <T> int m25030c(List<? extends T> list) {
        C3357i.m24508e(list, "<this>");
        return list.size() - 1;
    }

    /* renamed from: d */
    public static <T> List<T> m25031d(T... tArr) {
        C3357i.m24508e(tArr, "elements");
        return tArr.length > 0 ? C3577d.m24988a(tArr) : m25029b();
    }

    /* renamed from: e */
    public static <T> List<T> m25032e(T... tArr) {
        C3357i.m24508e(tArr, "elements");
        return C3579e.m24995g(tArr);
    }

    /* renamed from: f */
    public static <T> List<T> m25033f(List<? extends T> list) {
        C3357i.m24508e(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : C3584h.m25028a(list.get(0)) : m25029b();
    }

    /* renamed from: g */
    public static void m25034g() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
