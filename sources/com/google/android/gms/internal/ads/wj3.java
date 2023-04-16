package com.google.android.gms.internal.ads;

public final class wj3 extends aq3<wj3, vj3> implements lr3 {
    /* access modifiers changed from: private */
    public static final wj3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private qj3 zzf;
    /* access modifiers changed from: private */
    public uo3 zzg;
    /* access modifiers changed from: private */
    public uo3 zzh;

    static {
        wj3 wj3 = new wj3();
        zzb = wj3;
        aq3.m6218v(wj3.class, wj3);
    }

    private wj3() {
        uo3 uo3 = uo3.f15667g;
        this.zzg = uo3;
        this.zzh = uo3;
    }

    /* renamed from: H */
    public static vj3 m19005H() {
        return (vj3) zzb.mo5400x();
    }

    /* renamed from: J */
    public static wj3 m19007J() {
        return zzb;
    }

    /* renamed from: K */
    public static wj3 m19008K(uo3 uo3, mp3 mp3) {
        return (wj3) aq3.m6207C(zzb, uo3, mp3);
    }

    /* renamed from: O */
    static /* synthetic */ void m19010O(wj3 wj3, qj3 qj3) {
        qj3.getClass();
        wj3.zzf = qj3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new wj3();
        } else {
            if (i2 == 4) {
                return new vj3((uj3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo11662F() {
        return this.zze;
    }

    /* renamed from: G */
    public final qj3 mo11663G() {
        qj3 qj3 = this.zzf;
        return qj3 == null ? qj3.m15656I() : qj3;
    }

    /* renamed from: L */
    public final uo3 mo11664L() {
        return this.zzg;
    }

    /* renamed from: M */
    public final uo3 mo11665M() {
        return this.zzh;
    }
}
