package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.l5 */
final class C1913l5 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C1506a6 f9890f;

    /* renamed from: g */
    final /* synthetic */ C1950m5 f9891g;

    C1913l5(C1950m5 m5Var, C1506a6 a6Var) {
        this.f9891g = m5Var;
        this.f9890f = a6Var;
    }

    public final void run() {
        try {
            this.f9891g.f10724g.put(this.f9890f);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
