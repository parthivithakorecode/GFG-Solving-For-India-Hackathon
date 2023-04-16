package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;
import p034e2.C2555l;
import p034e2.C2556m;
import p048g2.C2635a;
import p054h1.C2675a;
import p054h1.C2686l;
import p054h1.C2694t;
import p061i1.C2807f;
import p061i1.C2816o;
import p069j1.C3163g2;
import p069j1.C3196p1;
import p069j1.C3202r1;
import p069j1.C3219x0;

@SuppressLint({"ViewConstructor"})
@ParametersAreNonnullByDefault
final class yu0 extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, eu0 {

    /* renamed from: f0 */
    public static final /* synthetic */ int f17859f0 = 0;
    @GuardedBy("this")

    /* renamed from: A */
    private Boolean f17860A;
    @GuardedBy("this")

    /* renamed from: B */
    private boolean f17861B = true;
    @GuardedBy("this")

    /* renamed from: C */
    private final String f17862C = "";
    @GuardedBy("this")

    /* renamed from: D */
    private bv0 f17863D;
    @GuardedBy("this")

    /* renamed from: E */
    private boolean f17864E;
    @GuardedBy("this")

    /* renamed from: F */
    private boolean f17865F;
    @GuardedBy("this")

    /* renamed from: G */
    private a40 f17866G;
    @GuardedBy("this")

    /* renamed from: H */
    private y30 f17867H;
    @GuardedBy("this")

    /* renamed from: I */
    private C2007np f17868I;
    @GuardedBy("this")

    /* renamed from: J */
    private int f17869J;
    /* access modifiers changed from: private */
    @GuardedBy("this")

    /* renamed from: K */
    public int f17870K;

    /* renamed from: L */
    private y10 f17871L;

    /* renamed from: M */
    private final y10 f17872M;

    /* renamed from: N */
    private y10 f17873N;

    /* renamed from: O */
    private final z10 f17874O;

    /* renamed from: P */
    private int f17875P;

    /* renamed from: Q */
    private int f17876Q;

    /* renamed from: R */
    private int f17877R;
    @GuardedBy("this")

    /* renamed from: S */
    private C2816o f17878S;
    @GuardedBy("this")

    /* renamed from: T */
    private boolean f17879T;

    /* renamed from: U */
    private final C3196p1 f17880U;

    /* renamed from: V */
    private int f17881V = -1;

    /* renamed from: W */
    private int f17882W = -1;

    /* renamed from: a0 */
    private int f17883a0 = -1;

    /* renamed from: b0 */
    private int f17884b0 = -1;

    /* renamed from: c0 */
    private Map<String, ts0> f17885c0;

    /* renamed from: d0 */
    private final WindowManager f17886d0;

    /* renamed from: e0 */
    private final C1527ar f17887e0;

    /* renamed from: f */
    private final uv0 f17888f;

    /* renamed from: g */
    private final C1734gb f17889g;

    /* renamed from: h */
    private final m20 f17890h;

    /* renamed from: i */
    private final po0 f17891i;

    /* renamed from: j */
    private C2686l f17892j;

    /* renamed from: k */
    private final C2675a f17893k;

    /* renamed from: l */
    private final DisplayMetrics f17894l;

    /* renamed from: m */
    private final float f17895m;

    /* renamed from: n */
    private rr2 f17896n;

    /* renamed from: o */
    private ur2 f17897o;

    /* renamed from: p */
    private boolean f17898p = false;

    /* renamed from: q */
    private boolean f17899q = false;

    /* renamed from: r */
    private lu0 f17900r;
    @GuardedBy("this")

    /* renamed from: s */
    private C2816o f17901s;
    @GuardedBy("this")

    /* renamed from: t */
    private C2635a f17902t;
    @GuardedBy("this")

    /* renamed from: u */
    private vv0 f17903u;
    @GuardedBy("this")

    /* renamed from: v */
    private final String f17904v;
    @GuardedBy("this")

    /* renamed from: w */
    private boolean f17905w;
    @GuardedBy("this")

    /* renamed from: x */
    private boolean f17906x;
    @GuardedBy("this")

    /* renamed from: y */
    private boolean f17907y;
    @GuardedBy("this")

    /* renamed from: z */
    private boolean f17908z;

    protected yu0(uv0 uv0, vv0 vv0, String str, boolean z, boolean z2, C1734gb gbVar, m20 m20, po0 po0, b20 b20, C2686l lVar, C2675a aVar, C1527ar arVar, rr2 rr2, ur2 ur2) {
        super(uv0);
        ur2 ur22;
        this.f17888f = uv0;
        this.f17903u = vv0;
        this.f17904v = str;
        this.f17907y = z;
        this.f17889g = gbVar;
        this.f17890h = m20;
        this.f17891i = po0;
        this.f17892j = lVar;
        this.f17893k = aVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.f17886d0 = windowManager;
        C2694t.m21608q();
        DisplayMetrics g0 = C3163g2.m23930g0(windowManager);
        this.f17894l = g0;
        this.f17895m = g0.density;
        this.f17887e0 = arVar;
        this.f17896n = rr2;
        this.f17897o = ur2;
        this.f17880U = new C3196p1(uv0.mo11309a(), this, this, (ViewTreeObserver.OnScrollChangedListener) null);
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            io0.m11129e("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(C2694t.m21608q().mo14022L(uv0, po0.f12729f));
        C2694t.m21609r().mo14001f(getContext(), settings);
        setDownloadListener(this);
        m20213q1();
        if (C2555l.m21209c()) {
            addJavascriptInterface(new fv0(this, new dv0(this), (dv0) null), "googleAdsJsInterface");
        }
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        m20221y1();
        z10 z10 = new z10(new b20(true, "make_wv", this.f17904v));
        this.f17874O = z10;
        z10.mo12128a().mo5630c((b20) null);
        if (!(!((Boolean) C2199sw.m17001c().mo8579b(m10.f10596r1)).booleanValue() || (ur22 = this.f17897o) == null || ur22.f15729b == null)) {
            z10.mo12128a().mo5631d("gqi", this.f17897o.f15729b);
        }
        z10.mo12128a();
        y10 f = b20.m6560f();
        this.f17872M = f;
        z10.mo12129b("native:view_create", f);
        this.f17873N = null;
        this.f17871L = null;
        C2694t.m21609r().mo14000e(uv0);
        C2694t.m21607p().mo11031p();
    }

    /* renamed from: q1 */
    private final synchronized void m20213q1() {
        rr2 rr2 = this.f17896n;
        if (rr2 != null) {
            if (rr2.f13905k0) {
                io0.m11126b("Disabling hardware acceleration on an overlay.");
                m20215s1();
                return;
            }
        }
        if (!this.f17907y) {
            if (!this.f17903u.mo11531i()) {
                if (Build.VERSION.SDK_INT < 18) {
                    io0.m11126b("Disabling hardware acceleration on an AdView.");
                    m20215s1();
                    return;
                }
                io0.m11126b("Enabling hardware acceleration on an AdView.");
                m20217u1();
                return;
            }
        }
        io0.m11126b("Enabling hardware acceleration on an overlay.");
        m20217u1();
    }

    /* renamed from: r1 */
    private final synchronized void m20214r1() {
        if (!this.f17879T) {
            this.f17879T = true;
            C2694t.m21607p().mo11030o();
        }
    }

    /* renamed from: s1 */
    private final synchronized void m20215s1() {
        if (!this.f17908z) {
            setLayerType(1, (Paint) null);
        }
        this.f17908z = true;
    }

    /* renamed from: t1 */
    private final void m20216t1(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != z ? "0" : "1");
        mo6424t("onAdVisibilityChanged", hashMap);
    }

