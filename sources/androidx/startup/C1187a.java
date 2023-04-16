package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p068j0.C3133a;
import p068j0.C3134b;
import p068j0.C3135c;
import p075k0.C3293a;

/* renamed from: androidx.startup.a */
public final class C1187a {

    /* renamed from: d */
    private static volatile C1187a f3182d;

    /* renamed from: e */
    private static final Object f3183e = new Object();

    /* renamed from: a */
    final Map<Class<?>, Object> f3184a = new HashMap();

    /* renamed from: b */
    final Set<Class<? extends C3133a<?>>> f3185b = new HashSet();

    /* renamed from: c */
    final Context f3186c;

    C1187a(Context context) {
        this.f3186c = context.getApplicationContext();
    }

    /* renamed from: d */
    private <T> T m4779d(Class<? extends C3133a<?>> cls, Set<Class<?>> set) {
        T t;
        if (C3293a.m24369h()) {
            try {
                C3293a.m24364c(cls.getSimpleName());
            } catch (Throwable th) {
                C3293a.m24367f();
                throw th;
            }
        }
        if (!set.contains(cls)) {
            if (!this.f3184a.containsKey(cls)) {
                set.add(cls);
                C3133a aVar = (C3133a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends C3133a<?>>> a = aVar.mo3089a();
                if (!a.isEmpty()) {
                    for (Class next : a) {
                        if (!this.f3184a.containsKey(next)) {
                            m4779d(next, set);
                        }
                    }
                }
                t = aVar.mo3090b(this.f3186c);
                set.remove(cls);
                this.f3184a.put(cls, t);
            } else {
                t = this.f3184a.get(cls);
            }
            C3293a.m24367f();
            return t;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", new Object[]{cls.getName()}));
    }

    /* renamed from: e */
    public static C1187a m4780e(Context context) {
        if (f3182d == null) {
            synchronized (f3183e) {
                if (f3182d == null) {
                    f3182d = new C1187a(context);
                }
            }
        }
        return f3182d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4007a() {
        try {
            C3293a.m24364c("Startup");
            mo4008b(this.f3186c.getPackageManager().getProviderInfo(new ComponentName(this.f3186c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            C3293a.m24367f();
        } catch (PackageManager.NameNotFoundException e) {
            throw new C3135c((Throwable) e);
        } catch (Throwable th) {
            C3293a.m24367f();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4008b(Bundle bundle) {
        String string = this.f3186c.getString(C3134b.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, (String) null))) {
                        Class<?> cls = Class.forName(str);
                        if (C3133a.class.isAssignableFrom(cls)) {
                            this.f3185b.add(cls);
                        }
                    }
                }
                for (Class<? extends C3133a<?>> d : this.f3185b) {
                    m4779d(d, hashSet);
                }
            } catch (ClassNotFoundException e) {
                throw new C3135c((Throwable) e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public <T> T mo4009c(Class<? extends C3133a<?>> cls) {
        T t;
        synchronized (f3183e) {
            t = this.f3184a.get(cls);
            if (t == null) {
                t = m4779d(cls, new HashSet());
            }
        }
        return t;
    }

    /* renamed from: f */
    public <T> T mo4010f(Class<? extends C3133a<T>> cls) {
        return mo4009c(cls);
    }

    /* renamed from: g */
    public boolean mo4011g(Class<? extends C3133a<?>> cls) {
        return this.f3185b.contains(cls);
    }
}
