package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class up3 extends co3<Float> implements RandomAccess, sr3 {

    /* renamed from: i */
    private static final up3 f15688i;

    /* renamed from: g */
    private float[] f15689g;

    /* renamed from: h */
    private int f15690h;

    static {
        up3 up3 = new up3(new float[0], 0);
        f15688i = up3;
        up3.mo6244a();
    }

    up3() {
        this(new float[10], 0);
    }

    private up3(float[] fArr, int i) {
        this.f15689g = fArr;
        this.f15690h = i;
    }

    /* renamed from: j */
    private final String m18004j(int i) {
        int i2 = this.f15690h;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: k */
    private final void m18005k(int i) {
        if (i < 0 || i >= this.f15690h) {
            throw new IndexOutOfBoundsException(m18004j(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo6248h();
        if (i < 0 || i > (i2 = this.f15690h)) {
            throw new IndexOutOfBoundsException(m18004j(i));
        }
        float[] fArr = this.f15689g;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f15689g, i, fArr2, i + 1, this.f15690h - i);
            this.f15689g = fArr2;
        }
        this.f15689g[i] = floatValue;
        this.f15690h++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo11279i(((Float) obj).floatValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        mo6248h();
        kq3.m12304e(collection);
        if (!(collection instanceof up3)) {
            return super.addAll(collection);
        }
        up3 up3 = (up3) collection;
        int i = up3.f15690h;
        if (i == 0) {
            return false;
        }
        int i2 = this.f15690h;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f15689g;
            if (i3 > fArr.length) {
                this.f15689g = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(up3.f15689g, 0, this.f15689g, this.f15690h, up3.f15690h);
            this.f15690h = i3;
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
        if (i >= this.f15690h) {
            return new up3(Arrays.copyOf(this.f15689g, i), this.f15690h);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up3)) {
            return super.equals(obj);
        }
        up3 up3 = (up3) obj;
        if (this.f15690h != up3.f15690h) {
            return false;
        }
        float[] fArr = up3.f15689g;
        for (int i = 0; i < this.f15690h; i++) {
            if (Float.floatToIntBits(this.f15689g[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m18005k(i);
        return Float.valueOf(this.f15689g[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f15690h; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f15689g[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public final void mo11279i(float f) {
        mo6248h();
        int i = this.f15690h;
        float[] fArr = this.f15689g;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f15689g = fArr2;
        }
        float[] fArr3 = this.f15689g;
        int i2 = this.f15690h;
        this.f15690h = i2 + 1;
        fArr3[i2] = f;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f15690h;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f15689g[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo6248h();
        m18005k(i);
        float[] fArr = this.f15689g;
        float f = fArr[i];
        int i2 = this.f15690h;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f15690h--;
        this.modCount++;
        return Float.valueOf(f);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo6248h();
        if (i2 >= i) {
            float[] fArr = this.f15689g;
            System.arraycopy(fArr, i2, fArr, i, this.f15690h - i2);
            this.f15690h -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo6248h();
        m18005k(i);
        float[] fArr = this.f15689g;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f15690h;
    }
}
