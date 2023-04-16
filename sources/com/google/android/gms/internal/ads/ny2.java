package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ny2 {

    /* renamed from: a */
    private final uy2 f11762a;

    /* renamed from: b */
    private final WebView f11763b;

    /* renamed from: c */
    private final List<vy2> f11764c = new ArrayList();

    /* renamed from: d */
    private final Map<String, vy2> f11765d = new HashMap();

    /* renamed from: e */
    private final String f11766e;

    /* renamed from: f */
    private final String f11767f;

    /* renamed from: g */
    private final oy2 f11768g;

    private ny2(uy2 uy2, WebView webView, String str, List<vy2> list, String str2, String str3, oy2 oy2) {
        this.f11762a = uy2;
        this.f11763b = webView;
        this.f11768g = oy2;
        this.f11767f = str2;
        this.f11766e = "";
    }

    /* renamed from: b */
    public static ny2 m14172b(uy2 uy2, WebView webView, String str, String str2) {
        return new ny2(uy2, webView, (String) null, (List<vy2>) null, str, "", oy2.HTML);
    }

    /* renamed from: c */
    public static ny2 m14173c(uy2 uy2, WebView webView, String str, String str2) {
        return new ny2(uy2, webView, (String) null, (List<vy2>) null, str, "", oy2.JAVASCRIPT);
    }

    /* renamed from: a */
    public final WebView mo9605a() {
        return this.f11763b;
    }

    /* renamed from: d */
    public final oy2 mo9606d() {
        return this.f11768g;
    }

    /* renamed from: e */
    public final uy2 mo9607e() {
        return this.f11762a;
    }

    /* renamed from: f */
    public final String mo9608f() {
        return this.f11767f;
    }

    /* renamed from: g */
    public final String mo9609g() {
        return this.f11766e;
    }

    /* renamed from: h */
    public final List<vy2> mo9610h() {
        return Collections.unmodifiableList(this.f11764c);
    }

    /* renamed from: i */
    public final Map<String, vy2> mo9611i() {
        return Collections.unmodifiableMap(this.f11765d);
    }
}
