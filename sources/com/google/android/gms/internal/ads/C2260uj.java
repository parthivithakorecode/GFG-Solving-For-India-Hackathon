package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.uj */
public final class C2260uj extends C2186sj {
    public static final Parcelable.Creator<C2260uj> CREATOR = new C2223tj();

    /* renamed from: g */
    public final String f15607g;

    /* renamed from: h */
    public final String f15608h;

    C2260uj(Parcel parcel) {
        super(parcel.readString());
        this.f15607g = parcel.readString();
        this.f15608h = parcel.readString();
    }

    public C2260uj(String str, String str2, String str3) {
        super(str);
        this.f15607g = null;
        this.f15608h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2260uj.class == obj.getClass()) {
            C2260uj ujVar = (C2260uj) obj;
            return this.f14464f.equals(ujVar.f14464f) && C2449zm.m20736o(this.f15607g, ujVar.f15607g) && C2449zm.m20736o(this.f15608h, ujVar.f15608h);
        }
    }

    public final int hashCode() {
        int hashCode = (this.f14464f.hashCode() + 527) * 31;
        String str = this.f15607g;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f15608h;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14464f);
        parcel.writeString(this.f15607g);
        parcel.writeString(this.f15608h);
    }
}
