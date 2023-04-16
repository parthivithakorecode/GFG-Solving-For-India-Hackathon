package p003a2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1298a;
import p013b2.C1301c;
import p160x1.C4282d;

/* renamed from: a2.v0 */
public final class C0108v0 extends C1298a {
    public static final Parcelable.Creator<C0108v0> CREATOR = new C0110w0();

    /* renamed from: f */
    Bundle f225f;

    /* renamed from: g */
    C4282d[] f226g;

    /* renamed from: h */
    int f227h;

    /* renamed from: i */
    C0064e f228i;

    public C0108v0() {
    }

    C0108v0(Bundle bundle, C4282d[] dVarArr, int i, C0064e eVar) {
        this.f225f = bundle;
        this.f226g = dVarArr;
        this.f227h = i;
        this.f228i = eVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5216d(parcel, 1, this.f225f, false);
        C1301c.m5228p(parcel, 2, this.f226g, i, false);
        C1301c.m5220h(parcel, 3, this.f227h);
        C1301c.m5224l(parcel, 4, this.f228i, i, false);
        C1301c.m5214b(parcel, a);
    }
}
