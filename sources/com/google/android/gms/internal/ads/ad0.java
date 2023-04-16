package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.C1456b;
import com.google.ads.mediation.C1464f;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import java.util.Map;
import p083l1.C3444a;
import p083l1.C3449f;
import p090m1.C3668a;

public final class ad0 extends cd0 {

    /* renamed from: g */
    private static final gf0 f4073g = new gf0();

    /* renamed from: f */
    private Map<Class<Object>, Object> f4074f;

    /* renamed from: A5 */
    public final void mo5239A5(Map<Class<Object>, Object> map) {
        this.f4074f = map;
    }

    /* renamed from: d0 */
    public final cf0 mo5240d0(String str) {
        try {
            return new nf0((RtbAdapter) Class.forName(str, false, gf0.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Throwable unused) {
            throw new RemoteException();
        }
    }

    /* renamed from: s */
    public final gd0 mo5241s(String str) {
        try {
            Class<?> cls = Class.forName(str, false, ad0.class.getClassLoader());
            if (C1456b.class.isAssignableFrom(cls)) {
                C1456b bVar = (C1456b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                return new he0(bVar, (C1464f) this.f4074f.get(bVar.getAdditionalParametersType()));
            } else if (C3449f.class.isAssignableFrom(cls)) {
                return new ce0((C3449f) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } else {
                if (C3444a.class.isAssignableFrom(cls)) {
                    return new ce0((C3444a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
                sb.append("Could not instantiate mediation adapter: ");
                sb.append(str);
                sb.append(" (not a valid adapter).");
                io0.m11131g(sb.toString());
                throw new RemoteException();
            }
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 43);
            sb2.append("Could not instantiate mediation adapter: ");
            sb2.append(str);
            sb2.append(". ");
            io0.m11132h(sb2.toString(), th);
        }
        throw new RemoteException();
    }

    /* renamed from: u */
    public final boolean mo5242u(String str) {
        try {
            return C3444a.class.isAssignableFrom(Class.forName(str, false, ad0.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 104);
            sb.append("Could not load custom event implementation class as Adapter: ");
            sb.append(str);
            sb.append(", assuming old custom event implementation.");
            io0.m11131g(sb.toString());
            return false;
        }
    }

    /* renamed from: z */
    public final boolean mo5243z(String str) {
        try {
            return C3668a.class.isAssignableFrom(Class.forName(str, false, ad0.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 88);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", trying Adapter implementation class.");
            io0.m11131g(sb.toString());
            return false;
        }
    }
}
