package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

public final class u64 implements Parcelable {
    public static final Parcelable.Creator<u64> CREATOR = new t54();

    /* renamed from: f */
    private int f15435f;

    /* renamed from: g */
    public final UUID f15436g;

    /* renamed from: h */
    public final String f15437h;

    /* renamed from: i */
    public final String f15438i;

    /* renamed from: j */
    public final byte[] f15439j;

    u64(Parcel parcel) {
        this.f15436g = new UUID(parcel.readLong(), parcel.readLong());
        this.f15437h = parcel.readString();
        String readString = parcel.readString();
        int i = n13.f11236a;
        this.f15438i = readString;
        this.f15439j = parcel.createByteArray();
    }

    public u64(UUID uuid, String str, String str2, byte[] bArr) {
        Objects.requireNonNull(uuid);
        this.f15436g = uuid;
        this.f15437h = null;
        this.f15438i = str2;
        this.f15439j = bArr;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u64)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        u64 u64 = (u64) obj;
        return n13.m13643p(this.f15437h, u64.f15437h) && n13.m13643p(this.f15438i, u64.f15438i) && n13.m13643p(this.f15436g, u64.f15436g) && Arrays.equals(this.f15439j, u64.f15439j);
    }

    public final int hashCode() {
        int i = this.f15435f;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f15436g.hashCode() * 31;
        String str = this.f15437h;
        int hashCode2 = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f15438i.hashCode()) * 31) + Arrays.hashCode(this.f15439j);
        this.f15435f = hashCode2;
        return hashCode2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f15436g.getMostSignificantBits());
        parcel.writeLong(this.f15436g.getLeastSignificantBits());
        parcel.writeString(this.f15437h);
        parcel.writeString(this.f15438i);
        parcel.writeByteArray(this.f15439j);
    }
}
