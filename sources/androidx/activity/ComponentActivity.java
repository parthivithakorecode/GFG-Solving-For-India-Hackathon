package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.C0228d;
import androidx.activity.result.C0232e;
import androidx.core.app.C0560g;
import androidx.core.app.C0561h;
import androidx.core.app.C0591p;
import androidx.core.content.C0597a;
import androidx.core.util.C0738a;
import androidx.core.view.C0795i;
import androidx.lifecycle.C1083e0;
import androidx.lifecycle.C1097h;
import androidx.lifecycle.C1098h0;
import androidx.lifecycle.C1099i;
import androidx.lifecycle.C1103i0;
import androidx.lifecycle.C1106j0;
import androidx.lifecycle.C1107k;
import androidx.lifecycle.C1108k0;
import androidx.lifecycle.C1110m;
import androidx.lifecycle.C1111n;
import androidx.lifecycle.C1125w;
import androidx.lifecycle.C1131z;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p001a0.C0005a;
import p001a0.C0010d;
import p024d.C2463a;
import p024d.C2464b;
import p046g0.C2623c;
import p046g0.C2627d;
import p046g0.C2629e;
import p046g0.C2630f;
import p075k0.C3293a;

public class ComponentActivity extends C0560g implements C1103i0, C1097h, C2629e, C0221h, C0232e {

    /* renamed from: h */
    final C2463a f378h = new C2463a();

    /* renamed from: i */
    private final C0795i f379i = new C0795i(new C0217d(this));

    /* renamed from: j */
    private final C1111n f380j = new C1111n(this);

    /* renamed from: k */
    final C2627d f381k;

    /* renamed from: l */
    private C1098h0 f382l;

    /* renamed from: m */
    private final OnBackPressedDispatcher f383m;

    /* renamed from: n */
    private int f384n;

    /* renamed from: o */
    private final AtomicInteger f385o;

    /* renamed from: p */
    private final C0228d f386p;

    /* renamed from: q */
    private final CopyOnWriteArrayList<C0738a<Configuration>> f387q;

    /* renamed from: r */
    private final CopyOnWriteArrayList<C0738a<Integer>> f388r;

    /* renamed from: s */
    private final CopyOnWriteArrayList<C0738a<Intent>> f389s;

    /* renamed from: t */
    private final CopyOnWriteArrayList<C0738a<C0561h>> f390t;

    /* renamed from: u */
    private final CopyOnWriteArrayList<C0738a<C0591p>> f391u;

