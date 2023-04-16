package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.uf */
public final class C2256uf {

    /* renamed from: a */
    private final Handler f15536a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2293vf f15537b;

    public C2256uf(Handler handler, C2293vf vfVar) {
        Objects.requireNonNull(handler);
        this.f15536a = handler;
        this.f15537b = vfVar;
    }

    /* renamed from: b */
    public final void mo11212b(int i) {
        this.f15536a.post(new C2219tf(this, i));
    }

    /* renamed from: c */
    public final void mo11213c(int i, long j, long j2) {
        this.f15536a.post(new C2108qf(this, i, j, j2));
    }

    /* renamed from: d */
    public final void mo11214d(String str, long j, long j2) {
        this.f15536a.post(new C2034of(this, str, j, j2));
    }

    /* renamed from: e */
    public final void mo11215e(C2220tg tgVar) {
        this.f15536a.post(new C2182sf(this, tgVar));
    }

    /* renamed from: f */
    public final void mo11216f(C2220tg tgVar) {
        this.f15536a.post(new C1997nf(this, tgVar));
    }

    /* renamed from: g */
    public final void mo11217g(C2367xe xeVar) {
        this.f15536a.post(new C2071pf(this, xeVar));
    }
}
