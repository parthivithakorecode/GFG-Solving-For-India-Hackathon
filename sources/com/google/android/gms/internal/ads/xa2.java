package com.google.android.gms.internal.ads;

import android.view.View;
import javax.annotation.concurrent.GuardedBy;
import p054h1.C2680f;

public final class xa2 implements C2680f {
    @GuardedBy("this")

    /* renamed from: a */
    private C2680f f17099a;

    /* renamed from: a */
    public final synchronized void mo5214a() {
        C2680f fVar = this.f17099a;
        if (fVar != null) {
            fVar.mo5214a();
        }
    }

    /* renamed from: b */
    public final synchronized void mo5215b(View view) {
        C2680f fVar = this.f17099a;
        if (fVar != null) {
            fVar.mo5215b(view);
        }
    }

    /* renamed from: c */
    public final synchronized void mo5216c() {
        C2680f fVar = this.f17099a;
        if (fVar != null) {
            fVar.mo5216c();
        }
    }

    /* renamed from: d */
    public final synchronized void mo11790d(C2680f fVar) {
        this.f17099a = fVar;
    }
}
