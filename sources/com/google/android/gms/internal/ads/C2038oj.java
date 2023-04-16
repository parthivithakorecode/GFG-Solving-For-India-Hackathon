package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.oj */
public final class C2038oj extends C2186sj {
    public static final Parcelable.Creator<C2038oj> CREATOR = new C2001nj();

    /* renamed from: g */
    public final String f12060g;

    /* renamed from: h */
    public final String f12061h;

    /* renamed from: i */
    public final int f12062i;

    /* renamed from: j */
    public final byte[] f12063j;

    C2038oj(Parcel parcel) {
        super("APIC");
        this.f12060g = parcel.readString();
        this.f12061h = parcel.readString();
        this.f12062i = parcel.readInt();
        this.f12063j = parcel.createByteArray();
    }

    public C2038oj(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f12060g = str;
        this.f12061h = null;
        this.f12062i = 3;
        this.f12063j = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2038oj.class == obj.getClass()) {
            C2038oj ojVar = (C2038oj) obj;
            return this.f12062i == ojVar.f12062i && C2449zm.m20736o(this.f12060g, ojVar.f12060g) && C2449zm.m20736o(this.f12061h, ojVar.f12061h) && Arrays.equals(this.f12063j, ojVar.f12063j);
        }
    }

    public final int hashCode() {
        int i = (this.f12062i + 527) * 31;
        String str = this.f12060g;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12061h;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.f12063j);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12060g);
        parcel.writeString(this.f12061h);
        parcel.writeInt(this.f12062i);
        parcel.writeByteArray(this.f12063j);
    }
}
