package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.content.C0597a;
import java.util.Arrays;

/* renamed from: androidx.core.app.b */
public class C0539b extends C0597a {

    /* renamed from: d */
    private static C0544e f1710d;

    /* renamed from: androidx.core.app.b$a */
    class C0540a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ String[] f1711f;

        /* renamed from: g */
        final /* synthetic */ Activity f1712g;

        /* renamed from: h */
        final /* synthetic */ int f1713h;

        C0540a(String[] strArr, Activity activity, int i) {
            this.f1711f = strArr;
            this.f1712g = activity;
            this.f1713h = i;
        }

        public void run() {
            int[] iArr = new int[this.f1711f.length];
            PackageManager packageManager = this.f1712g.getPackageManager();
            String packageName = this.f1712g.getPackageName();
            int length = this.f1711f.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.f1711f[i], packageName);
            }
            ((C0543d) this.f1712g).onRequestPermissionsResult(this.f1713h, this.f1711f, iArr);
        }
    }

    /* renamed from: androidx.core.app.b$b */
    static class C0541b {
        /* renamed from: a */
        static void m2183a(Activity activity) {
            activity.finishAffinity();
        }

        /* renamed from: b */
        static void m2184b(Activity activity, Intent intent, int i, Bundle bundle) {
            activity.startActivityForResult(intent, i, bundle);
        }

        /* renamed from: c */
        static void m2185c(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    /* renamed from: androidx.core.app.b$c */
    static class C0542c {
        /* renamed from: a */
        static void m2186a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        /* renamed from: b */
        static void m2187b(Activity activity, String[] strArr, int i) {
            activity.requestPermissions(strArr, i);
        }

        /* renamed from: c */
        static boolean m2188c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* renamed from: androidx.core.app.b$d */
    public interface C0543d {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* renamed from: androidx.core.app.b$e */
    public interface C0544e {
        /* renamed from: a */
        boolean mo2392a(Activity activity, String[] strArr, int i);
    }

    /* renamed from: androidx.core.app.b$f */
    public interface C0545f {
        /* renamed from: b */
        void mo2393b(int i);
    }

    /* renamed from: l */
    public static void m2179l(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0541b.m2183a(activity);
        } else {
            activity.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static /* synthetic */ void m2180m(Activity activity) {
        if (!activity.isFinishing() && !C0546c.m2199i(activity)) {
            activity.recreate();
        }
    }

    /* renamed from: n */
    public static void m2181n(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new C0538a(activity));
        }
    }

    /* renamed from: o */
    public static void m2182o(Activity activity, String[] strArr, int i) {
        C0544e eVar = f1710d;
        if (eVar == null || !eVar.mo2392a(activity, strArr, i)) {
            int length = strArr.length;
            int i2 = 0;
            while (i2 < length) {
                if (!TextUtils.isEmpty(strArr[i2])) {
                    i2++;
                } else {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof C0545f) {
                    ((C0545f) activity).mo2393b(i);
                }
                C0542c.m2187b(activity, strArr, i);
            } else if (activity instanceof C0543d) {
                new Handler(Looper.getMainLooper()).post(new C0540a(strArr, activity, i));
            }
        }
    }
}
