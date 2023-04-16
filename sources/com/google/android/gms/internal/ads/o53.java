package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

final class o53 extends r53 implements NavigableMap {

    /* renamed from: l */
    final /* synthetic */ x53 f11897l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    o53(x53 x53, NavigableMap navigableMap) {
        super(x53, navigableMap);
        this.f11897l = x53;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ SortedMap mo9660c() {
        return (NavigableMap) ((SortedMap) this.f8993h);
    }

    @CheckForNull
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = ((NavigableMap) ((SortedMap) this.f8993h)).ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return mo8346b(ceilingEntry);
    }

    @CheckForNull
    public final Object ceilingKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f8993h)).ceilingKey(obj);
    }

    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    public final NavigableMap descendingMap() {
        return new o53(this.f11897l, ((NavigableMap) ((SortedMap) this.f8993h)).descendingMap());
    }

    /* renamed from: e */
    public final /* synthetic */ SortedSet mo9666e() {
        return (NavigableSet) super.keySet();
    }

    /* access modifiers changed from: package-private */
    @CheckForNull
    /* renamed from: f */
    public final Map.Entry mo9667f(Iterator<Map.Entry> it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry next = it.next();
        Collection i = this.f11897l.mo9699i();
        i.addAll((Collection) next.getValue());
        it.remove();
        return new a73(next.getKey(), this.f11897l.mo7239j(i));
    }

    @CheckForNull
    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = ((NavigableMap) ((SortedMap) this.f8993h)).firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return mo8346b(firstEntry);
    }

    @CheckForNull
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = ((NavigableMap) ((SortedMap) this.f8993h)).floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return mo8346b(floorEntry);
    }

    @CheckForNull
    public final Object floorKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f8993h)).floorKey(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final NavigableSet mo9663d() {
        return new p53(this.f11897l, (NavigableMap) ((SortedMap) this.f8993h));
    }

    public final NavigableMap headMap(Object obj, boolean z) {
        return new o53(this.f11897l, ((NavigableMap) ((SortedMap) this.f8993h)).headMap(obj, z));
    }

    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @CheckForNull
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = ((NavigableMap) ((SortedMap) this.f8993h)).higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return mo8346b(higherEntry);
    }

    @CheckForNull
    public final Object higherKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f8993h)).higherKey(obj);
    }

    public final /* synthetic */ Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @CheckForNull
    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = ((NavigableMap) ((SortedMap) this.f8993h)).lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return mo8346b(lastEntry);
    }

    @CheckForNull
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = ((NavigableMap) ((SortedMap) this.f8993h)).lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return mo8346b(lowerEntry);
    }

    @CheckForNull
    public final Object lowerKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f8993h)).lowerKey(obj);
    }

    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @CheckForNull
    public final Map.Entry pollFirstEntry() {
        return mo9667f(entrySet().iterator());
    }

    @CheckForNull
    public final Map.Entry pollLastEntry() {
        return mo9667f(descendingMap().entrySet().iterator());
    }

    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new o53(this.f11897l, ((NavigableMap) ((SortedMap) this.f8993h)).subMap(obj, z, obj2, z2));
    }

    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    public final NavigableMap tailMap(Object obj, boolean z) {
        return new o53(this.f11897l, ((NavigableMap) ((SortedMap) this.f8993h)).tailMap(obj, z));
    }

    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
