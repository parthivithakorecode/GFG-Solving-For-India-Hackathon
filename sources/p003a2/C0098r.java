package p003a2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import p013b2.C1298a;
import p013b2.C1301c;

/* renamed from: a2.r */
public class C0098r extends C1298a {
    @RecentlyNonNull
    public static final Parcelable.Creator<C0098r> CREATOR = new C0107v();

    /* renamed from: f */
    private final int f213f;
    @Nullable

    /* renamed from: g */
    private List<C0087m> f214g;

    public C0098r(int i, @Nullable List<C0087m> list) {
        this.f213f = i;
        this.f214g = list;
    }

    /* renamed from: c */
    public final int mo276c() {
        return this.f213f;
    }

    @RecentlyNullable
    /* renamed from: d */
    public final List<C0087m> mo277d() {
        return this.f214g;
    }

    /* renamed from: e */
    public final void mo278e(@RecentlyNonNull C0087m mVar) {
        if (this.f214g == null) {
            this.f214g = new ArrayList();
        }
        this.f214g.add(mVar);
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5220h(parcel, 1, this.f213f);
        C1301c.m5229q(parcel, 2, this.f214g, false);
        C1301c.m5214b(parcel, a);
    }
}
