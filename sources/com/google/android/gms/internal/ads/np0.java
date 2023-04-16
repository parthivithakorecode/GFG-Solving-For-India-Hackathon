package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

abstract class np0 {

    /* renamed from: f */
    private final WeakReference<View> f11573f;

    public np0(View view) {
        this.f11573f = new WeakReference<>(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo8983a(ViewTreeObserver viewTreeObserver);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo8984b(ViewTreeObserver viewTreeObserver);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final ViewTreeObserver mo9570c() {
        ViewTreeObserver viewTreeObserver;
        View view = (View) this.f11573f.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }

    /* renamed from: d */
    public final void mo9571d() {
        ViewTreeObserver c = mo9570c();
        if (c != null) {
            mo8983a(c);
        }
    }

    /* renamed from: e */
    public final void mo9572e() {
        ViewTreeObserver c = mo9570c();
        if (c != null) {
            mo8984b(c);
        }
    }
}
