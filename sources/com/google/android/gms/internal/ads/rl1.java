package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;
import p003a2.C0092o;
import p034e2.C2547d;
import p034e2.C2555l;
import p054h1.C2694t;
import p069j1.C3154e1;
import p069j1.C3163g2;

@ParametersAreNonnullByDefault
public final class rl1 implements zm1 {

    /* renamed from: a */
    private final Context f13682a;

    /* renamed from: b */
    private final cn1 f13683b;

    /* renamed from: c */
    private final JSONObject f13684c;

    /* renamed from: d */
    private final rr1 f13685d;

    /* renamed from: e */
    private final rm1 f13686e;

    /* renamed from: f */
    private final C1734gb f13687f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final ob1 f13688g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final ta1 f13689h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final ni1 f13690i;

    /* renamed from: j */
    private final rr2 f13691j;

    /* renamed from: k */
    private final po0 f13692k;

    /* renamed from: l */
    private final ks2 f13693l;

    /* renamed from: m */
    private final b31 f13694m;

    /* renamed from: n */
    private final un1 f13695n;

    /* renamed from: o */
    private final C2547d f13696o;

    /* renamed from: p */
    private final ji1 f13697p;

    /* renamed from: q */
    private final cy2 f13698q;

    /* renamed from: r */
    private boolean f13699r = false;

    /* renamed from: s */
    private boolean f13700s;

    /* renamed from: t */
    private boolean f13701t = false;

    /* renamed from: u */
    private boolean f13702u = false;

    /* renamed from: v */
    private Point f13703v = new Point();

    /* renamed from: w */
    private Point f13704w = new Point();

    /* renamed from: x */
    private long f13705x = 0;

    /* renamed from: y */
    private long f13706y = 0;

    /* renamed from: z */
    private C1868jy f13707z;

    public rl1(Context context, cn1 cn1, JSONObject jSONObject, rr1 rr1, rm1 rm1, C1734gb gbVar, ob1 ob1, ta1 ta1, ni1 ni1, rr2 rr2, po0 po0, ks2 ks2, b31 b31, un1 un1, C2547d dVar, ji1 ji1, cy2 cy2) {
        this.f13682a = context;
        this.f13683b = cn1;
        this.f13684c = jSONObject;
        this.f13685d = rr1;
        this.f13686e = rm1;
        this.f13687f = gbVar;
        this.f13688g = ob1;
        this.f13689h = ta1;
        this.f13690i = ni1;
        this.f13691j = rr2;
        this.f13692k = po0;
        this.f13693l = ks2;
        this.f13694m = b31;
        this.f13695n = un1;
        this.f13696o = dVar;
        this.f13697p = ji1;
        this.f13698q = cy2;
    }

    /* renamed from: u */
    private final String m16214u(View view, Map<String, WeakReference<View>> map) {
        if (!(map == null || view == null)) {
            for (Map.Entry next : map.entrySet()) {
                if (view.equals((View) ((WeakReference) next.getValue()).get())) {
                    return (String) next.getKey();
                }
            }
        }
        int K = this.f13686e.mo10557K();
        if (K == 1) {
            return "1099";
        }
        if (K == 2) {
            return "2099";
        }
        if (K != 6) {
            return null;
        }
        return "3099";
    }

    /* renamed from: v */
    private final boolean m16215v(String str) {
        JSONObject optJSONObject = this.f13684c.optJSONObject("allow_pub_event_reporting");
        return optJSONObject != null && optJSONObject.optBoolean(str, false);
    }

    /* renamed from: w */
    private final boolean m16216w() {
        return this.f13684c.optBoolean("allow_custom_click_gesture", false);
    }

