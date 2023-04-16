package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;

public final class xc2 {

    /* renamed from: a */
    private final cd2<v61> f17137a;

    /* renamed from: b */
    private final String f17138b;
    /* access modifiers changed from: private */
    @GuardedBy("this")

    /* renamed from: c */
    public C2461zy f17139c;

    public xc2(cd2<v61> cd2, String str) {
        this.f17137a = cd2;
        this.f17138b = str;
    }

    /* renamed from: a */
    public final synchronized String mo11794a() {
        String str;
        str = null;
        try {
            C2461zy zyVar = this.f17139c;
            if (zyVar != null) {
                str = zyVar.mo9702b();
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
            return null;
        }
        return str;
    }

    /* renamed from: b */
    public final synchronized String mo11795b() {
        String str;
        str = null;
        try {
            C2461zy zyVar = this.f17139c;
            if (zyVar != null) {
                str = zyVar.mo9702b();
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
            return null;
        }
        return str;
    }

    /* renamed from: d */
    public final synchronized void mo11796d(C1902kv kvVar, int i) {
        this.f17139c = null;
        this.f17137a.mo6124a(kvVar, this.f17138b, new dd2(i), new wc2(this));
    }

    /* renamed from: e */
    public final synchronized boolean mo11797e() {
        return this.f17137a.zza();
    }
}
