package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.t7 */
public final class C2211t7 extends qu3 {

    /* renamed from: p */
    ByteBuffer f14771p;

    public C2211t7(String str) {
        super(str);
    }

    /* renamed from: b */
    public final void mo10398b(ByteBuffer byteBuffer) {
        this.f14771p = byteBuffer;
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
