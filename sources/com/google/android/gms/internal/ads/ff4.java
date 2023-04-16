package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

public final class ff4 implements b81 {
    public static final Parcelable.Creator<ff4> CREATOR = new ef4();

    /* renamed from: f */
    public final int f6813f;

    /* renamed from: g */
    public final String f6814g;

    /* renamed from: h */
    public final String f6815h;

    /* renamed from: i */
    public final String f6816i;

    /* renamed from: j */
    public final boolean f6817j;

    /* renamed from: k */
    public final int f6818k;

    public ff4(int i, String str, String str2, String str3, boolean z, int i2) {
        boolean z2 = true;
        if (i2 != -1 && i2 <= 0) {
            z2 = false;
        }
        wu1.m19205d(z2);
        this.f6813f = i;
        this.f6814g = str;
        this.f6815h = str2;
        this.f6816i = str3;
        this.f6817j = z;
        this.f6818k = i2;
    }

    ff4(Parcel parcel) {
        this.f6813f = parcel.readInt();
        this.f6814g = parcel.readString();
        this.f6815h = parcel.readString();
        this.f6816i = parcel.readString();
        this.f6817j = n13.m13649v(parcel);
        this.f6818k = parcel.readInt();
    }

    /* renamed from: a */
    public final /* synthetic */ void mo5272a(C1639ds dsVar) {
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ff4.class == obj.getClass()) {
            ff4 ff4 = (ff4) obj;
            return this.f6813f == ff4.f6813f && n13.m13643p(this.f6814g, ff4.f6814g) && n13.m13643p(this.f6815h, ff4.f6815h) && n13.m13643p(this.f6816i, ff4.f6816i) && this.f6817j == ff4.f6817j && this.f6818k == ff4.f6818k;
        }
    }

    public final int hashCode() {
        int i = (this.f6813f + 527) * 31;
        String str = this.f6814g;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6815h;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6816i;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return ((((hashCode2 + i2) * 31) + (this.f6817j ? 1 : 0)) * 31) + this.f6818k;
    }

    public final String toString() {
        String str = this.f6815h;
        String str2 = this.f6814g;
        int i = this.f6813f;
        int i2 = this.f6818k;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 80 + String.valueOf(str2).length());
        sb.append("IcyHeaders: name=\"");
        sb.append(str);
        sb.append("\", genre=\"");
        sb.append(str2);
        sb.append("\", bitrate=");
        sb.append(i);
        sb.append(", metadataInterval=");
        sb.append(i2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f6813f);
        parcel.writeString(this.f6814g);
        parcel.writeString(this.f6815h);
        parcel.writeString(this.f6816i);
        n13.m13642o(parcel, this.f6817j);
        parcel.writeInt(this.f6818k);
    }
}
