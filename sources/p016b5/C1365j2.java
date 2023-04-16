package p016b5;

import kotlinx.coroutines.internal.C3372c0;
import kotlinx.coroutines.internal.C3385i0;
import p079k4.C3321j;
import p079k4.C3327n;
import p079k4.C3330q;
import p100n4.C3773d;
import p100n4.C3778g;

/* renamed from: b5.j2 */
public final class C1365j2<T> extends C3372c0<T> {

    /* renamed from: i */
    private ThreadLocal<C3321j<C3778g, Object>> f3563i;

    /* renamed from: A0 */
    public final void mo4727A0(C3778g gVar, Object obj) {
        this.f3563i.set(C3327n.m24453a(gVar, obj));
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public void mo4646u0(Object obj) {
        C3321j jVar = this.f3563i.get();
        C1365j2<?> j2Var = null;
        if (jVar != null) {
            C3385i0.m24602a((C3778g) jVar.mo14321a(), jVar.mo14322b());
            this.f3563i.set(j2Var);
        }
        Object a = C1421z.m5587a(obj, this.f20858h);
        C3773d<T> dVar = this.f20858h;
        C3778g context = dVar.getContext();
        Object c = C3385i0.m24604c(context, j2Var);
        if (c != C3385i0.f20874a) {
            j2Var = C1323c0.m5290f(dVar, context, c);
        }
        try {
            this.f20858h.resumeWith(a);
            C3330q qVar = C3330q.f20829a;
        } finally {
            if (j2Var == null || j2Var.mo4728z0()) {
                C3385i0.m24602a(context, c);
            }
        }
    }

    /* renamed from: z0 */
    public final boolean mo4728z0() {
        if (this.f3563i.get() == null) {
            return false;
        }
        this.f3563i.set((Object) null);
        return true;
    }
}
