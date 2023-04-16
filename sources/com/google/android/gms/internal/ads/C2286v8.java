package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.v8 */
public final class C2286v8 extends aq3<C2286v8, C2249u8> implements lr3 {
    /* access modifiers changed from: private */
    public static final C2286v8 zzb;
    private int zze;
    private long zzf = -1;
    private int zzg = 1000;

    static {
        C2286v8 v8Var = new C2286v8();
        zzb = v8Var;
        aq3.m6218v(C2286v8.class, v8Var);
    }

    private C2286v8() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", "zzg", C1732g9.f7309a});
        } else if (i2 == 3) {
            return new C2286v8();
        } else {
            if (i2 == 4) {
                return new C2249u8((C1805i8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
