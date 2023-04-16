package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.m3 */
final class C1948m3 {

    /* renamed from: a */
    private final int f10700a;

    /* renamed from: b */
    private boolean f10701b;

    /* renamed from: c */
    private boolean f10702c;

    /* renamed from: d */
    public byte[] f10703d;

    /* renamed from: e */
    public int f10704e;

    public C1948m3(int i, int i2) {
        this.f10700a = i;
        byte[] bArr = new byte[131];
        this.f10703d = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public final void mo9116a(byte[] bArr, int i, int i2) {
        if (this.f10701b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f10703d;
            int length = bArr2.length;
            int i4 = this.f10704e + i3;
            if (length < i4) {
                this.f10703d = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.f10703d, this.f10704e, i3);
            this.f10704e += i3;
        }
    }

    /* renamed from: b */
    public final void mo9117b() {
        this.f10701b = false;
        this.f10702c = false;
    }

    /* renamed from: c */
    public final void mo9118c(int i) {
        boolean z = true;
        wu1.m19207f(!this.f10701b);
        if (i != this.f10700a) {
            z = false;
        }
        this.f10701b = z;
        if (z) {
            this.f10704e = 3;
            this.f10702c = false;
        }
    }

    /* renamed from: d */
    public final boolean mo9119d(int i) {
        if (!this.f10701b) {
            return false;
        }
        this.f10704e -= i;
        this.f10701b = false;
        this.f10702c = true;
        return true;
    }

    /* renamed from: e */
    public final boolean mo9120e() {
        return this.f10702c;
    }
}
