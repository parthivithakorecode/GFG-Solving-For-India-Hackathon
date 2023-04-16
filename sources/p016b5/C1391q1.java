package p016b5;

import java.util.concurrent.CancellationException;
import p079k4.C3330q;
import p100n4.C3778g;
import p145u4.C4150l;
import p145u4.C4154p;

/* renamed from: b5.q1 */
public interface C1391q1 extends C3778g.C3781b {

    /* renamed from: c */
    public static final C1393b f3593c = C1393b.f3594f;

    /* renamed from: b5.q1$a */
    public static final class C1392a {
        /* renamed from: a */
        public static /* synthetic */ void m5450a(C1391q1 q1Var, CancellationException cancellationException, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    cancellationException = null;
                }
                q1Var.mo4763B(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        /* renamed from: b */
        public static <R> R m5451b(C1391q1 q1Var, R r, C4154p<? super R, ? super C3778g.C3781b, ? extends R> pVar) {
            return C3778g.C3781b.C3782a.m25608a(q1Var, r, pVar);
        }

        /* renamed from: c */
        public static <E extends C3778g.C3781b> E m5452c(C1391q1 q1Var, C3778g.C3783c<E> cVar) {
            return C3778g.C3781b.C3782a.m25609b(q1Var, cVar);
        }

        /* renamed from: d */
        public static /* synthetic */ C1422z0 m5453d(C1391q1 q1Var, boolean z, boolean z2, C4150l lVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                if ((i & 2) != 0) {
                    z2 = true;
                }
                return q1Var.mo4766u(z, z2, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        /* renamed from: e */
        public static C3778g m5454e(C1391q1 q1Var, C3778g.C3783c<?> cVar) {
            return C3778g.C3781b.C3782a.m25610c(q1Var, cVar);
        }

        /* renamed from: f */
        public static C3778g m5455f(C1391q1 q1Var, C3778g gVar) {
            return C3778g.C3781b.C3782a.m25611d(q1Var, gVar);
        }
    }

    /* renamed from: b5.q1$b */
    public static final class C1393b implements C3778g.C3783c<C1391q1> {

        /* renamed from: f */
        static final /* synthetic */ C1393b f3594f = new C1393b();

        private C1393b() {
        }
    }

    /* renamed from: B */
    void mo4763B(CancellationException cancellationException);

    /* renamed from: G */
    C1389q mo4764G(C1397s sVar);

    /* renamed from: d */
    boolean mo4641d();

    boolean start();

    /* renamed from: u */
    C1422z0 mo4766u(boolean z, boolean z2, C4150l<? super Throwable, C3330q> lVar);

    /* renamed from: w */
    CancellationException mo4767w();
}
