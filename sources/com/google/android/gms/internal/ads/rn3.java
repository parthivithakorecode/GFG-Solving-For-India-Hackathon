package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.util.Arrays;
import javax.crypto.Mac;

public final class rn3 implements xg3 {

    /* renamed from: a */
    private final ThreadLocal<Mac> f13764a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f13765b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Key f13766c;

    /* renamed from: d */
    private final int f13767d;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public rn3(java.lang.String r6, java.security.Key r7) {
        /*
            r5 = this;
            r5.<init>()
            com.google.android.gms.internal.ads.qn3 r0 = new com.google.android.gms.internal.ads.qn3
            r0.<init>(r5)
            r5.f13764a = r0
            r1 = 2
            boolean r2 = com.google.android.gms.internal.ads.qf3.m15611a(r1)
            if (r2 == 0) goto L_0x009a
            r5.f13765b = r6
            r5.f13766c = r7
            byte[] r7 = r7.getEncoded()
            int r7 = r7.length
            r2 = 16
            if (r7 < r2) goto L_0x0092
            int r7 = r6.hashCode()
            r2 = 4
            r3 = 3
            r4 = 1
            switch(r7) {
                case -1823053428: goto L_0x0051;
                case 392315023: goto L_0x0047;
                case 392315118: goto L_0x003d;
                case 392316170: goto L_0x0033;
                case 392317873: goto L_0x0029;
                default: goto L_0x0028;
            }
        L_0x0028:
            goto L_0x005b
        L_0x0029:
            java.lang.String r7 = "HMACSHA512"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x005b
            r7 = r2
            goto L_0x005c
        L_0x0033:
            java.lang.String r7 = "HMACSHA384"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x005b
            r7 = r3
            goto L_0x005c
        L_0x003d:
            java.lang.String r7 = "HMACSHA256"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x005b
            r7 = r1
            goto L_0x005c
        L_0x0047:
            java.lang.String r7 = "HMACSHA224"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x005b
            r7 = r4
            goto L_0x005c
        L_0x0051:
            java.lang.String r7 = "HMACSHA1"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x005b
            r7 = 0
            goto L_0x005c
        L_0x005b:
            r7 = -1
        L_0x005c:
            if (r7 == 0) goto L_0x008a
            if (r7 == r4) goto L_0x0087
            if (r7 == r1) goto L_0x0084
            if (r7 == r3) goto L_0x0081
            if (r7 == r2) goto L_0x007e
            java.security.NoSuchAlgorithmException r7 = new java.security.NoSuchAlgorithmException
            java.lang.String r0 = "unknown Hmac algorithm: "
            int r1 = r6.length()
            if (r1 == 0) goto L_0x0075
            java.lang.String r6 = r0.concat(r6)
            goto L_0x007a
        L_0x0075:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0)
        L_0x007a:
            r7.<init>(r6)
            throw r7
        L_0x007e:
            r6 = 64
            goto L_0x008c
        L_0x0081:
            r6 = 48
            goto L_0x008c
        L_0x0084:
            r6 = 32
            goto L_0x008c
        L_0x0087:
            r6 = 28
            goto L_0x008c
        L_0x008a:
            r6 = 20
        L_0x008c:
            r5.f13767d = r6
            r0.get()
            return
        L_0x0092:
            java.security.InvalidAlgorithmParameterException r6 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r7 = "key size too small, need at least 16 bytes"
            r6.<init>(r7)
            throw r6
        L_0x009a:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            java.lang.String r7 = "Can not use HMAC in FIPS-mode, as BoringCrypto module is not available."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rn3.<init>(java.lang.String, java.security.Key):void");
    }

    /* renamed from: a */
    public final byte[] mo10112a(byte[] bArr, int i) {
        if (i <= this.f13767d) {
            this.f13764a.get().update(bArr);
            return Arrays.copyOf(this.f13764a.get().doFinal(), i);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
