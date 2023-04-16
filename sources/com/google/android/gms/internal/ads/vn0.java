package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import javax.annotation.concurrent.GuardedBy;

public final class vn0 {
    @GuardedBy("this")

    /* renamed from: a */
    private BigInteger f16366a = BigInteger.ONE;
    @GuardedBy("this")

    /* renamed from: b */
    private String f16367b = "0";

    /* renamed from: a */
    public final synchronized String mo11500a() {
        String bigInteger;
        bigInteger = this.f16366a.toString();
        this.f16366a = this.f16366a.add(BigInteger.ONE);
        this.f16367b = bigInteger;
        return bigInteger;
    }

    /* renamed from: b */
    public final synchronized String mo11501b() {
        return this.f16367b;
    }
}
