package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.c9 */
public final class C1583c9 extends aq3<C1583c9, C1546b9> implements lr3 {
    /* access modifiers changed from: private */
    public static final C1583c9 zzb;
    private int zze;
    private long zzf;
    private int zzg;
    private boolean zzh;
    private fq3 zzi = aq3.m6211o();
    private long zzj;

    static {
        C1583c9 c9Var = new C1583c9();
        zzb = c9Var;
        aq3.m6218v(C1583c9.class, c9Var);
    }

    private C1583c9() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new C1583c9();
        } else {
            if (i2 == 4) {
                return new C1546b9((C1805i8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
