package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import p048g2.C2637b;
import p048g2.C2638c;

/* renamed from: com.google.android.gms.internal.ads.hv */
public final class C1791hv extends C2638c<C1904kx> {
    public C1791hv() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo8020a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return queryLocalInterface instanceof C1904kx ? (C1904kx) queryLocalInterface : new C1904kx(iBinder);
    }

    /* renamed from: c */
    public final C1867jx mo8021c(Context context, String str, dd0 dd0) {
        try {
            IBinder b3 = ((C1904kx) mo12521b(context)).mo8808b3(C2637b.m21358Z2(context), str, dd0, 214106000);
            if (b3 == null) {
                return null;
            }
            IInterface queryLocalInterface = b3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof C1867jx ? (C1867jx) queryLocalInterface : new C1793hx(b3);
        } catch (RemoteException | C2638c.C2639a e) {
            io0.m11132h("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }
}
