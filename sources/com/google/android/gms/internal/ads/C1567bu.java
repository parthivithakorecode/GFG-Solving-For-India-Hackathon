package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bu */
public final class C1567bu extends aq3<C1567bu, C1530au> implements lr3 {
    /* access modifiers changed from: private */
    public static final C1567bu zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        C1567bu buVar = new C1567bu();
        zzb = buVar;
        aq3.m6218v(C1567bu.class, buVar);
    }

    private C1567bu() {
    }

    /* renamed from: F */
    public static C1530au m7053F() {
        return (C1530au) zzb.mo5400x();
    }

    /* renamed from: H */
    static /* synthetic */ void m7055H(C1567bu buVar, int i) {
        buVar.zze |= 1;
        buVar.zzf = i;
    }

    /* renamed from: I */
    static /* synthetic */ void m7056I(C1567bu buVar, int i) {
        buVar.zze |= 2;
        buVar.zzg = i;
    }

    /* renamed from: J */
    static /* synthetic */ void m7057J(C1567bu buVar, int i) {
        buVar.zze |= 4;
        buVar.zzh = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C1567bu();
        } else {
            if (i2 == 4) {
                return new C1530au((C1750gr) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
