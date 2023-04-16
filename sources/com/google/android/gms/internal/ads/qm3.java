package com.google.android.gms.internal.ads;

final class qm3 extends rm3 {
    qm3(byte[] bArr, int i) {
        super(bArr, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo10327b() {
        return 12;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int[] mo10328c(int[] iArr, int i) {
        int length = iArr.length;
        if (length == 3) {
            int[] iArr2 = new int[16];
            rm3.m16344g(iArr2, this.f13745a);
            iArr2[12] = i;
            System.arraycopy(iArr, 0, iArr2, 13, 3);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(length * 32)}));
    }
}
