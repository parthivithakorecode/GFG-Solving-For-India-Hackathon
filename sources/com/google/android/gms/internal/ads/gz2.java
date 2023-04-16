package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import org.json.JSONObject;

public final class gz2 {

    /* renamed from: a */
    private static final gz2 f7934a = new gz2();

    private gz2() {
    }

    /* renamed from: a */
    public static gz2 m10168a() {
        return f7934a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo7769b(WebView webView, String str, Object... objArr) {
        String obj;
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            if (r6 > 0) {
                for (Object obj2 : objArr) {
                    if (obj2 == null) {
                        obj = "\"\"";
                    } else {
                        if (obj2 instanceof String) {
                            obj = obj2.toString();
                            if (!obj.startsWith("{")) {
                                sb.append('\"');
                                sb.append(obj);
                                sb.append('\"');
                            }
                        } else {
                            sb.append(obj2);
                        }
                        sb.append(",");
                    }
                    sb.append(obj);
                    sb.append(",");
                }
                sb.setLength(sb.length() - 1);
            }
            sb.append(")}");
            String sb2 = sb.toString();
            Handler handler = webView.getHandler();
            if (handler == null || Looper.myLooper() == handler.getLooper()) {
                webView.loadUrl(sb2);
            } else {
                handler.post(new fz2(this, webView, sb2));
            }
        } else {
            String concat = str.length() != 0 ? "The WebView is null for ".concat(str) : new String("The WebView is null for ");
            if (hy2.f8462a.booleanValue() && !TextUtils.isEmpty(concat)) {
                Log.i("OMIDLIB", concat);
            }
        }
    }

    /* renamed from: c */
    public final void mo7770c(WebView webView) {
        mo7769b(webView, "finishSession", new Object[0]);
    }

    /* renamed from: d */
    public final void mo7771d(WebView webView, JSONObject jSONObject) {
        mo7769b(webView, "init", jSONObject);
    }

    /* renamed from: e */
    public final void mo7772e(WebView webView, float f) {
        mo7769b(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: f */
    public final void mo7773f(WebView webView, String str) {
        mo7769b(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: g */
    public final void mo7774g(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo7769b(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }
}
