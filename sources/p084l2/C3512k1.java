package p084l2;

import android.annotation.TargetApi;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebView;

/* renamed from: l2.k1 */
public class C3512k1 {

    /* renamed from: a */
    private static Boolean f21112a;

    private C3512k1() {
    }

    @TargetApi(19)
    /* renamed from: a */
    public static void m24915a(WebView webView, String str) {
        if (Build.VERSION.SDK_INT < 19 || !m24916b(webView)) {
            String valueOf = String.valueOf(str);
            webView.loadUrl(valueOf.length() != 0 ? "javascript:".concat(valueOf) : new String("javascript:"));
            return;
        }
        webView.evaluateJavascript(str, (ValueCallback) null);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0012 */
    @android.annotation.TargetApi(19)
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m24916b(android.webkit.WebView r3) {
        /*
            java.lang.Class<l2.k1> r0 = p084l2.C3512k1.class
            monitor-enter(r0)
            java.lang.Boolean r1 = f21112a     // Catch:{ all -> 0x001e }
            if (r1 != 0) goto L_0x0016
            java.lang.String r1 = "(function(){})()"
            r2 = 0
            r3.evaluateJavascript(r1, r2)     // Catch:{ IllegalStateException -> 0x0012 }
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ IllegalStateException -> 0x0012 }
            f21112a = r3     // Catch:{ IllegalStateException -> 0x0012 }
            goto L_0x0016
        L_0x0012:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x001e }
            f21112a = r3     // Catch:{ all -> 0x001e }
        L_0x0016:
            java.lang.Boolean r3 = f21112a     // Catch:{ all -> 0x001e }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x001e }
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return r3
        L_0x001e:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p084l2.C3512k1.m24916b(android.webkit.WebView):boolean");
    }
}
