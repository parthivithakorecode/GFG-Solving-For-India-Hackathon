package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.C0299b;
import androidx.appcompat.widget.C0464i1;
import androidx.core.app.C0539b;
import androidx.core.app.C0562i;
import androidx.core.app.C0595s;
import androidx.fragment.app.C0990e;
import androidx.lifecycle.C1106j0;
import androidx.lifecycle.C1108k0;
import p024d.C2464b;
import p046g0.C2623c;
import p046g0.C2630f;

/* renamed from: androidx.appcompat.app.c */
public class C0252c extends C0990e implements C0255d, C0595s.C0596a {

    /* renamed from: A */
    private C0256e f560A;

    /* renamed from: B */
    private Resources f561B;

    /* renamed from: androidx.appcompat.app.c$a */
    class C0253a implements C2623c.C2626c {
        C0253a() {
        }

        /* renamed from: a */
        public Bundle mo534a() {
            Bundle bundle = new Bundle();
            C0252c.this.mo629F().mo679u(bundle);
            return bundle;
        }
    }

    /* renamed from: androidx.appcompat.app.c$b */
    class C0254b implements C2464b {
        C0254b() {
        }

        /* renamed from: a */
        public void mo533a(Context context) {
            C0256e F = C0252c.this.mo629F();
            F.mo672n();
            F.mo675q(C0252c.this.mo496i().mo12508b("androidx:appcompat"));
        }
    }

    public C0252c() {
        m776H();
    }

    /* renamed from: H */
    private void m776H() {
        mo496i().mo12513h("androidx:appcompat", new C0253a());
        mo515p(new C0254b());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = getWindow();
     */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m777N(android.view.KeyEvent r3) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L_0x003e
            boolean r0 = r3.isCtrlPressed()
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getMetaState()
            boolean r0 = android.view.KeyEvent.metaStateHasNoModifiers(r0)
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getRepeatCount()
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getKeyCode()
            boolean r0 = android.view.KeyEvent.isModifierKey(r0)
            if (r0 != 0) goto L_0x003e
            android.view.Window r0 = r2.getWindow()
            if (r0 == 0) goto L_0x003e
            android.view.View r1 = r0.getDecorView()
            if (r1 == 0) goto L_0x003e
            android.view.View r0 = r0.getDecorView()
            boolean r3 = r0.dispatchKeyShortcutEvent(r3)
            if (r3 == 0) goto L_0x003e
            r3 = 1
            return r3
        L_0x003e:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0252c.m777N(android.view.KeyEvent):boolean");
    }

    /* renamed from: r */
    private void m778r() {
        C1106j0.m4574a(getWindow().getDecorView(), this);
        C1108k0.m4576a(getWindow().getDecorView(), this);
        C2630f.m21350a(getWindow().getDecorView(), this);
    }

    /* renamed from: E */
    public void mo628E() {
        mo629F().mo673o();
    }

    /* renamed from: F */
    public C0256e mo629F() {
        if (this.f560A == null) {
            this.f560A = C0256e.m799g(this, this);
        }
        return this.f560A;
    }

    /* renamed from: G */
    public C0246a mo630G() {
        return mo629F().mo671m();
    }

    /* renamed from: I */
    public void mo631I(C0595s sVar) {
        sVar.mo2531i(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo632J(int i) {
    }

    /* renamed from: K */
    public void mo633K(C0595s sVar) {
    }

    @Deprecated
    /* renamed from: L */
    public void mo634L() {
    }

    /* renamed from: M */
    public boolean mo635M() {
        Intent j = mo647j();
        if (j == null) {
            return false;
        }
        if (mo637P(j)) {
            C0595s k = C0595s.m2439k(this);
            mo631I(k);
            mo633K(k);
            k.mo2534l();
            try {
                C0539b.m2179l(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            mo636O(j);
            return true;
        }
    }

    /* renamed from: O */
    public void mo636O(Intent intent) {
        C0562i.m2226e(this, intent);
    }

    /* renamed from: P */
    public boolean mo637P(Intent intent) {
        return C0562i.m2227f(this, intent);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m778r();
        mo629F().mo665d(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(mo629F().mo667f(context));
    }

    public void closeOptionsMenu() {
        C0246a G = mo630G();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (G == null || !G.mo595f()) {
            super.closeOptionsMenu();
        }
    }

    /* renamed from: d */
    public void mo640d(C0299b bVar) {
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C0246a G = mo630G();
        if (keyCode != 82 || G == null || !G.mo604o(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* renamed from: e */
    public void mo642e(C0299b bVar) {
    }

    public <T extends View> T findViewById(int i) {
        return mo629F().mo668i(i);
    }

    public MenuInflater getMenuInflater() {
        return mo629F().mo670l();
    }

    public Resources getResources() {
        if (this.f561B == null && C0464i1.m1911c()) {
            this.f561B = new C0464i1(this, super.getResources());
        }
        Resources resources = this.f561B;
        return resources == null ? super.getResources() : resources;
    }

    public void invalidateOptionsMenu() {
        mo629F().mo673o();
    }

    /* renamed from: j */
    public Intent mo647j() {
        return C0562i.m2222a(this);
    }

    /* renamed from: l */
    public C0299b mo648l(C0299b.C0300a aVar) {
        return null;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo629F().mo674p(configuration);
        if (this.f561B != null) {
            this.f561B.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    public void onContentChanged() {
        mo634L();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        mo629F().mo676r();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (m777N(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        C0246a G = mo630G();
        if (menuItem.getItemId() != 16908332 || G == null || (G.mo598i() & 4) == 0) {
            return false;
        }
        return mo635M();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        mo629F().mo677s(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        mo629F().mo678t();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        mo629F().mo680v();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo629F().mo681w();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        mo629F().mo664E(charSequence);
    }

    public void openOptionsMenu() {
        C0246a G = mo630G();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (G == null || !G.mo605p()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i) {
        m778r();
        mo629F().mo660A(i);
    }

    public void setContentView(View view) {
        m778r();
        mo629F().mo661B(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m778r();
        mo629F().mo662C(view, layoutParams);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        mo629F().mo663D(i);
    }
}
