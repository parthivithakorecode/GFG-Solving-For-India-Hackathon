package com.google.android.gms.internal.ads;

public final class id4 implements pd4 {

    /* renamed from: a */
    private final long[] f8624a;

    /* renamed from: b */
    private final long[] f8625b;

    /* renamed from: c */
    private final long f8626c;

    /* renamed from: d */
    private final boolean f8627d;

    public id4(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        wu1.m19205d(length == length2);
        boolean z = length2 > 0;
        this.f8627d = z;
        if (!z || jArr2[0] <= 0) {
            this.f8624a = jArr;
            this.f8625b = jArr2;
        } else {
            int i = length2 + 1;
            long[] jArr3 = new long[i];
            this.f8624a = jArr3;
            long[] jArr4 = new long[i];
            this.f8625b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.f8626c = j;
    }

    /* renamed from: b */
    public final long mo5810b() {
        return this.f8626c;
    }

    /* renamed from: d */
    public final nd4 mo5811d(long j) {
        if (!this.f8627d) {
            qd4 qd4 = qd4.f13140c;
            return new nd4(qd4, qd4);
        }
        int J = n13.m13605J(this.f8625b, j, true, true);
        qd4 qd42 = new qd4(this.f8625b[J], this.f8624a[J]);
        if (qd42.f13141a != j) {
            long[] jArr = this.f8625b;
            if (J != jArr.length - 1) {
                int i = J + 1;
                return new nd4(qd42, new qd4(jArr[i], this.f8624a[i]));
            }
        }
        return new nd4(qd42, qd42);
    }

    /* renamed from: f */
    public final boolean mo5812f() {
        return this.f8627d;
    }
}
