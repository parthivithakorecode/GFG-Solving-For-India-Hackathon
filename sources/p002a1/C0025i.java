package p002a1;

import androidx.annotation.RecentlyNonNull;

/* renamed from: a1.i */
public final class C0025i {

    /* renamed from: a */
    private final int f44a;

    /* renamed from: b */
    private final String f45b;

    /* renamed from: c */
    private final long f46c;

    private C0025i(int i, String str, long j) {
        this.f44a = i;
        this.f45b = str;
        this.f46c = j;
    }

    @RecentlyNonNull
    /* renamed from: d */
    public static C0025i m77d(int i, @RecentlyNonNull String str, long j) {
        return new C0025i(i, str, j);
    }

    @RecentlyNonNull
    /* renamed from: a */
    public String mo73a() {
        return this.f45b;
    }

    /* renamed from: b */
    public int mo74b() {
        return this.f44a;
    }

    /* renamed from: c */
    public long mo75c() {
        return this.f46c;
    }
}
