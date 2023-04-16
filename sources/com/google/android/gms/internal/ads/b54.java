package com.google.android.gms.internal.ads;

import java.io.IOException;

final class b54 implements d64, w24 {

    /* renamed from: f */
    private final Object f4770f;

    /* renamed from: g */
    private c64 f4771g;

    /* renamed from: h */
    private v24 f4772h;

    /* renamed from: i */
    final /* synthetic */ d54 f4773i;

    public b54(d54 d54, Object obj) {
        this.f4773i = d54;
        this.f4771g = d54.mo11395n((s54) null);
        this.f4772h = d54.mo11393l((s54) null);
        this.f4770f = obj;
    }

    /* renamed from: a */
    private final boolean m6687a(int i, s54 s54) {
        s54 s542;
        if (s54 != null) {
            s542 = this.f4773i.mo6389w(this.f4770f, s54);
            if (s542 == null) {
                return false;
            }
        } else {
            s542 = null;
        }
        c64 c64 = this.f4771g;
        if (c64.f5322a != i || !n13.m13643p(c64.f5323b, s542)) {
            this.f4771g = this.f4773i.mo11396o(i, s542, 0);
        }
        v24 v24 = this.f4772h;
        if (v24.f15881a == i && n13.m13643p(v24.f15882b, s542)) {
            return true;
        }
        this.f4772h = this.f4773i.mo11394m(i, s542);
        return true;
    }

    /* renamed from: B */
    public final void mo5720B(int i, s54 s54, p54 p54) {
        if (m6687a(i, s54)) {
            this.f4771g.mo6066c(p54);
        }
    }

    /* renamed from: E */
    public final void mo5721E(int i, s54 s54, k54 k54, p54 p54) {
        if (m6687a(i, s54)) {
            this.f4771g.mo6068e(k54, p54);
        }
    }

    /* renamed from: g */
    public final void mo5722g(int i, s54 s54, k54 k54, p54 p54) {
        if (m6687a(i, s54)) {
            this.f4771g.mo6070g(k54, p54);
        }
    }

    /* renamed from: s */
    public final void mo5723s(int i, s54 s54, k54 k54, p54 p54) {
        if (m6687a(i, s54)) {
            this.f4771g.mo6074k(k54, p54);
        }
    }

    /* renamed from: v */
    public final void mo5724v(int i, s54 s54, k54 k54, p54 p54, IOException iOException, boolean z) {
        if (m6687a(i, s54)) {
            this.f4771g.mo6072i(k54, p54, iOException, z);
        }
    }
}
