package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.core.util.C0743e;
import androidx.lifecycle.C1103i0;

/* renamed from: androidx.fragment.app.i */
public class C1004i {

    /* renamed from: a */
    private final C1006k<?> f2696a;

    private C1004i(C1006k<?> kVar) {
        this.f2696a = kVar;
    }

    /* renamed from: b */
    public static C1004i m4139b(C1006k<?> kVar) {
        return new C1004i((C1006k) C0743e.m2959g(kVar, "callbacks == null"));
    }

    /* renamed from: a */
    public void mo3505a(Fragment fragment) {
        C1006k<?> kVar = this.f2696a;
        kVar.f2702j.mo3608j(kVar, kVar, fragment);
    }

    /* renamed from: c */
    public void mo3506c() {
        this.f2696a.f2702j.mo3629y();
    }

    /* renamed from: d */
    public void mo3507d(Configuration configuration) {
        this.f2696a.f2702j.mo3550A(configuration);
    }

    /* renamed from: e */
    public boolean mo3508e(MenuItem menuItem) {
        return this.f2696a.f2702j.mo3552B(menuItem);
    }

    /* renamed from: f */
    public void mo3509f() {
        this.f2696a.f2702j.mo3554C();
    }

    /* renamed from: g */
    public boolean mo3510g(Menu menu, MenuInflater menuInflater) {
        return this.f2696a.f2702j.mo3556D(menu, menuInflater);
    }

    /* renamed from: h */
    public void mo3511h() {
        this.f2696a.f2702j.mo3558E();
    }

    /* renamed from: i */
    public void mo3512i() {
        this.f2696a.f2702j.mo3560G();
    }

    /* renamed from: j */
    public void mo3513j(boolean z) {
        this.f2696a.f2702j.mo3562H(z);
    }

    /* renamed from: k */
    public boolean mo3514k(MenuItem menuItem) {
        return this.f2696a.f2702j.mo3566J(menuItem);
    }

    /* renamed from: l */
    public void mo3515l(Menu menu) {
        this.f2696a.f2702j.mo3568K(menu);
    }

    /* renamed from: m */
    public void mo3516m() {
        this.f2696a.f2702j.mo3570M();
    }

    /* renamed from: n */
    public void mo3517n(boolean z) {
        this.f2696a.f2702j.mo3572N(z);
    }

    /* renamed from: o */
    public boolean mo3518o(Menu menu) {
        return this.f2696a.f2702j.mo3574O(menu);
    }

    /* renamed from: p */
    public void mo3519p() {
        this.f2696a.f2702j.mo3578Q();
    }

    /* renamed from: q */
    public void mo3520q() {
        this.f2696a.f2702j.mo3580R();
    }

    /* renamed from: r */
    public void mo3521r() {
        this.f2696a.f2702j.mo3583T();
    }

    /* renamed from: s */
    public boolean mo3522s() {
        return this.f2696a.f2702j.mo3591a0(true);
    }

    /* renamed from: t */
    public C1011n mo3523t() {
        return this.f2696a.f2702j;
    }

    /* renamed from: u */
    public void mo3524u() {
        this.f2696a.f2702j.mo3577P0();
    }

    /* renamed from: v */
    public View mo3525v(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f2696a.f2702j.mo3621t0().onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: w */
    public void mo3526w(Parcelable parcelable) {
        C1006k<?> kVar = this.f2696a;
        if (kVar instanceof C1103i0) {
            kVar.f2702j.mo3593b1(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    /* renamed from: x */
    public Parcelable mo3527x() {
        return this.f2696a.f2702j.mo3594d1();
    }
}
