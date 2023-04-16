package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.app.C0565k;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: androidx.core.app.m */
class C0580m {

    /* renamed from: a */
    private static final Object f1833a = new Object();

    /* renamed from: b */
    private static Field f1834b;

    /* renamed from: c */
    private static boolean f1835c;

    /* renamed from: d */
    private static final Object f1836d = new Object();

    /* renamed from: a */
    public static SparseArray<Bundle> m2384a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* renamed from: b */
    static Bundle m2385b(C0565k.C0566a aVar) {
        Bundle bundle = new Bundle();
        IconCompat f = aVar.mo2411f();
        bundle.putInt("icon", f != null ? f.mo2597n() : 0);
        bundle.putCharSequence("title", aVar.mo2415j());
        bundle.putParcelable("actionIntent", aVar.mo2406a());
        Bundle bundle2 = aVar.mo2409d() != null ? new Bundle(aVar.mo2409d()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.mo2407b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", m2388e(aVar.mo2412g()));
        bundle.putBoolean("showsUserInterface", aVar.mo2414i());
        bundle.putInt("semanticAction", aVar.mo2413h());
        return bundle;
    }

    /* renamed from: c */
    public static Bundle m2386c(Notification notification) {
        String str;
        String str2;
        synchronized (f1833a) {
            if (f1835c) {
                return null;
            }
            try {
                if (f1834b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f1835c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f1834b = declaredField;
                }
                Bundle bundle = (Bundle) f1834b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f1834b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                e = e;
                str = "NotificationCompat";
                str2 = "Unable to access notification extras";
                Log.e(str, str2, e);
                f1835c = true;
                return null;
            } catch (NoSuchFieldException e2) {
                e = e2;
                str = "NotificationCompat";
                str2 = "Unable to access notification extras";
                Log.e(str, str2, e);
                f1835c = true;
                return null;
            }
        }
    }

    /* renamed from: d */
    private static Bundle m2387d(C0592q qVar) {
        new Bundle();
        throw null;
    }

    /* renamed from: e */
    private static Bundle[] m2388e(C0592q[] qVarArr) {
        if (qVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[qVarArr.length];
        for (int i = 0; i < qVarArr.length; i++) {
            bundleArr[i] = m2387d(qVarArr[i]);
        }
        return bundleArr;
    }

    /* renamed from: f */
    public static Bundle m2389f(Notification.Builder builder, C0565k.C0566a aVar) {
        IconCompat f = aVar.mo2411f();
        builder.addAction(f != null ? f.mo2597n() : 0, aVar.mo2415j(), aVar.mo2406a());
        Bundle bundle = new Bundle(aVar.mo2409d());
        if (aVar.mo2412g() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", m2388e(aVar.mo2412g()));
        }
        if (aVar.mo2408c() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", m2388e(aVar.mo2408c()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo2407b());
        return bundle;
    }
}
