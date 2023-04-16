package com.google.android.gms.internal.ads;

public final class nj3 extends aq3<nj3, mj3> implements lr3 {
    /* access modifiers changed from: private */
    public static final nj3 zzb;
    private qj3 zze;

    static {
        nj3 nj3 = new nj3();
        zzb = nj3;
        aq3.m6218v(nj3.class, nj3);
    }

    private nj3() {
    }

    /* renamed from: F */
    public static mj3 m13952F() {
        return (mj3) zzb.mo5400x();
    }

    /* renamed from: H */
    public static nj3 m13954H(uo3 uo3, mp3 mp3) {
        return (nj3) aq3.m6207C(zzb, uo3, mp3);
    }

    /* renamed from: J */
    static /* synthetic */ void m13955J(nj3 nj3, qj3 qj3) {
        qj3.getClass();
        nj3.zze = qj3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new nj3();
        } else {
            if (i2 == 4) {
                return new mj3((lj3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: I */
    public final qj3 mo9542I() {
        qj3 qj3 = this.zze;
        return qj3 == null ? qj3.m15656I() : qj3;
    }
}
