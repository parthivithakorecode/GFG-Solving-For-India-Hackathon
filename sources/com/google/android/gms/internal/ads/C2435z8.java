package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.z8 */
public final class C2435z8 extends aq3<C2435z8, C2398y8> implements lr3 {
    /* access modifiers changed from: private */
    public static final C2435z8 zzb;
    private int zze;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private long zzl = -1;

    static {
        C2435z8 z8Var = new C2435z8();
        zzb = z8Var;
        aq3.m6218v(C2435z8.class, z8Var);
    }

    private C2435z8() {
    }

    /* renamed from: F */
    public static C2398y8 m20525F() {
        return (C2398y8) zzb.mo5400x();
    }

    /* renamed from: H */
    static /* synthetic */ void m20527H(C2435z8 z8Var, long j) {
        z8Var.zze |= 4;
        z8Var.zzh = j;
    }

    /* renamed from: I */
    static /* synthetic */ void m20528I(C2435z8 z8Var, long j) {
        z8Var.zze |= 8;
        z8Var.zzi = j;
    }

    /* renamed from: J */
    static /* synthetic */ void m20529J(C2435z8 z8Var, long j) {
        z8Var.zze |= 16;
        z8Var.zzj = j;
    }

    /* renamed from: K */
    static /* synthetic */ void m20530K(C2435z8 z8Var, long j) {
        z8Var.zze |= 32;
        z8Var.zzk = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i2 == 3) {
            return new C2435z8();
        } else {
            if (i2 == 4) {
                return new C2398y8((C1805i8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
