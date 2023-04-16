package p084l2;

import java.util.concurrent.Executor;

/* renamed from: l2.y1 */
public final class C3565y1 {

    /* renamed from: a */
    private final Executor f21259a;

    C3565y1(Executor executor) {
        this.f21259a = executor;
    }

    /* renamed from: a */
    public final Executor mo14634a() {
        return this.f21259a;
    }

    /* renamed from: b */
    public final void mo14635b(String str, String str2, C3481c2... c2VarArr) {
        this.f21259a.execute(new C3472a2(str, str2, c2VarArr));
    }
}
