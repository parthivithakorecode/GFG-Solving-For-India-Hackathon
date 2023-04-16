package kotlin.jvm.internal;

import java.util.Arrays;
import p079k4.C3329p;

/* renamed from: kotlin.jvm.internal.i */
public class C3357i {
    private C3357i() {
    }

    /* renamed from: a */
    public static boolean m24504a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public static void m24505b(Object obj) {
        if (obj == null) {
            m24514k();
        }
    }

    /* renamed from: c */
    public static void m24506c(Object obj, String str) {
        if (obj == null) {
            m24515l(str);
        }
    }

    /* renamed from: d */
    public static void m24507d(Object obj, String str) {
        if (obj == null) {
            throw ((NullPointerException) m24511h(new NullPointerException(str + " must not be null")));
        }
    }

    /* renamed from: e */
    public static void m24508e(Object obj, String str) {
        if (obj == null) {
            m24516m(str);
        }
    }

    /* renamed from: f */
    public static int m24509f(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* renamed from: g */
    private static String m24510g(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = C3357i.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    /* renamed from: h */
    private static <T extends Throwable> T m24511h(T t) {
        return m24512i(t, C3357i.class.getName());
    }

    /* renamed from: i */
    static <T extends Throwable> T m24512i(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    /* renamed from: j */
    public static String m24513j(String str, Object obj) {
        return str + obj;
    }

    /* renamed from: k */
    public static void m24514k() {
        throw ((NullPointerException) m24511h(new NullPointerException()));
    }

    /* renamed from: l */
    public static void m24515l(String str) {
        throw ((NullPointerException) m24511h(new NullPointerException(str)));
    }

    /* renamed from: m */
    private static void m24516m(String str) {
        throw ((NullPointerException) m24511h(new NullPointerException(m24510g(str))));
    }

    /* renamed from: n */
    public static void m24517n(String str) {
        throw ((C3329p) m24511h(new C3329p(str)));
    }

    /* renamed from: o */
    public static void m24518o(String str) {
        m24517n("lateinit property " + str + " has not been initialized");
    }
}
