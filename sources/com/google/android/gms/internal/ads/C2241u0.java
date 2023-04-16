package com.google.android.gms.internal.ads;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.ads.u0 */
final class C2241u0 implements C2167s0 {

    /* renamed from: a */
    private final int f15294a;

    /* renamed from: b */
    private final int f15295b;

    /* renamed from: c */
    private final dr2 f15296c;

    public C2241u0(C2056p0 p0Var, C1574c0 c0Var) {
        dr2 dr2 = p0Var.f12391b;
        this.f15296c = dr2;
        dr2.mo6580f(12);
        int v = dr2.mo6596v();
        if ("audio/raw".equals(c0Var.f5234l)) {
            int S = n13.m13614S(c0Var.f5217A, c0Var.f5247y);
            if (v == 0 || v % S != 0) {
                StringBuilder sb = new StringBuilder(88);
                sb.append("Audio sample size mismatch. stsd sample size: ");
                sb.append(S);
                sb.append(", stsz sample size: ");
                sb.append(v);
                Log.w("AtomParsers", sb.toString());
                v = S;
            }
        }
        this.f15294a = v == 0 ? -1 : v;
        this.f15295b = dr2.mo6596v();
    }

    /* renamed from: a */
    public final int mo10695a() {
        return this.f15295b;
    }

    /* renamed from: c */
    public final int mo10696c() {
        int i = this.f15294a;
        return i == -1 ? this.f15296c.mo6596v() : i;
    }

    public final int zza() {
        return this.f15294a;
    }
}
