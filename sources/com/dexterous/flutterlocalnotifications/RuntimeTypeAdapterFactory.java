package com.dexterous.flutterlocalnotifications;

import androidx.annotation.Keep;
import java.util.LinkedHashMap;
import java.util.Map;
import p021c3.C1439a;
import p028d3.C2488a;
import p028d3.C2491c;
import p149v2.C4203e;
import p149v2.C4215k;
import p149v2.C4218n;
import p149v2.C4219o;
import p149v2.C4220p;
import p149v2.C4233w;
import p149v2.C4235x;
import p161x2.C4341l;

@Keep
public final class RuntimeTypeAdapterFactory<T> implements C4235x {
    /* access modifiers changed from: private */
    public final Class<?> baseType;
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap();
    /* access modifiers changed from: private */
    public final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap();
    /* access modifiers changed from: private */
    public final String typeFieldName;

    /* renamed from: com.dexterous.flutterlocalnotifications.RuntimeTypeAdapterFactory$a */
    class C1450a extends C4233w<R> {

        /* renamed from: a */
        final /* synthetic */ Map f3671a;

        /* renamed from: b */
        final /* synthetic */ Map f3672b;

        C1450a(Map map, Map map2) {
            this.f3671a = map;
            this.f3672b = map2;
        }

        /* renamed from: c */
        public R mo4624c(C2488a aVar) {
            C4215k a = C4341l.m26964a(aVar);
            C4215k s = a.mo15750i().mo15764s(RuntimeTypeAdapterFactory.this.typeFieldName);
            if (s != null) {
                String k = s.mo15746k();
                C4233w wVar = (C4233w) this.f3671a.get(k);
                if (wVar != null) {
                    return wVar.mo15779a(a);
                }
                throw new C4219o("cannot deserialize " + RuntimeTypeAdapterFactory.this.baseType + " subtype named " + k + "; did you forget to register a subtype?");
            }
            throw new C4219o("cannot deserialize " + RuntimeTypeAdapterFactory.this.baseType + " because it does not define a field named " + RuntimeTypeAdapterFactory.this.typeFieldName);
        }

        /* renamed from: e */
        public void mo4625e(C2491c cVar, R r) {
            Class<?> cls = r.getClass();
            String str = (String) RuntimeTypeAdapterFactory.this.subtypeToLabel.get(cls);
            C4233w wVar = (C4233w) this.f3672b.get(cls);
            if (wVar != null) {
                C4218n i = wVar.mo15781d(r).mo15750i();
                if (!i.mo15763r(RuntimeTypeAdapterFactory.this.typeFieldName)) {
                    C4218n nVar = new C4218n();
                    nVar.mo15761p(RuntimeTypeAdapterFactory.this.typeFieldName, new C4220p(str));
                    for (Map.Entry next : i.mo15762q()) {
                        nVar.mo15761p((String) next.getKey(), (C4215k) next.getValue());
                    }
                    C4341l.m26965b(nVar, cVar);
                    return;
                }
                throw new C4219o("cannot serialize " + cls.getName() + " because it already defines a field named " + RuntimeTypeAdapterFactory.this.typeFieldName);
            }
            throw new C4219o("cannot serialize " + cls.getName() + "; did you forget to register a subtype?");
        }
    }

    private RuntimeTypeAdapterFactory(Class<?> cls, String str) {
        if (str == null || cls == null) {
            throw null;
        }
        this.baseType = cls;
        this.typeFieldName = str;
    }

    /* renamed from: of */
    public static <T> RuntimeTypeAdapterFactory<T> m5645of(Class<T> cls) {
        return new RuntimeTypeAdapterFactory<>(cls, "type");
    }

    /* renamed from: of */
    public static <T> RuntimeTypeAdapterFactory<T> m5646of(Class<T> cls, String str) {
        return new RuntimeTypeAdapterFactory<>(cls, str);
    }

    public <R> C4233w<R> create(C4203e eVar, C1439a<R> aVar) {
        if (aVar.mo4848c() != this.baseType) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry next : this.labelToSubtype.entrySet()) {
            C4233w l = eVar.mo15718l(this, C1439a.m5626a((Class) next.getValue()));
            linkedHashMap.put((String) next.getKey(), l);
            linkedHashMap2.put((Class) next.getValue(), l);
        }
        return new C1450a(linkedHashMap, linkedHashMap2).mo15780b();
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls) {
        return registerSubtype(cls, cls.getSimpleName());
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls, String str) {
        if (cls == null || str == null) {
            throw null;
        } else if (this.subtypeToLabel.containsKey(cls) || this.labelToSubtype.containsKey(str)) {
            throw new IllegalArgumentException("types and labels must be unique");
        } else {
            this.labelToSubtype.put(str, cls);
            this.subtypeToLabel.put(cls, str);
            return this;
        }
    }
}
