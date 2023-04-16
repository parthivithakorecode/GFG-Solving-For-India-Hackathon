package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;
import p048g2.C2635a;
import p048g2.C2637b;
import p054h1.C2694t;

public final class mn1 extends p40 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, mo1 {

    /* renamed from: s */
    public static final e73<String> f10962s = e73.m8350y("2011", "1009", "3010");

    /* renamed from: f */
    private final String f10963f;
    @GuardedBy("this")

    /* renamed from: g */
    private Map<String, WeakReference<View>> f10964g = new HashMap();

    /* renamed from: h */
    private FrameLayout f10965h;

    /* renamed from: i */
    private FrameLayout f10966i;

    /* renamed from: j */
    private final dc3 f10967j;

    /* renamed from: k */
    private View f10968k;

    /* renamed from: l */
    private final int f10969l;
    @GuardedBy("this")

    /* renamed from: m */
    private mm1 f10970m;

    /* renamed from: n */
    private C1524ao f10971n;

    /* renamed from: o */
    private C2635a f10972o = null;

    /* renamed from: p */
    private k40 f10973p;

    /* renamed from: q */
    private boolean f10974q;

    /* renamed from: r */
    private boolean f10975r = false;

    public mn1(FrameLayout frameLayout, FrameLayout frameLayout2, int i) {
        this.f10965h = frameLayout;
        this.f10966i = frameLayout2;
        this.f10969l = 214106000;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        String str = "3012";
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
        }
        this.f10963f = str;
        C2694t.m21616y();
        jp0.m11762a(frameLayout, this);
        C2694t.m21616y();
        jp0.m11763b(frameLayout, this);
        this.f10967j = wo0.f16890e;
        this.f10971n = new C1524ao(this.f10965h.getContext(), this.f10965h);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    /* renamed from: q */
    private final synchronized void m13397q() {
        this.f10967j.execute(new ln1(this));
    }

