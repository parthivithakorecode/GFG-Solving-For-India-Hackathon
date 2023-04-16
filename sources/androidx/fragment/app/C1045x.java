package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p009os.C0678e;
import androidx.core.view.C0830v;
import androidx.core.view.C0833y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p102o.C3801a;

/* renamed from: androidx.fragment.app.x */
class C1045x {

    /* renamed from: a */
    private static final int[] f2842a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b */
    static final C1060z f2843b = (Build.VERSION.SDK_INT >= 21 ? new C1054y() : null);

    /* renamed from: c */
    static final C1060z f2844c = m4431w();

    /* renamed from: androidx.fragment.app.x$a */
    class C1046a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C1052g f2845f;

        /* renamed from: g */
        final /* synthetic */ Fragment f2846g;

        /* renamed from: h */
        final /* synthetic */ C0678e f2847h;

        C1046a(C1052g gVar, Fragment fragment, C0678e eVar) {
            this.f2845f = gVar;
            this.f2846g = fragment;
            this.f2847h = eVar;
        }

        public void run() {
            this.f2845f.mo3634a(this.f2846g, this.f2847h);
        }
    }

    /* renamed from: androidx.fragment.app.x$b */
    class C1047b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f2848f;

        C1047b(ArrayList arrayList) {
            this.f2848f = arrayList;
        }

        public void run() {
            C1045x.m4407A(this.f2848f, 4);
        }
    }

    /* renamed from: androidx.fragment.app.x$c */
    class C1048c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C1052g f2849f;

        /* renamed from: g */
        final /* synthetic */ Fragment f2850g;

        /* renamed from: h */
        final /* synthetic */ C0678e f2851h;

        C1048c(C1052g gVar, Fragment fragment, C0678e eVar) {
            this.f2849f = gVar;
            this.f2850g = fragment;
            this.f2851h = eVar;
        }

        public void run() {
            this.f2849f.mo3634a(this.f2850g, this.f2851h);
        }
    }

    /* renamed from: androidx.fragment.app.x$d */
    class C1049d implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Object f2852f;

        /* renamed from: g */
        final /* synthetic */ C1060z f2853g;

        /* renamed from: h */
        final /* synthetic */ View f2854h;

        /* renamed from: i */
        final /* synthetic */ Fragment f2855i;

        /* renamed from: j */
        final /* synthetic */ ArrayList f2856j;

        /* renamed from: k */
        final /* synthetic */ ArrayList f2857k;

        /* renamed from: l */
        final /* synthetic */ ArrayList f2858l;

        /* renamed from: m */
        final /* synthetic */ Object f2859m;

        C1049d(Object obj, C1060z zVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f2852f = obj;
            this.f2853g = zVar;
            this.f2854h = view;
            this.f2855i = fragment;
            this.f2856j = arrayList;
            this.f2857k = arrayList2;
            this.f2858l = arrayList3;
            this.f2859m = obj2;
        }

        public void run() {
            Object obj = this.f2852f;
            if (obj != null) {
                this.f2853g.mo3746p(obj, this.f2854h);
                this.f2857k.addAll(C1045x.m4419k(this.f2853g, this.f2852f, this.f2855i, this.f2856j, this.f2854h));
            }
            if (this.f2858l != null) {
                if (this.f2859m != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f2854h);
                    this.f2853g.mo3747q(this.f2859m, this.f2858l, arrayList);
                }
                this.f2858l.clear();
                this.f2858l.add(this.f2854h);
            }
        }
    }

    /* renamed from: androidx.fragment.app.x$e */
    class C1050e implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Fragment f2860f;

        /* renamed from: g */
        final /* synthetic */ Fragment f2861g;

        /* renamed from: h */
        final /* synthetic */ boolean f2862h;

        /* renamed from: i */
        final /* synthetic */ C3801a f2863i;

        /* renamed from: j */
        final /* synthetic */ View f2864j;

        /* renamed from: k */
        final /* synthetic */ C1060z f2865k;

        /* renamed from: l */
        final /* synthetic */ Rect f2866l;

        C1050e(Fragment fragment, Fragment fragment2, boolean z, C3801a aVar, View view, C1060z zVar, Rect rect) {
            this.f2860f = fragment;
            this.f2861g = fragment2;
            this.f2862h = z;
            this.f2863i = aVar;
            this.f2864j = view;
            this.f2865k = zVar;
            this.f2866l = rect;
        }

        public void run() {
            C1045x.m4414f(this.f2860f, this.f2861g, this.f2862h, this.f2863i, false);
            View view = this.f2864j;
            if (view != null) {
                this.f2865k.mo3773k(view, this.f2866l);
            }
        }
    }

    /* renamed from: androidx.fragment.app.x$f */
    class C1051f implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C1060z f2867f;

        /* renamed from: g */
        final /* synthetic */ C3801a f2868g;

        /* renamed from: h */
        final /* synthetic */ Object f2869h;

        /* renamed from: i */
        final /* synthetic */ C1053h f2870i;

        /* renamed from: j */
        final /* synthetic */ ArrayList f2871j;

        /* renamed from: k */
        final /* synthetic */ View f2872k;

        /* renamed from: l */
        final /* synthetic */ Fragment f2873l;

        /* renamed from: m */
        final /* synthetic */ Fragment f2874m;

        /* renamed from: n */
        final /* synthetic */ boolean f2875n;

        /* renamed from: o */
        final /* synthetic */ ArrayList f2876o;

        /* renamed from: p */
        final /* synthetic */ Object f2877p;

        /* renamed from: q */
        final /* synthetic */ Rect f2878q;

        C1051f(C1060z zVar, C3801a aVar, Object obj, C1053h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f2867f = zVar;
            this.f2868g = aVar;
            this.f2869h = obj;
            this.f2870i = hVar;
            this.f2871j = arrayList;
            this.f2872k = view;
            this.f2873l = fragment;
            this.f2874m = fragment2;
            this.f2875n = z;
            this.f2876o = arrayList2;
            this.f2877p = obj2;
            this.f2878q = rect;
        }

        public void run() {
            C3801a<String, View> h = C1045x.m4416h(this.f2867f, this.f2868g, this.f2869h, this.f2870i);
            if (h != null) {
                this.f2871j.addAll(h.values());
                this.f2871j.add(this.f2872k);
            }
            C1045x.m4414f(this.f2873l, this.f2874m, this.f2875n, h, false);
            Object obj = this.f2869h;
            if (obj != null) {
                this.f2867f.mo3737A(obj, this.f2876o, this.f2871j);
                View s = C1045x.m4427s(h, this.f2870i, this.f2877p, this.f2875n);
                if (s != null) {
                    this.f2867f.mo3773k(s, this.f2878q);
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.x$g */
    interface C1052g {
        /* renamed from: a */
        void mo3634a(Fragment fragment, C0678e eVar);

        /* renamed from: b */
        void mo3635b(Fragment fragment, C0678e eVar);
    }

    /* renamed from: androidx.fragment.app.x$h */
    static class C1053h {

        /* renamed from: a */
        public Fragment f2879a;

        /* renamed from: b */
        public boolean f2880b;

        /* renamed from: c */
        public C0954a f2881c;

        /* renamed from: d */
        public Fragment f2882d;

        /* renamed from: e */
        public boolean f2883e;

        /* renamed from: f */
        public C0954a f2884f;

        C1053h() {
        }
    }

    /* renamed from: A */
    static void m4407A(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }

    /* renamed from: B */
    static void m4408B(Context context, C1002g gVar, ArrayList<C0954a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z, C1052g gVar2) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i3 = i; i3 < i2; i3++) {
            C0954a aVar = arrayList.get(i3);
            if (arrayList2.get(i3).booleanValue()) {
                m4413e(aVar, sparseArray, z);
            } else {
                m4411c(aVar, sparseArray, z);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i4 = 0; i4 < size; i4++) {
                int keyAt = sparseArray.keyAt(i4);
                C3801a<String, String> d = m4412d(keyAt, arrayList, arrayList2, i, i2);
                C1053h hVar = (C1053h) sparseArray.valueAt(i4);
                if (gVar.mo3351e() && (viewGroup = (ViewGroup) gVar.mo3350d(keyAt)) != null) {
                    if (z) {
                        m4423o(viewGroup, hVar, view, d, gVar2);
                    } else {
                        m4422n(viewGroup, hVar, view, d, gVar2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m4409a(ArrayList<View> arrayList, C3801a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View m = aVar.mo15179m(size);
            if (collection.contains(C0833y.m3367w(m))) {
                arrayList.add(m);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0039, code lost:
        if (r0.f2505q != false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x006e, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0088, code lost:
        if (r0.f2467E == false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x008a, code lost:
        r9 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00d7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m4410b(androidx.fragment.app.C0954a r8, androidx.fragment.app.C1043w.C1044a r9, android.util.SparseArray<androidx.fragment.app.C1045x.C1053h> r10, boolean r11, boolean r12) {
        /*
            androidx.fragment.app.Fragment r0 = r9.f2835b
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r1 = r0.f2465C
            if (r1 != 0) goto L_0x000a
            return
        L_0x000a:
            if (r11 == 0) goto L_0x0013
            int[] r2 = f2842a
            int r9 = r9.f2834a
            r9 = r2[r9]
            goto L_0x0015
        L_0x0013:
            int r9 = r9.f2834a
        L_0x0015:
            r2 = 0
            r3 = 1
            if (r9 == r3) goto L_0x007d
            r4 = 3
            if (r9 == r4) goto L_0x0057
            r4 = 4
            if (r9 == r4) goto L_0x003f
            r4 = 5
            if (r9 == r4) goto L_0x002d
            r4 = 6
            if (r9 == r4) goto L_0x0057
            r4 = 7
            if (r9 == r4) goto L_0x007d
            r9 = r2
            r3 = r9
            r4 = r3
            goto L_0x0090
        L_0x002d:
            if (r12 == 0) goto L_0x003c
            boolean r9 = r0.f2481S
            if (r9 == 0) goto L_0x008c
            boolean r9 = r0.f2467E
            if (r9 != 0) goto L_0x008c
            boolean r9 = r0.f2505q
            if (r9 == 0) goto L_0x008c
            goto L_0x008a
        L_0x003c:
            boolean r9 = r0.f2467E
            goto L_0x008d
        L_0x003f:
            if (r12 == 0) goto L_0x004e
            boolean r9 = r0.f2481S
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.f2505q
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.f2467E
            if (r9 == 0) goto L_0x0070
        L_0x004d:
            goto L_0x006e
        L_0x004e:
            boolean r9 = r0.f2505q
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.f2467E
            if (r9 != 0) goto L_0x0070
            goto L_0x004d
        L_0x0057:
            boolean r9 = r0.f2505q
            if (r12 == 0) goto L_0x0072
            if (r9 != 0) goto L_0x0070
            android.view.View r9 = r0.f2475M
            if (r9 == 0) goto L_0x0070
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L_0x0070
            float r9 = r0.f2482T
            r4 = 0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 < 0) goto L_0x0070
        L_0x006e:
            r9 = r3
            goto L_0x0079
        L_0x0070:
            r9 = r2
            goto L_0x0079
        L_0x0072:
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.f2467E
            if (r9 != 0) goto L_0x0070
            goto L_0x006e
        L_0x0079:
            r4 = r9
            r9 = r3
            r3 = r2
            goto L_0x0090
        L_0x007d:
            if (r12 == 0) goto L_0x0082
            boolean r9 = r0.f2480R
            goto L_0x008d
        L_0x0082:
            boolean r9 = r0.f2505q
            if (r9 != 0) goto L_0x008c
            boolean r9 = r0.f2467E
            if (r9 != 0) goto L_0x008c
        L_0x008a:
            r9 = r3
            goto L_0x008d
        L_0x008c:
            r9 = r2
        L_0x008d:
            r4 = r2
            r2 = r9
            r9 = r4
        L_0x0090:
            java.lang.Object r5 = r10.get(r1)
            androidx.fragment.app.x$h r5 = (androidx.fragment.app.C1045x.C1053h) r5
            if (r2 == 0) goto L_0x00a2
            androidx.fragment.app.x$h r5 = m4424p(r5, r10, r1)
            r5.f2879a = r0
            r5.f2880b = r11
            r5.f2881c = r8
        L_0x00a2:
            r2 = 0
            if (r12 != 0) goto L_0x00c3
            if (r3 == 0) goto L_0x00c3
            if (r5 == 0) goto L_0x00af
            androidx.fragment.app.Fragment r3 = r5.f2882d
            if (r3 != r0) goto L_0x00af
            r5.f2882d = r2
        L_0x00af:
            boolean r3 = r8.f2832r
            if (r3 != 0) goto L_0x00c3
            androidx.fragment.app.n r3 = r8.f2550t
            androidx.fragment.app.u r6 = r3.mo3624v(r0)
            androidx.fragment.app.v r7 = r3.mo3617q0()
            r7.mo3716p(r6)
            r3.mo3573N0(r0)
        L_0x00c3:
            if (r4 == 0) goto L_0x00d5
            if (r5 == 0) goto L_0x00cb
            androidx.fragment.app.Fragment r3 = r5.f2882d
            if (r3 != 0) goto L_0x00d5
        L_0x00cb:
            androidx.fragment.app.x$h r5 = m4424p(r5, r10, r1)
            r5.f2882d = r0
            r5.f2883e = r11
            r5.f2884f = r8
        L_0x00d5:
            if (r12 != 0) goto L_0x00e1
            if (r9 == 0) goto L_0x00e1
            if (r5 == 0) goto L_0x00e1
            androidx.fragment.app.Fragment r8 = r5.f2879a
            if (r8 != r0) goto L_0x00e1
            r5.f2879a = r2
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1045x.m4410b(androidx.fragment.app.a, androidx.fragment.app.w$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: c */
    public static void m4411c(C0954a aVar, SparseArray<C1053h> sparseArray, boolean z) {
        int size = aVar.f2817c.size();
        for (int i = 0; i < size; i++) {
            m4410b(aVar, aVar.f2817c.get(i), sparseArray, false, z);
        }
    }

    /* renamed from: d */
    private static C3801a<String, String> m4412d(int i, ArrayList<C0954a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        C3801a<String, String> aVar = new C3801a<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C0954a aVar2 = arrayList.get(i4);
            if (aVar2.mo3371u(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList5 = aVar2.f2830p;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar2.f2830p;
                        arrayList4 = aVar2.f2831q;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.f2830p;
                        arrayList3 = aVar2.f2831q;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    /* renamed from: e */
    public static void m4413e(C0954a aVar, SparseArray<C1053h> sparseArray, boolean z) {
        if (aVar.f2550t.mo3614n0().mo3351e()) {
            for (int size = aVar.f2817c.size() - 1; size >= 0; size--) {
                m4410b(aVar, aVar.f2817c.get(size), sparseArray, true, z);
            }
        }
    }

    /* renamed from: f */
    static void m4414f(Fragment fragment, Fragment fragment2, boolean z, C3801a<String, View> aVar, boolean z2) {
        if (z) {
            fragment2.mo3325t();
        } else {
            fragment.mo3325t();
        }
    }

    /* renamed from: g */
    private static boolean m4415g(C1060z zVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!zVar.mo3742e(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    static C3801a<String, View> m4416h(C1060z zVar, C3801a<String, String> aVar, Object obj, C1053h hVar) {
        ArrayList<String> arrayList;
        Fragment fragment = hVar.f2879a;
        View Q = fragment.mo3252Q();
        if (aVar.isEmpty() || obj == null || Q == null) {
            aVar.clear();
            return null;
        }
        C3801a<String, View> aVar2 = new C3801a<>();
        zVar.mo3772j(aVar2, Q);
        C0954a aVar3 = hVar.f2881c;
        if (hVar.f2880b) {
            fragment.mo3335w();
            arrayList = aVar3.f2830p;
        } else {
            fragment.mo3325t();
            arrayList = aVar3.f2831q;
        }
        if (arrayList != null) {
            aVar2.mo15049o(arrayList);
            aVar2.mo15049o(aVar.values());
        }
        m4432x(aVar, aVar2);
        return aVar2;
    }

    /* renamed from: i */
    private static C3801a<String, View> m4417i(C1060z zVar, C3801a<String, String> aVar, Object obj, C1053h hVar) {
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = hVar.f2882d;
        C3801a<String, View> aVar2 = new C3801a<>();
        zVar.mo3772j(aVar2, fragment.mo3298k1());
        C0954a aVar3 = hVar.f2884f;
        if (hVar.f2883e) {
            fragment.mo3325t();
            arrayList = aVar3.f2831q;
        } else {
            fragment.mo3335w();
            arrayList = aVar3.f2830p;
        }
        if (arrayList != null) {
            aVar2.mo15049o(arrayList);
        }
        aVar.mo15049o(aVar2.keySet());
        return aVar2;
    }

    /* renamed from: j */
    private static C1060z m4418j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object v = fragment.mo3332v();
            if (v != null) {
                arrayList.add(v);
            }
            Object K = fragment.mo3240K();
            if (K != null) {
                arrayList.add(K);
            }
            Object M = fragment.mo3244M();
            if (M != null) {
                arrayList.add(M);
            }
        }
        if (fragment2 != null) {
            Object s = fragment2.mo3322s();
            if (s != null) {
                arrayList.add(s);
            }
            Object I = fragment2.mo3236I();
            if (I != null) {
                arrayList.add(I);
            }
            Object L = fragment2.mo3242L();
            if (L != null) {
                arrayList.add(L);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        C1060z zVar = f2843b;
        if (zVar != null && m4415g(zVar, arrayList)) {
            return zVar;
        }
        C1060z zVar2 = f2844c;
        if (zVar2 != null && m4415g(zVar2, arrayList)) {
            return zVar2;
        }
        if (zVar == null && zVar2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: k */
    static ArrayList<View> m4419k(C1060z zVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View Q = fragment.mo3252Q();
        if (Q != null) {
            zVar.mo3771f(arrayList2, Q);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        zVar.mo3740b(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: l */
    private static Object m4420l(C1060z zVar, ViewGroup viewGroup, View view, C3801a<String, String> aVar, C1053h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        C3801a<String, String> aVar2;
        Object obj3;
        Object obj4;
        Rect rect;
        C1060z zVar2 = zVar;
        C1053h hVar2 = hVar;
        ArrayList<View> arrayList3 = arrayList;
        Object obj5 = obj;
        Fragment fragment = hVar2.f2879a;
        Fragment fragment2 = hVar2.f2882d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar2.f2880b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            obj3 = null;
        } else {
            obj3 = m4428t(zVar2, fragment, fragment2, z);
            aVar2 = aVar;
        }
        C3801a<String, View> i = m4417i(zVar2, aVar2, obj3, hVar2);
        if (aVar.isEmpty()) {
            obj4 = null;
        } else {
            arrayList3.addAll(i.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        m4414f(fragment, fragment2, z, i, true);
        if (obj4 != null) {
            rect = new Rect();
            zVar2.mo3753z(obj4, view, arrayList3);
            m4434z(zVar, obj4, obj2, i, hVar2.f2883e, hVar2.f2884f);
            if (obj5 != null) {
                zVar2.mo3750u(obj5, rect);
            }
        } else {
            rect = null;
        }
        C1051f fVar = r0;
        C1051f fVar2 = new C1051f(zVar, aVar, obj4, hVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect);
        C0830v.m3313a(viewGroup, fVar);
        return obj4;
    }

    /* renamed from: m */
    private static Object m4421m(C1060z zVar, ViewGroup viewGroup, View view, C3801a<String, String> aVar, C1053h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Rect rect;
        View view2;
        C1060z zVar2 = zVar;
        View view3 = view;
        C3801a<String, String> aVar2 = aVar;
        C1053h hVar2 = hVar;
        ArrayList<View> arrayList3 = arrayList;
        ArrayList<View> arrayList4 = arrayList2;
        Object obj4 = obj;
        Fragment fragment = hVar2.f2879a;
        Fragment fragment2 = hVar2.f2882d;
        if (fragment != null) {
            fragment.mo3298k1().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar2.f2880b;
        Object t = aVar.isEmpty() ? null : m4428t(zVar, fragment, fragment2, z);
        C3801a<String, View> i = m4417i(zVar, aVar2, t, hVar2);
        C3801a<String, View> h = m4416h(zVar, aVar2, t, hVar2);
        if (aVar.isEmpty()) {
            if (i != null) {
                i.clear();
            }
            if (h != null) {
                h.clear();
            }
            obj3 = null;
        } else {
            m4409a(arrayList3, i, aVar.keySet());
            m4409a(arrayList4, h, aVar.values());
            obj3 = t;
        }
        if (obj4 == null && obj2 == null && obj3 == null) {
            return null;
        }
        m4414f(fragment, fragment2, z, i, true);
        if (obj3 != null) {
            arrayList4.add(view3);
            zVar.mo3753z(obj3, view3, arrayList3);
            m4434z(zVar, obj3, obj2, i, hVar2.f2883e, hVar2.f2884f);
            Rect rect2 = new Rect();
            View s = m4427s(h, hVar2, obj4, z);
            if (s != null) {
                zVar.mo3750u(obj4, rect2);
            }
            rect = rect2;
            view2 = s;
        } else {
            view2 = null;
            rect = null;
        }
        C0830v.m3313a(viewGroup, new C1050e(fragment, fragment2, z, h, view2, zVar, rect));
        return obj3;
    }

    /* renamed from: n */
    private static void m4422n(ViewGroup viewGroup, C1053h hVar, View view, C3801a<String, String> aVar, C1052g gVar) {
        Object obj;
        ViewGroup viewGroup2 = viewGroup;
        C1053h hVar2 = hVar;
        View view2 = view;
        C3801a<String, String> aVar2 = aVar;
        C1052g gVar2 = gVar;
        Fragment fragment = hVar2.f2879a;
        Fragment fragment2 = hVar2.f2882d;
        C1060z j = m4418j(fragment2, fragment);
        if (j != null) {
            boolean z = hVar2.f2880b;
            boolean z2 = hVar2.f2883e;
            Object q = m4425q(j, fragment, z);
            Object r = m4426r(j, fragment2, z2);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = arrayList;
            Object obj2 = r;
            C1060z zVar = j;
            Object l = m4420l(j, viewGroup, view, aVar, hVar, arrayList, arrayList2, q, obj2);
            Object obj3 = q;
            if (obj3 == null && l == null) {
                obj = obj2;
                if (obj == null) {
                    return;
                }
            } else {
                obj = obj2;
            }
            ArrayList arrayList4 = arrayList3;
            ArrayList<View> k = m4419k(zVar, obj, fragment2, arrayList4, view2);
            if (k == null || k.isEmpty()) {
                obj = null;
            }
            Object obj4 = obj;
            zVar.mo3739a(obj3, view2);
            Object u = m4429u(zVar, obj3, obj4, l, fragment, hVar2.f2880b);
            if (!(fragment2 == null || k == null || (k.size() <= 0 && arrayList4.size() <= 0))) {
                C0678e eVar = new C0678e();
                gVar2.mo3635b(fragment2, eVar);
                zVar.mo3752w(fragment2, u, eVar, new C1048c(gVar2, fragment2, eVar));
            }
            if (u != null) {
                ArrayList arrayList5 = new ArrayList();
                C1060z zVar2 = zVar;
                zVar2.mo3749t(u, obj3, arrayList5, obj4, k, l, arrayList2);
                m4433y(zVar2, viewGroup, fragment, view, arrayList2, obj3, arrayList5, obj4, k);
                ViewGroup viewGroup3 = viewGroup;
                C1060z zVar3 = zVar;
                ArrayList arrayList6 = arrayList2;
                zVar3.mo3776x(viewGroup3, arrayList6, aVar2);
                zVar3.mo3741c(viewGroup3, u);
                zVar3.mo3775s(viewGroup3, arrayList6, aVar2);
            }
        }
    }

    /* renamed from: o */
    private static void m4423o(ViewGroup viewGroup, C1053h hVar, View view, C3801a<String, String> aVar, C1052g gVar) {
        Object obj;
        C1053h hVar2 = hVar;
        View view2 = view;
        C1052g gVar2 = gVar;
        Fragment fragment = hVar2.f2879a;
        Fragment fragment2 = hVar2.f2882d;
        C1060z j = m4418j(fragment2, fragment);
        if (j != null) {
            boolean z = hVar2.f2880b;
            boolean z2 = hVar2.f2883e;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Object q = m4425q(j, fragment, z);
            Object r = m4426r(j, fragment2, z2);
            ArrayList arrayList3 = arrayList2;
            Object m = m4421m(j, viewGroup, view, aVar, hVar, arrayList2, arrayList, q, r);
            Object obj2 = q;
            if (obj2 == null && m == null) {
                obj = r;
                if (obj == null) {
                    return;
                }
            } else {
                obj = r;
            }
            ArrayList<View> k = m4419k(j, obj, fragment2, arrayList3, view2);
            ArrayList<View> k2 = m4419k(j, obj2, fragment, arrayList, view2);
            m4407A(k2, 4);
            Fragment fragment3 = fragment;
            ArrayList<View> arrayList4 = k;
            Object u = m4429u(j, obj2, obj, m, fragment3, z);
            if (!(fragment2 == null || arrayList4 == null || (arrayList4.size() <= 0 && arrayList3.size() <= 0))) {
                C0678e eVar = new C0678e();
                C1052g gVar3 = gVar;
                gVar3.mo3635b(fragment2, eVar);
                j.mo3752w(fragment2, u, eVar, new C1046a(gVar3, fragment2, eVar));
            }
            if (u != null) {
                m4430v(j, obj, fragment2, arrayList4);
                ArrayList<String> o = j.mo3774o(arrayList);
                C1060z zVar = j;
                zVar.mo3749t(u, obj2, k2, obj, arrayList4, m, arrayList);
                ViewGroup viewGroup2 = viewGroup;
                j.mo3741c(viewGroup2, u);
                zVar.mo3777y(viewGroup2, arrayList3, arrayList, o, aVar);
                m4407A(k2, 0);
                j.mo3737A(m, arrayList3, arrayList);
            }
        }
    }

    /* renamed from: p */
    private static C1053h m4424p(C1053h hVar, SparseArray<C1053h> sparseArray, int i) {
        if (hVar != null) {
            return hVar;
        }
        C1053h hVar2 = new C1053h();
        sparseArray.put(i, hVar2);
        return hVar2;
    }

    /* renamed from: q */
    private static Object m4425q(C1060z zVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return zVar.mo3743g(z ? fragment.mo3236I() : fragment.mo3322s());
    }

    /* renamed from: r */
    private static Object m4426r(C1060z zVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return zVar.mo3743g(z ? fragment.mo3240K() : fragment.mo3332v());
    }

    /* renamed from: s */
    static View m4427s(C3801a<String, View> aVar, C1053h hVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        C0954a aVar2 = hVar.f2881c;
        if (obj == null || aVar == null || (arrayList = aVar2.f2830p) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z ? aVar2.f2830p : aVar2.f2831q).get(0));
    }

    /* renamed from: t */
    private static Object m4428t(C1060z zVar, Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return zVar.mo3738B(zVar.mo3743g(z ? fragment2.mo3244M() : fragment.mo3242L()));
    }

    /* renamed from: u */
    private static Object m4429u(C1060z zVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        return (obj == null || obj2 == null || fragment == null) ? true : z ? fragment.mo3302m() : fragment.mo3299l() ? zVar.mo3745n(obj2, obj, obj3) : zVar.mo3744m(obj2, obj, obj3);
    }

    /* renamed from: v */
    private static void m4430v(C1060z zVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.f2505q && fragment.f2467E && fragment.f2481S) {
            fragment.mo3327t1(true);
            zVar.mo3748r(obj, fragment.mo3252Q(), arrayList);
            C0830v.m3313a(fragment.f2474L, new C1047b(arrayList));
        }
    }

    /* renamed from: w */
    private static C1060z m4431w() {
        try {
            return (C1060z) Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: x */
    static void m4432x(C3801a<String, String> aVar, C3801a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.mo15179m(size))) {
                aVar.mo15177k(size);
            }
        }
    }

    /* renamed from: y */
    private static void m4433y(C1060z zVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        ViewGroup viewGroup2 = viewGroup;
        C0830v.m3313a(viewGroup, new C1049d(obj, zVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    /* renamed from: z */
    private static void m4434z(C1060z zVar, Object obj, Object obj2, C3801a<String, View> aVar, boolean z, C0954a aVar2) {
        ArrayList<String> arrayList = aVar2.f2830p;
        if (arrayList != null && !arrayList.isEmpty()) {
            View view = aVar.get((z ? aVar2.f2831q : aVar2.f2830p).get(0));
            zVar.mo3751v(obj, view);
            if (obj2 != null) {
                zVar.mo3751v(obj2, view);
            }
        }
    }
}
