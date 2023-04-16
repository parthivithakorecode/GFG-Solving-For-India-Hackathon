package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.m6 */
final class C1951m6 {

    /* renamed from: c */
    public static final boolean f10742c = C1988n6.f11315b;

    /* renamed from: a */
    private final List<C1914l6> f10743a = new ArrayList();

    /* renamed from: b */
    private boolean f10744b = false;

    C1951m6() {
    }

    /* renamed from: a */
    public final synchronized void mo9137a(String str, long j) {
        if (!this.f10744b) {
            this.f10743a.add(new C1914l6(str, j, SystemClock.elapsedRealtime()));
        } else {
            throw new IllegalStateException("Marker added to finished log");
        }
    }

    /* renamed from: b */
    public final synchronized void mo9138b(String str) {
        long j;
        this.f10744b = true;
        if (this.f10743a.size() == 0) {
            j = 0;
        } else {
            long j2 = this.f10743a.get(0).f9912c;
            List<C1914l6> list = this.f10743a;
            j = list.get(list.size() - 1).f9912c - j2;
        }
        if (j > 0) {
            long j3 = this.f10743a.get(0).f9912c;
            C1988n6.m13723a("(%-4d ms) %s", Long.valueOf(j), str);
            for (C1914l6 next : this.f10743a) {
                long j4 = next.f9912c;
                C1988n6.m13723a("(+%-4d) [%2d] %s", Long.valueOf(j4 - j3), Long.valueOf(next.f9911b), next.f9910a);
                j3 = j4;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        if (!this.f10744b) {
            mo9138b("Request on the loose");
            C1988n6.m13724b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }
}
