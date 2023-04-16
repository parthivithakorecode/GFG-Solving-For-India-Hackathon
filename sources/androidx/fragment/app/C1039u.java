package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.C0833y;
import androidx.fragment.app.C0974c0;
import androidx.lifecycle.C1099i;
import androidx.lifecycle.C1103i0;
import p158x.C4274b;

/* renamed from: androidx.fragment.app.u */
class C1039u {

    /* renamed from: a */
    private final C1009m f2804a;

    /* renamed from: b */
    private final C1042v f2805b;

    /* renamed from: c */
    private final Fragment f2806c;

    /* renamed from: d */
    private boolean f2807d = false;

    /* renamed from: e */
    private int f2808e = -1;

    /* renamed from: androidx.fragment.app.u$a */
    class C1040a implements View.OnAttachStateChangeListener {

        /* renamed from: f */
        final /* synthetic */ View f2809f;

        C1040a(View view) {
            this.f2809f = view;
        }

        public void onViewAttachedToWindow(View view) {
            this.f2809f.removeOnAttachStateChangeListener(this);
            C0833y.m3327L(this.f2809f);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.fragment.app.u$b */
    static /* synthetic */ class C1041b {

        /* renamed from: a */
        static final /* synthetic */ int[] f2811a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.lifecycle.i$c[] r0 = androidx.lifecycle.C1099i.C1102c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2811a = r0
                androidx.lifecycle.i$c r1 = androidx.lifecycle.C1099i.C1102c.RESUMED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2811a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.i$c r1 = androidx.lifecycle.C1099i.C1102c.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2811a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.i$c r1 = androidx.lifecycle.C1099i.C1102c.CREATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2811a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.i$c r1 = androidx.lifecycle.C1099i.C1102c.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1039u.C1041b.<clinit>():void");
        }
    }

    C1039u(C1009m mVar, C1042v vVar, Fragment fragment) {
        this.f2804a = mVar;
        this.f2805b = vVar;
        this.f2806c = fragment;
    }

    C1039u(C1009m mVar, C1042v vVar, Fragment fragment, C1037t tVar) {
        this.f2804a = mVar;
        this.f2805b = vVar;
        this.f2806c = fragment;
        fragment.f2496h = null;
        fragment.f2497i = null;
        fragment.f2511w = 0;
        fragment.f2508t = false;
        fragment.f2505q = false;
        Fragment fragment2 = fragment.f2501m;
        fragment.f2502n = fragment2 != null ? fragment2.f2499k : null;
        fragment.f2501m = null;
        Bundle bundle = tVar.f2803r;
        fragment.f2495g = bundle == null ? new Bundle() : bundle;
    }

    C1039u(C1009m mVar, C1042v vVar, ClassLoader classLoader, C1005j jVar, C1037t tVar) {
        this.f2804a = mVar;
        this.f2805b = vVar;
        Fragment a = jVar.mo3528a(classLoader, tVar.f2791f);
        this.f2806c = a;
        Bundle bundle = tVar.f2800o;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a.mo3321r1(tVar.f2800o);
        a.f2499k = tVar.f2792g;
        a.f2507s = tVar.f2793h;
        a.f2509u = true;
        a.f2464B = tVar.f2794i;
        a.f2465C = tVar.f2795j;
        a.f2466D = tVar.f2796k;
        a.f2469G = tVar.f2797l;
        a.f2506r = tVar.f2798m;
        a.f2468F = tVar.f2799n;
        a.f2467E = tVar.f2801p;
        a.f2485W = C1099i.C1102c.values()[tVar.f2802q];
        Bundle bundle2 = tVar.f2803r;
        a.f2495g = bundle2 == null ? new Bundle() : bundle2;
        if (C1011n.m4190E0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a);
        }
    }

