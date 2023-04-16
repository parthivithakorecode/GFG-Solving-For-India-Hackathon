package p125r2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;
import p013b2.C1298a;
import p013b2.C1301c;
import p166y1.C4389j;

/* renamed from: r2.h */
public final class C3984h extends C1298a implements C4389j {
    public static final Parcelable.Creator<C3984h> CREATOR = new C3985i();

    /* renamed from: f */
    private final List<String> f22142f;

    /* renamed from: g */
    private final String f22143g;

    public C3984h(List<String> list, String str) {
        this.f22142f = list;
        this.f22143g = str;
    }

    /* renamed from: b */
    public final Status mo5001b() {
        return this.f22143g != null ? Status.f3765k : Status.f3769o;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5227o(parcel, 1, this.f22142f, false);
        C1301c.m5225m(parcel, 2, this.f22143g, false);
        C1301c.m5214b(parcel, a);
    }
}
