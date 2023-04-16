package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xu */
public final class C2383xu extends aq3<C2383xu, C2346wu> implements lr3 {
    /* access modifiers changed from: private */
    public static final C2383xu zzb;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        C2383xu xuVar = new C2383xu();
        zzb = xuVar;
        aq3.m6218v(C2383xu.class, xuVar);
    }

    private C2383xu() {
    }

    /* renamed from: F */
    public static C2346wu m19662F() {
        return (C2346wu) zzb.mo5400x();
    }

    /* renamed from: H */
    static /* synthetic */ void m19664H(C2383xu xuVar, boolean z) {
        xuVar.zze |= 1;
        xuVar.zzf = z;
    }

    /* renamed from: I */
    static /* synthetic */ void m19665I(C2383xu xuVar, int i) {
        xuVar.zze |= 2;
        xuVar.zzg = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C2383xu();
        } else {
            if (i2 == 4) {
                return new C2346wu((C1750gr) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: J */
    public final boolean mo11926J() {
        return this.zzf;
    }
}
