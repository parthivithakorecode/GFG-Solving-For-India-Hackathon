package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import p054h1.C2694t;
import p069j1.C3163g2;

public final class gx2 {

    /* renamed from: a */
    private final Context f7873a;

    /* renamed from: b */
    private final String f7874b;

    /* renamed from: c */
    private final String f7875c;

    public gx2(Context context, po0 po0) {
        this.f7873a = context;
        this.f7874b = context.getPackageName();
        this.f7875c = po0.f12729f;
    }

    /* renamed from: a */
    public final void mo7727a(Map<String, String> map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        C2694t.m21608q();
        map.put("device", C3163g2.m23928f0());
        map.put("app", this.f7874b);
        C2694t.m21608q();
        map.put("is_lite_sdk", true != C3163g2.m23933i(this.f7873a) ? "0" : "1");
        List<String> b = m10.m13006b();
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10555m5)).booleanValue()) {
            b.addAll(C2694t.m21607p().mo11025h().mo14084e().mo9802d());
        }
        map.put("e", TextUtils.join(",", b));
        map.put("sdkVersion", this.f7875c);
    }
}
