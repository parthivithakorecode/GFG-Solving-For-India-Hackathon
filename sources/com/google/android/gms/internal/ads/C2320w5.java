package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.w5 */
public final class C2320w5 {

    /* renamed from: a */
    public final int f16708a;

    /* renamed from: b */
    public final byte[] f16709b;

    /* renamed from: c */
    public final Map<String, String> f16710c;

    /* renamed from: d */
    public final List<C2172s5> f16711d;

    /* renamed from: e */
    public final boolean f16712e;

    private C2320w5(int i, byte[] bArr, Map<String, String> map, List<C2172s5> list, boolean z, long j) {
        this.f16708a = i;
        this.f16709b = bArr;
        this.f16710c = map;
        this.f16711d = list == null ? null : Collections.unmodifiableList(list);
        this.f16712e = z;
    }

    @Deprecated
    public C2320w5(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        this(i, bArr, map, m18878a(map), z, j);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2320w5(int r9, byte[] r10, boolean r11, long r12, java.util.List<com.google.android.gms.internal.ads.C2172s5> r14) {
        /*
            r8 = this;
            if (r14 != 0) goto L_0x0005
            r0 = 0
        L_0x0003:
            r3 = r0
            goto L_0x0033
        L_0x0005:
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L_0x0010
            java.util.Map r0 = java.util.Collections.emptyMap()
            goto L_0x0003
        L_0x0010:
            java.util.TreeMap r0 = new java.util.TreeMap
            java.util.Comparator r1 = java.lang.String.CASE_INSENSITIVE_ORDER
            r0.<init>(r1)
            java.util.Iterator r1 = r14.iterator()
        L_0x001b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0003
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.ads.s5 r2 = (com.google.android.gms.internal.ads.C2172s5) r2
            java.lang.String r3 = r2.mo10727a()
            java.lang.String r2 = r2.mo10728b()
            r0.put(r3, r2)
            goto L_0x001b
        L_0x0033:
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r14
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2320w5.<init>(int, byte[], boolean, long, java.util.List):void");
    }

    @Deprecated
    public C2320w5(byte[] bArr, Map<String, String> map) {
        this(200, bArr, map, m18878a(map), false, 0);
    }

    /* renamed from: a */
    private static List<C2172s5> m18878a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(new C2172s5((String) next.getKey(), (String) next.getValue()));
        }
        return arrayList;
    }
}
