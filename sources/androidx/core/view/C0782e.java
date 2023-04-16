package androidx.core.view;

import android.os.Build;
import android.view.Gravity;

/* renamed from: androidx.core.view.e */
public final class C0782e {
    /* renamed from: a */
    public static int m3108a(int i, int i2) {
        return Build.VERSION.SDK_INT >= 17 ? Gravity.getAbsoluteGravity(i, i2) : i & -8388609;
    }
}
