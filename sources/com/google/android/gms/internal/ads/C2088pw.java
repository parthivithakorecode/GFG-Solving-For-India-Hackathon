package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import p160x1.C4288j;

/* renamed from: com.google.android.gms.internal.ads.pw */
abstract class C2088pw<T> {

    /* renamed from: a */
    private static final C2386xx f12822a;

    static {
        C2386xx xxVar = null;
        try {
            Object newInstance = C2051ow.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                io0.m11131g("ClientApi class is not an instance of IBinder.");
            } else {
                IBinder iBinder = (IBinder) newInstance;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    xxVar = queryLocalInterface instanceof C2386xx ? (C2386xx) queryLocalInterface : new C2311vx(iBinder);
                }
            }
        } catch (Exception unused) {
            io0.m11131g("Failed to instantiate ClientApi class.");
        }
        f12822a = xxVar;
    }

    C2088pw() {
    }

    /* renamed from: e */
    private final T m15294e() {
        C2386xx xxVar = f12822a;
        if (xxVar == null) {
            io0.m11131g("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return mo5978b(xxVar);
        } catch (RemoteException e) {
            io0.m11132h("Cannot invoke local loader using ClientApi class.", e);
            return null;
        }
    }

    /* renamed from: f */
    private final T m15295f() {
        try {
            return mo5979c();
        } catch (RemoteException e) {
            io0.m11132h("Cannot invoke remote loader.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo5977a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo5978b(C2386xx xxVar);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract T mo5979c();

    /* renamed from: d */
    public final T mo10181d(Context context, boolean z) {
        boolean z2;
        T t;
        if (!z) {
            C2125qw.m15897b();
            if (!bo0.m6990n(context, C4288j.f22593a)) {
                io0.m11126b("Google Play Services is not available.");
                z = true;
            }
        }
        boolean z3 = false;
        boolean z4 = z | (!(DynamiteModule.m5725a(context, ModuleDescriptor.MODULE_ID) <= DynamiteModule.m5726c(context, ModuleDescriptor.MODULE_ID)));
        m10.m13007c(context);
        if (x20.f16997a.mo9928e().booleanValue()) {
            z2 = false;
        } else if (x20.f16998b.mo9928e().booleanValue()) {
            z2 = true;
            z3 = true;
        } else {
            z3 = z4;
            z2 = false;
        }
        if (z3) {
            t = m15294e();
            if (t == null && !z2) {
                t = m15295f();
            }
        } else {
            T f = m15295f();
            if (f == null) {
                if (C2125qw.m15900e().nextInt(j30.f8967a.mo9928e().intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    C2125qw.m15897b().mo5899i(context, C2125qw.m15898c().f12729f, "gmob-apps", bundle, true);
                }
            }
            t = f == null ? m15294e() : f;
        }
        return t == null ? mo5977a() : t;
    }
}
