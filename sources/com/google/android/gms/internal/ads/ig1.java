package com.google.android.gms.internal.ads;

import p054h1.C2694t;
import p069j1.C3202r1;

public final /* synthetic */ class ig1 implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ kg1 f8648f;

    /* renamed from: g */
    public final /* synthetic */ Object f8649g;

    public /* synthetic */ ig1(kg1 kg1, Object obj) {
        this.f8648f = kg1;
        this.f8649g = obj;
    }

    public final void run() {
        try {
            this.f8648f.mo5213c(this.f8649g);
        } catch (Throwable th) {
            C2694t.m21607p().mo11033r(th, "EventEmitter.notify");
            C3202r1.m24016l("Event emitter exception.", th);
        }
    }
}
