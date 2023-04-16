package com.google.android.gms.internal.ads;

import javax.annotation.concurrent.GuardedBy;
import p048g2.C2635a;

public final class z62 extends wj0 implements hc1 {
    @GuardedBy("this")

    /* renamed from: f */
    private xj0 f18056f;
    @GuardedBy("this")

    /* renamed from: g */
    private gc1 f18057g;
    @GuardedBy("this")

    /* renamed from: h */
    private aj1 f18058h;

    /* renamed from: A5 */
    public final synchronized void mo12162A5(xj0 xj0) {
        this.f18056f = xj0;
    }

    /* renamed from: B5 */
    public final synchronized void mo12163B5(aj1 aj1) {
        this.f18058h = aj1;
    }

    /* renamed from: E0 */
    public final synchronized void mo11426E0(C2635a aVar, int i) {
        gc1 gc1 = this.f18057g;
        if (gc1 != null) {
            gc1.mo6884d(i);
        }
    }

    /* renamed from: J2 */
    public final synchronized void mo11427J2(C2635a aVar) {
        xj0 xj0 = this.f18056f;
        if (xj0 != null) {
            ((v92) xj0).f15953h.mo6442b();
        }
    }

    /* renamed from: P */
    public final synchronized void mo11428P(C2635a aVar) {
        xj0 xj0 = this.f18056f;
        if (xj0 != null) {
            ((v92) xj0).f15953h.mo6441a();
        }
    }

    /* renamed from: P4 */
    public final synchronized void mo7911P4(gc1 gc1) {
        this.f18057g = gc1;
    }

    /* renamed from: T */
    public final synchronized void mo11429T(C2635a aVar) {
        gc1 gc1 = this.f18057g;
        if (gc1 != null) {
            gc1.mo6886g();
        }
    }

    /* renamed from: V */
    public final synchronized void mo11430V(C2635a aVar) {
        xj0 xj0 = this.f18056f;
        if (xj0 != null) {
            ((v92) xj0).f15951f.mo5646a();
        }
    }

    /* renamed from: b0 */
    public final synchronized void mo11431b0(C2635a aVar) {
        aj1 aj1 = this.f18058h;
        if (aj1 != null) {
            ((u92) aj1).f15478d.f16764b.execute(new t92((u92) aj1, ((u92) aj1).f15475a, ((u92) aj1).f15476b, ((u92) aj1).f15477c));
        }
    }

    /* renamed from: e1 */
    public final synchronized void mo11432e1(C2635a aVar, yj0 yj0) {
        xj0 xj0 = this.f18056f;
        if (xj0 != null) {
            ((v92) xj0).f15954i.mo7054p0(yj0);
        }
    }

    /* renamed from: r0 */
    public final synchronized void mo11433r0(C2635a aVar) {
        xj0 xj0 = this.f18056f;
        if (xj0 != null) {
            xj0.mo11433r0(aVar);
        }
    }

    /* renamed from: u0 */
    public final synchronized void mo11434u0(C2635a aVar) {
        xj0 xj0 = this.f18056f;
        if (xj0 != null) {
            ((v92) xj0).f15954i.mo7053c();
        }
    }

    /* renamed from: x4 */
    public final synchronized void mo11435x4(C2635a aVar, int i) {
        aj1 aj1 = this.f18058h;
        if (aj1 != null) {
            String valueOf = String.valueOf(((u92) aj1).f15477c.f5646a);
            io0.m11131g(valueOf.length() != 0 ? "Fail to initialize adapter ".concat(valueOf) : new String("Fail to initialize adapter "));
        }
    }

    public final synchronized void zze(C2635a aVar) {
        xj0 xj0 = this.f18056f;
        if (xj0 != null) {
            ((v92) xj0).f15952g.mo25L();
        }
    }
}
