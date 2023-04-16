package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import p054h1.C2694t;

public final class rm0 {
    /* renamed from: a */
    static Uri m16267a(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = indexOf + 1;
        return Uri.parse(str.substring(0, i) + str2 + "=" + str3 + "&" + str.substring(i));
    }

    /* renamed from: b */
    public static String m16268b(Uri uri, Context context) {
        if (!C2694t.m21606o().mo10109z(context)) {
            return uri.toString();
        }
        String f = C2694t.m21606o().mo10089f(context);
        if (f == null) {
            return uri.toString();
        }
        String str = (String) C2199sw.m17001c().mo8579b(m10.f10433Z);
        String uri2 = uri.toString();
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10425Y)).booleanValue() && uri2.contains(str)) {
            C2694t.m21606o().mo10101r(context, f);
            return m16270d(uri2, context).replace(str, f);
        } else if (!TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            return uri2;
        } else {
            String uri3 = m16267a(m16270d(uri2, context), "fbs_aeid", f).toString();
            C2694t.m21606o().mo10101r(context, f);
            return uri3;
        }
    }

    /* renamed from: c */
    public static String m16269c(String str, Context context, boolean z) {
        String f;
        if ((((Boolean) C2199sw.m17001c().mo8579b(m10.f10496g0)).booleanValue() && !z) || !C2694t.m21606o().mo10109z(context) || TextUtils.isEmpty(str) || (f = C2694t.m21606o().mo10089f(context)) == null) {
            return str;
        }
        String str2 = (String) C2199sw.m17001c().mo8579b(m10.f10433Z);
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10425Y)).booleanValue() || !str.contains(str2)) {
            if (str.contains("fbs_aeid")) {
                return str;
            }
            if (C2694t.m21608q().mo14029W(str)) {
                C2694t.m21606o().mo10101r(context, f);
                return m16267a(m16270d(str, context), "fbs_aeid", f).toString();
            } else if (!C2694t.m21608q().mo14030X(str)) {
                return str;
            } else {
                C2694t.m21606o().mo10102s(context, f);
                return m16267a(m16270d(str, context), "fbs_aeid", f).toString();
            }
        } else if (C2694t.m21608q().mo14029W(str)) {
            C2694t.m21606o().mo10101r(context, f);
            return m16270d(str, context).replace(str2, f);
        } else if (!C2694t.m21608q().mo14030X(str)) {
            return str;
        } else {
            C2694t.m21606o().mo10102s(context, f);
            return m16270d(str, context).replace(str2, f);
        }
    }

    /* renamed from: d */
    private static String m16270d(String str, Context context) {
        String j = C2694t.m21606o().mo10093j(context);
        String h = C2694t.m21606o().mo10091h(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(j)) {
            str = m16267a(str, "gmp_app_id", j).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(h)) ? str : m16267a(str, "fbs_aiid", h).toString();
    }
}
