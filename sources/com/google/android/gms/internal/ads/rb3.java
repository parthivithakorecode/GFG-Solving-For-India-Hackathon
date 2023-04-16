package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class rb3 extends tb3 {
    /* renamed from: a */
    public static <V> qb3<V> m16123a(Iterable<? extends cc3<? extends V>> iterable) {
        return new qb3<>(false, e73.m8344s(iterable), (pb3) null);
    }

    @SafeVarargs
    /* renamed from: b */
    public static <V> qb3<V> m16124b(cc3<? extends V>... cc3Arr) {
        return new qb3<>(false, e73.m8346u(cc3Arr), (pb3) null);
    }

    /* renamed from: c */
    public static <V> qb3<V> m16125c(Iterable<? extends cc3<? extends V>> iterable) {
        return new qb3<>(true, e73.m8344s(iterable), (pb3) null);
    }

    @SafeVarargs
    /* renamed from: d */
    public static <V> qb3<V> m16126d(cc3<? extends V>... cc3Arr) {
        return new qb3<>(true, e73.m8346u(cc3Arr), (pb3) null);
    }

    /* renamed from: e */
    public static <V> cc3<List<V>> m16127e(Iterable<? extends cc3<? extends V>> iterable) {
        return new ya3(e73.m8344s(iterable), true);
    }

    /* renamed from: f */
    public static <V, X extends Throwable> cc3<V> m16128f(cc3<? extends V> cc3, Class<X> cls, e43<? super X, ? extends V> e43, Executor executor) {
        r93 r93 = new r93(cc3, cls, e43);
        cc3.mo5905b(r93, jc3.m11565c(executor, r93));
        return r93;
    }

    /* renamed from: g */
    public static <V, X extends Throwable> cc3<V> m16129g(cc3<? extends V> cc3, Class<X> cls, xa3<? super X, ? extends V> xa3, Executor executor) {
        q93 q93 = new q93(cc3, cls, xa3);
        cc3.mo5905b(q93, jc3.m11565c(executor, q93));
        return q93;
    }

    /* renamed from: h */
    public static <V> cc3<V> m16130h(Throwable th) {
        Objects.requireNonNull(th);
        return new ub3(th);
    }

    /* renamed from: i */
    public static <V> cc3<V> m16131i(V v) {
        return v == null ? vb3.f16155g : new vb3(v);
    }

    /* renamed from: j */
    public static cc3<Void> m16132j() {
        return vb3.f16155g;
    }

    /* renamed from: k */
    public static <O> cc3<O> m16133k(Callable<O> callable, Executor executor) {
        rc3 rc3 = new rc3(callable);
        executor.execute(rc3);
        return rc3;
    }

    /* renamed from: l */
    public static <O> cc3<O> m16134l(wa3<O> wa3, Executor executor) {
        rc3 rc3 = new rc3(wa3);
        executor.execute(rc3);
        return rc3;
    }

    /* renamed from: m */
    public static <I, O> cc3<O> m16135m(cc3<I> cc3, e43<? super I, ? extends O> e43, Executor executor) {
        int i = ma3.f10786o;
        Objects.requireNonNull(e43);
        la3 la3 = new la3(cc3, e43);
        cc3.mo5905b(la3, jc3.m11565c(executor, la3));
        return la3;
    }

    /* renamed from: n */
    public static <I, O> cc3<O> m16136n(cc3<I> cc3, xa3<? super I, ? extends O> xa3, Executor executor) {
        int i = ma3.f10786o;
        Objects.requireNonNull(executor);
        ka3 ka3 = new ka3(cc3, xa3);
        cc3.mo5905b(ka3, jc3.m11565c(executor, ka3));
        return ka3;
    }

    /* renamed from: o */
    public static <V> cc3<V> m16137o(cc3<V> cc3, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return cc3.isDone() ? cc3 : oc3.m14403G(cc3, j, timeUnit, scheduledExecutorService);
    }

    /* renamed from: p */
    public static <V> V m16138p(Future<V> future) {
        if (future.isDone()) {
            return tc3.m17212a(future);
        }
        throw new IllegalStateException(b53.m6684b("Future was expected to be done: %s", future));
    }

    /* renamed from: q */
    public static <V> V m16139q(Future<V> future) {
        try {
            return tc3.m17212a(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new gb3((Error) cause);
            }
            throw new sc3(cause);
        }
    }

    /* renamed from: r */
    public static <V> void m16140r(cc3<V> cc3, nb3<? super V> nb3, Executor executor) {
        Objects.requireNonNull(nb3);
        cc3.mo5905b(new ob3(cc3, nb3), executor);
    }
}
