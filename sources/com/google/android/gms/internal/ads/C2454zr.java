package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zr */
public final class C2454zr extends aq3<C2454zr, C2417yr> implements lr3 {
    /* access modifiers changed from: private */
    public static final C2454zr zzb;
    private int zze;
    private int zzf;
    private C2307vt zzg;

    static {
        C2454zr zrVar = new C2454zr();
        zzb = zrVar;
        aq3.m6218v(C2454zr.class, zrVar);
    }

    private C2454zr() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", C2380xr.m19633d(), "zzg"});
        } else if (i2 == 3) {
            return new C2454zr();
        } else {
            if (i2 == 4) {
                return new C2417yr((C1750gr) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
