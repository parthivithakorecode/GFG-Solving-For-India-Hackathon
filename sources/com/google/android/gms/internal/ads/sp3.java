package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rp3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class sp3<T extends rp3<T>> {

    /* renamed from: d */
    private static final sp3 f14531d = new sp3(true);

    /* renamed from: a */
    final ss3<T, Object> f14532a = new hs3(16);

    /* renamed from: b */
    private boolean f14533b;

    /* renamed from: c */
    private boolean f14534c;

    private sp3() {
    }

    private sp3(boolean z) {
        mo10836b();
        mo10836b();
    }

    /* renamed from: a */
    public static <T extends rp3<T>> sp3<T> m16935a() {
        throw null;
    }

    /* renamed from: d */
    private static final void m16936d(T t, Object obj) {
        boolean z;
        mt3 a = t.mo10635a();
        kq3.m12304e(obj);
        mt3 mt3 = mt3.DOUBLE;
        nt3 nt3 = nt3.INT;
        switch (a.mo9364b().ordinal()) {
            case 0:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof uo3) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof cq3)) {
                    return;
                }
            case 8:
                if (obj instanceof kr3) {
                    return;
                }
                break;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t.zza()), t.mo10635a().mo9364b(), obj.getClass().getName()}));
    }

    /* renamed from: b */
    public final void mo10836b() {
        if (!this.f14533b) {
            this.f14532a.mo8009a();
            this.f14533b = true;
        }
    }

    /* renamed from: c */
    public final void mo10837c(T t, Object obj) {
        if (!t.mo10636c()) {
            m16936d(t, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m16936d(t, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        this.f14532a.put(t, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        sp3 sp3 = new sp3();
        for (int i = 0; i < this.f14532a.mo10849b(); i++) {
            Map.Entry<T, Object> g = this.f14532a.mo10856g(i);
            sp3.mo10837c((rp3) g.getKey(), g.getValue());
        }
        for (Map.Entry next : this.f14532a.mo10850c()) {
            sp3.mo10837c((rp3) next.getKey(), next.getValue());
        }
        sp3.f14534c = this.f14534c;
        return sp3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sp3)) {
            return false;
        }
        return this.f14532a.equals(((sp3) obj).f14532a);
    }

    public final int hashCode() {
        return this.f14532a.hashCode();
    }
}
