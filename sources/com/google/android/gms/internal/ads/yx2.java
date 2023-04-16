package com.google.android.gms.internal.ads;

public final class yx2 extends aq3<yx2, vx2> implements lr3 {
    /* access modifiers changed from: private */
    public static final yx2 zzb;
    /* access modifiers changed from: private */
    public jq3<xx2> zze = aq3.m6214r();

    static {
        yx2 yx2 = new yx2();
        zzb = yx2;
        aq3.m6218v(yx2.class, yx2);
    }

    private yx2() {
    }

    /* renamed from: G */
    public static vx2 m20338G() {
        return (vx2) zzb.mo5400x();
    }

    /* renamed from: J */
    static /* synthetic */ void m20341J(yx2 yx2, xx2 xx2) {
        xx2.getClass();
        jq3<xx2> jq3 = yx2.zze;
        if (!jq3.mo6246c()) {
            yx2.zze = aq3.m6215s(jq3);
        }
        yx2.zze.add(xx2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", xx2.class});
        } else if (i2 == 3) {
            return new yx2();
        } else {
            if (i2 == 4) {
                return new vx2((ux2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo12106F() {
        return this.zze.size();
    }
}
