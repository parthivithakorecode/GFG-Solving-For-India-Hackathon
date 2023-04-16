package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.xg */
public final class C2369xg implements Parcelable {
    public static final Parcelable.Creator<C2369xg> CREATOR = new C2332wg();

    /* renamed from: f */
    private int f17192f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final UUID f17193g;

    /* renamed from: h */
    public final String f17194h;

    /* renamed from: i */
    public final byte[] f17195i;

    /* renamed from: j */
    public final boolean f17196j;

    C2369xg(Parcel parcel) {
        this.f17193g = new UUID(parcel.readLong(), parcel.readLong());
        this.f17194h = parcel.readString();
        this.f17195i = parcel.createByteArray();
        this.f17196j = parcel.readByte() != 0;
    }

    public C2369xg(UUID uuid, String str, byte[] bArr, boolean z) {
        Objects.requireNonNull(uuid);
        this.f17193g = uuid;
        this.f17194h = str;
        Objects.requireNonNull(bArr);
        this.f17195i = bArr;
        this.f17196j = false;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2369xg)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C2369xg xgVar = (C2369xg) obj;
        return this.f17194h.equals(xgVar.f17194h) && C2449zm.m20736o(this.f17193g, xgVar.f17193g) && Arrays.equals(this.f17195i, xgVar.f17195i);
    }

    public final int hashCode() {
        int i = this.f17192f;
        if (i != 0) {
            return i;
        }
        int hashCode = (((this.f17193g.hashCode() * 31) + this.f17194h.hashCode()) * 31) + Arrays.hashCode(this.f17195i);
        this.f17192f = hashCode;
        return hashCode;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f17193g.getMostSignificantBits());
        parcel.writeLong(this.f17193g.getLeastSignificantBits());
        parcel.writeString(this.f17194h);
        parcel.writeByteArray(this.f17195i);
        parcel.writeByte(this.f17196j ? (byte) 1 : 0);
    }
}
