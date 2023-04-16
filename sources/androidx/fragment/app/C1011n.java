package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.C0220g;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.C0224a;
import androidx.activity.result.C0226b;
import androidx.activity.result.C0227c;
import androidx.core.p009os.C0678e;
import androidx.fragment.app.C0995f;
import androidx.fragment.app.C1043w;
import androidx.fragment.app.C1045x;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1098h0;
import androidx.lifecycle.C1099i;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p031e.C2532a;
import p102o.C3803b;
import p158x.C4274b;

/* renamed from: androidx.fragment.app.n */
public abstract class C1011n {

    /* renamed from: O */
    private static boolean f2710O = false;

    /* renamed from: P */
    static boolean f2711P = true;

    /* renamed from: A */
    private C0227c<Object> f2712A;

    /* renamed from: B */
    private C0227c<String[]> f2713B;

    /* renamed from: C */
    ArrayDeque<C1024m> f2714C = new ArrayDeque<>();

    /* renamed from: D */
    private boolean f2715D;

    /* renamed from: E */
    private boolean f2716E;

    /* renamed from: F */
    private boolean f2717F;

    /* renamed from: G */
    private boolean f2718G;

    /* renamed from: H */
    private boolean f2719H;

    /* renamed from: I */
    private ArrayList<C0954a> f2720I;

    /* renamed from: J */
    private ArrayList<Boolean> f2721J;

    /* renamed from: K */
    private ArrayList<Fragment> f2722K;

    /* renamed from: L */
    private ArrayList<C1029q> f2723L;

    /* renamed from: M */
    private C1033q f2724M;

    /* renamed from: N */
    private Runnable f2725N = new C1018g();

    /* renamed from: a */
    private final ArrayList<C1027o> f2726a = new ArrayList<>();

    /* renamed from: b */
    private boolean f2727b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1042v f2728c = new C1042v();

    /* renamed from: d */
    ArrayList<C0954a> f2729d;

    /* renamed from: e */
    private ArrayList<Fragment> f2730e;

    /* renamed from: f */
    private final C1007l f2731f = new C1007l(this);

    /* renamed from: g */
    private OnBackPressedDispatcher f2732g;

    /* renamed from: h */
    private final C0220g f2733h = new C1014c(false);

    /* renamed from: i */
    private final AtomicInteger f2734i = new AtomicInteger();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Map<String, Bundle> f2735j = Collections.synchronizedMap(new HashMap());
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Map<String, Object> f2736k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l */
    private ArrayList<C1026n> f2737l;

    /* renamed from: m */
    private Map<Fragment, HashSet<C0678e>> f2738m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n */
    private final C1045x.C1052g f2739n = new C1015d();

    /* renamed from: o */
    private final C1009m f2740o = new C1009m(this);

    /* renamed from: p */
    private final CopyOnWriteArrayList<C1035r> f2741p = new CopyOnWriteArrayList<>();

    /* renamed from: q */
    int f2742q = -1;

    /* renamed from: r */
    private C1006k<?> f2743r;

    /* renamed from: s */
    private C1002g f2744s;

    /* renamed from: t */
    private Fragment f2745t;

    /* renamed from: u */
    Fragment f2746u;

    /* renamed from: v */
    private C1005j f2747v = null;

    /* renamed from: w */
    private C1005j f2748w = new C1016e();

    /* renamed from: x */
    private C0989d0 f2749x = null;

    /* renamed from: y */
    private C0989d0 f2750y = new C1017f();

    /* renamed from: z */
    private C0227c<Intent> f2751z;

    /* renamed from: androidx.fragment.app.n$a */
    class C1012a implements C0226b<C0224a> {
        C1012a() {
        }

        /* renamed from: b */
        public void mo556a(C0224a aVar) {
            C1024m pollFirst = C1011n.this.f2714C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.f2766f;
            int i = pollFirst.f2767g;
            Fragment i2 = C1011n.this.f2728c.mo3709i(str);
            if (i2 == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            i2.mo3281e0(i, aVar.mo548c(), aVar.mo547b());
        }
    }

