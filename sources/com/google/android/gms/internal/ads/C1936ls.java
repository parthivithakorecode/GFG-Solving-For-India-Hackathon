package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ls */
public final class C1936ls extends aq3<C1936ls, C1862js> implements lr3 {
    /* access modifiers changed from: private */
    public static final C1936ls zzb;
    private int zze;
    private int zzf;
    private C1567bu zzg;
    private String zzh = "";
    private String zzi = "";

    static {
        C1936ls lsVar = new C1936ls();
        zzb = lsVar;
        aq3.m6218v(C1936ls.class, lsVar);
    }

    private C1936ls() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005ဌ\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zze", "zzf", C1899ks.f9631a, "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C1936ls();
        } else {
            if (i2 == 4) {
                return new C1862js((C1750gr) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
