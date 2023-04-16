package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Future;
import javax.annotation.concurrent.GuardedBy;
import p054h1.C2694t;

/* renamed from: com.google.android.gms.internal.ads.wq */
public final class C2342wq {
    /* access modifiers changed from: private */
    @GuardedBy("lock")

    /* renamed from: a */
    public C1934lq f16905a;
    /* access modifiers changed from: private */
    @GuardedBy("lock")

    /* renamed from: b */
    public boolean f16906b;

    /* renamed from: c */
    private final Context f16907c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Object f16908d = new Object();

    C2342wq(Context context) {
        this.f16907c = context;
    }

    /* renamed from: e */
    static /* bridge */ /* synthetic */ void m19116e(C2342wq wqVar) {
        synchronized (wqVar.f16908d) {
            C1934lq lqVar = wqVar.f16905a;
            if (lqVar != null) {
                lqVar.mo184o();
                wqVar.f16905a = null;
                Binder.flushPendingCommands();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Future<C2416yq> mo11701c(C1971mq mqVar) {
        C2119qq qqVar = new C2119qq(this);
        C2267uq uqVar = new C2267uq(this, mqVar, qqVar);
        C2304vq vqVar = new C2304vq(this, qqVar);
        synchronized (this.f16908d) {
            C1934lq lqVar = new C1934lq(this.f16907c, C2694t.m21612u().mo13974b(), uqVar, vqVar);
            this.f16905a = lqVar;
            lqVar.mo186q();
        }
        return qqVar;
    }
}
