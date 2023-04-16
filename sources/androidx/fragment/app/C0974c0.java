package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p009os.C0678e;
import androidx.core.view.C0833y;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p158x.C4274b;

/* renamed from: androidx.fragment.app.c0 */
abstract class C0974c0 {

    /* renamed from: a */
    private final ViewGroup f2615a;

    /* renamed from: b */
    final ArrayList<C0979e> f2616b = new ArrayList<>();

    /* renamed from: c */
    final ArrayList<C0979e> f2617c = new ArrayList<>();

    /* renamed from: d */
    boolean f2618d = false;

    /* renamed from: e */
    boolean f2619e = false;

    /* renamed from: androidx.fragment.app.c0$a */
    class C0975a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C0978d f2620f;

        C0975a(C0978d dVar) {
            this.f2620f = dVar;
        }

        public void run() {
            if (C0974c0.this.f2616b.contains(this.f2620f)) {
                this.f2620f.mo3435e().mo3443b(this.f2620f.mo3436f().f2475M);
            }
        }
    }

    /* renamed from: androidx.fragment.app.c0$b */
    class C0976b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C0978d f2622f;

        C0976b(C0978d dVar) {
            this.f2622f = dVar;
        }

        public void run() {
            C0974c0.this.f2616b.remove(this.f2622f);
            C0974c0.this.f2617c.remove(this.f2622f);
        }
    }

    /* renamed from: androidx.fragment.app.c0$c */
    static /* synthetic */ class C0977c {

        /* renamed from: a */
        static final /* synthetic */ int[] f2624a;

        /* renamed from: b */
        static final /* synthetic */ int[] f2625b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        static {
            /*
                androidx.fragment.app.c0$e$b[] r0 = androidx.fragment.app.C0974c0.C0979e.C0981b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2625b = r0
                r1 = 1
                androidx.fragment.app.c0$e$b r2 = androidx.fragment.app.C0974c0.C0979e.C0981b.ADDING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f2625b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.c0$e$b r3 = androidx.fragment.app.C0974c0.C0979e.C0981b.REMOVING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f2625b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.c0$e$b r4 = androidx.fragment.app.C0974c0.C0979e.C0981b.NONE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                androidx.fragment.app.c0$e$c[] r3 = androidx.fragment.app.C0974c0.C0979e.C0982c.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f2624a = r3
                androidx.fragment.app.c0$e$c r4 = androidx.fragment.app.C0974c0.C0979e.C0982c.REMOVED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f2624a     // Catch:{ NoSuchFieldError -> 0x0043 }
                androidx.fragment.app.c0$e$c r3 = androidx.fragment.app.C0974c0.C0979e.C0982c.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f2624a     // Catch:{ NoSuchFieldError -> 0x004d }
                androidx.fragment.app.c0$e$c r1 = androidx.fragment.app.C0974c0.C0979e.C0982c.GONE     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = f2624a     // Catch:{ NoSuchFieldError -> 0x0058 }
                androidx.fragment.app.c0$e$c r1 = androidx.fragment.app.C0974c0.C0979e.C0982c.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0974c0.C0977c.<clinit>():void");
        }
    }

    /* renamed from: androidx.fragment.app.c0$d */
    private static class C0978d extends C0979e {

        /* renamed from: h */
        private final C1039u f2626h;

        C0978d(C0979e.C0982c cVar, C0979e.C0981b bVar, C1039u uVar, C0678e eVar) {
            super(cVar, bVar, uVar.mo3689k(), eVar);
            this.f2626h = uVar;
        }

        /* renamed from: c */
        public void mo3430c() {
            super.mo3430c();
            this.f2626h.mo3690m();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo3431l() {
            if (mo3437g() == C0979e.C0981b.ADDING) {
                Fragment k = this.f2626h.mo3689k();
                View findFocus = k.f2475M.findFocus();
                if (findFocus != null) {
                    k.mo3324s1(findFocus);
                    if (C1011n.m4190E0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k);
                    }
                }
                View k1 = mo3436f().mo3298k1();
                if (k1.getParent() == null) {
                    this.f2626h.mo3680b();
                    k1.setAlpha(0.0f);
                }
                if (k1.getAlpha() == 0.0f && k1.getVisibility() == 0) {
                    k1.setVisibility(4);
                }
                k1.setAlpha(k.mo3234H());
            }
        }
    }

    /* renamed from: androidx.fragment.app.c0$e */
    static class C0979e {

        /* renamed from: a */
        private C0982c f2627a;

        /* renamed from: b */
        private C0981b f2628b;

        /* renamed from: c */
        private final Fragment f2629c;

        /* renamed from: d */
        private final List<Runnable> f2630d = new ArrayList();

        /* renamed from: e */
        private final HashSet<C0678e> f2631e = new HashSet<>();

        /* renamed from: f */
        private boolean f2632f = false;

        /* renamed from: g */
        private boolean f2633g = false;

        /* renamed from: androidx.fragment.app.c0$e$a */
        class C0980a implements C0678e.C0680b {
            C0980a() {
            }

            /* renamed from: a */
            public void mo2680a() {
                C0979e.this.mo3433b();
            }
        }

        /* renamed from: androidx.fragment.app.c0$e$b */
        enum C0981b {
            NONE,
            ADDING,
            REMOVING
        }

        /* renamed from: androidx.fragment.app.c0$e$c */
        enum C0982c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            /* renamed from: d */
            static C0982c m4075d(int i) {
                if (i == 0) {
                    return VISIBLE;
                }
                if (i == 4) {
                    return INVISIBLE;
                }
                if (i == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i);
            }

            /* renamed from: e */
            static C0982c m4076e(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : m4075d(view.getVisibility());
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public void mo3443b(View view) {
                int i;
                int i2 = C0977c.f2624a[ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        if (C1011n.m4190E0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                        }
                        i = 0;
                    } else if (i2 == 3) {
                        if (C1011n.m4190E0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                        }
                        i = 8;
                    } else if (i2 == 4) {
                        if (C1011n.m4190E0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    } else {
                        return;
                    }
                    view.setVisibility(i);
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    if (C1011n.m4190E0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                    }
                    viewGroup.removeView(view);
                }
            }
        }

        C0979e(C0982c cVar, C0981b bVar, Fragment fragment, C0678e eVar) {
            this.f2627a = cVar;
            this.f2628b = bVar;
            this.f2629c = fragment;
            eVar.mo2679c(new C0980a());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo3432a(Runnable runnable) {
            this.f2630d.add(runnable);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo3433b() {
            if (!mo3438h()) {
                this.f2632f = true;
                if (this.f2631e.isEmpty()) {
                    mo3430c();
                    return;
                }
                Iterator it = new ArrayList(this.f2631e).iterator();
                while (it.hasNext()) {
                    ((C0678e) it.next()).mo2677a();
                }
            }
        }

        /* renamed from: c */
        public void mo3430c() {
            if (!this.f2633g) {
                if (C1011n.m4190E0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
                }
                this.f2633g = true;
                for (Runnable run : this.f2630d) {
                    run.run();
                }
            }
        }

        /* renamed from: d */
        public final void mo3434d(C0678e eVar) {
            if (this.f2631e.remove(eVar) && this.f2631e.isEmpty()) {
                mo3430c();
            }
        }

        /* renamed from: e */
        public C0982c mo3435e() {
            return this.f2627a;
        }

        /* renamed from: f */
        public final Fragment mo3436f() {
            return this.f2629c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C0981b mo3437g() {
            return this.f2628b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public final boolean mo3438h() {
            return this.f2632f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public final boolean mo3439i() {
            return this.f2633g;
        }

        /* renamed from: j */
        public final void mo3440j(C0678e eVar) {
            mo3431l();
            this.f2631e.add(eVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public final void mo3441k(C0982c cVar, C0981b bVar) {
            C0981b bVar2;
            int i = C0977c.f2625b[bVar.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    if (C1011n.m4190E0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f2629c + " mFinalState = " + this.f2627a + " -> REMOVED. mLifecycleImpact  = " + this.f2628b + " to REMOVING.");
                    }
                    this.f2627a = C0982c.REMOVED;
                    bVar2 = C0981b.REMOVING;
                } else if (i == 3 && this.f2627a != C0982c.REMOVED) {
                    if (C1011n.m4190E0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f2629c + " mFinalState = " + this.f2627a + " -> " + cVar + ". ");
                    }
                    this.f2627a = cVar;
                    return;
                } else {
                    return;
                }
            } else if (this.f2627a == C0982c.REMOVED) {
                if (C1011n.m4190E0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f2629c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f2628b + " to ADDING.");
                }
                this.f2627a = C0982c.VISIBLE;
                bVar2 = C0981b.ADDING;
            } else {
                return;
            }
            this.f2628b = bVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo3431l() {
        }

        public String toString() {
            return "Operation " + "{" + Integer.toHexString(System.identityHashCode(this)) + "} " + "{" + "mFinalState = " + this.f2627a + "} " + "{" + "mLifecycleImpact = " + this.f2628b + "} " + "{" + "mFragment = " + this.f2629c + "}";
        }
    }

    C0974c0(ViewGroup viewGroup) {
        this.f2615a = viewGroup;
    }

    /* renamed from: a */
    private void m4042a(C0979e.C0982c cVar, C0979e.C0981b bVar, C1039u uVar) {
        synchronized (this.f2616b) {
            C0678e eVar = new C0678e();
            C0979e h = m4043h(uVar.mo3689k());
            if (h != null) {
                h.mo3441k(cVar, bVar);
                return;
            }
            C0978d dVar = new C0978d(cVar, bVar, uVar, eVar);
            this.f2616b.add(dVar);
            dVar.mo3432a(new C0975a(dVar));
            dVar.mo3432a(new C0976b(dVar));
        }
    }

    /* renamed from: h */
    private C0979e m4043h(Fragment fragment) {
        Iterator<C0979e> it = this.f2616b.iterator();
        while (it.hasNext()) {
            C0979e next = it.next();
            if (next.mo3436f().equals(fragment) && !next.mo3438h()) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: i */
    private C0979e m4044i(Fragment fragment) {
        Iterator<C0979e> it = this.f2617c.iterator();
        while (it.hasNext()) {
            C0979e next = it.next();
            if (next.mo3436f().equals(fragment) && !next.mo3438h()) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: n */
    static C0974c0 m4045n(ViewGroup viewGroup, C1011n nVar) {
        return m4046o(viewGroup, nVar.mo3628x0());
    }

    /* renamed from: o */
    static C0974c0 m4046o(ViewGroup viewGroup, C0989d0 d0Var) {
        int i = C4274b.special_effects_controller_view_tag;
        Object tag = viewGroup.getTag(i);
        if (tag instanceof C0974c0) {
            return (C0974c0) tag;
        }
        C0974c0 a = d0Var.mo3458a(viewGroup);
        viewGroup.setTag(i, a);
        return a;
    }

    /* renamed from: q */
    private void m4047q() {
        Iterator<C0979e> it = this.f2616b.iterator();
        while (it.hasNext()) {
            C0979e next = it.next();
            if (next.mo3437g() == C0979e.C0981b.ADDING) {
                next.mo3441k(C0979e.C0982c.m4075d(next.mo3436f().mo3298k1().getVisibility()), C0979e.C0981b.NONE);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3417b(C0979e.C0982c cVar, C1039u uVar) {
        if (C1011n.m4190E0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + uVar.mo3689k());
        }
        m4042a(cVar, C0979e.C0981b.ADDING, uVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3418c(C1039u uVar) {
        if (C1011n.m4190E0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + uVar.mo3689k());
        }
        m4042a(C0979e.C0982c.GONE, C0979e.C0981b.NONE, uVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3419d(C1039u uVar) {
        if (C1011n.m4190E0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + uVar.mo3689k());
        }
        m4042a(C0979e.C0982c.REMOVED, C0979e.C0981b.REMOVING, uVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3420e(C1039u uVar) {
        if (C1011n.m4190E0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + uVar.mo3689k());
        }
        m4042a(C0979e.C0982c.VISIBLE, C0979e.C0981b.NONE, uVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract void mo3392f(List<C0979e> list, boolean z);

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo3421g() {
        if (!this.f2619e) {
            if (!C0833y.m3316A(this.f2615a)) {
                mo3422j();
                this.f2618d = false;
                return;
            }
            synchronized (this.f2616b) {
                if (!this.f2616b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f2617c);
                    this.f2617c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C0979e eVar = (C0979e) it.next();
                        if (C1011n.m4190E0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                        }
                        eVar.mo3433b();
                        if (!eVar.mo3439i()) {
                            this.f2617c.add(eVar);
                        }
                    }
                    m4047q();
                    ArrayList arrayList2 = new ArrayList(this.f2616b);
                    this.f2616b.clear();
                    this.f2617c.addAll(arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((C0979e) it2.next()).mo3431l();
                    }
                    mo3392f(arrayList2, this.f2618d);
                    this.f2618d = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo3422j() {
        String str;
        String str2;
        boolean A = C0833y.m3316A(this.f2615a);
        synchronized (this.f2616b) {
            m4047q();
            Iterator<C0979e> it = this.f2616b.iterator();
            while (it.hasNext()) {
                it.next().mo3431l();
            }
            Iterator it2 = new ArrayList(this.f2617c).iterator();
            while (it2.hasNext()) {
                C0979e eVar = (C0979e) it2.next();
                if (C1011n.m4190E0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (A) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f2615a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(eVar);
                    Log.v("FragmentManager", sb.toString());
                }
                eVar.mo3433b();
            }
            Iterator it3 = new ArrayList(this.f2616b).iterator();
            while (it3.hasNext()) {
                C0979e eVar2 = (C0979e) it3.next();
                if (C1011n.m4190E0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (A) {
                        str = "";
                    } else {
                        str = "Container " + this.f2615a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(eVar2);
                    Log.v("FragmentManager", sb2.toString());
                }
                eVar2.mo3433b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo3423k() {
        if (this.f2619e) {
            this.f2619e = false;
            mo3421g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C0979e.C0981b mo3424l(C1039u uVar) {
        C0979e h = m4043h(uVar.mo3689k());
        C0979e.C0981b g = h != null ? h.mo3437g() : null;
        C0979e i = m4044i(uVar.mo3689k());
        return (i == null || !(g == null || g == C0979e.C0981b.NONE)) ? g : i.mo3437g();
    }

    /* renamed from: m */
    public ViewGroup mo3425m() {
        return this.f2615a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo3426p() {
        synchronized (this.f2616b) {
            m4047q();
            this.f2619e = false;
            int size = this.f2616b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                C0979e eVar = this.f2616b.get(size);
                C0979e.C0982c e = C0979e.C0982c.m4076e(eVar.mo3436f().f2475M);
                C0979e.C0982c e2 = eVar.mo3435e();
                C0979e.C0982c cVar = C0979e.C0982c.VISIBLE;
                if (e2 == cVar && e != cVar) {
                    this.f2619e = eVar.mo3436f().mo3266Y();
                    break;
                }
                size--;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo3427r(boolean z) {
        this.f2618d = z;
    }
}
