package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.C1011n;
import androidx.fragment.app.C1043w;
import androidx.fragment.app.Fragment;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a */
final class C0954a extends C1043w implements C1011n.C1027o {

    /* renamed from: t */
    final C1011n f2550t;

    /* renamed from: u */
    boolean f2551u;

    /* renamed from: v */
    int f2552v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0954a(C1011n nVar) {
        super(nVar.mo3615p0(), nVar.mo3619s0() != null ? nVar.mo3619s0().mo3530j().getClassLoader() : null);
        this.f2552v = -1;
        this.f2550t = nVar;
    }

    /* renamed from: w */
    private static boolean m3987w(C1043w.C1044a aVar) {
        Fragment fragment = aVar.f2835b;
        return fragment != null && fragment.f2505q && fragment.f2475M != null && !fragment.f2468F && !fragment.f2467E && fragment.mo3266Y();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public Fragment mo3355A(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f2817c.size() - 1; size >= 0; size--) {
            C1043w.C1044a aVar = this.f2817c.get(size);
            int i = aVar.f2834a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f2835b;
                            break;
                        case 10:
                            aVar.f2841h = aVar.f2840g;
                            break;
                    }
                }
                arrayList.add(aVar.f2835b);
            }
            arrayList.remove(aVar.f2835b);
        }
        return fragment;
    }

    /* renamed from: a */
    public boolean mo3356a(ArrayList<C0954a> arrayList, ArrayList<Boolean> arrayList2) {
        if (C1011n.m4190E0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f2823i) {
            return true;
        }
        this.f2550t.mo3595e(this);
        return true;
    }

    /* renamed from: f */
    public int mo3357f() {
        return mo3363n(false);
    }

    /* renamed from: g */
    public int mo3358g() {
        return mo3363n(true);
    }

    /* renamed from: h */
    public void mo3359h() {
        mo3729i();
        this.f2550t.mo3592b0(this, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo3360j(int i, Fragment fragment, String str, int i2) {
        super.mo3360j(i, fragment, str, i2);
        fragment.f2512x = this.f2550t;
    }

    /* renamed from: k */
    public C1043w mo3361k(Fragment fragment) {
        C1011n nVar = fragment.f2512x;
        if (nVar == null || nVar == this.f2550t) {
            return super.mo3361k(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo3362m(int i) {
        if (this.f2823i) {
            if (C1011n.m4190E0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f2817c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1043w.C1044a aVar = this.f2817c.get(i2);
                Fragment fragment = aVar.f2835b;
                if (fragment != null) {
                    fragment.f2511w += i;
                    if (C1011n.m4190E0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f2835b + " to " + aVar.f2835b.f2511w);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public int mo3363n(boolean z) {
        if (!this.f2551u) {
            if (C1011n.m4190E0(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new C0958b0("FragmentManager"));
                mo3364o("  ", printWriter);
                printWriter.close();
            }
            this.f2551u = true;
            this.f2552v = this.f2823i ? this.f2550t.mo3606i() : -1;
            this.f2550t.mo3589Y(this, z);
            return this.f2552v;
        }
        throw new IllegalStateException("commit already called");
    }

    /* renamed from: o */
    public void mo3364o(String str, PrintWriter printWriter) {
        mo3365p(str, printWriter, true);
    }

    /* renamed from: p */
    public void mo3365p(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2825k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2552v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2551u);
            if (this.f2822h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2822h));
            }
            if (!(this.f2818d == 0 && this.f2819e == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2818d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2819e));
            }
            if (!(this.f2820f == 0 && this.f2821g == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2820f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2821g));
            }
            if (!(this.f2826l == 0 && this.f2827m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2826l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2827m);
            }
            if (!(this.f2828n == 0 && this.f2829o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2828n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2829o);
            }
        }
        if (!this.f2817c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f2817c.size();
            for (int i = 0; i < size; i++) {
                C1043w.C1044a aVar = this.f2817c.get(i);
                switch (aVar.f2834a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f2834a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f2835b);
                if (z) {
                    if (!(aVar.f2836c == 0 && aVar.f2837d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f2836c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f2837d));
                    }
                    if (aVar.f2838e != 0 || aVar.f2839f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f2838e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f2839f));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo3366q() {
        int size = this.f2817c.size();
        for (int i = 0; i < size; i++) {
            C1043w.C1044a aVar = this.f2817c.get(i);
            Fragment fragment = aVar.f2835b;
            if (fragment != null) {
                fragment.mo3337w1(false);
                fragment.mo3331u1(this.f2822h);
                fragment.mo3343y1(this.f2830p, this.f2831q);
            }
            switch (aVar.f2834a) {
                case 1:
                    fragment.mo3315p1(aVar.f2836c, aVar.f2837d, aVar.f2838e, aVar.f2839f);
                    this.f2550t.mo3599f1(fragment, false);
                    this.f2550t.mo3600g(fragment);
                    break;
                case 3:
                    fragment.mo3315p1(aVar.f2836c, aVar.f2837d, aVar.f2838e, aVar.f2839f);
                    this.f2550t.mo3590Y0(fragment);
                    break;
                case 4:
                    fragment.mo3315p1(aVar.f2836c, aVar.f2837d, aVar.f2838e, aVar.f2839f);
                    this.f2550t.mo3553B0(fragment);
                    break;
                case 5:
                    fragment.mo3315p1(aVar.f2836c, aVar.f2837d, aVar.f2838e, aVar.f2839f);
                    this.f2550t.mo3599f1(fragment, false);
                    this.f2550t.mo3609j1(fragment);
                    break;
                case 6:
                    fragment.mo3315p1(aVar.f2836c, aVar.f2837d, aVar.f2838e, aVar.f2839f);
                    this.f2550t.mo3627x(fragment);
                    break;
                case 7:
                    fragment.mo3315p1(aVar.f2836c, aVar.f2837d, aVar.f2838e, aVar.f2839f);
                    this.f2550t.mo3599f1(fragment, false);
                    this.f2550t.mo3610k(fragment);
                    break;
                case 8:
                    this.f2550t.mo3605h1(fragment);
                    break;
                case 9:
                    this.f2550t.mo3605h1((Fragment) null);
                    break;
                case 10:
                    this.f2550t.mo3602g1(fragment, aVar.f2841h);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f2834a);
            }
            if (!this.f2832r && aVar.f2834a != 1 && fragment != null && !C1011n.f2711P) {
                this.f2550t.mo3569L0(fragment);
            }
        }
        if (!this.f2832r && !C1011n.f2711P) {
            C1011n nVar = this.f2550t;
            nVar.mo3571M0(nVar.f2742q, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo3367r(boolean z) {
        for (int size = this.f2817c.size() - 1; size >= 0; size--) {
            C1043w.C1044a aVar = this.f2817c.get(size);
            Fragment fragment = aVar.f2835b;
            if (fragment != null) {
                fragment.mo3337w1(true);
                fragment.mo3331u1(C1011n.m4206c1(this.f2822h));
                fragment.mo3343y1(this.f2831q, this.f2830p);
            }
            switch (aVar.f2834a) {
                case 1:
                    fragment.mo3315p1(aVar.f2836c, aVar.f2837d, aVar.f2838e, aVar.f2839f);
                    this.f2550t.mo3599f1(fragment, true);
                    this.f2550t.mo3590Y0(fragment);
                    break;
                case 3:
                    fragment.mo3315p1(aVar.f2836c, aVar.f2837d, aVar.f2838e, aVar.f2839f);
                    this.f2550t.mo3600g(fragment);
                    break;
                case 4:
                    fragment.mo3315p1(aVar.f2836c, aVar.f2837d, aVar.f2838e, aVar.f2839f);
                    this.f2550t.mo3609j1(fragment);
                    break;
                case 5:
                    fragment.mo3315p1(aVar.f2836c, aVar.f2837d, aVar.f2838e, aVar.f2839f);
                    this.f2550t.mo3599f1(fragment, true);
                    this.f2550t.mo3553B0(fragment);
                    break;
                case 6:
                    fragment.mo3315p1(aVar.f2836c, aVar.f2837d, aVar.f2838e, aVar.f2839f);
                    this.f2550t.mo3610k(fragment);
                    break;
                case 7:
                    fragment.mo3315p1(aVar.f2836c, aVar.f2837d, aVar.f2838e, aVar.f2839f);
                    this.f2550t.mo3599f1(fragment, true);
                    this.f2550t.mo3627x(fragment);
                    break;
                case 8:
                    this.f2550t.mo3605h1((Fragment) null);
                    break;
                case 9:
                    this.f2550t.mo3605h1(fragment);
                    break;
                case 10:
                    this.f2550t.mo3602g1(fragment, aVar.f2840g);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f2834a);
            }
            if (!this.f2832r && aVar.f2834a != 3 && fragment != null && !C1011n.f2711P) {
                this.f2550t.mo3569L0(fragment);
            }
        }
        if (!this.f2832r && z && !C1011n.f2711P) {
            C1011n nVar = this.f2550t;
            nVar.mo3571M0(nVar.f2742q, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public Fragment mo3368s(ArrayList<Fragment> arrayList, Fragment fragment) {
        ArrayList<Fragment> arrayList2 = arrayList;
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f2817c.size()) {
            C1043w.C1044a aVar = this.f2817c.get(i);
            int i2 = aVar.f2834a;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = aVar.f2835b;
                    int i3 = fragment3.f2465C;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList2.get(size);
                        if (fragment4.f2465C == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f2817c.add(i, new C1043w.C1044a(9, fragment4));
                                    i++;
                                    fragment2 = null;
                                }
                                C1043w.C1044a aVar2 = new C1043w.C1044a(3, fragment4);
                                aVar2.f2836c = aVar.f2836c;
                                aVar2.f2838e = aVar.f2838e;
                                aVar2.f2837d = aVar.f2837d;
                                aVar2.f2839f = aVar.f2839f;
                                this.f2817c.add(i, aVar2);
                                arrayList2.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.f2817c.remove(i);
                        i--;
                    } else {
                        aVar.f2834a = 1;
                        arrayList2.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList2.remove(aVar.f2835b);
                    Fragment fragment5 = aVar.f2835b;
                    if (fragment5 == fragment2) {
                        this.f2817c.add(i, new C1043w.C1044a(9, fragment5));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.f2817c.add(i, new C1043w.C1044a(9, fragment2));
                        i++;
                        fragment2 = aVar.f2835b;
                    }
                }
                i++;
            }
            arrayList2.add(aVar.f2835b);
            i++;
        }
        return fragment2;
    }

    /* renamed from: t */
    public String mo3369t() {
        return this.f2825k;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2552v >= 0) {
            sb.append(" #");
            sb.append(this.f2552v);
        }
        if (this.f2825k != null) {
            sb.append(" ");
            sb.append(this.f2825k);
        }
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo3371u(int i) {
        int size = this.f2817c.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f2817c.get(i2).f2835b;
            int i3 = fragment != null ? fragment.f2465C : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean mo3372v(ArrayList<C0954a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f2817c.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.f2817c.get(i4).f2835b;
            int i5 = fragment != null ? fragment.f2465C : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    C0954a aVar = arrayList.get(i6);
                    int size2 = aVar.f2817c.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = aVar.f2817c.get(i7).f2835b;
                        if ((fragment2 != null ? fragment2.f2465C : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo3373x() {
        for (int i = 0; i < this.f2817c.size(); i++) {
            if (m3987w(this.f2817c.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: y */
    public void mo3374y() {
        if (this.f2833s != null) {
            for (int i = 0; i < this.f2833s.size(); i++) {
                this.f2833s.get(i).run();
            }
            this.f2833s = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo3375z(Fragment.C0953h hVar) {
        for (int i = 0; i < this.f2817c.size(); i++) {
            C1043w.C1044a aVar = this.f2817c.get(i);
            if (m3987w(aVar)) {
                aVar.f2835b.mo3334v1(hVar);
            }
        }
    }
}
