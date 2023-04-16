package p086l4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.jvm.internal.C3357i;
import p079k4.C3321j;
import p079k4.C3327n;
import p145u4.C4150l;

/* renamed from: l4.q */
class C3593q extends C3592p {
    /* renamed from: A */
    public static <T> Set<T> m25037A(Iterable<? extends T> iterable) {
        C3357i.m24508e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C3580e0.m25004c((Set) m25052w(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C3580e0.m25003b();
        }
        if (size != 1) {
            return (Set) m25052w(iterable, new LinkedHashSet(C3601y.m25077a(collection.size())));
        }
        return C3578d0.m24994a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    /* renamed from: B */
    public static <T, R> List<C3321j<T, R>> m25038B(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        C3357i.m24508e(iterable, "<this>");
        C3357i.m24508e(iterable2, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C3586j.m25035h(iterable, 10), C3586j.m25035h(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(C3327n.m24453a(it.next(), it2.next()));
        }
        return arrayList;
    }

    /* renamed from: j */
    public static <T> List<T> m25039j(Iterable<? extends T> iterable, int i) {
        ArrayList arrayList;
        C3357i.m24508e(iterable, "<this>");
        int i2 = 0;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return m25053x(iterable);
        } else {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                int size = collection.size() - i;
                if (size <= 0) {
                    return C3585i.m25029b();
                }
                if (size == 1) {
                    return C3584h.m25028a(m25046q(iterable));
                }
                arrayList = new ArrayList(size);
                if (iterable instanceof List) {
                    if (iterable instanceof RandomAccess) {
                        int size2 = collection.size();
                        while (i < size2) {
                            arrayList.add(((List) iterable).get(i));
                            i++;
                        }
                    } else {
                        ListIterator listIterator = ((List) iterable).listIterator(i);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            for (Object next : iterable) {
                if (i2 >= i) {
                    arrayList.add(next);
                } else {
                    i2++;
                }
            }
            return C3585i.m25033f(arrayList);
        }
    }

    /* renamed from: k */
    public static <T> T m25040k(List<? extends T> list) {
        C3357i.m24508e(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: l */
    public static <T> T m25041l(List<? extends T> list) {
        C3357i.m24508e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: m */
    public static final <T, A extends Appendable> A m25042m(Iterable<? extends T> iterable, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C4150l<? super T, ? extends CharSequence> lVar) {
        C3357i.m24508e(iterable, "<this>");
        C3357i.m24508e(a, "buffer");
        C3357i.m24508e(charSequence, "separator");
        C3357i.m24508e(charSequence2, "prefix");
        C3357i.m24508e(charSequence3, "postfix");
        C3357i.m24508e(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (Object next : iterable) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C0168f.m499a(a, next, lVar);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    /* renamed from: n */
    public static /* synthetic */ Appendable m25043n(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C4150l lVar, int i2, Object obj) {
        String str = (i2 & 2) != 0 ? ", " : charSequence;
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i2 & 4) != 0 ? charSequence5 : charSequence2;
        if ((i2 & 8) == 0) {
            charSequence5 = charSequence3;
        }
        return m25042m(iterable, appendable, str, charSequence6, charSequence5, (i2 & 16) != 0 ? -1 : i, (i2 & 32) != 0 ? "..." : charSequence4, (i2 & 64) != 0 ? null : lVar);
    }

    /* renamed from: o */
    public static final <T> String m25044o(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C4150l<? super T, ? extends CharSequence> lVar) {
        C3357i.m24508e(iterable, "<this>");
        C3357i.m24508e(charSequence, "separator");
        C3357i.m24508e(charSequence2, "prefix");
        C3357i.m24508e(charSequence3, "postfix");
        C3357i.m24508e(charSequence4, "truncated");
        String sb = ((StringBuilder) m25042m(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, lVar)).toString();
        C3357i.m24507d(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    /* renamed from: p */
    public static /* synthetic */ String m25045p(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C4150l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i2 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i2 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        return m25044o(iterable, charSequence, charSequence6, charSequence5, i3, charSequence7, lVar);
    }

    /* renamed from: q */
    public static final <T> T m25046q(Iterable<? extends T> iterable) {
        T next;
        C3357i.m24508e(iterable, "<this>");
        if (iterable instanceof List) {
            return m25047r((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            do {
                next = it.next();
            } while (it.hasNext());
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: r */
    public static <T> T m25047r(List<? extends T> list) {
        C3357i.m24508e(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(C3585i.m25030c(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: s */
    public static <T extends Comparable<? super T>> T m25048s(Iterable<? extends T> iterable) {
        C3357i.m24508e(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t = (Comparable) it.next();
        while (it.hasNext()) {
            T t2 = (Comparable) it.next();
            if (t.compareTo(t2) > 0) {
                t = t2;
            }
        }
        return t;
    }

    /* renamed from: t */
    public static <T> T m25049t(Iterable<? extends T> iterable) {
        C3357i.m24508e(iterable, "<this>");
        if (iterable instanceof List) {
            return m25050u((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: u */
    public static final <T> T m25050u(List<? extends T> list) {
        C3357i.m24508e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        } else if (size == 1) {
            return list.get(0);
        } else {
            throw new IllegalArgumentException("List has more than one element.");
        }
    }

    /* renamed from: v */
    public static <T> T m25051v(List<? extends T> list) {
        C3357i.m24508e(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    /* renamed from: w */
    public static <T, C extends Collection<? super T>> C m25052w(Iterable<? extends T> iterable, C c) {
        C3357i.m24508e(iterable, "<this>");
        C3357i.m24508e(c, "destination");
        for (Object add : iterable) {
            c.add(add);
        }
        return c;
    }

    /* renamed from: x */
    public static <T> List<T> m25053x(Iterable<? extends T> iterable) {
        C3357i.m24508e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C3585i.m25033f(m25054y(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C3585i.m25029b();
        }
        if (size != 1) {
            return m25055z(collection);
        }
        return C3584h.m25028a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    /* renamed from: y */
    public static final <T> List<T> m25054y(Iterable<? extends T> iterable) {
        C3357i.m24508e(iterable, "<this>");
        return iterable instanceof Collection ? m25055z((Collection) iterable) : (List) m25052w(iterable, new ArrayList());
    }

    /* renamed from: z */
    public static final <T> List<T> m25055z(Collection<? extends T> collection) {
        C3357i.m24508e(collection, "<this>");
        return new ArrayList(collection);
    }
}
