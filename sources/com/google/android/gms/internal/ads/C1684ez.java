package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.ez */
public final class C1684ez extends C2440zd implements C1758gz {
    C1684ez(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    /* renamed from: b */
    public final void mo7191b() {
        mo12206C0(4, mo12207D());
    }

    /* renamed from: e */
    public final void mo7192e() {
        mo12206C0(3, mo12207D());
    }

    /* renamed from: f */
    public final void mo7193f() {
        mo12206C0(2, mo12207D());
    }

    /* renamed from: h */
    public final void mo7194h() {
        mo12206C0(1, mo12207D());
    }

    /* renamed from: w3 */
    public final void mo7195w3(boolean z) {
        Parcel D = mo12207D();
        C1551be.m6818c(D, z);
        mo12206C0(5, D);
    }
}
