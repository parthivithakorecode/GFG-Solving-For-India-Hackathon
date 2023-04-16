package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p054h1.C2675a;

public final class or1 implements Callable<rr1> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2675a f12161a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ru0 f12162b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f12163c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final wv1 f12164d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final xw2 f12165e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final o42 f12166f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Executor f12167g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C1734gb f12168h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final po0 f12169i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final cy2 f12170j;

    public or1(Context context, Executor executor, C1734gb gbVar, po0 po0, C2675a aVar, ru0 ru0, o42 o42, cy2 cy2, wv1 wv1, xw2 xw2) {
        this.f12163c = context;
        this.f12167g = executor;
        this.f12168h = gbVar;
        this.f12169i = po0;
        this.f12161a = aVar;
        this.f12162b = ru0;
        this.f12166f = o42;
        this.f12170j = cy2;
        this.f12164d = wv1;
        this.f12165e = xw2;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        rr1 rr1 = new rr1(this);
        rr1.mo10658h();
        return rr1;
    }
}
