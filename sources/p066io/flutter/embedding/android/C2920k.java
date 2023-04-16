package p066io.flutter.embedding.android;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import androidx.core.content.C0597a;
import androidx.core.util.C0738a;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.layout.DisplayFeature;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p005a4.C0128c;
import p015b4.C1312a;
import p022c4.C1440a;
import p064i4.C2854h;
import p066io.flutter.embedding.android.C2911g;
import p066io.flutter.embedding.android.C2937s;
import p066io.flutter.embedding.engine.C2961a;
import p066io.flutter.plugin.editing.C2984d;
import p066io.flutter.plugin.editing.C2986f;
import p066io.flutter.view.C3102c;
import p099n3.C3768b;
import p168y3.C4462a;
import p168y3.C4472b;
import p168y3.C4473c;

/* renamed from: io.flutter.embedding.android.k */
public class C2920k extends FrameLayout implements C1440a.C1443c, C2937s.C2944e {

    /* renamed from: A */
    private final C4472b f19717A;

    /* renamed from: B */
    private final C0738a<WindowLayoutInfo> f19718B;

    /* renamed from: f */
    private C2914h f19719f;

    /* renamed from: g */
    private C2917i f19720g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C2911g f19721h;

    /* renamed from: i */
    C4473c f19722i;

    /* renamed from: j */
    private C4473c f19723j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Set<C4472b> f19724k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f19725l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C2961a f19726m;

    /* renamed from: n */
    private final Set<C2926f> f19727n;

    /* renamed from: o */
    private C1440a f19728o;

    /* renamed from: p */
    private C2986f f19729p;

    /* renamed from: q */
    private C2984d f19730q;

    /* renamed from: r */
    private C1312a f19731r;

    /* renamed from: s */
    private C2937s f19732s;

    /* renamed from: t */
    private C2899a f19733t;

    /* renamed from: u */
    private C3102c f19734u;

    /* renamed from: v */
    private TextServicesManager f19735v;

    /* renamed from: w */
    private C2957z f19736w;

    /* renamed from: x */
    private final C4462a.C4471g f19737x;

    /* renamed from: y */
    private final C3102c.C3113k f19738y;

    /* renamed from: z */
    private final ContentObserver f19739z;

    /* renamed from: io.flutter.embedding.android.k$a */
    class C2921a implements C3102c.C3113k {
        C2921a() {
        }

        /* renamed from: a */
        public void mo13382a(boolean z, boolean z2) {
            C2920k.this.m22936A(z, z2);
        }
    }

    /* renamed from: io.flutter.embedding.android.k$b */
    class C2922b extends ContentObserver {
        C2922b(Handler handler) {
            super(handler);
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            super.onChange(z);
            if (C2920k.this.f19726m != null) {
                C3768b.m25592f("FlutterView", "System settings changed. Sending user settings to Flutter.");
                C2920k.this.mo13346C();
            }
        }
    }

    /* renamed from: io.flutter.embedding.android.k$c */
    class C2923c implements C4472b {
        C2923c() {
        }

        /* renamed from: c */
        public void mo13233c() {
            boolean unused = C2920k.this.f19725l = false;
            for (C4472b c : C2920k.this.f19724k) {
                c.mo13233c();
            }
        }

        /* renamed from: f */
        public void mo13234f() {
            boolean unused = C2920k.this.f19725l = true;
            for (C4472b f : C2920k.this.f19724k) {
                f.mo13234f();
            }
        }
    }

    /* renamed from: io.flutter.embedding.android.k$d */
    class C2924d implements C0738a<WindowLayoutInfo> {
        C2924d() {
        }

        /* renamed from: a */
        public void accept(WindowLayoutInfo windowLayoutInfo) {
            C2920k.this.setWindowInfoListenerDisplayFeatures(windowLayoutInfo);
        }
    }

    /* renamed from: io.flutter.embedding.android.k$e */
    class C2925e implements C4472b {

