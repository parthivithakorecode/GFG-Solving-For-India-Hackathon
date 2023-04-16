package p111p1;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.C1734gb;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.m10;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import p002a1.C0015b;
import p002a1.C0022g;
import p054h1.C2694t;
import p118q1.C3941b;

/* renamed from: p1.a */
final class C3887a {

    /* renamed from: a */
    private final Context f21972a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final WebView f21973b;

    /* renamed from: c */
    private final C1734gb f21974c;

    C3887a(WebView webView, C1734gb gbVar) {
        this.f21973b = webView;
        this.f21972a = webView.getContext();
        this.f21974c = gbVar;
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getClickSignals(String str) {
        m10.m13007c(this.f21972a);
        try {
            return this.f21974c.mo7560c().mo6115f(this.f21972a, str, this.f21973b);
        } catch (RuntimeException e) {
            io0.m11129e("Exception getting click signals. ", e);
            C2694t.m21607p().mo11034s(e, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getQueryInfo() {
        C2694t.m21608q();
        String uuid = UUID.randomUUID().toString();
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        Context context = this.f21972a;
        C0015b bVar = C0015b.BANNER;
        C0022g.C0023a aVar = new C0022g.C0023a();
        aVar.mo44b(AdMobAdapter.class, bundle);
        C3941b.m26116a(context, bVar, aVar.mo45c(), new C3907k(this, uuid));
        return uuid;
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getViewSignals() {
        m10.m13007c(this.f21972a);
        try {
            return this.f21974c.mo7560c().mo6112c(this.f21972a, this.f21973b, (Activity) null);
        } catch (RuntimeException e) {
            io0.m11129e("Exception getting view signals. ", e);
            C2694t.m21607p().mo11034s(e, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public void reportTouchEvent(String str) {
        int i;
        int i2;
        m10.m13007c(this.f21972a);
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i3 = jSONObject.getInt("x");
            int i4 = jSONObject.getInt("y");
            int i5 = jSONObject.getInt("duration_ms");
            float f = (float) jSONObject.getDouble("force");
            int i6 = jSONObject.getInt("type");
            if (i6 != 0) {
                if (i6 == 1) {
                    i = 1;
                } else if (i6 == 2) {
                    i = 2;
                } else if (i6 != 3) {
                    i2 = -1;
                } else {
                    i = 3;
                }
                this.f21974c.mo7561d(MotionEvent.obtain(0, (long) i5, i, (float) i3, (float) i4, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            }
            i2 = 0;
            i = i2;
            this.f21974c.mo7561d(MotionEvent.obtain(0, (long) i5, i, (float) i3, (float) i4, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
        } catch (RuntimeException | JSONException e) {
            io0.m11129e("Failed to parse the touch string. ", e);
            C2694t.m21607p().mo11034s(e, "TaggingLibraryJsInterface.reportTouchEvent");
        }
    }
}
