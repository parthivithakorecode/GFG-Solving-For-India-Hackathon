package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;
import p048g2.C2635a;
import p048g2.C2637b;
import p054h1.C2694t;

@ParametersAreNonnullByDefault
public final class po1 implements zm1 {

    /* renamed from: a */
    private final sd0 f12734a;

    /* renamed from: b */
    private final ob1 f12735b;

    /* renamed from: c */
    private final ta1 f12736c;

    /* renamed from: d */
    private final ni1 f12737d;

    /* renamed from: e */
    private final Context f12738e;

    /* renamed from: f */
    private final rr2 f12739f;

    /* renamed from: g */
    private final po0 f12740g;

    /* renamed from: h */
    private final ks2 f12741h;

    /* renamed from: i */
    private boolean f12742i = false;

    /* renamed from: j */
    private boolean f12743j = false;

    /* renamed from: k */
    private boolean f12744k = true;

    /* renamed from: l */
    private final od0 f12745l;

    /* renamed from: m */
    private final pd0 f12746m;

    public po1(od0 od0, pd0 pd0, sd0 sd0, ob1 ob1, ta1 ta1, ni1 ni1, Context context, rr2 rr2, po0 po0, ks2 ks2, byte[] bArr) {
        this.f12745l = od0;
        this.f12746m = pd0;
        this.f12734a = sd0;
        this.f12735b = ob1;
        this.f12736c = ta1;
        this.f12737d = ni1;
        this.f12738e = context;
        this.f12739f = rr2;
        this.f12740g = po0;
        this.f12741h = ks2;
    }

