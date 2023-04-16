package p149v2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: v2.h */
public final class C4212h extends C4215k implements Iterable<C4215k> {

    /* renamed from: f */
    private final List<C4215k> f22502f = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C4212h) && ((C4212h) obj).f22502f.equals(this.f22502f));
    }

    public int hashCode() {
        return this.f22502f.hashCode();
    }

    public Iterator<C4215k> iterator() {
        return this.f22502f.iterator();
    }

    /* renamed from: k */
    public String mo15746k() {
        if (this.f22502f.size() == 1) {
            return this.f22502f.get(0).mo15746k();
        }
        throw new IllegalStateException();
    }

    /* renamed from: p */
    public void mo15747p(C4215k kVar) {
        if (kVar == null) {
            kVar = C4217m.f22503a;
        }
        this.f22502f.add(kVar);
    }
}
