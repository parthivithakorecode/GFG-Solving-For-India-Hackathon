package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

public final class nh0 extends C2440zd implements ph0 {
    nh0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    /* renamed from: n2 */
    public final void mo9527n2(List<Uri> list) {
        Parcel D = mo12207D();
        D.writeTypedList(list);
        mo12206C0(1, D);
    }

    /* renamed from: u */
    public final void mo9528u(String str) {
        Parcel D = mo12207D();
        D.writeString(str);
        mo12206C0(2, D);
    }
}
