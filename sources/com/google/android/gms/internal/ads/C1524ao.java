package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import p054h1.C2694t;
import p069j1.C3162g1;
import p069j1.C3163g2;

@TargetApi(14)
/* renamed from: com.google.android.gms.internal.ads.ao */
public final class C1524ao implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: u */
    private static final long f4261u = ((Long) C2199sw.m17001c().mo8579b(m10.f10418X0)).longValue();

    /* renamed from: f */
    private final Context f4262f;

    /* renamed from: g */
    private Application f4263g;

    /* renamed from: h */
    private final WindowManager f4264h;

    /* renamed from: i */
    private final PowerManager f4265i;

    /* renamed from: j */
    private final KeyguardManager f4266j;

    /* renamed from: k */
    BroadcastReceiver f4267k;

    /* renamed from: l */
    private WeakReference<ViewTreeObserver> f4268l;

    /* renamed from: m */
    final WeakReference<View> f4269m;

    /* renamed from: n */
    private C1969mo f4270n;

    /* renamed from: o */
    private final C3162g1 f4271o = new C3162g1(f4261u);

    /* renamed from: p */
    private boolean f4272p = false;

    /* renamed from: q */
    private int f4273q = -1;

    /* renamed from: r */
    private final HashSet<C2450zn> f4274r = new HashSet<>();

    /* renamed from: s */
    private final DisplayMetrics f4275s;

    /* renamed from: t */
    private final Rect f4276t;

    public C1524ao(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.f4262f = applicationContext;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.f4264h = windowManager;
        this.f4265i = (PowerManager) applicationContext.getSystemService("power");
        this.f4266j = (KeyguardManager) context.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f4263g = application;
            this.f4270n = new C1969mo(application, this);
        }
        this.f4275s = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.f4276t = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference<View> weakReference = this.f4269m;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m6145m(view2);
        }
        this.f4269m = new WeakReference<>(view);
        if (view != null) {
            if (C2694t.m21609r().mo14004i(view)) {
                m6144l(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: h */
    private final int m6140h(int i) {
        return (int) (((float) i) / this.f4275s.density);
    }

    /* renamed from: i */
    private final void m6141i(Activity activity, int i) {
        Window window;
        if (this.f4269m != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View view = (View) this.f4269m.get();
            if (view != null && peekDecorView != null && view.getRootView() == peekDecorView.getRootView()) {
                this.f4273q = i;
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x010f, code lost:
        if (r11 == 0) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0125, code lost:
        if (r11 == 0) goto L_0x0127;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0192 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0193  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m6142j(int r33) {
        /*
            r32 = this;
            r1 = r32
            r2 = r33
            java.util.HashSet<com.google.android.gms.internal.ads.zn> r0 = r1.f4274r
            int r0 = r0.size()
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f4269m
            if (r0 != 0) goto L_0x0012
            return
        L_0x0012:
            java.lang.Object r0 = r0.get()
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r0 = 2
            int[] r8 = new int[r0]
            int[] r0 = new int[r0]
            r9 = 0
            r10 = 1
            r11 = 0
            if (r3 == 0) goto L_0x0069
            boolean r12 = r3.getGlobalVisibleRect(r5)
            boolean r13 = r3.getLocalVisibleRect(r6)
            r3.getHitRect(r7)
            r3.getLocationOnScreen(r8)     // Catch:{ Exception -> 0x0049 }
            r3.getLocationInWindow(r0)     // Catch:{ Exception -> 0x0049 }
            goto L_0x004f
        L_0x0049:
            r0 = move-exception
            java.lang.String r14 = "Failure getting view location."
            com.google.android.gms.internal.ads.io0.m11129e(r14, r0)
        L_0x004f:
            r0 = r8[r11]
            r4.left = r0
            r8 = r8[r10]
            r4.top = r8
            int r8 = r3.getWidth()
            int r0 = r0 + r8
            r4.right = r0
            int r0 = r4.top
            int r8 = r3.getHeight()
            int r0 = r0 + r8
            r4.bottom = r0
            r8 = r3
            goto L_0x006c
        L_0x0069:
            r8 = r9
            r12 = r11
            r13 = r12
        L_0x006c:
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.m10.f10443a1
            com.google.android.gms.internal.ads.k10 r14 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r0 = r14.mo8579b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00b8
            if (r8 == 0) goto L_0x00b8
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x00ae }
            r0.<init>()     // Catch:{ Exception -> 0x00ae }
            android.view.ViewParent r14 = r8.getParent()     // Catch:{ Exception -> 0x00ae }
        L_0x0089:
            boolean r15 = r14 instanceof android.view.View     // Catch:{ Exception -> 0x00ae }
            if (r15 == 0) goto L_0x00bc
            r15 = r14
            android.view.View r15 = (android.view.View) r15     // Catch:{ Exception -> 0x00ae }
            android.graphics.Rect r11 = new android.graphics.Rect     // Catch:{ Exception -> 0x00ae }
            r11.<init>()     // Catch:{ Exception -> 0x00ae }
            boolean r17 = r15.isScrollContainer()     // Catch:{ Exception -> 0x00ae }
            if (r17 == 0) goto L_0x00a8
            boolean r15 = r15.getGlobalVisibleRect(r11)     // Catch:{ Exception -> 0x00ae }
            if (r15 == 0) goto L_0x00a8
            android.graphics.Rect r11 = r1.mo5328a(r11)     // Catch:{ Exception -> 0x00ae }
            r0.add(r11)     // Catch:{ Exception -> 0x00ae }
        L_0x00a8:
            android.view.ViewParent r14 = r14.getParent()     // Catch:{ Exception -> 0x00ae }
            r11 = 0
            goto L_0x0089
        L_0x00ae:
            r0 = move-exception
            com.google.android.gms.internal.ads.tn0 r11 = p054h1.C2694t.m21607p()
            java.lang.String r14 = "PositionWatcher.getParentScrollViewRects"
            r11.mo11034s(r0, r14)
        L_0x00b8:
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x00bc:
            r31 = r0
            r0 = 8
            if (r8 == 0) goto L_0x00c7
            int r11 = r8.getWindowVisibility()
            goto L_0x00c8
        L_0x00c7:
            r11 = r0
        L_0x00c8:
            int r14 = r1.f4273q
            r15 = -1
            if (r14 == r15) goto L_0x00ce
            r11 = r14
        L_0x00ce:
            p054h1.C2694t.m21608q()
            long r26 = p069j1.C3163g2.m23918a(r8)
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r14 = com.google.android.gms.internal.ads.m10.f10458b7
            com.google.android.gms.internal.ads.k10 r15 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r14 = r15.mo8579b(r14)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x0112
            if (r3 == 0) goto L_0x012a
            p054h1.C2694t.m21608q()
            android.os.PowerManager r3 = r1.f4265i
            android.app.KeyguardManager r14 = r1.f4266j
            boolean r3 = p069j1.C3163g2.m23948x(r8, r3, r14)
            if (r3 == 0) goto L_0x012a
            if (r12 == 0) goto L_0x012a
            if (r13 == 0) goto L_0x012a
            com.google.android.gms.internal.ads.e10<java.lang.Integer> r3 = com.google.android.gms.internal.ads.m10.f10485e7
            com.google.android.gms.internal.ads.k10 r14 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r3 = r14.mo8579b(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            long r14 = (long) r3
            int r3 = (r26 > r14 ? 1 : (r26 == r14 ? 0 : -1))
            if (r3 < 0) goto L_0x012a
            if (r11 != 0) goto L_0x012a
            goto L_0x0127
        L_0x0112:
            if (r3 == 0) goto L_0x012a
            p054h1.C2694t.m21608q()
            android.os.PowerManager r3 = r1.f4265i
            android.app.KeyguardManager r14 = r1.f4266j
            boolean r3 = p069j1.C3163g2.m23948x(r8, r3, r14)
            if (r3 == 0) goto L_0x012a
            if (r12 == 0) goto L_0x012a
            if (r13 == 0) goto L_0x012a
            if (r11 != 0) goto L_0x012a
        L_0x0127:
            r3 = r10
            r11 = 0
            goto L_0x012b
        L_0x012a:
            r3 = 0
        L_0x012b:
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r14 = com.google.android.gms.internal.ads.m10.f10503g7
            com.google.android.gms.internal.ads.k10 r15 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r14 = r15.mo8579b(r14)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x0183
            p054h1.C2694t.m21608q()
            android.os.PowerManager r14 = r1.f4265i
            android.app.KeyguardManager r15 = r1.f4266j
            boolean r14 = p069j1.C3163g2.m23948x(r8, r14, r15)
            if (r10 == r14) goto L_0x014c
            r14 = 0
            goto L_0x014e
        L_0x014c:
            r14 = 64
        L_0x014e:
            if (r10 == r12) goto L_0x0152
            r15 = 0
            goto L_0x0153
        L_0x0152:
            r15 = r0
        L_0x0153:
            r14 = r14 | r15
            if (r10 == r13) goto L_0x0158
            r15 = 0
            goto L_0x015a
        L_0x0158:
            r15 = 16
        L_0x015a:
            r14 = r14 | r15
            if (r11 != 0) goto L_0x0160
            r11 = 128(0x80, float:1.794E-43)
            goto L_0x0161
        L_0x0160:
            r11 = 0
        L_0x0161:
            r11 = r11 | r14
            com.google.android.gms.internal.ads.e10<java.lang.Integer> r14 = com.google.android.gms.internal.ads.m10.f10485e7
            com.google.android.gms.internal.ads.k10 r15 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r14 = r15.mo8579b(r14)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            long r14 = (long) r14
            int r14 = (r26 > r14 ? 1 : (r26 == r14 ? 0 : -1))
            if (r14 < 0) goto L_0x017a
            r14 = 32
            goto L_0x017b
        L_0x017a:
            r14 = 0
        L_0x017b:
            p054h1.C2694t.m21608q()
            r11 = r11 | r14
            r11 = r11 | r3
            p069j1.C3163g2.m23938n(r8, r11, r9)
        L_0x0183:
            if (r2 != r10) goto L_0x0193
            j1.g1 r9 = r1.f4271o
            boolean r9 = r9.mo14020b()
            if (r9 != 0) goto L_0x0193
            boolean r9 = r1.f4272p
            if (r3 == r9) goto L_0x0192
            goto L_0x0193
        L_0x0192:
            return
        L_0x0193:
            if (r3 != 0) goto L_0x019d
            boolean r9 = r1.f4272p
            if (r9 != 0) goto L_0x019d
            if (r2 == r10) goto L_0x019c
            goto L_0x019d
        L_0x019c:
            return
        L_0x019d:
            com.google.android.gms.internal.ads.xn r2 = new com.google.android.gms.internal.ads.xn
            e2.d r9 = p054h1.C2694t.m21592a()
            long r17 = r9.mo12463b()
            android.os.PowerManager r9 = r1.f4265i
            boolean r9 = r9.isScreenOn()
            if (r8 == 0) goto L_0x01ba
            j1.f r11 = p054h1.C2694t.m21609r()
            boolean r11 = r11.mo14004i(r8)
            if (r11 == 0) goto L_0x01ba
            goto L_0x01bb
        L_0x01ba:
            r10 = 0
        L_0x01bb:
            if (r8 == 0) goto L_0x01c1
            int r0 = r8.getWindowVisibility()
        L_0x01c1:
            r19 = r0
            android.graphics.Rect r0 = r1.f4276t
            android.graphics.Rect r20 = r1.mo5328a(r0)
            android.graphics.Rect r21 = r1.mo5328a(r4)
            android.graphics.Rect r22 = r1.mo5328a(r5)
            android.graphics.Rect r24 = r1.mo5328a(r6)
            android.graphics.Rect r28 = r1.mo5328a(r7)
            android.util.DisplayMetrics r0 = r1.f4275s
            float r0 = r0.density
            r29 = r0
            r14 = r2
            r15 = r17
            r17 = r9
            r18 = r10
            r23 = r12
            r25 = r13
            r30 = r3
            r14.<init>(r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r29, r30, r31)
            java.util.HashSet<com.google.android.gms.internal.ads.zn> r0 = r1.f4274r
            java.util.Iterator r0 = r0.iterator()
        L_0x01f5:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0205
            java.lang.Object r4 = r0.next()
            com.google.android.gms.internal.ads.zn r4 = (com.google.android.gms.internal.ads.C2450zn) r4
            r4.mo5653m0(r2)
            goto L_0x01f5
        L_0x0205:
            r1.f4272p = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1524ao.m6142j(int):void");
    }

    /* renamed from: k */
    private final void m6143k() {
        C3163g2.f20465i.post(new C2301vn(this));
    }

    /* renamed from: l */
    private final void m6144l(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f4268l = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f4267k == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f4267k = new C2339wn(this);
            C2694t.m21614w().mo14055c(this.f4262f, this.f4267k, intentFilter);
        }
        Application application = this.f4263g;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f4270n);
            } catch (Exception e) {
                io0.m11129e("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    /* renamed from: m */
    private final void m6145m(View view) {
        try {
            WeakReference<ViewTreeObserver> weakReference = this.f4268l;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f4268l = null;
            }
        } catch (Exception e) {
            io0.m11129e("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
            io0.m11129e("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        if (this.f4267k != null) {
            try {
                C2694t.m21614w().mo14056d(this.f4262f, this.f4267k);
            } catch (IllegalStateException e3) {
                io0.m11129e("Failed trying to unregister the receiver", e3);
            } catch (Exception e4) {
                C2694t.m21607p().mo11034s(e4, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.f4267k = null;
        }
        Application application = this.f4263g;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f4270n);
            } catch (Exception e5) {
                io0.m11129e("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Rect mo5328a(Rect rect) {
        return new Rect(m6140h(rect.left), m6140h(rect.top), m6140h(rect.right), m6140h(rect.bottom));
    }

    /* renamed from: c */
    public final void mo5329c(C2450zn znVar) {
        this.f4274r.add(znVar);
        m6142j(3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo5330d() {
        m6142j(3);
    }

    /* renamed from: e */
    public final void mo5331e(C2450zn znVar) {
        this.f4274r.remove(znVar);
    }

    /* renamed from: f */
    public final void mo5332f() {
        this.f4271o.mo14019a(f4261u);
    }

    /* renamed from: g */
    public final void mo5333g(long j) {
        this.f4271o.mo14019a(j);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m6141i(activity, 0);
        m6142j(3);
        m6143k();
    }

    public final void onActivityDestroyed(Activity activity) {
        m6142j(3);
        m6143k();
    }

    public final void onActivityPaused(Activity activity) {
        m6141i(activity, 4);
        m6142j(3);
        m6143k();
    }

    public final void onActivityResumed(Activity activity) {
        m6141i(activity, 0);
        m6142j(3);
        m6143k();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m6142j(3);
        m6143k();
    }

    public final void onActivityStarted(Activity activity) {
        m6141i(activity, 0);
        m6142j(3);
        m6143k();
    }

    public final void onActivityStopped(Activity activity) {
        m6142j(3);
        m6143k();
    }

    public final void onGlobalLayout() {
        m6142j(2);
        m6143k();
    }

    public final void onScrollChanged() {
        m6142j(1);
    }

    public final void onViewAttachedToWindow(View view) {
        this.f4273q = -1;
        m6144l(view);
        m6142j(3);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f4273q = -1;
        m6142j(3);
        m6143k();
        m6145m(view);
    }
}
