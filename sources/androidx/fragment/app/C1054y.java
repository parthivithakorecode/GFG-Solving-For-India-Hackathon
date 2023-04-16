package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p009os.C0678e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.fragment.app.y */
class C1054y extends C1060z {

    /* renamed from: androidx.fragment.app.y$a */
    class C1055a extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f2885a;

        C1055a(Rect rect) {
            this.f2885a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            return this.f2885a;
        }
    }

    /* renamed from: androidx.fragment.app.y$b */
    class C1056b implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ View f2887a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f2888b;

        C1056b(View view, ArrayList arrayList) {
            this.f2887a = view;
            this.f2888b = arrayList;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f2887a.setVisibility(8);
            int size = this.f2888b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f2888b.get(i)).setVisibility(0);
            }
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* renamed from: androidx.fragment.app.y$c */
    class C1057c implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Object f2890a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f2891b;

        /* renamed from: c */
        final /* synthetic */ Object f2892c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f2893d;

        /* renamed from: e */
        final /* synthetic */ Object f2894e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f2895f;

        C1057c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f2890a = obj;
            this.f2891b = arrayList;
            this.f2892c = obj2;
            this.f2893d = arrayList2;
            this.f2894e = obj3;
            this.f2895f = arrayList3;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            Object obj = this.f2890a;
            if (obj != null) {
                C1054y.this.mo3747q(obj, this.f2891b, (ArrayList<View>) null);
            }
            Object obj2 = this.f2892c;
            if (obj2 != null) {
                C1054y.this.mo3747q(obj2, this.f2893d, (ArrayList<View>) null);
            }
            Object obj3 = this.f2894e;
            if (obj3 != null) {
                C1054y.this.mo3747q(obj3, this.f2895f, (ArrayList<View>) null);
            }
        }
    }

    /* renamed from: androidx.fragment.app.y$d */
    class C1058d implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Runnable f2897a;

        C1058d(Runnable runnable) {
            this.f2897a = runnable;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            this.f2897a.run();
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.fragment.app.y$e */
    class C1059e extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f2899a;

        C1059e(Rect rect) {
            this.f2899a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f2899a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f2899a;
        }
    }

    C1054y() {
    }

    /* renamed from: C */
    private static boolean m4437C(Transition transition) {
        return !C1060z.m4458l(transition.getTargetIds()) || !C1060z.m4458l(transition.getTargetNames()) || !C1060z.m4458l(transition.getTargetTypes());
    }

    /* renamed from: A */
    public void mo3737A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo3747q(transitionSet, arrayList, arrayList2);
        }
    }

    /* renamed from: B */
    public Object mo3738B(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* renamed from: a */
    public void mo3739a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    /* renamed from: b */
    public void mo3740b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    mo3740b(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!m4437C(transition) && C1060z.m4458l(transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo3741c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    /* renamed from: e */
    public boolean mo3742e(Object obj) {
        return obj instanceof Transition;
    }

    /* renamed from: g */
    public Object mo3743g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    /* renamed from: m */
    public Object mo3744m(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    /* renamed from: n */
    public Object mo3745n(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    /* renamed from: p */
    public void mo3746p(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    /* renamed from: q */
    public void mo3747q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo3747q(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m4437C(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                transition.addTarget(arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }

    /* renamed from: r */
    public void mo3748r(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C1056b(view, arrayList));
    }

    /* renamed from: t */
    public void mo3749t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new C1057c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    /* renamed from: u */
    public void mo3750u(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C1059e(rect));
        }
    }

    /* renamed from: v */
    public void mo3751v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            mo3773k(view, rect);
            ((Transition) obj).setEpicenterCallback(new C1055a(rect));
        }
    }

    /* renamed from: w */
    public void mo3752w(Fragment fragment, Object obj, C0678e eVar, Runnable runnable) {
        ((Transition) obj).addListener(new C1058d(runnable));
    }

    /* renamed from: z */
    public void mo3753z(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1060z.m4455d(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo3740b(transitionSet, arrayList);
    }
}
