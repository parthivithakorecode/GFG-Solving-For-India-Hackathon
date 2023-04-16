package com.google.android.gms.internal.ads;

import java.util.List;

public final class pu3 extends aq3<pu3, qt3> implements lr3 {
    /* access modifiers changed from: private */
    public static final pu3 zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private tt3 zzk;
    private jq3<mu3> zzl = aq3.m6214r();
    private String zzm = "";
    private gu3 zzn;
    private boolean zzo;
    private jq3<String> zzp = aq3.m6214r();
    private String zzq = "";
    private boolean zzr;
    private boolean zzs;
    private uo3 zzt = uo3.f15667g;
    private ou3 zzu;
    private jq3<String> zzv = aq3.m6214r();
    private jq3<String> zzw = aq3.m6214r();
    private byte zzx = 2;

    static {
        pu3 pu3 = new pu3();
        zzb = pu3;
        aq3.m6218v(pu3.class, pu3);
    }

    private pu3() {
    }

    /* renamed from: F */
    public static qt3 m15268F() {
        return (qt3) zzb.mo5400x();
    }

    /* renamed from: K */
    static /* synthetic */ void m15270K(pu3 pu3, String str) {
        str.getClass();
        pu3.zze |= 4;
        pu3.zzh = str;
    }

    /* renamed from: L */
    static /* synthetic */ void m15271L(pu3 pu3, String str) {
        str.getClass();
        pu3.zze |= 8;
        pu3.zzi = str;
    }

    /* renamed from: M */
    static /* synthetic */ void m15272M(pu3 pu3, tt3 tt3) {
        tt3.getClass();
        pu3.zzk = tt3;
        pu3.zze |= 32;
    }

    /* renamed from: N */
    static /* synthetic */ void m15273N(pu3 pu3, mu3 mu3) {
        mu3.getClass();
        jq3<mu3> jq3 = pu3.zzl;
        if (!jq3.mo6246c()) {
            pu3.zzl = aq3.m6215s(jq3);
        }
        pu3.zzl.add(mu3);
    }

    /* renamed from: O */
    static /* synthetic */ void m15274O(pu3 pu3, String str) {
        pu3.zze |= 64;
        pu3.zzm = str;
    }

    /* renamed from: P */
    static /* synthetic */ void m15275P(pu3 pu3) {
        pu3.zze &= -65;
        pu3.zzm = zzb.zzm;
    }

    /* renamed from: Q */
    static /* synthetic */ void m15276Q(pu3 pu3, gu3 gu3) {
        gu3.getClass();
        pu3.zzn = gu3;
        pu3.zze |= 128;
    }

    /* renamed from: R */
    static /* synthetic */ void m15277R(pu3 pu3, ou3 ou3) {
        ou3.getClass();
        pu3.zzu = ou3;
        pu3.zze |= 8192;
    }

    /* renamed from: S */
    static /* synthetic */ void m15278S(pu3 pu3, Iterable iterable) {
        jq3<String> jq3 = pu3.zzv;
        if (!jq3.mo6246c()) {
            pu3.zzv = aq3.m6215s(jq3);
        }
        bo3.m7003j(iterable, pu3.zzv);
    }

    /* renamed from: T */
    static /* synthetic */ void m15279T(pu3 pu3, Iterable iterable) {
        jq3<String> jq3 = pu3.zzw;
        if (!jq3.mo6246c()) {
            pu3.zzw = aq3.m6215s(jq3);
        }
        bo3.m7003j(iterable, pu3.zzw);
    }

    /* renamed from: U */
    static /* synthetic */ void m15280U(pu3 pu3, int i) {
        pu3.zzf = i - 1;
        pu3.zze |= 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzx);
        }
        byte b = 1;
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0012\u0000\u0001\u0001\u0015\u0012\u0000\u0004\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\nဌ\u0000\u000bဌ\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0011ဉ\r\u0014\u001a\u0015\u001a", new Object[]{"zze", "zzh", "zzi", "zzj", "zzl", mu3.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zzf", hu3.f8429a, "zzg", pt3.f12801a, "zzk", "zzm", "zzn", "zzt", "zzu", "zzv", "zzw"});
        } else if (i2 == 3) {
            return new pu3();
        } else {
            if (i2 == 4) {
                return new qt3((ot3) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzx = b;
            return null;
        }
    }

    /* renamed from: H */
    public final String mo10177H() {
        return this.zzm;
    }

    /* renamed from: I */
    public final String mo10178I() {
        return this.zzh;
    }

    /* renamed from: J */
    public final List<mu3> mo10179J() {
        return this.zzl;
    }
}
