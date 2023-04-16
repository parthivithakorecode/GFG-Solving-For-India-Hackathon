package com.google.android.gms.internal.ads;

public final class al3 extends aq3<al3, zk3> implements lr3 {
    /* access modifiers changed from: private */
    public static final al3 zzb;
    private qk3 zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        al3 al3 = new al3();
        zzb = al3;
        aq3.m6218v(al3.class, al3);
    }

    private al3() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new al3();
        } else {
            if (i2 == 4) {
                return new zk3((xk3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo5313F() {
        return this.zzg;
    }

    /* renamed from: G */
    public final qk3 mo5314G() {
        qk3 qk3 = this.zze;
        return qk3 == null ? qk3.m15687H() : qk3;
    }

    /* renamed from: I */
    public final boolean mo5315I() {
        return this.zze != null;
    }

    /* renamed from: J */
    public final int mo5316J() {
        int i = this.zzf;
        int i2 = 3;
        if (i == 0) {
            i2 = 2;
        } else if (i != 1) {
            i2 = i != 2 ? i != 3 ? 0 : 5 : 4;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    /* renamed from: K */
    public final int mo5317K() {
        int b = vl3.m18596b(this.zzh);
        if (b == 0) {
            return 1;
        }
        return b;
    }
}
