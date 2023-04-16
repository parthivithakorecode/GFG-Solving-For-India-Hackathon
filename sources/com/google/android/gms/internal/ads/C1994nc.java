package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.nc */
public final class C1994nc implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: r */
    private static final Handler f11399r = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    private final Context f11400f;

    /* renamed from: g */
    private Application f11401g;

    /* renamed from: h */
    private final PowerManager f11402h;

    /* renamed from: i */
    private final KeyguardManager f11403i;

    /* renamed from: j */
    private BroadcastReceiver f11404j;

    /* renamed from: k */
    private final C2438zb f11405k;

    /* renamed from: l */
    private WeakReference<ViewTreeObserver> f11406l;

    /* renamed from: m */
    private WeakReference<View> f11407m;

    /* renamed from: n */
    private C2327wb f11408n;

    /* renamed from: o */
    private byte f11409o = -1;

    /* renamed from: p */
    private int f11410p = -1;

    /* renamed from: q */
    private long f11411q = -3;

    public C1994nc(Context context, C2438zb zbVar) {
        Context applicationContext = context.getApplicationContext();
        this.f11400f = applicationContext;
        this.f11405k = zbVar;
        this.f11402h = (PowerManager) applicationContext.getSystemService("power");
        this.f11403i = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f11401g = application;
            this.f11408n = new C2327wb(application, this);
        }
        mo9494d((View) null);
    }

    /* renamed from: e */
    private final void m13845e(Activity activity, int i) {
        Window window;
        if (this.f11407m != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View b = mo9493b();
            if (b != null && peekDecorView != null && b.getRootView() == peekDecorView.getRootView()) {
                this.f11410p = i;
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005c, code lost:
        if ((r5.flags & 524288) != 0) goto L_0x0060;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m13846f() {
        /*
            r7 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r7.f11407m
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.view.View r0 = r7.mo9493b()
            r1 = -1
            r2 = -3
            if (r0 != 0) goto L_0x0013
            r7.f11411q = r2
            r7.f11409o = r1
            return
        L_0x0013:
            int r4 = r0.getVisibility()
            if (r4 == 0) goto L_0x001b
            r4 = 1
            goto L_0x001c
        L_0x001b:
            r4 = 0
        L_0x001c:
            boolean r5 = r0.isShown()
            if (r5 != 0) goto L_0x0024
            r4 = r4 | 2
        L_0x0024:
            android.os.PowerManager r5 = r7.f11402h
            if (r5 == 0) goto L_0x0030
            boolean r5 = r5.isScreenOn()
            if (r5 != 0) goto L_0x0030
            r4 = r4 | 4
        L_0x0030:
            com.google.android.gms.internal.ads.zb r5 = r7.f11405k
            boolean r5 = r5.mo12197a()
            if (r5 != 0) goto L_0x0060
            android.app.KeyguardManager r5 = r7.f11403i
            if (r5 == 0) goto L_0x005e
            boolean r5 = r5.inKeyguardRestrictedInputMode()
            if (r5 == 0) goto L_0x005e
            android.app.Activity r5 = com.google.android.gms.internal.ads.C1846jc.m11552b(r0)
            if (r5 != 0) goto L_0x0049
            goto L_0x005e
        L_0x0049:
            android.view.Window r5 = r5.getWindow()
            if (r5 != 0) goto L_0x0051
            r5 = 0
            goto L_0x0055
        L_0x0051:
            android.view.WindowManager$LayoutParams r5 = r5.getAttributes()
        L_0x0055:
            if (r5 == 0) goto L_0x005e
            int r5 = r5.flags
            r6 = 524288(0x80000, float:7.34684E-40)
            r5 = r5 & r6
            if (r5 != 0) goto L_0x0060
        L_0x005e:
            r4 = r4 | 8
        L_0x0060:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getGlobalVisibleRect(r5)
            if (r5 != 0) goto L_0x006d
            r4 = r4 | 16
        L_0x006d:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getLocalVisibleRect(r5)
            if (r5 != 0) goto L_0x007a
            r4 = r4 | 32
        L_0x007a:
            int r0 = r0.getWindowVisibility()
            int r5 = r7.f11410p
            if (r5 == r1) goto L_0x0083
            r0 = r5
        L_0x0083:
            if (r0 == 0) goto L_0x0087
            r4 = r4 | 64
        L_0x0087:
            byte r0 = r7.f11409o
            if (r0 == r4) goto L_0x009a
            byte r0 = (byte) r4
            r7.f11409o = r0
            if (r4 != 0) goto L_0x0095
            long r0 = android.os.SystemClock.elapsedRealtime()
            goto L_0x0098
        L_0x0095:
            long r0 = (long) r4
            long r0 = r2 - r0
        L_0x0098:
            r7.f11411q = r0
        L_0x009a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1994nc.m13846f():void");
    }

    /* renamed from: g */
    private final void m13847g() {
        f11399r.post(new C1920lc(this));
    }

    /* renamed from: h */
    private final void m13848h(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f11406l = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f11404j == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            C1957mc mcVar = new C1957mc(this);
            this.f11404j = mcVar;
            this.f11400f.registerReceiver(mcVar, intentFilter);
        }
        Application application = this.f11401g;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f11408n);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001b */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025 A[Catch:{ Exception -> 0x002b }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002f A[SYNTHETIC, Splitter:B:17:0x002f] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003a A[SYNTHETIC, Splitter:B:23:0x003a] */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m13849i(android.view.View r4) {
        /*
            r3 = this;
            r0 = 0
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r3.f11406l     // Catch:{ Exception -> 0x001b }
            if (r1 == 0) goto L_0x001b
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x001b }
            android.view.ViewTreeObserver r1 = (android.view.ViewTreeObserver) r1     // Catch:{ Exception -> 0x001b }
            if (r1 == 0) goto L_0x0019
            boolean r2 = r1.isAlive()     // Catch:{ Exception -> 0x001b }
            if (r2 == 0) goto L_0x0019
            r1.removeOnScrollChangedListener(r3)     // Catch:{ Exception -> 0x001b }
            r1.removeGlobalOnLayoutListener(r3)     // Catch:{ Exception -> 0x001b }
        L_0x0019:
            r3.f11406l = r0     // Catch:{ Exception -> 0x001b }
        L_0x001b:
            android.view.ViewTreeObserver r4 = r4.getViewTreeObserver()     // Catch:{ Exception -> 0x002b }
            boolean r1 = r4.isAlive()     // Catch:{ Exception -> 0x002b }
            if (r1 == 0) goto L_0x002b
            r4.removeOnScrollChangedListener(r3)     // Catch:{ Exception -> 0x002b }
            r4.removeGlobalOnLayoutListener(r3)     // Catch:{ Exception -> 0x002b }
        L_0x002b:
            android.content.BroadcastReceiver r4 = r3.f11404j
            if (r4 == 0) goto L_0x0036
            android.content.Context r1 = r3.f11400f     // Catch:{ Exception -> 0x0034 }
            r1.unregisterReceiver(r4)     // Catch:{ Exception -> 0x0034 }
        L_0x0034:
            r3.f11404j = r0
        L_0x0036:
            android.app.Application r4 = r3.f11401g
            if (r4 == 0) goto L_0x003f
            com.google.android.gms.internal.ads.wb r0 = r3.f11408n     // Catch:{ Exception -> 0x003f }
            r4.unregisterActivityLifecycleCallbacks(r0)     // Catch:{ Exception -> 0x003f }
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1994nc.m13849i(android.view.View):void");
    }

    /* renamed from: a */
    public final long mo9492a() {
        if (this.f11411q <= -2 && mo9493b() == null) {
            this.f11411q = -3;
        }
        return this.f11411q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final View mo9493b() {
        WeakReference<View> weakReference = this.f11407m;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo9494d(View view) {
        long j;
        View b = mo9493b();
        if (b != null) {
            b.removeOnAttachStateChangeListener(this);
            m13849i(b);
        }
        this.f11407m = new WeakReference<>(view);
        if (view != null) {
            if (!(view.getWindowToken() == null && view.getWindowVisibility() == 8)) {
                m13848h(view);
            }
            view.addOnAttachStateChangeListener(this);
            j = -2;
        } else {
            j = -3;
        }
        this.f11411q = j;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m13845e(activity, 0);
        m13846f();
    }

    public final void onActivityDestroyed(Activity activity) {
        m13846f();
    }

    public final void onActivityPaused(Activity activity) {
        m13845e(activity, 4);
        m13846f();
    }

    public final void onActivityResumed(Activity activity) {
        m13845e(activity, 0);
        m13846f();
        m13847g();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m13846f();
    }

    public final void onActivityStarted(Activity activity) {
        m13845e(activity, 0);
        m13846f();
    }

    public final void onActivityStopped(Activity activity) {
        m13846f();
    }

    public final void onGlobalLayout() {
        m13846f();
    }

    public final void onScrollChanged() {
        m13846f();
    }

    public final void onViewAttachedToWindow(View view) {
        this.f11410p = -1;
        m13848h(view);
        m13846f();
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f11410p = -1;
        m13846f();
        m13847g();
        m13849i(view);
    }
}
