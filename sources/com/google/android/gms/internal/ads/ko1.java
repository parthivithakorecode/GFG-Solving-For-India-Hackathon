package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import p054h1.C2676b;
import p069j1.C3154e1;

public final class ko1 {

    /* renamed from: a */
    private final et1 f9582a;

    /* renamed from: b */
    private final rr1 f9583b;

    /* renamed from: c */
    private ViewTreeObserver.OnScrollChangedListener f9584c = null;

    public ko1(et1 et1, rr1 rr1) {
        this.f9582a = et1;
        this.f9583b = rr1;
    }

    /* renamed from: f */
    private static final int m12275f(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        C2125qw.m15897b();
        return bo0.m6995s(context, i);
    }

    /* renamed from: a */
    public final View mo8719a(View view, WindowManager windowManager) {
        eu0 a = this.f9582a.mo7072a(C2087pv.m15287e(), (rr2) null, (ur2) null);
        View view2 = (View) a;
        view2.setVisibility(4);
        view2.setContentDescription("policy_validator");
        a.mo7080F0("/sendMessageToSdk", new fo1(this));
        a.mo7080F0("/hideValidatorOverlay", new ho1(this, windowManager, view));
        a.mo7080F0("/open", new f80((C2676b) null, (yf0) null, (o42) null, (wv1) null, (xw2) null));
        this.f9583b.mo10660j(new WeakReference(a), "/loadNativeAdPolicyViolations", new go1(this, view, windowManager));
        this.f9583b.mo10660j(new WeakReference(a), "/showValidatorOverlay", io1.f8733a);
        return (View) a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo8720b(eu0 eu0, Map map) {
        this.f9583b.mo10657g("sendMessageToNativeJs", map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo8721c(WindowManager windowManager, View view, eu0 eu0, Map map) {
        io0.m11126b("Hide native ad policy validator overlay.");
        eu0.mo7105Y().setVisibility(8);
        if (eu0.mo7105Y().getWindowToken() != null) {
            windowManager.removeView(eu0.mo7105Y());
        }
        eu0.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.f9584c != null && viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this.f9584c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo8722d(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.f9583b.mo10657g("sendMessageToNativeJs", hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo8723e(View view, WindowManager windowManager, eu0 eu0, Map map) {
        eu0.mo7077D0().mo9048f1(new jo1(this, map));
        if (map != null) {
            Context context = view.getContext();
            int f = m12275f(context, (String) map.get("validator_width"), ((Integer) C2199sw.m17001c().mo8579b(m10.f10375R5)).intValue());
            int f2 = m12275f(context, (String) map.get("validator_height"), ((Integer) C2199sw.m17001c().mo8579b(m10.f10383S5)).intValue());
            int f3 = m12275f(context, (String) map.get("validator_x"), 0);
            int f4 = m12275f(context, (String) map.get("validator_y"), 0);
            eu0.mo7115g0(vv0.m18687b(f, f2));
            try {
                eu0.mo7150w().getSettings().setUseWideViewPort(((Boolean) C2199sw.m17001c().mo8579b(m10.f10391T5)).booleanValue());
                eu0.mo7150w().getSettings().setLoadWithOverviewMode(((Boolean) C2199sw.m17001c().mo8579b(m10.f10399U5)).booleanValue());
            } catch (NullPointerException unused) {
            }
            WindowManager.LayoutParams b = C3154e1.m23865b();
            b.x = f3;
            b.y = f4;
            windowManager.updateViewLayout(eu0.mo7105Y(), b);
            String str = (String) map.get("orientation");
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                this.f9584c = new eo1(view, eu0, str, b, (("1".equals(str) || "2".equals(str)) ? rect.bottom : rect.top) - f4, windowManager);
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnScrollChangedListener(this.f9584c);
                }
            }
            String str2 = (String) map.get("overlay_url");
            if (!TextUtils.isEmpty(str2)) {
                eu0.loadUrl(str2);
            }
        }
    }
}
