package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zq3 extends co3<Long> implements RandomAccess, iq3, sr3 {

    /* renamed from: i */
    private static final zq3 f18330i;

    /* renamed from: g */
    private long[] f18331g;

    /* renamed from: h */
    private int f18332h;

    static {
        zq3 zq3 = new zq3(new long[0], 0);
        f18330i = zq3;
        zq3.mo6244a();
    }

    zq3() {
        this(new long[10], 0);
    }

    private zq3(long[] jArr, int i) {
        this.f18331g = jArr;
        this.f18332h = i;
    }

    /* renamed from: j */
    public static zq3 m20806j() {
        return f18330i;
    }

    /* renamed from: l */
    private final String m20807l(int i) {
        int i2 = this.f18332h;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: m */
    private final void m20808m(int i) {
        if (i < 0 || i >= this.f18332h) {
            throw new IndexOutOfBoundsException(m20807l(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo6248h();
        if (i < 0 || i > (i2 = this.f18332h)) {
            throw new IndexOutOfBoundsException(m20807l(i));
        }
        long[] jArr = this.f18331g;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f18331g, i, jArr2, i + 1, this.f18332h - i);
            this.f18331g = jArr2;
        }
        this.f18331g[i] = longValue;
        this.f18332h++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo12260k(((Long) obj).longValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo6248h();
        kq3.m12304e(collection);
        if (!(collection instanceof zq3)) {
            return super.addAll(collection);
        }
        zq3 zq3 = (zq3) collection;
        int i = zq3.f18332h;
        if (i == 0) {
            return false;
        }
        int i2 = this.f18332h;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f18331g;
            if (i3 > jArr.length) {
                this.f18331g = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(zq3.f18331g, 0, this.f18331g, this.f18332h, zq3.f18332h);
            this.f18332h = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final iq3 mo5923e(int i) {
        if (i >= this.f18332h) {
            return new zq3(Arrays.copyOf(this.f18331g, i), this.f18332h);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zq3)) {
            return super.equals(obj);
        }
        zq3 zq3 = (zq3) obj;
        if (this.f18332h != zq3.f18332h) {
            return false;
        }
        long[] jArr = zq3.f18331g;
        for (int i = 0; i < this.f18332h; i++) {
            if (this.f18331g[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m20808m(i);
        return Long.valueOf(this.f18331g[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f18332h; i2++) {
            i = (i * 31) + kq3.m12302c(this.f18331g[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public final long mo12258i(int i) {
        m20808m(i);
        return this.f18331g[i];
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f18332h;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f18331g[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final void mo12260k(long j) {
        mo6248h();
        int i = this.f18332h;
        long[] jArr = this.f18331g;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f18331g = jArr2;
        }
        long[] jArr3 = this.f18331g;
        int i2 = this.f18332h;
        this.f18332h = i2 + 1;
        jArr3[i2] = j;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo6248h();
        m20808m(i);
        long[] jArr = this.f18331g;
        long j = jArr[i];
        int i2 = this.f18332h;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f18332h--;
        this.modCount++;
        return Long.valueOf(j);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo6248h();
        if (i2 >= i) {
            long[] jArr = this.f18331g;
            System.arraycopy(jArr, i2, jArr, i, this.f18332h - i2);
            this.f18332h -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo6248h();
        m20808m(i);
        long[] jArr = this.f18331g;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f18332h;
    }
}
