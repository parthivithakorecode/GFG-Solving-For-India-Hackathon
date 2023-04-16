package com.google.android.gms.internal.ads;

import java.util.Comparator;

final class q63 extends t63 {
    q63() {
        super((s63) null);
    }

    /* renamed from: j */
    static final t63 m15491j(int i) {
        return i < 0 ? t63.f14730b : i > 0 ? t63.f14731c : t63.f14729a;
    }

    /* renamed from: a */
    public final int mo10247a() {
        return 0;
    }

    /* renamed from: b */
    public final t63 mo10248b(int i, int i2) {
        return m15491j(i < i2 ? -1 : i > i2 ? 1 : 0);
    }

    /* renamed from: c */
    public final <T> t63 mo10249c(T t, T t2, Comparator<T> comparator) {
        return m15491j(comparator.compare(t, t2));
    }

    /* renamed from: d */
    public final t63 mo10250d(boolean z, boolean z2) {
        return m15491j(m93.m13097a(z, z2));
    }

    /* renamed from: e */
    public final t63 mo10251e(boolean z, boolean z2) {
        return m15491j(m93.m13097a(false, false));
    }
}
