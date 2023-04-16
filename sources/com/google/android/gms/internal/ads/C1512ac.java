package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ac */
final class C1512ac implements v23 {

    /* renamed from: a */
    private final w03 f4063a;

    /* renamed from: b */
    private final o13 f4064b;

    /* renamed from: c */
    private final C1994nc f4065c;

    /* renamed from: d */
    private final C2438zb f4066d;

    /* renamed from: e */
    private final C1845jb f4067e;

    C1512ac(w03 w03, o13 o13, C1994nc ncVar, C2438zb zbVar, C1845jb jbVar) {
        this.f4063a = w03;
        this.f4064b = o13;
        this.f4065c = ncVar;
        this.f4066d = zbVar;
        this.f4067e = jbVar;
    }

    /* renamed from: d */
    private final Map<String, Object> m6011d() {
        HashMap hashMap = new HashMap();
        C1509a9 b = this.f4064b.mo9627b();
        hashMap.put("v", this.f4063a.mo5061b());
        hashMap.put("gms", Boolean.valueOf(this.f4063a.mo5062c()));
        hashMap.put("int", b.mo5188y0());
        hashMap.put("up", Boolean.valueOf(this.f4066d.mo12197a()));
        hashMap.put("t", new Throwable());
        return hashMap;
    }

    /* renamed from: a */
    public final Map<String, Object> mo5224a() {
        Map<String, Object> d = m6011d();
        C1509a9 a = this.f4064b.mo9626a();
        d.put("gai", Boolean.valueOf(this.f4063a.mo5063d()));
        d.put("did", a.mo5187x0());
        d.put("dst", Integer.valueOf(a.mo5185m0() - 1));
        d.put("doo", Boolean.valueOf(a.mo5182j0()));
        C1845jb jbVar = this.f4067e;
        if (jbVar != null) {
            d.put("nt", Long.valueOf(jbVar.mo8439a()));
        }
        return d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo5225b(View view) {
        this.f4065c.mo9494d(view);
    }

    /* renamed from: c */
    public final Map<String, Object> mo5226c() {
        return m6011d();
    }

    public final Map<String, Object> zza() {
        Map<String, Object> d = m6011d();
        d.put("lts", Long.valueOf(this.f4065c.mo9492a()));
        return d;
    }
}
