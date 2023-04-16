package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ny */
public final class C2016ny {

    /* renamed from: a */
    private final String f11739a;

    /* renamed from: b */
    private final C1979my f11740b;

    public C2016ny(C1979my myVar) {
        String str;
        this.f11740b = myVar;
        try {
            str = myVar.mo8814b();
        } catch (RemoteException e) {
            io0.m11129e("", e);
            str = null;
        }
        this.f11739a = str;
    }

    public final String toString() {
        return this.f11739a;
    }
}
