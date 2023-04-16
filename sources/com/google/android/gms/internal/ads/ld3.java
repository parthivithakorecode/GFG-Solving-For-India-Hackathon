package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.kr3;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class ld3<KeyProtoT extends kr3> {

    /* renamed from: a */
    private final Class<KeyProtoT> f10012a;

    /* renamed from: b */
    private final Map<Class<?>, kd3<?, KeyProtoT>> f10013b;

    /* renamed from: c */
    private final Class<?> f10014c;

    @SafeVarargs
    protected ld3(Class<KeyProtoT> cls, kd3<?, KeyProtoT>... kd3Arr) {
        this.f10012a = cls;
        HashMap hashMap = new HashMap();
        int i = 0;
        while (i <= 0) {
            kd3<?, KeyProtoT> kd3 = kd3Arr[i];
            if (hashMap.containsKey(kd3.mo8657a())) {
                String valueOf = String.valueOf(kd3.mo8657a().getCanonicalName());
                throw new IllegalArgumentException(valueOf.length() != 0 ? "KeyTypeManager constructed with duplicate factories for primitive ".concat(valueOf) : new String("KeyTypeManager constructed with duplicate factories for primitive "));
            } else {
                hashMap.put(kd3.mo8657a(), kd3);
                i++;
            }
        }
        this.f10014c = kd3Arr[0].mo8657a();
        this.f10013b = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public jd3<?, KeyProtoT> mo5279a() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    /* renamed from: b */
    public abstract KeyProtoT mo5280b(uo3 uo3);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Class<?> mo8930c() {
        return this.f10014c;
    }

    /* renamed from: d */
    public final Class<KeyProtoT> mo8931d() {
        return this.f10012a;
    }

    /* renamed from: e */
    public final <P> P mo8932e(KeyProtoT keyprotot, Class<P> cls) {
        kd3 kd3 = this.f10013b.get(cls);
        if (kd3 != null) {
            return kd3.mo5851b(keyprotot);
        }
        String canonicalName = cls.getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41);
        sb.append("Requested primitive class ");
        sb.append(canonicalName);
        sb.append(" not supported.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: f */
    public abstract String mo5281f();

    /* renamed from: g */
    public final Set<Class<?>> mo8933g() {
        return this.f10013b.keySet();
    }

    /* renamed from: h */
    public abstract void mo5282h(KeyProtoT keyprotot);

    /* renamed from: i */
    public int mo8934i() {
        return 1;
    }

    /* renamed from: j */
    public abstract int mo5283j();
}
