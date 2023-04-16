package com.google.android.gms.internal.ads;

public final class hb0 extends ip0<ob0> {

    /* renamed from: c */
    private final Object f8143c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final mb0 f8144d;

    /* renamed from: e */
    private boolean f8145e;

    public hb0(mb0 mb0) {
        this.f8144d = mb0;
    }

    /* renamed from: g */
    public final void mo7904g() {
        synchronized (this.f8143c) {
            if (!this.f8145e) {
                this.f8145e = true;
                mo8196e(new eb0(this), new ep0());
                mo8196e(new fb0(this), new gb0(this));
            }
        }
    }
}
