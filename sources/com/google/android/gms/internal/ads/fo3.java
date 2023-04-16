package com.google.android.gms.internal.ads;

final class fo3 {
    /* renamed from: a */
    static int m9248a(byte[] bArr, int i, eo3 eo3) {
        int j = m9257j(bArr, i, eo3);
        int i2 = eo3.f6303a;
        if (i2 < 0) {
            throw mq3.m13456f();
        } else if (i2 > bArr.length - j) {
            throw mq3.m13459j();
        } else if (i2 == 0) {
            eo3.f6305c = uo3.f15667g;
            return j;
        } else {
            eo3.f6305c = uo3.m17969J(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: b */
    static int m9249b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: c */
    static int m9250c(es3 es3, byte[] bArr, int i, int i2, int i3, eo3 eo3) {
        nr3 nr3 = (nr3) es3;
        Object b = nr3.mo7062b();
        int I = nr3.mo9590I(b, bArr, i, i2, i3, eo3);
        nr3.mo7064d(b);
        eo3.f6305c = b;
        return I;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m9251d(com.google.android.gms.internal.ads.es3 r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.ads.eo3 r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m9258k(r8, r7, r0, r10)
            int r8 = r10.f6303a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.mo7062b()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo7068h(r1, r2, r3, r4, r5)
            r6.mo7064d(r9)
            r10.f6305c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.ads.mq3 r6 = com.google.android.gms.internal.ads.mq3.m13459j()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fo3.m9251d(com.google.android.gms.internal.ads.es3, byte[], int, int, com.google.android.gms.internal.ads.eo3):int");
    }

    /* renamed from: e */
    static int m9252e(es3<?> es3, int i, byte[] bArr, int i2, int i3, jq3<?> jq3, eo3 eo3) {
        int d = m9251d(es3, bArr, i2, i3, eo3);
        while (true) {
            jq3.add(eo3.f6305c);
            if (d >= i3) {
                break;
            }
            int j = m9257j(bArr, d, eo3);
            if (i != eo3.f6303a) {
                break;
            }
            d = m9251d(es3, bArr, j, i3, eo3);
        }
        return d;
    }

    /* renamed from: f */
    static int m9253f(byte[] bArr, int i, jq3<?> jq3, eo3 eo3) {
        bq3 bq3 = (bq3) jq3;
        int j = m9257j(bArr, i, eo3);
        int i2 = eo3.f6303a + j;
        while (j < i2) {
            j = m9257j(bArr, j, eo3);
            bq3.mo5918N(eo3.f6303a);
        }
        if (j == i2) {
            return j;
        }
        throw mq3.m13459j();
    }

    /* renamed from: g */
    static int m9254g(byte[] bArr, int i, eo3 eo3) {
        int j = m9257j(bArr, i, eo3);
        int i2 = eo3.f6303a;
        if (i2 < 0) {
            throw mq3.m13456f();
        } else if (i2 == 0) {
            eo3.f6305c = "";
            return j;
        } else {
            eo3.f6305c = new String(bArr, j, i2, kq3.f9606b);
            return j + i2;
        }
    }

    /* renamed from: h */
    static int m9255h(byte[] bArr, int i, eo3 eo3) {
        int j = m9257j(bArr, i, eo3);
        int i2 = eo3.f6303a;
        if (i2 < 0) {
            throw mq3.m13456f();
        } else if (i2 == 0) {
            eo3.f6305c = "";
            return j;
        } else {
            eo3.f6305c = lt3.m12870h(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: i */
    static int m9256i(int i, byte[] bArr, int i2, int i3, xs3 xs3, eo3 eo3) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int m = m9260m(bArr, i2, eo3);
                xs3.mo11916h(i, Long.valueOf(eo3.f6304b));
                return m;
            } else if (i4 == 1) {
                xs3.mo11916h(i, Long.valueOf(m9261n(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int j = m9257j(bArr, i2, eo3);
                int i5 = eo3.f6303a;
                if (i5 < 0) {
                    throw mq3.m13456f();
                } else if (i5 <= bArr.length - j) {
                    xs3.mo11916h(i, i5 == 0 ? uo3.f15667g : uo3.m17969J(bArr, j, i5));
                    return j + i5;
                } else {
                    throw mq3.m13459j();
                }
            } else if (i4 == 3) {
                int i6 = (i & -8) | 4;
                xs3 e = xs3.m19646e();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int j2 = m9257j(bArr, i2, eo3);
                    int i8 = eo3.f6303a;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = j2;
                        break;
                    }
                    int i9 = m9256i(i7, bArr, j2, i3, e, eo3);
                    i7 = i8;
                    i2 = i9;
                }
                if (i2 > i3 || i7 != i6) {
                    throw mq3.m13457g();
                }
                xs3.mo11916h(i, e);
                return i2;
            } else if (i4 == 5) {
                xs3.mo11916h(i, Integer.valueOf(m9249b(bArr, i2)));
                return i2 + 4;
            } else {
                throw mq3.m13453c();
            }
        } else {
            throw mq3.m13453c();
        }
    }

    /* renamed from: j */
    static int m9257j(byte[] bArr, int i, eo3 eo3) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m9258k(b, bArr, i2, eo3);
        }
        eo3.f6303a = b;
        return i2;
    }

    /* renamed from: k */
    static int m9258k(int i, byte[] bArr, int i2, eo3 eo3) {
        int i3;
        int i4;
        int i5 = i & 127;
        int i6 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            i4 = b << 7;
        } else {
            int i7 = i5 | ((b & Byte.MAX_VALUE) << 7);
            int i8 = i6 + 1;
            byte b2 = bArr[i6];
            if (b2 >= 0) {
                i3 = b2 << 14;
            } else {
                i5 = i7 | ((b2 & Byte.MAX_VALUE) << 14);
                i6 = i8 + 1;
                byte b3 = bArr[i8];
                if (b3 >= 0) {
                    i4 = b3 << 21;
                } else {
                    i7 = i5 | ((b3 & Byte.MAX_VALUE) << 21);
                    i8 = i6 + 1;
                    byte b4 = bArr[i6];
                    if (b4 >= 0) {
                        i3 = b4 << 28;
                    } else {
                        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i10 = i8 + 1;
                            if (bArr[i8] < 0) {
                                i8 = i10;
                            } else {
                                eo3.f6303a = i9;
                                return i10;
                            }
                        }
                    }
                }
            }
            eo3.f6303a = i7 | i3;
            return i8;
        }
        eo3.f6303a = i5 | i4;
        return i6;
    }

    /* renamed from: l */
    static int m9259l(int i, byte[] bArr, int i2, int i3, jq3<?> jq3, eo3 eo3) {
        bq3 bq3 = (bq3) jq3;
        int j = m9257j(bArr, i2, eo3);
        while (true) {
            bq3.mo5918N(eo3.f6303a);
            if (j >= i3) {
                break;
            }
            int j2 = m9257j(bArr, j, eo3);
            if (i != eo3.f6303a) {
                break;
            }
            j = m9257j(bArr, j2, eo3);
        }
        return j;
    }

    /* renamed from: m */
    static int m9260m(byte[] bArr, int i, eo3 eo3) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j < 0) {
            int i3 = i2 + 1;
            byte b = bArr[i2];
            long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
            int i4 = 7;
            while (b < 0) {
                int i5 = i3 + 1;
                byte b2 = bArr[i3];
                i4 += 7;
                j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
                int i6 = i5;
                b = b2;
                i3 = i6;
            }
            eo3.f6304b = j2;
            return i3;
        }
        eo3.f6304b = j;
        return i2;
    }

    /* renamed from: n */
    static long m9261n(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }
}
