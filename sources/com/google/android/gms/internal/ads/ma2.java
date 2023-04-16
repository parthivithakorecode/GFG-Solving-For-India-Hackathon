package com.google.android.gms.internal.ads;

import javax.annotation.Nonnull;

final class ma2<T> {
    @Nonnull

    /* renamed from: a */
    public final T f10782a;

    /* renamed from: b */
    private w94 f10783b = new w94();

    /* renamed from: c */
    private boolean f10784c;

    /* renamed from: d */
    private boolean f10785d;

    public ma2(@Nonnull T t) {
        this.f10782a = t;
    }

    /* renamed from: a */
    public final void mo9154a(int i, k82<T> k82) {
        if (!this.f10785d) {
            if (i != -1) {
                this.f10783b.mo11623a(i);
            }
            this.f10784c = true;
            k82.mo5053c(this.f10782a);
        }
    }

    /* renamed from: b */
    public final void mo9155b(l92<T> l92) {
        if (!this.f10785d && this.f10784c) {
            yb4 b = this.f10783b.mo11624b();
            this.f10783b = new w94();
            this.f10784c = false;
            l92.mo7726a(this.f10782a, b);
        }
    }

    /* renamed from: c */
    public final void mo9156c(l92<T> l92) {
        this.f10785d = true;
        if (this.f10784c) {
            l92.mo7726a(this.f10782a, this.f10783b.mo11624b());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ma2.class != obj.getClass()) {
            return false;
        }
        return this.f10782a.equals(((ma2) obj).f10782a);
    }

    public final int hashCode() {
        return this.f10782a.hashCode();
    }
}
