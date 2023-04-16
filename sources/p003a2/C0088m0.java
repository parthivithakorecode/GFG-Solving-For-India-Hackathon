package p003a2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import javax.annotation.concurrent.GuardedBy;
import p041f2.C2606c;

/* renamed from: a2.m0 */
public final class C0088m0 {

    /* renamed from: a */
    private static final Object f195a = new Object();
    @GuardedBy("sLock")

    /* renamed from: b */
    private static boolean f196b;

    /* renamed from: c */
    private static String f197c;

    /* renamed from: d */
    private static int f198d;

    /* renamed from: a */
    public static int m299a(Context context) {
        m300b(context);
        return f198d;
    }

    /* renamed from: b */
    private static void m300b(Context context) {
        synchronized (f195a) {
            if (!f196b) {
                f196b = true;
                try {
                    Bundle bundle = C2606c.m21299a(context).mo12493c(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        f197c = bundle.getString("com.google.app.id");
                        f198d = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
    }
}
