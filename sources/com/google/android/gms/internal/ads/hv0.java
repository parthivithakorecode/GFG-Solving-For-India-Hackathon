package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.util.Map;

@TargetApi(11)
public final class hv0 extends iv0 {
    public hv0(eu0 eu0, C1527ar arVar, boolean z) {
        super(eu0, arVar, z);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return mo8283y0(webView, str, (Map<String, String>) null);
    }
}
