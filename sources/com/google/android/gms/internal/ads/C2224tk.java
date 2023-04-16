package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.tk */
public final class C2224tk implements C1925lh {

    /* renamed from: a */
    private final C2113qk f14883a = new C2113qk();

    /* renamed from: b */
    private final C2076pk f14884b = new C2076pk();

    /* renamed from: c */
    private final C2152rm f14885c = new C2152rm(32);

    /* renamed from: d */
    private final AtomicInteger f14886d = new AtomicInteger();

    /* renamed from: e */
    private C2150rk f14887e;

    /* renamed from: f */
    private C2150rk f14888f;

    /* renamed from: g */
    private C2367xe f14889g;

    /* renamed from: h */
    private C2367xe f14890h;

    /* renamed from: i */
    private long f14891i;

    /* renamed from: j */
    private int f14892j = 65536;

    /* renamed from: k */
    private C2187sk f14893k;

    /* renamed from: l */
    private final C2337wl f14894l;

    public C2224tk(C2337wl wlVar, byte[] bArr) {
        this.f14894l = wlVar;
        C2150rk rkVar = new C2150rk(0, 65536);
        this.f14887e = rkVar;
        this.f14888f = rkVar;
    }

    /* renamed from: o */
    private final int m17298o(int i) {
        if (this.f14892j == 65536) {
            this.f14892j = 0;
            C2150rk rkVar = this.f14888f;
            if (rkVar.f13664c) {
                this.f14888f = rkVar.f13666e;
            }
            C2150rk rkVar2 = this.f14888f;
            C2114ql b = this.f14894l.mo11673b();
            C2150rk rkVar3 = new C2150rk(this.f14888f.f13663b, 65536);
            rkVar2.f13665d = b;
            rkVar2.f13666e = rkVar3;
            rkVar2.f13664c = true;
        }
        return Math.min(i, 65536 - this.f14892j);
    }

    /* renamed from: p */
    private final void m17299p() {
        this.f14883a.mo10309g();
        C2150rk rkVar = this.f14887e;
        if (rkVar.f13664c) {
            C2150rk rkVar2 = this.f14888f;
            int i = (rkVar2.f13664c ? 1 : 0) + (((int) (rkVar2.f13662a - rkVar.f13662a)) / 65536);
            C2114ql[] qlVarArr = new C2114ql[i];
            for (int i2 = 0; i2 < i; i2++) {
                qlVarArr[i2] = rkVar.f13665d;
                rkVar.f13665d = null;
                rkVar = rkVar.f13666e;
            }
            this.f14894l.mo11675d(qlVarArr);
        }
        C2150rk rkVar3 = new C2150rk(0, 65536);
        this.f14887e = rkVar3;
        this.f14888f = rkVar3;
        this.f14891i = 0;
        this.f14892j = 65536;
        this.f14894l.mo11678g();
    }

    /* renamed from: q */
    private final void m17300q(long j) {
        while (true) {
            C2150rk rkVar = this.f14887e;
            if (j >= rkVar.f13663b) {
                this.f14894l.mo11674c(rkVar.f13665d);
                C2150rk rkVar2 = this.f14887e;
                rkVar2.f13665d = null;
                this.f14887e = rkVar2.f13666e;
            } else {
                return;
            }
        }
    }

    /* renamed from: r */
    private final void m17301r() {
        if (!this.f14886d.compareAndSet(1, 0)) {
            m17299p();
        }
    }

    /* renamed from: s */
    private final void m17302s(long j, byte[] bArr, int i) {
        m17300q(j);
        int i2 = 0;
        while (i2 < i) {
            int i3 = (int) (j - this.f14887e.f13662a);
            int min = Math.min(i - i2, 65536 - i3);
            C2114ql qlVar = this.f14887e.f13665d;
            System.arraycopy(qlVar.f13224a, i3, bArr, i2, min);
            j += (long) min;
            i2 += min;
            if (j == this.f14887e.f13663b) {
                this.f14894l.mo11674c(qlVar);
                C2150rk rkVar = this.f14887e;
                rkVar.f13665d = null;
                this.f14887e = rkVar.f13666e;
            }
        }
    }

    /* renamed from: t */
    private final boolean m17303t() {
        return this.f14886d.compareAndSet(0, 1);
    }

    /* renamed from: a */
    public final void mo8951a(long j, int i, int i2, int i3, C1888kh khVar) {
        if (m17303t()) {
            try {
                this.f14883a.mo10310h(j, i, this.f14891i - ((long) i2), i2, khVar);
            } finally {
                m17301r();
            }
        } else {
            long j2 = j;
            this.f14883a.mo10311i(j);
        }
    }

    /* renamed from: b */
    public final void mo8952b(C2367xe xeVar) {
        C2367xe xeVar2 = xeVar == null ? null : xeVar;
        boolean k = this.f14883a.mo10313k(xeVar2);
        this.f14890h = xeVar;
        C2187sk skVar = this.f14893k;
        if (skVar != null && k) {
            skVar.mo6978g(xeVar2);
        }
    }

    /* renamed from: c */
    public final void mo8953c(C2152rm rmVar, int i) {
        if (m17303t()) {
            while (i > 0) {
                int o = m17298o(i);
                rmVar.mo10547q(this.f14888f.f13665d.f13224a, this.f14892j, o);
                this.f14892j += o;
                this.f14891i += (long) o;
                i -= o;
            }
            m17301r();
            return;
        }
        rmVar.mo10553w(i);
    }

    /* renamed from: d */
    public final int mo8954d(C1554bh bhVar, int i, boolean z) {
        if (!m17303t()) {
            int b = bhVar.mo5855b(i);
            if (b != -1) {
                return b;
            }
            throw new EOFException();
        }
        try {
            int a = bhVar.mo5854a(this.f14888f.f13665d.f13224a, this.f14892j, m17298o(i));
            if (a != -1) {
                this.f14892j += a;
                this.f14891i += (long) a;
                return a;
            }
            throw new EOFException();
        } finally {
            m17301r();
        }
    }

