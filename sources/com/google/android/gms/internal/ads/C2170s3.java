package com.google.android.gms.internal.ads;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.ads.s3 */
final class C2170s3 {

    /* renamed from: a */
    private final ky2 f14232a = new ky2(0);

    /* renamed from: b */
    private final dr2 f14233b = new dr2();

    /* renamed from: c */
    private boolean f14234c;

    /* renamed from: d */
    private boolean f14235d;

    /* renamed from: e */
    private boolean f14236e;

    /* renamed from: f */
    private long f14237f = -9223372036854775807L;

    /* renamed from: g */
    private long f14238g = -9223372036854775807L;

    /* renamed from: h */
    private long f14239h = -9223372036854775807L;

    C2170s3() {
    }

    /* renamed from: c */
    public static long m16599c(dr2 dr2) {
        dr2 dr22 = dr2;
        int k = dr2.mo6585k();
        if (dr2.mo6583i() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        dr22.mo6576b(bArr, 0, 9);
        dr22.mo6580f(k);
        if ((bArr[0] & 196) != 68 || (bArr[2] & 4) != 4 || (bArr[4] & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j = (long) bArr[0];
        byte b = bArr[1];
        long j2 = (long) bArr[2];
        return ((((long) bArr[3]) & 255) << 5) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) b) & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((j2 & 3) << 13) | ((((long) bArr[4]) & 248) >> 3);
    }

    /* renamed from: f */
    private final int m16600f(pc4 pc4) {
        dr2 dr2 = this.f14233b;
        byte[] bArr = n13.f11241f;
        int length = bArr.length;
        dr2.mo6578d(bArr, 0);
        this.f14234c = true;
        pc4.mo6914i();
        return 0;
    }

    /* renamed from: g */
    private static final int m16601g(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: a */
    public final int mo10712a(pc4 pc4, md4 md4) {
        long j = -9223372036854775807L;
        if (!this.f14236e) {
            long c = pc4.mo6909c();
            int min = (int) Math.min(20000, c);
            long j2 = c - ((long) min);
            if (pc4.mo6908b() != j2) {
                md4.f10817a = j2;
                return 1;
            }
            this.f14233b.mo6577c(min);
            pc4.mo6914i();
            ((jc4) pc4).mo6917n(this.f14233b.mo6582h(), 0, min, false);
            dr2 dr2 = this.f14233b;
            int k = dr2.mo6585k();
            int l = dr2.mo6586l() - 4;
            while (true) {
                if (l < k) {
                    break;
                }
                if (m16601g(dr2.mo6582h(), l) == 442) {
                    dr2.mo6580f(l + 4);
                    long c2 = m16599c(dr2);
                    if (c2 != -9223372036854775807L) {
                        j = c2;
                        break;
                    }
                }
                l--;
            }
            this.f14238g = j;
            this.f14236e = true;
            return 0;
        } else if (this.f14238g == -9223372036854775807L) {
            m16600f(pc4);
            return 0;
        } else if (!this.f14235d) {
            int min2 = (int) Math.min(20000, pc4.mo6909c());
            if (pc4.mo6908b() != 0) {
                md4.f10817a = 0;
                return 1;
            }
            this.f14233b.mo6577c(min2);
            pc4.mo6914i();
            ((jc4) pc4).mo6917n(this.f14233b.mo6582h(), 0, min2, false);
            dr2 dr22 = this.f14233b;
            int k2 = dr22.mo6585k();
            int l2 = dr22.mo6586l();
            while (true) {
                if (k2 >= l2 - 3) {
                    break;
                }
                if (m16601g(dr22.mo6582h(), k2) == 442) {
                    dr22.mo6580f(k2 + 4);
                    long c3 = m16599c(dr22);
                    if (c3 != -9223372036854775807L) {
                        j = c3;
                        break;
                    }
                }
                k2++;
            }
            this.f14237f = j;
            this.f14235d = true;
            return 0;
        } else {
            long j3 = this.f14237f;
            if (j3 == -9223372036854775807L) {
                m16600f(pc4);
                return 0;
            }
            long b = this.f14232a.mo8817b(this.f14238g) - this.f14232a.mo8817b(j3);
            this.f14239h = b;
            if (b < 0) {
                StringBuilder sb = new StringBuilder(65);
                sb.append("Invalid duration: ");
                sb.append(b);
                sb.append(". Using TIME_UNSET instead.");
                Log.w("PsDurationReader", sb.toString());
                this.f14239h = -9223372036854775807L;
            }
            m16600f(pc4);
            return 0;
        }
    }

    /* renamed from: b */
    public final long mo10713b() {
        return this.f14239h;
    }

    /* renamed from: d */
    public final ky2 mo10714d() {
        return this.f14232a;
    }

    /* renamed from: e */
    public final boolean mo10715e() {
        return this.f14234c;
    }
}
