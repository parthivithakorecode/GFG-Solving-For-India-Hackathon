package com.google.android.gms.internal.ads;

import android.os.IBinder;

final class ea2 implements gc1 {

    /* renamed from: a */
    boolean f6136a = false;

    /* renamed from: b */
    final /* synthetic */ d52 f6137b;

    /* renamed from: c */
    final /* synthetic */ bp0 f6138c;

    /* renamed from: d */
    final /* synthetic */ fa2 f6139d;

    ea2(fa2 fa2, d52 d52, bp0 bp0) {
        this.f6139d = fa2;
        this.f6137b = d52;
        this.f6138c = bp0;
    }

    /* renamed from: a */
    private final void m8402a(C1605cv cvVar) {
        int i = 1;
        if (true == ((Boolean) C2199sw.m17001c().mo8579b(m10.f10389T3)).booleanValue()) {
            i = 3;
        }
        this.f6138c.mo5908f(new e52(i, cvVar));
    }

    /* renamed from: d */
    public final void mo6884d(int i) {
        if (!this.f6136a) {
            m8402a(new C1605cv(i, fa2.m9088e(this.f6137b.f5646a, i), "undefined", (C1605cv) null, (IBinder) null));
        }
    }

    /* renamed from: e */
    public final synchronized void mo6885e(int i, String str) {
        if (!this.f6136a) {
            this.f6136a = true;
            if (str == null) {
                str = fa2.m9088e(this.f6137b.f5646a, i);
            }
            m8402a(new C1605cv(i, str, "undefined", (C1605cv) null, (IBinder) null));
        }
    }

    /* renamed from: g */
    public final synchronized void mo6886g() {
        this.f6138c.mo5907e(null);
    }

    /* renamed from: j0 */
    public final synchronized void mo6887j0(C1605cv cvVar) {
        this.f6136a = true;
        m8402a(cvVar);
    }
}
