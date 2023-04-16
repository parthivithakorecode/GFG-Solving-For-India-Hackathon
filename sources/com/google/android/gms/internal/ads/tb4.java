package com.google.android.gms.internal.ads;

import p038f.C2591j;

public final class tb4 {

    /* renamed from: a */
    private static final int[] f14811a = {1, 2, 3, 6};

    /* renamed from: b */
    private static final int[] f14812b = {48000, 44100, 32000};

    /* renamed from: c */
    private static final int[] f14813c = {24000, 22050, 16000};

    /* renamed from: d */
    private static final int[] f14814d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    private static final int[] f14815e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f */
    private static final int[] f14816f = {69, 87, 104, C2591j.f18733H0, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: g */
    public static final /* synthetic */ int f14817g = 0;

    /* renamed from: a */
    public static int m17203a(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            int i = ((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1;
            return i + i;
        }
        byte b = bArr[4];
        return m17207e((b & 192) >> 6, b & 63);
    }

    /* renamed from: b */
    public static C1574c0 m17204b(dr2 dr2, String str, String str2, u74 u74) {
        int i = f14812b[(dr2.mo6593s() & 192) >> 6];
        int s = dr2.mo6593s();
        int i2 = f14814d[(s & 56) >> 3];
        if ((s & 4) != 0) {
            i2++;
        }
        bf4 bf4 = new bf4();
        bf4.mo5830h(str);
        bf4.mo5842s("audio/ac3");
        bf4.mo5825e0(i2);
        bf4.mo5843t(i);
        bf4.mo5819b(u74);
        bf4.mo5834k(str2);
        return bf4.mo5848y();
    }

    /* renamed from: c */
    public static C1574c0 m17205c(dr2 dr2, String str, String str2, u74 u74) {
        dr2.mo6581g(2);
        int i = f14812b[(dr2.mo6593s() & 192) >> 6];
        int s = dr2.mo6593s();
        int i2 = f14814d[(s & 14) >> 1];
        if ((s & 1) != 0) {
            i2++;
        }
        if (((dr2.mo6593s() & 30) >> 1) > 0 && (2 & dr2.mo6593s()) != 0) {
            i2 += 2;
        }
        String str3 = (dr2.mo6583i() <= 0 || (dr2.mo6593s() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc";
        bf4 bf4 = new bf4();
        bf4.mo5830h(str);
        bf4.mo5842s(str3);
        bf4.mo5825e0(i2);
        bf4.mo5843t(i);
        bf4.mo5819b(u74);
        bf4.mo5834k(str2);
        return bf4.mo5848y();
    }

    /* renamed from: d */
    public static sb4 m17206d(cq2 cq2) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        cq2 cq22 = cq2;
        int b = cq2.mo6261b();
        cq22.mo6269j(40);
        int c = cq22.mo6262c(5);
        cq22.mo6267h(b);
        int i11 = -1;
        if (c > 10) {
            cq22.mo6269j(16);
            int c2 = cq22.mo6262c(2);
            if (c2 == 0) {
                i11 = 0;
            } else if (c2 == 1) {
                i11 = 1;
            } else if (c2 == 2) {
                i11 = 2;
            }
            cq22.mo6269j(3);
            int c3 = cq22.mo6262c(11) + 1;
            i4 = c3 + c3;
            int c4 = cq22.mo6262c(2);
            if (c4 == 3) {
                i5 = 6;
                i2 = f14813c[cq22.mo6262c(2)];
                i6 = 3;
            } else {
                i6 = cq22.mo6262c(2);
                i5 = f14811a[i6];
                i2 = f14812b[c4];
            }
            i3 = i5 * 256;
            int c5 = cq22.mo6262c(3);
            boolean l = cq2.mo6271l();
            i = f14814d[c5] + (l ? 1 : 0);
            cq22.mo6269j(10);
            if (cq2.mo6271l()) {
                cq22.mo6269j(8);
            }
            if (c5 == 0) {
                cq22.mo6269j(5);
                if (cq2.mo6271l()) {
                    cq22.mo6269j(8);
                }
                i7 = 0;
                c5 = 0;
            } else {
                i7 = c5;
            }
            if (i11 == 1) {
                if (cq2.mo6271l()) {
                    cq22.mo6269j(16);
                }
                i8 = 1;
            } else {
                i8 = i11;
            }
            if (cq2.mo6271l()) {
                if (i7 > 2) {
                    cq22.mo6269j(2);
                }
                if ((i7 & 1) != 0 && i7 > 2) {
                    cq22.mo6269j(6);
                }
                if ((i7 & 4) != 0) {
                    cq22.mo6269j(6);
                }
                if (l && cq2.mo6271l()) {
                    cq22.mo6269j(5);
                }
                if (i8 == 0) {
                    if (cq2.mo6271l()) {
                        cq22.mo6269j(6);
                    }
                    if (i7 == 0 && cq2.mo6271l()) {
                        cq22.mo6269j(6);
                    }
                    if (cq2.mo6271l()) {
                        cq22.mo6269j(6);
                    }
                    int c6 = cq22.mo6262c(2);
                    if (c6 == 1) {
                        cq22.mo6269j(5);
                    } else if (c6 == 2) {
                        cq22.mo6269j(12);
                    } else if (c6 == 3) {
                        int c7 = cq22.mo6262c(5);
                        if (cq2.mo6271l()) {
                            cq22.mo6269j(5);
                            if (cq2.mo6271l()) {
                                cq22.mo6269j(4);
                            }
                            if (cq2.mo6271l()) {
                                cq22.mo6269j(4);
                            }
                            if (cq2.mo6271l()) {
                                cq22.mo6269j(4);
                            }
                            if (cq2.mo6271l()) {
                                cq22.mo6269j(4);
                            }
                            if (cq2.mo6271l()) {
                                cq22.mo6269j(4);
                            }
                            if (cq2.mo6271l()) {
                                cq22.mo6269j(4);
                            }
                            if (cq2.mo6271l()) {
                                cq22.mo6269j(4);
                            }
                            if (cq2.mo6271l()) {
                                if (cq2.mo6271l()) {
                                    cq22.mo6269j(4);
                                }
                                if (cq2.mo6271l()) {
                                    cq22.mo6269j(4);
                                }
                            }
                        }
                        if (cq2.mo6271l()) {
                            cq22.mo6269j(5);
                            if (cq2.mo6271l()) {
                                cq22.mo6269j(7);
                                if (cq2.mo6271l()) {
                                    i10 = 8;
                                    cq22.mo6269j(8);
                                    cq22.mo6269j((c7 + 2) * i10);
                                    cq2.mo6263d();
                                }
                            }
                        }
                        i10 = 8;
                        cq22.mo6269j((c7 + 2) * i10);
                        cq2.mo6263d();
                    }
                    if (i7 < 2) {
                        if (cq2.mo6271l()) {
                            cq22.mo6269j(14);
                        }
                        if (c5 == 0 && cq2.mo6271l()) {
                            cq22.mo6269j(14);
                        }
                    }
                    if (cq2.mo6271l()) {
                        if (i6 == 0) {
                            cq22.mo6269j(5);
                            i8 = 0;
                            i6 = 0;
                        } else {
                            for (int i12 = 0; i12 < i5; i12++) {
                                if (cq2.mo6271l()) {
                                    cq22.mo6269j(5);
                                }
                            }
                        }
                    }
                    i8 = 0;
                }
            }
            if (cq2.mo6271l()) {
                cq22.mo6269j(5);
                if (i7 == 2) {
                    cq22.mo6269j(4);
                    i7 = 2;
                }
                if (i7 >= 6) {
                    cq22.mo6269j(2);
                }
                if (cq2.mo6271l()) {
                    i9 = 8;
                    cq22.mo6269j(8);
                } else {
                    i9 = 8;
                }
                if (i7 == 0 && cq2.mo6271l()) {
                    cq22.mo6269j(i9);
                }
                if (c4 < 3) {
                    cq2.mo6268i();
                }
            }
            if (i8 == 0 && i6 != 3) {
                cq2.mo6268i();
            }
            if (i8 == 2 && (i6 == 3 || cq2.mo6271l())) {
                cq22.mo6269j(6);
            }
            str = (cq2.mo6271l() && cq22.mo6262c(6) == 1 && cq22.mo6262c(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
        } else {
            cq22.mo6269j(32);
            int c8 = cq22.mo6262c(2);
            String str2 = c8 == 3 ? null : "audio/ac3";
            i4 = m17207e(c8, cq22.mo6262c(6));
            cq22.mo6269j(8);
            int c9 = cq22.mo6262c(3);
            if (!((c9 & 1) == 0 || c9 == 1)) {
                cq22.mo6269j(2);
            }
            if ((c9 & 4) != 0) {
                cq22.mo6269j(2);
            }
            if (c9 == 2) {
                cq22.mo6269j(2);
            }
            i2 = c8 < 3 ? f14812b[c8] : -1;
            i = f14814d[c9] + (cq2.mo6271l() ? 1 : 0);
            i3 = 1536;
            str = str2;
        }
        return new sb4(str, i11, i, i2, i4, i3, (rb4) null);
    }

    /* renamed from: e */
    private static int m17207e(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = f14812b[i];
        if (i4 == 44100) {
            int i5 = f14816f[i3] + (i2 & 1);
            return i5 + i5;
        }
        int i6 = f14815e[i3];
        return i4 == 32000 ? i6 * 6 : i6 * 4;
    }
}
