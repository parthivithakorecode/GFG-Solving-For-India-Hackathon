package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.pt */
public final class C2085pt extends aq3<C2085pt, C1937lt> implements lr3 {
    /* access modifiers changed from: private */
    public static final C2085pt zzb;
    private int zze;
    private jq3<C1900kt> zzf = aq3.m6214r();
    private int zzg;
    private int zzh;
    private long zzi;
    private String zzj = "";
    private String zzk = "";
    private long zzl;

    static {
        C2085pt ptVar = new C2085pt();
        zzb = ptVar;
        aq3.m6218v(C2085pt.class, ptVar);
    }

    private C2085pt() {
    }

    /* renamed from: F */
    public static C1937lt m15249F() {
        return (C1937lt) zzb.mo5400x();
    }

    /* renamed from: H */
    static /* synthetic */ void m15251H(C2085pt ptVar, Iterable iterable) {
        jq3<C1900kt> jq3 = ptVar.zzf;
        if (!jq3.mo6246c()) {
            ptVar.zzf = aq3.m6215s(jq3);
        }
        bo3.m7003j(iterable, ptVar.zzf);
    }

    /* renamed from: I */
    static /* synthetic */ void m15252I(C2085pt ptVar, int i) {
        ptVar.zze |= 1;
        ptVar.zzg = i;
    }

    /* renamed from: J */
    static /* synthetic */ void m15253J(C2085pt ptVar, int i) {
        ptVar.zze |= 2;
        ptVar.zzh = i;
    }

    /* renamed from: K */
    static /* synthetic */ void m15254K(C2085pt ptVar, long j) {
        ptVar.zze |= 4;
        ptVar.zzi = j;
    }

    /* renamed from: L */
    static /* synthetic */ void m15255L(C2085pt ptVar, String str) {
        str.getClass();
        ptVar.zze |= 8;
        ptVar.zzj = str;
    }

    /* renamed from: M */
    static /* synthetic */ void m15256M(C2085pt ptVar, String str) {
        str.getClass();
        ptVar.zze |= 16;
        ptVar.zzk = str;
    }

    /* renamed from: N */
    static /* synthetic */ void m15257N(C2085pt ptVar, long j) {
        ptVar.zze |= 32;
        ptVar.zzl = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005", new Object[]{"zze", "zzf", C1900kt.class, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i2 == 3) {
            return new C2085pt();
        } else {
            if (i2 == 4) {
                return new C1937lt((C1750gr) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
