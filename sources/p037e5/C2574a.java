package p037e5;

import kotlin.coroutines.jvm.internal.C3338d;
import kotlin.coroutines.jvm.internal.C3340f;
import p079k4.C3330q;
import p100n4.C3773d;

/* renamed from: e5.a */
public abstract class C2574a<T> implements C2576b<T> {

    @C3340f(mo14340c = "kotlinx.coroutines.flow.AbstractFlow", mo14341f = "Flow.kt", mo14342l = {230}, mo14343m = "collect")
    /* renamed from: e5.a$a */
    static final class C2575a extends C3338d {

        /* renamed from: f */
        Object f18692f;

        /* renamed from: g */
        /* synthetic */ Object f18693g;

        /* renamed from: h */
        final /* synthetic */ C2574a<T> f18694h;

        /* renamed from: i */
        int f18695i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2575a(C2574a<T> aVar, C3773d<? super C2575a> dVar) {
            super(dVar);
            this.f18694h = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f18693g = obj;
            this.f18695i |= Integer.MIN_VALUE;
            return this.f18694h.mo12471a((C2577c) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo12471a(p037e5.C2577c<? super T> r6, p100n4.C3773d<? super p079k4.C3330q> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p037e5.C2574a.C2575a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            e5.a$a r0 = (p037e5.C2574a.C2575a) r0
            int r1 = r0.f18695i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f18695i = r1
            goto L_0x0018
        L_0x0013:
            e5.a$a r0 = new e5.a$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f18693g
            java.lang.Object r1 = p107o4.C3858d.m25871c()
            int r2 = r0.f18695i
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r6 = r0.f18692f
            f5.c r6 = (p044f5.C2614c) r6
            p079k4.C3325l.m24451b(r7)     // Catch:{ all -> 0x002d }
            goto L_0x004f
        L_0x002d:
            r7 = move-exception
            goto L_0x0059
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            p079k4.C3325l.m24451b(r7)
            f5.c r7 = new f5.c
            n4.g r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f18692f = r7     // Catch:{ all -> 0x0055 }
            r0.f18695i = r3     // Catch:{ all -> 0x0055 }
            java.lang.Object r6 = r5.mo12472b(r7, r0)     // Catch:{ all -> 0x0055 }
            if (r6 != r1) goto L_0x004e
            return r1
        L_0x004e:
            r6 = r7
        L_0x004f:
            r6.releaseIntercepted()
            k4.q r6 = p079k4.C3330q.f20829a
            return r6
        L_0x0055:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x0059:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p037e5.C2574a.mo12471a(e5.c, n4.d):java.lang.Object");
    }

    /* renamed from: b */
    public abstract Object mo12472b(C2577c<? super T> cVar, C3773d<? super C3330q> dVar);
}
