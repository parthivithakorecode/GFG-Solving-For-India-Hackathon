package p016b5;

import p079k4.C3330q;
import p145u4.C4150l;

/* renamed from: b5.n1 */
final class C1382n1 extends C1356i {

    /* renamed from: f */
    private final C4150l<Throwable, C3330q> f3581f;

    public C1382n1(C4150l<? super Throwable, C3330q> lVar) {
        this.f3581f = lVar;
    }

    /* renamed from: a */
    public void mo4722a(Throwable th) {
        this.f3581f.invoke(th);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo4722a((Throwable) obj);
        return C3330q.f20829a;
    }

    public String toString() {
        return "InvokeOnCancel[" + C1387p0.m5431a(this.f3581f) + '@' + C1387p0.m5432b(this) + ']';
    }
}
