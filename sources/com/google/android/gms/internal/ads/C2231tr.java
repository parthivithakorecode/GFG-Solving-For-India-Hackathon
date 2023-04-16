package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.tr */
public final class C2231tr extends aq3<C2231tr, C2194sr> implements lr3 {
    /* access modifiers changed from: private */
    public static final C2231tr zzb;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        C2231tr trVar = new C2231tr();
        zzb = trVar;
        aq3.m6218v(C2231tr.class, trVar);
    }

    private C2231tr() {
    }

    /* renamed from: F */
    public static C2194sr m17474F() {
        return (C2194sr) zzb.mo5400x();
    }

    /* renamed from: H */
    static /* synthetic */ void m17476H(C2231tr trVar, boolean z) {
        trVar.zze |= 1;
        trVar.zzf = z;
    }

    /* renamed from: I */
    static /* synthetic */ void m17477I(C2231tr trVar, boolean z) {
        trVar.zze |= 2;
        trVar.zzg = z;
    }

    /* renamed from: J */
    static /* synthetic */ void m17478J(C2231tr trVar, int i) {
        trVar.zze |= 4;
        trVar.zzh = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C2231tr();
        } else {
            if (i2 == 4) {
                return new C2194sr((C1750gr) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
