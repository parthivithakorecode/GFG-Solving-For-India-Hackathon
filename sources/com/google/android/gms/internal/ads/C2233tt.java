package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.tt */
public final class C2233tt extends aq3<C2233tt, C2196st> implements lr3 {
    /* access modifiers changed from: private */
    public static final C2233tt zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C2233tt ttVar = new C2233tt();
        zzb = ttVar;
        aq3.m6218v(C2233tt.class, ttVar);
    }

    private C2233tt() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C2233tt();
        } else {
            if (i2 == 4) {
                return new C2196st((C1750gr) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
