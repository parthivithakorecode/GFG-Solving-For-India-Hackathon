package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Executor;
import p054h1.C2676b;

public final class dt1 {

    /* renamed from: a */
    private final ta1 f5914a;

    /* renamed from: b */
    private final ni1 f5915b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final dc1 f5916c;

    /* renamed from: d */
    private final rc1 f5917d;

    /* renamed from: e */
    private final dd1 f5918e;

    /* renamed from: f */
    private final xf1 f5919f;

    /* renamed from: g */
    private final Executor f5920g;

    /* renamed from: h */
    private final ji1 f5921h;

    /* renamed from: i */
    private final b31 f5922i;

    /* renamed from: j */
    private final C2676b f5923j;

    /* renamed from: k */
    private final ml0 f5924k;

    /* renamed from: l */
    private final C1734gb f5925l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final of1 f5926m;

    /* renamed from: n */
    private final o42 f5927n;

    /* renamed from: o */
    private final cy2 f5928o;

    /* renamed from: p */
    private final wv1 f5929p;

    /* renamed from: q */
    private final xw2 f5930q;

    public dt1(ta1 ta1, dc1 dc1, rc1 rc1, dd1 dd1, xf1 xf1, Executor executor, ji1 ji1, b31 b31, C2676b bVar, ml0 ml0, C1734gb gbVar, of1 of1, o42 o42, cy2 cy2, wv1 wv1, xw2 xw2, ni1 ni1) {
        this.f5914a = ta1;
        this.f5916c = dc1;
        this.f5917d = rc1;
        this.f5918e = dd1;
        this.f5919f = xf1;
        this.f5920g = executor;
        this.f5921h = ji1;
        this.f5922i = b31;
        this.f5923j = bVar;
        this.f5924k = ml0;
        this.f5925l = gbVar;
        this.f5926m = of1;
        this.f5927n = o42;
        this.f5928o = cy2;
        this.f5929p = wv1;
        this.f5930q = xw2;
        this.f5915b = ni1;
    }

    /* renamed from: j */
    public static final cc3<?> m8088j(eu0 eu0, String str, String str2) {
        bp0 bp0 = new bp0();
        eu0.mo7077D0().mo9048f1(new bt1(bp0));
        eu0.mo7098P(str, str2, (String) null);
        return bp0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo6644c() {
        this.f5914a.mo25L();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo6645d(String str, String str2) {
        this.f5919f.mo9005Q(str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo6646e() {
        this.f5916c.mo6441a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo6647f(View view) {
        this.f5923j.mo12666a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo6648g(eu0 eu0, eu0 eu02, Map map) {
        this.f5922i.mo5649d(eu0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ boolean mo6649h(View view, MotionEvent motionEvent) {
        this.f5923j.mo12666a();
        return false;
    }

    /* renamed from: i */
    public final void mo6650i(eu0 eu0, boolean z, w70 w70) {
        C1585cb c;
        eu0 eu02 = eu0;
        tv0 D0 = eu0.mo7077D0();
        xs1 xs1 = r4;
        xs1 xs12 = new xs1(this);
        rc1 rc1 = this.f5917d;
        dd1 dd1 = this.f5918e;
        ys1 ys1 = r7;
        ys1 ys12 = new ys1(this);
        at1 at1 = r10;
        at1 at12 = new at1(this);
        C2676b bVar = this.f5923j;
        ct1 ct1 = r12;
        ct1 ct12 = new ct1(this);
        D0.mo9053k0(xs1, rc1, dd1, ys1, at1, z, w70, bVar, ct1, this.f5924k, this.f5927n, this.f5928o, this.f5929p, this.f5930q, (u70) null, this.f5915b);
        eu0 eu03 = eu0;
        eu03.setOnTouchListener(new vs1(this));
        eu03.setOnClickListener(new ts1(this));
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10363Q1)).booleanValue() && (c = this.f5925l.mo7560c()) != null) {
            c.mo6111b((View) eu03);
        }
        this.f5921h.mo8945B0(eu03, this.f5920g);
        this.f5921h.mo8945B0(new ws1(eu03), this.f5920g);
        this.f5921h.mo8466S0((View) eu03);
        eu03.mo7080F0("/trackActiveViewUnit", new zs1(this, eu03));
        this.f5922i.mo5650e(eu03);
    }
}
