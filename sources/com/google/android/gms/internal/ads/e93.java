package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;

final class e93<E> extends p73<E> {

    /* renamed from: h */
    final transient E f6129h;

    e93(E e) {
        Objects.requireNonNull(e);
        this.f6129h = e;
    }

    public final boolean contains(@CheckForNull Object obj) {
        return this.f6129h.equals(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo6858h(Object[] objArr, int i) {
        objArr[i] = this.f6129h;
        return i + 1;
    }

    public final int hashCode() {
        return this.f6129h.hashCode();
    }

    public final /* synthetic */ Iterator iterator() {
        return new q73(this.f6129h);
    }

    /* renamed from: k */
    public final e73<E> mo6862k() {
        return e73.m8348w(this.f6129h);
    }

    /* renamed from: l */
    public final h93<E> mo6863l() {
        return new q73(this.f6129h);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        String obj = this.f6129h.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}
