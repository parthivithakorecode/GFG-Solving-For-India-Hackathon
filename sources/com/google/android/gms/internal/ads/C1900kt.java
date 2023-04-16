package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.kt */
public final class C1900kt extends aq3<C1900kt, C1863jt> implements lr3 {
    private static final gq3<Integer, C2380xr> zzb = new C1826it();
    /* access modifiers changed from: private */
    public static final C1900kt zze;
    private int zzf;
    private long zzg;
    private int zzh;
    private long zzi;
    private long zzj;
    private fq3 zzk = aq3.m6211o();
    private C1715ft zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;

    static {
        C1900kt ktVar = new C1900kt();
        zze = ktVar;
        aq3.m6218v(C1900kt.class, ktVar);
    }

    private C1900kt() {
    }

    /* renamed from: F */
    static /* synthetic */ void m12384F(C1900kt ktVar, int i) {
        ktVar.zzo = i - 1;
        ktVar.zzf |= 128;
    }

    /* renamed from: G */
    static /* synthetic */ void m12385G(C1900kt ktVar, int i) {
        ktVar.zzq = i - 1;
        ktVar.zzf |= 512;
    }

    /* renamed from: M */
    public static C1863jt m12386M() {
        return (C1863jt) zze.mo5400x();
    }

    /* renamed from: O */
    public static C1900kt m12388O(byte[] bArr) {
        return (C1900kt) aq3.m6206B(zze, bArr);
    }

    /* renamed from: R */
    static /* synthetic */ void m12389R(C1900kt ktVar, long j) {
        ktVar.zzf |= 1;
        ktVar.zzg = j;
    }

    /* renamed from: S */
    static /* synthetic */ void m12390S(C1900kt ktVar, long j) {
        ktVar.zzf |= 4;
        ktVar.zzi = j;
    }

    /* renamed from: T */
    static /* synthetic */ void m12391T(C1900kt ktVar, long j) {
        ktVar.zzf |= 8;
        ktVar.zzj = j;
    }

    /* renamed from: U */
    static /* synthetic */ void m12392U(C1900kt ktVar, Iterable iterable) {
        fq3 fq3 = ktVar.zzk;
        if (!fq3.mo6246c()) {
            ktVar.zzk = aq3.m6212p(fq3);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ktVar.zzk.mo5918N(((C2380xr) it.next()).zza());
        }
    }

    /* renamed from: V */
    static /* synthetic */ void m12393V(C1900kt ktVar, C1715ft ftVar) {
        ftVar.getClass();
        ktVar.zzl = ftVar;
        ktVar.zzf |= 16;
    }

    /* renamed from: W */
    static /* synthetic */ void m12394W(C1900kt ktVar, int i) {
        ktVar.zzf |= 256;
        ktVar.zzp = i;
    }

    /* renamed from: X */
    static /* synthetic */ void m12395X(C1900kt ktVar, C2048ot otVar) {
        ktVar.zzr = otVar.zza();
        ktVar.zzf |= 1024;
    }

    /* renamed from: d0 */
    static /* synthetic */ void m12396d0(C1900kt ktVar, int i) {
        ktVar.zzh = i - 1;
        ktVar.zzf |= 2;
    }

    /* renamed from: e0 */
    static /* synthetic */ void m12397e0(C1900kt ktVar, int i) {
        ktVar.zzm = i - 1;
        ktVar.zzf |= 32;
    }

    /* renamed from: f0 */
    static /* synthetic */ void m12398f0(C1900kt ktVar, int i) {
        ktVar.zzn = i - 1;
        ktVar.zzf |= 64;
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
            return aq3.m6217u(zze, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001e\u0006ဉ\u0004\u0007ဌ\u0005\bဌ\u0006\tဌ\u0007\nင\b\u000bဌ\t\fဌ\n", new Object[]{"zzf", "zzg", "zzh", eq3, "zzi", "zzj", "zzk", C2380xr.m19633d(), "zzl", "zzm", eq3, "zzn", eq3, "zzo", eq3, "zzp", "zzq", eq3, "zzr", C2048ot.m14630d()});
        } else if (i2 == 3) {
            return new C1900kt();
        } else {
            if (i2 == 4) {
                return new C1863jt((C1750gr) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zze;
        }
    }

    /* renamed from: H */
    public final int mo8785H() {
        return this.zzp;
    }

    /* renamed from: I */
    public final long mo8786I() {
        return this.zzj;
    }

    /* renamed from: J */
    public final long mo8787J() {
        return this.zzi;
    }

    /* renamed from: K */
    public final long mo8788K() {
        return this.zzg;
    }

    /* renamed from: L */
    public final C1715ft mo8789L() {
        C1715ft ftVar = this.zzl;
        return ftVar == null ? C1715ft.m9282H() : ftVar;
    }

    /* renamed from: P */
    public final C2048ot mo8790P() {
        C2048ot b = C2048ot.m14629b(this.zzr);
        return b == null ? C2048ot.UNSPECIFIED : b;
    }

    /* renamed from: Q */
    public final List<C2380xr> mo8791Q() {
        return new hq3(this.zzk, zzb);
    }

    /* renamed from: Y */
    public final int mo8792Y() {
        int a = C2047os.m14624a(this.zzn);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: Z */
    public final int mo8793Z() {
        int a = C2047os.m14624a(this.zzo);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: a0 */
    public final int mo8794a0() {
        int a = C2047os.m14624a(this.zzq);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: b0 */
    public final int mo8795b0() {
        int a = C2047os.m14624a(this.zzh);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: c0 */
    public final int mo8796c0() {
        int a = C2047os.m14624a(this.zzm);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
