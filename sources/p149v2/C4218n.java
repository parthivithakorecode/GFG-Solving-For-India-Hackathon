package p149v2;

import java.util.Map;
import java.util.Set;
import p161x2.C4330h;

/* renamed from: v2.n */
public final class C4218n extends C4215k {

    /* renamed from: a */
    private final C4330h<String, C4215k> f22504a = new C4330h<>();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C4218n) && ((C4218n) obj).f22504a.equals(this.f22504a));
    }

    public int hashCode() {
        return this.f22504a.hashCode();
    }

    /* renamed from: p */
    public void mo15761p(String str, C4215k kVar) {
        C4330h<String, C4215k> hVar = this.f22504a;
        if (kVar == null) {
            kVar = C4217m.f22503a;
        }
        hVar.put(str, kVar);
    }

    /* renamed from: q */
    public Set<Map.Entry<String, C4215k>> mo15762q() {
        return this.f22504a.entrySet();
    }

    /* renamed from: r */
    public boolean mo15763r(String str) {
        return this.f22504a.containsKey(str);
    }

    /* renamed from: s */
    public C4215k mo15764s(String str) {
        return this.f22504a.remove(str);
    }
}
