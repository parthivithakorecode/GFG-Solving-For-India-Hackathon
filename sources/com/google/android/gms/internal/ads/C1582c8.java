package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.c8 */
public final class C1582c8 extends aq3<C1582c8, C1545b8> implements lr3 {
    /* access modifiers changed from: private */
    public static final C1582c8 zzb;
    private int zze;
    private C1656e8 zzf;
    private C1768h8 zzg;

    static {
        C1582c8 c8Var = new C1582c8();
        zzb = c8Var;
        aq3.m6218v(C1582c8.class, c8Var);
    }

    private C1582c8() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C1582c8();
        } else {
            if (i2 == 4) {
                return new C1545b8((C1508a8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
