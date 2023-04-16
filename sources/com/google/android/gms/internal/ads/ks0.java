package com.google.android.gms.internal.ads;

import p054h1.C2694t;
import p069j1.C3141b0;
import p069j1.C3163g2;

public final class ks0 extends C3141b0 {

    /* renamed from: c */
    final tq0 f9632c;

    /* renamed from: d */
    final ts0 f9633d;

    /* renamed from: e */
    private final String f9634e;

    /* renamed from: f */
    private final String[] f9635f;

    ks0(tq0 tq0, ts0 ts0, String str, String[] strArr) {
        this.f9632c = tq0;
        this.f9633d = ts0;
        this.f9634e = str;
        this.f9635f = strArr;
        C2694t.m21617z().mo9010i(this);
    }

    /* renamed from: a */
    public final void mo8780a() {
        try {
            this.f9633d.mo6295u(this.f9634e, this.f9635f);
        } finally {
            C3163g2.f20465i.post(new js0(this));
        }
    }

    /* renamed from: b */
    public final cc3<?> mo8781b() {
        return (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10621u1)).booleanValue() || !(this.f9633d instanceof ct0)) ? super.mo8781b() : wo0.f16890e.mo6445C(new is0(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ Boolean mo8782d() {
        return Boolean.valueOf(this.f9633d.mo6296v(this.f9634e, this.f9635f, this));
    }

    /* renamed from: e */
    public final String mo8783e() {
        return this.f9634e;
    }
}
