package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;

final class a93 extends s83<Comparable<?>> implements Serializable {

    /* renamed from: f */
    static final a93 f4029f = new a93();

    private a93() {
    }

    /* renamed from: a */
    public final <S extends Comparable> s83<S> mo5189a() {
        return q83.f13096f;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        Objects.requireNonNull(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
