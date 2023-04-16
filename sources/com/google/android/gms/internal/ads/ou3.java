package com.google.android.gms.internal.ads;

public final class ou3 extends aq3<ou3, nu3> implements lr3 {
    /* access modifiers changed from: private */
    public static final ou3 zzb;
    private int zze;
    private String zzf = "";
    private long zzg;
    private boolean zzh;

    static {
        ou3 ou3 = new ou3();
        zzb = ou3;
        aq3.m6218v(ou3.class, ou3);
    }

    private ou3() {
    }

    /* renamed from: F */
    public static nu3 m14640F() {
        return (nu3) zzb.mo5400x();
    }

    /* renamed from: H */
    static /* synthetic */ void m14642H(ou3 ou3, String str) {
        ou3.zze |= 1;
        ou3.zzf = str;
    }

    /* renamed from: I */
    static /* synthetic */ void m14643I(ou3 ou3, long j) {
        ou3.zze |= 2;
        ou3.zzg = j;
    }

    /* renamed from: J */
    static /* synthetic */ void m14644J(ou3 ou3, boolean z) {
        ou3.zze |= 4;
        ou3.zzh = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new ou3();
        } else {
            if (i2 == 4) {
                return new nu3((ot3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
