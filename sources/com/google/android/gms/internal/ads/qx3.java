package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

final class qx3 {

    /* renamed from: a */
    private final List<ox3> f13381a = new ArrayList();

    /* renamed from: b */
    private final IdentityHashMap<r54, ox3> f13382b = new IdentityHashMap<>();

    /* renamed from: c */
    private final Map<Object, ox3> f13383c = new HashMap();

    /* renamed from: d */
    private final px3 f13384d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final c64 f13385e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final v24 f13386f;

    /* renamed from: g */
    private final HashMap<ox3, nx3> f13387g;

    /* renamed from: h */
    private final Set<ox3> f13388h;

    /* renamed from: i */
    private boolean f13389i;

    /* renamed from: j */
    private vt1 f13390j;

    /* renamed from: k */
    private l74 f13391k = new l74(0);

    public qx3(px3 px3, q04 q04, Handler handler) {
        this.f13384d = px3;
        c64 c64 = new c64();
        this.f13385e = c64;
        v24 v24 = new v24();
        this.f13386f = v24;
        this.f13387g = new HashMap<>();
        this.f13388h = new HashSet();
        c64.mo6065b(handler, q04);
        v24.mo11372b(handler, q04);
    }

    /* renamed from: p */
    private final void m15951p(int i, int i2) {
        while (i < this.f13381a.size()) {
            this.f13381a.get(i).f12255d += i2;
            i++;
        }
    }

    /* renamed from: q */
    private final void m15952q(ox3 ox3) {
        nx3 nx3 = this.f13387g.get(ox3);
        if (nx3 != null) {
            nx3.f11736a.mo11392k(nx3.f11737b);
        }
    }

    /* renamed from: r */
    private final void m15953r() {
        Iterator<ox3> it = this.f13388h.iterator();
        while (it.hasNext()) {
            ox3 next = it.next();
            if (next.f12254c.isEmpty()) {
                m15952q(next);
                it.remove();
            }
        }
    }

    /* renamed from: s */
    private final void m15954s(ox3 ox3) {
        if (ox3.f12256e && ox3.f12254c.isEmpty()) {
            nx3 remove = this.f13387g.remove(ox3);
            Objects.requireNonNull(remove);
            remove.f11736a.mo11385a(remove.f11737b);
            remove.f11736a.mo11390f(remove.f11738c);
            remove.f11736a.mo11389e(remove.f11738c);
            this.f13388h.remove(ox3);
        }
    }

    /* renamed from: t */
    private final void m15955t(ox3 ox3) {
        o54 o54 = ox3.f12252a;
        kx3 kx3 = new kx3(this);
        mx3 mx3 = new mx3(this, ox3);
        this.f13387g.put(ox3, new nx3(o54, kx3, mx3));
        o54.mo11387c(new Handler(n13.m13622a(), (Handler.Callback) null), mx3);
        o54.mo11386b(new Handler(n13.m13622a(), (Handler.Callback) null), mx3);
        o54.mo11391i(kx3, this.f13390j);
    }

