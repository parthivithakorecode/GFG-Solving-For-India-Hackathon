package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.HashMap;
import java.util.Objects;

public abstract class d54<T> extends v44 {

    /* renamed from: g */
    private final HashMap<T, c54<T>> f5652g = new HashMap<>();

    /* renamed from: h */
    private Handler f5653h;

    /* renamed from: i */
    private vt1 f5654i;

    protected d54() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo6385p() {
        for (c54 next : this.f5652g.values()) {
            next.f5311a.mo11392k(next.f5312b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo6386r() {
        for (c54 next : this.f5652g.values()) {
            next.f5311a.mo11388d(next.f5312b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo6387s(vt1 vt1) {
        this.f5654i = vt1;
        this.f5653h = n13.m13633f0((Handler.Callback) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo6388u() {
        for (c54 next : this.f5652g.values()) {
            next.f5311a.mo11385a(next.f5312b);
            next.f5311a.mo11390f(next.f5313c);
            next.f5311a.mo11389e(next.f5313c);
        }
        this.f5652g.clear();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract s54 mo6389w(T t, s54 s54);

    /* renamed from: x */
    public void mo6390x() {
        for (c54<T> c54 : this.f5652g.values()) {
            c54.f5311a.mo6390x();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract void mo6391y(T t, v54 v54, ei0 ei0);

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo6392z(T t, v54 v54) {
        wu1.m19205d(!this.f5652g.containsKey(t));
        a54 a54 = new a54(this, t);
        b54 b54 = new b54(this, t);
        this.f5652g.put(t, new c54(v54, a54, b54));
        Handler handler = this.f5653h;
        Objects.requireNonNull(handler);
        v54.mo11387c(handler, b54);
        Handler handler2 = this.f5653h;
        Objects.requireNonNull(handler2);
        v54.mo11386b(handler2, b54);
        v54.mo11391i(a54, this.f5654i);
        if (!mo11399v()) {
            v54.mo11392k(a54);
        }
    }
}
