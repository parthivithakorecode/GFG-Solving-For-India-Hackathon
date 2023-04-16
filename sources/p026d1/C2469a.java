package p026d1;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.a60;
import com.google.android.gms.internal.ads.b60;
import p013b2.C1298a;
import p013b2.C1301c;

/* renamed from: d1.a */
public final class C2469a extends C1298a {
    @RecentlyNonNull
    public static final Parcelable.Creator<C2469a> CREATOR = new C2482j();

    /* renamed from: f */
    private final boolean f18521f;

    /* renamed from: g */
    private final IBinder f18522g;

    C2469a(boolean z, IBinder iBinder) {
        this.f18521f = z;
        this.f18522g = iBinder;
    }

    /* renamed from: c */
    public boolean mo12307c() {
        return this.f18521f;
    }

    /* renamed from: d */
    public final b60 mo12308d() {
        IBinder iBinder = this.f18522g;
        if (iBinder == null) {
            return null;
        }
        return a60.m5870z5(iBinder);
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5215c(parcel, 1, mo12307c());
        C1301c.m5219g(parcel, 2, this.f18522g, false);
        C1301c.m5214b(parcel, a);
    }
}
