package p111p1;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.C1734gb;
import com.google.android.gms.internal.ads.C1771hb;
import com.google.android.gms.internal.ads.C1902kv;
import com.google.android.gms.internal.ads.C1939lv;
import com.google.android.gms.internal.ads.C2087pv;
import com.google.android.gms.internal.ads.C2199sw;
import com.google.android.gms.internal.ads.an0;
import com.google.android.gms.internal.ads.bt2;
import com.google.android.gms.internal.ads.bw0;
import com.google.android.gms.internal.ads.cc3;
import com.google.android.gms.internal.ads.cy2;
import com.google.android.gms.internal.ads.dc3;
import com.google.android.gms.internal.ads.fa1;
import com.google.android.gms.internal.ads.fn0;
import com.google.android.gms.internal.ads.ib3;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.is2;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.mg1;
import com.google.android.gms.internal.ads.ph0;
import com.google.android.gms.internal.ads.po0;
import com.google.android.gms.internal.ads.rb3;
import com.google.android.gms.internal.ads.rr1;
import com.google.android.gms.internal.ads.sh0;
import com.google.android.gms.internal.ads.vv1;
import com.google.android.gms.internal.ads.wv1;
import com.google.android.gms.internal.ads.ww2;
import com.google.android.gms.internal.ads.xw2;
import com.google.android.gms.internal.ads.ym0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import p002a1.C0015b;
import p048g2.C2635a;
import p048g2.C2637b;
import p069j1.C3154e1;

/* renamed from: p1.f0 */
public final class C3898f0 extends an0 {

    /* renamed from: D */
    protected static final List<String> f21992D = new ArrayList(Arrays.asList(new String[]{"/aclk", "/pcs/click"}));

    /* renamed from: E */
    protected static final List<String> f21993E = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com"}));

    /* renamed from: F */
    protected static final List<String> f21994F = new ArrayList(Arrays.asList(new String[]{"/pagead/adview", "/pcs/view", "/pagead/conversion"}));

    /* renamed from: G */
    protected static final List<String> f21995G = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"}));

    /* renamed from: H */
    public static final /* synthetic */ int f21996H = 0;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public final po0 f21997A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public String f21998B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public final String f21999C;

    /* renamed from: f */
    private final bw0 f22000f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Context f22001g;

    /* renamed from: h */
    private final C1734gb f22002h;

    /* renamed from: i */
    private final bt2<rr1> f22003i;

    /* renamed from: j */
    private final dc3 f22004j;

    /* renamed from: k */
    private final ScheduledExecutorService f22005k;

    /* renamed from: l */
    private sh0 f22006l;

    /* renamed from: m */
    private Point f22007m = new Point();

    /* renamed from: n */
    private Point f22008n = new Point();

    /* renamed from: o */
    private final Set<WebView> f22009o = Collections.newSetFromMap(new WeakHashMap());
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C3908l f22010p;

    /* renamed from: q */
    private final wv1 f22011q;

    /* renamed from: r */
    private final xw2 f22012r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final cy2 f22013s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final boolean f22014t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final boolean f22015u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final boolean f22016v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final boolean f22017w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final String f22018x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public final String f22019y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public final AtomicInteger f22020z = new AtomicInteger(0);

    public C3898f0(bw0 bw0, Context context, C1734gb gbVar, bt2<rr1> bt2, dc3 dc3, ScheduledExecutorService scheduledExecutorService, wv1 wv1, xw2 xw2, cy2 cy2, po0 po0) {
        this.f22000f = bw0;
        this.f22001g = context;
        this.f22002h = gbVar;
        this.f22003i = bt2;
        this.f22004j = dc3;
        this.f22005k = scheduledExecutorService;
        this.f22010p = bw0.mo5613u();
        this.f22011q = wv1;
        this.f22012r = xw2;
        this.f22013s = cy2;
        this.f21997A = po0;
        this.f22014t = ((Boolean) C2199sw.m17001c().mo8579b(m10.f10657y5)).booleanValue();
        this.f22015u = ((Boolean) C2199sw.m17001c().mo8579b(m10.f10649x5)).booleanValue();
        this.f22016v = ((Boolean) C2199sw.m17001c().mo8579b(m10.f10665z5)).booleanValue();
        this.f22017w = ((Boolean) C2199sw.m17001c().mo8579b(m10.f10247B5)).booleanValue();
        this.f22018x = (String) C2199sw.m17001c().mo8579b(m10.f10239A5);
        this.f22019y = (String) C2199sw.m17001c().mo8579b(m10.f10255C5);
        this.f21999C = (String) C2199sw.m17001c().mo8579b(m10.f10263D5);
    }

    /* renamed from: E5 */
    static boolean m26011E5(Uri uri) {
        return m26017J5(uri, f21994F, f21995G);
    }

    /* renamed from: F5 */
    static final /* synthetic */ Uri m26012F5(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? m26018K5(uri, "nas", str) : uri;
    }

