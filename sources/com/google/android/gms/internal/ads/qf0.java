package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import javax.annotation.ParametersAreNonnullByDefault;
import p013b2.C1298a;
import p013b2.C1301c;
import p083l1.C3466w;

@ParametersAreNonnullByDefault
public final class qf0 extends C1298a {
    public static final Parcelable.Creator<qf0> CREATOR = new rf0();

    /* renamed from: f */
    public final int f13150f;

    /* renamed from: g */
    public final int f13151g;

    /* renamed from: h */
    public final int f13152h;

    qf0(int i, int i2, int i3) {
        this.f13150f = i;
        this.f13151g = i2;
        this.f13152h = i3;
    }

    /* renamed from: c */
    public static qf0 m15609c(C3466w wVar) {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof qf0)) {
            qf0 qf0 = (qf0) obj;
            return qf0.f13152h == this.f13152h && qf0.f13151g == this.f13151g && qf0.f13150f == this.f13150f;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f13150f, this.f13151g, this.f13152h});
    }

    public final String toString() {
        int i = this.f13150f;
        int i2 = this.f13151g;
        int i3 = this.f13152h;
        StringBuilder sb = new StringBuilder(35);
        sb.append(i);
        sb.append(".");
        sb.append(i2);
        sb.append(".");
        sb.append(i3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5220h(parcel, 1, this.f13150f);
        C1301c.m5220h(parcel, 2, this.f13151g);
        C1301c.m5220h(parcel, 3, this.f13152h);
        C1301c.m5214b(parcel, a);
    }
}
