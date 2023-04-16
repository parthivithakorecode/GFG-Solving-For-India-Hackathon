package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;
import p003a2.C0092o;
import p048g2.C2635a;
import p048g2.C2637b;
import p054h1.C2694t;
import p069j1.C3163g2;
import p069j1.C3218x;

public final class n01 extends C1683ey {

    /* renamed from: f */
    private final Context f11218f;

    /* renamed from: g */
    private final po0 f11219g;

    /* renamed from: h */
    private final rt1 f11220h;

    /* renamed from: i */
    private final c52<at2, z62> f11221i;

    /* renamed from: j */
    private final hb2 f11222j;

    /* renamed from: k */
    private final cy1 f11223k;

    /* renamed from: l */
    private final pm0 f11224l;

    /* renamed from: m */
    private final xt1 f11225m;

    /* renamed from: n */
    private final uy1 f11226n;

    /* renamed from: o */
    private final u30 f11227o;
    @GuardedBy("this")

    /* renamed from: p */
    private boolean f11228p = false;

    n01(Context context, po0 po0, rt1 rt1, c52<at2, z62> c52, hb2 hb2, cy1 cy1, pm0 pm0, xt1 xt1, uy1 uy1, u30 u30) {
        this.f11218f = context;
        this.f11219g = po0;
        this.f11220h = rt1;
        this.f11221i = c52;
        this.f11222j = hb2;
        this.f11223k = cy1;
        this.f11224l = pm0;
        this.f11225m = xt1;
        this.f11226n = uy1;
        this.f11227o = u30;
    }

    /* renamed from: C3 */
    public final void mo6315C3(C2127qy qyVar) {
        this.f11226n.mo11336g(qyVar, ty1.API);
    }

