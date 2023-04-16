package com.google.android.gms.internal.ads;

public final class nh3 extends aq3<nh3, mh3> implements lr3 {
    /* access modifiers changed from: private */
    public static final nh3 zzb;
    private th3 zze;
    private jk3 zzf;

    static {
        nh3 nh3 = new nh3();
        zzb = nh3;
        aq3.m6218v(nh3.class, nh3);
    }

    private nh3() {
    }

    /* renamed from: F */
    public static mh3 m13924F() {
        return (mh3) zzb.mo5400x();
    }

    /* renamed from: H */
    public static nh3 m13926H(uo3 uo3, mp3 mp3) {
        return (nh3) aq3.m6207C(zzb, uo3, mp3);
    }

    /* renamed from: K */
    static /* synthetic */ void m13927K(nh3 nh3, th3 th3) {
        th3.getClass();
        nh3.zze = th3;
    }

    /* renamed from: L */
    static /* synthetic */ void m13928L(nh3 nh3, jk3 jk3) {
        jk3.getClass();
        nh3.zzf = jk3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new nh3();
        } else {
            if (i2 == 4) {
                return new mh3((lh3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: I */
    public final th3 mo9529I() {
        th3 th3 = this.zze;
        return th3 == null ? th3.m17275I() : th3;
    }

    /* renamed from: J */
    public final jk3 mo9530J() {
        jk3 jk3 = this.zzf;
        return jk3 == null ? jk3.m11702I() : jk3;
    }
}
