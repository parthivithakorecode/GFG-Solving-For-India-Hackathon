package com.google.android.gms.internal.ads;

public final class kh3 extends aq3<kh3, jh3> implements lr3 {
    /* access modifiers changed from: private */
    public static final kh3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private qh3 zzf;
    private gk3 zzg;

    static {
        kh3 kh3 = new kh3();
        zzb = kh3;
        aq3.m6218v(kh3.class, kh3);
    }

    private kh3() {
    }

    /* renamed from: G */
    public static jh3 m12212G() {
        return (jh3) zzb.mo5400x();
    }

    /* renamed from: I */
    public static kh3 m12214I(uo3 uo3, mp3 mp3) {
        return (kh3) aq3.m6207C(zzb, uo3, mp3);
    }

    /* renamed from: M */
    static /* synthetic */ void m12216M(kh3 kh3, qh3 qh3) {
        qh3.getClass();
        kh3.zzf = qh3;
    }

    /* renamed from: N */
    static /* synthetic */ void m12217N(kh3 kh3, gk3 gk3) {
        gk3.getClass();
        kh3.zzg = gk3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new kh3();
        } else {
            if (i2 == 4) {
                return new jh3((ih3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo8671F() {
        return this.zze;
    }

    /* renamed from: J */
    public final qh3 mo8672J() {
        qh3 qh3 = this.zzf;
        return qh3 == null ? qh3.m15623I() : qh3;
    }

    /* renamed from: K */
    public final gk3 mo8673K() {
        gk3 gk3 = this.zzg;
        return gk3 == null ? gk3.m9819I() : gk3;
    }
}
