package androidx.appcompat.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: androidx.appcompat.view.b */
public abstract class C0299b {

    /* renamed from: f */
    private Object f747f;

    /* renamed from: g */
    private boolean f748g;

    /* renamed from: androidx.appcompat.view.b$a */
    public interface C0300a {
        /* renamed from: a */
        boolean mo729a(C0299b bVar, Menu menu);

        /* renamed from: b */
        void mo730b(C0299b bVar);

        /* renamed from: c */
        boolean mo731c(C0299b bVar, MenuItem menuItem);

        /* renamed from: d */
        boolean mo732d(C0299b bVar, Menu menu);
    }

    /* renamed from: c */
    public abstract void mo811c();

    /* renamed from: d */
    public abstract View mo812d();

    /* renamed from: e */
    public abstract Menu mo813e();

    /* renamed from: f */
    public abstract MenuInflater mo814f();

    /* renamed from: g */
    public abstract CharSequence mo815g();

    /* renamed from: h */
    public Object mo833h() {
        return this.f747f;
    }

    /* renamed from: i */
    public abstract CharSequence mo816i();

    /* renamed from: j */
    public boolean mo834j() {
        return this.f748g;
    }

    /* renamed from: k */
    public abstract void mo817k();

    /* renamed from: l */
    public abstract boolean mo818l();

    /* renamed from: m */
    public abstract void mo819m(View view);

    /* renamed from: n */
    public abstract void mo820n(int i);

    /* renamed from: o */
    public abstract void mo821o(CharSequence charSequence);

    /* renamed from: p */
    public void mo835p(Object obj) {
        this.f747f = obj;
    }

    /* renamed from: q */
    public abstract void mo822q(int i);

    /* renamed from: r */
    public abstract void mo823r(CharSequence charSequence);

    /* renamed from: s */
    public void mo824s(boolean z) {
        this.f748g = z;
    }
}
