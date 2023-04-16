package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class hf3 implements wc3 {

    /* renamed from: c */
    private static final byte[] f8199c = new byte[0];

    /* renamed from: a */
    private final tk3 f8200a;

    /* renamed from: b */
    private final wc3 f8201b;

    public hf3(tk3 tk3, wc3 wc3) {
        this.f8200a = tk3;
        this.f8201b = wc3;
    }

    /* renamed from: a */
    public final byte[] mo5895a(byte[] bArr, byte[] bArr2) {
        byte[] b = ee3.m8520d(this.f8200a).mo5901b();
        byte[] a = this.f8201b.mo5895a(b, f8199c);
        byte[] a2 = ((wc3) ee3.m8524h(this.f8200a.mo11011J(), b, wc3.class)).mo5895a(bArr, bArr2);
        int length = a.length;
        return ByteBuffer.allocate(length + 4 + a2.length).putInt(length).put(a).put(a2).array();
    }
}
