package androidx.core.provider;

import android.os.Handler;
import android.os.Looper;

/* renamed from: androidx.core.provider.b */
class C0697b {
    /* renamed from: a */
    static Handler m2844a() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}
