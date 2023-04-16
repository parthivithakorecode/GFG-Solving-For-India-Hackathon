package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class md3 {

    /* renamed from: a */
    private final bl3 f10816a;

    private md3(bl3 bl3) {
        this.f10816a = bl3;
    }

    /* renamed from: a */
    static final md3 m13185a(bl3 bl3) {
        if (bl3 != null && bl3.mo5879F() > 0) {
            return new md3(bl3);
        }
        throw new GeneralSecurityException("empty keyset");
    }

    /* renamed from: b */
    public final <P> P mo9186b(Class<P> cls) {
        Class<?> e = ee3.m8521e(cls);
        if (e == null) {
            String name = cls.getName();
            throw new GeneralSecurityException(name.length() != 0 ? "No wrapper found for ".concat(name) : new String("No wrapper found for "));
        }
        fe3.m9147b(this.f10816a);
        ud3<P> c = ud3.m17856c(e);
        for (al3 next : this.f10816a.mo5881J()) {
            if (next.mo5316J() == 3) {
                rd3<P> a = c.mo11204a(ee3.m8522f(next.mo5314G(), e), next);
                if (next.mo5313F() == this.f10816a.mo5880G()) {
                    c.mo11207e(a);
                }
            }
        }
        return ee3.m8525i(c, cls);
    }

    public final String toString() {
        return fe3.m9146a(this.f10816a).toString();
    }
}
