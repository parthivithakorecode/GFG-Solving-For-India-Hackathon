package com.google.android.gms.internal.ads;

public final class gu3 extends aq3<gu3, eu3> implements lr3 {
    /* access modifiers changed from: private */
    public static final gu3 zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private uo3 zzh = uo3.f15667g;

    static {
        gu3 gu3 = new gu3();
        zzb = gu3;
        aq3.m6218v(gu3.class, gu3);
    }

    private gu3() {
    }

    /* renamed from: F */
    public static eu3 m10005F() {
        return (eu3) zzb.mo5400x();
    }

    /* renamed from: H */
    static /* synthetic */ void m10007H(gu3 gu3, String str) {
        gu3.zze |= 2;
        gu3.zzg = "image/png";
    }

    /* renamed from: I */
    static /* synthetic */ void m10008I(gu3 gu3, uo3 uo3) {
        uo3.getClass();
        gu3.zze |= 4;
        gu3.zzh = uo3;
    }

    /* renamed from: J */
    static /* synthetic */ void m10009J(gu3 gu3, int i) {
        gu3.zzf = 1;
        gu3.zze = 1 | gu3.zze;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", fu3.f6957a, "zzg", "zzh"});
        } else if (i2 == 3) {
            return new gu3();
        } else {
            if (i2 == 4) {
                return new eu3((ot3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
