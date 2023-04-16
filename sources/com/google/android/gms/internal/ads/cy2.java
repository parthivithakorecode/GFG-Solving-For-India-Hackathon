package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;

public final class cy2 {

    /* renamed from: a */
    private final Executor f5573a;

    /* renamed from: b */
    private final oo0 f5574b;

    public cy2(Executor executor, oo0 oo0) {
        this.f5573a = executor;
        this.f5574b = oo0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo6338a(String str) {
        this.f5574b.mo5345b(str);
    }

    /* renamed from: b */
    public final void mo6339b(String str) {
        this.f5573a.execute(new by2(this, str));
    }

    /* renamed from: c */
    public final void mo6340c(List<String> list) {
        for (String b : list) {
            mo6339b(b);
        }
    }
}
