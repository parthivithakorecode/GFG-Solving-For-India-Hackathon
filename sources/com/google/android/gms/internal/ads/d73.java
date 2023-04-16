package com.google.android.gms.internal.ads;

import java.util.List;
import javax.annotation.CheckForNull;

final class d73 extends e73 {

    /* renamed from: h */
    final transient int f5677h;

    /* renamed from: i */
    final transient int f5678i;

    /* renamed from: j */
    final /* synthetic */ e73 f5679j;

    d73(e73 e73, int i, int i2) {
        this.f5679j = e73;
        this.f5677h = i;
        this.f5678i = i2;
    }

    public final Object get(int i) {
        q43.m15458a(i, this.f5678i, "index");
        return this.f5679j.get(i + this.f5677h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final int mo6404i() {
        return this.f5679j.mo6405j() + this.f5677h + this.f5678i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final int mo6405j() {
        return this.f5679j.mo6405j() + this.f5677h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo6406m() {
        return true;
    }

    /* access modifiers changed from: package-private */
    @CheckForNull
    /* renamed from: n */
    public final Object[] mo6407n() {
        return this.f5679j.mo6407n();
    }

    /* renamed from: o */
    public final e73 mo6408o(int i, int i2) {
        q43.m15463f(i, i2, this.f5678i);
        e73 e73 = this.f5679j;
        int i3 = this.f5677h;
        return e73.subList(i + i3, i2 + i3);
    }

    public final int size() {
        return this.f5678i;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
