package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bs */
public final class C1565bs extends aq3<C1565bs, C1528as> implements lr3 {
    /* access modifiers changed from: private */
    public static final C1565bs zzb;
    private int zze;
    private String zzf = "";
    private jq3<C2454zr> zzg = aq3.m6214r();
    private int zzh;

    static {
        C1565bs bsVar = new C1565bs();
        zzb = bsVar;
        aq3.m6218v(C1565bs.class, bsVar);
    }

    private C1565bs() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001", new Object[]{"zze", "zzf", "zzg", C2454zr.class, "zzh", C2010ns.f11648a});
        } else if (i2 == 3) {
            return new C1565bs();
        } else {
            if (i2 == 4) {
                return new C1528as((C1750gr) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
