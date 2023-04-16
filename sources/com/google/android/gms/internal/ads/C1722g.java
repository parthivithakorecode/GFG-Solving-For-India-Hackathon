package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.g */
public final class C1722g extends wf4 {
    public static final Parcelable.Creator<C1722g> CREATOR = new C1685f();

    /* renamed from: g */
    public final String f7214g;

    /* renamed from: h */
    public final String f7215h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C1722g(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.android.gms.internal.ads.n13.f11236a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f7214g = r0
            java.lang.String r3 = r3.readString()
            r2.f7215h = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1722g.<init>(android.os.Parcel):void");
    }

    public C1722g(String str, String str2, String str3) {
        super(str);
        this.f7214g = str2;
        this.f7215h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1722g.class == obj.getClass()) {
            C1722g gVar = (C1722g) obj;
            return this.f16810f.equals(gVar.f16810f) && n13.m13643p(this.f7214g, gVar.f7214g) && n13.m13643p(this.f7215h, gVar.f7215h);
        }
    }

    public final int hashCode() {
        int hashCode = (this.f16810f.hashCode() + 527) * 31;
        String str = this.f7214g;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7215h;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String str = this.f16810f;
        String str2 = this.f7215h;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": url=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f16810f);
        parcel.writeString(this.f7214g);
        parcel.writeString(this.f7215h);
    }
}
