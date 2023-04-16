package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public abstract class tu3 extends qu3 {

    /* renamed from: p */
    private int f15051p;

    protected tu3(String str) {
        super("mvhd");
    }

    /* renamed from: e */
    public final int mo11119e() {
        if (!this.f13317h) {
            mo10399c();
        }
        return this.f15051p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final long mo11120f(ByteBuffer byteBuffer) {
        this.f15051p = C2026o7.m14343c(byteBuffer.get());
        C2026o7.m14344d(byteBuffer);
        byteBuffer.get();
        return 4;
    }
}
