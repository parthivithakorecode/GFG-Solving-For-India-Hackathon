package com.google.android.gms.internal.ads;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.ads.o3 */
public final class C2022o3 implements C1912l4 {

    /* renamed from: a */
    private final C2317w2 f11855a;

    /* renamed from: b */
    private final cq2 f11856b = new cq2(new byte[10], 10);

    /* renamed from: c */
    private int f11857c = 0;

    /* renamed from: d */
    private int f11858d;

    /* renamed from: e */
    private ky2 f11859e;

    /* renamed from: f */
    private boolean f11860f;

    /* renamed from: g */
    private boolean f11861g;

    /* renamed from: h */
    private boolean f11862h;

    /* renamed from: i */
    private int f11863i;

    /* renamed from: j */
    private int f11864j;

    /* renamed from: k */
    private boolean f11865k;

    public C2022o3(C2317w2 w2Var) {
        this.f11855a = w2Var;
    }

    /* renamed from: d */
    private final void m14260d(int i) {
        this.f11857c = i;
        this.f11858d = 0;
    }

    /* renamed from: e */
    private final boolean m14261e(dr2 dr2, byte[] bArr, int i) {
        int min = Math.min(dr2.mo6583i(), i - this.f11858d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            dr2.mo6581g(min);
        } else {
            dr2.mo6576b(bArr, this.f11858d, min);
        }
        int i2 = this.f11858d + min;
        this.f11858d = i2;
        return i2 == i;
    }

    /* renamed from: a */
    public final void mo8865a(dr2 dr2, int i) {
        int i2;
        long j;
        dr2 dr22 = dr2;
        wu1.m19203b(this.f11859e);
        int i3 = -1;
        int i4 = 2;
        if ((i & 1) != 0) {
            int i5 = this.f11857c;
            if (!(i5 == 0 || i5 == 1)) {
                if (i5 != 2) {
                    int i6 = this.f11864j;
                    if (i6 != -1) {
                        StringBuilder sb = new StringBuilder(59);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i6);
                        sb.append(" more bytes");
                        Log.w("PesReader", sb.toString());
                    }
                    this.f11855a.mo5640c();
                } else {
                    Log.w("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            m14260d(1);
        }
        int i7 = i;
        while (dr2.mo6583i() > 0) {
            int i8 = this.f11857c;
            if (i8 != 0) {
                int i9 = 0;
                if (i8 != 1) {
                    if (i8 != i4) {
                        int i10 = dr2.mo6583i();
                        int i11 = this.f11864j;
                        if (i11 != i3) {
                            i9 = i10 - i11;
                        }
                        if (i9 > 0) {
                            i10 -= i9;
                            dr22.mo6579e(dr2.mo6585k() + i10);
                        }
                        this.f11855a.mo5638a(dr22);
                        int i12 = this.f11864j;
                        if (i12 != i3) {
                            int i13 = i12 - i10;
                            this.f11864j = i13;
                            if (i13 == 0) {
                                this.f11855a.mo5640c();
                                m14260d(1);
                            }
                        }
                    } else {
                        if (m14261e(dr22, this.f11856b.f5494a, Math.min(10, this.f11863i)) && m14261e(dr22, (byte[]) null, this.f11863i)) {
                            this.f11856b.mo6267h(0);
                            if (this.f11860f) {
                                this.f11856b.mo6269j(4);
                                int c = this.f11856b.mo6262c(3);
                                this.f11856b.mo6269j(1);
                                int c2 = this.f11856b.mo6262c(15);
                                this.f11856b.mo6269j(1);
                                long c3 = ((long) (c2 << 15)) | (((long) c) << 30) | ((long) this.f11856b.mo6262c(15));
                                this.f11856b.mo6269j(1);
                                if (!this.f11862h && this.f11861g) {
                                    this.f11856b.mo6269j(4);
                                    int c4 = this.f11856b.mo6262c(3);
                                    this.f11856b.mo6269j(1);
                                    int c5 = this.f11856b.mo6262c(15);
                                    this.f11856b.mo6269j(1);
                                    int c6 = this.f11856b.mo6262c(15);
                                    this.f11856b.mo6269j(1);
                                    this.f11859e.mo8817b((((long) c4) << 30) | ((long) (c5 << 15)) | ((long) c6));
                                    this.f11862h = true;
                                }
                                j = this.f11859e.mo8817b(c3);
                            } else {
                                j = -9223372036854775807L;
                            }
                            i7 |= true != this.f11865k ? 0 : 4;
                            this.f11855a.mo5642e(j, i7);
                            m14260d(3);
                            i3 = -1;
                            i4 = 2;
                        }
                    }
                    i2 = i4;
                } else if (m14261e(dr22, this.f11856b.f5494a, 9)) {
                    int i14 = 0;
                    this.f11856b.mo6267h(0);
                    int c7 = this.f11856b.mo6262c(24);
                    if (c7 != 1) {
                        StringBuilder sb2 = new StringBuilder(41);
                        sb2.append("Unexpected start code prefix: ");
                        sb2.append(c7);
                        Log.w("PesReader", sb2.toString());
                        i3 = -1;
                        this.f11864j = -1;
                        i2 = 2;
                    } else {
                        this.f11856b.mo6269j(8);
                        int c8 = this.f11856b.mo6262c(16);
                        this.f11856b.mo6269j(5);
                        this.f11865k = this.f11856b.mo6271l();
                        i2 = 2;
                        this.f11856b.mo6269j(2);
                        this.f11860f = this.f11856b.mo6271l();
                        this.f11861g = this.f11856b.mo6271l();
                        this.f11856b.mo6269j(6);
                        int c9 = this.f11856b.mo6262c(8);
                        this.f11863i = c9;
                        if (c8 == 0) {
                            this.f11864j = -1;
                            i3 = -1;
                        } else {
                            int i15 = (c8 - 3) - c9;
                            this.f11864j = i15;
                            if (i15 < 0) {
                                StringBuilder sb3 = new StringBuilder(47);
                                sb3.append("Found negative packet payload size: ");
                                sb3.append(i15);
                                Log.w("PesReader", sb3.toString());
                                i3 = -1;
                                this.f11864j = -1;
                            } else {
                                i3 = -1;
                            }
                        }
                        i14 = 2;
                    }
                    m14260d(i14);
                } else {
                    i3 = -1;
                    i2 = 2;
                }
            } else {
                i2 = i4;
                dr22.mo6581g(dr2.mo6583i());
            }
            i4 = i2;
        }
    }

    /* renamed from: b */
    public final void mo8866b(ky2 ky2, rc4 rc4, C1875k4 k4Var) {
        this.f11859e = ky2;
        this.f11855a.mo5641d(rc4, k4Var);
    }

    /* renamed from: c */
    public final void mo8867c() {
        this.f11857c = 0;
        this.f11858d = 0;
        this.f11862h = false;
        this.f11855a.mo5639b();
    }
}
