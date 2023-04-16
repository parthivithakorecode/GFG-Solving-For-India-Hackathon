package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class nf4 extends wf4 {
    public static final Parcelable.Creator<nf4> CREATOR = new mf4();

    /* renamed from: g */
    public final String f11446g;

    /* renamed from: h */
    public final boolean f11447h;

    /* renamed from: i */
    public final boolean f11448i;

    /* renamed from: j */
    public final String[] f11449j;

    /* renamed from: k */
    private final wf4[] f11450k;

    nf4(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i = n13.f11236a;
        this.f11446g = readString;
        boolean z = true;
        this.f11447h = parcel.readByte() != 0;
        this.f11448i = parcel.readByte() == 0 ? false : z;
        this.f11449j = (String[]) n13.m13626c(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f11450k = new wf4[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f11450k[i2] = (wf4) parcel.readParcelable(wf4.class.getClassLoader());
        }
    }

    public nf4(String str, boolean z, boolean z2, String[] strArr, wf4[] wf4Arr) {
        super("CTOC");
        this.f11446g = str;
        this.f11447h = z;
        this.f11448i = z2;
        this.f11449j = strArr;
        this.f11450k = wf4Arr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nf4.class == obj.getClass()) {
            nf4 nf4 = (nf4) obj;
            return this.f11447h == nf4.f11447h && this.f11448i == nf4.f11448i && n13.m13643p(this.f11446g, nf4.f11446g) && Arrays.equals(this.f11449j, nf4.f11449j) && Arrays.equals(this.f11450k, nf4.f11450k);
        }
    }

    public final int hashCode() {
        int i = ((((this.f11447h ? 1 : 0) + true) * 31) + (this.f11448i ? 1 : 0)) * 31;
        String str = this.f11446g;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11446g);
        parcel.writeByte(this.f11447h ? (byte) 1 : 0);
        parcel.writeByte(this.f11448i ? (byte) 1 : 0);
        parcel.writeStringArray(this.f11449j);
        parcel.writeInt(this.f11450k.length);
        for (wf4 writeParcelable : this.f11450k) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
