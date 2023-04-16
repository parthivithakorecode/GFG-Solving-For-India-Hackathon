package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vd */
public final class C2291vd extends aq3<C2291vd, C2254ud> implements lr3 {
    /* access modifiers changed from: private */
    public static final C2291vd zzb;
    private int zze;
    private C2403yd zzf;
    private uo3 zzg;
    private uo3 zzh;

    static {
        C2291vd vdVar = new C2291vd();
        zzb = vdVar;
        aq3.m6218v(C2291vd.class, vdVar);
    }

    private C2291vd() {
        uo3 uo3 = uo3.f15667g;
        this.zzg = uo3;
        this.zzh = uo3;
    }

    /* renamed from: G */
    public static C2291vd m18451G(uo3 uo3, mp3 mp3) {
        return (C2291vd) aq3.m6207C(zzb, uo3, mp3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C2291vd();
        } else {
            if (i2 == 4) {
                return new C2254ud((C2217td) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: H */
    public final C2403yd mo11451H() {
        C2403yd ydVar = this.zzf;
        return ydVar == null ? C2403yd.m19958K() : ydVar;
    }

    /* renamed from: I */
    public final uo3 mo11452I() {
        return this.zzh;
    }

    /* renamed from: J */
    public final uo3 mo11453J() {
        return this.zzg;
    }
}
