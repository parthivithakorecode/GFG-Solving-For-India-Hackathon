package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

public final class ek2 implements ij2<fk2> {

    /* renamed from: a */
    private final Executor f6264a;

    /* renamed from: b */
    private final String f6265b;

    /* renamed from: c */
    private final PackageInfo f6266c;

    /* renamed from: d */
    private final ln0 f6267d;

    public ek2(ln0 ln0, Executor executor, String str, PackageInfo packageInfo, int i, byte[] bArr) {
        this.f6267d = ln0;
        this.f6264a = executor;
        this.f6265b = str;
        this.f6266c = packageInfo;
    }

    /* renamed from: a */
    public final cc3<fk2> mo5813a() {
        return rb3.m16129g(rb3.m16135m(rb3.m16131i(this.f6265b), ck2.f5433a, this.f6264a), Throwable.class, new dk2(this), this.f6264a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ cc3 mo6989b(Throwable th) {
        return rb3.m16131i(new fk2(this.f6265b));
    }
}
