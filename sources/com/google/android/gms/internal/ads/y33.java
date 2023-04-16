package com.google.android.gms.internal.ads;

final class y33 extends x33 {

    /* renamed from: a */
    private final char f17588a;

    y33(char c) {
        this.f17588a = c;
    }

    /* renamed from: a */
    public final boolean mo5085a(char c) {
        return c == this.f17588a;
    }

    public final String toString() {
        int i = this.f17588a;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        String copyValueOf = String.copyValueOf(cArr);
        StringBuilder sb = new StringBuilder(String.valueOf(copyValueOf).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(copyValueOf);
        sb.append("')");
        return sb.toString();
    }
}
