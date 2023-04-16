package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.xc */
public final class C2365xc implements Callable {

    /* renamed from: a */
    private final C1735gc f17112a;

    /* renamed from: b */
    private final C1842j8 f17113b;

    public C2365xc(C1735gc gcVar, C1842j8 j8Var) {
        this.f17112a = gcVar;
        this.f17113b = j8Var;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        if (this.f17112a.mo7576l() != null) {
            this.f17112a.mo7576l().get();
        }
        C1509a9 c = this.f17112a.mo7568c();
        if (c == null) {
            return null;
        }
        try {
            synchronized (this.f17113b) {
                C1842j8 j8Var = this.f17113b;
                byte[] b = c.mo5901b();
                j8Var.mo11893n(b, 0, b.length, mp3.m13445a());
            }
            return null;
        } catch (mq3 | NullPointerException unused) {
            return null;
        }
    }
}
