package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.pu */
public final class C2086pu extends aq3<C2086pu, C2049ou> implements lr3 {
    /* access modifiers changed from: private */
    public static final C2086pu zzb;
    private int zze;
    private int zzf = 1000;
    private C1864ju zzg;
    private C2456zt zzh;

    static {
        C2086pu puVar = new C2086pu();
        zzb = puVar;
        aq3.m6218v(C2086pu.class, puVar);
    }

    private C2086pu() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", C2010ns.f11648a, "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C2086pu();
        } else {
            if (i2 == 4) {
                return new C2049ou((C1750gr) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
