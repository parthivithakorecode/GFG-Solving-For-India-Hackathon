package p096n0;

import android.os.Handler;
import android.os.Looper;
import androidx.core.p009os.C0685h;
import p089m0.C3660q;

/* renamed from: n0.a */
public class C3747a implements C3660q {

    /* renamed from: a */
    private final Handler f21589a = C0685h.m2824a(Looper.getMainLooper());

    /* renamed from: a */
    public void mo14820a(long j, Runnable runnable) {
        this.f21589a.postDelayed(runnable, j);
    }

    /* renamed from: b */
    public void mo14821b(Runnable runnable) {
        this.f21589a.removeCallbacks(runnable);
    }
}
