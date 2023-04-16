package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.rl */
public final class C2151rl implements C2225tl {

    /* renamed from: a */
    private final byte[] f13676a;

    /* renamed from: b */
    private Uri f13677b;

    /* renamed from: c */
    private int f13678c;

    /* renamed from: d */
    private int f13679d;

    public C2151rl(byte[] bArr) {
        Objects.requireNonNull(bArr);
        C1856jm.m11728c(bArr.length > 0);
        this.f13676a = bArr;
    }

    /* renamed from: c */
    public final Uri mo5934c() {
        return this.f13677b;
    }

    /* renamed from: d */
    public final int mo5935d(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f13679d;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.f13676a, this.f13678c, bArr, i, min);
        this.f13678c += min;
        this.f13679d -= min;
        return min;
    }

    /* renamed from: e */
    public final long mo5936e(C2299vl vlVar) {
        this.f13677b = vlVar.f16339a;
        long j = vlVar.f16341c;
        int i = (int) j;
        this.f13678c = i;
        long j2 = vlVar.f16342d;
        int length = (int) (j2 == -1 ? ((long) this.f13676a.length) - j : j2);
        this.f13679d = length;
        if (length > 0 && i + length <= this.f13676a.length) {
            return (long) length;
        }
        int length2 = this.f13676a.length;
        StringBuilder sb = new StringBuilder(77);
        sb.append("Unsatisfiable range: [");
        sb.append(i);
        sb.append(", ");
        sb.append(j2);
        sb.append("], length: ");
        sb.append(length2);
        throw new IOException(sb.toString());
    }

    /* renamed from: g */
    public final void mo5937g() {
        this.f13677b = null;
    }
}
