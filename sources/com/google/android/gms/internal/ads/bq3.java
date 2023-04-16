package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class bq3 extends co3<Integer> implements RandomAccess, fq3, sr3 {

    /* renamed from: i */
    private static final bq3 f5014i;

    /* renamed from: g */
    private int[] f5015g;

    /* renamed from: h */
    private int f5016h;

    static {
        bq3 bq3 = new bq3(new int[0], 0);
        f5014i = bq3;
        bq3.mo6244a();
    }

    bq3() {
        this(new int[10], 0);
    }

    private bq3(int[] iArr, int i) {
        this.f5015g = iArr;
        this.f5016h = i;
    }

    /* renamed from: j */
    public static bq3 m7023j() {
        return f5014i;
    }

    /* renamed from: k */
    private final String m7024k(int i) {
        int i2 = this.f5016h;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: l */
    private final void m7025l(int i) {
        if (i < 0 || i >= this.f5016h) {
            throw new IndexOutOfBoundsException(m7024k(i));
        }
    }

    /* renamed from: A */
    public final fq3 mo5923e(int i) {
        if (i >= this.f5016h) {
            return new bq3(Arrays.copyOf(this.f5015g, i), this.f5016h);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: N */
    public final void mo5918N(int i) {
        mo6248h();
        int i2 = this.f5016h;
        int[] iArr = this.f5015g;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f5015g = iArr2;
        }
        int[] iArr3 = this.f5015g;
        int i3 = this.f5016h;
        this.f5016h = i3 + 1;
        iArr3[i3] = i;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo6248h();
        if (i < 0 || i > (i2 = this.f5016h)) {
            throw new IndexOutOfBoundsException(m7024k(i));
        }
        int[] iArr = this.f5015g;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f5015g, i, iArr2, i + 1, this.f5016h - i);
            this.f5015g = iArr2;
        }
        this.f5015g[i] = intValue;
        this.f5016h++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo5918N(((Integer) obj).intValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo6248h();
        kq3.m12304e(collection);
        if (!(collection instanceof bq3)) {
            return super.addAll(collection);
        }
        bq3 bq3 = (bq3) collection;
        int i = bq3.f5016h;
        if (i == 0) {
            return false;
        }
        int i2 = this.f5016h;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f5015g;
            if (i3 > iArr.length) {
                this.f5015g = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(bq3.f5015g, 0, this.f5015g, this.f5016h, bq3.f5016h);
            this.f5016h = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq3)) {
            return super.equals(obj);
        }
        bq3 bq3 = (bq3) obj;
        if (this.f5016h != bq3.f5016h) {
            return false;
        }
        int[] iArr = bq3.f5015g;
        for (int i = 0; i < this.f5016h; i++) {
            if (this.f5015g[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m7025l(i);
        return Integer.valueOf(this.f5015g[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f5016h; i2++) {
            i = (i * 31) + this.f5015g[i2];
        }
        return i;
    }

    /* renamed from: i */
    public final int mo5927i(int i) {
        m7025l(i);
        return this.f5015g[i];
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f5016h;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f5015g[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo6248h();
        m7025l(i);
        int[] iArr = this.f5015g;
        int i2 = iArr[i];
        int i3 = this.f5016h;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f5016h--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo6248h();
        if (i2 >= i) {
            int[] iArr = this.f5015g;
            System.arraycopy(iArr, i2, iArr, i, this.f5016h - i2);
            this.f5016h -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo6248h();
        m7025l(i);
        int[] iArr = this.f5015g;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f5016h;
    }
}
