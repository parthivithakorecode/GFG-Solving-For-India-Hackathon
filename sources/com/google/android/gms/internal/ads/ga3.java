package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

public abstract class ga3<V> extends uc3 implements cc3<V> {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final boolean f7333i;

    /* renamed from: j */
    private static final Logger f7334j = Logger.getLogger(ga3.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final u93 f7335k;

    /* renamed from: l */
    private static final Object f7336l = new Object();
    /* access modifiers changed from: private */
    @CheckForNull

    /* renamed from: f */
    public volatile Object f7337f;
    /* access modifiers changed from: private */
    @CheckForNull

    /* renamed from: g */
    public volatile x93 f7338g;
    /* access modifiers changed from: private */
    @CheckForNull

    /* renamed from: h */
    public volatile fa3 f7339h;

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        u93 u93;
        Class<fa3> cls = fa3.class;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f7333i = z;
        try {
            u93 = new ea3((ia3) null);
            th2 = null;
            th = null;
        } catch (Throwable th3) {
            th = th3;
            th2 = th;
            u93 = new aa3((ha3) null);
        }
        f7335k = u93;
        if (th != null) {
            Logger logger = f7334j;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    protected ga3() {
    }

    /* renamed from: A */
    private final void m9581A(StringBuilder sb) {
        String hexString;
        String str = "]";
        try {
            Object h = m9589h(this);
            sb.append("SUCCESS, result=[");
            if (h == null) {
                hexString = "null";
            } else if (h == this) {
                hexString = "this future";
            } else {
                sb.append(h.getClass().getName());
                sb.append("@");
                hexString = Integer.toHexString(System.identityHashCode(h));
            }
            sb.append(hexString);
            sb.append(str);
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append(str);
        } catch (CancellationException unused) {
            str = "CANCELLED";
            sb.append(str);
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            str = " thrown from get()]";
            sb.append(str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m9582B(java.lang.StringBuilder r5) {
        /*
            r4 = this;
            int r0 = r5.length()
            java.lang.String r1 = "PENDING"
            r5.append(r1)
            java.lang.Object r1 = r4.f7337f
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.z93
            java.lang.String r3 = "]"
            if (r2 == 0) goto L_0x0021
            java.lang.String r2 = ", setFuture=["
            r5.append(r2)
            com.google.android.gms.internal.ads.z93 r1 = (com.google.android.gms.internal.ads.z93) r1
            com.google.android.gms.internal.ads.cc3<? extends V> r1 = r1.f18119g
            r4.m9583C(r5, r1)
        L_0x001d:
            r5.append(r3)
            goto L_0x0046
        L_0x0021:
            java.lang.String r1 = r4.mo7548i()     // Catch:{ RuntimeException -> 0x002c, StackOverflowError -> 0x002a }
            java.lang.String r1 = com.google.android.gms.internal.ads.b53.m6683a(r1)     // Catch:{ RuntimeException -> 0x002c, StackOverflowError -> 0x002a }
            goto L_0x003b
        L_0x002a:
            r1 = move-exception
            goto L_0x002d
        L_0x002c:
            r1 = move-exception
        L_0x002d:
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Exception thrown from implementation: "
            java.lang.String r1 = r2.concat(r1)
        L_0x003b:
            if (r1 == 0) goto L_0x0046
            java.lang.String r2 = ", info=["
            r5.append(r2)
            r5.append(r1)
            goto L_0x001d
        L_0x0046:
            boolean r1 = r4.isDone()
            if (r1 == 0) goto L_0x0056
            int r1 = r5.length()
            r5.delete(r0, r1)
            r4.m9581A(r5)
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ga3.m9582B(java.lang.StringBuilder):void");
    }

    /* renamed from: C */
    private final void m9583C(StringBuilder sb, @CheckForNull Object obj) {
        if (obj == this) {
            try {
                sb.append("this future");
            } catch (RuntimeException | StackOverflowError e) {
                sb.append("Exception thrown from implementation: ");
                sb.append(e.getClass());
            }
        } else {
            sb.append(obj);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public static void m9584D(ga3<?> ga3) {
        ga3<V> ga32;
        x93 x93;
        x93 x932;
        x93 x933 = null;
        ga3<?> ga33 = ga3;
        while (true) {
            fa3 fa3 = ga33.f7339h;
            if (f7335k.mo5203e(ga33, fa3, fa3.f6779c)) {
                while (fa3 != null) {
                    Thread thread = fa3.f6780a;
                    if (thread != null) {
                        fa3.f6780a = null;
                        LockSupport.unpark(thread);
                    }
                    fa3 = fa3.f6781b;
                }
                ga33.mo7551j();
                do {
                    x93 = ga33.f7338g;
                } while (!f7335k.mo5201c(ga33, x93, x93.f17091d));
                while (true) {
                    x932 = x933;
                    x933 = x93;
                    if (x933 == null) {
                        break;
                    }
                    x93 = x933.f17094c;
                    x933.f17094c = x932;
                }
                while (x932 != null) {
                    x933 = x932.f17094c;
                    Runnable runnable = x932.f17092a;
                    runnable.getClass();
                    if (runnable instanceof z93) {
                        z93 z93 = (z93) runnable;
                        ga3<V> ga34 = z93.f18118f;
                        if (ga34.f7337f == z93) {
                            if (f7335k.mo5202d(ga34, z93, m9588g(z93.f18119g))) {
                                ga32 = ga34;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        Executor executor = x932.f17093b;
                        executor.getClass();
                        m9585c(runnable, executor);
                    }
                    x932 = x933;
                }
                return;
            }
            ga32 = ga33;
            ga33 = ga32;
        }
    }

    /* renamed from: c */
    private static void m9585c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f7334j;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", sb.toString(), e);
        }
    }

    /* renamed from: e */
    private final void m9586e(fa3 fa3) {
        fa3.f6780a = null;
        while (true) {
            fa3 fa32 = this.f7339h;
            if (fa32 != fa3.f6779c) {
                fa3 fa33 = null;
                while (fa32 != null) {
                    fa3 fa34 = fa32.f6781b;
                    if (fa32.f6780a != null) {
                        fa33 = fa32;
                    } else if (fa33 != null) {
                        fa33.f6781b = fa34;
                        if (fa33.f6780a == null) {
                        }
                    } else if (!f7335k.mo5203e(this, fa32, fa34)) {
                    }
                    fa32 = fa34;
                }
                return;
            }
            return;
        }
    }

    /* renamed from: f */
    private static final V m9587f(Object obj) {
        if (obj instanceof v93) {
            Throwable th = ((v93) obj).f15958b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof w93) {
            throw new ExecutionException(((w93) obj).f16767a);
        } else if (obj == f7336l) {
            return null;
        } else {
            return obj;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static Object m9588g(cc3<?> cc3) {
        Throwable a;
        if (cc3 instanceof ba3) {
            Object obj = ((ga3) cc3).f7337f;
            if (obj instanceof v93) {
                v93 v93 = (v93) obj;
                if (v93.f15957a) {
                    Throwable th = v93.f15958b;
                    obj = th != null ? new v93(false, th) : v93.f15956d;
                }
            }
            obj.getClass();
            return obj;
        } else if ((cc3 instanceof uc3) && (a = ((uc3) cc3).mo7544a()) != null) {
            return new w93(a);
        } else {
            boolean isCancelled = cc3.isCancelled();
            if ((!f7333i) && isCancelled) {
                v93 v932 = v93.f15956d;
                v932.getClass();
                return v932;
            }
            try {
                Object h = m9589h(cc3);
                if (!isCancelled) {
                    return h == null ? f7336l : h;
                }
                String valueOf = String.valueOf(cc3);
                StringBuilder sb = new StringBuilder(valueOf.length() + 84);
                sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb.append(valueOf);
                return new v93(false, new IllegalArgumentException(sb.toString()));
            } catch (ExecutionException e) {
                return isCancelled ? new v93(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(cc3)), e)) : new w93(e.getCause());
            } catch (CancellationException e2) {
                return !isCancelled ? new w93(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(cc3)), e2)) : new v93(false, e2);
            } catch (Throwable th2) {
                return new w93(th2);
            }
        }
    }

    /* renamed from: h */
    private static <V> V m9589h(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* access modifiers changed from: protected */
    @CheckForNull
    /* renamed from: a */
    public final Throwable mo7544a() {
        if (!(this instanceof ba3)) {
            return null;
        }
        Object obj = this.f7337f;
        if (obj instanceof w93) {
            return ((w93) obj).f16767a;
        }
        return null;
    }

    /* renamed from: b */
    public void mo5905b(Runnable runnable, Executor executor) {
        x93 x93;
        q43.m15460c(runnable, "Runnable was null.");
        q43.m15460c(executor, "Executor was null.");
        if (isDone() || (x93 = this.f7338g) == x93.f17091d) {
            m9585c(runnable, executor);
        }
        x93 x932 = new x93(runnable, executor);
        do {
            x932.f17094c = x93;
            if (!f7335k.mo5201c(this, x93, x932)) {
                x93 = this.f7338g;
            } else {
                return;
            }
        } while (x93 != x93.f17091d);
        m9585c(runnable, executor);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, com.google.android.gms.internal.ads.cc3<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f7337f
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0008
            r3 = r2
            goto L_0x0009
        L_0x0008:
            r3 = r1
        L_0x0009:
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.z93
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0064
            boolean r3 = f7333i
            if (r3 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.v93 r3 = new com.google.android.gms.internal.ads.v93
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0029
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.v93 r3 = com.google.android.gms.internal.ads.v93.f15955c
            goto L_0x0026
        L_0x0024:
            com.google.android.gms.internal.ads.v93 r3 = com.google.android.gms.internal.ads.v93.f15956d
        L_0x0026:
            r3.getClass()
        L_0x0029:
            r4 = r7
            r5 = r1
        L_0x002b:
            com.google.android.gms.internal.ads.u93 r6 = f7335k
            boolean r6 = r6.mo5202d(r4, r0, r3)
            if (r6 == 0) goto L_0x005d
            if (r8 == 0) goto L_0x0038
            r4.mo6898t()
        L_0x0038:
            m9584D(r4)
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.z93
            if (r4 == 0) goto L_0x005b
            com.google.android.gms.internal.ads.z93 r0 = (com.google.android.gms.internal.ads.z93) r0
            com.google.android.gms.internal.ads.cc3<? extends V> r0 = r0.f18119g
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.ba3
            if (r4 == 0) goto L_0x0058
            r4 = r0
            com.google.android.gms.internal.ads.ga3 r4 = (com.google.android.gms.internal.ads.ga3) r4
            java.lang.Object r0 = r4.f7337f
            if (r0 != 0) goto L_0x0050
            r5 = r2
            goto L_0x0051
        L_0x0050:
            r5 = r1
        L_0x0051:
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.z93
            r5 = r5 | r6
            if (r5 == 0) goto L_0x005b
            r5 = r2
            goto L_0x002b
        L_0x0058:
            r0.cancel(r8)
        L_0x005b:
            r1 = r2
            goto L_0x0064
        L_0x005d:
            java.lang.Object r0 = r4.f7337f
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.z93
            if (r6 != 0) goto L_0x002b
            r1 = r5
        L_0x0064:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ga3.cancel(boolean):boolean");
    }

    public V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f7337f;
            if ((obj2 != null) && (!(obj2 instanceof z93))) {
                return m9587f(obj2);
            }
            fa3 fa3 = this.f7339h;
            if (fa3 != fa3.f6779c) {
                fa3 fa32 = new fa3();
                do {
                    u93 u93 = f7335k;
                    u93.mo5199a(fa32, fa3);
                    if (u93.mo5203e(this, fa3, fa32)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f7337f;
                            } else {
                                m9586e(fa32);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof z93))));
                        return m9587f(obj);
                    }
                    fa3 = this.f7339h;
                } while (fa3 != fa3.f6779c);
            }
            Object obj3 = this.f7337f;
            obj3.getClass();
            return m9587f(obj3);
        }
        throw new InterruptedException();
    }

    public V get(long j, TimeUnit timeUnit) {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f7337f;
            boolean z = true;
            if ((obj != null) && (!(obj instanceof z93))) {
                return m9587f(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                fa3 fa3 = this.f7339h;
                if (fa3 != fa3.f6779c) {
                    fa3 fa32 = new fa3();
                    do {
                        u93 u93 = f7335k;
                        u93.mo5199a(fa32, fa3);
                        if (u93.mo5203e(this, fa3, fa32)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f7337f;
                                    if ((obj2 != null) && (!(obj2 instanceof z93))) {
                                        return m9587f(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m9586e(fa32);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m9586e(fa32);
                        } else {
                            fa3 = this.f7339h;
                        }
                    } while (fa3 != fa3.f6779c);
                }
                Object obj3 = this.f7337f;
                obj3.getClass();
                return m9587f(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.f7337f;
                if ((obj4 != null) && (!(obj4 instanceof z93))) {
                    return m9587f(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String ga3 = toString();
            String timeUnit3 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = timeUnit3.toLowerCase(locale);
            String lowerCase2 = timeUnit.toString().toLowerCase(locale);
            StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
            sb.append("Waited ");
            sb.append(j2);
            sb.append(" ");
            sb.append(lowerCase2);
            String sb2 = sb.toString();
            if (nanos + 1000 < 0) {
                String concat = sb2.concat(" (plus ");
                long j3 = -nanos;
                long convert = timeUnit2.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit2.toNanos(convert);
                int i = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                if (i != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (i > 0) {
                    String valueOf = String.valueOf(concat);
                    StringBuilder sb3 = new StringBuilder(valueOf.length() + 21 + String.valueOf(lowerCase).length());
                    sb3.append(valueOf);
                    sb3.append(convert);
                    sb3.append(" ");
                    sb3.append(lowerCase);
                    String sb4 = sb3.toString();
                    if (z) {
                        sb4 = sb4.concat(",");
                    }
                    concat = String.valueOf(sb4).concat(" ");
                }
                if (z) {
                    String valueOf2 = String.valueOf(concat);
                    StringBuilder sb5 = new StringBuilder(valueOf2.length() + 33);
                    sb5.append(valueOf2);
                    sb5.append(nanos2);
                    sb5.append(" nanoseconds ");
                    concat = sb5.toString();
                }
                sb2 = String.valueOf(concat).concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(String.valueOf(sb2).concat(" but future completed as timeout expired"));
            }
            StringBuilder sb6 = new StringBuilder(String.valueOf(sb2).length() + 5 + String.valueOf(ga3).length());
            sb6.append(sb2);
            sb6.append(" for ");
            sb6.append(ga3);
            throw new TimeoutException(sb6.toString());
        }
        throw new InterruptedException();
    }

    /* access modifiers changed from: protected */
    @CheckForNull
    /* renamed from: i */
    public String mo7548i() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    public boolean isCancelled() {
        return this.f7337f instanceof v93;
    }

    public boolean isDone() {
        Object obj = this.f7337f;
        return (!(obj instanceof z93)) & (obj != null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo7551j() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo6898t() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName().startsWith("com.google.common.util.concurrent.") ? getClass().getSimpleName() : getClass().getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m9581A(sb);
        } else {
            m9582B(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo7553u(@CheckForNull Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(mo7557z());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public boolean mo7554w(V v) {
        if (v == null) {
            v = f7336l;
        }
        if (!f7335k.mo5202d(this, (Object) null, v)) {
            return false;
        }
        m9584D(this);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public boolean mo7555x(Throwable th) {
        Objects.requireNonNull(th);
        if (!f7335k.mo5202d(this, (Object) null, new w93(th))) {
            return false;
        }
        m9584D(this);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo7556y(cc3<? extends V> cc3) {
        z93 z93;
        w93 w93;
        Objects.requireNonNull(cc3);
        Object obj = this.f7337f;
        if (obj == null) {
            if (cc3.isDone()) {
                if (!f7335k.mo5202d(this, (Object) null, m9588g(cc3))) {
                    return false;
                }
                m9584D(this);
                return true;
            }
            z93 = new z93(this, cc3);
            if (f7335k.mo5202d(this, (Object) null, z93)) {
                try {
                    cc3.mo5905b(z93, fb3.INSTANCE);
                } catch (Throwable unused) {
                    w93 = w93.f16766b;
                }
                return true;
            }
            obj = this.f7337f;
        }
        if (obj instanceof v93) {
            cc3.cancel(((v93) obj).f15957a);
        }
        return false;
        f7335k.mo5202d(this, z93, w93);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final boolean mo7557z() {
        Object obj = this.f7337f;
        return (obj instanceof v93) && ((v93) obj).f15957a;
    }
}
