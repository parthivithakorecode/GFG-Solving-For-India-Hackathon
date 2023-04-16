package com.google.android.gms.internal.ads;

public final class em3 extends aq3<em3, dm3> implements lr3 {
    /* access modifiers changed from: private */
    public static final em3 zzb;
    private int zze;

    static {
        em3 em3 = new em3();
        zzb = em3;
        aq3.m6218v(em3.class, em3);
    }

    private em3() {
    }

    /* renamed from: G */
    public static em3 m8640G() {
        return zzb;
    }

    /* renamed from: H */
    public static em3 m8641H(uo3 uo3, mp3 mp3) {
        return (em3) aq3.m6207C(zzb, uo3, mp3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new em3();
        } else {
            if (i2 == 4) {
                return new dm3((cm3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
