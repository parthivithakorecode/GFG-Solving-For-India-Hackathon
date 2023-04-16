package com.google.android.gms.internal.ads;

public final class xx2 extends aq3<xx2, wx2> implements lr3 {
    /* access modifiers changed from: private */
    public static final xx2 zzb;
    private tx2 zze;

    static {
        xx2 xx2 = new xx2();
        zzb = xx2;
        aq3.m6218v(xx2.class, xx2);
    }

    private xx2() {
    }

    /* renamed from: F */
    public static wx2 m19728F() {
        return (wx2) zzb.mo5400x();
    }

    /* renamed from: H */
    static /* synthetic */ void m19730H(xx2 xx2, tx2 tx2) {
        tx2.getClass();
        xx2.zze = tx2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0000\u0001\u0000\u0000\u0006\u0006\u0001\u0000\u0000\u0000\u0006\t", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new xx2();
        } else {
            if (i2 == 4) {
                return new wx2((ux2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
