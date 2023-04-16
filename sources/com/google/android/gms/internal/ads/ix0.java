package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

final class ix0 extends bk2 {

    /* renamed from: a */
    private final jl2 f8826a;

    /* renamed from: b */
    private final b01 f8827b;

    /* renamed from: c */
    private final ix0 f8828c = this;

    /* renamed from: d */
    private final yv3<Integer> f8829d;

    /* renamed from: e */
    private final yv3<yj2> f8830e;

    /* renamed from: f */
    private final yv3<String> f8831f;

    /* renamed from: g */
    private final yv3<hk2> f8832g;

    /* renamed from: h */
    private final yv3<nk2> f8833h;

    /* renamed from: i */
    private final yv3<rk2> f8834i;

    /* renamed from: j */
    private final yv3<zk2> f8835j;

    /* renamed from: k */
    private final yv3<gl2> f8836k;

    /* renamed from: l */
    private final yv3<yl2> f8837l;

    /* renamed from: m */
    private final yv3<Boolean> f8838m;

    /* renamed from: n */
    private final yv3<tl2> f8839n;

    /* renamed from: o */
    private final yv3<String> f8840o;

    /* renamed from: p */
    private final yv3<ev1> f8841p;

    /* renamed from: q */
    private final yv3<ev1> f8842q;

    /* renamed from: r */
    private final yv3<ev1> f8843r;

    /* renamed from: s */
    private final yv3<ev1> f8844s;

    /* renamed from: t */
    private final yv3<Map<gw2, ev1>> f8845t;

    /* renamed from: u */
    private final yv3<Set<hi1<ow2>>> f8846u;

    /* renamed from: v */
    private final yv3<Set<hi1<ow2>>> f8847v;

    /* renamed from: w */
    private final yv3 f8848w;

    /* renamed from: x */
    private final yv3<nw2> f8849x;

    /* synthetic */ ix0(b01 b01, jl2 jl2, hx0 hx0) {
        jl2 jl22 = jl2;
        this.f8827b = b01;
        this.f8826a = jl22;
        ll2 ll2 = new ll2(jl22);
        this.f8829d = ll2;
        this.f8830e = new ak2(d11.f5610a, b01.f4590i, b01.f4602o, gv2.m10016b(), ll2);
        kl2 kl2 = new kl2(jl22);
        this.f8831f = kl2;
        this.f8832g = new jk2(tw0.f15061a, b01.f4590i, kl2, gv2.m10016b());
        this.f8833h = new pk2(d11.f5610a, ll2, b01.f4590i, b01.f4577b0, b01.f4602o, gv2.m10016b(), kl2);
        this.f8834i = new tk2(x01.f16971a, gv2.m10016b(), b01.f4590i);
        this.f8835j = new bl2(z01.f17961a, gv2.m10016b(), kl2);
        this.f8836k = new il2(b11.f4631a, b01.f4602o, b01.f4590i);
        this.f8837l = new am2(gv2.m10016b());
        ml2 ml2 = new ml2(jl22);
        this.f8838m = ml2;
        kl2 kl22 = kl2;
        this.f8839n = new vl2(b01.f4577b0, ml2, f11.f6654a, gv2.m10016b(), kl22, b01.f4602o);
        nl2 nl2 = new nl2(jl22);
        this.f8840o = nl2;
        yv3<ev1> c = jv3.m11856c(xu1.m19668b());
        this.f8841p = c;
        yv3<ev1> c2 = jv3.m11856c(uu1.m18183b());
        this.f8842q = c2;
        yv3<ev1> c3 = jv3.m11856c(zu1.m20842b());
        this.f8843r = c3;
        yv3<ev1> c4 = jv3.m11856c(bv1.m7082b());
        this.f8844s = c4;
        nv3 c5 = ov3.m14651c(4);
        c5.mo9601b(gw2.GMS_SIGNALS, c);
        c5.mo9601b(gw2.BUILD_URL, c2);
        c5.mo9601b(gw2.HTTP, c3);
        c5.mo9601b(gw2.PRE_PROCESS, c4);
        ov3 c6 = c5.mo9602c();
        this.f8845t = c6;
        yv3<Set<hi1<ow2>>> c7 = jv3.m11856c(new cv1(nl2, b01.f4590i, gv2.m10016b(), c6));
        this.f8846u = c7;
        vv3 b = wv3.m19226b(0, 1);
        b.mo11540a(c7);
        wv3 c8 = b.mo11542c();
        this.f8847v = c8;
        qw2 qw2 = new qw2(c8);
        this.f8848w = qw2;
        this.f8849x = jv3.m11856c(new pw2(gv2.m10016b(), b01.f4602o, qw2));
    }

