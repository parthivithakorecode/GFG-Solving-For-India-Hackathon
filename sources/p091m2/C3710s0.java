package p091m2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1298a;
import p013b2.C1301c;

/* renamed from: m2.s0 */
public final class C3710s0 extends C1298a {
    public static final Parcelable.Creator<C3710s0> CREATOR = new C3675b();

    /* renamed from: f */
    public final long f21499f;

    /* renamed from: g */
    public final long f21500g;

    /* renamed from: h */
    public final boolean f21501h;

    /* renamed from: i */
    public final String f21502i;

    /* renamed from: j */
    public final String f21503j;

    /* renamed from: k */
    public final String f21504k;

    /* renamed from: l */
    public final Bundle f21505l;

    /* renamed from: m */
    public final String f21506m;

    public C3710s0(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f21499f = j;
        this.f21500g = j2;
        this.f21501h = z;
        this.f21502i = str;
        this.f21503j = str2;
        this.f21504k = str3;
        this.f21505l = bundle;
        this.f21506m = str4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5223k(parcel, 1, this.f21499f);
        C1301c.m5223k(parcel, 2, this.f21500g);
        C1301c.m5215c(parcel, 3, this.f21501h);
        C1301c.m5225m(parcel, 4, this.f21502i, false);
        C1301c.m5225m(parcel, 5, this.f21503j, false);
        C1301c.m5225m(parcel, 6, this.f21504k, false);
        C1301c.m5216d(parcel, 7, this.f21505l, false);
        C1301c.m5225m(parcel, 8, this.f21506m, false);
        C1301c.m5214b(parcel, a);
    }
}
