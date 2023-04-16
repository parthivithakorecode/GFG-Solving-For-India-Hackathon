package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

final class h53 extends z73 {

    /* renamed from: f */
    final /* synthetic */ j53 f8053f;

    h53(j53 j53) {
        this.f8053f = j53;
    }

    public final boolean contains(@CheckForNull Object obj) {
        Set entrySet = this.f8053f.f8993h.entrySet();
        Objects.requireNonNull(entrySet);
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final Map mo7851h() {
        return this.f8053f;
    }

    public final Iterator<Map.Entry> iterator() {
        return new i53(this.f8053f);
    }

    public final boolean remove(@CheckForNull Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        x53.m19341u(this.f8053f.f8994i, entry.getKey());
        return true;
    }
}
