package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ft */
public final class C1715ft extends aq3<C1715ft, C2381xs> implements lr3 {
    /* access modifiers changed from: private */
    public static final C1715ft zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C1715ft ftVar = new C1715ft();
        zzb = ftVar;
        aq3.m6218v(C1715ft.class, ftVar);
    }

    private C1715ft() {
    }

    /* renamed from: F */
    public static C2381xs m9280F() {
        return (C2381xs) zzb.mo5400x();
    }

    /* renamed from: H */
    public static C1715ft m9282H() {
        return zzb;
    }

    /* renamed from: M */
    static /* synthetic */ void m9283M(C1715ft ftVar, int i) {
        ftVar.zzf = i - 1;
        ftVar.zze |= 1;
    }

    /* renamed from: N */
    static /* synthetic */ void m9284N(C1715ft ftVar, int i) {
        ftVar.zzg = i - 1;
        ftVar.zze |= 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", C1603ct.f5511a, "zzg", C2455zs.f18343a});
        } else if (i2 == 3) {
            return new C1715ft();
        } else {
            if (i2 == 4) {
                return new C2381xs((C1750gr) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: I */
    public final boolean mo7384I() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: J */
    public final boolean mo7385J() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: K */
    public final int mo7386K() {
        int a = C1529at.m6322a(this.zzg);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: L */
    public final int mo7387L() {
        int a = C1640dt.m8084a(this.zzf);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
