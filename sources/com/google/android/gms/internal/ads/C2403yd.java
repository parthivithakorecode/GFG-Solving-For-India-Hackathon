package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yd */
public final class C2403yd extends aq3<C2403yd, C2366xd> implements lr3 {
    /* access modifiers changed from: private */
    public static final C2403yd zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private long zzi;
    private long zzj;

    static {
        C2403yd ydVar = new C2403yd();
        zzb = ydVar;
        aq3.m6218v(C2403yd.class, ydVar);
    }

    private C2403yd() {
    }

    /* renamed from: I */
    public static C2366xd m19956I() {
        return (C2366xd) zzb.mo5400x();
    }

    /* renamed from: K */
    public static C2403yd m19958K() {
        return zzb;
    }

    /* renamed from: L */
    public static C2403yd m19959L(uo3 uo3) {
        return (C2403yd) aq3.m6205A(zzb, uo3);
    }

    /* renamed from: M */
    public static C2403yd m19960M(uo3 uo3, mp3 mp3) {
        return (C2403yd) aq3.m6207C(zzb, uo3, mp3);
    }

    /* renamed from: P */
    static /* synthetic */ void m19961P(C2403yd ydVar, String str) {
        str.getClass();
        ydVar.zze |= 1;
        ydVar.zzf = str;
    }

    /* renamed from: Q */
    static /* synthetic */ void m19962Q(C2403yd ydVar, long j) {
        ydVar.zze |= 16;
        ydVar.zzj = j;
    }

    /* renamed from: R */
    static /* synthetic */ void m19963R(C2403yd ydVar, String str) {
        str.getClass();
        ydVar.zze |= 2;
        ydVar.zzg = str;
    }

    /* renamed from: S */
    static /* synthetic */ void m19964S(C2403yd ydVar, long j) {
        ydVar.zze |= 4;
        ydVar.zzh = j;
    }

    /* renamed from: T */
    static /* synthetic */ void m19965T(C2403yd ydVar, long j) {
        ydVar.zze |= 8;
        ydVar.zzi = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new C2403yd();
        } else {
            if (i2 == 4) {
                return new C2366xd((C2329wd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final long mo11990F() {
        return this.zzi;
    }

    /* renamed from: G */
    public final long mo11991G() {
        return this.zzh;
    }

    /* renamed from: H */
    public final long mo11992H() {
        return this.zzj;
    }

    /* renamed from: N */
    public final String mo11993N() {
        return this.zzg;
    }

    /* renamed from: O */
    public final String mo11994O() {
        return this.zzf;
    }
}
