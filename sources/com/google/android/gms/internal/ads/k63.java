package com.google.android.gms.internal.ads;

import java.util.Map;

final class k63 extends y53 {

    /* renamed from: f */
    private final Object f9411f;

    /* renamed from: g */
    private int f9412g;

    /* renamed from: h */
    final /* synthetic */ n63 f9413h;

    k63(n63 n63, int i) {
        this.f9413h = n63;
        this.f9411f = n63.m13746j(n63, i);
        this.f9412g = i;
    }

    /* renamed from: a */
    private final void m12031a() {
        int i = this.f9412g;
        if (i == -1 || i >= this.f9413h.size() || !m43.m13055a(this.f9411f, n63.m13746j(this.f9413h, this.f9412g))) {
            this.f9412g = this.f9413h.m13757z(this.f9411f);
        }
    }

    public final Object getKey() {
        return this.f9411f;
    }

    public final Object getValue() {
        Map o = this.f9413h.mo9444o();
        if (o != null) {
            return o.get(this.f9411f);
        }
        m12031a();
        int i = this.f9412g;
        if (i == -1) {
            return null;
        }
        return n63.m13749m(this.f9413h, i);
    }

    public final Object setValue(Object obj) {
        Map o = this.f9413h.mo9444o();
        if (o != null) {
            return o.put(this.f9411f, obj);
        }
        m12031a();
        int i = this.f9412g;
        if (i == -1) {
            this.f9413h.put(this.f9411f, obj);
            return null;
        }
        Object m = n63.m13749m(this.f9413h, i);
        n63.m13752q(this.f9413h, this.f9412g, obj);
        return m;
    }
}
