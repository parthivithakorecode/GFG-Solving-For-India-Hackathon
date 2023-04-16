package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Objects;

public abstract class ei0 {

    /* renamed from: a */
    public static final ei0 f6219a = new vd0();

    /* renamed from: b */
    public static final my3<ei0> f6220b = vc0.f16162a;

    protected ei0() {
    }

    /* renamed from: a */
    public abstract int mo6954a(Object obj);

    /* renamed from: b */
    public abstract int mo6955b();

    /* renamed from: c */
    public abstract int mo6956c();

    /* renamed from: d */
    public abstract pf0 mo6957d(int i, pf0 pf0, boolean z);

    /* renamed from: e */
    public abstract hh0 mo6958e(int i, hh0 hh0, long j);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei0)) {
            return false;
        }
        ei0 ei0 = (ei0) obj;
        if (ei0.mo6956c() != mo6956c() || ei0.mo6955b() != mo6955b()) {
            return false;
        }
        hh0 hh0 = new hh0();
        pf0 pf0 = new pf0();
        hh0 hh02 = new hh0();
        pf0 pf02 = new pf0();
        for (int i = 0; i < mo6956c(); i++) {
            if (!mo6958e(i, hh0, 0).equals(ei0.mo6958e(i, hh02, 0))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < mo6955b(); i2++) {
            if (!mo6957d(i2, pf0, true).equals(ei0.mo6957d(i2, pf02, true))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public abstract Object mo6960f(int i);

    /* renamed from: g */
    public int mo6961g(boolean z) {
        return mo6970o() ? -1 : 0;
    }

    /* renamed from: h */
    public int mo6962h(boolean z) {
        if (mo6970o()) {
            return -1;
        }
        return mo6956c() - 1;
    }

    public final int hashCode() {
        int i;
        hh0 hh0 = new hh0();
        pf0 pf0 = new pf0();
        int c = mo6956c() + 217;
        int i2 = 0;
        while (true) {
            i = c * 31;
            if (i2 >= mo6956c()) {
                break;
            }
            c = i + mo6958e(i2, hh0, 0).hashCode();
            i2++;
        }
        int b = i + mo6955b();
        for (int i3 = 0; i3 < mo6955b(); i3++) {
            b = (b * 31) + mo6957d(i3, pf0, true).hashCode();
        }
        return b;
    }

    /* renamed from: i */
    public final int mo6964i(int i, pf0 pf0, hh0 hh0, int i2, boolean z) {
        int i3 = mo6957d(i, pf0, false).f12646c;
        if (mo6958e(i3, hh0, 0).f8238n != i) {
            return i + 1;
        }
        int j = mo6965j(i3, i2, z);
        if (j == -1) {
            return -1;
        }
        return mo6958e(j, hh0, 0).f8237m;
    }

    /* renamed from: j */
    public int mo6965j(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 == 2) {
                return i == mo6962h(z) ? mo6961g(z) : i + 1;
            }
            throw new IllegalStateException();
        } else if (i == mo6962h(z)) {
            return -1;
        } else {
            return i + 1;
        }
    }

    /* renamed from: k */
    public int mo6966k(int i, int i2, boolean z) {
        if (i == mo6961g(false)) {
            return -1;
        }
        return i - 1;
    }

    /* renamed from: l */
    public final Pair<Object, Long> mo6967l(hh0 hh0, pf0 pf0, int i, long j) {
        Pair<Object, Long> m = mo6968m(hh0, pf0, i, j, 0);
        Objects.requireNonNull(m);
        return m;
    }

    /* renamed from: m */
    public final Pair<Object, Long> mo6968m(hh0 hh0, pf0 pf0, int i, long j, long j2) {
        wu1.m19202a(i, 0, mo6956c());
        mo6958e(i, hh0, j2);
        if (j == -9223372036854775807L) {
            long j3 = hh0.f8235k;
            j = 0;
        }
        int i2 = hh0.f8237m;
        mo6957d(i2, pf0, false);
        while (i2 < hh0.f8238n) {
            long j4 = pf0.f12648e;
            int i3 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i3 == 0) {
                break;
            }
            int i4 = i2 + 1;
            long j5 = mo6957d(i4, pf0, false).f12648e;
            if (i3 < 0) {
                break;
            }
            i2 = i4;
        }
        mo6957d(i2, pf0, true);
        long j6 = pf0.f12648e;
        long j7 = pf0.f12647d;
        if (j7 != -9223372036854775807L) {
            j = Math.min(j, j7 - 1);
        }
        long max = Math.max(0, j);
        Object obj = pf0.f12645b;
        Objects.requireNonNull(obj);
        return Pair.create(obj, Long.valueOf(max));
    }

    /* renamed from: n */
    public pf0 mo6969n(Object obj, pf0 pf0) {
        return mo6957d(mo6954a(obj), pf0, true);
    }

    /* renamed from: o */
    public final boolean mo6970o() {
        return mo6956c() == 0;
    }
}
