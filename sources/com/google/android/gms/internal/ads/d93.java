package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public final class d93 {
    /* renamed from: a */
    static int m7781a(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    /* renamed from: b */
    static boolean m7782b(Set<?> set, Collection<?> collection) {
        Objects.requireNonNull(collection);
        if (collection instanceof p83) {
            collection = ((p83) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return m7783c(set, collection.iterator());
        }
        Iterator<?> it = set.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: c */
    static boolean m7783c(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}
