package com.google.android.gms.internal.ads;

import p026d1.C2475f;

public final class p60 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2475f.C2477b f12535a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2475f.C2476a f12536b;

    /* renamed from: c */
    private C2475f f12537c;

    public p60(C2475f.C2477b bVar, C2475f.C2476a aVar) {
        this.f12535a = bVar;
        this.f12536b = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final synchronized C2475f m14851f(e50 e50) {
        C2475f fVar = this.f12537c;
        if (fVar != null) {
            return fVar;
        }
        f50 f50 = new f50(e50);
        this.f12537c = f50;
        return f50;
    }

    /* renamed from: d */
    public final o50 mo9979d() {
        if (this.f12536b == null) {
            return null;
        }
        return new m60(this, (l60) null);
    }

    /* renamed from: e */
    public final r50 mo9980e() {
        return new o60(this, (n60) null);
    }
}
