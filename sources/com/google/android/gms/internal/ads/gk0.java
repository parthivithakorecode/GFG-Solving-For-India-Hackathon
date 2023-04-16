package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class gk0 {

    /* renamed from: d */
    public static final my3<gk0> f7514d = fj0.f6834a;

    /* renamed from: a */
    public final int f7515a = 1;

    /* renamed from: b */
    private final C1574c0[] f7516b;

    /* renamed from: c */
    private int f7517c;

    public gk0(C1574c0... c0VarArr) {
        this.f7516b = c0VarArr;
        m9811c(c0VarArr[0].f5225c);
        int i = c0VarArr[0].f5227e;
    }

    /* renamed from: c */
    private static String m9811c(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    /* renamed from: a */
    public final int mo7651a(C1574c0 c0Var) {
        for (int i = 0; i <= 0; i++) {
            if (c0Var == this.f7516b[i]) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final C1574c0 mo7652b(int i) {
        return this.f7516b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && gk0.class == obj.getClass() && Arrays.equals(this.f7516b, ((gk0) obj).f7516b);
    }

    public final int hashCode() {
        int i = this.f7517c;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f7516b) + 527;
        this.f7517c = hashCode;
        return hashCode;
    }
}
