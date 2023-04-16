package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

final class p04 {

    /* renamed from: a */
    private final pf0 f12405a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public e73<s54> f12406b = e73.m8347v();

    /* renamed from: c */
    private i73<s54, ei0> f12407c = i73.m10947d();

    /* renamed from: d */
    private s54 f12408d;

    /* renamed from: e */
    private s54 f12409e;

    /* renamed from: f */
    private s54 f12410f;

    public p04(pf0 pf0) {
        this.f12405a = pf0;
    }

    /* renamed from: j */
    private static s54 m14742j(ub0 ub0, e73<s54> e73, s54 s54, pf0 pf0) {
        ei0 o = ub0.mo7764o();
        int f = ub0.mo7757f();
        Object f2 = o.mo6970o() ? null : o.mo6960f(f);
        int b = (ub0.mo7762l() || o.mo6970o()) ? -1 : o.mo6957d(f, pf0, false).mo10043b(nz3.m14195c(ub0.mo7760j()));
        for (int i = 0; i < e73.size(); i++) {
            s54 s542 = e73.get(i);
            if (m14745m(s542, f2, ub0.mo7762l(), ub0.mo7751b(), ub0.mo7754d(), b)) {
                return s542;
            }
        }
        if (e73.isEmpty() && s54 != null) {
            if (m14745m(s54, f2, ub0.mo7762l(), ub0.mo7751b(), ub0.mo7754d(), b)) {
                return s54;
            }
        }
        return null;
    }

    /* renamed from: k */
    private final void m14743k(h73<s54, ei0> h73, s54 s54, ei0 ei0) {
        if (s54 != null) {
            if (ei0.mo6954a(s54.f7614a) != -1) {
                h73.mo7859a(s54, ei0);
                return;
            }
            ei0 ei02 = this.f12407c.get(s54);
            if (ei02 != null) {
                h73.mo7859a(s54, ei02);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0055, code lost:
        if (r3.f12406b.contains(r3.f12408d) == false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
        if (com.google.android.gms.internal.ads.m43.m13055a(r3.f12408d, r3.f12410f) == false) goto L_0x0057;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m14744l(com.google.android.gms.internal.ads.ei0 r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.h73 r0 = new com.google.android.gms.internal.ads.h73
            r0.<init>()
            com.google.android.gms.internal.ads.e73<com.google.android.gms.internal.ads.s54> r1 = r3.f12406b
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0036
            com.google.android.gms.internal.ads.s54 r1 = r3.f12409e
            r3.m14743k(r0, r1, r4)
            com.google.android.gms.internal.ads.s54 r1 = r3.f12410f
            com.google.android.gms.internal.ads.s54 r2 = r3.f12409e
            boolean r1 = com.google.android.gms.internal.ads.m43.m13055a(r1, r2)
            if (r1 != 0) goto L_0x0021
            com.google.android.gms.internal.ads.s54 r1 = r3.f12410f
            r3.m14743k(r0, r1, r4)
        L_0x0021:
            com.google.android.gms.internal.ads.s54 r1 = r3.f12408d
            com.google.android.gms.internal.ads.s54 r2 = r3.f12409e
            boolean r1 = com.google.android.gms.internal.ads.m43.m13055a(r1, r2)
            if (r1 != 0) goto L_0x005c
            com.google.android.gms.internal.ads.s54 r1 = r3.f12408d
            com.google.android.gms.internal.ads.s54 r2 = r3.f12410f
            boolean r1 = com.google.android.gms.internal.ads.m43.m13055a(r1, r2)
            if (r1 != 0) goto L_0x005c
            goto L_0x0057
        L_0x0036:
            r1 = 0
        L_0x0037:
            com.google.android.gms.internal.ads.e73<com.google.android.gms.internal.ads.s54> r2 = r3.f12406b
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x004d
            com.google.android.gms.internal.ads.e73<com.google.android.gms.internal.ads.s54> r2 = r3.f12406b
            java.lang.Object r2 = r2.get(r1)
            com.google.android.gms.internal.ads.s54 r2 = (com.google.android.gms.internal.ads.s54) r2
            r3.m14743k(r0, r2, r4)
            int r1 = r1 + 1
            goto L_0x0037
        L_0x004d:
            com.google.android.gms.internal.ads.e73<com.google.android.gms.internal.ads.s54> r1 = r3.f12406b
            com.google.android.gms.internal.ads.s54 r2 = r3.f12408d
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L_0x005c
        L_0x0057:
            com.google.android.gms.internal.ads.s54 r1 = r3.f12408d
            r3.m14743k(r0, r1, r4)
        L_0x005c:
            com.google.android.gms.internal.ads.i73 r4 = r0.mo7861c()
            r3.f12407c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p04.m14744l(com.google.android.gms.internal.ads.ei0):void");
    }

    /* renamed from: m */
    private static boolean m14745m(s54 s54, Object obj, boolean z, int i, int i2, int i3) {
        if (!s54.f7614a.equals(obj)) {
            return false;
        }
        if (z) {
            if (!(s54.f7615b == i && s54.f7616c == i2)) {
                return false;
            }
        } else if (!(s54.f7615b == -1 && s54.f7618e == i3)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final ei0 mo9913a(s54 s54) {
        return this.f12407c.get(s54);
    }

    /* renamed from: b */
    public final s54 mo9914b() {
        return this.f12408d;
    }

    /* renamed from: c */
    public final s54 mo9915c() {
        T t;
        T next;
        if (this.f12406b.isEmpty()) {
            return null;
        }
        e73<s54> e73 = this.f12406b;
        if (!(e73 instanceof List)) {
            Iterator<T> it = e73.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            t = next;
        } else if (!e73.isEmpty()) {
            t = e73.get(e73.size() - 1);
        } else {
            throw new NoSuchElementException();
        }
        return (s54) t;
    }

    /* renamed from: d */
    public final s54 mo9916d() {
        return this.f12409e;
    }

    /* renamed from: e */
    public final s54 mo9917e() {
        return this.f12410f;
    }

    /* renamed from: g */
    public final void mo9918g(ub0 ub0) {
        this.f12408d = m14742j(ub0, this.f12406b, this.f12409e, this.f12405a);
    }

    /* renamed from: h */
    public final void mo9919h(List<s54> list, s54 s54, ub0 ub0) {
        this.f12406b = e73.m8345t(list);
        if (!list.isEmpty()) {
            this.f12409e = list.get(0);
            Objects.requireNonNull(s54);
            this.f12410f = s54;
        }
        if (this.f12408d == null) {
            this.f12408d = m14742j(ub0, this.f12406b, this.f12409e, this.f12405a);
        }
        m14744l(ub0.mo7764o());
    }

    /* renamed from: i */
    public final void mo9920i(ub0 ub0) {
        this.f12408d = m14742j(ub0, this.f12406b, this.f12409e, this.f12405a);
        m14744l(ub0.mo7764o());
    }
}
