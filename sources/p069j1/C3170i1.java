package p069j1;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.xh0;
import java.util.concurrent.Callable;

/* renamed from: j1.i1 */
public final class C3170i1 {
    @Deprecated
    /* renamed from: a */
    public static <T> T m23966a(Context context, Callable<T> callable) {
        StrictMode.ThreadPolicy threadPolicy;
        try {
            threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            T call = callable.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return call;
        } catch (Throwable th) {
            io0.m11129e("Unexpected exception.", th);
            xh0.m19512c(context).mo11846a(th, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }
}
