package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class rz2 extends oz2 {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public WebView f14178d;

    /* renamed from: e */
    private Long f14179e = null;

    /* renamed from: f */
    private final Map<String, vy2> f14180f;

    public rz2(Map<String, vy2> map, String str) {
        this.f14180f = map;
    }

    /* renamed from: c */
    public final void mo9895c() {
        super.mo9895c();
        new Handler().postDelayed(new qz2(this), Math.max(4000 - (this.f14179e == null ? 4000 : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f14179e.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f14178d = null;
    }

    /* renamed from: f */
    public final void mo9898f(py2 py2, ny2 ny2) {
        JSONObject jSONObject = new JSONObject();
        Map<String, vy2> i = ny2.mo9611i();
        for (String next : i.keySet()) {
            sz2.m17046g(jSONObject, next, i.get(next));
        }
        mo9899g(py2, ny2, jSONObject);
    }

    /* renamed from: j */
    public final void mo9902j() {
        WebView webView = new WebView(ez2.m8914b().mo7204a());
        this.f14178d = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo9901i(this.f14178d);
        WebView webView2 = this.f14178d;
        if (webView2 != null && !TextUtils.isEmpty((CharSequence) null)) {
            webView2.loadUrl("javascript: null");
        }
        Iterator<String> it = this.f14180f.keySet().iterator();
        if (!it.hasNext()) {
            this.f14179e = Long.valueOf(System.nanoTime());
            return;
        }
        vy2 vy2 = this.f14180f.get(it.next());
        throw null;
    }
}
