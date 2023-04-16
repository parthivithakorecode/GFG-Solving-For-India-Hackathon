package kotlinx.coroutines.internal;

import p100n4.C3773d;
import p145u4.C4150l;

/* renamed from: kotlinx.coroutines.internal.i */
public final class C3384i {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C3377e0 f20872a = new C3377e0("UNDEFINED");

    /* renamed from: b */
    public static final C3377e0 f20873b = new C3377e0("REUSABLE_CLAIMED");

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0093, code lost:
        if (r8.mo4728z0() != false) goto L_0x0095;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void m24600b(p100n4.C3773d<? super T> r6, java.lang.Object r7, p145u4.C4150l<? super java.lang.Throwable, p079k4.C3330q> r8) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.internal.C3382h
            if (r0 == 0) goto L_0x00ba
            kotlinx.coroutines.internal.h r6 = (kotlinx.coroutines.internal.C3382h) r6
            java.lang.Object r8 = p016b5.C1421z.m5589c(r7, r8)
            b5.d0 r0 = r6.f20868i
            n4.g r1 = r6.getContext()
            boolean r0 = r0.mo4694P(r1)
            r1 = 1
            if (r0 == 0) goto L_0x0026
            r6.f20870k = r8
            r6.f3609h = r1
            b5.d0 r7 = r6.f20868i
            n4.g r8 = r6.getContext()
            r7.mo4673O(r8, r6)
            goto L_0x00bd
        L_0x0026:
            boolean r0 = p016b5.C1384o0.m5425a()
            b5.h2 r0 = p016b5.C1355h2.f3555a
            b5.b1 r0 = r0.mo4709a()
            boolean r2 = r0.mo4664X()
            if (r2 == 0) goto L_0x003f
            r6.f20870k = r8
            r6.f3609h = r1
            r0.mo4661T(r6)
            goto L_0x00bd
        L_0x003f:
            r0.mo4663V(r1)
            r2 = 0
            n4.g r3 = r6.getContext()     // Catch:{ all -> 0x00ad }
            b5.q1$b r4 = p016b5.C1391q1.f3593c     // Catch:{ all -> 0x00ad }
            n4.g$b r3 = r3.get(r4)     // Catch:{ all -> 0x00ad }
            b5.q1 r3 = (p016b5.C1391q1) r3     // Catch:{ all -> 0x00ad }
            if (r3 == 0) goto L_0x006d
            boolean r4 = r3.mo4641d()     // Catch:{ all -> 0x00ad }
            if (r4 != 0) goto L_0x006d
            java.util.concurrent.CancellationException r3 = r3.mo4767w()     // Catch:{ all -> 0x00ad }
            r6.mo4742d(r8, r3)     // Catch:{ all -> 0x00ad }
            k4.k$a r8 = p079k4.C3322k.f20823f     // Catch:{ all -> 0x00ad }
            java.lang.Object r8 = p079k4.C3325l.m24450a(r3)     // Catch:{ all -> 0x00ad }
            java.lang.Object r8 = p079k4.C3322k.m24446a(r8)     // Catch:{ all -> 0x00ad }
            r6.resumeWith(r8)     // Catch:{ all -> 0x00ad }
            r8 = r1
            goto L_0x006e
        L_0x006d:
            r8 = 0
        L_0x006e:
            if (r8 != 0) goto L_0x00a6
            n4.d<T> r8 = r6.f20869j     // Catch:{ all -> 0x00ad }
            java.lang.Object r3 = r6.f20871l     // Catch:{ all -> 0x00ad }
            n4.g r4 = r8.getContext()     // Catch:{ all -> 0x00ad }
            java.lang.Object r3 = kotlinx.coroutines.internal.C3385i0.m24604c(r4, r3)     // Catch:{ all -> 0x00ad }
            kotlinx.coroutines.internal.e0 r5 = kotlinx.coroutines.internal.C3385i0.f20874a     // Catch:{ all -> 0x00ad }
            if (r3 == r5) goto L_0x0085
            b5.j2 r8 = p016b5.C1323c0.m5290f(r8, r4, r3)     // Catch:{ all -> 0x00ad }
            goto L_0x0086
        L_0x0085:
            r8 = r2
        L_0x0086:
            n4.d<T> r5 = r6.f20869j     // Catch:{ all -> 0x0099 }
            r5.resumeWith(r7)     // Catch:{ all -> 0x0099 }
            k4.q r7 = p079k4.C3330q.f20829a     // Catch:{ all -> 0x0099 }
            if (r8 == 0) goto L_0x0095
            boolean r7 = r8.mo4728z0()     // Catch:{ all -> 0x00ad }
            if (r7 == 0) goto L_0x00a6
        L_0x0095:
            kotlinx.coroutines.internal.C3385i0.m24602a(r4, r3)     // Catch:{ all -> 0x00ad }
            goto L_0x00a6
        L_0x0099:
            r7 = move-exception
            if (r8 == 0) goto L_0x00a2
            boolean r8 = r8.mo4728z0()     // Catch:{ all -> 0x00ad }
            if (r8 == 0) goto L_0x00a5
        L_0x00a2:
            kotlinx.coroutines.internal.C3385i0.m24602a(r4, r3)     // Catch:{ all -> 0x00ad }
        L_0x00a5:
            throw r7     // Catch:{ all -> 0x00ad }
        L_0x00a6:
            boolean r7 = r0.mo4666Z()     // Catch:{ all -> 0x00ad }
            if (r7 != 0) goto L_0x00a6
            goto L_0x00b1
        L_0x00ad:
            r7 = move-exception
            r6.mo4788k(r7, r2)     // Catch:{ all -> 0x00b5 }
        L_0x00b1:
            r0.mo4660R(r1)
            goto L_0x00bd
        L_0x00b5:
            r6 = move-exception
            r0.mo4660R(r1)
            throw r6
        L_0x00ba:
            r6.resumeWith(r7)
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C3384i.m24600b(n4.d, java.lang.Object, u4.l):void");
    }

    /* renamed from: c */
    public static /* synthetic */ void m24601c(C3773d dVar, Object obj, C4150l lVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            lVar = null;
        }
        m24600b(dVar, obj, lVar);
    }
}
