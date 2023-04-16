package com.google.android.gms.internal.ads;

import android.os.RemoteException;

public final /* synthetic */ class j62 implements t61 {

    /* renamed from: a */
    public final /* synthetic */ d52 f9004a;

    public /* synthetic */ j62(d52 d52) {
        this.f9004a = d52;
    }

    public final C1609cz zza() {
        try {
            return ((cf0) this.f9004a.f5647b).mo5258b();
        } catch (RemoteException e) {
            throw new ps2(e);
        }
    }
}
