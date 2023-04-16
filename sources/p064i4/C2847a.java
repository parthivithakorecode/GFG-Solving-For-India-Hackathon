package p064i4;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* renamed from: i4.a */
public final class C2847a {
    /* renamed from: a */
    public static Handler m22345a(Looper looper) {
        return Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(looper) : new Handler(looper);
    }
}
