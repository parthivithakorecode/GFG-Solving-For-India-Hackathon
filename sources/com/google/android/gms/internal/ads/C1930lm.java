package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lm */
public final class C1930lm {

    /* renamed from: a */
    private boolean f10089a;

    /* renamed from: a */
    public final synchronized void mo8973a() {
        while (!this.f10089a) {
            wait();
        }
    }

    /* renamed from: b */
    public final synchronized boolean mo8974b() {
        boolean z;
        z = this.f10089a;
        this.f10089a = false;
        return z;
    }

    /* renamed from: c */
    public final synchronized boolean mo8975c() {
        if (this.f10089a) {
            return false;
        }
        this.f10089a = true;
        notifyAll();
        return true;
    }
}
