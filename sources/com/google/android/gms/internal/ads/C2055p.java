package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.p */
public final class C2055p implements b81 {
    public static final Parcelable.Creator<C2055p> CREATOR = new C1981n();

    /* renamed from: f */
    public final float f12389f;

    /* renamed from: g */
    public final int f12390g;

    public C2055p(float f, int i) {
        this.f12389f = f;
        this.f12390g = i;
    }

    /* synthetic */ C2055p(Parcel parcel, C2018o oVar) {
        this.f12389f = parcel.readFloat();
        this.f12390g = parcel.readInt();
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
        if (obj != null && C2055p.class == obj.getClass()) {
            C2055p pVar = (C2055p) obj;
            return this.f12389f == pVar.f12389f && this.f12390g == pVar.f12390g;
        }
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f12389f).hashCode() + 527) * 31) + this.f12390g;
    }

    public final String toString() {
        float f = this.f12389f;
        int i = this.f12390g;
        StringBuilder sb = new StringBuilder(73);
        sb.append("smta: captureFrameRate=");
        sb.append(f);
        sb.append(", svcTemporalLayerCount=");
        sb.append(i);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f12389f);
        parcel.writeInt(this.f12390g);
    }
}
