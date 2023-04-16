package p061i1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: i1.r */
final class C2819r extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C2821t f19510a;

    C2819r(C2821t tVar) {
        this.f19510a = tVar;
    }

    /* renamed from: a */
    private final void m22291a(boolean z) {
        this.f19510a.setClickable(z);
        this.f19510a.f19515f.setClickable(z);
    }

    public final void onAnimationCancel(Animator animator) {
        m22291a(true);
    }

    public final void onAnimationEnd(Animator animator) {
        m22291a(true);
    }

    public final void onAnimationStart(Animator animator) {
        m22291a(false);
    }
}
