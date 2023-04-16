package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import androidx.core.util.C0738a;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: androidx.core.provider.h */
class C0712h {

    /* renamed from: androidx.core.provider.h$a */
    private static class C0713a implements ThreadFactory {

        /* renamed from: a */
        private String f2066a;

        /* renamed from: b */
        private int f2067b;

        /* renamed from: androidx.core.provider.h$a$a */
        private static class C0714a extends Thread {

            /* renamed from: f */
            private final int f2068f;

            C0714a(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.f2068f = i;
            }

            public void run() {
                Process.setThreadPriority(this.f2068f);
                super.run();
            }
        }

        C0713a(String str, int i) {
            this.f2066a = str;
            this.f2067b = i;
        }

        public Thread newThread(Runnable runnable) {
            return new C0714a(runnable, this.f2066a, this.f2067b);
        }
    }

    /* renamed from: androidx.core.provider.h$b */
    private static class C0715b<T> implements Runnable {

        /* renamed from: f */
        private Callable<T> f2069f;

        /* renamed from: g */
        private C0738a<T> f2070g;

        /* renamed from: h */
        private Handler f2071h;

        /* renamed from: androidx.core.provider.h$b$a */
        class C0716a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ C0738a f2072f;

            /* renamed from: g */
            final /* synthetic */ Object f2073g;

            C0716a(C0738a aVar, Object obj) {
                this.f2072f = aVar;
                this.f2073g = obj;
            }

            public void run() {
                this.f2072f.accept(this.f2073g);
            }
        }

        C0715b(Handler handler, Callable<T> callable, C0738a<T> aVar) {
            this.f2069f = callable;
            this.f2070g = aVar;
            this.f2071h = handler;
        }

        public void run() {
            T t;
            try {
                t = this.f2069f.call();
            } catch (Exception unused) {
                t = null;
            }
            this.f2071h.post(new C0716a(this.f2070g, t));
        }
    }

    /* renamed from: a */
    static ThreadPoolExecutor m2885a(String str, int i, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new C0713a(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: b */
    static <T> void m2886b(Executor executor, Callable<T> callable, C0738a<T> aVar) {
        executor.execute(new C0715b(C0697b.m2844a(), callable, aVar));
    }

    /* renamed from: c */
    static <T> T m2887c(ExecutorService executorService, Callable<T> callable, int i) {
        try {
            return executorService.submit(callable).get((long) i, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e2) {
            throw e2;
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
