package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class ee3 {

    /* renamed from: a */
    private static final Logger f6184a = Logger.getLogger(ee3.class.getName());

    /* renamed from: b */
    private static final ConcurrentMap<String, ce3> f6185b = new ConcurrentHashMap();

    /* renamed from: c */
    private static final ConcurrentMap<String, be3> f6186c = new ConcurrentHashMap();

    /* renamed from: d */
    private static final ConcurrentMap<String, Boolean> f6187d = new ConcurrentHashMap();

    /* renamed from: e */
    private static final ConcurrentMap<String, xc3<?>> f6188e = new ConcurrentHashMap();

    /* renamed from: f */
    private static final ConcurrentMap<Class<?>, vd3<?, ?>> f6189f = new ConcurrentHashMap();

    /* renamed from: g */
    private static final ConcurrentMap<String, gd3> f6190g = new ConcurrentHashMap();

    private ee3() {
    }

    @Deprecated
    /* renamed from: a */
    public static xc3<?> m8517a(String str) {
        String str2;
        String str3;
        if (str != null) {
            ConcurrentMap<String, xc3<?>> concurrentMap = f6188e;
            Locale locale = Locale.US;
            xc3<?> xc3 = (xc3) concurrentMap.get(str.toLowerCase(locale));
            if (xc3 != null) {
                return xc3;
            }
            String format = String.format("no catalogue found for %s. ", new Object[]{str});
            if (str.toLowerCase(locale).startsWith("tinkaead")) {
                format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
            }
            if (str.toLowerCase(locale).startsWith("tinkdeterministicaead")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call DeterministicAeadConfig.register().";
            } else if (str.toLowerCase(locale).startsWith("tinkstreamingaead")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call StreamingAeadConfig.register().";
            } else if (str.toLowerCase(locale).startsWith("tinkhybriddecrypt") || str.toLowerCase(locale).startsWith("tinkhybridencrypt")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call HybridConfig.register().";
            } else if (str.toLowerCase(locale).startsWith("tinkmac")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call MacConfig.register().";
            } else if (str.toLowerCase(locale).startsWith("tinkpublickeysign") || str.toLowerCase(locale).startsWith("tinkpublickeyverify")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call SignatureConfig.register().";
            } else {
                if (str.toLowerCase(locale).startsWith("tink")) {
                    str2 = String.valueOf(format);
                    str3 = "Maybe call TinkConfig.register().";
                }
                throw new GeneralSecurityException(format);
            }
            format = str2.concat(str3);
            throw new GeneralSecurityException(format);
        }
        throw new IllegalArgumentException("catalogueName must be non-null.");
    }

    /* renamed from: b */
    public static dd3<?> m8518b(String str) {
        return m8532p(str).mo5249a();
    }

    /* renamed from: c */
    public static synchronized qk3 m8519c(tk3 tk3) {
        qk3 e;
        synchronized (ee3.class) {
            dd3<?> b = m8518b(tk3.mo11011J());
            if (((Boolean) f6187d.get(tk3.mo11011J())).booleanValue()) {
                e = b.mo6451e(tk3.mo11010I());
            } else {
                String valueOf = String.valueOf(tk3.mo11011J());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return e;
    }

    /* renamed from: d */
    public static synchronized kr3 m8520d(tk3 tk3) {
        kr3 a;
        synchronized (ee3.class) {
            dd3<?> b = m8518b(tk3.mo11011J());
            if (((Boolean) f6187d.get(tk3.mo11011J())).booleanValue()) {
                a = b.mo6447a(tk3.mo11010I());
            } else {
                String valueOf = String.valueOf(tk3.mo11011J());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return a;
    }

    /* renamed from: e */
    public static Class<?> m8521e(Class<?> cls) {
        vd3 vd3 = (vd3) f6189f.get(cls);
        if (vd3 == null) {
            return null;
        }
        return vd3.zza();
    }

    /* renamed from: f */
    public static <P> P m8522f(qk3 qk3, Class<P> cls) {
        return m8533q(qk3.mo10319J(), qk3.mo10318I(), cls);
    }

    /* renamed from: g */
    public static <P> P m8523g(String str, kr3 kr3, Class<P> cls) {
        return m8531o(str, cls).mo6448b(kr3);
    }

    /* renamed from: h */
    public static <P> P m8524h(String str, byte[] bArr, Class<P> cls) {
        return m8533q(str, uo3.m17968I(bArr), cls);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.google.android.gms.internal.ads.ud3<B>, com.google.android.gms.internal.ads.ud3] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <B, P> P m8525i(com.google.android.gms.internal.ads.ud3<B> r4, java.lang.Class<P> r5) {
        /*
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, com.google.android.gms.internal.ads.vd3<?, ?>> r0 = f6189f
            java.lang.Object r5 = r0.get(r5)
            com.google.android.gms.internal.ads.vd3 r5 = (com.google.android.gms.internal.ads.vd3) r5
            if (r5 != 0) goto L_0x002a
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.Class r4 = r4.mo11206d()
            java.lang.String r4 = r4.getName()
            java.lang.String r0 = "No wrapper found for "
            int r1 = r4.length()
            if (r1 == 0) goto L_0x0021
            java.lang.String r4 = r0.concat(r4)
            goto L_0x0026
        L_0x0021:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r0)
        L_0x0026:
            r5.<init>(r4)
            throw r5
        L_0x002a:
            java.lang.Class r0 = r5.zza()
            java.lang.Class r1 = r4.mo11206d()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003d
            java.lang.Object r4 = r5.mo7341b(r4)
            return r4
        L_0x003d:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.Class r5 = r5.zza()
            java.lang.String r5 = r5.toString()
            java.lang.Class r4 = r4.mo11206d()
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r5.length()
            int r2 = r2 + 44
            int r3 = r4.length()
            int r2 = r2 + r3
            r1.<init>(r2)
            java.lang.String r2 = "Wrong input primitive class, expected "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = ", got "
            r1.append(r5)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ee3.m8525i(com.google.android.gms.internal.ads.ud3, java.lang.Class):java.lang.Object");
    }

    /* renamed from: j */
    static synchronized Map<String, gd3> m8526j() {
        Map<String, gd3> unmodifiableMap;
        synchronized (ee3.class) {
            unmodifiableMap = Collections.unmodifiableMap(f6190g);
        }
        return unmodifiableMap;
    }

    /* renamed from: k */
    public static synchronized <KeyProtoT extends kr3, PublicKeyProtoT extends kr3> void m8527k(xd3<KeyProtoT, PublicKeyProtoT> xd3, ld3<PublicKeyProtoT> ld3, boolean z) {
        Class<?> g;
        synchronized (ee3.class) {
            m8534r("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", xd3.getClass(), xd3.mo5279a().mo5270d(), true);
            m8534r("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", ld3.getClass(), Collections.emptyMap(), false);
            if (!qf3.m15611a(1)) {
                String valueOf = String.valueOf(xd3.getClass());
                StringBuilder sb = new StringBuilder(valueOf.length() + 61);
                sb.append("failed to register key manager ");
                sb.append(valueOf);
                sb.append(" as it is not FIPS compatible.");
                throw new GeneralSecurityException(sb.toString());
            } else if (qf3.m15611a(1)) {
                ConcurrentMap<String, ce3> concurrentMap = f6185b;
                if (concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey") && (g = ((ce3) concurrentMap.get("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")).mo5253g()) != null) {
                    if (!g.getName().equals(ld3.getClass().getName())) {
                        f6184a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey with inconsistent public key type type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
                        throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", new Object[]{xd3.getClass().getName(), g.getName(), ld3.getClass().getName()}));
                    }
                }
                if (!concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey") || ((ce3) concurrentMap.get("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")).mo5253g() == null) {
                    concurrentMap.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", new ae3(xd3, ld3));
                    f6186c.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", new be3(xd3));
                    m8535s("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", xd3.mo5279a().mo5270d());
                }
                ConcurrentMap<String, Boolean> concurrentMap2 = f6187d;
                concurrentMap2.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", Boolean.TRUE);
                if (!concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
                    concurrentMap.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", new zd3(ld3));
                }
                concurrentMap2.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", Boolean.FALSE);
            } else {
                String valueOf2 = String.valueOf(ld3.getClass());
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 61);
                sb2.append("failed to register key manager ");
                sb2.append(valueOf2);
                sb2.append(" as it is not FIPS compatible.");
                throw new GeneralSecurityException(sb2.toString());
            }
        }
    }

    /* renamed from: l */
    public static synchronized <P> void m8528l(dd3<P> dd3, boolean z) {
        synchronized (ee3.class) {
            if (dd3 != null) {
                String d = dd3.mo6450d();
                m8534r(d, dd3.getClass(), Collections.emptyMap(), z);
                f6185b.putIfAbsent(d, new yd3(dd3));
                f6187d.put(d, Boolean.valueOf(z));
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    /* renamed from: m */
    public static synchronized <KeyProtoT extends kr3> void m8529m(ld3<KeyProtoT> ld3, boolean z) {
        synchronized (ee3.class) {
            String f = ld3.mo5281f();
            m8534r(f, ld3.getClass(), ld3.mo5279a().mo5270d(), true);
            if (qf3.m15611a(ld3.mo8934i())) {
                ConcurrentMap<String, ce3> concurrentMap = f6185b;
                if (!concurrentMap.containsKey(f)) {
                    concurrentMap.put(f, new zd3(ld3));
                    f6186c.put(f, new be3(ld3));
                    m8535s(f, ld3.mo5279a().mo5270d());
                }
                f6187d.put(f, Boolean.TRUE);
            } else {
                String valueOf = String.valueOf(ld3.getClass());
                StringBuilder sb = new StringBuilder(valueOf.length() + 61);
                sb.append("failed to register key manager ");
                sb.append(valueOf);
                sb.append(" as it is not FIPS compatible.");
                throw new GeneralSecurityException(sb.toString());
            }
        }
    }

    /* renamed from: n */
    public static synchronized <B, P> void m8530n(vd3<B, P> vd3) {
        synchronized (ee3.class) {
            if (vd3 != null) {
                Class<P> a = vd3.mo7340a();
                ConcurrentMap<Class<?>, vd3<?, ?>> concurrentMap = f6189f;
                if (concurrentMap.containsKey(a)) {
                    vd3 vd32 = (vd3) concurrentMap.get(a);
                    if (!vd3.getClass().getName().equals(vd32.getClass().getName())) {
                        f6184a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type ".concat(a.toString()));
                        throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", new Object[]{a.getName(), vd32.getClass().getName(), vd3.getClass().getName()}));
                    }
                }
                concurrentMap.put(a, vd3);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    /* renamed from: o */
    private static <P> dd3<P> m8531o(String str, Class<P> cls) {
        ce3 p = m8532p(str);
        if (p.mo5250b().contains(cls)) {
            return p.mo5252d(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(p.mo5251c());
        Set<Class<?>> b = p.mo5250b();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class next : b) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(next.getCanonicalName());
            z = false;
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(name.length() + 77 + valueOf.length() + sb2.length());
        sb3.append("Primitive type ");
        sb3.append(name);
        sb3.append(" not supported by key manager of type ");
        sb3.append(valueOf);
        sb3.append(", supported primitives: ");
        sb3.append(sb2);
        throw new GeneralSecurityException(sb3.toString());
    }

    /* renamed from: p */
    private static synchronized ce3 m8532p(String str) {
        ce3 ce3;
        synchronized (ee3.class) {
            ConcurrentMap<String, ce3> concurrentMap = f6185b;
            if (!concurrentMap.containsKey(str)) {
                String valueOf = String.valueOf(str);
                throw new GeneralSecurityException(valueOf.length() != 0 ? "No key manager found for key type ".concat(valueOf) : new String("No key manager found for key type "));
            }
            ce3 = (ce3) concurrentMap.get(str);
        }
        return ce3;
    }

    /* renamed from: q */
    private static <P> P m8533q(String str, uo3 uo3, Class<P> cls) {
        return m8531o(str, cls).mo6452f(uo3);
    }

    /* renamed from: r */
    private static synchronized <KeyProtoT extends kr3, KeyFormatProtoT extends kr3> void m8534r(String str, Class cls, Map<String, id3<KeyFormatProtoT>> map, boolean z) {
        synchronized (ee3.class) {
            ConcurrentMap<String, ce3> concurrentMap = f6185b;
            ce3 ce3 = (ce3) concurrentMap.get(str);
            if (ce3 != null && !ce3.mo5251c().equals(cls)) {
                f6184a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "ensureKeyManagerInsertable", str.length() != 0 ? "Attempted overwrite of a registered key manager for key type ".concat(str) : new String("Attempted overwrite of a registered key manager for key type "));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{str, ce3.mo5251c().getName(), cls.getName()}));
            } else if (z) {
                ConcurrentMap<String, Boolean> concurrentMap2 = f6187d;
                if (concurrentMap2.containsKey(str) && !((Boolean) concurrentMap2.get(str)).booleanValue()) {
                    throw new GeneralSecurityException(str.length() != 0 ? "New keys are already disallowed for key type ".concat(str) : new String("New keys are already disallowed for key type "));
                } else if (concurrentMap.containsKey(str)) {
                    for (Map.Entry next : map.entrySet()) {
                        if (!f6190g.containsKey(next.getKey())) {
                            String str2 = (String) next.getKey();
                            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 79 + str.length());
                            sb.append("Attempted to register a new key template ");
                            sb.append(str2);
                            sb.append(" from an existing key manager of type ");
                            sb.append(str);
                            throw new GeneralSecurityException(sb.toString());
                        }
                    }
                } else {
                    for (Map.Entry next2 : map.entrySet()) {
                        if (f6190g.containsKey(next2.getKey())) {
                            String valueOf = String.valueOf((String) next2.getKey());
                            throw new GeneralSecurityException(valueOf.length() != 0 ? "Attempted overwrite of a registered key template ".concat(valueOf) : new String("Attempted overwrite of a registered key template "));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: s */
    private static <KeyFormatProtoT extends kr3> void m8535s(String str, Map<String, id3<KeyFormatProtoT>> map) {
        for (Map.Entry next : map.entrySet()) {
            f6190g.put((String) next.getKey(), gd3.m9693d(str, ((id3) next.getValue()).f8622a.mo5901b(), ((id3) next.getValue()).f8623b));
        }
    }
}
