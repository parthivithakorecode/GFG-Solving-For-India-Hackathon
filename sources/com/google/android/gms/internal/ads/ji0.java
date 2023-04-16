package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import p013b2.C1298a;
import p013b2.C1301c;

@ParametersAreNonnullByDefault
public final class ji0 extends C1298a {
    public static final Parcelable.Creator<ji0> CREATOR = new ki0();

    /* renamed from: f */
    public final boolean f9139f;

    /* renamed from: g */
    public final List<String> f9140g;

    public ji0(boolean z, List<String> list) {
        this.f9139f = z;
        this.f9140g = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5215c(parcel, 2, this.f9139f);
        C1301c.m5227o(parcel, 3, this.f9140g, false);
        C1301c.m5214b(parcel, a);
    }
}
