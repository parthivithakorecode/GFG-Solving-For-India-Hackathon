package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

class j53 extends c83 {

    /* renamed from: h */
    final transient Map f8993h;

    /* renamed from: i */
    final /* synthetic */ x53 f8994i;

    j53(x53 x53, Map map) {
        this.f8994i = x53;
        this.f8993h = map;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Set<Map.Entry> mo6083a() {
        return new h53(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Map.Entry mo8346b(Map.Entry entry) {
        Object key = entry.getKey();
        return new a73(key, this.f8994i.mo7240k(key, (Collection) entry.getValue()));
    }

    public final void clear() {
        if (this.f8993h == this.f8994i.f17034i) {
            this.f8994i.mo6871l();
        } else {
            t73.m17180b(new i53(this));
        }
    }

    public final boolean containsKey(@CheckForNull Object obj) {
        Map map = this.f8993h;
        Objects.requireNonNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final boolean equals(@CheckForNull Object obj) {
        return this == obj || this.f8993h.equals(obj);
    }

    @CheckForNull
    public final /* bridge */ /* synthetic */ Object get(@CheckForNull Object obj) {
        Collection collection = (Collection) d83.m7765a(this.f8993h, obj);
        if (collection == null) {
            return null;
        }
        return this.f8994i.mo7240k(obj, collection);
    }

    public final int hashCode() {
        return this.f8993h.hashCode();
    }

    public Set keySet() {
        return this.f8994i.mo5142g();
    }

    @CheckForNull
    public final /* bridge */ /* synthetic */ Object remove(@CheckForNull Object obj) {
        Collection collection = (Collection) this.f8993h.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection i = this.f8994i.mo9699i();
        i.addAll(collection);
        x53 x53 = this.f8994i;
        x53.f17035j = x53.f17035j - collection.size();
        collection.clear();
        return i;
    }

    public final int size() {
        return this.f8993h.size();
    }

    public final String toString() {
        return this.f8993h.toString();
    }
}
