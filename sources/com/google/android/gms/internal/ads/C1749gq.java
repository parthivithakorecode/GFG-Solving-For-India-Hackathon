package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import p003a2.C0052c;

/* renamed from: com.google.android.gms.internal.ads.gq */
final class C1749gq implements C0052c.C0053a {

    /* renamed from: a */
    final /* synthetic */ C1823iq f7553a;

    C1749gq(C1823iq iqVar) {
        this.f7553a = iqVar;
    }

    /* renamed from: C0 */
    public final void mo139C0(Bundle bundle) {
        synchronized (this.f7553a.f8754b) {
            try {
                if (this.f7553a.f8755c != null) {
                    C1823iq iqVar = this.f7553a;
                    iqVar.f8757e = iqVar.f8755c.mo8989j0();
                }
            } catch (DeadObjectException e) {
                io0.m11129e("Unable to obtain a cache service instance.", e);
                C1823iq.m11186h(this.f7553a);
            }
            this.f7553a.f8754b.notifyAll();
        }
    }

    /* renamed from: D */
    public final void mo140D(int i) {
        synchronized (this.f7553a.f8754b) {
            this.f7553a.f8757e = null;
            this.f7553a.f8754b.notifyAll();
        }
    }
}
