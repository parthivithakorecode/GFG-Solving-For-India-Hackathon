package androidx.work.impl.utils.futures;

import java.util.concurrent.Executor;

/* renamed from: androidx.work.impl.utils.futures.c */
enum C1283c implements Executor {
    INSTANCE;

    public void execute(Runnable runnable) {
        runnable.run();
    }

    public String toString() {
        return "DirectExecutor";
    }
}
