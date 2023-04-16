package com.google.android.gms.internal.ads;

import java.util.Objects;

public abstract class q84 {

    /* renamed from: a */
    private p84 f13097a;

    /* renamed from: b */
    private a94 f13098b;

    /* renamed from: a */
    public abstract r84 mo9700a(yx3[] yx3Arr, hm0 hm0, s54 s54, ei0 ei0);

    /* renamed from: b */
    public abstract void mo9701b(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final a94 mo10258c() {
        a94 a94 = this.f13098b;
        Objects.requireNonNull(a94);
        return a94;
    }

    /* renamed from: d */
    public final void mo10259d(p84 p84, a94 a94) {
        this.f13097a = p84;
        this.f13098b = a94;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo10260e() {
        p84 p84 = this.f13097a;
        if (p84 != null) {
            p84.mo5561i();
        }
    }
}
