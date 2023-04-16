package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.o5 */
public final class C2024o5 {

    /* renamed from: a */
    private int f11885a = 2500;

    /* renamed from: b */
    private int f11886b;

    /* renamed from: a */
    public final int mo9656a() {
        return this.f11886b;
    }

    /* renamed from: b */
    public final int mo9657b() {
        return this.f11885a;
    }

    /* renamed from: c */
    public final void mo9658c(C1877k6 k6Var) {
        int i = this.f11886b + 1;
        this.f11886b = i;
        int i2 = this.f11885a;
        this.f11885a = i2 + ((int) ((float) i2));
        if (i > 1) {
            throw k6Var;
        }
    }
}
