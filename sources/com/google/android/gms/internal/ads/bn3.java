package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;

public final class bn3 implements wc3 {

    /* renamed from: a */
    private final mn3 f4985a;

    /* renamed from: b */
    private final pd3 f4986b;

    public bn3(mn3 mn3, pd3 pd3, int i) {
        this.f4985a = mn3;
        this.f4986b = pd3;
    }

    /* renamed from: a */
    public final byte[] mo5895a(byte[] bArr, byte[] bArr2) {
        byte[] a = this.f4985a.mo7661a(bArr);
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(0).array(), 8);
        return pm3.m15167b(a, this.f4986b.mo10038a(pm3.m15167b(bArr2, a, copyOf)));
    }
}
