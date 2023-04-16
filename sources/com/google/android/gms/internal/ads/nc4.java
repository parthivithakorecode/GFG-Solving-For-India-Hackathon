package com.google.android.gms.internal.ads;

import java.io.EOFException;

public final class nc4 implements td4 {

    /* renamed from: a */
    private final byte[] f11415a = new byte[4096];

    /* renamed from: a */
    public final void mo7872a(long j, int i, int i2, int i3, sd4 sd4) {
    }

    /* renamed from: b */
    public final void mo7873b(C1574c0 c0Var) {
    }

    /* renamed from: c */
    public final /* synthetic */ int mo7874c(fc1 fc1, int i, boolean z) {
        return rd4.m16161a(this, fc1, i, true);
    }

    /* renamed from: d */
    public final int mo7875d(fc1 fc1, int i, boolean z, int i2) {
        int a = fc1.mo5752a(this.f11415a, 0, Math.min(4096, i));
        if (a != -1) {
            return a;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: e */
    public final /* synthetic */ void mo7876e(dr2 dr2, int i) {
        rd4.m16162b(this, dr2, i);
    }

    /* renamed from: f */
    public final void mo7877f(dr2 dr2, int i, int i2) {
        dr2.mo6581g(i);
    }
}