    /* renamed from: x */
    private final boolean m16217x(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z) {
        rr1 rr1;
        t70 ll1;
        String str2;
        C0092o.m309e("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f13684c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10507h2)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z);
            Context context = this.f13682a;
            JSONObject jSONObject7 = new JSONObject();
            C2694t.m21608q();
            DisplayMetrics g0 = C3163g2.m23930g0((WindowManager) context.getSystemService("window"));
            try {
                jSONObject7.put("width", C2125qw.m15897b().mo5896b(context, g0.widthPixels));
                jSONObject7.put("height", C2125qw.m15897b().mo5896b(context, g0.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10538k6)).booleanValue()) {
                rr1 = this.f13685d;
                ll1 = new nl1(this, (ml1) null);
                str2 = "/clickRecorded";
            } else {
                rr1 = this.f13685d;
                ll1 = new ll1(this, (kl1) null);
                str2 = "/logScionEvent";
            }
            rr1.mo10659i(str2, ll1);
            this.f13685d.mo10659i("/nativeImpression", new ql1(this, (pl1) null));
            zo0.m20769a(this.f13685d.mo10654d("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.f13699r) {
                return true;
            }
            this.f13699r = C2694t.m21611t().mo13991n(this.f13682a, this.f13692k.f12729f, this.f13691j.f13861D.toString(), this.f13693l.f9641f);
            return true;
        } catch (JSONException e) {
            io0.m11129e("Unable to create impression JSON.", e);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final void mo10530C(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z, boolean z2) {
        String str2;
        C0092o.m309e("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.f13684c);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            boolean z3 = false;
            jSONObject7.put("has_custom_click_handler", this.f13683b.mo6229c(this.f13686e.mo10585g0()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.f13686e.mo10557K());
            jSONObject8.put("view_aware_api_used", z);
            b40 b40 = this.f13693l.f9644i;
            jSONObject8.put("custom_mute_requested", b40 != null && b40.f4687l);
            jSONObject8.put("custom_mute_enabled", !this.f13686e.mo10582f().isEmpty() && this.f13686e.mo10565S() != null);
            if (this.f13695n.mo11260a() != null && this.f13684c.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.f13696o.mo12462a());
            if (this.f13702u && m16216w()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            if (this.f13683b.mo6229c(this.f13686e.mo10585g0()) != null) {
                z3 = true;
            }
            jSONObject8.put("has_custom_click_handler", z3);
            try {
                JSONObject optJSONObject = this.f13684c.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                str2 = this.f13687f.mo7560c().mo6115f(this.f13682a, optJSONObject.optString("click_string"), view);
            } catch (Exception e) {
                io0.m11129e("Exception obtaining click signals", e);
                str2 = null;
            }
            jSONObject8.put("click_signals", str2);
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10490f3)).booleanValue()) {
                jSONObject8.put("open_chrome_custom_tab", true);
            }
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10574o6)).booleanValue() && C2555l.m21217k()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10583p6)).booleanValue() && C2555l.m21217k()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long a = this.f13696o.mo12462a();
            jSONObject9.put("time_from_last_touch_down", a - this.f13705x);
            jSONObject9.put("time_from_last_touch", a - this.f13706y);
            jSONObject7.put("touch_signal", jSONObject9);
            zo0.m20769a(this.f13685d.mo10654d("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e2) {
            io0.m11129e("Unable to create click JSON.", e2);
        }
    }

    /* renamed from: U */
    public final boolean mo10118U() {
        return m16216w();
    }

