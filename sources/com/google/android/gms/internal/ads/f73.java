package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class f73<K, V> extends k73<K, V> {
    /* renamed from: a */
    public final f73<K, V> mo7256a(K k, V... vArr) {
        List asList = Arrays.asList(vArr);
        Collection collection = this.f9422a.get(k);
        Iterator it = asList.iterator();
        if (collection != null) {
            while (it.hasNext()) {
                Object next = it.next();
                c63.m7235b(k, next);
                collection.add(next);
            }
        } else if (it.hasNext()) {
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                Object next2 = it.next();
                c63.m7235b(k, next2);
                arrayList.add(next2);
            }
            this.f9422a.put(k, arrayList);
        }
        return this;
    }

    /* renamed from: b */
    public final g73<K, V> mo7257b() {
        Set<Map.Entry<K, Collection<V>>> entrySet = this.f9422a.entrySet();
        if (entrySet.isEmpty()) {
            return u63.f15434k;
        }
        h73 h73 = new h73(entrySet.size());
        int i = 0;
        for (Map.Entry next : entrySet) {
            Object key = next.getKey();
            e73 t = e73.m8345t((Collection) next.getValue());
            if (!t.isEmpty()) {
                h73.mo7859a(key, t);
                i += t.size();
            }
        }
        return new g73<>(h73.mo7861c(), i);
    }
}
