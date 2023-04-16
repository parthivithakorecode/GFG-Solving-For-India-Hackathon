package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.s6 */
public final class C2173s6 {

    /* renamed from: d */
    protected static final Comparator<byte[]> f14271d = new C2136r6();

    /* renamed from: a */
    private final List<byte[]> f14272a = new ArrayList();

    /* renamed from: b */
    private final List<byte[]> f14273b = new ArrayList(64);

    /* renamed from: c */
    private int f14274c = 0;

    public C2173s6(int i) {
    }

    /* renamed from: c */
    private final synchronized void m16631c() {
        while (this.f14274c > 4096) {
            byte[] remove = this.f14272a.remove(0);
            this.f14273b.remove(remove);
            this.f14274c -= remove.length;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo10737a(byte[] r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            if (r4 == 0) goto L_0x002d
            int r0 = r4.length     // Catch:{ all -> 0x002a }
            r1 = 4096(0x1000, float:5.74E-42)
            if (r0 <= r1) goto L_0x0009
            goto L_0x002d
        L_0x0009:
            java.util.List<byte[]> r1 = r3.f14272a     // Catch:{ all -> 0x002a }
            r1.add(r4)     // Catch:{ all -> 0x002a }
            java.util.List<byte[]> r1 = r3.f14273b     // Catch:{ all -> 0x002a }
            java.util.Comparator<byte[]> r2 = f14271d     // Catch:{ all -> 0x002a }
            int r1 = java.util.Collections.binarySearch(r1, r4, r2)     // Catch:{ all -> 0x002a }
            if (r1 >= 0) goto L_0x001b
            int r1 = -r1
            int r1 = r1 + -1
        L_0x001b:
            java.util.List<byte[]> r2 = r3.f14273b     // Catch:{ all -> 0x002a }
            r2.add(r1, r4)     // Catch:{ all -> 0x002a }
            int r4 = r3.f14274c     // Catch:{ all -> 0x002a }
            int r4 = r4 + r0
            r3.f14274c = r4     // Catch:{ all -> 0x002a }
            r3.m16631c()     // Catch:{ all -> 0x002a }
            monitor-exit(r3)
            return
        L_0x002a:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x002d:
            monitor-exit(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2173s6.mo10737a(byte[]):void");
    }

    /* renamed from: b */
    public final synchronized byte[] mo10738b(int i) {
        for (int i2 = 0; i2 < this.f14273b.size(); i2++) {
            byte[] bArr = this.f14273b.get(i2);
            int length = bArr.length;
            if (length >= i) {
                this.f14274c -= length;
                this.f14273b.remove(i2);
                this.f14272a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }
}
