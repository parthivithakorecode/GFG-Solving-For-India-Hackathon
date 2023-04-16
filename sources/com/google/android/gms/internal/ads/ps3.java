package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

final class ps3 extends AbstractSet<Map.Entry> {

    /* renamed from: f */
    final /* synthetic */ ss3 f12797f;

    /* synthetic */ ps3(ss3 ss3, os3 os3) {
        this.f12797f = ss3;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f12797f.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.f12797f.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f12797f.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public final Iterator<Map.Entry> iterator() {
        return new ns3(this.f12797f, (ms3) null);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f12797f.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f12797f.size();
    }
}
