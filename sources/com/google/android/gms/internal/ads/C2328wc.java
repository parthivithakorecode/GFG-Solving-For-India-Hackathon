package com.google.android.gms.internal.ads;

import java.io.IOException;
import p033e1.C2538a;

/* renamed from: com.google.android.gms.internal.ads.wc */
public final class C2328wc extends C2106qd {
    public C2328wc(C1735gc gcVar, String str, String str2, C1842j8 j8Var, int i, int i2) {
        super(gcVar, "pzhIFr8jSwvyB8FXK2qfBOfw0jXHNl6+dmbReaTm1jquB51r9sbZLlTA4zaBxZEm", "RbRyr5uGUYOSrOuNnmzV0kl42YeLvs7OFWbwh2MFm18=", j8Var, i, 24);
    }

    /* renamed from: c */
    private final void m18955c() {
        C2538a h = this.f13130b.mo7572h();
        if (h != null) {
            try {
                C2538a.C2539a c = h.mo12451c();
                String d = C1846jc.m11554d(c.mo12454a());
                if (d != null) {
                    synchronized (this.f13133e) {
                        this.f13133e.mo8401i0(d);
                        this.f13133e.mo8400h0(c.mo12455b());
                        this.f13133e.mo8380N(6);
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5238a() {
        if (!this.f13130b.mo7579q()) {
            synchronized (this.f13133e) {
                this.f13133e.mo8401i0((String) this.f13134f.invoke((Object) null, new Object[]{this.f13130b.mo7567b()}));
            }
            return;
        }
        m18955c();
    }

    /* renamed from: b */
    public final Void mo10271b() {
        if (this.f13130b.mo7580r()) {
            super.mo10271b();
            return null;
        }
        if (this.f13130b.mo7579q()) {
            m18955c();
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        mo10271b();
        return null;
    }
}
