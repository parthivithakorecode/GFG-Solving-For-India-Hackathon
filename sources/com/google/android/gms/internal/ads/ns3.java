package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

final class ns3 implements Iterator<Map.Entry> {

    /* renamed from: f */
    private int f11680f = -1;

    /* renamed from: g */
    private boolean f11681g;

    /* renamed from: h */
    private Iterator<Map.Entry> f11682h;

    /* renamed from: i */
    final /* synthetic */ ss3 f11683i;

    /* synthetic */ ns3(ss3 ss3, ms3 ms3) {
        this.f11683i = ss3;
    }

    /* renamed from: a */
    private final Iterator<Map.Entry> m14100a() {
        if (this.f11682h == null) {
            this.f11682h = this.f11683i.f14578h.entrySet().iterator();
        }
        return this.f11682h;
    }

    public final boolean hasNext() {
        if (this.f11680f + 1 < this.f11683i.f14577g.size()) {
            return true;
        }
        if (!this.f11683i.f14578h.isEmpty()) {
            return m14100a().hasNext();
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.f11681g = true;
        int i = this.f11680f + 1;
        this.f11680f = i;
        return (Map.Entry) (i < this.f11683i.f14577g.size() ? this.f11683i.f14577g.get(this.f11680f) : m14100a().next());
    }

    public final void remove() {
        if (this.f11681g) {
            this.f11681g = false;
            this.f11683i.m16965n();
            if (this.f11680f < this.f11683i.f14577g.size()) {
                ss3 ss3 = this.f11683i;
                int i = this.f11680f;
                this.f11680f = i - 1;
                Object unused = ss3.m16963l(i);
                return;
            }
            m14100a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
