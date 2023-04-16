package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class xe4 implements b81 {
    public static final Parcelable.Creator<xe4> CREATOR = new we4();

    /* renamed from: l */
    private static final C1574c0 f17182l;

    /* renamed from: m */
    private static final C1574c0 f17183m;

    /* renamed from: f */
    public final String f17184f;

    /* renamed from: g */
    public final String f17185g;

    /* renamed from: h */
    public final long f17186h;

    /* renamed from: i */
    public final long f17187i;

    /* renamed from: j */
    public final byte[] f17188j;

    /* renamed from: k */
    private int f17189k;

    static {
        bf4 bf4 = new bf4();
        bf4.mo5842s("application/id3");
        f17182l = bf4.mo5848y();
        bf4 bf42 = new bf4();
        bf42.mo5842s("application/x-scte35");
        f17183m = bf42.mo5848y();
    }

    xe4(Parcel parcel) {
        String readString = parcel.readString();
        int i = n13.f11236a;
        this.f17184f = readString;
        this.f17185g = parcel.readString();
        this.f17186h = parcel.readLong();
        this.f17187i = parcel.readLong();
        this.f17188j = (byte[]) n13.m13626c(parcel.createByteArray());
    }

    public xe4(String str, String str2, long j, long j2, byte[] bArr) {
        this.f17184f = str;
        this.f17185g = str2;
        this.f17186h = j;
        this.f17187i = j2;
        this.f17188j = bArr;
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
        if (obj != null && xe4.class == obj.getClass()) {
            xe4 xe4 = (xe4) obj;
            return this.f17186h == xe4.f17186h && this.f17187i == xe4.f17187i && n13.m13643p(this.f17184f, xe4.f17184f) && n13.m13643p(this.f17185g, xe4.f17185g) && Arrays.equals(this.f17188j, xe4.f17188j);
        }
    }

    public final int hashCode() {
        int i = this.f17189k;
        if (i != 0) {
            return i;
        }
        String str = this.f17184f;
        int i2 = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f17185g;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        long j = this.f17186h;
        long j2 = this.f17187i;
        int hashCode2 = ((((((hashCode + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + Arrays.hashCode(this.f17188j);
        this.f17189k = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        String str = this.f17184f;
        long j = this.f17187i;
        long j2 = this.f17186h;
        String str2 = this.f17185g;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 79 + String.valueOf(str2).length());
        sb.append("EMSG: scheme=");
        sb.append(str);
        sb.append(", id=");
        sb.append(j);
        sb.append(", durationMs=");
        sb.append(j2);
        sb.append(", value=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17184f);
        parcel.writeString(this.f17185g);
        parcel.writeLong(this.f17186h);
        parcel.writeLong(this.f17187i);
        parcel.writeByteArray(this.f17188j);
    }
}
