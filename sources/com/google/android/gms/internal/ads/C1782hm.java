package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.hm */
public final class C1782hm {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ExecutorService f8333a = C2449zm.m20733l("Loader:ExtractorMediaPeriod");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C1671em<? extends C1708fm> f8334b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public IOException f8335c;

    public C1782hm(String str) {
    }

    /* renamed from: a */
    public final <T extends C1708fm> long mo7958a(T t, C1633dm<T> dmVar, int i) {
        Looper myLooper = Looper.myLooper();
        C1856jm.m11730e(myLooper != null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new C1671em(this, myLooper, t, dmVar, i, elapsedRealtime).mo7002c(0);
        return elapsedRealtime;
    }

    /* renamed from: f */
    public final void mo7959f() {
        this.f8334b.mo7000a(false);
    }

    /* renamed from: g */
    public final void mo7960g(int i) {
        IOException iOException = this.f8335c;
        if (iOException == null) {
            C1671em<? extends C1708fm> emVar = this.f8334b;
            if (emVar != null) {
                emVar.mo7001b(emVar.f6277h);
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: h */
    public final void mo7961h(Runnable runnable) {
        C1671em<? extends C1708fm> emVar = this.f8334b;
        if (emVar != null) {
            emVar.mo7000a(true);
        }
        this.f8333a.execute(runnable);
        this.f8333a.shutdown();
    }

    /* renamed from: i */
    public final boolean mo7962i() {
        return this.f8334b != null;
    }
}
