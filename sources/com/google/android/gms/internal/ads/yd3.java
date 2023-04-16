package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

final class yd3 implements ce3 {

    /* renamed from: a */
    final /* synthetic */ dd3 f17687a;

    yd3(dd3 dd3) {
        this.f17687a = dd3;
    }

    /* renamed from: a */
    public final dd3<?> mo5249a() {
        return this.f17687a;
    }

    /* renamed from: b */
    public final Set<Class<?>> mo5250b() {
        return Collections.singleton(this.f17687a.mo6449c());
    }

    /* renamed from: c */
    public final Class<?> mo5251c() {
        return this.f17687a.getClass();
    }

    /* renamed from: d */
    public final <Q> dd3<Q> mo5252d(Class<Q> cls) {
        if (this.f17687a.mo6449c().equals(cls)) {
            return this.f17687a;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }

    /* renamed from: g */
    public final Class<?> mo5253g() {
        return null;
    }
}
