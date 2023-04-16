package com.google.android.gms.internal.ads;

public final class du3 extends aq3<du3, au3> implements lr3 {
    /* access modifiers changed from: private */
    public static final du3 zzb;
    private int zze;
    private cu3 zzf;
    private jq3<vt3> zzg = aq3.m6214r();
    private uo3 zzh;
    private uo3 zzi;
    private int zzj;
    private uo3 zzk;
    private byte zzl = 2;

    static {
        du3 du3 = new du3();
        zzb = du3;
        aq3.m6218v(du3.class, du3);
    }

    private du3() {
        uo3 uo3 = uo3.f15667g;
        this.zzh = uo3;
        this.zzi = uo3;
        this.zzk = uo3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzl);
        }
        byte b = 1;
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zze", "zzf", "zzg", vt3.class, "zzh", "zzi", "zzj", "zzk"});
        } else if (i2 == 3) {
            return new du3();
        } else {
            if (i2 == 4) {
                return new au3((ot3) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzl = b;
            return null;
        }
    }
}
