package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

public final class x13 {
    /* renamed from: a */
    public static boolean m19285a(int i) {
        int i2 = i - 1;
        return i2 == 2 || i2 == 4 || i2 == 5 || i2 == 6;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00a2 */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0115  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:17:0x0060=Splitter:B:17:0x0060, B:39:0x00a2=Splitter:B:39:0x00a2} */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m19286b(android.content.Context r13, com.google.android.gms.internal.ads.u03 r14) {
        /*
            java.io.File r0 = new java.io.File
            java.io.File r1 = new java.io.File
            android.content.pm.ApplicationInfo r2 = r13.getApplicationInfo()
            java.lang.String r2 = r2.dataDir
            r1.<init>(r2)
            java.lang.String r2 = "lib"
            r0.<init>(r1, r2)
            boolean r1 = r0.exists()
            r2 = 5017(0x1399, float:7.03E-42)
            r3 = 7
            r4 = 6
            r5 = 1000(0x3e8, float:1.401E-42)
            r6 = 0
            r7 = 5
            r8 = 3
            r9 = 1
            if (r1 != 0) goto L_0x002a
            java.lang.String r0 = "No lib/"
        L_0x0024:
            r14.mo11131b(r2, r0)
            r0 = r5
            goto L_0x00b1
        L_0x002a:
            com.google.android.gms.internal.ads.l93 r1 = new com.google.android.gms.internal.ads.l93
            java.lang.String r10 = ".*\\.so$"
            r11 = 2
            java.util.regex.Pattern r10 = java.util.regex.Pattern.compile(r10, r11)
            r1.<init>(r10)
            java.io.File[] r0 = r0.listFiles(r1)
            if (r0 == 0) goto L_0x00ad
            int r1 = r0.length
            if (r1 != 0) goto L_0x0041
            goto L_0x00ad
        L_0x0041:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00a3 }
            r2 = 0
            r0 = r0[r2]     // Catch:{ IOException -> 0x00a3 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x00a3 }
            r0 = 20
            byte[] r10 = new byte[r0]     // Catch:{ all -> 0x009e }
            int r12 = r1.read(r10)     // Catch:{ all -> 0x009e }
            if (r12 != r0) goto L_0x0060
            byte[] r0 = new byte[r11]     // Catch:{ all -> 0x009e }
            r0[r2] = r2     // Catch:{ all -> 0x009e }
            r0[r9] = r2     // Catch:{ all -> 0x009e }
            byte r12 = r10[r7]     // Catch:{ all -> 0x009e }
            if (r12 != r11) goto L_0x0064
            m19288d(r10, r6, r13, r14)     // Catch:{ all -> 0x009e }
        L_0x0060:
            r1.close()     // Catch:{ IOException -> 0x00a3 }
            goto L_0x00ab
        L_0x0064:
            r11 = 19
            byte r11 = r10[r11]     // Catch:{ all -> 0x009e }
            r0[r2] = r11     // Catch:{ all -> 0x009e }
            r2 = 18
            byte r2 = r10[r2]     // Catch:{ all -> 0x009e }
            r0[r9] = r2     // Catch:{ all -> 0x009e }
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)     // Catch:{ all -> 0x009e }
            short r0 = r0.getShort()     // Catch:{ all -> 0x009e }
            if (r0 == r8) goto L_0x0099
            r2 = 40
            if (r0 == r2) goto L_0x0094
            r2 = 62
            if (r0 == r2) goto L_0x008f
            r2 = 183(0xb7, float:2.56E-43)
            if (r0 == r2) goto L_0x008a
            m19288d(r10, r6, r13, r14)     // Catch:{ all -> 0x009e }
            goto L_0x0060
        L_0x008a:
            r1.close()     // Catch:{ IOException -> 0x00a3 }
            r0 = r4
            goto L_0x00b1
        L_0x008f:
            r1.close()     // Catch:{ IOException -> 0x00a3 }
            r0 = r3
            goto L_0x00b1
        L_0x0094:
            r1.close()     // Catch:{ IOException -> 0x00a3 }
            r0 = r8
            goto L_0x00b1
        L_0x0099:
            r1.close()     // Catch:{ IOException -> 0x00a3 }
            r0 = r7
            goto L_0x00b1
        L_0x009e:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            throw r0     // Catch:{ IOException -> 0x00a3 }
        L_0x00a3:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            m19288d(r6, r0, r13, r14)
        L_0x00ab:
            r0 = r9
            goto L_0x00b1
        L_0x00ad:
            java.lang.String r0 = "No .so"
            goto L_0x0024
        L_0x00b1:
            if (r0 != r5) goto L_0x00fc
            java.lang.String r0 = m19287c(r13, r14)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x00c4
            java.lang.String r0 = "Empty dev arch"
        L_0x00bf:
            m19288d(r6, r0, r13, r14)
            r0 = r9
            goto L_0x00fc
        L_0x00c4:
            java.lang.String r1 = "i686"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 != 0) goto L_0x00fb
            java.lang.String r1 = "x86"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x00d5
            goto L_0x00fb
        L_0x00d5:
            java.lang.String r1 = "x86_64"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x00df
            r0 = r3
            goto L_0x00fc
        L_0x00df:
            java.lang.String r1 = "arm64-v8a"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x00e9
            r0 = r4
            goto L_0x00fc
        L_0x00e9:
            java.lang.String r1 = "armeabi-v7a"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 != 0) goto L_0x00f9
            java.lang.String r1 = "armv71"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x00bf
        L_0x00f9:
            r0 = r8
            goto L_0x00fc
        L_0x00fb:
            r0 = r7
        L_0x00fc:
            if (r0 == r9) goto L_0x0115
            if (r0 == r8) goto L_0x0112
            if (r0 == r7) goto L_0x010f
            if (r0 == r4) goto L_0x010c
            if (r0 == r3) goto L_0x0109
            java.lang.String r13 = "null"
            goto L_0x0117
        L_0x0109:
            java.lang.String r13 = "X86_64"
            goto L_0x0117
        L_0x010c:
            java.lang.String r13 = "ARM64"
            goto L_0x0117
        L_0x010f:
            java.lang.String r13 = "X86"
            goto L_0x0117
        L_0x0112:
            java.lang.String r13 = "ARM7"
            goto L_0x0117
        L_0x0115:
            java.lang.String r13 = "UNSUPPORTED"
        L_0x0117:
            r1 = 5018(0x139a, float:7.032E-42)
            r14.mo11131b(r1, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.x13.m19286b(android.content.Context, com.google.android.gms.internal.ads.u03):int");
    }

    /* renamed from: c */
    private static final String m19287c(Context context, u03 u03) {
        HashSet hashSet = new HashSet(Arrays.asList(new String[]{"i686", "armv71"}));
        String b = a53.OS_ARCH.mo5107b();
        if (!TextUtils.isEmpty(b) && hashSet.contains(b)) {
            return b;
        }
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get((Object) null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (IllegalAccessException | NoSuchFieldException e) {
            u03.mo11132c(2024, 0, e);
        }
        String str = Build.CPU_ABI;
        return str != null ? str : Build.CPU_ABI2;
    }

    /* renamed from: d */
    private static final void m19288d(byte[] bArr, String str, Context context, u03 u03) {
        StringBuilder sb = new StringBuilder();
        sb.append("os.arch:");
        sb.append(a53.OS_ARCH.mo5107b());
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get((Object) null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        u03.mo11131b(4007, sb.toString());
    }
}
