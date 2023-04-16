package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.j */
public final class C1833j implements b81 {
    public static final Parcelable.Creator<C1833j> CREATOR = new C1759h();

    /* renamed from: f */
    public final String f8885f;

    /* renamed from: g */
    public final byte[] f8886g;

    /* renamed from: h */
    public final int f8887h;

    /* renamed from: i */
    public final int f8888i;

    /* synthetic */ C1833j(Parcel parcel, C1796i iVar) {
        String readString = parcel.readString();
        int i = n13.f11236a;
        this.f8885f = readString;
        this.f8886g = (byte[]) n13.m13626c(parcel.createByteArray());
        this.f8887h = parcel.readInt();
        this.f8888i = parcel.readInt();
    }

    public C1833j(String str, byte[] bArr, int i, int i2) {
        this.f8885f = str;
        this.f8886g = bArr;
        this.f8887h = i;
        this.f8888i = i2;
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
        if (obj != null && C1833j.class == obj.getClass()) {
            C1833j jVar = (C1833j) obj;
            return this.f8885f.equals(jVar.f8885f) && Arrays.equals(this.f8886g, jVar.f8886g) && this.f8887h == jVar.f8887h && this.f8888i == jVar.f8888i;
        }
    }

    public final int hashCode() {
        return ((((((this.f8885f.hashCode() + 527) * 31) + Arrays.hashCode(this.f8886g)) * 31) + this.f8887h) * 31) + this.f8888i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8885f);
        return valueOf.length() != 0 ? "mdta: key=".concat(valueOf) : new String("mdta: key=");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8885f);
        parcel.writeByteArray(this.f8886g);
        parcel.writeInt(this.f8887h);
        parcel.writeInt(this.f8888i);
    }
}
