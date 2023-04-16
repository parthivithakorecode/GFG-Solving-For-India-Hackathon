package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p002a1.C0013a;
import p083l1.C3447d;
import p083l1.C3465v;

final class kf0 implements C3447d<C3465v, Object> {

    /* renamed from: a */
    final /* synthetic */ we0 f9515a;

    /* renamed from: b */
    final /* synthetic */ jd0 f9516b;

    kf0(nf0 nf0, we0 we0, jd0 jd0) {
        this.f9515a = we0;
        this.f9516b = jd0;
    }

    /* renamed from: a */
    public final void mo5246a(C0013a aVar) {
        try {
            this.f9515a.mo6082w(aVar.mo22d());
        } catch (RemoteException e) {
            io0.m11129e("", e);
        }
    }
}
