package p006a5;

import kotlin.jvm.internal.C3357i;

/* renamed from: a5.n */
class C0178n extends C0177m {
    /* renamed from: h */
    public static final boolean m508h(String str, String str2, boolean z) {
        C3357i.m24508e(str, "<this>");
        C3357i.m24508e(str2, "suffix");
        if (!z) {
            return str.endsWith(str2);
        }
        return m511k(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    /* renamed from: i */
    public static /* synthetic */ boolean m509i(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m508h(str, str2, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m510j(java.lang.CharSequence r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C3357i.m24508e(r4, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x003e
            x4.c r0 = p006a5.C0179o.m551r(r4)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0020
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0020
        L_0x001e:
            r4 = r2
            goto L_0x003c
        L_0x0020:
            java.util.Iterator r0 = r0.iterator()
        L_0x0024:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x001e
            r3 = r0
            l4.v r3 = (p086l4.C3598v) r3
            int r3 = r3.mo14726a()
            char r3 = r4.charAt(r3)
            boolean r3 = p006a5.C0161a.m472c(r3)
            if (r3 != 0) goto L_0x0024
            r4 = r1
        L_0x003c:
            if (r4 == 0) goto L_0x003f
        L_0x003e:
            r1 = r2
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p006a5.C0178n.m510j(java.lang.CharSequence):boolean");
    }

    /* renamed from: k */
    public static final boolean m511k(String str, int i, String str2, int i2, int i3, boolean z) {
        C3357i.m24508e(str, "<this>");
        C3357i.m24508e(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    /* renamed from: l */
    public static final boolean m512l(String str, String str2, boolean z) {
        C3357i.m24508e(str, "<this>");
        C3357i.m24508e(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return m511k(str, 0, str2, 0, str2.length(), z);
    }

    /* renamed from: m */
    public static /* synthetic */ boolean m513m(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m512l(str, str2, z);
    }
}
