package kotlinx.coroutines.internal;

import kotlin.coroutines.jvm.internal.C3339e;
import p016b5.C1314a;
import p016b5.C1389q;
import p016b5.C1391q1;
import p016b5.C1421z;
import p100n4.C3773d;
import p145u4.C4150l;

/* renamed from: kotlinx.coroutines.internal.c0 */
public class C3372c0<T> extends C1314a<T> implements C3339e {

    /* renamed from: h */
    public final C3773d<T> f20858h;

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public final boolean mo4801V() {
        return true;
    }

    public final C3339e getCallerFrame() {
        C3773d<T> dVar = this.f20858h;
        if (dVar instanceof C3339e) {
            return (C3339e) dVar;
        }
        return null;
    }

    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo4784p(Object obj) {
        C3384i.m24601c(C3855c.m25870b(this.f20858h), C1421z.m5587a(obj, this.f20858h), (C4150l) null, 2, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public void mo4646u0(Object obj) {
        C3773d<T> dVar = this.f20858h;
        dVar.resumeWith(C1421z.m5587a(obj, dVar));
    }

    /* renamed from: y0 */
    public final C1391q1 mo14408y0() {
        C1389q P = mo4797P();
        if (P == null) {
            return null;
        }
        return P.getParent();
    }
}
