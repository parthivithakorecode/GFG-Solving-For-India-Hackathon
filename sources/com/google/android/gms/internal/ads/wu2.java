package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ea1;
import com.google.android.gms.internal.ads.v61;
import javax.annotation.concurrent.GuardedBy;

public final class wu2<R extends ea1<AdT>, AdT extends v61> {

    /* renamed from: a */
    private final pu2<R, AdT> f16938a;

    /* renamed from: b */
    private final cc3<nu2<R, AdT>> f16939b;
    @GuardedBy("this")

    /* renamed from: c */
    private boolean f16940c = false;
    @GuardedBy("this")

    /* renamed from: d */
    private boolean f16941d = false;

    public wu2(tt2 tt2, ou2<R, AdT> ou2, pu2<R, AdT> pu2) {
        this.f16938a = pu2;
        this.f16939b = rb3.m16129g(rb3.m16136n(ou2.mo7980a(pu2), new uu2(this, ou2, tt2, pu2), pu2.mo8187a()), Exception.class, new tu2(this, ou2), pu2.mo8187a());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.internal.ads.cc3<com.google.android.gms.internal.ads.nu2<R, AdT>> mo11734a(com.google.android.gms.internal.ads.pu2<R, AdT> r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f16941d     // Catch:{ all -> 0x0035 }
            r1 = 0
            if (r0 != 0) goto L_0x0033
            boolean r0 = r2.f16940c     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x000b
            goto L_0x0033
        L_0x000b:
            com.google.android.gms.internal.ads.pu2<R, AdT> r0 = r2.f16938a     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.du2 r0 = r0.zza()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0031
            com.google.android.gms.internal.ads.du2 r0 = r3.zza()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0031
            com.google.android.gms.internal.ads.pu2<R, AdT> r0 = r2.f16938a     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.du2 r0 = r0.zza()     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.du2 r3 = r3.zza()     // Catch:{ all -> 0x0035 }
            boolean r3 = r0.equals(r3)     // Catch:{ all -> 0x0035 }
            if (r3 != 0) goto L_0x002a
            goto L_0x0031
        L_0x002a:
            r3 = 1
            r2.f16940c = r3     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.cc3<com.google.android.gms.internal.ads.nu2<R, AdT>> r3 = r2.f16939b     // Catch:{ all -> 0x0035 }
            monitor-exit(r2)
            return r3
        L_0x0031:
            monitor-exit(r2)
            return r1
        L_0x0033:
            monitor-exit(r2)
            return r1
        L_0x0035:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wu2.mo11734a(com.google.android.gms.internal.ads.pu2):com.google.android.gms.internal.ads.cc3");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ cc3 mo11735b(ou2 ou2, tt2 tt2, pu2 pu2, cu2 cu2) {
        synchronized (this) {
            this.f16941d = true;
            ou2.mo7981b(cu2);
            if (!this.f16940c) {
                tt2.mo11113a(pu2.zza(), cu2);
                cc3 i = rb3.m16131i(null);
                return i;
            }
            cc3 i2 = rb3.m16131i(new nu2(cu2, pu2));
            return i2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ cc3 mo11736c(ou2 ou2, Exception exc) {
        synchronized (this) {
            this.f16941d = true;
            throw exc;
        }
    }

    /* renamed from: d */
    public final synchronized void mo11737d(nb3<Void> nb3) {
        rb3.m16140r(rb3.m16136n(this.f16939b, vu2.f16409a, this.f16938a.mo8187a()), nb3, this.f16938a.mo8187a());
    }
}
