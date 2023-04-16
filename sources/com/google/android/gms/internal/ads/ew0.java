package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import p054h1.C2683i;
import p054h1.C2694t;

public final class ew0 {

    /* renamed from: a */
    private final po0 f6398a;

    /* renamed from: b */
    private final Context f6399b;

    /* renamed from: c */
    private final WeakReference<Context> f6400c;

    /* synthetic */ ew0(cw0 cw0, dw0 dw0) {
        this.f6398a = cw0.f5539a;
        this.f6399b = cw0.f5540b;
        this.f6400c = cw0.f5541c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context mo7167a() {
        return this.f6399b;
    }

    /* renamed from: b */
    public final C1734gb mo7168b() {
        return new C1734gb(new C2683i(this.f6399b, this.f6398a));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final u30 mo7169c() {
        return new u30(this.f6399b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final po0 mo7170d() {
        return this.f6398a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final String mo7171e() {
        return C2694t.m21608q().mo14022L(this.f6399b, this.f6398a.f12729f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final WeakReference<Context> mo7172f() {
        return this.f6400c;
    }
}
