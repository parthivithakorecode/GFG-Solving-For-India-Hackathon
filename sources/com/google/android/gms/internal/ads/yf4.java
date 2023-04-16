package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

public final class yf4 extends wf4 {
    public static final Parcelable.Creator<yf4> CREATOR = new xf4();

    /* renamed from: g */
    public final String f17726g;

    /* renamed from: h */
    public final String f17727h;

    /* renamed from: i */
    public final String f17728i;

    yf4(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i = n13.f11236a;
        this.f17726g = readString;
        this.f17727h = parcel.readString();
        this.f17728i = parcel.readString();
    }

    public yf4(String str, String str2, String str3) {
        super("----");
        this.f17726g = str;
        this.f17727h = str2;
        this.f17728i = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yf4.class == obj.getClass()) {
            yf4 yf4 = (yf4) obj;
            return n13.m13643p(this.f17727h, yf4.f17727h) && n13.m13643p(this.f17726g, yf4.f17726g) && n13.m13643p(this.f17728i, yf4.f17728i);
        }
    }

    public final int hashCode() {
        String str = this.f17726g;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f17727h;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f17728i;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String str = this.f16810f;
        String str2 = this.f17726g;
        String str3 = this.f17727h;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 23 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": domain=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f16810f);
        parcel.writeString(this.f17726g);
        parcel.writeString(this.f17728i);
    }
}
