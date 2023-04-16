package p016b5;

import kotlin.jvm.internal.C3357i;
import kotlinx.coroutines.scheduling.C3434h;
import p100n4.C3773d;

/* renamed from: b5.v0 */
public abstract class C1407v0<T> extends C3434h {

    /* renamed from: h */
    public int f3609h;

    public C1407v0(int i) {
        this.f3609h = i;
    }

    /* renamed from: d */
    public void mo4742d(Object obj, Throwable th) {
    }

    /* renamed from: e */
    public abstract C3773d<T> mo4743e();

    /* renamed from: h */
    public Throwable mo4746h(Object obj) {
        C1406v vVar = obj instanceof C1406v ? (C1406v) obj : null;
        if (vVar == null) {
            return null;
        }
        return vVar.f3608a;
    }

    /* renamed from: j */
    public <T> T mo4747j(Object obj) {
        return obj;
    }

    /* renamed from: k */
    public final void mo4788k(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                C3313b.m24439a(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            C3357i.m24505b(th);
            C1347g0.m5338a(mo4743e().getContext(), new C1381n0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
        }
    }

    /* renamed from: l */
    public abstract Object mo4748l();

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a5, code lost:
        if (r4.mo4728z0() != false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ce, code lost:
        if (r4.mo4728z0() != false) goto L_0x00d0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            boolean r0 = p016b5.C1384o0.m5425a()
            if (r0 == 0) goto L_0x0017
            int r0 = r10.f3609h
            r1 = -1
            if (r0 == r1) goto L_0x000d
            r0 = 1
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0011
            goto L_0x0017
        L_0x0011:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x0017:
            kotlinx.coroutines.scheduling.i r0 = r10.f20966g
            n4.d r1 = r10.mo4743e()     // Catch:{ all -> 0x00d4 }
            kotlinx.coroutines.internal.h r1 = (kotlinx.coroutines.internal.C3382h) r1     // Catch:{ all -> 0x00d4 }
            n4.d<T> r2 = r1.f20869j     // Catch:{ all -> 0x00d4 }
            java.lang.Object r1 = r1.f20871l     // Catch:{ all -> 0x00d4 }
            n4.g r3 = r2.getContext()     // Catch:{ all -> 0x00d4 }
            java.lang.Object r1 = kotlinx.coroutines.internal.C3385i0.m24604c(r3, r1)     // Catch:{ all -> 0x00d4 }
            kotlinx.coroutines.internal.e0 r4 = kotlinx.coroutines.internal.C3385i0.f20874a     // Catch:{ all -> 0x00d4 }
            r5 = 0
            if (r1 == r4) goto L_0x0035
            b5.j2 r4 = p016b5.C1323c0.m5290f(r2, r3, r1)     // Catch:{ all -> 0x00d4 }
            goto L_0x0036
        L_0x0035:
            r4 = r5
        L_0x0036:
            n4.g r6 = r2.getContext()     // Catch:{ all -> 0x00c7 }
            java.lang.Object r7 = r10.mo4748l()     // Catch:{ all -> 0x00c7 }
            java.lang.Throwable r8 = r10.mo4746h(r7)     // Catch:{ all -> 0x00c7 }
            if (r8 != 0) goto L_0x0055
            int r9 = r10.f3609h     // Catch:{ all -> 0x00c7 }
            boolean r9 = p016b5.C1410w0.m5492b(r9)     // Catch:{ all -> 0x00c7 }
            if (r9 == 0) goto L_0x0055
            b5.q1$b r9 = p016b5.C1391q1.f3593c     // Catch:{ all -> 0x00c7 }
            n4.g$b r6 = r6.get(r9)     // Catch:{ all -> 0x00c7 }
            b5.q1 r6 = (p016b5.C1391q1) r6     // Catch:{ all -> 0x00c7 }
            goto L_0x0056
        L_0x0055:
            r6 = r5
        L_0x0056:
            if (r6 == 0) goto L_0x0085
            boolean r9 = r6.mo4641d()     // Catch:{ all -> 0x00c7 }
            if (r9 != 0) goto L_0x0085
            java.util.concurrent.CancellationException r6 = r6.mo4767w()     // Catch:{ all -> 0x00c7 }
            r10.mo4742d(r7, r6)     // Catch:{ all -> 0x00c7 }
            k4.k$a r7 = p079k4.C3322k.f20823f     // Catch:{ all -> 0x00c7 }
            boolean r7 = p016b5.C1384o0.m5428d()     // Catch:{ all -> 0x00c7 }
            if (r7 == 0) goto L_0x0079
            boolean r7 = r2 instanceof kotlin.coroutines.jvm.internal.C3339e     // Catch:{ all -> 0x00c7 }
            if (r7 != 0) goto L_0x0072
            goto L_0x0079
        L_0x0072:
            r7 = r2
            kotlin.coroutines.jvm.internal.e r7 = (kotlin.coroutines.jvm.internal.C3339e) r7     // Catch:{ all -> 0x00c7 }
            java.lang.Throwable r6 = kotlinx.coroutines.internal.C3375d0.m24567j(r6, r7)     // Catch:{ all -> 0x00c7 }
        L_0x0079:
            java.lang.Object r6 = p079k4.C3325l.m24450a(r6)     // Catch:{ all -> 0x00c7 }
            java.lang.Object r6 = p079k4.C3322k.m24446a(r6)     // Catch:{ all -> 0x00c7 }
        L_0x0081:
            r2.resumeWith(r6)     // Catch:{ all -> 0x00c7 }
            goto L_0x009d
        L_0x0085:
            if (r8 == 0) goto L_0x0092
            k4.k$a r6 = p079k4.C3322k.f20823f     // Catch:{ all -> 0x00c7 }
            java.lang.Object r6 = p079k4.C3325l.m24450a(r8)     // Catch:{ all -> 0x00c7 }
            java.lang.Object r6 = p079k4.C3322k.m24446a(r6)     // Catch:{ all -> 0x00c7 }
            goto L_0x0081
        L_0x0092:
            java.lang.Object r6 = r10.mo4747j(r7)     // Catch:{ all -> 0x00c7 }
            k4.k$a r7 = p079k4.C3322k.f20823f     // Catch:{ all -> 0x00c7 }
            java.lang.Object r6 = p079k4.C3322k.m24446a(r6)     // Catch:{ all -> 0x00c7 }
            goto L_0x0081
        L_0x009d:
            k4.q r2 = p079k4.C3330q.f20829a     // Catch:{ all -> 0x00c7 }
            if (r4 == 0) goto L_0x00a7
            boolean r4 = r4.mo4728z0()     // Catch:{ all -> 0x00d4 }
            if (r4 == 0) goto L_0x00aa
        L_0x00a7:
            kotlinx.coroutines.internal.C3385i0.m24602a(r3, r1)     // Catch:{ all -> 0x00d4 }
        L_0x00aa:
            k4.k$a r1 = p079k4.C3322k.f20823f     // Catch:{ all -> 0x00b4 }
            r0.mo14496a()     // Catch:{ all -> 0x00b4 }
            java.lang.Object r0 = p079k4.C3322k.m24446a(r2)     // Catch:{ all -> 0x00b4 }
            goto L_0x00bf
        L_0x00b4:
            r0 = move-exception
            k4.k$a r1 = p079k4.C3322k.f20823f
            java.lang.Object r0 = p079k4.C3325l.m24450a(r0)
            java.lang.Object r0 = p079k4.C3322k.m24446a(r0)
        L_0x00bf:
            java.lang.Throwable r0 = p079k4.C3322k.m24447b(r0)
            r10.mo4788k(r5, r0)
            goto L_0x00f3
        L_0x00c7:
            r2 = move-exception
            if (r4 == 0) goto L_0x00d0
            boolean r4 = r4.mo4728z0()     // Catch:{ all -> 0x00d4 }
            if (r4 == 0) goto L_0x00d3
        L_0x00d0:
            kotlinx.coroutines.internal.C3385i0.m24602a(r3, r1)     // Catch:{ all -> 0x00d4 }
        L_0x00d3:
            throw r2     // Catch:{ all -> 0x00d4 }
        L_0x00d4:
            r1 = move-exception
            k4.k$a r2 = p079k4.C3322k.f20823f     // Catch:{ all -> 0x00e1 }
            r0.mo14496a()     // Catch:{ all -> 0x00e1 }
            k4.q r0 = p079k4.C3330q.f20829a     // Catch:{ all -> 0x00e1 }
            java.lang.Object r0 = p079k4.C3322k.m24446a(r0)     // Catch:{ all -> 0x00e1 }
            goto L_0x00ec
        L_0x00e1:
            r0 = move-exception
            k4.k$a r2 = p079k4.C3322k.f20823f
            java.lang.Object r0 = p079k4.C3325l.m24450a(r0)
            java.lang.Object r0 = p079k4.C3322k.m24446a(r0)
        L_0x00ec:
            java.lang.Throwable r0 = p079k4.C3322k.m24447b(r0)
            r10.mo4788k(r1, r0)
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p016b5.C1407v0.run():void");
    }
}
