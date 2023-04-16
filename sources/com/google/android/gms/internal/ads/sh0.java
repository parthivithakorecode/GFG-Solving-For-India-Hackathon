package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import p013b2.C1298a;
import p013b2.C1301c;
import p048g2.C2635a;
import p048g2.C2637b;

@ParametersAreNonnullByDefault
public final class sh0 extends C1298a {
    public static final Parcelable.Creator<sh0> CREATOR = new th0();

    /* renamed from: f */
    public final View f14442f;

    /* renamed from: g */
    public final Map<String, WeakReference<View>> f14443g;

    public sh0(IBinder iBinder, IBinder iBinder2) {
        this.f14442f = (View) C2637b.m21357C0(C2635a.C2636a.m21356n0(iBinder));
        this.f14443g = (Map) C2637b.m21357C0(C2635a.C2636a.m21356n0(iBinder2));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5219g(parcel, 1, C2637b.m21358Z2(this.f14442f).asBinder(), false);
        C1301c.m5219g(parcel, 2, C2637b.m21358Z2(this.f14443g).asBinder(), false);
        C1301c.m5214b(parcel, a);
    }
}
