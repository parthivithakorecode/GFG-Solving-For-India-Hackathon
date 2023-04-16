package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

class x63<E> extends y63<E> {

    /* renamed from: a */
    Object[] f17051a;

    /* renamed from: b */
    int f17052b = 0;

    /* renamed from: c */
    boolean f17053c;

    x63(int i) {
        this.f17051a = new Object[i];
    }

    /* renamed from: e */
    private final void m19374e(int i) {
        Object[] objArr = this.f17051a;
        int length = objArr.length;
        if (length < i) {
            this.f17051a = Arrays.copyOf(objArr, y63.m19907b(length, i));
        } else if (this.f17053c) {
            this.f17051a = (Object[]) objArr.clone();
        } else {
            return;
        }
        this.f17053c = false;
    }

    /* renamed from: c */
    public final x63<E> mo11775c(E e) {
        Objects.requireNonNull(e);
        m19374e(this.f17052b + 1);
        Object[] objArr = this.f17051a;
        int i = this.f17052b;
        this.f17052b = i + 1;
        objArr[i] = e;
        return this;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Collection, java.lang.Iterable<? extends E>, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.y63<E> mo11776d(java.lang.Iterable<? extends E> r3) {
        /*
            r2 = this;
            int r0 = r2.f17052b
            int r1 = r3.size()
            int r0 = r0 + r1
            r2.m19374e(r0)
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.z63
            if (r0 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.iterator()
        L_0x0012:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0020
            java.lang.Object r0 = r3.next()
            r2.mo5729a(r0)
            goto L_0x0012
        L_0x0020:
            return r2
        L_0x0021:
            com.google.android.gms.internal.ads.z63 r3 = (com.google.android.gms.internal.ads.z63) r3
            java.lang.Object[] r0 = r2.f17051a
            int r1 = r2.f17052b
            int r3 = r3.mo6858h(r0, r1)
            r2.f17052b = r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.x63.mo11776d(java.lang.Iterable):com.google.android.gms.internal.ads.y63");
    }
}
