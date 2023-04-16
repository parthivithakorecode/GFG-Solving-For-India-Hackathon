package p066io.flutter.embedding.android;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

@Deprecated
/* renamed from: io.flutter.embedding.android.b */
public final class C2900b implements C2955x {

    /* renamed from: a */
    private final Drawable f19662a;

    /* renamed from: b */
    private final ImageView.ScaleType f19663b;

    /* renamed from: c */
    private final long f19664c;

    /* renamed from: d */
    private C2902b f19665d;

    /* renamed from: io.flutter.embedding.android.b$a */
    class C2901a implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ Runnable f19666a;

        C2901a(Runnable runnable) {
            this.f19666a = runnable;
        }

        public void onAnimationCancel(Animator animator) {
            this.f19666a.run();
        }

        public void onAnimationEnd(Animator animator) {
            this.f19666a.run();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: io.flutter.embedding.android.b$b */
    public static class C2902b extends ImageView {
        public C2902b(Context context) {
            this(context, (AttributeSet) null, 0);
        }

        public C2902b(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }

        /* renamed from: a */
        public void mo13247a(Drawable drawable, ImageView.ScaleType scaleType) {
            setScaleType(scaleType);
            setImageDrawable(drawable);
        }

        public void setSplashDrawable(Drawable drawable) {
            mo13247a(drawable, ImageView.ScaleType.FIT_XY);
        }
    }

    public C2900b(Drawable drawable) {
        this(drawable, ImageView.ScaleType.FIT_XY, 500);
    }

    public C2900b(Drawable drawable, ImageView.ScaleType scaleType, long j) {
        this.f19662a = drawable;
        this.f19663b = scaleType;
        this.f19664c = j;
    }

    /* renamed from: a */
    public void mo13239a(Runnable runnable) {
        C2902b bVar = this.f19665d;
        if (bVar == null) {
            runnable.run();
        } else {
            bVar.animate().alpha(0.0f).setDuration(this.f19664c).setListener(new C2901a(runnable));
        }
    }

    /* renamed from: b */
    public /* synthetic */ boolean mo13240b() {
        return C2954w.m23017a(this);
    }

    /* renamed from: c */
    public View mo13241c(Context context, Bundle bundle) {
        C2902b bVar = new C2902b(context);
        this.f19665d = bVar;
        bVar.mo13247a(this.f19662a, this.f19663b);
        return this.f19665d;
    }

    /* renamed from: d */
    public /* synthetic */ Bundle mo13242d() {
        return C2954w.m23018b(this);
    }
}
