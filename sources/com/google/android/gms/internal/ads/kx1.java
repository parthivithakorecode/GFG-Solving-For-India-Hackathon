package com.google.android.gms.internal.ads;

import android.content.Context;
import p048g2.C2637b;

public final class kx1 implements ww1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final long f9790a;

    /* renamed from: b */
    private final uc2 f9791b;

    kx1(long j, Context context, dx1 dx1, bw0 bw0, String str) {
        this.f9790a = j;
        up2 A = bw0.mo5593A();
        A.mo7765Q(context);
        A.mo7766a(new C2087pv());
        A.mo7768s(str);
        uc2 zza = A.mo7767g().zza();
        this.f9791b = zza;
        zza.mo7461S2(new jx1(this, dx1));
    }

    /* renamed from: a */
    public final void mo8811a(C1902kv kvVar) {
        this.f9791b.mo7467X3(kvVar);
    }

    /* renamed from: c */
    public final void mo8812c() {
        this.f9791b.mo7460R0(C2637b.m21358Z2(null));
    }

    public final void zza() {
        this.f9791b.mo7457M();
    }
}
