package p069j1;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import com.google.android.gms.internal.ads.C1527ar;
import com.google.android.gms.internal.ads.eu0;
import com.google.android.gms.internal.ads.hv0;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.lu0;
import java.io.InputStream;
import java.util.Map;
import p054h1.C2694t;

@TargetApi(16)
/* renamed from: j1.f */
public class C3156f {
    private C3156f() {
    }

    /* synthetic */ C3156f(C3152e eVar) {
    }

    /* renamed from: r */
    public static C3156f m23875r(int i) {
        return i >= 28 ? new C3148d() : i >= 26 ? new C3140b() : i >= 24 ? new C3187m2() : i >= 21 ? new C3183l2() : i >= 19 ? new C3179k2() : i >= 18 ? new C3175j2() : i >= 17 ? new C3171i2() : new C3156f();
    }

    /* renamed from: s */
    public static final boolean m23876s() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    /* renamed from: a */
    public int mo13996a(ContentResolver contentResolver) {
        return Settings.System.getInt(contentResolver, "airplane_mode_on", 0);
    }

    /* renamed from: b */
    public int mo13997b(ContentResolver contentResolver) {
        return Settings.System.getInt(contentResolver, "wifi_on", 0);
    }

    /* renamed from: c */
    public Drawable mo13998c(Context context, Bitmap bitmap, boolean z, float f) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    /* renamed from: d */
    public String mo13999d(Context context) {
        return "";
    }

    /* renamed from: e */
    public void mo14000e(Context context) {
    }

    /* renamed from: f */
    public boolean mo14001f(Context context, WebSettings webSettings) {
        C3170i1.m23966a(context, new C3167h2(context, webSettings));
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        return true;
    }

    /* renamed from: g */
    public int mo14002g() {
        return 5;
    }

    /* renamed from: h */
    public long mo14003h() {
        return -1;
    }

    /* renamed from: i */
    public boolean mo14004i(View view) {
        return (view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true;
    }

    /* renamed from: j */
    public ViewGroup.LayoutParams mo14005j() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    /* renamed from: k */
    public int mo14006k() {
        return 1;
    }

    /* renamed from: l */
    public CookieManager mo14007l(Context context) {
        if (m23876s()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            io0.m11129e("Failed to obtain CookieManager.", th);
            C2694t.m21607p().mo11034s(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    /* renamed from: m */
    public WebResourceResponse mo14008m(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    /* renamed from: n */
    public lu0 mo14009n(eu0 eu0, C1527ar arVar, boolean z) {
        return new hv0(eu0, arVar, z);
    }

    /* renamed from: o */
    public boolean mo14010o(Activity activity, Configuration configuration) {
        return false;
    }

    /* renamed from: p */
    public int mo13972p(Context context, TelephonyManager telephonyManager) {
        return 1001;
    }

    /* renamed from: q */
    public void mo13992q(Activity activity) {
    }
}
