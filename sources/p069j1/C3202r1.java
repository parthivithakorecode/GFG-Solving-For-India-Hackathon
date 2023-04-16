package p069j1;

import android.util.Log;
import com.google.android.gms.internal.ads.d30;
import com.google.android.gms.internal.ads.io0;

/* renamed from: j1.r1 */
public final class C3202r1 extends io0 {
    /* renamed from: k */
    public static void m24015k(String str) {
        if (!m24017m()) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.v("Ads", str);
            return;
        }
        boolean z = true;
        for (String next : io0.f8732a.mo12144d(str)) {
            if (z) {
                Log.v("Ads", next);
            } else {
                Log.v("Ads-cont", next);
            }
            z = false;
        }
    }

    /* renamed from: l */
    public static void m24016l(String str, Throwable th) {
        if (m24017m()) {
            Log.v("Ads", str, th);
        }
    }

    /* renamed from: m */
    public static boolean m24017m() {
        return io0.m11134j(2) && d30.f5631a.mo9928e().booleanValue();
    }
}
