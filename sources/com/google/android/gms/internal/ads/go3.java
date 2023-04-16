package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class go3 extends co3<Boolean> implements RandomAccess, sr3 {

    /* renamed from: i */
    private static final go3 f7545i;

    /* renamed from: g */
    private boolean[] f7546g;

    /* renamed from: h */
    private int f7547h;

    static {
        go3 go3 = new go3(new boolean[0], 0);
        f7545i = go3;
        go3.mo6244a();
    }

    go3() {
        this(new boolean[10], 0);
    }

    private go3(boolean[] zArr, int i) {
        this.f7546g = zArr;
        this.f7547h = i;
    }

    /* renamed from: j */
    private final String m9850j(int i) {
        int i2 = this.f7547h;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: k */
    private final void m9851k(int i) {
        if (i < 0 || i >= this.f7547h) {
            throw new IndexOutOfBoundsException(m9850j(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo6248h();
        if (i < 0 || i > (i2 = this.f7547h)) {
            throw new IndexOutOfBoundsException(m9850j(i));
        }
        boolean[] zArr = this.f7546g;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f7546g, i, zArr2, i + 1, this.f7547h - i);
            this.f7546g = zArr2;
        }
        this.f7546g[i] = booleanValue;
        this.f7547h++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo7667i(((Boolean) obj).booleanValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo6248h();
        kq3.m12304e(collection);
        if (!(collection instanceof go3)) {
            return super.addAll(collection);
        }
        go3 go3 = (go3) collection;
        int i = go3.f7547h;
        if (i == 0) {
            return false;
        }
        int i2 = this.f7547h;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f7546g;
            if (i3 > zArr.length) {
                this.f7546g = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(go3.f7546g, 0, this.f7546g, this.f7547h, go3.f7547h);
            this.f7547h = i3;
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
        if (i >= this.f7547h) {
            return new go3(Arrays.copyOf(this.f7546g, i), this.f7547h);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go3)) {
            return super.equals(obj);
        }
        go3 go3 = (go3) obj;
        if (this.f7547h != go3.f7547h) {
            return false;
        }
        boolean[] zArr = go3.f7546g;
        for (int i = 0; i < this.f7547h; i++) {
            if (this.f7546g[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m9851k(i);
        return Boolean.valueOf(this.f7546g[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f7547h; i2++) {
            i = (i * 31) + kq3.m12300a(this.f7546g[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public final void mo7667i(boolean z) {
        mo6248h();
        int i = this.f7547h;
        boolean[] zArr = this.f7546g;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f7546g = zArr2;
        }
        boolean[] zArr3 = this.f7546g;
        int i2 = this.f7547h;
        this.f7547h = i2 + 1;
        zArr3[i2] = z;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f7547h;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f7546g[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo6248h();
        m9851k(i);
        boolean[] zArr = this.f7546g;
        boolean z = zArr[i];
        int i2 = this.f7547h;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f7547h--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo6248h();
        if (i2 >= i) {
            boolean[] zArr = this.f7546g;
            System.arraycopy(zArr, i2, zArr, i, this.f7547h - i2);
            this.f7547h -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo6248h();
        m9851k(i);
        boolean[] zArr = this.f7546g;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f7547h;
    }
}
