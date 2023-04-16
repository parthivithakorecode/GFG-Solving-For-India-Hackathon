package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

public final class oc2 {
    @Pure
    /* renamed from: a */
    public static void m14399a(String str, String str2, Throwable th) {
        Log.e(str, m14401c(str2, th));
    }

    @Pure
    /* renamed from: b */
    public static void m14400b(String str, String str2, Throwable th) {
        Log.w(str, m14401c(str2, th));
    }

    @Pure
    /* renamed from: c */
    private static String m14401c(String str, Throwable th) {
        String str2;
        if (th != null) {
            Throwable th2 = th;
            while (true) {
                if (th2 == null) {
                    str2 = Log.getStackTraceString(th).trim().replace("\t", "    ");
                    break;
                } else if (th2 instanceof UnknownHostException) {
                    str2 = "UnknownHostException (no network)";
                    break;
                } else {
                    th2 = th2.getCause();
                }
            }
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        String valueOf = String.valueOf(str);
        String replace = str2.replace("\n", "\n  ");
        StringBuilder sb = new StringBuilder(valueOf.length() + 4 + String.valueOf(replace).length());
        sb.append(valueOf);
        sb.append("\n  ");
        sb.append(replace);
        sb.append(10);
        return sb.toString();
    }
}
