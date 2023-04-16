package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p054h1.C2694t;
import p069j1.C3163g2;

public final class e02 {

    /* renamed from: a */
    private final ScheduledExecutorService f6002a;

    /* renamed from: b */
    private final dc3 f6003b;

    /* renamed from: c */
    private final w02 f6004c;

    /* renamed from: d */
    private final ev3<m22> f6005d;

    public e02(ScheduledExecutorService scheduledExecutorService, dc3 dc3, w02 w02, ev3<m22> ev3) {
        this.f6002a = scheduledExecutorService;
        this.f6003b = dc3;
        this.f6004c = w02;
        this.f6005d = ev3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ cc3 mo6765a(vi0 vi0, int i, Throwable th) {
        return this.f6005d.mo7166a().mo9110B5(vi0, i);
    }

    /* renamed from: b */
    public final cc3<InputStream> mo6766b(vi0 vi0) {
        cc3 cc3;
        String str = vi0.f16313i;
        C2694t.m21608q();
        if (C3163g2.m23929g(str)) {
            cc3 = rb3.m16130h(new k12(1));
        } else {
            w02 w02 = this.f6004c;
            synchronized (w02.f15300b) {
                if (w02.f15301c) {
                    cc3 = w02.f15299a;
                } else {
                    w02.f15301c = true;
                    w02.f15303e = vi0;
                    w02.f15304f.mo186q();
                    w02.f15299a.mo5905b(new v02(w02), wo0.f16891f);
                    cc3 = w02.f15299a;
                }
            }
        }
        int callingUid = Binder.getCallingUid();
        ib3 E = ib3.m10985E(cc3);
        long intValue = (long) ((Integer) C2199sw.m17001c().mo8579b(m10.f10413W3)).intValue();
        return rb3.m16129g((ib3) rb3.m16137o(E, intValue, TimeUnit.SECONDS, this.f6002a), Throwable.class, new d02(this, vi0, callingUid), this.f6003b);
    }
}
