package androidx.core.p009os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

@Deprecated
/* renamed from: androidx.core.os.m */
public final class C0692m {

    /* renamed from: a */
    private static long f2022a;

    /* renamed from: b */
    private static Method f2023b;

    /* renamed from: c */
    private static Method f2024c;

    /* renamed from: d */
    private static Method f2025d;

    /* renamed from: e */
    private static Method f2026e;

    /* renamed from: androidx.core.os.m$a */
    static class C0693a {
        /* renamed from: a */
        static void m2839a(String str) {
            Trace.beginSection(str);
        }

        /* renamed from: b */
        static void m2840b() {
            Trace.endSection();
        }
    }

    static {
        Class<String> cls = String.class;
        int i = Build.VERSION.SDK_INT;
        if (i >= 18 && i < 29) {
            try {
                f2022a = Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                Class cls2 = Long.TYPE;
                f2023b = Trace.class.getMethod("isTagEnabled", new Class[]{cls2});
                Class cls3 = Integer.TYPE;
                f2024c = Trace.class.getMethod("asyncTraceBegin", new Class[]{cls2, cls, cls3});
                f2025d = Trace.class.getMethod("asyncTraceEnd", new Class[]{cls2, cls, cls3});
                f2026e = Trace.class.getMethod("traceCounter", new Class[]{cls2, cls, cls3});
            } catch (Exception e) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e);
            }
        }
    }

    /* renamed from: a */
    public static void m2837a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            C0693a.m2839a(str);
        }
    }

    /* renamed from: b */
    public static void m2838b() {
        if (Build.VERSION.SDK_INT >= 18) {
            C0693a.m2840b();
        }
    }
}
