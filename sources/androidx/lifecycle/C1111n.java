package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.C1099i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p067j.C3127a;
import p074k.C3285a;
import p074k.C3286b;

/* renamed from: androidx.lifecycle.n */
public class C1111n extends C1099i {

    /* renamed from: b */
    private C3285a<C1109l, C1112a> f2990b;

    /* renamed from: c */
    private C1099i.C1102c f2991c;

    /* renamed from: d */
    private final WeakReference<C1110m> f2992d;

    /* renamed from: e */
    private int f2993e;

    /* renamed from: f */
    private boolean f2994f;

    /* renamed from: g */
    private boolean f2995g;

    /* renamed from: h */
    private ArrayList<C1099i.C1102c> f2996h;

    /* renamed from: i */
    private final boolean f2997i;

    /* renamed from: androidx.lifecycle.n$a */
    static class C1112a {

        /* renamed from: a */
        C1099i.C1102c f2998a;

        /* renamed from: b */
        C1107k f2999b;

        C1112a(C1109l lVar, C1099i.C1102c cVar) {
            this.f2999b = C1115q.m4602f(lVar);
            this.f2998a = cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3838a(C1110m mVar, C1099i.C1101b bVar) {
            C1099i.C1102c d = bVar.mo3833d();
            this.f2998a = C1111n.m4583k(this.f2998a, d);
            this.f2999b.mo527e(mVar, bVar);
            this.f2998a = d;
        }
    }

    public C1111n(C1110m mVar) {
        this(mVar, true);
    }

    private C1111n(C1110m mVar, boolean z) {
        this.f2990b = new C3285a<>();
        this.f2993e = 0;
        this.f2994f = false;
        this.f2995g = false;
        this.f2996h = new ArrayList<>();
        this.f2992d = new WeakReference<>(mVar);
        this.f2991c = C1099i.C1102c.INITIALIZED;
        this.f2997i = z;
    }

    /* renamed from: d */
    private void m4578d(C1110m mVar) {
        Iterator<Map.Entry<C1109l, C1112a>> descendingIterator = this.f2990b.descendingIterator();
        while (descendingIterator.hasNext() && !this.f2995g) {
            Map.Entry next = descendingIterator.next();
            C1112a aVar = (C1112a) next.getValue();
            while (aVar.f2998a.compareTo(this.f2991c) > 0 && !this.f2995g && this.f2990b.contains((C1109l) next.getKey())) {
                C1099i.C1101b b = C1099i.C1101b.m4568b(aVar.f2998a);
                if (b != null) {
                    m4586n(b.mo3833d());
                    aVar.mo3838a(mVar, b);
                    m4585m();
                } else {
                    throw new IllegalStateException("no event down from " + aVar.f2998a);
                }
            }
        }
    }

