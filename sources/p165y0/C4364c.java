package p165y0;

import androidx.annotation.RecentlyNonNull;
import p002a1.C0024h;

@Deprecated
/* renamed from: y0.c */
public final class C4364c {
    @RecentlyNonNull

    /* renamed from: b */
    public static final C4364c f22719b = new C4364c(-1, -2, "mb");
    @RecentlyNonNull

    /* renamed from: c */
    public static final C4364c f22720c = new C4364c(320, 50, "mb");
    @RecentlyNonNull

    /* renamed from: d */
    public static final C4364c f22721d = new C4364c(300, 250, "as");
    @RecentlyNonNull

    /* renamed from: e */
    public static final C4364c f22722e = new C4364c(468, 60, "as");
    @RecentlyNonNull

    /* renamed from: f */
    public static final C4364c f22723f = new C4364c(728, 90, "as");
    @RecentlyNonNull

    /* renamed from: g */
    public static final C4364c f22724g = new C4364c(160, 600, "as");

    /* renamed from: a */
    private final C0024h f22725a;

    private C4364c(int i, int i2, String str) {
        this(new C0024h(i, i2));
    }

    public C4364c(@RecentlyNonNull C0024h hVar) {
        this.f22725a = hVar;
    }

    /* renamed from: a */
    public int mo15978a() {
        return this.f22725a.mo56c();
    }

    /* renamed from: b */
    public int mo15979b() {
        return this.f22725a.mo60j();
    }

    public boolean equals(@RecentlyNonNull Object obj) {
        if (!(obj instanceof C4364c)) {
            return false;
        }
        return this.f22725a.equals(((C4364c) obj).f22725a);
    }

    public int hashCode() {
        return this.f22725a.hashCode();
    }

    @RecentlyNonNull
    public String toString() {
        return this.f22725a.toString();
    }
}
