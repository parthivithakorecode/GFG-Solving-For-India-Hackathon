package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Objects;

public final class z64 extends v44 implements p64 {

    /* renamed from: g */
    private final C2451zo f18060g;

    /* renamed from: h */
    private final C2297vj f18061h;

    /* renamed from: i */
    private final gd1 f18062i;

    /* renamed from: j */
    private final b34 f18063j;

    /* renamed from: k */
    private final int f18064k;

    /* renamed from: l */
    private boolean f18065l = true;

    /* renamed from: m */
    private long f18066m = -9223372036854775807L;

    /* renamed from: n */
    private boolean f18067n;

    /* renamed from: o */
    private boolean f18068o;

    /* renamed from: p */
    private vt1 f18069p;

    /* renamed from: q */
    private final w64 f18070q;

    /* renamed from: r */
    private final m94 f18071r;

    /* synthetic */ z64(C2451zo zoVar, gd1 gd1, w64 w64, b34 b34, m94 m94, int i, y64 y64, byte[] bArr) {
        C2297vj vjVar = zoVar.f18304b;
        Objects.requireNonNull(vjVar);
        this.f18061h = vjVar;
        this.f18060g = zoVar;
        this.f18062i = gd1;
        this.f18070q = w64;
        this.f18063j = b34;
        this.f18071r = m94;
        this.f18064k = i;
    }

    /* renamed from: w */
    private final void m20490w() {
        long j = this.f18066m;
        boolean z = this.f18067n;
        boolean z2 = this.f18068o;
        C2451zo zoVar = this.f18060g;
        m74 m74 = r1;
        m74 m742 = new m74(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j, 0, 0, z, false, false, (Object) null, zoVar, z2 ? zoVar.f18306d : null);
        mo11398t(this.f18065l ? new v64(this, m74) : m74);
    }

    /* renamed from: B */
    public final C2451zo mo8361B() {
        return this.f18060g;
    }

    /* renamed from: g */
    public final void mo9985g(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.f18066m;
        }
        if (this.f18065l || this.f18066m != j || this.f18067n != z || this.f18068o != z2) {
            this.f18066m = j;
            this.f18067n = z;
            this.f18068o = z2;
            this.f18065l = false;
            m20490w();
        }
    }

    /* renamed from: h */
    public final r54 mo8362h(s54 s54, g94 g94, long j) {
        he1 zza = this.f18062i.zza();
        vt1 vt1 = this.f18069p;
        if (vt1 != null) {
            zza.mo6892j(vt1);
        }
        Uri uri = this.f18061h.f16324a;
        x44 x44 = new x44(this.f18070q.f16726a);
        b34 b34 = this.f18063j;
        v24 l = mo11393l(s54);
        m94 m94 = this.f18071r;
        c64 n = mo11395n(s54);
        String str = this.f18061h.f16327d;
        return new t64(uri, zza, x44, b34, l, m94, n, this, g94, (String) null, this.f18064k, (byte[]) null);
    }

    /* renamed from: j */
    public final void mo8363j(r54 r54) {
        ((t64) r54).mo10955z();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo6387s(vt1 vt1) {
        this.f18069p = vt1;
        m20490w();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo6388u() {
    }

    /* renamed from: x */
    public final void mo6390x() {
    }
}