    /* renamed from: e */
    private C1099i.C1102c m4579e(C1109l lVar) {
        Map.Entry<C1109l, C1112a> o = this.f2990b.mo14274o(lVar);
        C1099i.C1102c cVar = null;
        C1099i.C1102c cVar2 = o != null ? o.getValue().f2998a : null;
        if (!this.f2996h.isEmpty()) {
            ArrayList<C1099i.C1102c> arrayList = this.f2996h;
            cVar = arrayList.get(arrayList.size() - 1);
        }
        return m4583k(m4583k(this.f2991c, cVar2), cVar);
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: f */
    private void m4580f(String str) {
        if (this.f2997i && !C3127a.m23806e().mo13965b()) {
            throw new IllegalStateException("Method " + str + " must be called on the main thread");
        }
    }

    /* renamed from: g */
    private void m4581g(C1110m mVar) {
        C3286b<K, V>.d j = this.f2990b.mo14280j();
        while (j.hasNext() && !this.f2995g) {
            Map.Entry entry = (Map.Entry) j.next();
            C1112a aVar = (C1112a) entry.getValue();
            while (aVar.f2998a.compareTo(this.f2991c) < 0 && !this.f2995g && this.f2990b.contains((C1109l) entry.getKey())) {
                m4586n(aVar.f2998a);
                C1099i.C1101b e = C1099i.C1101b.m4569e(aVar.f2998a);
                if (e != null) {
                    aVar.mo3838a(mVar, e);
                    m4585m();
                } else {
                    throw new IllegalStateException("no event up from " + aVar.f2998a);
                }
            }
        }
    }

    /* renamed from: i */
    private boolean m4582i() {
        if (this.f2990b.size() == 0) {
            return true;
        }
        C1099i.C1102c cVar = this.f2990b.mo14277h().getValue().f2998a;
        C1099i.C1102c cVar2 = this.f2990b.mo14281k().getValue().f2998a;
        return cVar == cVar2 && this.f2991c == cVar2;
    }

    /* renamed from: k */
    static C1099i.C1102c m4583k(C1099i.C1102c cVar, C1099i.C1102c cVar2) {
        return (cVar2 == null || cVar2.compareTo(cVar) >= 0) ? cVar : cVar2;
    }

    /* renamed from: l */
    private void m4584l(C1099i.C1102c cVar) {
        C1099i.C1102c cVar2 = this.f2991c;
        if (cVar2 != cVar) {
            if (cVar2 == C1099i.C1102c.INITIALIZED && cVar == C1099i.C1102c.DESTROYED) {
                throw new IllegalStateException("no event down from " + this.f2991c);
            }
            this.f2991c = cVar;
            if (this.f2994f || this.f2993e != 0) {
                this.f2995g = true;
                return;
            }
            this.f2994f = true;
            m4587p();
            this.f2994f = false;
            if (this.f2991c == C1099i.C1102c.DESTROYED) {
                this.f2990b = new C3285a<>();
            }
        }
    }

    /* renamed from: m */
    private void m4585m() {
        ArrayList<C1099i.C1102c> arrayList = this.f2996h;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: n */
    private void m4586n(C1099i.C1102c cVar) {
        this.f2996h.add(cVar);
    }

    /* renamed from: p */
    private void m4587p() {
        C1110m mVar = (C1110m) this.f2992d.get();
        if (mVar != null) {
            while (true) {
                boolean i = m4582i();
                this.f2995g = false;
                if (!i) {
                    if (this.f2991c.compareTo(this.f2990b.mo14277h().getValue().f2998a) < 0) {
                        m4578d(mVar);
                    }
                    Map.Entry<C1109l, C1112a> k = this.f2990b.mo14281k();
                    if (!this.f2995g && k != null && this.f2991c.compareTo(k.getValue().f2998a) > 0) {
                        m4581g(mVar);
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
    }

    /* renamed from: a */
    public void mo3830a(C1109l lVar) {
        C1110m mVar;
        m4580f("addObserver");
        C1099i.C1102c cVar = this.f2991c;
        C1099i.C1102c cVar2 = C1099i.C1102c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = C1099i.C1102c.INITIALIZED;
        }
        C1112a aVar = new C1112a(lVar, cVar2);
        if (this.f2990b.mo14272m(lVar, aVar) == null && (mVar = (C1110m) this.f2992d.get()) != null) {
            boolean z = this.f2993e != 0 || this.f2994f;
            C1099i.C1102c e = m4579e(lVar);
            this.f2993e++;
            while (aVar.f2998a.compareTo(e) < 0 && this.f2990b.contains(lVar)) {
                m4586n(aVar.f2998a);
                C1099i.C1101b e2 = C1099i.C1101b.m4569e(aVar.f2998a);
                if (e2 != null) {
                    aVar.mo3838a(mVar, e2);
                    m4585m();
                    e = m4579e(lVar);
                } else {
                    throw new IllegalStateException("no event up from " + aVar.f2998a);
                }
            }
            if (!z) {
                m4587p();
            }
            this.f2993e--;
        }
    }

    /* renamed from: b */
    public C1099i.C1102c mo3831b() {
        return this.f2991c;
    }

    /* renamed from: c */
    public void mo3832c(C1109l lVar) {
        m4580f("removeObserver");
        this.f2990b.mo14273n(lVar);
    }

    /* renamed from: h */
    public void mo3835h(C1099i.C1101b bVar) {
        m4580f("handleLifecycleEvent");
        m4584l(bVar.mo3833d());
    }

    @Deprecated
    /* renamed from: j */
    public void mo3836j(C1099i.C1102c cVar) {
        m4580f("markState");
        mo3837o(cVar);
    }

    /* renamed from: o */
    public void mo3837o(C1099i.C1102c cVar) {
        m4580f("setCurrentState");
        m4584l(cVar);
    }
}
