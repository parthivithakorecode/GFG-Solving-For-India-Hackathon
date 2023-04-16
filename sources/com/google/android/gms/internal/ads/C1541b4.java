package com.google.android.gms.internal.ads;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.ads.b4 */
final class C1541b4 {

    /* renamed from: a */
    private final ky2 f4673a = new ky2(0);

    /* renamed from: b */
    private final dr2 f4674b = new dr2();

    /* renamed from: c */
    private boolean f4675c;

    /* renamed from: d */
    private boolean f4676d;

    /* renamed from: e */
    private boolean f4677e;

    /* renamed from: f */
    private long f4678f = -9223372036854775807L;

    /* renamed from: g */
    private long f4679g = -9223372036854775807L;

    /* renamed from: h */
    private long f4680h = -9223372036854775807L;

    C1541b4(int i) {
    }

    /* renamed from: e */
    private final int m6599e(pc4 pc4) {
        dr2 dr2 = this.f4674b;
        byte[] bArr = n13.f11241f;
        int length = bArr.length;
        dr2.mo6578d(bArr, 0);
        this.f4675c = true;
        pc4.mo6914i();
        return 0;
    }

    /* renamed from: a */
    public final int mo5664a(pc4 pc4, md4 md4, int i) {
        if (i <= 0) {
            m6599e(pc4);
            return 0;
        }
        long j = -9223372036854775807L;
        if (!this.f4677e) {
            long c = pc4.mo6909c();
            int min = (int) Math.min(112800, c);
            long j2 = c - ((long) min);
            if (pc4.mo6908b() != j2) {
                md4.f10817a = j2;
                return 1;
            }
            this.f4674b.mo6577c(min);
            pc4.mo6914i();
            ((jc4) pc4).mo6917n(this.f4674b.mo6582h(), 0, min, false);
            dr2 dr2 = this.f4674b;
            int k = dr2.mo6585k();
            int l = dr2.mo6586l();
            int i2 = l - 188;
            while (true) {
                if (i2 < k) {
                    break;
                }
                byte[] h = dr2.mo6582h();
                int i3 = -4;
                int i4 = 0;
                while (true) {
                    if (i3 > 4) {
                        break;
                    }
                    int i5 = (i3 * 188) + i2;
                    if (i5 < k || i5 >= l || h[i5] != 71) {
                        i4 = 0;
                    } else {
                        i4++;
                        if (i4 == 5) {
                            long b = C1949m4.m13047b(dr2, i2, i);
                            if (b != -9223372036854775807L) {
                                j = b;
                                break;
                            }
                        }
                    }
                    i3++;
                }
                i2--;
            }
            this.f4679g = j;
            this.f4677e = true;
            return 0;
        } else if (this.f4679g == -9223372036854775807L) {
            m6599e(pc4);
            return 0;
        } else if (!this.f4676d) {
            int min2 = (int) Math.min(112800, pc4.mo6909c());
            if (pc4.mo6908b() != 0) {
                md4.f10817a = 0;
                return 1;
            }
            this.f4674b.mo6577c(min2);
            pc4.mo6914i();
            ((jc4) pc4).mo6917n(this.f4674b.mo6582h(), 0, min2, false);
            dr2 dr22 = this.f4674b;
            int k2 = dr22.mo6585k();
            int l2 = dr22.mo6586l();
            while (true) {
                if (k2 >= l2) {
                    break;
                }
                if (dr22.mo6582h()[k2] == 71) {
                    long b2 = C1949m4.m13047b(dr22, k2, i);
                    if (b2 != -9223372036854775807L) {
                        j = b2;
                        break;
                    }
                }
                k2++;
            }
            this.f4678f = j;
            this.f4676d = true;
            return 0;
        } else {
            long j3 = this.f4678f;
            if (j3 == -9223372036854775807L) {
                m6599e(pc4);
                return 0;
            }
            long b3 = this.f4673a.mo8817b(this.f4679g) - this.f4673a.mo8817b(j3);
            this.f4680h = b3;
            if (b3 < 0) {
                StringBuilder sb = new StringBuilder(65);
                sb.append("Invalid duration: ");
                sb.append(b3);
                sb.append(". Using TIME_UNSET instead.");
                Log.w("TsDurationReader", sb.toString());
                this.f4680h = -9223372036854775807L;
            }
            m6599e(pc4);
            return 0;
        }
    }

    /* renamed from: b */
    public final long mo5665b() {
        return this.f4680h;
    }

    /* renamed from: c */
    public final ky2 mo5666c() {
        return this.f4673a;
    }

    /* renamed from: d */
    public final boolean mo5667d() {
        return this.f4675c;
    }
}
