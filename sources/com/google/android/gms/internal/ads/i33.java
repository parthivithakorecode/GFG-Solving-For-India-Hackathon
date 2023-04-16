package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Objects;

public abstract class i33 extends ei0 {

    /* renamed from: c */
    private final int f8526c;

    /* renamed from: d */
    private final l74 f8527d;

    public i33(boolean z, l74 l74, byte[] bArr) {
        this.f8527d = l74;
        this.f8526c = l74.mo8898c();
    }

    /* renamed from: w */
    private final int m10897w(int i, boolean z) {
        if (z) {
            return this.f8527d.mo8899d(i);
        }
        if (i >= this.f8526c - 1) {
            return -1;
        }
        return i + 1;
    }

    /* renamed from: x */
    private final int m10898x(int i, boolean z) {
        if (z) {
            return this.f8527d.mo8900e(i);
        }
        if (i <= 0) {
            return -1;
        }
        return i - 1;
    }

    /* renamed from: a */
    public final int mo6954a(Object obj) {
        int a;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int p = mo8064p(obj2);
        if (p == -1 || (a = mo8069u(p).mo6954a(obj3)) == -1) {
            return -1;
        }
        return mo8067s(p) + a;
    }

    /* renamed from: d */
    public final pf0 mo6957d(int i, pf0 pf0, boolean z) {
        int q = mo8065q(i);
        int t = mo8068t(q);
        mo8069u(q).mo6957d(i - mo8067s(q), pf0, z);
        pf0.f12646c += t;
        if (z) {
            Object v = mo8070v(q);
            Object obj = pf0.f12645b;
            Objects.requireNonNull(obj);
            pf0.f12645b = Pair.create(v, obj);
        }
        return pf0;
    }

    /* renamed from: e */
    public final hh0 mo6958e(int i, hh0 hh0, long j) {
        int r = mo8066r(i);
        int t = mo8068t(r);
        int s = mo8067s(r);
        mo8069u(r).mo6958e(i - t, hh0, j);
        Object v = mo8070v(r);
        if (!hh0.f8221o.equals(hh0.f8225a)) {
            v = Pair.create(v, hh0.f8225a);
        }
        hh0.f8225a = v;
        hh0.f8237m += s;
        hh0.f8238n += s;
        return hh0;
    }

    /* renamed from: f */
    public final Object mo6960f(int i) {
        int q = mo8065q(i);
        return Pair.create(mo8070v(q), mo8069u(q).mo6960f(i - mo8067s(q)));
    }

    /* renamed from: g */
    public final int mo6961g(boolean z) {
        if (this.f8526c == 0) {
            return -1;
        }
        int a = z ? this.f8527d.mo8896a() : 0;
        while (mo8069u(a).mo6970o()) {
            a = m10897w(a, z);
            if (a == -1) {
                return -1;
            }
        }
        return mo8068t(a) + mo8069u(a).mo6961g(z);
    }

    /* renamed from: h */
    public final int mo6962h(boolean z) {
        int i = this.f8526c;
        if (i == 0) {
            return -1;
        }
        int b = z ? this.f8527d.mo8897b() : i - 1;
        while (mo8069u(b).mo6970o()) {
            b = m10898x(b, z);
            if (b == -1) {
                return -1;
            }
        }
        return mo8068t(b) + mo8069u(b).mo6962h(z);
    }

    /* renamed from: j */
    public final int mo6965j(int i, int i2, boolean z) {
        int r = mo8066r(i);
        int t = mo8068t(r);
        int j = mo8069u(r).mo6965j(i - t, i2 == 2 ? 0 : i2, z);
        if (j != -1) {
            return t + j;
        }
        int w = m10897w(r, z);
        while (w != -1 && mo8069u(w).mo6970o()) {
            w = m10897w(w, z);
        }
        if (w != -1) {
            return mo8068t(w) + mo8069u(w).mo6961g(z);
        }
        if (i2 == 2) {
            return mo6961g(z);
        }
        return -1;
    }

    /* renamed from: k */
    public final int mo6966k(int i, int i2, boolean z) {
        int r = mo8066r(i);
        int t = mo8068t(r);
        int k = mo8069u(r).mo6966k(i - t, 0, false);
        if (k != -1) {
            return t + k;
        }
        int x = m10898x(r, false);
        while (x != -1 && mo8069u(x).mo6970o()) {
            x = m10898x(x, false);
        }
        if (x != -1) {
            return mo8068t(x) + mo8069u(x).mo6962h(false);
        }
        return -1;
    }

    /* renamed from: n */
    public final pf0 mo6969n(Object obj, pf0 pf0) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int p = mo8064p(obj2);
        int t = mo8068t(p);
        mo8069u(p).mo6969n(obj3, pf0);
        pf0.f12646c += t;
        pf0.f12645b = obj;
        return pf0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract int mo8064p(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract int mo8065q(int i);

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract int mo8066r(int i);

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract int mo8067s(int i);

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract int mo8068t(int i);

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract ei0 mo8069u(int i);

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract Object mo8070v(int i);
}
