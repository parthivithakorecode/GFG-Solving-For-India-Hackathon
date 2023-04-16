package p067j;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: j.b */
public class C3130b extends C3132c {

    /* renamed from: a */
    private final Object f20422a = new Object();

    /* renamed from: b */
    private final ExecutorService f20423b = Executors.newFixedThreadPool(4, new C3131a());

    /* renamed from: c */
    private volatile Handler f20424c;

    /* renamed from: j.b$a */
    class C3131a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f20425a = new AtomicInteger(0);

        C3131a() {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", new Object[]{Integer.valueOf(this.f20425a.getAndIncrement())}));
            return thread;
        }
    }

    /* renamed from: d */
    private static Handler m23810d(Looper looper) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return Handler.createAsync(looper);
        }
        if (i >= 16) {
            Class<Handler> cls = Handler.class;
            try {
                return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            } catch (InvocationTargetException unused2) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }

    /* renamed from: a */
    public void mo13964a(Runnable runnable) {
        this.f20423b.execute(runnable);
    }

    /* renamed from: b */
    public boolean mo13965b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: c */
    public void mo13966c(Runnable runnable) {
        if (this.f20424c == null) {
            synchronized (this.f20422a) {
                if (this.f20424c == null) {
                    this.f20424c = m23810d(Looper.getMainLooper());
                }
            }
        }
        this.f20424c.post(runnable);
    }
}
