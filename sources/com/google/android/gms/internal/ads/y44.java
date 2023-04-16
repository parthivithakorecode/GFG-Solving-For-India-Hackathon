package com.google.android.gms.internal.ads;

import java.util.Objects;

final class y44 implements i74 {

    /* renamed from: a */
    public final i74 f17602a;

    /* renamed from: b */
    private boolean f17603b;

    /* renamed from: c */
    final /* synthetic */ z44 f17604c;

    public y44(z44 z44, i74 i74) {
        this.f17604c = z44;
        this.f17602a = i74;
    }

    /* renamed from: a */
    public final int mo7518a(long j) {
        if (this.f17604c.mo12147p()) {
            return -3;
        }
        return this.f17602a.mo7518a(j);
    }

    /* renamed from: b */
    public final boolean mo7519b() {
        return !this.f17604c.mo12147p() && this.f17602a.mo7519b();
    }

    /* renamed from: c */
    public final int mo7520c(cx3 cx3, z51 z51, int i) {
        if (this.f17604c.mo12147p()) {
            return -3;
        }
        if (this.f17603b) {
            z51.mo10911c(4);
            return -4;
        }
        int c = this.f17602a.mo7520c(cx3, z51, i);
        if (c == -5) {
            C1574c0 c0Var = cx3.f5555a;
            Objects.requireNonNull(c0Var);
            int i2 = c0Var.f5218B;
            int i3 = 0;
            if (i2 == 0) {
                if (c0Var.f5219C != 0) {
                    i2 = 0;
                }
                return -5;
            }
            if (this.f17604c.f18031j == Long.MIN_VALUE) {
                i3 = c0Var.f5219C;
            }
            bf4 b = c0Var.mo6004b();
            b.mo5820c(i2);
            b.mo5822d(i3);
            cx3.f5555a = b.mo5848y();
            return -5;
        }
        z44 z44 = this.f17604c;
        long j = z44.f18031j;
        if (j == Long.MIN_VALUE || ((c != -4 || z51.f18035e < j) && (c != -3 || z44.mo6836a() != Long.MIN_VALUE || z51.f18034d))) {
            return c;
        }
        z51.mo10238b();
        z51.mo10911c(4);
        this.f17603b = true;
        return -4;
    }

    /* renamed from: d */
    public final void mo11963d() {
        this.f17603b = false;
    }

    /* renamed from: g */
    public final void mo7522g() {
        this.f17602a.mo7522g();
    }
}
