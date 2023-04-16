package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.c */
public final class C1573c extends wf4 {
    public static final Parcelable.Creator<C1573c> CREATOR = new bg4();

    /* renamed from: g */
    public final String f5213g;

    /* renamed from: h */
    public final byte[] f5214h;

    C1573c(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i = n13.f11236a;
        this.f5213g = readString;
        this.f5214h = (byte[]) n13.m13626c(parcel.createByteArray());
    }

    public C1573c(String str, byte[] bArr) {
        super("PRIV");
        this.f5213g = str;
        this.f5214h = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1573c.class == obj.getClass()) {
            C1573c cVar = (C1573c) obj;
            return n13.m13643p(this.f5213g, cVar.f5213g) && Arrays.equals(this.f5214h, cVar.f5214h);
        }
    }

    public final int hashCode() {
        String str = this.f5213g;
        return (((str != null ? str.hashCode() : 0) + 527) * 31) + Arrays.hashCode(this.f5214h);
    }

    public final String toString() {
        String str = this.f16810f;
        String str2 = this.f5213g;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": owner=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5213g);
        parcel.writeByteArray(this.f5214h);
    }
}
