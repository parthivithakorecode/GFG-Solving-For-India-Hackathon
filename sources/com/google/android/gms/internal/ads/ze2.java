package com.google.android.gms.internal.ads;

import android.os.Bundle;
import p054h1.C2694t;
import p069j1.C3208t1;

public final class ze2 implements ij2 {

    /* renamed from: g */
    private static final Object f18171g = new Object();

    /* renamed from: a */
    private final String f18172a;

    /* renamed from: b */
    private final String f18173b;

    /* renamed from: c */
    private final k81 f18174c;

    /* renamed from: d */
    private final jt2 f18175d;

    /* renamed from: e */
    private final ks2 f18176e;

    /* renamed from: f */
    private final C3208t1 f18177f = C2694t.m21607p().mo11025h();

    public ze2(String str, String str2, k81 k81, jt2 jt2, ks2 ks2) {
        this.f18172a = str;
        this.f18173b = str2;
        this.f18174c = k81;
        this.f18175d = jt2;
        this.f18176e = ks2;
    }

    /* renamed from: a */
    public final cc3 mo5813a() {
        Bundle bundle = new Bundle();
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10437Z3)).booleanValue()) {
            this.f18174c.mo8637c(this.f18176e.f9639d);
            bundle.putAll(this.f18175d.mo8540a());
        }
        return rb3.m16131i(new ye2(this, bundle));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo12211b(Bundle bundle, Bundle bundle2) {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10437Z3)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10429Y3)).booleanValue()) {
                synchronized (f18171g) {
                    this.f18174c.mo8637c(this.f18176e.f9639d);
                    bundle2.putBundle("quality_signals", this.f18175d.mo8540a());
                }
            } else {
                this.f18174c.mo8637c(this.f18176e.f9639d);
                bundle2.putBundle("quality_signals", this.f18175d.mo8540a());
            }
        }
        bundle2.putString("seq_num", this.f18172a);
        bundle2.putString("session_id", this.f18177f.mo14078J() ? "" : this.f18173b);
    }
}
