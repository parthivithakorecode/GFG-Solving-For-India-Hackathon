package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class nk2 implements ij2<ok2> {

    /* renamed from: a */
    private final Context f11514a;

    /* renamed from: b */
    private final tn0 f11515b;

    /* renamed from: c */
    private final ScheduledExecutorService f11516c;

    /* renamed from: d */
    private final Executor f11517d;

    /* renamed from: e */
    private final String f11518e;

    /* renamed from: f */
    private final ln0 f11519f;

    public nk2(ln0 ln0, int i, Context context, tn0 tn0, ScheduledExecutorService scheduledExecutorService, Executor executor, String str, byte[] bArr) {
        this.f11519f = ln0;
        this.f11514a = context;
        this.f11515b = tn0;
        this.f11516c = scheduledExecutorService;
        this.f11517d = executor;
        this.f11518e = str;
    }

    /* renamed from: a */
    public final cc3<ok2> mo5813a() {
        return rb3.m16128f((ib3) rb3.m16137o(rb3.m16135m(ib3.m10985E(rb3.m16134l(new mk2(this), this.f11517d)), lk2.f10078a, this.f11517d), ((Long) C2199sw.m17001c().mo8579b(m10.f10306J0)).longValue(), TimeUnit.MILLISECONDS, this.f11516c), Exception.class, new kk2(this), jc3.m11564b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ ok2 mo9543b(Exception exc) {
        this.f11515b.mo11034s(exc, "AttestationTokenSignal");
        return null;
    }
}
