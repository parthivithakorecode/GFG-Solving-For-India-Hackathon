package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: androidx.core.view.e0 */
public final class C0783e0 {

    /* renamed from: a */
    private final WeakReference<View> f2199a;

    /* renamed from: b */
    Runnable f2200b = null;

    /* renamed from: c */
    Runnable f2201c = null;

    /* renamed from: d */
    int f2202d = -1;

    /* renamed from: androidx.core.view.e0$a */
    class C0784a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0789f0 f2203a;

        /* renamed from: b */
        final /* synthetic */ View f2204b;

        C0784a(C0789f0 f0Var, View view) {
            this.f2203a = f0Var;
            this.f2204b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f2203a.mo1695a(this.f2204b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f2203a.mo723b(this.f2204b);
        }

        public void onAnimationStart(Animator animator) {
            this.f2203a.mo724c(this.f2204b);
        }
    }

    /* renamed from: androidx.core.view.e0$b */
    static class C0785b {
        /* renamed from: a */
        static ViewPropertyAnimator m3122a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    /* renamed from: androidx.core.view.e0$c */
    static class C0786c implements C0789f0 {

        /* renamed from: a */
        C0783e0 f2206a;

        /* renamed from: b */
        boolean f2207b;

        C0786c(C0783e0 e0Var) {
            this.f2206a = e0Var;
        }

        /* renamed from: a */
        public void mo1695a(View view) {
            Object tag = view.getTag(2113929216);
            C0789f0 f0Var = tag instanceof C0789f0 ? (C0789f0) tag : null;
            if (f0Var != null) {
                f0Var.mo1695a(view);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: androidx.core.view.f0} */
        /* JADX WARNING: Multi-variable type inference failed */
        @android.annotation.SuppressLint({"WrongConstant"})
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo723b(android.view.View r4) {
            /*
                r3 = this;
                androidx.core.view.e0 r0 = r3.f2206a
                int r0 = r0.f2202d
                r1 = -1
                r2 = 0
                if (r0 <= r1) goto L_0x000f
                r4.setLayerType(r0, r2)
                androidx.core.view.e0 r0 = r3.f2206a
                r0.f2202d = r1
            L_0x000f:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 16
                if (r0 >= r1) goto L_0x0019
                boolean r0 = r3.f2207b
                if (r0 != 0) goto L_0x0039
            L_0x0019:
                androidx.core.view.e0 r0 = r3.f2206a
                java.lang.Runnable r1 = r0.f2201c
                if (r1 == 0) goto L_0x0024
                r0.f2201c = r2
                r1.run()
            L_0x0024:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r1 = r0 instanceof androidx.core.view.C0789f0
                if (r1 == 0) goto L_0x0031
                r2 = r0
                androidx.core.view.f0 r2 = (androidx.core.view.C0789f0) r2
            L_0x0031:
                if (r2 == 0) goto L_0x0036
                r2.mo723b(r4)
            L_0x0036:
                r4 = 1
                r3.f2207b = r4
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.C0783e0.C0786c.mo723b(android.view.View):void");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: androidx.core.view.f0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo724c(android.view.View r4) {
            /*
                r3 = this;
                r0 = 0
                r3.f2207b = r0
                androidx.core.view.e0 r0 = r3.f2206a
                int r0 = r0.f2202d
                r1 = 0
                r2 = -1
                if (r0 <= r2) goto L_0x000f
                r0 = 2
                r4.setLayerType(r0, r1)
            L_0x000f:
                androidx.core.view.e0 r0 = r3.f2206a
                java.lang.Runnable r2 = r0.f2200b
                if (r2 == 0) goto L_0x001a
                r0.f2200b = r1
                r2.run()
            L_0x001a:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r2 = r0 instanceof androidx.core.view.C0789f0
                if (r2 == 0) goto L_0x0027
                r1 = r0
                androidx.core.view.f0 r1 = (androidx.core.view.C0789f0) r1
            L_0x0027:
                if (r1 == 0) goto L_0x002c
                r1.mo724c(r4)
            L_0x002c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.C0783e0.C0786c.mo724c(android.view.View):void");
        }
    }

    C0783e0(View view) {
        this.f2199a = new WeakReference<>(view);
    }

    /* renamed from: i */
    private void m3111i(View view, C0789f0 f0Var) {
        if (f0Var != null) {
            view.animate().setListener(new C0784a(f0Var, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    /* renamed from: b */
    public C0783e0 mo2853b(float f) {
        View view = (View) this.f2199a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: c */
    public void mo2854c() {
        View view = (View) this.f2199a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: d */
    public long mo2855d() {
        View view = (View) this.f2199a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    /* renamed from: f */
    public C0783e0 mo2856f(long j) {
        View view = (View) this.f2199a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: g */
    public C0783e0 mo2857g(Interpolator interpolator) {
        View view = (View) this.f2199a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: h */
    public C0783e0 mo2858h(C0789f0 f0Var) {
        View view = (View) this.f2199a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT < 16) {
                view.setTag(2113929216, f0Var);
                f0Var = new C0786c(this);
            }
            m3111i(view, f0Var);
        }
        return this;
    }

    /* renamed from: j */
    public C0783e0 mo2859j(long j) {
        View view = (View) this.f2199a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: k */
    public C0783e0 mo2860k(C0794h0 h0Var) {
        View view = (View) this.f2199a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            C0781d0 d0Var = null;
            if (h0Var != null) {
                d0Var = new C0781d0(h0Var, view);
            }
            C0785b.m3122a(view.animate(), d0Var);
        }
        return this;
    }

    /* renamed from: l */
    public void mo2861l() {
        View view = (View) this.f2199a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: m */
    public C0783e0 mo2862m(float f) {
        View view = (View) this.f2199a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
