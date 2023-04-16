package p003a2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p003a2.C0076i;
import p013b2.C1298a;
import p013b2.C1301c;
import p160x1.C4280b;

/* renamed from: a2.h0 */
public final class C0074h0 extends C1298a {
    public static final Parcelable.Creator<C0074h0> CREATOR = new C0078i0();

    /* renamed from: f */
    final int f178f;

    /* renamed from: g */
    final IBinder f179g;

    /* renamed from: h */
    private final C4280b f180h;

    /* renamed from: i */
    private final boolean f181i;

    /* renamed from: j */
    private final boolean f182j;

    C0074h0(int i, IBinder iBinder, C4280b bVar, boolean z, boolean z2) {
        this.f178f = i;
        this.f179g = iBinder;
        this.f180h = bVar;
        this.f181i = z;
        this.f182j = z2;
    }

    /* renamed from: c */
    public final C0076i mo240c() {
        IBinder iBinder = this.f179g;
        if (iBinder == null) {
            return null;
        }
        return C0076i.C0077a.m285n0(iBinder);
    }

    /* renamed from: d */
    public final C4280b mo241d() {
        return this.f180h;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0074h0)) {
            return false;
        }
        C0074h0 h0Var = (C0074h0) obj;
        return this.f180h.equals(h0Var.f180h) && C0089n.m301a(mo240c(), h0Var.mo240c());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5220h(parcel, 1, this.f178f);
        C1301c.m5219g(parcel, 2, this.f179g, false);
        C1301c.m5224l(parcel, 3, this.f180h, i, false);
        C1301c.m5215c(parcel, 4, this.f181i);
        C1301c.m5215c(parcel, 5, this.f182j);
        C1301c.m5214b(parcel, a);
    }
}
