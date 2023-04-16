package com.google.android.gms.internal.ads;

public final class tj3 extends aq3<tj3, sj3> implements lr3 {
    /* access modifiers changed from: private */
    public static final tj3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private wj3 zzf;
    /* access modifiers changed from: private */
    public uo3 zzg = uo3.f15667g;

    static {
        tj3 tj3 = new tj3();
        zzb = tj3;
        aq3.m6218v(tj3.class, tj3);
    }

    private tj3() {
    }

    /* renamed from: G */
    public static sj3 m17288G() {
        return (sj3) zzb.mo5400x();
    }

    /* renamed from: I */
    public static tj3 m17290I(uo3 uo3, mp3 mp3) {
        return (tj3) aq3.m6207C(zzb, uo3, mp3);
    }

    /* renamed from: M */
    static /* synthetic */ void m17292M(tj3 tj3, wj3 wj3) {
        wj3.getClass();
        tj3.zzf = wj3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new tj3();
        } else {
            if (i2 == 4) {
                return new sj3((rj3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo10997F() {
        return this.zze;
    }

    /* renamed from: J */
    public final wj3 mo10998J() {
        wj3 wj3 = this.zzf;
        return wj3 == null ? wj3.m19007J() : wj3;
    }

    /* renamed from: K */
    public final uo3 mo10999K() {
        return this.zzg;
    }
}
