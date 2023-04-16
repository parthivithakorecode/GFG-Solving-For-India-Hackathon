package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

final class uq3 extends yq3 {

    /* renamed from: c */
    private static final Class<?> f15715c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* synthetic */ uq3(tq3 tq3) {
        super((xq3) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.android.gms.internal.ads.rq3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.android.gms.internal.ads.rq3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.android.gms.internal.ads.rq3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <L> java.util.List<L> m18018f(java.lang.Object r3, long r4, int r6) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.gt3.m9991p(r3, r4)
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002f
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.sq3
            if (r1 == 0) goto L_0x0016
            com.google.android.gms.internal.ads.rq3 r0 = new com.google.android.gms.internal.ads.rq3
            r0.<init>((int) r6)
            goto L_0x002b
        L_0x0016:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.sr3
            if (r1 == 0) goto L_0x0026
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.jq3
            if (r1 == 0) goto L_0x0026
            com.google.android.gms.internal.ads.jq3 r0 = (com.google.android.gms.internal.ads.jq3) r0
            com.google.android.gms.internal.ads.jq3 r6 = r0.mo5923e(r6)
            r0 = r6
            goto L_0x002b
        L_0x0026:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x002b:
            com.google.android.gms.internal.ads.gt3.m9971D(r3, r4, r0)
            goto L_0x0084
        L_0x002f:
            java.lang.Class<?> r1 = f15715c
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x004d
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
        L_0x0048:
            com.google.android.gms.internal.ads.gt3.m9971D(r3, r4, r1)
            r0 = r1
            goto L_0x0084
        L_0x004d:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.bt3
            if (r1 == 0) goto L_0x0065
            com.google.android.gms.internal.ads.rq3 r1 = new com.google.android.gms.internal.ads.rq3
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>((int) r2)
            com.google.android.gms.internal.ads.bt3 r0 = (com.google.android.gms.internal.ads.bt3) r0
            int r6 = r1.size()
            r1.addAll(r6, r0)
            goto L_0x0048
        L_0x0065:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.sr3
            if (r1 == 0) goto L_0x0084
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.jq3
            if (r1 == 0) goto L_0x0084
            r1 = r0
            com.google.android.gms.internal.ads.jq3 r1 = (com.google.android.gms.internal.ads.jq3) r1
            boolean r2 = r1.mo6246c()
            if (r2 == 0) goto L_0x0077
            goto L_0x0084
        L_0x0077:
            int r0 = r0.size()
            int r0 = r0 + r6
            com.google.android.gms.internal.ads.jq3 r6 = r1.mo5923e(r0)
            com.google.android.gms.internal.ads.gt3.m9971D(r3, r4, r6)
            return r6
        L_0x0084:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.uq3.m18018f(java.lang.Object, long, int):java.util.List");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <L> List<L> mo11290a(Object obj, long j) {
        return m18018f(obj, j, 10);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo11291b(Object obj, long j) {
        Object obj2;
        List list = (List) gt3.m9991p(obj, j);
        if (list instanceof sq3) {
            obj2 = ((sq3) list).mo5947b();
        } else if (!f15715c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof sr3) || !(list instanceof jq3)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                jq3 jq3 = (jq3) list;
                if (jq3.mo6246c()) {
                    jq3.mo6244a();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        gt3.m9971D(obj, j, obj2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final <E> void mo11292c(Object obj, Object obj2, long j) {
        List list = (List) gt3.m9991p(obj2, j);
        List f = m18018f(obj, j, list.size());
        int size = f.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            f.addAll(list);
        }
        if (size > 0) {
            list = f;
        }
        gt3.m9971D(obj, j, list);
    }
}
