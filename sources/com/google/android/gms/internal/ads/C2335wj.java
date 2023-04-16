package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wj */
public final class C2335wj implements C2373xk {

    /* renamed from: f */
    private final C2373xk[] f16828f;

    public C2335wj(C2373xk[] xkVarArr) {
        this.f16828f = xkVarArr;
    }

    /* renamed from: q */
    public final boolean mo6982q(long j) {
        boolean z;
        boolean z2 = false;
        do {
            long zza = zza();
            if (zza == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (C2373xk xkVar : this.f16828f) {
                if (xkVar.zza() == zza) {
                    z |= xkVar.mo6982q(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    public final long zza() {
        long j = Long.MAX_VALUE;
        for (C2373xk zza : this.f16828f) {
            long zza2 = zza.zza();
            if (zza2 != Long.MIN_VALUE) {
                j = Math.min(j, zza2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }
}
