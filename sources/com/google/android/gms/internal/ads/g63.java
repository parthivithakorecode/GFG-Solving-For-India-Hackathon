package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

final class g63 extends AbstractSet<Map.Entry> {

    /* renamed from: f */
    final /* synthetic */ n63 f7287f;

    g63(n63 n63) {
        this.f7287f = n63;
    }

    public final void clear() {
        this.f7287f.clear();
    }

    public final boolean contains(@CheckForNull Object obj) {
        Map o = this.f7287f.mo9444o();
        if (o != null) {
            return o.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int g = this.f7287f.m13757z(entry.getKey());
            return g != -1 && m43.m13055a(n63.m13749m(this.f7287f, g), entry.getValue());
        }
    }

    public final Iterator<Map.Entry> iterator() {
        n63 n63 = this.f7287f;
        Map o = n63.mo9444o();
        return o != null ? o.entrySet().iterator() : new e63(n63);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        r0 = r9.f7287f.m13756y();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean remove(@javax.annotation.CheckForNull java.lang.Object r10) {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.n63 r0 = r9.f7287f
            java.util.Map r0 = r0.mo9444o()
            if (r0 == 0) goto L_0x0011
            java.util.Set r0 = r0.entrySet()
            boolean r10 = r0.remove(r10)
            return r10
        L_0x0011:
            boolean r0 = r10 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L_0x0066
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            com.google.android.gms.internal.ads.n63 r0 = r9.f7287f
            boolean r0 = r0.mo9451u()
            if (r0 == 0) goto L_0x0021
            return r1
        L_0x0021:
            com.google.android.gms.internal.ads.n63 r0 = r9.f7287f
            int r0 = r0.m13756y()
            java.lang.Object r2 = r10.getKey()
            java.lang.Object r3 = r10.getValue()
            com.google.android.gms.internal.ads.n63 r10 = r9.f7287f
            java.lang.Object r5 = com.google.android.gms.internal.ads.n63.m13748l(r10)
            com.google.android.gms.internal.ads.n63 r10 = r9.f7287f
            int[] r6 = r10.m13739a()
            com.google.android.gms.internal.ads.n63 r10 = r9.f7287f
            java.lang.Object[] r7 = r10.m13740b()
            com.google.android.gms.internal.ads.n63 r10 = r9.f7287f
            java.lang.Object[] r8 = r10.m13741c()
            r4 = r0
            int r10 = com.google.android.gms.internal.ads.o63.m14327b(r2, r3, r4, r5, r6, r7, r8)
            r2 = -1
            if (r10 != r2) goto L_0x0050
            return r1
        L_0x0050:
            com.google.android.gms.internal.ads.n63 r1 = r9.f7287f
            r1.mo9450t(r10, r0)
            com.google.android.gms.internal.ads.n63 r10 = r9.f7287f
            int r0 = r10.f11332k
            int r0 = r0 + r2
            r10.f11332k = r0
            com.google.android.gms.internal.ads.n63 r10 = r9.f7287f
            r10.mo9446r()
            r10 = 1
            return r10
        L_0x0066:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.g63.remove(java.lang.Object):boolean");
    }

    public final int size() {
        return this.f7287f.size();
    }
}
