package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: androidx.lifecycle.h0 */
public class C1098h0 {

    /* renamed from: a */
    private final HashMap<String, C1081d0> f2979a = new HashMap<>();

    /* renamed from: a */
    public final void mo3826a() {
        for (C1081d0 a : this.f2979a.values()) {
            a.mo3820a();
        }
        this.f2979a.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C1081d0 mo3827b(String str) {
        return this.f2979a.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Set<String> mo3828c() {
        return new HashSet(this.f2979a.keySet());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo3829d(String str, C1081d0 d0Var) {
        C1081d0 put = this.f2979a.put(str, d0Var);
        if (put != null) {
            put.mo3657d();
        }
    }
}
