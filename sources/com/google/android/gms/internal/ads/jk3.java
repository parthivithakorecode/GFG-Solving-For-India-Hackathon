package com.google.android.gms.internal.ads;

public final class jk3 extends aq3<jk3, ik3> implements lr3 {
    /* access modifiers changed from: private */
    public static final jk3 zzb;
    private nk3 zze;
    /* access modifiers changed from: private */
    public int zzf;
    private int zzg;

    static {
        jk3 jk3 = new jk3();
        zzb = jk3;
        aq3.m6218v(jk3.class, jk3);
    }

    private jk3() {
    }

    /* renamed from: G */
    public static ik3 m11700G() {
        return (ik3) zzb.mo5400x();
    }

    /* renamed from: I */
    public static jk3 m11702I() {
        return zzb;
    }

    /* renamed from: J */
    public static jk3 m11703J(uo3 uo3, mp3 mp3) {
        return (jk3) aq3.m6207C(zzb, uo3, mp3);
    }

    /* renamed from: L */
    static /* synthetic */ void m11704L(jk3 jk3, nk3 nk3) {
        nk3.getClass();
        jk3.zze = nk3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new jk3();
        } else {
            if (i2 == 4) {
                return new ik3((hk3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo8480F() {
        return this.zzf;
    }

    /* renamed from: K */
    public final nk3 mo8481K() {
        nk3 nk3 = this.zze;
        return nk3 == null ? nk3.m13965I() : nk3;
    }
}
