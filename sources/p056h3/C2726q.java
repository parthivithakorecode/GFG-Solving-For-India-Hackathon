package p056h3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* renamed from: h3.q */
class C2726q implements C2724o {

    /* renamed from: a */
    final String f19269a;

    /* renamed from: b */
    final int f19270b;

    /* renamed from: c */
    final int f19271c;

    /* renamed from: d */
    private final LinkedList<C2719k> f19272d = new LinkedList<>();

    /* renamed from: e */
    private final Set<C2721m> f19273e = new HashSet();

    /* renamed from: f */
    private final Set<C2721m> f19274f = new HashSet();

    /* renamed from: g */
    private final Map<Integer, C2721m> f19275g = new HashMap();

    C2726q(String str, int i, int i2) {
        this.f19269a = str;
        this.f19270b = i;
        this.f19271c = i2;
    }

    /* renamed from: f */
    private synchronized C2719k m21743f(C2721m mVar) {
        C2719k kVar;
        ListIterator listIterator = this.f19272d.listIterator();
        while (true) {
            C2721m mVar2 = null;
            if (!listIterator.hasNext()) {
                return null;
            }
            kVar = (C2719k) listIterator.next();
            if (kVar.mo12743a() != null) {
                mVar2 = this.f19275g.get(kVar.mo12743a());
            }
            if (mVar2 == null || mVar2 == mVar) {
                listIterator.remove();
            }
        }
        listIterator.remove();
        return kVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public synchronized void m21744g(C2721m mVar) {
        HashSet<C2721m> hashSet = new HashSet<>(this.f19273e);
        this.f19274f.remove(mVar);
        this.f19273e.add(mVar);
        if (!mVar.mo12746b() && mVar.mo12747d() != null) {
            this.f19275g.remove(mVar.mo12747d());
        }
        m21746i(mVar);
        for (C2721m i : hashSet) {
            m21746i(i);
        }
    }

    /* renamed from: i */
    private synchronized void m21746i(C2721m mVar) {
        C2719k f = m21743f(mVar);
        if (f != null) {
            this.f19274f.add(mVar);
            this.f19273e.remove(mVar);
            if (f.mo12743a() != null) {
                this.f19275g.put(f.mo12743a(), mVar);
            }
            mVar.mo12748e(f);
        }
    }

    /* renamed from: a */
    public synchronized void mo12752a(C2719k kVar) {
        this.f19272d.add(kVar);
        for (C2721m i : new HashSet(this.f19273e)) {
            m21746i(i);
        }
    }

    /* renamed from: b */
    public synchronized void mo12753b() {
        for (C2721m f : this.f19273e) {
            f.mo12749f();
        }
        for (C2721m f2 : this.f19274f) {
            f2.mo12749f();
        }
    }

    /* renamed from: c */
    public /* synthetic */ void mo12754c(C2716i iVar, Runnable runnable) {
        C2722n.m21735a(this, iVar, runnable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C2721m mo12757e(String str, int i) {
        return new C2721m(str, i);
    }

    public synchronized void start() {
        for (int i = 0; i < this.f19270b; i++) {
            C2721m e = mo12757e(this.f19269a + i, this.f19271c);
            e.mo12750g(new C2725p(this, e));
            this.f19273e.add(e);
        }
    }
}