        /* renamed from: a */
        final /* synthetic */ C4462a f19744a;

        /* renamed from: b */
        final /* synthetic */ Runnable f19745b;

        C2925e(C4462a aVar, Runnable runnable) {
            this.f19744a = aVar;
            this.f19745b = runnable;
        }

        /* renamed from: c */
        public void mo13233c() {
        }

        /* renamed from: f */
        public void mo13234f() {
            this.f19744a.mo16108p(this);
            this.f19745b.run();
            C2920k kVar = C2920k.this;
            if (!(kVar.f19722i instanceof C2911g) && kVar.f19721h != null) {
                C2920k.this.f19721h.mo13324a();
            }
        }
    }

    /* renamed from: io.flutter.embedding.android.k$f */
    public interface C2926f {
        /* renamed from: a */
        void mo13231a();

        /* renamed from: b */
        void mo13232b(C2961a aVar);
    }

    /* renamed from: io.flutter.embedding.android.k$g */
    private enum C2927g {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    private C2920k(Context context, AttributeSet attributeSet, C2914h hVar) {
        super(context, attributeSet);
        this.f19724k = new HashSet();
        this.f19727n = new HashSet();
        this.f19737x = new C4462a.C4471g();
        this.f19738y = new C2921a();
        this.f19739z = new C2922b(new Handler(Looper.getMainLooper()));
        this.f19717A = new C2923c();
        this.f19718B = new C2924d();
        this.f19719f = hVar;
        this.f19722i = hVar;
        m22946v();
    }

    private C2920k(Context context, AttributeSet attributeSet, C2917i iVar) {
        super(context, attributeSet);
        this.f19724k = new HashSet();
        this.f19727n = new HashSet();
        this.f19737x = new C4462a.C4471g();
        this.f19738y = new C2921a();
        this.f19739z = new C2922b(new Handler(Looper.getMainLooper()));
        this.f19717A = new C2923c();
        this.f19718B = new C2924d();
        this.f19720g = iVar;
        this.f19722i = iVar;
        m22946v();
    }

    public C2920k(Context context, C2914h hVar) {
        this(context, (AttributeSet) null, hVar);
    }

