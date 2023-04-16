package p142u1;

import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1298a;
import p013b2.C1301c;

/* renamed from: u1.f */
public final class C4133f extends C1298a {
    public static final Parcelable.Creator<C4133f> CREATOR = new C4134g();

    /* renamed from: f */
    private final String f22366f;

    /* renamed from: g */
    private final int f22367g;

    public C4133f(String str, int i) {
        this.f22366f = str;
        this.f22367g = i;
    }

    /* renamed from: c */
    public final int mo15652c() {
        return this.f22367g;
    }

    /* renamed from: d */
    public final String mo15653d() {
        return this.f22366f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5225m(parcel, 1, this.f22366f, false);
        C1301c.m5220h(parcel, 2, this.f22367g);
        C1301c.m5214b(parcel, a);
    }
}
