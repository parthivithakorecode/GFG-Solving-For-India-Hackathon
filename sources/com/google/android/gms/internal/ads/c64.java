package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class c64 {

    /* renamed from: a */
    public final int f5322a;

    /* renamed from: b */
    public final s54 f5323b;

    /* renamed from: c */
    private final CopyOnWriteArrayList<b64> f5324c;

    public c64() {
        this(new CopyOnWriteArrayList(), 0, (s54) null, 0);
    }

    private c64(CopyOnWriteArrayList<b64> copyOnWriteArrayList, int i, s54 s54, long j) {
        this.f5324c = copyOnWriteArrayList;
        this.f5322a = i;
        this.f5323b = s54;
    }

    /* renamed from: n */
    private static final long m7236n(long j) {
        long d = nz3.m14196d(j);
        if (d == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return d;
    }

    /* renamed from: a */
    public final c64 mo6064a(int i, s54 s54, long j) {
        return new c64(this.f5324c, i, s54, 0);
    }

    /* renamed from: b */
    public final void mo6065b(Handler handler, d64 d64) {
        this.f5324c.add(new b64(handler, d64));
    }

    /* renamed from: c */
    public final void mo6066c(p54 p54) {
        Iterator<b64> it = this.f5324c.iterator();
        while (it.hasNext()) {
            b64 next = it.next();
            n13.m13648u(next.f4777a, new a64(this, next.f4778b, p54));
        }
    }

    /* renamed from: d */
    public final void mo6067d(int i, C1574c0 c0Var, int i2, Object obj, long j) {
        mo6066c(new p54(1, i, c0Var, 0, (Object) null, m7236n(j), -9223372036854775807L));
    }

    /* renamed from: e */
    public final void mo6068e(k54 k54, p54 p54) {
        Iterator<b64> it = this.f5324c.iterator();
        while (it.hasNext()) {
            b64 next = it.next();
            n13.m13648u(next.f4777a, new w54(this, next.f4778b, k54, p54));
        }
    }

    /* renamed from: f */
    public final void mo6069f(k54 k54, int i, int i2, C1574c0 c0Var, int i3, Object obj, long j, long j2) {
        k54 k542 = k54;
        mo6068e(k54, new p54(1, -1, (C1574c0) null, 0, (Object) null, m7236n(j), m7236n(j2)));
    }

    /* renamed from: g */
    public final void mo6070g(k54 k54, p54 p54) {
        Iterator<b64> it = this.f5324c.iterator();
        while (it.hasNext()) {
            b64 next = it.next();
            n13.m13648u(next.f4777a, new x54(this, next.f4778b, k54, p54));
        }
    }

    /* renamed from: h */
    public final void mo6071h(k54 k54, int i, int i2, C1574c0 c0Var, int i3, Object obj, long j, long j2) {
        k54 k542 = k54;
        mo6070g(k54, new p54(1, -1, (C1574c0) null, 0, (Object) null, m7236n(j), m7236n(j2)));
    }

    /* renamed from: i */
    public final void mo6072i(k54 k54, p54 p54, IOException iOException, boolean z) {
        Iterator<b64> it = this.f5324c.iterator();
        while (it.hasNext()) {
            b64 next = it.next();
            n13.m13648u(next.f4777a, new z54(this, next.f4778b, k54, p54, iOException, z));
        }
    }

    /* renamed from: j */
    public final void mo6073j(k54 k54, int i, int i2, C1574c0 c0Var, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        k54 k542 = k54;
        mo6072i(k54, new p54(1, -1, (C1574c0) null, 0, (Object) null, m7236n(j), m7236n(j2)), iOException, z);
    }

    /* renamed from: k */
    public final void mo6074k(k54 k54, p54 p54) {
        Iterator<b64> it = this.f5324c.iterator();
        while (it.hasNext()) {
            b64 next = it.next();
            n13.m13648u(next.f4777a, new y54(this, next.f4778b, k54, p54));
        }
    }

    /* renamed from: l */
    public final void mo6075l(k54 k54, int i, int i2, C1574c0 c0Var, int i3, Object obj, long j, long j2) {
        k54 k542 = k54;
        mo6074k(k54, new p54(1, -1, (C1574c0) null, 0, (Object) null, m7236n(j), m7236n(j2)));
    }

    /* renamed from: m */
    public final void mo6076m(d64 d64) {
        Iterator<b64> it = this.f5324c.iterator();
        while (it.hasNext()) {
            b64 next = it.next();
            if (next.f4778b == d64) {
                this.f5324c.remove(next);
            }
        }
    }
}
