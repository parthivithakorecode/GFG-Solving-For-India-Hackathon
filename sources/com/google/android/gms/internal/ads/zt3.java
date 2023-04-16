package com.google.android.gms.internal.ads;

public final class zt3 extends aq3<zt3, wt3> implements lr3 {
    /* access modifiers changed from: private */
    public static final zt3 zzb;
    private int zze;
    private yt3 zzf;
    private jq3<vt3> zzg = aq3.m6214r();
    private uo3 zzh;
    private uo3 zzi;
    private int zzj;
    private byte zzk = 2;

    static {
        zt3 zt3 = new zt3();
        zzb = zt3;
        aq3.m6218v(zt3.class, zt3);
    }

    private zt3() {
        uo3 uo3 = uo3.f15667g;
        this.zzh = uo3;
        this.zzi = uo3;
    }

    /* renamed from: F */
    public static wt3 m20837F() {
        return (wt3) zzb.mo5400x();
    }

    /* renamed from: H */
    static /* synthetic */ void m20839H(zt3 zt3, vt3 vt3) {
        vt3.getClass();
        jq3<vt3> jq3 = zt3.zzg;
        if (!jq3.mo6246c()) {
            zt3.zzg = aq3.m6215s(jq3);
        }
        zt3.zzg.add(vt3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzk);
        }
        byte b = 1;
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zze", "zzf", "zzg", vt3.class, "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new zt3();
        } else {
            if (i2 == 4) {
                return new wt3((ot3) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzk = b;
            return null;
        }
    }
}
