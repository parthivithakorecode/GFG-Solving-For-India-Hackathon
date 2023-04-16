package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;

final class q83 extends s83<Comparable<?>> implements Serializable {

    /* renamed from: f */
    static final q83 f13096f = new q83();

    private q83() {
    }

    /* renamed from: a */
    public final <S extends Comparable> s83<S> mo5189a() {
        return a93.f4029f;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        Objects.requireNonNull(comparable);
        Objects.requireNonNull(comparable2);
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
