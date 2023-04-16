package com.google.android.gms.internal.ads;

import android.util.SparseArray;

final class n74<V> {

    /* renamed from: a */
    private int f11343a;

    /* renamed from: b */
    private final SparseArray<V> f11344b = new SparseArray<>();

    /* renamed from: c */
    private final bz1<V> f11345c;

    public n74(bz1<V> bz1) {
        this.f11345c = bz1;
        this.f11343a = -1;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x001a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: a */
    public final V mo9460a(int r4) {
        /*
            r3 = this;
            int r0 = r3.f11343a
            r1 = -1
            if (r0 == r1) goto L_0x0006
            goto L_0x0009
        L_0x0006:
            r0 = 0
        L_0x0007:
            r3.f11343a = r0
        L_0x0009:
            int r0 = r3.f11343a
            if (r0 > 0) goto L_0x000e
            goto L_0x001a
        L_0x000e:
            android.util.SparseArray<V> r2 = r3.f11344b
            int r0 = r2.keyAt(r0)
            if (r4 >= r0) goto L_0x001a
            int r0 = r3.f11343a
            int r0 = r0 + r1
            goto L_0x0007
        L_0x001a:
            int r0 = r3.f11343a
            android.util.SparseArray<V> r2 = r3.f11344b
            int r2 = r2.size()
            int r2 = r2 + r1
            if (r0 >= r2) goto L_0x0038
            android.util.SparseArray<V> r0 = r3.f11344b
            int r2 = r3.f11343a
            int r2 = r2 + 1
            int r0 = r0.keyAt(r2)
            if (r4 < r0) goto L_0x0038
            int r0 = r3.f11343a
            int r0 = r0 + 1
            r3.f11343a = r0
            goto L_0x001a
        L_0x0038:
            android.util.SparseArray<V> r4 = r3.f11344b
            int r0 = r3.f11343a
            java.lang.Object r4 = r4.valueAt(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n74.mo9460a(int):java.lang.Object");
    }

    /* renamed from: b */
    public final V mo9461b() {
        SparseArray<V> sparseArray = this.f11344b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    /* renamed from: c */
    public final void mo9462c(int i, V v) {
        boolean z = true;
        if (this.f11343a == -1) {
            wu1.m19207f(this.f11344b.size() == 0);
            this.f11343a = 0;
        }
        if (this.f11344b.size() > 0) {
            SparseArray<V> sparseArray = this.f11344b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            if (i < keyAt) {
                z = false;
            }
            wu1.m19205d(z);
            if (keyAt == i) {
                SparseArray<V> sparseArray2 = this.f11344b;
                h74.m10352A((f74) sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f11344b.append(i, v);
    }

    /* renamed from: d */
    public final void mo9463d() {
        for (int i = 0; i < this.f11344b.size(); i++) {
            h74.m10352A((f74) this.f11344b.valueAt(i));
        }
        this.f11343a = -1;
        this.f11344b.clear();
    }

    /* renamed from: e */
    public final void mo9464e(int i) {
        int i2 = 0;
        while (i2 < this.f11344b.size() - 1) {
            int i3 = i2 + 1;
            if (i >= this.f11344b.keyAt(i3)) {
                h74.m10352A((f74) this.f11344b.valueAt(i2));
                this.f11344b.removeAt(i2);
                int i4 = this.f11343a;
                if (i4 > 0) {
                    this.f11343a = i4 - 1;
                }
                i2 = i3;
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public final boolean mo9465f() {
        return this.f11344b.size() == 0;
    }
}
