package com.google.android.gms.internal.ads;

public class fc4 {

    /* renamed from: a */
    protected final zb4 f6795a;

    /* renamed from: b */
    protected final ec4 f6796b;

    /* renamed from: c */
    protected bc4 f6797c;

    /* renamed from: d */
    private final int f6798d;

    protected fc4(cc4 cc4, ec4 ec4, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.f6796b = ec4;
        this.f6798d = i;
        this.f6795a = new zb4(cc4, j, 0, j3, j4, j5, j6);
    }

    /* renamed from: f */
    protected static final int m9102f(pc4 pc4, long j, md4 md4) {
        if (j == pc4.mo6908b()) {
            return 0;
        }
        md4.f10817a = j;
        return 1;
    }

    /* renamed from: g */
    protected static final boolean m9103g(pc4 pc4, long j) {
        long b = j - pc4.mo6908b();
        if (b < 0 || b > 262144) {
            return false;
        }
        ((jc4) pc4).mo8447p((int) b, false);
        return true;
    }

    /* renamed from: a */
    public final int mo7295a(pc4 pc4, md4 md4) {
        while (true) {
            bc4 bc4 = this.f6797c;
            wu1.m19203b(bc4);
            long b = bc4.f4865f;
            long a = bc4.f4866g;
            long c = bc4.f4867h;
            if (a - b <= ((long) this.f6798d)) {
                mo7297c(false, b);
                return m9102f(pc4, b, md4);
            } else if (!m9103g(pc4, c)) {
                return m9102f(pc4, c, md4);
            } else {
                pc4.mo6914i();
                dc4 b2 = this.f6796b.mo6903b(pc4, bc4.f4861b);
                int a2 = b2.f5758a;
                if (a2 == -3) {
                    mo7297c(false, c);
                    return m9102f(pc4, c, md4);
                } else if (a2 == -2) {
                    bc4.m6802h(bc4, b2.f5759b, b2.f5760c);
                } else if (a2 != -1) {
                    m9103g(pc4, b2.f5760c);
                    mo7297c(true, b2.f5760c);
                    return m9102f(pc4, b2.f5760c, md4);
                } else {
                    bc4.m6801g(bc4, b2.f5759b, b2.f5760c);
                }
            }
        }
    }

    /* renamed from: b */
    public final pd4 mo7296b() {
        return this.f6795a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo7297c(boolean z, long j) {
        this.f6797c = null;
        this.f6796b.mo6902a();
    }

    /* renamed from: d */
    public final void mo7298d(long j) {
        long j2 = j;
        bc4 bc4 = this.f6797c;
        if (bc4 == null || bc4.f4860a != j2) {
            bc4 bc42 = r1;
            bc4 bc43 = new bc4(j, this.f6795a.mo12200j(j2), 0, this.f6795a.f18149c, this.f6795a.f18150d, this.f6795a.f18151e, this.f6795a.f18152f);
            this.f6797c = bc42;
        }
    }

    /* renamed from: e */
    public final boolean mo7299e() {
        return this.f6797c != null;
    }
}
