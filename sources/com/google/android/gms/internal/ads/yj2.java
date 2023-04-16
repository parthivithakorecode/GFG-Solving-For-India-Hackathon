package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p033e1.C2538a;

public final class yj2 implements ij2<zj2> {

    /* renamed from: a */
    private final Context f17766a;

    /* renamed from: b */
    private final ScheduledExecutorService f17767b;

    /* renamed from: c */
    private final Executor f17768c;

    /* renamed from: d */
    private final int f17769d;

    /* renamed from: e */
    private final ln0 f17770e;

    public yj2(ln0 ln0, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, byte[] bArr) {
        this.f17770e = ln0;
        this.f17766a = context;
        this.f17767b = scheduledExecutorService;
        this.f17768c = executor;
        this.f17769d = i;
    }

    /* renamed from: a */
    public final cc3<zj2> mo5813a() {
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10298I0)).booleanValue()) {
            return rb3.m16130h(new Exception("Did not ad Ad ID into query param."));
        }
        return rb3.m16128f((ib3) rb3.m16137o(rb3.m16135m(ib3.m10985E(this.f17770e.mo8977a(this.f17766a, this.f17769d)), xj2.f17228a, this.f17768c), ((Long) C2199sw.m17001c().mo8579b(m10.f10306J0)).longValue(), TimeUnit.MILLISECONDS, this.f17767b), Throwable.class, new wj2(this), this.f17768c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ zj2 mo12041b(Throwable th) {
        C2125qw.m15897b();
        ContentResolver contentResolver = this.f17766a.getContentResolver();
        return new zj2((C2538a.C2539a) null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"));
    }
}
