package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.e8 */
public final class C1656e8 extends aq3<C1656e8, C1619d8> implements lr3 {
    /* access modifiers changed from: private */
    public static final C1656e8 zzb;
    private int zze;
    private int zzf = 2;

    static {
        C1656e8 e8Var = new C1656e8();
        zzb = e8Var;
        aq3.m6218v(C1656e8.class, e8Var);
    }

    private C1656e8() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001bဌ\u0000", new Object[]{"zze", "zzf", C1694f8.f6740a});
        } else if (i2 == 3) {
            return new C1656e8();
        } else {
            if (i2 == 4) {
                return new C1619d8((C1508a8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
