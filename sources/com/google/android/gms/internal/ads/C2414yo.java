package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;
import p034e2.C2555l;
import p054h1.C2694t;

@TargetApi(14)
@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.yo */
public final class C2414yo extends Thread {

    /* renamed from: f */
    private boolean f17805f = false;

    /* renamed from: g */
    private boolean f17806g = false;

    /* renamed from: h */
    private final Object f17807h;

    /* renamed from: i */
    private final C2080po f17808i;

    /* renamed from: j */
    private final int f17809j;

    /* renamed from: k */
    private final int f17810k;

    /* renamed from: l */
    private final int f17811l;

    /* renamed from: m */
    private final int f17812m;

    /* renamed from: n */
    private final int f17813n;

    /* renamed from: o */
    private final int f17814o;

    /* renamed from: p */
    private final int f17815p;

    /* renamed from: q */
    private final int f17816q;

    /* renamed from: r */
    private final String f17817r;

    /* renamed from: s */
    private final boolean f17818s;

    /* renamed from: t */
    private final boolean f17819t;

    /* renamed from: u */
    private final boolean f17820u;

    public C2414yo() {
        C2080po poVar = new C2080po();
        this.f17808i = poVar;
        this.f17807h = new Object();
        this.f17810k = u20.f15354d.mo9928e().intValue();
        this.f17811l = u20.f15351a.mo9928e().intValue();
        this.f17812m = u20.f15355e.mo9928e().intValue();
        this.f17813n = u20.f15353c.mo9928e().intValue();
        this.f17814o = ((Integer) C2199sw.m17001c().mo8579b(m10.f10337N)).intValue();
        this.f17815p = ((Integer) C2199sw.m17001c().mo8579b(m10.f10345O)).intValue();
        this.f17816q = ((Integer) C2199sw.m17001c().mo8579b(m10.f10353P)).intValue();
        this.f17809j = u20.f15356f.mo9928e().intValue();
        this.f17817r = (String) C2199sw.m17001c().mo8579b(m10.f10369R);
        this.f17818s = ((Boolean) C2199sw.m17001c().mo8579b(m10.f10377S)).booleanValue();
        this.f17819t = ((Boolean) C2199sw.m17001c().mo8579b(m10.f10385T)).booleanValue();
        this.f17820u = ((Boolean) C2199sw.m17001c().mo8579b(m10.f10393U)).booleanValue();
        setName("ContentFetchTask");
    }

