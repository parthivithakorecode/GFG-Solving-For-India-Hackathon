package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class hp3 extends ho3 {

    /* renamed from: b */
    private static final Logger f8379b = Logger.getLogger(hp3.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f8380c = gt3.m9976a();

    /* renamed from: a */
    ip3 f8381a;

    private hp3() {
    }

    /* synthetic */ hp3(gp3 gp3) {
    }

    /* renamed from: A */
    public static int m10705A(qq3 qq3) {
        int a = qq3.mo10354a();
        return m10709a(a) + a;
    }

    /* renamed from: B */
    static int m10706B(kr3 kr3, es3 es3) {
        bo3 bo3 = (bo3) kr3;
        int h = bo3.mo5395h();
        if (h == -1) {
            h = es3.mo7063c(bo3);
            bo3.mo5397l(h);
        }
        return m10709a(h) + h;
    }

    /* renamed from: C */
    public static int m10707C(String str) {
        int i;
        try {
            i = lt3.m12867e(str);
        } catch (kt3 unused) {
            i = str.getBytes(kq3.f9606b).length;
        }
        return m10709a(i) + i;
    }

    /* renamed from: D */
    public static int m10708D(int i) {
        return m10709a(i << 3);
    }

    /* renamed from: a */
    public static int m10709a(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: b */
    public static int m10710b(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: c */
    public static hp3 m10711c(byte[] bArr) {
        return new ep3(bArr, 0, bArr.length);
    }

    /* renamed from: x */
    public static int m10713x(uo3 uo3) {
        int p = uo3.mo6627p();
        return m10709a(p) + p;
    }

    @Deprecated
    /* renamed from: y */
    static int m10714y(int i, kr3 kr3, es3 es3) {
        int a = m10709a(i << 3);
        int i2 = a + a;
        bo3 bo3 = (bo3) kr3;
        int h = bo3.mo5395h();
        if (h == -1) {
            h = es3.mo7063c(bo3);
            bo3.mo5397l(h);
        }
        return i2 + h;
    }

    /* renamed from: z */
    public static int m10715z(int i) {
        if (i >= 0) {
            return m10709a(i);
        }
        return 10;
    }

    /* renamed from: d */
    public final void mo7986d() {
        if (mo7017g() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo7987e(String str, kt3 kt3) {
        f8379b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", kt3);
        byte[] bytes = str.getBytes(kq3.f9606b);
        try {
            int length = bytes.length;
            mo7031u(length);
            mo7027q(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new fp3(e);
        } catch (fp3 e2) {
            throw e2;
        }
    }

    /* renamed from: g */
    public abstract int mo7017g();

    /* renamed from: h */
    public abstract void mo7018h(byte b);

    /* renamed from: i */
    public abstract void mo7019i(int i, boolean z);

    /* renamed from: j */
    public abstract void mo7020j(int i, uo3 uo3);

    /* renamed from: k */
    public abstract void mo7021k(int i, int i2);

    /* renamed from: l */
    public abstract void mo7022l(int i);

    /* renamed from: m */
    public abstract void mo7023m(int i, long j);

    /* renamed from: n */
    public abstract void mo7024n(long j);

    /* renamed from: o */
    public abstract void mo7025o(int i, int i2);

    /* renamed from: p */
    public abstract void mo7026p(int i);

    /* renamed from: q */
    public abstract void mo7027q(byte[] bArr, int i, int i2);

    /* renamed from: r */
    public abstract void mo7028r(int i, String str);

    /* renamed from: s */
    public abstract void mo7029s(int i, int i2);

    /* renamed from: t */
    public abstract void mo7030t(int i, int i2);

    /* renamed from: u */
    public abstract void mo7031u(int i);

    /* renamed from: v */
    public abstract void mo7032v(int i, long j);

    /* renamed from: w */
    public abstract void mo7033w(long j);
}
