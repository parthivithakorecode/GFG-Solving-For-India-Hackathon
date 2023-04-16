package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class af4 implements b81 {
    public static final Parcelable.Creator<af4> CREATOR = new ze4();

    /* renamed from: f */
    public final int f4089f;

    /* renamed from: g */
    public final String f4090g;

    /* renamed from: h */
    public final String f4091h;

    /* renamed from: i */
    public final int f4092i;

    /* renamed from: j */
    public final int f4093j;

    /* renamed from: k */
    public final int f4094k;

    /* renamed from: l */
    public final int f4095l;

    /* renamed from: m */
    public final byte[] f4096m;

    public af4(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f4089f = i;
        this.f4090g = str;
        this.f4091h = str2;
        this.f4092i = i2;
        this.f4093j = i3;
        this.f4094k = i4;
        this.f4095l = i5;
        this.f4096m = bArr;
    }

    af4(Parcel parcel) {
        this.f4089f = parcel.readInt();
        String readString = parcel.readString();
        int i = n13.f11236a;
        this.f4090g = readString;
        this.f4091h = parcel.readString();
        this.f4092i = parcel.readInt();
        this.f4093j = parcel.readInt();
        this.f4094k = parcel.readInt();
        this.f4095l = parcel.readInt();
        this.f4096m = (byte[]) n13.m13626c(parcel.createByteArray());
    }

    /* renamed from: a */
    public final void mo5272a(C1639ds dsVar) {
        dsVar.mo6603k(this.f4096m, this.f4089f);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && af4.class == obj.getClass()) {
            af4 af4 = (af4) obj;
            return this.f4089f == af4.f4089f && this.f4090g.equals(af4.f4090g) && this.f4091h.equals(af4.f4091h) && this.f4092i == af4.f4092i && this.f4093j == af4.f4093j && this.f4094k == af4.f4094k && this.f4095l == af4.f4095l && Arrays.equals(this.f4096m, af4.f4096m);
        }
    }

    public final int hashCode() {
        return ((((((((((((((this.f4089f + 527) * 31) + this.f4090g.hashCode()) * 31) + this.f4091h.hashCode()) * 31) + this.f4092i) * 31) + this.f4093j) * 31) + this.f4094k) * 31) + this.f4095l) * 31) + Arrays.hashCode(this.f4096m);
    }

    public final String toString() {
        String str = this.f4090g;
        String str2 = this.f4091h;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(str2).length());
        sb.append("Picture: mimeType=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f4089f);
        parcel.writeString(this.f4090g);
        parcel.writeString(this.f4091h);
        parcel.writeInt(this.f4092i);
        parcel.writeInt(this.f4093j);
        parcel.writeInt(this.f4094k);
        parcel.writeInt(this.f4095l);
        parcel.writeByteArray(this.f4096m);
    }
}
