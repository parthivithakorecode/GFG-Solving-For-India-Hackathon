package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.v6 */
final class C2284v6 extends FilterInputStream {

    /* renamed from: f */
    private final long f15919f;

    /* renamed from: g */
    private long f15920g;

    C2284v6(InputStream inputStream, long j) {
        super(inputStream);
        this.f15919f = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final long mo11406d() {
        return this.f15919f - this.f15920g;
    }

    public final int read() {
        int read = super.read();
        if (read != -1) {
            this.f15920g++;
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            this.f15920g += (long) read;
        }
        return read;
    }
}
