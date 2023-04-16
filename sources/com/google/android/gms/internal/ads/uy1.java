package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p054h1.C2694t;

public final class uy1 implements dz1, fy1 {

    /* renamed from: a */
    private final cz1 f15807a;

    /* renamed from: b */
    private final ez1 f15808b;

    /* renamed from: c */
    private final gy1 f15809c;

    /* renamed from: d */
    private final py1 f15810d;

    /* renamed from: e */
    private final ey1 f15811e;

    /* renamed from: f */
    private final String f15812f;

    /* renamed from: g */
    private final Map<String, List<iy1>> f15813g;

    /* renamed from: h */
    private String f15814h = "{}";

    /* renamed from: i */
    private String f15815i = "";

    /* renamed from: j */
    private long f15816j = Long.MAX_VALUE;

    /* renamed from: k */
    private qy1 f15817k = qy1.NONE;

    /* renamed from: l */
    private boolean f15818l;

    /* renamed from: m */
    private int f15819m;

    /* renamed from: n */
    private boolean f15820n;

    /* renamed from: o */
    private ty1 f15821o = ty1.UNKNOWN;

    uy1(cz1 cz1, ez1 ez1, gy1 gy1, Context context, po0 po0, py1 py1) {
        this.f15807a = cz1;
        this.f15808b = ez1;
        this.f15809c = gy1;
        this.f15813g = new HashMap();
        this.f15811e = new ey1(context);
        this.f15812f = po0.f12729f;
        this.f15810d = py1;
        C2694t.m21611t().mo13984g(this);
    }

    /* renamed from: o */
    private final synchronized JSONObject m18228o() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (Map.Entry next : this.f15813g.entrySet()) {
            JSONArray jSONArray = new JSONArray();
            for (iy1 iy1 : (List) next.getValue()) {
                if (iy1.mo8310b()) {
                    jSONArray.put(iy1.mo8309a());
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put((String) next.getKey(), jSONArray);
            }
        }
        return jSONObject;
    }

    /* renamed from: p */
    private final void m18229p() {
        this.f15820n = true;
        this.f15810d.mo10201c();
        this.f15807a.mo6345d(this);
        this.f15808b.mo7201c(this);
        this.f15809c.mo7735c(this);
        m18235v(C2694t.m21607p().mo11025h().mo14094o());
    }

    /* renamed from: q */
    private final void m18230q() {
        C2694t.m21607p().mo11025h().mo14070B(mo11332c());
    }

