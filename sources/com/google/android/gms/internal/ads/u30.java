package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

public final class u30 {

    /* renamed from: a */
    private final Context f15382a;

    public u30(Context context) {
        this.f15382a = context;
    }

    /* renamed from: a */
    public final void mo11154a(fi0 fi0) {
        try {
            ((v30) no0.m14004b(this.f15382a, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", t30.f14691a)).mo11374b3(fi0);
        } catch (mo0 e) {
            String valueOf = String.valueOf(e.getMessage());
            io0.m11131g(valueOf.length() != 0 ? "Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(valueOf) : new String("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:"));
        } catch (RemoteException e2) {
            String valueOf2 = String.valueOf(e2.getMessage());
            io0.m11131g(valueOf2.length() != 0 ? "Error calling setFlagsAccessedBeforeInitializedListener: ".concat(valueOf2) : new String("Error calling setFlagsAccessedBeforeInitializedListener: "));
        }
    }
}
