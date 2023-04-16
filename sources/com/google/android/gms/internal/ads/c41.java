package com.google.android.gms.internal.ads;

import android.view.View;

public final class c41 extends v61 {

    /* renamed from: i */
    private final View f5293i;

    /* renamed from: j */
    private final eu0 f5294j;

    /* renamed from: k */
    private final sr2 f5295k;

    /* renamed from: l */
    private final int f5296l;

    /* renamed from: m */
    private final boolean f5297m;

    /* renamed from: n */
    private final boolean f5298n;

    /* renamed from: o */
    private final t31 f5299o;

    /* renamed from: p */
    private C2378xp f5300p;

    c41(u61 u61, View view, eu0 eu0, sr2 sr2, int i, boolean z, boolean z2, t31 t31) {
        super(u61);
        this.f5293i = view;
        this.f5294j = eu0;
        this.f5295k = sr2;
        this.f5296l = i;
        this.f5297m = z;
        this.f5298n = z2;
        this.f5299o = t31;
    }

    /* renamed from: h */
    public final int mo6044h() {
        return this.f5296l;
    }

    /* renamed from: i */
    public final View mo6045i() {
        return this.f5293i;
    }

    /* renamed from: j */
    public final sr2 mo6046j() {
        return os2.m14627b(this.f15922b.f13913s, this.f5295k);
    }

    /* renamed from: k */
    public final void mo6047k(C2007np npVar) {
        this.f5294j.mo7094N(npVar);
    }

    /* renamed from: l */
    public final boolean mo6048l() {
        return this.f5297m;
    }

    /* renamed from: m */
    public final boolean mo6049m() {
        return this.f5298n;
    }

    /* renamed from: n */
    public final boolean mo6050n() {
        return this.f5294j.mo7076C0();
    }

    /* renamed from: o */
    public final boolean mo6051o() {
        return this.f5294j.mo7077D0() != null && this.f5294j.mo7077D0().mo9067v();
    }

    /* renamed from: p */
    public final void mo6052p(long j, int i) {
        this.f5299o.mo10934a(j, i);
    }

    /* renamed from: q */
    public final C2378xp mo6053q() {
        return this.f5300p;
    }

    /* renamed from: r */
    public final void mo6054r(C2378xp xpVar) {
        this.f5300p = xpVar;
    }
}
