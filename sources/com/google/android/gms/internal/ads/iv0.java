package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;
import p054h1.C2694t;
import p069j1.C3163g2;

@TargetApi(11)
public class iv0 extends lu0 {
    public iv0(eu0 eu0, C1527ar arVar, boolean z) {
        super(eu0, arVar, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y0 */
    public final WebResourceResponse mo8283y0(WebView webView, String str, Map<String, String> map) {
        if (!(webView instanceof eu0)) {
            io0.m11131g("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        eu0 eu0 = (eu0) webView;
        ml0 ml0 = this.f10173z;
        if (ml0 != null) {
            ml0.mo7368a(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.mo9032B(str, map);
        }
        if (eu0.mo7077D0() != null) {
            eu0.mo7077D0().mo9038Z();
        }
        String str2 = (String) C2199sw.m17001c().mo8579b(eu0.mo7151x().mo11531i() ? m10.f10305J : eu0.mo7090K0() ? m10.f10297I : m10.f10289H);
        C2694t.m21608q();
        return C3163g2.m23919b(eu0.getContext(), eu0.mo7129l().f12729f, str2);
    }
}
