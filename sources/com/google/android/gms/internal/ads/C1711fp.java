package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import javax.annotation.ParametersAreNonnullByDefault;
import p034e2.C2554k;

@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.fp */
public final class C1711fp {
    /* renamed from: a */
    public static int m9262a(String str) {
        byte[] bArr;
        try {
            bArr = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            bArr = str.getBytes();
        }
        return C2554k.m21206a(bArr, 0, bArr.length, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00b6, code lost:
        if (true != r4) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00c3, code lost:
        if (true != r4) goto L_0x00c5;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String[] m9263b(java.lang.String r11, boolean r12) {
        /*
            if (r11 != 0) goto L_0x0004
            r11 = 0
            return r11
        L_0x0004:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            char[] r1 = r11.toCharArray()
            int r11 = r11.length()
            r2 = 0
            r3 = r2
            r4 = r3
            r5 = r4
        L_0x0015:
            if (r3 >= r11) goto L_0x00ca
            int r6 = java.lang.Character.codePointAt(r1, r3)
            int r7 = java.lang.Character.charCount(r6)
            boolean r8 = java.lang.Character.isLetter(r6)
            r9 = 1
            if (r8 == 0) goto L_0x008e
            java.lang.Character$UnicodeBlock r8 = java.lang.Character.UnicodeBlock.of(r6)
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.BOPOMOFO
            if (r8 == r10) goto L_0x0078
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.BOPOMOFO_EXTENDED
            if (r8 == r10) goto L_0x0078
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.CJK_COMPATIBILITY
            if (r8 == r10) goto L_0x0078
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
            if (r8 == r10) goto L_0x0078
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT
            if (r8 == r10) goto L_0x0078
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS
            if (r8 == r10) goto L_0x0078
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A
            if (r8 == r10) goto L_0x0078
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B
            if (r8 == r10) goto L_0x0078
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS
            if (r8 == r10) goto L_0x0078
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.HANGUL_JAMO
            if (r8 == r10) goto L_0x0078
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.HANGUL_SYLLABLES
            if (r8 == r10) goto L_0x0078
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.HIRAGANA
            if (r8 == r10) goto L_0x0078
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.KATAKANA
            if (r8 == r10) goto L_0x0078
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS
            if (r8 != r10) goto L_0x0063
            goto L_0x0078
        L_0x0063:
            r8 = 65382(0xff66, float:9.162E-41)
            if (r6 < r8) goto L_0x006d
            r8 = 65437(0xff9d, float:9.1697E-41)
            if (r6 <= r8) goto L_0x0078
        L_0x006d:
            r8 = 65441(0xffa1, float:9.1702E-41)
            if (r6 < r8) goto L_0x008e
            r8 = 65500(0xffdc, float:9.1785E-41)
            if (r6 <= r8) goto L_0x0078
            goto L_0x008e
        L_0x0078:
            if (r4 == 0) goto L_0x0084
            java.lang.String r4 = new java.lang.String
            int r6 = r3 - r5
            r4.<init>(r1, r5, r6)
            r0.add(r4)
        L_0x0084:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r1, r3, r7)
        L_0x0089:
            r0.add(r4)
            r4 = r2
            goto L_0x00c7
        L_0x008e:
            boolean r8 = java.lang.Character.isLetterOrDigit(r6)
            if (r8 != 0) goto L_0x00c3
            int r8 = java.lang.Character.getType(r6)
            r10 = 6
            if (r8 == r10) goto L_0x00c3
            int r8 = java.lang.Character.getType(r6)
            r10 = 8
            if (r8 != r10) goto L_0x00a4
            goto L_0x00c3
        L_0x00a4:
            if (r12 == 0) goto L_0x00b9
            int r8 = java.lang.Character.charCount(r6)
            if (r8 != r9) goto L_0x00b9
            char[] r6 = java.lang.Character.toChars(r6)
            char r6 = r6[r2]
            r8 = 39
            if (r6 != r8) goto L_0x00b9
            if (r9 == r4) goto L_0x00c6
            goto L_0x00c5
        L_0x00b9:
            if (r4 == 0) goto L_0x00c7
            java.lang.String r4 = new java.lang.String
            int r6 = r3 - r5
            r4.<init>(r1, r5, r6)
            goto L_0x0089
        L_0x00c3:
            if (r9 == r4) goto L_0x00c6
        L_0x00c5:
            r5 = r3
        L_0x00c6:
            r4 = r9
        L_0x00c7:
            int r3 = r3 + r7
            goto L_0x0015
        L_0x00ca:
            if (r4 == 0) goto L_0x00d5
            java.lang.String r11 = new java.lang.String
            int r3 = r3 - r5
            r11.<init>(r1, r5, r3)
            r0.add(r11)
        L_0x00d5:
            int r11 = r0.size()
            java.lang.String[] r11 = new java.lang.String[r11]
            java.lang.Object[] r11 = r0.toArray(r11)
            java.lang.String[] r11 = (java.lang.String[]) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1711fp.m9263b(java.lang.String, boolean):java.lang.String[]");
    }
}
