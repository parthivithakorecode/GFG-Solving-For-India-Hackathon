package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

final class vx3 extends i33 {

    /* renamed from: e */
    private final int f16628e;

    /* renamed from: f */
    private final int f16629f;

    /* renamed from: g */
    private final int[] f16630g;

    /* renamed from: h */
    private final int[] f16631h;

    /* renamed from: i */
    private final ei0[] f16632i;

    /* renamed from: j */
    private final Object[] f16633j;

    /* renamed from: k */
    private final HashMap<Object, Integer> f16634k = new HashMap<>();

    /* JADX WARNING: type inference failed for: r6v0, types: [java.util.Collection<? extends com.google.android.gms.internal.ads.jx3>, com.google.android.gms.internal.ads.l74] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public vx3(java.util.Collection r5, java.util.Collection<? extends com.google.android.gms.internal.ads.jx3> r6, com.google.android.gms.internal.ads.l74 r7) {
        /*
            r4 = this;
            r7 = 0
            r0 = 0
            r4.<init>(r7, r6, r0)
            int r6 = r5.size()
            int[] r0 = new int[r6]
            r4.f16630g = r0
            int[] r0 = new int[r6]
            r4.f16631h = r0
            com.google.android.gms.internal.ads.ei0[] r0 = new com.google.android.gms.internal.ads.ei0[r6]
            r4.f16632i = r0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r4.f16633j = r6
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            r4.f16634k = r6
            java.util.Iterator r5 = r5.iterator()
            r6 = r7
            r0 = r6
        L_0x0026:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x006d
            java.lang.Object r1 = r5.next()
            com.google.android.gms.internal.ads.jx3 r1 = (com.google.android.gms.internal.ads.jx3) r1
            com.google.android.gms.internal.ads.ei0[] r2 = r4.f16632i
            com.google.android.gms.internal.ads.ei0 r3 = r1.zza()
            r2[r0] = r3
            int[] r2 = r4.f16631h
            r2[r0] = r7
            int[] r2 = r4.f16630g
            r2[r0] = r6
            com.google.android.gms.internal.ads.ei0[] r2 = r4.f16632i
            r2 = r2[r0]
            int r2 = r2.mo6956c()
            int r7 = r7 + r2
            com.google.android.gms.internal.ads.ei0[] r2 = r4.f16632i
            r2 = r2[r0]
            int r2 = r2.mo6955b()
            int r6 = r6 + r2
            java.lang.Object[] r2 = r4.f16633j
            java.lang.Object r1 = r1.mo8550a()
            r2[r0] = r1
            int r1 = r0 + 1
            java.util.HashMap<java.lang.Object, java.lang.Integer> r2 = r4.f16634k
            java.lang.Object[] r3 = r4.f16633j
            r3 = r3[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.put(r3, r0)
            r0 = r1
            goto L_0x0026
        L_0x006d:
            r4.f16628e = r7
            r4.f16629f = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vx3.<init>(java.util.Collection, com.google.android.gms.internal.ads.l74, byte[]):void");
    }

    /* renamed from: b */
    public final int mo6955b() {
        return this.f16629f;
    }

    /* renamed from: c */
    public final int mo6956c() {
        return this.f16628e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final int mo8064p(Object obj) {
        Integer num = this.f16634k.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final int mo8065q(int i) {
        return n13.m13604I(this.f16630g, i + 1, false, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final int mo8066r(int i) {
        return n13.m13604I(this.f16631h, i + 1, false, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final int mo8067s(int i) {
        return this.f16630g[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final int mo8068t(int i) {
        return this.f16631h[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final ei0 mo8069u(int i) {
        return this.f16632i[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo8070v(int i) {
        return this.f16633j[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final List<ei0> mo11547y() {
        return Arrays.asList(this.f16632i);
    }
}
