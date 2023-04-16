package p075k0;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: k0.a */
public final class C3293a {

    /* renamed from: a */
    private static long f20772a;

    /* renamed from: b */
    private static Method f20773b;

    /* renamed from: c */
    private static Method f20774c;

    /* renamed from: d */
    private static Method f20775d;

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static void m24362a(String str, int i) {
        try {
            if (f20774c == null) {
                C3295c.m24373a(str, i);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        m24363b(str, i);
    }

    /* renamed from: b */
    private static void m24363b(String str, int i) {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                if (f20774c == null) {
                    f20774c = Trace.class.getMethod("asyncTraceBegin", new Class[]{Long.TYPE, String.class, Integer.TYPE});
                }
                f20774c.invoke((Object) null, new Object[]{Long.valueOf(f20772a), str, Integer.valueOf(i)});
            } catch (Exception e) {
                m24368g("asyncTraceBegin", e);
            }
        }
    }

    /* renamed from: c */
    public static void m24364c(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            C3294b.m24371a(str);
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public static void m24365d(String str, int i) {
        try {
            if (f20775d == null) {
                C3295c.m24374b(str, i);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        m24366e(str, i);
    }

    /* renamed from: e */
    private static void m24366e(String str, int i) {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                if (f20775d == null) {
                    f20775d = Trace.class.getMethod("asyncTraceEnd", new Class[]{Long.TYPE, String.class, Integer.TYPE});
                }
                f20775d.invoke((Object) null, new Object[]{Long.valueOf(f20772a), str, Integer.valueOf(i)});
            } catch (Exception e) {
                m24368g("asyncTraceEnd", e);
            }
        }
    }

    /* renamed from: f */
    public static void m24367f() {
        if (Build.VERSION.SDK_INT >= 18) {
            C3294b.m24372b();
        }
    }

    /* renamed from: g */
    private static void m24368g(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: h */
    public static boolean m24369h() {
        try {
            if (f20773b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return m24370i();
    }

    /* renamed from: i */
    private static boolean m24370i() {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                if (f20773b == null) {
                    f20772a = Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                    f20773b = Trace.class.getMethod("isTagEnabled", new Class[]{Long.TYPE});
                }
                return ((Boolean) f20773b.invoke((Object) null, new Object[]{Long.valueOf(f20772a)})).booleanValue();
            } catch (Exception e) {
                m24368g("isTagEnabled", e);
            }
        }
        return false;
    }
}
