package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.google.android.gms.internal.ads.y4 */
final class C2394y4 implements C2431z4 {

    /* renamed from: a */
    private final ByteBuffer f17591a;

    public C2394y4(ByteBuffer byteBuffer) {
        this.f17591a = byteBuffer.slice();
    }

    /* renamed from: a */
    public final void mo5086a(MessageDigest[] messageDigestArr, long j, int i) {
        ByteBuffer slice;
        synchronized (this.f17591a) {
            int i2 = (int) j;
            this.f17591a.position(i2);
            this.f17591a.limit(i2 + i);
            slice = this.f17591a.slice();
        }
        for (MessageDigest update : messageDigestArr) {
            slice.position(0);
            update.update(slice);
        }
    }

    public final long zza() {
        return (long) this.f17591a.capacity();
    }
}
