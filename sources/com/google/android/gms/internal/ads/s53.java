package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

class s53 extends n53 implements SortedSet {

    /* renamed from: h */
    final /* synthetic */ x53 f14270h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    s53(x53 x53, SortedMap sortedMap) {
        super(x53, sortedMap);
        this.f14270h = x53;
    }

    @CheckForNull
    public final Comparator comparator() {
        return mo9968h().comparator();
    }

    public final Object first() {
        return mo9968h().firstKey();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public SortedMap mo9968h() {
        return (SortedMap) this.f4020f;
    }

    public SortedSet headSet(Object obj) {
        return new s53(this.f14270h, mo9968h().headMap(obj));
    }

    public final Object last() {
        return mo9968h().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new s53(this.f14270h, mo9968h().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new s53(this.f14270h, mo9968h().tailMap(obj));
    }
}
