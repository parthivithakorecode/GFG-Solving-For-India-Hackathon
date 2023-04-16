package p069j1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.C1605cv;
import com.google.android.gms.internal.ads.b53;
import com.google.android.gms.internal.ads.dt2;
import p013b2.C1298a;
import p013b2.C1301c;

/* renamed from: j1.f0 */
public final class C3157f0 extends C1298a {
    public static final Parcelable.Creator<C3157f0> CREATOR = new C3161g0();

    /* renamed from: f */
    public final String f20455f;

    /* renamed from: g */
    public final int f20456g;

    C3157f0(String str, int i) {
        this.f20455f = str == null ? "" : str;
        this.f20456g = i;
    }

    /* renamed from: c */
    public static C3157f0 m23894c(Throwable th) {
        C1605cv a = dt2.m8096a(th);
        return new C3157f0(b53.m6686d(th.getMessage()) ? a.f5530g : th.getMessage(), a.f5529f);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5225m(parcel, 1, this.f20455f, false);
        C1301c.m5220h(parcel, 2, this.f20456g);
        C1301c.m5214b(parcel, a);
    }
}
