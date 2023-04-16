package p125r2;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import p013b2.C1298a;
import p013b2.C1301c;
import p166y1.C4389j;

/* renamed from: r2.b */
public final class C3978b extends C1298a implements C4389j {
    public static final Parcelable.Creator<C3978b> CREATOR = new C3979c();

    /* renamed from: f */
    final int f22139f;

    /* renamed from: g */
    private int f22140g;

    /* renamed from: h */
    private Intent f22141h;

    public C3978b() {
        this(2, 0, (Intent) null);
    }

    C3978b(int i, int i2, Intent intent) {
        this.f22139f = i;
        this.f22140g = i2;
        this.f22141h = intent;
    }

    /* renamed from: b */
    public final Status mo5001b() {
        return this.f22140g == 0 ? Status.f3765k : Status.f3769o;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5220h(parcel, 1, this.f22139f);
        C1301c.m5220h(parcel, 2, this.f22140g);
        C1301c.m5224l(parcel, 3, this.f22141h, i, false);
        C1301c.m5214b(parcel, a);
    }
}
