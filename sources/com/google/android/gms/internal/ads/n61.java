package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

public final class n61 implements lc1, C2450zn {

    /* renamed from: f */
    private final rr2 f11317f;

    /* renamed from: g */
    private final ob1 f11318g;

    /* renamed from: h */
    private final uc1 f11319h;

    /* renamed from: i */
    private final AtomicBoolean f11320i = new AtomicBoolean();

    /* renamed from: j */
    private final AtomicBoolean f11321j = new AtomicBoolean();

    public n61(rr2 rr2, ob1 ob1, uc1 uc1) {
        this.f11317f = rr2;
        this.f11318g = ob1;
        this.f11319h = uc1;
    }

    /* renamed from: a */
    private final void m13728a() {
        if (this.f11320i.compareAndSet(false, true)) {
            this.f11318g.zza();
        }
    }

    /* renamed from: m */
    public final synchronized void mo8445m() {
        if (this.f11317f.f13894f != 1) {
            m13728a();
        }
    }

    /* renamed from: m0 */
    public final void mo5653m0(C2376xn xnVar) {
        if (this.f11317f.f13894f == 1 && xnVar.f17256j) {
            m13728a();
        }
        if (xnVar.f17256j && this.f11321j.compareAndSet(false, true)) {
            this.f11319h.zza();
        }
    }
}