    /* renamed from: d */
    private final ek2 m11319d() {
        ln0 ln0 = new ln0();
        dc3 dc3 = wo0.f16886a;
        sv3.m16997b(dc3);
        String d = this.f8826a.mo8486d();
        sv3.m16997b(d);
        return new ek2(ln0, dc3, d, this.f8826a.mo8484b(), this.f8826a.mo8483a(), (byte[]) null);
    }

    /* renamed from: e */
    private final dl2 m11320e() {
        w00 w00 = new w00();
        dc3 dc3 = wo0.f16886a;
        sv3.m16997b(dc3);
        List<String> f = this.f8826a.mo8488f();
        sv3.m16997b(f);
        return new dl2(w00, dc3, f, (List<String>) null);
    }

    /* renamed from: a */
    public final lj2<JSONObject> mo5875a() {
        hn0 hn0 = new hn0();
        jn0 jn0 = new jn0();
        Object a = this.f8827b.f4625z0.mo5051a();
        ek2 d = m11319d();
        dl2 e = m11320e();
        ev3<yj2> b = jv3.m11855b(this.f8830e);
        ev3<hk2> b2 = jv3.m11855b(this.f8832g);
        ev3<nk2> b3 = jv3.m11855b(this.f8833h);
        ev3<rk2> b4 = jv3.m11855b(this.f8834i);
        ev3<zk2> b5 = jv3.m11855b(this.f8835j);
        ev3<gl2> b6 = jv3.m11855b(this.f8836k);
        ev3<yl2> b7 = jv3.m11855b(this.f8837l);
        ev3<tl2> b8 = jv3.m11855b(this.f8839n);
        dc3 dc3 = wo0.f16886a;
        sv3.m16997b(dc3);
        return ql2.m15697b(hn0, jn0, a, d, e, b, b2, b3, b4, b5, b6, b7, b8, dc3, (ScheduledExecutorService) this.f8827b.f4602o.mo5051a());
    }

    /* renamed from: b */
    public final lj2<JSONObject> mo5876b() {
        dc3 dc3 = wo0.f16886a;
        sv3.m16997b(dc3);
        hn0 hn0 = new hn0();
        sv3.m16997b(dc3);
        String c = this.f8826a.mo8485c();
        sv3.m16997b(c);
        qh2 qh2 = new qh2(new zk2(hn0, dc3, c, (byte[]) null), 0, (ScheduledExecutorService) this.f8827b.f4602o.mo5051a());
        Context a = this.f8827b.f4576b.mo7167a();
        sv3.m16997b(a);
        qh2 qh22 = new qh2(new gl2(new dh0(), (ScheduledExecutorService) this.f8827b.f4602o.mo5051a(), a, (byte[]) null), ((Long) C2199sw.m17001c().mo8579b(m10.f10276F2)).longValue(), (ScheduledExecutorService) this.f8827b.f4602o.mo5051a());
        ln0 ln0 = new ln0();
        Context a2 = this.f8827b.f4576b.mo7167a();
        sv3.m16997b(a2);
        sv3.m16997b(dc3);
        qh2 qh23 = new qh2(new yj2(ln0, a2, (ScheduledExecutorService) this.f8827b.f4602o.mo5051a(), dc3, this.f8826a.mo8483a(), (byte[]) null), 0, (ScheduledExecutorService) this.f8827b.f4602o.mo5051a());
        sv3.m16997b(dc3);
        qh2 qh24 = new qh2(new yl2(dc3), 0, (ScheduledExecutorService) this.f8827b.f4602o.mo5051a());
        pl2 pl2 = pl2.f12699a;
        Context a3 = this.f8827b.f4576b.mo7167a();
        sv3.m16997b(a3);
        String c2 = this.f8826a.mo8485c();
        sv3.m16997b(c2);
        sv3.m16997b(dc3);
        hk2 hk2 = new hk2((xi0) null, a3, c2, dc3);
        C2082pq pqVar = new C2082pq();
        sv3.m16997b(dc3);
        Context a4 = this.f8827b.f4576b.mo7167a();
        sv3.m16997b(a4);
        ln0 ln02 = new ln0();
        int a5 = this.f8826a.mo8483a();
        Context a6 = this.f8827b.f4576b.mo7167a();
        sv3.m16997b(a6);
        sv3.m16997b(dc3);
        String c3 = this.f8826a.mo8485c();
        sv3.m16997b(c3);
        qh2 qh25 = qh23;
        Object[] objArr = {new rk2(pqVar, dc3, a4, (byte[]) null), m11320e(), m11319d(), new nk2(ln02, a5, a6, (tn0) this.f8827b.f4577b0.mo5051a(), (ScheduledExecutorService) this.f8827b.f4602o.mo5051a(), dc3, c3, (byte[]) null), (ij2) this.f8827b.f4625z0.mo5051a()};
        return new lj2<>(dc3, p73.m14868t(qh2, qh22, qh25, qh24, pl2, hk2, objArr));
    }

    /* renamed from: c */
    public final nw2 mo5877c() {
        return this.f8849x.mo5051a();
    }
}
