package androidx.core.view;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: androidx.core.view.d0 */
public final /* synthetic */ class C0781d0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C0794h0 f2197a;

    /* renamed from: b */
    public final /* synthetic */ View f2198b;

    public /* synthetic */ C0781d0(C0794h0 h0Var, View view) {
        this.f2197a = h0Var;
        this.f2198b = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f2197a.mo810a(this.f2198b);
    }
}
