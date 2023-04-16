package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

final class mx3 implements d64, w24 {

    /* renamed from: f */
    private final ox3 f11170f;

    /* renamed from: g */
    private c64 f11171g;

    /* renamed from: h */
    private v24 f11172h;

    /* renamed from: i */
    final /* synthetic */ qx3 f11173i;

    public mx3(qx3 qx3, ox3 ox3) {
        this.f11173i = qx3;
        this.f11171g = qx3.f13385e;
        this.f11172h = qx3.f13386f;
        this.f11170f = ox3;
    }

    /* renamed from: a */
    private final boolean m13519a(int i, s54 s54) {
        s54 s542 = null;
        if (s54 != null) {
            ox3 ox3 = this.f11170f;
            int i2 = 0;
            while (true) {
                if (i2 >= ox3.f12254c.size()) {
                    break;
                } else if (ox3.f12254c.get(i2).f7617d == s54.f7617d) {
                    s542 = s54.mo10736c(Pair.create(ox3.f12253b, s54.f7614a));
                    break;
                } else {
                    i2++;
                }
            }
            if (s542 == null) {
                return false;
            }
        }
        int i3 = i + this.f11170f.f12255d;
        c64 c64 = this.f11171g;
        if (c64.f5322a != i3 || !n13.m13643p(c64.f5323b, s542)) {
            this.f11171g = this.f11173i.f13385e.mo6064a(i3, s542, 0);
        }
        v24 v24 = this.f11172h;
        if (v24.f15881a == i3 && n13.m13643p(v24.f15882b, s542)) {
            return true;
        }
        this.f11172h = this.f11173i.f13386f.mo11371a(i3, s542);
        return true;
    }

    /* renamed from: B */
    public final void mo5720B(int i, s54 s54, p54 p54) {
        if (m13519a(i, s54)) {
            this.f11171g.mo6066c(p54);
        }
    }

    /* renamed from: E */
    public final void mo5721E(int i, s54 s54, k54 k54, p54 p54) {
        if (m13519a(i, s54)) {
            this.f11171g.mo6068e(k54, p54);
        }
    }

    /* renamed from: g */
    public final void mo5722g(int i, s54 s54, k54 k54, p54 p54) {
        if (m13519a(i, s54)) {
            this.f11171g.mo6070g(k54, p54);
        }
    }

    /* renamed from: s */
    public final void mo5723s(int i, s54 s54, k54 k54, p54 p54) {
        if (m13519a(i, s54)) {
            this.f11171g.mo6074k(k54, p54);
        }
    }

    /* renamed from: v */
    public final void mo5724v(int i, s54 s54, k54 k54, p54 p54, IOException iOException, boolean z) {
        if (m13519a(i, s54)) {
            this.f11171g.mo6072i(k54, p54, iOException, z);
        }
    }
}
