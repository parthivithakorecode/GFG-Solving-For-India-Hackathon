package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rm */
public final class C2152rm {

    /* renamed from: a */
    public byte[] f13709a;

    /* renamed from: b */
    private int f13710b;

    /* renamed from: c */
    private int f13711c;

    public C2152rm() {
    }

    public C2152rm(int i) {
        this.f13709a = new byte[i];
        this.f13711c = i;
    }

    public C2152rm(byte[] bArr) {
        this.f13709a = bArr;
        this.f13711c = bArr.length;
    }

    /* renamed from: a */
    public final int mo10531a() {
        return this.f13711c - this.f13710b;
    }

    /* renamed from: b */
    public final int mo10532b() {
        byte[] bArr = this.f13709a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    /* renamed from: c */
    public final int mo10533c() {
        return this.f13710b;
    }

    /* renamed from: d */
    public final int mo10534d() {
        return this.f13711c;
    }

    /* renamed from: e */
    public final int mo10535e() {
        byte[] bArr = this.f13709a;
        int i = this.f13710b;
        int i2 = i + 1;
        this.f13710b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f13710b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f13710b = i4;
        byte b3 = bArr[i3];
        this.f13710b = i4 + 1;
        return (bArr[i4] & 255) | ((b & 255) << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
    }

    /* renamed from: f */
    public final int mo10536f() {
        byte[] bArr = this.f13709a;
        int i = this.f13710b;
        int i2 = i + 1;
        this.f13710b = i2;
        byte b = bArr[i];
        this.f13710b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (b & 255);
    }

    /* renamed from: g */
    public final int mo10537g() {
        byte[] bArr = this.f13709a;
        int i = this.f13710b;
        this.f13710b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: h */
    public final int mo10538h() {
        byte[] bArr = this.f13709a;
        int i = this.f13710b;
        int i2 = i + 1;
        this.f13710b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f13710b = i3;
        byte b2 = bArr[i2];
        this.f13710b = i3 + 2;
        return (b2 & 255) | ((b & 255) << 8);
    }

    /* renamed from: i */
    public final int mo10539i() {
        int e = mo10535e();
        if (e >= 0) {
            return e;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(e);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: j */
    public final int mo10540j() {
        byte[] bArr = this.f13709a;
        int i = this.f13710b;
        int i2 = i + 1;
        this.f13710b = i2;
        byte b = bArr[i];
        this.f13710b = i2 + 1;
        return (bArr[i2] & 255) | ((b & 255) << 8);
    }

    /* renamed from: k */
    public final long mo10541k() {
        byte[] bArr = this.f13709a;
        int i = this.f13710b;
        int i2 = i + 1;
        this.f13710b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f13710b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f13710b = i4;
        byte b3 = bArr[i3];
        this.f13710b = i4 + 1;
        return ((((long) b2) & 255) << 8) | (((long) b) & 255) | ((((long) b3) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24);
    }

    /* renamed from: l */
    public final long mo10542l() {
        byte[] bArr = this.f13709a;
        int i = this.f13710b;
        int i2 = i + 1;
        this.f13710b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f13710b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f13710b = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        this.f13710b = i5;
        byte b4 = bArr[i4];
        int i6 = i5 + 1;
        this.f13710b = i6;
        byte b5 = bArr[i5];
        int i7 = i6 + 1;
        this.f13710b = i7;
        byte b6 = bArr[i6];
        int i8 = i7 + 1;
        this.f13710b = i8;
        byte b7 = bArr[i7];
        this.f13710b = i8 + 1;
        return ((((long) b2) & 255) << 48) | ((((long) b) & 255) << 56) | ((((long) b3) & 255) << 40) | ((((long) b4) & 255) << 32) | ((((long) b5) & 255) << 24) | ((((long) b6) & 255) << 16) | ((((long) b7) & 255) << 8) | (((long) bArr[i8]) & 255);
    }

    /* renamed from: m */
    public final long mo10543m() {
        byte[] bArr = this.f13709a;
        int i = this.f13710b;
        int i2 = i + 1;
        this.f13710b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f13710b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f13710b = i4;
        byte b3 = bArr[i3];
        this.f13710b = i4 + 1;
        return ((((long) b2) & 255) << 16) | ((((long) b) & 255) << 24) | ((((long) b3) & 255) << 8) | (((long) bArr[i4]) & 255);
    }

    /* renamed from: n */
    public final long mo10544n() {
        long l = mo10542l();
        if (l >= 0) {
            return l;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(l);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: o */
    public final String mo10545o(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f13710b;
        int i3 = (i2 + i) - 1;
        String str = new String(this.f13709a, i2, (i3 >= this.f13711c || this.f13709a[i3] != 0) ? i : i - 1);
        this.f13710b += i;
        return str;
    }

    /* renamed from: p */
    public final short mo10546p() {
        byte[] bArr = this.f13709a;
        int i = this.f13710b;
        int i2 = i + 1;
        this.f13710b = i2;
        byte b = bArr[i];
        this.f13710b = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((b & 255) << 8));
    }

    /* renamed from: q */
    public final void mo10547q(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f13709a, this.f13710b, bArr, i, i2);
        this.f13710b += i2;
    }

    /* renamed from: r */
    public final void mo10548r() {
        this.f13710b = 0;
        this.f13711c = 0;
    }

    /* renamed from: s */
    public final void mo10549s(int i) {
        mo10550t(mo10532b() < i ? new byte[i] : this.f13709a, i);
    }

    /* renamed from: t */
    public final void mo10550t(byte[] bArr, int i) {
        this.f13709a = bArr;
        this.f13711c = i;
        this.f13710b = 0;
    }

    /* renamed from: u */
    public final void mo10551u(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f13709a.length) {
            z = true;
        }
        C1856jm.m11728c(z);
        this.f13711c = i;
    }

    /* renamed from: v */
    public final void mo10552v(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f13711c) {
            z = true;
        }
        C1856jm.m11728c(z);
        this.f13710b = i;
    }

    /* renamed from: w */
    public final void mo10553w(int i) {
        mo10552v(this.f13710b + i);
    }
}
