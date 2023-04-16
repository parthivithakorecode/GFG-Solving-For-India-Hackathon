package p160x1;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import p003a2.C0089n;
import p013b2.C1298a;
import p013b2.C1301c;

/* renamed from: x1.d */
public class C4282d extends C1298a {
    @RecentlyNonNull
    public static final Parcelable.Creator<C4282d> CREATOR = new C4295q();

    /* renamed from: f */
    private final String f22582f;
    @Deprecated

    /* renamed from: g */
    private final int f22583g;

    /* renamed from: h */
    private final long f22584h;

    public C4282d(@RecentlyNonNull String str, int i, long j) {
        this.f22582f = str;
        this.f22583g = i;
        this.f22584h = j;
    }

    public C4282d(@RecentlyNonNull String str, long j) {
        this.f22582f = str;
        this.f22584h = j;
        this.f22583g = -1;
    }

    @RecentlyNonNull
    /* renamed from: c */
    public String mo15853c() {
        return this.f22582f;
    }

    /* renamed from: d */
    public long mo15854d() {
        long j = this.f22584h;
        return j == -1 ? (long) this.f22583g : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4282d) {
            C4282d dVar = (C4282d) obj;
            return ((mo15853c() != null && mo15853c().equals(dVar.mo15853c())) || (mo15853c() == null && dVar.mo15853c() == null)) && mo15854d() == dVar.mo15854d();
        }
    }

    public final int hashCode() {
        return C0089n.m302b(mo15853c(), Long.valueOf(mo15854d()));
    }

    @RecentlyNonNull
    public final String toString() {
        C0089n.C0090a c = C0089n.m303c(this);
        c.mo260a("name", mo15853c());
        c.mo260a("version", Long.valueOf(mo15854d()));
        return c.toString();
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5225m(parcel, 1, mo15853c(), false);
        C1301c.m5220h(parcel, 2, this.f22583g);
        C1301c.m5223k(parcel, 3, mo15854d());
        C1301c.m5214b(parcel, a);
    }
}
