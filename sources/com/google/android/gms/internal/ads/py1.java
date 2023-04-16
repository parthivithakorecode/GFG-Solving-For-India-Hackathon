package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

public final class py1 {

    /* renamed from: a */
    private final cy1 f12955a;

    /* renamed from: b */
    private final ot1 f12956b;

    /* renamed from: c */
    private final Object f12957c = new Object();

    /* renamed from: d */
    private final List<oy1> f12958d;

    /* renamed from: e */
    private boolean f12959e;

    py1(cy1 cy1, ot1 ot1) {
        this.f12955a = cy1;
        this.f12956b = ot1;
        this.f12958d = new ArrayList();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m15327d(List<f90> list) {
        String qf0;
        synchronized (this.f12957c) {
            if (!this.f12959e) {
                for (f90 next : list) {
                    List<oy1> list2 = this.f12958d;
                    String str = next.f6758f;
                    nt1 a = this.f12956b.mo9864a(str);
                    if (a != null) {
                        qf0 qf02 = a.f11687b;
                        if (qf02 != null) {
                            qf0 = qf02.toString();
                            String str2 = qf0;
                            boolean z = next.f6759g;
                            list2.add(new oy1(str, str2, z ? 1 : 0, next.f6761i, next.f6760h));
                        }
                    }
                    qf0 = "";
                    String str22 = qf0;
                    boolean z2 = next.f6759g;
                    list2.add(new oy1(str, str22, z2 ? 1 : 0, next.f6761i, next.f6760h));
                }
                this.f12959e = true;
            }
        }
    }

    /* renamed from: a */
    public final JSONArray mo10200a() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.f12957c) {
            if (!this.f12959e) {
                if (this.f12955a.mo6337s()) {
                    m15327d(this.f12955a.mo6328f());
                } else {
                    mo10201c();
                    return jSONArray;
                }
            }
            for (oy1 a : this.f12958d) {
                jSONArray.put(a.mo9889a());
            }
            return jSONArray;
        }
    }

    /* renamed from: c */
    public final void mo10201c() {
        this.f12955a.mo6336r(new ny1(this));
    }
}