    /* renamed from: J1 */
    public final void mo6316J1(C2635a aVar, String str) {
        if (aVar == null) {
            io0.m11128d("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) C2637b.m21357C0(aVar);
        if (context == null) {
            io0.m11128d("Context is null. Failed to open debug menu.");
            return;
        }
        C3218x xVar = new C3218x(context);
        xVar.mo14128n(str);
        xVar.mo14129o(this.f11219g.f12729f);
        xVar.mo14132r();
    }

    /* renamed from: L3 */
    public final void mo6317L3(dd0 dd0) {
        this.f11220h.mo10665c(dd0);
    }

    /* renamed from: Q */
    public final void mo7436Q(String str) {
        this.f11222j.mo7909f(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo9397a() {
        if (C2694t.m21607p().mo11025h().mo14076H()) {
            if (!C2694t.m21611t().mo13987j(this.f11218f, C2694t.m21607p().mo11025h().mo14089j(), this.f11219g.f12729f)) {
                C2694t.m21607p().mo11025h().mo14099t(false);
                C2694t.m21607p().mo11025h().mo14096q("");
            }
        }
    }

    /* renamed from: a1 */
    public final void mo6318a1(n00 n00) {
        this.f11224l.mo10105v(this.f11218f, n00);
    }

    /* renamed from: a4 */
    public final void mo6319a4(String str, C2635a aVar) {
        String str2;
        m01 m01;
        m10.m13007c(this.f11218f);
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10260D2)).booleanValue()) {
            C2694t.m21608q();
            str2 = C3163g2.m23924d0(this.f11218f);
        } else {
            str2 = "";
        }
        boolean z = true;
        if (true != TextUtils.isEmpty(str2)) {
            str = str2;
        }
        if (!TextUtils.isEmpty(str)) {
            boolean booleanValue = ((Boolean) C2199sw.m17001c().mo8579b(m10.f10236A2)).booleanValue();
            e10 e10 = m10.f10266E0;
            boolean booleanValue2 = booleanValue | ((Boolean) C2199sw.m17001c().mo8579b(e10)).booleanValue();
            if (((Boolean) C2199sw.m17001c().mo8579b(e10)).booleanValue()) {
                m01 = new m01(this, (Runnable) C2637b.m21357C0(aVar));
            } else {
                z = booleanValue2;
                m01 = null;
            }
            if (z) {
                C2694t.m21593b().mo12669a(this.f11218f, this.f11219g, str, m01);
            }
        }
    }

    /* renamed from: b */
    public final synchronized float mo7437b() {
        return C2694t.m21610s().mo14013a();
    }

    /* renamed from: d */
    public final String mo6320d() {
        return this.f11219g.f12729f;
    }

    /* renamed from: d3 */
    public final void mo6321d3(m90 m90) {
        this.f11223k.mo6336r(m90);
    }

    /* renamed from: e */
    public final List<f90> mo6322e() {
        return this.f11223k.mo6328f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo9398g() {
        this.f11227o.mo11154a(new ci0());
    }

    /* renamed from: h */
    public final void mo6323h() {
        this.f11223k.mo6329k();
    }

    /* renamed from: i */
    public final synchronized void mo6324i() {
        if (this.f11228p) {
            io0.m11131g("Mobile ads is initialized already.");
            return;
        }
        m10.m13007c(this.f11218f);
        C2694t.m21607p().mo11032q(this.f11218f, this.f11219g);
        C2694t.m21595d().mo8237i(this.f11218f);
        this.f11228p = true;
        this.f11223k.mo6335q();
        this.f11222j.mo7907d();
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10244B2)).booleanValue()) {
            this.f11225m.mo11922c();
        }
        this.f11226n.mo11335f();
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10360P6)).booleanValue()) {
            wo0.f16886a.execute(new j01(this));
        }
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10602r7)).booleanValue()) {
            wo0.f16886a.execute(new k01(this));
        }
    }

    /* renamed from: i4 */
    public final synchronized void mo6325i4(float f) {
        C2694t.m21610s().mo14015d(f);
    }

    /* renamed from: q */
    public final synchronized boolean mo7438q() {
        return C2694t.m21610s().mo14016e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        return;
     */
    /* renamed from: v4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo7439v4(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            android.content.Context r0 = r4.f11218f     // Catch:{ all -> 0x002e }
            com.google.android.gms.internal.ads.m10.m13007c(r0)     // Catch:{ all -> 0x002e }
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x002c
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.m10.f10236A2     // Catch:{ all -> 0x002e }
            com.google.android.gms.internal.ads.k10 r1 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ all -> 0x002e }
            java.lang.Object r0 = r1.mo8579b(r0)     // Catch:{ all -> 0x002e }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x002e }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x002c
            h1.e r0 = p054h1.C2694t.m21593b()     // Catch:{ all -> 0x002e }
            android.content.Context r1 = r4.f11218f     // Catch:{ all -> 0x002e }
            com.google.android.gms.internal.ads.po0 r2 = r4.f11219g     // Catch:{ all -> 0x002e }
            r3 = 0
            r0.mo12669a(r1, r2, r5, r3)     // Catch:{ all -> 0x002e }
            monitor-exit(r4)
            return
        L_0x002c:
            monitor-exit(r4)
            return
        L_0x002e:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n01.mo7439v4(java.lang.String):void");
    }

    /* renamed from: x0 */
    public final synchronized void mo6326x0(boolean z) {
        C2694t.m21610s().mo14014c(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z5 */
    public final void mo9399z5(Runnable runnable) {
        C0092o.m309e("Adapters must be initialized on the main thread.");
        Map<String, yc0> e = C2694t.m21607p().mo11025h().mo14084e().mo9803e();
        if (!e.isEmpty()) {
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    io0.m11132h("Could not initialize rewarded ads.", th);
                    return;
                }
            }
            if (this.f11220h.mo10666d()) {
                HashMap hashMap = new HashMap();
                for (yc0 yc0 : e.values()) {
                    for (xc0 next : yc0.f17662a) {
                        String str = next.f17124k;
                        for (String next2 : next.f17116c) {
                            if (!hashMap.containsKey(next2)) {
                                hashMap.put(next2, new ArrayList());
                            }
                            if (str != null) {
                                ((Collection) hashMap.get(next2)).add(str);
                            }
                        }
                    }
                }
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    try {
                        d52<at2, z62> a = this.f11221i.mo6058a(str2, jSONObject);
                        if (a != null) {
                            at2 at2 = (at2) a.f5647b;
                            if (!at2.mo5494a() && at2.mo5493C()) {
                                at2.mo5506m(this.f11218f, (z62) a.f5648c, (List) entry.getValue());
                                String valueOf = String.valueOf(str2);
                                io0.m11126b(valueOf.length() != 0 ? "Initialized rewarded video mediation adapter ".concat(valueOf) : new String("Initialized rewarded video mediation adapter "));
                            }
                        }
                    } catch (ps2 e2) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 56);
                        sb.append("Failed to initialize rewarded video mediation adapter \"");
                        sb.append(str2);
                        sb.append("\"");
                        io0.m11132h(sb.toString(), e2);
                    }
                }
            }
        }
    }
}
