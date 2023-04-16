package p091m2;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: m2.s */
final class C3709s implements ThreadFactory {

    /* renamed from: a */
    private final ThreadFactory f21498a = Executors.defaultThreadFactory();

    C3709s(C3686g0 g0Var) {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f21498a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
