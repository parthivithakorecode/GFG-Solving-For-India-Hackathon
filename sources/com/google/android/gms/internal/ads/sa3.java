package com.google.android.gms.internal.ads;

import androidx.work.impl.utils.futures.C1282b;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import javax.annotation.CheckForNull;

final class sa3 extends ra3 {

    /* renamed from: a */
    final AtomicReferenceFieldUpdater<va3<?>, Set<Throwable>> f14348a;

    /* renamed from: b */
    final AtomicIntegerFieldUpdater<va3<?>> f14349b;

    sa3(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super((qa3) null);
        this.f14348a = atomicReferenceFieldUpdater;
        this.f14349b = atomicIntegerFieldUpdater;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo10500a(va3<?> va3) {
        return this.f14349b.decrementAndGet(va3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo10501b(va3<?> va3, @CheckForNull Set<Throwable> set, Set<Throwable> set2) {
        C1282b.m5160a(this.f14348a, va3, (Object) null, set2);
    }
}
