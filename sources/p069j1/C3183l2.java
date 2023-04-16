package p069j1;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.C1527ar;
import com.google.android.gms.internal.ads.eu0;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.jv0;
import com.google.android.gms.internal.ads.lu0;
import java.io.InputStream;
import java.util.Map;
import p054h1.C2694t;

@TargetApi(21)
/* renamed from: j1.l2 */
public class C3183l2 extends C3179k2 {
    /* renamed from: k */
    public final int mo14006k() {
        return 16974374;
    }

    /* renamed from: l */
    public final CookieManager mo14007l(Context context) {
        if (C3156f.m23876s()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            io0.m11129e("Failed to obtain CookieManager.", th);
            C2694t.m21607p().mo11034s(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    /* renamed from: m */
    public final WebResourceResponse mo14008m(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i, str3, map, inputStream);
    }

    /* renamed from: n */
    public final lu0 mo14009n(eu0 eu0, C1527ar arVar, boolean z) {
        return new jv0(eu0, arVar, z);
    }
}
