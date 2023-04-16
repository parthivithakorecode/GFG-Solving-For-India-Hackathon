package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public class oz2 {

    /* renamed from: a */
    private n03 f12384a = new n03((WebView) null);

    /* renamed from: b */
    private long f12385b;

    /* renamed from: c */
    private int f12386c;

    public oz2() {
        mo9894b();
    }

    /* renamed from: a */
    public final WebView mo9893a() {
        return (WebView) this.f12384a.get();
    }

    /* renamed from: b */
    public final void mo9894b() {
        this.f12385b = System.nanoTime();
        this.f12386c = 1;
    }

    /* renamed from: c */
    public void mo9895c() {
        this.f12384a.clear();
    }

    /* renamed from: d */
    public final void mo9896d(String str, long j) {
        if (j >= this.f12385b && this.f12386c != 3) {
            this.f12386c = 3;
            gz2.m10168a().mo7773f(mo9893a(), str);
        }
    }

    /* renamed from: e */
    public final void mo9897e(String str, long j) {
        if (j >= this.f12385b) {
            this.f12386c = 2;
            gz2.m10168a().mo7773f(mo9893a(), str);
        }
    }

    /* renamed from: f */
    public void mo9898f(py2 py2, ny2 ny2) {
        mo9899g(py2, ny2, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo9899g(py2 py2, ny2 ny2, JSONObject jSONObject) {
        String h = py2.mo10204h();
        JSONObject jSONObject2 = new JSONObject();
        sz2.m17046g(jSONObject2, "environment", "app");
        sz2.m17046g(jSONObject2, "adSessionType", ny2.mo9606d());
        JSONObject jSONObject3 = new JSONObject();
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("; ");
        sb.append(str2);
        sz2.m17046g(jSONObject3, "deviceType", sb.toString());
        sz2.m17046g(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        sz2.m17046g(jSONObject3, "os", "Android");
        sz2.m17046g(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        sz2.m17046g(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        sz2.m17046g(jSONObject4, "partnerName", ny2.mo9607e().mo11344b());
        sz2.m17046g(jSONObject4, "partnerVersion", ny2.mo9607e().mo11345c());
        sz2.m17046g(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        sz2.m17046g(jSONObject5, "libraryVersion", "1.3.3-google_20200416");
        sz2.m17046g(jSONObject5, "appId", ez2.m8914b().mo7204a().getApplicationContext().getPackageName());
        sz2.m17046g(jSONObject2, "app", jSONObject5);
        if (ny2.mo9608f() != null) {
            sz2.m17046g(jSONObject2, "contentUrl", ny2.mo9608f());
        }
        sz2.m17046g(jSONObject2, "customReferenceData", ny2.mo9609g());
        JSONObject jSONObject6 = new JSONObject();
        Iterator<vy2> it = ny2.mo9610h().iterator();
        if (!it.hasNext()) {
            gz2.m10168a().mo7774g(mo9893a(), h, jSONObject2, jSONObject6, jSONObject);
        } else {
            vy2 next = it.next();
            throw null;
        }
    }

    /* renamed from: h */
    public final void mo9900h(float f) {
        gz2.m10168a().mo7772e(mo9893a(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo9901i(WebView webView) {
        this.f12384a = new n03(webView);
    }

    /* renamed from: j */
    public void mo9902j() {
    }

    /* renamed from: k */
    public final boolean mo9903k() {
        return this.f12384a.get() != null;
    }
}
