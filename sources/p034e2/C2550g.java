package p034e2;

import android.os.SystemClock;
import androidx.annotation.RecentlyNonNull;

/* renamed from: e2.g */
public class C2550g implements C2547d {

    /* renamed from: a */
    private static final C2550g f18661a = new C2550g();

    private C2550g() {
    }

    @RecentlyNonNull
    /* renamed from: d */
    public static C2547d m21187d() {
        return f18661a;
    }

    /* renamed from: a */
    public final long mo12462a() {
        return System.currentTimeMillis();
    }

    /* renamed from: b */
    public final long mo12463b() {
        return SystemClock.elapsedRealtime();
    }

    /* renamed from: c */
    public final long mo12464c() {
        return System.nanoTime();
    }
}
