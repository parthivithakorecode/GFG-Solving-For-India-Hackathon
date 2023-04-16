package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.yg */
public final class C2406yg implements Comparator<C2369xg>, Parcelable {
    public static final Parcelable.Creator<C2406yg> CREATOR = new C2294vg();

    /* renamed from: f */
    private final C2369xg[] f17729f;

    /* renamed from: g */
    private int f17730g;

    /* renamed from: h */
    public final int f17731h;

    C2406yg(Parcel parcel) {
        C2369xg[] xgVarArr = (C2369xg[]) parcel.createTypedArray(C2369xg.CREATOR);
        this.f17729f = xgVarArr;
        this.f17731h = xgVarArr.length;
    }

    public C2406yg(List<C2369xg> list) {
        this(false, (C2369xg[]) list.toArray(new C2369xg[list.size()]));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.google.android.gms.internal.ads.xg[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C2406yg(boolean r3, com.google.android.gms.internal.ads.C2369xg... r4) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L_0x000c
            java.lang.Object r3 = r4.clone()
            r4 = r3
            com.google.android.gms.internal.ads.xg[] r4 = (com.google.android.gms.internal.ads.C2369xg[]) r4
        L_0x000c:
            java.util.Arrays.sort(r4, r2)
            r3 = 1
        L_0x0010:
            int r0 = r4.length
            if (r3 >= r0) goto L_0x0040
            int r0 = r3 + -1
            r0 = r4[r0]
            java.util.UUID r0 = r0.f17193g
            r1 = r4[r3]
            java.util.UUID r1 = r1.f17193g
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002a
            int r3 = r3 + 1
            goto L_0x0010
        L_0x002a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r3 = r4[r3]
            java.util.UUID r3 = r3.f17193g
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "Duplicate data for uuid: "
            java.lang.String r3 = r4.concat(r3)
            r0.<init>(r3)
            throw r0
        L_0x0040:
            r2.f17729f = r4
            r2.f17731h = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2406yg.<init>(boolean, com.google.android.gms.internal.ads.xg[]):void");
    }

    public C2406yg(C2369xg... xgVarArr) {
        this(true, xgVarArr);
    }

    /* renamed from: b */
    public final C2369xg mo12012b(int i) {
        return this.f17729f[i];
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C2369xg xgVar = (C2369xg) obj;
        C2369xg xgVar2 = (C2369xg) obj2;
        UUID uuid = C1774he.f8172b;
        return uuid.equals(xgVar.f17193g) ? !uuid.equals(xgVar2.f17193g) ? 1 : 0 : xgVar.f17193g.compareTo(xgVar2.f17193g);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2406yg.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f17729f, ((C2406yg) obj).f17729f);
    }

    public final int hashCode() {
        int i = this.f17730g;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f17729f);
        this.f17730g = hashCode;
        return hashCode;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f17729f, 0);
    }
}
