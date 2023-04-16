package com.google.android.gms.internal.ads;

import androidx.work.impl.utils.futures.C1282b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import javax.annotation.CheckForNull;

final class y93 extends u93 {

    /* renamed from: a */
    final AtomicReferenceFieldUpdater<fa3, Thread> f17642a;

    /* renamed from: b */
    final AtomicReferenceFieldUpdater<fa3, fa3> f17643b;

    /* renamed from: c */
    final AtomicReferenceFieldUpdater<ga3, fa3> f17644c;

    /* renamed from: d */
    final AtomicReferenceFieldUpdater<ga3, x93> f17645d;

    /* renamed from: e */
    final AtomicReferenceFieldUpdater<ga3, Object> f17646e;

    y93(AtomicReferenceFieldUpdater<fa3, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<fa3, fa3> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<ga3, fa3> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<ga3, x93> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<ga3, Object> atomicReferenceFieldUpdater5) {
        super((t93) null);
        this.f17642a = atomicReferenceFieldUpdater;
        this.f17643b = atomicReferenceFieldUpdater2;
        this.f17644c = atomicReferenceFieldUpdater3;
        this.f17645d = atomicReferenceFieldUpdater4;
        this.f17646e = atomicReferenceFieldUpdater5;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo5199a(fa3 fa3, @CheckForNull fa3 fa32) {
        this.f17643b.lazySet(fa3, fa32);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo5200b(fa3 fa3, Thread thread) {
        this.f17642a.lazySet(fa3, thread);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo5201c(ga3<?> ga3, @CheckForNull x93 x93, x93 x932) {
        return C1282b.m5160a(this.f17645d, ga3, x93, x932);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo5202d(ga3<?> ga3, @CheckForNull Object obj, Object obj2) {
        return C1282b.m5160a(this.f17646e, ga3, obj, obj2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo5203e(ga3<?> ga3, @CheckForNull fa3 fa3, @CheckForNull fa3 fa32) {
        return C1282b.m5160a(this.f17644c, ga3, fa3, fa32);
    }
}
