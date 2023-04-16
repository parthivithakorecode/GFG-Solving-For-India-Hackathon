package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p054h1.C2694t;
import p069j1.C3202r1;

public final class cy1 {

    /* renamed from: a */
    private boolean f5557a = false;

    /* renamed from: b */
    private boolean f5558b = false;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f5559c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final long f5560d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final bp0<Boolean> f5561e = new bp0<>();

    /* renamed from: f */
    private final Context f5562f;

    /* renamed from: g */
    private final WeakReference<Context> f5563g;

    /* renamed from: h */
    private final rt1 f5564h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Executor f5565i;

    /* renamed from: j */
    private final Executor f5566j;

    /* renamed from: k */
    private final ScheduledExecutorService f5567k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final gw1 f5568l;

    /* renamed from: m */
    private final po0 f5569m;

    /* renamed from: n */
    private final Map<String, f90> f5570n = new ConcurrentHashMap();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final th1 f5571o;

    /* renamed from: p */
    private boolean f5572p = true;

    public cy1(Executor executor, Context context, WeakReference<Context> weakReference, Executor executor2, rt1 rt1, ScheduledExecutorService scheduledExecutorService, gw1 gw1, po0 po0, th1 th1) {
        this.f5564h = rt1;
        this.f5562f = context;
        this.f5563g = weakReference;
        this.f5565i = executor2;
        this.f5567k = scheduledExecutorService;
        this.f5566j = executor;
        this.f5568l = gw1;
        this.f5569m = po0;
        this.f5571o = th1;
        this.f5560d = C2694t.m21592a().mo12463b();
        m7620u("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    /* renamed from: i */
    static /* bridge */ /* synthetic */ void m7617i(cy1 cy1, String str) {
        cy1 cy12 = cy1;
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = new Object();
                bp0 bp0 = new bp0();
                cc3 o = rb3.m16137o(bp0, ((Long) C2199sw.m17001c().mo8579b(m10.f10578p1)).longValue(), TimeUnit.SECONDS, cy12.f5567k);
                cy12.f5568l.mo7721b(next);
                cy12.f5571o.mo10986s(next);
                long b = C2694t.m21592a().mo12463b();
                Iterator<String> it = keys;
                wx1 wx1 = r1;
                wx1 wx12 = new wx1(cy1, obj, bp0, next, b);
                o.mo5905b(wx1, cy12.f5565i);
                arrayList.add(o);
                by1 by1 = new by1(cy1, obj, next, b, bp0);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            String optString = jSONObject2.optString("format", "");
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                }
                            }
                            arrayList2.add(new p90(optString, bundle));
                        }
                    } catch (JSONException unused) {
                    }
                }
                cy12.m7620u(next, false, "", 0);
                try {
                    cy12.f5566j.execute(new vx1(cy1, cy12.f5564h.mo10664b(next, new JSONObject()), by1, arrayList2, next));
                } catch (ps2 unused2) {
                    try {
                        by1.mo5993u("Failed to create Adapter.");
                    } catch (RemoteException e) {
                        io0.m11129e("", e);
                    }
                }
                keys = it;
            }
            rb3.m16123a(arrayList).mo10266a(new xx1(cy12), cy12.f5565i);
        } catch (JSONException e2) {
            C3202r1.m24016l("Malformed CLD response", e2);
        }
    }

    /* renamed from: t */
    private final synchronized cc3<String> m7619t() {
        String c = C2694t.m21607p().mo11025h().mo14084e().mo9801c();
        if (!TextUtils.isEmpty(c)) {
            return rb3.m16131i(c);
        }
        bp0 bp0 = new bp0();
        C2694t.m21607p().mo11025h().mo14072D(new ux1(this, bp0));
        return bp0;
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public final void m7620u(String str, boolean z, String str2, int i) {
        this.f5570n.put(str, new f90(str, z, i, str2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ Object mo6327e() {
        this.f5561e.mo5907e(Boolean.TRUE);
        return null;
    }

    /* renamed from: f */
    public final List<f90> mo6328f() {
        ArrayList arrayList = new ArrayList();
        for (String next : this.f5570n.keySet()) {
            f90 f90 = this.f5570n.get(next);
            arrayList.add(new f90(next, f90.f6759g, f90.f6760h, f90.f6761i));
        }
        return arrayList;
    }

    /* renamed from: k */
    public final void mo6329k() {
        this.f5572p = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ void mo6330l() {
        synchronized (this) {
            if (!this.f5559c) {
                m7620u("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (C2694t.m21592a().mo12463b() - this.f5560d));
                this.f5561e.mo5908f(new Exception());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        com.google.android.gms.internal.ads.io0.m11129e("", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r5).length() + 74);
        r4.append("Failed to initialize adapter. ");
        r4.append(r5);
        r4.append(" does not implement the initialize() method.");
        r3.mo5993u(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0011 */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo6331m(com.google.android.gms.internal.ads.at2 r2, com.google.android.gms.internal.ads.j90 r3, java.util.List r4, java.lang.String r5) {
        /*
            r1 = this;
            java.lang.ref.WeakReference<android.content.Context> r0 = r1.f5563g     // Catch:{ ps2 -> 0x0011 }
            java.lang.Object r0 = r0.get()     // Catch:{ ps2 -> 0x0011 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ ps2 -> 0x0011 }
            if (r0 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            android.content.Context r0 = r1.f5562f     // Catch:{ ps2 -> 0x0011 }
        L_0x000d:
            r2.mo5505l(r0, r3, r4)     // Catch:{ ps2 -> 0x0011 }
            return
        L_0x0011:
            java.lang.String r2 = java.lang.String.valueOf(r5)     // Catch:{ RemoteException -> 0x0035 }
            int r2 = r2.length()     // Catch:{ RemoteException -> 0x0035 }
            int r2 = r2 + 74
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x0035 }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x0035 }
            java.lang.String r2 = "Failed to initialize adapter. "
            r4.append(r2)     // Catch:{ RemoteException -> 0x0035 }
            r4.append(r5)     // Catch:{ RemoteException -> 0x0035 }
            java.lang.String r2 = " does not implement the initialize() method."
            r4.append(r2)     // Catch:{ RemoteException -> 0x0035 }
            java.lang.String r2 = r4.toString()     // Catch:{ RemoteException -> 0x0035 }
            r3.mo5993u(r2)     // Catch:{ RemoteException -> 0x0035 }
            return
        L_0x0035:
            r2 = move-exception
            java.lang.String r3 = ""
            com.google.android.gms.internal.ads.io0.m11129e(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cy1.mo6331m(com.google.android.gms.internal.ads.at2, com.google.android.gms.internal.ads.j90, java.util.List, java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* synthetic */ void mo6332n(bp0 bp0) {
        this.f5565i.execute(new tx1(this, bp0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo6333o() {
        this.f5568l.mo7723d();
        this.f5571o.mo10985g();
        this.f5558b = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void mo6334p(Object obj, bp0 bp0, String str, long j) {
        synchronized (obj) {
            if (!bp0.isDone()) {
                m7620u(str, false, "Timeout.", (int) (C2694t.m21592a().mo12463b() - j));
                this.f5568l.mo7720a(str, "timeout");
                this.f5571o.mo10987z(str, "timeout");
                bp0.mo5907e(Boolean.FALSE);
            }
        }
    }

    /* renamed from: q */
    public final void mo6335q() {
        if (!g30.f7254a.mo9928e().booleanValue()) {
            if (this.f5569m.f12731h >= ((Integer) C2199sw.m17001c().mo8579b(m10.f10569o1)).intValue() && this.f5572p) {
                if (!this.f5557a) {
                    synchronized (this) {
                        if (!this.f5557a) {
                            this.f5568l.mo7724e();
                            this.f5571o.mo10983b();
                            this.f5561e.mo5905b(new rx1(this), this.f5565i);
                            this.f5557a = true;
                            cc3<String> t = m7619t();
                            this.f5567k.schedule(new qx1(this), ((Long) C2199sw.m17001c().mo8579b(m10.f10587q1)).longValue(), TimeUnit.SECONDS);
                            rb3.m16140r(t, new zx1(this), this.f5565i);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
        if (!this.f5557a) {
            m7620u("com.google.android.gms.ads.MobileAds", true, "", 0);
            this.f5561e.mo5907e(Boolean.FALSE);
            this.f5557a = true;
            this.f5558b = true;
        }
    }

    /* renamed from: r */
    public final void mo6336r(m90 m90) {
        this.f5561e.mo5905b(new sx1(this, m90), this.f5566j);
    }

    /* renamed from: s */
    public final boolean mo6337s() {
        return this.f5558b;
    }
}
