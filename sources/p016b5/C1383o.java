package p016b5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: b5.o */
public final class C1383o extends C1406v {

    /* renamed from: c */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f3582c = AtomicIntegerFieldUpdater.newUpdater(C1383o.class, "_resumed");
    private volatile /* synthetic */ int _resumed;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1383o(p100n4.C3773d<?> r3, java.lang.Throwable r4, boolean r5) {
        /*
            r2 = this;
            if (r4 != 0) goto L_0x001d
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Continuation "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " was cancelled normally"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
        L_0x001d:
            r2.<init>(r4, r5)
            r3 = 0
            r2._resumed = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p016b5.C1383o.<init>(n4.d, java.lang.Throwable, boolean):void");
    }

    /* renamed from: c */
    public final boolean mo4760c() {
        return f3582c.compareAndSet(this, 0, 1);
    }
}
