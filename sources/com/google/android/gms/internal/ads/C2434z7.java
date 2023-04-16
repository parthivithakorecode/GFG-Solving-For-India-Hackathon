package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.z7 */
public final class C2434z7 extends aq3<C2434z7, C2285v7> implements lr3 {
    /* access modifiers changed from: private */
    public static final C2434z7 zzb;
    private int zze;
    private String zzf = "";
    private long zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private long zzk;
    private long zzl;
    private String zzm = "";
    private long zzn;
    private String zzo = "";
    private String zzp = "";
    private jq3<C2360x7> zzq = aq3.m6214r();
    private int zzr;

    static {
        C2434z7 z7Var = new C2434z7();
        zzb = z7Var;
        aq3.m6218v(C2434z7.class, z7Var);
    }

    private C2434z7() {
    }

    /* renamed from: F */
    public static C2285v7 m20498F() {
        return (C2285v7) zzb.mo5400x();
    }

    /* renamed from: H */
    static /* synthetic */ void m20500H(C2434z7 z7Var, long j) {
        z7Var.zze |= 2;
        z7Var.zzg = j;
    }

    /* renamed from: I */
    static /* synthetic */ void m20501I(C2434z7 z7Var, String str) {
        str.getClass();
        z7Var.zze |= 4;
        z7Var.zzh = str;
    }

    /* renamed from: J */
    static /* synthetic */ void m20502J(C2434z7 z7Var, String str) {
        str.getClass();
        z7Var.zze |= 8;
        z7Var.zzi = str;
    }

    /* renamed from: K */
    static /* synthetic */ void m20503K(C2434z7 z7Var, String str) {
        z7Var.zze |= 16;
        z7Var.zzj = str;
    }

    /* renamed from: L */
    static /* synthetic */ void m20504L(C2434z7 z7Var, String str) {
        z7Var.zze |= 1024;
        z7Var.zzp = str;
    }

    /* renamed from: M */
    static /* synthetic */ void m20505M(C2434z7 z7Var, String str) {
        str.getClass();
        z7Var.zze |= 1;
        z7Var.zzf = str;
    }

    /* renamed from: N */
    static /* synthetic */ void m20506N(C2434z7 z7Var, int i) {
        z7Var.zzr = i - 1;
        z7Var.zze |= 2048;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\rဌ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", C2360x7.class, "zzr", C2397y7.f17621a});
        } else if (i2 == 3) {
            return new C2434z7();
        } else {
            if (i2 == 4) {
                return new C2285v7((C2248u7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
