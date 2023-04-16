package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

final class aa3 extends u93 {
    /* synthetic */ aa3(ha3 ha3) {
        super((t93) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo5199a(fa3 fa3, @CheckForNull fa3 fa32) {
        fa3.f6781b = fa32;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo5200b(fa3 fa3, Thread thread) {
        fa3.f6780a = thread;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo5201c(ga3<?> ga3, @CheckForNull x93 x93, x93 x932) {
        synchronized (ga3) {
            if (ga3.f7338g != x93) {
                return false;
            }
            ga3.f7338g = x932;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo5202d(ga3<?> ga3, @CheckForNull Object obj, Object obj2) {
        synchronized (ga3) {
            if (ga3.f7337f != obj) {
                return false;
            }
            ga3.f7337f = obj2;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo5203e(ga3<?> ga3, @CheckForNull fa3 fa3, @CheckForNull fa3 fa32) {
        synchronized (ga3) {
            if (ga3.f7339h != fa3) {
                return false;
            }
            ga3.f7339h = fa32;
            return true;
        }
    }
}
