package com.google.android.gms.internal.ads;

import java.util.Comparator;

public abstract class s83<T> implements Comparator<T> {
    protected s83() {
    }

    /* renamed from: b */
    public static <T> s83<T> m16650b(Comparator<T> comparator) {
        return comparator instanceof s83 ? (s83) comparator : new p63(comparator);
    }

    /* renamed from: c */
    public static <C extends Comparable> s83<C> m16651c() {
        return q83.f13096f;
    }

    /* renamed from: a */
    public <S extends T> s83<S> mo5189a() {
        return new b93(this);
    }

    public abstract int compare(T t, T t2);
}
