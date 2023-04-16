package com.google.android.gms.internal.ads;

public final class b50 {

    /* renamed from: a */
    private final w94 f4763a = new w94();

    /* renamed from: a */
    public final b50 mo5710a(int i) {
        this.f4763a.mo11623a(i);
        return this;
    }

    /* renamed from: b */
    public final b50 mo5711b(z60 z60) {
        w94 w94 = this.f4763a;
        yb4 a = z60.f18054a;
        for (int i = 0; i < a.mo11987b(); i++) {
            w94.mo11623a(a.mo11986a(i));
        }
        return this;
    }

    /* renamed from: c */
    public final b50 mo5712c(int... iArr) {
        w94 w94 = this.f4763a;
        for (int a : iArr) {
            w94.mo11623a(a);
        }
        return this;
    }

    /* renamed from: d */
    public final b50 mo5713d(int i, boolean z) {
        w94 w94 = this.f4763a;
        if (z) {
            w94.mo11623a(i);
        }
        return this;
    }

    /* renamed from: e */
    public final z60 mo5714e() {
        return new z60(this.f4763a.mo11624b(), (c60) null);
    }
}
