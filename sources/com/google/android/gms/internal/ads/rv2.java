package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class rv2<E, V> implements cc3<V> {

    /* renamed from: f */
    private final E f13947f;

    /* renamed from: g */
    private final String f13948g;

    /* renamed from: h */
    private final cc3<V> f13949h;

    public rv2(E e, String str, cc3<V> cc3) {
        this.f13947f = e;
        this.f13948g = str;
        this.f13949h = cc3;
    }

    /* renamed from: a */
    public final E mo10670a() {
        return this.f13947f;
    }

    /* renamed from: b */
    public final void mo5905b(Runnable runnable, Executor executor) {
        this.f13949h.mo5905b(runnable, executor);
    }

    /* renamed from: c */
    public final String mo10671c() {
        return this.f13948g;
    }

    public final boolean cancel(boolean z) {
        return this.f13949h.cancel(z);
    }

    public final V get() {
        return this.f13949h.get();
    }

    public final V get(long j, TimeUnit timeUnit) {
        return this.f13949h.get(j, timeUnit);
    }

    public final boolean isCancelled() {
        return this.f13949h.isCancelled();
    }

    public final boolean isDone() {
        return this.f13949h.isDone();
    }

    public final String toString() {
        String str = this.f13948g;
        int identityHashCode = System.identityHashCode(this);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(str);
        sb.append("@");
        sb.append(identityHashCode);
        return sb.toString();
    }
}
