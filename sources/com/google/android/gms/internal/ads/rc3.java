package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import javax.annotation.CheckForNull;

final class rc3<V> extends hb3<V> implements RunnableFuture<V> {
    @CheckForNull

    /* renamed from: m */
    private volatile ac3<?> f13588m;

    rc3(wa3<V> wa3) {
        this.f13588m = new pc3(this, wa3);
    }

    rc3(Callable<V> callable) {
        this.f13588m = new qc3(this, callable);
    }

    /* renamed from: F */
    static <V> rc3<V> m16145F(Runnable runnable, V v) {
        return new rc3<>(Executors.callable(runnable, v));
    }

    /* access modifiers changed from: protected */
    @CheckForNull
    /* renamed from: i */
    public final String mo7548i() {
        ac3<?> ac3 = this.f13588m;
        if (ac3 == null) {
            return super.mo7548i();
        }
        String obj = ac3.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 7);
        sb.append("task=[");
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo7551j() {
        ac3<?> ac3;
        if (mo7557z() && (ac3 = this.f13588m) != null) {
            ac3.mo5234g();
        }
        this.f13588m = null;
    }

    public final void run() {
        ac3<?> ac3 = this.f13588m;
        if (ac3 != null) {
            ac3.run();
        }
        this.f13588m = null;
    }
}
