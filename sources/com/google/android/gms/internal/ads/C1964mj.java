package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.mj */
public final class C1964mj implements Parcelable {
    public static final Parcelable.Creator<C1964mj> CREATOR = new C1890kj();

    /* renamed from: f */
    private final C1927lj[] f10910f;

    C1964mj(Parcel parcel) {
        this.f10910f = new C1927lj[parcel.readInt()];
        int i = 0;
        while (true) {
            C1927lj[] ljVarArr = this.f10910f;
            if (i < ljVarArr.length) {
                ljVarArr[i] = (C1927lj) parcel.readParcelable(C1927lj.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }

    public C1964mj(List<? extends C1927lj> list) {
        C1927lj[] ljVarArr = new C1927lj[list.size()];
        this.f10910f = ljVarArr;
        list.toArray(ljVarArr);
    }

    /* renamed from: b */
    public final int mo9258b() {
        return this.f10910f.length;
    }

    /* renamed from: c */
    public final C1927lj mo9259c(int i) {
        return this.f10910f[i];
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1964mj.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f10910f, ((C1964mj) obj).f10910f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10910f);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f10910f.length);
        for (C1927lj writeParcelable : this.f10910f) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