    /* renamed from: z5 */
    private final synchronized void m13398z5(String str) {
        DisplayMetrics displayMetrics;
        FrameLayout frameLayout = new FrameLayout(this.f10966i.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = this.f10966i.getContext();
        frameLayout.setClickable(false);
        frameLayout.setFocusable(false);
        if (!TextUtils.isEmpty(str)) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            Resources resources = context.getResources();
            if (!(resources == null || (displayMetrics = resources.getDisplayMetrics()) == null)) {
                try {
                    byte[] decode = Base64.decode(str, 0);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(decode, 0, decode.length));
                    bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                    Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                    bitmapDrawable.setTileModeXY(tileMode, tileMode);
                    frameLayout.setBackground(bitmapDrawable);
                } catch (IllegalArgumentException e) {
                    io0.m11132h("Encountered invalid base64 watermark.", e);
                }
            }
        }
        this.f10966i.addView(frameLayout);
    }

    /* renamed from: T4 */
    public final synchronized void mo9321T4(C2635a aVar) {
        if (!this.f10975r) {
            this.f10972o = aVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006e, code lost:
        return;
     */
    /* renamed from: V0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo9322V0(p048g2.C2635a r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f10975r     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            java.lang.Object r2 = p048g2.C2637b.m21357C0(r2)     // Catch:{ all -> 0x006f }
            boolean r0 = r2 instanceof com.google.android.gms.internal.ads.mm1     // Catch:{ all -> 0x006f }
            if (r0 != 0) goto L_0x0016
            java.lang.String r2 = "Not an instance of native engine. This is most likely a transient error"
            com.google.android.gms.internal.ads.io0.m11131g(r2)     // Catch:{ all -> 0x006f }
            monitor-exit(r1)
            return
        L_0x0016:
            com.google.android.gms.internal.ads.mm1 r0 = r1.f10970m     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x001d
            r0.mo9310s(r1)     // Catch:{ all -> 0x006f }
        L_0x001d:
            r1.m13397q()     // Catch:{ all -> 0x006f }
            com.google.android.gms.internal.ads.mm1 r2 = (com.google.android.gms.internal.ads.mm1) r2     // Catch:{ all -> 0x006f }
            r1.f10970m = r2     // Catch:{ all -> 0x006f }
            r2.mo9309r(r1)     // Catch:{ all -> 0x006f }
            com.google.android.gms.internal.ads.mm1 r2 = r1.f10970m     // Catch:{ all -> 0x006f }
            android.widget.FrameLayout r0 = r1.f10965h     // Catch:{ all -> 0x006f }
            r2.mo9301j(r0)     // Catch:{ all -> 0x006f }
            com.google.android.gms.internal.ads.mm1 r2 = r1.f10970m     // Catch:{ all -> 0x006f }
            android.widget.FrameLayout r0 = r1.f10966i     // Catch:{ all -> 0x006f }
            r2.mo9287H(r0)     // Catch:{ all -> 0x006f }
            boolean r2 = r1.f10974q     // Catch:{ all -> 0x006f }
            if (r2 == 0) goto L_0x0044
            com.google.android.gms.internal.ads.mm1 r2 = r1.f10970m     // Catch:{ all -> 0x006f }
            com.google.android.gms.internal.ads.om1 r2 = r2.mo9283A()     // Catch:{ all -> 0x006f }
            com.google.android.gms.internal.ads.k40 r0 = r1.f10973p     // Catch:{ all -> 0x006f }
            r2.mo9797b(r0)     // Catch:{ all -> 0x006f }
        L_0x0044:
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r2 = com.google.android.gms.internal.ads.m10.f10654y2     // Catch:{ all -> 0x006f }
            com.google.android.gms.internal.ads.k10 r0 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ all -> 0x006f }
            java.lang.Object r2 = r0.mo8579b(r2)     // Catch:{ all -> 0x006f }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x006f }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x006f }
            if (r2 == 0) goto L_0x006d
            com.google.android.gms.internal.ads.mm1 r2 = r1.f10970m     // Catch:{ all -> 0x006f }
            java.lang.String r2 = r2.mo9284C()     // Catch:{ all -> 0x006f }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x006f }
            if (r2 != 0) goto L_0x006d
            com.google.android.gms.internal.ads.mm1 r2 = r1.f10970m     // Catch:{ all -> 0x006f }
            java.lang.String r2 = r2.mo9284C()     // Catch:{ all -> 0x006f }
            r1.m13398z5(r2)     // Catch:{ all -> 0x006f }
            monitor-exit(r1)
            return
        L_0x006d:
            monitor-exit(r1)
            return
        L_0x006f:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mn1.mo9322V0(g2.a):void");
    }

    /* renamed from: W1 */
    public final synchronized void mo9323W1(C2635a aVar) {
        this.f10970m.mo9304m((View) C2637b.m21357C0(aVar));
    }

    /* renamed from: a5 */
    public final synchronized void mo9324a5(String str, C2635a aVar) {
        mo8701b3(str, (View) C2637b.m21357C0(aVar), true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0040, code lost:
        return;
     */
    /* renamed from: b3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo8701b3(java.lang.String r2, android.view.View r3, boolean r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r4 = r1.f10975r     // Catch:{ all -> 0x0041 }
            if (r4 == 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            if (r3 != 0) goto L_0x0010
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r1.f10964g     // Catch:{ all -> 0x0041 }
            r3.remove(r2)     // Catch:{ all -> 0x0041 }
            monitor-exit(r1)
            return
        L_0x0010:
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r1.f10964g     // Catch:{ all -> 0x0041 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0041 }
            r0.<init>(r3)     // Catch:{ all -> 0x0041 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0041 }
            java.lang.String r4 = "1098"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0041 }
            if (r4 != 0) goto L_0x003f
            java.lang.String r4 = "3011"
            boolean r2 = r4.equals(r2)     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x002b
            goto L_0x003f
        L_0x002b:
            int r2 = r1.f10969l     // Catch:{ all -> 0x0041 }
            boolean r2 = p069j1.C3154e1.m23872i(r2)     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x0036
            r3.setOnTouchListener(r1)     // Catch:{ all -> 0x0041 }
        L_0x0036:
            r2 = 1
            r3.setClickable(r2)     // Catch:{ all -> 0x0041 }
            r3.setOnClickListener(r1)     // Catch:{ all -> 0x0041 }
            monitor-exit(r1)
            return
        L_0x003f:
            monitor-exit(r1)
            return
        L_0x0041:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mn1.mo8701b3(java.lang.String, android.view.View, boolean):void");
    }

    /* renamed from: c */
    public final synchronized void mo9325c() {
        if (!this.f10975r) {
            mm1 mm1 = this.f10970m;
            if (mm1 != null) {
                mm1.mo9310s(this);
                this.f10970m = null;
            }
            this.f10964g.clear();
            this.f10965h.removeAllViews();
            this.f10966i.removeAllViews();
            this.f10964g = null;
            this.f10965h = null;
            this.f10966i = null;
            this.f10968k = null;
            this.f10971n = null;
            this.f10975r = true;
        }
    }

    /* renamed from: d */
    public final /* synthetic */ View mo8702d() {
        return this.f10965h;
    }

    /* renamed from: e0 */
    public final void mo9326e0(C2635a aVar) {
        onTouch(this.f10965h, (MotionEvent) C2637b.m21357C0(aVar));
    }

    /* renamed from: f */
    public final FrameLayout mo8703f() {
        return this.f10966i;
    }

    /* renamed from: h */
    public final C1524ao mo8705h() {
        return this.f10971n;
    }

    /* renamed from: i */
    public final C2635a mo8706i() {
        return this.f10972o;
    }

    /* renamed from: j */
    public final synchronized String mo8707j() {
        return this.f10963f;
    }

    /* renamed from: k */
    public final synchronized Map<String, WeakReference<View>> mo8708k() {
        return this.f10964g;
    }

    /* renamed from: l */
    public final synchronized JSONObject mo8709l() {
        mm1 mm1 = this.f10970m;
        if (mm1 == null) {
            return null;
        }
        return mm1.mo9286F(this.f10965h, mo8708k(), mo8713o());
    }

    /* renamed from: m */
    public final synchronized Map<String, WeakReference<View>> mo8710m() {
        return null;
    }

    /* renamed from: n */
    public final synchronized JSONObject mo8711n() {
        mm1 mm1 = this.f10970m;
        if (mm1 == null) {
            return null;
        }
        return mm1.mo9285E(this.f10965h, mo8708k(), mo8713o());
    }

    /* renamed from: n0 */
    public final synchronized View mo8712n0(String str) {
        if (this.f10975r) {
            return null;
        }
        WeakReference weakReference = this.f10964g.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    /* renamed from: o */
    public final synchronized Map<String, WeakReference<View>> mo8713o() {
        return this.f10964g;
    }

    public final synchronized void onClick(View view) {
        mm1 mm1 = this.f10970m;
        if (mm1 != null) {
            mm1.mo9288I();
            this.f10970m.mo9296Q(view, this.f10965h, mo8708k(), mo8713o(), false);
        }
    }

    public final synchronized void onGlobalLayout() {
        mm1 mm1 = this.f10970m;
        if (mm1 != null) {
            mm1.mo9294O(this.f10965h, mo8708k(), mo8713o(), mm1.m13354w(this.f10965h));
        }
    }

    public final synchronized void onScrollChanged() {
        mm1 mm1 = this.f10970m;
        if (mm1 != null) {
            mm1.mo9294O(this.f10965h, mo8708k(), mo8713o(), mm1.m13354w(this.f10965h));
        }
    }

    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        mm1 mm1 = this.f10970m;
        if (mm1 != null) {
            mm1.mo9302k(view, motionEvent, this.f10965h);
        }
        return false;
    }

    /* renamed from: r4 */
    public final synchronized void mo9331r4(k40 k40) {
        if (!this.f10975r) {
            this.f10974q = true;
            this.f10973p = k40;
            mm1 mm1 = this.f10970m;
            if (mm1 != null) {
                mm1.mo9283A().mo9797b(k40);
            }
        }
    }

    /* renamed from: s */
    public final synchronized C2635a mo9332s(String str) {
        return C2637b.m21358Z2(mo8712n0(str));
    }

    /* renamed from: s2 */
    public final synchronized void mo9333s2(C2635a aVar, int i) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final /* synthetic */ void mo9334t() {
        if (this.f10968k == null) {
            View view = new View(this.f10965h.getContext());
            this.f10968k = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.f10965h != this.f10968k.getParent()) {
            this.f10965h.addView(this.f10968k);
        }
    }
}
