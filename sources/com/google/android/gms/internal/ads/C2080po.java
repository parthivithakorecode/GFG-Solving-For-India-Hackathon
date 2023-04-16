package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import p054h1.C2694t;

@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.po */
public final class C2080po {

    /* renamed from: a */
    private final Object f12726a = new Object();

    /* renamed from: b */
    int f12727b;

    /* renamed from: c */
    private final List<C2043oo> f12728c = new LinkedList();

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0060, code lost:
        return r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C2043oo mo10113a(boolean r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f12726a
            monitor-enter(r0)
            java.util.List<com.google.android.gms.internal.ads.oo> r1 = r8.f12728c     // Catch:{ all -> 0x0061 }
            int r1 = r1.size()     // Catch:{ all -> 0x0061 }
            r2 = 0
            if (r1 != 0) goto L_0x0013
            java.lang.String r9 = "Queue empty"
            com.google.android.gms.internal.ads.io0.m11126b(r9)     // Catch:{ all -> 0x0061 }
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r2
        L_0x0013:
            java.util.List<com.google.android.gms.internal.ads.oo> r1 = r8.f12728c     // Catch:{ all -> 0x0061 }
            int r1 = r1.size()     // Catch:{ all -> 0x0061 }
            r3 = 2
            r4 = 0
            if (r1 < r3) goto L_0x004c
            java.util.List<com.google.android.gms.internal.ads.oo> r9 = r8.f12728c     // Catch:{ all -> 0x0061 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0061 }
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r4
        L_0x0026:
            boolean r5 = r9.hasNext()     // Catch:{ all -> 0x0061 }
            if (r5 == 0) goto L_0x0045
            java.lang.Object r5 = r9.next()     // Catch:{ all -> 0x0061 }
            com.google.android.gms.internal.ads.oo r5 = (com.google.android.gms.internal.ads.C2043oo) r5     // Catch:{ all -> 0x0061 }
            int r6 = r5.mo9810b()     // Catch:{ all -> 0x0061 }
            if (r6 <= r1) goto L_0x0039
            r4 = r3
        L_0x0039:
            if (r6 <= r1) goto L_0x003d
            r7 = r6
            goto L_0x003e
        L_0x003d:
            r7 = r1
        L_0x003e:
            if (r6 <= r1) goto L_0x0041
            r2 = r5
        L_0x0041:
            int r3 = r3 + 1
            r1 = r7
            goto L_0x0026
        L_0x0045:
            java.util.List<com.google.android.gms.internal.ads.oo> r9 = r8.f12728c     // Catch:{ all -> 0x0061 }
            r9.remove(r4)     // Catch:{ all -> 0x0061 }
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r2
        L_0x004c:
            java.util.List<com.google.android.gms.internal.ads.oo> r1 = r8.f12728c     // Catch:{ all -> 0x0061 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0061 }
            com.google.android.gms.internal.ads.oo r1 = (com.google.android.gms.internal.ads.C2043oo) r1     // Catch:{ all -> 0x0061 }
            if (r9 == 0) goto L_0x005c
            java.util.List<com.google.android.gms.internal.ads.oo> r9 = r8.f12728c     // Catch:{ all -> 0x0061 }
            r9.remove(r4)     // Catch:{ all -> 0x0061 }
            goto L_0x005f
        L_0x005c:
            r1.mo9819i()     // Catch:{ all -> 0x0061 }
        L_0x005f:
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r1
        L_0x0061:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2080po.mo10113a(boolean):com.google.android.gms.internal.ads.oo");
    }

    /* renamed from: b */
    public final void mo10114b(C2043oo ooVar) {
        synchronized (this.f12726a) {
            if (this.f12728c.size() >= 10) {
                int size = this.f12728c.size();
                StringBuilder sb = new StringBuilder(41);
                sb.append("Queue is full, current size = ");
                sb.append(size);
                io0.m11126b(sb.toString());
                this.f12728c.remove(0);
            }
            int i = this.f12727b;
            this.f12727b = i + 1;
            ooVar.mo9820j(i);
            ooVar.mo9824n();
            this.f12728c.add(ooVar);
        }
    }

    /* renamed from: c */
    public final boolean mo10115c(C2043oo ooVar) {
        synchronized (this.f12726a) {
            Iterator<C2043oo> it = this.f12728c.iterator();
            while (it.hasNext()) {
                C2043oo next = it.next();
                if (!C2694t.m21607p().mo11025h().mo14102w()) {
                    if (ooVar != next && next.mo9812d().equals(ooVar.mo9812d())) {
                        it.remove();
                        return true;
                    }
                } else if (!C2694t.m21607p().mo11025h().mo14101v() && ooVar != next && next.mo9815f().equals(ooVar.mo9815f())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: d */
    public final boolean mo10116d(C2043oo ooVar) {
        synchronized (this.f12726a) {
            return this.f12728c.contains(ooVar);
        }
    }
}
