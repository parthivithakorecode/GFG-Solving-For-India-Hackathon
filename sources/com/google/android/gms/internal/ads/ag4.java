package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class ag4 extends wf4 {
    public static final Parcelable.Creator<ag4> CREATOR = new zf4();

    /* renamed from: g */
    public final int f4102g;

    /* renamed from: h */
    public final int f4103h;

    /* renamed from: i */
    public final int f4104i;

    /* renamed from: j */
    public final int[] f4105j;

    /* renamed from: k */
    public final int[] f4106k;

    public ag4(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f4102g = i;
        this.f4103h = i2;
        this.f4104i = i3;
        this.f4105j = iArr;
        this.f4106k = iArr2;
    }

    ag4(Parcel parcel) {
        super("MLLT");
        this.f4102g = parcel.readInt();
        this.f4103h = parcel.readInt();
        this.f4104i = parcel.readInt();
        this.f4105j = (int[]) n13.m13626c(parcel.createIntArray());
        this.f4106k = (int[]) n13.m13626c(parcel.createIntArray());
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ag4.class == obj.getClass()) {
            ag4 ag4 = (ag4) obj;
            return this.f4102g == ag4.f4102g && this.f4103h == ag4.f4103h && this.f4104i == ag4.f4104i && Arrays.equals(this.f4105j, ag4.f4105j) && Arrays.equals(this.f4106k, ag4.f4106k);
        }
    }

    public final int hashCode() {
        return ((((((((this.f4102g + 527) * 31) + this.f4103h) * 31) + this.f4104i) * 31) + Arrays.hashCode(this.f4105j)) * 31) + Arrays.hashCode(this.f4106k);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f4102g);
        parcel.writeInt(this.f4103h);
        parcel.writeInt(this.f4104i);
        parcel.writeIntArray(this.f4105j);
        parcel.writeIntArray(this.f4106k);
    }
}
