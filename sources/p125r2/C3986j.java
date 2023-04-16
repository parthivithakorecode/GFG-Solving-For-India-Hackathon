package p125r2;

import android.os.Parcel;
import android.os.Parcelable;
import p003a2.C0068f0;
import p013b2.C1298a;
import p013b2.C1301c;

/* renamed from: r2.j */
public final class C3986j extends C1298a {
    public static final Parcelable.Creator<C3986j> CREATOR = new C3987k();

    /* renamed from: f */
    final int f22144f;

    /* renamed from: g */
    final C0068f0 f22145g;

    C3986j(int i, C0068f0 f0Var) {
        this.f22144f = i;
        this.f22145g = f0Var;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5220h(parcel, 1, this.f22144f);
        C1301c.m5224l(parcel, 2, this.f22145g, i, false);
        C1301c.m5214b(parcel, a);
    }
}
