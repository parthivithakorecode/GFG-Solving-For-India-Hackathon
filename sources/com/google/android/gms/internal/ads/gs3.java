package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class gs3 {

    /* renamed from: a */
    private static final Class<?> f7584a;

    /* renamed from: b */
    private static final ws3<?, ?> f7585b = m9914C(false);

    /* renamed from: c */
    private static final ws3<?, ?> f7586c = m9914C(true);

    /* renamed from: d */
    private static final ws3<?, ?> f7587d = new ys3();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f7584a = cls;
    }

    /* renamed from: A */
    static int m9912A(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (hp3.m10709a(i << 3) + 1);
    }

    /* renamed from: B */
    public static void m9913B(int i, List<Long> list, ip3 ip3, boolean z) {
        if (list != null && !list.isEmpty()) {
            ip3.mo8219k(i, list, z);
        }
    }

    /* renamed from: C */
    private static ws3<?, ?> m9914C(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (ws3) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: D */
    static int m9915D(List<?> list) {
        return list.size();
    }

    /* renamed from: E */
    static int m9916E(int i, List<uo3> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D = size * hp3.m10708D(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            D += hp3.m10713x(list.get(i2));
        }
        return D;
    }

    /* renamed from: F */
    static int m9917F(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m9918G(list) + (size * hp3.m10708D(i));
    }

    /* renamed from: G */
    static int m9918G(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof bq3) {
            bq3 bq3 = (bq3) list;
            i = 0;
            while (i2 < size) {
                i += hp3.m10715z(bq3.mo5927i(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + hp3.m10715z(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: H */
    static int m9919H(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (hp3.m10709a(i << 3) + 4);
    }

    /* renamed from: I */
    static int m9920I(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: J */
    static int m9921J(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (hp3.m10709a(i << 3) + 8);
    }

    /* renamed from: K */
    static int m9922K(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: L */
    static int m9923L(int i, List<kr3> list, es3 es3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += hp3.m10714y(i, list.get(i3), es3);
        }
        return i2;
    }

    /* renamed from: M */
    static int m9924M(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m9925N(list) + (size * hp3.m10708D(i));
    }

    /* renamed from: N */
    static int m9925N(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof bq3) {
            bq3 bq3 = (bq3) list;
            i = 0;
            while (i2 < size) {
                i += hp3.m10715z(bq3.mo5927i(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + hp3.m10715z(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: O */
    static int m9926O(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m9927P(list) + (list.size() * hp3.m10708D(i));
    }

    /* renamed from: P */
    static int m9927P(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zq3) {
            zq3 zq3 = (zq3) list;
            i = 0;
            while (i2 < size) {
                i += hp3.m10710b(zq3.mo12258i(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + hp3.m10710b(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Q */
    static int m9928Q(int i, Object obj, es3 es3) {
        if (!(obj instanceof qq3)) {
            return hp3.m10709a(i << 3) + hp3.m10706B((kr3) obj, es3);
        }
        int a = hp3.m10709a(i << 3);
        int a2 = ((qq3) obj).mo10354a();
        return a + hp3.m10709a(a2) + a2;
    }

    /* renamed from: R */
    static int m9929R(int i, List<?> list, es3 es3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D = hp3.m10708D(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            D += obj instanceof qq3 ? hp3.m10705A((qq3) obj) : hp3.m10706B((kr3) obj, es3);
        }
        return D;
    }

    /* renamed from: S */
    static int m9930S(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m9931T(list) + (size * hp3.m10708D(i));
    }

    /* renamed from: T */
    static int m9931T(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof bq3) {
            bq3 bq3 = (bq3) list;
            i = 0;
            while (i2 < size) {
                int i3 = bq3.mo5927i(i2);
                i += hp3.m10709a((i3 >> 31) ^ (i3 + i3));
                i2++;
            }
        } else {
            int i4 = 0;
            while (i2 < size) {
                int intValue = list.get(i2).intValue();
                i4 = i + hp3.m10709a((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: U */
    static int m9932U(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m9933V(list) + (size * hp3.m10708D(i));
    }

    /* renamed from: V */
    static int m9933V(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zq3) {
            zq3 zq3 = (zq3) list;
            i = 0;
            while (i2 < size) {
                long i3 = zq3.mo12258i(i2);
                i += hp3.m10710b((i3 >> 63) ^ (i3 + i3));
                i2++;
            }
        } else {
            int i4 = 0;
            while (i2 < size) {
                long longValue = list.get(i2).longValue();
                i4 = i + hp3.m10710b((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: W */
    static int m9934W(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int D = hp3.m10708D(i) * size;
        if (list instanceof sq3) {
            sq3 sq3 = (sq3) list;
            while (i2 < size) {
                Object D2 = sq3.mo5946D(i2);
                D += D2 instanceof uo3 ? hp3.m10713x((uo3) D2) : hp3.m10707C((String) D2);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                D += obj instanceof uo3 ? hp3.m10713x((uo3) obj) : hp3.m10707C((String) obj);
                i2++;
            }
        }
        return D;
    }

    /* renamed from: X */
    static int m9935X(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m9936Y(list) + (size * hp3.m10708D(i));
    }

    /* renamed from: Y */
    static int m9936Y(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof bq3) {
            bq3 bq3 = (bq3) list;
            i = 0;
            while (i2 < size) {
                i += hp3.m10709a(bq3.mo5927i(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + hp3.m10709a(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Z */
    static int m9937Z(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m9939a0(list) + (size * hp3.m10708D(i));
    }

    /* renamed from: a */
    public static ws3<?, ?> m9938a() {
        return f7586c;
    }

    /* renamed from: a0 */
    static int m9939a0(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zq3) {
            zq3 zq3 = (zq3) list;
            i = 0;
            while (i2 < size) {
                i += hp3.m10710b(zq3.mo12258i(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + hp3.m10710b(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static ws3<?, ?> m9940b() {
        return f7587d;
    }

    /* renamed from: b0 */
    public static ws3<?, ?> m9941b0() {
        return f7585b;
    }

    /* renamed from: c */
    static <UT, UB> UB m9942c(int i, List<Integer> list, eq3 eq3, UB ub, ws3<UT, UB> ws3) {
        if (eq3 == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (eq3.mo6282d(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m9943d(i, intValue, ub, ws3);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return ub;
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!eq3.mo6282d(intValue2)) {
                    ub = m9943d(i, intValue2, ub, ws3);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: d */
    static <UT, UB> UB m9943d(int i, int i2, UB ub, ws3<UT, UB> ws3) {
        if (ub == null) {
            ub = ws3.mo11708f();
        }
        ws3.mo11714l(ub, i, (long) i2);
        return ub;
    }

    /* renamed from: e */
    static <T, FT extends rp3<FT>> void m9944e(np3<FT> np3, T t, T t2) {
        np3.mo9574a(t2);
        throw null;
    }

    /* renamed from: f */
    static <T, UT, UB> void m9945f(ws3<UT, UB> ws3, T t, T t2) {
        ws3.mo11717o(t, ws3.mo11707e(ws3.mo11706d(t), ws3.mo11706d(t2)));
    }

    /* renamed from: g */
    public static void m9946g(Class<?> cls) {
        Class<?> cls2;
        if (!aq3.class.isAssignableFrom(cls) && (cls2 = f7584a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: h */
    static boolean m9947h(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: i */
    static <T> void m9948i(fr3 fr3, T t, T t2, long j) {
        gt3.m9971D(t, j, fr3.m9276c(gt3.m9991p(t, j), gt3.m9991p(t2, j)));
    }

    /* renamed from: j */
    public static void m9949j(int i, List<Boolean> list, ip3 ip3, boolean z) {
        if (list != null && !list.isEmpty()) {
            ip3.mo8221n(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m9950k(int i, List<uo3> list, ip3 ip3) {
        if (list != null && !list.isEmpty()) {
            ip3.mo8223p(i, list);
        }
    }

    /* renamed from: l */
    public static void m9951l(int i, List<Double> list, ip3 ip3, boolean z) {
        if (list != null && !list.isEmpty()) {
            ip3.mo8225r(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m9952m(int i, List<Integer> list, ip3 ip3, boolean z) {
        if (list != null && !list.isEmpty()) {
            ip3.mo8228u(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m9953n(int i, List<Integer> list, ip3 ip3, boolean z) {
        if (list != null && !list.isEmpty()) {
            ip3.mo8230w(i, list, z);
        }
    }

    /* renamed from: o */
    public static void m9954o(int i, List<Long> list, ip3 ip3, boolean z) {
        if (list != null && !list.isEmpty()) {
            ip3.mo8232y(i, list, z);
        }
    }

    /* renamed from: p */
    public static void m9955p(int i, List<Float> list, ip3 ip3, boolean z) {
        if (list != null && !list.isEmpty()) {
            ip3.mo8198A(i, list, z);
        }
    }

    /* renamed from: q */
    public static void m9956q(int i, List<?> list, ip3 ip3, es3 es3) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ip3.mo8199B(i, list.get(i2), es3);
            }
        }
    }

    /* renamed from: r */
    public static void m9957r(int i, List<Integer> list, ip3 ip3, boolean z) {
        if (list != null && !list.isEmpty()) {
            ip3.mo8201D(i, list, z);
        }
    }

    /* renamed from: s */
    public static void m9958s(int i, List<Long> list, ip3 ip3, boolean z) {
        if (list != null && !list.isEmpty()) {
            ip3.mo8203F(i, list, z);
        }
    }

    /* renamed from: t */
    public static void m9959t(int i, List<?> list, ip3 ip3, es3 es3) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ip3.mo8204G(i, list.get(i2), es3);
            }
        }
    }

    /* renamed from: u */
    public static void m9960u(int i, List<Integer> list, ip3 ip3, boolean z) {
        if (list != null && !list.isEmpty()) {
            ip3.mo8206I(i, list, z);
        }
    }

    /* renamed from: v */
    public static void m9961v(int i, List<Long> list, ip3 ip3, boolean z) {
        if (list != null && !list.isEmpty()) {
            ip3.mo8208K(i, list, z);
        }
    }

    /* renamed from: w */
    public static void m9962w(int i, List<Integer> list, ip3 ip3, boolean z) {
        if (list != null && !list.isEmpty()) {
            ip3.mo8210b(i, list, z);
        }
    }

    /* renamed from: x */
    public static void m9963x(int i, List<Long> list, ip3 ip3, boolean z) {
        if (list != null && !list.isEmpty()) {
            ip3.mo8212d(i, list, z);
        }
    }

    /* renamed from: y */
    public static void m9964y(int i, List<String> list, ip3 ip3) {
        if (list != null && !list.isEmpty()) {
            ip3.mo8215g(i, list);
        }
    }

    /* renamed from: z */
    public static void m9965z(int i, List<Integer> list, ip3 ip3, boolean z) {
        if (list != null && !list.isEmpty()) {
            ip3.mo8217i(i, list, z);
        }
    }
}
