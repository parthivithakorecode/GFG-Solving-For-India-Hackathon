package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.m */
public final class C1944m implements b81 {
    public static final Parcelable.Creator<C1944m> CREATOR = new C1870k();

    /* renamed from: f */
    public final long f10215f;

    /* renamed from: g */
    public final long f10216g;

    /* renamed from: h */
    public final long f10217h;

    /* renamed from: i */
    public final long f10218i;

    /* renamed from: j */
    public final long f10219j;

    public C1944m(long j, long j2, long j3, long j4, long j5) {
        this.f10215f = j;
        this.f10216g = j2;
        this.f10217h = j3;
        this.f10218i = j4;
        this.f10219j = j5;
    }

    /* synthetic */ C1944m(Parcel parcel, C1907l lVar) {
        this.f10215f = parcel.readLong();
        this.f10216g = parcel.readLong();
        this.f10217h = parcel.readLong();
        this.f10218i = parcel.readLong();
        this.f10219j = parcel.readLong();
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
        if (obj != null && C1944m.class == obj.getClass()) {
            C1944m mVar = (C1944m) obj;
            return this.f10215f == mVar.f10215f && this.f10216g == mVar.f10216g && this.f10217h == mVar.f10217h && this.f10218i == mVar.f10218i && this.f10219j == mVar.f10219j;
        }
    }

    public final int hashCode() {
        long j = this.f10215f;
        long j2 = this.f10216g;
        long j3 = this.f10217h;
        long j4 = this.f10218i;
        long j5 = this.f10219j;
        return ((((((((((int) (j ^ (j >>> 32))) + 527) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31) + ((int) ((j5 >>> 32) ^ j5));
    }

    public final String toString() {
        long j = this.f10215f;
        long j2 = this.f10216g;
        long j3 = this.f10217h;
        long j4 = this.f10218i;
        long j5 = this.f10219j;
        StringBuilder sb = new StringBuilder(218);
        sb.append("Motion photo metadata: photoStartPosition=");
        sb.append(j);
        sb.append(", photoSize=");
        sb.append(j2);
        sb.append(", photoPresentationTimestampUs=");
        sb.append(j3);
        sb.append(", videoStartPosition=");
        sb.append(j4);
        sb.append(", videoSize=");
        sb.append(j5);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f10215f);
        parcel.writeLong(this.f10216g);
        parcel.writeLong(this.f10217h);
        parcel.writeLong(this.f10218i);
        parcel.writeLong(this.f10219j);
    }
}
