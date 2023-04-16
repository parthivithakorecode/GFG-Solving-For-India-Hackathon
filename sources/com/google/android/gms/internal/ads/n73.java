package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

public class n73<K, V> extends b63<K, V> implements Serializable {

    /* renamed from: i */
    final transient i73<K, ? extends z63<V>> f11341i;

    /* renamed from: j */
    final transient int f11342j;

    n73(i73<K, ? extends z63<V>> i73, int i) {
        this.f11341i = i73;
        this.f11342j = i;
    }

    @Deprecated
    /* renamed from: a */
    public final boolean mo6869a(K k, V v) {
        throw null;
    }

    /* renamed from: b */
    public final int mo6870b() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Collection mo5137c() {
        return new l73(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final Map<K, Collection<V>> mo5139e() {
        throw new AssertionError("should never be called");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final Set<K> mo5141f() {
        throw new AssertionError("unreachable");
    }

    /* renamed from: h */
    public final boolean mo5143h(@CheckForNull Object obj) {
        return obj != null && super.mo5143h(obj);
    }

    @Deprecated
    /* renamed from: l */
    public final void mo6871l() {
        throw null;
    }

    /* renamed from: p */
    public final /* synthetic */ Map mo5145p() {
        return this.f11341i;
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ Collection mo5146t() {
        throw null;
    }
}
