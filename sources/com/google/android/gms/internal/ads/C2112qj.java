package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.qj */
public final class C2112qj extends C2186sj {
    public static final Parcelable.Creator<C2112qj> CREATOR = new C2075pj();

    /* renamed from: g */
    public final String f13192g;

    /* renamed from: h */
    public final String f13193h;

    /* renamed from: i */
    public final String f13194i;

    C2112qj(Parcel parcel) {
        super("COMM");
        this.f13192g = parcel.readString();
        this.f13193h = parcel.readString();
        this.f13194i = parcel.readString();
    }

    public C2112qj(String str, String str2, String str3) {
        super("COMM");
        this.f13192g = "und";
        this.f13193h = str2;
        this.f13194i = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2112qj.class == obj.getClass()) {
            C2112qj qjVar = (C2112qj) obj;
            return C2449zm.m20736o(this.f13193h, qjVar.f13193h) && C2449zm.m20736o(this.f13192g, qjVar.f13192g) && C2449zm.m20736o(this.f13194i, qjVar.f13194i);
        }
    }

    public final int hashCode() {
        String str = this.f13192g;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f13193h;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f13194i;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14464f);
        parcel.writeString(this.f13192g);
        parcel.writeString(this.f13194i);
    }
}
