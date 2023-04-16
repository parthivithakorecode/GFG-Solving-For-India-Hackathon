package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class ud3<P> {

    /* renamed from: a */
    private final ConcurrentMap<td3, List<rd3<P>>> f15520a = new ConcurrentHashMap();

    /* renamed from: b */
    private rd3<P> f15521b;

    /* renamed from: c */
    private final Class<P> f15522c;

    private ud3(Class<P> cls) {
        this.f15522c = cls;
    }

    /* renamed from: c */
    public static <P> ud3<P> m17856c(Class<P> cls) {
        return new ud3<>(cls);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0077  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.rd3<P> mo11204a(P r9, com.google.android.gms.internal.ads.al3 r10) {
        /*
            r8 = this;
            int r0 = r10.mo5316J()
            r1 = 3
            if (r0 != r1) goto L_0x008c
            com.google.android.gms.internal.ads.rd3 r0 = new com.google.android.gms.internal.ads.rd3
            int r2 = r10.mo5317K()
            int r2 = r2 + -2
            r3 = 5
            r4 = 1
            if (r2 == r4) goto L_0x0031
            r4 = 2
            if (r2 == r4) goto L_0x0027
            if (r2 == r1) goto L_0x0024
            r1 = 4
            if (r2 != r1) goto L_0x001c
            goto L_0x0027
        L_0x001c:
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException
            java.lang.String r10 = "unknown output prefix type"
            r9.<init>(r10)
            throw r9
        L_0x0024:
            byte[] r1 = com.google.android.gms.internal.ads.yc3.f17673a
            goto L_0x0045
        L_0x0027:
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r3)
            r2 = 0
            java.nio.ByteBuffer r1 = r1.put(r2)
            goto L_0x0039
        L_0x0031:
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r3)
            java.nio.ByteBuffer r1 = r1.put(r4)
        L_0x0039:
            int r2 = r10.mo5313F()
            java.nio.ByteBuffer r1 = r1.putInt(r2)
            byte[] r1 = r1.array()
        L_0x0045:
            r4 = r1
            int r5 = r10.mo5316J()
            int r6 = r10.mo5317K()
            int r7 = r10.mo5313F()
            r2 = r0
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r9.add(r0)
            com.google.android.gms.internal.ads.td3 r10 = new com.google.android.gms.internal.ads.td3
            byte[] r1 = r0.mo10506b()
            r2 = 0
            r10.<init>(r1, r2)
            java.util.concurrent.ConcurrentMap<com.google.android.gms.internal.ads.td3, java.util.List<com.google.android.gms.internal.ads.rd3<P>>> r1 = r8.f15520a
            java.util.List r9 = java.util.Collections.unmodifiableList(r9)
            java.lang.Object r9 = r1.put(r10, r9)
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L_0x008b
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.addAll(r9)
            r1.add(r0)
            java.util.concurrent.ConcurrentMap<com.google.android.gms.internal.ads.td3, java.util.List<com.google.android.gms.internal.ads.rd3<P>>> r9 = r8.f15520a
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r9.put(r10, r1)
        L_0x008b:
            return r0
        L_0x008c:
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException
            java.lang.String r10 = "only ENABLED key is allowed"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ud3.mo11204a(java.lang.Object, com.google.android.gms.internal.ads.al3):com.google.android.gms.internal.ads.rd3");
    }

    /* renamed from: b */
    public final rd3<P> mo11205b() {
        return this.f15521b;
    }

    /* renamed from: d */
    public final Class<P> mo11206d() {
        return this.f15522c;
    }

    /* renamed from: e */
    public final void mo11207e(rd3<P> rd3) {
        if (rd3.mo10507c() == 3) {
            List list = (List) this.f15520a.get(new td3(rd3.mo10506b(), (sd3) null));
            if (list == null) {
                list = Collections.emptyList();
            }
            if (!list.isEmpty()) {
                this.f15521b = rd3;
                return;
            }
            throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
        }
        throw new IllegalArgumentException("the primary entry has to be ENABLED");
    }
}
