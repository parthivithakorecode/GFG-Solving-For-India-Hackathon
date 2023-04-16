package p167y2;

import p021c3.C1439a;
import p028d3.C2488a;
import p028d3.C2491c;
import p149v2.C4203e;
import p149v2.C4213i;
import p149v2.C4214j;
import p149v2.C4215k;
import p149v2.C4221q;
import p149v2.C4222r;
import p149v2.C4233w;
import p149v2.C4235x;
import p161x2.C4341l;

/* renamed from: y2.l */
public final class C4421l<T> extends C4233w<T> {

    /* renamed from: a */
    private final C4222r<T> f22805a;

    /* renamed from: b */
    private final C4214j<T> f22806b;

    /* renamed from: c */
    final C4203e f22807c;

    /* renamed from: d */
    private final C1439a<T> f22808d;

    /* renamed from: e */
    private final C4235x f22809e;

    /* renamed from: f */
    private final C4421l<T>.b f22810f = new C4423b();

    /* renamed from: g */
    private C4233w<T> f22811g;

    /* renamed from: y2.l$b */
    private final class C4423b implements C4221q, C4213i {
        private C4423b() {
        }
    }

    public C4421l(C4222r<T> rVar, C4214j<T> jVar, C4203e eVar, C1439a<T> aVar, C4235x xVar) {
        this.f22805a = rVar;
        this.f22806b = jVar;
        this.f22807c = eVar;
        this.f22808d = aVar;
        this.f22809e = xVar;
    }

    /* renamed from: f */
    private C4233w<T> m27127f() {
        C4233w<T> wVar = this.f22811g;
        if (wVar != null) {
            return wVar;
        }
        C4233w<T> l = this.f22807c.mo15718l(this.f22809e, this.f22808d);
        this.f22811g = l;
        return l;
    }

    /* renamed from: c */
    public T mo4624c(C2488a aVar) {
        if (this.f22806b == null) {
            return m27127f().mo4624c(aVar);
        }
        C4215k a = C4341l.m26964a(aVar);
        if (a.mo15753m()) {
            return null;
        }
        return this.f22806b.mo15748a(a, this.f22808d.mo4849e(), this.f22810f);
    }

    /* renamed from: e */
    public void mo4625e(C2491c cVar, T t) {
        C4222r<T> rVar = this.f22805a;
        if (rVar == null) {
            m27127f().mo4625e(cVar, t);
        } else if (t == null) {
            cVar.mo12369H();
        } else {
            C4341l.m26965b(rVar.mo15775a(t, this.f22808d.mo4849e(), this.f22810f), cVar);
        }
    }
}
