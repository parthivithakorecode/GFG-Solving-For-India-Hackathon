package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p054h1.C2694t;

public final class z71<T> {

    /* renamed from: a */
    private final p02 f18073a;

    /* renamed from: b */
    private final ks2 f18074b;

    /* renamed from: c */
    private final nw2 f18075c;

    /* renamed from: d */
    private final j11 f18076d;

    /* renamed from: e */
    private final w82<T> f18077e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final fg1 f18078f;

    /* renamed from: g */
    private ds2 f18079g;

    /* renamed from: h */
    private final u12 f18080h;

    /* renamed from: i */
    private final aa1 f18081i;

    /* renamed from: j */
    private final Executor f18082j;

    /* renamed from: k */
    private final h12 f18083k;

    /* renamed from: l */
    private final f52 f18084l;

    z71(p02 p02, ks2 ks2, nw2 nw2, j11 j11, w82<T> w82, fg1 fg1, ds2 ds2, u12 u12, aa1 aa1, Executor executor, h12 h12, f52 f52) {
        this.f18073a = p02;
        this.f18074b = ks2;
        this.f18075c = nw2;
        this.f18076d = j11;
        this.f18077e = w82;
        this.f18078f = fg1;
        this.f18079g = ds2;
        this.f18080h = u12;
        this.f18081i = aa1;
        this.f18082j = executor;
        this.f18083k = h12;
        this.f18084l = f52;
    }

    /* renamed from: a */
    public final C1605cv mo12172a(Throwable th) {
        return dt2.m8097b(th, this.f18084l);
    }

    /* renamed from: c */
    public final fg1 mo12173c() {
        return this.f18078f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ ds2 mo12174d(ds2 ds2) {
        this.f18076d.mo8329a(ds2);
        return ds2;
    }

    /* renamed from: e */
    public final cc3<vi0> mo12175e(au2 au2) {
        rv2 a = this.f18075c.mo7176b(gw2.GET_CACHE_KEY, this.f18081i.mo5197c()).mo6686f(new v71(this, au2)).mo6681a();
        rb3.m16140r(a, new x71(this), this.f18082j);
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ cc3 mo12176f(au2 au2, vi0 vi0) {
        vi0.f16318n = au2;
        return this.f18080h.mo11138a(vi0);
    }

    /* renamed from: g */
    public final cc3<Void> mo12177g(vi0 vi0) {
        rv2 a = this.f18075c.mo7176b(gw2.NOTIFY_CACHE_HIT, this.f18080h.mo11143f(vi0)).mo6681a();
        rb3.m16140r(a, new y71(this), this.f18082j);
        return a;
    }

    /* renamed from: h */
    public final cc3<T> mo12178h(cc3<ds2> cc3) {
        dw2<O2> f = this.f18075c.mo7176b(gw2.RENDERER, cc3).mo6685e(new u71(this)).mo6686f(this.f18077e);
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10405V3)).booleanValue()) {
            f = f.mo6689i((long) ((Integer) C2199sw.m17001c().mo8579b(m10.f10413W3)).intValue(), TimeUnit.SECONDS);
        }
        return f.mo6681a();
    }

    /* renamed from: i */
    public final cc3<ds2> mo12179i() {
        C1902kv kvVar = this.f18074b.f9639d;
        if (kvVar.f9666C == null && kvVar.f9685x == null) {
            return mo12180j(this.f18081i.mo5197c());
        }
        nw2 nw2 = this.f18075c;
        return wv2.m19224c(this.f18073a.mo9910c(), gw2.SERVER_TRANSACTION, nw2).mo6681a();
    }

    /* renamed from: j */
    public final cc3<ds2> mo12180j(cc3<vi0> cc3) {
        dw2<O2> f;
        ds2 ds2 = this.f18079g;
        if (ds2 != null) {
            nw2 nw2 = this.f18075c;
            f = wv2.m19224c(rb3.m16131i(ds2), gw2.SERVER_TRANSACTION, nw2);
        } else {
            C2694t.m21595d().mo8238j();
            f = this.f18075c.mo7176b(gw2.SERVER_TRANSACTION, cc3).mo6686f(new w71(this.f18083k));
        }
        return f.mo6681a();
    }

    /* renamed from: k */
    public final void mo12181k(ds2 ds2) {
        this.f18079g = ds2;
    }
}
