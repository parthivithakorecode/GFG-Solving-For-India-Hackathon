package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;

public final class ro3 extends OutputStream {

    /* renamed from: k */
    private static final byte[] f13788k = new byte[0];

    /* renamed from: f */
    private final int f13789f = 128;

    /* renamed from: g */
    private final ArrayList<uo3> f13790g = new ArrayList<>();

    /* renamed from: h */
    private int f13791h;

    /* renamed from: i */
    private byte[] f13792i = new byte[128];

    /* renamed from: j */
    private int f13793j;

    ro3(int i) {
    }

    /* renamed from: m */
    private final void m16377m(int i) {
        this.f13790g.add(new qo3(this.f13792i));
        int length = this.f13791h + this.f13792i.length;
        this.f13791h = length;
        this.f13792i = new byte[Math.max(this.f13789f, Math.max(i, length >>> 1))];
        this.f13793j = 0;
    }

    /* renamed from: d */
    public final synchronized int mo10629d() {
        return this.f13791h + this.f13793j;
    }

    /* renamed from: h */
    public final synchronized uo3 mo10630h() {
        int i = this.f13793j;
        byte[] bArr = this.f13792i;
        int length = bArr.length;
        if (i >= length) {
            this.f13790g.add(new qo3(bArr));
            this.f13792i = f13788k;
        } else if (i > 0) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(length, i));
            this.f13790g.add(new qo3(bArr2));
        }
        this.f13791h += this.f13793j;
        this.f13793j = 0;
        return uo3.m17967H(this.f13790g);
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(mo10629d())});
    }

    public final synchronized void write(int i) {
        if (this.f13793j == this.f13792i.length) {
            m16377m(1);
        }
        byte[] bArr = this.f13792i;
        int i2 = this.f13793j;
        this.f13793j = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.f13792i;
        int length = bArr2.length;
        int i3 = this.f13793j;
        int i4 = length - i3;
        if (i2 <= i4) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f13793j += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i4);
        int i5 = i2 - i4;
        m16377m(i5);
        System.arraycopy(bArr, i + i4, this.f13792i, 0, i5);
        this.f13793j = i5;
    }
}
