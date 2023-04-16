package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;
import p054h1.C2694t;
import p069j1.C3163g2;

public final class p10 {

    /* renamed from: a */
    private final String f12416a = w20.f16657b.mo9928e();

    /* renamed from: b */
    private final Map<String, String> f12417b;

    /* renamed from: c */
    private final Context f12418c;

    /* renamed from: d */
    private final String f12419d;

    public p10(Context context, String str) {
        this.f12418c = context;
        this.f12419d = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f12417b = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        C2694t.m21608q();
        linkedHashMap.put("device", C3163g2.m23928f0());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        C2694t.m21608q();
        linkedHashMap.put("is_lite_sdk", true != C3163g2.m23933i(context) ? "0" : "1");
        Future<aj0> b = C2694t.m21605n().mo6480b(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(b.get().f4219k));
            linkedHashMap.put("network_fine", Integer.toString(b.get().f4220l));
        } catch (Exception e) {
            C2694t.m21607p().mo11034s(e, "CsiConfiguration.CsiConfiguration");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context mo9921a() {
        return this.f12418c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo9922b() {
        return this.f12419d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo9923c() {
        return this.f12416a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Map<String, String> mo9924d() {
        return this.f12417b;
    }
}
