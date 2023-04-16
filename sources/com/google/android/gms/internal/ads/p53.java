package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

final class p53 extends s53 implements NavigableSet {

    /* renamed from: i */
    final /* synthetic */ x53 f12533i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    p53(x53 x53, NavigableMap navigableMap) {
        super(x53, navigableMap);
        this.f12533i = x53;
    }

    @CheckForNull
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f4020f)).ceilingKey(obj);
    }

    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    public final NavigableSet descendingSet() {
        return new p53(this.f12533i, ((NavigableMap) ((SortedMap) this.f4020f)).descendingMap());
    }

    @CheckForNull
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f4020f)).floorKey(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ SortedMap mo9968h() {
        return (NavigableMap) ((SortedMap) this.f4020f);
    }

    public final NavigableSet headSet(Object obj, boolean z) {
        return new p53(this.f12533i, ((NavigableMap) ((SortedMap) this.f4020f)).headMap(obj, z));
    }

    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @CheckForNull
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f4020f)).higherKey(obj);
    }

    @CheckForNull
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f4020f)).lowerKey(obj);
    }

    @CheckForNull
    public final Object pollFirst() {
        return t73.m17179a(iterator());
    }

    @CheckForNull
    public final Object pollLast() {
        return t73.m17179a(descendingIterator());
    }

    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new p53(this.f12533i, ((NavigableMap) ((SortedMap) this.f4020f)).subMap(obj, z, obj2, z2));
    }

    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    public final NavigableSet tailSet(Object obj, boolean z) {
        return new p53(this.f12533i, ((NavigableMap) ((SortedMap) this.f4020f)).tailMap(obj, z));
    }

    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
