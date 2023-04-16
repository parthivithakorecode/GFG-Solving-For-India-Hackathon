package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Objects;

public final class b94 extends eb1 {

    /* renamed from: e */
    private final byte[] f4801e;

    /* renamed from: f */
    private Uri f4802f;

    /* renamed from: g */
    private int f4803g;

    /* renamed from: h */
    private int f4804h;

    /* renamed from: i */
    private boolean f4805i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b94(byte[] bArr) {
        super(false);
        boolean z = false;
        Objects.requireNonNull(bArr);
        wu1.m19205d(bArr.length > 0 ? true : z);
        this.f4801e = bArr;
    }

    /* renamed from: a */
    public final int mo5752a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f4804h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.f4801e, this.f4803g, bArr, i, min);
        this.f4803g += min;
        this.f4804h -= min;
        mo6893o(min);
        return min;
    }

    /* renamed from: h */
    public final Uri mo5753h() {
        return this.f4802f;
    }

    /* renamed from: i */
    public final void mo5754i() {
        if (this.f4805i) {
            this.f4805i = false;
            mo6894p();
        }
        this.f4802f = null;
    }

    /* renamed from: k */
    public final long mo5755k(li1 li1) {
        this.f4802f = li1.f10058a;
        mo6895q(li1);
        long j = li1.f10063f;
        int length = this.f4801e.length;
        if (j <= ((long) length)) {
            int i = (int) j;
            this.f4803g = i;
            int i2 = length - i;
            this.f4804h = i2;
            long j2 = li1.f10064g;
            if (j2 != -1) {
                this.f4804h = (int) Math.min((long) i2, j2);
            }
            this.f4805i = true;
            mo6896r(li1);
            long j3 = li1.f10064g;
            return j3 != -1 ? j3 : (long) this.f4804h;
        }
        throw new if1(2008);
    }
}
