package p084l2;

import java.util.concurrent.ThreadFactory;

/* renamed from: l2.i1 */
final /* synthetic */ class C3504i1 implements ThreadFactory {

    /* renamed from: a */
    private final C3508j1 f21090a;

    /* renamed from: b */
    private final String f21091b;

    C3504i1(C3508j1 j1Var, String str) {
        this.f21090a = j1Var;
        this.f21091b = str;
    }

    public final Thread newThread(Runnable runnable) {
        return this.f21090a.mo14596a(this.f21091b, runnable);
    }
}
