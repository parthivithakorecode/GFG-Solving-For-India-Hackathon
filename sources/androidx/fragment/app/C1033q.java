package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.C1081d0;
import androidx.lifecycle.C1083e0;
import androidx.lifecycle.C1094f0;
import androidx.lifecycle.C1098h0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import p001a0.C0005a;

/* renamed from: androidx.fragment.app.q */
final class C1033q extends C1081d0 {

    /* renamed from: k */
    private static final C1083e0.C1087b f2783k = new C1034a();

    /* renamed from: d */
    private final HashMap<String, Fragment> f2784d = new HashMap<>();

    /* renamed from: e */
    private final HashMap<String, C1033q> f2785e = new HashMap<>();

    /* renamed from: f */
    private final HashMap<String, C1098h0> f2786f = new HashMap<>();

    /* renamed from: g */
    private final boolean f2787g;

    /* renamed from: h */
    private boolean f2788h = false;

    /* renamed from: i */
    private boolean f2789i = false;

    /* renamed from: j */
    private boolean f2790j = false;

    /* renamed from: androidx.fragment.app.q$a */
    class C1034a implements C1083e0.C1087b {
        C1034a() {
        }

        /* renamed from: a */
        public <T extends C1081d0> T mo12a(Class<T> cls) {
            return new C1033q(true);
        }

        /* renamed from: b */
        public /* synthetic */ C1081d0 mo13b(Class cls, C0005a aVar) {
            return C1094f0.m4557b(this, cls, aVar);
        }
    }

    C1033q(boolean z) {
        this.f2787g = z;
    }

    /* renamed from: i */
    static C1033q m4332i(C1098h0 h0Var) {
        return (C1033q) new C1083e0(h0Var, f2783k).mo3822a(C1033q.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo3657d() {
        if (C1011n.m4190E0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f2788h = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3658e(Fragment fragment) {
        if (this.f2790j) {
            if (C1011n.m4190E0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (!this.f2784d.containsKey(fragment.f2499k)) {
            this.f2784d.put(fragment.f2499k, fragment);
            if (C1011n.m4190E0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1033q.class != obj.getClass()) {
            return false;
        }
        C1033q qVar = (C1033q) obj;
        return this.f2784d.equals(qVar.f2784d) && this.f2785e.equals(qVar.f2785e) && this.f2786f.equals(qVar.f2786f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3660f(Fragment fragment) {
        if (C1011n.m4190E0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        C1033q qVar = this.f2785e.get(fragment.f2499k);
        if (qVar != null) {
            qVar.mo3657d();
            this.f2785e.remove(fragment.f2499k);
        }
        C1098h0 h0Var = this.f2786f.get(fragment.f2499k);
        if (h0Var != null) {
            h0Var.mo3826a();
            this.f2786f.remove(fragment.f2499k);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Fragment mo3661g(String str) {
        return this.f2784d.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C1033q mo3662h(Fragment fragment) {
        C1033q qVar = this.f2785e.get(fragment.f2499k);
        if (qVar != null) {
            return qVar;
        }
        C1033q qVar2 = new C1033q(this.f2787g);
        this.f2785e.put(fragment.f2499k, qVar2);
        return qVar2;
    }

    public int hashCode() {
        return (((this.f2784d.hashCode() * 31) + this.f2785e.hashCode()) * 31) + this.f2786f.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Collection<Fragment> mo3664j() {
        return new ArrayList(this.f2784d.values());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C1098h0 mo3665k(Fragment fragment) {
        C1098h0 h0Var = this.f2786f.get(fragment.f2499k);
        if (h0Var != null) {
            return h0Var;
        }
        C1098h0 h0Var2 = new C1098h0();
        this.f2786f.put(fragment.f2499k, h0Var2);
        return h0Var2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo3666l() {
        return this.f2788h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo3667m(Fragment fragment) {
        if (!this.f2790j) {
            if ((this.f2784d.remove(fragment.f2499k) != null) && C1011n.m4190E0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
            }
        } else if (C1011n.m4190E0(2)) {
            Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo3668n(boolean z) {
        this.f2790j = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo3669o(Fragment fragment) {
        if (!this.f2784d.containsKey(fragment.f2499k)) {
            return true;
        }
        return this.f2787g ? this.f2788h : !this.f2789i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f2784d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f2785e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f2786f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
