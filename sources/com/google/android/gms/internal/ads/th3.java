package com.google.android.gms.internal.ads;

public final class th3 extends aq3<th3, sh3> implements lr3 {
    /* access modifiers changed from: private */
    public static final th3 zzb;
    private wh3 zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        th3 th3 = new th3();
        zzb = th3;
        aq3.m6218v(th3.class, th3);
    }

    private th3() {
    }

    /* renamed from: G */
    public static sh3 m17273G() {
        return (sh3) zzb.mo5400x();
    }

    /* renamed from: I */
    public static th3 m17275I() {
        return zzb;
    }

    /* renamed from: J */
    public static th3 m17276J(uo3 uo3, mp3 mp3) {
        return (th3) aq3.m6207C(zzb, uo3, mp3);
    }

    /* renamed from: L */
    static /* synthetic */ void m17277L(th3 th3, wh3 wh3) {
        wh3.getClass();
        th3.zze = wh3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new th3();
        } else {
            if (i2 == 4) {
                return new sh3((rh3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo10988F() {
        return this.zzf;
    }

    /* renamed from: K */
    public final wh3 mo10989K() {
        wh3 wh3 = this.zze;
        return wh3 == null ? wh3.m18992I() : wh3;
    }
}
