package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public final class wv3<T> implements kv3<Set<T>> {

    /* renamed from: c */
    private static final kv3<Set<Object>> f16945c = lv3.m12941b(Collections.emptySet());

    /* renamed from: a */
    private final List<yv3<T>> f16946a;

    /* renamed from: b */
    private final List<yv3<Collection<T>>> f16947b;

    /* synthetic */ wv3(List list, List list2, uv3 uv3) {
        this.f16946a = list;
        this.f16947b = list2;
    }

    /* renamed from: b */
    public static <T> vv3<T> m19226b(int i, int i2) {
        return new vv3<>(i, i2, (uv3) null);
    }

    /* renamed from: c */
    public final Set<T> mo5051a() {
        int size = this.f16946a.size();
        ArrayList arrayList = new ArrayList(this.f16947b.size());
        int size2 = this.f16947b.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) this.f16947b.get(i).mo5051a();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet a = hv3.m10799a(size);
        int size3 = this.f16946a.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object a2 = this.f16946a.get(i2).mo5051a();
            Objects.requireNonNull(a2);
            a.add(a2);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object next : (Collection) arrayList.get(i3)) {
                Objects.requireNonNull(next);
                a.add(next);
            }
        }
        return Collections.unmodifiableSet(a);
    }
}
