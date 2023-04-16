package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;
import p054h1.C2694t;
import p069j1.C3199q1;
import p111p1.C3898f0;
import p111p1.C3908l;
import p111p1.C3912p;

public abstract class bw0 implements i11 {
    @GuardedBy("AppComponent.class")

    /* renamed from: a */
    private static bw0 f5065a;

    @Deprecated
    /* renamed from: f */
    public static synchronized bw0 m7088f(po0 po0, Context context, c01 c01) {
        bw0 bw0;
        synchronized (bw0.class) {
            if (f5065a == null) {
                ly0 ly0 = new ly0((ky0) null);
                cw0 cw0 = new cw0();
                cw0.mo6311d(po0);
                cw0.mo6310c(context);
                ly0.mo9091b(new ew0(cw0, (dw0) null));
                ly0.mo9092c(new d01(c01));
                f5065a = ly0.mo9090a();
                m10.m13007c(context);
                C2694t.m21607p().mo11032q(context, po0);
                C2694t.m21595d().mo8237i(context);
                C2694t.m21608q().mo14032Z(context);
                C2694t.m21608q().mo14031Y(context);
                C2694t.m21608q().mo14027T(context);
                C3199q1.m24013a(context);
                C2694t.m21594c().mo11041d(context);
                C2694t.m21614w().mo14054b(context);
                qm0.m15707d(context);
                if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10270E4)).booleanValue()) {
                    if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10577p0)).booleanValue()) {
                        C1527ar arVar = new C1527ar(new C1713fr(context));
                        n32 n32 = new n32(new j32(context), f5065a.mo5598c());
                        C2694t.m21608q();
                        new f42(context, po0, arVar, n32, UUID.randomUUID().toString(), f5065a.mo5596D()).mo7230b(C2694t.m21607p().mo11025h().mo14078J());
                    }
                }
            }
            bw0 = f5065a;
        }
        return bw0;
    }

    @Deprecated
    /* renamed from: g */
    public static bw0 m7089g(Context context, int i) {
        synchronized (bw0.class) {
            bw0 bw0 = f5065a;
            return bw0 != null ? bw0 : m7088f(new po0(214106000, i, true, false), context, new cx0());
        }
    }

    /* renamed from: h */
    public static bw0 m7090h(Context context, dd0 dd0, int i) {
        bw0 g = m7089g(context, i);
        g.mo5609q().mo10665c(dd0);
        return g;
    }

    /* renamed from: A */
    public abstract up2 mo5593A();

    /* renamed from: B */
    public abstract kr2 mo5594B();

    /* renamed from: C */
    public abstract bt2<rr1> mo5595C();

    /* renamed from: D */
    public abstract xw2 mo5596D();

    /* renamed from: a */
    public final bk2 mo5980a(vi0 vi0, int i) {
        return mo5616x(new jl2(vi0, i));
    }

    /* renamed from: b */
    public abstract qx2 mo5597b();

    /* renamed from: c */
    public abstract dc3 mo5598c();

    /* renamed from: d */
    public abstract Executor mo5599d();

    /* renamed from: e */
    public abstract ScheduledExecutorService mo5600e();

    /* renamed from: i */
    public abstract n01 mo5601i();

    /* renamed from: j */
    public abstract u31 mo5602j();

    /* renamed from: k */
    public abstract g41 mo5603k();

    /* renamed from: l */
    public abstract q51 mo5604l();

    /* renamed from: m */
    public abstract nd1 mo5605m();

    /* renamed from: n */
    public abstract fk1 mo5606n();

    /* renamed from: o */
    public abstract cl1 mo5607o();

    /* renamed from: p */
    public abstract ls1 mo5608p();

    /* renamed from: q */
    public abstract rt1 mo5609q();

    /* renamed from: r */
    public abstract hx1 mo5610r();

    /* renamed from: s */
    public abstract uy1 mo5611s();

    /* renamed from: t */
    public abstract w42 mo5612t();

    /* renamed from: u */
    public abstract C3908l mo5613u();

    /* renamed from: v */
    public abstract C3912p mo5614v();

    /* renamed from: w */
    public abstract C3898f0 mo5615w();

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public abstract bk2 mo5616x(jl2 jl2);

    /* renamed from: y */
    public abstract jm2 mo5617y();

    /* renamed from: z */
    public abstract yn2 mo5618z();
}
