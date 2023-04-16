package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qs */
public final class C2121qs extends aq3<C2121qs, C2084ps> implements lr3 {
    /* access modifiers changed from: private */
    public static final C2121qs zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private int zzh;
    private int zzi = 1000;
    private C1567bu zzj;
    /* access modifiers changed from: private */
    public iq3 zzk = aq3.m6213q();
    private C1825is zzl;
    private C1936ls zzm;
    private C1715ft zzn;
    private C1935lr zzo;
    private C2085pt zzp;
    private C2383xu zzq;
    private C2268ur zzr;

    static {
        C2121qs qsVar = new C2121qs();
        zzb = qsVar;
        aq3.m6218v(C2121qs.class, qsVar);
    }

    private C2121qs() {
    }

    /* renamed from: H */
    public static C2084ps m15843H() {
        return (C2084ps) zzb.mo5400x();
    }

    /* renamed from: K */
    static /* synthetic */ void m15845K(C2121qs qsVar, String str) {
        str.getClass();
        qsVar.zze |= 2;
        qsVar.zzg = str;
    }

    /* renamed from: L */
    static /* synthetic */ void m15846L(C2121qs qsVar, Iterable iterable) {
        iq3 iq3 = qsVar.zzk;
        if (!iq3.mo6246c()) {
            int size = iq3.size();
            qsVar.zzk = iq3.mo8239d(size == 0 ? 10 : size + size);
        }
        bo3.m7003j(iterable, qsVar.zzk);
    }

    /* renamed from: N */
    static /* synthetic */ void m15848N(C2121qs qsVar, C1825is isVar) {
        isVar.getClass();
        qsVar.zzl = isVar;
        qsVar.zze |= 32;
    }

    /* renamed from: O */
    static /* synthetic */ void m15849O(C2121qs qsVar, C1935lr lrVar) {
        lrVar.getClass();
        qsVar.zzo = lrVar;
        qsVar.zze |= 256;
    }

    /* renamed from: P */
    static /* synthetic */ void m15850P(C2121qs qsVar, C2085pt ptVar) {
        ptVar.getClass();
        qsVar.zzp = ptVar;
        qsVar.zze |= 512;
    }

    /* renamed from: Q */
    static /* synthetic */ void m15851Q(C2121qs qsVar, C2383xu xuVar) {
        xuVar.getClass();
        qsVar.zzq = xuVar;
        qsVar.zze |= 1024;
    }

    /* renamed from: R */
    static /* synthetic */ void m15852R(C2121qs qsVar, C2268ur urVar) {
        urVar.getClass();
        qsVar.zzr = urVar;
        qsVar.zze |= 2048;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\fဌ\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", C2010ns.f11648a, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr"});
        } else if (i2 == 3) {
            return new C2121qs();
        } else {
            if (i2 == 4) {
                return new C2084ps((C1750gr) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final C1935lr mo10377F() {
        C1935lr lrVar = this.zzo;
        return lrVar == null ? C1935lr.m12824G() : lrVar;
    }

    /* renamed from: G */
    public final C1825is mo10378G() {
        C1825is isVar = this.zzl;
        return isVar == null ? C1825is.m11227G() : isVar;
    }

    /* renamed from: J */
    public final String mo10379J() {
        return this.zzg;
    }
}
