package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class le4 extends ne4 {

    /* renamed from: b */
    private long f10021b = -9223372036854775807L;

    /* renamed from: c */
    private long[] f10022c = new long[0];

    /* renamed from: d */
    private long[] f10023d = new long[0];

    public le4() {
        super(new nc4());
    }

    /* renamed from: g */
    private static Double m12714g(dr2 dr2) {
        return Double.valueOf(Double.longBitsToDouble(dr2.mo6600z()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v4, types: [int] */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object m12715h(com.google.android.gms.internal.ads.dr2 r4, int r5) {
        /*
            if (r5 == 0) goto L_0x007a
            r0 = 0
            r1 = 1
            if (r5 == r1) goto L_0x006e
            r1 = 2
            if (r5 == r1) goto L_0x0069
            r2 = 3
            if (r5 == r2) goto L_0x004d
            r2 = 8
            if (r5 == r2) goto L_0x0048
            r2 = 10
            if (r5 == r2) goto L_0x002c
            r0 = 11
            if (r5 == r0) goto L_0x001a
            r4 = 0
            return r4
        L_0x001a:
            java.util.Date r5 = new java.util.Date
            java.lang.Double r0 = m12714g(r4)
            double r2 = r0.doubleValue()
            long r2 = (long) r2
            r5.<init>(r2)
            r4.mo6581g(r1)
            return r5
        L_0x002c:
            int r5 = r4.mo6596v()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r5)
        L_0x0035:
            if (r0 >= r5) goto L_0x0047
            int r2 = r4.mo6593s()
            java.lang.Object r2 = m12715h(r4, r2)
            if (r2 == 0) goto L_0x0044
            r1.add(r2)
        L_0x0044:
            int r0 = r0 + 1
            goto L_0x0035
        L_0x0047:
            return r1
        L_0x0048:
            java.util.HashMap r4 = m12717j(r4)
            return r4
        L_0x004d:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
        L_0x0052:
            java.lang.String r0 = m12716i(r4)
            int r1 = r4.mo6593s()
            r2 = 9
            if (r1 != r2) goto L_0x005f
            return r5
        L_0x005f:
            java.lang.Object r1 = m12715h(r4, r1)
            if (r1 == 0) goto L_0x0052
            r5.put(r0, r1)
            goto L_0x0052
        L_0x0069:
            java.lang.String r4 = m12716i(r4)
            return r4
        L_0x006e:
            int r4 = r4.mo6593s()
            if (r4 != r1) goto L_0x0075
            r0 = r1
        L_0x0075:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x007a:
            java.lang.Double r4 = m12714g(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.le4.m12715h(com.google.android.gms.internal.ads.dr2, int):java.lang.Object");
    }

    /* renamed from: i */
    private static String m12716i(dr2 dr2) {
        int w = dr2.mo6597w();
        int k = dr2.mo6585k();
        dr2.mo6581g(w);
        return new String(dr2.mo6582h(), k, w);
    }

    /* renamed from: j */
    private static HashMap<String, Object> m12717j(dr2 dr2) {
        int v = dr2.mo6596v();
        HashMap<String, Object> hashMap = new HashMap<>(v);
        for (int i = 0; i < v; i++) {
            String i2 = m12716i(dr2);
            Object h = m12715h(dr2, dr2.mo6593s());
            if (h != null) {
                hashMap.put(i2, h);
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo8133a(dr2 dr2) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo8134b(dr2 dr2, long j) {
        if (dr2.mo6593s() != 2 || !"onMetaData".equals(m12716i(dr2)) || dr2.mo6593s() != 8) {
            return false;
        }
        HashMap<String, Object> j2 = m12717j(dr2);
        Object obj = j2.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f10021b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = j2.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f10022c = new long[size];
                this.f10023d = new long[size];
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f10022c = new long[0];
                        this.f10023d = new long[0];
                    } else {
                        this.f10022c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f10023d[i] = ((Double) obj5).longValue();
                        i++;
                    }
                }
                this.f10022c = new long[0];
                this.f10023d = new long[0];
            }
        }
        return false;
    }

    /* renamed from: d */
    public final long mo8936d() {
        return this.f10021b;
    }

    /* renamed from: e */
    public final long[] mo8937e() {
        return this.f10023d;
    }

    /* renamed from: f */
    public final long[] mo8938f() {
        return this.f10022c;
    }
}
