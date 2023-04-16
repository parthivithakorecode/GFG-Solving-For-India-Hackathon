package p064i4;

import p038f.C2591j;
import p075k0.C3293a;

/* renamed from: i4.e */
public final class C2851e {
    /* renamed from: a */
    public static void m22352a(String str) {
        C3293a.m24364c(m22354c(str));
    }

    /* renamed from: b */
    public static void m22353b(String str, int i) {
        C3293a.m24362a(m22354c(str), i);
    }

    /* renamed from: c */
    private static String m22354c(String str) {
        if (str.length() < 124) {
            return str;
        }
        return str.substring(0, C2591j.f18745K0) + "...";
    }

    /* renamed from: d */
    public static void m22355d() {
        C3293a.m24367f();
    }

    /* renamed from: e */
    public static void m22356e(String str, int i) {
        C3293a.m24365d(m22354c(str), i);
    }
}
