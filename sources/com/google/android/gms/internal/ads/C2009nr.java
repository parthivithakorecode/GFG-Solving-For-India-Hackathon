package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nr */
public final class C2009nr extends aq3<C2009nr, C1972mr> implements lr3 {
    /* access modifiers changed from: private */
    public static final C2009nr zzb;
    private int zze;
    private int zzf;
    private C2157rr zzg;
    private C2231tr zzh;

    static {
        C2009nr nrVar = new C2009nr();
        zzb = nrVar;
        aq3.m6218v(C2009nr.class, nrVar);
    }

    private C2009nr() {
    }

    /* renamed from: F */
    public static C1972mr m14029F() {
        return (C1972mr) zzb.mo5400x();
    }

    /* renamed from: H */
    static /* synthetic */ void m14031H(C2009nr nrVar, C2157rr rrVar) {
        rrVar.getClass();
        nrVar.zzg = rrVar;
        nrVar.zze |= 2;
    }

    /* renamed from: I */
    static /* synthetic */ void m14032I(C2009nr nrVar, C2231tr trVar) {
        trVar.getClass();
        nrVar.zzh = trVar;
        nrVar.zze |= 4;
    }

    /* renamed from: J */
    static /* synthetic */ void m14033J(C2009nr nrVar, int i) {
        nrVar.zzf = 1;
        nrVar.zze = 1 | nrVar.zze;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", C2083pr.f12763a, "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C2009nr();
        } else {
            if (i2 == 4) {
                return new C1972mr((C1750gr) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
