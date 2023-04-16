package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.fragment.app.v */
class C1042v {

    /* renamed from: a */
    private final ArrayList<Fragment> f2812a = new ArrayList<>();

    /* renamed from: b */
    private final HashMap<String, C1039u> f2813b = new HashMap<>();

    /* renamed from: c */
    private C1033q f2814c;

    C1042v() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3701a(Fragment fragment) {
        if (!this.f2812a.contains(fragment)) {
            synchronized (this.f2812a) {
                this.f2812a.add(fragment);
            }
            fragment.f2505q = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3702b() {
        this.f2813b.values().removeAll(Collections.singleton((Object) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo3703c(String str) {
        return this.f2813b.get(str) != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3704d(int i) {
        for (C1039u next : this.f2813b.values()) {
            if (next != null) {
                next.mo3696t(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3705e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f2813b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C1039u next : this.f2813b.values()) {
                printWriter.print(str);
                if (next != null) {
                    Fragment k = next.mo3689k();
                    printWriter.println(k);
                    k.mo3278d(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f2812a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.f2812a.get(i).toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Fragment mo3706f(String str) {
        C1039u uVar = this.f2813b.get(str);
        if (uVar != null) {
            return uVar.mo3689k();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Fragment mo3707g(int i) {
        for (int size = this.f2812a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f2812a.get(size);
            if (fragment != null && fragment.f2464B == i) {
                return fragment;
            }
        }
        for (C1039u next : this.f2813b.values()) {
            if (next != null) {
                Fragment k = next.mo3689k();
                if (k.f2464B == i) {
                    return k;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Fragment mo3708h(String str) {
        if (str != null) {
            for (int size = this.f2812a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f2812a.get(size);
                if (fragment != null && str.equals(fragment.f2466D)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C1039u next : this.f2813b.values()) {
            if (next != null) {
                Fragment k = next.mo3689k();
                if (str.equals(k.f2466D)) {
                    return k;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Fragment mo3709i(String str) {
        Fragment g;
        for (C1039u next : this.f2813b.values()) {
            if (next != null && (g = next.mo3689k().mo3286g(str)) != null) {
                return g;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo3710j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.f2474L;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f2812a.indexOf(fragment);
        for (int i = indexOf - 1; i >= 0; i--) {
            Fragment fragment2 = this.f2812a.get(i);
            if (fragment2.f2474L == viewGroup && (view2 = fragment2.f2475M) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f2812a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f2812a.get(indexOf);
            if (fragment3.f2474L == viewGroup && (view = fragment3.f2475M) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public List<C1039u> mo3711k() {
        ArrayList arrayList = new ArrayList();
        for (C1039u next : this.f2813b.values()) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public List<Fragment> mo3712l() {
        ArrayList arrayList = new ArrayList();
        Iterator<C1039u> it = this.f2813b.values().iterator();
        while (it.hasNext()) {
            C1039u next = it.next();
            arrayList.add(next != null ? next.mo3689k() : null);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public C1039u mo3713m(String str) {
        return this.f2813b.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public List<Fragment> mo3714n() {
        ArrayList arrayList;
        if (this.f2812a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f2812a) {
            arrayList = new ArrayList(this.f2812a);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C1033q mo3715o() {
        return this.f2814c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo3716p(C1039u uVar) {
        Fragment k = uVar.mo3689k();
        if (!mo3703c(k.f2499k)) {
            this.f2813b.put(k.f2499k, uVar);
            if (k.f2470H) {
                if (k.f2469G) {
                    this.f2814c.mo3658e(k);
                } else {
                    this.f2814c.mo3667m(k);
                }
                k.f2470H = false;
            }
            if (C1011n.m4190E0(2)) {
                Log.v("FragmentManager", "Added fragment to active set " + k);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo3717q(C1039u uVar) {
        Fragment k = uVar.mo3689k();
        if (k.f2469G) {
            this.f2814c.mo3667m(k);
        }
        if (this.f2813b.put(k.f2499k, (Object) null) != null && C1011n.m4190E0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + k);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo3718r() {
        Iterator<Fragment> it = this.f2812a.iterator();
        while (it.hasNext()) {
            C1039u uVar = this.f2813b.get(it.next().f2499k);
            if (uVar != null) {
                uVar.mo3690m();
            }
        }
        for (C1039u next : this.f2813b.values()) {
            if (next != null) {
                next.mo3690m();
                Fragment k = next.mo3689k();
                if (k.f2506r && !k.mo3262W()) {
                    mo3717q(next);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo3719s(Fragment fragment) {
        synchronized (this.f2812a) {
            this.f2812a.remove(fragment);
        }
        fragment.f2505q = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo3720t() {
        this.f2813b.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo3721u(List<String> list) {
        this.f2812a.clear();
        if (list != null) {
            for (String next : list) {
                Fragment f = mo3706f(next);
                if (f != null) {
                    if (C1011n.m4190E0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + next + "): " + f);
                    }
                    mo3701a(f);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + next + ")");
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public ArrayList<C1037t> mo3722v() {
        ArrayList<C1037t> arrayList = new ArrayList<>(this.f2813b.size());
        for (C1039u next : this.f2813b.values()) {
            if (next != null) {
                Fragment k = next.mo3689k();
                C1037t r = next.mo3694r();
                arrayList.add(r);
                if (C1011n.m4190E0(2)) {
                    Log.v("FragmentManager", "Saved state of " + k + ": " + r.f2803r);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public ArrayList<String> mo3723w() {
        synchronized (this.f2812a) {
            if (this.f2812a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f2812a.size());
            Iterator<Fragment> it = this.f2812a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.f2499k);
                if (C1011n.m4190E0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.f2499k + "): " + next);
                }
            }
            return arrayList;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo3724x(C1033q qVar) {
        this.f2814c = qVar;
    }
}
