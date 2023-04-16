package p006a5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C3357i;
import kotlin.jvm.internal.C3358j;
import p079k4.C3321j;
import p079k4.C3327n;
import p086l4.C3598v;
import p145u4.C4150l;
import p145u4.C4154p;
import p163x4.C4350a;
import p163x4.C4353c;
import p175z4.C4601b;

/* renamed from: a5.o */
class C0179o extends C0178n {

    /* renamed from: a5.o$a */
    static final class C0180a extends C3358j implements C4154p<CharSequence, Integer, C3321j<? extends Integer, ? extends Integer>> {

        /* renamed from: f */
        final /* synthetic */ char[] f302f;

        /* renamed from: g */
        final /* synthetic */ boolean f303g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0180a(char[] cArr, boolean z) {
            super(2);
            this.f302f = cArr;
            this.f303g = z;
        }

        /* renamed from: a */
        public final C3321j<Integer, Integer> mo367a(CharSequence charSequence, int i) {
            C3357i.m24508e(charSequence, "$this$$receiver");
            int z = C0179o.m559z(charSequence, this.f302f, i, this.f303g);
            if (z < 0) {
                return null;
            }
            return C3327n.m24453a(Integer.valueOf(z), 1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo367a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: a5.o$b */
    static final class C0181b extends C3358j implements C4154p<CharSequence, Integer, C3321j<? extends Integer, ? extends Integer>> {

        /* renamed from: f */
        final /* synthetic */ List<String> f304f;

        /* renamed from: g */
        final /* synthetic */ boolean f305g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0181b(List<String> list, boolean z) {
            super(2);
            this.f304f = list;
            this.f305g = z;
        }

        /* renamed from: a */
        public final C3321j<Integer, Integer> mo369a(CharSequence charSequence, int i) {
            C3357i.m24508e(charSequence, "$this$$receiver");
            C3321j n = C0179o.m550q(charSequence, this.f304f, i, this.f305g, false);
            if (n != null) {
                return C3327n.m24453a(n.mo14323c(), Integer.valueOf(((String) n.mo14324d()).length()));
            }
            return null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo369a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: a5.o$c */
    static final class C0182c extends C3358j implements C4150l<C4353c, String> {

        /* renamed from: f */
        final /* synthetic */ CharSequence f306f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0182c(CharSequence charSequence) {
            super(1);
            this.f306f = charSequence;
        }

        /* renamed from: a */
        public final String invoke(C4353c cVar) {
            C3357i.m24508e(cVar, "it");
            return C0179o.m535V(this.f306f, cVar);
        }
    }

    /* renamed from: A */
    public static final int m514A(CharSequence charSequence, char c, int i, boolean z) {
        C3357i.m24508e(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        return m518E(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: B */
    public static final int m515B(CharSequence charSequence, String str, int i, boolean z) {
        C3357i.m24508e(charSequence, "<this>");
        C3357i.m24508e(str, "string");
        return (z || !(charSequence instanceof String)) ? m555v(charSequence, str, i, 0, z, true) : ((String) charSequence).lastIndexOf(str, i);
    }

    /* renamed from: C */
    public static /* synthetic */ int m516C(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m552s(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m514A(charSequence, c, i, z);
    }

    /* renamed from: D */
    public static /* synthetic */ int m517D(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m552s(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m515B(charSequence, str, i, z);
    }

    /* renamed from: E */
    public static final int m518E(CharSequence charSequence, char[] cArr, int i, boolean z) {
        C3357i.m24508e(charSequence, "<this>");
        C3357i.m24508e(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            for (int c = C4357f.m26995c(i, m552s(charSequence)); -1 < c; c--) {
                char charAt = charSequence.charAt(c);
                int length = cArr.length;
                boolean z2 = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (C0162b.m473d(cArr[i2], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return c;
                }
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(C3579e.m24998j(cArr), i);
    }

    /* renamed from: F */
    public static final C4601b<String> m519F(CharSequence charSequence) {
        C3357i.m24508e(charSequence, "<this>");
        return m532S(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, (Object) null);
    }

    /* renamed from: G */
    public static final List<String> m520G(CharSequence charSequence) {
        C3357i.m24508e(charSequence, "<this>");
        return C4608h.m27638f(m519F(charSequence));
    }

    /* renamed from: H */
    private static final C4601b<C4353c> m521H(CharSequence charSequence, char[] cArr, int i, boolean z, int i2) {
        m527N(i2);
        return new C0163c(charSequence, i, i2, new C0180a(cArr, z));
    }

    /* renamed from: I */
    private static final C4601b<C4353c> m522I(CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        m527N(i2);
        return new C0163c(charSequence, i, i2, new C0181b(C3577d.m24988a(strArr), z));
    }

    /* renamed from: J */
    static /* synthetic */ C4601b m523J(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m521H(charSequence, cArr, i, z, i2);
    }

    /* renamed from: K */
    static /* synthetic */ C4601b m524K(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m522I(charSequence, strArr, i, z, i2);
    }

    /* renamed from: L */
    public static final boolean m525L(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        C3357i.m24508e(charSequence, "<this>");
        C3357i.m24508e(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C0162b.m473d(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: M */
    public static String m526M(String str, CharSequence charSequence) {
        C3357i.m24508e(str, "<this>");
        C3357i.m24508e(charSequence, "prefix");
        if (!m534U(str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        C3357i.m24507d(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /* renamed from: N */
    public static final void m527N(int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + i).toString());
        }
    }

    /* renamed from: O */
    public static final List<String> m528O(CharSequence charSequence, char[] cArr, boolean z, int i) {
        C3357i.m24508e(charSequence, "<this>");
        C3357i.m24508e(cArr, "delimiters");
        if (cArr.length == 1) {
            return m529P(charSequence, String.valueOf(cArr[0]), z, i);
        }
        Iterable<C4353c> c = C4608h.m27635c(m523J(charSequence, cArr, 0, z, i, 2, (Object) null));
        ArrayList arrayList = new ArrayList(C3586j.m25035h(c, 10));
        for (C4353c V : c) {
            arrayList.add(m535V(charSequence, V));
        }
        return arrayList;
    }

    /* renamed from: P */
    private static final List<String> m529P(CharSequence charSequence, String str, boolean z, int i) {
        m527N(i);
        int i2 = 0;
        int u = m554u(charSequence, str, 0, z);
        if (u == -1 || i == 1) {
            return C3584h.m25028a(charSequence.toString());
        }
        boolean z2 = i > 0;
        int i3 = 10;
        if (z2) {
            i3 = C4357f.m26995c(i, 10);
        }
        ArrayList arrayList = new ArrayList(i3);
        do {
            arrayList.add(charSequence.subSequence(i2, u).toString());
            i2 = str.length() + u;
            if ((z2 && arrayList.size() == i - 1) || (u = m554u(charSequence, str, i2, z)) == -1) {
                arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i2, u).toString());
            i2 = str.length() + u;
            break;
        } while ((u = m554u(charSequence, str, i2, z)) == -1);
        arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
        return arrayList;
    }

    /* renamed from: Q */
    public static /* synthetic */ List m530Q(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m528O(charSequence, cArr, z, i);
    }

    /* renamed from: R */
    public static final C4601b<String> m531R(CharSequence charSequence, String[] strArr, boolean z, int i) {
        C3357i.m24508e(charSequence, "<this>");
        C3357i.m24508e(strArr, "delimiters");
        return C4608h.m27636d(m524K(charSequence, strArr, 0, z, i, 2, (Object) null), new C0182c(charSequence));
    }

    /* renamed from: S */
    public static /* synthetic */ C4601b m532S(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m531R(charSequence, strArr, z, i);
    }

    /* renamed from: T */
    public static final boolean m533T(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C3357i.m24508e(charSequence, "<this>");
        C3357i.m24508e(charSequence2, "prefix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return C0178n.m513m((String) charSequence, (String) charSequence2, false, 2, (Object) null);
        }
        return m525L(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    /* renamed from: U */
    public static /* synthetic */ boolean m534U(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m533T(charSequence, charSequence2, z);
    }

    /* renamed from: V */
    public static final String m535V(CharSequence charSequence, C4353c cVar) {
        C3357i.m24508e(charSequence, "<this>");
        C3357i.m24508e(cVar, "range");
        return charSequence.subSequence(cVar.mo15974o().intValue(), cVar.mo15973n().intValue() + 1).toString();
    }

    /* renamed from: W */
    public static final String m536W(String str, char c, String str2) {
        C3357i.m24508e(str, "<this>");
        C3357i.m24508e(str2, "missingDelimiterValue");
        int x = m557x(str, c, 0, false, 6, (Object) null);
        if (x == -1) {
            return str2;
        }
        String substring = str.substring(x + 1, str.length());
        C3357i.m24507d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: X */
    public static final String m537X(String str, String str2, String str3) {
        C3357i.m24508e(str, "<this>");
        C3357i.m24508e(str2, "delimiter");
        C3357i.m24508e(str3, "missingDelimiterValue");
        int y = m558y(str, str2, 0, false, 6, (Object) null);
        if (y == -1) {
            return str3;
        }
        String substring = str.substring(y + str2.length(), str.length());
        C3357i.m24507d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: Y */
    public static /* synthetic */ String m538Y(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m536W(str, c, str2);
    }

    /* renamed from: Z */
    public static /* synthetic */ String m539Z(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m537X(str, str2, str3);
    }

    /* renamed from: a0 */
    public static final String m540a0(String str, char c, String str2) {
        C3357i.m24508e(str, "<this>");
        C3357i.m24508e(str2, "missingDelimiterValue");
        int C = m516C(str, c, 0, false, 6, (Object) null);
        if (C == -1) {
            return str2;
        }
        String substring = str.substring(C + 1, str.length());
        C3357i.m24507d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: b0 */
    public static /* synthetic */ String m541b0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m540a0(str, c, str2);
    }

    /* renamed from: c0 */
    public static final String m542c0(String str, char c, String str2) {
        C3357i.m24508e(str, "<this>");
        C3357i.m24508e(str2, "missingDelimiterValue");
        int x = m557x(str, c, 0, false, 6, (Object) null);
        if (x == -1) {
            return str2;
        }
        String substring = str.substring(0, x);
        C3357i.m24507d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: d0 */
    public static final String m543d0(String str, String str2, String str3) {
        C3357i.m24508e(str, "<this>");
        C3357i.m24508e(str2, "delimiter");
        C3357i.m24508e(str3, "missingDelimiterValue");
        int y = m558y(str, str2, 0, false, 6, (Object) null);
        if (y == -1) {
            return str3;
        }
        String substring = str.substring(0, y);
        C3357i.m24507d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: e0 */
    public static /* synthetic */ String m544e0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m542c0(str, c, str2);
    }

    /* renamed from: f0 */
    public static /* synthetic */ String m545f0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m543d0(str, str2, str3);
    }

    /* renamed from: g0 */
    public static CharSequence m546g0(CharSequence charSequence) {
        C3357i.m24508e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean c = C0161a.m472c(charSequence.charAt(!z ? i : length));
            if (!z) {
                if (!c) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!c) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    /* renamed from: o */
    public static final boolean m548o(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C3357i.m24508e(charSequence, "<this>");
        C3357i.m24508e(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (m558y(charSequence, (String) charSequence2, 0, z, 2, (Object) null) >= 0) {
                return true;
            }
        } else {
            if (m556w(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, (Object) null) >= 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public static /* synthetic */ boolean m549p(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m548o(charSequence, charSequence2, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static final C3321j<Integer, String> m550q(CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        int i2;
        T t;
        String str;
        T t2;
        if (z || collection.size() != 1) {
            C4350a cVar = !z2 ? new C4353c(C4357f.m26993a(i, 0), charSequence.length()) : C4357f.m26998f(C4357f.m26995c(i, m552s(charSequence)), 0);
            if (charSequence instanceof String) {
                i2 = cVar.mo15962h();
                int i3 = cVar.mo15964i();
                int j = cVar.mo15967j();
                if ((j > 0 && i2 <= i3) || (j < 0 && i3 <= i2)) {
                    while (true) {
                        Iterator<T> it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t2 = null;
                                break;
                            }
                            t2 = it.next();
                            String str2 = (String) t2;
                            if (C0178n.m511k(str2, 0, (String) charSequence, i2, str2.length(), z)) {
                                break;
                            }
                        }
                        str = (String) t2;
                        if (str == null) {
                            if (i2 == i3) {
                                break;
                            }
                            i2 += j;
                        } else {
                            break;
                        }
                    }
                }
                return null;
            }
            int h = cVar.mo15962h();
            int i4 = cVar.mo15964i();
            int j2 = cVar.mo15967j();
            if ((j2 > 0 && h <= i4) || (j2 < 0 && i4 <= h)) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it2.next();
                        String str3 = (String) t;
                        if (m525L(str3, 0, charSequence, i2, str3.length(), z)) {
                            break;
                        }
                    }
                    str = (String) t;
                    if (str == null) {
                        if (i2 == i4) {
                            break;
                        }
                        h = i2 + j2;
                    } else {
                        break;
                    }
                }
            }
            return null;
            return C3327n.m24453a(Integer.valueOf(i2), str);
        }
        String str4 = (String) C3593q.m25049t(collection);
        CharSequence charSequence2 = charSequence;
        String str5 = str4;
        int i5 = i;
        int y = !z2 ? m558y(charSequence2, str5, i5, false, 4, (Object) null) : m517D(charSequence2, str5, i5, false, 4, (Object) null);
        if (y < 0) {
            return null;
        }
        return C3327n.m24453a(Integer.valueOf(y), str4);
    }

    /* renamed from: r */
    public static final C4353c m551r(CharSequence charSequence) {
        C3357i.m24508e(charSequence, "<this>");
        return new C4353c(0, charSequence.length() - 1);
    }

    /* renamed from: s */
    public static final int m552s(CharSequence charSequence) {
        C3357i.m24508e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* renamed from: t */
    public static final int m553t(CharSequence charSequence, char c, int i, boolean z) {
        C3357i.m24508e(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return m559z(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: u */
    public static final int m554u(CharSequence charSequence, String str, int i, boolean z) {
        C3357i.m24508e(charSequence, "<this>");
        C3357i.m24508e(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return m556w(charSequence, str, i, charSequence.length(), z, false, 16, (Object) null);
    }

    /* renamed from: v */
    private static final int m555v(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C4350a cVar = !z2 ? new C4353c(C4357f.m26993a(i, 0), C4357f.m26995c(i2, charSequence.length())) : C4357f.m26998f(C4357f.m26995c(i, m552s(charSequence)), C4357f.m26993a(i2, 0));
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int h = cVar.mo15962h();
            int i3 = cVar.mo15964i();
            int j = cVar.mo15967j();
            if ((j <= 0 || h > i3) && (j >= 0 || i3 > h)) {
                return -1;
            }
            while (true) {
                if (m525L(charSequence2, 0, charSequence, h, charSequence2.length(), z)) {
                    return h;
                }
                if (h == i3) {
                    return -1;
                }
                h += j;
            }
        } else {
            int h2 = cVar.mo15962h();
            int i4 = cVar.mo15964i();
            int j2 = cVar.mo15967j();
            if ((j2 <= 0 || h2 > i4) && (j2 >= 0 || i4 > h2)) {
                return -1;
            }
            while (true) {
                if (C0178n.m511k((String) charSequence2, 0, (String) charSequence, h2, charSequence2.length(), z)) {
                    return h2;
                }
                if (h2 == i4) {
                    return -1;
                }
                h2 += j2;
            }
        }
    }

    /* renamed from: w */
    static /* synthetic */ int m556w(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        return m555v(charSequence, charSequence2, i, i2, z, z2);
    }

    /* renamed from: x */
    public static /* synthetic */ int m557x(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m553t(charSequence, c, i, z);
    }

    /* renamed from: y */
    public static /* synthetic */ int m558y(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m554u(charSequence, str, i, z);
    }

    /* renamed from: z */
    public static final int m559z(CharSequence charSequence, char[] cArr, int i, boolean z) {
        boolean z2;
        C3357i.m24508e(charSequence, "<this>");
        C3357i.m24508e(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            C3598v k = new C4353c(C4357f.m26993a(i, 0), m552s(charSequence)).iterator();
            while (k.hasNext()) {
                int a = k.mo14726a();
                char charAt = charSequence.charAt(a);
                int length = cArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z2 = false;
                        continue;
                        break;
                    } else if (C0162b.m473d(cArr[i2], charAt, z)) {
                        z2 = true;
                        continue;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return a;
                }
            }
            return -1;
        }
        return ((String) charSequence).indexOf(C3579e.m24998j(cArr), i);
    }
}
