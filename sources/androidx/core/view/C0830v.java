package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

/* renamed from: androidx.core.view.v */
public final class C0830v implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: f */
    private final View f2264f;

    /* renamed from: g */
    private ViewTreeObserver f2265g;

    /* renamed from: h */
    private final Runnable f2266h;

    private C0830v(View view, Runnable runnable) {
        this.f2264f = view;
        this.f2265g = view.getViewTreeObserver();
        this.f2266h = runnable;
    }

    /* renamed from: a */
    public static C0830v m3313a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        Objects.requireNonNull(runnable, "runnable == null");
        C0830v vVar = new C0830v(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(vVar);
        view.addOnAttachStateChangeListener(vVar);
        return vVar;
    }

    /* renamed from: b */
    public void mo2953b() {
        (this.f2265g.isAlive() ? this.f2265g : this.f2264f.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f2264f.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        mo2953b();
        this.f2266h.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f2265g = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        mo2953b();
    }
}
