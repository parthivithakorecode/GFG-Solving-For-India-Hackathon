package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import com.google.android.gms.internal.ads.gv0;
import com.google.android.gms.internal.ads.nv0;
import com.google.android.gms.internal.ads.pv0;
import p069j1.C3163g2;
import p069j1.C3202r1;

@TargetApi(17)
public final class fv0<WebViewT extends gv0 & nv0 & pv0> {

    /* renamed from: a */
    private final WebViewT f6960a;

    /* renamed from: b */
    private final dv0 f6961b;

    public fv0(gv0 gv0, WebViewT webviewt, dv0 dv0) {
        this.f6961b = webviewt;
        this.f6960a = gv0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo7408a(String str) {
        dv0 dv0 = this.f6961b;
        Uri parse = Uri.parse(str);
        lu0 h1 = ((yu0) dv0.f5934a).mo12085h1();
        if (h1 == null) {
            io0.m11128d("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            h1.mo9055l0(parse);
        }
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "Click string is empty, not proceeding.";
        } else {
            C1734gb H = this.f6960a.mo7083H();
            if (H == null) {
                str2 = "Signal utils is empty, ignoring.";
            } else {
                C1585cb c = H.mo7560c();
                if (c == null) {
                    str2 = "Signals object is empty, ignoring.";
                } else if (this.f6960a.getContext() == null) {
                    str2 = "Context is null, ignoring.";
                } else {
                    Context context = this.f6960a.getContext();
                    WebViewT webviewt = this.f6960a;
                    return c.mo6116g(context, str, (View) webviewt, webviewt.mo7127j());
                }
            }
        }
        C3202r1.m24015k(str2);
        return "";
    }

    @JavascriptInterface
    public void notify(String str) {
        if (TextUtils.isEmpty(str)) {
            io0.m11131g("URL is empty, ignoring message");
        } else {
            C3163g2.f20465i.post(new ev0(this, str));
        }
    }
}
