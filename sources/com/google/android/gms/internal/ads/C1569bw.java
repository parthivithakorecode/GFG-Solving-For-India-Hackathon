package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import p048g2.C2637b;

/* renamed from: com.google.android.gms.internal.ads.bw */
final class C1569bw extends C2088pw<bn0> {

    /* renamed from: b */
    final /* synthetic */ Context f5063b;

    /* renamed from: c */
    final /* synthetic */ dd0 f5064c;

    C1569bw(C2051ow owVar, Context context, dd0 dd0) {
        this.f5063b = context;
        this.f5064c = dd0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5977a() {
        return null;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo5978b(C2386xx xxVar) {
        return xxVar.mo4949q3(C2637b.m21358Z2(this.f5063b), this.f5064c, 214106000);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo5979c() {
        try {
            return ((en0) no0.m14004b(this.f5063b, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", C1532aw.f4370a)).mo6226g0(C2637b.m21358Z2(this.f5063b), this.f5064c, 214106000);
        } catch (RemoteException | mo0 | NullPointerException unused) {
            return null;
        }
    }
}
