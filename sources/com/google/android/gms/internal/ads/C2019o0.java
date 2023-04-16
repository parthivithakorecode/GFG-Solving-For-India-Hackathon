package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.o0 */
final class C2019o0 extends C2093q0 {

    /* renamed from: b */
    public final long f11786b;

    /* renamed from: c */
    public final List<C2056p0> f11787c = new ArrayList();

    /* renamed from: d */
    public final List<C2019o0> f11788d = new ArrayList();

    public C2019o0(int i, long j) {
        super(i);
        this.f11786b = j;
    }

    /* renamed from: c */
    public final C2019o0 mo9618c(int i) {
        int size = this.f11788d.size();
        for (int i2 = 0; i2 < size; i2++) {
            C2019o0 o0Var = this.f11788d.get(i2);
            if (o0Var.f12974a == i) {
                return o0Var;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final C2056p0 mo9619d(int i) {
        int size = this.f11787c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C2056p0 p0Var = this.f11787c.get(i2);
            if (p0Var.f12974a == i) {
                return p0Var;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void mo9620e(C2019o0 o0Var) {
        this.f11788d.add(o0Var);
    }

    /* renamed from: f */
    public final void mo9621f(C2056p0 p0Var) {
        this.f11787c.add(p0Var);
    }

    public final String toString() {
        String b = C2093q0.m15346b(this.f12974a);
        String arrays = Arrays.toString(this.f11787c.toArray());
        String arrays2 = Arrays.toString(this.f11788d.toArray());
        int length = String.valueOf(arrays).length();
        StringBuilder sb = new StringBuilder(b.length() + 22 + length + String.valueOf(arrays2).length());
        sb.append(b);
        sb.append(" leaves: ");
        sb.append(arrays);
        sb.append(" containers: ");
        sb.append(arrays2);
        return sb.toString();
    }
}
