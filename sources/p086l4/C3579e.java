package p086l4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C3357i;

/* renamed from: l4.e */
class C3579e extends C3577d {
    /* renamed from: g */
    public static <T> List<T> m24995g(T[] tArr) {
        C3357i.m24508e(tArr, "<this>");
        return (List) m24996h(tArr, new ArrayList());
    }

    /* renamed from: h */
    public static final <C extends Collection<? super T>, T> C m24996h(T[] tArr, C c) {
        C3357i.m24508e(tArr, "<this>");
        C3357i.m24508e(c, "destination");
        for (T t : tArr) {
            if (t != null) {
                c.add(t);
            }
        }
        return c;
    }

    /* renamed from: i */
    public static <T> T m24997i(T[] tArr) {
        C3357i.m24508e(tArr, "<this>");
        if (!(tArr.length == 0)) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: j */
    public static char m24998j(char[] cArr) {
        C3357i.m24508e(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /* renamed from: k */
    public static <T> T m24999k(T[] tArr) {
        C3357i.m24508e(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: l */
    public static final <T> T[] m25000l(T[] tArr, Comparator<? super T> comparator) {
        C3357i.m24508e(tArr, "<this>");
        C3357i.m24508e(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] copyOf = Arrays.copyOf(tArr, tArr.length);
        C3357i.m24507d(copyOf, "copyOf(this, size)");
        C3577d.m24993f(copyOf, comparator);
        return copyOf;
    }

    /* renamed from: m */
    public static <T> List<T> m25001m(T[] tArr, Comparator<? super T> comparator) {
        C3357i.m24508e(tArr, "<this>");
        C3357i.m24508e(comparator, "comparator");
        return C3577d.m24988a(m25000l(tArr, comparator));
    }

    /* renamed from: n */
    public static <T, C extends Collection<? super T>> C m25002n(T[] tArr, C c) {
        C3357i.m24508e(tArr, "<this>");
        C3357i.m24508e(c, "destination");
        for (T add : tArr) {
            c.add(add);
        }
        return c;
    }
}
