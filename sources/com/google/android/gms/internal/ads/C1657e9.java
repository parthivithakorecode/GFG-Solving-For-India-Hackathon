package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.e9 */
public final class C1657e9 extends aq3<C1657e9, C1620d9> implements lr3 {
    /* access modifiers changed from: private */
    public static final C1657e9 zzb;
    private int zze;
    private uo3 zzf;
    private uo3 zzg;
    private uo3 zzh;
    private uo3 zzi;

    static {
        C1657e9 e9Var = new C1657e9();
        zzb = e9Var;
        aq3.m6218v(C1657e9.class, e9Var);
    }

    private C1657e9() {
        uo3 uo3 = uo3.f15667g;
        this.zzf = uo3;
        this.zzg = uo3;
        this.zzh = uo3;
        this.zzi = uo3;
    }

    /* renamed from: F */
    public static C1620d9 m8370F() {
        return (C1620d9) zzb.mo5400x();
    }

    /* renamed from: H */
    public static C1657e9 m8372H(byte[] bArr, mp3 mp3) {
        return (C1657e9) aq3.m6208D(zzb, bArr, mp3);
    }

    /* renamed from: M */
    static /* synthetic */ void m8373M(C1657e9 e9Var, uo3 uo3) {
        e9Var.zze |= 1;
        e9Var.zzf = uo3;
    }

    /* renamed from: N */
    static /* synthetic */ void m8374N(C1657e9 e9Var, uo3 uo3) {
        e9Var.zze |= 2;
        e9Var.zzg = uo3;
    }

    /* renamed from: O */
    static /* synthetic */ void m8375O(C1657e9 e9Var, uo3 uo3) {
        e9Var.zze |= 4;
        e9Var.zzh = uo3;
    }

    /* renamed from: P */
    static /* synthetic */ void m8376P(C1657e9 e9Var, uo3 uo3) {
        e9Var.zze |= 8;
        e9Var.zzi = uo3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C1657e9();
        } else {
            if (i2 == 4) {
                return new C1620d9((C1805i8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: I */
    public final uo3 mo6872I() {
        return this.zzf;
    }

    /* renamed from: J */
    public final uo3 mo6873J() {
        return this.zzg;
    }

    /* renamed from: K */
    public final uo3 mo6874K() {
        return this.zzi;
    }

    /* renamed from: L */
    public final uo3 mo6875L() {
        return this.zzh;
    }
}
