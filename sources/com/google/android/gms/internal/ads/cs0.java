package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

final class cs0 implements wu3 {

    /* renamed from: f */
    private final ByteBuffer f5506f;

    cs0(ByteBuffer byteBuffer) {
        this.f5506f = byteBuffer.duplicate();
    }

    /* renamed from: E */
    public final int mo6276E(ByteBuffer byteBuffer) {
        if (this.f5506f.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), this.f5506f.remaining());
        byte[] bArr = new byte[min];
        this.f5506f.get(bArr);
        byteBuffer.put(bArr);
        return min;
    }

    /* renamed from: K */
    public final ByteBuffer mo6277K(long j, long j2) {
        int position = this.f5506f.position();
        this.f5506f.position((int) j);
        ByteBuffer slice = this.f5506f.slice();
        slice.limit((int) j2);
        this.f5506f.position(position);
        return slice;
    }

    /* renamed from: a */
    public final long mo6278a() {
        return (long) this.f5506f.position();
    }

    /* renamed from: b */
    public final void mo6279b(long j) {
        this.f5506f.position((int) j);
    }

    /* renamed from: c */
    public final long mo6280c() {
        return (long) this.f5506f.limit();
    }

    public final void close() {
    }
}
