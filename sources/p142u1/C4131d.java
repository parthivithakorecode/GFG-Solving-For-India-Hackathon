package p142u1;

import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1298a;
import p013b2.C1301c;

/* renamed from: u1.d */
public final class C4131d extends C1298a {
    public static final Parcelable.Creator<C4131d> CREATOR = new C4132e();

    /* renamed from: f */
    private final String f22364f;

    /* renamed from: g */
    private final String f22365g;

    public C4131d(String str, String str2) {
        this.f22364f = str;
        this.f22365g = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5225m(parcel, 1, this.f22364f, false);
        C1301c.m5225m(parcel, 2, this.f22365g, false);
        C1301c.m5214b(parcel, a);
    }
}
