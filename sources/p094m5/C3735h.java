package p094m5;

import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: m5.h */
public abstract class C3735h {

    /* renamed from: a */
    public static final C3735h f21568a = new C3736a();

    /* renamed from: b */
    private static final AtomicBoolean f21569b = new AtomicBoolean(false);

    /* renamed from: c */
    private static final AtomicReference<C3735h> f21570c = new AtomicReference<>();

    /* renamed from: m5.h$a */
    static class C3736a extends C3735h {
        C3736a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo12499b() {
        }
    }

    /* renamed from: m5.h$b */
    static class C3737b extends C3735h {
        C3737b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo12499b() {
            Class<C3738i> cls = C3738i.class;
            Iterator<S> it = ServiceLoader.load(cls, cls.getClassLoader()).iterator();
            while (it.hasNext()) {
                try {
                    C3738i.m25480f((C3738i) it.next());
                } catch (ServiceConfigurationError e) {
                    if (!(e.getCause() instanceof SecurityException)) {
                        throw e;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    static void m25472a() {
        if (!f21569b.getAndSet(true)) {
            AtomicReference<C3735h> atomicReference = f21570c;
            atomicReference.compareAndSet((Object) null, new C3737b());
            atomicReference.get().mo12499b();
            return;
        }
        throw new IllegalStateException("Already initialized");
    }

    /* renamed from: c */
    public static void m25473c(C3735h hVar) {
        if (f21569b.get()) {
            throw new IllegalStateException("Already initialized");
        } else if (!f21570c.compareAndSet((Object) null, hVar)) {
            throw new IllegalStateException("Initializer was already set, possibly with a default during initialization");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo12499b();
}
