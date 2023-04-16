package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.m9 */
public final class C1954m9 extends aq3<C1954m9, C1880k9> implements lr3 {
    /* access modifiers changed from: private */
    public static final C1954m9 zzb;
    private int zze;
    private String zzf = "";

    static {
        C1954m9 m9Var = new C1954m9();
        zzb = m9Var;
        aq3.m6218v(C1954m9.class, m9Var);
    }

    private C1954m9() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new C1954m9();
        } else {
            if (i2 == 4) {
                return new C1880k9((C1805i8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
