package com.google.android.gms.internal.ads;

public final class tk3 extends aq3<tk3, sk3> implements lr3 {
    /* access modifiers changed from: private */
    public static final tk3 zzb;
    private String zze = "";
    /* access modifiers changed from: private */
    public uo3 zzf = uo3.f15667g;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        tk3 tk3 = new tk3();
        zzb = tk3;
        aq3.m6218v(tk3.class, tk3);
    }

    private tk3() {
    }

    /* renamed from: F */
    public static sk3 m17323F() {
        return (sk3) zzb.mo5400x();
    }

    /* renamed from: H */
    public static tk3 m17325H() {
        return zzb;
    }

    /* renamed from: K */
    static /* synthetic */ void m17326K(tk3 tk3, String str) {
        str.getClass();
        tk3.zze = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new tk3();
        } else {
            if (i2 == 4) {
                return new sk3((rk3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: I */
    public final uo3 mo11010I() {
        return this.zzf;
    }

    /* renamed from: J */
    public final String mo11011J() {
        return this.zze;
    }

    /* renamed from: M */
    public final int mo11012M() {
        int b = vl3.m18596b(this.zzg);
        if (b == 0) {
            return 1;
        }
        return b;
    }
}
