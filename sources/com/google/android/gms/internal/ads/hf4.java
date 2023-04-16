package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class hf4 extends wf4 {
    public static final Parcelable.Creator<hf4> CREATOR = new gf4();

    /* renamed from: g */
    public final String f8202g;

    /* renamed from: h */
    public final String f8203h;

    /* renamed from: i */
    public final int f8204i;

    /* renamed from: j */
    public final byte[] f8205j;

    hf4(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i = n13.f11236a;
        this.f8202g = readString;
        this.f8203h = parcel.readString();
        this.f8204i = parcel.readInt();
        this.f8205j = (byte[]) n13.m13626c(parcel.createByteArray());
    }

    public hf4(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f8202g = str;
        this.f8203h = str2;
        this.f8204i = i;
        this.f8205j = bArr;
    }

    /* renamed from: a */
    public final void mo5272a(C1639ds dsVar) {
        dsVar.mo6603k(this.f8205j, this.f8204i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hf4.class == obj.getClass()) {
            hf4 hf4 = (hf4) obj;
            return this.f8204i == hf4.f8204i && n13.m13643p(this.f8202g, hf4.f8202g) && n13.m13643p(this.f8203h, hf4.f8203h) && Arrays.equals(this.f8205j, hf4.f8205j);
        }
    }

    public final int hashCode() {
        int i = (this.f8204i + 527) * 31;
        String str = this.f8202g;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8203h;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.f8205j);
    }

    public final String toString() {
        String str = this.f16810f;
        String str2 = this.f8202g;
        String str3 = this.f8203h;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8202g);
        parcel.writeString(this.f8203h);
        parcel.writeInt(this.f8204i);
        parcel.writeByteArray(this.f8205j);
    }
}
