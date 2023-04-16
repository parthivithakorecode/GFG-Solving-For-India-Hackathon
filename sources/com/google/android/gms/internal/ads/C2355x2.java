package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.x2 */
final class C2355x2 {

    /* renamed from: e */
    private static final byte[] f16992e = {0, 0, 1};

    /* renamed from: a */
    private boolean f16993a;

    /* renamed from: b */
    public int f16994b;

    /* renamed from: c */
    public int f16995c;

    /* renamed from: d */
    public byte[] f16996d = new byte[128];

    public C2355x2(int i) {
    }

    /* renamed from: a */
    public final void mo11760a(byte[] bArr, int i, int i2) {
        if (this.f16993a) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f16996d;
            int length = bArr2.length;
            int i4 = this.f16994b + i3;
            if (length < i4) {
                this.f16996d = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.f16996d, this.f16994b, i3);
            this.f16994b += i3;
        }
    }

    /* renamed from: b */
    public final void mo11761b() {
        this.f16993a = false;
        this.f16994b = 0;
        this.f16995c = 0;
    }

    /* renamed from: c */
    public final boolean mo11762c(int i, int i2) {
        if (this.f16993a) {
            int i3 = this.f16994b - i2;
            this.f16994b = i3;
            if (this.f16995c == 0 && i == 181) {
                this.f16995c = i3;
            } else {
                this.f16993a = false;
                return true;
            }
        } else if (i == 179) {
            this.f16993a = true;
        }
        mo11760a(f16992e, 0, 3);
        return false;
    }
}
