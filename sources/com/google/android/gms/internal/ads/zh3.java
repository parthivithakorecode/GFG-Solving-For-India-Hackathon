package com.google.android.gms.internal.ads;

public final class zh3 extends aq3<zh3, yh3> implements lr3 {
    /* access modifiers changed from: private */
    public static final zh3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private fi3 zzf;
    /* access modifiers changed from: private */
    public uo3 zzg = uo3.f15667g;

    static {
        zh3 zh3 = new zh3();
        zzb = zh3;
        aq3.m6218v(zh3.class, zh3);
    }

    private zh3() {
    }

    /* renamed from: G */
    public static yh3 m20652G() {
        return (yh3) zzb.mo5400x();
    }

    /* renamed from: I */
    public static zh3 m20654I(uo3 uo3, mp3 mp3) {
        return (zh3) aq3.m6207C(zzb, uo3, mp3);
    }

    /* renamed from: M */
    static /* synthetic */ void m20656M(zh3 zh3, fi3 fi3) {
        fi3.getClass();
        zh3.zzf = fi3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zh3();
        } else {
            if (i2 == 4) {
                return new yh3((xh3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo12221F() {
        return this.zze;
    }

    /* renamed from: J */
    public final fi3 mo12222J() {
        fi3 fi3 = this.zzf;
        return fi3 == null ? fi3.m9179I() : fi3;
    }

    /* renamed from: K */
    public final uo3 mo12223K() {
        return this.zzg;
    }
}
