package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p069j1.C3202r1;

public class ew1 {

    /* renamed from: a */
    protected final String f6401a = w20.f16657b.mo9928e();

    /* renamed from: b */
    protected final Map<String, String> f6402b = new HashMap();

    /* renamed from: c */
    protected final Executor f6403c;

    /* renamed from: d */
    protected final oo0 f6404d;

    /* renamed from: e */
    protected final boolean f6405e;

    /* renamed from: f */
    private final ix2 f6406f;

    protected ew1(Executor executor, oo0 oo0, ix2 ix2) {
        this.f6403c = executor;
        this.f6404d = oo0;
        this.f6405e = ((Boolean) C2199sw.m17001c().mo8579b(m10.f10596r1)).booleanValue() ? ((Boolean) C2199sw.m17001c().mo8579b(m10.f10629v1)).booleanValue() : ((double) C2125qw.m15900e().nextFloat()) <= w20.f16656a.mo9928e().doubleValue();
        this.f6406f = ix2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo7173a(Map<String, String> map) {
        return this.f6406f.mo8289a(map);
    }

    /* renamed from: b */
    public final void mo7174b(Map<String, String> map) {
        String a = this.f6406f.mo8289a(map);
        if (this.f6405e) {
            this.f6403c.execute(new dw1(this, a));
        }
        C3202r1.m24015k(a);
    }
}
