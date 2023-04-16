package com.google.android.gms.internal.ads;

import android.content.Context;
import p054h1.C2694t;
import p069j1.C3202r1;

public final class zs2 {
    /* renamed from: a */
    public static void m20830a(Context context, boolean z) {
        String sb;
        if (z) {
            sb = "This request is sent from a test device.";
        } else {
            C2125qw.m15897b();
            String t = bo0.m6996t(context);
            StringBuilder sb2 = new StringBuilder(String.valueOf(t).length() + 102);
            sb2.append("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"");
            sb2.append(t);
            sb2.append("\")) to get test ads on this device.");
            sb = sb2.toString();
        }
        io0.m11130f(sb);
    }

    /* renamed from: b */
    public static void m20831b(int i, Throwable th, String str) {
        StringBuilder sb = new StringBuilder(31);
        sb.append("Ad failed to load : ");
        sb.append(i);
        io0.m11130f(sb.toString());
        C3202r1.m24016l(str, th);
        if (i != 3) {
            C2694t.m21607p().mo11033r(th, str);
        }
    }
}
