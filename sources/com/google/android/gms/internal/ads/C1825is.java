package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.is */
public final class C1825is extends aq3<C1825is, C1788hs> implements lr3 {
    /* access modifiers changed from: private */
    public static final C1825is zzb;
    private int zze;
    private String zzf = "";
    private C2456zt zzg;
    private int zzh;
    private C1567bu zzi;
    private int zzj;
    private int zzk = 1000;
    private int zzl = 1000;
    private int zzm = 1000;

    static {
        C1825is isVar = new C1825is();
        zzb = isVar;
        aq3.m6218v(C1825is.class, isVar);
    }

    private C1825is() {
    }

    /* renamed from: G */
    public static C1825is m11227G() {
        return zzb;
    }

    /* renamed from: H */
    static /* synthetic */ void m11228H(C1825is isVar, String str) {
        isVar.zze |= 1;
        isVar.zzf = str;
    }

    /* renamed from: I */
    static /* synthetic */ void m11229I(C1825is isVar, C1567bu buVar) {
        buVar.getClass();
        isVar.zzi = buVar;
        isVar.zze |= 8;
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
            return aq3.m6217u(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", eq3, "zzl", eq3, "zzm", eq3});
        } else if (i2 == 3) {
            return new C1825is();
        } else {
            if (i2 == 4) {
                return new C1788hs((C1750gr) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
