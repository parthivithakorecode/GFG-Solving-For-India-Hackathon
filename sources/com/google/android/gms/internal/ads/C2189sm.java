package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.sm */
public final class C2189sm {

    /* renamed from: a */
    private final byte[] f14490a;

    /* renamed from: b */
    private final int f14491b;

    /* renamed from: c */
    private int f14492c;

    /* renamed from: d */
    private int f14493d = 0;

    public C2189sm(byte[] bArr, int i, int i2) {
        this.f14490a = bArr;
        this.f14492c = i;
        this.f14491b = i2;
        m16892g();
    }

    /* renamed from: f */
    private final int m16891f() {
        int i = 0;
        int i2 = 0;
        while (!mo10815e()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = mo10811a(i2);
        }
        return i3 + i;
    }

    /* renamed from: g */
    private final void m16892g() {
        int i;
        int i2;
        int i3 = this.f14492c;
        boolean z = true;
        if (i3 < 0 || (i = this.f14493d) < 0 || i >= 8 || (i3 >= (i2 = this.f14491b) && !(i3 == i2 && i == 0))) {
            z = false;
        }
        C1856jm.m11730e(z);
    }

    /* renamed from: h */
    private final boolean m16893h(int i) {
        if (i < 2 || i >= this.f14491b) {
            return false;
        }
        byte[] bArr = this.f14490a;
        return bArr[i] == 3 && bArr[i + -2] == 0 && bArr[i + -1] == 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0080, code lost:
        if (r0 == 8) goto L_0x0074;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo10811a(int r9) {
        /*
            r8 = this;
            int r0 = r9 >> 3
            r1 = 0
            r2 = r1
        L_0x0004:
            r3 = 255(0xff, float:3.57E-43)
            if (r1 >= r0) goto L_0x0040
            int r4 = r8.f14492c
            int r4 = r4 + 1
            boolean r4 = r8.m16893h(r4)
            if (r4 == 0) goto L_0x0017
            int r4 = r8.f14492c
            int r4 = r4 + 2
            goto L_0x001b
        L_0x0017:
            int r4 = r8.f14492c
            int r4 = r4 + 1
        L_0x001b:
            int r5 = r8.f14493d
            if (r5 == 0) goto L_0x0030
            byte[] r6 = r8.f14490a
            int r7 = r8.f14492c
            byte r7 = r6[r7]
            r7 = r7 & r3
            int r7 = r7 << r5
            byte r6 = r6[r4]
            r6 = r6 & r3
            int r5 = 8 - r5
            int r5 = r6 >>> r5
            r5 = r5 | r7
            goto L_0x0036
        L_0x0030:
            byte[] r5 = r8.f14490a
            int r6 = r8.f14492c
            byte r5 = r5[r6]
        L_0x0036:
            int r9 = r9 + -8
            r3 = r3 & r5
            int r3 = r3 << r9
            r2 = r2 | r3
            r8.f14492c = r4
            int r1 = r1 + 1
            goto L_0x0004
        L_0x0040:
            if (r9 <= 0) goto L_0x0086
            int r0 = r8.f14493d
            int r0 = r0 + r9
            r1 = 8
            int r9 = 8 - r9
            int r9 = r3 >> r9
            byte r9 = (byte) r9
            int r4 = r8.f14492c
            int r4 = r4 + 1
            boolean r4 = r8.m16893h(r4)
            if (r4 == 0) goto L_0x005b
            int r4 = r8.f14492c
            int r4 = r4 + 2
            goto L_0x005f
        L_0x005b:
            int r4 = r8.f14492c
            int r4 = r4 + 1
        L_0x005f:
            byte[] r5 = r8.f14490a
            int r6 = r8.f14492c
            if (r0 <= r1) goto L_0x0078
            byte r6 = r5[r6]
            r6 = r6 & r3
            int r7 = r0 + -8
            int r6 = r6 << r7
            byte r5 = r5[r4]
            r3 = r3 & r5
            int r5 = 16 - r0
            int r3 = r3 >> r5
            r3 = r3 | r6
            r9 = r9 & r3
            r9 = r9 | r2
        L_0x0074:
            r8.f14492c = r4
        L_0x0076:
            r2 = r9
            goto L_0x0083
        L_0x0078:
            byte r5 = r5[r6]
            r3 = r3 & r5
            int r5 = 8 - r0
            int r3 = r3 >> r5
            r9 = r9 & r3
            r9 = r9 | r2
            if (r0 != r1) goto L_0x0076
            goto L_0x0074
        L_0x0083:
            int r0 = r0 % r1
            r8.f14493d = r0
        L_0x0086:
            r8.m16892g()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2189sm.mo10811a(int):int");
    }

    /* renamed from: b */
    public final int mo10812b() {
        int f = m16891f();
        return (f % 2 == 0 ? -1 : 1) * ((f + 1) / 2);
    }

    /* renamed from: c */
    public final int mo10813c() {
        return m16891f();
    }

    /* renamed from: d */
    public final void mo10814d(int i) {
        int i2 = this.f14492c;
        int i3 = (i >> 3) + i2;
        this.f14492c = i3;
        int i4 = this.f14493d + (i & 7);
        this.f14493d = i4;
        if (i4 > 7) {
            this.f14492c = i3 + 1;
            this.f14493d = i4 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f14492c) {
                m16892g();
                return;
            } else if (m16893h(i2)) {
                this.f14492c++;
                i2 += 2;
            }
        }
    }

    /* renamed from: e */
    public final boolean mo10815e() {
        return mo10811a(1) == 1;
    }
}
