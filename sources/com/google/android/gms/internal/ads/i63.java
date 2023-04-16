package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class i63<T> implements Iterator<T> {

    /* renamed from: f */
    int f8554f;

    /* renamed from: g */
    int f8555g;

    /* renamed from: h */
    int f8556h = -1;

    /* renamed from: i */
    final /* synthetic */ n63 f8557i;

    /* synthetic */ i63(n63 n63, h63 h63) {
        this.f8557i = n63;
        this.f8554f = n63.f11331j;
        this.f8555g = n63.mo9440h();
    }

    /* renamed from: b */
    private final void m10939b() {
        if (this.f8557i.f11331j != this.f8554f) {
            throw new ConcurrentModificationException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract T mo6401a(int i);

    public final boolean hasNext() {
        return this.f8555g >= 0;
    }

    public final T next() {
        m10939b();
        if (hasNext()) {
            int i = this.f8555g;
            this.f8556h = i;
            T a = mo6401a(i);
            this.f8555g = this.f8557i.mo9441i(this.f8555g);
            return a;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        m10939b();
        q43.m15464g(this.f8556h >= 0, "no calls to next() since the last call to remove()");
        this.f8554f += 32;
        n63 n63 = this.f8557i;
        n63.remove(n63.m13746j(n63, this.f8556h));
        this.f8555g--;
        this.f8556h = -1;
    }
}
