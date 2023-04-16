package com.google.android.gms.internal.ads;

public final class qh3 extends aq3<qh3, ph3> implements lr3 {
    /* access modifiers changed from: private */
    public static final qh3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private wh3 zzf;
    /* access modifiers changed from: private */
    public uo3 zzg = uo3.f15667g;

    static {
        qh3 qh3 = new qh3();
        zzb = qh3;
        aq3.m6218v(qh3.class, qh3);
    }

    private qh3() {
    }

    /* renamed from: G */
    public static ph3 m15621G() {
        return (ph3) zzb.mo5400x();
    }

    /* renamed from: I */
    public static qh3 m15623I() {
        return zzb;
    }

    /* renamed from: J */
    public static qh3 m15624J(uo3 uo3, mp3 mp3) {
        return (qh3) aq3.m6207C(zzb, uo3, mp3);
    }

    /* renamed from: N */
    static /* synthetic */ void m15626N(qh3 qh3, wh3 wh3) {
        wh3.getClass();
        qh3.zzf = wh3;
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
            return new qh3();
        } else {
            if (i2 == 4) {
                return new ph3((oh3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo10285F() {
        return this.zze;
    }

    /* renamed from: K */
    public final wh3 mo10286K() {
        wh3 wh3 = this.zzf;
        return wh3 == null ? wh3.m18992I() : wh3;
    }

    /* renamed from: L */
    public final uo3 mo10287L() {
        return this.zzg;
    }
}
