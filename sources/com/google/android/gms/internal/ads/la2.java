package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import p054h1.C2680f;

public final class la2 implements C2680f {

    /* renamed from: a */
    private final ta1 f9965a;

    /* renamed from: b */
    private final ob1 f9966b;

    /* renamed from: c */
    private final ri1 f9967c;

    /* renamed from: d */
    private final ji1 f9968d;

    /* renamed from: e */
    private final b31 f9969e;

    /* renamed from: f */
    final AtomicBoolean f9970f = new AtomicBoolean(false);

    la2(ta1 ta1, ob1 ob1, ri1 ri1, ji1 ji1, b31 b31) {
        this.f9965a = ta1;
        this.f9966b = ob1;
        this.f9967c = ri1;
        this.f9968d = ji1;
        this.f9969e = b31;
    }

    /* renamed from: a */
    public final void mo5214a() {
        if (this.f9970f.get()) {
            this.f9965a.mo25L();
        }
    }

    /* renamed from: b */
    public final synchronized void mo5215b(View view) {
        if (this.f9970f.compareAndSet(false, true)) {
            this.f9969e.mo5153k();
            this.f9968d.mo8466S0(view);
        }
    }

    /* renamed from: c */
    public final void mo5216c() {
        if (this.f9970f.get()) {
            this.f9966b.zza();
            this.f9967c.zza();
        }
    }
}
