package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

final class qr1<T> implements t70<Object> {

    /* renamed from: a */
    private final WeakReference<T> f13288a;

    /* renamed from: b */
    private final String f13289b;

    /* renamed from: c */
    private final t70<T> f13290c;

    /* renamed from: d */
    final /* synthetic */ rr1 f13291d;

    /* synthetic */ qr1(rr1 rr1, WeakReference weakReference, String str, t70 t70, pr1 pr1) {
        this.f13291d = rr1;
        this.f13288a = weakReference;
        this.f13289b = str;
        this.f13290c = t70;
    }

    /* renamed from: a */
    public final void mo5150a(Object obj, Map<String, String> map) {
        Object obj2 = this.f13288a.get();
        if (obj2 == null) {
            this.f13291d.mo10661k(this.f13289b, this);
        } else {
            this.f13290c.mo5150a(obj2, map);
        }
    }
}
