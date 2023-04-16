package p016b5;

import kotlin.jvm.internal.C3357i;

/* renamed from: b5.w1 */
public abstract class C1411w1 extends C1412x implements C1422z0, C1373l1 {

    /* renamed from: i */
    public C1414x1 f3612i;

    /* renamed from: A */
    public final void mo4793A(C1414x1 x1Var) {
        this.f3612i = x1Var;
    }

    /* renamed from: b */
    public void mo4679b() {
        mo4794z().mo4805i0(this);
    }

    /* renamed from: d */
    public boolean mo4653d() {
        return true;
    }

    /* renamed from: h */
    public C1321b2 mo4654h() {
        return null;
    }

    public String toString() {
        return C1387p0.m5431a(this) + '@' + C1387p0.m5432b(this) + "[job@" + C1387p0.m5432b(mo4794z()) + ']';
    }

    /* renamed from: z */
    public final C1414x1 mo4794z() {
        C1414x1 x1Var = this.f3612i;
        if (x1Var != null) {
            return x1Var;
        }
        C3357i.m24518o("job");
        return null;
    }
}
