package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.view.C0833y;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import p034e2.C2556m;
import p038f.C2591j;
import p054h1.C2676b;
import p054h1.C2694t;
import p061i1.C2807f;
import p061i1.C2816o;
import p061i1.C2817p;
import p061i1.C2818q;
import p061i1.C2824w;
import p061i1.C2826y;
import p069j1.C3163g2;
import p069j1.C3202r1;
import p069j1.C3219x0;

@ParametersAreNonnullByDefault
public class lu0 extends WebViewClient implements tv0 {

    /* renamed from: H */
    public static final /* synthetic */ int f10145H = 0;

    /* renamed from: A */
    private cy2 f10146A;

    /* renamed from: B */
    private boolean f10147B;

    /* renamed from: C */
    private boolean f10148C;

    /* renamed from: D */
    private int f10149D;

    /* renamed from: E */
    private boolean f10150E;

    /* renamed from: F */
    private final HashSet<String> f10151F;

    /* renamed from: G */
    private View.OnAttachStateChangeListener f10152G;

    /* renamed from: f */
    private final eu0 f10153f;

    /* renamed from: g */
    private final C1527ar f10154g;

    /* renamed from: h */
    private final HashMap<String, List<t70<? super eu0>>> f10155h = new HashMap<>();

    /* renamed from: i */
    private final Object f10156i = new Object();

    /* renamed from: j */
    private C2420yu f10157j;

    /* renamed from: k */
    private C2818q f10158k;

    /* renamed from: l */
    private rv0 f10159l;

    /* renamed from: m */
    private sv0 f10160m;

    /* renamed from: n */
    private s60 f10161n;

    /* renamed from: o */
    private u60 f10162o;

    /* renamed from: p */
    private pi1 f10163p;

    /* renamed from: q */
    private boolean f10164q;

    /* renamed from: r */
    private boolean f10165r;
    @GuardedBy("lock")

    /* renamed from: s */
    private boolean f10166s;
    @GuardedBy("lock")

    /* renamed from: t */
    private boolean f10167t;
    @GuardedBy("lock")

    /* renamed from: u */
    private boolean f10168u;

    /* renamed from: v */
    private C2826y f10169v;

    /* renamed from: w */
    private dg0 f10170w;

    /* renamed from: x */
    private C2676b f10171x;

    /* renamed from: y */
    private yf0 f10172y;

    /* renamed from: z */
    protected ml0 f10173z;

    public lu0(eu0 eu0, C1527ar arVar, boolean z) {
        dg0 dg0 = new dg0(eu0, eu0.mo7085I(), new v00(eu0.getContext()));
        this.f10154g = arVar;
        this.f10153f = eu0;
        this.f10166s = z;
        this.f10170w = dg0;
        this.f10172y = null;
        this.f10151F = new HashSet<>(Arrays.asList(((String) C2199sw.m17001c().mo8579b(m10.f10455b4)).split(",")));
    }

