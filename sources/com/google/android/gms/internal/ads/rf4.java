package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class rf4 extends wf4 {
    public static final Parcelable.Creator<rf4> CREATOR = new qf4();

    /* renamed from: g */
    public final String f13625g;

    /* renamed from: h */
    public final String f13626h;

    /* renamed from: i */
    public final String f13627i;

    /* renamed from: j */
    public final byte[] f13628j;

    rf4(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i = n13.f11236a;
        this.f13625g = readString;
        this.f13626h = parcel.readString();
        this.f13627i = parcel.readString();
        this.f13628j = (byte[]) n13.m13626c(parcel.createByteArray());
    }

    public rf4(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f13625g = str;
        this.f13626h = str2;
        this.f13627i = str3;
        this.f13628j = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rf4.class == obj.getClass()) {
            rf4 rf4 = (rf4) obj;
            return n13.m13643p(this.f13625g, rf4.f13625g) && n13.m13643p(this.f13626h, rf4.f13626h) && n13.m13643p(this.f13627i, rf4.f13627i) && Arrays.equals(this.f13628j, rf4.f13628j);
        }
    }

    public final int hashCode() {
        String str = this.f13625g;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f13626h;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f13627i;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + Arrays.hashCode(this.f13628j);
    }

    public final String toString() {
        String str = this.f16810f;
        String str2 = this.f13625g;
        String str3 = this.f13626h;
        String str4 = this.f13627i;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 36 + length2 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", filename=");
        sb.append(str3);
        sb.append(", description=");
        sb.append(str4);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13625g);
        parcel.writeString(this.f13626h);
        parcel.writeString(this.f13627i);
        parcel.writeByteArray(this.f13628j);
    }
}
