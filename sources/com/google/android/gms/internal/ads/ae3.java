package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;

final class ae3 implements ce3 {

    /* renamed from: a */
    final /* synthetic */ xd3 f4080a;

    /* renamed from: b */
    final /* synthetic */ ld3 f4081b;

    ae3(xd3 xd3, ld3 ld3) {
        this.f4080a = xd3;
        this.f4081b = ld3;
    }

    /* renamed from: a */
    public final dd3<?> mo5249a() {
        xd3 xd3 = this.f4080a;
        return new wd3(xd3, this.f4081b, xd3.mo8930c());
    }

    /* renamed from: b */
    public final Set<Class<?>> mo5250b() {
        return this.f4080a.mo8933g();
    }

    /* renamed from: c */
    public final Class<?> mo5251c() {
        return this.f4080a.getClass();
    }

    /* renamed from: d */
    public final <Q> dd3<Q> mo5252d(Class<Q> cls) {
        try {
            return new wd3(this.f4080a, this.f4081b, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    /* renamed from: g */
    public final Class<?> mo5253g() {
        return this.f4081b.getClass();
    }
}