    /* renamed from: e */
    public final int mo11000e() {
        return this.f14883a.mo10303a();
    }

    /* renamed from: f */
    public final int mo11001f(C2404ye yeVar, C2257ug ugVar, boolean z, boolean z2, long j) {
        C2257ug ugVar2 = ugVar;
        int b = this.f14883a.mo10304b(yeVar, ugVar, z, z2, this.f14889g, this.f14884b);
        if (b == -5) {
            this.f14889g = yeVar.f17688a;
            return -5;
        } else if (b != -4) {
            return -3;
        } else {
            if (!ugVar.mo9763f()) {
                if (ugVar2.f15547d < j) {
                    ugVar2.mo9758a(Integer.MIN_VALUE);
                }
                if (ugVar.mo11220i()) {
                    C2076pk pkVar = this.f14884b;
                    long j2 = pkVar.f12675b;
                    int i = 1;
                    this.f14885c.mo10549s(1);
                    m17302s(j2, this.f14885c.f13709a, 1);
                    long j3 = j2 + 1;
                    byte b2 = this.f14885c.f13709a[0];
                    byte b3 = b2 & 128;
                    byte b4 = b2 & Byte.MAX_VALUE;
                    C2146rg rgVar = ugVar2.f15545b;
                    if (rgVar.f13629a == null) {
                        rgVar.f13629a = new byte[16];
                    }
                    m17302s(j3, rgVar.f13629a, b4);
                    long j4 = j3 + ((long) b4);
                    if (b3 != 0) {
                        this.f14885c.mo10549s(2);
                        m17302s(j4, this.f14885c.f13709a, 2);
                        j4 += 2;
                        i = this.f14885c.mo10540j();
                    }
                    int i2 = i;
                    C2146rg rgVar2 = ugVar2.f15545b;
                    int[] iArr = rgVar2.f13632d;
                    if (iArr == null || iArr.length < i2) {
                        iArr = new int[i2];
                    }
                    int[] iArr2 = iArr;
                    int[] iArr3 = rgVar2.f13633e;
                    if (iArr3 == null || iArr3.length < i2) {
                        iArr3 = new int[i2];
                    }
                    int[] iArr4 = iArr3;
                    if (b3 != 0) {
                        int i3 = i2 * 6;
                        this.f14885c.mo10549s(i3);
                        m17302s(j4, this.f14885c.f13709a, i3);
                        j4 += (long) i3;
                        this.f14885c.mo10552v(0);
                        for (int i4 = 0; i4 < i2; i4++) {
                            iArr2[i4] = this.f14885c.mo10540j();
                            iArr4[i4] = this.f14885c.mo10539i();
                        }
                    } else {
                        iArr2[0] = 0;
                        iArr4[0] = pkVar.f12674a - ((int) (j4 - pkVar.f12675b));
                    }
                    C1888kh khVar = pkVar.f12677d;
                    C2146rg rgVar3 = ugVar2.f15545b;
                    rgVar3.mo10520b(i2, iArr2, iArr4, khVar.f9534b, rgVar3.f13629a, 1);
                    long j5 = pkVar.f12675b;
                    int i5 = (int) (j4 - j5);
                    pkVar.f12675b = j5 + ((long) i5);
                    pkVar.f12674a -= i5;
                }
                ugVar2.mo11219h(this.f14884b.f12674a);
                C2076pk pkVar2 = this.f14884b;
                long j6 = pkVar2.f12675b;
                ByteBuffer byteBuffer = ugVar2.f15546c;
                int i6 = pkVar2.f12674a;
                m17300q(j6);
                while (i6 > 0) {
                    int i7 = (int) (j6 - this.f14887e.f13662a);
                    int min = Math.min(i6, 65536 - i7);
                    C2114ql qlVar = this.f14887e.f13665d;
                    byteBuffer.put(qlVar.f13224a, i7, min);
                    j6 += (long) min;
                    i6 -= min;
                    if (j6 == this.f14887e.f13663b) {
                        this.f14894l.mo11674c(qlVar);
                        C2150rk rkVar = this.f14887e;
                        rkVar.f13665d = null;
                        this.f14887e = rkVar.f13666e;
                    }
                }
                m17300q(this.f14884b.f12676c);
            }
            return -4;
        }
    }

    /* renamed from: g */
    public final long mo11002g() {
        return this.f14883a.mo10305c();
    }

    /* renamed from: h */
    public final C2367xe mo11003h() {
        return this.f14883a.mo10308f();
    }

    /* renamed from: i */
    public final void mo11004i() {
        if (this.f14886d.getAndSet(2) == 0) {
            m17299p();
        }
    }

    /* renamed from: j */
    public final void mo11005j(boolean z) {
        int andSet = this.f14886d.getAndSet(true != z ? 2 : 0);
        m17299p();
        this.f14883a.mo10312j();
        if (andSet == 2) {
            this.f14889g = null;
        }
    }

    /* renamed from: k */
    public final void mo11006k(C2187sk skVar) {
        this.f14893k = skVar;
    }

    /* renamed from: l */
    public final void mo11007l() {
        long d = this.f14883a.mo10306d();
        if (d != -1) {
            m17300q(d);
        }
    }

    /* renamed from: m */
    public final boolean mo11008m() {
        return this.f14883a.mo10314l();
    }

    /* renamed from: n */
    public final boolean mo11009n(long j, boolean z) {
        long e = this.f14883a.mo10307e(j, z);
        if (e == -1) {
            return false;
        }
        m17300q(e);
        return true;
    }
}
