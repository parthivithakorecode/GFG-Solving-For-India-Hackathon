package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;

final class zd3 implements ce3 {

    /* renamed from: a */
    final /* synthetic */ ld3 f18167a;

    zd3(ld3 ld3) {
        this.f18167a = ld3;
    }

    /* renamed from: a */
    public final dd3<?> mo5249a() {
        ld3 ld3 = this.f18167a;
        return new fd3(ld3, ld3.mo8930c());
    }

    /* renamed from: b */
    public final Set<Class<?>> mo5250b() {
        return this.f18167a.mo8933g();
    }

    /* renamed from: c */
    public final Class<?> mo5251c() {
        return this.f18167a.getClass();
    }

    /* renamed from: d */
    public final <Q> dd3<Q> mo5252d(Class<Q> cls) {
        try {
            return new fd3(this.f18167a, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    /* renamed from: g */
    public final Class<?> mo5253g() {
        return null;
    }
}
