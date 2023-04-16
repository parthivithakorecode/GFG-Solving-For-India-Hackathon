package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.lang.Exception;

final class b24<T extends Exception> {

    /* renamed from: a */
    private T f4645a;

    /* renamed from: b */
    private long f4646b;

    public b24(long j) {
    }

    /* renamed from: a */
    public final void mo5636a() {
        this.f4645a = null;
    }

    /* renamed from: b */
    public final void mo5637b(T t) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f4645a == null) {
            this.f4645a = t;
            this.f4646b = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.f4646b) {
            T t2 = this.f4645a;
            this.f4645a = null;
            throw t2;
        }
    }
}
