package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;
import javax.annotation.CheckForNull;

final class p63<T> extends s83<T> implements Serializable {

    /* renamed from: f */
    final Comparator<T> f12540f;

    p63(Comparator<T> comparator) {
        Objects.requireNonNull(comparator);
        this.f12540f = comparator;
    }

    public final int compare(T t, T t2) {
        return this.f12540f.compare(t, t2);
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p63) {
            return this.f12540f.equals(((p63) obj).f12540f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12540f.hashCode();
    }

    public final String toString() {
        return this.f12540f.toString();
    }
}
