package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.d6 */
public final class C1617d6 {

    /* renamed from: a */
    private final AtomicInteger f5655a = new AtomicInteger();

    /* renamed from: b */
    private final Set<C1506a6<?>> f5656b = new HashSet();

    /* renamed from: c */
    private final PriorityBlockingQueue<C1506a6<?>> f5657c = new PriorityBlockingQueue<>();

    /* renamed from: d */
    private final PriorityBlockingQueue<C1506a6<?>> f5658d = new PriorityBlockingQueue<>();

    /* renamed from: e */
    private final C1876k5 f5659e;

    /* renamed from: f */
    private final C2209t5 f5660f;

    /* renamed from: g */
    private final C2246u5[] f5661g;

    /* renamed from: h */
    private C1950m5 f5662h;

    /* renamed from: i */
    private final List<C1580c6> f5663i = new ArrayList();

    /* renamed from: j */
    private final List<C1543b6> f5664j = new ArrayList();

    /* renamed from: k */
    private final C2135r5 f5665k;

    public C1617d6(C1876k5 k5Var, C2209t5 t5Var, int i) {
        C2135r5 r5Var = new C2135r5(new Handler(Looper.getMainLooper()));
        this.f5659e = k5Var;
        this.f5660f = t5Var;
        this.f5661g = new C2246u5[4];
        this.f5665k = r5Var;
    }

    /* renamed from: a */
    public final <T> C1506a6<T> mo6393a(C1506a6<T> a6Var) {
        a6Var.mo5115g(this);
        synchronized (this.f5656b) {
            this.f5656b.add(a6Var);
        }
        a6Var.mo5116h(this.f5655a.incrementAndGet());
        a6Var.mo5121n("add-to-queue");
        mo6395c(a6Var, 0);
        this.f5657c.add(a6Var);
        return a6Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final <T> void mo6394b(C1506a6<T> a6Var) {
        synchronized (this.f5656b) {
            this.f5656b.remove(a6Var);
        }
        synchronized (this.f5663i) {
            for (C1580c6 zza : this.f5663i) {
                zza.zza();
            }
        }
        mo6395c(a6Var, 5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo6395c(C1506a6<?> a6Var, int i) {
        synchronized (this.f5664j) {
            for (C1543b6 zza : this.f5664j) {
                zza.zza();
            }
        }
    }

    /* renamed from: d */
    public final void mo6396d() {
        C1950m5 m5Var = this.f5662h;
        if (m5Var != null) {
            m5Var.mo9129b();
        }
        C2246u5[] u5VarArr = this.f5661g;
        for (int i = 0; i < 4; i++) {
            C2246u5 u5Var = u5VarArr[i];
            if (u5Var != null) {
                u5Var.mo11160a();
            }
        }
        C1950m5 m5Var2 = new C1950m5(this.f5657c, this.f5658d, this.f5659e, this.f5665k, (C2135r5) null);
        this.f5662h = m5Var2;
        m5Var2.start();
        for (int i2 = 0; i2 < 4; i2++) {
            C2246u5 u5Var2 = new C2246u5(this.f5658d, this.f5660f, this.f5659e, this.f5665k, (C2135r5) null);
            this.f5661g[i2] = u5Var2;
            u5Var2.start();
        }
    }
}
