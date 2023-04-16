package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import p003a2.C0052c;
import p160x1.C4280b;

final class d13 implements C0052c.C0053a, C0052c.C0054b {

    /* renamed from: a */
    protected final c23 f5611a;

    /* renamed from: b */
    private final String f5612b;

    /* renamed from: c */
    private final String f5613c;

    /* renamed from: d */
    private final LinkedBlockingQueue<p23> f5614d;

    /* renamed from: e */
    private final HandlerThread f5615e;

    /* renamed from: f */
    private final u03 f5616f;

    /* renamed from: g */
    private final long f5617g = System.currentTimeMillis();

    /* renamed from: h */
    private final int f5618h;

    public d13(Context context, int i, int i2, String str, String str2, String str3, u03 u03) {
        this.f5612b = str;
        this.f5618h = i2;
        this.f5613c = str2;
        this.f5616f = u03;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f5615e = handlerThread;
        handlerThread.start();
        c23 c23 = new c23(context, handlerThread.getLooper(), this, this, 19621000);
        this.f5611a = c23;
        this.f5614d = new LinkedBlockingQueue<>();
        c23.mo186q();
    }

    /* renamed from: a */
    static p23 m7701a() {
        return new p23((byte[]) null, 1);
    }

    /* renamed from: e */
    private final void m7702e(int i, long j, Exception exc) {
        this.f5616f.mo11132c(i, System.currentTimeMillis() - j, exc);
    }

    /* renamed from: C0 */
    public final void mo139C0(Bundle bundle) {
        h23 d = mo6375d();
        if (d != null) {
            try {
                p23 M3 = d.mo7810M3(new m23(1, this.f5618h, this.f5612b, this.f5613c));
                m7702e(5011, this.f5617g, (Exception) null);
                this.f5614d.put(M3);
            } catch (Throwable th) {
                mo6374c();
                this.f5615e.quit();
                throw th;
            }
            mo6374c();
            this.f5615e.quit();
        }
    }

    /* renamed from: D */
    public final void mo140D(int i) {
        try {
            m7702e(4011, this.f5617g, (Exception) null);
            this.f5614d.put(m7701a());
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: b */
    public final p23 mo6373b(int i) {
        p23 p23;
        try {
            p23 = this.f5614d.poll(50000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            m7702e(2009, this.f5617g, e);
            p23 = null;
        }
        m7702e(3004, this.f5617g, (Exception) null);
        if (p23 != null) {
            u03.m17635g(p23.f12464h == 7 ? 3 : 2);
        }
        return p23 == null ? m7701a() : p23;
    }

    /* renamed from: c */
    public final void mo6374c() {
        c23 c23 = this.f5611a;
        if (c23 == null) {
            return;
        }
        if (c23.mo173a() || this.f5611a.mo179j()) {
            this.f5611a.mo184o();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final h23 mo6375d() {
        try {
            return this.f5611a.mo6038i0();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: n0 */
    public final void mo196n0(C4280b bVar) {
        try {
            m7702e(4012, this.f5617g, (Exception) null);
            this.f5614d.put(m7701a());
        } catch (InterruptedException unused) {
        }
    }
}
