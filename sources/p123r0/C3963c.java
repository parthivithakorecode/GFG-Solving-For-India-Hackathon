package p123r0;

import java.util.ArrayList;
import java.util.List;
import p117q0.C3936a;
import p129s0.C4009d;
import p141u0.C4108p;

/* renamed from: r0.c */
public abstract class C3963c<T> implements C3936a<T> {

    /* renamed from: a */
    private final List<String> f22124a = new ArrayList();

    /* renamed from: b */
    private T f22125b;

    /* renamed from: c */
    private C4009d<T> f22126c;

    /* renamed from: d */
    private C3964a f22127d;

    /* renamed from: r0.c$a */
    public interface C3964a {
        /* renamed from: a */
        void mo15400a(List<String> list);

        /* renamed from: b */
        void mo15401b(List<String> list);
    }

    C3963c(C4009d<T> dVar) {
        this.f22126c = dVar;
    }

    /* renamed from: h */
    private void m26157h(C3964a aVar, T t) {
        if (!this.f22124a.isEmpty() && aVar != null) {
            if (t == null || mo15424c(t)) {
                aVar.mo15401b(this.f22124a);
            } else {
                aVar.mo15400a(this.f22124a);
            }
        }
    }

    /* renamed from: a */
    public void mo15392a(T t) {
        this.f22125b = t;
        m26157h(this.f22127d, t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo15423b(C4108p pVar);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract boolean mo15424c(T t);

    /* renamed from: d */
    public boolean mo15427d(String str) {
        T t = this.f22125b;
        return t != null && mo15424c(t) && this.f22124a.contains(str);
    }

    /* renamed from: e */
    public void mo15428e(Iterable<C4108p> iterable) {
        this.f22124a.clear();
        for (C4108p next : iterable) {
            if (mo15423b(next)) {
                this.f22124a.add(next.f22314a);
            }
        }
        if (this.f22124a.isEmpty()) {
            this.f22126c.mo15488c(this);
        } else {
            this.f22126c.mo15487a(this);
        }
        m26157h(this.f22127d, this.f22125b);
    }

    /* renamed from: f */
    public void mo15429f() {
        if (!this.f22124a.isEmpty()) {
            this.f22124a.clear();
            this.f22126c.mo15488c(this);
        }
    }

    /* renamed from: g */
    public void mo15430g(C3964a aVar) {
        if (this.f22127d != aVar) {
            this.f22127d = aVar;
            m26157h(aVar, this.f22125b);
        }
    }
}
