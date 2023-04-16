package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vu */
public final class C2308vu extends aq3<C2308vu, C2271uu> implements lr3 {
    /* access modifiers changed from: private */
    public static final C2308vu zzb;
    private int zze;
    private int zzf = 1000;
    private C1864ju zzg;

    static {
        C2308vu vuVar = new C2308vu();
        zzb = vuVar;
        aq3.m6218v(C2308vu.class, vuVar);
    }

    private C2308vu() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", C2010ns.f11648a, "zzg"});
        } else if (i2 == 3) {
            return new C2308vu();
        } else {
            if (i2 == 4) {
                return new C2271uu((C1750gr) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