    /* renamed from: a */
    public final boolean mo10119a(Bundle bundle) {
        if (!m16215v("impression_reporting")) {
            io0.m11128d("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
            return false;
        }
        return m16217x((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (String) null, C2694t.m21608q().mo14025O(bundle, (JSONObject) null), false);
    }

    /* renamed from: b */
    public final void mo10120b(Bundle bundle) {
        if (bundle == null) {
            io0.m11126b("Click data is null. No click is reported.");
        } else if (!m16215v("click_reporting")) {
            io0.m11128d("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            mo10530C((View) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, bundle2 != null ? bundle2.getString("asset_id") : null, (JSONObject) null, C2694t.m21608q().mo14025O(bundle, (JSONObject) null), false, false);
        }
    }

    /* renamed from: c */
    public final JSONObject mo10121c(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        JSONObject d = C3154e1.m23867d(this.f13682a, map, map2, view);
        JSONObject g = C3154e1.m23870g(this.f13682a, view);
        JSONObject f = C3154e1.m23869f(view);
        JSONObject e = C3154e1.m23868e(this.f13682a, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", d);
            jSONObject.put("ad_view_signal", g);
            jSONObject.put("scroll_view_signal", f);
            jSONObject.put("lock_screen_signal", e);
            return jSONObject;
        } catch (JSONException e2) {
            io0.m11129e("Unable to create native ad view signals JSON.", e2);
            return null;
        }
    }

    /* renamed from: d */
    public final void mo10122d() {
        try {
            C1868jy jyVar = this.f13707z;
            if (jyVar != null) {
                jyVar.mo8036b();
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: e */
    public final void mo10123e() {
        if (this.f13684c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.f13695n.mo11261b();
        }
    }

    /* renamed from: f */
    public final void mo10124f() {
        this.f13685d.mo10656f();
    }

    /* renamed from: g */
    public final void mo10125g(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        String str;
        JSONObject d = C3154e1.m23867d(this.f13682a, map, map2, view);
        JSONObject g = C3154e1.m23870g(this.f13682a, view);
        JSONObject f = C3154e1.m23869f(view);
        JSONObject e = C3154e1.m23868e(this.f13682a, view);
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10507h2)).booleanValue()) {
            try {
                str = this.f13687f.mo7560c().mo6112c(this.f13682a, view, (Activity) null);
            } catch (Exception unused) {
                io0.m11128d("Exception getting data.");
            }
            m16217x(g, d, f, e, str, (JSONObject) null, C3154e1.m23871h(this.f13682a, this.f13691j));
        }
        str = null;
        m16217x(g, d, f, e, str, (JSONObject) null, C3154e1.m23871h(this.f13682a, this.f13691j));
    }

    /* renamed from: h */
    public final void mo10126h(View view, MotionEvent motionEvent, View view2) {
        this.f13703v = C3154e1.m23864a(motionEvent, view2);
        long a = this.f13696o.mo12462a();
        this.f13706y = a;
        if (motionEvent.getAction() == 0) {
            this.f13705x = a;
            this.f13704w = this.f13703v;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.f13703v;
        obtain.setLocation((float) point.x, (float) point.y);
        this.f13687f.mo7561d(obtain);
        obtain.recycle();
    }

    /* renamed from: i */
    public final void mo10127i(C1868jy jyVar) {
        this.f13707z = jyVar;
    }

    /* renamed from: j */
    public final void mo10128j(C1979my myVar) {
        try {
            if (!this.f13701t) {
                if (myVar == null) {
                    if (this.f13686e.mo10565S() != null) {
                        this.f13701t = true;
                        this.f13698q.mo6339b(this.f13686e.mo10565S().mo8815d());
                        mo10122d();
                        return;
                    }
                }
                this.f13701t = true;
                this.f13698q.mo6339b(myVar.mo8815d());
                mo10122d();
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: k */
    public final void mo10129k(String str) {
        mo10530C((View) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, str, (JSONObject) null, (JSONObject) null, false, false);
    }

    /* renamed from: k0 */
    public final void mo10130k0(Bundle bundle) {
        if (bundle == null) {
            io0.m11126b("Touch event data is null. No touch event is reported.");
        } else if (!m16215v("touch_reporting")) {
            io0.m11128d("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
        } else {
            float f = bundle.getFloat("x");
            float f2 = bundle.getFloat("y");
            this.f13687f.mo7560c().mo6114e((int) f, (int) f2, bundle.getInt("duration_ms"));
        }
    }

    /* renamed from: l */
    public final void mo10131l(e60 e60) {
        if (!this.f13684c.optBoolean("custom_one_point_five_click_enabled", false)) {
            io0.m11131g("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        } else {
            this.f13695n.mo11262c(e60);
        }
    }

    /* renamed from: m */
    public final void mo10132m(View view, Map<String, WeakReference<View>> map) {
        this.f13703v = new Point();
        this.f13704w = new Point();
        if (view != null) {
            this.f13697p.mo8467T0(view);
        }
        this.f13700s = false;
    }

    /* renamed from: n */
    public final void mo10133n() {
        C0092o.m309e("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f13684c);
            zo0.m20769a(this.f13685d.mo10654d("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e) {
            io0.m11129e("", e);
        }
    }

    /* renamed from: o */
    public final void mo10134o(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        View view3 = view2;
        Map<String, WeakReference<View>> map3 = map;
        JSONObject d = C3154e1.m23867d(this.f13682a, map, map2, view2);
        JSONObject g = C3154e1.m23870g(this.f13682a, view2);
        JSONObject f = C3154e1.m23869f(view2);
        JSONObject e = C3154e1.m23868e(this.f13682a, view2);
        View view4 = view;
        String u = m16214u(view, map);
        mo10530C(true == ((Boolean) C2199sw.m17001c().mo8579b(m10.f10516i2)).booleanValue() ? view3 : view4, g, d, f, e, u, C3154e1.m23866c(u, this.f13682a, this.f13704w, this.f13703v), (JSONObject) null, z, false);
    }

    /* renamed from: p */
    public final void mo10135p(View view) {
        if (!this.f13684c.optBoolean("custom_one_point_five_click_enabled", false)) {
            io0.m11131g("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        un1 un1 = this.f13695n;
        if (view != null) {
            view.setOnClickListener(un1);
            view.setClickable(true);
            un1.f15659l = new WeakReference<>(view);
        }
    }

    /* renamed from: q */
    public final void mo10136q(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        View view2 = view;
        Map<String, WeakReference<View>> map3 = map;
        if (!this.f13702u) {
            io0.m11126b("Custom click reporting failed. enableCustomClickGesture is not set.");
        } else if (!m16216w()) {
            io0.m11126b("Custom click reporting failed. Ad unit id not in the allow list.");
        } else {
            Map<String, WeakReference<View>> map4 = map2;
            JSONObject d = C3154e1.m23867d(this.f13682a, map, map2, view);
            JSONObject g = C3154e1.m23870g(this.f13682a, view);
            JSONObject f = C3154e1.m23869f(view);
            JSONObject e = C3154e1.m23868e(this.f13682a, view);
            String u = m16214u((View) null, map);
            mo10530C(view, g, d, f, e, u, C3154e1.m23866c(u, this.f13682a, this.f13704w, this.f13703v), (JSONObject) null, z, true);
        }
    }

    /* renamed from: r */
    public final void mo10137r() {
        m16217x((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (String) null, (JSONObject) null, false);
    }

    /* renamed from: s */
    public final void mo10138s(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.f13703v = new Point();
        this.f13704w = new Point();
        if (!this.f13700s) {
            this.f13697p.mo8466S0(view);
            this.f13700s = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.f13694m.mo5650e(this);
        boolean i = C3154e1.m23872i(this.f13692k.f12731h);
        if (map != null) {
            for (Map.Entry<String, WeakReference<View>> value : map.entrySet()) {
                View view2 = (View) ((WeakReference) value.getValue()).get();
                if (view2 != null) {
                    if (i) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            for (Map.Entry<String, WeakReference<View>> value2 : map2.entrySet()) {
                View view3 = (View) ((WeakReference) value2.getValue()).get();
                if (view3 != null) {
                    if (i) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    /* renamed from: t */
    public final JSONObject mo10139t(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        JSONObject c = mo10121c(view, map, map2);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f13702u && m16216w()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (c != null) {
                jSONObject.put("nas", c);
            }
        } catch (JSONException e) {
            io0.m11129e("Unable to create native click meta data JSON.", e);
        }
        return jSONObject;
    }

    /* renamed from: y */
    public final void mo10140y() {
        this.f13702u = true;
    }
}
