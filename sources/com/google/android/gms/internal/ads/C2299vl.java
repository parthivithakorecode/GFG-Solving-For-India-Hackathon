package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.vl */
public final class C2299vl {

    /* renamed from: a */
    public final Uri f16339a;

    /* renamed from: b */
    public final long f16340b;

    /* renamed from: c */
    public final long f16341c;

    /* renamed from: d */
    public final long f16342d;

    public C2299vl(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = false;
        C1856jm.m11728c(j >= 0);
        C1856jm.m11728c(j2 >= 0);
        C1856jm.m11728c((j3 > 0 || j3 == -1) ? true : z);
        this.f16339a = uri;
        this.f16340b = j;
        this.f16341c = j2;
        this.f16342d = j3;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f16339a);
        String arrays = Arrays.toString((byte[]) null);
        long j = this.f16340b;
        long j2 = this.f16341c;
        long j3 = this.f16342d;
        StringBuilder sb = new StringBuilder(valueOf.length() + 93 + String.valueOf(arrays).length() + 4);
        sb.append("DataSpec[");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(arrays);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(", null, 0]");
        return sb.toString();
    }
}
