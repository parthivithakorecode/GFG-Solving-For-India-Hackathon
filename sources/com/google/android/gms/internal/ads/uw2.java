package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class uw2 {

    /* renamed from: a */
    private final Executor f15787a;

    /* renamed from: b */
    private final oo0 f15788b;

    public uw2(Executor executor, oo0 oo0) {
        this.f15787a = executor;
        this.f15788b = oo0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo11317a(String str) {
        this.f15788b.mo5345b(str);
    }

    /* renamed from: b */
    public final void mo11318b(String str) {
        this.f15787a.execute(new tw2(this, str));
    }
}
