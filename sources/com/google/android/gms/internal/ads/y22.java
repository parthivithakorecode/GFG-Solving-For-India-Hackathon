package com.google.android.gms.internal.ads;

import p054h1.C2694t;
import p069j1.C3208t1;

public final class y22 implements vh1 {

    /* renamed from: f */
    private boolean f17570f = false;

    /* renamed from: g */
    private boolean f17571g = false;

    /* renamed from: h */
    private final String f17572h;

    /* renamed from: i */
    private final xw2 f17573i;

    /* renamed from: j */
    private final C3208t1 f17574j;

    public y22(String str, xw2 xw2) {
        this.f17572h = str;
        this.f17573i = xw2;
        this.f17574j = C2694t.m21607p().mo11025h();
    }

    /* renamed from: a */
    private final ww2 m19816a(String str) {
        String str2 = this.f17574j.mo14078J() ? "" : this.f17572h;
        ww2 b = ww2.m19233b(str);
        b.mo11742a("tms", Long.toString(C2694t.m21592a().mo12463b(), 10));
        b.mo11742a("tid", str2);
        return b;
    }

    /* renamed from: b */
    public final synchronized void mo10983b() {
        if (!this.f17570f) {
            this.f17573i.mo5981a(m19816a("init_started"));
            this.f17570f = true;
        }
    }

    /* renamed from: d0 */
    public final void mo10984d0(String str) {
        xw2 xw2 = this.f17573i;
        ww2 a = m19816a("adapter_init_finished");
        a.mo11742a("ancn", str);
        xw2.mo5981a(a);
    }

    /* renamed from: g */
    public final synchronized void mo10985g() {
        if (!this.f17571g) {
            this.f17573i.mo5981a(m19816a("init_finished"));
            this.f17571g = true;
        }
    }

    /* renamed from: s */
    public final void mo10986s(String str) {
        xw2 xw2 = this.f17573i;
        ww2 a = m19816a("adapter_init_started");
        a.mo11742a("ancn", str);
        xw2.mo5981a(a);
    }

    /* renamed from: z */
    public final void mo10987z(String str, String str2) {
        xw2 xw2 = this.f17573i;
        ww2 a = m19816a("adapter_init_finished");
        a.mo11742a("ancn", str);
        a.mo11742a("rqe", str2);
        xw2.mo5981a(a);
    }
}
