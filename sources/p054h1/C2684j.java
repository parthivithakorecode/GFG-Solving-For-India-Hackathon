package p054h1;

import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1298a;
import p013b2.C1301c;

/* renamed from: h1.j */
public final class C2684j extends C1298a {
    public static final Parcelable.Creator<C2684j> CREATOR = new C2685k();

    /* renamed from: f */
    public final boolean f19135f;

    /* renamed from: g */
    public final boolean f19136g;

    /* renamed from: h */
    public final String f19137h;

    /* renamed from: i */
    public final boolean f19138i;

    /* renamed from: j */
    public final float f19139j;

    /* renamed from: k */
    public final int f19140k;

    /* renamed from: l */
    public final boolean f19141l;

    /* renamed from: m */
    public final boolean f19142m;

    /* renamed from: n */
    public final boolean f19143n;

    C2684j(boolean z, boolean z2, String str, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this.f19135f = z;
        this.f19136g = z2;
        this.f19137h = str;
        this.f19138i = z3;
        this.f19139j = f;
        this.f19140k = i;
        this.f19141l = z4;
        this.f19142m = z5;
        this.f19143n = z6;
    }

    public C2684j(boolean z, boolean z2, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this(z, z2, (String) null, z3, f, -1, z4, z5, z6);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5215c(parcel, 2, this.f19135f);
        C1301c.m5215c(parcel, 3, this.f19136g);
        C1301c.m5225m(parcel, 4, this.f19137h, false);
        C1301c.m5215c(parcel, 5, this.f19138i);
        C1301c.m5218f(parcel, 6, this.f19139j);
        C1301c.m5220h(parcel, 7, this.f19140k);
        C1301c.m5215c(parcel, 8, this.f19141l);
        C1301c.m5215c(parcel, 9, this.f19142m);
        C1301c.m5215c(parcel, 10, this.f19143n);
        C1301c.m5214b(parcel, a);
    }
}