    /* renamed from: u */
    private final void m15956u(int i, int i2) {
        while (true) {
            i2--;
            if (i2 >= i) {
                ox3 remove = this.f13381a.remove(i2);
                this.f13383c.remove(remove.f12253b);
                m15951p(i2, -remove.f12252a.mo9687F().mo6956c());
                remove.f12256e = true;
                if (this.f13389i) {
                    m15954s(remove);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final int mo10428a() {
        return this.f13381a.size();
    }

    /* renamed from: b */
    public final ei0 mo10429b() {
        if (this.f13381a.isEmpty()) {
            return ei0.f6219a;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f13381a.size(); i2++) {
            ox3 ox3 = this.f13381a.get(i2);
            ox3.f12255d = i;
            i += ox3.f12252a.mo9687F().mo6956c();
        }
        return new vx3(this.f13381a, this.f13391k, (l74) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo10430e(v54 v54, ei0 ei0) {
        this.f13384d.mo5558f();
    }

    /* renamed from: f */
    public final void mo10431f(vt1 vt1) {
        wu1.m19207f(!this.f13389i);
        this.f13390j = vt1;
        for (int i = 0; i < this.f13381a.size(); i++) {
            ox3 ox3 = this.f13381a.get(i);
            m15955t(ox3);
            this.f13388h.add(ox3);
        }
        this.f13389i = true;
    }

    /* renamed from: g */
    public final void mo10432g() {
        for (nx3 next : this.f13387g.values()) {
            try {
                next.f11736a.mo11385a(next.f11737b);
            } catch (RuntimeException e) {
                oc2.m14399a("MediaSourceList", "Failed to release child source.", e);
            }
            next.f11736a.mo11390f(next.f11738c);
            next.f11736a.mo11389e(next.f11738c);
        }
        this.f13387g.clear();
        this.f13388h.clear();
        this.f13389i = false;
    }

    /* renamed from: h */
    public final void mo10433h(r54 r54) {
        ox3 remove = this.f13382b.remove(r54);
        Objects.requireNonNull(remove);
        remove.f12252a.mo8363j(r54);
        remove.f12254c.remove(((l54) r54).f9903f);
        if (!this.f13382b.isEmpty()) {
            m15953r();
        }
        m15954s(remove);
    }

    /* renamed from: i */
    public final boolean mo10434i() {
        return this.f13389i;
    }

    /* renamed from: j */
    public final ei0 mo10435j(int i, List<ox3> list, l74 l74) {
        int i2;
        if (!list.isEmpty()) {
            this.f13391k = l74;
            for (int i3 = i; i3 < list.size() + i; i3++) {
                ox3 ox3 = list.get(i3 - i);
                if (i3 > 0) {
                    ox3 ox32 = this.f13381a.get(i3 - 1);
                    i2 = ox32.f12255d + ox32.f12252a.mo9687F().mo6956c();
                } else {
                    i2 = 0;
                }
                ox3.mo9887b(i2);
                m15951p(i3, ox3.f12252a.mo9687F().mo6956c());
                this.f13381a.add(i3, ox3);
                this.f13383c.put(ox3.f12253b, ox3);
                if (this.f13389i) {
                    m15955t(ox3);
                    if (this.f13382b.isEmpty()) {
                        this.f13388h.add(ox3);
                    } else {
                        m15952q(ox3);
                    }
                }
            }
        }
        return mo10429b();
    }

    /* renamed from: k */
    public final ei0 mo10436k(int i, int i2, int i3, l74 l74) {
        wu1.m19205d(mo10428a() >= 0);
        this.f13391k = null;
        return mo10429b();
    }

    /* renamed from: l */
    public final ei0 mo10437l(int i, int i2, l74 l74) {
        boolean z = false;
        if (i >= 0 && i <= i2 && i2 <= mo10428a()) {
            z = true;
        }
        wu1.m19205d(z);
        this.f13391k = l74;
        m15956u(i, i2);
        return mo10429b();
    }

    /* renamed from: m */
    public final ei0 mo10438m(List<ox3> list, l74 l74) {
        m15956u(0, this.f13381a.size());
        return mo10435j(this.f13381a.size(), list, l74);
    }

    /* renamed from: n */
    public final ei0 mo10439n(l74 l74) {
        int a = mo10428a();
        if (l74.mo8898c() != a) {
            l74 = l74.mo8901f().mo8902g(0, a);
        }
        this.f13391k = l74;
        return mo10429b();
    }

    /* renamed from: o */
    public final r54 mo10440o(s54 s54, g94 g94, long j) {
        Object obj = s54.f7614a;
        Object obj2 = ((Pair) obj).first;
        s54 c = s54.mo10736c(((Pair) obj).second);
        ox3 ox3 = this.f13383c.get(obj2);
        Objects.requireNonNull(ox3);
        this.f13388h.add(ox3);
        nx3 nx3 = this.f13387g.get(ox3);
        if (nx3 != null) {
            nx3.f11736a.mo11388d(nx3.f11737b);
        }
        ox3.f12254c.add(c);
        l54 C = ox3.f12252a.mo8362h(c, g94, j);
        this.f13382b.put(C, ox3);
        m15953r();
        return C;
    }
}