    public C2920k(Context context, C2917i iVar) {
        this(context, (AttributeSet) null, iVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m22936A(boolean z, boolean z2) {
        boolean z3 = false;
        if (!this.f19726m.mo13485p().mo16105k() && !z && !z2) {
            z3 = true;
        }
        setWillNotDraw(z3);
    }

    /* renamed from: D */
    private void m22937D() {
        if (!mo13379w()) {
            C3768b.m25593g("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        this.f19737x.f22916a = getResources().getDisplayMetrics().density;
        this.f19737x.f22931p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f19726m.mo13485p().mo16110r(this.f19737x);
    }

    /* renamed from: o */
    private C2927g m22944o() {
        Context context = getContext();
        int i = context.getResources().getConfiguration().orientation;
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i == 2) {
            if (rotation == 1) {
                return C2927g.RIGHT;
            }
            if (rotation == 3) {
                return Build.VERSION.SDK_INT >= 23 ? C2927g.LEFT : C2927g.RIGHT;
            }
            if (rotation == 0 || rotation == 2) {
                return C2927g.BOTH;
            }
        }
        return C2927g.NONE;
    }

    @TargetApi(20)
    /* renamed from: t */
    private int m22945t(WindowInsets windowInsets) {
        if (((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    /* renamed from: v */
    private void m22946v() {
        View view;
        C3768b.m25592f("FlutterView", "Initializing FlutterView");
        if (this.f19719f != null) {
            C3768b.m25592f("FlutterView", "Internally using a FlutterSurfaceView.");
            view = this.f19719f;
        } else if (this.f19720g != null) {
            C3768b.m25592f("FlutterView", "Internally using a FlutterTextureView.");
            view = this.f19720g;
        } else {
            C3768b.m25592f("FlutterView", "Internally using a FlutterImageView.");
            view = this.f19721h;
        }
        addView(view);
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(4);
        }
    }

    /* renamed from: B */
    public void mo13345B(Runnable runnable) {
        C2911g gVar = this.f19721h;
        if (gVar == null) {
            C3768b.m25592f("FlutterView", "Tried to revert the image view, but no image view is used.");
            return;
        }
        C4473c cVar = this.f19723j;
        if (cVar == null) {
            C3768b.m25592f("FlutterView", "Tried to revert the image view, but no previous surface was used.");
            return;
        }
        this.f19722i = cVar;
        this.f19723j = null;
        C2961a aVar = this.f19726m;
        if (aVar == null) {
            gVar.mo13324a();
            runnable.run();
            return;
        }
        C4462a p = aVar.mo13485p();
        if (p == null) {
            this.f19721h.mo13324a();
            runnable.run();
            return;
        }
        this.f19722i.mo13326c(p);
        p.mo16101f(new C2925e(p, runnable));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (r3 != false) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13346C() {
        /*
            r6 = this;
            android.content.res.Resources r0 = r6.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r1 = 0
            r2 = 1
            r3 = 32
            if (r0 != r3) goto L_0x0014
            r0 = r2
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            if (r0 == 0) goto L_0x001a
            z3.m$b r0 = p174z3.C4584m.C4586b.dark
            goto L_0x001c
        L_0x001a:
            z3.m$b r0 = p174z3.C4584m.C4586b.light
        L_0x001c:
            android.view.textservice.TextServicesManager r3 = r6.f19735v
            if (r3 == 0) goto L_0x0040
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r4 < r5) goto L_0x003e
            java.util.List r3 = r3.getEnabledSpellCheckerInfos()
            java.util.stream.Stream r3 = r3.stream()
            io.flutter.embedding.android.j r4 = p066io.flutter.embedding.android.C2919j.f19716a
            boolean r3 = r3.anyMatch(r4)
            android.view.textservice.TextServicesManager r4 = r6.f19735v
            boolean r4 = r4.isSpellCheckerEnabled()
            if (r4 == 0) goto L_0x0040
            if (r3 == 0) goto L_0x0040
        L_0x003e:
            r3 = r2
            goto L_0x0041
        L_0x0040:
            r3 = r1
        L_0x0041:
            io.flutter.embedding.engine.a r4 = r6.f19726m
            z3.m r4 = r4.mo13487r()
            z3.m$a r4 = r4.mo16243a()
            android.content.res.Resources r5 = r6.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            float r5 = r5.fontScale
            z3.m$a r4 = r4.mo16248e(r5)
            z3.m$a r3 = r4.mo16246c(r3)
            android.content.Context r4 = r6.getContext()
            android.content.ContentResolver r4 = r4.getContentResolver()
            java.lang.String r5 = "show_password"
            int r4 = android.provider.Settings.System.getInt(r4, r5, r2)
            if (r4 != r2) goto L_0x006e
            r1 = r2
        L_0x006e:
            z3.m$a r1 = r3.mo16245b(r1)
            android.content.Context r2 = r6.getContext()
            boolean r2 = android.text.format.DateFormat.is24HourFormat(r2)
            z3.m$a r1 = r1.mo16249f(r2)
            z3.m$a r0 = r1.mo16247d(r0)
            r0.mo16244a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p066io.flutter.embedding.android.C2920k.mo13346C():void");
    }

    /* renamed from: a */
    public void mo13347a(KeyEvent keyEvent) {
        getRootView().dispatchKeyEvent(keyEvent);
    }

    public void autofill(SparseArray<AutofillValue> sparseArray) {
        this.f19729p.mo13606j(sparseArray);
    }

    @TargetApi(24)
    /* renamed from: b */
    public PointerIcon mo4855b(int i) {
        return PointerIcon.getSystemIcon(getContext(), i);
    }

    /* renamed from: c */
    public boolean mo13349c(KeyEvent keyEvent) {
        return this.f19729p.mo13612r(keyEvent);
    }

    public boolean checkInputConnectionProxy(View view) {
        C2961a aVar = this.f19726m;
        return aVar != null ? aVar.mo13483n().mo13701F(view) : super.checkInputConnectionProxy(view);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (mo13379w() && this.f19732s.mo13395a(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT > 19) {
            return super.fitSystemWindows(rect);
        }
        C4462a.C4471g gVar = this.f19737x;
        gVar.f22919d = rect.top;
        gVar.f22920e = rect.right;
        gVar.f22921f = 0;
        gVar.f22922g = rect.left;
        gVar.f22923h = 0;
        gVar.f22924i = 0;
        gVar.f22925j = rect.bottom;
        gVar.f22926k = 0;
        C3768b.m25592f("FlutterView", "Updating window insets (fitSystemWindows()):\nStatus bar insets: Top: " + this.f19737x.f22919d + ", Left: " + this.f19737x.f22922g + ", Right: " + this.f19737x.f22920e + "\nKeyboard insets: Bottom: " + this.f19737x.f22925j + ", Left: " + this.f19737x.f22926k + ", Right: " + this.f19737x.f22924i);
        m22937D();
        return true;
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        C3102c cVar = this.f19734u;
        if (cVar == null || !cVar.mo13932D()) {
            return null;
        }
        return this.f19734u;
    }

    public C2961a getAttachedFlutterEngine() {
        return this.f19726m;
    }

    public C0128c getBinaryMessenger() {
        return this.f19726m.mo13477h();
    }

    public C2911g getCurrentImageSurface() {
        return this.f19721h;
    }

    /* renamed from: j */
    public boolean mo13357j() {
        C2911g gVar = this.f19721h;
        if (gVar != null) {
            return gVar.mo13327d();
        }
        return false;
    }

    /* renamed from: k */
    public void mo13358k(C2926f fVar) {
        this.f19727n.add(fVar);
    }

    /* renamed from: l */
    public void mo13359l(C4472b bVar) {
        this.f19724k.add(bVar);
    }

    /* renamed from: m */
    public void mo13360m(C2911g gVar) {
        C2961a aVar = this.f19726m;
        if (aVar != null) {
            gVar.mo13326c(aVar.mo13485p());
        }
    }

    /* renamed from: n */
    public void mo13361n(C2961a aVar) {
        C3768b.m25592f("FlutterView", "Attaching to a FlutterEngine: " + aVar);
        if (mo13379w()) {
            if (aVar == this.f19726m) {
                C3768b.m25592f("FlutterView", "Already attached to this engine. Doing nothing.");
                return;
            } else {
                C3768b.m25592f("FlutterView", "Currently attached to a different engine. Detaching and then attaching to new engine.");
                mo13375s();
            }
        }
        this.f19726m = aVar;
        C4462a p = aVar.mo13485p();
        this.f19725l = p.mo16104j();
        this.f19722i.mo13326c(p);
        p.mo16101f(this.f19717A);
        if (Build.VERSION.SDK_INT >= 24) {
            this.f19728o = new C1440a(this, this.f19726m.mo13480k());
        }
        this.f19729p = new C2986f(this, this.f19726m.mo13490u(), this.f19726m.mo13483n());
        try {
            TextServicesManager textServicesManager = (TextServicesManager) getContext().getSystemService("textservices");
            this.f19735v = textServicesManager;
            this.f19730q = new C2984d(textServicesManager, this.f19726m.mo13488s());
        } catch (Exception unused) {
            C3768b.m25588b("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
        }
        this.f19731r = this.f19726m.mo13479j();
        this.f19732s = new C2937s(this);
        this.f19733t = new C2899a(this.f19726m.mo13485p(), false);
        C3102c cVar = new C3102c(this, aVar.mo13475f(), (AccessibilityManager) getContext().getSystemService("accessibility"), getContext().getContentResolver(), this.f19726m.mo13483n());
        this.f19734u = cVar;
        cVar.mo13938Y(this.f19738y);
        m22936A(this.f19734u.mo13932D(), this.f19734u.mo13933E());
        this.f19726m.mo13483n().mo13688a(this.f19734u);
        this.f19726m.mo13483n().mo13699D(this.f19726m.mo13485p());
        this.f19729p.mo13611q().restartInput(this);
        mo13346C();
        getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, this.f19739z);
        m22937D();
        aVar.mo13483n().mo13700E(this);
        for (C2926f b : this.f19727n) {
            b.mo13232b(aVar);
        }
        if (this.f19725l) {
            this.f19717A.mo13234f();
        }
    }

    @SuppressLint({"InlinedApi", "NewApi"})
    @TargetApi(20)
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i = Build.VERSION.SDK_INT;
        if (i == 29) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            C4462a.C4471g gVar = this.f19737x;
            gVar.f22927l = systemGestureInsets.top;
            gVar.f22928m = systemGestureInsets.right;
            gVar.f22929n = systemGestureInsets.bottom;
            gVar.f22930o = systemGestureInsets.left;
        }
        boolean z = true;
        int i2 = 0;
        boolean z2 = (getWindowSystemUiVisibility() & 4) == 0;
        if ((getWindowSystemUiVisibility() & 2) != 0) {
            z = false;
        }
        if (i >= 30) {
            if (z) {
                i2 = 0 | WindowInsets.Type.navigationBars();
            }
            if (z2) {
                i2 |= WindowInsets.Type.statusBars();
            }
            Insets insets = windowInsets.getInsets(i2);
            C4462a.C4471g gVar2 = this.f19737x;
            gVar2.f22919d = insets.top;
            gVar2.f22920e = insets.right;
            gVar2.f22921f = insets.bottom;
            gVar2.f22922g = insets.left;
            Insets insets2 = windowInsets.getInsets(WindowInsets.Type.ime());
            C4462a.C4471g gVar3 = this.f19737x;
            gVar3.f22923h = insets2.top;
            gVar3.f22924i = insets2.right;
            gVar3.f22925j = insets2.bottom;
            gVar3.f22926k = insets2.left;
            Insets insets3 = windowInsets.getInsets(WindowInsets.Type.systemGestures());
            C4462a.C4471g gVar4 = this.f19737x;
            gVar4.f22927l = insets3.top;
            gVar4.f22928m = insets3.right;
            gVar4.f22929n = insets3.bottom;
            gVar4.f22930o = insets3.left;
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                Insets waterfallInsets = displayCutout.getWaterfallInsets();
                C4462a.C4471g gVar5 = this.f19737x;
                gVar5.f22919d = Math.max(Math.max(gVar5.f22919d, waterfallInsets.top), displayCutout.getSafeInsetTop());
                C4462a.C4471g gVar6 = this.f19737x;
                gVar6.f22920e = Math.max(Math.max(gVar6.f22920e, waterfallInsets.right), displayCutout.getSafeInsetRight());
                C4462a.C4471g gVar7 = this.f19737x;
                gVar7.f22921f = Math.max(Math.max(gVar7.f22921f, waterfallInsets.bottom), displayCutout.getSafeInsetBottom());
                C4462a.C4471g gVar8 = this.f19737x;
                gVar8.f22922g = Math.max(Math.max(gVar8.f22922g, waterfallInsets.left), displayCutout.getSafeInsetLeft());
            }
        } else {
            C2927g gVar9 = C2927g.NONE;
            if (!z) {
                gVar9 = m22944o();
            }
            this.f19737x.f22919d = z2 ? windowInsets.getSystemWindowInsetTop() : 0;
            this.f19737x.f22920e = (gVar9 == C2927g.RIGHT || gVar9 == C2927g.BOTH) ? 0 : windowInsets.getSystemWindowInsetRight();
            this.f19737x.f22921f = (!z || m22945t(windowInsets) != 0) ? 0 : windowInsets.getSystemWindowInsetBottom();
            this.f19737x.f22922g = (gVar9 == C2927g.LEFT || gVar9 == C2927g.BOTH) ? 0 : windowInsets.getSystemWindowInsetLeft();
            C4462a.C4471g gVar10 = this.f19737x;
            gVar10.f22923h = 0;
            gVar10.f22924i = 0;
            gVar10.f22925j = m22945t(windowInsets);
            this.f19737x.f22926k = 0;
        }
        C3768b.m25592f("FlutterView", "Updating window insets (onApplyWindowInsets()):\nStatus bar insets: Top: " + this.f19737x.f22919d + ", Left: " + this.f19737x.f22922g + ", Right: " + this.f19737x.f22920e + "\nKeyboard insets: Bottom: " + this.f19737x.f22925j + ", Left: " + this.f19737x.f22926k + ", Right: " + this.f19737x.f22924i + "System Gesture Insets - Left: " + this.f19737x.f22930o + ", Top: " + this.f19737x.f22927l + ", Right: " + this.f19737x.f22928m + ", Bottom: " + this.f19737x.f22925j);
        m22937D();
        return onApplyWindowInsets;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f19736w = mo13374r();
        Activity e = C2854h.m22363e(getContext());
        C2957z zVar = this.f19736w;
        if (zVar != null && e != null) {
            zVar.mo13403a(e, C0597a.m2452g(getContext()), this.f19718B);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f19726m != null) {
            C3768b.m25592f("FlutterView", "Configuration changed. Sending locales and user settings to Flutter.");
            this.f19731r.mo4637d(configuration);
            mo13346C();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return !mo13379w() ? super.onCreateInputConnection(editorInfo) : this.f19729p.mo13609o(this, this.f19732s, editorInfo);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        C2957z zVar = this.f19736w;
        if (zVar != null) {
            zVar.mo13404b(this.f19718B);
        }
        this.f19736w = null;
        super.onDetachedFromWindow();
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (mo13379w() && this.f19733t.mo13236e(motionEvent)) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        return !mo13379w() ? super.onHoverEvent(motionEvent) : this.f19734u.mo13935J(motionEvent);
    }

    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        super.onProvideAutofillVirtualStructure(viewStructure, i);
        this.f19729p.mo13614z(viewStructure, i);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C3768b.m25592f("FlutterView", "Size changed. Sending Flutter new viewport metrics. FlutterView was " + i3 + " x " + i4 + ", it is now " + i + " x " + i2);
        C4462a.C4471g gVar = this.f19737x;
        gVar.f22917b = i;
        gVar.f22918c = i2;
        m22937D();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!mo13379w()) {
            return super.onTouchEvent(motionEvent);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            requestUnbufferedDispatch(motionEvent);
        }
        return this.f19733t.mo13237f(motionEvent);
    }

    /* renamed from: p */
    public void mo13372p() {
        this.f19722i.mo13325b();
        C2911g gVar = this.f19721h;
        if (gVar == null) {
            C2911g q = mo13373q();
            this.f19721h = q;
            addView(q);
        } else {
            gVar.mo13332j(getWidth(), getHeight());
        }
        this.f19723j = this.f19722i;
        C2911g gVar2 = this.f19721h;
        this.f19722i = gVar2;
        C2961a aVar = this.f19726m;
        if (aVar != null) {
            gVar2.mo13326c(aVar.mo13485p());
        }
    }

    /* renamed from: q */
    public C2911g mo13373q() {
        return new C2911g(getContext(), getWidth(), getHeight(), C2911g.C2913b.background);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public C2957z mo13374r() {
        try {
            return new C2957z(new WindowInfoTrackerCallbackAdapter(WindowInfoTracker.Companion.getOrCreate(getContext())));
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }

    /* renamed from: s */
    public void mo13375s() {
        C3768b.m25592f("FlutterView", "Detaching from a FlutterEngine: " + this.f19726m);
        if (!mo13379w()) {
            C3768b.m25592f("FlutterView", "FlutterView not attached to an engine. Not detaching.");
            return;
        }
        for (C2926f a : this.f19727n) {
            a.mo13231a();
        }
        getContext().getContentResolver().unregisterContentObserver(this.f19739z);
        this.f19726m.mo13483n().mo13706K();
        this.f19726m.mo13483n().mo13691d();
        this.f19734u.mo13937Q();
        this.f19734u = null;
        this.f19729p.mo13611q().restartInput(this);
        this.f19729p.mo13610p();
        this.f19732s.mo13396c();
        C2984d dVar = this.f19730q;
        if (dVar != null) {
            dVar.mo13596b();
        }
        C1440a aVar = this.f19728o;
        if (aVar != null) {
            aVar.mo4853c();
        }
        C4462a p = this.f19726m.mo13485p();
        this.f19725l = false;
        p.mo16108p(this.f19717A);
        p.mo16112t();
        p.mo16109q(false);
        C4473c cVar = this.f19723j;
        if (cVar != null && this.f19722i == this.f19721h) {
            this.f19722i = cVar;
        }
        this.f19722i.mo13324a();
        C2911g gVar = this.f19721h;
        if (gVar != null) {
            gVar.mo13328f();
            removeView(this.f19721h);
            this.f19721h = null;
        }
        this.f19723j = null;
        this.f19726m = null;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        C4473c cVar = this.f19722i;
        if (cVar instanceof C2914h) {
            ((C2914h) cVar).setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    @TargetApi(28)
    public void setWindowInfoListenerDisplayFeatures(WindowLayoutInfo windowLayoutInfo) {
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        List<DisplayFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        ArrayList arrayList = new ArrayList();
        for (DisplayFeature next : displayFeatures) {
            C3768b.m25592f("FlutterView", "WindowInfoTracker Display Feature reported with bounds = " + next.getBounds().toString() + " and type = " + next.getClass().getSimpleName());
            if (next instanceof FoldingFeature) {
                FoldingFeature foldingFeature = (FoldingFeature) next;
                arrayList.add(new C4462a.C4464b(next.getBounds(), foldingFeature.getOcclusionType() == FoldingFeature.OcclusionType.FULL ? C4462a.C4466d.HINGE : C4462a.C4466d.FOLD, foldingFeature.getState() == FoldingFeature.State.FLAT ? C4462a.C4465c.POSTURE_FLAT : foldingFeature.getState() == FoldingFeature.State.HALF_OPENED ? C4462a.C4465c.POSTURE_HALF_OPENED : C4462a.C4465c.UNKNOWN));
            } else {
                arrayList.add(new C4462a.C4464b(next.getBounds(), C4462a.C4466d.UNKNOWN, C4462a.C4465c.UNKNOWN));
            }
        }
        if (!(Build.VERSION.SDK_INT < 28 || (rootWindowInsets = getRootWindowInsets()) == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null)) {
            for (Rect next2 : displayCutout.getBoundingRects()) {
                C3768b.m25592f("FlutterView", "DisplayCutout area reported with bounds = " + next2.toString());
                arrayList.add(new C4462a.C4464b(next2, C4462a.C4466d.CUTOUT));
            }
        }
        this.f19737x.f22932q = arrayList;
        m22937D();
    }

    /* renamed from: u */
    public boolean mo13378u() {
        return this.f19725l;
    }

    /* renamed from: w */
    public boolean mo13379w() {
        C2961a aVar = this.f19726m;
        return aVar != null && aVar.mo13485p() == this.f19722i.getAttachedRenderer();
    }

    /* renamed from: y */
    public void mo13380y(C2926f fVar) {
        this.f19727n.remove(fVar);
    }

    /* renamed from: z */
    public void mo13381z(C4472b bVar) {
        this.f19724k.remove(bVar);
    }
}
