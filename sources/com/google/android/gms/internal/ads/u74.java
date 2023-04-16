package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public final class u74 implements Comparator<u64>, Parcelable {
    public static final Parcelable.Creator<u74> CREATOR = new s44();

    /* renamed from: f */
    private final u64[] f15444f;

    /* renamed from: g */
    private int f15445g;

    /* renamed from: h */
    public final String f15446h;

    u74(Parcel parcel) {
        this.f15446h = parcel.readString();
        u64[] u64Arr = (u64[]) n13.m13626c((u64[]) parcel.createTypedArray(u64.CREATOR));
        this.f15444f = u64Arr;
        int length = u64Arr.length;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.google.android.gms.internal.ads.u64[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private u74(java.lang.String r1, boolean r2, com.google.android.gms.internal.ads.u64... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.f15446h = r1
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r3.clone()
            r3 = r1
            com.google.android.gms.internal.ads.u64[] r3 = (com.google.android.gms.internal.ads.u64[]) r3
        L_0x000e:
            r0.f15444f = r3
            int r1 = r3.length
            java.util.Arrays.sort(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.u74.<init>(java.lang.String, boolean, com.google.android.gms.internal.ads.u64[]):void");
    }

    public u74(String str, u64... u64Arr) {
        this((String) null, true, u64Arr);
    }

    public u74(List<u64> list) {
        this((String) null, false, (u64[]) list.toArray(new u64[0]));
    }

    /* renamed from: b */
    public final u74 mo11184b(String str) {
        return n13.m13643p(this.f15446h, str) ? this : new u74(str, false, this.f15444f);
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        u64 u64 = (u64) obj;
        u64 u642 = (u64) obj2;
        UUID uuid = nz3.f11781a;
        return uuid.equals(u64.f15436g) ? !uuid.equals(u642.f15436g) ? 1 : 0 : u64.f15436g.compareTo(u642.f15436g);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u74.class == obj.getClass()) {
            u74 u74 = (u74) obj;
            return n13.m13643p(this.f15446h, u74.f15446h) && Arrays.equals(this.f15444f, u74.f15444f);
        }
    }

    public final int hashCode() {
        int i = this.f15445g;
        if (i != 0) {
            return i;
        }
        String str = this.f15446h;
        int hashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f15444f);
        this.f15445g = hashCode;
        return hashCode;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f15446h);
        parcel.writeTypedArray(this.f15444f, 0);
    }
}
