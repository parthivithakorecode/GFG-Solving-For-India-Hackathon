package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

class r53 extends j53 implements SortedMap {
    @CheckForNull

    /* renamed from: j */
    SortedSet f13517j;

    /* renamed from: k */
    final /* synthetic */ x53 f13518k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    r53(x53 x53, SortedMap sortedMap) {
        super(x53, sortedMap);
        this.f13518k = x53;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public SortedMap mo9660c() {
        return (SortedMap) this.f8993h;
    }

    @CheckForNull
    public final Comparator comparator() {
        return mo9660c().comparator();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public SortedSet mo9663d() {
        return new s53(this.f13518k, mo9660c());
    }

    /* renamed from: e */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f13517j;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet d = mo9663d();
        this.f13517j = d;
        return d;
    }

    public final Object firstKey() {
        return mo9660c().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new r53(this.f13518k, mo9660c().headMap(obj));
    }

    public final Object lastKey() {
        return mo9660c().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new r53(this.f13518k, mo9660c().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new r53(this.f13518k, mo9660c().tailMap(obj));
    }
}
