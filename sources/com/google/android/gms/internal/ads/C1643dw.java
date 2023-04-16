package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import p048g2.C2637b;

/* renamed from: com.google.android.gms.internal.ads.dw */
final class C1643dw extends C2088pw<ng0> {

    /* renamed from: b */
    final /* synthetic */ Context f5950b;

    /* renamed from: c */
    final /* synthetic */ dd0 f5951c;

    C1643dw(C2051ow owVar, Context context, dd0 dd0) {
        this.f5950b = context;
        this.f5951c = dd0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5977a() {
        return null;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo5978b(C2386xx xxVar) {
        return xxVar.mo4939H3(C2637b.m21358Z2(this.f5950b), this.f5951c, 214106000);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo5979c() {
        try {
            return ((qg0) no0.m14004b(this.f5950b, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", C1606cw.f5538a)).mo9765g0(C2637b.m21358Z2(this.f5950b), this.f5951c, 214106000);
        } catch (RemoteException | mo0 | NullPointerException unused) {
            return null;
        }
    }
}
