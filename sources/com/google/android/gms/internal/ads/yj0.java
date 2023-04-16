package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONArray;
import p003a2.C0089n;
import p013b2.C1298a;
import p013b2.C1301c;

public final class yj0 extends C1298a {
    public static final Parcelable.Creator<yj0> CREATOR = new zj0();

    /* renamed from: f */
    public final String f17763f;

    /* renamed from: g */
    public final int f17764g;

    public yj0(String str, int i) {
        this.f17763f = str;
        this.f17764g = i;
    }

    /* renamed from: c */
    public static yj0 m20048c(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new yj0(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof yj0)) {
            yj0 yj0 = (yj0) obj;
            return C0089n.m301a(this.f17763f, yj0.f17763f) && C0089n.m301a(Integer.valueOf(this.f17764g), Integer.valueOf(yj0.f17764g));
        }
    }

    public final int hashCode() {
        return C0089n.m302b(this.f17763f, Integer.valueOf(this.f17764g));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5225m(parcel, 2, this.f17763f, false);
        C1301c.m5220h(parcel, 3, this.f17764g);
        C1301c.m5214b(parcel, a);
    }
}
