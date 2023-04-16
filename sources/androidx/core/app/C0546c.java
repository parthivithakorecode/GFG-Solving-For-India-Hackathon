package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: androidx.core.app.c */
final class C0546c {

    /* renamed from: a */
    protected static final Class<?> f1714a;

    /* renamed from: b */
    protected static final Field f1715b = m2192b();

    /* renamed from: c */
    protected static final Field f1716c = m2196f();

    /* renamed from: d */
    protected static final Method f1717d;

    /* renamed from: e */
    protected static final Method f1718e;

    /* renamed from: f */
    protected static final Method f1719f;

    /* renamed from: g */
    private static final Handler f1720g = new Handler(Looper.getMainLooper());

    /* renamed from: androidx.core.app.c$a */
    class C0547a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C0550d f1721f;

        /* renamed from: g */
        final /* synthetic */ Object f1722g;

        C0547a(C0550d dVar, Object obj) {
            this.f1721f = dVar;
            this.f1722g = obj;
        }

        public void run() {
            this.f1721f.f1727f = this.f1722g;
        }
    }

    /* renamed from: androidx.core.app.c$b */
    class C0548b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Application f1723f;

        /* renamed from: g */
        final /* synthetic */ C0550d f1724g;

        C0548b(Application application, C0550d dVar) {
            this.f1723f = application;
            this.f1724g = dVar;
        }

        public void run() {
            this.f1723f.unregisterActivityLifecycleCallbacks(this.f1724g);
        }
    }

    /* renamed from: androidx.core.app.c$c */
    class C0549c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Object f1725f;

        /* renamed from: g */
        final /* synthetic */ Object f1726g;

        C0549c(Object obj, Object obj2) {
            this.f1725f = obj;
            this.f1726g = obj2;
        }

        public void run() {
            try {
                Method method = C0546c.f1717d;
                if (method != null) {
                    method.invoke(this.f1725f, new Object[]{this.f1726g, Boolean.FALSE, "AppCompat recreation"});
                    return;
                }
                C0546c.f1718e.invoke(this.f1725f, new Object[]{this.f1726g, Boolean.FALSE});
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* renamed from: androidx.core.app.c$d */
    private static final class C0550d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: f */
        Object f1727f;

        /* renamed from: g */
        private Activity f1728g;

        /* renamed from: h */
        private final int f1729h;

        /* renamed from: i */
        private boolean f1730i = false;

        /* renamed from: j */
        private boolean f1731j = false;

        /* renamed from: k */
        private boolean f1732k = false;

        C0550d(Activity activity) {
            this.f1728g = activity;
            this.f1729h = activity.hashCode();
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f1728g == activity) {
                this.f1728g = null;
                this.f1731j = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.f1731j && !this.f1732k && !this.f1730i && C0546c.m2198h(this.f1727f, this.f1729h, activity)) {
                this.f1732k = true;
                this.f1727f = null;
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f1728g == activity) {
                this.f1730i = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> a = m2191a();
        f1714a = a;
        f1717d = m2194d(a);
        f1718e = m2193c(a);
        f1719f = m2195e(a);
    }

    /* renamed from: a */
    private static Class<?> m2191a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Field m2192b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Method m2193c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Method m2194d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE, String.class});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static Method m2195e(Class<?> cls) {
        if (m2197g() && cls != null) {
            try {
                Class cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", new Class[]{IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2});
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: f */
    private static Field m2196f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    private static boolean m2197g() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    /* renamed from: h */
    protected static boolean m2198h(Object obj, int i, Activity activity) {
        try {
            Object obj2 = f1716c.get(activity);
            if (obj2 == obj) {
                if (activity.hashCode() == i) {
                    f1720g.postAtFrontOfQueue(new C0549c(f1715b.get(activity), obj2));
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    /* renamed from: i */
    static boolean m2199i(Activity activity) {
        Object obj;
        Application application;
        C0550d dVar;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (m2197g() && f1719f == null) {
            return false;
        } else {
            if (f1718e == null && f1717d == null) {
                return false;
            }
            try {
                Object obj2 = f1716c.get(activity);
                if (obj2 == null || (obj = f1715b.get(activity)) == null) {
                    return false;
                }
                application = activity.getApplication();
                dVar = new C0550d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                Handler handler = f1720g;
                handler.post(new C0547a(dVar, obj2));
                if (m2197g()) {
                    Method method = f1719f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, new Object[]{obj2, null, null, 0, bool, null, null, bool, bool});
                } else {
                    activity.recreate();
                }
                handler.post(new C0548b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
