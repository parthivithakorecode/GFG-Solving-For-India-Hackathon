package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

final class lc3<V> implements Runnable {
    @CheckForNull

    /* renamed from: f */
    oc3<V> f10006f;

    lc3(oc3<V> oc3) {
        this.f10006f = oc3;
    }

    public final void run() {
        cc3 F;
        String str;
        oc3<V> oc3 = this.f10006f;
        if (oc3 != null && (F = oc3.f11983m) != null) {
            this.f10006f = null;
            if (F.isDone()) {
                oc3.mo7556y(F);
                return;
            }
            try {
                ScheduledFuture H = oc3.f11984n;
                oc3.f11984n = null;
                str = "Timed out";
                if (H != null) {
                    long abs = Math.abs(H.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        StringBuilder sb = new StringBuilder(75);
                        sb.append(str);
                        sb.append(" (timeout delayed by ");
                        sb.append(abs);
                        sb.append(" ms after scheduled time)");
                        str = sb.toString();
                    }
                }
                String obj = F.toString();
                StringBuilder sb2 = new StringBuilder(str.length() + 2 + obj.length());
                sb2.append(str);
                sb2.append(": ");
                sb2.append(obj);
                oc3.mo7555x(new nc3(sb2.toString(), (mc3) null));
                F.cancel(true);
            } catch (Throwable th) {
                F.cancel(true);
                throw th;
            }
        }
    }
}
