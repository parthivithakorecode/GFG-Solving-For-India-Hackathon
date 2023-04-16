package com.google.android.gms.internal.ads;

import java.util.Objects;
import javax.annotation.CheckForNull;

public final class o73<E> extends x63<E> {
    @CheckForNull

    /* renamed from: d */
    Object[] f11935d;

    /* renamed from: e */
    private int f11936e;

    o73(int i) {
        super(i);
        this.f11935d = new Object[p73.m14864o(i)];
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ y63 mo5729a(Object obj) {
        mo9696f(obj);
        return this;
    }

    /* renamed from: f */
    public final o73<E> mo9696f(E e) {
        int length;
        Objects.requireNonNull(e);
        if (this.f11935d == null || p73.m14864o(this.f17052b) > (length = this.f11935d.length)) {
            this.f11935d = null;
            super.mo11775c(e);
            return this;
        }
        int i = length - 1;
        int hashCode = e.hashCode();
        int a = w63.m18895a(hashCode);
        while (true) {
            int i2 = a & i;
            Object[] objArr = this.f11935d;
            Object obj = objArr[i2];
            if (obj != null) {
                if (obj.equals(e)) {
                    break;
                }
                a = i2 + 1;
            } else {
                objArr[i2] = e;
                this.f11936e += hashCode;
                super.mo11775c(e);
                break;
            }
        }
        return this;
    }

    /* renamed from: g */
    public final o73<E> mo9697g(Iterable<? extends E> iterable) {
        if (this.f11935d != null) {
            for (Object f : iterable) {
                mo9696f(f);
            }
        } else {
            super.mo11776d(iterable);
        }
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.google.android.gms.internal.ads.z83} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.google.android.gms.internal.ads.p73} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: com.google.android.gms.internal.ads.z83} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.google.android.gms.internal.ads.z83} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.p73<E> mo9698h() {
        /*
            r8 = this;
            int r0 = r8.f17052b
            if (r0 == 0) goto L_0x005d
            r1 = 1
            if (r0 == r1) goto L_0x004f
            java.lang.Object[] r2 = r8.f11935d
            if (r2 == 0) goto L_0x003b
            int r0 = com.google.android.gms.internal.ads.p73.m14864o(r0)
            java.lang.Object[] r2 = r8.f11935d
            int r2 = r2.length
            if (r0 != r2) goto L_0x003b
            int r0 = r8.f17052b
            java.lang.Object[] r2 = r8.f17051a
            int r2 = r2.length
            boolean r0 = com.google.android.gms.internal.ads.p73.m14871x(r0, r2)
            if (r0 == 0) goto L_0x0028
            java.lang.Object[] r0 = r8.f17051a
            int r2 = r8.f17052b
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            goto L_0x002a
        L_0x0028:
            java.lang.Object[] r0 = r8.f17051a
        L_0x002a:
            r3 = r0
            com.google.android.gms.internal.ads.z83 r0 = new com.google.android.gms.internal.ads.z83
            int r4 = r8.f11936e
            java.lang.Object[] r5 = r8.f11935d
            int r2 = r5.length
            int r6 = r2 + -1
            int r7 = r8.f17052b
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x0049
        L_0x003b:
            int r0 = r8.f17052b
            java.lang.Object[] r2 = r8.f17051a
            com.google.android.gms.internal.ads.p73 r0 = com.google.android.gms.internal.ads.p73.m14870w(r0, r2)
            int r2 = r0.size()
            r8.f17052b = r2
        L_0x0049:
            r8.f17053c = r1
            r1 = 0
            r8.f11935d = r1
            return r0
        L_0x004f:
            java.lang.Object[] r0 = r8.f17051a
            r1 = 0
            r0 = r0[r1]
            r0.getClass()
            com.google.android.gms.internal.ads.e93 r1 = new com.google.android.gms.internal.ads.e93
            r1.<init>(r0)
            return r1
        L_0x005d:
            com.google.android.gms.internal.ads.z83<java.lang.Object> r0 = com.google.android.gms.internal.ads.z83.f18109n
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o73.mo9698h():com.google.android.gms.internal.ads.p73");
    }
}