    /* renamed from: G5 */
    static final /* synthetic */ ArrayList m26013G5(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (m26011E5(uri) && !TextUtils.isEmpty(str)) {
                uri = m26018K5(uri, "nas", str);
            }
            arrayList.add(uri);
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f14443g;
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m26014H() {
        /*
            r1 = this;
            com.google.android.gms.internal.ads.sh0 r0 = r1.f22006l
            if (r0 == 0) goto L_0x0010
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r0 = r0.f14443g
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0010
            r0 = 1
            return r0
        L_0x0010:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p111p1.C3898f0.m26014H():boolean");
    }

    /* renamed from: H5 */
    private final C3913q m26015H5(Context context, String str, String str2, C2087pv pvVar, C1902kv kvVar) {
        C3912p v = this.f22000f.mo5614v();
        fa1 fa1 = new fa1();
        fa1.mo7274c(context);
        is2 is2 = new is2();
        if (str == null) {
            str = "adUnitId";
        }
        is2.mo8253H(str);
        if (kvVar == null) {
            kvVar = new C1939lv().mo9078a();
        }
        is2.mo8264d(kvVar);
        if (pvVar == null) {
            pvVar = new C2087pv();
        }
        is2.mo8252G(pvVar);
        fa1.mo7277f(is2.mo8266f());
        v.mo11556b(fa1.mo7278g());
        C3902h0 h0Var = new C3902h0();
        h0Var.mo15362a(str2);
        v.mo11555a(new C3906j0(h0Var, (C3904i0) null));
        new mg1();
        return v.mo11557c();
    }

    /* renamed from: I5 */
    private final cc3<String> m26016I5(String str) {
        rr1[] rr1Arr = new rr1[1];
        cc3<O> n = rb3.m16136n(this.f22003i.mo5943a(), new C3920x(this, rr1Arr, str), this.f22004j);
        n.mo5905b(new C3921y(this, rr1Arr), this.f22004j);
        return rb3.m16128f(rb3.m16135m((ib3) rb3.m16137o(ib3.m10985E(n), (long) ((Integer) C2199sw.m17001c().mo8579b(m10.f10279F5)).intValue(), TimeUnit.MILLISECONDS, this.f22005k), C3917u.f22052a, this.f22004j), Exception.class, C3916t.f22051a, this.f22004j);
    }

    /* renamed from: J5 */
    private static boolean m26017J5(Uri uri, List<String> list, List<String> list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (!(host == null || path == null)) {
            for (String contains : list) {
                if (path.contains(contains)) {
                    for (String endsWith : list2) {
                        if (host.endsWith(endsWith)) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: K5 */
    public static final Uri m26018K5(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i = indexOf + 1;
        return Uri.parse(uri2.substring(0, i) + str + "=" + str2 + "&" + uri2.substring(i));
    }

    /* renamed from: b6 */
    static /* bridge */ /* synthetic */ void m26030b6(C3898f0 f0Var, String str, String str2, String str3) {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10609s5)).booleanValue()) {
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10592q6)).booleanValue()) {
                xw2 xw2 = f0Var.f22012r;
                ww2 b = ww2.m19233b(str);
                b.mo11742a(str2, str3);
                xw2.mo5981a(b);
                return;
            }
            vv1 a = f0Var.f22011q.mo11740a();
            a.mo11533b("action", str);
            a.mo11533b(str2, str3);
            a.mo11537f();
        }
    }

    /* renamed from: J0 */
    public final void mo5889J0(List<Uri> list, C2635a aVar, ph0 ph0) {
        try {
            if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10271E5)).booleanValue()) {
                ph0.mo9528u("The updating URL feature is not enabled.");
            } else if (list.size() != 1) {
                ph0.mo9528u("There should be only 1 click URL.");
            } else {
                Uri uri = list.get(0);
                if (!m26017J5(uri, f21992D, f21993E)) {
                    String valueOf = String.valueOf(uri);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 18);
                    sb.append("Not a Google URL: ");
                    sb.append(valueOf);
                    io0.m11131g(sb.toString());
                    ph0.mo9527n2(list);
                    return;
                }
                cc3 C = this.f22004j.mo6445C(new C3922z(this, uri, aVar));
                if (m26014H()) {
                    C = rb3.m16136n(C, new C3918v(this), this.f22004j);
                } else {
                    io0.m11130f("Asset view map is empty.");
                }
                rb3.m16140r(C, new C3894d0(this, ph0), this.f22000f.mo5599d());
            }
        } catch (RemoteException e) {
            io0.m11129e("", e);
        }
    }

    /* renamed from: K1 */
    public final void mo5890K1(C2635a aVar, fn0 fn0, ym0 ym0) {
        Context context = (Context) C2637b.m21357C0(aVar);
        this.f22001g = context;
        rb3.m16140r(m26015H5(context, fn0.f6872f, fn0.f6873g, fn0.f6874h, fn0.f6875i).mo11934a(), new C3890b0(this, ym0), this.f22000f.mo5599d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N5 */
    public final /* synthetic */ Uri mo15356N5(Uri uri, C2635a aVar) {
        try {
            uri = this.f22002h.mo7558a(uri, this.f22001g, (View) C2637b.m21357C0(aVar), (Activity) null);
        } catch (C1771hb e) {
            io0.m11132h("", e);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    /* renamed from: O1 */
    public final void mo5891O1(sh0 sh0) {
        this.f22006l = sh0;
        this.f22003i.mo5945c(1);
    }

    /* renamed from: P */
    public final void mo5892P(C2635a aVar) {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10271E5)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) C2637b.m21357C0(aVar);
            sh0 sh0 = this.f22006l;
            this.f22007m = C3154e1.m23864a(motionEvent, sh0 == null ? null : sh0.f14442f);
            if (motionEvent.getAction() == 0) {
                this.f22008n = this.f22007m;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            Point point = this.f22007m;
            obtain.setLocation((float) point.x, (float) point.y);
            this.f22002h.mo7561d(obtain);
            obtain.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R5 */
    public final /* synthetic */ cc3 mo15357R5(rr1[] rr1Arr, String str, rr1 rr1) {
        rr1Arr[0] = rr1;
        Context context = this.f22001g;
        sh0 sh0 = this.f22006l;
        Map<String, WeakReference<View>> map = sh0.f14443g;
        JSONObject d = C3154e1.m23867d(context, map, map, sh0.f14442f);
        JSONObject g = C3154e1.m23870g(this.f22001g, this.f22006l.f14442f);
        JSONObject f = C3154e1.m23869f(this.f22006l.f14442f);
        JSONObject e = C3154e1.m23868e(this.f22001g, this.f22006l.f14442f);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", d);
        jSONObject.put("ad_view_signal", g);
        jSONObject.put("scroll_view_signal", f);
        jSONObject.put("lock_screen_signal", e);
        if (str == "google.afma.nativeAds.getPublisherCustomRenderedClickSignals") {
            jSONObject.put("click_signal", C3154e1.m23866c((String) null, this.f22001g, this.f22008n, this.f22007m));
        }
        return rr1.mo10654d(str, jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S5 */
    public final /* synthetic */ cc3 mo15358S5(Uri uri) {
        return rb3.m16135m(m26016I5("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new C3914r(this, uri), this.f22004j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T5 */
    public final /* synthetic */ cc3 mo15359T5(ArrayList arrayList) {
        return rb3.m16135m(m26016I5("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new C3915s(this, arrayList), this.f22004j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y5 */
    public final /* synthetic */ ArrayList mo15360Y5(List list, C2635a aVar) {
        String c = this.f22002h.mo7560c() != null ? this.f22002h.mo7560c().mo6112c(this.f22001g, (View) C2637b.m21357C0(aVar), (Activity) null) : "";
        if (!TextUtils.isEmpty(c)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                if (!m26011E5(uri)) {
                    io0.m11131g("Not a Google URL: ".concat(String.valueOf(uri)));
                } else {
                    uri = m26018K5(uri, "ms", c);
                }
                arrayList.add(uri);
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
            throw new Exception("Empty impression URLs result.");
        }
        throw new Exception("Failed to get view signals.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c6 */
    public final /* synthetic */ void mo15361c6(rr1[] rr1Arr) {
        rr1 rr1 = rr1Arr[0];
        if (rr1 != null) {
            this.f22003i.mo5944b(rb3.m16131i(rr1));
        }
    }

    /* renamed from: h4 */
    public final void mo5893h4(List<Uri> list, C2635a aVar, ph0 ph0) {
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10271E5)).booleanValue()) {
            try {
                ph0.mo9528u("The updating URL feature is not enabled.");
            } catch (RemoteException e) {
                io0.m11129e("", e);
            }
        } else {
            cc3 C = this.f22004j.mo6445C(new C3888a0(this, list, aVar));
            if (m26014H()) {
                C = rb3.m16136n(C, new C3919w(this), this.f22004j);
            } else {
                io0.m11130f("Asset view map is empty.");
            }
            rb3.m16140r(C, new C3892c0(this, ph0), this.f22000f.mo5599d());
        }
    }

    @SuppressLint({"AddJavascriptInterface"})
    /* renamed from: z0 */
    public final void mo5894z0(C2635a aVar) {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10384S6)).booleanValue()) {
            if (Build.VERSION.SDK_INT < 21) {
                io0.m11131g("Not registering the webview because the Android API level is lower than Lollopop which has security risks on webviews.");
                return;
            }
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10392T6)).booleanValue()) {
                rb3.m16140r(m26015H5(this.f22001g, (String) null, C0015b.BANNER.name(), (C2087pv) null, (C1902kv) null).mo11934a(), new C3896e0(this), this.f22000f.mo5599d());
            }
            WebView webView = (WebView) C2637b.m21357C0(aVar);
            if (webView == null) {
                io0.m11128d("The webView cannot be null.");
            } else if (this.f22009o.contains(webView)) {
                io0.m11130f("This webview has already been registered.");
            } else {
                this.f22009o.add(webView);
                webView.addJavascriptInterface(new C3887a(webView, this.f22002h), "gmaSdk");
            }
        }
    }
}
