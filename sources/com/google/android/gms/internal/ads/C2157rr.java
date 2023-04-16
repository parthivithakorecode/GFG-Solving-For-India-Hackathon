package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rr */
public final class C2157rr extends aq3<C2157rr, C2120qr> implements lr3 {
    /* access modifiers changed from: private */
    public static final C2157rr zzb;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        C2157rr rrVar = new C2157rr();
        zzb = rrVar;
        aq3.m6218v(C2157rr.class, rrVar);
    }

    private C2157rr() {
    }

    /* renamed from: F */
    public static C2120qr m16408F() {
        return (C2120qr) zzb.mo5400x();
    }

    /* renamed from: H */
    public static C2157rr m16410H() {
        return zzb;
    }

    /* renamed from: I */
    static /* synthetic */ void m16411I(C2157rr rrVar, boolean z) {
        rrVar.zze |= 1;
        rrVar.zzf = z;
    }

    /* renamed from: J */
    static /* synthetic */ void m16412J(C2157rr rrVar, int i) {
        rrVar.zze |= 2;
        rrVar.zzg = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C2157rr();
        } else {
            if (i2 == 4) {
                return new C2120qr((C1750gr) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
