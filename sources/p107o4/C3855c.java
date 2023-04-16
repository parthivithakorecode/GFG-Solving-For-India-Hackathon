package p107o4;

import kotlin.coroutines.jvm.internal.C3335a;
import kotlin.coroutines.jvm.internal.C3338d;
import kotlin.coroutines.jvm.internal.C3342h;
import kotlin.coroutines.jvm.internal.C3345j;
import kotlin.jvm.internal.C3357i;
import kotlin.jvm.internal.C3366r;
import p079k4.C3325l;
import p079k4.C3330q;
import p100n4.C3773d;
import p100n4.C3778g;
import p100n4.C3784h;
import p145u4.C4154p;

/* renamed from: o4.c */
class C3855c {

    /* renamed from: o4.c$a */
    public static final class C3856a extends C3345j {

        /* renamed from: f */
        private int f21877f;

        /* renamed from: g */
        final /* synthetic */ C4154p f21878g;

        /* renamed from: h */
        final /* synthetic */ Object f21879h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3856a(C3773d dVar, C4154p pVar, Object obj) {
            super(dVar);
            this.f21878g = pVar;
            this.f21879h = obj;
            C3357i.m24506c(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* access modifiers changed from: protected */
        public Object invokeSuspend(Object obj) {
            int i = this.f21877f;
            if (i == 0) {
                this.f21877f = 1;
                C3325l.m24451b(obj);
                C3357i.m24506c(this.f21878g, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((C4154p) C3366r.m24533a(this.f21878g, 2)).invoke(this.f21879h, this);
            } else if (i == 1) {
                this.f21877f = 2;
                C3325l.m24451b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: o4.c$b */
    public static final class C3857b extends C3338d {

        /* renamed from: f */
        private int f21880f;

        /* renamed from: g */
        final /* synthetic */ C4154p f21881g;

        /* renamed from: h */
        final /* synthetic */ Object f21882h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3857b(C3773d dVar, C3778g gVar, C4154p pVar, Object obj) {
            super(dVar, gVar);
            this.f21881g = pVar;
            this.f21882h = obj;
            C3357i.m24506c(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* access modifiers changed from: protected */
        public Object invokeSuspend(Object obj) {
            int i = this.f21880f;
            if (i == 0) {
                this.f21880f = 1;
                C3325l.m24451b(obj);
                C3357i.m24506c(this.f21881g, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((C4154p) C3366r.m24533a(this.f21881g, 2)).invoke(this.f21882h, this);
            } else if (i == 1) {
                this.f21880f = 2;
                C3325l.m24451b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: a */
    public static <R, T> C3773d<C3330q> m25869a(C4154p<? super R, ? super C3773d<? super T>, ? extends Object> pVar, R r, C3773d<? super T> dVar) {
        C3357i.m24508e(pVar, "<this>");
        C3357i.m24508e(dVar, "completion");
        C3773d<? super T> a = C3342h.m24491a(dVar);
        if (pVar instanceof C3335a) {
            return ((C3335a) pVar).create(r, a);
        }
        C3778g context = a.getContext();
        return context == C3784h.f21692f ? new C3856a(a, pVar, r) : new C3857b(a, context, pVar, r);
    }

    /* renamed from: b */
    public static <T> C3773d<T> m25870b(C3773d<? super T> dVar) {
        C3773d<Object> intercepted;
        C3357i.m24508e(dVar, "<this>");
        C3338d dVar2 = dVar instanceof C3338d ? (C3338d) dVar : null;
        return (dVar2 == null || (intercepted = dVar2.intercepted()) == null) ? dVar : intercepted;
    }
}
