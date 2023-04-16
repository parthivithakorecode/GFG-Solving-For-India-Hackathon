package com.google.android.gms.internal.ads;

public final class tt3 extends aq3<tt3, st3> implements lr3 {
    /* access modifiers changed from: private */
    public static final tt3 zzb;
    private int zze;
    private String zzf = "";

    static {
        tt3 tt3 = new tt3();
        zzb = tt3;
        aq3.m6218v(tt3.class, tt3);
    }

    private tt3() {
    }

    /* renamed from: F */
    public static st3 m17509F() {
        return (st3) zzb.mo5400x();
    }

    /* renamed from: H */
    static /* synthetic */ void m17511H(tt3 tt3, String str) {
        tt3.zze |= 1;
        tt3.zzf = str;
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
            return new tt3();
        } else {
            if (i2 == 4) {
                return new st3((ot3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
