package com.google.android.gms.internal.ads;

public final class e54 implements k74 {

    /* renamed from: f */
    protected final k74[] f6097f;

    public e54(k74[] k74Arr) {
        this.f6097f = k74Arr;
    }

    /* renamed from: a */
    public final long mo6836a() {
        long j = Long.MAX_VALUE;
        for (k74 a : this.f6097f) {
            long a2 = a.mo6836a();
            if (a2 != Long.MIN_VALUE) {
                j = Math.min(j, a2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* renamed from: c */
    public final long mo6837c() {
        long j = Long.MAX_VALUE;
        for (k74 c : this.f6097f) {
            long c2 = c.mo6837c();
            if (c2 != Long.MIN_VALUE) {
                j = Math.min(j, c2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* renamed from: e */
    public final boolean mo6838e(long j) {
        long j2 = j;
        boolean z = false;
        while (true) {
            long c = mo6837c();
            if (c != Long.MIN_VALUE) {
                boolean z2 = false;
                for (k74 k74 : this.f6097f) {
                    long c2 = k74.mo6837c();
                    boolean z3 = c2 != Long.MIN_VALUE && c2 <= j2;
                    if (c2 == c || z3) {
                        z2 |= k74.mo6838e(j2);
                    }
                }
                z |= z2;
                if (!z2) {
                    break;
                }
            } else {
                break;
            }
        }
        return z;
    }

    /* renamed from: f */
    public final void mo6839f(long j) {
        for (k74 f : this.f6097f) {
            f.mo6839f(j);
        }
    }

    /* renamed from: n */
    public final boolean mo6840n() {
        for (k74 n : this.f6097f) {
            if (n.mo6840n()) {
                return true;
            }
        }
        return false;
    }
}
