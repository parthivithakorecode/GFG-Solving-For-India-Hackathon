package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

public final /* synthetic */ class tn1 implements t70 {

    /* renamed from: a */
    public final /* synthetic */ un1 f14926a;

    /* renamed from: b */
    public final /* synthetic */ e60 f14927b;

    public /* synthetic */ tn1(un1 un1, e60 e60) {
        this.f14926a = un1;
        this.f14927b = e60;
    }

    /* renamed from: a */
    public final void mo5150a(Object obj, Map map) {
        un1 un1 = this.f14926a;
        e60 e60 = this.f14927b;
        try {
            un1.f15658k = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
        } catch (NumberFormatException unused) {
            io0.m11128d("Failed to call parse unconfirmedClickTimestamp.");
        }
        un1.f15657j = (String) map.get("id");
        String str = (String) map.get("asset_id");
        if (e60 == null) {
            io0.m11126b("Received unconfirmed click but UnconfirmedClickListener is null.");
            return;
        }
        try {
            e60.mo6398z(str);
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }
}
