package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

public final class df4 implements b81 {
    public static final Parcelable.Creator<df4> CREATOR = new cf4();

    /* renamed from: f */
    public final String f5794f;

    /* renamed from: g */
    public final String f5795g;

    df4(Parcel parcel) {
        String readString = parcel.readString();
        int i = n13.f11236a;
        this.f5794f = readString;
        this.f5795g = parcel.readString();
    }

    public df4(String str, String str2) {
        this.f5794f = str;
        this.f5795g = str2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5272a(com.google.android.gms.internal.ads.C1639ds r7) {
        /*
            r6 = this;
            java.lang.String r0 = r6.f5794f
            int r1 = r0.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r1) {
                case 62359119: goto L_0x0036;
                case 79833656: goto L_0x002c;
                case 428414940: goto L_0x0022;
                case 1746739798: goto L_0x0018;
                case 1939198791: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0040
        L_0x000e:
            java.lang.String r1 = "ARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = r5
            goto L_0x0041
        L_0x0018:
            java.lang.String r1 = "ALBUMARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = r3
            goto L_0x0041
        L_0x0022:
            java.lang.String r1 = "DESCRIPTION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = r2
            goto L_0x0041
        L_0x002c:
            java.lang.String r1 = "TITLE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = 0
            goto L_0x0041
        L_0x0036:
            java.lang.String r1 = "ALBUM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = r4
            goto L_0x0041
        L_0x0040:
            r0 = -1
        L_0x0041:
            if (r0 == 0) goto L_0x0064
            if (r0 == r5) goto L_0x005e
            if (r0 == r4) goto L_0x0058
            if (r0 == r3) goto L_0x0052
            if (r0 == r2) goto L_0x004c
            return
        L_0x004c:
            java.lang.String r0 = r6.f5795g
            r7.mo6609q(r0)
            return
        L_0x0052:
            java.lang.String r0 = r6.f5795g
            r7.mo6604l(r0)
            return
        L_0x0058:
            java.lang.String r0 = r6.f5795g
            r7.mo6605m(r0)
            return
        L_0x005e:
            java.lang.String r0 = r6.f5795g
            r7.mo6606n(r0)
            return
        L_0x0064:
            java.lang.String r0 = r6.f5795g
            r7.mo6616x(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.df4.mo5272a(com.google.android.gms.internal.ads.ds):void");
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && df4.class == obj.getClass()) {
            df4 df4 = (df4) obj;
            return this.f5794f.equals(df4.f5794f) && this.f5795g.equals(df4.f5795g);
        }
    }

    public final int hashCode() {
        return ((this.f5794f.hashCode() + 527) * 31) + this.f5795g.hashCode();
    }

    public final String toString() {
        String str = this.f5794f;
        String str2 = this.f5795g;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length());
        sb.append("VC: ");
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5794f);
        parcel.writeString(this.f5795g);
    }
}