    /* renamed from: l */
    private boolean m4350l(View view) {
        if (view == this.f2806c.f2475M) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f2806c.f2475M) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    private Bundle m4351q() {
        Bundle bundle = new Bundle();
        this.f2806c.mo3282e1(bundle);
        this.f2804a.mo3545j(this.f2806c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f2806c.f2475M != null) {
            mo3695s();
        }
        if (this.f2806c.f2496h != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f2806c.f2496h);
        }
        if (this.f2806c.f2497i != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f2806c.f2497i);
        }
        if (!this.f2806c.f2477O) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f2806c.f2477O);
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3679a() {
        if (C1011n.m4190E0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f2806c);
        }
        Fragment fragment = this.f2806c;
        fragment.mo3241K0(fragment.f2495g);
        C1009m mVar = this.f2804a;
        Fragment fragment2 = this.f2806c;
        mVar.mo3536a(fragment2, fragment2.f2495g, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3680b() {
        int j = this.f2805b.mo3710j(this.f2806c);
        Fragment fragment = this.f2806c;
        fragment.f2474L.addView(fragment.f2475M, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3681c() {
        if (C1011n.m4190E0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f2806c);
        }
        Fragment fragment = this.f2806c;
        Fragment fragment2 = fragment.f2501m;
        C1039u uVar = null;
        if (fragment2 != null) {
            C1039u m = this.f2805b.mo3713m(fragment2.f2499k);
            if (m != null) {
                Fragment fragment3 = this.f2806c;
                fragment3.f2502n = fragment3.f2501m.f2499k;
                fragment3.f2501m = null;
                uVar = m;
            } else {
                throw new IllegalStateException("Fragment " + this.f2806c + " declared target fragment " + this.f2806c.f2501m + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.f2502n;
            if (str != null && (uVar = this.f2805b.mo3713m(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f2806c + " declared target fragment " + this.f2806c.f2502n + " that does not belong to this FragmentManager!");
            }
        }
        if (uVar != null && (C1011n.f2711P || uVar.mo3689k().f2494f < 1)) {
            uVar.mo3690m();
        }
        Fragment fragment4 = this.f2806c;
        fragment4.f2513y = fragment4.f2512x.mo3619s0();
        Fragment fragment5 = this.f2806c;
        fragment5.f2463A = fragment5.f2512x.mo3625v0();
        this.f2804a.mo3542g(this.f2806c, false);
        this.f2806c.mo3243L0();
        this.f2804a.mo3537b(this.f2806c, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo3682d() {
        Fragment fragment;
        ViewGroup viewGroup;
        Fragment fragment2 = this.f2806c;
        if (fragment2.f2512x == null) {
            return fragment2.f2494f;
        }
        int i = this.f2808e;
        int i2 = C1041b.f2811a[fragment2.f2485W.ordinal()];
        if (i2 != 1) {
            i = i2 != 2 ? i2 != 3 ? i2 != 4 ? Math.min(i, -1) : Math.min(i, 0) : Math.min(i, 1) : Math.min(i, 5);
        }
        Fragment fragment3 = this.f2806c;
        if (fragment3.f2507s) {
            if (fragment3.f2508t) {
                i = Math.max(this.f2808e, 2);
                View view = this.f2806c.f2475M;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f2808e < 4 ? Math.min(i, fragment3.f2494f) : Math.min(i, 1);
            }
        }
        if (!this.f2806c.f2505q) {
            i = Math.min(i, 1);
        }
        C0974c0.C0979e.C0981b bVar = null;
        if (C1011n.f2711P && (viewGroup = fragment.f2474L) != null) {
            bVar = C0974c0.m4045n(viewGroup, (fragment = this.f2806c).mo3226D()).mo3424l(this);
        }
        if (bVar == C0974c0.C0979e.C0981b.ADDING) {
            i = Math.min(i, 6);
        } else if (bVar == C0974c0.C0979e.C0981b.REMOVING) {
            i = Math.max(i, 3);
        } else {
            Fragment fragment4 = this.f2806c;
            if (fragment4.f2506r) {
                i = fragment4.mo3262W() ? Math.min(i, 1) : Math.min(i, -1);
            }
        }
        Fragment fragment5 = this.f2806c;
        if (fragment5.f2476N && fragment5.f2494f < 5) {
            i = Math.min(i, 4);
        }
        if (C1011n.m4190E0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + this.f2806c);
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3683e() {
        if (C1011n.m4190E0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f2806c);
        }
        Fragment fragment = this.f2806c;
        if (!fragment.f2484V) {
            this.f2804a.mo3543h(fragment, fragment.f2495g, false);
            Fragment fragment2 = this.f2806c;
            fragment2.mo3249O0(fragment2.f2495g);
            C1009m mVar = this.f2804a;
            Fragment fragment3 = this.f2806c;
            mVar.mo3538c(fragment3, fragment3.f2495g, false);
            return;
        }
        fragment.mo3301l1(fragment.f2495g);
        this.f2806c.f2494f = 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3684f() {
        String str;
        if (!this.f2806c.f2507s) {
            if (C1011n.m4190E0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f2806c);
            }
            Fragment fragment = this.f2806c;
            LayoutInflater U0 = fragment.mo3259U0(fragment.f2495g);
            ViewGroup viewGroup = null;
            Fragment fragment2 = this.f2806c;
            ViewGroup viewGroup2 = fragment2.f2474L;
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            } else {
                int i = fragment2.f2465C;
                if (i != 0) {
                    if (i != -1) {
                        viewGroup = (ViewGroup) fragment2.f2512x.mo3614n0().mo3350d(this.f2806c.f2465C);
                        if (viewGroup == null) {
                            Fragment fragment3 = this.f2806c;
                            if (!fragment3.f2509u) {
                                try {
                                    str = fragment3.mo3238J().getResourceName(this.f2806c.f2465C);
                                } catch (Resources.NotFoundException unused) {
                                    str = "unknown";
                                }
                                throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f2806c.f2465C) + " (" + str + ") for fragment " + this.f2806c);
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create fragment " + this.f2806c + " for a container view with no id");
                    }
                }
            }
            Fragment fragment4 = this.f2806c;
            fragment4.f2474L = viewGroup;
            fragment4.mo3253Q0(U0, viewGroup, fragment4.f2495g);
            View view = this.f2806c.f2475M;
            if (view != null) {
                boolean z = false;
                view.setSaveFromParentEnabled(false);
                Fragment fragment5 = this.f2806c;
                fragment5.f2475M.setTag(C4274b.fragment_container_view_tag, fragment5);
                if (viewGroup != null) {
                    mo3680b();
                }
                Fragment fragment6 = this.f2806c;
                if (fragment6.f2467E) {
                    fragment6.f2475M.setVisibility(8);
                }
                if (C0833y.m3316A(this.f2806c.f2475M)) {
                    C0833y.m3327L(this.f2806c.f2475M);
                } else {
                    View view2 = this.f2806c.f2475M;
                    view2.addOnAttachStateChangeListener(new C1040a(view2));
                }
                this.f2806c.mo3290h1();
                C1009m mVar = this.f2804a;
                Fragment fragment7 = this.f2806c;
                mVar.mo3548m(fragment7, fragment7.f2475M, fragment7.f2495g, false);
                int visibility = this.f2806c.f2475M.getVisibility();
                float alpha = this.f2806c.f2475M.getAlpha();
                if (C1011n.f2711P) {
                    this.f2806c.mo3340x1(alpha);
                    Fragment fragment8 = this.f2806c;
                    if (fragment8.f2474L != null && visibility == 0) {
                        View findFocus = fragment8.f2475M.findFocus();
                        if (findFocus != null) {
                            this.f2806c.mo3324s1(findFocus);
                            if (C1011n.m4190E0(2)) {
                                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f2806c);
                            }
                        }
                        this.f2806c.f2475M.setAlpha(0.0f);
                    }
                } else {
                    Fragment fragment9 = this.f2806c;
                    if (visibility == 0 && fragment9.f2474L != null) {
                        z = true;
                    }
                    fragment9.f2480R = z;
                }
            }
            this.f2806c.f2494f = 2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo3685g() {
        Fragment f;
        if (C1011n.m4190E0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f2806c);
        }
        Fragment fragment = this.f2806c;
        boolean z = true;
        boolean z2 = fragment.f2506r && !fragment.mo3262W();
        if (z2 || this.f2805b.mo3715o().mo3669o(this.f2806c)) {
            C1006k<?> kVar = this.f2806c.f2513y;
            if (kVar instanceof C1103i0) {
                z = this.f2805b.mo3715o().mo3666l();
            } else if (kVar.mo3530j() instanceof Activity) {
                z = true ^ ((Activity) kVar.mo3530j()).isChangingConfigurations();
            }
            if (z2 || z) {
                this.f2805b.mo3715o().mo3660f(this.f2806c);
            }
            this.f2806c.mo3255R0();
            this.f2804a.mo3539d(this.f2806c, false);
            for (C1039u next : this.f2805b.mo3711k()) {
                if (next != null) {
                    Fragment k = next.mo3689k();
                    if (this.f2806c.f2499k.equals(k.f2502n)) {
                        k.f2501m = this.f2806c;
                        k.f2502n = null;
                    }
                }
            }
            Fragment fragment2 = this.f2806c;
            String str = fragment2.f2502n;
            if (str != null) {
                fragment2.f2501m = this.f2805b.mo3706f(str);
            }
            this.f2805b.mo3717q(this);
            return;
        }
        String str2 = this.f2806c.f2502n;
        if (!(str2 == null || (f = this.f2805b.mo3706f(str2)) == null || !f.f2469G)) {
            this.f2806c.f2501m = f;
        }
        this.f2806c.f2494f = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo3686h() {
        View view;
        if (C1011n.m4190E0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f2806c);
        }
        Fragment fragment = this.f2806c;
        ViewGroup viewGroup = fragment.f2474L;
        if (!(viewGroup == null || (view = fragment.f2475M) == null)) {
            viewGroup.removeView(view);
        }
        this.f2806c.mo3256S0();
        this.f2804a.mo3549n(this.f2806c, false);
        Fragment fragment2 = this.f2806c;
        fragment2.f2474L = null;
        fragment2.f2475M = null;
        fragment2.f2487Y = null;
        fragment2.f2488Z.mo3789j(null);
        this.f2806c.f2508t = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo3687i() {
        if (C1011n.m4190E0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f2806c);
        }
        this.f2806c.mo3258T0();
        boolean z = false;
        this.f2804a.mo3540e(this.f2806c, false);
        Fragment fragment = this.f2806c;
        fragment.f2494f = -1;
        fragment.f2513y = null;
        fragment.f2463A = null;
        fragment.f2512x = null;
        if (fragment.f2506r && !fragment.mo3262W()) {
            z = true;
        }
        if (z || this.f2805b.mo3715o().mo3669o(this.f2806c)) {
            if (C1011n.m4190E0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f2806c);
            }
            this.f2806c.mo3257T();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo3688j() {
        Fragment fragment = this.f2806c;
        if (fragment.f2507s && fragment.f2508t && !fragment.f2510v) {
            if (C1011n.m4190E0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f2806c);
            }
            Fragment fragment2 = this.f2806c;
            fragment2.mo3253Q0(fragment2.mo3259U0(fragment2.f2495g), (ViewGroup) null, this.f2806c.f2495g);
            View view = this.f2806c.f2475M;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f2806c;
                fragment3.f2475M.setTag(C4274b.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.f2806c;
                if (fragment4.f2467E) {
                    fragment4.f2475M.setVisibility(8);
                }
                this.f2806c.mo3290h1();
                C1009m mVar = this.f2804a;
                Fragment fragment5 = this.f2806c;
                mVar.mo3548m(fragment5, fragment5.f2475M, fragment5.f2495g, false);
                this.f2806c.f2494f = 2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Fragment mo3689k() {
        return this.f2806c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo3690m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (!this.f2807d) {
            boolean z = false;
            z = true;
            try {
                while (true) {
                    int d = mo3682d();
                    Fragment fragment = this.f2806c;
                    int i = fragment.f2494f;
                    if (d != i) {
                        if (d <= i) {
                            switch (i - 1) {
                                case -1:
                                    mo3687i();
                                    break;
                                case 0:
                                    mo3685g();
                                    break;
                                case 1:
                                    mo3686h();
                                    this.f2806c.f2494f = z ? 1 : 0;
                                    break;
                                case 2:
                                    fragment.f2508t = z;
                                    fragment.f2494f = 2;
                                    break;
                                case 3:
                                    if (C1011n.m4190E0(3)) {
                                        Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f2806c);
                                    }
                                    Fragment fragment2 = this.f2806c;
                                    if (fragment2.f2475M != null && fragment2.f2496h == null) {
                                        mo3695s();
                                    }
                                    Fragment fragment3 = this.f2806c;
                                    if (!(fragment3.f2475M == null || (viewGroup2 = fragment3.f2474L) == null)) {
                                        C0974c0.m4045n(viewGroup2, fragment3.mo3226D()).mo3419d(this);
                                    }
                                    this.f2806c.f2494f = 3;
                                    break;
                                case 4:
                                    mo3698v();
                                    break;
                                case 5:
                                    fragment.f2494f = 5;
                                    break;
                                case 6:
                                    mo3691n();
                                    break;
                            }
                        } else {
                            switch (i + 1) {
                                case 0:
                                    mo3681c();
                                    break;
                                case 1:
                                    mo3683e();
                                    break;
                                case 2:
                                    mo3688j();
                                    mo3684f();
                                    break;
                                case 3:
                                    mo3679a();
                                    break;
                                case 4:
                                    if (!(fragment.f2475M == null || (viewGroup3 = fragment.f2474L) == null)) {
                                        C0974c0.m4045n(viewGroup3, fragment.mo3226D()).mo3417b(C0974c0.C0979e.C0982c.m4075d(this.f2806c.f2475M.getVisibility()), this);
                                    }
                                    this.f2806c.f2494f = 4;
                                    break;
                                case 5:
                                    mo3697u();
                                    break;
                                case 6:
                                    fragment.f2494f = 6;
                                    break;
                                case 7:
                                    mo3693p();
                                    break;
                            }
                        }
                    } else {
                        if (C1011n.f2711P && fragment.f2481S) {
                            if (!(fragment.f2475M == null || (viewGroup = fragment.f2474L) == null)) {
                                C0974c0 n = C0974c0.m4045n(viewGroup, fragment.mo3226D());
                                if (this.f2806c.f2467E) {
                                    n.mo3418c(this);
                                } else {
                                    n.mo3420e(this);
                                }
                            }
                            Fragment fragment4 = this.f2806c;
                            C1011n nVar = fragment4.f2512x;
                            if (nVar != null) {
                                nVar.mo3555C0(fragment4);
                            }
                            Fragment fragment5 = this.f2806c;
                            fragment5.f2481S = z;
                            fragment5.mo3326t0(fragment5.f2467E);
                        }
                        this.f2807d = z;
                        return;
                    }
                }
            } finally {
                this.f2807d = z;
            }
        } else if (C1011n.m4190E0(2)) {
            Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + mo3689k());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo3691n() {
        if (C1011n.m4190E0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f2806c);
        }
        this.f2806c.mo3269Z0();
        this.f2804a.mo3541f(this.f2806c, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo3692o(ClassLoader classLoader) {
        Bundle bundle = this.f2806c.f2495g;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            Fragment fragment = this.f2806c;
            fragment.f2496h = fragment.f2495g.getSparseParcelableArray("android:view_state");
            Fragment fragment2 = this.f2806c;
            fragment2.f2497i = fragment2.f2495g.getBundle("android:view_registry_state");
            Fragment fragment3 = this.f2806c;
            fragment3.f2502n = fragment3.f2495g.getString("android:target_state");
            Fragment fragment4 = this.f2806c;
            if (fragment4.f2502n != null) {
                fragment4.f2503o = fragment4.f2495g.getInt("android:target_req_state", 0);
            }
            Fragment fragment5 = this.f2806c;
            Boolean bool = fragment5.f2498j;
            if (bool != null) {
                fragment5.f2477O = bool.booleanValue();
                this.f2806c.f2498j = null;
            } else {
                fragment5.f2477O = fragment5.f2495g.getBoolean("android:user_visible_hint", true);
            }
            Fragment fragment6 = this.f2806c;
            if (!fragment6.f2477O) {
                fragment6.f2476N = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo3693p() {
        if (C1011n.m4190E0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f2806c);
        }
        View x = this.f2806c.mo3338x();
        if (x != null && m4350l(x)) {
            boolean requestFocus = x.requestFocus();
            if (C1011n.m4190E0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(x);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.f2806c);
                sb.append(" resulting in focused view ");
                sb.append(this.f2806c.f2475M.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f2806c.mo3324s1((View) null);
        this.f2806c.mo3280d1();
        this.f2804a.mo3544i(this.f2806c, false);
        Fragment fragment = this.f2806c;
        fragment.f2495g = null;
        fragment.f2496h = null;
        fragment.f2497i = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C1037t mo3694r() {
        C1037t tVar = new C1037t(this.f2806c);
        Fragment fragment = this.f2806c;
        if (fragment.f2494f <= -1 || tVar.f2803r != null) {
            tVar.f2803r = fragment.f2495g;
        } else {
            Bundle q = m4351q();
            tVar.f2803r = q;
            if (this.f2806c.f2502n != null) {
                if (q == null) {
                    tVar.f2803r = new Bundle();
                }
                tVar.f2803r.putString("android:target_state", this.f2806c.f2502n);
                int i = this.f2806c.f2503o;
                if (i != 0) {
                    tVar.f2803r.putInt("android:target_req_state", i);
                }
            }
        }
        return tVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo3695s() {
        if (this.f2806c.f2475M != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f2806c.f2475M.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f2806c.f2496h = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.f2806c.f2487Y.mo3380g(bundle);
            if (!bundle.isEmpty()) {
                this.f2806c.f2497i = bundle;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo3696t(int i) {
        this.f2808e = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo3697u() {
        if (C1011n.m4190E0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f2806c);
        }
        this.f2806c.mo3285f1();
        this.f2804a.mo3546k(this.f2806c, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo3698v() {
        if (C1011n.m4190E0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f2806c);
        }
        this.f2806c.mo3288g1();
        this.f2804a.mo3547l(this.f2806c, false);
    }
}
