package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.o9 */
public final class C2028o9 extends aq3<C2028o9, C1991n9> implements lr3 {
    /* access modifiers changed from: private */
    public static final C2028o9 zzb;
    private int zze;
    private jq3<uo3> zzf = aq3.m6214r();
    private uo3 zzg = uo3.f15667g;
    private int zzh = 1;
    private int zzi = 1;

    static {
        C2028o9 o9Var = new C2028o9();
        zzb = o9Var;
        aq3.m6218v(C2028o9.class, o9Var);
    }

    private C2028o9() {
    }

    /* renamed from: F */
    public static C1991n9 m14365F() {
        return (C1991n9) zzb.mo5400x();
    }

    /* renamed from: H */
    static /* synthetic */ void m14367H(C2028o9 o9Var, uo3 uo3) {
        jq3<uo3> jq3 = o9Var.zzf;
        if (!jq3.mo6246c()) {
            o9Var.zzf = aq3.m6215s(jq3);
        }
        o9Var.zzf.add(uo3);
    }

    /* renamed from: I */
    static /* synthetic */ void m14368I(C2028o9 o9Var, uo3 uo3) {
        o9Var.zze |= 1;
        o9Var.zzg = uo3;
    }

    /* renamed from: J */
    static /* synthetic */ void m14369J(C2028o9 o9Var, int i) {
        o9Var.zzi = i - 1;
        o9Var.zze |= 4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh", C1769h9.f8113a, "zzi", C1695f9.f6757a});
        } else if (i2 == 3) {
            return new C2028o9();
        } else {
            if (i2 == 4) {
                return new C1991n9((C1805i8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
