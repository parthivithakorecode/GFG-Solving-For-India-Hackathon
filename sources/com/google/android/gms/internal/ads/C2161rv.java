package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;
import p013b2.C1298a;
import p013b2.C1301c;

@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.rv */
public final class C2161rv extends C1298a {
    public static final Parcelable.Creator<C2161rv> CREATOR = new C2198sv();

    /* renamed from: f */
    public final int f13943f;

    /* renamed from: g */
    public final int f13944g;

    /* renamed from: h */
    public final String f13945h;

    /* renamed from: i */
    public final long f13946i;

    public C2161rv(int i, int i2, String str, long j) {
        this.f13943f = i;
        this.f13944g = i2;
        this.f13945h = str;
        this.f13946i = j;
    }

    /* renamed from: c */
    public static C2161rv m16462c(JSONObject jSONObject) {
        return new C2161rv(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString("currency"), jSONObject.getLong("value"));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5220h(parcel, 1, this.f13943f);
        C1301c.m5220h(parcel, 2, this.f13944g);
        C1301c.m5225m(parcel, 3, this.f13945h, false);
        C1301c.m5223k(parcel, 4, this.f13946i);
        C1301c.m5214b(parcel, a);
    }
}
