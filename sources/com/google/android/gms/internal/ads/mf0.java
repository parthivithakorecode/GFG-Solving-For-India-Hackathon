package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p002a1.C0013a;
import p083l1.C3447d;
import p083l1.C3460q;

final class mf0 implements C3447d<C3460q, Object> {

    /* renamed from: a */
    final /* synthetic */ ze0 f10825a;

    /* renamed from: b */
    final /* synthetic */ jd0 f10826b;

    /* renamed from: c */
    final /* synthetic */ nf0 f10827c;

    mf0(nf0 nf0, ze0 ze0, jd0 jd0) {
        this.f10827c = nf0;
        this.f10825a = ze0;
        this.f10826b = jd0;
    }

    /* renamed from: a */
    public final void mo5246a(C0013a aVar) {
        try {
            this.f10825a.mo6097w(aVar.mo22d());
        } catch (RemoteException e) {
            io0.m11129e("", e);
        }
    }
}
