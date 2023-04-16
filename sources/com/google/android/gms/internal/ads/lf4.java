package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class lf4 extends wf4 {
    public static final Parcelable.Creator<lf4> CREATOR = new kf4();

    /* renamed from: g */
    public final String f10027g;

    /* renamed from: h */
    public final int f10028h;

    /* renamed from: i */
    public final int f10029i;

    /* renamed from: j */
    public final long f10030j;

    /* renamed from: k */
    public final long f10031k;

    /* renamed from: l */
    private final wf4[] f10032l;

    lf4(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i = n13.f11236a;
        this.f10027g = readString;
        this.f10028h = parcel.readInt();
        this.f10029i = parcel.readInt();
        this.f10030j = parcel.readLong();
        this.f10031k = parcel.readLong();
        int readInt = parcel.readInt();
        this.f10032l = new wf4[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f10032l[i2] = (wf4) parcel.readParcelable(wf4.class.getClassLoader());
        }
    }

    public lf4(String str, int i, int i2, long j, long j2, wf4[] wf4Arr) {
        super("CHAP");
        this.f10027g = str;
        this.f10028h = i;
        this.f10029i = i2;
        this.f10030j = j;
        this.f10031k = j2;
        this.f10032l = wf4Arr;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lf4.class == obj.getClass()) {
            lf4 lf4 = (lf4) obj;
            return this.f10028h == lf4.f10028h && this.f10029i == lf4.f10029i && this.f10030j == lf4.f10030j && this.f10031k == lf4.f10031k && n13.m13643p(this.f10027g, lf4.f10027g) && Arrays.equals(this.f10032l, lf4.f10032l);
        }
    }

    public final int hashCode() {
        int i = (((((((this.f10028h + 527) * 31) + this.f10029i) * 31) + ((int) this.f10030j)) * 31) + ((int) this.f10031k)) * 31;
        String str = this.f10027g;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10027g);
        parcel.writeInt(this.f10028h);
        parcel.writeInt(this.f10029i);
        parcel.writeLong(this.f10030j);
        parcel.writeLong(this.f10031k);
        parcel.writeInt(this.f10032l.length);
        for (wf4 writeParcelable : this.f10032l) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
