package p125r2;

import android.os.Parcel;
import android.os.Parcelable;
import p003a2.C0074h0;
import p013b2.C1298a;
import p013b2.C1301c;
import p160x1.C4280b;

/* renamed from: r2.l */
public final class C3988l extends C1298a {
    public static final Parcelable.Creator<C3988l> CREATOR = new C3989m();

    /* renamed from: f */
    final int f22146f;

    /* renamed from: g */
    private final C4280b f22147g;

    /* renamed from: h */
    private final C0074h0 f22148h;

    C3988l(int i, C4280b bVar, C0074h0 h0Var) {
        this.f22146f = i;
        this.f22147g = bVar;
        this.f22148h = h0Var;
    }

    /* renamed from: c */
    public final C4280b mo15452c() {
        return this.f22147g;
    }

    /* renamed from: d */
    public final C0074h0 mo15453d() {
        return this.f22148h;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5220h(parcel, 1, this.f22146f);
        C1301c.m5224l(parcel, 2, this.f22147g, i, false);
        C1301c.m5224l(parcel, 3, this.f22148h, i, false);
        C1301c.m5214b(parcel, a);
    }
}
