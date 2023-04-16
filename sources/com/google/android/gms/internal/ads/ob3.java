package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

final class ob3<V> implements Runnable {

    /* renamed from: f */
    final Future<V> f11974f;

    /* renamed from: g */
    final nb3<? super V> f11975g;

    ob3(Future<V> future, nb3<? super V> nb3) {
        this.f11974f = future;
        this.f11975g = nb3;
    }

    public final void run() {
        Throwable a;
        Future<V> future = this.f11974f;
        if (!(future instanceof uc3) || (a = vc3.m18448a((uc3) future)) == null) {
            try {
                this.f11975g.mo5436a(rb3.m16138p(this.f11974f));
            } catch (ExecutionException e) {
                this.f11975g.mo5437b(e.getCause());
            } catch (Error | RuntimeException e2) {
                this.f11975g.mo5437b(e2);
            }
        } else {
            this.f11975g.mo5437b(a);
        }
    }

    public final String toString() {
        k43 a = l43.m12573a(this);
        a.mo8613a(this.f11975g);
        return a.toString();
    }
}
