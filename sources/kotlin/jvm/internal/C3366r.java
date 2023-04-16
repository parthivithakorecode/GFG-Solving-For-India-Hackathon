package kotlin.jvm.internal;

import p079k4.C3314c;
import p145u4.C4139a;
import p145u4.C4140b;
import p145u4.C4141c;
import p145u4.C4142d;
import p145u4.C4143e;
import p145u4.C4144f;
import p145u4.C4145g;
import p145u4.C4146h;
import p145u4.C4147i;
import p145u4.C4148j;
import p145u4.C4149k;
import p145u4.C4150l;
import p145u4.C4151m;
import p145u4.C4152n;
import p145u4.C4153o;
import p145u4.C4154p;
import p145u4.C4155q;
import p145u4.C4156r;
import p145u4.C4157s;
import p145u4.C4158t;
import p145u4.C4159u;
import p145u4.C4160v;
import p145u4.C4161w;

/* renamed from: kotlin.jvm.internal.r */
public class C3366r {
    /* renamed from: a */
    public static Object m24533a(Object obj, int i) {
        if (obj != null && !m24535c(obj, i)) {
            m24538f(obj, "kotlin.jvm.functions.Function" + i);
        }
        return obj;
    }

    /* renamed from: b */
    public static int m24534b(Object obj) {
        if (obj instanceof C3354f) {
            return ((C3354f) obj).getArity();
        }
        if (obj instanceof C4139a) {
            return 0;
        }
        if (obj instanceof C4150l) {
            return 1;
        }
        if (obj instanceof C4154p) {
            return 2;
        }
        if (obj instanceof C4155q) {
            return 3;
        }
        if (obj instanceof C4156r) {
            return 4;
        }
        if (obj instanceof C4157s) {
            return 5;
        }
        if (obj instanceof C4158t) {
            return 6;
        }
        if (obj instanceof C4159u) {
            return 7;
        }
        if (obj instanceof C4160v) {
            return 8;
        }
        if (obj instanceof C4161w) {
            return 9;
        }
        if (obj instanceof C4140b) {
            return 10;
        }
        if (obj instanceof C4141c) {
            return 11;
        }
        if (obj instanceof C4142d) {
            return 12;
        }
        if (obj instanceof C4143e) {
            return 13;
        }
        if (obj instanceof C4144f) {
            return 14;
        }
        if (obj instanceof C4145g) {
            return 15;
        }
        if (obj instanceof C4146h) {
            return 16;
        }
        if (obj instanceof C4147i) {
            return 17;
        }
        if (obj instanceof C4148j) {
            return 18;
        }
        if (obj instanceof C4149k) {
            return 19;
        }
        if (obj instanceof C4151m) {
            return 20;
        }
        if (obj instanceof C4152n) {
            return 21;
        }
        return obj instanceof C4153o ? 22 : -1;
    }

    /* renamed from: c */
    public static boolean m24535c(Object obj, int i) {
        return (obj instanceof C3314c) && m24534b(obj) == i;
    }

    /* renamed from: d */
    private static <T extends Throwable> T m24536d(T t) {
        return C3357i.m24512i(t, C3366r.class.getName());
    }

    /* renamed from: e */
    public static ClassCastException m24537e(ClassCastException classCastException) {
        throw ((ClassCastException) m24536d(classCastException));
    }

    /* renamed from: f */
    public static void m24538f(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        m24539g(name + " cannot be cast to " + str);
    }

    /* renamed from: g */
    public static void m24539g(String str) {
        throw m24537e(new ClassCastException(str));
    }
}
