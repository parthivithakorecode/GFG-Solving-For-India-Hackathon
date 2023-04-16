package com.google.android.gms.internal.ads;

import java.util.Objects;

public final class de3 {

    /* renamed from: a */
    public final String f5777a;

    /* renamed from: b */
    public final C1574c0 f5778b;

    /* renamed from: c */
    public final C1574c0 f5779c;

    /* renamed from: d */
    public final int f5780d;

    /* renamed from: e */
    public final int f5781e;

    public de3(String str, C1574c0 c0Var, C1574c0 c0Var2, int i, int i2) {
        boolean z = false;
        if (i != 0) {
            i2 = i2 == 0 ? 0 : i2;
            wu1.m19205d(z);
            wu1.m19204c(str);
            this.f5777a = str;
            Objects.requireNonNull(c0Var);
            this.f5778b = c0Var;
            Objects.requireNonNull(c0Var2);
            this.f5779c = c0Var2;
            this.f5780d = i;
            this.f5781e = i2;
        }
        z = true;
        wu1.m19205d(z);
        wu1.m19204c(str);
        this.f5777a = str;
        Objects.requireNonNull(c0Var);
        this.f5778b = c0Var;
        Objects.requireNonNull(c0Var2);
        this.f5779c = c0Var2;
        this.f5780d = i;
        this.f5781e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && de3.class == obj.getClass()) {
            de3 de3 = (de3) obj;
            return this.f5780d == de3.f5780d && this.f5781e == de3.f5781e && this.f5777a.equals(de3.f5777a) && this.f5778b.equals(de3.f5778b) && this.f5779c.equals(de3.f5779c);
        }
    }

    public final int hashCode() {
        return ((((((((this.f5780d + 527) * 31) + this.f5781e) * 31) + this.f5777a.hashCode()) * 31) + this.f5778b.hashCode()) * 31) + this.f5779c.hashCode();
    }
}
