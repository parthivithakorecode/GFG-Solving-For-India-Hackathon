package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;

public final class nb2<T> {

    /* renamed from: a */
    private final xv1 f11392a;

    /* renamed from: b */
    private final h52 f11393b;

    /* renamed from: c */
    private final l92<T> f11394c;

    /* renamed from: d */
    private final CopyOnWriteArraySet<ma2<T>> f11395d;

    /* renamed from: e */
    private final ArrayDeque<Runnable> f11396e;

    /* renamed from: f */
    private final ArrayDeque<Runnable> f11397f;

    /* renamed from: g */
    private boolean f11398g;

    public nb2(Looper looper, xv1 xv1, l92<T> l92) {
        this(new CopyOnWriteArraySet(), looper, xv1, l92);
    }

    private nb2(CopyOnWriteArraySet<ma2<T>> copyOnWriteArraySet, Looper looper, xv1 xv1, l92<T> l92) {
        this.f11392a = xv1;
        this.f11395d = copyOnWriteArraySet;
        this.f11394c = l92;
        this.f11396e = new ArrayDeque<>();
        this.f11397f = new ArrayDeque<>();
        this.f11393b = xv1.mo7393a(looper, new i62(this));
    }

    /* renamed from: g */
    public static /* synthetic */ boolean m13825g(nb2 nb2, Message message) {
        Iterator<ma2<T>> it = nb2.f11395d.iterator();
        while (it.hasNext()) {
            it.next().mo9155b(nb2.f11394c);
            if (nb2.f11393b.mo7841D(0)) {
                return true;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final nb2<T> mo9486a(Looper looper, l92<T> l92) {
        return new nb2<>(this.f11395d, looper, this.f11392a, l92);
    }

    /* renamed from: b */
    public final void mo9487b(T t) {
        if (!this.f11398g) {
            Objects.requireNonNull(t);
            this.f11395d.add(new ma2(t));
        }
    }

    /* renamed from: c */
    public final void mo9488c() {
        if (!this.f11397f.isEmpty()) {
            if (!this.f11393b.mo7841D(0)) {
                h52 h52 = this.f11393b;
                h52.mo7846I(h52.mo7849d(0));
            }
            boolean isEmpty = this.f11396e.isEmpty();
            this.f11396e.addAll(this.f11397f);
            this.f11397f.clear();
            if (!(!isEmpty)) {
                while (!this.f11396e.isEmpty()) {
                    this.f11396e.peekFirst().run();
                    this.f11396e.removeFirst();
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo9489d(int i, k82<T> k82) {
        this.f11397f.add(new j72(new CopyOnWriteArraySet(this.f11395d), i, k82));
    }

    /* renamed from: e */
    public final void mo9490e() {
        Iterator<ma2<T>> it = this.f11395d.iterator();
        while (it.hasNext()) {
            it.next().mo9156c(this.f11394c);
        }
        this.f11395d.clear();
        this.f11398g = true;
    }

    /* renamed from: f */
    public final void mo9491f(T t) {
        Iterator<ma2<T>> it = this.f11395d.iterator();
        while (it.hasNext()) {
            ma2 next = it.next();
            if (next.f10782a.equals(t)) {
                next.mo9156c(this.f11394c);
                this.f11395d.remove(next);
            }
        }
    }
}
