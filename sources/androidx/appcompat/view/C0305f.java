package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.C0299b;
import androidx.appcompat.view.menu.C0336j;
import androidx.appcompat.view.menu.C0350o;
import java.util.ArrayList;
import p102o.C3814g;
import p116q.C3933a;
import p116q.C3934b;

/* renamed from: androidx.appcompat.view.f */
public class C0305f extends ActionMode {

    /* renamed from: a */
    final Context f762a;

    /* renamed from: b */
    final C0299b f763b;

    /* renamed from: androidx.appcompat.view.f$a */
    public static class C0306a implements C0299b.C0300a {

        /* renamed from: a */
        final ActionMode.Callback f764a;

        /* renamed from: b */
        final Context f765b;

        /* renamed from: c */
        final ArrayList<C0305f> f766c = new ArrayList<>();

        /* renamed from: d */
        final C3814g<Menu, Menu> f767d = new C3814g<>();

        public C0306a(Context context, ActionMode.Callback callback) {
            this.f765b = context;
            this.f764a = callback;
        }

        /* renamed from: f */
        private Menu m1111f(Menu menu) {
            Menu menu2 = this.f767d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            C0350o oVar = new C0350o(this.f765b, (C3933a) menu);
            this.f767d.put(menu, oVar);
            return oVar;
        }

        /* renamed from: a */
        public boolean mo729a(C0299b bVar, Menu menu) {
            return this.f764a.onPrepareActionMode(mo864e(bVar), m1111f(menu));
        }

        /* renamed from: b */
        public void mo730b(C0299b bVar) {
            this.f764a.onDestroyActionMode(mo864e(bVar));
        }

        /* renamed from: c */
        public boolean mo731c(C0299b bVar, MenuItem menuItem) {
            return this.f764a.onActionItemClicked(mo864e(bVar), new C0336j(this.f765b, (C3934b) menuItem));
        }

        /* renamed from: d */
        public boolean mo732d(C0299b bVar, Menu menu) {
            return this.f764a.onCreateActionMode(mo864e(bVar), m1111f(menu));
        }

        /* renamed from: e */
        public ActionMode mo864e(C0299b bVar) {
            int size = this.f766c.size();
            for (int i = 0; i < size; i++) {
                C0305f fVar = this.f766c.get(i);
                if (fVar != null && fVar.f763b == bVar) {
                    return fVar;
                }
            }
            C0305f fVar2 = new C0305f(this.f765b, bVar);
            this.f766c.add(fVar2);
            return fVar2;
        }
    }

    public C0305f(Context context, C0299b bVar) {
        this.f762a = context;
        this.f763b = bVar;
    }

    public void finish() {
        this.f763b.mo811c();
    }

    public View getCustomView() {
        return this.f763b.mo812d();
    }

    public Menu getMenu() {
        return new C0350o(this.f762a, (C3933a) this.f763b.mo813e());
    }

    public MenuInflater getMenuInflater() {
        return this.f763b.mo814f();
    }

    public CharSequence getSubtitle() {
        return this.f763b.mo815g();
    }

    public Object getTag() {
        return this.f763b.mo833h();
    }

    public CharSequence getTitle() {
        return this.f763b.mo816i();
    }

    public boolean getTitleOptionalHint() {
        return this.f763b.mo834j();
    }

    public void invalidate() {
        this.f763b.mo817k();
    }

    public boolean isTitleOptional() {
        return this.f763b.mo818l();
    }

    public void setCustomView(View view) {
        this.f763b.mo819m(view);
    }

    public void setSubtitle(int i) {
        this.f763b.mo820n(i);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f763b.mo821o(charSequence);
    }

    public void setTag(Object obj) {
        this.f763b.mo835p(obj);
    }

    public void setTitle(int i) {
        this.f763b.mo822q(i);
    }

    public void setTitle(CharSequence charSequence) {
        this.f763b.mo823r(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.f763b.mo824s(z);
    }
}
