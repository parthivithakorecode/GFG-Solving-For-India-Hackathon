package com.google.android.gms.internal.ads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: com.google.android.gms.internal.ads.y6 */
public final class C2396y6 {
    /* renamed from: a */
    public static long m19878a(String str) {
        try {
            return m19881d("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e) {
            if ("0".equals(str) || "-1".equals(str)) {
                C1988n6.m13726d("Unable to parse dateStr: %s, falling back to 0", str);
                return 0;
            }
            C1988n6.m13725c(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0;
        }
    }

    /* renamed from: b */
    public static C1839j5 m19879b(C2320w5 w5Var) {
        long j;
        long j2;
        boolean z;
        long j3;
        long j4;
        long j5;
        C2320w5 w5Var2 = w5Var;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = w5Var2.f16710c;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        long a = str != null ? m19878a(str) : 0;
        String str2 = map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            int i2 = 0;
            j2 = 0;
            j = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            z = true;
        } else {
            z = false;
            j2 = 0;
            j = 0;
        }
        String str3 = map.get("Expires");
        long a2 = str3 != null ? m19878a(str3) : 0;
        String str4 = map.get("Last-Modified");
        long a3 = str4 != null ? m19878a(str4) : 0;
        String str5 = map.get("ETag");
        if (z) {
            j4 = currentTimeMillis + (j2 * 1000);
            if (i != 0) {
                j5 = j4;
            } else {
                Long.signum(j);
                j5 = (j * 1000) + j4;
            }
            j3 = j5;
        } else {
            j3 = 0;
            if (a <= 0 || a2 < a) {
                j4 = 0;
            } else {
                j4 = currentTimeMillis + (a2 - a);
                j3 = j4;
            }
        }
        C1839j5 j5Var = new C1839j5();
        j5Var.f8983a = w5Var2.f16709b;
        j5Var.f8984b = str5;
        j5Var.f8988f = j4;
        j5Var.f8987e = j3;
        j5Var.f8985c = a;
        j5Var.f8986d = a3;
        j5Var.f8989g = map;
        j5Var.f8990h = w5Var2.f16711d;
        return j5Var;
    }

    /* renamed from: c */
    static String m19880c(long j) {
        return m19881d("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j));
    }

    /* renamed from: d */
    private static SimpleDateFormat m19881d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
