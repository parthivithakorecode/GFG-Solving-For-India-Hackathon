package com.google.android.gms.internal.ads;

import java.util.List;

final class ip3 {

    /* renamed from: a */
    private final hp3 f8752a;

    private ip3(hp3 hp3) {
        kq3.m12305f(hp3, "output");
        this.f8752a = hp3;
        hp3.f8381a = this;
    }

    /* renamed from: l */
    public static ip3 m11145l(hp3 hp3) {
        ip3 ip3 = hp3.f8381a;
        return ip3 != null ? ip3 : new ip3(hp3);
    }

    /* renamed from: A */
    public final void mo8198A(int i, List<Float> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f8752a.mo7029s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).floatValue();
                i3 += 4;
            }
            this.f8752a.mo7031u(i3);
            while (i2 < list.size()) {
                this.f8752a.mo7022l(Float.floatToRawIntBits(list.get(i2).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f8752a.mo7021k(i, Float.floatToRawIntBits(list.get(i2).floatValue()));
            i2++;
        }
    }

    /* renamed from: B */
    public final void mo8199B(int i, Object obj, es3 es3) {
        hp3 hp3 = this.f8752a;
        hp3.mo7029s(i, 3);
        es3.mo7067g((kr3) obj, hp3.f8381a);
        hp3.mo7029s(i, 4);
    }

    /* renamed from: C */
    public final void mo8200C(int i, int i2) {
        this.f8752a.mo7025o(i, i2);
    }

    /* renamed from: D */
    public final void mo8201D(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f8752a.mo7029s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += hp3.m10715z(list.get(i4).intValue());
            }
            this.f8752a.mo7031u(i3);
            while (i2 < list.size()) {
                this.f8752a.mo7026p(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f8752a.mo7025o(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: E */
    public final void mo8202E(int i, long j) {
        this.f8752a.mo7032v(i, j);
    }

    /* renamed from: F */
    public final void mo8203F(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f8752a.mo7029s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += hp3.m10710b(list.get(i4).longValue());
            }
            this.f8752a.mo7031u(i3);
            while (i2 < list.size()) {
                this.f8752a.mo7033w(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f8752a.mo7032v(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: G */
    public final void mo8204G(int i, Object obj, es3 es3) {
        kr3 kr3 = (kr3) obj;
        ep3 ep3 = (ep3) this.f8752a;
        ep3.mo7031u((i << 3) | 2);
        bo3 bo3 = (bo3) kr3;
        int h = bo3.mo5395h();
        if (h == -1) {
            h = es3.mo7063c(bo3);
            bo3.mo5397l(h);
        }
        ep3.mo7031u(h);
        es3.mo7067g(kr3, ep3.f8381a);
    }

    /* renamed from: H */
    public final void mo8205H(int i, int i2) {
        this.f8752a.mo7021k(i, i2);
    }

    /* renamed from: I */
    public final void mo8206I(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f8752a.mo7029s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += 4;
            }
            this.f8752a.mo7031u(i3);
            while (i2 < list.size()) {
                this.f8752a.mo7022l(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f8752a.mo7021k(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: J */
    public final void mo8207J(int i, long j) {
        this.f8752a.mo7023m(i, j);
    }

    /* renamed from: K */
    public final void mo8208K(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f8752a.mo7029s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += 8;
            }
            this.f8752a.mo7031u(i3);
            while (i2 < list.size()) {
                this.f8752a.mo7024n(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f8752a.mo7023m(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo8209a(int i, int i2) {
        this.f8752a.mo7030t(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* renamed from: b */
    public final void mo8210b(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f8752a.mo7029s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = list.get(i4).intValue();
                i3 += hp3.m10709a((intValue >> 31) ^ (intValue + intValue));
            }
            this.f8752a.mo7031u(i3);
            while (i2 < list.size()) {
                hp3 hp3 = this.f8752a;
                int intValue2 = list.get(i2).intValue();
                hp3.mo7031u((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            hp3 hp32 = this.f8752a;
            int intValue3 = list.get(i2).intValue();
            hp32.mo7030t(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo8211c(int i, long j) {
        this.f8752a.mo7032v(i, (j >> 63) ^ (j + j));
    }

    /* renamed from: d */
    public final void mo8212d(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f8752a.mo7029s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = list.get(i4).longValue();
                i3 += hp3.m10710b((longValue >> 63) ^ (longValue + longValue));
            }
            this.f8752a.mo7031u(i3);
            while (i2 < list.size()) {
                hp3 hp3 = this.f8752a;
                long longValue2 = list.get(i2).longValue();
                hp3.mo7033w((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            hp3 hp32 = this.f8752a;
            long longValue3 = list.get(i2).longValue();
            hp32.mo7032v(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    /* renamed from: e */
    public final void mo8213e(int i) {
        this.f8752a.mo7029s(i, 3);
    }

    /* renamed from: f */
    public final void mo8214f(int i, String str) {
        this.f8752a.mo7028r(i, str);
    }

    /* renamed from: g */
    public final void mo8215g(int i, List<String> list) {
        int i2 = 0;
        if (list instanceof sq3) {
            sq3 sq3 = (sq3) list;
            while (i2 < list.size()) {
                Object D = sq3.mo5946D(i2);
                if (D instanceof String) {
                    this.f8752a.mo7028r(i, (String) D);
                } else {
                    this.f8752a.mo7020j(i, (uo3) D);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f8752a.mo7028r(i, list.get(i2));
            i2++;
        }
    }

    /* renamed from: h */
    public final void mo8216h(int i, int i2) {
        this.f8752a.mo7030t(i, i2);
    }

    /* renamed from: i */
    public final void mo8217i(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f8752a.mo7029s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += hp3.m10709a(list.get(i4).intValue());
            }
            this.f8752a.mo7031u(i3);
            while (i2 < list.size()) {
                this.f8752a.mo7031u(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f8752a.mo7030t(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: j */
    public final void mo8218j(int i, long j) {
        this.f8752a.mo7032v(i, j);
    }

    /* renamed from: k */
    public final void mo8219k(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f8752a.mo7029s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += hp3.m10710b(list.get(i4).longValue());
            }
            this.f8752a.mo7031u(i3);
            while (i2 < list.size()) {
                this.f8752a.mo7033w(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f8752a.mo7032v(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: m */
    public final void mo8220m(int i, boolean z) {
        this.f8752a.mo7019i(i, z);
    }

    /* renamed from: n */
    public final void mo8221n(int i, List<Boolean> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f8752a.mo7029s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).booleanValue();
                i3++;
            }
            this.f8752a.mo7031u(i3);
            while (i2 < list.size()) {
                this.f8752a.mo7018h(list.get(i2).booleanValue() ? (byte) 1 : 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f8752a.mo7019i(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    /* renamed from: o */
    public final void mo8222o(int i, uo3 uo3) {
        this.f8752a.mo7020j(i, uo3);
    }

    /* renamed from: p */
    public final void mo8223p(int i, List<uo3> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f8752a.mo7020j(i, list.get(i2));
        }
    }

    /* renamed from: q */
    public final void mo8224q(int i, double d) {
        this.f8752a.mo7023m(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: r */
    public final void mo8225r(int i, List<Double> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f8752a.mo7029s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).doubleValue();
                i3 += 8;
            }
            this.f8752a.mo7031u(i3);
            while (i2 < list.size()) {
                this.f8752a.mo7024n(Double.doubleToRawLongBits(list.get(i2).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f8752a.mo7023m(i, Double.doubleToRawLongBits(list.get(i2).doubleValue()));
            i2++;
        }
    }

    /* renamed from: s */
    public final void mo8226s(int i) {
        this.f8752a.mo7029s(i, 4);
    }

    /* renamed from: t */
    public final void mo8227t(int i, int i2) {
        this.f8752a.mo7025o(i, i2);
    }

    /* renamed from: u */
    public final void mo8228u(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f8752a.mo7029s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += hp3.m10715z(list.get(i4).intValue());
            }
            this.f8752a.mo7031u(i3);
            while (i2 < list.size()) {
                this.f8752a.mo7026p(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f8752a.mo7025o(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: v */
    public final void mo8229v(int i, int i2) {
        this.f8752a.mo7021k(i, i2);
    }

    /* renamed from: w */
    public final void mo8230w(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f8752a.mo7029s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += 4;
            }
            this.f8752a.mo7031u(i3);
            while (i2 < list.size()) {
                this.f8752a.mo7022l(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f8752a.mo7021k(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: x */
    public final void mo8231x(int i, long j) {
        this.f8752a.mo7023m(i, j);
    }

    /* renamed from: y */
    public final void mo8232y(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f8752a.mo7029s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += 8;
            }
            this.f8752a.mo7031u(i3);
            while (i2 < list.size()) {
                this.f8752a.mo7024n(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f8752a.mo7023m(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: z */
    public final void mo8233z(int i, float f) {
        this.f8752a.mo7021k(i, Float.floatToRawIntBits(f));
    }
}
