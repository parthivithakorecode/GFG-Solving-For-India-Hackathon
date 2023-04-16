package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: androidx.core.view.b */
public abstract class C0764b {

    /* renamed from: a */
    private final Context f2179a;

    /* renamed from: b */
    private C0765a f2180b;

    /* renamed from: c */
    private C0766b f2181c;

    /* renamed from: androidx.core.view.b$a */
    public interface C0765a {
    }

    /* renamed from: androidx.core.view.b$b */
    public interface C0766b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public C0764b(Context context) {
        this.f2179a = context;
    }

    /* renamed from: a */
    public boolean mo1251a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo1255b() {
        return true;
    }

    /* renamed from: c */
    public abstract View mo1252c();

    /* renamed from: d */
    public View mo1256d(MenuItem menuItem) {
        return mo1252c();
    }

    /* renamed from: e */
    public boolean mo1253e() {
        return false;
    }

    /* renamed from: f */
    public void mo1254f(SubMenu subMenu) {
    }

    /* renamed from: g */
    public boolean mo1257g() {
        return false;
    }

    /* renamed from: h */
    public void mo2824h() {
        this.f2181c = null;
        this.f2180b = null;
    }

    /* renamed from: i */
    public void mo2825i(C0765a aVar) {
        this.f2180b = aVar;
    }

    /* renamed from: j */
    public void mo1258j(C0766b bVar) {
        if (!(this.f2181c == null || bVar == null)) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f2181c = bVar;
    }
}
