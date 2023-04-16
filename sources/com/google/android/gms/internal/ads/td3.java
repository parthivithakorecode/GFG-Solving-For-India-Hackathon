package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class td3 implements Comparable<td3> {

    /* renamed from: f */
    private final byte[] f14825f;

    /* synthetic */ td3(byte[] bArr, sd3 sd3) {
        this.f14825f = Arrays.copyOf(bArr, bArr.length);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        td3 td3 = (td3) obj;
        int length = this.f14825f.length;
        int length2 = td3.f14825f.length;
        if (length != length2) {
            return length - length2;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.f14825f;
            if (i >= bArr.length) {
                return 0;
            }
            byte b = bArr[i];
            byte b2 = td3.f14825f[i];
            if (b != b2) {
                return b - b2;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof td3)) {
            return false;
        }
        return Arrays.equals(this.f14825f, ((td3) obj).f14825f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f14825f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(r2 + r2);
        for (byte b : this.f14825f) {
            byte b2 = b & 255;
            sb.append("0123456789abcdef".charAt(b2 >> 4));
            sb.append("0123456789abcdef".charAt(b2 & 15));
        }
        return sb.toString();
    }
}
