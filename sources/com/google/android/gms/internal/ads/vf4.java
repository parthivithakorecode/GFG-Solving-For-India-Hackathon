package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Locale;

public final class vf4 {

    /* renamed from: a */
    public static final tf4 f16221a = sf4.f14429a;

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.google.android.gms.internal.ads.c91 m18521a(byte[] r11, int r12, com.google.android.gms.internal.ads.tf4 r13, com.google.android.gms.internal.ads.da1 r14) {
        /*
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            com.google.android.gms.internal.ads.dr2 r0 = new com.google.android.gms.internal.ads.dr2
            r0.<init>(r11, r12)
            int r11 = r0.mo6583i()
            r12 = 2
            r1 = 10
            r2 = 4
            r3 = 0
            r4 = 1
            java.lang.String r5 = "Id3Decoder"
            r6 = 0
            if (r11 >= r1) goto L_0x0021
            java.lang.String r11 = "Data too short to be an ID3 tag"
        L_0x001b:
            android.util.Log.w(r5, r11)
            r9 = r6
            goto L_0x00b2
        L_0x0021:
            int r11 = r0.mo6595u()
            r7 = 4801587(0x494433, float:6.728456E-39)
            if (r11 == r7) goto L_0x004f
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r7[r3] = r11
            java.lang.String r11 = "%06X"
            java.lang.String r11 = java.lang.String.format(r11, r7)
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r7 = "Unexpected first three bytes of ID3 tag header: 0x"
            int r8 = r11.length()
            if (r8 == 0) goto L_0x0049
            java.lang.String r11 = r7.concat(r11)
            goto L_0x001b
        L_0x0049:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r7)
            goto L_0x001b
        L_0x004f:
            int r11 = r0.mo6593s()
            r0.mo6581g(r4)
            int r7 = r0.mo6593s()
            int r8 = r0.mo6592r()
            if (r11 != r12) goto L_0x0067
            r9 = r7 & 64
            if (r9 == 0) goto L_0x008e
            java.lang.String r11 = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme"
            goto L_0x001b
        L_0x0067:
            r9 = 3
            if (r11 != r9) goto L_0x0078
            r9 = r7 & 64
            if (r9 == 0) goto L_0x008e
            int r9 = r0.mo6587m()
            r0.mo6581g(r9)
            int r9 = r9 + r2
            int r8 = r8 - r9
            goto L_0x008e
        L_0x0078:
            if (r11 != r2) goto L_0x009d
            r9 = r7 & 64
            if (r9 == 0) goto L_0x0088
            int r9 = r0.mo6592r()
            int r10 = r9 + -4
            r0.mo6581g(r10)
            int r8 = r8 - r9
        L_0x0088:
            r9 = r7 & 16
            if (r9 == 0) goto L_0x008e
            int r8 = r8 + -10
        L_0x008e:
            if (r11 >= r2) goto L_0x0096
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0096
            r7 = r4
            goto L_0x0097
        L_0x0096:
            r7 = r3
        L_0x0097:
            com.google.android.gms.internal.ads.uf4 r9 = new com.google.android.gms.internal.ads.uf4
            r9.<init>(r11, r7, r8)
            goto L_0x00b2
        L_0x009d:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r8 = 57
            r7.<init>(r8)
            java.lang.String r8 = "Skipped ID3 tag with unsupported majorVersion="
            r7.append(r8)
            r7.append(r11)
            java.lang.String r11 = r7.toString()
            goto L_0x001b
        L_0x00b2:
            if (r9 != 0) goto L_0x00b5
            return r6
        L_0x00b5:
            int r11 = r0.mo6585k()
            int r7 = r9.f15542a
            if (r7 != r12) goto L_0x00c0
            r1 = 6
        L_0x00c0:
            int r12 = r9.f15544c
            boolean r7 = r9.f15543b
            if (r7 == 0) goto L_0x00d2
            int r12 = r9.f15544c
            int r12 = m18525e(r0, r12)
        L_0x00d2:
            int r11 = r11 + r12
            r0.mo6579e(r11)
            int r11 = r9.f15542a
            boolean r11 = m18530j(r0, r11, r1, r3)
            if (r11 != 0) goto L_0x0109
            int r11 = r9.f15542a
            if (r11 != r2) goto L_0x00ee
            boolean r11 = m18530j(r0, r2, r1, r4)
            if (r11 == 0) goto L_0x00ee
            r3 = r4
            goto L_0x0109
        L_0x00ee:
            int r11 = r9.f15542a
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r13 = 56
            r12.<init>(r13)
            java.lang.String r13 = "Failed to validate ID3 tag with majorVersion="
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            android.util.Log.w(r5, r11)
            return r6
        L_0x0109:
            int r11 = r0.mo6583i()
            if (r11 < r1) goto L_0x011d
            int r11 = r9.f15542a
            com.google.android.gms.internal.ads.wf4 r11 = m18526f(r11, r0, r3, r1, r13)
            if (r11 == 0) goto L_0x0109
            r14.add(r11)
            goto L_0x0109
        L_0x011d:
            com.google.android.gms.internal.ads.c91 r11 = new com.google.android.gms.internal.ads.c91
            r11.<init>((java.util.List<? extends com.google.android.gms.internal.ads.b81>) r14)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vf4.m18521a(byte[], int, com.google.android.gms.internal.ads.tf4, com.google.android.gms.internal.ads.da1):com.google.android.gms.internal.ads.c91");
    }

    /* renamed from: b */
    private static int m18522b(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* renamed from: c */
    private static int m18523c(byte[] bArr, int i, int i2) {
        int d = m18524d(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return d;
        }
        while (true) {
            int length = bArr.length;
            if (d >= length - 1) {
                return length;
            }
            if ((d - i) % 2 == 0 && bArr[d + 1] == 0) {
                return d;
            }
            d = m18524d(bArr, d + 1);
        }
    }

    /* renamed from: d */
    private static int m18524d(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    /* renamed from: e */
    private static int m18525e(dr2 dr2, int i) {
        byte[] h = dr2.mo6582h();
        int k = dr2.mo6585k();
        int i2 = k;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= k + i) {
                return i;
            }
            if ((h[i2] & 255) == 255 && h[i3] == 0) {
                System.arraycopy(h, i2 + 2, h, i3, (i - (i2 - k)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* JADX WARNING: type inference failed for: r3v17, types: [com.google.android.gms.internal.ads.pf4] */
    /* JADX WARNING: type inference failed for: r3v20, types: [com.google.android.gms.internal.ads.hf4] */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x026c, code lost:
        if (r9 == 67) goto L_0x026e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x02fe, code lost:
        r2 = "Id3Decoder";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x054d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x054e, code lost:
        r14 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0551, code lost:
        r2 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x055c, code lost:
        r14 = r21;
        r2 = r22;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:122:0x021a, B:143:0x0288] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0255 A[Catch:{ UnsupportedEncodingException -> 0x02fe, all -> 0x054d }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0260 A[Catch:{ UnsupportedEncodingException -> 0x02fe, all -> 0x054d }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0281 A[Catch:{ UnsupportedEncodingException -> 0x02fe, all -> 0x054d }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02af A[Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0367 A[Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03da A[Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x051e  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x054d A[ExcHandler: all (th java.lang.Throwable), PHI: r21 
      PHI: (r21v1 int) = (r21v2 int), (r21v2 int), (r21v2 int), (r21v5 int), (r21v8 int) binds: [B:237:0x0520, B:240:0x0549, B:241:?, B:143:0x0288, B:122:0x021a] A[DONT_GENERATE, DONT_INLINE], Splitter:B:122:0x021a] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.wf4 m18526f(int r34, com.google.android.gms.internal.ads.dr2 r35, boolean r36, int r37, com.google.android.gms.internal.ads.tf4 r38) {
        /*
            r0 = r34
            r1 = r35
            r2 = r36
            r3 = r37
            int r4 = r35.mo6593s()
            int r5 = r35.mo6593s()
            int r6 = r35.mo6593s()
            r7 = 3
            if (r0 < r7) goto L_0x001c
            int r9 = r35.mo6593s()
            goto L_0x001d
        L_0x001c:
            r9 = 0
        L_0x001d:
            r10 = 4
            if (r0 != r10) goto L_0x003c
            int r11 = r35.mo6596v()
            if (r2 != 0) goto L_0x0047
            r12 = r11 & 255(0xff, float:3.57E-43)
            int r13 = r11 >> 8
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 7
            r12 = r12 | r13
            int r13 = r11 >> 16
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 14
            r12 = r12 | r13
            int r11 = r11 >> 24
            int r11 = r11 << 21
            r11 = r11 | r12
            goto L_0x0047
        L_0x003c:
            if (r0 != r7) goto L_0x0043
            int r11 = r35.mo6596v()
            goto L_0x0047
        L_0x0043:
            int r11 = r35.mo6595u()
        L_0x0047:
            if (r0 < r7) goto L_0x004e
            int r12 = r35.mo6597w()
            goto L_0x004f
        L_0x004e:
            r12 = 0
        L_0x004f:
            r13 = 0
            if (r4 != 0) goto L_0x0065
            if (r5 != 0) goto L_0x0065
            if (r6 != 0) goto L_0x0065
            if (r9 != 0) goto L_0x0065
            if (r11 != 0) goto L_0x0065
            if (r12 == 0) goto L_0x005d
            goto L_0x0065
        L_0x005d:
            int r0 = r35.mo6586l()
            r1.mo6580f(r0)
            return r13
        L_0x0065:
            int r14 = r35.mo6585k()
            int r14 = r14 + r11
            int r15 = r35.mo6586l()
            java.lang.String r8 = "Id3Decoder"
            if (r14 <= r15) goto L_0x0078
            java.lang.String r0 = "Frame size exceeds remaining tag data"
            android.util.Log.w(r8, r0)
            goto L_0x005d
        L_0x0078:
            if (r38 != 0) goto L_0x0579
            r15 = 1
            if (r0 != r7) goto L_0x009b
            r7 = r12 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0083
            r7 = r15
            goto L_0x0084
        L_0x0083:
            r7 = 0
        L_0x0084:
            r17 = r12 & 64
            if (r17 == 0) goto L_0x008b
            r17 = r15
            goto L_0x008d
        L_0x008b:
            r17 = 0
        L_0x008d:
            r12 = r12 & 32
            if (r12 == 0) goto L_0x0093
            r12 = r15
            goto L_0x0094
        L_0x0093:
            r12 = 0
        L_0x0094:
            r18 = r17
            r19 = 0
            r17 = r7
            goto L_0x00ce
        L_0x009b:
            if (r0 != r10) goto L_0x00c6
            r7 = r12 & 64
            if (r7 == 0) goto L_0x00a3
            r7 = r15
            goto L_0x00a4
        L_0x00a3:
            r7 = 0
        L_0x00a4:
            r17 = r12 & 8
            if (r17 == 0) goto L_0x00ab
            r17 = r15
            goto L_0x00ad
        L_0x00ab:
            r17 = 0
        L_0x00ad:
            r18 = r12 & 4
            if (r18 == 0) goto L_0x00b4
            r18 = r15
            goto L_0x00b6
        L_0x00b4:
            r18 = 0
        L_0x00b6:
            r19 = r12 & 2
            if (r19 == 0) goto L_0x00bd
            r19 = r15
            goto L_0x00bf
        L_0x00bd:
            r19 = 0
        L_0x00bf:
            r12 = r12 & r15
            r33 = r12
            r12 = r7
            r7 = r33
            goto L_0x00ce
        L_0x00c6:
            r7 = 0
            r12 = 0
            r17 = 0
            r18 = 0
            r19 = 0
        L_0x00ce:
            if (r17 != 0) goto L_0x056e
            if (r18 == 0) goto L_0x00d4
            goto L_0x056e
        L_0x00d4:
            if (r12 == 0) goto L_0x00db
            int r11 = r11 + -1
            r1.mo6581g(r15)
        L_0x00db:
            if (r7 == 0) goto L_0x00e2
            int r11 = r11 + -4
            r1.mo6581g(r10)
        L_0x00e2:
            if (r19 == 0) goto L_0x00e8
            int r11 = m18525e(r1, r11)
        L_0x00e8:
            r7 = 84
            r12 = 88
            r10 = 2
            if (r4 != r7) goto L_0x0128
            if (r5 != r12) goto L_0x0128
            if (r6 != r12) goto L_0x0128
            if (r0 == r10) goto L_0x00f7
            if (r9 != r12) goto L_0x0128
        L_0x00f7:
            if (r11 > 0) goto L_0x00fa
            goto L_0x0130
        L_0x00fa:
            int r2 = r35.mo6593s()     // Catch:{ UnsupportedEncodingException -> 0x015e }
            java.lang.String r3 = m18528h(r2)     // Catch:{ UnsupportedEncodingException -> 0x015e }
            int r7 = r11 + -1
            byte[] r10 = new byte[r7]     // Catch:{ UnsupportedEncodingException -> 0x015e }
            r12 = 0
            r1.mo6576b(r10, r12, r7)     // Catch:{ UnsupportedEncodingException -> 0x015e }
            int r7 = m18523c(r10, r12, r2)     // Catch:{ UnsupportedEncodingException -> 0x015e }
            java.lang.String r15 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x015e }
            r15.<init>(r10, r12, r7, r3)     // Catch:{ UnsupportedEncodingException -> 0x015e }
            int r12 = m18522b(r2)     // Catch:{ UnsupportedEncodingException -> 0x015e }
            int r7 = r7 + r12
            int r2 = m18523c(r10, r7, r2)     // Catch:{ UnsupportedEncodingException -> 0x015e }
            java.lang.String r2 = m18527g(r10, r7, r2, r3)     // Catch:{ UnsupportedEncodingException -> 0x015e }
            com.google.android.gms.internal.ads.e r3 = new com.google.android.gms.internal.ads.e     // Catch:{ UnsupportedEncodingException -> 0x015e }
            java.lang.String r7 = "TXXX"
            r3.<init>(r7, r15, r2)     // Catch:{ UnsupportedEncodingException -> 0x015e }
            goto L_0x0159
        L_0x0128:
            if (r4 != r7) goto L_0x0161
            java.lang.String r2 = m18529i(r0, r7, r5, r6, r9)     // Catch:{ UnsupportedEncodingException -> 0x015e }
            if (r11 > 0) goto L_0x013b
        L_0x0130:
            r23 = r4
            r3 = r5
            r4 = r6
            r22 = r8
            r8 = r9
            r21 = r14
            goto L_0x051c
        L_0x013b:
            int r3 = r35.mo6593s()     // Catch:{ UnsupportedEncodingException -> 0x015e }
            java.lang.String r7 = m18528h(r3)     // Catch:{ UnsupportedEncodingException -> 0x015e }
            int r10 = r11 + -1
            byte[] r12 = new byte[r10]     // Catch:{ UnsupportedEncodingException -> 0x015e }
            r15 = 0
            r1.mo6576b(r12, r15, r10)     // Catch:{ UnsupportedEncodingException -> 0x015e }
            int r3 = m18523c(r12, r15, r3)     // Catch:{ UnsupportedEncodingException -> 0x015e }
            java.lang.String r10 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x015e }
            r10.<init>(r12, r15, r3, r7)     // Catch:{ UnsupportedEncodingException -> 0x015e }
            com.google.android.gms.internal.ads.e r3 = new com.google.android.gms.internal.ads.e     // Catch:{ UnsupportedEncodingException -> 0x015e }
            r3.<init>(r2, r13, r10)     // Catch:{ UnsupportedEncodingException -> 0x015e }
        L_0x0159:
            r13 = r3
            goto L_0x0130
        L_0x015b:
            r0 = move-exception
            goto L_0x056a
        L_0x015e:
            r2 = r8
            goto L_0x0560
        L_0x0161:
            r7 = 87
            java.lang.String r15 = "ISO-8859-1"
            if (r4 != r7) goto L_0x01a2
            if (r5 != r12) goto L_0x01a0
            if (r6 != r12) goto L_0x01a0
            if (r0 == r10) goto L_0x016f
            if (r9 != r12) goto L_0x01a0
        L_0x016f:
            if (r11 > 0) goto L_0x0172
            goto L_0x0130
        L_0x0172:
            int r2 = r35.mo6593s()     // Catch:{ UnsupportedEncodingException -> 0x015e }
            java.lang.String r3 = m18528h(r2)     // Catch:{ UnsupportedEncodingException -> 0x015e }
            int r7 = r11 + -1
            byte[] r10 = new byte[r7]     // Catch:{ UnsupportedEncodingException -> 0x015e }
            r12 = 0
            r1.mo6576b(r10, r12, r7)     // Catch:{ UnsupportedEncodingException -> 0x015e }
            int r7 = m18523c(r10, r12, r2)     // Catch:{ UnsupportedEncodingException -> 0x015e }
            java.lang.String r13 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x015e }
            r13.<init>(r10, r12, r7, r3)     // Catch:{ UnsupportedEncodingException -> 0x015e }
            int r2 = m18522b(r2)     // Catch:{ UnsupportedEncodingException -> 0x015e }
            int r7 = r7 + r2
            int r2 = m18524d(r10, r7)     // Catch:{ UnsupportedEncodingException -> 0x015e }
            java.lang.String r2 = m18527g(r10, r7, r2, r15)     // Catch:{ UnsupportedEncodingException -> 0x015e }
            com.google.android.gms.internal.ads.g r3 = new com.google.android.gms.internal.ads.g     // Catch:{ UnsupportedEncodingException -> 0x015e }
            java.lang.String r7 = "WXXX"
            r3.<init>(r7, r13, r2)     // Catch:{ UnsupportedEncodingException -> 0x015e }
            goto L_0x0159
        L_0x01a0:
            r12 = r7
            goto L_0x01a3
        L_0x01a2:
            r12 = r4
        L_0x01a3:
            if (r12 != r7) goto L_0x01bf
            java.lang.String r2 = m18529i(r0, r7, r5, r6, r9)     // Catch:{ UnsupportedEncodingException -> 0x015e }
            byte[] r3 = new byte[r11]     // Catch:{ UnsupportedEncodingException -> 0x015e }
            r7 = 0
            r1.mo6576b(r3, r7, r11)     // Catch:{ UnsupportedEncodingException -> 0x015e }
            int r10 = m18524d(r3, r7)     // Catch:{ UnsupportedEncodingException -> 0x015e }
            java.lang.String r12 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x015e }
            r12.<init>(r3, r7, r10, r15)     // Catch:{ UnsupportedEncodingException -> 0x015e }
            com.google.android.gms.internal.ads.g r3 = new com.google.android.gms.internal.ads.g     // Catch:{ UnsupportedEncodingException -> 0x015e }
            r7 = 0
            r3.<init>(r2, r7, r12)     // Catch:{ UnsupportedEncodingException -> 0x015e }
            goto L_0x0159
        L_0x01bf:
            r7 = 73
            r13 = 80
            if (r12 != r13) goto L_0x01ec
            r12 = 82
            if (r5 != r12) goto L_0x01eb
            if (r6 != r7) goto L_0x01eb
            r12 = 86
            if (r9 != r12) goto L_0x01eb
            byte[] r2 = new byte[r11]     // Catch:{ UnsupportedEncodingException -> 0x015e }
            r3 = 0
            r1.mo6576b(r2, r3, r11)     // Catch:{ UnsupportedEncodingException -> 0x015e }
            int r7 = m18524d(r2, r3)     // Catch:{ UnsupportedEncodingException -> 0x015e }
            java.lang.String r10 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x015e }
            r10.<init>(r2, r3, r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x015e }
            r3 = 1
            int r7 = r7 + r3
            byte[] r2 = m18531k(r2, r7, r11)     // Catch:{ UnsupportedEncodingException -> 0x015e }
            com.google.android.gms.internal.ads.c r3 = new com.google.android.gms.internal.ads.c     // Catch:{ UnsupportedEncodingException -> 0x015e }
            r3.<init>(r10, r2)     // Catch:{ UnsupportedEncodingException -> 0x015e }
            goto L_0x0159
        L_0x01eb:
            r12 = r13
        L_0x01ec:
            r7 = 79
            r13 = 71
            if (r12 != r13) goto L_0x024f
            r12 = 69
            if (r5 != r12) goto L_0x024b
            if (r6 != r7) goto L_0x024b
            r12 = 66
            if (r9 == r12) goto L_0x0201
            if (r0 != r10) goto L_0x01ff
            goto L_0x0201
        L_0x01ff:
            r12 = r13
            goto L_0x024f
        L_0x0201:
            int r2 = r35.mo6593s()     // Catch:{ UnsupportedEncodingException -> 0x015e }
            java.lang.String r3 = m18528h(r2)     // Catch:{ UnsupportedEncodingException -> 0x015e }
            int r7 = r11 + -1
            byte[] r10 = new byte[r7]     // Catch:{ UnsupportedEncodingException -> 0x015e }
            r12 = 0
            r1.mo6576b(r10, r12, r7)     // Catch:{ UnsupportedEncodingException -> 0x015e }
            int r13 = m18524d(r10, r12)     // Catch:{ UnsupportedEncodingException -> 0x015e }
            java.lang.String r12 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x015e }
            r21 = r14
            r14 = 0
            r12.<init>(r10, r14, r13, r15)     // Catch:{ UnsupportedEncodingException -> 0x02fe, all -> 0x054d }
            r14 = 1
            int r13 = r13 + r14
            int r14 = m18523c(r10, r13, r2)     // Catch:{ UnsupportedEncodingException -> 0x02fe, all -> 0x054d }
            java.lang.String r13 = m18527g(r10, r13, r14, r3)     // Catch:{ UnsupportedEncodingException -> 0x02fe, all -> 0x054d }
            int r15 = m18522b(r2)     // Catch:{ UnsupportedEncodingException -> 0x02fe, all -> 0x054d }
            int r14 = r14 + r15
            int r15 = m18523c(r10, r14, r2)     // Catch:{ UnsupportedEncodingException -> 0x02fe, all -> 0x054d }
            java.lang.String r3 = m18527g(r10, r14, r15, r3)     // Catch:{ UnsupportedEncodingException -> 0x02fe, all -> 0x054d }
            int r2 = m18522b(r2)     // Catch:{ UnsupportedEncodingException -> 0x02fe, all -> 0x054d }
            int r15 = r15 + r2
            byte[] r2 = m18531k(r10, r15, r7)     // Catch:{ UnsupportedEncodingException -> 0x02fe, all -> 0x054d }
            com.google.android.gms.internal.ads.rf4 r7 = new com.google.android.gms.internal.ads.rf4     // Catch:{ UnsupportedEncodingException -> 0x02fe, all -> 0x054d }
            r7.<init>(r12, r13, r3, r2)     // Catch:{ UnsupportedEncodingException -> 0x02fe, all -> 0x054d }
            r23 = r4
            r3 = r5
            r4 = r6
            r13 = r7
            r22 = r8
            goto L_0x0356
        L_0x024b:
            r21 = r14
            r12 = r13
            goto L_0x0251
        L_0x024f:
            r21 = r14
        L_0x0251:
            r13 = 67
            if (r0 != r10) goto L_0x0260
            r14 = 80
            if (r12 != r14) goto L_0x0301
            r7 = 73
            if (r5 != r7) goto L_0x0301
            if (r6 != r13) goto L_0x0301
            goto L_0x026e
        L_0x0260:
            r7 = 73
            r14 = 80
            r10 = 65
            if (r12 != r10) goto L_0x0301
            if (r5 != r14) goto L_0x0301
            if (r6 != r7) goto L_0x0301
            if (r9 != r13) goto L_0x0301
        L_0x026e:
            int r2 = r35.mo6593s()     // Catch:{ UnsupportedEncodingException -> 0x02fe, all -> 0x054d }
            java.lang.String r3 = m18528h(r2)     // Catch:{ UnsupportedEncodingException -> 0x02fe, all -> 0x054d }
            int r7 = r11 + -1
            byte[] r10 = new byte[r7]     // Catch:{ UnsupportedEncodingException -> 0x02fe, all -> 0x054d }
            r12 = 0
            r1.mo6576b(r10, r12, r7)     // Catch:{ UnsupportedEncodingException -> 0x02fe, all -> 0x054d }
            r13 = 2
            if (r0 != r13) goto L_0x02af
            java.lang.String r13 = "image/"
            java.lang.String r14 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x02fe, all -> 0x054d }
            r22 = r8
            r8 = 3
            r14.<init>(r10, r12, r8, r15)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            java.lang.String r8 = com.google.android.gms.internal.ads.w33.m18852a(r14)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            int r12 = r8.length()     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            if (r12 == 0) goto L_0x029e
            java.lang.String r8 = r13.concat(r8)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            goto L_0x02a3
        L_0x029e:
            java.lang.String r8 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r8.<init>(r13)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
        L_0x02a3:
            java.lang.String r12 = "image/jpg"
            boolean r12 = r12.equals(r8)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            if (r12 == 0) goto L_0x02ad
            java.lang.String r8 = "image/jpeg"
        L_0x02ad:
            r12 = 2
            goto L_0x02da
        L_0x02af:
            r22 = r8
            r8 = r12
            int r12 = m18524d(r10, r8)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            java.lang.String r13 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r13.<init>(r10, r8, r12, r15)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            java.lang.String r8 = com.google.android.gms.internal.ads.w33.m18852a(r13)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r13 = 47
            int r13 = r8.indexOf(r13)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r14 = -1
            if (r13 != r14) goto L_0x02da
            java.lang.String r13 = "image/"
            int r14 = r8.length()     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            if (r14 == 0) goto L_0x02d5
            java.lang.String r8 = r13.concat(r8)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            goto L_0x02da
        L_0x02d5:
            java.lang.String r8 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r8.<init>(r13)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
        L_0x02da:
            int r13 = r12 + 1
            byte r13 = r10[r13]     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r13 = r13 & 255(0xff, float:3.57E-43)
            r14 = 2
            int r12 = r12 + r14
            int r14 = m18523c(r10, r12, r2)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            java.lang.String r15 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r23 = r4
            int r4 = r14 - r12
            r15.<init>(r10, r12, r4, r3)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            int r2 = m18522b(r2)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            int r14 = r14 + r2
            byte[] r2 = m18531k(r10, r14, r7)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            com.google.android.gms.internal.ads.hf4 r3 = new com.google.android.gms.internal.ads.hf4     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r3.<init>(r8, r15, r13, r2)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            goto L_0x0353
        L_0x02fe:
            r2 = r8
            goto L_0x0553
        L_0x0301:
            r23 = r4
            r22 = r8
            r4 = 77
            if (r12 != r13) goto L_0x0359
            r7 = 79
            if (r5 != r7) goto L_0x0359
            if (r6 != r4) goto L_0x0359
            if (r9 == r4) goto L_0x0314
            r7 = 2
            if (r0 != r7) goto L_0x0359
        L_0x0314:
            r2 = 4
            if (r11 >= r2) goto L_0x031d
            r3 = r5
            r4 = r6
            r8 = r9
            r13 = 0
            goto L_0x051c
        L_0x031d:
            int r2 = r35.mo6593s()     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            java.lang.String r3 = m18528h(r2)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r4 = 3
            byte[] r7 = new byte[r4]     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r8 = 0
            r1.mo6576b(r7, r8, r4)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            java.lang.String r10 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r10.<init>(r7, r8, r4)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            int r4 = r11 + -4
            byte[] r7 = new byte[r4]     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r1.mo6576b(r7, r8, r4)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            int r4 = m18523c(r7, r8, r2)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            java.lang.String r12 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r12.<init>(r7, r8, r4, r3)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            int r8 = m18522b(r2)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            int r4 = r4 + r8
            int r2 = m18523c(r7, r4, r2)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            java.lang.String r2 = m18527g(r7, r4, r2, r3)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            com.google.android.gms.internal.ads.pf4 r3 = new com.google.android.gms.internal.ads.pf4     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r3.<init>(r10, r12, r2)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
        L_0x0353:
            r13 = r3
            r3 = r5
            r4 = r6
        L_0x0356:
            r8 = r9
            goto L_0x051c
        L_0x0359:
            if (r12 != r13) goto L_0x03da
            r7 = 72
            if (r5 != r7) goto L_0x03da
            r7 = 65
            if (r6 != r7) goto L_0x03da
            r7 = 80
            if (r9 != r7) goto L_0x03da
            int r4 = r35.mo6585k()     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            byte[] r7 = r35.mo6582h()     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            int r7 = m18524d(r7, r4)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            java.lang.String r8 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            byte[] r10 = r35.mo6582h()     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            int r12 = r7 - r4
            r8.<init>(r10, r4, r12, r15)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r10 = 1
            int r7 = r7 + r10
            r1.mo6580f(r7)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            int r26 = r35.mo6587m()     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            int r27 = r35.mo6587m()     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            long r12 = r35.mo6567A()     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r7 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r7 != 0) goto L_0x039a
            r12 = -1
        L_0x039a:
            r28 = r12
            long r12 = r35.mo6567A()     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r7 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r7 != 0) goto L_0x03ab
            r12 = -1
        L_0x03ab:
            r30 = r12
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r7.<init>()     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            int r4 = r4 + r11
        L_0x03b3:
            int r10 = r35.mo6585k()     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            if (r10 >= r4) goto L_0x03c4
            r10 = 0
            com.google.android.gms.internal.ads.wf4 r12 = m18526f(r0, r1, r2, r3, r10)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            if (r12 == 0) goto L_0x03b3
            r7.add(r12)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            goto L_0x03b3
        L_0x03c4:
            r2 = 0
            com.google.android.gms.internal.ads.wf4[] r2 = new com.google.android.gms.internal.ads.wf4[r2]     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            java.lang.Object[] r2 = r7.toArray(r2)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r32 = r2
            com.google.android.gms.internal.ads.wf4[] r32 = (com.google.android.gms.internal.ads.wf4[]) r32     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            com.google.android.gms.internal.ads.lf4 r3 = new com.google.android.gms.internal.ads.lf4     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r24 = r3
            r25 = r8
            r24.<init>(r25, r26, r27, r28, r30, r32)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            goto L_0x0353
        L_0x03da:
            if (r12 != r13) goto L_0x0490
            r7 = 84
            if (r5 != r7) goto L_0x0490
            r7 = 79
            if (r6 != r7) goto L_0x0490
            if (r9 != r13) goto L_0x0490
            int r4 = r35.mo6585k()     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            byte[] r7 = r35.mo6582h()     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            int r7 = m18524d(r7, r4)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            java.lang.String r8 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            byte[] r10 = r35.mo6582h()     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            int r12 = r7 - r4
            r8.<init>(r10, r4, r12, r15)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r10 = 1
            int r7 = r7 + r10
            r1.mo6580f(r7)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            int r7 = r35.mo6593s()     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r10 = r7 & 2
            if (r10 == 0) goto L_0x040e
            r10 = 1
            r26 = 1
            goto L_0x0411
        L_0x040e:
            r10 = 1
            r26 = 0
        L_0x0411:
            r7 = r7 & r10
            int r10 = r35.mo6593s()     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            java.lang.String[] r12 = new java.lang.String[r10]     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r13 = 0
        L_0x0419:
            if (r13 >= r10) goto L_0x044c
            int r14 = r35.mo6585k()     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r38 = r10
            byte[] r10 = r35.mo6582h()     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            int r10 = m18524d(r10, r14)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r16 = r9
            java.lang.String r9 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r17 = r6
            byte[] r6 = r35.mo6582h()     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r20 = r5
            int r5 = r10 - r14
            r9.<init>(r6, r14, r5, r15)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r12[r13] = r9     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            int r10 = r10 + 1
            r1.mo6580f(r10)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            int r13 = r13 + 1
            r10 = r38
            r9 = r16
            r6 = r17
            r5 = r20
            goto L_0x0419
        L_0x044c:
            r20 = r5
            r17 = r6
            r16 = r9
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r5.<init>()     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            int r4 = r4 + r11
        L_0x0458:
            int r6 = r35.mo6585k()     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            if (r6 >= r4) goto L_0x0469
            r6 = 0
            com.google.android.gms.internal.ads.wf4 r9 = m18526f(r0, r1, r2, r3, r6)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            if (r9 == 0) goto L_0x0458
            r5.add(r9)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            goto L_0x0458
        L_0x0469:
            r2 = 0
            com.google.android.gms.internal.ads.wf4[] r3 = new com.google.android.gms.internal.ads.wf4[r2]     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            java.lang.Object[] r2 = r5.toArray(r3)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r29 = r2
            com.google.android.gms.internal.ads.wf4[] r29 = (com.google.android.gms.internal.ads.wf4[]) r29     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            com.google.android.gms.internal.ads.nf4 r3 = new com.google.android.gms.internal.ads.nf4     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r2 = 1
            if (r2 == r7) goto L_0x047c
            r27 = 0
            goto L_0x047e
        L_0x047c:
            r27 = r2
        L_0x047e:
            r24 = r3
            r25 = r8
            r28 = r12
            r24.<init>(r25, r26, r27, r28, r29)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r13 = r3
            r8 = r16
            r4 = r17
            r3 = r20
            goto L_0x051c
        L_0x0490:
            r20 = r5
            r17 = r6
            r16 = r9
            if (r12 != r4) goto L_0x0506
            r2 = 76
            r3 = r20
            if (r3 != r2) goto L_0x0501
            r2 = 76
            r4 = r17
            r8 = r16
            if (r4 != r2) goto L_0x050c
            r2 = 84
            if (r8 != r2) goto L_0x050c
            int r25 = r35.mo6597w()     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            int r26 = r35.mo6595u()     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            int r27 = r35.mo6595u()     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            int r2 = r35.mo6593s()     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            int r5 = r35.mo6593s()     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            com.google.android.gms.internal.ads.cq2 r6 = new com.google.android.gms.internal.ads.cq2     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r6.<init>()     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            byte[] r7 = r35.mo6582h()     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            int r9 = r35.mo6586l()     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r6.mo6266g(r7, r9)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            int r7 = r35.mo6585k()     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            int r7 = r7 * 8
            r6.mo6267h(r7)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            int r7 = r11 + -10
            int r7 = r7 * 8
            int r9 = r2 + r5
            int r7 = r7 / r9
            int[] r9 = new int[r7]     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            int[] r10 = new int[r7]     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r12 = 0
        L_0x04e3:
            if (r12 >= r7) goto L_0x04f4
            int r13 = r6.mo6262c(r2)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            int r14 = r6.mo6262c(r5)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r9[r12] = r13     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r10[r12] = r14     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            int r12 = r12 + 1
            goto L_0x04e3
        L_0x04f4:
            com.google.android.gms.internal.ads.ag4 r2 = new com.google.android.gms.internal.ads.ag4     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r24 = r2
            r28 = r9
            r29 = r10
            r24.<init>(r25, r26, r27, r28, r29)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r13 = r2
            goto L_0x051c
        L_0x0501:
            r8 = r16
            r4 = r17
            goto L_0x050c
        L_0x0506:
            r8 = r16
            r4 = r17
            r3 = r20
        L_0x050c:
            java.lang.String r2 = m18529i(r0, r12, r3, r4, r8)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            byte[] r5 = new byte[r11]     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r6 = 0
            r1.mo6576b(r5, r6, r11)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            com.google.android.gms.internal.ads.jf4 r6 = new com.google.android.gms.internal.ads.jf4     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r6.<init>(r2, r5)     // Catch:{ UnsupportedEncodingException -> 0x055c, all -> 0x054d }
            r13 = r6
        L_0x051c:
            if (r13 != 0) goto L_0x0556
            r2 = r23
            java.lang.String r0 = m18529i(r0, r2, r3, r4, r8)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            int r2 = r2.length()     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            int r2 = r2 + 50
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r3.<init>(r2)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            java.lang.String r2 = "Failed to decode frame: id="
            r3.append(r2)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r3.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            java.lang.String r0 = ", frameSize="
            r3.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r3.append(r11)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            java.lang.String r0 = r3.toString()     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r2 = r22
            android.util.Log.w(r2, r0)     // Catch:{ UnsupportedEncodingException -> 0x0553, all -> 0x054d }
            goto L_0x0556
        L_0x054d:
            r0 = move-exception
            r14 = r21
            goto L_0x056a
        L_0x0551:
            r2 = r22
        L_0x0553:
            r14 = r21
            goto L_0x0560
        L_0x0556:
            r14 = r21
            r1.mo6580f(r14)
            return r13
        L_0x055c:
            r14 = r21
            r2 = r22
        L_0x0560:
            java.lang.String r0 = "Unsupported character encoding"
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x015b }
            r1.mo6580f(r14)
            r0 = 0
            return r0
        L_0x056a:
            r1.mo6580f(r14)
            throw r0
        L_0x056e:
            r2 = r8
            r0 = r13
            java.lang.String r3 = "Skipping unsupported compressed or encrypted frame"
            android.util.Log.w(r2, r3)
            r1.mo6580f(r14)
            return r0
        L_0x0579:
            r0 = r13
            r1.mo6580f(r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vf4.m18526f(int, com.google.android.gms.internal.ads.dr2, boolean, int, com.google.android.gms.internal.ads.tf4):com.google.android.gms.internal.ads.wf4");
    }

    /* renamed from: g */
    private static String m18527g(byte[] bArr, int i, int i2, String str) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    /* renamed from: h */
    private static String m18528h(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    /* renamed from: i */
    private static String m18529i(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
        }
        return String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
    }

    /* renamed from: j */
    private static boolean m18530j(dr2 dr2, int i, int i2, boolean z) {
        int i3;
        long j;
        int i4;
        int i5;
        dr2 dr22 = dr2;
        int i6 = i;
        int k = dr2.mo6585k();
        while (true) {
            try {
                int i7 = 1;
                if (dr2.mo6583i() >= i2) {
                    if (i6 >= 3) {
                        i4 = dr2.mo6587m();
                        j = dr2.mo6567A();
                        i3 = dr2.mo6597w();
                    } else {
                        i4 = dr2.mo6595u();
                        j = (long) dr2.mo6595u();
                        i3 = 0;
                    }
                    if (i4 == 0 && j == 0 && i3 == 0) {
                        dr22.mo6580f(k);
                        return true;
                    }
                    if (i6 == 4 && !z) {
                        if ((8421504 & j) != 0) {
                            dr22.mo6580f(k);
                            return false;
                        }
                        j = ((j >> 24) << 21) | ((255 & (j >> 16)) << 14) | (j & 255) | (((j >> 8) & 255) << 7);
                    }
                    if (i6 == 4) {
                        if ((i3 & 64) == 0) {
                            i7 = 0;
                        }
                        int i8 = i7;
                        i7 = i3 & 1;
                        i5 = i8;
                    } else if (i6 == 3) {
                        i5 = (i3 & 32) != 0 ? 1 : 0;
                        if ((i3 & 128) == 0) {
                            i7 = 0;
                        }
                    } else {
                        i5 = 0;
                        i7 = 0;
                    }
                    if (i7 != 0) {
                        i5 += 4;
                    }
                    if (j < ((long) i5)) {
                        dr22.mo6580f(k);
                        return false;
                    } else if (((long) dr2.mo6583i()) < j) {
                        return false;
                    } else {
                        dr22.mo6581g((int) j);
                    }
                } else {
                    dr22.mo6580f(k);
                    return true;
                }
            } finally {
                dr22.mo6580f(k);
            }
        }
    }

    /* renamed from: k */
    private static byte[] m18531k(byte[] bArr, int i, int i2) {
        return i2 <= i ? n13.f11241f : Arrays.copyOfRange(bArr, i, i2);
    }
}
