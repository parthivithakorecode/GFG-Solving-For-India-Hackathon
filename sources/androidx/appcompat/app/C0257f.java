package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.C0299b;
import androidx.appcompat.view.C0302d;
import androidx.appcompat.view.C0305f;
import androidx.appcompat.view.C0307g;
import androidx.appcompat.view.C0312i;
import androidx.appcompat.view.menu.C0327e;
import androidx.appcompat.view.menu.C0330g;
import androidx.appcompat.view.menu.C0346m;
import androidx.appcompat.view.menu.C0348n;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0415a1;
import androidx.appcompat.widget.C0457g0;
import androidx.appcompat.widget.C0471j1;
import androidx.appcompat.widget.C0472k;
import androidx.appcompat.widget.C0474k0;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.core.app.C0539b;
import androidx.core.app.C0562i;
import androidx.core.content.C0597a;
import androidx.core.content.res.C0624h;
import androidx.core.util.C0740c;
import androidx.core.view.C0783e0;
import androidx.core.view.C0787f;
import androidx.core.view.C0789f0;
import androidx.core.view.C0790g;
import androidx.core.view.C0791g0;
import androidx.core.view.C0796i0;
import androidx.core.view.C0827s;
import androidx.core.view.C0833y;
import androidx.lifecycle.C1099i;
import androidx.lifecycle.C1110m;
import java.lang.Thread;
import java.util.List;
import p038f.C2582a;
import p038f.C2584c;
import p038f.C2587f;
import p038f.C2588g;
import p038f.C2590i;
import p038f.C2591j;
import p045g.C2620a;
import p102o.C3814g;

/* renamed from: androidx.appcompat.app.f */
class C0257f extends C0256e implements C0330g.C0331a, LayoutInflater.Factory2 {

    /* renamed from: g0 */
    private static final C3814g<String, Integer> f567g0 = new C3814g<>();

    /* renamed from: h0 */
    private static final boolean f568h0;

    /* renamed from: i0 */
    private static final int[] f569i0 = {16842836};

    /* renamed from: j0 */
    private static final boolean f570j0 = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: k0 */
    private static final boolean f571k0;

    /* renamed from: l0 */
    private static boolean f572l0 = true;

    /* renamed from: A */
    ViewGroup f573A;

    /* renamed from: B */
    private TextView f574B;

    /* renamed from: C */
    private View f575C;

    /* renamed from: D */
    private boolean f576D;

    /* renamed from: E */
    private boolean f577E;

    /* renamed from: F */
    boolean f578F;

    /* renamed from: G */
    boolean f579G;

    /* renamed from: H */
    boolean f580H;

    /* renamed from: I */
    boolean f581I;

    /* renamed from: J */
    boolean f582J;

    /* renamed from: K */
    private boolean f583K;

    /* renamed from: L */
    private C0281u[] f584L;

    /* renamed from: M */
    private C0281u f585M;

    /* renamed from: N */
    private boolean f586N;

    /* renamed from: O */
    private boolean f587O;

    /* renamed from: P */
    private boolean f588P;

    /* renamed from: Q */
    boolean f589Q;

    /* renamed from: R */
    private Configuration f590R;

    /* renamed from: S */
    private int f591S;

    /* renamed from: T */
    private int f592T;

    /* renamed from: U */
    private boolean f593U;

    /* renamed from: V */
    private boolean f594V;

    /* renamed from: W */
    private C0276q f595W;

    /* renamed from: X */
    private C0276q f596X;

    /* renamed from: Y */
    boolean f597Y;

    /* renamed from: Z */
    int f598Z;

    /* renamed from: a0 */
    private final Runnable f599a0;

    /* renamed from: b0 */
    private boolean f600b0;

    /* renamed from: c0 */
    private Rect f601c0;

    /* renamed from: d0 */
    private Rect f602d0;

    /* renamed from: e0 */
    private C0285i f603e0;

    /* renamed from: f0 */
    private C0287j f604f0;

    /* renamed from: i */
    final Object f605i;

    /* renamed from: j */
    final Context f606j;

    /* renamed from: k */
    Window f607k;

    /* renamed from: l */
    private C0274o f608l;

    /* renamed from: m */
    final C0255d f609m;

    /* renamed from: n */
    C0246a f610n;

    /* renamed from: o */
    MenuInflater f611o;

    /* renamed from: p */
    private CharSequence f612p;

    /* renamed from: q */
    private C0457g0 f613q;

    /* renamed from: r */
    private C0267i f614r;

    /* renamed from: s */
    private C0282v f615s;

    /* renamed from: t */
    C0299b f616t;

    /* renamed from: u */
    ActionBarContextView f617u;

    /* renamed from: v */
    PopupWindow f618v;

    /* renamed from: w */
    Runnable f619w;

    /* renamed from: x */
    C0783e0 f620x;

    /* renamed from: y */
    private boolean f621y;

    /* renamed from: z */
    private boolean f622z;

    /* renamed from: androidx.appcompat.app.f$a */
    class C0258a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a */
        final /* synthetic */ Thread.UncaughtExceptionHandler f623a;