    /* renamed from: r */
    private final synchronized void m18231r(qy1 qy1, boolean z) {
        if (this.f15817k != qy1) {
            if (mo11342m()) {
                m18233t();
            }
            this.f15817k = qy1;
            if (mo11342m()) {
                m18234u();
            }
            if (z) {
                m18230q();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003b A[DONT_GENERATE] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m18232s(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f15818l     // Catch:{ all -> 0x003d }
            if (r0 != r2) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            r1.f15818l = r2     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x002b
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r2 = com.google.android.gms.internal.ads.m10.f10360P6     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.ads.k10 r0 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ all -> 0x003d }
            java.lang.Object r2 = r0.mo8579b(r2)     // Catch:{ all -> 0x003d }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x003d }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x0027
            j1.c0 r2 = p054h1.C2694t.m21611t()     // Catch:{ all -> 0x003d }
            boolean r2 = r2.mo13989l()     // Catch:{ all -> 0x003d }
            if (r2 != 0) goto L_0x002b
        L_0x0027:
            r1.m18234u()     // Catch:{ all -> 0x003d }
            goto L_0x0034
        L_0x002b:
            boolean r2 = r1.mo11342m()     // Catch:{ all -> 0x003d }
            if (r2 != 0) goto L_0x0034
            r1.m18233t()     // Catch:{ all -> 0x003d }
        L_0x0034:
            if (r3 == 0) goto L_0x003b
            r1.m18230q()     // Catch:{ all -> 0x003d }
            monitor-exit(r1)
            return
        L_0x003b:
            monitor-exit(r1)
            return
        L_0x003d:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.uy1.m18232s(boolean, boolean):void");
    }

    /* renamed from: t */
    private final synchronized void m18233t() {
        qy1 qy1 = qy1.NONE;
        int ordinal = this.f15817k.ordinal();
        if (ordinal == 1) {
            this.f15808b.mo7199a();
        } else if (ordinal == 2) {
            this.f15809c.mo7733a();
        }
    }

    /* renamed from: u */
    private final synchronized void m18234u() {
        qy1 qy1 = qy1.NONE;
        int ordinal = this.f15817k.ordinal();
        if (ordinal == 1) {
            this.f15808b.mo7200b();
        } else if (ordinal == 2) {
            this.f15809c.mo7734b();
        }
    }

    /* renamed from: v */
    private final synchronized void m18235v(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                m18232s(jSONObject.optBoolean("isTestMode", false), false);
                m18231r(qy1.m15971b(jSONObject.optString("gesture", "NONE")), false);
                this.f15814h = jSONObject.optString("networkExtras", "{}");
                this.f15816j = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public final qy1 mo11330a() {
        return this.f15817k;
    }

    /* renamed from: b */
    public final synchronized String mo11331b() {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10240A6)).booleanValue()) {
            if (mo11342m()) {
                if (this.f15816j < C2694t.m21592a().mo12462a() / 1000) {
                    this.f15814h = "{}";
                    this.f15816j = Long.MAX_VALUE;
                    return "";
                } else if (this.f15814h.equals("{}")) {
                    return "";
                } else {
                    return this.f15814h;
                }
            }
        }
        return "";
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:1|2|3|4|5|(1:7)|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0033 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String mo11332c() {
        /*
            r7 = this;
            monitor-enter(r7)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x0039 }
            r0.<init>()     // Catch:{ all -> 0x0039 }
            java.lang.String r1 = "isTestMode"
            boolean r2 = r7.f15818l     // Catch:{ JSONException -> 0x0033 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0033 }
            java.lang.String r1 = "gesture"
            com.google.android.gms.internal.ads.qy1 r2 = r7.f15817k     // Catch:{ JSONException -> 0x0033 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0033 }
            long r1 = r7.f15816j     // Catch:{ JSONException -> 0x0033 }
            e2.d r3 = p054h1.C2694t.m21592a()     // Catch:{ JSONException -> 0x0033 }
            long r3 = r3.mo12462a()     // Catch:{ JSONException -> 0x0033 }
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0033
            java.lang.String r1 = "networkExtras"
            java.lang.String r2 = r7.f15814h     // Catch:{ JSONException -> 0x0033 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0033 }
            java.lang.String r1 = "networkExtrasExpirationSecs"
            long r2 = r7.f15816j     // Catch:{ JSONException -> 0x0033 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0033 }
        L_0x0033:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0039 }
            monitor-exit(r7)
            return r0
        L_0x0039:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.uy1.mo11332c():java.lang.String");
    }

    /* renamed from: d */
    public final synchronized JSONObject mo11333d() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "ANDROID");
            jSONObject.put("internalSdkVersion", this.f15812f);
            jSONObject.put("adapters", this.f15810d.mo10200a());
            if (this.f15816j < C2694t.m21592a().mo12462a() / 1000) {
                this.f15814h = "{}";
            }
            jSONObject.put("networkExtras", this.f15814h);
            jSONObject.put("adSlots", m18228o());
            jSONObject.put("appInfo", this.f15811e.mo7182a());
            String c = C2694t.m21607p().mo11025h().mo14084e().mo9801c();
            if (!TextUtils.isEmpty(c)) {
                jSONObject.put("cld", new JSONObject(c));
            }
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10368Q6)).booleanValue() && !TextUtils.isEmpty(this.f15815i)) {
                String valueOf = String.valueOf(this.f15815i);
                io0.m11126b(valueOf.length() != 0 ? "Policy violation data: ".concat(valueOf) : new String("Policy violation data: "));
                jSONObject.put("policyViolations", new JSONObject(this.f15815i));
            }
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10360P6)).booleanValue()) {
                jSONObject.put("openAction", this.f15821o);
                jSONObject.put("gesture", this.f15817k);
            }
        } catch (JSONException e) {
            C2694t.m21607p().mo11033r(e, "Inspector.toJson");
            io0.m11132h("Ad inspector encountered an error", e);
        }
        return jSONObject;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005b, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo11334e(java.lang.String r4, com.google.android.gms.internal.ads.iy1 r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.m10.f10240A6     // Catch:{ all -> 0x005c }
            com.google.android.gms.internal.ads.k10 r1 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ all -> 0x005c }
            java.lang.Object r0 = r1.mo8579b(r0)     // Catch:{ all -> 0x005c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x005c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x005a
            boolean r0 = r3.mo11342m()     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x001a
            goto L_0x005a
        L_0x001a:
            int r0 = r3.f15819m     // Catch:{ all -> 0x005c }
            com.google.android.gms.internal.ads.e10<java.lang.Integer> r1 = com.google.android.gms.internal.ads.m10.f10256C6     // Catch:{ all -> 0x005c }
            com.google.android.gms.internal.ads.k10 r2 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ all -> 0x005c }
            java.lang.Object r1 = r2.mo8579b(r1)     // Catch:{ all -> 0x005c }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x005c }
            int r1 = r1.intValue()     // Catch:{ all -> 0x005c }
            if (r0 < r1) goto L_0x0035
            java.lang.String r4 = "Maximum number of ad requests stored reached. Dropping the current request."
            com.google.android.gms.internal.ads.io0.m11131g(r4)     // Catch:{ all -> 0x005c }
            monitor-exit(r3)
            return
        L_0x0035:
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.iy1>> r0 = r3.f15813g     // Catch:{ all -> 0x005c }
            boolean r0 = r0.containsKey(r4)     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x0047
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.iy1>> r0 = r3.f15813g     // Catch:{ all -> 0x005c }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x005c }
            r1.<init>()     // Catch:{ all -> 0x005c }
            r0.put(r4, r1)     // Catch:{ all -> 0x005c }
        L_0x0047:
            int r0 = r3.f15819m     // Catch:{ all -> 0x005c }
            int r0 = r0 + 1
            r3.f15819m = r0     // Catch:{ all -> 0x005c }
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.iy1>> r0 = r3.f15813g     // Catch:{ all -> 0x005c }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x005c }
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x005c }
            r4.add(r5)     // Catch:{ all -> 0x005c }
            monitor-exit(r3)
            return
        L_0x005a:
            monitor-exit(r3)
            return
        L_0x005c:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.uy1.mo11334e(java.lang.String, com.google.android.gms.internal.ads.iy1):void");
    }

    /* renamed from: f */
    public final void mo11335f() {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10240A6)).booleanValue()) {
            if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10360P6)).booleanValue() || !C2694t.m21607p().mo11025h().mo14076H()) {
                String o = C2694t.m21607p().mo11025h().mo14094o();
                if (!TextUtils.isEmpty(o)) {
                    try {
                        if (new JSONObject(o).optBoolean("isTestMode", false)) {
                            m18229p();
                        }
                    } catch (JSONException unused) {
                    }
                }
            } else {
                m18229p();
            }
        }
    }

    /* renamed from: g */
    public final synchronized void mo11336g(C2127qy qyVar, ty1 ty1) {
        if (!mo11342m()) {
            try {
                qyVar.mo9888x2(dt2.m8099d(18, (String) null, (C1605cv) null));
            } catch (RemoteException unused) {
                io0.m11131g("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
            }
        } else {
            if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10240A6)).booleanValue()) {
                try {
                    qyVar.mo9888x2(dt2.m8099d(1, (String) null, (C1605cv) null));
                } catch (RemoteException unused2) {
                    io0.m11131g("Ad inspector had an internal error.");
                }
            } else {
                this.f15821o = ty1;
                this.f15807a.mo6347f(qyVar, new u70(this));
            }
        }
    }

    /* renamed from: h */
    public final synchronized void mo11337h(String str, long j) {
        this.f15814h = str;
        this.f15816j = j;
        m18230q();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        if (r2 != false) goto L_0x000c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11338i(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f15820n
            if (r0 != 0) goto L_0x000a
            if (r2 == 0) goto L_0x0015
            r1.m18229p()
            goto L_0x000c
        L_0x000a:
            if (r2 == 0) goto L_0x0015
        L_0x000c:
            boolean r2 = r1.f15818l
            if (r2 == 0) goto L_0x0011
            goto L_0x0015
        L_0x0011:
            r1.m18234u()
            return
        L_0x0015:
            boolean r2 = r1.mo11342m()
            if (r2 != 0) goto L_0x001e
            r1.m18233t()
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.uy1.mo11338i(boolean):void");
    }

    /* renamed from: j */
    public final void mo11339j(qy1 qy1) {
        m18231r(qy1, true);
    }

    /* renamed from: k */
    public final synchronized void mo11340k(String str) {
        this.f15815i = str;
    }

    /* renamed from: l */
    public final void mo11341l(boolean z) {
        if (!this.f15820n && z) {
            m18229p();
        }
        m18232s(z, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        return r2.f15818l || p054h1.C2694t.m21611t().mo13989l();
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo11342m() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.m10.f10360P6     // Catch:{ all -> 0x002b }
            com.google.android.gms.internal.ads.k10 r1 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ all -> 0x002b }
            java.lang.Object r0 = r1.mo8579b(r0)     // Catch:{ all -> 0x002b }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x002b }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0027
            boolean r0 = r2.f15818l     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0025
            j1.c0 r0 = p054h1.C2694t.m21611t()     // Catch:{ all -> 0x002b }
            boolean r0 = r0.mo13989l()     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0022
            goto L_0x0025
        L_0x0022:
            r0 = 0
        L_0x0023:
            monitor-exit(r2)
            return r0
        L_0x0025:
            r0 = 1
            goto L_0x0023
        L_0x0027:
            boolean r0 = r2.f15818l     // Catch:{ all -> 0x002b }
            monitor-exit(r2)
            return r0
        L_0x002b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.uy1.mo11342m():boolean");
    }

    /* renamed from: n */
    public final synchronized boolean mo11343n() {
        return this.f15818l;
    }
}
