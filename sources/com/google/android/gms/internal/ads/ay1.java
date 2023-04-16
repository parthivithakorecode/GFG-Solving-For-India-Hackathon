package com.google.android.gms.internal.ads;

public final class ay1 {

    /* renamed from: a */
    private final xv1 f4419a;

    /* renamed from: b */
    private boolean f4420b;

    public ay1(xv1 xv1) {
        this.f4419a = xv1;
    }

    /* renamed from: a */
    public final synchronized void mo5563a() {
        while (!this.f4420b) {
            wait();
        }
    }

    /* renamed from: b */
    public final synchronized void mo5564b() {
        boolean z = false;
        while (!this.f4420b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: c */
    public final synchronized boolean mo5565c() {
        boolean z;
        z = this.f4420b;
        this.f4420b = false;
        return z;
    }

    /* renamed from: d */
    public final synchronized boolean mo5566d() {
        return this.f4420b;
    }

    /* renamed from: e */
    public final synchronized boolean mo5567e() {
        if (this.f4420b) {
            return false;
        }
        this.f4420b = true;
        notifyAll();
        return true;
    }
}
