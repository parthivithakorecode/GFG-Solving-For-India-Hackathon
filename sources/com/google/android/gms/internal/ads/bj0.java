package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import p054h1.C2694t;

final class bj0 implements Callable<aj0> {

    /* renamed from: a */
    final /* synthetic */ Context f4957a;

    /* renamed from: b */
    final /* synthetic */ dj0 f4958b;

    bj0(dj0 dj0, Context context) {
        this.f4958b = dj0;
        this.f4957a = context;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        cj0 cj0 = (cj0) this.f4958b.f5823a.get(this.f4957a);
        aj0 a = (cj0 == null || cj0.f5426a + s20.f14221a.mo9928e().longValue() < C2694t.m21592a().mo12462a()) ? new zi0(this.f4957a).mo12227a() : new zi0(this.f4957a, cj0.f5427b).mo12227a();
        this.f4958b.f5823a.put(this.f4957a, new cj0(this.f4958b, a));
        return a;
    }
}
