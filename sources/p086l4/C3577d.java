package p086l4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C3357i;

/* renamed from: l4.d */
class C3577d extends C3575c {
    /* renamed from: a */
    public static <T> List<T> m24988a(T[] tArr) {
        C3357i.m24508e(tArr, "<this>");
        List<T> a = C3581f.m25005a(tArr);
        C3357i.m24507d(a, "asList(this)");
        return a;
    }

    /* renamed from: b */
    public static final <T> T[] m24989b(T[] tArr, T[] tArr2, int i, int i2, int i3) {
        C3357i.m24508e(tArr, "<this>");
        C3357i.m24508e(tArr2, "destination");
        System.arraycopy(tArr, i2, tArr2, i, i3 - i2);
        return tArr2;
    }

    /* renamed from: c */
    public static /* synthetic */ Object[] m24990c(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        return m24989b(objArr, objArr2, i, i2, i3);
    }

    /* renamed from: d */
    public static <T> void m24991d(T[] tArr, T t, int i, int i2) {
        C3357i.m24508e(tArr, "<this>");
        Arrays.fill(tArr, i, i2, t);
    }

    /* renamed from: e */
    public static /* synthetic */ void m24992e(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        m24991d(objArr, obj, i, i2);
    }

    /* renamed from: f */
    public static final <T> void m24993f(T[] tArr, Comparator<? super T> comparator) {
        C3357i.m24508e(tArr, "<this>");
        C3357i.m24508e(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }
}
