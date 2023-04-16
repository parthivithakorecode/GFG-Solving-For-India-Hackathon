package com.google.android.gms.internal.ads;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.annotation.CheckForNull;

public final class d53 {
    @CheckForNull

    /* renamed from: a */
    private static final Object f5649a;
    @CheckForNull

    /* renamed from: b */
    private static final Method f5650b;
    @CheckForNull

    /* renamed from: c */
    private static final Method f5651c;

    static {
        Method method;
        Object c = m7727c();
        f5649a = c;
        Method method2 = null;
        if (c == null) {
            method = null;
        } else {
            method = m7728d("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        f5650b = method;
        if (c != null) {
            method2 = m7729e(c);
        }
        f5651c = method2;
    }

    /* renamed from: a */
    public static String m7725a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: b */
    public static void m7726b(Throwable th) {
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    @CheckForNull
    /* renamed from: c */
    private static Object m7727c() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, (ClassLoader) null).getMethod("getJavaLangAccess", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    @CheckForNull
    /* renamed from: d */
    private static Method m7728d(String str, Class<?>... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, (ClassLoader) null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    @CheckForNull
    /* renamed from: e */
    private static Method m7729e(Object obj) {
        try {
            Method d = m7728d("getStackTraceDepth", Throwable.class);
            if (d == null) {
                return null;
            }
            d.invoke(obj, new Object[]{new Throwable()});
            return d;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }
}
