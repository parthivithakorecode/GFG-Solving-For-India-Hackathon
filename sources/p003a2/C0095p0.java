package p003a2;

import android.os.Looper;
import android.os.Message;
import p077k2.C3301d;

/* renamed from: a2.p0 */
final class C0095p0 extends C3301d {

    /* renamed from: a */
    final /* synthetic */ C0052c f204a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0095p0(C0052c cVar, Looper looper) {
        super(looper);
        this.f204a = cVar;
    }

    /* renamed from: a */
    private static final void m320a(Message message) {
        C0097q0 q0Var = (C0097q0) message.obj;
        q0Var.mo248a();
        q0Var.mo274d();
    }

    /* renamed from: b */
    private static final boolean m321b(Message message) {
        int i = message.what;
        return i == 2 || i == 1 || i == 7;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.app.PendingIntent} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            a2.c r0 = r7.f204a
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f94H
            int r0 = r0.get()
            int r1 = r8.arg1
            if (r0 == r1) goto L_0x0016
            boolean r0 = m321b(r8)
            if (r0 == 0) goto L_0x0015
            m320a(r8)
        L_0x0015:
            return
        L_0x0016:
            int r0 = r8.what
            r1 = 4
            r2 = 1
            r3 = 5
            if (r0 == r2) goto L_0x002e
            r4 = 7
            if (r0 == r4) goto L_0x002e
            if (r0 != r1) goto L_0x002a
            a2.c r0 = r7.f204a
            boolean r0 = r0.mo189t()
            if (r0 == 0) goto L_0x002e
        L_0x002a:
            int r0 = r8.what
            if (r0 != r3) goto L_0x0036
        L_0x002e:
            a2.c r0 = r7.f204a
            boolean r0 = r0.mo179j()
            if (r0 == 0) goto L_0x012a
        L_0x0036:
            int r0 = r8.what
            r4 = 8
            r5 = 3
            r6 = 0
            if (r0 != r1) goto L_0x0082
            a2.c r0 = r7.f204a
            x1.b r1 = new x1.b
            int r8 = r8.arg2
            r1.<init>(r8)
            p160x1.C4280b unused = r0.f91E = r1
            a2.c r8 = r7.f204a
            boolean r8 = p003a2.C0052c.m173Y(r8)
            if (r8 == 0) goto L_0x0061
            a2.c r8 = r7.f204a
            boolean r8 = r8.f92F
            if (r8 == 0) goto L_0x005b
            goto L_0x0061
        L_0x005b:
            a2.c r8 = r7.f204a
            r8.m182h0(r5, null)
            return
        L_0x0061:
            a2.c r8 = r7.f204a
            x1.b r8 = r8.f91E
            if (r8 == 0) goto L_0x0070
            a2.c r8 = r7.f204a
            x1.b r8 = r8.f91E
            goto L_0x0075
        L_0x0070:
            x1.b r8 = new x1.b
            r8.<init>(r4)
        L_0x0075:
            a2.c r0 = r7.f204a
            a2.c$c r0 = r0.f110u
            r0.mo197b(r8)
            a2.c r0 = r7.f204a
            r0.mo163K(r8)
            return
        L_0x0082:
            if (r0 != r3) goto L_0x00a5
            a2.c r8 = r7.f204a
            x1.b r8 = r8.f91E
            if (r8 == 0) goto L_0x0093
            a2.c r8 = r7.f204a
            x1.b r8 = r8.f91E
            goto L_0x0098
        L_0x0093:
            x1.b r8 = new x1.b
            r8.<init>(r4)
        L_0x0098:
            a2.c r0 = r7.f204a
            a2.c$c r0 = r0.f110u
            r0.mo197b(r8)
            a2.c r0 = r7.f204a
            r0.mo163K(r8)
            return
        L_0x00a5:
            if (r0 != r5) goto L_0x00c4
            java.lang.Object r0 = r8.obj
            boolean r1 = r0 instanceof android.app.PendingIntent
            if (r1 == 0) goto L_0x00b0
            r6 = r0
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6
        L_0x00b0:
            x1.b r0 = new x1.b
            int r8 = r8.arg2
            r0.<init>(r8, r6)
            a2.c r8 = r7.f204a
            a2.c$c r8 = r8.f110u
            r8.mo197b(r0)
            a2.c r8 = r7.f204a
            r8.mo163K(r0)
            return
        L_0x00c4:
            r1 = 6
            if (r0 != r1) goto L_0x00ec
            a2.c r0 = r7.f204a
            r0.m182h0(r3, null)
            a2.c r0 = r7.f204a
            a2.c$a r0 = r0.f115z
            if (r0 == 0) goto L_0x00df
            a2.c r0 = r7.f204a
            a2.c$a r0 = r0.f115z
            int r1 = r8.arg2
            r0.mo140D(r1)
        L_0x00df:
            a2.c r0 = r7.f204a
            int r8 = r8.arg2
            r0.mo164L(r8)
            a2.c r8 = r7.f204a
            p003a2.C0052c.m178d0(r8, r3, r2, r6)
            return
        L_0x00ec:
            r1 = 2
            if (r0 != r1) goto L_0x00fc
            a2.c r0 = r7.f204a
            boolean r0 = r0.mo173a()
            if (r0 == 0) goto L_0x00f8
            goto L_0x00fc
        L_0x00f8:
            m320a(r8)
            return
        L_0x00fc:
            boolean r0 = m321b(r8)
            if (r0 == 0) goto L_0x010a
            java.lang.Object r8 = r8.obj
            a2.q0 r8 = (p003a2.C0097q0) r8
            r8.mo273c()
            return
        L_0x010a:
            int r8 = r8.what
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 45
            r0.<init>(r1)
            java.lang.String r1 = "Don't know how to handle message: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.String r1 = "GmsClient"
            android.util.Log.wtf(r1, r8, r0)
            return
        L_0x012a:
            m320a(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p003a2.C0095p0.handleMessage(android.os.Message):void");
    }
}
