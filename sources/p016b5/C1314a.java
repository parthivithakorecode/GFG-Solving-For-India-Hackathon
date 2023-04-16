package p016b5;

import kotlin.jvm.internal.C3357i;
import p100n4.C3773d;
import p100n4.C3778g;
import p145u4.C4150l;
import p145u4.C4154p;

/* renamed from: b5.a */
public abstract class C1314a<T> extends C1414x1 implements C3773d<T>, C1368k0 {

    /* renamed from: g */
    private final C3778g f3527g;

    public C1314a(C3778g gVar, boolean z, boolean z2) {
        super(z2);
        if (z) {
            mo4799T((C1391q1) gVar.get(C1391q1.f3593c));
        }
        this.f3527g = gVar.plus(this);
    }

    /* renamed from: S */
    public final void mo4639S(Throwable th) {
        C1347g0.m5338a(this.f3527g, th);
    }

    /* renamed from: Z */
    public String mo4640Z() {
        String b = C1323c0.m5286b(this.f3527g);
        if (b == null) {
            return super.mo4640Z();
        }
        return '\"' + b + "\":" + super.mo4640Z();
    }

    /* renamed from: d */
    public boolean mo4641d() {
        return super.mo4641d();
    }

    /* renamed from: e */
    public C3778g mo4642e() {
        return this.f3527g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public final void mo4643e0(Object obj) {
        if (obj instanceof C1406v) {
            C1406v vVar = (C1406v) obj;
            mo4647v0(vVar.f3608a, vVar.mo4785a());
            return;
        }
        mo4648w0(obj);
    }

    public final C3778g getContext() {
        return this.f3527g;
    }

    public final void resumeWith(Object obj) {
        Object X = mo4802X(C1421z.m5590d(obj, (C4150l) null, 1, (Object) null));
        if (X != C1420y1.f3628b) {
            mo4646u0(X);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public void mo4646u0(Object obj) {
        mo4784p(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public void mo4647v0(Throwable th, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: w0 */
    public void mo4648w0(T t) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public String mo4649x() {
        return C3357i.m24513j(C1387p0.m5431a(this), " was cancelled");
    }

    /* renamed from: x0 */
    public final <R> void mo4650x0(C1377m0 m0Var, R r, C4154p<? super R, ? super C3773d<? super T>, ? extends Object> pVar) {
        m0Var.mo4757d(pVar, r, this);
    }
}
