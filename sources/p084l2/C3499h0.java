package p084l2;

import android.annotation.TargetApi;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: l2.h0 */
final class C3499h0 extends WebViewClient {

    /* renamed from: a */
    private final /* synthetic */ C3495g0 f21082a;

    private C3499h0(C3495g0 g0Var) {
        this.f21082a = g0Var;
    }

    public final void onLoadResource(WebView webView, String str) {
        if (C3495g0.m24884c(str)) {
            this.f21082a.f21063g.mo14603d(str);
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        if (!this.f21082a.f21064h) {
            C3515l0 unused = this.f21082a.f21063g;
            Log.d("UserMessagingPlatform", "Wall html loaded.");
            boolean unused2 = this.f21082a.f21064h = true;
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f21082a.f21063g.mo14602c(i, str, str2);
    }

    @TargetApi(24)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String uri = webResourceRequest.getUrl().toString();
        if (!C3495g0.m24884c(uri)) {
            return false;
        }
        this.f21082a.f21063g.mo14603d(uri);
        return true;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!C3495g0.m24884c(str)) {
            return false;
        }
        this.f21082a.f21063g.mo14603d(str);
        return true;
    }
}
