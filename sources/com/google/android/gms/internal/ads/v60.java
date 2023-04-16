package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import p054h1.C2694t;

public final class v60 implements t70<eu0> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5150a(Object obj, Map map) {
        eu0 eu0 = (eu0) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                io0.m11131g("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str4)) {
                io0.m11131g("No timestamp given for CSI tick.");
            } else {
                try {
                    long b = C2694t.m21592a().mo12463b() + (Long.parseLong(str4) - C2694t.m21592a().mo12462a());
                    if (true == TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    eu0.mo7134n().mo12130c(str2, str3, b);
                } catch (NumberFormatException e) {
                    io0.m11132h("Malformed timestamp for CSI tick.", e);
                }
            }
        } else if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                io0.m11131g("No value given for CSI experiment.");
            } else {
                eu0.mo7134n().mo12128a().mo5631d("e", str5);
            }
        } else if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                io0.m11131g("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                io0.m11131g("No name given for CSI extra.");
            } else {
                eu0.mo7134n().mo12128a().mo5631d(str6, str7);
            }
        }
    }
}