    /* renamed from: f */
    private static WebResourceResponse m12879f() {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10652y0)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* renamed from: h */
    private final WebResourceResponse m12880h(String str, Map<String, String> map) {
        HttpURLConnection httpURLConnection;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = 0;
            while (true) {
                i++;
                if (i <= 20) {
                    URLConnection openConnection = url.openConnection();
                    openConnection.setConnectTimeout(10000);
                    openConnection.setReadTimeout(10000);
                    for (Map.Entry next : map.entrySet()) {
                        openConnection.addRequestProperty((String) next.getKey(), (String) next.getValue());
                    }
                    if (openConnection instanceof HttpURLConnection) {
                        httpURLConnection = (HttpURLConnection) openConnection;
                        C2694t.m21608q().mo14026S(this.f10153f.getContext(), this.f10153f.mo7129l().f12729f, false, httpURLConnection, false, 60000);
                        ho0 ho0 = new ho0((String) null);
                        ho0.mo7974c(httpURLConnection, (byte[]) null);
                        int responseCode = httpURLConnection.getResponseCode();
                        ho0.mo7976e(httpURLConnection, responseCode);
                        if (responseCode < 300 || responseCode >= 400) {
                            C2694t.m21608q();
                            WebResourceResponse t = C3163g2.m23944t(httpURLConnection);
                        } else {
                            String headerField = httpURLConnection.getHeaderField("Location");
                            if (headerField == null) {
                                throw new IOException("Missing Location header in redirect");
                            } else if (headerField.startsWith("tel:")) {
                                TrafficStats.clearThreadStatsTag();
                                return null;
                            } else {
                                URL url2 = new URL(url, headerField);
                                String protocol = url2.getProtocol();
                                if (protocol == null) {
                                    io0.m11131g("Protocol is null");
                                    WebResourceResponse f = m12879f();
                                    TrafficStats.clearThreadStatsTag();
                                    return f;
                                } else if (protocol.equals("http") || protocol.equals("https")) {
                                    io0.m11126b(headerField.length() != 0 ? "Redirecting to ".concat(headerField) : new String("Redirecting to "));
                                    httpURLConnection.disconnect();
                                    url = url2;
                                } else {
                                    io0.m11131g(protocol.length() != 0 ? "Unsupported scheme: ".concat(protocol) : new String("Unsupported scheme: "));
                                    return m12879f();
                                }
                            }
                        }
                    } else {
                        throw new IOException("Invalid protocol.");
                    }
                } else {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
            }
            C2694t.m21608q();
            WebResourceResponse t2 = C3163g2.m23944t(httpURLConnection);
            TrafficStats.clearThreadStatsTag();
            return t2;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final void m12881m(Map<String, String> map, List<t70<? super eu0>> list, String str) {
        if (C3202r1.m24017m()) {
            C3202r1.m24015k(str.length() != 0 ? "Received GMSG: ".concat(str) : new String("Received GMSG: "));
            for (String next : map.keySet()) {
                String str2 = map.get(next);
                StringBuilder sb = new StringBuilder(String.valueOf(next).length() + 4 + String.valueOf(str2).length());
                sb.append("  ");
                sb.append(next);
                sb.append(": ");
                sb.append(str2);
                C3202r1.m24015k(sb.toString());
            }
        }
        for (t70<? super eu0> a : list) {
            a.mo5150a(this.f10153f, map);
        }
    }

    /* renamed from: q */
    private final void m12882q() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f10152G;
        if (onAttachStateChangeListener != null) {
            ((View) this.f10153f).removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public final void m12883s(View view, ml0 ml0, int i) {
        if (ml0.mo7373h() && i > 0) {
            ml0.mo7370c(view);
            if (ml0.mo7373h()) {
                C3163g2.f20465i.postDelayed(new gu0(this, view, ml0, i), 100);
            }
        }
    }

    /* renamed from: t */
    private static final boolean m12884t(boolean z, eu0 eu0) {
        return z && !eu0.mo7151x().mo11531i() && !eu0.mo7097O0().equals("interstitial_mb");
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final WebResourceResponse mo9032B(String str, Map<String, String> map) {
        C1860jq b;
        try {
            if (c30.f5282a.mo9928e().booleanValue()) {
                if (this.f10146A != null && "oda".equals(Uri.parse(str).getScheme())) {
                    this.f10146A.mo6339b(str);
                    return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
                }
            }
            String c = rm0.m16269c(str, this.f10153f.getContext(), this.f10150E);
            if (!c.equals(str)) {
                return m12880h(c, map);
            }
            C1971mq c2 = C1971mq.m13448c(Uri.parse(str));
            if (c2 != null && (b = C2694t.m21595d().mo8235b(c2)) != null && b.mo8518g()) {
                return new WebResourceResponse("", "", b.mo8516e());
            }
            if (!ho0.m10681l() || !y20.f17567b.mo9928e().booleanValue()) {
                return null;
            }
            return m12880h(str, map);
        } catch (Exception | NoClassDefFoundError e) {
            C2694t.m21607p().mo11034s(e, "AdWebViewClient.interceptRequest");
            return m12879f();
        }
    }

    /* renamed from: L */
    public final void mo25L() {
        C2420yu yuVar = this.f10157j;
        if (yuVar != null) {
            yuVar.mo25L();
        }
    }

    /* renamed from: R */
    public final void mo9033R() {
        if (this.f10159l != null && ((this.f10147B && this.f10149D <= 0) || this.f10148C || this.f10165r)) {
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10596r1)).booleanValue() && this.f10153f.mo7134n() != null) {
                t10.m17056a(this.f10153f.mo7134n().mo12128a(), this.f10153f.mo11070m(), "awfllc");
            }
            rv0 rv0 = this.f10159l;
            boolean z = false;
            if (!this.f10148C && !this.f10165r) {
                z = true;
            }
            rv0.mo5388c(z);
            this.f10159l = null;
        }
        this.f10153f.mo7093M0();
    }

    /* renamed from: U */
    public final void mo9034U(boolean z) {
        this.f10150E = z;
    }

    /* renamed from: U0 */
    public final void mo9035U0(boolean z) {
        synchronized (this.f10156i) {
            this.f10167t = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public final /* synthetic */ void mo9036W() {
        this.f10153f.mo7101T();
        C2816o O = this.f10153f.mo7096O();
        if (O != null) {
            O.mo13073M();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public final /* synthetic */ void mo9037X(View view, ml0 ml0, int i) {
        m12883s(view, ml0, i - 1);
    }

    /* renamed from: Z */
    public final void mo9038Z() {
        synchronized (this.f10156i) {
            this.f10164q = false;
            this.f10166s = true;
            wo0.f16890e.execute(new fu0(this));
        }
    }

    /* renamed from: Z0 */
    public final void mo9039Z0(sv0 sv0) {
        this.f10160m = sv0;
    }

    /* renamed from: a */
    public final void mo9040a(boolean z) {
        this.f10164q = false;
    }

    /* renamed from: b */
    public final void mo9041b(String str, t70<? super eu0> t70) {
        synchronized (this.f10156i) {
            List list = this.f10155h.get(str);
            if (list != null) {
                list.remove(t70);
            }
        }
    }

    /* renamed from: b0 */
    public final void mo9042b0(C2807f fVar, boolean z) {
        boolean K0 = this.f10153f.mo7090K0();
        boolean t = m12884t(K0, this.f10153f);
        boolean z2 = true;
        if (!t && z) {
            z2 = false;
        }
        mo9056m0(new AdOverlayInfoParcel(fVar, t ? null : this.f10157j, K0 ? null : this.f10158k, this.f10169v, this.f10153f.mo7129l(), this.f10153f, z2 ? null : this.f10163p));
    }

    /* renamed from: c */
    public final void mo9043c(String str, C2556m<t70<? super eu0>> mVar) {
        synchronized (this.f10156i) {
            List<t70> list = this.f10155h.get(str);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (t70 t70 : list) {
                    if (mVar.mo8432a(t70)) {
                        arrayList.add(t70);
                    }
                }
                list.removeAll(arrayList);
            }
        }
    }

    /* renamed from: d */
    public final boolean mo9044d() {
        boolean z;
        synchronized (this.f10156i) {
            z = this.f10168u;
        }
        return z;
    }

    /* renamed from: d0 */
    public final void mo9045d0(C3219x0 x0Var, o42 o42, wv1 wv1, xw2 xw2, String str, String str2, int i) {
        eu0 eu0 = this.f10153f;
        mo9056m0(new AdOverlayInfoParcel(eu0, eu0.mo7129l(), x0Var, o42, wv1, xw2, str, str2, i));
    }

    /* renamed from: e */
    public final boolean mo9046e() {
        boolean z;
        synchronized (this.f10156i) {
            z = this.f10167t;
        }
        return z;
    }

    /* renamed from: f0 */
    public final void mo9047f0(boolean z, int i, boolean z2) {
        boolean t = m12884t(this.f10153f.mo7090K0(), this.f10153f);
        boolean z3 = true;
        if (!t && z2) {
            z3 = false;
        }
        C2420yu yuVar = t ? null : this.f10157j;
        C2818q qVar = this.f10158k;
        C2826y yVar = this.f10169v;
        eu0 eu0 = this.f10153f;
        mo9056m0(new AdOverlayInfoParcel(yuVar, qVar, yVar, eu0, z, i, eu0.mo7129l(), z3 ? null : this.f10163p));
    }

    /* renamed from: f1 */
    public final void mo9048f1(rv0 rv0) {
        this.f10159l = rv0;
    }

    /* renamed from: g */
    public final C2676b mo9049g() {
        return this.f10171x;
    }

    /* renamed from: i */
    public final void mo9050i() {
        C1527ar arVar = this.f10154g;
        if (arVar != null) {
            arVar.mo5403c(10005);
        }
        this.f10148C = true;
        mo9033R();
        this.f10153f.destroy();
    }

    /* renamed from: j */
    public final void mo9051j() {
        synchronized (this.f10156i) {
        }
        this.f10149D++;
        mo9033R();
    }

    /* renamed from: k */
    public final void mo9052k() {
        this.f10149D--;
        mo9033R();
    }

    /* renamed from: k0 */
    public final void mo9053k0(C2420yu yuVar, s60 s60, C2818q qVar, u60 u60, C2826y yVar, boolean z, w70 w70, C2676b bVar, fg0 fg0, ml0 ml0, o42 o42, cy2 cy2, wv1 wv1, xw2 xw2, u70 u70, pi1 pi1) {
        t70 t70;
        s60 s602 = s60;
        u60 u602 = u60;
        w70 w702 = w70;
        fg0 fg02 = fg0;
        ml0 ml02 = ml0;
        o42 o422 = o42;
        cy2 cy22 = cy2;
        u70 u702 = u70;
        pi1 pi12 = pi1;
        C2676b bVar2 = bVar == null ? new C2676b(this.f10153f.getContext(), ml02, (ji0) null) : bVar;
        this.f10172y = new yf0(this.f10153f, fg02);
        this.f10173z = ml02;
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10274F0)).booleanValue()) {
            mo9063q0("/adMetadata", new r60(s602));
        }
        if (u602 != null) {
            mo9063q0("/appEvent", new t60(u602));
        }
        mo9063q0("/backButton", s70.f14301j);
        mo9063q0("/refresh", s70.f14302k);
        mo9063q0("/canOpenApp", s70.f14293b);
        mo9063q0("/canOpenURLs", s70.f14292a);
        mo9063q0("/canOpenIntents", s70.f14294c);
        mo9063q0("/close", s70.f14295d);
        mo9063q0("/customClose", s70.f14296e);
        mo9063q0("/instrument", s70.f14305n);
        mo9063q0("/delayPageLoaded", s70.f14307p);
        mo9063q0("/delayPageClosed", s70.f14308q);
        mo9063q0("/getLocationInfo", s70.f14309r);
        mo9063q0("/log", s70.f14298g);
        mo9063q0("/mraid", new b80(bVar2, this.f10172y, fg02));
        dg0 dg0 = this.f10170w;
        if (dg0 != null) {
            mo9063q0("/mraidLoaded", dg0);
        }
        f80 f80 = r4;
        f80 f802 = new f80(bVar2, this.f10172y, o42, wv1, xw2);
        mo9063q0("/open", f80);
        mo9063q0("/precache", new us0());
        mo9063q0("/touch", s70.f14300i);
        mo9063q0("/video", s70.f14303l);
        mo9063q0("/videoMeta", s70.f14304m);
        if (o422 == null || cy22 == null) {
            mo9063q0("/click", s70.m16640a(pi1));
            t70 = s70.f14297f;
        } else {
            mo9063q0("/click", new qs2(pi12, cy22, o422));
            t70 = new rs2(cy22, o422);
        }
        mo9063q0("/httpTrack", t70);
        if (C2694t.m21606o().mo10109z(this.f10153f.getContext())) {
            mo9063q0("/logScionEvent", new z70(this.f10153f.getContext()));
        }
        if (w702 != null) {
            mo9063q0("/setInterstitialProperties", new v70(w702, (byte[]) null));
        }
        if (u702 != null) {
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10240A6)).booleanValue()) {
                mo9063q0("/inspectorNetworkExtras", u702);
            }
        }
        this.f10157j = yuVar;
        this.f10158k = qVar;
        this.f10161n = s602;
        this.f10162o = u602;
        this.f10169v = yVar;
        this.f10171x = bVar2;
        this.f10163p = pi12;
        this.f10164q = z;
        this.f10146A = cy22;
    }

    /* renamed from: l */
    public final void mo9054l() {
        ml0 ml0 = this.f10173z;
        if (ml0 != null) {
            WebView w = this.f10153f.mo7150w();
            if (C0833y.m3316A(w)) {
                m12883s(w, ml0, 10);
                return;
            }
            m12882q();
            iu0 iu0 = new iu0(this, ml0);
            this.f10152G = iu0;
            ((View) this.f10153f).addOnAttachStateChangeListener(iu0);
        }
    }

    /* renamed from: l0 */
    public final void mo9055l0(Uri uri) {
        String path = uri.getPath();
        List list = this.f10155h.get(path);
        if (path == null || list == null) {
            C3202r1.m24015k("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10510h5)).booleanValue() && C2694t.m21607p().mo11023f() != null) {
                wo0.f16886a.execute(new hu0((path == null || path.length() < 2) ? "null" : path.substring(1)));
                return;
            }
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10446a4)).booleanValue() && this.f10151F.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) C2199sw.m17001c().mo8579b(m10.f10464c4)).intValue()) {
                C3202r1.m24015k(path.length() != 0 ? "Parsing gmsg query params on BG thread: ".concat(path) : new String("Parsing gmsg query params on BG thread: "));
                rb3.m16140r(C2694t.m21608q().mo14021J(uri), new ju0(this, list, path, uri), wo0.f16890e);
                return;
            }
        }
        C2694t.m21608q();
        m12881m(C3163g2.m23943s(uri), list, path);
    }

    /* renamed from: m0 */
    public final void mo9056m0(AdOverlayInfoParcel adOverlayInfoParcel) {
        C2807f fVar;
        yf0 yf0 = this.f10172y;
        boolean l = yf0 != null ? yf0.mo12008l() : false;
        C2694t.m21602k();
        C2817p.m22284a(this.f10153f.getContext(), adOverlayInfoParcel, !l);
        ml0 ml0 = this.f10173z;
        if (ml0 != null) {
            String str = adOverlayInfoParcel.f3725q;
            if (str == null && (fVar = adOverlayInfoParcel.f3714f) != null) {
                str = fVar.f19469g;
            }
            ml0.mo7367Q(str);
        }
    }

    /* renamed from: n0 */
    public final void mo9057n0(boolean z, int i, String str, boolean z2) {
        boolean K0 = this.f10153f.mo7090K0();
        boolean t = m12884t(K0, this.f10153f);
        boolean z3 = true;
        if (!t && z2) {
            z3 = false;
        }
        C2420yu yuVar = t ? null : this.f10157j;
        ku0 ku0 = K0 ? null : new ku0(this.f10153f, this.f10158k);
        s60 s60 = this.f10161n;
        u60 u60 = this.f10162o;
        C2826y yVar = this.f10169v;
        eu0 eu0 = this.f10153f;
        AdOverlayInfoParcel adOverlayInfoParcel = r4;
        AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel(yuVar, ku0, s60, u60, yVar, eu0, z, i, str, eu0.mo7129l(), z3 ? null : this.f10163p);
        mo9056m0(adOverlayInfoParcel);
    }

    public final void onLoadResource(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        C3202r1.m24015k(valueOf.length() != 0 ? "Loading resource: ".concat(valueOf) : new String("Loading resource: "));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            mo9055l0(parse);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r1 == null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        r1.zza();
        r0.f10160m = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        mo9033R();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r0.f10147B = true;
        r1 = r0.f10160m;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageFinished(android.webkit.WebView r1, java.lang.String r2) {
        /*
            r0 = this;
            java.lang.Object r1 = r0.f10156i
            monitor-enter(r1)
            com.google.android.gms.internal.ads.eu0 r2 = r0.f10153f     // Catch:{ all -> 0x0029 }
            boolean r2 = r2.mo7140r0()     // Catch:{ all -> 0x0029 }
            if (r2 == 0) goto L_0x0017
            java.lang.String r2 = "Blank page loaded, 1..."
            p069j1.C3202r1.m24015k(r2)     // Catch:{ all -> 0x0029 }
            com.google.android.gms.internal.ads.eu0 r2 = r0.f10153f     // Catch:{ all -> 0x0029 }
            r2.mo7100S()     // Catch:{ all -> 0x0029 }
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            return
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            r1 = 1
            r0.f10147B = r1
            com.google.android.gms.internal.ads.sv0 r1 = r0.f10160m
            if (r1 == 0) goto L_0x0025
            r1.zza()
            r1 = 0
            r0.f10160m = r1
        L_0x0025:
            r0.mo9033R()
            return
        L_0x0029:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lu0.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f10165r = true;
    }

    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.f10153f.mo7091L0(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    /* renamed from: p0 */
    public final void mo9062p0(boolean z, int i, String str, String str2, boolean z2) {
        boolean K0 = this.f10153f.mo7090K0();
        boolean t = m12884t(K0, this.f10153f);
        boolean z3 = true;
        if (!t && z2) {
            z3 = false;
        }
        C2420yu yuVar = t ? null : this.f10157j;
        ku0 ku0 = K0 ? null : new ku0(this.f10153f, this.f10158k);
        s60 s60 = this.f10161n;
        u60 u60 = this.f10162o;
        C2826y yVar = this.f10169v;
        eu0 eu0 = this.f10153f;
        AdOverlayInfoParcel adOverlayInfoParcel = r4;
        AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel(yuVar, (C2818q) ku0, s60, u60, yVar, eu0, z, i, str, str2, eu0.mo7129l(), z3 ? null : this.f10163p);
        mo9056m0(adOverlayInfoParcel);
    }

    /* renamed from: q0 */
    public final void mo9063q0(String str, t70<? super eu0> t70) {
        synchronized (this.f10156i) {
            List list = this.f10155h.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.f10155h.put(str, list);
            }
            list.add(t70);
        }
    }

    /* renamed from: r */
    public final void mo8182r() {
        pi1 pi1 = this.f10163p;
        if (pi1 != null) {
            pi1.mo8182r();
        }
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return mo9032B(str, Collections.emptyMap());
    }

    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case C2591j.f18704B0 /*86*/:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case C2591j.f18753M0 /*126*/:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        C3202r1.m24015k(valueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(valueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri parse = Uri.parse(str);
        if (!"gmsg".equalsIgnoreCase(parse.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            if (this.f10164q && webView == this.f10153f.mo7150w()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    C2420yu yuVar = this.f10157j;
                    if (yuVar != null) {
                        yuVar.mo25L();
                        ml0 ml0 = this.f10173z;
                        if (ml0 != null) {
                            ml0.mo7367Q(str);
                        }
                        this.f10157j = null;
                    }
                    pi1 pi1 = this.f10163p;
                    if (pi1 != null) {
                        pi1.mo8182r();
                        this.f10163p = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.f10153f.mo7150w().willNotDraw()) {
                try {
                    C1734gb H = this.f10153f.mo7083H();
                    if (H != null && H.mo7563f(parse)) {
                        Context context = this.f10153f.getContext();
                        eu0 eu0 = this.f10153f;
                        parse = H.mo7558a(parse, context, (View) eu0, eu0.mo7127j());
                    }
                } catch (C1771hb unused) {
                    String valueOf2 = String.valueOf(str);
                    io0.m11131g(valueOf2.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf2) : new String("Unable to append parameter to URL: "));
                }
                C2676b bVar = this.f10171x;
                if (bVar == null || bVar.mo12668c()) {
                    mo9042b0(new C2807f("android.intent.action.VIEW", parse.toString(), (String) null, (String) null, (String) null, (String) null, (String) null, (C2824w) null), true);
                } else {
                    this.f10171x.mo12667b(str);
                }
            } else {
                String valueOf3 = String.valueOf(str);
                io0.m11131g(valueOf3.length() != 0 ? "AdWebView unable to handle URL: ".concat(valueOf3) : new String("AdWebView unable to handle URL: "));
            }
        } else {
            mo9055l0(parse);
        }
        return true;
    }

    /* renamed from: t0 */
    public final void mo9066t0(boolean z) {
        synchronized (this.f10156i) {
            this.f10168u = z;
        }
    }

    /* renamed from: v */
    public final boolean mo9067v() {
        boolean z;
        synchronized (this.f10156i) {
            z = this.f10166s;
        }
        return z;
    }

    /* renamed from: v0 */
    public final void mo9068v0(int i, int i2, boolean z) {
        dg0 dg0 = this.f10170w;
        if (dg0 != null) {
            dg0.mo6473h(i, i2);
        }
        yf0 yf0 = this.f10172y;
        if (yf0 != null) {
            yf0.mo12006j(i, i2, false);
        }
    }

    /* renamed from: w0 */
    public final void mo9069w0(int i, int i2) {
        yf0 yf0 = this.f10172y;
        if (yf0 != null) {
            yf0.mo12007k(i, i2);
        }
    }

    /* renamed from: x0 */
    public final void mo9070x0() {
        ml0 ml0 = this.f10173z;
        if (ml0 != null) {
            ml0.mo7369b();
            this.f10173z = null;
        }
        m12882q();
        synchronized (this.f10156i) {
            this.f10155h.clear();
            this.f10157j = null;
            this.f10158k = null;
            this.f10159l = null;
            this.f10160m = null;
            this.f10161n = null;
            this.f10162o = null;
            this.f10164q = false;
            this.f10166s = false;
            this.f10167t = false;
            this.f10169v = null;
            this.f10171x = null;
            this.f10170w = null;
            yf0 yf0 = this.f10172y;
            if (yf0 != null) {
                yf0.mo12004h(true);
                this.f10172y = null;
            }
            this.f10146A = null;
        }
    }

    /* renamed from: y */
    public final ViewTreeObserver.OnGlobalLayoutListener mo9071y() {
        synchronized (this.f10156i) {
        }
        return null;
    }

    /* renamed from: z */
    public final ViewTreeObserver.OnScrollChangedListener mo9072z() {
        synchronized (this.f10156i) {
        }
        return null;
    }
}
