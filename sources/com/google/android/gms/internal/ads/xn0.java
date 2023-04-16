package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p034e2.C2547d;
import p054h1.C2694t;
import p069j1.C3208t1;

public final class xn0 implements C2191so {

    /* renamed from: a */
    private final Object f17258a = new Object();

    /* renamed from: b */
    private final C3208t1 f17259b;

    /* renamed from: c */
    private final vn0 f17260c;

    /* renamed from: d */
    final un0 f17261d;

    /* renamed from: e */
    final HashSet<nn0> f17262e = new HashSet<>();

    /* renamed from: f */
    final HashSet<wn0> f17263f = new HashSet<>();

    /* renamed from: g */
    private boolean f17264g = false;

    public xn0(String str, C3208t1 t1Var) {
        this.f17261d = new un0(str, t1Var);
        this.f17259b = t1Var;
        this.f17260c = new vn0();
    }

    /* renamed from: a */
    public final nn0 mo11865a(C2547d dVar, String str) {
        return new nn0(dVar, this, this.f17260c.mo11500a(), str);
    }

    /* renamed from: b */
    public final void mo11866b(nn0 nn0) {
        synchronized (this.f17258a) {
            this.f17262e.add(nn0);
        }
    }

    /* renamed from: c */
    public final void mo7380c(boolean z) {
        un0 un0;
        int i;
        long a = C2694t.m21592a().mo12462a();
        if (z) {
            if (a - this.f17259b.mo14082c() > ((Long) C2199sw.m17001c().mo8579b(m10.f10290H0)).longValue()) {
                un0 = this.f17261d;
                i = -1;
            } else {
                un0 = this.f17261d;
                i = this.f17259b.mo14080a();
            }
            un0.f15646d = i;
            this.f17264g = true;
            return;
        }
        this.f17259b.mo14100u(a);
        this.f17259b.mo14079K(this.f17261d.f15646d);
    }

    /* renamed from: d */
    public final void mo11867d() {
        synchronized (this.f17258a) {
            this.f17261d.mo11255b();
        }
    }

    /* renamed from: e */
    public final void mo11868e() {
        synchronized (this.f17258a) {
            this.f17261d.mo11256c();
        }
    }

    /* renamed from: f */
    public final void mo11869f() {
        synchronized (this.f17258a) {
            this.f17261d.mo11257d();
        }
    }

    /* renamed from: g */
    public final void mo11870g() {
        synchronized (this.f17258a) {
            this.f17261d.mo11258e();
        }
    }

    /* renamed from: h */
    public final void mo11871h(C1902kv kvVar, long j) {
        synchronized (this.f17258a) {
            this.f17261d.mo11259f(kvVar, j);
        }
    }

    /* renamed from: i */
    public final void mo11872i(HashSet<nn0> hashSet) {
        synchronized (this.f17258a) {
            this.f17262e.addAll(hashSet);
        }
    }

    /* renamed from: j */
    public final boolean mo11873j() {
        return this.f17264g;
    }

    /* renamed from: k */
    public final Bundle mo11874k(Context context, jt2 jt2) {
        HashSet hashSet = new HashSet();
        synchronized (this.f17258a) {
            hashSet.addAll(this.f17262e);
            this.f17262e.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.f17261d.mo11254a(context, this.f17260c.mo11501b()));
        Bundle bundle2 = new Bundle();
        Iterator<wn0> it = this.f17263f.iterator();
        if (!it.hasNext()) {
            bundle.putBundle("slots", bundle2);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                arrayList.add(((nn0) it2.next()).mo9554a());
            }
            bundle.putParcelableArrayList("ads", arrayList);
            jt2.mo8541b(hashSet);
            return bundle;
        }
        wn0 next = it.next();
        throw null;
    }
}
