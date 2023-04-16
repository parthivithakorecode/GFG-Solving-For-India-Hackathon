package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;
import p054h1.C2694t;
import p069j1.C3163g2;

public final class p21 implements va1, lc1, qb1, C2420yu, mb1 {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Context f12444f;

    /* renamed from: g */
    private final Executor f12445g;

    /* renamed from: h */
    private final Executor f12446h;

    /* renamed from: i */
    private final ScheduledExecutorService f12447i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final ds2 f12448j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final rr2 f12449k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final zx2 f12450l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final ts2 f12451m;

    /* renamed from: n */
    private final C1734gb f12452n;

    /* renamed from: o */
    private final m20 f12453o;

    /* renamed from: p */
    private final WeakReference<View> f12454p;
    @GuardedBy("this")

    /* renamed from: q */
    private boolean f12455q;

    /* renamed from: r */
    private final AtomicBoolean f12456r = new AtomicBoolean();

    /* renamed from: s */
    private final o20 f12457s;

    public p21(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, ds2 ds2, rr2 rr2, zx2 zx2, ts2 ts2, View view, C1734gb gbVar, m20 m20, o20 o20, byte[] bArr) {
        this.f12444f = context;
        this.f12445g = executor;
        this.f12446h = executor2;
        this.f12447i = scheduledExecutorService;
        this.f12448j = ds2;
        this.f12449k = rr2;
        this.f12450l = zx2;
        this.f12451m = ts2;
        this.f12452n = gbVar;
        this.f12454p = new WeakReference<>(view);
        this.f12453o = m20;
        this.f12457s = o20;
    }

    /* renamed from: B */
    private final void m14772B(int i, int i2) {
        View view;
        if (i <= 0 || !((view = (View) this.f12454p.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            m14779z();
        } else {
            this.f12447i.schedule(new m21(this, i, i2), (long) i2, TimeUnit.MILLISECONDS);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public final void m14779z() {
        String c = ((Boolean) C2199sw.m17001c().mo8579b(m10.f10507h2)).booleanValue() ? this.f12452n.mo7560c().mo6112c(this.f12444f, (View) this.f12454p.get(), (Activity) null) : null;
        if ((!((Boolean) C2199sw.m17001c().mo8579b(m10.f10514i0)).booleanValue() || !this.f12448j.f5904b.f5509b.f15734g) && a30.f3918h.mo9928e().booleanValue()) {
            rb3.m16140r((ib3) rb3.m16137o(ib3.m10985E(rb3.m16131i(null)), ((Long) C2199sw.m17001c().mo8579b(m10.f10306J0)).longValue(), TimeUnit.MILLISECONDS, this.f12447i), new o21(this, c), this.f12445g);
            return;
        }
        ts2 ts2 = this.f12451m;
        zx2 zx2 = this.f12450l;
        ds2 ds2 = this.f12448j;
        rr2 rr2 = this.f12449k;
        ts2.mo11108a(zx2.mo12281b(ds2, rr2, false, c, (String) null, rr2.f13890d));
    }

    /* renamed from: B0 */
    public final void mo8177B0(C1605cv cvVar) {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10488f1)).booleanValue()) {
            this.f12451m.mo11108a(this.f12450l.mo12280a(this.f12448j, this.f12449k, zx2.m20877d(2, cvVar.f5529f, this.f12449k.f13910p)));
        }
    }

    /* renamed from: L */
    public final void mo25L() {
        if ((!((Boolean) C2199sw.m17001c().mo8579b(m10.f10514i0)).booleanValue() || !this.f12448j.f5904b.f5509b.f15734g) && a30.f3914d.mo9928e().booleanValue()) {
            rb3.m16140r(rb3.m16128f(ib3.m10985E(this.f12453o.mo9106a()), Throwable.class, i21.f8498a, wo0.f16891f), new n21(this), this.f12445g);
            return;
        }
        ts2 ts2 = this.f12451m;
        zx2 zx2 = this.f12450l;
        ds2 ds2 = this.f12448j;
        rr2 rr2 = this.f12449k;
        List<String> a = zx2.mo12280a(ds2, rr2, rr2.f13888c);
        C2694t.m21608q();
        int i = 1;
        if (true == C3163g2.m23934j(this.f12444f)) {
            i = 2;
        }
        ts2.mo11110c(a, i);
    }

    /* renamed from: e */
    public final void mo5297e() {
        ts2 ts2 = this.f12451m;
        zx2 zx2 = this.f12450l;
        ds2 ds2 = this.f12448j;
        rr2 rr2 = this.f12449k;
        ts2.mo11108a(zx2.mo12280a(ds2, rr2, rr2.f13902j));
    }

    /* renamed from: h */
    public final void mo5298h(mj0 mj0, String str, String str2) {
        ts2 ts2 = this.f12451m;
        zx2 zx2 = this.f12450l;
        rr2 rr2 = this.f12449k;
        ts2.mo11108a(zx2.mo12282c(rr2, rr2.f13900i, mj0));
    }

    /* renamed from: i */
    public final void mo5299i() {
    }

    /* renamed from: k */
    public final void mo5153k() {
        if (this.f12456r.compareAndSet(false, true)) {
            int intValue = ((Integer) C2199sw.m17001c().mo8579b(m10.f10534k2)).intValue();
            if (intValue > 0) {
                m14772B(intValue, ((Integer) C2199sw.m17001c().mo8579b(m10.f10543l2)).intValue());
                return;
            }
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10525j2)).booleanValue()) {
                this.f12446h.execute(new j21(this));
            } else {
                m14779z();
            }
        }
    }

    /* renamed from: m */
    public final synchronized void mo8445m() {
        ts2 ts2;
        List<String> a;
        if (this.f12455q) {
            ArrayList arrayList = new ArrayList(this.f12449k.f13890d);
            arrayList.addAll(this.f12449k.f13896g);
            ts2 = this.f12451m;
            a = this.f12450l.mo12281b(this.f12448j, this.f12449k, true, (String) null, (String) null, arrayList);
        } else {
            ts2 ts22 = this.f12451m;
            zx2 zx2 = this.f12450l;
            ds2 ds2 = this.f12448j;
            rr2 rr2 = this.f12449k;
            ts22.mo11108a(zx2.mo12280a(ds2, rr2, rr2.f13908n));
            ts2 = this.f12451m;
            zx2 zx22 = this.f12450l;
            ds2 ds22 = this.f12448j;
            rr2 rr22 = this.f12449k;
            a = zx22.mo12280a(ds22, rr22, rr22.f13896g);
        }
        ts2.mo11108a(a);
        this.f12455q = true;
    }

    /* renamed from: n */
    public final void mo5300n() {
    }

    /* renamed from: o */
    public final void mo5301o() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final /* synthetic */ void mo9929r() {
        this.f12445g.execute(new k21(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final /* synthetic */ void mo9930s(int i, int i2) {
        m14772B(i - 1, i2);
    }

    /* renamed from: t */
    public final void mo5302t() {
        ts2 ts2 = this.f12451m;
        zx2 zx2 = this.f12450l;
        ds2 ds2 = this.f12448j;
        rr2 rr2 = this.f12449k;
        ts2.mo11108a(zx2.mo12280a(ds2, rr2, rr2.f13898h));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final /* synthetic */ void mo9931y(int i, int i2) {
        this.f12445g.execute(new l21(this, i, i2));
    }
}
