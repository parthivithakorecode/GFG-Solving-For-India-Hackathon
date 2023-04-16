package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class s30 {

    /* renamed from: a */
    private static final AtomicReference<q30> f14240a = new AtomicReference<>();

    /* renamed from: b */
    private static final AtomicReference<r30> f14241b = new AtomicReference<>();

    /* renamed from: c */
    static final AtomicBoolean f14242c = new AtomicBoolean();

    /* renamed from: a */
    static q30 m16606a() {
        return f14240a.get();
    }

    /* renamed from: b */
    static r30 m16607b() {
        return f14241b.get();
    }

    /* renamed from: c */
    public static void m16608c(q30 q30) {
        f14240a.set(q30);
    }
}
