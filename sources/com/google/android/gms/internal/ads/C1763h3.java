package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.h3 */
final class C1763h3 {

    /* renamed from: a */
    private final td4 f8014a;

    /* renamed from: b */
    private long f8015b;

    /* renamed from: c */
    private boolean f8016c;

    /* renamed from: d */
    private int f8017d;

    /* renamed from: e */
    private long f8018e;

    /* renamed from: f */
    private boolean f8019f;

    /* renamed from: g */
    private boolean f8020g;

    /* renamed from: h */
    private boolean f8021h;

    /* renamed from: i */
    private boolean f8022i;

    /* renamed from: j */
    private boolean f8023j;

    /* renamed from: k */
    private long f8024k;

    /* renamed from: l */
    private long f8025l;

    /* renamed from: m */
    private boolean f8026m;

    public C1763h3(td4 td4) {
        this.f8014a = td4;
    }

    /* renamed from: e */
    private final void m10265e(int i) {
        long j = this.f8025l;
        if (j != -9223372036854775807L) {
            boolean z = this.f8026m;
            long j2 = this.f8015b;
            long j3 = this.f8024k;
            this.f8014a.mo7872a(j, z ? 1 : 0, (int) (j2 - j3), i, (sd4) null);
        }
    }

    /* renamed from: a */
    public final void mo7834a(long j, int i, boolean z) {
        if (this.f8023j && this.f8020g) {
            this.f8026m = this.f8016c;
            this.f8023j = false;
        } else if (this.f8021h || this.f8020g) {
            if (z && this.f8022i) {
                m10265e(i + ((int) (j - this.f8015b)));
            }
            this.f8024k = this.f8015b;
            this.f8025l = this.f8018e;
            this.f8026m = this.f8016c;
            this.f8022i = true;
        }
    }

    /* renamed from: b */
    public final void mo7835b(byte[] bArr, int i, int i2) {
        if (this.f8019f) {
            int i3 = this.f8017d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                this.f8020g = (bArr[i4] & 128) != 0;
                this.f8019f = false;
                return;
            }
            this.f8017d = i3 + (i2 - i);
        }
    }

    /* renamed from: c */
    public final void mo7836c() {
        this.f8019f = false;
        this.f8020g = false;
        this.f8021h = false;
        this.f8022i = false;
        this.f8023j = false;
    }

    /* renamed from: d */
    public final void mo7837d(long j, int i, int i2, long j2, boolean z) {
        boolean z2 = false;
        this.f8020g = false;
        this.f8021h = false;
        this.f8018e = j2;
        this.f8017d = 0;
        this.f8015b = j;
        if (i2 >= 32 && i2 != 40) {
            if (this.f8022i && !this.f8023j) {
                if (z) {
                    m10265e(i);
                }
                this.f8022i = false;
            }
            if (i2 <= 35 || i2 == 39) {
                this.f8021h = !this.f8023j;
                this.f8023j = true;
            }
        }
        boolean z3 = i2 >= 16 && i2 <= 21;
        this.f8016c = z3;
        if (z3 || i2 <= 9) {
            z2 = true;
        }
        this.f8019f = z2;
    }
}
