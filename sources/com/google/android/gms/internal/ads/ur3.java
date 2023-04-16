package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.RandomAccess;

final class ur3<E> extends co3<E> implements RandomAccess {

    /* renamed from: i */
    private static final ur3<Object> f15737i;

    /* renamed from: g */
    private E[] f15738g;

    /* renamed from: h */
    private int f15739h;

    static {
        ur3<Object> ur3 = new ur3<>(new Object[0], 0);
        f15737i = ur3;
        ur3.mo6244a();
    }

    private ur3(E[] eArr, int i) {
        this.f15738g = eArr;
        this.f15739h = i;
    }

    /* renamed from: i */
    public static <E> ur3<E> m18027i() {
        return f15737i;
    }

    /* renamed from: j */
    private final String m18028j(int i) {
        int i2 = this.f15739h;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: k */
    private final void m18029k(int i) {
        if (i < 0 || i >= this.f15739h) {
            throw new IndexOutOfBoundsException(m18028j(i));
        }
    }

    public final void add(int i, E e) {
        int i2;
        mo6248h();
        if (i < 0 || i > (i2 = this.f15739h)) {
            throw new IndexOutOfBoundsException(m18028j(i));
        }
        E[] eArr = this.f15738g;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f15738g, i, eArr2, i + 1, this.f15739h - i);
            this.f15738g = eArr2;
        }
        this.f15738g[i] = e;
        this.f15739h++;
        this.modCount++;
    }

    public final boolean add(E e) {
        mo6248h();
        int i = this.f15739h;
        E[] eArr = this.f15738g;
        if (i == eArr.length) {
            this.f15738g = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f15738g;
        int i2 = this.f15739h;
        this.f15739h = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ jq3 mo5923e(int i) {
        if (i >= this.f15739h) {
            return new ur3(Arrays.copyOf(this.f15738g, i), this.f15739h);
        }
        throw new IllegalArgumentException();
    }

    public final E get(int i) {
        m18029k(i);
        return this.f15738g[i];
    }

    public final E remove(int i) {
        mo6248h();
        m18029k(i);
        E[] eArr = this.f15738g;
        E e = eArr[i];
        int i2 = this.f15739h;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f15739h--;
        this.modCount++;
        return e;
    }

    public final E set(int i, E e) {
        mo6248h();
        m18029k(i);
        E[] eArr = this.f15738g;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f15739h;
    }
}
