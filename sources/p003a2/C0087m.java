package p003a2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import p013b2.C1298a;
import p013b2.C1301c;

/* renamed from: a2.m */
public class C0087m extends C1298a {
    @RecentlyNonNull
    public static final Parcelable.Creator<C0087m> CREATOR = new C0065e0();

    /* renamed from: f */
    private final int f187f;

    /* renamed from: g */
    private final int f188g;

    /* renamed from: h */
    private final int f189h;

    /* renamed from: i */
    private final long f190i;

    /* renamed from: j */
    private final long f191j;

    /* renamed from: k */
    private final String f192k;

    /* renamed from: l */
    private final String f193l;

    /* renamed from: m */
    private final int f194m;

    public C0087m(int i, int i2, int i3, long j, long j2, String str, String str2, int i4) {
        this.f187f = i;
        this.f188g = i2;
        this.f189h = i3;
        this.f190i = j;
        this.f191j = j2;
        this.f192k = str;
        this.f193l = str2;
        this.f194m = i4;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5220h(parcel, 1, this.f187f);
        C1301c.m5220h(parcel, 2, this.f188g);
        C1301c.m5220h(parcel, 3, this.f189h);
        C1301c.m5223k(parcel, 4, this.f190i);
        C1301c.m5223k(parcel, 5, this.f191j);
        C1301c.m5225m(parcel, 6, this.f192k, false);
        C1301c.m5225m(parcel, 7, this.f193l, false);
        C1301c.m5220h(parcel, 8, this.f194m);
        C1301c.m5214b(parcel, a);
    }
}
