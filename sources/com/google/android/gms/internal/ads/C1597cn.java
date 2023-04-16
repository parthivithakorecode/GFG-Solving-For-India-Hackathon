package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.cn */
public final class C1597cn implements Parcelable {
    public static final Parcelable.Creator<C1597cn> CREATOR = new C1560bn();

    /* renamed from: f */
    public final int f5449f;

    /* renamed from: g */
    public final int f5450g;

    /* renamed from: h */
    public final int f5451h;

    /* renamed from: i */
    public final byte[] f5452i;

    /* renamed from: j */
    private int f5453j;

    public C1597cn(int i, int i2, int i3, byte[] bArr) {
        this.f5449f = i;
        this.f5450g = i2;
        this.f5451h = i3;
        this.f5452i = bArr;
    }

    C1597cn(Parcel parcel) {
        this.f5449f = parcel.readInt();
        this.f5450g = parcel.readInt();
        this.f5451h = parcel.readInt();
        this.f5452i = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1597cn.class == obj.getClass()) {
            C1597cn cnVar = (C1597cn) obj;
            return this.f5449f == cnVar.f5449f && this.f5450g == cnVar.f5450g && this.f5451h == cnVar.f5451h && Arrays.equals(this.f5452i, cnVar.f5452i);
        }
    }

    public final int hashCode() {
        int i = this.f5453j;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((this.f5449f + 527) * 31) + this.f5450g) * 31) + this.f5451h) * 31) + Arrays.hashCode(this.f5452i);
        this.f5453j = hashCode;
        return hashCode;
    }

    public final String toString() {
        int i = this.f5449f;
        int i2 = this.f5450g;
        int i3 = this.f5451h;
        boolean z = this.f5452i != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5449f);
        parcel.writeInt(this.f5450g);
        parcel.writeInt(this.f5451h);
        parcel.writeInt(this.f5452i != null ? 1 : 0);
        byte[] bArr = this.f5452i;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
