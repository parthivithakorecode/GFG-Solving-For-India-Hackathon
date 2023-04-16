package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import p069j1.C3157f0;
import p069j1.C3202r1;

final class i22 implements nb3<ParcelFileDescriptor> {

    /* renamed from: a */
    final /* synthetic */ ri0 f8499a;

    i22(m22 m22, ri0 ri0) {
        this.f8499a = ri0;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5436a(Object obj) {
        try {
            this.f8499a.mo10062H0((ParcelFileDescriptor) obj);
        } catch (RemoteException e) {
            C3202r1.m24016l("Service can't call client", e);
        }
    }

    /* renamed from: b */
    public final void mo5437b(Throwable th) {
        try {
            this.f8499a.mo10063m3(C3157f0.m23894c(th));
        } catch (RemoteException e) {
            C3202r1.m24016l("Service can't call client", e);
        }
    }
}
