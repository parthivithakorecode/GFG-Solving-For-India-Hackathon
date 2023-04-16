package com.google.android.gms.internal.ads;

import java.util.Objects;

final class hc3 extends ca3<Void> implements Runnable {

    /* renamed from: m */
    private final Runnable f8158m;

    public hc3(Runnable runnable) {
        Objects.requireNonNull(runnable);
        this.f8158m = runnable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final String mo7548i() {
        String valueOf = String.valueOf(this.f8158m);
        StringBuilder sb = new StringBuilder(valueOf.length() + 7);
        sb.append("task=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public final void run() {
        try {
            this.f8158m.run();
        } catch (Throwable th) {
            mo7555x(th);
            d53.m7726b(th);
            throw new RuntimeException(th);
        }
    }
}
