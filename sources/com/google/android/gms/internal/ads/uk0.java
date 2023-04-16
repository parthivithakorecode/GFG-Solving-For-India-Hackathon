package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import javax.annotation.ParametersAreNonnullByDefault;
import p013b2.C1298a;
import p013b2.C1301c;
import p124r1.C3974e;

@ParametersAreNonnullByDefault
public final class uk0 extends C1298a {
    public static final Parcelable.Creator<uk0> CREATOR = new vk0();

    /* renamed from: f */
    public final String f15613f;

    /* renamed from: g */
    public final String f15614g;

    public uk0(String str, String str2) {
        this.f15613f = str;
        this.f15614g = str2;
    }

    public uk0(C3974e eVar) {
        this(eVar.mo15437b(), eVar.mo15436a());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5225m(parcel, 1, this.f15613f, false);
        C1301c.m5225m(parcel, 2, this.f15614g, false);
        C1301c.m5214b(parcel, a);
    }
}
