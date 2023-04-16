package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.x8 */
public final class C2361x8 extends aq3<C2361x8, C2323w8> implements lr3 {
    /* access modifiers changed from: private */
    public static final C2361x8 zzb;
    private int zze;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private int zzl = 1000;
    private long zzm = -1;
    private long zzn = -1;
    private long zzo = -1;
    private int zzp = 1000;
    private long zzq = -1;
    private long zzr = -1;
    private long zzs = -1;
    private long zzt = -1;
    private long zzu;
    private long zzv;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;
    private long zzz = -1;

    static {
        C2361x8 x8Var = new C2361x8();
        zzb = x8Var;
        aq3.m6218v(C2361x8.class, x8Var);
    }

    private C2361x8() {
    }

    /* renamed from: F */
    public static C2323w8 m19393F() {
        return (C2323w8) zzb.mo5400x();
    }

    /* renamed from: H */
    static /* synthetic */ void m19395H(C2361x8 x8Var, long j) {
        x8Var.zze |= 1;
        x8Var.zzf = j;
    }

    /* renamed from: I */
    static /* synthetic */ void m19396I(C2361x8 x8Var, long j) {
        x8Var.zze |= 2;
        x8Var.zzg = j;
    }

    /* renamed from: J */
    static /* synthetic */ void m19397J(C2361x8 x8Var, long j) {
        x8Var.zze |= 4;
        x8Var.zzh = j;
    }

    /* renamed from: K */
    static /* synthetic */ void m19398K(C2361x8 x8Var, long j) {
        x8Var.zze |= 8;
        x8Var.zzi = j;
    }

    /* renamed from: L */
    static /* synthetic */ void m19399L(C2361x8 x8Var) {
        x8Var.zze &= -9;
        x8Var.zzi = -1;
    }

    /* renamed from: M */
    static /* synthetic */ void m19400M(C2361x8 x8Var, long j) {
        x8Var.zze |= 16;
        x8Var.zzj = j;
    }

    /* renamed from: N */
    static /* synthetic */ void m19401N(C2361x8 x8Var, long j) {
        x8Var.zze |= 32;
        x8Var.zzk = j;
    }

    /* renamed from: O */
    static /* synthetic */ void m19402O(C2361x8 x8Var, long j) {
        x8Var.zze |= 128;
        x8Var.zzm = j;
    }

    /* renamed from: P */
    static /* synthetic */ void m19403P(C2361x8 x8Var, long j) {
        x8Var.zze |= 256;
        x8Var.zzn = j;
    }

    /* renamed from: Q */
    static /* synthetic */ void m19404Q(C2361x8 x8Var, long j) {
        x8Var.zze |= 512;
        x8Var.zzo = j;
    }

    /* renamed from: R */
    static /* synthetic */ void m19405R(C2361x8 x8Var, long j) {
        x8Var.zze |= 2048;
        x8Var.zzq = j;
    }

    /* renamed from: S */
    static /* synthetic */ void m19406S(C2361x8 x8Var, long j) {
        x8Var.zze |= 4096;
        x8Var.zzr = j;
    }

    /* renamed from: T */
    static /* synthetic */ void m19407T(C2361x8 x8Var, long j) {
        x8Var.zze |= 8192;
        x8Var.zzs = j;
    }

    /* renamed from: U */
    static /* synthetic */ void m19408U(C2361x8 x8Var, long j) {
        x8Var.zze |= 16384;
        x8Var.zzt = j;
    }

    /* renamed from: V */
    static /* synthetic */ void m19409V(C2361x8 x8Var, long j) {
        x8Var.zze |= 32768;
        x8Var.zzu = j;
    }

    /* renamed from: W */
    static /* synthetic */ void m19410W(C2361x8 x8Var, long j) {
        x8Var.zze |= 65536;
        x8Var.zzv = j;
    }

    /* renamed from: X */
    static /* synthetic */ void m19411X(C2361x8 x8Var, long j) {
        x8Var.zze |= 131072;
        x8Var.zzw = j;
    }

    /* renamed from: Y */
    static /* synthetic */ void m19412Y(C2361x8 x8Var, long j) {
        x8Var.zze |= 262144;
        x8Var.zzx = j;
    }

    /* renamed from: Z */
    static /* synthetic */ void m19413Z(C2361x8 x8Var, int i) {
        x8Var.zzl = i - 1;
        x8Var.zze |= 64;
    }

    /* renamed from: a0 */
    static /* synthetic */ void m19414a0(C2361x8 x8Var, int i) {
        x8Var.zzp = i - 1;
        x8Var.zze |= 1024;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            eq3 eq3 = C1732g9.f7309a;
            return aq3.m6217u(zzb, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဌ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", eq3, "zzm", "zzn", "zzo", "zzp", eq3, "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz"});
        } else if (i2 == 3) {
            return new C2361x8();
        } else {
            if (i2 == 4) {
                return new C2323w8((C1805i8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
