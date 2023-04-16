package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.kn3;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

public final class cn3<T_WRAPPER extends kn3<T_ENGINE>, T_ENGINE> {

    /* renamed from: b */
    private static final Logger f5463b = Logger.getLogger(cn3.class.getName());

    /* renamed from: c */
    private static final List<Provider> f5464c;

    /* renamed from: d */
    private static final boolean f5465d;

    /* renamed from: e */
    public static final cn3<dn3, Cipher> f5466e = new cn3<>(new dn3());

    /* renamed from: f */
    public static final cn3<hn3, Mac> f5467f = new cn3<>(new hn3());

    /* renamed from: g */
    public static final cn3<jn3, Signature> f5468g = new cn3<>(new jn3());

    /* renamed from: h */
    public static final cn3<in3, MessageDigest> f5469h = new cn3<>(new in3());

    /* renamed from: i */
    public static final cn3<en3, KeyAgreement> f5470i = new cn3<>(new en3());

    /* renamed from: j */
    public static final cn3<gn3, KeyPairGenerator> f5471j = new cn3<>(new gn3());

    /* renamed from: k */
    public static final cn3<fn3, KeyFactory> f5472k = new cn3<>(new fn3());

    /* renamed from: a */
    private final T_WRAPPER f5473a;

    static {
        if (rf3.m16177b()) {
            f5464c = m7474b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt");
            f5465d = false;
        } else {
            f5464c = vn3.m18611b() ? m7474b("GmsCore_OpenSSL", "AndroidOpenSSL") : new ArrayList<>();
            f5465d = true;
        }
    }

    public cn3(T_WRAPPER t_wrapper) {
        this.f5473a = t_wrapper;
    }

    /* renamed from: b */
    public static List<Provider> m7474b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                f5463b.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", new Object[]{str}));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final T_ENGINE mo6236a(String str) {
        Exception exc = null;
        for (Provider a : f5464c) {
            try {
                return this.f5473a.mo6520a(str, a);
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        if (f5465d) {
            return this.f5473a.mo6520a(str, (Provider) null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