    /* renamed from: a */
    public final C2043oo mo12054a() {
        return this.f17808i.mo10113a(this.f17820u);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C2377xo mo12055b(View view, C2043oo ooVar) {
        if (view == null) {
            return new C2377xo(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new C2377xo(this, 0, 0);
            }
            ooVar.mo9821k(text.toString(), globalVisibleRect, view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
            return new C2377xo(this, 1, 0);
        } else if ((view instanceof WebView) && !(view instanceof eu0)) {
            WebView webView = (WebView) view;
            if (!C2555l.m21211e()) {
                return new C2377xo(this, 0, 0);
            }
            ooVar.mo9817h();
            webView.post(new C2340wo(this, ooVar, webView, globalVisibleRect));
            return new C2377xo(this, 0, 1);
        } else if (!(view instanceof ViewGroup)) {
            return new C2377xo(this, 0, 0);
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                C2377xo b = mo12055b(viewGroup.getChildAt(i3), ooVar);
                i += b.f17273a;
                i2 += b.f17274b;
            }
            return new C2377xo(this, i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo12056c(View view) {
        try {
            C2043oo ooVar = new C2043oo(this.f17810k, this.f17811l, this.f17812m, this.f17813n, this.f17814o, this.f17815p, this.f17816q, this.f17819t);
            Context b = C2694t.m21594c().mo11039b();
            if (b != null && !TextUtils.isEmpty(this.f17817r)) {
                String str = (String) view.getTag(b.getResources().getIdentifier((String) C2199sw.m17001c().mo8579b(m10.f10361Q), "id", b.getPackageName()));
                if (str != null) {
                    if (str.equals(this.f17817r)) {
                        return;
                    }
                }
            }
            C2377xo b2 = mo12055b(view, ooVar);
            ooVar.mo9823m();
            if (b2.f17273a == 0) {
                if (b2.f17274b == 0) {
                    return;
                }
            }
            if (b2.f17274b == 0) {
                if (ooVar.mo9811c() == 0) {
                    return;
                }
            }
            if (b2.f17274b == 0) {
                if (this.f17808i.mo10116d(ooVar)) {
                    return;
                }
            }
            this.f17808i.mo10114b(ooVar);
        } catch (Exception e) {
            io0.m11129e("Exception in fetchContentOnUIThread", e);
            C2694t.m21607p().mo11034s(e, "ContentFetchTask.fetchContent");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo12057d(C2043oo ooVar, WebView webView, String str, boolean z) {
        ooVar.mo9816g();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (this.f17818s || TextUtils.isEmpty(webView.getTitle())) {
                    ooVar.mo9822l(optString, z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(optString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(optString);
                    ooVar.mo9822l(sb.toString(), z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                }
            }
            if (ooVar.mo9825o()) {
                this.f17808i.mo10115c(ooVar);
            }
        } catch (JSONException unused) {
            io0.m11126b("Json string may be malformed.");
        } catch (Throwable th) {
            io0.m11127c("Failed to get webview content.", th);
            C2694t.m21607p().mo11034s(th, "ContentFetchTask.processWebViewContent");
        }
    }

    /* renamed from: e */
    public final void mo12058e() {
        synchronized (this.f17807h) {
            if (this.f17805f) {
                io0.m11126b("Content hash thread already started, quiting...");
                return;
            }
            this.f17805f = true;
            start();
        }
    }

    /* renamed from: f */
    public final void mo12059f() {
        synchronized (this.f17807h) {
            this.f17806g = true;
            StringBuilder sb = new StringBuilder(42);
            sb.append("ContentFetchThread: paused, mPause = ");
            sb.append(true);
            io0.m11126b(sb.toString());
        }
    }

    /* renamed from: g */
    public final void mo12060g() {
        synchronized (this.f17807h) {
            this.f17806g = false;
            this.f17807h.notifyAll();
            io0.m11126b("ContentFetchThread: wakeup");
        }
    }

    /* renamed from: h */
    public final boolean mo12061h() {
        return this.f17806g;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00da */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00da A[LOOP:2: B:49:0x00da->B:63:0x00da, LOOP_START, SYNTHETIC] */
    public final void run() {
        /*
            r6 = this;
        L_0x0000:
            com.google.android.gms.internal.ads.to r0 = p054h1.C2694t.m21594c()     // Catch:{ all -> 0x00a8 }
            android.content.Context r0 = r0.mo11039b()     // Catch:{ all -> 0x00a8 }
            if (r0 != 0) goto L_0x000c
            goto L_0x00b2
        L_0x000c:
            java.lang.String r1 = "activity"
            java.lang.Object r1 = r0.getSystemService(r1)     // Catch:{ all -> 0x00a8 }
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch:{ all -> 0x00a8 }
            java.lang.String r2 = "keyguard"
            java.lang.Object r2 = r0.getSystemService(r2)     // Catch:{ all -> 0x00a8 }
            android.app.KeyguardManager r2 = (android.app.KeyguardManager) r2     // Catch:{ all -> 0x00a8 }
            if (r1 == 0) goto L_0x00b2
            if (r2 == 0) goto L_0x00b2
            java.util.List r1 = r1.getRunningAppProcesses()     // Catch:{ all -> 0x00a8 }
            if (r1 == 0) goto L_0x00b2
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00a8 }
        L_0x002a:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x00a8 }
            if (r3 == 0) goto L_0x00b2
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x00a8 }
            android.app.ActivityManager$RunningAppProcessInfo r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3     // Catch:{ all -> 0x00a8 }
            int r4 = android.os.Process.myPid()     // Catch:{ all -> 0x00a8 }
            int r5 = r3.pid     // Catch:{ all -> 0x00a8 }
            if (r4 != r5) goto L_0x002a
            int r1 = r3.importance     // Catch:{ all -> 0x00a8 }
            r3 = 100
            if (r1 != r3) goto L_0x00b2
            boolean r1 = r2.inKeyguardRestrictedInputMode()     // Catch:{ all -> 0x00a8 }
            if (r1 != 0) goto L_0x00b2
            java.lang.String r1 = "power"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch:{ all -> 0x00a8 }
            android.os.PowerManager r0 = (android.os.PowerManager) r0     // Catch:{ all -> 0x00a8 }
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r0.isScreenOn()     // Catch:{ all -> 0x00a8 }
            if (r0 == 0) goto L_0x00b2
            com.google.android.gms.internal.ads.to r0 = p054h1.C2694t.m21594c()     // Catch:{ InterruptedException -> 0x00d1, Exception -> 0x00c1 }
            android.app.Activity r0 = r0.mo11038a()     // Catch:{ InterruptedException -> 0x00d1, Exception -> 0x00c1 }
            if (r0 != 0) goto L_0x006d
            java.lang.String r0 = "ContentFetchThread: no activity. Sleeping."
            com.google.android.gms.internal.ads.io0.m11126b(r0)     // Catch:{ InterruptedException -> 0x00d1, Exception -> 0x00c1 }
        L_0x0069:
            r6.mo12059f()     // Catch:{ InterruptedException -> 0x00d1, Exception -> 0x00c1 }
            goto L_0x00b8
        L_0x006d:
            r1 = 0
            android.view.Window r2 = r0.getWindow()     // Catch:{ Exception -> 0x008e }
            if (r2 == 0) goto L_0x009d
            android.view.Window r2 = r0.getWindow()     // Catch:{ Exception -> 0x008e }
            android.view.View r2 = r2.getDecorView()     // Catch:{ Exception -> 0x008e }
            if (r2 == 0) goto L_0x009d
            android.view.Window r0 = r0.getWindow()     // Catch:{ Exception -> 0x008e }
            android.view.View r0 = r0.getDecorView()     // Catch:{ Exception -> 0x008e }
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r0.findViewById(r2)     // Catch:{ Exception -> 0x008e }
            goto L_0x009d
        L_0x008e:
            r0 = move-exception
            com.google.android.gms.internal.ads.tn0 r2 = p054h1.C2694t.m21607p()     // Catch:{ InterruptedException -> 0x00d1, Exception -> 0x00c1 }
            java.lang.String r3 = "ContentFetchTask.extractContent"
            r2.mo11034s(r0, r3)     // Catch:{ InterruptedException -> 0x00d1, Exception -> 0x00c1 }
            java.lang.String r0 = "Failed getting root view of activity. Content not extracted."
            com.google.android.gms.internal.ads.io0.m11126b(r0)     // Catch:{ InterruptedException -> 0x00d1, Exception -> 0x00c1 }
        L_0x009d:
            if (r1 == 0) goto L_0x00b8
            com.google.android.gms.internal.ads.uo r0 = new com.google.android.gms.internal.ads.uo     // Catch:{ InterruptedException -> 0x00d1, Exception -> 0x00c1 }
            r0.<init>(r6, r1)     // Catch:{ InterruptedException -> 0x00d1, Exception -> 0x00c1 }
            r1.post(r0)     // Catch:{ InterruptedException -> 0x00d1, Exception -> 0x00c1 }
            goto L_0x00b8
        L_0x00a8:
            r0 = move-exception
            com.google.android.gms.internal.ads.tn0 r1 = p054h1.C2694t.m21607p()     // Catch:{ InterruptedException -> 0x00d1, Exception -> 0x00c1 }
            java.lang.String r2 = "ContentFetchTask.isInForeground"
            r1.mo11034s(r0, r2)     // Catch:{ InterruptedException -> 0x00d1, Exception -> 0x00c1 }
        L_0x00b2:
            java.lang.String r0 = "ContentFetchTask: sleeping"
            com.google.android.gms.internal.ads.io0.m11126b(r0)     // Catch:{ InterruptedException -> 0x00d1, Exception -> 0x00c1 }
            goto L_0x0069
        L_0x00b8:
            int r0 = r6.f17809j     // Catch:{ InterruptedException -> 0x00d1, Exception -> 0x00c1 }
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x00d1, Exception -> 0x00c1 }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x00d1, Exception -> 0x00c1 }
            goto L_0x00d7
        L_0x00c1:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.io0.m11129e(r1, r0)
            com.google.android.gms.internal.ads.tn0 r1 = p054h1.C2694t.m21607p()
            java.lang.String r2 = "ContentFetchTask.run"
            r1.mo11034s(r0, r2)
            goto L_0x00d7
        L_0x00d1:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.io0.m11129e(r1, r0)
        L_0x00d7:
            java.lang.Object r0 = r6.f17807h
            monitor-enter(r0)
        L_0x00da:
            boolean r1 = r6.f17806g     // Catch:{ all -> 0x00ec }
            if (r1 == 0) goto L_0x00e9
            java.lang.String r1 = "ContentFetchTask: waiting"
            com.google.android.gms.internal.ads.io0.m11126b(r1)     // Catch:{ InterruptedException -> 0x00da }
            java.lang.Object r1 = r6.f17807h     // Catch:{ InterruptedException -> 0x00da }
            r1.wait()     // Catch:{ InterruptedException -> 0x00da }
            goto L_0x00da
        L_0x00e9:
            monitor-exit(r0)     // Catch:{ all -> 0x00ec }
            goto L_0x0000
        L_0x00ec:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ec }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2414yo.run():void");
    }
}
