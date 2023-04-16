package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p002a1.C0013a;
import p083l1.C3447d;
import p083l1.C3455l;

final class jf0 implements C3447d<C3455l, Object> {

    /* renamed from: a */
    final /* synthetic */ te0 f9124a;

    /* renamed from: b */
    final /* synthetic */ jd0 f9125b;

    /* renamed from: c */
    final /* synthetic */ nf0 f9126c;

    jf0(nf0 nf0, te0 te0, jd0 jd0) {
        this.f9126c = nf0;
        this.f9124a = te0;
        this.f9125b = jd0;
    }

    /* renamed from: a */
    public final void mo5246a(C0013a aVar) {
        try {
            this.f9124a.mo9459w(aVar.mo22d());
        } catch (RemoteException e) {
            io0.m11129e("", e);
        }
    }
}
