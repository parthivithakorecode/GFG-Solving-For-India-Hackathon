package com.google.android.gms.internal.ads;

public final class gl3 extends aq3<gl3, dl3> implements lr3 {
    /* access modifiers changed from: private */
    public static final gl3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private jq3<fl3> zzf = aq3.m6214r();

    static {
        gl3 gl3 = new gl3();
        zzb = gl3;
        aq3.m6218v(gl3.class, gl3);
    }

    private gl3() {
    }

    /* renamed from: F */
    public static dl3 m9834F() {
        return (dl3) zzb.mo5400x();
    }

    /* renamed from: I */
    static /* synthetic */ void m9837I(gl3 gl3, fl3 fl3) {
        fl3.getClass();
        jq3<fl3> jq3 = gl3.zzf;
        if (!jq3.mo6246c()) {
            gl3.zzf = aq3.m6215s(jq3);
        }
        gl3.zzf.add(fl3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", fl3.class});
        } else if (i2 == 3) {
            return new gl3();
        } else {
            if (i2 == 4) {
                return new dl3((cl3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
