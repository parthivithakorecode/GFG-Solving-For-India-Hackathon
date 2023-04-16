package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

public final class u23 {

    /* renamed from: g */
    private static final HashMap<String, Class<?>> f15367g = new HashMap<>();

    /* renamed from: a */
    private final Context f15368a;

    /* renamed from: b */
    private final v23 f15369b;

    /* renamed from: c */
    private final u03 f15370c;

    /* renamed from: d */
    private final p03 f15371d;

    /* renamed from: e */
    private i23 f15372e;

    /* renamed from: f */
    private final Object f15373f = new Object();

    public u23(Context context, v23 v23, u03 u03, p03 p03) {
        this.f15368a = context;
        this.f15369b = v23;
        this.f15370c = u03;
        this.f15371d = p03;
    }

    /* renamed from: d */
    private final synchronized Class<?> m17690d(j23 j23) {
        String O = j23.mo8333a().mo11994O();
        HashMap<String, Class<?>> hashMap = f15367g;
        Class<?> cls = hashMap.get(O);
        if (cls != null) {
            return cls;
        }
        try {
            if (this.f15371d.mo9912a(j23.mo8335c())) {
                File b = j23.mo8334b();
                if (!b.exists()) {
                    b.mkdirs();
                }
                Class<?> loadClass = new DexClassLoader(j23.mo8335c().getAbsolutePath(), b.getAbsolutePath(), (String) null, this.f15368a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                hashMap.put(O, loadClass);
                return loadClass;
            }
            throw new t23(2026, "VM did not pass signature verification");
        } catch (GeneralSecurityException e) {
            throw new t23(2026, (Throwable) e);
        } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e2) {
            throw new t23(2008, e2);
        }
    }

    /* renamed from: a */
    public final x03 mo11149a() {
        i23 i23;
        synchronized (this.f15373f) {
            i23 = this.f15372e;
        }
        return i23;
    }

    /* renamed from: b */
    public final j23 mo11150b() {
        synchronized (this.f15373f) {
            i23 i23 = this.f15372e;
            if (i23 == null) {
                return null;
            }
            j23 f = i23.mo8059f();
            return f;
        }
    }

    /* renamed from: c */
    public final boolean mo11151c(j23 j23) {
        t23 t23;
        int i;
        u03 u03;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Class<?> d = m17690d(j23);
            i23 i23 = new i23(d.getDeclaredConstructor(new Class[]{Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE}).newInstance(new Object[]{this.f15368a, "msa-r", j23.mo8337e(), null, new Bundle(), 2}), j23, this.f15369b, this.f15370c);
            if (i23.mo8061h()) {
                int e = i23.mo8058e();
                if (e == 0) {
                    synchronized (this.f15373f) {
                        i23 i232 = this.f15372e;
                        if (i232 != null) {
                            try {
                                i232.mo8060g();
                            } catch (t23 e2) {
                                this.f15370c.mo11132c(e2.mo10933a(), -1, e2);
                            }
                        }
                        this.f15372e = i23;
                    }
                    this.f15370c.mo11133d(3000, System.currentTimeMillis() - currentTimeMillis);
                    return true;
                }
                StringBuilder sb = new StringBuilder(15);
                sb.append("ci: ");
                sb.append(e);
                throw new t23(4001, sb.toString());
            }
            throw new t23(4000, "init failed");
        } catch (Exception e3) {
            throw new t23(2004, (Throwable) e3);
        } catch (t23 e4) {
            u03 = this.f15370c;
            i = e4.mo10933a();
            t23 = e4;
            u03.mo11132c(i, System.currentTimeMillis() - currentTimeMillis, t23);
            return false;
        } catch (Exception e5) {
            u03 = this.f15370c;
            i = 4010;
            t23 = e5;
            u03.mo11132c(i, System.currentTimeMillis() - currentTimeMillis, t23);
            return false;
        }
    }
}
