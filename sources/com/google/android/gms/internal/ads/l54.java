package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

public final class l54 implements r54, q54 {

    /* renamed from: f */
    public final s54 f9903f;

    /* renamed from: g */
    private final long f9904g;

    /* renamed from: h */
    private v54 f9905h;

    /* renamed from: i */
    private r54 f9906i;

    /* renamed from: j */
    private q54 f9907j;

    /* renamed from: k */
    private long f9908k = -9223372036854775807L;

    /* renamed from: l */
    private final g94 f9909l;

    public l54(s54 s54, g94 g94, long j, byte[] bArr) {
        this.f9903f = s54;
        this.f9909l = g94;
        this.f9904g = j;
    }

    /* renamed from: v */
    private final long m12581v(long j) {
        long j2 = this.f9908k;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    /* renamed from: a */
    public final long mo6836a() {
        r54 r54 = this.f9906i;
        int i = n13.f11236a;
        return r54.mo6836a();
    }

    /* renamed from: b */
    public final long mo7243b(long j) {
        r54 r54 = this.f9906i;
        int i = n13.f11236a;
        return r54.mo7243b(j);
    }

    /* renamed from: c */
    public final long mo6837c() {
        r54 r54 = this.f9906i;
        int i = n13.f11236a;
        return r54.mo6837c();
    }

    /* renamed from: d */
    public final hm0 mo7244d() {
        r54 r54 = this.f9906i;
        int i = n13.f11236a;
        return r54.mo7244d();
    }

    /* renamed from: e */
    public final boolean mo6838e(long j) {
        r54 r54 = this.f9906i;
        return r54 != null && r54.mo6838e(j);
    }

    /* renamed from: f */
    public final void mo6839f(long j) {
        r54 r54 = this.f9906i;
        int i = n13.f11236a;
        r54.mo6839f(j);
    }

    /* renamed from: g */
    public final long mo7245g() {
        r54 r54 = this.f9906i;
        int i = n13.f11236a;
        return r54.mo7245g();
    }

    /* renamed from: h */
    public final void mo5559h(r54 r54) {
        q54 q54 = this.f9907j;
        int i = n13.f11236a;
        q54.mo5559h(this);
    }

    /* renamed from: i */
    public final void mo7246i() {
        try {
            r54 r54 = this.f9906i;
            if (r54 != null) {
                r54.mo7246i();
                return;
            }
            v54 v54 = this.f9905h;
            if (v54 != null) {
                v54.mo6390x();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    /* renamed from: j */
    public final long mo7247j(w74[] w74Arr, boolean[] zArr, i74[] i74Arr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.f9908k;
        if (j3 == -9223372036854775807L || j != this.f9904g) {
            j2 = j;
        } else {
            this.f9908k = -9223372036854775807L;
            j2 = j3;
        }
        r54 r54 = this.f9906i;
        int i = n13.f11236a;
        return r54.mo7247j(w74Arr, zArr, i74Arr, zArr2, j2);
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ void mo5562k(k74 k74) {
        r54 r54 = (r54) k74;
        q54 q54 = this.f9907j;
        int i = n13.f11236a;
        q54.mo5562k(this);
    }

    /* renamed from: l */
    public final long mo7248l(long j, ay3 ay3) {
        r54 r54 = this.f9906i;
        int i = n13.f11236a;
        return r54.mo7248l(j, ay3);
    }

    /* renamed from: m */
    public final long mo8883m() {
        return this.f9908k;
    }

    /* renamed from: n */
    public final boolean mo6840n() {
        r54 r54 = this.f9906i;
        return r54 != null && r54.mo6840n();
    }

    /* renamed from: o */
    public final void mo7249o(q54 q54, long j) {
        this.f9907j = q54;
        r54 r54 = this.f9906i;
        if (r54 != null) {
            r54.mo7249o(this, m12581v(this.f9904g));
        }
    }

    /* renamed from: p */
    public final long mo8884p() {
        return this.f9904g;
    }

    /* renamed from: q */
    public final void mo8885q(s54 s54) {
        long v = m12581v(this.f9904g);
        v54 v54 = this.f9905h;
        Objects.requireNonNull(v54);
        r54 h = v54.mo8362h(s54, this.f9909l, v);
        this.f9906i = h;
        if (this.f9907j != null) {
            h.mo7249o(this, v);
        }
    }

    /* renamed from: r */
    public final void mo8886r(long j) {
        this.f9908k = j;
    }

    /* renamed from: s */
    public final void mo7250s(long j, boolean z) {
        r54 r54 = this.f9906i;
        int i = n13.f11236a;
        r54.mo7250s(j, false);
    }

    /* renamed from: t */
    public final void mo8887t() {
        r54 r54 = this.f9906i;
        if (r54 != null) {
            v54 v54 = this.f9905h;
            Objects.requireNonNull(v54);
            v54.mo8363j(r54);
        }
    }

    /* renamed from: u */
    public final void mo8888u(v54 v54) {
        wu1.m19207f(this.f9905h == null);
        this.f9905h = v54;
    }
}
