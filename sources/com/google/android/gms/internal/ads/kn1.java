package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;
import p048g2.C2635a;
import p048g2.C2637b;
import p054h1.C2694t;

@ParametersAreNonnullByDefault
public final class kn1 extends t40 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, mo1 {

    /* renamed from: f */
    private final WeakReference<View> f9575f;

    /* renamed from: g */
    private final Map<String, WeakReference<View>> f9576g = new HashMap();

    /* renamed from: h */
    private final Map<String, WeakReference<View>> f9577h = new HashMap();

    /* renamed from: i */
    private final Map<String, WeakReference<View>> f9578i = new HashMap();
    @GuardedBy("this")

    /* renamed from: j */
    private mm1 f9579j;

    /* renamed from: k */
    private C1524ao f9580k;

    public kn1(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        C2694t.m21616y();
        jp0.m11762a(view, this);
        C2694t.m21616y();
        jp0.m11763b(view, this);
        this.f9575f = new WeakReference<>(view);
        for (Map.Entry next : hashMap.entrySet()) {
            String str = (String) next.getKey();
            View view2 = (View) next.getValue();
            if (view2 != null) {
                this.f9576g.put(str, new WeakReference(view2));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.f9578i.putAll(this.f9576g);
        for (Map.Entry next2 : hashMap2.entrySet()) {
            View view3 = (View) next2.getValue();
            if (view3 != null) {
                this.f9577h.put((String) next2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.f9578i.putAll(this.f9577h);
        this.f9580k = new C1524ao(view.getContext(), view);
    }

    /* renamed from: R4 */
    public final synchronized void mo8700R4(C2635a aVar) {
        Object C0 = C2637b.m21357C0(aVar);
        if (!(C0 instanceof mm1)) {
            io0.m11131g("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        mm1 mm1 = this.f9579j;
        if (mm1 != null) {
            mm1.mo9310s(this);
        }
        mm1 mm12 = (mm1) C0;
        if (mm12.mo9311t()) {
            this.f9579j = mm12;
            mm12.mo9309r(this);
            this.f9579j.mo9301j(mo8702d());
            return;
        }
        io0.m11128d("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        return;
     */
    /* renamed from: b3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo8701b3(java.lang.String r2, android.view.View r3, boolean r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r1.f9578i     // Catch:{ all -> 0x0034 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0034 }
            r0.<init>(r3)     // Catch:{ all -> 0x0034 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0034 }
            java.lang.String r4 = "1098"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0034 }
            if (r4 != 0) goto L_0x0032
            java.lang.String r4 = "3011"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0034 }
            if (r4 == 0) goto L_0x001c
            goto L_0x0032
        L_0x001c:
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r1.f9576g     // Catch:{ all -> 0x0034 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0034 }
            r0.<init>(r3)     // Catch:{ all -> 0x0034 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0034 }
            r2 = 1
            r3.setClickable(r2)     // Catch:{ all -> 0x0034 }
            r3.setOnClickListener(r1)     // Catch:{ all -> 0x0034 }
            r3.setOnTouchListener(r1)     // Catch:{ all -> 0x0034 }
            monitor-exit(r1)
            return
        L_0x0032:
            monitor-exit(r1)
            return
        L_0x0034:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kn1.mo8701b3(java.lang.String, android.view.View, boolean):void");
    }

    /* renamed from: d */
    public final View mo8702d() {
        return (View) this.f9575f.get();
    }

    /* renamed from: f */
    public final FrameLayout mo8703f() {
        return null;
    }

    /* renamed from: g */
    public final synchronized void mo8704g() {
        mm1 mm1 = this.f9579j;
        if (mm1 != null) {
            mm1.mo9310s(this);
            this.f9579j = null;
        }
    }

    /* renamed from: h */
    public final C1524ao mo8705h() {
        return this.f9580k;
    }

    /* renamed from: i */
    public final synchronized C2635a mo8706i() {
        return null;
    }

    /* renamed from: j */
    public final synchronized String mo8707j() {
        return "1007";
    }

    /* renamed from: k */
    public final synchronized Map<String, WeakReference<View>> mo8708k() {
        return this.f9578i;
    }

    /* renamed from: l */
    public final synchronized JSONObject mo8709l() {
        mm1 mm1 = this.f9579j;
        if (mm1 == null) {
            return null;
        }
        return mm1.mo9286F(mo8702d(), mo8708k(), mo8713o());
    }

    /* renamed from: m */
    public final synchronized Map<String, WeakReference<View>> mo8710m() {
        return this.f9577h;
    }

    /* renamed from: n */
    public final synchronized JSONObject mo8711n() {
        return null;
    }

    /* renamed from: n0 */
    public final synchronized View mo8712n0(String str) {
        WeakReference weakReference = this.f9578i.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    /* renamed from: o */
    public final synchronized Map<String, WeakReference<View>> mo8713o() {
        return this.f9576g;
    }

    public final synchronized void onClick(View view) {
        mm1 mm1 = this.f9579j;
        if (mm1 != null) {
            mm1.mo9296Q(view, mo8702d(), mo8708k(), mo8713o(), true);
        }
    }

    public final synchronized void onGlobalLayout() {
        mm1 mm1 = this.f9579j;
        if (mm1 != null) {
            mm1.mo9294O(mo8702d(), mo8708k(), mo8713o(), mm1.m13354w(mo8702d()));
        }
    }

    public final synchronized void onScrollChanged() {
        mm1 mm1 = this.f9579j;
        if (mm1 != null) {
            mm1.mo9294O(mo8702d(), mo8708k(), mo8713o(), mm1.m13354w(mo8702d()));
        }
    }

    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        mm1 mm1 = this.f9579j;
        if (mm1 != null) {
            mm1.mo9302k(view, motionEvent, mo8702d());
        }
        return false;
    }

    /* renamed from: s0 */
    public final synchronized void mo8718s0(C2635a aVar) {
        if (this.f9579j != null) {
            Object C0 = C2637b.m21357C0(aVar);
            if (!(C0 instanceof View)) {
                io0.m11131g("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
            }
            this.f9579j.mo9304m((View) C0);
        }
    }
}
