package com.google.android.gms.internal.ads;

public final class cu3 extends aq3<cu3, bu3> implements lr3 {
    /* access modifiers changed from: private */
    public static final cu3 zzb;
    private int zze;
    private int zzf;
    private uo3 zzg;
    private uo3 zzh;

    static {
        cu3 cu3 = new cu3();
        zzb = cu3;
        aq3.m6218v(cu3.class, cu3);
    }

    private cu3() {
        uo3 uo3 = uo3.f15667g;
        this.zzg = uo3;
        this.zzh = uo3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new cu3();
        } else {
            if (i2 == 4) {
                return new bu3((ot3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
