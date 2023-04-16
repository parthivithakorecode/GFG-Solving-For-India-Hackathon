package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.kr3;
import java.security.GeneralSecurityException;

class fd3<PrimitiveT, KeyProtoT extends kr3> implements dd3<PrimitiveT> {

    /* renamed from: a */
    private final ld3<KeyProtoT> f6802a;

    /* renamed from: b */
    private final Class<PrimitiveT> f6803b;

    public fd3(ld3<KeyProtoT> ld3, Class<PrimitiveT> cls) {
        if (ld3.mo8933g().contains(cls) || Void.class.equals(cls)) {
            this.f6802a = ld3;
            this.f6803b = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[]{ld3.toString(), cls.getName()}));
    }

    /* renamed from: g */
    private final ed3<?, KeyProtoT> m9112g() {
        return new ed3<>(this.f6802a.mo5279a());
    }

    /* renamed from: h */
    private final PrimitiveT m9113h(KeyProtoT keyprotot) {
        if (!Void.class.equals(this.f6803b)) {
            this.f6802a.mo5282h(keyprotot);
            return this.f6802a.mo8932e(keyprotot, this.f6803b);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    /* renamed from: a */
    public final kr3 mo6447a(uo3 uo3) {
        try {
            return m9112g().mo6905a(uo3);
        } catch (mq3 e) {
            String name = this.f6802a.mo5279a().mo8450b().getName();
            throw new GeneralSecurityException(name.length() != 0 ? "Failures parsing proto of type ".concat(name) : new String("Failures parsing proto of type "), e);
        }
    }

    /* renamed from: b */
    public final PrimitiveT mo6448b(kr3 kr3) {
        String name = this.f6802a.mo8931d().getName();
        String concat = name.length() != 0 ? "Expected proto of type ".concat(name) : new String("Expected proto of type ");
        if (this.f6802a.mo8931d().isInstance(kr3)) {
            return m9113h(kr3);
        }
        throw new GeneralSecurityException(concat);
    }

    /* renamed from: c */
    public final Class<PrimitiveT> mo6449c() {
        return this.f6803b;
    }

    /* renamed from: d */
    public final String mo6450d() {
        return this.f6802a.mo5281f();
    }

    /* renamed from: e */
    public final qk3 mo6451e(uo3 uo3) {
        try {
            kr3 a = m9112g().mo6905a(uo3);
            pk3 F = qk3.m15685F();
            F.mo10081r(this.f6802a.mo5281f());
            F.mo10082s(a.mo5902e());
            F.mo10083t(this.f6802a.mo5283j());
            return (qk3) F.mo11894o();
        } catch (mq3 e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    /* renamed from: f */
    public final PrimitiveT mo6452f(uo3 uo3) {
        try {
            return m9113h(this.f6802a.mo5280b(uo3));
        } catch (mq3 e) {
            String name = this.f6802a.mo8931d().getName();
            throw new GeneralSecurityException(name.length() != 0 ? "Failures parsing proto of type ".concat(name) : new String("Failures parsing proto of type "), e);
        }
    }
}
