package kotlinx.coroutines.internal;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p145u4.C4150l;

/* renamed from: kotlinx.coroutines.internal.n0 */
final class C3404n0 extends C3380g {

    /* renamed from: a */
    public static final C3404n0 f20900a = new C3404n0();

    /* renamed from: b */
    private static final ReentrantReadWriteLock f20901b = new ReentrantReadWriteLock();

    /* renamed from: c */
    private static final WeakHashMap<Class<? extends Throwable>, C4150l<Throwable, Throwable>> f20902c = new WeakHashMap<>();

    private C3404n0() {
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: a */
    public p145u4.C4150l<java.lang.Throwable, java.lang.Throwable> mo14409a(java.lang.Class<? extends java.lang.Throwable> r7) {
        /*
            r6 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f20901b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            r1.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, u4.l<java.lang.Throwable, java.lang.Throwable>> r2 = f20902c     // Catch:{ all -> 0x006e }
            java.lang.Object r2 = r2.get(r7)     // Catch:{ all -> 0x006e }
            u4.l r2 = (p145u4.C4150l) r2     // Catch:{ all -> 0x006e }
            r1.unlock()
            if (r2 != 0) goto L_0x006d
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L_0x0026
            int r2 = r0.getReadHoldCount()
            goto L_0x0027
        L_0x0026:
            r2 = r3
        L_0x0027:
            r4 = r3
        L_0x0028:
            if (r4 >= r2) goto L_0x0030
            int r4 = r4 + 1
            r1.unlock()
            goto L_0x0028
        L_0x0030:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, u4.l<java.lang.Throwable, java.lang.Throwable>> r4 = f20902c     // Catch:{ all -> 0x0060 }
            java.lang.Object r5 = r4.get(r7)     // Catch:{ all -> 0x0060 }
            u4.l r5 = (p145u4.C4150l) r5     // Catch:{ all -> 0x0060 }
            if (r5 != 0) goto L_0x0054
            u4.l r5 = kotlinx.coroutines.internal.C3389j.m24609b(r7)     // Catch:{ all -> 0x0060 }
            r4.put(r7, r5)     // Catch:{ all -> 0x0060 }
        L_0x0048:
            if (r3 >= r2) goto L_0x0050
            int r3 = r3 + 1
            r1.lock()
            goto L_0x0048
        L_0x0050:
            r0.unlock()
            return r5
        L_0x0054:
            if (r3 >= r2) goto L_0x005c
            int r3 = r3 + 1
            r1.lock()
            goto L_0x0054
        L_0x005c:
            r0.unlock()
            return r5
        L_0x0060:
            r7 = move-exception
        L_0x0061:
            if (r3 >= r2) goto L_0x0069
            int r3 = r3 + 1
            r1.lock()
            goto L_0x0061
        L_0x0069:
            r0.unlock()
            throw r7
        L_0x006d:
            return r2
        L_0x006e:
            r7 = move-exception
            r1.unlock()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C3404n0.mo14409a(java.lang.Class):u4.l");
    }
}
