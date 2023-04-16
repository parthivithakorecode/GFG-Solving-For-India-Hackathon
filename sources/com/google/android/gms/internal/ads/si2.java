package com.google.android.gms.internal.ads;

import android.content.Context;

public final class si2 implements ij2<ti2> {

    /* renamed from: a */
    private final pm0 f14461a;

    /* renamed from: b */
    private final dc3 f14462b;

    /* renamed from: c */
    private final Context f14463c;

    public si2(pm0 pm0, dc3 dc3, Context context) {
        this.f14461a = pm0;
        this.f14462b = dc3;
        this.f14463c = context;
    }

    /* renamed from: a */
    public final cc3<ti2> mo5813a() {
        return this.f14462b.mo6445C(new ri2(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ ti2 mo10798b() {
        if (!this.f14461a.mo10109z(this.f14463c)) {
            return new ti2((String) null, (String) null, (String) null, (String) null, (Long) null);
        }
        String j = this.f14461a.mo10093j(this.f14463c);
        String str = j == null ? "" : j;
        String h = this.f14461a.mo10091h(this.f14463c);
        String str2 = h == null ? "" : h;
        String f = this.f14461a.mo10089f(this.f14463c);
        String str3 = f == null ? "" : f;
        String g = this.f14461a.mo10090g(this.f14463c);
        return new ti2(str, str2, str3, g == null ? "" : g, "TIME_OUT".equals(str2) ? (Long) C2199sw.m17001c().mo8579b(m10.f10442a0) : null);
    }
}
