package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.C0594r;
import androidx.core.view.C0790g;
import androidx.lifecycle.C1083e0;
import androidx.lifecycle.C1095g;
import androidx.lifecycle.C1097h;
import androidx.lifecycle.C1098h0;
import androidx.lifecycle.C1099i;
import androidx.lifecycle.C1103i0;
import androidx.lifecycle.C1106j0;
import androidx.lifecycle.C1107k;
import androidx.lifecycle.C1108k0;
import androidx.lifecycle.C1110m;
import androidx.lifecycle.C1111n;
import androidx.lifecycle.C1117s;
import androidx.lifecycle.LiveData;
import androidx.loader.app.C1136a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import p001a0.C0005a;
import p046g0.C2623c;
import p046g0.C2627d;
import p046g0.C2629e;
import p046g0.C2630f;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, C1110m, C1103i0, C1097h, C2629e {

    /* renamed from: f0 */
    static final Object f2462f0 = new Object();

    /* renamed from: A */
    Fragment f2463A;

    /* renamed from: B */
    int f2464B;

    /* renamed from: C */
    int f2465C;

    /* renamed from: D */
    String f2466D;

    /* renamed from: E */
    boolean f2467E;

    /* renamed from: F */
    boolean f2468F;

    /* renamed from: G */
    boolean f2469G;

    /* renamed from: H */
    boolean f2470H;

    /* renamed from: I */
    boolean f2471I;

    /* renamed from: J */
    boolean f2472J = true;

    /* renamed from: K */
    private boolean f2473K;

    /* renamed from: L */
    ViewGroup f2474L;

    /* renamed from: M */
    View f2475M;

    /* renamed from: N */
    boolean f2476N;

    /* renamed from: O */
    boolean f2477O = true;

    /* renamed from: P */
    C0950e f2478P;

    /* renamed from: Q */
    Runnable f2479Q = new C0946a();

    /* renamed from: R */
    boolean f2480R;

    /* renamed from: S */
    boolean f2481S;

    /* renamed from: T */
    float f2482T;

    /* renamed from: U */
    LayoutInflater f2483U;

    /* renamed from: V */
    boolean f2484V;

    /* renamed from: W */
    C1099i.C1102c f2485W = C1099i.C1102c.RESUMED;

    /* renamed from: X */
    C1111n f2486X;

    /* renamed from: Y */
    C0955a0 f2487Y;

    /* renamed from: Z */
    C1117s<C1110m> f2488Z = new C1117s<>();

    /* renamed from: a0 */
    C1083e0.C1087b f2489a0;

    /* renamed from: b0 */
    C2627d f2490b0;

    /* renamed from: c0 */
    private int f2491c0;

    /* renamed from: d0 */
    private final AtomicInteger f2492d0 = new AtomicInteger();

    /* renamed from: e0 */
    private final ArrayList<C0952g> f2493e0 = new ArrayList<>();

    /* renamed from: f */
    int f2494f = -1;

    /* renamed from: g */
    Bundle f2495g;

    /* renamed from: h */
    SparseArray<Parcelable> f2496h;

    /* renamed from: i */
    Bundle f2497i;

    /* renamed from: j */
    Boolean f2498j;

    /* renamed from: k */
    String f2499k = UUID.randomUUID().toString();

    /* renamed from: l */
    Bundle f2500l;

    /* renamed from: m */
    Fragment f2501m;

    /* renamed from: n */
    String f2502n = null;

    /* renamed from: o */
    int f2503o;

    /* renamed from: p */
    private Boolean f2504p = null;

    /* renamed from: q */
    boolean f2505q;

    /* renamed from: r */
    boolean f2506r;

    /* renamed from: s */
    boolean f2507s;

    /* renamed from: t */
    boolean f2508t;

    /* renamed from: u */
    boolean f2509u;

    /* renamed from: v */
    boolean f2510v;

    /* renamed from: w */
    int f2511w;

    /* renamed from: x */
    C1011n f2512x;

    /* renamed from: y */
    C1006k<?> f2513y;

    /* renamed from: z */
    C1011n f2514z = new C1030o();

    /* renamed from: androidx.fragment.app.Fragment$a */
    class C0946a implements Runnable {
        C0946a() {
        }

        public void run() {
            Fragment.this.mo3346z1();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$b */
    class C0947b implements Runnable {
        C0947b() {
        }

        public void run() {
            Fragment.this.mo3272b(false);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$c */
    class C0948c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C0974c0 f2518f;

        C0948c(C0974c0 c0Var) {
            this.f2518f = c0Var;
        }

        public void run() {
            this.f2518f.mo3421g();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$d */
    class C0949d extends C1002g {
        C0949d() {
        }

        /* renamed from: d */
        public View mo3350d(int i) {
            View view = Fragment.this.f2475M;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        /* renamed from: e */
        public boolean mo3351e() {
            return Fragment.this.f2475M != null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$e */
    static class C0950e {

        /* renamed from: a */
        View f2521a;

        /* renamed from: b */
        Animator f2522b;

        /* renamed from: c */
        boolean f2523c;

        /* renamed from: d */
        int f2524d;

        /* renamed from: e */
        int f2525e;

        /* renamed from: f */
        int f2526f;

        /* renamed from: g */
        int f2527g;

        /* renamed from: h */
        int f2528h;

        /* renamed from: i */
        ArrayList<String> f2529i;

        /* renamed from: j */
        ArrayList<String> f2530j;

        /* renamed from: k */
        Object f2531k = null;

        /* renamed from: l */
        Object f2532l;

        /* renamed from: m */
        Object f2533m;

        /* renamed from: n */
        Object f2534n;

        /* renamed from: o */
        Object f2535o;

        /* renamed from: p */
        Object f2536p;

        /* renamed from: q */
        Boolean f2537q;

        /* renamed from: r */
        Boolean f2538r;

        /* renamed from: s */
        C0594r f2539s;

        /* renamed from: t */
        C0594r f2540t;

        /* renamed from: u */
        float f2541u;

        /* renamed from: v */
        View f2542v;

        /* renamed from: w */
        boolean f2543w;

        /* renamed from: x */
        C0953h f2544x;

        /* renamed from: y */
        boolean f2545y;

        C0950e() {
            Object obj = Fragment.f2462f0;
            this.f2532l = obj;
            this.f2533m = null;
            this.f2534n = obj;
            this.f2535o = null;
            this.f2536p = obj;
            this.f2541u = 1.0f;
            this.f2542v = null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$f */
    public static class C0951f extends RuntimeException {
        public C0951f(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$g */
    private static abstract class C0952g {
        private C0952g() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo3352a();
    }

    /* renamed from: androidx.fragment.app.Fragment$h */
    interface C0953h {
        /* renamed from: a */
        void mo3353a();

        /* renamed from: b */
        void mo3354b();
    }

    public Fragment() {
        m3852S();
    }

    /* renamed from: A */
    private int m3851A() {
        C1099i.C1102c cVar = this.f2485W;
        return (cVar == C1099i.C1102c.INITIALIZED || this.f2463A == null) ? cVar.ordinal() : Math.min(cVar.ordinal(), this.f2463A.m3851A());
    }

    /* renamed from: S */
    private void m3852S() {
        this.f2486X = new C1111n(this);
        this.f2490b0 = C2627d.m21343a(this);
        this.f2489a0 = null;
    }

    @Deprecated
    /* renamed from: U */
    public static Fragment m3853U(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) C1005j.m4165d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.mo3321r1(bundle);
            }
            return fragment;
        } catch (InstantiationException e) {
            throw new C0951f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new C0951f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new C0951f("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new C0951f("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }

    /* renamed from: e */
    private C0950e m3854e() {
        if (this.f2478P == null) {
            this.f2478P = new C0950e();
        }
        return this.f2478P;
    }

    /* renamed from: m1 */
    private void m3855m1() {
        if (C1011n.m4190E0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.f2475M != null) {
            mo3306n1(this.f2495g);
        }
        this.f2495g = null;
    }

    /* renamed from: A0 */
    public void mo3221A0(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public int mo3222B() {
        C0950e eVar = this.f2478P;
        if (eVar == null) {
            return 0;
        }
        return eVar.f2528h;
    }

    /* renamed from: B0 */
    public void mo3223B0(Menu menu) {
    }

    /* renamed from: C */
    public final Fragment mo3224C() {
        return this.f2463A;
    }

    /* renamed from: C0 */
    public void mo3225C0(boolean z) {
    }

    /* renamed from: D */
    public final C1011n mo3226D() {
        C1011n nVar = this.f2512x;
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    @Deprecated
    /* renamed from: D0 */
    public void mo3227D0(int i, String[] strArr, int[] iArr) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public boolean mo3228E() {
        C0950e eVar = this.f2478P;
        if (eVar == null) {
            return false;
        }
        return eVar.f2523c;
    }

    /* renamed from: E0 */
    public void mo3229E0() {
        this.f2473K = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public int mo3230F() {
        C0950e eVar = this.f2478P;
        if (eVar == null) {
            return 0;
        }
        return eVar.f2526f;
    }

    /* renamed from: F0 */
    public void mo3231F0(Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public int mo3232G() {
        C0950e eVar = this.f2478P;
        if (eVar == null) {
            return 0;
        }
        return eVar.f2527g;
    }

    /* renamed from: G0 */
    public void mo3233G0() {
        this.f2473K = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public float mo3234H() {
        C0950e eVar = this.f2478P;
        if (eVar == null) {
            return 1.0f;
        }
        return eVar.f2541u;
    }

    /* renamed from: H0 */
    public void mo3235H0() {
        this.f2473K = true;
    }

    /* renamed from: I */
    public Object mo3236I() {
        C0950e eVar = this.f2478P;
        if (eVar == null) {
            return null;
        }
        Object obj = eVar.f2534n;
        return obj == f2462f0 ? mo3332v() : obj;
    }

    /* renamed from: I0 */
    public void mo3237I0(View view, Bundle bundle) {
    }

    /* renamed from: J */
    public final Resources mo3238J() {
        return mo3296j1().getResources();
    }

    /* renamed from: J0 */
    public void mo3239J0(Bundle bundle) {
        this.f2473K = true;
    }

    /* renamed from: K */
    public Object mo3240K() {
        C0950e eVar = this.f2478P;
        if (eVar == null) {
            return null;
        }
        Object obj = eVar.f2532l;
        return obj == f2462f0 ? mo3322s() : obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K0 */
    public void mo3241K0(Bundle bundle) {
        this.f2514z.mo3577P0();
        this.f2494f = 3;
        this.f2473K = false;
        mo3279d0(bundle);
        if (this.f2473K) {
            m3855m1();
            this.f2514z.mo3629y();
            return;
        }
        throw new C0994e0("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* renamed from: L */
    public Object mo3242L() {
        C0950e eVar = this.f2478P;
        if (eVar == null) {
            return null;
        }
        return eVar.f2535o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L0 */
    public void mo3243L0() {
        Iterator<C0952g> it = this.f2493e0.iterator();
        while (it.hasNext()) {
            it.next().mo3352a();
        }
        this.f2493e0.clear();
        this.f2514z.mo3608j(this.f2513y, mo3275c(), this);
        this.f2494f = 0;
        this.f2473K = false;
        mo3287g0(this.f2513y.mo3530j());
        if (this.f2473K) {
            this.f2512x.mo3564I(this);
            this.f2514z.mo3630z();
            return;
        }
        throw new C0994e0("Fragment " + this + " did not call through to super.onAttach()");
    }

    /* renamed from: M */
    public Object mo3244M() {
        C0950e eVar = this.f2478P;
        if (eVar == null) {
            return null;
        }
        Object obj = eVar.f2536p;
        return obj == f2462f0 ? mo3242L() : obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M0 */
    public void mo3245M0(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.f2514z.mo3550A(configuration);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f2529i;
     */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<java.lang.String> mo3246N() {
        /*
            r1 = this;
            androidx.fragment.app.Fragment$e r0 = r1.f2478P
            if (r0 == 0) goto L_0x000a
            java.util.ArrayList<java.lang.String> r0 = r0.f2529i
            if (r0 != 0) goto L_0x0009
            goto L_0x000a
        L_0x0009:
            return r0
        L_0x000a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.mo3246N():java.util.ArrayList");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N0 */
    public boolean mo3247N0(MenuItem menuItem) {
        if (this.f2467E) {
            return false;
        }
        if (mo3292i0(menuItem)) {
            return true;
        }
        return this.f2514z.mo3552B(menuItem);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f2530j;
     */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<java.lang.String> mo3248O() {
        /*
            r1 = this;
            androidx.fragment.app.Fragment$e r0 = r1.f2478P
            if (r0 == 0) goto L_0x000a
            java.util.ArrayList<java.lang.String> r0 = r0.f2530j
            if (r0 != 0) goto L_0x0009
            goto L_0x000a
        L_0x0009:
            return r0
        L_0x000a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.mo3248O():java.util.ArrayList");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O0 */
    public void mo3249O0(Bundle bundle) {
        this.f2514z.mo3577P0();
        this.f2494f = 1;
        this.f2473K = false;
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2486X.mo3830a(new C1107k() {
                /* renamed from: e */
                public void mo527e(C1110m mVar, C1099i.C1101b bVar) {
                    View view;
                    if (bVar == C1099i.C1101b.ON_STOP && (view = Fragment.this.f2475M) != null) {
                        view.cancelPendingInputEvents();
                    }
                }
            });
        }
        this.f2490b0.mo12517d(bundle);
        mo3295j0(bundle);
        this.f2484V = true;
        if (this.f2473K) {
            this.f2486X.mo3835h(C1099i.C1101b.ON_CREATE);
            return;
        }
        throw new C0994e0("Fragment " + this + " did not call through to super.onCreate()");
    }

    @Deprecated
    /* renamed from: P */
    public final Fragment mo3250P() {
        String str;
        Fragment fragment = this.f2501m;
        if (fragment != null) {
            return fragment;
        }
        C1011n nVar = this.f2512x;
        if (nVar == null || (str = this.f2502n) == null) {
            return null;
        }
        return nVar.mo3598f0(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P0 */
    public boolean mo3251P0(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.f2467E) {
            return false;
        }
        if (this.f2471I && this.f2472J) {
            z = true;
            mo3303m0(menu, menuInflater);
        }
        return z | this.f2514z.mo3556D(menu, menuInflater);
    }

    /* renamed from: Q */
    public View mo3252Q() {
        return this.f2475M;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q0 */
    public void mo3253Q0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f2514z.mo3577P0();
        this.f2510v = true;
        this.f2487Y = new C0955a0(this, mo497k());
        View n0 = mo3305n0(layoutInflater, viewGroup, bundle);
        this.f2475M = n0;
        if (n0 != null) {
            this.f2487Y.mo3377c();
            C1106j0.m4574a(this.f2475M, this.f2487Y);
            C1108k0.m4576a(this.f2475M, this.f2487Y);
            C2630f.m21350a(this.f2475M, this.f2487Y);
            this.f2488Z.mo3789j(this.f2487Y);
        } else if (!this.f2487Y.mo3378d()) {
            this.f2487Y = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    /* renamed from: R */
    public LiveData<C1110m> mo3254R() {
        return this.f2488Z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R0 */
    public void mo3255R0() {
        this.f2514z.mo3558E();
        this.f2486X.mo3835h(C1099i.C1101b.ON_DESTROY);
        this.f2494f = 0;
        this.f2473K = false;
        this.f2484V = false;
        mo3308o0();
        if (!this.f2473K) {
            throw new C0994e0("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S0 */
    public void mo3256S0() {
        this.f2514z.mo3559F();
        if (this.f2475M != null && this.f2487Y.mo491a().mo3831b().mo3834b(C1099i.C1102c.CREATED)) {
            this.f2487Y.mo3376b(C1099i.C1101b.ON_DESTROY);
        }
        this.f2494f = 1;
        this.f2473K = false;
        mo3317q0();
        if (this.f2473K) {
            C1136a.m4639b(this).mo3884c();
            this.f2510v = false;
            return;
        }
        throw new C0994e0("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo3257T() {
        m3852S();
        this.f2499k = UUID.randomUUID().toString();
        this.f2505q = false;
        this.f2506r = false;
        this.f2507s = false;
        this.f2508t = false;
        this.f2509u = false;
        this.f2511w = 0;
        this.f2512x = null;
        this.f2514z = new C1030o();
        this.f2513y = null;
        this.f2464B = 0;
        this.f2465C = 0;
        this.f2466D = null;
        this.f2467E = false;
        this.f2468F = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T0 */
    public void mo3258T0() {
        this.f2494f = -1;
        this.f2473K = false;
        mo3320r0();
        this.f2483U = null;
        if (!this.f2473K) {
            throw new C0994e0("Fragment " + this + " did not call through to super.onDetach()");
        } else if (!this.f2514z.mo3557D0()) {
            this.f2514z.mo3558E();
            this.f2514z = new C1030o();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U0 */
    public LayoutInflater mo3259U0(Bundle bundle) {
        LayoutInflater s0 = mo3323s0(bundle);
        this.f2483U = s0;
        return s0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public boolean mo3260V() {
        C0950e eVar = this.f2478P;
        if (eVar == null) {
            return false;
        }
        return eVar.f2545y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V0 */
    public void mo3261V0() {
        onLowMemory();
        this.f2514z.mo3560G();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public final boolean mo3262W() {
        return this.f2511w > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W0 */
    public void mo3263W0(boolean z) {
        mo3336w0(z);
        this.f2514z.mo3562H(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.f2512x;
     */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo3264X() {
        /*
            r2 = this;
            boolean r0 = r2.f2472J
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.n r0 = r2.f2512x
            if (r0 == 0) goto L_0x0010
            androidx.fragment.app.Fragment r1 = r2.f2463A
            boolean r0 = r0.mo3561G0(r1)
            if (r0 == 0) goto L_0x0012
        L_0x0010:
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.mo3264X():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X0 */
    public boolean mo3265X0(MenuItem menuItem) {
        if (this.f2467E) {
            return false;
        }
        if (!this.f2471I || !this.f2472J || !mo3339x0(menuItem)) {
            return this.f2514z.mo3566J(menuItem);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public boolean mo3266Y() {
        C0950e eVar = this.f2478P;
        if (eVar == null) {
            return false;
        }
        return eVar.f2543w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y0 */
    public void mo3267Y0(Menu menu) {
        if (!this.f2467E) {
            if (this.f2471I && this.f2472J) {
                mo3342y0(menu);
            }
            this.f2514z.mo3568K(menu);
        }
    }

    /* renamed from: Z */
    public final boolean mo3268Z() {
        return this.f2506r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z0 */
    public void mo3269Z0() {
        this.f2514z.mo3570M();
        if (this.f2475M != null) {
            this.f2487Y.mo3376b(C1099i.C1101b.ON_PAUSE);
        }
        this.f2486X.mo3835h(C1099i.C1101b.ON_PAUSE);
        this.f2494f = 6;
        this.f2473K = false;
        mo3345z0();
        if (!this.f2473K) {
            throw new C0994e0("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* renamed from: a */
    public C1099i mo491a() {
        return this.f2486X;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public final boolean mo3270a0() {
        Fragment C = mo3224C();
        return C != null && (C.mo3268Z() || C.mo3270a0());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a1 */
    public void mo3271a1(boolean z) {
        mo3221A0(z);
        this.f2514z.mo3572N(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3272b(boolean z) {
        ViewGroup viewGroup;
        C1011n nVar;
        C0950e eVar = this.f2478P;
        C0953h hVar = null;
        if (eVar != null) {
            eVar.f2543w = false;
            C0953h hVar2 = eVar.f2544x;
            eVar.f2544x = null;
            hVar = hVar2;
        }
        if (hVar != null) {
            hVar.mo3353a();
        } else if (C1011n.f2711P && this.f2475M != null && (viewGroup = this.f2474L) != null && (nVar = this.f2512x) != null) {
            C0974c0 n = C0974c0.m4045n(viewGroup, nVar);
            n.mo3426p();
            if (z) {
                this.f2513y.mo3531l().post(new C0948c(n));
            } else {
                n.mo3421g();
            }
        }
    }

    /* renamed from: b0 */
    public final boolean mo3273b0() {
        C1011n nVar = this.f2512x;
        if (nVar == null) {
            return false;
        }
        return nVar.mo3567J0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b1 */
    public boolean mo3274b1(Menu menu) {
        boolean z = false;
        if (this.f2467E) {
            return false;
        }
        if (this.f2471I && this.f2472J) {
            z = true;
            mo3223B0(menu);
        }
        return z | this.f2514z.mo3574O(menu);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C1002g mo3275c() {
        return new C0949d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void mo3276c0() {
        this.f2514z.mo3577P0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c1 */
    public void mo3277c1() {
        boolean H0 = this.f2512x.mo3563H0(this);
        Boolean bool = this.f2504p;
        if (bool == null || bool.booleanValue() != H0) {
            this.f2504p = Boolean.valueOf(H0);
            mo3225C0(H0);
            this.f2514z.mo3576P();
        }
    }

    /* renamed from: d */
    public void mo3278d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f2464B));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f2465C));
        printWriter.print(" mTag=");
        printWriter.println(this.f2466D);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f2494f);
        printWriter.print(" mWho=");
        printWriter.print(this.f2499k);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f2511w);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f2505q);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f2506r);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f2507s);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f2508t);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f2467E);
        printWriter.print(" mDetached=");
        printWriter.print(this.f2468F);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f2472J);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f2471I);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f2469G);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f2477O);
        if (this.f2512x != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f2512x);
        }
        if (this.f2513y != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f2513y);
        }
        if (this.f2463A != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f2463A);
        }
        if (this.f2500l != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f2500l);
        }
        if (this.f2495g != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f2495g);
        }
        if (this.f2496h != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f2496h);
        }
        if (this.f2497i != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f2497i);
        }
        Fragment P = mo3250P();
        if (P != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(P);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f2503o);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(mo3228E());
        if (mo3319r() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(mo3319r());
        }
        if (mo3329u() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(mo3329u());
        }
        if (mo3230F() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(mo3230F());
        }
        if (mo3232G() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(mo3232G());
        }
        if (this.f2474L != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f2474L);
        }
        if (this.f2475M != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f2475M);
        }
        if (mo3304n() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(mo3304n());
        }
        if (mo3316q() != null) {
            C1136a.m4639b(this).mo3883a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f2514z + ":");
        C1011n nVar = this.f2514z;
        nVar.mo3587W(str + "  ", fileDescriptor, printWriter, strArr);
    }

    @Deprecated
    /* renamed from: d0 */
    public void mo3279d0(Bundle bundle) {
        this.f2473K = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d1 */
    public void mo3280d1() {
        this.f2514z.mo3577P0();
        this.f2514z.mo3591a0(true);
        this.f2494f = 7;
        this.f2473K = false;
        mo3229E0();
        if (this.f2473K) {
            C1111n nVar = this.f2486X;
            C1099i.C1101b bVar = C1099i.C1101b.ON_RESUME;
            nVar.mo3835h(bVar);
            if (this.f2475M != null) {
                this.f2487Y.mo3376b(bVar);
            }
            this.f2514z.mo3578Q();
            return;
        }
        throw new C0994e0("Fragment " + this + " did not call through to super.onResume()");
    }

    @Deprecated
    /* renamed from: e0 */
    public void mo3281e0(int i, int i2, Intent intent) {
        if (C1011n.m4190E0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e1 */
    public void mo3282e1(Bundle bundle) {
        mo3231F0(bundle);
        this.f2490b0.mo12518e(bundle);
        Parcelable d1 = this.f2514z.mo3594d1();
        if (d1 != null) {
            bundle.putParcelable("android:support:fragments", d1);
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f */
    public /* synthetic */ C0005a mo493f() {
        return C1095g.m4558a(this);
    }

    @Deprecated
    /* renamed from: f0 */
    public void mo3284f0(Activity activity) {
        this.f2473K = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f1 */
    public void mo3285f1() {
        this.f2514z.mo3577P0();
        this.f2514z.mo3591a0(true);
        this.f2494f = 5;
        this.f2473K = false;
        mo3233G0();
        if (this.f2473K) {
            C1111n nVar = this.f2486X;
            C1099i.C1101b bVar = C1099i.C1101b.ON_START;
            nVar.mo3835h(bVar);
            if (this.f2475M != null) {
                this.f2487Y.mo3376b(bVar);
            }
            this.f2514z.mo3580R();
            return;
        }
        throw new C0994e0("Fragment " + this + " did not call through to super.onStart()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Fragment mo3286g(String str) {
        return str.equals(this.f2499k) ? this : this.f2514z.mo3607i0(str);
    }

    /* renamed from: g0 */
    public void mo3287g0(Context context) {
        this.f2473K = true;
        C1006k<?> kVar = this.f2513y;
        Activity f = kVar == null ? null : kVar.mo3529f();
        if (f != null) {
            this.f2473K = false;
            mo3284f0(f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g1 */
    public void mo3288g1() {
        this.f2514z.mo3583T();
        if (this.f2475M != null) {
            this.f2487Y.mo3376b(C1099i.C1101b.ON_STOP);
        }
        this.f2486X.mo3835h(C1099i.C1101b.ON_STOP);
        this.f2494f = 4;
        this.f2473K = false;
        mo3235H0();
        if (!this.f2473K) {
            throw new C0994e0("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    @Deprecated
    /* renamed from: h0 */
    public void mo3289h0(Fragment fragment) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h1 */
    public void mo3290h1() {
        mo3237I0(this.f2475M, this.f2495g);
        this.f2514z.mo3585U();
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public final C2623c mo496i() {
        return this.f2490b0.mo12515b();
    }

    /* renamed from: i0 */
    public boolean mo3292i0(MenuItem menuItem) {
        return false;
    }

    /* renamed from: i1 */
    public final C0990e mo3293i1() {
        C0990e j = mo3294j();
        if (j != null) {
            return j;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    /* renamed from: j */
    public final C0990e mo3294j() {
        C1006k<?> kVar = this.f2513y;
        if (kVar == null) {
            return null;
        }
        return (C0990e) kVar.mo3529f();
    }

    /* renamed from: j0 */
    public void mo3295j0(Bundle bundle) {
        this.f2473K = true;
        mo3301l1(bundle);
        if (!this.f2514z.mo3565I0(1)) {
            this.f2514z.mo3554C();
        }
    }

    /* renamed from: j1 */
    public final Context mo3296j1() {
        Context q = mo3316q();
        if (q != null) {
            return q;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* renamed from: k */
    public C1098h0 mo497k() {
        if (this.f2512x == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (m3851A() != C1099i.C1102c.INITIALIZED.ordinal()) {
            return this.f2512x.mo3631z0(this);
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    /* renamed from: k0 */
    public Animation mo3297k0(int i, boolean z, int i2) {
        return null;
    }

    /* renamed from: k1 */
    public final View mo3298k1() {
        View Q = mo3252Q();
        if (Q != null) {
            return Q;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* renamed from: l */
    public boolean mo3299l() {
        Boolean bool;
        C0950e eVar = this.f2478P;
        if (eVar == null || (bool = eVar.f2538r) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: l0 */
    public Animator mo3300l0(int i, boolean z, int i2) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l1 */
    public void mo3301l1(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f2514z.mo3593b1(parcelable);
            this.f2514z.mo3554C();
        }
    }

    /* renamed from: m */
    public boolean mo3302m() {
        Boolean bool;
        C0950e eVar = this.f2478P;
        if (eVar == null || (bool = eVar.f2537q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: m0 */
    public void mo3303m0(Menu menu, MenuInflater menuInflater) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public View mo3304n() {
        C0950e eVar = this.f2478P;
        if (eVar == null) {
            return null;
        }
        return eVar.f2521a;
    }

    /* renamed from: n0 */
    public View mo3305n0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.f2491c0;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n1 */
    public final void mo3306n1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f2496h;
        if (sparseArray != null) {
            this.f2475M.restoreHierarchyState(sparseArray);
            this.f2496h = null;
        }
        if (this.f2475M != null) {
            this.f2487Y.mo3379e(this.f2497i);
            this.f2497i = null;
        }
        this.f2473K = false;
        mo3239J0(bundle);
        if (!this.f2473K) {
            throw new C0994e0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.f2475M != null) {
            this.f2487Y.mo3376b(C1099i.C1101b.ON_CREATE);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public Animator mo3307o() {
        C0950e eVar = this.f2478P;
        if (eVar == null) {
            return null;
        }
        return eVar.f2522b;
    }

    /* renamed from: o0 */
    public void mo3308o0() {
        this.f2473K = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o1 */
    public void mo3309o1(View view) {
        m3854e().f2521a = view;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f2473K = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        mo3293i1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.f2473K = true;
    }

    /* renamed from: p */
    public final C1011n mo3313p() {
        if (this.f2513y != null) {
            return this.f2514z;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    /* renamed from: p0 */
    public void mo3314p0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p1 */
    public void mo3315p1(int i, int i2, int i3, int i4) {
        if (this.f2478P != null || i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
            m3854e().f2524d = i;
            m3854e().f2525e = i2;
            m3854e().f2526f = i3;
            m3854e().f2527g = i4;
        }
    }

    /* renamed from: q */
    public Context mo3316q() {
        C1006k<?> kVar = this.f2513y;
        if (kVar == null) {
            return null;
        }
        return kVar.mo3530j();
    }

    /* renamed from: q0 */
    public void mo3317q0() {
        this.f2473K = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q1 */
    public void mo3318q1(Animator animator) {
        m3854e().f2522b = animator;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public int mo3319r() {
        C0950e eVar = this.f2478P;
        if (eVar == null) {
            return 0;
        }
        return eVar.f2524d;
    }

    /* renamed from: r0 */
    public void mo3320r0() {
        this.f2473K = true;
    }

    /* renamed from: r1 */
    public void mo3321r1(Bundle bundle) {
        if (this.f2512x == null || !mo3273b0()) {
            this.f2500l = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    /* renamed from: s */
    public Object mo3322s() {
        C0950e eVar = this.f2478P;
        if (eVar == null) {
            return null;
        }
        return eVar.f2531k;
    }

    /* renamed from: s0 */
    public LayoutInflater mo3323s0(Bundle bundle) {
        return mo3344z(bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s1 */
    public void mo3324s1(View view) {
        m3854e().f2542v = view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public C0594r mo3325t() {
        C0950e eVar = this.f2478P;
        if (eVar == null) {
            return null;
        }
        return eVar.f2539s;
    }

    /* renamed from: t0 */
    public void mo3326t0(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t1 */
    public void mo3327t1(boolean z) {
        m3854e().f2545y = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f2499k);
        if (this.f2464B != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f2464B));
        }
        if (this.f2466D != null) {
            sb.append(" tag=");
            sb.append(this.f2466D);
        }
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public int mo3329u() {
        C0950e eVar = this.f2478P;
        if (eVar == null) {
            return 0;
        }
        return eVar.f2525e;
    }

    @Deprecated
    /* renamed from: u0 */
    public void mo3330u0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f2473K = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u1 */
    public void mo3331u1(int i) {
        if (this.f2478P != null || i != 0) {
            m3854e();
            this.f2478P.f2528h = i;
        }
    }

    /* renamed from: v */
    public Object mo3332v() {
        C0950e eVar = this.f2478P;
        if (eVar == null) {
            return null;
        }
        return eVar.f2533m;
    }

    /* renamed from: v0 */
    public void mo3333v0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f2473K = true;
        C1006k<?> kVar = this.f2513y;
        Activity f = kVar == null ? null : kVar.mo3529f();
        if (f != null) {
            this.f2473K = false;
            mo3330u0(f, attributeSet, bundle);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v1 */
    public void mo3334v1(C0953h hVar) {
        m3854e();
        C0950e eVar = this.f2478P;
        C0953h hVar2 = eVar.f2544x;
        if (hVar != hVar2) {
            if (hVar == null || hVar2 == null) {
                if (eVar.f2543w) {
                    eVar.f2544x = hVar;
                }
                if (hVar != null) {
                    hVar.mo3354b();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public C0594r mo3335w() {
        C0950e eVar = this.f2478P;
        if (eVar == null) {
            return null;
        }
        return eVar.f2540t;
    }

    /* renamed from: w0 */
    public void mo3336w0(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w1 */
    public void mo3337w1(boolean z) {
        if (this.f2478P != null) {
            m3854e().f2523c = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public View mo3338x() {
        C0950e eVar = this.f2478P;
        if (eVar == null) {
            return null;
        }
        return eVar.f2542v;
    }

    /* renamed from: x0 */
    public boolean mo3339x0(MenuItem menuItem) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x1 */
    public void mo3340x1(float f) {
        m3854e().f2541u = f;
    }

    /* renamed from: y */
    public final Object mo3341y() {
        C1006k<?> kVar = this.f2513y;
        if (kVar == null) {
            return null;
        }
        return kVar.mo3473m();
    }

    /* renamed from: y0 */
    public void mo3342y0(Menu menu) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y1 */
    public void mo3343y1(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        m3854e();
        C0950e eVar = this.f2478P;
        eVar.f2529i = arrayList;
        eVar.f2530j = arrayList2;
    }

    @Deprecated
    /* renamed from: z */
    public LayoutInflater mo3344z(Bundle bundle) {
        C1006k<?> kVar = this.f2513y;
        if (kVar != null) {
            LayoutInflater n = kVar.mo3474n();
            C0790g.m3137b(n, this.f2514z.mo3621t0());
            return n;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    /* renamed from: z0 */
    public void mo3345z0() {
        this.f2473K = true;
    }

    /* renamed from: z1 */
    public void mo3346z1() {
        if (this.f2478P != null && m3854e().f2543w) {
            if (this.f2513y == null) {
                m3854e().f2543w = false;
            } else if (Looper.myLooper() != this.f2513y.mo3531l().getLooper()) {
                this.f2513y.mo3531l().postAtFrontOfQueue(new C0947b());
            } else {
                mo3272b(true);
            }
        }
    }
}
