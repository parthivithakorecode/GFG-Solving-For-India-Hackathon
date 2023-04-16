package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nu */
public final class C2012nu extends aq3<C2012nu, C1975mu> implements lr3 {
    /* access modifiers changed from: private */
    public static final C2012nu zzb;
    private int zze;
    private int zzf = 1000;
    private C1864ju zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        C2012nu nuVar = new C2012nu();
        zzb = nuVar;
        aq3.m6218v(C2012nu.class, nuVar);
    }

    private C2012nu() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zze", "zzf", C2010ns.f11648a, "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new C2012nu();
        } else {
            if (i2 == 4) {
                return new C1975mu((C1750gr) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
