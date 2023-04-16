package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.if */
public abstract class C1812if {

    /* renamed from: a */
    public static final C1812if f8637a = new C1701ff();

    /* renamed from: a */
    public abstract int mo7319a(Object obj);

    /* renamed from: b */
    public abstract int mo7320b();

    /* renamed from: c */
    public abstract int mo7321c();

    /* renamed from: d */
    public abstract C1738gf mo7322d(int i, C1738gf gfVar, boolean z);

    /* renamed from: e */
    public abstract C1775hf mo7323e(int i, C1775hf hfVar, boolean z, long j);

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        if ((mo7321c() - 1) == 0) goto L_0x0020;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo8135f(int r3, com.google.android.gms.internal.ads.C1738gf r4, com.google.android.gms.internal.ads.C1775hf r5, int r6) {
        /*
            r2 = this;
            r0 = 0
            r2.mo7322d(r3, r4, r0)
            r2.mo8136g(r0, r5, r0)
            r4 = 1
            if (r3 != 0) goto L_0x0031
            r3 = -1
            if (r6 == 0) goto L_0x0022
            if (r6 == r4) goto L_0x0020
            r1 = 2
            if (r6 != r1) goto L_0x001a
            int r6 = r2.mo7321c()
            int r6 = r6 + r3
            if (r6 != 0) goto L_0x002a
            goto L_0x0020
        L_0x001a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L_0x0020:
            r4 = r0
            goto L_0x002a
        L_0x0022:
            int r6 = r2.mo7321c()
            int r6 = r6 + r3
            if (r6 != 0) goto L_0x002a
            r4 = r3
        L_0x002a:
            if (r4 != r3) goto L_0x002d
            return r3
        L_0x002d:
            r2.mo8136g(r4, r5, r0)
            return r0
        L_0x0031:
            int r3 = r3 + r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1812if.mo8135f(int, com.google.android.gms.internal.ads.gf, com.google.android.gms.internal.ads.hf, int):int");
    }

    /* renamed from: g */
    public final C1775hf mo8136g(int i, C1775hf hfVar, boolean z) {
        return mo7323e(i, hfVar, false, 0);
    }

    /* renamed from: h */
    public final boolean mo8137h() {
        return mo7321c() == 0;
    }
}
