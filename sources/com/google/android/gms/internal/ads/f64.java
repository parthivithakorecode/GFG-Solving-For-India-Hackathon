package com.google.android.gms.internal.ads;

import java.util.Objects;

final class f64 implements r54, q54 {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final r54 f6724f;

    /* renamed from: g */
    private final long f6725g;

    /* renamed from: h */
    private q54 f6726h;

    public f64(r54 r54, long j) {
        this.f6724f = r54;
        this.f6725g = j;
    }

    /* renamed from: a */
    public final long mo6836a() {
        long a = this.f6724f.mo6836a();
        if (a == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return a + this.f6725g;
    }

    /* renamed from: b */
    public final long mo7243b(long j) {
        return this.f6724f.mo7243b(j - this.f6725g) + this.f6725g;
    }

    /* renamed from: c */
    public final long mo6837c() {
        long c = this.f6724f.mo6837c();
        if (c == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return c + this.f6725g;
    }

    /* renamed from: d */
    public final hm0 mo7244d() {
        return this.f6724f.mo7244d();
    }

    /* renamed from: e */
    public final boolean mo6838e(long j) {
        return this.f6724f.mo6838e(j - this.f6725g);
    }

    /* renamed from: f */
    public final void mo6839f(long j) {
        this.f6724f.mo6839f(j - this.f6725g);
    }

    /* renamed from: g */
    public final long mo7245g() {
        long g = this.f6724f.mo7245g();
        if (g == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return g + this.f6725g;
    }

    /* renamed from: h */
    public final void mo5559h(r54 r54) {
        q54 q54 = this.f6726h;
        Objects.requireNonNull(q54);
        q54.mo5559h(this);
    }

    /* renamed from: i */
    public final void mo7246i() {
        this.f6724f.mo7246i();
    }

    /* renamed from: j */
    public final long mo7247j(w74[] w74Arr, boolean[] zArr, i74[] i74Arr, boolean[] zArr2, long j) {
        i74[] i74Arr2 = i74Arr;
        i74[] i74Arr3 = new i74[i74Arr2.length];
        int i = 0;
        while (true) {
            i74 i74 = null;
            if (i >= i74Arr2.length) {
                break;
            }
            g64 g64 = (g64) i74Arr2[i];
            if (g64 != null) {
                i74 = g64.mo7521d();
            }
            i74Arr3[i] = i74;
            i++;
        }
        long j2 = this.f6724f.mo7247j(w74Arr, zArr, i74Arr3, zArr2, j - this.f6725g);
        for (int i2 = 0; i2 < i74Arr2.length; i2++) {
            i74 i742 = i74Arr3[i2];
            if (i742 == null) {
                i74Arr2[i2] = null;
            } else {
                i74 i743 = i74Arr2[i2];
                if (i743 == null || ((g64) i743).mo7521d() != i742) {
                    i74Arr2[i2] = new g64(i742, this.f6725g);
                }
            }
        }
        return j2 + this.f6725g;
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ void mo5562k(k74 k74) {
        r54 r54 = (r54) k74;
        q54 q54 = this.f6726h;
        Objects.requireNonNull(q54);
        q54.mo5562k(this);
    }

    /* renamed from: l */
    public final long mo7248l(long j, ay3 ay3) {
        return this.f6724f.mo7248l(j - this.f6725g, ay3) + this.f6725g;
    }

    /* renamed from: n */
    public final boolean mo6840n() {
        return this.f6724f.mo6840n();
    }

    /* renamed from: o */
    public final void mo7249o(q54 q54, long j) {
        this.f6726h = q54;
        this.f6724f.mo7249o(this, j - this.f6725g);
    }

    /* renamed from: s */
    public final void mo7250s(long j, boolean z) {
        this.f6724f.mo7250s(j - this.f6725g, false);
    }
}