    /* renamed from: androidx.fragment.app.n$b */
    class C1013b implements C0226b<Map<String, Boolean>> {
        C1013b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void mo556a(Map<String, Boolean> map) {
            StringBuilder sb;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            C1024m pollFirst = C1011n.this.f2714C.pollFirst();
            if (pollFirst == null) {
                sb = new StringBuilder();
                sb.append("No permissions were requested for ");
                sb.append(this);
            } else {
                String str = pollFirst.f2766f;
                int i2 = pollFirst.f2767g;
                Fragment i3 = C1011n.this.f2728c.mo3709i(str);
                if (i3 == null) {
                    sb = new StringBuilder();
                    sb.append("Permission request result delivered for unknown Fragment ");
                    sb.append(str);
                } else {
                    i3.mo3227D0(i2, strArr, iArr);
                    return;
                }
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    /* renamed from: androidx.fragment.app.n$c */
    class C1014c extends C0220g {
        C1014c(boolean z) {
            super(z);
        }

        /* renamed from: b */
        public void mo542b() {
            C1011n.this.mo3551A0();
        }
    }

    /* renamed from: androidx.fragment.app.n$d */
    class C1015d implements C1045x.C1052g {
        C1015d() {
        }

        /* renamed from: a */
        public void mo3634a(Fragment fragment, C0678e eVar) {
            if (!eVar.mo2678b()) {
                C1011n.this.mo3588X0(fragment, eVar);
            }
        }

        /* renamed from: b */
        public void mo3635b(Fragment fragment, C0678e eVar) {
            C1011n.this.mo3597f(fragment, eVar);
        }
    }

    /* renamed from: androidx.fragment.app.n$e */
    class C1016e extends C1005j {
        C1016e() {
        }

        /* renamed from: a */
        public Fragment mo3528a(ClassLoader classLoader, String str) {
            return C1011n.this.mo3619s0().mo3486c(C1011n.this.mo3619s0().mo3530j(), str, (Bundle) null);
        }
    }

    /* renamed from: androidx.fragment.app.n$f */
    class C1017f implements C0989d0 {
        C1017f() {
        }

        /* renamed from: a */
        public C0974c0 mo3458a(ViewGroup viewGroup) {
            return new C0959c(viewGroup);
        }
    }

    /* renamed from: androidx.fragment.app.n$g */
    class C1018g implements Runnable {
        C1018g() {
        }

        public void run() {
            C1011n.this.mo3591a0(true);
        }
    }

    /* renamed from: androidx.fragment.app.n$h */
    class C1019h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2759a;

        /* renamed from: b */
        final /* synthetic */ View f2760b;

        /* renamed from: c */
        final /* synthetic */ Fragment f2761c;

        C1019h(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f2759a = viewGroup;
            this.f2760b = view;
            this.f2761c = fragment;
        }

        public void onAnimationEnd(Animator animator) {
            this.f2759a.endViewTransition(this.f2760b);
            animator.removeListener(this);
            Fragment fragment = this.f2761c;
            View view = fragment.f2475M;
            if (view != null && fragment.f2467E) {
                view.setVisibility(8);
            }
        }
    }

    /* renamed from: androidx.fragment.app.n$i */
    class C1020i implements C1035r {

        /* renamed from: f */
        final /* synthetic */ Fragment f2763f;

        C1020i(Fragment fragment) {
            this.f2763f = fragment;
        }

        /* renamed from: b */
        public void mo3472b(C1011n nVar, Fragment fragment) {
            this.f2763f.mo3289h0(fragment);
        }
    }

    /* renamed from: androidx.fragment.app.n$j */
    class C1021j implements C0226b<C0224a> {
        C1021j() {
        }

        /* renamed from: b */
        public void mo556a(C0224a aVar) {
            C1024m pollFirst = C1011n.this.f2714C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollFirst.f2766f;
            int i = pollFirst.f2767g;
            Fragment i2 = C1011n.this.f2728c.mo3709i(str);
            if (i2 == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                return;
            }
            i2.mo3281e0(i, aVar.mo548c(), aVar.mo547b());
        }
    }

    /* renamed from: androidx.fragment.app.n$k */
    static class C1022k extends C2532a<Object, C0224a> {
        C1022k() {
        }

        /* renamed from: b */
        public C0224a mo3639a(int i, Intent intent) {
            return new C0224a(i, intent);
        }
    }

    /* renamed from: androidx.fragment.app.n$l */
    public static abstract class C1023l {
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.fragment.app.n$m */
    static class C1024m implements Parcelable {
        public static final Parcelable.Creator<C1024m> CREATOR = new C1025a();

        /* renamed from: f */
        String f2766f;

        /* renamed from: g */
        int f2767g;

        /* renamed from: androidx.fragment.app.n$m$a */
        class C1025a implements Parcelable.Creator<C1024m> {
            C1025a() {
            }

            /* renamed from: a */
            public C1024m createFromParcel(Parcel parcel) {
                return new C1024m(parcel);
            }

            /* renamed from: b */
            public C1024m[] newArray(int i) {
                return new C1024m[i];
            }
        }

        C1024m(Parcel parcel) {
            this.f2766f = parcel.readString();
            this.f2767g = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f2766f);
            parcel.writeInt(this.f2767g);
        }
    }

    /* renamed from: androidx.fragment.app.n$n */
    public interface C1026n {
        /* renamed from: a */
        void mo3647a();
    }

    /* renamed from: androidx.fragment.app.n$o */
    interface C1027o {
        /* renamed from: a */
        boolean mo3356a(ArrayList<C0954a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: androidx.fragment.app.n$p */
    private class C1028p implements C1027o {

        /* renamed from: a */
        final String f2768a;

        /* renamed from: b */
        final int f2769b;

        /* renamed from: c */
        final int f2770c;

        C1028p(String str, int i, int i2) {
            this.f2768a = str;
            this.f2769b = i;
            this.f2770c = i2;
        }

        /* renamed from: a */
        public boolean mo3356a(ArrayList<C0954a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = C1011n.this.f2746u;
            if (fragment != null && this.f2769b < 0 && this.f2768a == null && fragment.mo3313p().mo3584T0()) {
                return false;
            }
            return C1011n.this.mo3586V0(arrayList, arrayList2, this.f2768a, this.f2769b, this.f2770c);
        }
    }

    /* renamed from: androidx.fragment.app.n$q */
    static class C1029q implements Fragment.C0953h {

        /* renamed from: a */
        final boolean f2772a;

        /* renamed from: b */
        final C0954a f2773b;

        /* renamed from: c */
        private int f2774c;

        C1029q(C0954a aVar, boolean z) {
            this.f2772a = z;
            this.f2773b = aVar;
        }

        /* renamed from: a */
        public void mo3353a() {
            int i = this.f2774c - 1;
            this.f2774c = i;
            if (i == 0) {
                this.f2773b.f2550t.mo3596e1();
            }
        }

        /* renamed from: b */
        public void mo3354b() {
            this.f2774c++;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3648c() {
            C0954a aVar = this.f2773b;
            aVar.f2550t.mo3620t(aVar, this.f2772a, false, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo3649d() {
            boolean z = this.f2774c > 0;
            for (Fragment next : this.f2773b.f2550t.mo3618r0()) {
                next.mo3334v1((Fragment.C0953h) null);
                if (z && next.mo3266Y()) {
                    next.mo3346z1();
                }
            }
            C0954a aVar = this.f2773b;
            aVar.f2550t.mo3620t(aVar, this.f2772a, !z, true);
        }

        /* renamed from: e */
        public boolean mo3650e() {
            return this.f2774c == 0;
        }
    }

    /* renamed from: E0 */
    static boolean m4190E0(int i) {
        return f2710O || Log.isLoggable("FragmentManager", i);
    }

    /* renamed from: F0 */
    private boolean m4191F0(Fragment fragment) {
        return (fragment.f2471I && fragment.f2472J) || fragment.f2514z.mo3613n();
    }

    /* renamed from: K0 */
    private void m4192K0(C3803b<Fragment> bVar) {
        int size = bVar.size();
        for (int i = 0; i < size; i++) {
            Fragment o = bVar.mo15073o(i);
            if (!o.f2505q) {
                View k1 = o.mo3298k1();
                o.f2482T = k1.getAlpha();
                k1.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: L */
    private void m4193L(Fragment fragment) {
        if (fragment != null && fragment.equals(mo3598f0(fragment.f2499k))) {
            fragment.mo3277c1();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: S */
    private void m4194S(int i) {
        try {
            this.f2727b = true;
            this.f2728c.mo3704d(i);
            mo3571M0(i, false);
            if (f2711P) {
                for (C0974c0 j : m4220r()) {
                    j.mo3422j();
                }
            }
            this.f2727b = false;
            mo3591a0(true);
        } catch (Throwable th) {
            this.f2727b = false;
            throw th;
        }
    }

    /* renamed from: U0 */
    private boolean m4195U0(String str, int i, int i2) {
        mo3591a0(false);
        m4199Z(true);
        Fragment fragment = this.f2746u;
        if (fragment != null && i < 0 && str == null && fragment.mo3313p().mo3584T0()) {
            return true;
        }
        boolean V0 = mo3586V0(this.f2720I, this.f2721J, str, i, i2);
        if (V0) {
            this.f2727b = true;
            try {
                m4200Z0(this.f2720I, this.f2721J);
            } finally {
                m4219p();
            }
        }
        m4214l1();
        m4196V();
        this.f2728c.mo3702b();
        return V0;
    }

    /* renamed from: V */
    private void m4196V() {
        if (this.f2719H) {
            this.f2719H = false;
            m4213k1();
        }
    }

    /* renamed from: W0 */
    private int m4197W0(ArrayList<C0954a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, C3803b<Fragment> bVar) {
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C0954a aVar = arrayList.get(i4);
            boolean booleanValue = arrayList2.get(i4).booleanValue();
            if (aVar.mo3373x() && !aVar.mo3372v(arrayList, i4 + 1, i2)) {
                if (this.f2723L == null) {
                    this.f2723L = new ArrayList<>();
                }
                C1029q qVar = new C1029q(aVar, booleanValue);
                this.f2723L.add(qVar);
                aVar.mo3375z(qVar);
                if (booleanValue) {
                    aVar.mo3366q();
                } else {
                    aVar.mo3367r(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, aVar);
                }
                m4207d(bVar);
            }
        }
        return i3;
    }

    /* renamed from: X */
    private void m4198X() {
        if (f2711P) {
            for (C0974c0 j : m4220r()) {
                j.mo3422j();
            }
        } else if (!this.f2738m.isEmpty()) {
            for (Fragment next : this.f2738m.keySet()) {
                m4215m(next);
                mo3573N0(next);
            }
        }
    }

    /* renamed from: Z */
    private void m4199Z(boolean z) {
        if (this.f2727b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f2743r == null) {
            if (this.f2718G) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.f2743r.mo3531l().getLooper()) {
            if (!z) {
                m4217o();
            }
            if (this.f2720I == null) {
                this.f2720I = new ArrayList<>();
                this.f2721J = new ArrayList<>();
            }
            this.f2727b = true;
            try {
                m4209e0((ArrayList<C0954a>) null, (ArrayList<Boolean>) null);
            } finally {
                this.f2727b = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* renamed from: Z0 */
    private void m4200Z0(ArrayList<C0954a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                m4209e0(arrayList, arrayList2);
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!arrayList.get(i).f2832r) {
                        if (i2 != i) {
                            m4208d0(arrayList, arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (arrayList2.get(i).booleanValue()) {
                            while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f2832r) {
                                i2++;
                            }
                        }
                        m4208d0(arrayList, arrayList2, i, i2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    m4208d0(arrayList, arrayList2, i2, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    /* renamed from: a1 */
    private void m4202a1() {
        if (this.f2737l != null) {
            for (int i = 0; i < this.f2737l.size(); i++) {
                this.f2737l.get(i).mo3647a();
            }
        }
    }

    /* renamed from: c0 */
    private static void m4205c0(ArrayList<C0954a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C0954a aVar = arrayList.get(i);
            boolean z = true;
            if (arrayList2.get(i).booleanValue()) {
                aVar.mo3362m(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                aVar.mo3367r(z);
            } else {
                aVar.mo3362m(1);
                aVar.mo3366q();
            }
            i++;
        }
    }

    /* renamed from: c1 */
    static int m4206c1(int i) {
        if (i == 4097) {
            return 8194;
        }
        if (i != 4099) {
            return i != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    /* renamed from: d */
    private void m4207d(C3803b<Fragment> bVar) {
        int i = this.f2742q;
        if (i >= 1) {
            int min = Math.min(i, 5);
            for (Fragment next : this.f2728c.mo3714n()) {
                if (next.f2494f < min) {
                    mo3575O0(next, min);
                    if (next.f2475M != null && !next.f2467E && next.f2480R) {
                        bVar.add(next);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01be  */
    /* renamed from: d0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4208d0(java.util.ArrayList<androidx.fragment.app.C0954a> r18, java.util.ArrayList<java.lang.Boolean> r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            r15 = r18
            r5 = r19
            r4 = r20
            r3 = r21
            java.lang.Object r0 = r15.get(r4)
            androidx.fragment.app.a r0 = (androidx.fragment.app.C0954a) r0
            boolean r2 = r0.f2832r
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.f2722K
            if (r0 != 0) goto L_0x001e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.f2722K = r0
            goto L_0x0021
        L_0x001e:
            r0.clear()
        L_0x0021:
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.f2722K
            androidx.fragment.app.v r1 = r6.f2728c
            java.util.List r1 = r1.mo3714n()
            r0.addAll(r1)
            androidx.fragment.app.Fragment r0 = r17.mo3626w0()
            r1 = 0
            r16 = r1
            r7 = r4
        L_0x0034:
            r14 = 1
            if (r7 >= r3) goto L_0x0065
            java.lang.Object r8 = r15.get(r7)
            androidx.fragment.app.a r8 = (androidx.fragment.app.C0954a) r8
            java.lang.Object r9 = r5.get(r7)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L_0x0050
            java.util.ArrayList<androidx.fragment.app.Fragment> r9 = r6.f2722K
            androidx.fragment.app.Fragment r0 = r8.mo3368s(r9, r0)
            goto L_0x0056
        L_0x0050:
            java.util.ArrayList<androidx.fragment.app.Fragment> r9 = r6.f2722K
            androidx.fragment.app.Fragment r0 = r8.mo3355A(r9, r0)
        L_0x0056:
            if (r16 != 0) goto L_0x0060
            boolean r8 = r8.f2823i
            if (r8 == 0) goto L_0x005d
            goto L_0x0060
        L_0x005d:
            r16 = r1
            goto L_0x0062
        L_0x0060:
            r16 = r14
        L_0x0062:
            int r7 = r7 + 1
            goto L_0x0034
        L_0x0065:
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.f2722K
            r0.clear()
            if (r2 != 0) goto L_0x00bd
            int r0 = r6.f2742q
            if (r0 < r14) goto L_0x00bd
            boolean r0 = f2711P
            if (r0 == 0) goto L_0x00a4
            r0 = r4
        L_0x0075:
            if (r0 >= r3) goto L_0x00bd
            java.lang.Object r1 = r15.get(r0)
            androidx.fragment.app.a r1 = (androidx.fragment.app.C0954a) r1
            java.util.ArrayList<androidx.fragment.app.w$a> r1 = r1.f2817c
            java.util.Iterator r1 = r1.iterator()
        L_0x0083:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x00a1
            java.lang.Object r7 = r1.next()
            androidx.fragment.app.w$a r7 = (androidx.fragment.app.C1043w.C1044a) r7
            androidx.fragment.app.Fragment r7 = r7.f2835b
            if (r7 == 0) goto L_0x0083
            androidx.fragment.app.n r8 = r7.f2512x
            if (r8 == 0) goto L_0x0083
            androidx.fragment.app.u r7 = r6.mo3624v(r7)
            androidx.fragment.app.v r8 = r6.f2728c
            r8.mo3716p(r7)
            goto L_0x0083
        L_0x00a1:
            int r0 = r0 + 1
            goto L_0x0075
        L_0x00a4:
            androidx.fragment.app.k<?> r0 = r6.f2743r
            android.content.Context r7 = r0.mo3530j()
            androidx.fragment.app.g r8 = r6.f2744s
            r13 = 0
            androidx.fragment.app.x$g r0 = r6.f2739n
            r9 = r18
            r10 = r19
            r11 = r20
            r12 = r21
            r1 = r14
            r14 = r0
            androidx.fragment.app.C1045x.m4408B(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x00be
        L_0x00bd:
            r1 = r14
        L_0x00be:
            m4205c0(r18, r19, r20, r21)
            boolean r0 = f2711P
            if (r0 == 0) goto L_0x0143
            int r0 = r3 + -1
            java.lang.Object r0 = r5.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = r4
        L_0x00d2:
            if (r2 >= r3) goto L_0x011c
            java.lang.Object r7 = r15.get(r2)
            androidx.fragment.app.a r7 = (androidx.fragment.app.C0954a) r7
            if (r0 == 0) goto L_0x00fb
            java.util.ArrayList<androidx.fragment.app.w$a> r8 = r7.f2817c
            int r8 = r8.size()
            int r8 = r8 - r1
        L_0x00e3:
            if (r8 < 0) goto L_0x0119
            java.util.ArrayList<androidx.fragment.app.w$a> r9 = r7.f2817c
            java.lang.Object r9 = r9.get(r8)
            androidx.fragment.app.w$a r9 = (androidx.fragment.app.C1043w.C1044a) r9
            androidx.fragment.app.Fragment r9 = r9.f2835b
            if (r9 == 0) goto L_0x00f8
            androidx.fragment.app.u r9 = r6.mo3624v(r9)
            r9.mo3690m()
        L_0x00f8:
            int r8 = r8 + -1
            goto L_0x00e3
        L_0x00fb:
            java.util.ArrayList<androidx.fragment.app.w$a> r7 = r7.f2817c
            java.util.Iterator r7 = r7.iterator()
        L_0x0101:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0119
            java.lang.Object r8 = r7.next()
            androidx.fragment.app.w$a r8 = (androidx.fragment.app.C1043w.C1044a) r8
            androidx.fragment.app.Fragment r8 = r8.f2835b
            if (r8 == 0) goto L_0x0101
            androidx.fragment.app.u r8 = r6.mo3624v(r8)
            r8.mo3690m()
            goto L_0x0101
        L_0x0119:
            int r2 = r2 + 1
            goto L_0x00d2
        L_0x011c:
            int r2 = r6.f2742q
            r6.mo3571M0(r2, r1)
            java.util.Set r1 = r6.m4221s(r15, r4, r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x0129:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x013f
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.c0 r2 = (androidx.fragment.app.C0974c0) r2
            r2.mo3427r(r0)
            r2.mo3426p()
            r2.mo3421g()
            goto L_0x0129
        L_0x013f:
            r0 = r3
            r3 = r5
            goto L_0x0199
        L_0x0143:
            if (r2 == 0) goto L_0x0165
            o.b r7 = new o.b
            r7.<init>()
            r6.m4207d(r7)
            r0 = r17
            r14 = r1
            r1 = r18
            r8 = r2
            r2 = r19
            r13 = r3
            r3 = r20
            r12 = r4
            r4 = r21
            r11 = r5
            r5 = r7
            int r0 = r0.m4197W0(r1, r2, r3, r4, r5)
            r6.m4192K0(r7)
            goto L_0x016b
        L_0x0165:
            r14 = r1
            r8 = r2
            r13 = r3
            r12 = r4
            r11 = r5
            r0 = r13
        L_0x016b:
            if (r0 == r12) goto L_0x0197
            if (r8 == 0) goto L_0x0197
            int r1 = r6.f2742q
            if (r1 < r14) goto L_0x018e
            androidx.fragment.app.k<?> r1 = r6.f2743r
            android.content.Context r7 = r1.mo3530j()
            androidx.fragment.app.g r8 = r6.f2744s
            r1 = 1
            androidx.fragment.app.x$g r2 = r6.f2739n
            r9 = r18
            r10 = r19
            r3 = r11
            r11 = r20
            r12 = r0
            r0 = r13
            r13 = r1
            r1 = r14
            r14 = r2
            androidx.fragment.app.C1045x.m4408B(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0191
        L_0x018e:
            r3 = r11
            r0 = r13
            r1 = r14
        L_0x0191:
            int r2 = r6.f2742q
            r6.mo3571M0(r2, r1)
            goto L_0x0199
        L_0x0197:
            r3 = r11
            r0 = r13
        L_0x0199:
            r1 = r20
        L_0x019b:
            if (r1 >= r0) goto L_0x01bc
            java.lang.Object r2 = r15.get(r1)
            androidx.fragment.app.a r2 = (androidx.fragment.app.C0954a) r2
            java.lang.Object r4 = r3.get(r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x01b6
            int r4 = r2.f2552v
            if (r4 < 0) goto L_0x01b6
            r4 = -1
            r2.f2552v = r4
        L_0x01b6:
            r2.mo3374y()
            int r1 = r1 + 1
            goto L_0x019b
        L_0x01bc:
            if (r16 == 0) goto L_0x01c1
            r17.m4202a1()
        L_0x01c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1011n.m4208d0(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    /* renamed from: e0 */
    private void m4209e0(ArrayList<C0954a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<C1029q> arrayList3 = this.f2723L;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            C1029q qVar = this.f2723L.get(i);
            if (arrayList == null || qVar.f2772a || (indexOf2 = arrayList.indexOf(qVar.f2773b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf2).booleanValue()) {
                if (qVar.mo3650e() || (arrayList != null && qVar.f2773b.mo3372v(arrayList, 0, arrayList.size()))) {
                    this.f2723L.remove(i);
                    i--;
                    size--;
                    if (arrayList == null || qVar.f2772a || (indexOf = arrayList.indexOf(qVar.f2773b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                        qVar.mo3649d();
                    }
                }
                i++;
            } else {
                this.f2723L.remove(i);
                i--;
                size--;
            }
            qVar.mo3648c();
            i++;
        }
    }

    /* renamed from: i1 */
    private void m4210i1(Fragment fragment) {
        ViewGroup o0 = m4218o0(fragment);
        if (o0 != null && fragment.mo3319r() + fragment.mo3329u() + fragment.mo3230F() + fragment.mo3232G() > 0) {
            int i = C4274b.visible_removing_fragment_view_tag;
            if (o0.getTag(i) == null) {
                o0.setTag(i, fragment);
            }
            ((Fragment) o0.getTag(i)).mo3337w1(fragment.mo3228E());
        }
    }

    /* renamed from: j0 */
    private void m4211j0() {
        if (f2711P) {
            for (C0974c0 k : m4220r()) {
                k.mo3423k();
            }
        } else if (this.f2723L != null) {
            while (!this.f2723L.isEmpty()) {
                this.f2723L.remove(0).mo3649d();
            }
        }
    }

    /* renamed from: k0 */
    private boolean m4212k0(ArrayList<C0954a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f2726a) {
            if (this.f2726a.isEmpty()) {
                return false;
            }
            int size = this.f2726a.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                z |= this.f2726a.get(i).mo3356a(arrayList, arrayList2);
            }
            this.f2726a.clear();
            this.f2743r.mo3531l().removeCallbacks(this.f2725N);
            return z;
        }
    }

    /* renamed from: k1 */
    private void m4213k1() {
        for (C1039u R0 : this.f2728c.mo3711k()) {
            mo3581R0(R0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (mo3612l0() <= 0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (mo3563H0(r3.f2745t) == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r0.mo546f(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r0 = r3.f2733h;
     */
    /* renamed from: l1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4214l1() {
        /*
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.n$o> r0 = r3.f2726a
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.n$o> r1 = r3.f2726a     // Catch:{ all -> 0x002a }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002a }
            r2 = 1
            if (r1 != 0) goto L_0x0013
            androidx.activity.g r1 = r3.f2733h     // Catch:{ all -> 0x002a }
            r1.mo546f(r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            androidx.activity.g r0 = r3.f2733h
            int r1 = r3.mo3612l0()
            if (r1 <= 0) goto L_0x0025
            androidx.fragment.app.Fragment r1 = r3.f2745t
            boolean r1 = r3.mo3563H0(r1)
            if (r1 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            r0.mo546f(r2)
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1011n.m4214l1():void");
    }

    /* renamed from: m */
    private void m4215m(Fragment fragment) {
        HashSet hashSet = this.f2738m.get(fragment);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((C0678e) it.next()).mo2677a();
            }
            hashSet.clear();
            m4223w(fragment);
            this.f2738m.remove(fragment);
        }
    }

    /* renamed from: m0 */
    private C1033q m4216m0(Fragment fragment) {
        return this.f2724M.mo3662h(fragment);
    }

    /* renamed from: o */
    private void m4217o() {
        if (mo3567J0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: o0 */
    private ViewGroup m4218o0(Fragment fragment) {
        ViewGroup viewGroup = fragment.f2474L;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.f2465C > 0 && this.f2744s.mo3351e()) {
            View d = this.f2744s.mo3350d(fragment.f2465C);
            if (d instanceof ViewGroup) {
                return (ViewGroup) d;
            }
        }
        return null;
    }

    /* renamed from: p */
    private void m4219p() {
        this.f2727b = false;
        this.f2721J.clear();
        this.f2720I.clear();
    }

    /* renamed from: r */
    private Set<C0974c0> m4220r() {
        HashSet hashSet = new HashSet();
        for (C1039u k : this.f2728c.mo3711k()) {
            ViewGroup viewGroup = k.mo3689k().f2474L;
            if (viewGroup != null) {
                hashSet.add(C0974c0.m4046o(viewGroup, mo3628x0()));
            }
        }
        return hashSet;
    }

    /* renamed from: s */
    private Set<C0974c0> m4221s(ArrayList<C0954a> arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator<C1043w.C1044a> it = arrayList.get(i).f2817c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f2835b;
                if (!(fragment == null || (viewGroup = fragment.f2474L) == null)) {
                    hashSet.add(C0974c0.m4045n(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    /* renamed from: u */
    private void m4222u(Fragment fragment) {
        Animator animator;
        if (fragment.f2475M != null) {
            C0995f.C1000d c = C0995f.m4132c(this.f2743r.mo3530j(), fragment, !fragment.f2467E, fragment.mo3228E());
            if (c == null || (animator = c.f2686b) == null) {
                if (c != null) {
                    fragment.f2475M.startAnimation(c.f2685a);
                    c.f2685a.start();
                }
                fragment.f2475M.setVisibility((!fragment.f2467E || fragment.mo3260V()) ? 0 : 8);
                if (fragment.mo3260V()) {
                    fragment.mo3327t1(false);
                }
            } else {
                animator.setTarget(fragment.f2475M);
                if (!fragment.f2467E) {
                    fragment.f2475M.setVisibility(0);
                } else if (fragment.mo3260V()) {
                    fragment.mo3327t1(false);
                } else {
                    ViewGroup viewGroup = fragment.f2474L;
                    View view = fragment.f2475M;
                    viewGroup.startViewTransition(view);
                    c.f2686b.addListener(new C1019h(viewGroup, view, fragment));
                }
                c.f2686b.start();
            }
        }
        mo3555C0(fragment);
        fragment.f2481S = false;
        fragment.mo3326t0(fragment.f2467E);
    }

    /* renamed from: w */
    private void m4223w(Fragment fragment) {
        fragment.mo3256S0();
        this.f2740o.mo3549n(fragment, false);
        fragment.f2474L = null;
        fragment.f2475M = null;
        fragment.f2487Y = null;
        fragment.f2488Z.mo3789j(null);
        fragment.f2508t = false;
    }

    /* renamed from: y0 */
    static Fragment m4224y0(View view) {
        Object tag = view.getTag(C4274b.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo3550A(Configuration configuration) {
        for (Fragment next : this.f2728c.mo3714n()) {
            if (next != null) {
                next.mo3245M0(configuration);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A0 */
    public void mo3551A0() {
        mo3591a0(true);
        if (this.f2733h.mo543c()) {
            mo3584T0();
        } else {
            this.f2732g.mo531c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public boolean mo3552B(MenuItem menuItem) {
        if (this.f2742q < 1) {
            return false;
        }
        for (Fragment next : this.f2728c.mo3714n()) {
            if (next != null && next.mo3247N0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B0 */
    public void mo3553B0(Fragment fragment) {
        if (m4190E0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.f2467E) {
            fragment.f2467E = true;
            fragment.f2481S = true ^ fragment.f2481S;
            m4210i1(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo3554C() {
        this.f2716E = false;
        this.f2717F = false;
        this.f2724M.mo3668n(false);
        m4194S(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C0 */
    public void mo3555C0(Fragment fragment) {
        if (fragment.f2505q && m4191F0(fragment)) {
            this.f2715D = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean mo3556D(Menu menu, MenuInflater menuInflater) {
        if (this.f2742q < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment next : this.f2728c.mo3714n()) {
            if (next != null && mo3561G0(next) && next.mo3251P0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(next);
                z = true;
            }
        }
        if (this.f2730e != null) {
            for (int i = 0; i < this.f2730e.size(); i++) {
                Fragment fragment = this.f2730e.get(i);
                if (arrayList == null || !arrayList.contains(fragment)) {
                    fragment.mo3314p0();
                }
            }
        }
        this.f2730e = arrayList;
        return z;
    }

    /* renamed from: D0 */
    public boolean mo3557D0() {
        return this.f2718G;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo3558E() {
        this.f2718G = true;
        mo3591a0(true);
        m4198X();
        m4194S(-1);
        this.f2743r = null;
        this.f2744s = null;
        this.f2745t = null;
        if (this.f2732g != null) {
            this.f2733h.mo544d();
            this.f2732g = null;
        }
        C0227c<Intent> cVar = this.f2751z;
        if (cVar != null) {
            cVar.mo557a();
            this.f2712A.mo557a();
            this.f2713B.mo557a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo3559F() {
        m4194S(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo3560G() {
        for (Fragment next : this.f2728c.mo3714n()) {
            if (next != null) {
                next.mo3261V0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G0 */
    public boolean mo3561G0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.mo3264X();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo3562H(boolean z) {
        for (Fragment next : this.f2728c.mo3714n()) {
            if (next != null) {
                next.mo3263W0(z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H0 */
    public boolean mo3563H0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        C1011n nVar = fragment.f2512x;
        return fragment.equals(nVar.mo3626w0()) && mo3563H0(nVar.f2745t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo3564I(Fragment fragment) {
        Iterator<C1035r> it = this.f2741p.iterator();
        while (it.hasNext()) {
            it.next().mo3472b(this, fragment);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I0 */
    public boolean mo3565I0(int i) {
        return this.f2742q >= i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public boolean mo3566J(MenuItem menuItem) {
        if (this.f2742q < 1) {
            return false;
        }
        for (Fragment next : this.f2728c.mo3714n()) {
            if (next != null && next.mo3265X0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: J0 */
    public boolean mo3567J0() {
        return this.f2716E || this.f2717F;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo3568K(Menu menu) {
        if (this.f2742q >= 1) {
            for (Fragment next : this.f2728c.mo3714n()) {
                if (next != null) {
                    next.mo3267Y0(menu);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L0 */
    public void mo3569L0(Fragment fragment) {
        if (this.f2728c.mo3703c(fragment.f2499k)) {
            mo3573N0(fragment);
            View view = fragment.f2475M;
            if (!(view == null || !fragment.f2480R || fragment.f2474L == null)) {
                float f = fragment.f2482T;
                if (f > 0.0f) {
                    view.setAlpha(f);
                }
                fragment.f2482T = 0.0f;
                fragment.f2480R = false;
                C0995f.C1000d c = C0995f.m4132c(this.f2743r.mo3530j(), fragment, true, fragment.mo3228E());
                if (c != null) {
                    Animation animation = c.f2685a;
                    if (animation != null) {
                        fragment.f2475M.startAnimation(animation);
                    } else {
                        c.f2686b.setTarget(fragment.f2475M);
                        c.f2686b.start();
                    }
                }
            }
            if (fragment.f2481S) {
                m4222u(fragment);
            }
        } else if (m4190E0(3)) {
            Log.d("FragmentManager", "Ignoring moving " + fragment + " to state " + this.f2742q + "since it is not added to " + this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo3570M() {
        m4194S(5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M0 */
    public void mo3571M0(int i, boolean z) {
        C1006k<?> kVar;
        if (this.f2743r == null && i != -1) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f2742q) {
            this.f2742q = i;
            if (f2711P) {
                this.f2728c.mo3718r();
            } else {
                for (Fragment L0 : this.f2728c.mo3714n()) {
                    mo3569L0(L0);
                }
                for (C1039u next : this.f2728c.mo3711k()) {
                    Fragment k = next.mo3689k();
                    if (!k.f2480R) {
                        mo3569L0(k);
                    }
                    if (k.f2506r && !k.mo3262W()) {
                        this.f2728c.mo3717q(next);
                    }
                }
            }
            m4213k1();
            if (this.f2715D && (kVar = this.f2743r) != null && this.f2742q == 7) {
                kVar.mo3476p();
                this.f2715D = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo3572N(boolean z) {
        for (Fragment next : this.f2728c.mo3714n()) {
            if (next != null) {
                next.mo3271a1(z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N0 */
    public void mo3573N0(Fragment fragment) {
        mo3575O0(fragment, this.f2742q);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public boolean mo3574O(Menu menu) {
        boolean z = false;
        if (this.f2742q < 1) {
            return false;
        }
        for (Fragment next : this.f2728c.mo3714n()) {
            if (next != null && mo3561G0(next) && next.mo3274b1(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r2 != 5) goto L_0x0164;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0160  */
    /* renamed from: O0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3575O0(androidx.fragment.app.Fragment r11, int r12) {
        /*
            r10 = this;
            androidx.fragment.app.v r0 = r10.f2728c
            java.lang.String r1 = r11.f2499k
            androidx.fragment.app.u r0 = r0.mo3713m(r1)
            r1 = 1
            if (r0 != 0) goto L_0x0017
            androidx.fragment.app.u r0 = new androidx.fragment.app.u
            androidx.fragment.app.m r2 = r10.f2740o
            androidx.fragment.app.v r3 = r10.f2728c
            r0.<init>(r2, r3, r11)
            r0.mo3696t(r1)
        L_0x0017:
            boolean r2 = r11.f2507s
            r3 = 2
            if (r2 == 0) goto L_0x0028
            boolean r2 = r11.f2508t
            if (r2 == 0) goto L_0x0028
            int r2 = r11.f2494f
            if (r2 != r3) goto L_0x0028
            int r12 = java.lang.Math.max(r12, r3)
        L_0x0028:
            int r2 = r0.mo3682d()
            int r12 = java.lang.Math.min(r12, r2)
            int r2 = r11.f2494f
            r4 = 3
            java.lang.String r5 = "FragmentManager"
            r6 = -1
            r7 = 5
            r8 = 4
            if (r2 > r12) goto L_0x007c
            if (r2 >= r12) goto L_0x0047
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.e>> r2 = r10.f2738m
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0047
            r10.m4215m(r11)
        L_0x0047:
            int r2 = r11.f2494f
            if (r2 == r6) goto L_0x0057
            if (r2 == 0) goto L_0x005c
            if (r2 == r1) goto L_0x0061
            if (r2 == r3) goto L_0x006b
            if (r2 == r8) goto L_0x0070
            if (r2 == r7) goto L_0x0075
            goto L_0x0164
        L_0x0057:
            if (r12 <= r6) goto L_0x005c
            r0.mo3681c()
        L_0x005c:
            if (r12 <= 0) goto L_0x0061
            r0.mo3683e()
        L_0x0061:
            if (r12 <= r6) goto L_0x0066
            r0.mo3688j()
        L_0x0066:
            if (r12 <= r1) goto L_0x006b
            r0.mo3684f()
        L_0x006b:
            if (r12 <= r3) goto L_0x0070
            r0.mo3679a()
        L_0x0070:
            if (r12 <= r8) goto L_0x0075
            r0.mo3697u()
        L_0x0075:
            if (r12 <= r7) goto L_0x0164
            r0.mo3693p()
            goto L_0x0164
        L_0x007c:
            if (r2 <= r12) goto L_0x0164
            if (r2 == 0) goto L_0x015d
            if (r2 == r1) goto L_0x014f
            if (r2 == r3) goto L_0x00c6
            if (r2 == r8) goto L_0x0097
            if (r2 == r7) goto L_0x0092
            r9 = 7
            if (r2 == r9) goto L_0x008d
            goto L_0x0164
        L_0x008d:
            if (r12 >= r9) goto L_0x0092
            r0.mo3691n()
        L_0x0092:
            if (r12 >= r7) goto L_0x0097
            r0.mo3698v()
        L_0x0097:
            if (r12 >= r8) goto L_0x00c6
            boolean r2 = m4190E0(r4)
            if (r2 == 0) goto L_0x00b3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "movefrom ACTIVITY_CREATED: "
            r2.append(r7)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r5, r2)
        L_0x00b3:
            android.view.View r2 = r11.f2475M
            if (r2 == 0) goto L_0x00c6
            androidx.fragment.app.k<?> r2 = r10.f2743r
            boolean r2 = r2.mo3475o(r11)
            if (r2 == 0) goto L_0x00c6
            android.util.SparseArray<android.os.Parcelable> r2 = r11.f2496h
            if (r2 != 0) goto L_0x00c6
            r0.mo3695s()
        L_0x00c6:
            if (r12 >= r3) goto L_0x014f
            r2 = 0
            android.view.View r7 = r11.f2475M
            if (r7 == 0) goto L_0x0144
            android.view.ViewGroup r8 = r11.f2474L
            if (r8 == 0) goto L_0x0144
            r8.endViewTransition(r7)
            android.view.View r7 = r11.f2475M
            r7.clearAnimation()
            boolean r7 = r11.mo3270a0()
            if (r7 != 0) goto L_0x0144
            int r7 = r10.f2742q
            r8 = 0
            if (r7 <= r6) goto L_0x0105
            boolean r6 = r10.f2718G
            if (r6 != 0) goto L_0x0105
            android.view.View r6 = r11.f2475M
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x0105
            float r6 = r11.f2482T
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x0105
            androidx.fragment.app.k<?> r2 = r10.f2743r
            android.content.Context r2 = r2.mo3530j()
            r6 = 0
            boolean r7 = r11.mo3228E()
            androidx.fragment.app.f$d r2 = androidx.fragment.app.C0995f.m4132c(r2, r11, r6, r7)
        L_0x0105:
            r11.f2482T = r8
            android.view.ViewGroup r6 = r11.f2474L
            android.view.View r7 = r11.f2475M
            if (r2 == 0) goto L_0x0112
            androidx.fragment.app.x$g r8 = r10.f2739n
            androidx.fragment.app.C0995f.m4130a(r11, r2, r8)
        L_0x0112:
            r6.removeView(r7)
            boolean r2 = m4190E0(r3)
            if (r2 == 0) goto L_0x013f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Removing view "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r3 = " for fragment "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r3 = " from container "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r5, r2)
        L_0x013f:
            android.view.ViewGroup r2 = r11.f2474L
            if (r6 == r2) goto L_0x0144
            return
        L_0x0144:
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.e>> r2 = r10.f2738m
            java.lang.Object r2 = r2.get(r11)
            if (r2 != 0) goto L_0x014f
            r0.mo3686h()
        L_0x014f:
            if (r12 >= r1) goto L_0x015d
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.e>> r2 = r10.f2738m
            java.lang.Object r2 = r2.get(r11)
            if (r2 == 0) goto L_0x015a
            goto L_0x015e
        L_0x015a:
            r0.mo3685g()
        L_0x015d:
            r1 = r12
        L_0x015e:
            if (r1 >= 0) goto L_0x0163
            r0.mo3687i()
        L_0x0163:
            r12 = r1
        L_0x0164:
            int r0 = r11.f2494f
            if (r0 == r12) goto L_0x0196
            boolean r0 = m4190E0(r4)
            if (r0 == 0) goto L_0x0194
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveToState: Fragment state for "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = " not updated inline; expected state "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = " found "
            r0.append(r1)
            int r1 = r11.f2494f
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r5, r0)
        L_0x0194:
            r11.f2494f = r12
        L_0x0196:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1011n.mo3575O0(androidx.fragment.app.Fragment, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo3576P() {
        m4214l1();
        m4193L(this.f2746u);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P0 */
    public void mo3577P0() {
        if (this.f2743r != null) {
            this.f2716E = false;
            this.f2717F = false;
            this.f2724M.mo3668n(false);
            for (Fragment next : this.f2728c.mo3714n()) {
                if (next != null) {
                    next.mo3276c0();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo3578Q() {
        this.f2716E = false;
        this.f2717F = false;
        this.f2724M.mo3668n(false);
        m4194S(7);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q0 */
    public void mo3579Q0(C1003h hVar) {
        View view;
        for (C1039u next : this.f2728c.mo3711k()) {
            Fragment k = next.mo3689k();
            if (k.f2465C == hVar.getId() && (view = k.f2475M) != null && view.getParent() == null) {
                k.f2474L = hVar;
                next.mo3680b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo3580R() {
        this.f2716E = false;
        this.f2717F = false;
        this.f2724M.mo3668n(false);
        m4194S(5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R0 */
    public void mo3581R0(C1039u uVar) {
        Fragment k = uVar.mo3689k();
        if (!k.f2476N) {
            return;
        }
        if (this.f2727b) {
            this.f2719H = true;
            return;
        }
        k.f2476N = false;
        if (f2711P) {
            uVar.mo3690m();
        } else {
            mo3573N0(k);
        }
    }

    /* renamed from: S0 */
    public void mo3582S0(int i, int i2) {
        if (i >= 0) {
            mo3589Y(new C1028p((String) null, i, i2), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo3583T() {
        this.f2717F = true;
        this.f2724M.mo3668n(true);
        m4194S(4);
    }

    /* renamed from: T0 */
    public boolean mo3584T0() {
        return m4195U0((String) null, -1, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo3585U() {
        m4194S(2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V0 */
    public boolean mo3586V0(ArrayList<C0954a> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        ArrayList<C0954a> arrayList3 = this.f2729d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f2729d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    C0954a aVar = this.f2729d.get(size2);
                    if ((str != null && str.equals(aVar.mo3369t())) || (i >= 0 && i == aVar.f2552v)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        C0954a aVar2 = this.f2729d.get(size2);
                        if ((str == null || !str.equals(aVar2.mo3369t())) && (i < 0 || i != aVar2.f2552v)) {
                            break;
                        }
                    }
                }
                i3 = size2;
            } else {
                i3 = -1;
            }
            if (i3 == this.f2729d.size() - 1) {
                return false;
            }
            for (int size3 = this.f2729d.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.f2729d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* renamed from: W */
    public void mo3587W(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f2728c.mo3705e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f2730e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i = 0; i < size2; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.f2730e.get(i).toString());
            }
        }
        ArrayList<C0954a> arrayList2 = this.f2729d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i2 = 0; i2 < size; i2++) {
                C0954a aVar = this.f2729d.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.mo3364o(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f2734i.get());
        synchronized (this.f2726a) {
            int size3 = this.f2726a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i3 = 0; i3 < size3; i3++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(this.f2726a.get(i3));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f2743r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2744s);
        if (this.f2745t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f2745t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f2742q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f2716E);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2717F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f2718G);
        if (this.f2715D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f2715D);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X0 */
    public void mo3588X0(Fragment fragment, C0678e eVar) {
        HashSet hashSet = this.f2738m.get(fragment);
        if (hashSet != null && hashSet.remove(eVar) && hashSet.isEmpty()) {
            this.f2738m.remove(fragment);
            if (fragment.f2494f < 5) {
                m4223w(fragment);
                mo3573N0(fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo3589Y(C1027o oVar, boolean z) {
        if (!z) {
            if (this.f2743r != null) {
                m4217o();
            } else if (this.f2718G) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.f2726a) {
            if (this.f2743r != null) {
                this.f2726a.add(oVar);
                mo3596e1();
            } else if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y0 */
    public void mo3590Y0(Fragment fragment) {
        if (m4190E0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f2511w);
        }
        boolean z = !fragment.mo3262W();
        if (!fragment.f2468F || z) {
            this.f2728c.mo3719s(fragment);
            if (m4191F0(fragment)) {
                this.f2715D = true;
            }
            fragment.f2506r = true;
            m4210i1(fragment);
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public boolean mo3591a0(boolean z) {
        m4199Z(z);
        boolean z2 = false;
        while (m4212k0(this.f2720I, this.f2721J)) {
            this.f2727b = true;
            try {
                m4200Z0(this.f2720I, this.f2721J);
                m4219p();
                z2 = true;
            } catch (Throwable th) {
                m4219p();
                throw th;
            }
        }
        m4214l1();
        m4196V();
        this.f2728c.mo3702b();
        return z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public void mo3592b0(C1027o oVar, boolean z) {
        if (!z || (this.f2743r != null && !this.f2718G)) {
            m4199Z(z);
            if (oVar.mo3356a(this.f2720I, this.f2721J)) {
                this.f2727b = true;
                try {
                    m4200Z0(this.f2720I, this.f2721J);
                } finally {
                    m4219p();
                }
            }
            m4214l1();
            m4196V();
            this.f2728c.mo3702b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b1 */
    public void mo3593b1(Parcelable parcelable) {
        C1039u uVar;
        if (parcelable != null) {
            C1031p pVar = (C1031p) parcelable;
            if (pVar.f2775f != null) {
                this.f2728c.mo3720t();
                Iterator<C1037t> it = pVar.f2775f.iterator();
                while (it.hasNext()) {
                    C1037t next = it.next();
                    if (next != null) {
                        Fragment g = this.f2724M.mo3661g(next.f2792g);
                        if (g != null) {
                            if (m4190E0(2)) {
                                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + g);
                            }
                            uVar = new C1039u(this.f2740o, this.f2728c, g, next);
                        } else {
                            uVar = new C1039u(this.f2740o, this.f2728c, this.f2743r.mo3530j().getClassLoader(), mo3615p0(), next);
                        }
                        Fragment k = uVar.mo3689k();
                        k.f2512x = this;
                        if (m4190E0(2)) {
                            Log.v("FragmentManager", "restoreSaveState: active (" + k.f2499k + "): " + k);
                        }
                        uVar.mo3692o(this.f2743r.mo3530j().getClassLoader());
                        this.f2728c.mo3716p(uVar);
                        uVar.mo3696t(this.f2742q);
                    }
                }
                for (Fragment next2 : this.f2724M.mo3664j()) {
                    if (!this.f2728c.mo3703c(next2.f2499k)) {
                        if (m4190E0(2)) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + next2 + " that was not found in the set of active Fragments " + pVar.f2775f);
                        }
                        this.f2724M.mo3667m(next2);
                        next2.f2512x = this;
                        C1039u uVar2 = new C1039u(this.f2740o, this.f2728c, next2);
                        uVar2.mo3696t(1);
                        uVar2.mo3690m();
                        next2.f2506r = true;
                        uVar2.mo3690m();
                    }
                }
                this.f2728c.mo3721u(pVar.f2776g);
                if (pVar.f2777h != null) {
                    this.f2729d = new ArrayList<>(pVar.f2777h.length);
                    int i = 0;
                    while (true) {
                        C0956b[] bVarArr = pVar.f2777h;
                        if (i >= bVarArr.length) {
                            break;
                        }
                        C0954a b = bVarArr[i].mo3382b(this);
                        if (m4190E0(2)) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i + " (index " + b.f2552v + "): " + b);
                            PrintWriter printWriter = new PrintWriter(new C0958b0("FragmentManager"));
                            b.mo3365p("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f2729d.add(b);
                        i++;
                    }
                } else {
                    this.f2729d = null;
                }
                this.f2734i.set(pVar.f2778i);
                String str = pVar.f2779j;
                if (str != null) {
                    Fragment f0 = mo3598f0(str);
                    this.f2746u = f0;
                    m4193L(f0);
                }
                ArrayList<String> arrayList = pVar.f2780k;
                if (arrayList != null) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        Bundle bundle = pVar.f2781l.get(i2);
                        bundle.setClassLoader(this.f2743r.mo3530j().getClassLoader());
                        this.f2735j.put(arrayList.get(i2), bundle);
                    }
                }
                this.f2714C = new ArrayDeque<>(pVar.f2782m);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d1 */
    public Parcelable mo3594d1() {
        int size;
        m4211j0();
        m4198X();
        mo3591a0(true);
        this.f2716E = true;
        this.f2724M.mo3668n(true);
        ArrayList<C1037t> v = this.f2728c.mo3722v();
        C0956b[] bVarArr = null;
        if (v.isEmpty()) {
            if (m4190E0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> w = this.f2728c.mo3723w();
        ArrayList<C0954a> arrayList = this.f2729d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            bVarArr = new C0956b[size];
            for (int i = 0; i < size; i++) {
                bVarArr[i] = new C0956b(this.f2729d.get(i));
                if (m4190E0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.f2729d.get(i));
                }
            }
        }
        C1031p pVar = new C1031p();
        pVar.f2775f = v;
        pVar.f2776g = w;
        pVar.f2777h = bVarArr;
        pVar.f2778i = this.f2734i.get();
        Fragment fragment = this.f2746u;
        if (fragment != null) {
            pVar.f2779j = fragment.f2499k;
        }
        pVar.f2780k.addAll(this.f2735j.keySet());
        pVar.f2781l.addAll(this.f2735j.values());
        pVar.f2782m = new ArrayList<>(this.f2714C);
        return pVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3595e(C0954a aVar) {
        if (this.f2729d == null) {
            this.f2729d = new ArrayList<>();
        }
        this.f2729d.add(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e1 */
    public void mo3596e1() {
        synchronized (this.f2726a) {
            ArrayList<C1029q> arrayList = this.f2723L;
            boolean z = false;
            boolean z2 = arrayList != null && !arrayList.isEmpty();
            if (this.f2726a.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.f2743r.mo3531l().removeCallbacks(this.f2725N);
                this.f2743r.mo3531l().post(this.f2725N);
                m4214l1();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3597f(Fragment fragment, C0678e eVar) {
        if (this.f2738m.get(fragment) == null) {
            this.f2738m.put(fragment, new HashSet());
        }
        this.f2738m.get(fragment).add(eVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public Fragment mo3598f0(String str) {
        return this.f2728c.mo3706f(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f1 */
    public void mo3599f1(Fragment fragment, boolean z) {
        ViewGroup o0 = m4218o0(fragment);
        if (o0 != null && (o0 instanceof C1003h)) {
            ((C1003h) o0).setDrawDisappearingViewsLast(!z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C1039u mo3600g(Fragment fragment) {
        if (m4190E0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        C1039u v = mo3624v(fragment);
        fragment.f2512x = this;
        this.f2728c.mo3716p(v);
        if (!fragment.f2468F) {
            this.f2728c.mo3701a(fragment);
            fragment.f2506r = false;
            if (fragment.f2475M == null) {
                fragment.f2481S = false;
            }
            if (m4191F0(fragment)) {
                this.f2715D = true;
            }
        }
        return v;
    }

    /* renamed from: g0 */
    public Fragment mo3601g0(int i) {
        return this.f2728c.mo3707g(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g1 */
    public void mo3602g1(Fragment fragment, C1099i.C1102c cVar) {
        if (!fragment.equals(mo3598f0(fragment.f2499k)) || !(fragment.f2513y == null || fragment.f2512x == this)) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        fragment.f2485W = cVar;
    }

    /* renamed from: h */
    public void mo3603h(C1035r rVar) {
        this.f2741p.add(rVar);
    }

    /* renamed from: h0 */
    public Fragment mo3604h0(String str) {
        return this.f2728c.mo3708h(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h1 */
    public void mo3605h1(Fragment fragment) {
        if (fragment == null || (fragment.equals(mo3598f0(fragment.f2499k)) && (fragment.f2513y == null || fragment.f2512x == this))) {
            Fragment fragment2 = this.f2746u;
            this.f2746u = fragment;
            m4193L(fragment2);
            m4193L(this.f2746u);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo3606i() {
        return this.f2734i.getAndIncrement();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public Fragment mo3607i0(String str) {
        return this.f2728c.mo3709i(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: androidx.activity.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: androidx.fragment.app.Fragment} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3608j(androidx.fragment.app.C1006k<?> r3, androidx.fragment.app.C1002g r4, androidx.fragment.app.Fragment r5) {
        /*
            r2 = this;
            androidx.fragment.app.k<?> r0 = r2.f2743r
            if (r0 != 0) goto L_0x0103
            r2.f2743r = r3
            r2.f2744s = r4
            r2.f2745t = r5
            if (r5 == 0) goto L_0x0015
            androidx.fragment.app.n$i r4 = new androidx.fragment.app.n$i
            r4.<init>(r5)
        L_0x0011:
            r2.mo3603h(r4)
            goto L_0x001d
        L_0x0015:
            boolean r4 = r3 instanceof androidx.fragment.app.C1035r
            if (r4 == 0) goto L_0x001d
            r4 = r3
            androidx.fragment.app.r r4 = (androidx.fragment.app.C1035r) r4
            goto L_0x0011
        L_0x001d:
            androidx.fragment.app.Fragment r4 = r2.f2745t
            if (r4 == 0) goto L_0x0024
            r2.m4214l1()
        L_0x0024:
            boolean r4 = r3 instanceof androidx.activity.C0221h
            if (r4 == 0) goto L_0x0039
            r4 = r3
            androidx.activity.h r4 = (androidx.activity.C0221h) r4
            androidx.activity.OnBackPressedDispatcher r0 = r4.mo495h()
            r2.f2732g = r0
            if (r5 == 0) goto L_0x0034
            r4 = r5
        L_0x0034:
            androidx.activity.g r1 = r2.f2733h
            r0.mo529a(r4, r1)
        L_0x0039:
            if (r5 == 0) goto L_0x0044
            androidx.fragment.app.n r3 = r5.f2512x
            androidx.fragment.app.q r3 = r3.m4216m0(r5)
        L_0x0041:
            r2.f2724M = r3
            goto L_0x005a
        L_0x0044:
            boolean r4 = r3 instanceof androidx.lifecycle.C1103i0
            if (r4 == 0) goto L_0x0053
            androidx.lifecycle.i0 r3 = (androidx.lifecycle.C1103i0) r3
            androidx.lifecycle.h0 r3 = r3.mo497k()
            androidx.fragment.app.q r3 = androidx.fragment.app.C1033q.m4332i(r3)
            goto L_0x0041
        L_0x0053:
            androidx.fragment.app.q r3 = new androidx.fragment.app.q
            r4 = 0
            r3.<init>(r4)
            goto L_0x0041
        L_0x005a:
            androidx.fragment.app.q r3 = r2.f2724M
            boolean r4 = r2.mo3567J0()
            r3.mo3668n(r4)
            androidx.fragment.app.v r3 = r2.f2728c
            androidx.fragment.app.q r4 = r2.f2724M
            r3.mo3724x(r4)
            androidx.fragment.app.k<?> r3 = r2.f2743r
            boolean r4 = r3 instanceof androidx.activity.result.C0232e
            if (r4 == 0) goto L_0x0102
            androidx.activity.result.e r3 = (androidx.activity.result.C0232e) r3
            androidx.activity.result.d r3 = r3.mo494g()
            if (r5 == 0) goto L_0x008c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r5.f2499k
            r4.append(r5)
            java.lang.String r5 = ":"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            goto L_0x008e
        L_0x008c:
            java.lang.String r4 = ""
        L_0x008e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "FragmentManager:"
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r0 = "StartActivityForResult"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            e.c r0 = new e.c
            r0.<init>()
            androidx.fragment.app.n$j r1 = new androidx.fragment.app.n$j
            r1.<init>()
            androidx.activity.result.c r5 = r3.mo561g(r5, r0, r1)
            r2.f2751z = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r0 = "StartIntentSenderForResult"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            androidx.fragment.app.n$k r0 = new androidx.fragment.app.n$k
            r0.<init>()
            androidx.fragment.app.n$a r1 = new androidx.fragment.app.n$a
            r1.<init>()
            androidx.activity.result.c r5 = r3.mo561g(r5, r0, r1)
            r2.f2712A = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = "RequestPermissions"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            e.b r5 = new e.b
            r5.<init>()
            androidx.fragment.app.n$b r0 = new androidx.fragment.app.n$b
            r0.<init>()
            androidx.activity.result.c r3 = r3.mo561g(r4, r5, r0)
            r2.f2713B = r3
        L_0x0102:
            return
        L_0x0103:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Already attached"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1011n.mo3608j(androidx.fragment.app.k, androidx.fragment.app.g, androidx.fragment.app.Fragment):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j1 */
    public void mo3609j1(Fragment fragment) {
        if (m4190E0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.f2467E) {
            fragment.f2467E = false;
            fragment.f2481S = !fragment.f2481S;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo3610k(Fragment fragment) {
        if (m4190E0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.f2468F) {
            fragment.f2468F = false;
            if (!fragment.f2505q) {
                this.f2728c.mo3701a(fragment);
                if (m4190E0(2)) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                if (m4191F0(fragment)) {
                    this.f2715D = true;
                }
            }
        }
    }

    /* renamed from: l */
    public C1043w mo3611l() {
        return new C0954a(this);
    }

    /* renamed from: l0 */
    public int mo3612l0() {
        ArrayList<C0954a> arrayList = this.f2729d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo3613n() {
        boolean z = false;
        for (Fragment next : this.f2728c.mo3712l()) {
            if (next != null) {
                z = m4191F0(next);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public C1002g mo3614n0() {
        return this.f2744s;
    }

    /* renamed from: p0 */
    public C1005j mo3615p0() {
        C1005j jVar = this.f2747v;
        if (jVar != null) {
            return jVar;
        }
        Fragment fragment = this.f2745t;
        return fragment != null ? fragment.f2512x.mo3615p0() : this.f2748w;
    }

    /* renamed from: q */
    public final void mo3616q(String str) {
        this.f2735j.remove(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public C1042v mo3617q0() {
        return this.f2728c;
    }

    /* renamed from: r0 */
    public List<Fragment> mo3618r0() {
        return this.f2728c.mo3714n();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s0 */
    public C1006k<?> mo3619s0() {
        return this.f2743r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo3620t(C0954a aVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            aVar.mo3367r(z3);
        } else {
            aVar.mo3366q();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2 && this.f2742q >= 1) {
            C1045x.m4408B(this.f2743r.mo3530j(), this.f2744s, arrayList, arrayList2, 0, 1, true, this.f2739n);
        }
        if (z3) {
            mo3571M0(this.f2742q, true);
        }
        for (Fragment next : this.f2728c.mo3712l()) {
            if (next != null && next.f2475M != null && next.f2480R && aVar.mo3371u(next.f2465C)) {
                float f = next.f2482T;
                if (f > 0.0f) {
                    next.f2475M.setAlpha(f);
                }
                if (z3) {
                    next.f2482T = 0.0f;
                } else {
                    next.f2482T = -1.0f;
                    next.f2480R = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t0 */
    public LayoutInflater.Factory2 mo3621t0() {
        return this.f2731f;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f2745t;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            obj = this.f2745t;
        } else {
            C1006k<?> kVar = this.f2743r;
            if (kVar != null) {
                sb.append(kVar.getClass().getSimpleName());
                sb.append("{");
                obj = this.f2743r;
            } else {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u0 */
    public C1009m mo3623u0() {
        return this.f2740o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public C1039u mo3624v(Fragment fragment) {
        C1039u m = this.f2728c.mo3713m(fragment.f2499k);
        if (m != null) {
            return m;
        }
        C1039u uVar = new C1039u(this.f2740o, this.f2728c, fragment);
        uVar.mo3692o(this.f2743r.mo3530j().getClassLoader());
        uVar.mo3696t(this.f2742q);
        return uVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v0 */
    public Fragment mo3625v0() {
        return this.f2745t;
    }

    /* renamed from: w0 */
    public Fragment mo3626w0() {
        return this.f2746u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo3627x(Fragment fragment) {
        if (m4190E0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.f2468F) {
            fragment.f2468F = true;
            if (fragment.f2505q) {
                if (m4190E0(2)) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                this.f2728c.mo3719s(fragment);
                if (m4191F0(fragment)) {
                    this.f2715D = true;
                }
                m4210i1(fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x0 */
    public C0989d0 mo3628x0() {
        C0989d0 d0Var = this.f2749x;
        if (d0Var != null) {
            return d0Var;
        }
        Fragment fragment = this.f2745t;
        return fragment != null ? fragment.f2512x.mo3628x0() : this.f2750y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo3629y() {
        this.f2716E = false;
        this.f2717F = false;
        this.f2724M.mo3668n(false);
        m4194S(4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo3630z() {
        this.f2716E = false;
        this.f2717F = false;
        this.f2724M.mo3668n(false);
        m4194S(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z0 */
    public C1098h0 mo3631z0(Fragment fragment) {
        return this.f2724M.mo3665k(fragment);
    }
}
