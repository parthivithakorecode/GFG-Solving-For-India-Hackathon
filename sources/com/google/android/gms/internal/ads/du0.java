package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import p054h1.C2676b;
import p054h1.C2694t;
import p061i1.C2816o;
import p069j1.C3163g2;

@TargetApi(11)
public final class du0 extends WebChromeClient {

    /* renamed from: a */
    private final eu0 f5931a;

    public du0(eu0 eu0) {
        this.f5931a = eu0;
    }

    /* renamed from: b */
    private static final Context m8111b(WebView webView) {
        if (!(webView instanceof eu0)) {
            return webView.getContext();
        }
        eu0 eu0 = (eu0) webView;
        Activity j = eu0.mo7127j();
        return j != null ? j : eu0.getContext();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo6660a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        AlertDialog create;
        C2676b g;
        try {
            eu0 eu0 = this.f5931a;
            if (eu0 == null || eu0.mo7077D0() == null || this.f5931a.mo7077D0().mo9049g() == null || (g = this.f5931a.mo7077D0().mo9049g()) == null || g.mo12668c()) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle(str2);
                if (z) {
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(context);
                    textView.setText(str3);
                    EditText editText = new EditText(context);
                    editText.setText(str4);
                    linearLayout.addView(textView);
                    linearLayout.addView(editText);
                    create = builder.setView(linearLayout).setPositiveButton(17039370, new bu0(jsPromptResult, editText)).setNegativeButton(17039360, new au0(jsPromptResult)).setOnCancelListener(new zt0(jsPromptResult)).create();
                } else {
                    create = builder.setMessage(str3).setPositiveButton(17039370, new yt0(jsResult)).setNegativeButton(17039360, new xt0(jsResult)).setOnCancelListener(new wt0(jsResult)).create();
                }
                create.show();
                return true;
            }
            StringBuilder sb = new StringBuilder(str.length() + 11 + String.valueOf(str3).length());
            sb.append("window.");
            sb.append(str);
            sb.append("('");
            sb.append(str3);
            sb.append("')");
            g.mo12667b(sb.toString());
            return false;
        } catch (WindowManager.BadTokenException e) {
            io0.m11132h("Fail to display Dialog.", e);
        }
    }

    public final void onCloseWindow(WebView webView) {
        String str;
        if (!(webView instanceof eu0)) {
            str = "Tried to close a WebView that wasn't an AdWebView.";
        } else {
            C2816o O = ((eu0) webView).mo7096O();
            if (O == null) {
                str = "Tried to close an AdWebView not associated with an overlay.";
            } else {
                O.mo13076a();
                return;
            }
        }
        io0.m11131g(str);
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 19 + String.valueOf(sourceId).length());
        sb.append("JS: ");
        sb.append(message);
        sb.append(" (");
        sb.append(sourceId);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(")");
        String sb2 = sb.toString();
        if (sb2.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = cu0.f5522a[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            io0.m11128d(sb2);
        } else if (i == 2) {
            io0.m11131g(sb2);
        } else if (i == 3 || i == 4 || i != 5) {
            io0.m11130f(sb2);
        } else {
            io0.m11126b(sb2);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.f5931a.mo7149v() != null) {
            webView2.setWebViewClient(this.f5931a.mo7149v());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j == 0) {
            if (j2 > j4 || j2 > 1048576) {
                j2 = 0;
            }
        } else if (j2 == 0) {
            j2 = Math.min(j + Math.min(131072, j4), 1048576);
        } else {
            if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        }
        quotaUpdater.updateQuota(j2);
    }

    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z;
        if (callback != null) {
            C2694t.m21608q();
            if (!C3163g2.m23927f(this.f5931a.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                C2694t.m21608q();
                if (!C3163g2.m23927f(this.f5931a.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z = false;
                    callback.invoke(str, z, true);
                }
            }
            z = true;
            callback.invoke(str, z, true);
        }
    }

    public final void onHideCustomView() {
        C2816o O = this.f5931a.mo7096O();
        if (O == null) {
            io0.m11131g("Could not get ad overlay when hiding custom view.");
        } else {
            O.mo13079d();
        }
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return mo6660a(m8111b(webView), "alert", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return mo6660a(m8111b(webView), "onBeforeUnload", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return mo6660a(m8111b(webView), "confirm", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return mo6660a(m8111b(webView), "prompt", str, str2, str3, (JsResult) null, jsPromptResult, true);
    }

    @Deprecated
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        C2816o O = this.f5931a.mo7096O();
        if (O == null) {
            io0.m11131g("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        O.mo13067A5(view, customViewCallback);
        O.mo13071G5(i);
    }

    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
