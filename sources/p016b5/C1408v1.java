package p016b5;

import java.util.concurrent.CancellationException;
import p100n4.C3778g;

/* renamed from: b5.v1 */
final /* synthetic */ class C1408v1 {
    /* renamed from: a */
    public static final C1400t m5486a(C1391q1 q1Var) {
        return new C1402t1(q1Var);
    }

    /* renamed from: b */
    public static /* synthetic */ C1400t m5487b(C1391q1 q1Var, int i, Object obj) {
        if ((i & 1) != 0) {
            q1Var = null;
        }
        return C1405u1.m5473a(q1Var);
    }

    /* renamed from: c */
    public static final void m5488c(C3778g gVar, CancellationException cancellationException) {
        C1391q1 q1Var = (C1391q1) gVar.get(C1391q1.f3593c);
        if (q1Var != null) {
            q1Var.mo4763B(cancellationException);
        }
    }

    /* renamed from: d */
    public static final void m5489d(C1391q1 q1Var) {
        if (!q1Var.mo4641d()) {
            throw q1Var.mo4767w();
        }
    }

    /* renamed from: e */
    public static final void m5490e(C3778g gVar) {
        C1391q1 q1Var = (C1391q1) gVar.get(C1391q1.f3593c);
        if (q1Var != null) {
            C1405u1.m5476d(q1Var);
        }
    }
}
