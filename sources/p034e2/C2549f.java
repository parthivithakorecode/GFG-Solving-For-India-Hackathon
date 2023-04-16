package p034e2;

import android.content.Context;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import p003a2.C0092o;

/* renamed from: e2.f */
public final class C2549f {

    /* renamed from: a */
    private static final String[] f18660a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    /* renamed from: a */
    public static boolean m21186a(@RecentlyNonNull Context context, @RecentlyNonNull Throwable th) {
        try {
            C0092o.m313i(context);
            C0092o.m313i(th);
            return false;
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
            return false;
        }
    }
}