    /* renamed from: u */
    private final void m15178u(View view) {
        try {
            sd0 sd0 = this.f12734a;
            if (sd0 == null || sd0.mo9205F()) {
                od0 od0 = this.f12745l;
                if (od0 == null || od0.mo9728D5()) {
                    pd0 pd0 = this.f12746m;
                    if (pd0 != null && !pd0.mo10020E5()) {
                        this.f12746m.mo10016A5(C2637b.m21358Z2(view));
                        this.f12736c.mo25L();
                        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10557m7)).booleanValue()) {
                            this.f12737d.mo8182r();
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.f12745l.mo9725A5(C2637b.m21358Z2(view));
                this.f12736c.mo25L();
                if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10557m7)).booleanValue()) {
                    this.f12737d.mo8182r();
                    return;
                }
                return;
            }
            this.f12734a.mo9223p3(C2637b.m21358Z2(view));
            this.f12736c.mo25L();
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10557m7)).booleanValue()) {
                this.f12737d.mo8182r();
            }
        } catch (RemoteException e) {
            io0.m11132h("Failed to call handleClick", e);
        }
    }

    /* renamed from: v */
    private static final HashMap<String, View> m15179v(Map<String, WeakReference<View>> map) {
        HashMap<String, View> hashMap = new HashMap<>();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Map.Entry next : map.entrySet()) {
                View view = (View) ((WeakReference) next.getValue()).get();
                if (view != null) {
                    hashMap.put((String) next.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: U */
    public final boolean mo10118U() {
        return this.f12739f.f13866I;
    }

    /* renamed from: a */
    public final boolean mo10119a(Bundle bundle) {
        return false;
    }

    /* renamed from: b */
    public final void mo10120b(Bundle bundle) {
    }

    /* renamed from: c */
    public final JSONObject mo10121c(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        return null;
    }

    /* renamed from: d */
    public final void mo10122d() {
        throw null;
    }

    /* renamed from: e */
    public final void mo10123e() {
    }

    /* renamed from: f */
    public final void mo10124f() {
    }

    /* renamed from: g */
    public final void mo10125g(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        try {
            if (!this.f12742i) {
                this.f12742i = C2694t.m21611t().mo13991n(this.f12738e, this.f12740g.f12729f, this.f12739f.f13861D.toString(), this.f12741h.f9641f);
            }
            if (this.f12744k) {
                sd0 sd0 = this.f12734a;
                if (sd0 != null) {
                    if (!sd0.mo9206G()) {
                        this.f12734a.mo9207M();
                        this.f12735b.zza();
                        return;
                    }
                }
                od0 od0 = this.f12745l;
                if (od0 != null) {
                    if (!od0.mo9729E5()) {
                        this.f12745l.mo9741q();
                        this.f12735b.zza();
                        return;
                    }
                }
                pd0 pd0 = this.f12746m;
                if (pd0 != null && !pd0.mo10021F5()) {
                    this.f12746m.mo10031t();
                    this.f12735b.zza();
                }
            }
        } catch (RemoteException e) {
            io0.m11132h("Failed to call recordImpression", e);
        }
    }

    /* renamed from: h */
    public final void mo10126h(View view, MotionEvent motionEvent, View view2) {
    }

    /* renamed from: i */
    public final void mo10127i(C1868jy jyVar) {
        io0.m11131g("Mute This Ad is not supported for 3rd party ads");
    }

    /* renamed from: j */
    public final void mo10128j(C1979my myVar) {
        io0.m11131g("Mute This Ad is not supported for 3rd party ads");
    }

    /* renamed from: k */
    public final void mo10129k(String str) {
    }

    /* renamed from: k0 */
    public final void mo10130k0(Bundle bundle) {
    }

    /* renamed from: l */
    public final void mo10131l(e60 e60) {
    }

    /* renamed from: m */
    public final void mo10132m(View view, Map<String, WeakReference<View>> map) {
        try {
            C2635a Z2 = C2637b.m21358Z2(view);
            sd0 sd0 = this.f12734a;
            if (sd0 != null) {
                sd0.mo9208P1(Z2);
                return;
            }
            od0 od0 = this.f12745l;
            if (od0 != null) {
                od0.mo9740p3(Z2);
                return;
            }
            pd0 pd0 = this.f12746m;
            if (pd0 != null) {
                pd0.mo10019D5(Z2);
            }
        } catch (RemoteException e) {
            io0.m11132h("Failed to call untrackView", e);
        }
    }

    /* renamed from: n */
    public final void mo10133n() {
    }

    /* renamed from: o */
    public final void mo10134o(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (!this.f12743j || !this.f12739f.f13866I) {
            m15178u(view);
        }
    }

    /* renamed from: p */
    public final void mo10135p(View view) {
    }

    /* renamed from: q */
    public final void mo10136q(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        String str;
        if (!this.f12743j) {
            str = "Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.";
        } else if (!this.f12739f.f13866I) {
            str = "Custom click reporting for 3p ads failed. Ad unit id not in allow list.";
        } else {
            m15178u(view);
            return;
        }
        io0.m11131g(str);
    }

    /* renamed from: r */
    public final void mo10137r() {
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10138s(android.view.View r9, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r10, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r11, android.view.View.OnTouchListener r12, android.view.View.OnClickListener r13) {
        /*
            r8 = this;
            g2.a r9 = p048g2.C2637b.m21358Z2(r9)     // Catch:{ RemoteException -> 0x0122 }
            com.google.android.gms.internal.ads.rr2 r12 = r8.f12739f     // Catch:{ RemoteException -> 0x0122 }
            org.json.JSONObject r12 = r12.f13899h0     // Catch:{ RemoteException -> 0x0122 }
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r13 = com.google.android.gms.internal.ads.m10.f10506h1     // Catch:{ RemoteException -> 0x0122 }
            com.google.android.gms.internal.ads.k10 r0 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ RemoteException -> 0x0122 }
            java.lang.Object r13 = r0.mo8579b(r13)     // Catch:{ RemoteException -> 0x0122 }
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch:{ RemoteException -> 0x0122 }
            boolean r13 = r13.booleanValue()     // Catch:{ RemoteException -> 0x0122 }
            r0 = 1
            r1 = 0
            if (r13 == 0) goto L_0x00de
            int r13 = r12.length()     // Catch:{ RemoteException -> 0x0122 }
            if (r13 != 0) goto L_0x0024
            goto L_0x00de
        L_0x0024:
            if (r10 != 0) goto L_0x002c
            java.util.HashMap r13 = new java.util.HashMap     // Catch:{ RemoteException -> 0x0122 }
            r13.<init>()     // Catch:{ RemoteException -> 0x0122 }
            goto L_0x002d
        L_0x002c:
            r13 = r10
        L_0x002d:
            if (r11 != 0) goto L_0x0035
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ RemoteException -> 0x0122 }
            r2.<init>()     // Catch:{ RemoteException -> 0x0122 }
            goto L_0x0036
        L_0x0035:
            r2 = r11
        L_0x0036:
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ RemoteException -> 0x0122 }
            r3.<init>()     // Catch:{ RemoteException -> 0x0122 }
            r3.putAll(r13)     // Catch:{ RemoteException -> 0x0122 }
            r3.putAll(r2)     // Catch:{ RemoteException -> 0x0122 }
            java.util.Iterator r13 = r12.keys()     // Catch:{ RemoteException -> 0x0122 }
        L_0x0045:
            boolean r2 = r13.hasNext()     // Catch:{ RemoteException -> 0x0122 }
            if (r2 == 0) goto L_0x00de
            java.lang.Object r2 = r13.next()     // Catch:{ RemoteException -> 0x0122 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ RemoteException -> 0x0122 }
            org.json.JSONArray r4 = r12.optJSONArray(r2)     // Catch:{ RemoteException -> 0x0122 }
            if (r4 == 0) goto L_0x0045
            java.lang.Object r5 = r3.get(r2)     // Catch:{ RemoteException -> 0x0122 }
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5     // Catch:{ RemoteException -> 0x0122 }
            if (r5 != 0) goto L_0x0062
        L_0x005f:
            r0 = r1
            goto L_0x00de
        L_0x0062:
            java.lang.Object r5 = r5.get()     // Catch:{ RemoteException -> 0x0122 }
            if (r5 != 0) goto L_0x0069
            goto L_0x005f
        L_0x0069:
            java.lang.Class r5 = r5.getClass()     // Catch:{ RemoteException -> 0x0122 }
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r6 = com.google.android.gms.internal.ads.m10.f10515i1     // Catch:{ RemoteException -> 0x0122 }
            com.google.android.gms.internal.ads.k10 r7 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ RemoteException -> 0x0122 }
            java.lang.Object r6 = r7.mo8579b(r6)     // Catch:{ RemoteException -> 0x0122 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ RemoteException -> 0x0122 }
            boolean r6 = r6.booleanValue()     // Catch:{ RemoteException -> 0x0122 }
            if (r6 == 0) goto L_0x00b1
            java.lang.String r6 = "3010"
            boolean r2 = r2.equals(r6)     // Catch:{ RemoteException -> 0x0122 }
            if (r2 == 0) goto L_0x00b1
            com.google.android.gms.internal.ads.sd0 r2 = r8.f12734a     // Catch:{ RemoteException -> 0x0122 }
            r5 = 0
            if (r2 == 0) goto L_0x0091
            g2.a r2 = r2.mo9218m()     // Catch:{ RemoteException -> 0x00aa }
            goto L_0x00a4
        L_0x0091:
            com.google.android.gms.internal.ads.od0 r2 = r8.f12745l     // Catch:{ RemoteException -> 0x0122 }
            if (r2 == 0) goto L_0x009a
            g2.a r2 = r2.mo9744y5()     // Catch:{ RemoteException -> 0x00aa }
            goto L_0x00a4
        L_0x009a:
            com.google.android.gms.internal.ads.pd0 r2 = r8.f12746m     // Catch:{ RemoteException -> 0x0122 }
            if (r2 == 0) goto L_0x00a3
            g2.a r2 = r2.mo10032u5()     // Catch:{ RemoteException -> 0x00aa }
            goto L_0x00a4
        L_0x00a3:
            r2 = r5
        L_0x00a4:
            if (r2 == 0) goto L_0x00aa
            java.lang.Object r5 = p048g2.C2637b.m21357C0(r2)     // Catch:{  }
        L_0x00aa:
            if (r5 != 0) goto L_0x00ad
            goto L_0x005f
        L_0x00ad:
            java.lang.Class r5 = r5.getClass()     // Catch:{ RemoteException -> 0x0122 }
        L_0x00b1:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0045 }
            r2.<init>()     // Catch:{ JSONException -> 0x0045 }
            p069j1.C3138a1.m23821c(r4, r2)     // Catch:{ JSONException -> 0x0045 }
            p054h1.C2694t.m21608q()     // Catch:{ JSONException -> 0x0045 }
            android.content.Context r4 = r8.f12738e     // Catch:{ JSONException -> 0x0045 }
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ JSONException -> 0x0045 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ JSONException -> 0x0045 }
        L_0x00c6:
            boolean r6 = r2.hasNext()     // Catch:{ JSONException -> 0x0045 }
            if (r6 == 0) goto L_0x005f
            java.lang.Object r6 = r2.next()     // Catch:{ JSONException -> 0x0045 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ JSONException -> 0x0045 }
            java.lang.Class r6 = java.lang.Class.forName(r6, r1, r4)     // Catch:{ all -> 0x00c6 }
            boolean r6 = r6.isAssignableFrom(r5)     // Catch:{ all -> 0x00c6 }
            if (r6 == 0) goto L_0x00c6
            goto L_0x0045
        L_0x00de:
            r8.f12744k = r0     // Catch:{ RemoteException -> 0x0122 }
            java.util.HashMap r10 = m15179v(r10)     // Catch:{ RemoteException -> 0x0122 }
            java.util.HashMap r11 = m15179v(r11)     // Catch:{ RemoteException -> 0x0122 }
            com.google.android.gms.internal.ads.sd0 r12 = r8.f12734a     // Catch:{ RemoteException -> 0x0122 }
            if (r12 == 0) goto L_0x00f8
            g2.a r10 = p048g2.C2637b.m21358Z2(r10)     // Catch:{ RemoteException -> 0x0122 }
            g2.a r11 = p048g2.C2637b.m21358Z2(r11)     // Catch:{ RemoteException -> 0x0122 }
            r12.mo9222p1(r9, r10, r11)     // Catch:{ RemoteException -> 0x0122 }
            return
        L_0x00f8:
            com.google.android.gms.internal.ads.od0 r12 = r8.f12745l     // Catch:{ RemoteException -> 0x0122 }
            if (r12 == 0) goto L_0x010d
            g2.a r10 = p048g2.C2637b.m21358Z2(r10)     // Catch:{ RemoteException -> 0x0122 }
            g2.a r11 = p048g2.C2637b.m21358Z2(r11)     // Catch:{ RemoteException -> 0x0122 }
            r12.mo9727C5(r9, r10, r11)     // Catch:{ RemoteException -> 0x0122 }
            com.google.android.gms.internal.ads.od0 r10 = r8.f12745l     // Catch:{ RemoteException -> 0x0122 }
            r10.mo9726B5(r9)     // Catch:{ RemoteException -> 0x0122 }
            return
        L_0x010d:
            com.google.android.gms.internal.ads.pd0 r12 = r8.f12746m     // Catch:{ RemoteException -> 0x0122 }
            if (r12 == 0) goto L_0x0121
            g2.a r10 = p048g2.C2637b.m21358Z2(r10)     // Catch:{ RemoteException -> 0x0122 }
            g2.a r11 = p048g2.C2637b.m21358Z2(r11)     // Catch:{ RemoteException -> 0x0122 }
            r12.mo10018C5(r9, r10, r11)     // Catch:{ RemoteException -> 0x0122 }
            com.google.android.gms.internal.ads.pd0 r10 = r8.f12746m     // Catch:{ RemoteException -> 0x0122 }
            r10.mo10017B5(r9)     // Catch:{ RemoteException -> 0x0122 }
        L_0x0121:
            return
        L_0x0122:
            r9 = move-exception
            java.lang.String r10 = "Failed to call trackView"
            com.google.android.gms.internal.ads.io0.m11132h(r10, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.po1.mo10138s(android.view.View, java.util.Map, java.util.Map, android.view.View$OnTouchListener, android.view.View$OnClickListener):void");
    }

    /* renamed from: t */
    public final JSONObject mo10139t(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        return null;
    }

    /* renamed from: y */
    public final void mo10140y() {
        this.f12743j = true;
    }
}
