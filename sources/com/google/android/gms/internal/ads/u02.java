package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import p003a2.C0052c;
import p160x1.C4280b;

public abstract class u02 implements C0052c.C0053a, C0052c.C0054b {

    /* renamed from: a */
    protected final bp0<InputStream> f15299a = new bp0<>();

    /* renamed from: b */
    protected final Object f15300b = new Object();

    /* renamed from: c */
    protected boolean f15301c = false;

    /* renamed from: d */
    protected boolean f15302d = false;

    /* renamed from: e */
    protected vi0 f15303e;

    /* renamed from: f */
    protected gi0 f15304f;

    /* renamed from: D */
    public final void mo140D(int i) {
        io0.m11126b("Cannot connect to remote service, fallback to local instance.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11130a() {
        synchronized (this.f15300b) {
            this.f15302d = true;
            if (this.f15304f.mo173a() || this.f15304f.mo179j()) {
                this.f15304f.mo184o();
            }
            Binder.flushPendingCommands();
        }
    }

    /* renamed from: n0 */
    public void mo196n0(C4280b bVar) {
        io0.m11126b("Disconnected from remote ad request service.");
        this.f15299a.mo5908f(new k12(1));
    }
}
