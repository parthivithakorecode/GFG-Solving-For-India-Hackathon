package com.google.android.gms.internal.ads;

import java.util.Objects;

public final class x44 implements k64 {

    /* renamed from: a */
    private final vc4 f17030a;

    /* renamed from: b */
    private oc4 f17031b;

    /* renamed from: c */
    private pc4 f17032c;

    public x44(vc4 vc4) {
        this.f17030a = vc4;
    }

    /* renamed from: a */
    public final long mo8622a() {
        pc4 pc4 = this.f17032c;
        if (pc4 != null) {
            return pc4.mo6908b();
        }
        return -1;
    }

    /* renamed from: b */
    public final void mo8623b() {
        if (this.f17031b != null) {
            this.f17031b = null;
        }
        this.f17032c = null;
    }

    /* renamed from: c */
    public final void mo8624c() {
        oc4 oc4 = this.f17031b;
        if (oc4 instanceof C1834j0) {
            ((C1834j0) oc4).mo8320a();
        }
    }

    /* renamed from: d */
    public final void mo8625d(long j, long j2) {
        oc4 oc4 = this.f17031b;
        Objects.requireNonNull(oc4);
        oc4.mo5045h(j, j2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        if (r0.mo6908b() != r11) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0060, code lost:
        if (r0.mo6908b() != r11) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0063, code lost:
        r1 = false;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8626e(com.google.android.gms.internal.ads.fc1 r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, com.google.android.gms.internal.ads.rc4 r15) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.jc4 r6 = new com.google.android.gms.internal.ads.jc4
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f17032c = r6
            com.google.android.gms.internal.ads.oc4 r8 = r7.f17031b
            if (r8 == 0) goto L_0x0010
            return
        L_0x0010:
            com.google.android.gms.internal.ads.vc4 r8 = r7.f17030a
            com.google.android.gms.internal.ads.oc4[] r8 = r8.mo6040a(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L_0x0020
            r8 = r8[r13]
            r7.f17031b = r8
            goto L_0x0073
        L_0x0020:
            r0 = r13
        L_0x0021:
            if (r0 >= r10) goto L_0x006f
            r1 = r8[r0]
            boolean r2 = r1.mo5040c(r6)     // Catch:{ EOFException -> 0x0056, all -> 0x0041 }
            if (r2 == 0) goto L_0x0034
            r7.f17031b = r1     // Catch:{ EOFException -> 0x0056, all -> 0x0041 }
            com.google.android.gms.internal.ads.wu1.m19207f(r14)
            r6.mo6914i()
            goto L_0x006f
        L_0x0034:
            com.google.android.gms.internal.ads.oc4 r1 = r7.f17031b
            if (r1 != 0) goto L_0x0065
            long r1 = r6.mo6908b()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L_0x0063
            goto L_0x0065
        L_0x0041:
            r8 = move-exception
            com.google.android.gms.internal.ads.oc4 r9 = r7.f17031b
            if (r9 != 0) goto L_0x004e
            long r9 = r6.mo6908b()
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x004f
        L_0x004e:
            r13 = r14
        L_0x004f:
            com.google.android.gms.internal.ads.wu1.m19207f(r13)
            r6.mo6914i()
            throw r8
        L_0x0056:
            com.google.android.gms.internal.ads.oc4 r1 = r7.f17031b
            if (r1 != 0) goto L_0x0065
            long r1 = r6.mo6908b()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r1 = r13
            goto L_0x0066
        L_0x0065:
            r1 = r14
        L_0x0066:
            com.google.android.gms.internal.ads.wu1.m19207f(r1)
            r6.mo6914i()
            int r0 = r0 + 1
            goto L_0x0021
        L_0x006f:
            com.google.android.gms.internal.ads.oc4 r10 = r7.f17031b
            if (r10 == 0) goto L_0x0079
        L_0x0073:
            com.google.android.gms.internal.ads.oc4 r8 = r7.f17031b
            r8.mo5044g(r15)
            return
        L_0x0079:
            com.google.android.gms.internal.ads.o74 r10 = new com.google.android.gms.internal.ads.o74
            java.lang.String r8 = com.google.android.gms.internal.ads.n13.m13632f(r8)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            int r12 = r8.length()
            int r12 = r12 + 58
            r11.<init>(r12)
            java.lang.String r12 = "None of the available extractors ("
            r11.append(r12)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r10.<init>(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.x44.mo8626e(com.google.android.gms.internal.ads.fc1, android.net.Uri, java.util.Map, long, long, com.google.android.gms.internal.ads.rc4):void");
    }

    /* renamed from: f */
    public final int mo8627f(md4 md4) {
        oc4 oc4 = this.f17031b;
        Objects.requireNonNull(oc4);
        pc4 pc4 = this.f17032c;
        Objects.requireNonNull(pc4);
        return oc4.mo5042e(pc4, md4);
    }
}
