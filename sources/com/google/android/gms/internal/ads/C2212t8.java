package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.t8 */
public final class C2212t8 extends aq3<C2212t8, C2175s8> implements lr3 {
    /* access modifiers changed from: private */
    public static final C2212t8 zzb;
    private int zze;
    private int zzf;
    private long zzg = -1;

    static {
        C2212t8 t8Var = new C2212t8();
        zzb = t8Var;
        aq3.m6218v(C2212t8.class, t8Var);
    }

    private C2212t8() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", C2064p8.f12545a, "zzg"});
        } else if (i2 == 3) {
            return new C2212t8();
        } else {
            if (i2 == 4) {
                return new C2175s8((C1805i8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
