package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.n8 */
public final class C1990n8 extends aq3<C1990n8, C1953m8> implements lr3 {
    /* access modifiers changed from: private */
    public static final C1990n8 zzb;
    private int zze;
    private int zzf;

    static {
        C1990n8 n8Var = new C1990n8();
        zzb = n8Var;
        aq3.m6218v(C1990n8.class, n8Var);
    }

    private C1990n8() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zze", "zzf", C2138r8.f13533a});
        } else if (i2 == 3) {
            return new C1990n8();
        } else {
            if (i2 == 4) {
                return new C1953m8((C1805i8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
