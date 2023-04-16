package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.a3 */
final class C1503a3 {

    /* renamed from: a */
    private final td4 f3903a;

    /* renamed from: b */
    private boolean f3904b;

    /* renamed from: c */
    private boolean f3905c;

    /* renamed from: d */
    private boolean f3906d;

    /* renamed from: e */
    private int f3907e;

    /* renamed from: f */
    private int f3908f;

    /* renamed from: g */
    private long f3909g;

    /* renamed from: h */
    private long f3910h;

    public C1503a3(td4 td4) {
        this.f3903a = td4;
    }

    /* renamed from: a */
    public final void mo5076a(byte[] bArr, int i, int i2) {
        if (this.f3905c) {
            int i3 = this.f3908f;
            int i4 = (i + 1) - i3;
            if (i4 < i2) {
                this.f3906d = ((bArr[i4] & 192) >> 6) == 0;
                this.f3905c = false;
                return;
            }
            this.f3908f = i3 + (i2 - i);
        }
    }

    /* renamed from: b */
    public final void mo5077b(long j, int i, boolean z) {
        if (this.f3907e == 182 && z && this.f3904b) {
            long j2 = this.f3910h;
            if (j2 != -9223372036854775807L) {
                long j3 = this.f3909g;
                int i2 = (int) (j - j3);
                this.f3903a.mo7872a(j2, this.f3906d ? 1 : 0, i2, i, (sd4) null);
            }
        }
        if (this.f3907e != 179) {
            this.f3909g = j;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0018  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5078c(int r5, long r6) {
        /*
            r4 = this;
            r4.f3907e = r5
            r0 = 0
            r4.f3906d = r0
            r1 = 179(0xb3, float:2.51E-43)
            r2 = 182(0xb6, float:2.55E-43)
            r3 = 1
            if (r5 == r2) goto L_0x0012
            if (r5 != r1) goto L_0x0010
            r5 = r1
            goto L_0x0012
        L_0x0010:
            r1 = r0
            goto L_0x0013
        L_0x0012:
            r1 = r3
        L_0x0013:
            r4.f3904b = r1
            if (r5 != r2) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r3 = r0
        L_0x0019:
            r4.f3905c = r3
            r4.f3908f = r0
            r4.f3910h = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1503a3.mo5078c(int, long):void");
    }

    /* renamed from: d */
    public final void mo5079d() {
        this.f3904b = false;
        this.f3905c = false;
        this.f3906d = false;
        this.f3907e = -1;
    }
}