    /* renamed from: androidx.activity.ComponentActivity$a */
    class C0209a implements Runnable {
        C0209a() {
        }

        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e;
                }
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$b */
    class C0210b extends C0228d {
        C0210b() {
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$c */
    static class C0211c {
        /* renamed from: a */
        static void m672a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$d */
    static final class C0212d {

        /* renamed from: a */
        Object f397a;

        /* renamed from: b */
        C1098h0 f398b;

        C0212d() {
        }
    }

    public ComponentActivity() {
        C2627d a = C2627d.m21343a(this);
        this.f381k = a;
        this.f383m = new OnBackPressedDispatcher(new C0209a());
        this.f385o = new AtomicInteger();
        this.f386p = new C0210b();
        this.f387q = new CopyOnWriteArrayList<>();
        this.f388r = new CopyOnWriteArrayList<>();
        this.f389s = new CopyOnWriteArrayList<>();
        this.f390t = new CopyOnWriteArrayList<>();
        this.f391u = new CopyOnWriteArrayList<>();
        if (mo491a() != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 19) {
                mo491a().mo3830a(new C1107k() {
                    /* renamed from: e */
                    public void mo527e(C1110m mVar, C1099i.C1101b bVar) {
                        if (bVar == C1099i.C1101b.ON_STOP) {
                            Window window = ComponentActivity.this.getWindow();
                            View peekDecorView = window != null ? window.peekDecorView() : null;
                            if (peekDecorView != null) {
                                C0211c.m672a(peekDecorView);
                            }
                        }
                    }
                });
            }
            mo491a().mo3830a(new C1107k() {
                /* renamed from: e */
                public void mo527e(C1110m mVar, C1099i.C1101b bVar) {
                    if (bVar == C1099i.C1101b.ON_DESTROY) {
                        ComponentActivity.this.f378h.mo12289b();
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.mo497k().mo3826a();
                        }
                    }
                }
            });
            mo491a().mo3830a(new C1107k() {
                /* renamed from: e */
                public void mo527e(C1110m mVar, C1099i.C1101b bVar) {
                    ComponentActivity.this.mo516q();
                    ComponentActivity.this.mo491a().mo3832c(this);
                }
            });
            a.mo12516c();
            C1131z.m4636a(this);
            if (19 <= i && i <= 23) {
                mo491a().mo3830a(new ImmLeaksCleaner(this));
            }
            mo496i().mo12513h("android:support:activity-result", new C0216c(this));
            mo515p(new C0215b(this));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    /* renamed from: r */
    private void m656r() {
        C1106j0.m4574a(getWindow().getDecorView(), this);
        C1108k0.m4576a(getWindow().getDecorView(), this);
        C2630f.m21350a(getWindow().getDecorView(), this);
        C0223j.m693a(getWindow().getDecorView(), this);
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ Bundle m657t() {
        Bundle bundle = new Bundle();
        this.f386p.mo560f(bundle);
        return bundle;
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void m658u(Context context) {
        Bundle b = mo496i().mo12508b("android:support:activity-result");
        if (b != null) {
            this.f386p.mo559e(b);
        }
    }

    /* renamed from: a */
    public C1099i mo491a() {
        return this.f380j;
    }

    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m656r();
        super.addContentView(view, layoutParams);
    }

    /* renamed from: f */
    public C0005a mo493f() {
        C0010d dVar = new C0010d();
        if (getApplication() != null) {
            dVar.mo16b(C1083e0.C1084a.f2972e, getApplication());
        }
        dVar.mo16b(C1131z.f3024a, this);
        dVar.mo16b(C1131z.f3025b, this);
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            dVar.mo16b(C1131z.f3026c, getIntent().getExtras());
        }
        return dVar;
    }

    /* renamed from: g */
    public final C0228d mo494g() {
        return this.f386p;
    }

    /* renamed from: h */
    public final OnBackPressedDispatcher mo495h() {
        return this.f383m;
    }

    /* renamed from: i */
    public final C2623c mo496i() {
        return this.f381k.mo12515b();
    }

    /* renamed from: k */
    public C1098h0 mo497k() {
        if (getApplication() != null) {
            mo516q();
            return this.f382l;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.f386p.mo558b(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        this.f383m.mo531c();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<C0738a<Configuration>> it = this.f387q.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.f381k.mo12517d(bundle);
        this.f378h.mo12290c(this);
        super.onCreate(bundle);
        C1125w.m4625g(this);
        int i = this.f384n;
        if (i != 0) {
            setContentView(i);
        }
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        this.f379i.mo2866a(menu, getMenuInflater());
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f379i.mo2868c(menuItem);
        }
        return false;
    }

    public void onMultiWindowModeChanged(boolean z) {
        Iterator<C0738a<C0561h>> it = this.f390t.iterator();
        while (it.hasNext()) {
            it.next().accept(new C0561h(z));
        }
    }

    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        Iterator<C0738a<C0561h>> it = this.f390t.iterator();
        while (it.hasNext()) {
            it.next().accept(new C0561h(z, configuration));
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<C0738a<Intent>> it = this.f389s.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    public void onPanelClosed(int i, Menu menu) {
        this.f379i.mo2867b(menu);
        super.onPanelClosed(i, menu);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        Iterator<C0738a<C0591p>> it = this.f391u.iterator();
        while (it.hasNext()) {
            it.next().accept(new C0591p(z));
        }
    }

    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        Iterator<C0738a<C0591p>> it = this.f391u.iterator();
        while (it.hasNext()) {
            it.next().accept(new C0591p(z, configuration));
        }
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        this.f379i.mo2869d(menu);
        return true;
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!this.f386p.mo558b(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) && Build.VERSION.SDK_INT >= 23) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        C0212d dVar;
        Object v = mo526v();
        C1098h0 h0Var = this.f382l;
        if (h0Var == null && (dVar = (C0212d) getLastNonConfigurationInstance()) != null) {
            h0Var = dVar.f398b;
        }
        if (h0Var == null && v == null) {
            return null;
        }
        C0212d dVar2 = new C0212d();
        dVar2.f397a = v;
        dVar2.f398b = h0Var;
        return dVar2;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        C1099i a = mo491a();
        if (a instanceof C1111n) {
            ((C1111n) a).mo3837o(C1099i.C1102c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f381k.mo12518e(bundle);
    }

    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<C0738a<Integer>> it = this.f388r.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    /* renamed from: p */
    public final void mo515p(C2464b bVar) {
        this.f378h.mo12288a(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo516q() {
        if (this.f382l == null) {
            C0212d dVar = (C0212d) getLastNonConfigurationInstance();
            if (dVar != null) {
                this.f382l = dVar.f398b;
            }
            if (this.f382l == null) {
                this.f382l = new C1098h0();
            }
        }
    }

    public void reportFullyDrawn() {
        try {
            if (C3293a.m24369h()) {
                C3293a.m24364c("reportFullyDrawn() for ComponentActivity");
            }
            int i = Build.VERSION.SDK_INT;
            if (i > 19 || (i == 19 && C0597a.m2446a(this, "android.permission.UPDATE_DEVICE_STATS") == 0)) {
                super.reportFullyDrawn();
            }
        } finally {
            C3293a.m24367f();
        }
    }

    /* renamed from: s */
    public void mo518s() {
        invalidateOptionsMenu();
    }

    public void setContentView(int i) {
        m656r();
        super.setContentView(i);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        m656r();
        super.setContentView(view);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m656r();
        super.setContentView(view, layoutParams);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Deprecated
    /* renamed from: v */
    public Object mo526v() {
        return null;
    }
}
