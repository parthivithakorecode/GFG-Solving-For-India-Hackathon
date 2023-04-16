package com.google.android.gms.internal.ads;

import java.io.Serializable;
import javax.annotation.CheckForNull;

final class b93<T> extends s83<T> implements Serializable {

    /* renamed from: f */
    final s83<? super T> f4800f;

    b93(s83<? super T> s83) {
        this.f4800f = s83;
    }

    /* renamed from: a */
    public final <S extends T> s83<S> mo5189a() {
        return this.f4800f;
    }

    public final int compare(T t, T t2) {
        return this.f4800f.compare(t2, t);
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b93) {
            return this.f4800f.equals(((b93) obj).f4800f);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f4800f.hashCode();
    }

    public final String toString() {
        return this.f4800f.toString().concat(".reverse()");
    }
}
