package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class jf4 extends wf4 {
    public static final Parcelable.Creator<jf4> CREATOR = new if4();

    /* renamed from: g */
    public final byte[] f9129g;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    jf4(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.android.gms.internal.ads.n13.f11236a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            java.lang.Object r3 = com.google.android.gms.internal.ads.n13.m13626c(r3)
            byte[] r3 = (byte[]) r3
            r2.f9129g = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jf4.<init>(android.os.Parcel):void");
    }

    public jf4(String str, byte[] bArr) {
        super(str);
        this.f9129g = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jf4.class == obj.getClass()) {
            jf4 jf4 = (jf4) obj;
            return this.f16810f.equals(jf4.f16810f) && Arrays.equals(this.f9129g, jf4.f9129g);
        }
    }

    public final int hashCode() {
        return ((this.f16810f.hashCode() + 527) * 31) + Arrays.hashCode(this.f9129g);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f16810f);
        parcel.writeByteArray(this.f9129g);
    }
}
