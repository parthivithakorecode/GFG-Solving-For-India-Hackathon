package com.google.android.gms.internal.ads;

final class m54 extends h54 {

    /* renamed from: f */
    public static final Object f10739f = new Object();

    /* renamed from: d */
    private final Object f10740d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Object f10741e;

    private m54(ei0 ei0, Object obj, Object obj2) {
        super(ei0);
        this.f10740d = obj;
        this.f10741e = obj2;
    }

    /* renamed from: q */
    public static m54 m13063q(C2451zo zoVar) {
        return new m54(new n54(zoVar), hh0.f8221o, f10739f);
    }

    /* renamed from: r */
    public static m54 m13064r(ei0 ei0, Object obj, Object obj2) {
        return new m54(ei0, obj, obj2);
    }

    /* renamed from: a */
    public final int mo6954a(Object obj) {
        Object obj2;
        ei0 ei0 = this.f8054c;
        if (f10739f.equals(obj) && (obj2 = this.f10741e) != null) {
            obj = obj2;
        }
        return ei0.mo6954a(obj);
    }

    /* renamed from: d */
    public final pf0 mo6957d(int i, pf0 pf0, boolean z) {
        this.f8054c.mo6957d(i, pf0, z);
        if (n13.m13643p(pf0.f12645b, this.f10741e) && z) {
            pf0.f12645b = f10739f;
        }
        return pf0;
    }

    /* renamed from: e */
    public final hh0 mo6958e(int i, hh0 hh0, long j) {
        this.f8054c.mo6958e(i, hh0, j);
        if (n13.m13643p(hh0.f8225a, this.f10740d)) {
            hh0.f8225a = hh0.f8221o;
        }
        return hh0;
    }

    /* renamed from: f */
    public final Object mo6960f(int i) {
        Object f = this.f8054c.mo6960f(i);
        return n13.m13643p(f, this.f10741e) ? f10739f : f;
    }

    /* renamed from: p */
    public final m54 mo9136p(ei0 ei0) {
        return new m54(ei0, this.f10740d, this.f10741e);
    }
}
