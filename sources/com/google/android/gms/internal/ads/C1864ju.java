package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ju */
public final class C1864ju extends aq3<C1864ju, C1790hu> implements lr3 {
    /* access modifiers changed from: private */
    public static final C1864ju zzb;
    private int zze;
    private int zzf;

    static {
        C1864ju juVar = new C1864ju();
        zzb = juVar;
        aq3.m6218v(C1864ju.class, juVar);
    }

    private C1864ju() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zze", "zzf", C1827iu.f8801a});
        } else if (i2 == 3) {
            return new C1864ju();
        } else {
            if (i2 == 4) {
                return new C1790hu((C1750gr) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
