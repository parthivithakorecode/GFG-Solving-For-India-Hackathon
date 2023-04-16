package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.view.Surface;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.sn */
public final class C2190sn {

    /* renamed from: a */
    private final Handler f14497a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2227tn f14498b;

    public C2190sn(Handler handler, C2227tn tnVar) {
        Objects.requireNonNull(handler);
        this.f14497a = handler;
        this.f14498b = tnVar;
    }

    /* renamed from: b */
    public final void mo10817b(String str, long j, long j2) {
        this.f14497a.post(new C1968mn(this, str, j, j2));
    }

    /* renamed from: c */
    public final void mo10818c(C2220tg tgVar) {
        this.f14497a.post(new C2153rn(this, tgVar));
    }

    /* renamed from: d */
    public final void mo10819d(int i, long j) {
        this.f14497a.post(new C2042on(this, i, j));
    }

    /* renamed from: e */
    public final void mo10820e(C2220tg tgVar) {
        this.f14497a.post(new C1931ln(this, tgVar));
    }

    /* renamed from: f */
    public final void mo10821f(C2367xe xeVar) {
        this.f14497a.post(new C2005nn(this, xeVar));
    }

    /* renamed from: g */
    public final void mo10822g(Surface surface) {
        this.f14497a.post(new C2116qn(this, surface));
    }

    /* renamed from: h */
    public final void mo10823h(int i, int i2, int i3, float f) {
        this.f14497a.post(new C2079pn(this, i, i2, i3, f));
    }
}
