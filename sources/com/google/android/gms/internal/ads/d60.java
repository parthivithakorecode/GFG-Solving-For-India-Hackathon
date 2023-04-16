package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class d60 extends C2440zd implements e60 {
    d60(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    /* renamed from: b */
    public final void mo6397b() {
        mo12206C0(2, mo12207D());
    }

    /* renamed from: z */
    public final void mo6398z(String str) {
        Parcel D = mo12207D();
        D.writeString(str);
        mo12206C0(1, D);
    }
}
