package p066io.flutter.plugins.urllauncher;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.flutter.plugins.urllauncher.WebViewActivity */
public class WebViewActivity extends Activity {

    /* renamed from: j */
    public static String f20220j = "close action";

    /* renamed from: k */
    private static String f20221k = "url";

    /* renamed from: l */
    private static String f20222l = "enableJavaScript";

    /* renamed from: m */
    private static String f20223m = "enableDomStorage";

    /* renamed from: f */
    private final BroadcastReceiver f20224f = new C3093a();

    /* renamed from: g */
    private final WebViewClient f20225g = new C3094b();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public WebView f20226h;

    /* renamed from: i */
    private IntentFilter f20227i = new IntentFilter(f20220j);

    /* renamed from: io.flutter.plugins.urllauncher.WebViewActivity$a */
    class C3093a extends BroadcastReceiver {
        C3093a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (WebViewActivity.f20220j.equals(intent.getAction())) {
                WebViewActivity.this.finish();
            }
        }
    }

    /* renamed from: io.flutter.plugins.urllauncher.WebViewActivity$b */
    class C3094b extends WebViewClient {
        C3094b() {
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            if (Build.VERSION.SDK_INT < 21) {
                return false;
            }
            webView.loadUrl(webResourceRequest.getUrl().toString());
            return false;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (Build.VERSION.SDK_INT >= 21) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            webView.loadUrl(str);
            return false;
        }
    }

    /* renamed from: io.flutter.plugins.urllauncher.WebViewActivity$c */
    private class C3095c extends WebChromeClient {

        /* renamed from: io.flutter.plugins.urllauncher.WebViewActivity$c$a */
        class C3096a extends WebViewClient {
            C3096a() {
            }

            @TargetApi(21)
            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                WebViewActivity.this.f20226h.loadUrl(webResourceRequest.getUrl().toString());
                return true;
            }

            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                WebViewActivity.this.f20226h.loadUrl(str);
                return true;
            }
        }

        private C3095c() {
        }

        /* synthetic */ C3095c(WebViewActivity webViewActivity, C3093a aVar) {
            this();
        }

        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            C3096a aVar = new C3096a();
            WebView webView2 = new WebView(WebViewActivity.this.f20226h.getContext());
            webView2.setWebViewClient(aVar);
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
    }

    /* renamed from: b */
    public static Intent m23618b(Context context, String str, boolean z, boolean z2, Bundle bundle) {
        return new Intent(context, WebViewActivity.class).putExtra(f20221k, str).putExtra(f20222l, z).putExtra(f20223m, z2).putExtra("com.android.browser.headers", bundle);
    }

    /* renamed from: c */
    public static Map<String, String> m23619c(Bundle bundle) {
        if (bundle == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            hashMap.put(str, bundle.getString(str));
        }
        return hashMap;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        this.f20226h = webView;
        setContentView(webView);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra(f20221k);
        boolean booleanExtra = intent.getBooleanExtra(f20222l, false);
        boolean booleanExtra2 = intent.getBooleanExtra(f20223m, false);
        this.f20226h.loadUrl(stringExtra, m23619c(intent.getBundleExtra("com.android.browser.headers")));
        this.f20226h.getSettings().setJavaScriptEnabled(booleanExtra);
        this.f20226h.getSettings().setDomStorageEnabled(booleanExtra2);
        this.f20226h.setWebViewClient(this.f20225g);
        this.f20226h.getSettings().setSupportMultipleWindows(true);
        this.f20226h.setWebChromeClient(new C3095c(this, (C3093a) null));
        registerReceiver(this.f20224f, this.f20227i);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f20224f);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !this.f20226h.canGoBack()) {
            return super.onKeyDown(i, keyEvent);
        }
        this.f20226h.goBack();
        return true;
    }
}
