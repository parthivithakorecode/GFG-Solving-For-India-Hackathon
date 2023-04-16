package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lu */
public final class C1938lu extends aq3<C1938lu, C1901ku> implements lr3 {
    /* access modifiers changed from: private */
    public static final C1938lu zzb;
    private int zze;
    private C1567bu zzf;
    private int zzg = 1000;
    private C1864ju zzh;
    private C2456zt zzi;

    static {
        C1938lu luVar = new C1938lu();
        zzb = luVar;
        aq3.m6218v(C1938lu.class, luVar);
    }

    private C1938lu() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", "zzg", C2010ns.f11648a, "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C1938lu();
        } else {
            if (i2 == 4) {
                return new C1901ku((C1750gr) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
