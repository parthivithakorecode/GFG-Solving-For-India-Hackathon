package p101n5;

import android.media.MediaDataSource;
import kotlin.jvm.internal.C3357i;

/* renamed from: n5.f */
public final class C3795f extends MediaDataSource {

    /* renamed from: f */
    private final byte[] f21717f;

    public C3795f(byte[] bArr) {
        C3357i.m24508e(bArr, "data");
        this.f21717f = bArr;
    }

    /* renamed from: d */
    private final int m25647d(int i, long j) {
        long j2 = (long) i;
        long j3 = j + j2;
        byte[] bArr = this.f21717f;
        if (j3 > ((long) bArr.length)) {
            j2 -= j3 - ((long) bArr.length);
        }
        return (int) j2;
    }

    public synchronized void close() {
    }

    public synchronized long getSize() {
        return (long) this.f21717f.length;
    }

    public synchronized int readAt(long j, byte[] bArr, int i, int i2) {
        C3357i.m24508e(bArr, "buffer");
        if (j >= ((long) this.f21717f.length)) {
            return -1;
        }
        int d = m25647d(i2, j);
        System.arraycopy(this.f21717f, (int) j, bArr, i, d);
        return d;
    }
}
