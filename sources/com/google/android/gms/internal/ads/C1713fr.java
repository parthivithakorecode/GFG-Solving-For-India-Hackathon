package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import p048g2.C2637b;

/* renamed from: com.google.android.gms.internal.ads.fr */
public final class C1713fr {

    /* renamed from: a */
    C1663ee f6892a;

    /* renamed from: b */
    boolean f6893b;

    public C1713fr() {
    }

    public C1713fr(Context context) {
        m10.m13007c(context);
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10631v3)).booleanValue()) {
            try {
                this.f6892a = (C1663ee) no0.m14004b(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", C1564br.f5017a);
                C2637b.m21358Z2(context);
                this.f6892a.mo6130k1(C2637b.m21358Z2(context), "GMA_SDK");
                this.f6893b = true;
            } catch (RemoteException | mo0 | NullPointerException unused) {
                io0.m11126b("Cannot dynamite load clearcut");
            }
        }
    }
}
