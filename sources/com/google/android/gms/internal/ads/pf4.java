package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

public final class pf4 extends wf4 {
    public static final Parcelable.Creator<pf4> CREATOR = new of4();

    /* renamed from: g */
    public final String f12658g;

    /* renamed from: h */
    public final String f12659h;

    /* renamed from: i */
    public final String f12660i;

    pf4(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i = n13.f11236a;
        this.f12658g = readString;
        this.f12659h = parcel.readString();
        this.f12660i = parcel.readString();
    }

    public pf4(String str, String str2, String str3) {
        super("COMM");
        this.f12658g = str;
        this.f12659h = str2;
        this.f12660i = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pf4.class == obj.getClass()) {
            pf4 pf4 = (pf4) obj;
            return n13.m13643p(this.f12659h, pf4.f12659h) && n13.m13643p(this.f12658g, pf4.f12658g) && n13.m13643p(this.f12660i, pf4.f12660i);
        }
    }

    public final int hashCode() {
        String str = this.f12658g;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f12659h;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12660i;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String str = this.f16810f;
        String str2 = this.f12658g;
        String str3 = this.f12659h;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": language=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f16810f);
        parcel.writeString(this.f12658g);
        parcel.writeString(this.f12660i);
    }
}