    /* renamed from: u1 */
    private final synchronized void m20217u1() {
        if (this.f17908z) {
            setLayerType(0, (Paint) null);
        }
        this.f17908z = false;
    }

    /* renamed from: v1 */
    private final synchronized void m20218v1(String str) {
        try {
            super.loadUrl("about:blank");
        } catch (Throwable th) {
            C2694t.m21607p().mo11034s(th, "AdWebViewImpl.loadUrlUnsafe");
            io0.m11132h("Could not call loadUrl in destroy(). ", th);
        }
    }

    /* renamed from: w1 */
    private final void m20219w1() {
        t10.m17056a(this.f17874O.mo12128a(), this.f17872M, "aeh2");
    }

    /* renamed from: x1 */
    private final synchronized void m20220x1() {
        Map<String, ts0> map = this.f17885c0;
        if (map != null) {
            for (ts0 a : map.values()) {
                a.mo6283a();
            }
        }
        this.f17885c0 = null;
    }

    /* renamed from: y1 */
    private final void m20221y1() {
        z10 z10 = this.f17874O;
        if (z10 != null) {
            b20 a = z10.mo12128a();
            r10 f = C2694t.m21607p().mo11023f();
            if (f != null) {
                f.mo10453f(a);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:9|10|11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        mo12090o1(java.lang.Boolean.FALSE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001a */
    /* renamed from: z1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m20222z1() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.tn0 r0 = p054h1.C2694t.m21607p()     // Catch:{ all -> 0x0023 }
            java.lang.Boolean r0 = r0.mo11027k()     // Catch:{ all -> 0x0023 }
            r2.f17860A = r0     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x0021
            java.lang.String r0 = "(function(){})()"
            r1 = 0
            r2.evaluateJavascript(r0, r1)     // Catch:{ IllegalStateException -> 0x001a }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ IllegalStateException -> 0x001a }
            r2.mo12090o1(r0)     // Catch:{ IllegalStateException -> 0x001a }
            monitor-exit(r2)
            return
        L_0x001a:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0023 }
            r2.mo12090o1(r0)     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)
            return
        L_0x0021:
            monitor-exit(r2)
            return
        L_0x0023:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yu0.m20222z1():void");
    }

    /* renamed from: A */
    public final rr2 mo7073A() {
        return this.f17896n;
    }

    /* renamed from: A0 */
    public final void mo7074A0() {
        if (this.f17871L == null) {
            t10.m17056a(this.f17874O.mo12128a(), this.f17872M, "aes2");
            this.f17874O.mo12128a();
            y10 f = b20.m6560f();
            this.f17871L = f;
            this.f17874O.mo12129b("native:view_show", f);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f17891i.f12729f);
        mo6424t("onshow", hashMap);
    }

    /* renamed from: B */
    public final synchronized void mo11057B() {
        y30 y30 = this.f17867H;
        if (y30 != null) {
            C3163g2.f20465i.post(new oq1((qq1) y30));
        }
    }

    /* renamed from: B0 */
    public final synchronized ts0 mo11058B0(String str) {
        Map<String, ts0> map = this.f17885c0;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* renamed from: C */
    public final synchronized void mo7075C(bv0 bv0) {
        if (this.f17863D != null) {
            io0.m11128d("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.f17863D = bv0;
        }
    }

    /* renamed from: C0 */
    public final synchronized boolean mo7076C0() {
        return this.f17905w;
    }

    /* renamed from: D */
    public final void mo8801D(C3219x0 x0Var, o42 o42, wv1 wv1, xw2 xw2, String str, String str2, int i) {
        this.f17900r.mo9045d0(x0Var, o42, wv1, xw2, str, str2, i);
    }

    /* renamed from: D0 */
    public final /* synthetic */ tv0 mo7077D0() {
        return this.f17900r;
    }

    /* renamed from: E */
    public final synchronized void mo7078E(String str, ts0 ts0) {
        if (this.f17885c0 == null) {
            this.f17885c0 = new HashMap();
        }
        this.f17885c0.put(str, ts0);
    }

    /* renamed from: E0 */
    public final void mo7079E0(Context context) {
        this.f17888f.setBaseContext(context);
        this.f17880U.mo14063e(this.f17888f.mo11309a());
    }

    /* renamed from: F */
    public final ur2 mo6308F() {
        return this.f17897o;
    }

    /* renamed from: F0 */
    public final void mo7080F0(String str, t70<? super eu0> t70) {
        lu0 lu0 = this.f17900r;
        if (lu0 != null) {
            lu0.mo9063q0(str, t70);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0016, code lost:
        return;
     */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo7081G(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f17869J     // Catch:{ all -> 0x0017 }
            r1 = 1
            if (r1 == r3) goto L_0x0007
            r1 = -1
        L_0x0007:
            int r0 = r0 + r1
            r2.f17869J = r0     // Catch:{ all -> 0x0017 }
            if (r0 > 0) goto L_0x0015
            i1.o r3 = r2.f17901s     // Catch:{ all -> 0x0017 }
            if (r3 == 0) goto L_0x0015
            r3.mo13074R2()     // Catch:{ all -> 0x0017 }
            monitor-exit(r2)
            return
        L_0x0015:
            monitor-exit(r2)
            return
        L_0x0017:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yu0.mo7081G(boolean):void");
    }

    /* renamed from: G0 */
    public final void mo7082G0(String str, t70<? super eu0> t70) {
        lu0 lu0 = this.f17900r;
        if (lu0 != null) {
            lu0.mo9041b(str, t70);
        }
    }

    /* renamed from: H */
    public final C1734gb mo7083H() {
        return this.f17889g;
    }

    /* renamed from: H0 */
    public final synchronized void mo7084H0(int i) {
        C2816o oVar = this.f17901s;
        if (oVar != null) {
            oVar.mo13071G5(i);
        }
    }

    /* renamed from: I */
    public final Context mo7085I() {
        return this.f17888f.mo11310b();
    }

    /* renamed from: I0 */
    public final void mo7086I0() {
        throw null;
    }

    /* renamed from: J */
    public final synchronized C2007np mo7087J() {
        return this.f17868I;
    }

    /* renamed from: J0 */
    public final synchronized void mo7088J0(boolean z) {
        C2816o oVar = this.f17901s;
        if (oVar != null) {
            oVar.mo13070F5(this.f17900r.mo9067v(), z);
        } else {
            this.f17905w = z;
        }
    }

    /* renamed from: K */
    public final void mo7089K() {
        setBackgroundColor(0);
    }

    /* renamed from: K0 */
    public final synchronized boolean mo7090K0() {
        return this.f17907y;
    }

    /* renamed from: L */
    public final void mo25L() {
        lu0 lu0 = this.f17900r;
        if (lu0 != null) {
            lu0.mo25L();
        }
    }

    /* renamed from: L0 */
    public final boolean mo7091L0(boolean z, int i) {
        destroy();
        this.f17887e0.mo5402b(new vu0(z, i));
        this.f17887e0.mo5403c(10003);
        return true;
    }

    /* renamed from: M */
    public final void mo7092M(rr2 rr2, ur2 ur2) {
        this.f17896n = rr2;
        this.f17897o = ur2;
    }

    /* renamed from: M0 */
    public final void mo7093M0() {
        if (this.f17873N == null) {
            this.f17874O.mo12128a();
            y10 f = b20.m6560f();
            this.f17873N = f;
            this.f17874O.mo12129b("native:view_load", f);
        }
    }

    /* renamed from: N */
    public final synchronized void mo7094N(C2007np npVar) {
        this.f17868I = npVar;
    }

    /* renamed from: N0 */
    public final synchronized void mo7095N0(C2635a aVar) {
        this.f17902t = aVar;
    }

    /* renamed from: O */
    public final synchronized C2816o mo7096O() {
        return this.f17901s;
    }

    /* renamed from: O0 */
    public final synchronized String mo7097O0() {
        return this.f17904v;
    }

    /* renamed from: P */
    public final synchronized void mo7098P(String str, String str2, String str3) {
        String str4;
        if (!mo7140r0()) {
            String[] strArr = new String[1];
            String str5 = (String) C2199sw.m17001c().mo8579b(m10.f10313K);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("version", str5);
                jSONObject.put("sdk", "Google Mobile Ads");
                jSONObject.put("sdkVersion", "12.4.51-000");
                str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
            } catch (JSONException e) {
                io0.m11132h("Unable to build MRAID_ENV", e);
                str4 = null;
            }
            strArr[0] = str4;
            super.loadDataWithBaseURL(str, lv0.m12937a(str2, strArr), "text/html", "UTF-8", (String) null);
            return;
        }
        io0.m11131g("#004 The webview is destroyed. Ignoring action.");
    }

    /* renamed from: P0 */
    public final void mo11059P0(int i) {
        this.f17876Q = i;
    }

    /* renamed from: Q0 */
    public final void mo8802Q0(boolean z, int i, String str, String str2, boolean z2) {
        this.f17900r.mo9062p0(z, i, str, str2, z2);
    }

    /* renamed from: R */
    public final void mo11060R(int i) {
        this.f17877R = i;
    }

    /* renamed from: R0 */
    public final synchronized void mo7099R0(C2816o oVar) {
        this.f17901s = oVar;
    }

    /* renamed from: S */
    public final synchronized void mo7100S() {
        C3202r1.m24015k("Destroying WebView!");
        m20214r1();
        C3163g2.f20465i.post(new xu0(this));
    }

    /* renamed from: S0 */
    public final void mo8803S0(C2807f fVar, boolean z) {
        this.f17900r.mo9042b0(fVar, z);
    }

    /* renamed from: T */
    public final void mo7101T() {
        this.f17880U.mo14060b();
    }

    /* renamed from: T0 */
    public final void mo8804T0(boolean z, int i, String str, boolean z2) {
        this.f17900r.mo9057n0(z, i, str, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        return;
     */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo7102V(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f17907y     // Catch:{ all -> 0x003a }
            r2.f17907y = r3     // Catch:{ all -> 0x003a }
            r2.m20213q1()     // Catch:{ all -> 0x003a }
            if (r3 == r0) goto L_0x0038
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.m10.f10321L     // Catch:{ all -> 0x003a }
            com.google.android.gms.internal.ads.k10 r1 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ all -> 0x003a }
            java.lang.Object r0 = r1.mo8579b(r0)     // Catch:{ all -> 0x003a }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x003a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.vv0 r0 = r2.f17903u     // Catch:{ all -> 0x003a }
            boolean r0 = r0.mo11531i()     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x0038
        L_0x0024:
            com.google.android.gms.internal.ads.eg0 r0 = new com.google.android.gms.internal.ads.eg0     // Catch:{ all -> 0x003a }
            java.lang.String r1 = ""
            r0.<init>(r2, r1)     // Catch:{ all -> 0x003a }
            r1 = 1
            if (r1 == r3) goto L_0x0031
            java.lang.String r3 = "default"
            goto L_0x0033
        L_0x0031:
            java.lang.String r3 = "expanded"
        L_0x0033:
            r0.mo6952g(r3)     // Catch:{ all -> 0x003a }
            monitor-exit(r2)
            return
        L_0x0038:
            monitor-exit(r2)
            return
        L_0x003a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yu0.mo7102V(boolean):void");
    }

    /* renamed from: W */
    public final void mo11061W() {
        C2816o O = mo7096O();
        if (O != null) {
            O.mo13080g();
        }
    }

    /* renamed from: W0 */
    public final synchronized void mo7103W0(a40 a40) {
        this.f17866G = a40;
    }

    /* renamed from: X */
    public final void mo11062X(boolean z) {
        this.f17900r.mo9040a(false);
    }

    /* renamed from: X0 */
    public final synchronized void mo7104X0(boolean z) {
        this.f17861B = z;
    }

    /* renamed from: Y */
    public final View mo7105Y() {
        return this;
    }

    /* renamed from: Y0 */
    public final synchronized void mo7106Y0(y30 y30) {
        this.f17867H = y30;
    }

    /* renamed from: a */
    public final void mo7272a(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        mo12088m1(sb.toString());
    }

    /* renamed from: a0 */
    public final synchronized a40 mo7107a0() {
        return this.f17866G;
    }

    /* renamed from: a1 */
    public final synchronized void mo10847a1() {
        C2686l lVar = this.f17892j;
        if (lVar != null) {
            lVar.mo10847a1();
        }
    }

    /* renamed from: b */
    public final void mo7273b(String str) {
        throw null;
    }

    /* renamed from: b0 */
    public final synchronized void mo10848b0() {
        C2686l lVar = this.f17892j;
        if (lVar != null) {
            lVar.mo10848b0();
        }
    }

    /* renamed from: b1 */
    public final boolean mo7108b1() {
        return false;
    }

    /* renamed from: c0 */
    public final synchronized boolean mo7109c0() {
        return this.f17861B;
    }

    /* renamed from: c1 */
    public final void mo9998c1(String str, JSONObject jSONObject) {
        mo7272a(str, jSONObject.toString());
    }

    /* renamed from: d */
    public final int mo11063d() {
        return this.f17877R;
    }

    /* renamed from: d0 */
    public final synchronized void mo11064d0(int i) {
        this.f17875P = i;
    }

    /* renamed from: d1 */
    public final void mo7111d1(boolean z) {
        this.f17900r.mo9034U(z);
    }

    public final synchronized void destroy() {
        m20221y1();
        this.f17880U.mo14059a();
        C2816o oVar = this.f17901s;
        if (oVar != null) {
            oVar.mo13076a();
            this.f17901s.mo11833k();
            this.f17901s = null;
        }
        this.f17902t = null;
        this.f17900r.mo9070x0();
        this.f17868I = null;
        this.f17892j = null;
        setOnClickListener((View.OnClickListener) null);
        setOnTouchListener((View.OnTouchListener) null);
        if (!this.f17906x) {
            C2694t.m21617z().mo9013k(this);
            m20220x1();
            this.f17906x = true;
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10566n7)).booleanValue()) {
                C3202r1.m24015k("Initiating WebView self destruct sequence in 3...");
                C3202r1.m24015k("Loading blank page in WebView, 2...");
                m20218v1("about:blank");
                return;
            }
            C3202r1.m24015k("Destroying the WebView immediately...");
            mo7100S();
        }
    }

    /* renamed from: e */
    public final int mo11065e() {
        return this.f17876Q;
    }

    /* renamed from: e0 */
    public final void mo7113e0() {
        throw null;
    }

    /* renamed from: e1 */
    public final synchronized void mo7114e1(C2816o oVar) {
        this.f17878S = oVar;
    }

    @TargetApi(19)
    public final synchronized void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (mo7140r0()) {
            io0.m11133i("#004 The webview is destroyed. Ignoring action.", (Throwable) null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue((Object) null);
                return;
            }
            return;
        }
        super.evaluateJavascript(str, valueCallback);
    }

    /* renamed from: f */
    public final synchronized int mo11066f() {
        return this.f17875P;
    }

    /* renamed from: f0 */
    public final void mo11067f0(boolean z, long j) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", true != z ? "0" : "1");
        hashMap.put("duration", Long.toString(j));
        mo6424t("onCacheAccessComplete", hashMap);
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            synchronized (this) {
                if (!this.f17906x) {
                    this.f17900r.mo9070x0();
                    C2694t.m21617z().mo9013k(this);
                    m20220x1();
                    m20214r1();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    /* renamed from: g0 */
    public final synchronized void mo7115g0(vv0 vv0) {
        this.f17903u = vv0;
        requestLayout();
    }

    /* renamed from: h */
    public final int mo11068h() {
        return getMeasuredHeight();
    }

    /* renamed from: h0 */
    public final synchronized C2635a mo7125h0() {
        return this.f17902t;
    }

    /* renamed from: h1 */
    public final lu0 mo12085h1() {
        return this.f17900r;
    }

    /* renamed from: i */
    public final int mo11069i() {
        return getMeasuredWidth();
    }

    /* renamed from: i0 */
    public final synchronized boolean mo7126i0() {
        return this.f17869J > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i1 */
    public final synchronized Boolean mo12086i1() {
        return this.f17860A;
    }

    /* renamed from: j */
    public final Activity mo7127j() {
        return this.f17888f.mo11309a();
    }

    /* renamed from: j0 */
    public final synchronized void mo7128j0(boolean z) {
        if (z) {
            setBackgroundColor(0);
        }
        C2816o oVar = this.f17901s;
        if (oVar != null) {
            oVar.mo13072H5(z);
        }
    }

    /* renamed from: l */
    public final po0 mo7129l() {
        return this.f17891i;
    }

    /* access modifiers changed from: protected */
    @TargetApi(19)
    /* renamed from: l1 */
    public final synchronized void mo12087l1(String str, ValueCallback<String> valueCallback) {
        if (!mo7140r0()) {
            evaluateJavascript(str, (ValueCallback<String>) null);
        } else {
            io0.m11131g("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadData(String str, String str2, String str3) {
        if (!mo7140r0()) {
            super.loadData(str, str2, str3);
        } else {
            io0.m11131g("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!mo7140r0()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            io0.m11131g("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadUrl(String str) {
        if (!mo7140r0()) {
            try {
                super.loadUrl(str);
            } catch (Throwable th) {
                C2694t.m21607p().mo11034s(th, "AdWebViewImpl.loadUrl");
                io0.m11132h("Could not call loadUrl. ", th);
            }
        } else {
            io0.m11131g("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: m */
    public final y10 mo11070m() {
        return this.f17872M;
    }

    /* renamed from: m0 */
    public final void mo5653m0(C2376xn xnVar) {
        boolean z;
        synchronized (this) {
            z = xnVar.f17256j;
            this.f17864E = z;
        }
        m20216t1(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m1 */
    public final void mo12088m1(String str) {
        if (C2555l.m21211e()) {
            if (mo12086i1() == null) {
                m20222z1();
            }
            if (mo12086i1().booleanValue()) {
                mo12087l1(str, (ValueCallback<String>) null);
            } else {
                mo12089n1(str.length() != 0 ? "javascript:".concat(str) : new String("javascript:"));
            }
        } else {
            mo12089n1(str.length() != 0 ? "javascript:".concat(str) : new String("javascript:"));
        }
    }

    /* renamed from: n */
    public final z10 mo7134n() {
        return this.f17874O;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n1 */
    public final synchronized void mo12089n1(String str) {
        if (!mo7140r0()) {
            loadUrl(str);
        } else {
            io0.m11131g("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: o */
    public final C2675a mo7135o() {
        return this.f17893k;
    }

    /* renamed from: o0 */
    public final void mo7136o0() {
        m20219w1();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f17891i.f12729f);
        mo6424t("onhide", hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o1 */
    public final void mo12090o1(Boolean bool) {
        synchronized (this) {
            this.f17860A = bool;
        }
        C2694t.m21607p().mo11035t(bool);
    }

    /* access modifiers changed from: protected */
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!mo7140r0()) {
            this.f17880U.mo14061c();
        }
        boolean z = this.f17864E;
        lu0 lu0 = this.f17900r;
        if (lu0 != null && lu0.mo9046e()) {
            if (!this.f17865F) {
                this.f17900r.mo9071y();
                this.f17900r.mo9072z();
                this.f17865F = true;
            }
            mo12099p1();
            z = true;
        }
        m20216t1(z);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        lu0 lu0;
        synchronized (this) {
            if (!mo7140r0()) {
                this.f17880U.mo14062d();
            }
            super.onDetachedFromWindow();
            if (this.f17865F && (lu0 = this.f17900r) != null && lu0.mo9046e() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.f17900r.mo9071y();
                this.f17900r.mo9072z();
                this.f17865F = false;
            }
        }
        m20216t1(false);
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            C2694t.m21608q();
            C3163g2.m23941q(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            io0.m11126b(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    public final void onDraw(Canvas canvas) {
        if (!mo7140r0()) {
            if (Build.VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
                super.onDraw(canvas);
            }
        }
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public final void onGlobalLayout() {
        boolean p1 = mo12099p1();
        C2816o O = mo7096O();
        if (O != null && p1) {
            O.mo13081o();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01c2 A[SYNTHETIC, Splitter:B:116:0x01c2] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x013a  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:126:0x01e3=Splitter:B:126:0x01e3, B:66:0x00dd=Splitter:B:66:0x00dd} */
    @android.annotation.SuppressLint({"DrawAllocation"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.mo7140r0()     // Catch:{ all -> 0x01e8 }
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r8.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01e8 }
            monitor-exit(r8)
            return
        L_0x000d:
            boolean r0 = r8.isInEditMode()     // Catch:{ all -> 0x01e8 }
            if (r0 != 0) goto L_0x01e3
            boolean r0 = r8.f17907y     // Catch:{ all -> 0x01e8 }
            if (r0 != 0) goto L_0x01e3
            com.google.android.gms.internal.ads.vv0 r0 = r8.f17903u     // Catch:{ all -> 0x01e8 }
            boolean r0 = r0.mo11528f()     // Catch:{ all -> 0x01e8 }
            if (r0 == 0) goto L_0x0021
            goto L_0x01e3
        L_0x0021:
            com.google.android.gms.internal.ads.vv0 r0 = r8.f17903u     // Catch:{ all -> 0x01e8 }
            boolean r0 = r0.mo11530h()     // Catch:{ all -> 0x01e8 }
            if (r0 == 0) goto L_0x002e
            super.onMeasure(r9, r10)     // Catch:{ all -> 0x01e8 }
            monitor-exit(r8)
            return
        L_0x002e:
            com.google.android.gms.internal.ads.vv0 r0 = r8.f17903u     // Catch:{ all -> 0x01e8 }
            boolean r0 = r0.mo11532j()     // Catch:{ all -> 0x01e8 }
            if (r0 == 0) goto L_0x0093
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.m10.f10630v2     // Catch:{ all -> 0x01e8 }
            com.google.android.gms.internal.ads.k10 r2 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ all -> 0x01e8 }
            java.lang.Object r0 = r2.mo8579b(r0)     // Catch:{ all -> 0x01e8 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01e8 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01e8 }
            if (r0 == 0) goto L_0x004d
            super.onMeasure(r9, r10)     // Catch:{ all -> 0x01e8 }
            monitor-exit(r8)
            return
        L_0x004d:
            com.google.android.gms.internal.ads.bv0 r0 = r8.mo7139p()     // Catch:{ all -> 0x01e8 }
            r2 = 0
            if (r0 == 0) goto L_0x0059
            float r0 = r0.mo5571b()     // Catch:{ all -> 0x01e8 }
            goto L_0x005a
        L_0x0059:
            r0 = r2
        L_0x005a:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x0063
            super.onMeasure(r9, r10)     // Catch:{ all -> 0x01e8 }
            monitor-exit(r8)
            return
        L_0x0063:
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01e8 }
            int r10 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x01e8 }
            float r2 = (float) r10     // Catch:{ all -> 0x01e8 }
            float r2 = r2 * r0
            int r2 = (int) r2     // Catch:{ all -> 0x01e8 }
            float r3 = (float) r9     // Catch:{ all -> 0x01e8 }
            float r3 = r3 / r0
            int r3 = (int) r3     // Catch:{ all -> 0x01e8 }
            if (r10 != 0) goto L_0x007c
            if (r3 == 0) goto L_0x007b
            float r10 = (float) r3     // Catch:{ all -> 0x01e8 }
            float r10 = r10 * r0
            int r2 = (int) r10     // Catch:{ all -> 0x01e8 }
            r1 = r9
            r10 = r3
            goto L_0x0086
        L_0x007b:
            r10 = r1
        L_0x007c:
            if (r9 != 0) goto L_0x0085
            if (r2 == 0) goto L_0x0086
            float r9 = (float) r2     // Catch:{ all -> 0x01e8 }
            float r9 = r9 / r0
            int r3 = (int) r9     // Catch:{ all -> 0x01e8 }
            r1 = r2
            goto L_0x0086
        L_0x0085:
            r1 = r9
        L_0x0086:
            int r9 = java.lang.Math.min(r2, r1)     // Catch:{ all -> 0x01e8 }
            int r10 = java.lang.Math.min(r3, r10)     // Catch:{ all -> 0x01e8 }
            r8.setMeasuredDimension(r9, r10)     // Catch:{ all -> 0x01e8 }
            monitor-exit(r8)
            return
        L_0x0093:
            com.google.android.gms.internal.ads.vv0 r0 = r8.f17903u     // Catch:{ all -> 0x01e8 }
            boolean r0 = r0.mo11529g()     // Catch:{ all -> 0x01e8 }
            if (r0 == 0) goto L_0x00e2
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.m10.f10662z2     // Catch:{ all -> 0x01e8 }
            com.google.android.gms.internal.ads.k10 r1 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ all -> 0x01e8 }
            java.lang.Object r0 = r1.mo8579b(r0)     // Catch:{ all -> 0x01e8 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01e8 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01e8 }
            if (r0 != 0) goto L_0x00dd
            boolean r0 = p034e2.C2555l.m21209c()     // Catch:{ all -> 0x01e8 }
            if (r0 != 0) goto L_0x00b4
            goto L_0x00dd
        L_0x00b4:
            com.google.android.gms.internal.ads.wu0 r0 = new com.google.android.gms.internal.ads.wu0     // Catch:{ all -> 0x01e8 }
            r0.<init>(r8)     // Catch:{ all -> 0x01e8 }
            java.lang.String r1 = "/contentHeight"
            r8.mo7080F0(r1, r0)     // Catch:{ all -> 0x01e8 }
            java.lang.String r0 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();"
            r8.mo12088m1(r0)     // Catch:{ all -> 0x01e8 }
            android.util.DisplayMetrics r0 = r8.f17894l     // Catch:{ all -> 0x01e8 }
            float r0 = r0.density     // Catch:{ all -> 0x01e8 }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01e8 }
            int r1 = r8.f17870K     // Catch:{ all -> 0x01e8 }
            r2 = -1
            if (r1 == r2) goto L_0x00d4
            float r10 = (float) r1     // Catch:{ all -> 0x01e8 }
            float r10 = r10 * r0
            int r10 = (int) r10     // Catch:{ all -> 0x01e8 }
            goto L_0x00d8
        L_0x00d4:
            int r10 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x01e8 }
        L_0x00d8:
            r8.setMeasuredDimension(r9, r10)     // Catch:{ all -> 0x01e8 }
            monitor-exit(r8)
            return
        L_0x00dd:
            super.onMeasure(r9, r10)     // Catch:{ all -> 0x01e8 }
            monitor-exit(r8)
            return
        L_0x00e2:
            com.google.android.gms.internal.ads.vv0 r0 = r8.f17903u     // Catch:{ all -> 0x01e8 }
            boolean r0 = r0.mo11531i()     // Catch:{ all -> 0x01e8 }
            if (r0 == 0) goto L_0x00f5
            android.util.DisplayMetrics r9 = r8.f17894l     // Catch:{ all -> 0x01e8 }
            int r10 = r9.widthPixels     // Catch:{ all -> 0x01e8 }
            int r9 = r9.heightPixels     // Catch:{ all -> 0x01e8 }
            r8.setMeasuredDimension(r10, r9)     // Catch:{ all -> 0x01e8 }
            monitor-exit(r8)
            return
        L_0x00f5:
            int r0 = android.view.View.MeasureSpec.getMode(r9)     // Catch:{ all -> 0x01e8 }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01e8 }
            int r2 = android.view.View.MeasureSpec.getMode(r10)     // Catch:{ all -> 0x01e8 }
            int r10 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x01e8 }
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r5) goto L_0x0113
            if (r0 != r4) goto L_0x0111
            goto L_0x0113
        L_0x0111:
            r0 = r3
            goto L_0x0114
        L_0x0113:
            r0 = r9
        L_0x0114:
            if (r2 == r5) goto L_0x0118
            if (r2 != r4) goto L_0x0119
        L_0x0118:
            r3 = r10
        L_0x0119:
            com.google.android.gms.internal.ads.vv0 r2 = r8.f17903u     // Catch:{ all -> 0x01e8 }
            int r4 = r2.f16421c     // Catch:{ all -> 0x01e8 }
            r5 = 1
            if (r4 > r0) goto L_0x0127
            int r2 = r2.f16420b     // Catch:{ all -> 0x01e8 }
            if (r2 <= r3) goto L_0x0125
            goto L_0x0127
        L_0x0125:
            r2 = r1
            goto L_0x0128
        L_0x0127:
            r2 = r5
        L_0x0128:
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.m10.f10373R3     // Catch:{ all -> 0x01e8 }
            com.google.android.gms.internal.ads.k10 r6 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ all -> 0x01e8 }
            java.lang.Object r4 = r6.mo8579b(r4)     // Catch:{ all -> 0x01e8 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x01e8 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x01e8 }
            if (r4 == 0) goto L_0x0159
            com.google.android.gms.internal.ads.vv0 r4 = r8.f17903u     // Catch:{ all -> 0x01e8 }
            int r6 = r4.f16421c     // Catch:{ all -> 0x01e8 }
            float r7 = r8.f17895m     // Catch:{ all -> 0x01e8 }
            float r6 = (float) r6     // Catch:{ all -> 0x01e8 }
            float r6 = r6 / r7
            float r0 = (float) r0     // Catch:{ all -> 0x01e8 }
            float r0 = r0 / r7
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0154
            int r0 = r4.f16420b     // Catch:{ all -> 0x01e8 }
            float r0 = (float) r0     // Catch:{ all -> 0x01e8 }
            float r0 = r0 / r7
            float r3 = (float) r3     // Catch:{ all -> 0x01e8 }
            float r3 = r3 / r7
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0154
            r0 = r5
            goto L_0x0155
        L_0x0154:
            r0 = r1
        L_0x0155:
            if (r5 == r2) goto L_0x0158
            goto L_0x0159
        L_0x0158:
            r2 = r0
        L_0x0159:
            r0 = 8
            if (r2 == 0) goto L_0x01c2
            com.google.android.gms.internal.ads.vv0 r2 = r8.f17903u     // Catch:{ all -> 0x01e8 }
            int r3 = r2.f16421c     // Catch:{ all -> 0x01e8 }
            float r4 = r8.f17895m     // Catch:{ all -> 0x01e8 }
            int r2 = r2.f16420b     // Catch:{ all -> 0x01e8 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e8 }
            r7 = 103(0x67, float:1.44E-43)
            r6.<init>(r7)     // Catch:{ all -> 0x01e8 }
            java.lang.String r7 = "Not enough space to show ad. Needs "
            r6.append(r7)     // Catch:{ all -> 0x01e8 }
            float r3 = (float) r3     // Catch:{ all -> 0x01e8 }
            float r3 = r3 / r4
            int r3 = (int) r3     // Catch:{ all -> 0x01e8 }
            r6.append(r3)     // Catch:{ all -> 0x01e8 }
            java.lang.String r3 = "x"
            r6.append(r3)     // Catch:{ all -> 0x01e8 }
            float r2 = (float) r2     // Catch:{ all -> 0x01e8 }
            float r2 = r2 / r4
            int r2 = (int) r2     // Catch:{ all -> 0x01e8 }
            r6.append(r2)     // Catch:{ all -> 0x01e8 }
            java.lang.String r2 = " dp, but only has "
            r6.append(r2)     // Catch:{ all -> 0x01e8 }
            float r9 = (float) r9     // Catch:{ all -> 0x01e8 }
            float r9 = r9 / r4
            int r9 = (int) r9     // Catch:{ all -> 0x01e8 }
            r6.append(r9)     // Catch:{ all -> 0x01e8 }
            java.lang.String r9 = "x"
            r6.append(r9)     // Catch:{ all -> 0x01e8 }
            float r9 = (float) r10     // Catch:{ all -> 0x01e8 }
            float r9 = r9 / r4
            int r9 = (int) r9     // Catch:{ all -> 0x01e8 }
            r6.append(r9)     // Catch:{ all -> 0x01e8 }
            java.lang.String r9 = " dp."
            r6.append(r9)     // Catch:{ all -> 0x01e8 }
            java.lang.String r9 = r6.toString()     // Catch:{ all -> 0x01e8 }
            com.google.android.gms.internal.ads.io0.m11131g(r9)     // Catch:{ all -> 0x01e8 }
            int r9 = r8.getVisibility()     // Catch:{ all -> 0x01e8 }
            if (r9 == r0) goto L_0x01ae
            r9 = 4
            r8.setVisibility(r9)     // Catch:{ all -> 0x01e8 }
        L_0x01ae:
            r8.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01e8 }
            boolean r9 = r8.f17898p     // Catch:{ all -> 0x01e8 }
            if (r9 != 0) goto L_0x01c0
            com.google.android.gms.internal.ads.ar r9 = r8.f17887e0     // Catch:{ all -> 0x01e8 }
            r10 = 10001(0x2711, float:1.4014E-41)
            r9.mo5403c(r10)     // Catch:{ all -> 0x01e8 }
            r8.f17898p = r5     // Catch:{ all -> 0x01e8 }
            monitor-exit(r8)
            return
        L_0x01c0:
            monitor-exit(r8)
            return
        L_0x01c2:
            int r9 = r8.getVisibility()     // Catch:{ all -> 0x01e8 }
            if (r9 == r0) goto L_0x01cb
            r8.setVisibility(r1)     // Catch:{ all -> 0x01e8 }
        L_0x01cb:
            boolean r9 = r8.f17899q     // Catch:{ all -> 0x01e8 }
            if (r9 != 0) goto L_0x01d8
            com.google.android.gms.internal.ads.ar r9 = r8.f17887e0     // Catch:{ all -> 0x01e8 }
            r10 = 10002(0x2712, float:1.4016E-41)
            r9.mo5403c(r10)     // Catch:{ all -> 0x01e8 }
            r8.f17899q = r5     // Catch:{ all -> 0x01e8 }
        L_0x01d8:
            com.google.android.gms.internal.ads.vv0 r9 = r8.f17903u     // Catch:{ all -> 0x01e8 }
            int r10 = r9.f16421c     // Catch:{ all -> 0x01e8 }
            int r9 = r9.f16420b     // Catch:{ all -> 0x01e8 }
            r8.setMeasuredDimension(r10, r9)     // Catch:{ all -> 0x01e8 }
            monitor-exit(r8)
            return
        L_0x01e3:
            super.onMeasure(r9, r10)     // Catch:{ all -> 0x01e8 }
            monitor-exit(r8)
            return
        L_0x01e8:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yu0.onMeasure(int, int):void");
    }

    public final void onPause() {
        if (!mo7140r0()) {
            try {
                super.onPause();
            } catch (Exception e) {
                io0.m11129e("Could not pause webview.", e);
            }
        }
    }

    public final void onResume() {
        if (!mo7140r0()) {
            try {
                super.onResume();
            } catch (Exception e) {
                io0.m11129e("Could not resume webview.", e);
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f17900r.mo9046e() || this.f17900r.mo9044d()) {
            C1734gb gbVar = this.f17889g;
            if (gbVar != null) {
                gbVar.mo7561d(motionEvent);
            }
            m20 m20 = this.f17890h;
            if (m20 != null) {
                m20.mo9107b(motionEvent);
            }
        } else {
            synchronized (this) {
                a40 a40 = this.f17866G;
                if (a40 != null) {
                    a40.mo5082b(motionEvent);
                }
            }
        }
        if (mo7140r0()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public final synchronized bv0 mo7139p() {
        return this.f17863D;
    }

    /* renamed from: p1 */
    public final boolean mo12099p1() {
        int i;
        int i2;
        boolean z = false;
        if (!this.f17900r.mo9067v() && !this.f17900r.mo9046e()) {
            return false;
        }
        C2125qw.m15897b();
        DisplayMetrics displayMetrics = this.f17894l;
        int q = bo0.m6993q(displayMetrics, displayMetrics.widthPixels);
        C2125qw.m15897b();
        DisplayMetrics displayMetrics2 = this.f17894l;
        int q2 = bo0.m6993q(displayMetrics2, displayMetrics2.heightPixels);
        Activity a = this.f17888f.mo11309a();
        if (a == null || a.getWindow() == null) {
            i2 = q;
            i = q2;
        } else {
            C2694t.m21608q();
            int[] u = C3163g2.m23945u(a);
            C2125qw.m15897b();
            int q3 = bo0.m6993q(this.f17894l, u[0]);
            C2125qw.m15897b();
            i = bo0.m6993q(this.f17894l, u[1]);
            i2 = q3;
        }
        int i3 = this.f17882W;
        if (i3 == q && this.f17881V == q2 && this.f17883a0 == i2 && this.f17884b0 == i) {
            return false;
        }
        if (!(i3 == q && this.f17881V == q2)) {
            z = true;
        }
        this.f17882W = q;
        this.f17881V = q2;
        this.f17883a0 = i2;
        this.f17884b0 = i;
        new eg0(this, "").mo6950e(q, q2, i2, i, this.f17894l.density, this.f17886d0.getDefaultDisplay().getRotation());
        return z;
    }

    /* renamed from: q */
    public final synchronized String mo11071q() {
        ur2 ur2 = this.f17897o;
        if (ur2 == null) {
            return null;
        }
        return ur2.f15729b;
    }

    /* renamed from: q0 */
    public final void mo8805q0(boolean z, int i, boolean z2) {
        this.f17900r.mo9047f0(z, i, z2);
    }

    /* renamed from: r */
    public final void mo8182r() {
        lu0 lu0 = this.f17900r;
        if (lu0 != null) {
            lu0.mo8182r();
        }
    }

    /* renamed from: r0 */
    public final synchronized boolean mo7140r0() {
        return this.f17906x;
    }

    /* renamed from: s */
    public final void mo6423s(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        String sb2 = sb.toString();
        io0.m11126b(sb2.length() != 0 ? "Dispatching AFMA event: ".concat(sb2) : new String("Dispatching AFMA event: "));
        mo12088m1(sb.toString());
    }

    /* renamed from: s0 */
    public final void mo7141s0(int i) {
        if (i == 0) {
            t10.m17056a(this.f17874O.mo12128a(), this.f17872M, "aebb2");
        }
        m20219w1();
        this.f17874O.mo12128a();
        this.f17874O.mo12128a().mo5631d("close_type", String.valueOf(i));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.f17891i.f12729f);
        mo6424t("onhide", hashMap);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof lu0) {
            this.f17900r = (lu0) webViewClient;
        }
    }

    public final void stopLoading() {
        if (!mo7140r0()) {
            try {
                super.stopLoading();
            } catch (Exception e) {
                io0.m11129e("Could not stop loading webview.", e);
            }
        }
    }

    /* renamed from: t */
    public final void mo6424t(String str, Map<String, ?> map) {
        try {
            mo6423s(str, C2694t.m21608q().mo14024N(map));
        } catch (JSONException unused) {
            io0.m11131g("Could not convert parameters to JSON.");
        }
    }

    /* renamed from: u */
    public final synchronized C2816o mo7147u() {
        return this.f17878S;
    }

    /* renamed from: u0 */
    public final void mo7148u0(String str, C2556m<t70<? super eu0>> mVar) {
        lu0 lu0 = this.f17900r;
        if (lu0 != null) {
            lu0.mo9043c(str, mVar);
        }
    }

    /* renamed from: v */
    public final WebViewClient mo7149v() {
        return this.f17900r;
    }

    /* renamed from: w */
    public final WebView mo7150w() {
        return this;
    }

    /* renamed from: x */
    public final synchronized vv0 mo7151x() {
        return this.f17903u;
    }

    /* renamed from: x0 */
    public final hq0 mo11072x0() {
        return null;
    }

    /* renamed from: y */
    public final synchronized String mo11073y() {
        return this.f17862C;
    }

    /* renamed from: y0 */
    public final void mo11074y0(int i) {
    }

    /* renamed from: z0 */
    public final cc3<String> mo7152z0() {
        m20 m20 = this.f17890h;
        return m20 == null ? rb3.m16131i(null) : m20.mo9106a();
    }
}
