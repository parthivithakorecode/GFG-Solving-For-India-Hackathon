package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lr */
public final class C1935lr extends aq3<C1935lr, C1898kr> implements lr3 {
    /* access modifiers changed from: private */
    public static final C1935lr zzb;
    private int zze;
    private int zzf;
    private int zzg = 1000;
    private C1565bs zzh;
    private C1677es zzi;
    private jq3<C2454zr> zzj = aq3.m6214r();
    private C1751gs zzk;
    private C2159rt zzl;
    private C1789ht zzm;
    private C2269us zzn;
    private C2344ws zzo;
    private jq3<C1641du> zzp = aq3.m6214r();

    static {
        C1935lr lrVar = new C1935lr();
        zzb = lrVar;
        aq3.m6218v(C1935lr.class, lrVar);
    }

    private C1935lr() {
    }

    /* renamed from: G */
    public static C1935lr m12824G() {
        return zzb;
    }

    /* renamed from: I */
    static /* synthetic */ void m12825I(C1935lr lrVar, C1861jr jrVar) {
        lrVar.zzf = jrVar.zza();
        lrVar.zze |= 1;
    }

    /* renamed from: J */
    static /* synthetic */ void m12826J(C1935lr lrVar, C1677es esVar) {
        esVar.getClass();
        lrVar.zzi = esVar;
        lrVar.zze |= 8;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007ဌ\u0000\bဌ\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zze", "zzf", C1861jr.m11812d(), "zzg", C2010ns.f11648a, "zzh", "zzi", "zzj", C2454zr.class, "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", C1641du.class});
        } else if (i2 == 3) {
            return new C1935lr();
        } else {
            if (i2 == 4) {
                return new C1898kr((C1750gr) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: H */
    public final C1677es mo8997H() {
        C1677es esVar = this.zzi;
        return esVar == null ? C1677es.m8699G() : esVar;
    }
}