        C0258a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f623a = uncaughtExceptionHandler;
        }

        /* renamed from: a */
        private boolean m911a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        public void uncaughtException(Thread thread, Throwable th) {
            if (m911a(th)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.f623a.uncaughtException(thread, notFoundException);
                return;
            }
            this.f623a.uncaughtException(thread, th);
        }
    }

    /* renamed from: androidx.appcompat.app.f$b */
    class C0259b implements Runnable {
        C0259b() {
        }

        public void run() {
            C0257f fVar = C0257f.this;
            if ((fVar.f598Z & 1) != 0) {
                fVar.mo695U(0);
            }
            C0257f fVar2 = C0257f.this;
            if ((fVar2.f598Z & 4096) != 0) {
                fVar2.mo695U(108);
            }
            C0257f fVar3 = C0257f.this;
            fVar3.f597Y = false;
            fVar3.f598Z = 0;
        }
    }

    /* renamed from: androidx.appcompat.app.f$c */
    class C0260c implements C0827s {
        C0260c() {
        }

        /* renamed from: a */
        public C0796i0 mo718a(View view, C0796i0 i0Var) {
            int k = i0Var.mo2882k();
            int L0 = C0257f.this.mo689L0(i0Var, (Rect) null);
            if (k != L0) {
                i0Var = i0Var.mo2885o(i0Var.mo2880i(), L0, i0Var.mo2881j(), i0Var.mo2878h());
            }
            return C0833y.m3321F(view, i0Var);
        }
    }

    /* renamed from: androidx.appcompat.app.f$d */
    class C0261d implements C0474k0.C0475a {
        C0261d() {
        }

        /* renamed from: a */
        public void mo719a(Rect rect) {
            rect.top = C0257f.this.mo689L0((C0796i0) null, rect);
        }
    }

    /* renamed from: androidx.appcompat.app.f$e */
    class C0262e implements ContentFrameLayout.C0369a {
        C0262e() {
        }

        /* renamed from: a */
        public void mo720a() {
        }

        public void onDetachedFromWindow() {
            C0257f.this.mo693S();
        }
    }

    /* renamed from: androidx.appcompat.app.f$f */
    class C0263f implements Runnable {

        /* renamed from: androidx.appcompat.app.f$f$a */
        class C0264a extends C0791g0 {
            C0264a() {
            }

            /* renamed from: b */
            public void mo723b(View view) {
                C0257f.this.f617u.setAlpha(1.0f);
                C0257f.this.f620x.mo2858h((C0789f0) null);
                C0257f.this.f620x = null;
            }

            /* renamed from: c */
            public void mo724c(View view) {
                C0257f.this.f617u.setVisibility(0);
            }
        }

        C0263f() {
        }

        public void run() {
            C0257f fVar = C0257f.this;
            fVar.f618v.showAtLocation(fVar.f617u, 55, 0, 0);
            C0257f.this.mo696V();
            if (C0257f.this.mo683D0()) {
                C0257f.this.f617u.setAlpha(0.0f);
                C0257f fVar2 = C0257f.this;
                fVar2.f620x = C0833y.m3346c(fVar2.f617u).mo2853b(1.0f);
                C0257f.this.f620x.mo2858h(new C0264a());
                return;
            }
            C0257f.this.f617u.setAlpha(1.0f);
            C0257f.this.f617u.setVisibility(0);
        }
    }

    /* renamed from: androidx.appcompat.app.f$g */
    class C0265g extends C0791g0 {
        C0265g() {
        }

        /* renamed from: b */
        public void mo723b(View view) {
            C0257f.this.f617u.setAlpha(1.0f);
            C0257f.this.f620x.mo2858h((C0789f0) null);
            C0257f.this.f620x = null;
        }

        /* renamed from: c */
        public void mo724c(View view) {
            C0257f.this.f617u.setVisibility(0);
            if (C0257f.this.f617u.getParent() instanceof View) {
                C0833y.m3327L((View) C0257f.this.f617u.getParent());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.f$h */
    interface C0266h {
        /* renamed from: a */
        boolean mo725a(int i);

        View onCreatePanelView(int i);
    }

    /* renamed from: androidx.appcompat.app.f$i */
    private final class C0267i implements C0346m.C0347a {
        C0267i() {
        }

        /* renamed from: b */
        public void mo727b(C0330g gVar, boolean z) {
            C0257f.this.mo688L(gVar);
        }

        /* renamed from: c */
        public boolean mo728c(C0330g gVar) {
            Window.Callback f0 = C0257f.this.mo703f0();
            if (f0 == null) {
                return true;
            }
            f0.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.f$j */
    class C0268j implements C0299b.C0300a {

        /* renamed from: a */
        private C0299b.C0300a f632a;

        /* renamed from: androidx.appcompat.app.f$j$a */
        class C0269a extends C0791g0 {
            C0269a() {
            }

            /* renamed from: b */
            public void mo723b(View view) {
                C0257f.this.f617u.setVisibility(8);
                C0257f fVar = C0257f.this;
                PopupWindow popupWindow = fVar.f618v;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (fVar.f617u.getParent() instanceof View) {
                    C0833y.m3327L((View) C0257f.this.f617u.getParent());
                }
                C0257f.this.f617u.mo1355k();
                C0257f.this.f620x.mo2858h((C0789f0) null);
                C0257f fVar2 = C0257f.this;
                fVar2.f620x = null;
                C0833y.m3327L(fVar2.f573A);
            }
        }

        public C0268j(C0299b.C0300a aVar) {
            this.f632a = aVar;
        }

        /* renamed from: a */
        public boolean mo729a(C0299b bVar, Menu menu) {
            C0833y.m3327L(C0257f.this.f573A);
            return this.f632a.mo729a(bVar, menu);
        }

        /* renamed from: b */
        public void mo730b(C0299b bVar) {
            this.f632a.mo730b(bVar);
            C0257f fVar = C0257f.this;
            if (fVar.f618v != null) {
                fVar.f607k.getDecorView().removeCallbacks(C0257f.this.f619w);
            }
            C0257f fVar2 = C0257f.this;
            if (fVar2.f617u != null) {
                fVar2.mo696V();
                C0257f fVar3 = C0257f.this;
                fVar3.f620x = C0833y.m3346c(fVar3.f617u).mo2853b(0.0f);
                C0257f.this.f620x.mo2858h(new C0269a());
            }
            C0257f fVar4 = C0257f.this;
            C0255d dVar = fVar4.f609m;
            if (dVar != null) {
                dVar.mo642e(fVar4.f616t);
            }
            C0257f fVar5 = C0257f.this;
            fVar5.f616t = null;
            C0833y.m3327L(fVar5.f573A);
        }

        /* renamed from: c */
        public boolean mo731c(C0299b bVar, MenuItem menuItem) {
            return this.f632a.mo731c(bVar, menuItem);
        }

        /* renamed from: d */
        public boolean mo732d(C0299b bVar, Menu menu) {
            return this.f632a.mo732d(bVar, menu);
        }
    }

    /* renamed from: androidx.appcompat.app.f$k */
    static class C0270k {
        /* renamed from: a */
        static Context m927a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        /* renamed from: b */
        static void m928b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.densityDpi;
            int i2 = configuration2.densityDpi;
            if (i != i2) {
                configuration3.densityDpi = i2;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.f$l */
    static class C0271l {
        /* renamed from: a */
        static boolean m929a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }

    /* renamed from: androidx.appcompat.app.f$m */
    static class C0272m {
        /* renamed from: a */
        static void m930a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.f$n */
    static class C0273n {
        /* renamed from: a */
        static void m931a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.colorMode & 3;
            int i2 = configuration2.colorMode;
            if (i != (i2 & 3)) {
                configuration3.colorMode |= i2 & 3;
            }
            int i3 = configuration.colorMode & 12;
            int i4 = configuration2.colorMode;
            if (i3 != (i4 & 12)) {
                configuration3.colorMode |= i4 & 12;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.f$o */
    class C0274o extends C0312i {

        /* renamed from: g */
        private C0266h f635g;

        /* renamed from: h */
        private boolean f636h;

        /* renamed from: i */
        private boolean f637i;

        /* renamed from: j */
        private boolean f638j;

        C0274o(Window.Callback callback) {
            super(callback);
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: b */
        public boolean mo733b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f637i = true;
                boolean dispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                this.f637i = false;
                return dispatchKeyEvent;
            } catch (Throwable th) {
                this.f637i = false;
                throw th;
            }
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: c */
        public void mo734c(Window.Callback callback) {
            try {
                this.f636h = true;
                callback.onContentChanged();
                this.f636h = false;
            } catch (Throwable th) {
                this.f636h = false;
                throw th;
            }
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: d */
        public void mo735d(Window.Callback callback, int i, Menu menu) {
            try {
                this.f638j = true;
                callback.onPanelClosed(i, menu);
                this.f638j = false;
            } catch (Throwable th) {
                this.f638j = false;
                throw th;
            }
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f637i ? mo883a().dispatchKeyEvent(keyEvent) : C0257f.this.mo694T(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || C0257f.this.mo710r0(keyEvent.getKeyCode(), keyEvent);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public final ActionMode mo738e(ActionMode.Callback callback) {
            C0305f.C0306a aVar = new C0305f.C0306a(C0257f.this.f606j, callback);
            C0299b F0 = C0257f.this.mo685F0(aVar);
            if (F0 != null) {
                return aVar.mo864e(F0);
            }
            return null;
        }

        public void onContentChanged() {
            if (this.f636h) {
                mo883a().onContentChanged();
            }
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0330g)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = r0.onCreatePanelView(r2);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View onCreatePanelView(int r2) {
            /*
                r1 = this;
                androidx.appcompat.app.f$h r0 = r1.f635g
                if (r0 == 0) goto L_0x000b
                android.view.View r0 = r0.onCreatePanelView(r2)
                if (r0 == 0) goto L_0x000b
                return r0
            L_0x000b:
                android.view.View r2 = super.onCreatePanelView(r2)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0257f.C0274o.onCreatePanelView(int):android.view.View");
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            C0257f.this.mo712u0(i);
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            if (this.f638j) {
                mo883a().onPanelClosed(i, menu);
                return;
            }
            super.onPanelClosed(i, menu);
            C0257f.this.mo713v0(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0330g gVar = menu instanceof C0330g ? (C0330g) menu : null;
            if (i == 0 && gVar == null) {
                return false;
            }
            boolean z = true;
            if (gVar != null) {
                gVar.mo1082a0(true);
            }
            C0266h hVar = this.f635g;
            if (hVar == null || !hVar.mo725a(i)) {
                z = false;
            }
            if (!z) {
                z = super.onPreparePanel(i, view, menu);
            }
            if (gVar != null) {
                gVar.mo1082a0(false);
            }
            return z;
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0330g gVar;
            C0281u d0 = C0257f.this.mo701d0(0, true);
            if (d0 == null || (gVar = d0.f657j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return C0257f.this.mo704m0() ? mo738e(callback) : super.onWindowStartingActionMode(callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (!C0257f.this.mo704m0() || i != 0) ? super.onWindowStartingActionMode(callback, i) : mo738e(callback);
        }
    }

    /* renamed from: androidx.appcompat.app.f$p */
    private class C0275p extends C0276q {

        /* renamed from: c */
        private final PowerManager f640c;

        C0275p(Context context) {
            super();
            this.f640c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public IntentFilter mo748b() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        /* renamed from: c */
        public int mo749c() {
            return (Build.VERSION.SDK_INT < 21 || !C0271l.m929a(this.f640c)) ? 1 : 2;
        }

        /* renamed from: d */
        public void mo750d() {
            C0257f.this.mo684F();
        }
    }

    /* renamed from: androidx.appcompat.app.f$q */
    abstract class C0276q {

        /* renamed from: a */
        private BroadcastReceiver f642a;

        /* renamed from: androidx.appcompat.app.f$q$a */
        class C0277a extends BroadcastReceiver {
            C0277a() {
            }

            public void onReceive(Context context, Intent intent) {
                C0276q.this.mo750d();
            }
        }

        C0276q() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo751a() {
            BroadcastReceiver broadcastReceiver = this.f642a;
            if (broadcastReceiver != null) {
                try {
                    C0257f.this.f606j.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f642a = null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract IntentFilter mo748b();

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract int mo749c();

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract void mo750d();

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo752e() {
            mo751a();
            IntentFilter b = mo748b();
            if (b != null && b.countActions() != 0) {
                if (this.f642a == null) {
                    this.f642a = new C0277a();
                }
                C0257f.this.f606j.registerReceiver(this.f642a, b);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.f$r */
    private class C0278r extends C0276q {

        /* renamed from: c */
        private final C0291m f645c;

        C0278r(C0291m mVar) {
            super();
            this.f645c = mVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public IntentFilter mo748b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* renamed from: c */
        public int mo749c() {
            return this.f645c.mo793d() ? 2 : 1;
        }

        /* renamed from: d */
        public void mo750d() {
            C0257f.this.mo684F();
        }
    }

    /* renamed from: androidx.appcompat.app.f$s */
    private static class C0279s {
        /* renamed from: a */
        static void m947a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* renamed from: androidx.appcompat.app.f$t */
    private class C0280t extends ContentFrameLayout {
        public C0280t(Context context) {
            super(context);
        }

        /* renamed from: c */
        private boolean m948c(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C0257f.this.mo694T(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m948c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            C0257f.this.mo690N(0);
            return true;
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C2620a.m21330b(getContext(), i));
        }
    }

    /* renamed from: androidx.appcompat.app.f$u */
    protected static final class C0281u {

        /* renamed from: a */
        int f648a;

        /* renamed from: b */
        int f649b;

        /* renamed from: c */
        int f650c;

        /* renamed from: d */
        int f651d;

        /* renamed from: e */
        int f652e;

        /* renamed from: f */
        int f653f;

        /* renamed from: g */
        ViewGroup f654g;

        /* renamed from: h */
        View f655h;

        /* renamed from: i */
        View f656i;

        /* renamed from: j */
        C0330g f657j;

        /* renamed from: k */
        C0327e f658k;

        /* renamed from: l */
        Context f659l;

        /* renamed from: m */
        boolean f660m;

        /* renamed from: n */
        boolean f661n;

        /* renamed from: o */
        boolean f662o;

        /* renamed from: p */
        public boolean f663p;

        /* renamed from: q */
        boolean f664q = false;

        /* renamed from: r */
        boolean f665r;

        /* renamed from: s */
        Bundle f666s;

        C0281u(int i) {
            this.f648a = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0348n mo757a(C0346m.C0347a aVar) {
            if (this.f657j == null) {
                return null;
            }
            if (this.f658k == null) {
                C0327e eVar = new C0327e(this.f659l, C2588g.abc_list_menu_item_layout);
                this.f658k = eVar;
                eVar.mo1004k(aVar);
                this.f657j.mo1092b(this.f658k);
            }
            return this.f658k.mo1040c(this.f654g);
        }

        /* renamed from: b */
        public boolean mo758b() {
            if (this.f655h == null) {
                return false;
            }
            if (this.f656i != null) {
                return true;
            }
            return this.f658k.mo1039a().getCount() > 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo759c(C0330g gVar) {
            C0327e eVar;
            C0330g gVar2 = this.f657j;
            if (gVar != gVar2) {
                if (gVar2 != null) {
                    gVar2.mo1070O(this.f658k);
                }
                this.f657j = gVar;
                if (gVar != null && (eVar = this.f658k) != null) {
                    gVar.mo1092b(eVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo760d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C2582a.actionBarPopupTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(C2582a.panelMenuListTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 == 0) {
                i2 = C2590i.Theme_AppCompat_CompactMenu;
            }
            newTheme.applyStyle(i2, true);
            C0302d dVar = new C0302d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f659l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(C2591j.f18929y0);
            this.f649b = obtainStyledAttributes.getResourceId(C2591j.f18704B0, 0);
            this.f653f = obtainStyledAttributes.getResourceId(C2591j.f18699A0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.appcompat.app.f$v */
    private final class C0282v implements C0346m.C0347a {
        C0282v() {
        }

        /* renamed from: b */
        public void mo727b(C0330g gVar, boolean z) {
            C0330g D = gVar.mo1060D();
            boolean z2 = D != gVar;
            C0257f fVar = C0257f.this;
            if (z2) {
                gVar = D;
            }
            C0281u Y = fVar.mo697Y(gVar);
            if (Y == null) {
                return;
            }
            if (z2) {
                C0257f.this.mo687K(Y.f648a, Y, D);
                C0257f.this.mo691O(Y, true);
                return;
            }
            C0257f.this.mo691O(Y, z);
        }

        /* renamed from: c */
        public boolean mo728c(C0330g gVar) {
            Window.Callback f0;
            if (gVar != gVar.mo1060D()) {
                return true;
            }
            C0257f fVar = C0257f.this;
            if (!fVar.f578F || (f0 = fVar.mo703f0()) == null || C0257f.this.f589Q) {
                return true;
            }
            f0.onMenuOpened(108, gVar);
            return true;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        boolean z2 = i < 21;
        f568h0 = z2;
        if (i >= 17) {
            z = true;
        }
        f571k0 = z;
        if (z2 && !f572l0) {
            Thread.setDefaultUncaughtExceptionHandler(new C0258a(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    C0257f(Activity activity, C0255d dVar) {
        this(activity, (Window) null, dVar, activity);
    }

    C0257f(Dialog dialog, C0255d dVar) {
        this(dialog.getContext(), dialog.getWindow(), dVar, dialog);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        r3 = f567g0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C0257f(android.content.Context r3, android.view.Window r4, androidx.appcompat.app.C0255d r5, java.lang.Object r6) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f620x = r0
            r0 = 1
            r2.f621y = r0
            r0 = -100
            r2.f591S = r0
            androidx.appcompat.app.f$b r1 = new androidx.appcompat.app.f$b
            r1.<init>()
            r2.f599a0 = r1
            r2.f606j = r3
            r2.f609m = r5
            r2.f605i = r6
            int r3 = r2.f591S
            if (r3 != r0) goto L_0x0032
            boolean r3 = r6 instanceof android.app.Dialog
            if (r3 == 0) goto L_0x0032
            androidx.appcompat.app.c r3 = r2.m835I0()
            if (r3 == 0) goto L_0x0032
            androidx.appcompat.app.e r3 = r3.mo629F()
            int r3 = r3.mo669k()
            r2.f591S = r3
        L_0x0032:
            int r3 = r2.f591S
            if (r3 != r0) goto L_0x0059
            o.g<java.lang.String, java.lang.Integer> r3 = f567g0
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.Object r5 = r3.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L_0x0059
            int r5 = r5.intValue()
            r2.f591S = r5
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            r3.remove(r5)
        L_0x0059:
            if (r4 == 0) goto L_0x005e
            r2.m834I(r4)
        L_0x005e:
            androidx.appcompat.widget.C0472k.m1943h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0257f.<init>(android.content.Context, android.view.Window, androidx.appcompat.app.d, java.lang.Object):void");
    }

    /* renamed from: A0 */
    private boolean m827A0(C0281u uVar, KeyEvent keyEvent) {
        C0457g0 g0Var;
        C0457g0 g0Var2;
        C0457g0 g0Var3;
        if (this.f589Q) {
            return false;
        }
        if (uVar.f660m) {
            return true;
        }
        C0281u uVar2 = this.f585M;
        if (!(uVar2 == null || uVar2 == uVar)) {
            mo691O(uVar2, false);
        }
        Window.Callback f0 = mo703f0();
        if (f0 != null) {
            uVar.f656i = f0.onCreatePanelView(uVar.f648a);
        }
        int i = uVar.f648a;
        boolean z = i == 0 || i == 108;
        if (z && (g0Var3 = this.f613q) != null) {
            g0Var3.mo1372c();
        }
        if (uVar.f656i == null) {
            if (z) {
                mo715y0();
            }
            C0330g gVar = uVar.f657j;
            if (gVar == null || uVar.f665r) {
                if (gVar == null && (!m851j0(uVar) || uVar.f657j == null)) {
                    return false;
                }
                if (z && this.f613q != null) {
                    if (this.f614r == null) {
                        this.f614r = new C0267i();
                    }
                    this.f613q.mo1370a(uVar.f657j, this.f614r);
                }
                uVar.f657j.mo1099d0();
                if (!f0.onCreatePanelMenu(uVar.f648a, uVar.f657j)) {
                    uVar.mo759c((C0330g) null);
                    if (z && (g0Var2 = this.f613q) != null) {
                        g0Var2.mo1370a((Menu) null, this.f614r);
                    }
                    return false;
                }
                uVar.f665r = false;
            }
            uVar.f657j.mo1099d0();
            Bundle bundle = uVar.f666s;
            if (bundle != null) {
                uVar.f657j.mo1071P(bundle);
                uVar.f666s = null;
            }
            if (!f0.onPreparePanel(0, uVar.f656i, uVar.f657j)) {
                if (z && (g0Var = this.f613q) != null) {
                    g0Var.mo1370a((Menu) null, this.f614r);
                }
                uVar.f657j.mo1094c0();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            uVar.f663p = z2;
            uVar.f657j.setQwertyMode(z2);
            uVar.f657j.mo1094c0();
        }
        uVar.f660m = true;
        uVar.f661n = false;
        this.f585M = uVar;
        return true;
    }

    /* renamed from: B0 */
    private void m828B0(boolean z) {
        C0457g0 g0Var = this.f613q;
        if (g0Var == null || !g0Var.mo1379g() || (ViewConfiguration.get(this.f606j).hasPermanentMenuKey() && !this.f613q.mo1374d())) {
            C0281u d0 = mo701d0(0, true);
            d0.f664q = true;
            mo691O(d0, false);
            m856x0(d0, (KeyEvent) null);
            return;
        }
        Window.Callback f0 = mo703f0();
        if (this.f613q.mo1371b() && z) {
            this.f613q.mo1376e();
            if (!this.f589Q) {
                f0.onPanelClosed(108, mo701d0(0, true).f657j);
            }
        } else if (f0 != null && !this.f589Q) {
            if (this.f597Y && (this.f598Z & 1) != 0) {
                this.f607k.getDecorView().removeCallbacks(this.f599a0);
                this.f599a0.run();
            }
            C0281u d02 = mo701d0(0, true);
            C0330g gVar = d02.f657j;
            if (gVar != null && !d02.f665r && f0.onPreparePanel(0, d02.f656i, gVar)) {
                f0.onMenuOpened(108, d02.f657j);
                this.f613q.mo1377f();
            }
        }
    }

    /* renamed from: C0 */
    private int m829C0(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i != 9) {
            return i;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    /* renamed from: E0 */
    private boolean m830E0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f607k.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C0833y.m3316A((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: G */
    private boolean m831G(boolean z) {
        if (this.f589Q) {
            return false;
        }
        int J = m836J();
        boolean J0 = m837J0(mo705n0(this.f606j, J), z);
        if (J == 0) {
            m847c0(this.f606j).mo752e();
        } else {
            C0276q qVar = this.f595W;
            if (qVar != null) {
                qVar.mo751a();
            }
        }
        if (J == 3) {
            m846b0(this.f606j).mo752e();
        } else {
            C0276q qVar2 = this.f596X;
            if (qVar2 != null) {
                qVar2.mo751a();
            }
        }
        return J0;
    }

    /* renamed from: H */
    private void m832H() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f573A.findViewById(16908290);
        View decorView = this.f607k.getDecorView();
        contentFrameLayout.mo1469b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f606j.obtainStyledAttributes(C2591j.f18929y0);
        obtainStyledAttributes.getValue(C2591j.f18745K0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C2591j.f18749L0, contentFrameLayout.getMinWidthMinor());
        int i = C2591j.f18737I0;
        if (obtainStyledAttributes.hasValue(i)) {
            obtainStyledAttributes.getValue(i, contentFrameLayout.getFixedWidthMajor());
        }
        int i2 = C2591j.f18741J0;
        if (obtainStyledAttributes.hasValue(i2)) {
            obtainStyledAttributes.getValue(i2, contentFrameLayout.getFixedWidthMinor());
        }
        int i3 = C2591j.f18729G0;
        if (obtainStyledAttributes.hasValue(i3)) {
            obtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedHeightMajor());
        }
        int i4 = C2591j.f18733H0;
        if (obtainStyledAttributes.hasValue(i4)) {
            obtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: H0 */
    private void m833H0() {
        if (this.f622z) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: I */
    private void m834I(Window window) {
        if (this.f607k == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C0274o)) {
                C0274o oVar = new C0274o(callback);
                this.f608l = oVar;
                window.setCallback(oVar);
                C0415a1 t = C0415a1.m1659t(this.f606j, (AttributeSet) null, f569i0);
                Drawable g = t.mo1772g(0);
                if (g != null) {
                    window.setBackgroundDrawable(g);
                }
                t.mo1784v();
                this.f607k = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* renamed from: I0 */
    private C0252c m835I0() {
        Context context = this.f606j;
        while (context != null) {
            if (!(context instanceof C0252c)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (C0252c) context;
            }
        }
        return null;
    }

    /* renamed from: J */
    private int m836J() {
        int i = this.f591S;
        return i != -100 ? i : C0256e.m801j();
    }

    /* renamed from: J0 */
    private boolean m837J0(int i, boolean z) {
        boolean z2 = false;
        Configuration P = m841P(this.f606j, i, (Configuration) null, false);
        boolean l0 = m853l0(this.f606j);
        Configuration configuration = this.f590R;
        if (configuration == null) {
            configuration = this.f606j.getResources().getConfiguration();
        }
        int i2 = configuration.uiMode & 48;
        int i3 = P.uiMode & 48;
        boolean z3 = true;
        if (i2 != i3 && z && !l0 && this.f587O && (f570j0 || this.f588P)) {
            Object obj = this.f605i;
            if ((obj instanceof Activity) && !((Activity) obj).isChild()) {
                C0539b.m2181n((Activity) this.f605i);
                z2 = true;
            }
        }
        if (z2 || i2 == i3) {
            z3 = z2;
        } else {
            m838K0(i3, l0, (Configuration) null);
        }
        if (z3) {
            Object obj2 = this.f605i;
            if (obj2 instanceof C0252c) {
                ((C0252c) obj2).mo632J(i);
            }
        }
        return z3;
    }

    /* renamed from: K0 */
    private void m838K0(int i, boolean z, Configuration configuration) {
        Resources resources = this.f606j.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i | (resources.getConfiguration().uiMode & -49);
        resources.updateConfiguration(configuration2, (DisplayMetrics) null);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            C0288k.m990a(resources);
        }
        int i3 = this.f592T;
        if (i3 != 0) {
            this.f606j.setTheme(i3);
            if (i2 >= 23) {
                this.f606j.getTheme().applyStyle(this.f592T, true);
            }
        }
        if (z) {
            Object obj = this.f605i;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof C1110m) {
                    if (!((C1110m) activity).mo491a().mo3831b().mo3834b(C1099i.C1102c.CREATED)) {
                        return;
                    }
                } else if (!this.f588P || this.f589Q) {
                    return;
                }
                activity.onConfigurationChanged(configuration2);
            }
        }
    }

    /* renamed from: M */
    private void m839M() {
        C0276q qVar = this.f595W;
        if (qVar != null) {
            qVar.mo751a();
        }
        C0276q qVar2 = this.f596X;
        if (qVar2 != null) {
            qVar2.mo751a();
        }
    }

    /* renamed from: M0 */
    private void m840M0(View view) {
        int i;
        Context context;
        if ((C0833y.m3368x(view) & 8192) != 0) {
            context = this.f606j;
            i = C2584c.abc_decor_view_status_guard_light;
        } else {
            context = this.f606j;
            i = C2584c.abc_decor_view_status_guard;
        }
        view.setBackgroundColor(C0597a.m2447b(context, i));
    }

    /* renamed from: P */
    private Configuration m841P(Context context, int i, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & -49);
        return configuration2;
    }

    /* renamed from: Q */
    private ViewGroup m842Q() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f606j.obtainStyledAttributes(C2591j.f18929y0);
        int i = C2591j.f18714D0;
        if (obtainStyledAttributes.hasValue(i)) {
            if (obtainStyledAttributes.getBoolean(C2591j.f18753M0, false)) {
                mo682z(1);
            } else if (obtainStyledAttributes.getBoolean(i, false)) {
                mo682z(108);
            }
            if (obtainStyledAttributes.getBoolean(C2591j.f18719E0, false)) {
                mo682z(109);
            }
            if (obtainStyledAttributes.getBoolean(C2591j.f18724F0, false)) {
                mo682z(10);
            }
            this.f581I = obtainStyledAttributes.getBoolean(C2591j.f18934z0, false);
            obtainStyledAttributes.recycle();
            m844X();
            this.f607k.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f606j);
            if (this.f582J) {
                viewGroup = (ViewGroup) from.inflate(this.f580H ? C2588g.abc_screen_simple_overlay_action_mode : C2588g.abc_screen_simple, (ViewGroup) null);
            } else if (this.f581I) {
                viewGroup = (ViewGroup) from.inflate(C2588g.abc_dialog_title_material, (ViewGroup) null);
                this.f579G = false;
                this.f578F = false;
            } else if (this.f578F) {
                TypedValue typedValue = new TypedValue();
                this.f606j.getTheme().resolveAttribute(C2582a.actionBarTheme, typedValue, true);
                viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0302d(this.f606j, typedValue.resourceId) : this.f606j).inflate(C2588g.abc_screen_toolbar, (ViewGroup) null);
                C0457g0 g0Var = (C0457g0) viewGroup.findViewById(C2587f.decor_content_parent);
                this.f613q = g0Var;
                g0Var.setWindowCallback(mo703f0());
                if (this.f579G) {
                    this.f613q.mo1389k(109);
                }
                if (this.f576D) {
                    this.f613q.mo1389k(2);
                }
                if (this.f577E) {
                    this.f613q.mo1389k(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    C0833y.m3338W(viewGroup, new C0260c());
                } else if (viewGroup instanceof C0474k0) {
                    ((C0474k0) viewGroup).setOnFitSystemWindowsListener(new C0261d());
                }
                if (this.f613q == null) {
                    this.f574B = (TextView) viewGroup.findViewById(C2587f.f18697M);
                }
                C0471j1.m1939c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C2587f.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f607k.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                    }
                }
                this.f607k.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new C0262e());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f578F + ", windowActionBarOverlay: " + this.f579G + ", android:windowIsFloating: " + this.f581I + ", windowActionModeOverlay: " + this.f580H + ", windowNoTitle: " + this.f582J + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: W */
    private void m843W() {
        if (!this.f622z) {
            this.f573A = m842Q();
            CharSequence e0 = mo702e0();
            if (!TextUtils.isEmpty(e0)) {
                C0457g0 g0Var = this.f613q;
                if (g0Var != null) {
                    g0Var.setWindowTitle(e0);
                } else if (mo715y0() != null) {
                    mo715y0().mo608s(e0);
                } else {
                    TextView textView = this.f574B;
                    if (textView != null) {
                        textView.setText(e0);
                    }
                }
            }
            m832H();
            mo714w0(this.f573A);
            this.f622z = true;
            C0281u d0 = mo701d0(0, false);
            if (this.f589Q) {
                return;
            }
            if (d0 == null || d0.f657j == null) {
                m852k0(108);
            }
        }
    }

    /* renamed from: X */
    private void m844X() {
        if (this.f607k == null) {
            Object obj = this.f605i;
            if (obj instanceof Activity) {
                m834I(((Activity) obj).getWindow());
            }
        }
        if (this.f607k == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: Z */
    private static Configuration m845Z(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (!(configuration2 == null || configuration.diff(configuration2) == 0)) {
            float f = configuration.fontScale;
            float f2 = configuration2.fontScale;
            if (f != f2) {
                configuration3.fontScale = f2;
            }
            int i = configuration.mcc;
            int i2 = configuration2.mcc;
            if (i != i2) {
                configuration3.mcc = i2;
            }
            int i3 = configuration.mnc;
            int i4 = configuration2.mnc;
            if (i3 != i4) {
                configuration3.mnc = i4;
            }
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 24) {
                C0272m.m930a(configuration, configuration2, configuration3);
            } else if (!C0740c.m2946a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i6 = configuration.touchscreen;
            int i7 = configuration2.touchscreen;
            if (i6 != i7) {
                configuration3.touchscreen = i7;
            }
            int i8 = configuration.keyboard;
            int i9 = configuration2.keyboard;
            if (i8 != i9) {
                configuration3.keyboard = i9;
            }
            int i10 = configuration.keyboardHidden;
            int i11 = configuration2.keyboardHidden;
            if (i10 != i11) {
                configuration3.keyboardHidden = i11;
            }
            int i12 = configuration.navigation;
            int i13 = configuration2.navigation;
            if (i12 != i13) {
                configuration3.navigation = i13;
            }
            int i14 = configuration.navigationHidden;
            int i15 = configuration2.navigationHidden;
            if (i14 != i15) {
                configuration3.navigationHidden = i15;
            }
            int i16 = configuration.orientation;
            int i17 = configuration2.orientation;
            if (i16 != i17) {
                configuration3.orientation = i17;
            }
            int i18 = configuration.screenLayout & 15;
            int i19 = configuration2.screenLayout;
            if (i18 != (i19 & 15)) {
                configuration3.screenLayout |= i19 & 15;
            }
            int i20 = configuration.screenLayout & 192;
            int i21 = configuration2.screenLayout;
            if (i20 != (i21 & 192)) {
                configuration3.screenLayout |= i21 & 192;
            }
            int i22 = configuration.screenLayout & 48;
            int i23 = configuration2.screenLayout;
            if (i22 != (i23 & 48)) {
                configuration3.screenLayout |= i23 & 48;
            }
            int i24 = configuration.screenLayout & 768;
            int i25 = configuration2.screenLayout;
            if (i24 != (i25 & 768)) {
                configuration3.screenLayout |= i25 & 768;
            }
            if (i5 >= 26) {
                C0273n.m931a(configuration, configuration2, configuration3);
            }
            int i26 = configuration.uiMode & 15;
            int i27 = configuration2.uiMode;
            if (i26 != (i27 & 15)) {
                configuration3.uiMode |= i27 & 15;
            }
            int i28 = configuration.uiMode & 48;
            int i29 = configuration2.uiMode;
            if (i28 != (i29 & 48)) {
                configuration3.uiMode |= i29 & 48;
            }
            int i30 = configuration.screenWidthDp;
            int i31 = configuration2.screenWidthDp;
            if (i30 != i31) {
                configuration3.screenWidthDp = i31;
            }
            int i32 = configuration.screenHeightDp;
            int i33 = configuration2.screenHeightDp;
            if (i32 != i33) {
                configuration3.screenHeightDp = i33;
            }
            int i34 = configuration.smallestScreenWidthDp;
            int i35 = configuration2.smallestScreenWidthDp;
            if (i34 != i35) {
                configuration3.smallestScreenWidthDp = i35;
            }
            if (i5 >= 17) {
                C0270k.m928b(configuration, configuration2, configuration3);
            }
        }
        return configuration3;
    }

    /* renamed from: b0 */
    private C0276q m846b0(Context context) {
        if (this.f596X == null) {
            this.f596X = new C0275p(context);
        }
        return this.f596X;
    }

    /* renamed from: c0 */
    private C0276q m847c0(Context context) {
        if (this.f595W == null) {
            this.f595W = new C0278r(C0291m.m998a(context));
        }
        return this.f595W;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m848g0() {
        /*
            r3 = this;
            r3.m843W()
            boolean r0 = r3.f578F
            if (r0 == 0) goto L_0x0037
            androidx.appcompat.app.a r0 = r3.f610n
            if (r0 == 0) goto L_0x000c
            goto L_0x0037
        L_0x000c:
            java.lang.Object r0 = r3.f605i
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0020
            androidx.appcompat.app.n r0 = new androidx.appcompat.app.n
            java.lang.Object r1 = r3.f605i
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.f579G
            r0.<init>(r1, r2)
        L_0x001d:
            r3.f610n = r0
            goto L_0x002e
        L_0x0020:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L_0x002e
            androidx.appcompat.app.n r0 = new androidx.appcompat.app.n
            java.lang.Object r1 = r3.f605i
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L_0x001d
        L_0x002e:
            androidx.appcompat.app.a r0 = r3.f610n
            if (r0 == 0) goto L_0x0037
            boolean r1 = r3.f600b0
            r0.mo606q(r1)
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0257f.m848g0():void");
    }

    /* renamed from: h0 */
    private boolean m849h0(C0281u uVar) {
        View view = uVar.f656i;
        if (view != null) {
            uVar.f655h = view;
            return true;
        } else if (uVar.f657j == null) {
            return false;
        } else {
            if (this.f615s == null) {
                this.f615s = new C0282v();
            }
            View view2 = (View) uVar.mo757a(this.f615s);
            uVar.f655h = view2;
            return view2 != null;
        }
    }

    /* renamed from: i0 */
    private boolean m850i0(C0281u uVar) {
        uVar.mo760d(mo699a0());
        uVar.f654g = new C0280t(uVar.f659l);
        uVar.f650c = 81;
        return true;
    }

    /* renamed from: j0 */
    private boolean m851j0(C0281u uVar) {
        Context context = this.f606j;
        int i = uVar.f648a;
        if ((i == 0 || i == 108) && this.f613q != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(C2582a.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C2582a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(C2582a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                C0302d dVar = new C0302d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        C0330g gVar = new C0330g(context);
        gVar.mo1073R(this);
        uVar.mo759c(gVar);
        return true;
    }

    /* renamed from: k0 */
    private void m852k0(int i) {
        this.f598Z = (1 << i) | this.f598Z;
        if (!this.f597Y) {
            C0833y.m3325J(this.f607k.getDecorView(), this.f599a0);
            this.f597Y = true;
        }
    }

    /* renamed from: l0 */
    private boolean m853l0(Context context) {
        if (!this.f594V && (this.f605i instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f605i.getClass()), i >= 29 ? 269221888 : i >= 24 ? 786432 : 0);
                this.f593U = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                this.f593U = false;
            }
        }
        this.f594V = true;
        return this.f593U;
    }

    /* renamed from: q0 */
    private boolean m854q0(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        C0281u d0 = mo701d0(i, true);
        if (!d0.f662o) {
            return m827A0(d0, keyEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a  */
    /* renamed from: t0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m855t0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            androidx.appcompat.view.b r0 = r4.f616t
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            androidx.appcompat.app.f$u r2 = r4.mo701d0(r5, r0)
            if (r5 != 0) goto L_0x0043
            androidx.appcompat.widget.g0 r5 = r4.f613q
            if (r5 == 0) goto L_0x0043
            boolean r5 = r5.mo1379g()
            if (r5 == 0) goto L_0x0043
            android.content.Context r5 = r4.f606j
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L_0x0043
            androidx.appcompat.widget.g0 r5 = r4.f613q
            boolean r5 = r5.mo1371b()
            if (r5 != 0) goto L_0x003c
            boolean r5 = r4.f589Q
            if (r5 != 0) goto L_0x0062
            boolean r5 = r4.m827A0(r2, r6)
            if (r5 == 0) goto L_0x0062
            androidx.appcompat.widget.g0 r5 = r4.f613q
            boolean r0 = r5.mo1377f()
            goto L_0x0068
        L_0x003c:
            androidx.appcompat.widget.g0 r5 = r4.f613q
            boolean r0 = r5.mo1376e()
            goto L_0x0068
        L_0x0043:
            boolean r5 = r2.f662o
            if (r5 != 0) goto L_0x0064
            boolean r3 = r2.f661n
            if (r3 == 0) goto L_0x004c
            goto L_0x0064
        L_0x004c:
            boolean r5 = r2.f660m
            if (r5 == 0) goto L_0x0062
            boolean r5 = r2.f665r
            if (r5 == 0) goto L_0x005b
            r2.f660m = r1
            boolean r5 = r4.m827A0(r2, r6)
            goto L_0x005c
        L_0x005b:
            r5 = r0
        L_0x005c:
            if (r5 == 0) goto L_0x0062
            r4.m856x0(r2, r6)
            goto L_0x0068
        L_0x0062:
            r0 = r1
            goto L_0x0068
        L_0x0064:
            r4.mo691O(r2, r0)
            r0 = r5
        L_0x0068:
            if (r0 == 0) goto L_0x0085
            android.content.Context r5 = r4.f606j
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L_0x007e
            r5.playSoundEffect(r1)
            goto L_0x0085
        L_0x007e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0257f.m855t0(int, android.view.KeyEvent):boolean");
    }

    /* renamed from: x0 */
    private void m856x0(C0281u uVar, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (!uVar.f662o && !this.f589Q) {
            if (uVar.f648a == 0) {
                if ((this.f606j.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback f0 = mo703f0();
            if (f0 == null || f0.onMenuOpened(uVar.f648a, uVar.f657j)) {
                WindowManager windowManager = (WindowManager) this.f606j.getSystemService("window");
                if (windowManager != null && m827A0(uVar, keyEvent)) {
                    ViewGroup viewGroup = uVar.f654g;
                    if (viewGroup == null || uVar.f664q) {
                        if (viewGroup == null) {
                            if (!m850i0(uVar) || uVar.f654g == null) {
                                return;
                            }
                        } else if (uVar.f664q && viewGroup.getChildCount() > 0) {
                            uVar.f654g.removeAllViews();
                        }
                        if (!m849h0(uVar) || !uVar.mo758b()) {
                            uVar.f664q = true;
                            return;
                        }
                        ViewGroup.LayoutParams layoutParams2 = uVar.f655h.getLayoutParams();
                        if (layoutParams2 == null) {
                            layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                        }
                        uVar.f654g.setBackgroundResource(uVar.f649b);
                        ViewParent parent = uVar.f655h.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(uVar.f655h);
                        }
                        uVar.f654g.addView(uVar.f655h, layoutParams2);
                        if (!uVar.f655h.hasFocus()) {
                            uVar.f655h.requestFocus();
                        }
                    } else {
                        View view = uVar.f656i;
                        if (!(view == null || (layoutParams = view.getLayoutParams()) == null || layoutParams.width != -1)) {
                            i = -1;
                            uVar.f661n = false;
                            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, uVar.f651d, uVar.f652e, 1002, 8519680, -3);
                            layoutParams3.gravity = uVar.f650c;
                            layoutParams3.windowAnimations = uVar.f653f;
                            windowManager.addView(uVar.f654g, layoutParams3);
                            uVar.f662o = true;
                            return;
                        }
                    }
                    i = -2;
                    uVar.f661n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, uVar.f651d, uVar.f652e, 1002, 8519680, -3);
                    layoutParams32.gravity = uVar.f650c;
                    layoutParams32.windowAnimations = uVar.f653f;
                    windowManager.addView(uVar.f654g, layoutParams32);
                    uVar.f662o = true;
                    return;
                }
                return;
            }
            mo691O(uVar, true);
        }
    }

    /* renamed from: z0 */
    private boolean m857z0(C0281u uVar, int i, KeyEvent keyEvent, int i2) {
        C0330g gVar;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((uVar.f660m || m827A0(uVar, keyEvent)) && (gVar = uVar.f657j) != null) {
            z = gVar.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f613q == null) {
            mo691O(uVar, true);
        }
        return z;
    }

    /* renamed from: A */
    public void mo660A(int i) {
        m843W();
        ViewGroup viewGroup = (ViewGroup) this.f573A.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f606j).inflate(i, viewGroup);
        this.f608l.mo734c(this.f607k.getCallback());
    }

    /* renamed from: B */
    public void mo661B(View view) {
        m843W();
        ViewGroup viewGroup = (ViewGroup) this.f573A.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f608l.mo734c(this.f607k.getCallback());
    }

    /* renamed from: C */
    public void mo662C(View view, ViewGroup.LayoutParams layoutParams) {
        m843W();
        ViewGroup viewGroup = (ViewGroup) this.f573A.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f608l.mo734c(this.f607k.getCallback());
    }

    /* renamed from: D */
    public void mo663D(int i) {
        this.f592T = i;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f573A;
     */
    /* renamed from: D0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo683D0() {
        /*
            r1 = this;
            boolean r0 = r1.f622z
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.f573A
            if (r0 == 0) goto L_0x0010
            boolean r0 = androidx.core.view.C0833y.m3317B(r0)
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0257f.mo683D0():boolean");
    }

    /* renamed from: E */
    public final void mo664E(CharSequence charSequence) {
        this.f612p = charSequence;
        C0457g0 g0Var = this.f613q;
        if (g0Var != null) {
            g0Var.setWindowTitle(charSequence);
        } else if (mo715y0() != null) {
            mo715y0().mo608s(charSequence);
        } else {
            TextView textView = this.f574B;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* renamed from: F */
    public boolean mo684F() {
        return m831G(true);
    }

    /* renamed from: F0 */
    public C0299b mo685F0(C0299b.C0300a aVar) {
        C0255d dVar;
        if (aVar != null) {
            C0299b bVar = this.f616t;
            if (bVar != null) {
                bVar.mo811c();
            }
            C0268j jVar = new C0268j(aVar);
            C0246a m = mo671m();
            if (m != null) {
                C0299b t = m.mo609t(jVar);
                this.f616t = t;
                if (!(t == null || (dVar = this.f609m) == null)) {
                    dVar.mo640d(t);
                }
            }
            if (this.f616t == null) {
                this.f616t = mo686G0(jVar);
            }
            return this.f616t;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* renamed from: G0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.appcompat.view.C0299b mo686G0(androidx.appcompat.view.C0299b.C0300a r8) {
        /*
            r7 = this;
            r7.mo696V()
            androidx.appcompat.view.b r0 = r7.f616t
            if (r0 == 0) goto L_0x000a
            r0.mo811c()
        L_0x000a:
            boolean r0 = r8 instanceof androidx.appcompat.app.C0257f.C0268j
            if (r0 != 0) goto L_0x0014
            androidx.appcompat.app.f$j r0 = new androidx.appcompat.app.f$j
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            androidx.appcompat.app.d r0 = r7.f609m
            r1 = 0
            if (r0 == 0) goto L_0x0022
            boolean r2 = r7.f589Q
            if (r2 != 0) goto L_0x0022
            androidx.appcompat.view.b r0 = r0.mo648l(r8)     // Catch:{ AbstractMethodError -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
            r7.f616t = r0
            goto L_0x015b
        L_0x0029:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f617u
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d4
            boolean r0 = r7.f581I
            if (r0 == 0) goto L_0x00b5
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f606j
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = p038f.C2582a.actionBarTheme
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0068
            android.content.Context r5 = r7.f606j
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            androidx.appcompat.view.d r4 = new androidx.appcompat.view.d
            android.content.Context r6 = r7.f606j
            r4.<init>((android.content.Context) r6, (int) r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006a
        L_0x0068:
            android.content.Context r4 = r7.f606j
        L_0x006a:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r4)
            r7.f617u = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = p038f.C2582a.actionModePopupWindowStyle
            r5.<init>(r4, r1, r6)
            r7.f618v = r5
            r6 = 2
            androidx.core.widget.C0880i.m3630b(r5, r6)
            android.widget.PopupWindow r5 = r7.f618v
            androidx.appcompat.widget.ActionBarContextView r6 = r7.f617u
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.f618v
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = p038f.C2582a.actionBarSize
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f617u
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.f618v
            r4 = -2
            r0.setHeight(r4)
            androidx.appcompat.app.f$f r0 = new androidx.appcompat.app.f$f
            r0.<init>()
            r7.f619w = r0
            goto L_0x00d4
        L_0x00b5:
            android.view.ViewGroup r0 = r7.f573A
            int r4 = p038f.C2587f.action_mode_bar_stub
            android.view.View r0 = r0.findViewById(r4)
            androidx.appcompat.widget.ViewStubCompat r0 = (androidx.appcompat.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d4
            android.content.Context r4 = r7.mo699a0()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.mo1679a()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r7.f617u = r0
        L_0x00d4:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f617u
            if (r0 == 0) goto L_0x015b
            r7.mo696V()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f617u
            r0.mo1355k()
            androidx.appcompat.view.e r0 = new androidx.appcompat.view.e
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f617u
            android.content.Context r4 = r4.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r7.f617u
            android.widget.PopupWindow r6 = r7.f618v
            if (r6 != 0) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r3 = r2
        L_0x00f0:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.mo813e()
            boolean r8 = r8.mo732d(r0, r3)
            if (r8 == 0) goto L_0x0159
            r0.mo817k()
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f617u
            r8.mo1353h(r0)
            r7.f616t = r0
            boolean r8 = r7.mo683D0()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x012a
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f617u
            r1 = 0
            r8.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f617u
            androidx.core.view.e0 r8 = androidx.core.view.C0833y.m3346c(r8)
            androidx.core.view.e0 r8 = r8.mo2853b(r0)
            r7.f620x = r8
            androidx.appcompat.app.f$g r0 = new androidx.appcompat.app.f$g
            r0.<init>()
            r8.mo2858h(r0)
            goto L_0x0149
        L_0x012a:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f617u
            r8.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f617u
            r8.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f617u
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x0149
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f617u
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            androidx.core.view.C0833y.m3327L(r8)
        L_0x0149:
            android.widget.PopupWindow r8 = r7.f618v
            if (r8 == 0) goto L_0x015b
            android.view.Window r8 = r7.f607k
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.f619w
            r8.post(r0)
            goto L_0x015b
        L_0x0159:
            r7.f616t = r1
        L_0x015b:
            androidx.appcompat.view.b r8 = r7.f616t
            if (r8 == 0) goto L_0x0166
            androidx.appcompat.app.d r0 = r7.f609m
            if (r0 == 0) goto L_0x0166
            r0.mo640d(r8)
        L_0x0166:
            androidx.appcompat.view.b r8 = r7.f616t
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0257f.mo686G0(androidx.appcompat.view.b$a):androidx.appcompat.view.b");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo687K(int i, C0281u uVar, Menu menu) {
        if (menu == null) {
            if (uVar == null && i >= 0) {
                C0281u[] uVarArr = this.f584L;
                if (i < uVarArr.length) {
                    uVar = uVarArr[i];
                }
            }
            if (uVar != null) {
                menu = uVar.f657j;
            }
        }
        if ((uVar == null || uVar.f662o) && !this.f589Q) {
            this.f608l.mo735d(this.f607k.getCallback(), i, menu);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo688L(C0330g gVar) {
        if (!this.f583K) {
            this.f583K = true;
            this.f613q.mo1390l();
            Window.Callback f0 = mo703f0();
            if (f0 != null && !this.f589Q) {
                f0.onPanelClosed(108, gVar);
            }
            this.f583K = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L0 */
    public final int mo689L0(C0796i0 i0Var, Rect rect) {
        boolean z;
        boolean z2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        int i2 = 0;
        int k = i0Var != null ? i0Var.mo2882k() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f617u;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f617u.getLayoutParams();
            boolean z3 = true;
            if (this.f617u.isShown()) {
                if (this.f601c0 == null) {
                    this.f601c0 = new Rect();
                    this.f602d0 = new Rect();
                }
                Rect rect2 = this.f601c0;
                Rect rect3 = this.f602d0;
                if (i0Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(i0Var.mo2880i(), i0Var.mo2882k(), i0Var.mo2881j(), i0Var.mo2878h());
                }
                C0471j1.m1937a(this.f573A, rect2, rect3);
                int i3 = rect2.top;
                int i4 = rect2.left;
                int i5 = rect2.right;
                C0796i0 u = C0833y.m3365u(this.f573A);
                int i6 = u == null ? 0 : u.mo2880i();
                int j = u == null ? 0 : u.mo2881j();
                if (marginLayoutParams2.topMargin == i3 && marginLayoutParams2.leftMargin == i4 && marginLayoutParams2.rightMargin == i5) {
                    z2 = false;
                } else {
                    marginLayoutParams2.topMargin = i3;
                    marginLayoutParams2.leftMargin = i4;
                    marginLayoutParams2.rightMargin = i5;
                    z2 = true;
                }
                if (i3 <= 0 || this.f575C != null) {
                    View view = this.f575C;
                    if (!(view == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()).height == (i = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == i6 && marginLayoutParams.rightMargin == j))) {
                        marginLayoutParams.height = i;
                        marginLayoutParams.leftMargin = i6;
                        marginLayoutParams.rightMargin = j;
                        this.f575C.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view2 = new View(this.f606j);
                    this.f575C = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = i6;
                    layoutParams.rightMargin = j;
                    this.f573A.addView(this.f575C, -1, layoutParams);
                }
                View view3 = this.f575C;
                if (view3 == null) {
                    z3 = false;
                }
                if (z3 && view3.getVisibility() != 0) {
                    m840M0(this.f575C);
                }
                if (!this.f580H && z3) {
                    k = 0;
                }
                z = z3;
                z3 = z2;
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.f617u.setLayoutParams(marginLayoutParams2);
            }
        }
        View view4 = this.f575C;
        if (view4 != null) {
            if (!z) {
                i2 = 8;
            }
            view4.setVisibility(i2);
        }
        return k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo690N(int i) {
        mo691O(mo701d0(i, true), true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo691O(C0281u uVar, boolean z) {
        ViewGroup viewGroup;
        C0457g0 g0Var;
        if (!z || uVar.f648a != 0 || (g0Var = this.f613q) == null || !g0Var.mo1371b()) {
            WindowManager windowManager = (WindowManager) this.f606j.getSystemService("window");
            if (!(windowManager == null || !uVar.f662o || (viewGroup = uVar.f654g) == null)) {
                windowManager.removeView(viewGroup);
                if (z) {
                    mo687K(uVar.f648a, uVar, (Menu) null);
                }
            }
            uVar.f660m = false;
            uVar.f661n = false;
            uVar.f662o = false;
            uVar.f655h = null;
            uVar.f664q = true;
            if (this.f585M == uVar) {
                this.f585M = null;
                return;
            }
            return;
        }
        mo688L(uVar.f657j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007f, code lost:
        if (((org.xmlpull.v1.XmlPullParser) r15).getDepth() > 1) goto L_0x0089;
     */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo692R(android.view.View r12, java.lang.String r13, android.content.Context r14, android.util.AttributeSet r15) {
        /*
            r11 = this;
            androidx.appcompat.app.i r0 = r11.f603e0
            r1 = 0
            if (r0 != 0) goto L_0x005a
            android.content.Context r0 = r11.f606j
            int[] r2 = p038f.C2591j.f18929y0
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r2)
            int r2 = p038f.C2591j.f18709C0
            java.lang.String r0 = r0.getString(r2)
            if (r0 != 0) goto L_0x001d
            androidx.appcompat.app.i r0 = new androidx.appcompat.app.i
            r0.<init>()
        L_0x001a:
            r11.f603e0 = r0
            goto L_0x005a
        L_0x001d:
            android.content.Context r2 = r11.f606j     // Catch:{ all -> 0x0038 }
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch:{ all -> 0x0038 }
            java.lang.Class r2 = r2.loadClass(r0)     // Catch:{ all -> 0x0038 }
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ all -> 0x0038 }
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ all -> 0x0038 }
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ all -> 0x0038 }
            java.lang.Object r2 = r2.newInstance(r3)     // Catch:{ all -> 0x0038 }
            androidx.appcompat.app.i r2 = (androidx.appcompat.app.C0285i) r2     // Catch:{ all -> 0x0038 }
            r11.f603e0 = r2     // Catch:{ all -> 0x0038 }
            goto L_0x005a
        L_0x0038:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to instantiate custom view inflater "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ". Falling back to default."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "AppCompatDelegate"
            android.util.Log.i(r3, r0, r2)
            androidx.appcompat.app.i r0 = new androidx.appcompat.app.i
            r0.<init>()
            goto L_0x001a
        L_0x005a:
            boolean r8 = f568h0
            r0 = 1
            if (r8 == 0) goto L_0x008a
            androidx.appcompat.app.j r2 = r11.f604f0
            if (r2 != 0) goto L_0x006a
            androidx.appcompat.app.j r2 = new androidx.appcompat.app.j
            r2.<init>()
            r11.f604f0 = r2
        L_0x006a:
            androidx.appcompat.app.j r2 = r11.f604f0
            boolean r2 = r2.mo791a(r15)
            if (r2 == 0) goto L_0x0074
            r7 = r0
            goto L_0x008b
        L_0x0074:
            boolean r2 = r15 instanceof org.xmlpull.v1.XmlPullParser
            if (r2 == 0) goto L_0x0082
            r2 = r15
            org.xmlpull.v1.XmlPullParser r2 = (org.xmlpull.v1.XmlPullParser) r2
            int r2 = r2.getDepth()
            if (r2 <= r0) goto L_0x008a
            goto L_0x0089
        L_0x0082:
            r0 = r12
            android.view.ViewParent r0 = (android.view.ViewParent) r0
            boolean r0 = r11.m830E0(r0)
        L_0x0089:
            r1 = r0
        L_0x008a:
            r7 = r1
        L_0x008b:
            androidx.appcompat.app.i r2 = r11.f603e0
            r9 = 1
            boolean r10 = androidx.appcompat.widget.C0464i1.m1911c()
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            android.view.View r12 = r2.mo789r(r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0257f.mo692R(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo693S() {
        C0330g gVar;
        C0457g0 g0Var = this.f613q;
        if (g0Var != null) {
            g0Var.mo1390l();
        }
        if (this.f618v != null) {
            this.f607k.getDecorView().removeCallbacks(this.f619w);
            if (this.f618v.isShowing()) {
                try {
                    this.f618v.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f618v = null;
        }
        mo696V();
        C0281u d0 = mo701d0(0, false);
        if (d0 != null && (gVar = d0.f657j) != null) {
            gVar.close();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public boolean mo694T(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f605i;
        boolean z = true;
        if (((obj instanceof C0787f.C0788a) || (obj instanceof C0284h)) && (decorView = this.f607k.getDecorView()) != null && C0787f.m3129d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f608l.mo733b(this.f607k.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? mo709p0(keyCode, keyEvent) : mo711s0(keyCode, keyEvent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo695U(int i) {
        C0281u d0;
        C0281u d02 = mo701d0(i, true);
        if (d02.f657j != null) {
            Bundle bundle = new Bundle();
            d02.f657j.mo1072Q(bundle);
            if (bundle.size() > 0) {
                d02.f666s = bundle;
            }
            d02.f657j.mo1099d0();
            d02.f657j.clear();
        }
        d02.f665r = true;
        d02.f664q = true;
        if ((i == 108 || i == 0) && this.f613q != null && (d0 = mo701d0(0, false)) != null) {
            d0.f660m = false;
            m827A0(d0, (KeyEvent) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo696V() {
        C0783e0 e0Var = this.f620x;
        if (e0Var != null) {
            e0Var.mo2854c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public C0281u mo697Y(Menu menu) {
        C0281u[] uVarArr = this.f584L;
        int length = uVarArr != null ? uVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            C0281u uVar = uVarArr[i];
            if (uVar != null && uVar.f657j == menu) {
                return uVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo698a(C0330g gVar, MenuItem menuItem) {
        C0281u Y;
        Window.Callback f0 = mo703f0();
        if (f0 == null || this.f589Q || (Y = mo697Y(gVar.mo1060D())) == null) {
            return false;
        }
        return f0.onMenuItemSelected(Y.f648a, menuItem);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public final Context mo699a0() {
        C0246a m = mo671m();
        Context j = m != null ? m.mo599j() : null;
        return j == null ? this.f606j : j;
    }

    /* renamed from: b */
    public void mo700b(C0330g gVar) {
        m828B0(true);
    }

    /* renamed from: d */
    public void mo665d(View view, ViewGroup.LayoutParams layoutParams) {
        m843W();
        ((ViewGroup) this.f573A.findViewById(16908290)).addView(view, layoutParams);
        this.f608l.mo734c(this.f607k.getCallback());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public C0281u mo701d0(int i, boolean z) {
        C0281u[] uVarArr = this.f584L;
        if (uVarArr == null || uVarArr.length <= i) {
            C0281u[] uVarArr2 = new C0281u[(i + 1)];
            if (uVarArr != null) {
                System.arraycopy(uVarArr, 0, uVarArr2, 0, uVarArr.length);
            }
            this.f584L = uVarArr2;
            uVarArr = uVarArr2;
        }
        C0281u uVar = uVarArr[i];
        if (uVar != null) {
            return uVar;
        }
        C0281u uVar2 = new C0281u(i);
        uVarArr[i] = uVar2;
        return uVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public final CharSequence mo702e0() {
        Object obj = this.f605i;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f612p;
    }

    /* renamed from: f */
    public Context mo667f(Context context) {
        boolean z = true;
        this.f587O = true;
        int n0 = mo705n0(context, m836J());
        Configuration configuration = null;
        boolean z2 = false;
        if (f571k0 && (context instanceof ContextThemeWrapper)) {
            try {
                C0279s.m947a((ContextThemeWrapper) context, m841P(context, n0, (Configuration) null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C0302d) {
            try {
                ((C0302d) context).mo838a(m841P(context, n0, (Configuration) null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f570j0) {
            return super.mo667f(context);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = C0270k.m927a(context, configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = m845Z(configuration3, configuration4);
            }
        }
        Configuration P = m841P(context, n0, configuration, true);
        C0302d dVar = new C0302d(context, C2590i.Theme_AppCompat_Empty);
        dVar.mo838a(P);
        try {
            if (context.getTheme() == null) {
                z = false;
            }
            z2 = z;
        } catch (NullPointerException unused3) {
        }
        if (z2) {
            C0624h.C0631g.m2587a(dVar.getTheme());
        }
        return super.mo667f(dVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public final Window.Callback mo703f0() {
        return this.f607k.getCallback();
    }

    /* renamed from: i */
    public <T extends View> T mo668i(int i) {
        m843W();
        return this.f607k.findViewById(i);
    }

    /* renamed from: k */
    public int mo669k() {
        return this.f591S;
    }

    /* renamed from: l */
    public MenuInflater mo670l() {
        if (this.f611o == null) {
            m848g0();
            C0246a aVar = this.f610n;
            this.f611o = new C0307g(aVar != null ? aVar.mo599j() : this.f606j);
        }
        return this.f611o;
    }

    /* renamed from: m */
    public C0246a mo671m() {
        m848g0();
        return this.f610n;
    }

    /* renamed from: m0 */
    public boolean mo704m0() {
        return this.f621y;
    }

    /* renamed from: n */
    public void mo672n() {
        LayoutInflater from = LayoutInflater.from(this.f606j);
        if (from.getFactory() == null) {
            C0790g.m3137b(from, this);
        } else if (!(from.getFactory2() instanceof C0257f)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public int mo705n0(Context context, int i) {
        C0276q c0;
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (!(i == 1 || i == 2)) {
                    if (i == 3) {
                        c0 = m846b0(context);
                    } else {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                c0 = m847c0(context);
            }
            return c0.mo749c();
        }
        return i;
    }

    /* renamed from: o */
    public void mo673o() {
        if (mo715y0() != null && !mo671m().mo600k()) {
            m852k0(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o0 */
    public boolean mo706o0() {
        C0299b bVar = this.f616t;
        if (bVar != null) {
            bVar.mo811c();
            return true;
        }
        C0246a m = mo671m();
        return m != null && m.mo596g();
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return mo692R(view, str, context, attributeSet);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    /* renamed from: p */
    public void mo674p(Configuration configuration) {
        C0246a m;
        if (this.f578F && this.f622z && (m = mo671m()) != null) {
            m.mo601l(configuration);
        }
        C0472k.m1941b().mo2120g(this.f606j);
        this.f590R = new Configuration(this.f606j.getResources().getConfiguration());
        m831G(false);
        configuration.updateFrom(this.f606j.getResources().getConfiguration());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p0 */
    public boolean mo709p0(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.f586N = z;
        } else if (i == 82) {
            m854q0(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public void mo675q(Bundle bundle) {
        this.f587O = true;
        m831G(false);
        m844X();
        Object obj = this.f605i;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = C0562i.m2224c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                C0246a y0 = mo715y0();
                if (y0 == null) {
                    this.f600b0 = true;
                } else {
                    y0.mo606q(true);
                }
            }
            C0256e.m798c(this);
        }
        this.f590R = new Configuration(this.f606j.getResources().getConfiguration());
        this.f588P = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo676r() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f605i
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0009
            androidx.appcompat.app.C0256e.m802x(r3)
        L_0x0009:
            boolean r0 = r3.f597Y
            if (r0 == 0) goto L_0x0018
            android.view.Window r0 = r3.f607k
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f599a0
            r0.removeCallbacks(r1)
        L_0x0018:
            r0 = 1
            r3.f589Q = r0
            int r0 = r3.f591S
            r1 = -100
            if (r0 == r1) goto L_0x0045
            java.lang.Object r0 = r3.f605i
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0045
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x0045
            o.g<java.lang.String, java.lang.Integer> r0 = f567g0
            java.lang.Object r1 = r3.f605i
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f591S
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x0054
        L_0x0045:
            o.g<java.lang.String, java.lang.Integer> r0 = f567g0
            java.lang.Object r1 = r3.f605i
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x0054:
            androidx.appcompat.app.a r0 = r3.f610n
            if (r0 == 0) goto L_0x005b
            r0.mo602m()
        L_0x005b:
            r3.m839M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0257f.mo676r():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r0 */
    public boolean mo710r0(int i, KeyEvent keyEvent) {
        C0246a m = mo671m();
        if (m != null && m.mo603n(i, keyEvent)) {
            return true;
        }
        C0281u uVar = this.f585M;
        if (uVar == null || !m857z0(uVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f585M == null) {
                C0281u d0 = mo701d0(0, true);
                m827A0(d0, keyEvent);
                boolean z0 = m857z0(d0, keyEvent.getKeyCode(), keyEvent, 1);
                d0.f660m = false;
                if (z0) {
                    return true;
                }
            }
            return false;
        }
        C0281u uVar2 = this.f585M;
        if (uVar2 != null) {
            uVar2.f661n = true;
        }
        return true;
    }

    /* renamed from: s */
    public void mo677s(Bundle bundle) {
        m843W();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s0 */
    public boolean mo711s0(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.f586N;
            this.f586N = false;
            C0281u d0 = mo701d0(0, false);
            if (d0 != null && d0.f662o) {
                if (!z) {
                    mo691O(d0, true);
                }
                return true;
            } else if (mo706o0()) {
                return true;
            }
        } else if (i == 82) {
            m855t0(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public void mo678t() {
        C0246a m = mo671m();
        if (m != null) {
            m.mo607r(true);
        }
    }

    /* renamed from: u */
    public void mo679u(Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u0 */
    public void mo712u0(int i) {
        C0246a m;
        if (i == 108 && (m = mo671m()) != null) {
            m.mo597h(true);
        }
    }

    /* renamed from: v */
    public void mo680v() {
        mo684F();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v0 */
    public void mo713v0(int i) {
        if (i == 108) {
            C0246a m = mo671m();
            if (m != null) {
                m.mo597h(false);
            }
        } else if (i == 0) {
            C0281u d0 = mo701d0(i, true);
            if (d0.f662o) {
                mo691O(d0, false);
            }
        }
    }

    /* renamed from: w */
    public void mo681w() {
        C0246a m = mo671m();
        if (m != null) {
            m.mo607r(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w0 */
    public void mo714w0(ViewGroup viewGroup) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y0 */
    public final C0246a mo715y0() {
        return this.f610n;
    }

    /* renamed from: z */
    public boolean mo682z(int i) {
        int C0 = m829C0(i);
        if (this.f582J && C0 == 108) {
            return false;
        }
        if (this.f578F && C0 == 1) {
            this.f578F = false;
        }
        if (C0 == 1) {
            m833H0();
            this.f582J = true;
            return true;
        } else if (C0 == 2) {
            m833H0();
            this.f576D = true;
            return true;
        } else if (C0 == 5) {
            m833H0();
            this.f577E = true;
            return true;
        } else if (C0 == 10) {
            m833H0();
            this.f580H = true;
            return true;
        } else if (C0 == 108) {
            m833H0();
            this.f578F = true;
            return true;
        } else if (C0 != 109) {
            return this.f607k.requestFeature(C0);
        } else {
            m833H0();
            this.f579G = true;
            return true;
        }
    }
}
