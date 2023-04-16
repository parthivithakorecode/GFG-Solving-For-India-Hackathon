package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.es */
public final class C1677es extends aq3<C1677es, C1602cs> implements lr3 {
    /* access modifiers changed from: private */
    public static final C1677es zzb;
    private int zze;
    private String zzf = "";
    private jq3<C2454zr> zzg = aq3.m6214r();
    private int zzh = 1000;
    private int zzi = 1000;
    private int zzj = 1000;

    static {
        C1677es esVar = new C1677es();
        zzb = esVar;
        aq3.m6218v(C1677es.class, esVar);
    }

    private C1677es() {
    }

    /* renamed from: G */
    public static C1677es m8699G() {
        return zzb;
    }

    /* renamed from: H */
    static /* synthetic */ void m8700H(C1677es esVar, String str) {
        str.getClass();
        esVar.zze |= 1;
        esVar.zzf = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            eq3 eq3 = C2010ns.f11648a;
            return aq3.m6217u(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဌ\u0002\u0005ဌ\u0003", new Object[]{"zze", "zzf", "zzg", C2454zr.class, "zzh", eq3, "zzi", eq3, "zzj", eq3});
        } else if (i2 == 3) {
            return new C1677es();
        } else {
            if (i2 == 4) {
                return new C1602cs((C1750gr) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
