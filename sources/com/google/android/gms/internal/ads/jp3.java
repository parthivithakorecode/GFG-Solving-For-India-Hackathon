package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class jp3 extends co3<Double> implements RandomAccess, sr3 {

    /* renamed from: i */
    private static final jp3 f9220i;

    /* renamed from: g */
    private double[] f9221g;

    /* renamed from: h */
    private int f9222h;

    static {
        jp3 jp3 = new jp3(new double[0], 0);
        f9220i = jp3;
        jp3.mo6244a();
    }

    jp3() {
        this(new double[10], 0);
    }

    private jp3(double[] dArr, int i) {
        this.f9221g = dArr;
        this.f9222h = i;
    }

    /* renamed from: j */
    private final String m11767j(int i) {
        int i2 = this.f9222h;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: k */
    private final void m11768k(int i) {
        if (i < 0 || i >= this.f9222h) {
            throw new IndexOutOfBoundsException(m11767j(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo6248h();
        if (i < 0 || i > (i2 = this.f9222h)) {
            throw new IndexOutOfBoundsException(m11767j(i));
        }
        double[] dArr = this.f9221g;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f9221g, i, dArr2, i + 1, this.f9222h - i);
            this.f9221g = dArr2;
        }
        this.f9221g[i] = doubleValue;
        this.f9222h++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo8509i(((Double) obj).doubleValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo6248h();
        kq3.m12304e(collection);
        if (!(collection instanceof jp3)) {
            return super.addAll(collection);
        }
        jp3 jp3 = (jp3) collection;
        int i = jp3.f9222h;
        if (i == 0) {
            return false;
        }
        int i2 = this.f9222h;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f9221g;
            if (i3 > dArr.length) {
                this.f9221g = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(jp3.f9221g, 0, this.f9221g, this.f9222h, jp3.f9222h);
            this.f9222h = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ jq3 mo5923e(int i) {
        if (i >= this.f9222h) {
            return new jp3(Arrays.copyOf(this.f9221g, i), this.f9222h);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp3)) {
            return super.equals(obj);
        }
        jp3 jp3 = (jp3) obj;
        if (this.f9222h != jp3.f9222h) {
            return false;
        }
        double[] dArr = jp3.f9221g;
        for (int i = 0; i < this.f9222h; i++) {
            if (Double.doubleToLongBits(this.f9221g[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m11768k(i);
        return Double.valueOf(this.f9221g[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f9222h; i2++) {
            i = (i * 31) + kq3.m12302c(Double.doubleToLongBits(this.f9221g[i2]));
        }
        return i;
    }

    /* renamed from: i */
    public final void mo8509i(double d) {
        mo6248h();
        int i = this.f9222h;
        double[] dArr = this.f9221g;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f9221g = dArr2;
        }
        double[] dArr3 = this.f9221g;
        int i2 = this.f9222h;
        this.f9222h = i2 + 1;
        dArr3[i2] = d;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f9222h;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f9221g[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo6248h();
        m11768k(i);
        double[] dArr = this.f9221g;
        double d = dArr[i];
        int i2 = this.f9222h;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f9222h--;
        this.modCount++;
        return Double.valueOf(d);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo6248h();
        if (i2 >= i) {
            double[] dArr = this.f9221g;
            System.arraycopy(dArr, i2, dArr, i, this.f9222h - i2);
            this.f9222h -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo6248h();
        m11768k(i);
        double[] dArr = this.f9221g;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f9222h;
    }
}
