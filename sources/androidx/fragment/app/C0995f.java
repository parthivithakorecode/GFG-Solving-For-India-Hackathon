package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.core.p009os.C0678e;
import androidx.core.view.C0830v;
import androidx.fragment.app.C1045x;
import p158x.C4273a;
import p158x.C4274b;

/* renamed from: androidx.fragment.app.f */
class C0995f {

    /* renamed from: androidx.fragment.app.f$a */
    class C0996a implements C0678e.C0680b {

        /* renamed from: a */
        final /* synthetic */ Fragment f2674a;

        C0996a(Fragment fragment) {
            this.f2674a = fragment;
        }

        /* renamed from: a */
        public void mo2680a() {
            if (this.f2674a.mo3304n() != null) {
                View n = this.f2674a.mo3304n();
                this.f2674a.mo3309o1((View) null);
                n.clearAnimation();
            }
            this.f2674a.mo3318q1((Animator) null);
        }
    }

    /* renamed from: androidx.fragment.app.f$b */
    class C0997b implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2675a;

        /* renamed from: b */
        final /* synthetic */ Fragment f2676b;

        /* renamed from: c */
        final /* synthetic */ C1045x.C1052g f2677c;

        /* renamed from: d */
        final /* synthetic */ C0678e f2678d;

        /* renamed from: androidx.fragment.app.f$b$a */
        class C0998a implements Runnable {
            C0998a() {
            }

            public void run() {
                if (C0997b.this.f2676b.mo3304n() != null) {
                    C0997b.this.f2676b.mo3309o1((View) null);
                    C0997b bVar = C0997b.this;
                    bVar.f2677c.mo3634a(bVar.f2676b, bVar.f2678d);
                }
            }
        }

        C0997b(ViewGroup viewGroup, Fragment fragment, C1045x.C1052g gVar, C0678e eVar) {
            this.f2675a = viewGroup;
            this.f2676b = fragment;
            this.f2677c = gVar;
            this.f2678d = eVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.f2675a.post(new C0998a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.fragment.app.f$c */
    class C0999c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2680a;

        /* renamed from: b */
        final /* synthetic */ View f2681b;

        /* renamed from: c */
        final /* synthetic */ Fragment f2682c;

        /* renamed from: d */
        final /* synthetic */ C1045x.C1052g f2683d;

        /* renamed from: e */
        final /* synthetic */ C0678e f2684e;

        C0999c(ViewGroup viewGroup, View view, Fragment fragment, C1045x.C1052g gVar, C0678e eVar) {
            this.f2680a = viewGroup;
            this.f2681b = view;
            this.f2682c = fragment;
            this.f2683d = gVar;
            this.f2684e = eVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f2680a.endViewTransition(this.f2681b);
            Animator o = this.f2682c.mo3307o();
            this.f2682c.mo3318q1((Animator) null);
            if (o != null && this.f2680a.indexOfChild(this.f2681b) < 0) {
                this.f2683d.mo3634a(this.f2682c, this.f2684e);
            }
        }
    }

    /* renamed from: androidx.fragment.app.f$d */
    static class C1000d {

        /* renamed from: a */
        public final Animation f2685a;

        /* renamed from: b */
        public final Animator f2686b;

        C1000d(Animator animator) {
            this.f2685a = null;
            this.f2686b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        C1000d(Animation animation) {
            this.f2685a = animation;
            this.f2686b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* renamed from: androidx.fragment.app.f$e */
    static class C1001e extends AnimationSet implements Runnable {

        /* renamed from: f */
        private final ViewGroup f2687f;

        /* renamed from: g */
        private final View f2688g;

        /* renamed from: h */
        private boolean f2689h;

        /* renamed from: i */
        private boolean f2690i;

        /* renamed from: j */
        private boolean f2691j = true;

        C1001e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f2687f = viewGroup;
            this.f2688g = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            this.f2691j = true;
            if (this.f2689h) {
                return !this.f2690i;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f2689h = true;
                C0830v.m3313a(this.f2687f, this);
            }
            return true;
        }

        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f2691j = true;
            if (this.f2689h) {
                return !this.f2690i;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f2689h = true;
                C0830v.m3313a(this.f2687f, this);
            }
            return true;
        }

        public void run() {
            if (this.f2689h || !this.f2691j) {
                this.f2687f.endViewTransition(this.f2688g);
                this.f2690i = true;
                return;
            }
            this.f2691j = false;
            this.f2687f.post(this);
        }
    }

    /* renamed from: a */
    static void m4130a(Fragment fragment, C1000d dVar, C1045x.C1052g gVar) {
        View view = fragment.f2475M;
        ViewGroup viewGroup = fragment.f2474L;
        viewGroup.startViewTransition(view);
        C0678e eVar = new C0678e();
        eVar.mo2679c(new C0996a(fragment));
        gVar.mo3635b(fragment, eVar);
        if (dVar.f2685a != null) {
            C1001e eVar2 = new C1001e(dVar.f2685a, viewGroup, view);
            fragment.mo3309o1(fragment.f2475M);
            eVar2.setAnimationListener(new C0997b(viewGroup, fragment, gVar, eVar));
            fragment.f2475M.startAnimation(eVar2);
            return;
        }
        Animator animator = dVar.f2686b;
        fragment.mo3318q1(animator);
        animator.addListener(new C0999c(viewGroup, view, fragment, gVar, eVar));
        animator.setTarget(fragment.f2475M);
        animator.start();
    }

    /* renamed from: b */
    private static int m4131b(Fragment fragment, boolean z, boolean z2) {
        return z2 ? z ? fragment.mo3230F() : fragment.mo3232G() : z ? fragment.mo3319r() : fragment.mo3329u();
    }

    /* renamed from: c */
    static C1000d m4132c(Context context, Fragment fragment, boolean z, boolean z2) {
        int B = fragment.mo3222B();
        int b = m4131b(fragment, z, z2);
        boolean z3 = false;
        fragment.mo3315p1(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.f2474L;
        if (viewGroup != null) {
            int i = C4274b.visible_removing_fragment_view_tag;
            if (viewGroup.getTag(i) != null) {
                fragment.f2474L.setTag(i, (Object) null);
            }
        }
        ViewGroup viewGroup2 = fragment.f2474L;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation k0 = fragment.mo3297k0(B, z, b);
        if (k0 != null) {
            return new C1000d(k0);
        }
        Animator l0 = fragment.mo3300l0(B, z, b);
        if (l0 != null) {
            return new C1000d(l0);
        }
        if (b == 0 && B != 0) {
            b = m4133d(B, z);
        }
        if (b != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(b));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, b);
                    if (loadAnimation != null) {
                        return new C1000d(loadAnimation);
                    }
                    z3 = true;
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z3) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, b);
                    if (loadAnimator != null) {
                        return new C1000d(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, b);
                        if (loadAnimation2 != null) {
                            return new C1000d(loadAnimation2);
                        }
                    } else {
                        throw e2;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    private static int m4133d(int i, boolean z) {
        if (i == 4097) {
            return z ? C4273a.fragment_open_enter : C4273a.fragment_open_exit;
        }
        if (i == 4099) {
            return z ? C4273a.fragment_fade_enter : C4273a.fragment_fade_exit;
        }
        if (i != 8194) {
            return -1;
        }
        return z ? C4273a.fragment_close_enter : C4273a.fragment_close_exit;
    }
}
