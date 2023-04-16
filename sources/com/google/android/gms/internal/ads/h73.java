package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class h73<K, V> {

    /* renamed from: a */
    Object[] f8074a;

    /* renamed from: b */
    int f8075b;

    public h73() {
        this(4);
    }

    h73(int i) {
        this.f8074a = new Object[(i + i)];
        this.f8075b = 0;
    }

    /* renamed from: d */
    private final void m10348d(int i) {
        int i2 = i + i;
        Object[] objArr = this.f8074a;
        int length = objArr.length;
        if (i2 > length) {
            this.f8074a = Arrays.copyOf(objArr, y63.m19907b(length, i2));
        }
    }

    /* renamed from: a */
    public final h73<K, V> mo7859a(K k, V v) {
        m10348d(this.f8075b + 1);
        c63.m7235b(k, v);
        Object[] objArr = this.f8074a;
        int i = this.f8075b;
        int i2 = i + i;
        objArr[i2] = k;
        objArr[i2 + 1] = v;
        this.f8075b = i + 1;
        return this;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Collection, java.lang.Iterable<? extends java.util.Map$Entry<? extends K, ? extends V>>, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.h73<K, V> mo7860b(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L_0x000e
            int r0 = r2.f8075b
            int r1 = r3.size()
            int r0 = r0 + r1
            r2.m10348d(r0)
        L_0x000e:
            java.util.Iterator r3 = r3.iterator()
        L_0x0012:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r2.mo7859a(r1, r0)
            goto L_0x0012
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.h73.mo7860b(java.lang.Iterable):com.google.android.gms.internal.ads.h73");
    }

    /* renamed from: c */
    public final i73<K, V> mo7861c() {
        return y83.m19923h(this.f8075b, this.f8074a);
    }
}
