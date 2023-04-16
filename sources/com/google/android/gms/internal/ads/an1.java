package com.google.android.gms.internal.ads;

import p102o.C3814g;

public final class an1 {

    /* renamed from: a */
    l50 f4253a;

    /* renamed from: b */
    i50 f4254b;

    /* renamed from: c */
    y50 f4255c;

    /* renamed from: d */
    v50 f4256d;

    /* renamed from: e */
    ba0 f4257e;

    /* renamed from: f */
    final C3814g<String, r50> f4258f = new C3814g<>();

    /* renamed from: g */
    final C3814g<String, o50> f4259g = new C3814g<>();

    /* renamed from: a */
    public final an1 mo5321a(i50 i50) {
        this.f4254b = i50;
        return this;
    }

    /* renamed from: b */
    public final an1 mo5322b(l50 l50) {
        this.f4253a = l50;
        return this;
    }

    /* renamed from: c */
    public final an1 mo5323c(String str, r50 r50, o50 o50) {
        this.f4258f.put(str, r50);
        if (o50 != null) {
            this.f4259g.put(str, o50);
        }
        return this;
    }

    /* renamed from: d */
    public final an1 mo5324d(ba0 ba0) {
        this.f4257e = ba0;
        return this;
    }

    /* renamed from: e */
    public final an1 mo5325e(v50 v50) {
        this.f4256d = v50;
        return this;
    }

    /* renamed from: f */
    public final an1 mo5326f(y50 y50) {
        this.f4255c = y50;
        return this;
    }

    /* renamed from: g */
    public final cn1 mo5327g() {
        return new cn1(this);
    }
}
