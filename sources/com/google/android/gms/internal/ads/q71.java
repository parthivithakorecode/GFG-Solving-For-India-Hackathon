package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import p061i1.C2818q;

public final class q71 implements C2818q {

    /* renamed from: f */
    private final dc1 f13080f;

    /* renamed from: g */
    private final AtomicBoolean f13081g = new AtomicBoolean(false);

    /* renamed from: h */
    private final AtomicBoolean f13082h = new AtomicBoolean(false);

    public q71(dc1 dc1) {
        this.f13080f = dc1;
    }

    /* renamed from: d */
    private final void m15503d() {
        if (!this.f13082h.get()) {
            this.f13082h.set(true);
            this.f13080f.zza();
        }
    }

    /* renamed from: D */
    public final void mo5643D(int i) {
        this.f13081g.set(true);
        m15503d();
    }

    /* renamed from: M3 */
    public final void mo5644M3() {
    }

    /* renamed from: Z2 */
    public final void mo5645Z2() {
        m15503d();
    }

    /* renamed from: a */
    public final void mo5646a() {
        this.f13080f.mo6443c();
    }

    /* renamed from: b */
    public final void mo5647b() {
    }

    /* renamed from: c */
    public final boolean mo10252c() {
        return this.f13081g.get();
    }

    /* renamed from: u5 */
    public final void mo5655u5() {
    }
}
