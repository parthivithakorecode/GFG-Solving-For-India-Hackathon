package p003a2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import p013b2.C1298a;
import p013b2.C1301c;

/* renamed from: a2.e */
public class C0064e extends C1298a {
    @RecentlyNonNull
    public static final Parcelable.Creator<C0064e> CREATOR = new C0112x0();

    /* renamed from: f */
    private final C0096q f142f;

    /* renamed from: g */
    private final boolean f143g;

    /* renamed from: h */
    private final boolean f144h;

    /* renamed from: i */
    private final int[] f145i;

    /* renamed from: j */
    private final int f146j;

    /* renamed from: k */
    private final int[] f147k;

    public C0064e(@RecentlyNonNull C0096q qVar, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.f142f = qVar;
        this.f143g = z;
        this.f144h = z2;
        this.f145i = iArr;
        this.f146j = i;
        this.f147k = iArr2;
    }

    /* renamed from: c */
    public int mo219c() {
        return this.f146j;
    }

    @RecentlyNullable
    /* renamed from: d */
    public int[] mo220d() {
        return this.f145i;
    }

    @RecentlyNullable
    /* renamed from: e */
    public int[] mo221e() {
        return this.f147k;
    }

    /* renamed from: f */
    public boolean mo222f() {
        return this.f143g;
    }

    /* renamed from: g */
    public boolean mo223g() {
        return this.f144h;
    }

    @RecentlyNonNull
    /* renamed from: h */
    public C0096q mo224h() {
        return this.f142f;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5224l(parcel, 1, mo224h(), i, false);
        C1301c.m5215c(parcel, 2, mo222f());
        C1301c.m5215c(parcel, 3, mo223g());
        C1301c.m5221i(parcel, 4, mo220d(), false);
        C1301c.m5220h(parcel, 5, mo219c());
        C1301c.m5221i(parcel, 6, mo221e(), false);
        C1301c.m5214b(parcel, a);
    }
}
