package com.google.android.gms.internal.ads;

public final class zn3 {

    /* renamed from: a */
    private final byte[] f18298a = new byte[256];

    /* renamed from: b */
    private int f18299b;

    /* renamed from: c */
    private int f18300c;

    public zn3(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.f18298a[i] = (byte) i;
        }
        byte b = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            byte[] bArr2 = this.f18298a;
            byte b2 = bArr2[i2];
            b = (b + b2 + bArr[i2 % bArr.length]) & 255;
            bArr2[i2] = bArr2[b];
            bArr2[b] = b2;
        }
        this.f18299b = 0;
        this.f18300c = 0;
    }

    /* renamed from: a */
    public final void mo12248a(byte[] bArr) {
        int i = this.f18299b;
        int i2 = this.f18300c;
        for (int i3 = 0; i3 < 256; i3++) {
            i = (i + 1) & 255;
            byte[] bArr2 = this.f18298a;
            byte b = bArr2[i];
            i2 = (i2 + b) & 255;
            bArr2[i] = bArr2[i2];
            bArr2[i2] = b;
            bArr[i3] = (byte) (bArr2[(bArr2[i] + b) & 255] ^ bArr[i3]);
        }
        this.f18299b = i;
        this.f18300c = i2;
    }
}
