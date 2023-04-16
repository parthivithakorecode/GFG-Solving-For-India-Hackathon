package com.google.android.gms.internal.ads;

final class mo3 extends qo3 {

    /* renamed from: k */
    private final int f10980k;

    /* renamed from: l */
    private final int f10981l;

    mo3(byte[] bArr, int i, int i2) {
        super(bArr);
        uo3.m17965C(i, i + i2, bArr.length);
        this.f10980k = i;
        this.f10981l = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public final int mo9344P() {
        return this.f10980k;
    }

    /* renamed from: m */
    public final byte mo6625m(int i) {
        uo3.m17973i(i, this.f10981l);
        return this.f13255j[this.f10980k + i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final byte mo6626n(int i) {
        return this.f13255j[this.f10980k + i];
    }

    /* renamed from: p */
    public final int mo6627p() {
        return this.f10981l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo6628q(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f13255j, this.f10980k + i, bArr, i2, i3);
    }
}
