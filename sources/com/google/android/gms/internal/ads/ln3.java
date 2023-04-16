package com.google.android.gms.internal.ads;

public final class ln3 {

    /* renamed from: a */
    private final byte[] f10105a;

    private ln3(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.f10105a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i2);
    }

    /* renamed from: a */
    public static ln3 m12798a(byte[] bArr, int i, int i2) {
        return new ln3(bArr, 0, i2);
    }

    /* renamed from: b */
    public final byte[] mo8979b() {
        byte[] bArr = this.f10105a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }
}
