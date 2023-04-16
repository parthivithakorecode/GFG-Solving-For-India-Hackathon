package p069j1;

import android.content.Context;
import android.webkit.WebSettings;
import com.google.android.gms.internal.ads.C2199sw;
import com.google.android.gms.internal.ads.m10;
import java.util.concurrent.Callable;

/* renamed from: j1.h2 */
public final /* synthetic */ class C3167h2 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Context f20477a;

    /* renamed from: b */
    public final /* synthetic */ WebSettings f20478b;

    public /* synthetic */ C3167h2(Context context, WebSettings webSettings) {
        this.f20477a = context;
        this.f20478b = webSettings;
    }

    public final Object call() {
        Context context = this.f20477a;
        WebSettings webSettings = this.f20478b;
        if (context.getCacheDir() != null) {
            webSettings.setAppCachePath(context.getCacheDir().getAbsolutePath());
            webSettings.setAppCacheMaxSize(0);
            webSettings.setAppCacheEnabled(true);
        }
        webSettings.setDatabasePath(context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
        webSettings.setDatabaseEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setSupportZoom(true);
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10660z0)).booleanValue()) {
            webSettings.setTextZoom(100);
        }
        webSettings.setAllowContentAccess(false);
        return Boolean.TRUE;
    }
}
