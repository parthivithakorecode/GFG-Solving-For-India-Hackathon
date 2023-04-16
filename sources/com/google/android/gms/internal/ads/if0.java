package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p002a1.C0013a;
import p083l1.C3447d;
import p083l1.C3454k;

final class if0 implements C3447d<C3454k, Object> {

    /* renamed from: a */
    final /* synthetic */ qe0 f8638a;

    /* renamed from: b */
    final /* synthetic */ jd0 f8639b;

    if0(nf0 nf0, qe0 qe0, jd0 jd0) {
        this.f8638a = qe0;
        this.f8639b = jd0;
    }

    /* renamed from: a */
    public final void mo5246a(C0013a aVar) {
        try {
            this.f8638a.mo9142w(aVar.mo22d());
        } catch (RemoteException e) {
            io0.m11129e("", e);
        }
    }
}
