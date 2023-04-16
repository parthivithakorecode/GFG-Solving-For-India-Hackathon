package p016b5;

import p100n4.C3778g;

/* renamed from: b5.i2 */
public final class C1360i2 extends C1332d0 {

    /* renamed from: g */
    public static final C1360i2 f3560g = new C1360i2();

    private C1360i2() {
    }

    /* renamed from: O */
    public void mo4673O(C3778g gVar, Runnable runnable) {
        C1374l2 l2Var = (C1374l2) gVar.get(C1374l2.f3571g);
        if (l2Var != null) {
            l2Var.f3572f = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    /* renamed from: P */
    public boolean mo4694P(C3778g gVar) {
        return false;
    }

    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
