package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import javax.annotation.CheckForNull;

abstract class bb3<V, C> extends pa3<V, C> {
    @CheckForNull

    /* renamed from: u */
    private List<za3<V>> f4827u;

    bb3(z63<? extends cc3<? extends V>> z63, boolean z) {
        super(z63, true, true);
        List<za3<V>> emptyList = z63.isEmpty() ? Collections.emptyList() : x73.m19391a(z63.size());
        for (int i = 0; i < z63.size(); i++) {
            emptyList.add((Object) null);
        }
        this.f4827u = emptyList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final void mo5763M(int i) {
        super.mo5763M(i);
        this.f4827u = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public final void mo5764S(int i, V v) {
        List<za3<V>> list = this.f4827u;
        if (list != null) {
            list.set(i, new za3(v));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public final void mo5765T() {
        List<za3<V>> list = this.f4827u;
        if (list != null) {
            mo7554w(mo5766X(list));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public abstract C mo5766X(List<za3<V>> list);
}
