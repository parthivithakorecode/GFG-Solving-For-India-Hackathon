package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.C0299b;
import androidx.appcompat.view.menu.C0330g;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.view.e */
public class C0304e extends C0299b implements C0330g.C0331a {

    /* renamed from: h */
    private Context f755h;

    /* renamed from: i */
    private ActionBarContextView f756i;

    /* renamed from: j */
    private C0299b.C0300a f757j;

    /* renamed from: k */
    private WeakReference<View> f758k;

    /* renamed from: l */
    private boolean f759l;

    /* renamed from: m */
    private boolean f760m;

    /* renamed from: n */
    private C0330g f761n;

    public C0304e(Context context, ActionBarContextView actionBarContextView, C0299b.C0300a aVar, boolean z) {
        this.f755h = context;
        this.f756i = actionBarContextView;
        this.f757j = aVar;
        C0330g S = new C0330g(actionBarContextView.getContext()).mo1074S(1);
        this.f761n = S;
        S.mo1073R(this);
        this.f760m = z;
    }

    /* renamed from: a */
    public boolean mo698a(C0330g gVar, MenuItem menuItem) {
        return this.f757j.mo731c(this, menuItem);
    }

    /* renamed from: b */
    public void mo700b(C0330g gVar) {
        mo817k();
        this.f756i.mo1356l();
    }

    /* renamed from: c */
    public void mo811c() {
        if (!this.f759l) {
            this.f759l = true;
            this.f757j.mo730b(this);
        }
    }

    /* renamed from: d */
    public View mo812d() {
        WeakReference<View> weakReference = this.f758k;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: e */
    public Menu mo813e() {
        return this.f761n;
    }

    /* renamed from: f */
    public MenuInflater mo814f() {
        return new C0307g(this.f756i.getContext());
    }

    /* renamed from: g */
    public CharSequence mo815g() {
        return this.f756i.getSubtitle();
    }

    /* renamed from: i */
    public CharSequence mo816i() {
        return this.f756i.getTitle();
    }

    /* renamed from: k */
    public void mo817k() {
        this.f757j.mo729a(this, this.f761n);
    }

    /* renamed from: l */
    public boolean mo818l() {
        return this.f756i.mo1354j();
    }

    /* renamed from: m */
    public void mo819m(View view) {
        this.f756i.setCustomView(view);
        this.f758k = view != null ? new WeakReference<>(view) : null;
    }

    /* renamed from: n */
    public void mo820n(int i) {
        mo821o(this.f755h.getString(i));
    }

    /* renamed from: o */
    public void mo821o(CharSequence charSequence) {
        this.f756i.setSubtitle(charSequence);
    }

    /* renamed from: q */
    public void mo822q(int i) {
        mo823r(this.f755h.getString(i));
    }

    /* renamed from: r */
    public void mo823r(CharSequence charSequence) {
        this.f756i.setTitle(charSequence);
    }

    /* renamed from: s */
    public void mo824s(boolean z) {
        super.mo824s(z);
        this.f756i.setTitleOptional(z);
    }
}
