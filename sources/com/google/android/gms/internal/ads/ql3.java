package com.google.android.gms.internal.ads;

public final class ql3 extends aq3<ql3, pl3> implements lr3 {
    /* access modifiers changed from: private */
    public static final ql3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private tl3 zzf;

    static {
        ql3 ql3 = new ql3();
        zzb = ql3;
        aq3.m6218v(ql3.class, ql3);
    }

    private ql3() {
    }

    /* renamed from: G */
    public static pl3 m15698G() {
        return (pl3) zzb.mo5400x();
    }

    /* renamed from: I */
    public static ql3 m15700I(uo3 uo3, mp3 mp3) {
        return (ql3) aq3.m6207C(zzb, uo3, mp3);
    }

    /* renamed from: L */
    static /* synthetic */ void m15702L(ql3 ql3, tl3 tl3) {
        tl3.getClass();
        ql3.zzf = tl3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new ql3();
        } else {
            if (i2 == 4) {
                return new pl3((ol3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo10321F() {
        return this.zze;
    }

    /* renamed from: J */
    public final tl3 mo10322J() {
        tl3 tl3 = this.zzf;
        return tl3 == null ? tl3.m17342H() : tl3;
    }
}
