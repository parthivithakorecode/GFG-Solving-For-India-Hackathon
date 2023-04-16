package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.z3 */
final class C2430z3 implements ec4 {

    /* renamed from: a */
    private final ky2 f17997a;

    /* renamed from: b */
    private final dr2 f17998b = new dr2();

    /* renamed from: c */
    private final int f17999c;

    public C2430z3(int i, ky2 ky2, int i2) {
        this.f17999c = i;
        this.f17997a = ky2;
    }

    /* renamed from: a */
    public final void mo6902a() {
        dr2 dr2 = this.f17998b;
        byte[] bArr = n13.f11241f;
        int length = bArr.length;
        dr2.mo6578d(bArr, 0);
    }

    /* renamed from: b */
    public final dc4 mo6903b(pc4 pc4, long j) {
        int a;
        int i;
        long j2;
        long b = pc4.mo6908b();
        int min = (int) Math.min(112800, pc4.mo6909c() - b);
        this.f17998b.mo6577c(min);
        ((jc4) pc4).mo6917n(this.f17998b.mo6582h(), 0, min, false);
        dr2 dr2 = this.f17998b;
        int l = dr2.mo6586l();
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (dr2.mo6583i() >= 188 && (i = a + 188) <= l) {
            long b2 = C1949m4.m13047b(dr2, (a = C1949m4.m13046a(dr2.mo6582h(), dr2.mo6585k(), l)), this.f17999c);
            if (b2 != -9223372036854775807L) {
                long b3 = this.f17997a.mo8817b(b2);
                if (b3 > j) {
                    if (j5 == -9223372036854775807L) {
                        return dc4.m7820d(b3, b);
                    }
                    j2 = b + j4;
                } else if (100000 + b3 > j) {
                    j2 = b + ((long) a);
                } else {
                    j4 = (long) a;
                    j5 = b3;
                }
                return dc4.m7821e(j2);
            }
            dr2.mo6580f(i);
            j3 = (long) i;
        }
        return j5 != -9223372036854775807L ? dc4.m7822f(j5, b + j3) : dc4.f5757d;
    }
}
