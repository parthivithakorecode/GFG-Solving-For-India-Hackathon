package com.google.android.gms.internal.ads;

import android.util.Log;

public class io0 {

    /* renamed from: a */
    protected static final z43 f8732a = z43.m20432b(4000);

    /* renamed from: a */
    static String m11125a(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        StringBuilder sb = new StringBuilder(str.length() + 13);
        sb.append(str);
        sb.append(" @");
        sb.append(lineNumber);
        return sb.toString();
    }

    /* renamed from: b */
    public static void m11126b(String str) {
        if (!m11134j(3)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.d("Ads", str);
            return;
        }
        boolean z = true;
        for (String next : f8732a.mo12144d(str)) {
            if (z) {
                Log.d("Ads", next);
            } else {
                Log.d("Ads-cont", next);
            }
            z = false;
        }
    }

    /* renamed from: c */
    public static void m11127c(String str, Throwable th) {
        if (m11134j(3)) {
            Log.d("Ads", str, th);
        }
    }

    /* renamed from: d */
    public static void m11128d(String str) {
        if (!m11134j(6)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.e("Ads", str);
            return;
        }
        boolean z = true;
        for (String next : f8732a.mo12144d(str)) {
            if (z) {
                Log.e("Ads", next);
            } else {
                Log.e("Ads-cont", next);
            }
            z = false;
        }
    }

    /* renamed from: e */
    public static void m11129e(String str, Throwable th) {
        if (m11134j(6)) {
            Log.e("Ads", str, th);
        }
    }

    /* renamed from: f */
    public static void m11130f(String str) {
        if (!m11134j(4)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.i("Ads", str);
            return;
        }
        boolean z = true;
        for (String next : f8732a.mo12144d(str)) {
            if (z) {
                Log.i("Ads", next);
            } else {
                Log.i("Ads-cont", next);
            }
            z = false;
        }
    }

    /* renamed from: g */
    public static void m11131g(String str) {
        if (!m11134j(5)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.w("Ads", str);
            return;
        }
        boolean z = true;
        for (String next : f8732a.mo12144d(str)) {
            if (z) {
                Log.w("Ads", next);
            } else {
                Log.w("Ads-cont", next);
            }
            z = false;
        }
    }

    /* renamed from: h */
    public static void m11132h(String str, Throwable th) {
        if (m11134j(5)) {
            Log.w("Ads", str, th);
        }
    }

    /* renamed from: i */
    public static void m11133i(String str, Throwable th) {
        if (m11134j(5)) {
            String a = m11125a(str);
            if (th != null) {
                m11132h(a, th);
            } else {
                m11131g(a);
            }
        }
    }

    /* renamed from: j */
    public static boolean m11134j(int i) {
        return i >= 5 || Log.isLoggable("Ads", i);
    }
}
