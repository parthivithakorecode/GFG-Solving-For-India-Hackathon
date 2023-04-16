package com.google.android.gms.internal.ads;

final class s43 extends x43 {

    /* renamed from: l */
    final /* synthetic */ t43 f14263l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    s43(t43 t43, z43 z43, CharSequence charSequence) {
        super(z43, charSequence);
        this.f14263l = t43;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo10723c(int i) {
        return i + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo10724d(int i) {
        b43 b43 = this.f14263l.f14711a;
        CharSequence charSequence = this.f17026h;
        int length = charSequence.length();
        q43.m15459b(i, length, "index");
        while (i < length) {
            if (b43.mo5085a(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
