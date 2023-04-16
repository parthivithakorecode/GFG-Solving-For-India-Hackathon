package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

public final class j02 implements j12 {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Pattern f8909f = Pattern.compile("Received error HTTP response code: (.*)");

    /* renamed from: a */
    private final jz1 f8910a;

    /* renamed from: b */
    private final dc3 f8911b;

    /* renamed from: c */
    private final ks2 f8912c;

    /* renamed from: d */
    private final ScheduledExecutorService f8913d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final r32 f8914e;

    j02(ks2 ks2, jz1 jz1, dc3 dc3, ScheduledExecutorService scheduledExecutorService, r32 r32) {
        this.f8912c = ks2;
        this.f8910a = jz1;
        this.f8911b = dc3;
        this.f8913d = scheduledExecutorService;
        this.f8914e = r32;
    }

    /* renamed from: a */
    public final cc3<ds2> mo7780a(vi0 vi0) {
        cc3<ds2> n = rb3.m16136n(this.f8910a.mo8571b(vi0), new g02(this), this.f8911b);
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10405V3)).booleanValue()) {
            n = rb3.m16129g(rb3.m16137o(n, (long) ((Integer) C2199sw.m17001c().mo8579b(m10.f10413W3)).intValue(), TimeUnit.SECONDS, this.f8913d), TimeoutException.class, h02.f7940a, wo0.f16891f);
        }
        rb3.m16140r(n, new i02(this), wo0.f16891f);
        return n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ cc3 mo8323c(InputStream inputStream) {
        return rb3.m16131i(new ds2(new as2(this.f8912c), cs2.m7548a(new InputStreamReader(inputStream))));
    }
}
