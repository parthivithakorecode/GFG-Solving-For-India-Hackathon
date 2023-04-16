package p051g5;

import kotlin.coroutines.jvm.internal.C3342h;
import kotlin.jvm.internal.C3366r;
import kotlinx.coroutines.internal.C3385i0;
import p079k4.C3322k;
import p079k4.C3325l;
import p100n4.C3773d;
import p100n4.C3778g;
import p145u4.C4154p;

/* renamed from: g5.b */
public final class C2648b {
    /* renamed from: a */
    public static final <R, T> void m21376a(C4154p<? super R, ? super C3773d<? super T>, ? extends Object> pVar, R r, C3773d<? super T> dVar) {
        Object obj;
        C3778g context;
        Object c;
        C3773d<? super T> a = C3342h.m24491a(dVar);
        try {
            context = dVar.getContext();
            c = C3385i0.m24604c(context, (Object) null);
            obj = ((C4154p) C3366r.m24533a(pVar, 2)).invoke(r, a);
            C3385i0.m24602a(context, c);
            if (obj != C3858d.m25871c()) {
                C3322k.C3323a aVar = C3322k.f20823f;
                a.resumeWith(C3322k.m24446a(obj));
            }
        } catch (Throwable th) {
            C3322k.C3323a aVar2 = C3322k.f20823f;
            obj = C3325l.m24450a(th);
        }
    }
}
