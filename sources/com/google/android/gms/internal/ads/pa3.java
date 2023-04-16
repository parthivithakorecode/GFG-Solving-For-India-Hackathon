package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

abstract class pa3<InputT, OutputT> extends va3<OutputT> {

    /* renamed from: t */
    private static final Logger f12579t = Logger.getLogger(pa3.class.getName());
    @CheckForNull

    /* renamed from: q */
    private z63<? extends cc3<? extends InputT>> f12580q;

    /* renamed from: r */
    private final boolean f12581r;

    /* renamed from: s */
    private final boolean f12582s;

    pa3(z63<? extends cc3<? extends InputT>> z63, boolean z, boolean z2) {
        super(z63.size());
        this.f12580q = z63;
        this.f12581r = z;
        this.f12582s = z2;
    }

    /* renamed from: N */
    private final void m14912N(int i, Future<? extends InputT> future) {
        try {
            mo5764S(i, rb3.m16138p(future));
        } catch (ExecutionException e) {
            m14914P(e.getCause());
        } catch (Throwable th) {
            m14914P(th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public final void mo10006W(@CheckForNull z63<? extends Future<? extends InputT>> z63) {
        int F = mo11439F();
        int i = 0;
        q43.m15464g(F >= 0, "Less than 0 remaining futures");
        if (F == 0) {
            if (z63 != null) {
                h93<? extends Future<? extends InputT>> l = z63.iterator();
                while (l.hasNext()) {
                    Future future = (Future) l.next();
                    if (!future.isCancelled()) {
                        m14912N(i, future);
                    }
                    i++;
                }
            }
            mo11441K();
            mo5765T();
            mo5763M(2);
        }
    }

    /* renamed from: P */
    private final void m14914P(Throwable th) {
        Objects.requireNonNull(th);
        if (this.f12581r && !mo7555x(th) && m14916R(mo11440H(), th)) {
            m14915Q(th);
        } else if (th instanceof Error) {
            m14915Q(th);
        }
    }

    /* renamed from: Q */
    private static void m14915Q(Throwable th) {
        f12579t.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    /* renamed from: R */
    private static boolean m14916R(Set<Throwable> set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final void mo10003L(Set<Throwable> set) {
        Objects.requireNonNull(set);
        if (!isCancelled()) {
            Throwable a = mo7544a();
            a.getClass();
            m14916R(set, a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo5763M(int i) {
        this.f12580q = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public abstract void mo5764S(int i, InputT inputt);

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public abstract void mo5765T();

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public final void mo10004U() {
        z63<? extends cc3<? extends InputT>> z63 = this.f12580q;
        z63.getClass();
        if (z63.isEmpty()) {
            mo5765T();
        } else if (this.f12581r) {
            h93<? extends cc3<? extends InputT>> l = this.f12580q.iterator();
            int i = 0;
            while (l.hasNext()) {
                cc3 cc3 = (cc3) l.next();
                cc3.mo5905b(new oa3(this, cc3, i), fb3.INSTANCE);
                i++;
            }
        } else {
            na3 na3 = new na3(this, this.f12582s ? this.f12580q : null);
            h93<? extends cc3<? extends InputT>> l2 = this.f12580q.iterator();
            while (l2.hasNext()) {
                ((cc3) l2.next()).mo5905b(na3, fb3.INSTANCE);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public final /* synthetic */ void mo10005V(cc3 cc3, int i) {
        try {
            if (cc3.isCancelled()) {
                this.f12580q = null;
                cancel(false);
            } else {
                m14912N(i, cc3);
            }
        } finally {
            mo10006W((z63) null);
        }
    }

    /* access modifiers changed from: protected */
    @CheckForNull
    /* renamed from: i */
    public final String mo7548i() {
        z63<? extends cc3<? extends InputT>> z63 = this.f12580q;
        return z63 != null ? "futures=".concat(z63.toString()) : super.mo7548i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo7551j() {
        z63<? extends cc3<? extends InputT>> z63 = this.f12580q;
        boolean z = true;
        mo5763M(1);
        boolean isCancelled = isCancelled();
        if (z63 == null) {
            z = false;
        }
        if (z && isCancelled) {
            boolean z2 = mo7557z();
            h93<? extends cc3<? extends InputT>> l = z63.iterator();
            while (l.hasNext()) {
                ((Future) l.next()).cancel(z2);
            }
        }
    }
}
