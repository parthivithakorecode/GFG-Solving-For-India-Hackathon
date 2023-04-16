package p003a2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import p013b2.C1298a;
import p013b2.C1301c;

/* renamed from: a2.q */
public class C0096q extends C1298a {
    @RecentlyNonNull
    public static final Parcelable.Creator<C0096q> CREATOR = new C0093o0();

    /* renamed from: f */
    private final int f205f;

    /* renamed from: g */
    private final boolean f206g;

    /* renamed from: h */
    private final boolean f207h;

    /* renamed from: i */
    private final int f208i;

    /* renamed from: j */
    private final int f209j;

    public C0096q(int i, boolean z, boolean z2, int i2, int i3) {
        this.f205f = i;
        this.f206g = z;
        this.f207h = z2;
        this.f208i = i2;
        this.f209j = i3;
    }

    /* renamed from: c */
    public int mo267c() {
        return this.f208i;
    }

    /* renamed from: d */
    public int mo268d() {
        return this.f209j;
    }

    /* renamed from: e */
    public boolean mo269e() {
        return this.f206g;
    }

    /* renamed from: f */
    public boolean mo270f() {
        return this.f207h;
    }

    /* renamed from: g */
    public int mo271g() {
        return this.f205f;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5220h(parcel, 1, mo271g());
        C1301c.m5215c(parcel, 2, mo269e());
        C1301c.m5215c(parcel, 3, mo270f());
        C1301c.m5220h(parcel, 4, mo267c());
        C1301c.m5220h(parcel, 5, mo268d());
        C1301c.m5214b(parcel, a);
    }
}
