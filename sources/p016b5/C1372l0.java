package p016b5;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C3357i;
import kotlinx.coroutines.internal.C3378f;
import p100n4.C3778g;

/* renamed from: b5.l0 */
public final class C1372l0 {
    /* renamed from: a */
    public static final C1368k0 m5414a(C3778g gVar) {
        if (gVar.get(C1391q1.f3593c) == null) {
            gVar = gVar.plus(C1408v1.m5487b((C1391q1) null, 1, (Object) null));
        }
        return new C3378f(gVar);
    }

    /* renamed from: b */
    public static final void m5415b(C1368k0 k0Var, CancellationException cancellationException) {
        C1391q1 q1Var = (C1391q1) k0Var.mo4642e().get(C1391q1.f3593c);
        if (q1Var != null) {
            q1Var.mo4763B(cancellationException);
            return;
        }
        throw new IllegalStateException(C3357i.m24513j("Scope cannot be cancelled because it does not have a job: ", k0Var).toString());
    }

    /* renamed from: c */
    public static /* synthetic */ void m5416c(C1368k0 k0Var, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        m5415b(k0Var, cancellationException);
    }
}
