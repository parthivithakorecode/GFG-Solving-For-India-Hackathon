package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import p054h1.C2694t;
import p069j1.C3163g2;

public final class jz1 {

    /* renamed from: a */
    private final dc3 f9319a;

    /* renamed from: b */
    private final dc3 f9320b;

    /* renamed from: c */
    private final s02 f9321c;

    /* renamed from: d */
    private final ev3<m22> f9322d;

    public jz1(dc3 dc3, dc3 dc32, s02 s02, ev3<m22> ev3) {
        this.f9319a = dc3;
        this.f9320b = dc32;
        this.f9321c = s02;
        this.f9322d = ev3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ cc3 mo8570a(vi0 vi0, int i, k12 k12) {
        return this.f9322d.mo7166a().mo9109A5(vi0, i);
    }

    /* renamed from: b */
    public final cc3<InputStream> mo8571b(vi0 vi0) {
        String str = vi0.f16313i;
        C2694t.m21608q();
        return rb3.m16129g(C3163g2.m23929g(str) ? rb3.m16130h(new k12(1)) : rb3.m16129g(this.f9319a.mo6445C(new iz1(this, vi0)), ExecutionException.class, hz1.f8469a, this.f9320b), k12.class, new gz1(this, vi0, Binder.getCallingUid()), this.f9320b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ InputStream mo8572c(vi0 vi0) {
        bp0<InputStream> bp0;
        s02 s02 = this.f9321c;
        synchronized (s02.f15300b) {
            if (s02.f15301c) {
                bp0 = s02.f15299a;
            } else {
                s02.f15301c = true;
                s02.f15303e = vi0;
                s02.f15304f.mo186q();
                s02.f15299a.mo5905b(new r02(s02), wo0.f16891f);
                bp0 = s02.f15299a;
            }
        }
        return (InputStream) bp0.get((long) ((Integer) C2199sw.m17001c().mo8579b(m10.f10413W3)).intValue(), TimeUnit.SECONDS);
    }
}
