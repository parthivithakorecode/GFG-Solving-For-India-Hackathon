package p026d1;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.C2237tx;
import com.google.android.gms.internal.ads.C2274ux;
import com.google.android.gms.internal.ads.a60;
import com.google.android.gms.internal.ads.b60;
import p013b2.C1298a;
import p013b2.C1301c;

@Deprecated
/* renamed from: d1.g */
public final class C2478g extends C1298a {
    @RecentlyNonNull
    public static final Parcelable.Creator<C2478g> CREATOR = new C2485m();

    /* renamed from: f */
    private final boolean f18539f;

    /* renamed from: g */
    private final C2274ux f18540g;

    /* renamed from: h */
    private final IBinder f18541h;

    C2478g(boolean z, IBinder iBinder, IBinder iBinder2) {
        this.f18539f = z;
        this.f18540g = iBinder != null ? C2237tx.m17545z5(iBinder) : null;
        this.f18541h = iBinder2;
    }

    /* renamed from: c */
    public final C2274ux mo12327c() {
        return this.f18540g;
    }

    /* renamed from: d */
    public final b60 mo12328d() {
        IBinder iBinder = this.f18541h;
        if (iBinder == null) {
            return null;
        }
        return a60.m5870z5(iBinder);
    }

    /* renamed from: e */
    public final boolean mo12329e() {
        return this.f18539f;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5215c(parcel, 1, this.f18539f);
        C2274ux uxVar = this.f18540g;
        C1301c.m5219g(parcel, 2, uxVar == null ? null : uxVar.asBinder(), false);
        C1301c.m5219g(parcel, 3, this.f18541h, false);
        C1301c.m5214b(parcel, a);
    }
}
