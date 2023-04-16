package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.fz */
public abstract class C1721fz extends C1514ae implements C1758gz {
    public C1721fz() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y5 */
    public final boolean mo5080y5(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo7194h();
        } else if (i == 2) {
            mo7193f();
        } else if (i == 3) {
            mo7192e();
        } else if (i == 4) {
            mo7191b();
        } else if (i != 5) {
            return false;
        } else {
            mo7195w3(C1551be.m6822g(parcel));
        }
        parcel2.writeNoException();
        return true;
    }
}
