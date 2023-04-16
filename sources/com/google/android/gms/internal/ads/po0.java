package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1298a;
import p013b2.C1301c;
import p160x1.C4288j;

public final class po0 extends C1298a {
    public static final Parcelable.Creator<po0> CREATOR = new qo0();

    /* renamed from: f */
    public String f12729f;

    /* renamed from: g */
    public int f12730g;

    /* renamed from: h */
    public int f12731h;

    /* renamed from: i */
    public boolean f12732i;

    /* renamed from: j */
    public boolean f12733j;

    public po0(int i, int i2, boolean z, boolean z2) {
        this(214106000, i2, true, false, false);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public po0(int r8, int r9, boolean r10, boolean r11, boolean r12) {
        /*
            r7 = this;
            if (r10 == 0) goto L_0x0005
            java.lang.String r11 = "0"
            goto L_0x0007
        L_0x0005:
            java.lang.String r11 = "1"
        L_0x0007:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            int r0 = r11.length()
            int r0 = r0 + 36
            r12.<init>(r0)
            java.lang.String r0 = "afma-sdk-a-v"
            r12.append(r0)
            r12.append(r8)
            java.lang.String r0 = "."
            r12.append(r0)
            r12.append(r9)
            r12.append(r0)
            r12.append(r11)
            java.lang.String r2 = r12.toString()
            r6 = 0
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r1.<init>((java.lang.String) r2, (int) r3, (int) r4, (boolean) r5, (boolean) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.po0.<init>(int, int, boolean, boolean, boolean):void");
    }

    po0(String str, int i, int i2, boolean z, boolean z2) {
        this.f12729f = str;
        this.f12730g = i;
        this.f12731h = i2;
        this.f12732i = z;
        this.f12733j = z2;
    }

    /* renamed from: c */
    public static po0 m15177c() {
        return new po0((int) C4288j.f22593a, (int) C4288j.f22593a, true, false, false);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5225m(parcel, 2, this.f12729f, false);
        C1301c.m5220h(parcel, 3, this.f12730g);
        C1301c.m5220h(parcel, 4, this.f12731h);
        C1301c.m5215c(parcel, 5, this.f12732i);
        C1301c.m5215c(parcel, 6, this.f12733j);
        C1301c.m5214b(parcel, a);
    }
}
