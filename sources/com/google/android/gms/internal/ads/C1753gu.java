package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gu */
public final class C1753gu extends aq3<C1753gu, C1679eu> implements lr3 {
    /* access modifiers changed from: private */
    public static final C1753gu zzb;
    private int zze;
    private int zzf = 1000;
    private C1864ju zzg;
    private C2456zt zzh;

    static {
        C1753gu guVar = new C1753gu();
        zzb = guVar;
        aq3.m6218v(C1753gu.class, guVar);
    }

    private C1753gu() {
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
            return new C1753gu();
        } else {
            if (i2 == 4) {
                return new C1679eu((C1750gr) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
