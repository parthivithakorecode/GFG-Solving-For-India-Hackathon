package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.p009os.C0678e;
import androidx.core.util.C0743e;
import androidx.core.view.C0767b0;
import androidx.core.view.C0830v;
import androidx.core.view.C0833y;
import androidx.fragment.app.C0974c0;
import androidx.fragment.app.C0995f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p102o.C3801a;

/* renamed from: androidx.fragment.app.c */
class C0959c extends C0974c0 {

    /* renamed from: androidx.fragment.app.c$a */
    static /* synthetic */ class C0960a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2573a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.fragment.app.c0$e$c[] r0 = androidx.fragment.app.C0974c0.C0979e.C0982c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2573a = r0
                androidx.fragment.app.c0$e$c r1 = androidx.fragment.app.C0974c0.C0979e.C0982c.GONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2573a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.c0$e$c r1 = androidx.fragment.app.C0974c0.C0979e.C0982c.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2573a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.c0$e$c r1 = androidx.fragment.app.C0974c0.C0979e.C0982c.REMOVED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2573a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.fragment.app.c0$e$c r1 = androidx.fragment.app.C0974c0.C0979e.C0982c.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0959c.C0960a.<clinit>():void");
        }
    }

    /* renamed from: androidx.fragment.app.c$b */
    class C0961b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ List f2574f;

        /* renamed from: g */
        final /* synthetic */ C0974c0.C0979e f2575g;

        C0961b(List list, C0974c0.C0979e eVar) {
            this.f2574f = list;
            this.f2575g = eVar;
        }

        public void run() {
            if (this.f2574f.contains(this.f2575g)) {
                this.f2574f.remove(this.f2575g);
                C0959c.this.mo3393s(this.f2575g);
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$c */
    class C0962c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2577a;

        /* renamed from: b */
        final /* synthetic */ View f2578b;

        /* renamed from: c */
        final /* synthetic */ boolean f2579c;

        /* renamed from: d */
        final /* synthetic */ C0974c0.C0979e f2580d;

        /* renamed from: e */
        final /* synthetic */ C0971k f2581e;

        C0962c(ViewGroup viewGroup, View view, boolean z, C0974c0.C0979e eVar, C0971k kVar) {
            this.f2577a = viewGroup;
            this.f2578b = view;
            this.f2579c = z;
            this.f2580d = eVar;
            this.f2581e = kVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f2577a.endViewTransition(this.f2578b);
            if (this.f2579c) {
                this.f2580d.mo3435e().mo3443b(this.f2578b);
            }
            this.f2581e.mo3408a();
        }
    }

    /* renamed from: androidx.fragment.app.c$d */
    class C0963d implements C0678e.C0680b {

        /* renamed from: a */
        final /* synthetic */ Animator f2583a;

        C0963d(Animator animator) {
            this.f2583a = animator;
        }

        /* renamed from: a */
        public void mo2680a() {
            this.f2583a.end();
        }
    }

    /* renamed from: androidx.fragment.app.c$e */
    class C0964e implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2585a;

        /* renamed from: b */
        final /* synthetic */ View f2586b;

        /* renamed from: c */
        final /* synthetic */ C0971k f2587c;

        /* renamed from: androidx.fragment.app.c$e$a */
        class C0965a implements Runnable {
            C0965a() {
            }

            public void run() {
                C0964e eVar = C0964e.this;
                eVar.f2585a.endViewTransition(eVar.f2586b);
                C0964e.this.f2587c.mo3408a();
            }
        }

        C0964e(ViewGroup viewGroup, View view, C0971k kVar) {
            this.f2585a = viewGroup;
            this.f2586b = view;
            this.f2587c = kVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.f2585a.post(new C0965a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.fragment.app.c$f */
    class C0966f implements C0678e.C0680b {

        /* renamed from: a */
        final /* synthetic */ View f2590a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f2591b;

        /* renamed from: c */
        final /* synthetic */ C0971k f2592c;

        C0966f(View view, ViewGroup viewGroup, C0971k kVar) {
            this.f2590a = view;
            this.f2591b = viewGroup;
            this.f2592c = kVar;
        }

        /* renamed from: a */
        public void mo2680a() {
            this.f2590a.clearAnimation();
            this.f2591b.endViewTransition(this.f2590a);
            this.f2592c.mo3408a();
        }
    }

    /* renamed from: androidx.fragment.app.c$g */
    class C0967g implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C0974c0.C0979e f2594f;

        /* renamed from: g */
        final /* synthetic */ C0974c0.C0979e f2595g;

        /* renamed from: h */
        final /* synthetic */ boolean f2596h;

        /* renamed from: i */
        final /* synthetic */ C3801a f2597i;

        C0967g(C0974c0.C0979e eVar, C0974c0.C0979e eVar2, boolean z, C3801a aVar) {
            this.f2594f = eVar;
            this.f2595g = eVar2;
            this.f2596h = z;
            this.f2597i = aVar;
        }

        public void run() {
            C1045x.m4414f(this.f2594f.mo3436f(), this.f2595g.mo3436f(), this.f2596h, this.f2597i, false);
        }
    }

    /* renamed from: androidx.fragment.app.c$h */
    class C0968h implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C1060z f2599f;

        /* renamed from: g */
        final /* synthetic */ View f2600g;

        /* renamed from: h */
        final /* synthetic */ Rect f2601h;

        C0968h(C1060z zVar, View view, Rect rect) {
            this.f2599f = zVar;
            this.f2600g = view;
            this.f2601h = rect;
        }

        public void run() {
            this.f2599f.mo3773k(this.f2600g, this.f2601h);
        }
    }

    /* renamed from: androidx.fragment.app.c$i */
    class C0969i implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f2603f;

        C0969i(ArrayList arrayList) {
            this.f2603f = arrayList;
        }

        public void run() {
            C1045x.m4407A(this.f2603f, 4);
        }
    }

    /* renamed from: androidx.fragment.app.c$j */
    class C0970j implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C0973m f2605f;

        C0970j(C0973m mVar) {
            this.f2605f = mVar;
        }

        public void run() {
            this.f2605f.mo3408a();
        }
    }

    /* renamed from: androidx.fragment.app.c$k */
    private static class C0971k extends C0972l {

        /* renamed from: c */
        private boolean f2607c;

        /* renamed from: d */
        private boolean f2608d = false;

        /* renamed from: e */
        private C0995f.C1000d f2609e;

        C0971k(C0974c0.C0979e eVar, C0678e eVar2, boolean z) {
            super(eVar, eVar2);
            this.f2607c = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C0995f.C1000d mo3407e(Context context) {
            if (this.f2608d) {
                return this.f2609e;
            }
            C0995f.C1000d c = C0995f.m4132c(context, mo3409b().mo3436f(), mo3409b().mo3435e() == C0974c0.C0979e.C0982c.VISIBLE, this.f2607c);
            this.f2609e = c;
            this.f2608d = true;
            return c;
        }
    }

    /* renamed from: androidx.fragment.app.c$l */
    private static class C0972l {

        /* renamed from: a */
        private final C0974c0.C0979e f2610a;

        /* renamed from: b */
        private final C0678e f2611b;

        C0972l(C0974c0.C0979e eVar, C0678e eVar2) {
            this.f2610a = eVar;
            this.f2611b = eVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3408a() {
            this.f2610a.mo3434d(this.f2611b);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0974c0.C0979e mo3409b() {
            return this.f2610a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C0678e mo3410c() {
            return this.f2611b;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
            r2 = androidx.fragment.app.C0974c0.C0979e.C0982c.VISIBLE;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo3411d() {
            /*
                r3 = this;
                androidx.fragment.app.c0$e r0 = r3.f2610a
                androidx.fragment.app.Fragment r0 = r0.mo3436f()
                android.view.View r0 = r0.f2475M
                androidx.fragment.app.c0$e$c r0 = androidx.fragment.app.C0974c0.C0979e.C0982c.m4076e(r0)
                androidx.fragment.app.c0$e r1 = r3.f2610a
                androidx.fragment.app.c0$e$c r1 = r1.mo3435e()
                if (r0 == r1) goto L_0x001d
                androidx.fragment.app.c0$e$c r2 = androidx.fragment.app.C0974c0.C0979e.C0982c.VISIBLE
                if (r0 == r2) goto L_0x001b
                if (r1 == r2) goto L_0x001b
                goto L_0x001d
            L_0x001b:
                r0 = 0
                goto L_0x001e
            L_0x001d:
                r0 = 1
            L_0x001e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0959c.C0972l.mo3411d():boolean");
        }
    }

    /* renamed from: androidx.fragment.app.c$m */
    private static class C0973m extends C0972l {

        /* renamed from: c */
        private final Object f2612c;

        /* renamed from: d */
        private final boolean f2613d;

        /* renamed from: e */
        private final Object f2614e;

        C0973m(C0974c0.C0979e eVar, C0678e eVar2, boolean z, boolean z2) {
            super(eVar, eVar2);
            boolean z3;
            Object obj;
            if (eVar.mo3435e() == C0974c0.C0979e.C0982c.VISIBLE) {
                Fragment f = eVar.mo3436f();
                this.f2612c = z ? f.mo3236I() : f.mo3322s();
                Fragment f2 = eVar.mo3436f();
                z3 = z ? f2.mo3302m() : f2.mo3299l();
            } else {
                Fragment f3 = eVar.mo3436f();
                this.f2612c = z ? f3.mo3240K() : f3.mo3332v();
                z3 = true;
            }
            this.f2613d = z3;
            if (z2) {
                Fragment f4 = eVar.mo3436f();
                obj = z ? f4.mo3244M() : f4.mo3242L();
            } else {
                obj = null;
            }
            this.f2614e = obj;
        }

        /* renamed from: f */
        private C1060z m4036f(Object obj) {
            if (obj == null) {
                return null;
            }
            C1060z zVar = C1045x.f2843b;
            if (zVar != null && zVar.mo3742e(obj)) {
                return zVar;
            }
            C1060z zVar2 = C1045x.f2844c;
            if (zVar2 != null && zVar2.mo3742e(obj)) {
                return zVar2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + mo3409b().mo3436f() + " is not a valid framework Transition or AndroidX Transition");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C1060z mo3412e() {
            C1060z f = m4036f(this.f2612c);
            C1060z f2 = m4036f(this.f2614e);
            if (f == null || f2 == null || f == f2) {
                return f != null ? f : f2;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mo3409b().mo3436f() + " returned Transition " + this.f2612c + " which uses a different Transition  type than its shared element transition " + this.f2614e);
        }

        /* renamed from: g */
        public Object mo3413g() {
            return this.f2614e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public Object mo3414h() {
            return this.f2612c;
        }

        /* renamed from: i */
        public boolean mo3415i() {
            return this.f2614e != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo3416j() {
            return this.f2613d;
        }
    }

    C0959c(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* renamed from: w */
    private void m4022w(List<C0971k> list, List<C0974c0.C0979e> list2, boolean z, Map<C0974c0.C0979e, Boolean> map) {
        StringBuilder sb;
        String str;
        C0995f.C1000d e;
        ViewGroup m = mo3425m();
        Context context = m.getContext();
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (C0971k next : list) {
            if (!next.mo3411d() && (e = next.mo3407e(context)) != null) {
                Animator animator = e.f2686b;
                if (animator == null) {
                    arrayList.add(next);
                } else {
                    C0974c0.C0979e b = next.mo3409b();
                    Fragment f = b.mo3436f();
                    if (Boolean.TRUE.equals(map.get(b))) {
                        if (C1011n.m4190E0(2)) {
                            Log.v("FragmentManager", "Ignoring Animator set on " + f + " as this Fragment was involved in a Transition.");
                        }
                        next.mo3408a();
                    } else {
                        boolean z3 = b.mo3435e() == C0974c0.C0979e.C0982c.GONE;
                        List<C0974c0.C0979e> list3 = list2;
                        if (z3) {
                            list3.remove(b);
                        }
                        View view = f.f2475M;
                        m.startViewTransition(view);
                        C0962c cVar = r0;
                        C0962c cVar2 = new C0962c(m, view, z3, b, next);
                        animator.addListener(cVar);
                        animator.setTarget(view);
                        animator.start();
                        next.mo3410c().mo2679c(new C0963d(animator));
                        z2 = true;
                    }
                }
            } else {
                next.mo3408a();
            }
            Map<C0974c0.C0979e, Boolean> map2 = map;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0971k kVar = (C0971k) it.next();
            C0974c0.C0979e b2 = kVar.mo3409b();
            Fragment f2 = b2.mo3436f();
            if (z) {
                if (C1011n.m4190E0(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(f2);
                    str = " as Animations cannot run alongside Transitions.";
                }
                kVar.mo3408a();
            } else if (z2) {
                if (C1011n.m4190E0(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(f2);
                    str = " as Animations cannot run alongside Animators.";
                }
                kVar.mo3408a();
            } else {
                View view2 = f2.f2475M;
                Animation animation = (Animation) C0743e.m2958f(((C0995f.C1000d) C0743e.m2958f(kVar.mo3407e(context))).f2685a);
                if (b2.mo3435e() != C0974c0.C0979e.C0982c.REMOVED) {
                    view2.startAnimation(animation);
                    kVar.mo3408a();
                } else {
                    m.startViewTransition(view2);
                    C0995f.C1001e eVar = new C0995f.C1001e(animation, m, view2);
                    eVar.setAnimationListener(new C0964e(m, view2, kVar));
                    view2.startAnimation(eVar);
                }
                kVar.mo3410c().mo2679c(new C0966f(view2, m, kVar));
            }
            sb.append(str);
            Log.v("FragmentManager", sb.toString());
            kVar.mo3408a();
        }
    }

    /* renamed from: x */
    private Map<C0974c0.C0979e, Boolean> m4023x(List<C0973m> list, List<C0974c0.C0979e> list2, boolean z, C0974c0.C0979e eVar, C0974c0.C0979e eVar2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        View view;
        View view2;
        Object obj;
        C0974c0.C0979e eVar3;
        C0974c0.C0979e eVar4;
        Object obj2;
        Object obj3;
        C3801a aVar;
        C0974c0.C0979e eVar5;
        C1060z zVar;
        View view3;
        Rect rect;
        ArrayList arrayList3;
        C0974c0.C0979e eVar6;
        ArrayList arrayList4;
        boolean z2 = z;
        C0974c0.C0979e eVar7 = eVar;
        C0974c0.C0979e eVar8 = eVar2;
        HashMap hashMap = new HashMap();
        C1060z zVar2 = null;
        for (C0973m next : list) {
            if (!next.mo3411d()) {
                C1060z e = next.mo3412e();
                if (zVar2 == null) {
                    zVar2 = e;
                } else if (!(e == null || zVar2 == e)) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + next.mo3409b().mo3436f() + " returned Transition " + next.mo3414h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (zVar2 == null) {
            for (C0973m next2 : list) {
                hashMap.put(next2.mo3409b(), Boolean.FALSE);
                next2.mo3408a();
            }
            return hashMap;
        }
        View view4 = new View(mo3425m().getContext());
        Rect rect2 = new Rect();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        C3801a aVar2 = new C3801a();
        Object obj4 = null;
        View view5 = null;
        boolean z3 = false;
        for (C0973m next3 : list) {
            if (!next3.mo3415i() || eVar7 == null || eVar8 == null) {
                aVar = aVar2;
                arrayList4 = arrayList6;
                eVar6 = eVar7;
                arrayList3 = arrayList5;
                rect = rect2;
                view3 = view4;
                zVar = zVar2;
                eVar5 = eVar8;
                view5 = view5;
            } else {
                Object B = zVar2.mo3738B(zVar2.mo3743g(next3.mo3413g()));
                ArrayList<String> N = eVar2.mo3436f().mo3246N();
                ArrayList<String> N2 = eVar.mo3436f().mo3246N();
                ArrayList<String> O = eVar.mo3436f().mo3248O();
                Object obj5 = B;
                View view6 = view5;
                int i = 0;
                while (i < O.size()) {
                    int indexOf = N.indexOf(O.get(i));
                    ArrayList<String> arrayList7 = O;
                    if (indexOf != -1) {
                        N.set(indexOf, N2.get(i));
                    }
                    i++;
                    O = arrayList7;
                }
                ArrayList<String> O2 = eVar2.mo3436f().mo3248O();
                Fragment f = eVar.mo3436f();
                if (!z2) {
                    f.mo3335w();
                    eVar2.mo3436f().mo3325t();
                } else {
                    f.mo3325t();
                    eVar2.mo3436f().mo3335w();
                }
                int i2 = 0;
                for (int size = N.size(); i2 < size; size = size) {
                    aVar2.put(N.get(i2), O2.get(i2));
                    i2++;
                }
                C3801a aVar3 = new C3801a();
                mo3395u(aVar3, eVar.mo3436f().f2475M);
                aVar3.mo15049o(N);
                aVar2.mo15049o(aVar3.keySet());
                C3801a aVar4 = new C3801a();
                mo3395u(aVar4, eVar2.mo3436f().f2475M);
                aVar4.mo15049o(O2);
                aVar4.mo15049o(aVar2.values());
                C1045x.m4432x(aVar2, aVar4);
                mo3396v(aVar3, aVar2.keySet());
                mo3396v(aVar4, aVar2.values());
                if (aVar2.isEmpty()) {
                    arrayList5.clear();
                    arrayList6.clear();
                    aVar = aVar2;
                    arrayList4 = arrayList6;
                    eVar6 = eVar7;
                    arrayList3 = arrayList5;
                    rect = rect2;
                    view3 = view4;
                    zVar = zVar2;
                    view5 = view6;
                    obj4 = null;
                    eVar5 = eVar8;
                } else {
                    C1045x.m4414f(eVar2.mo3436f(), eVar.mo3436f(), z2, aVar3, true);
                    ArrayList<String> arrayList8 = N;
                    C0967g gVar = r0;
                    ViewGroup m = mo3425m();
                    Object obj6 = obj5;
                    C3801a aVar5 = aVar4;
                    View view7 = view6;
                    C3801a aVar6 = aVar3;
                    aVar = aVar2;
                    ArrayList arrayList9 = arrayList6;
                    C0967g gVar2 = new C0967g(eVar2, eVar, z, aVar5);
                    C0830v.m3313a(m, gVar2);
                    arrayList5.addAll(aVar6.values());
                    if (!arrayList8.isEmpty()) {
                        View view8 = (View) aVar6.get(arrayList8.get(0));
                        zVar2.mo3751v(obj6, view8);
                        view5 = view8;
                    } else {
                        view5 = view7;
                    }
                    arrayList4 = arrayList9;
                    arrayList4.addAll(aVar5.values());
                    if (!O2.isEmpty()) {
                        View view9 = (View) aVar5.get(O2.get(0));
                        if (view9 != null) {
                            C0830v.m3313a(mo3425m(), new C0968h(zVar2, view9, rect2));
                            z3 = true;
                        }
                    }
                    zVar2.mo3753z(obj6, view4, arrayList5);
                    arrayList3 = arrayList5;
                    rect = rect2;
                    view3 = view4;
                    zVar = zVar2;
                    zVar2.mo3749t(obj6, (Object) null, (ArrayList<View>) null, (Object) null, (ArrayList<View>) null, obj6, arrayList4);
                    Boolean bool = Boolean.TRUE;
                    eVar6 = eVar;
                    hashMap.put(eVar6, bool);
                    eVar5 = eVar2;
                    hashMap.put(eVar5, bool);
                    obj4 = obj6;
                }
            }
            eVar7 = eVar6;
            arrayList5 = arrayList3;
            rect2 = rect;
            view4 = view3;
            eVar8 = eVar5;
            aVar2 = aVar;
            z2 = z;
            arrayList6 = arrayList4;
            zVar2 = zVar;
        }
        View view10 = view5;
        C3801a aVar7 = aVar2;
        ArrayList arrayList10 = arrayList6;
        C0974c0.C0979e eVar9 = eVar7;
        ArrayList arrayList11 = arrayList5;
        Rect rect3 = rect2;
        View view11 = view4;
        C1060z zVar3 = zVar2;
        boolean z4 = false;
        C0974c0.C0979e eVar10 = eVar8;
        ArrayList arrayList12 = new ArrayList();
        Object obj7 = null;
        Object obj8 = null;
        for (C0973m next4 : list) {
            if (next4.mo3411d()) {
                hashMap.put(next4.mo3409b(), Boolean.FALSE);
                next4.mo3408a();
            } else {
                Object g = zVar3.mo3743g(next4.mo3414h());
                C0974c0.C0979e b = next4.mo3409b();
                boolean z5 = (obj4 == null || !(b == eVar9 || b == eVar10)) ? z4 : true;
                if (g == null) {
                    if (!z5) {
                        hashMap.put(b, Boolean.FALSE);
                        next4.mo3408a();
                    }
                    List<C0974c0.C0979e> list3 = list2;
                    arrayList = arrayList10;
                    arrayList2 = arrayList11;
                    view = view11;
                    obj = obj7;
                    eVar3 = eVar10;
                    view2 = view10;
                } else {
                    ArrayList arrayList13 = new ArrayList();
                    Object obj9 = obj7;
                    mo3394t(arrayList13, b.mo3436f().f2475M);
                    if (z5) {
                        if (b == eVar9) {
                            arrayList13.removeAll(arrayList11);
                        } else {
                            arrayList13.removeAll(arrayList10);
                        }
                    }
                    if (arrayList13.isEmpty()) {
                        zVar3.mo3739a(g, view11);
                        arrayList = arrayList10;
                        arrayList2 = arrayList11;
                        view = view11;
                        eVar4 = b;
                        obj3 = obj8;
                        eVar3 = eVar10;
                        List<C0974c0.C0979e> list4 = list2;
                        obj2 = obj9;
                    } else {
                        zVar3.mo3740b(g, arrayList13);
                        view = view11;
                        obj2 = obj9;
                        C0974c0.C0979e eVar11 = b;
                        arrayList2 = arrayList11;
                        obj3 = obj8;
                        arrayList = arrayList10;
                        eVar3 = eVar10;
                        zVar3.mo3749t(g, g, arrayList13, (Object) null, (ArrayList<View>) null, (Object) null, (ArrayList<View>) null);
                        if (eVar11.mo3435e() == C0974c0.C0979e.C0982c.GONE) {
                            eVar4 = eVar11;
                            list2.remove(eVar4);
                            ArrayList arrayList14 = new ArrayList(arrayList13);
                            arrayList14.remove(eVar4.mo3436f().f2475M);
                            zVar3.mo3748r(g, eVar4.mo3436f().f2475M, arrayList14);
                            C0830v.m3313a(mo3425m(), new C0969i(arrayList13));
                        } else {
                            List<C0974c0.C0979e> list5 = list2;
                            eVar4 = eVar11;
                        }
                    }
                    if (eVar4.mo3435e() == C0974c0.C0979e.C0982c.VISIBLE) {
                        arrayList12.addAll(arrayList13);
                        if (z3) {
                            zVar3.mo3750u(g, rect3);
                        }
                        view2 = view10;
                    } else {
                        view2 = view10;
                        zVar3.mo3751v(g, view2);
                    }
                    hashMap.put(eVar4, Boolean.TRUE);
                    if (next4.mo3416j()) {
                        obj8 = zVar3.mo3745n(obj3, g, (Object) null);
                        obj = obj2;
                    } else {
                        obj = zVar3.mo3745n(obj2, g, (Object) null);
                        obj8 = obj3;
                    }
                }
                eVar10 = eVar3;
                obj7 = obj;
                view10 = view2;
                view11 = view;
                arrayList11 = arrayList2;
                arrayList10 = arrayList;
                z4 = false;
            }
        }
        ArrayList arrayList15 = arrayList10;
        ArrayList arrayList16 = arrayList11;
        C0974c0.C0979e eVar12 = eVar10;
        Object m2 = zVar3.mo3744m(obj8, obj7, obj4);
        for (C0973m next5 : list) {
            if (!next5.mo3411d()) {
                Object h = next5.mo3414h();
                C0974c0.C0979e b2 = next5.mo3409b();
                boolean z6 = obj4 != null && (b2 == eVar9 || b2 == eVar12);
                if (h != null || z6) {
                    if (!C0833y.m3317B(mo3425m())) {
                        if (C1011n.m4190E0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Container " + mo3425m() + " has not been laid out. Completing operation " + b2);
                        }
                        next5.mo3408a();
                    } else {
                        zVar3.mo3752w(next5.mo3409b().mo3436f(), m2, next5.mo3410c(), new C0970j(next5));
                    }
                }
            }
        }
        if (!C0833y.m3317B(mo3425m())) {
            return hashMap;
        }
        C1045x.m4407A(arrayList12, 4);
        ArrayList arrayList17 = arrayList15;
        ArrayList<String> o = zVar3.mo3774o(arrayList17);
        zVar3.mo3741c(mo3425m(), m2);
        zVar3.mo3777y(mo3425m(), arrayList16, arrayList17, o, aVar7);
        C1045x.m4407A(arrayList12, 0);
        zVar3.mo3737A(obj4, arrayList16, arrayList17);
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3392f(List<C0974c0.C0979e> list, boolean z) {
        C0974c0.C0979e eVar = null;
        C0974c0.C0979e eVar2 = null;
        for (C0974c0.C0979e next : list) {
            C0974c0.C0979e.C0982c e = C0974c0.C0979e.C0982c.m4076e(next.mo3436f().f2475M);
            int i = C0960a.f2573a[next.mo3435e().ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                if (e == C0974c0.C0979e.C0982c.VISIBLE && eVar == null) {
                    eVar = next;
                }
            } else if (i == 4 && e != C0974c0.C0979e.C0982c.VISIBLE) {
                eVar2 = next;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<C0974c0.C0979e> arrayList3 = new ArrayList<>(list);
        for (C0974c0.C0979e next2 : list) {
            C0678e eVar3 = new C0678e();
            next2.mo3440j(eVar3);
            arrayList.add(new C0971k(next2, eVar3, z));
            C0678e eVar4 = new C0678e();
            next2.mo3440j(eVar4);
            boolean z2 = false;
            if (z) {
                if (next2 != eVar) {
                    arrayList2.add(new C0973m(next2, eVar4, z, z2));
                    next2.mo3432a(new C0961b(arrayList3, next2));
                }
            } else if (next2 != eVar2) {
                arrayList2.add(new C0973m(next2, eVar4, z, z2));
                next2.mo3432a(new C0961b(arrayList3, next2));
            }
            z2 = true;
            arrayList2.add(new C0973m(next2, eVar4, z, z2));
            next2.mo3432a(new C0961b(arrayList3, next2));
        }
        Map<C0974c0.C0979e, Boolean> x = m4023x(arrayList2, arrayList3, z, eVar, eVar2);
        m4022w(arrayList, arrayList3, x.containsValue(Boolean.TRUE), x);
        for (C0974c0.C0979e s : arrayList3) {
            mo3393s(s);
        }
        arrayList3.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo3393s(C0974c0.C0979e eVar) {
        eVar.mo3435e().mo3443b(eVar.mo3436f().f2475M);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo3394t(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!C0767b0.m3044a(viewGroup)) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        mo3394t(arrayList, childAt);
                    }
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(viewGroup);
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo3395u(Map<String, View> map, View view) {
        String w = C0833y.m3367w(view);
        if (w != null) {
            map.put(w, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    mo3395u(map, childAt);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo3396v(C3801a<String, View> aVar, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = aVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(C0833y.m3367w((View) it.next().getValue()))) {
                it.remove();
            }
        }
    }
}
