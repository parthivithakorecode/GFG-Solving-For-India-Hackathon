package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p013b2.C1298a;
import p013b2.C1301c;
import p069j1.C3138a1;

public final class jl0 extends C1298a {
    public static final Parcelable.Creator<jl0> CREATOR = new kl0();

    /* renamed from: f */
    public final String f9173f;

    /* renamed from: g */
    public final String f9174g;

    /* renamed from: h */
    public final boolean f9175h;

    /* renamed from: i */
    public final boolean f9176i;

    /* renamed from: j */
    public final List<String> f9177j;

    /* renamed from: k */
    public final boolean f9178k;

    /* renamed from: l */
    public final boolean f9179l;

    /* renamed from: m */
    public final List<String> f9180m;

    public jl0(String str, String str2, boolean z, boolean z2, List<String> list, boolean z3, boolean z4, List<String> list2) {
        this.f9173f = str;
        this.f9174g = str2;
        this.f9175h = z;
        this.f9176i = z2;
        this.f9177j = list;
        this.f9178k = z3;
        this.f9179l = z4;
        this.f9180m = list2 == null ? new ArrayList<>() : list2;
    }

    /* renamed from: c */
    public static jl0 m11709c(JSONObject jSONObject) {
        return new jl0(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), C3138a1.m23821c(jSONObject.optJSONArray("allowed_headers"), (List<String>) null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), C3138a1.m23821c(jSONObject.optJSONArray("webview_permissions"), (List<String>) null));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5225m(parcel, 2, this.f9173f, false);
        C1301c.m5225m(parcel, 3, this.f9174g, false);
        C1301c.m5215c(parcel, 4, this.f9175h);
        C1301c.m5215c(parcel, 5, this.f9176i);
        C1301c.m5227o(parcel, 6, this.f9177j, false);
        C1301c.m5215c(parcel, 7, this.f9178k);
        C1301c.m5215c(parcel, 8, this.f9179l);
        C1301c.m5227o(parcel, 9, this.f9180m, false);
        C1301c.m5214b(parcel, a);
    }
}
