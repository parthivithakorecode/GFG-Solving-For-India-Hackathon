package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

public final class mb4 {

    /* renamed from: a */
    private final Handler f10800a;

    /* renamed from: b */
    private final nb4 f10801b;

    public mb4(Handler handler, nb4 nb4) {
        this.f10800a = nb4 == null ? null : handler;
        this.f10801b = nb4;
    }

    /* renamed from: a */
    public final void mo9164a(String str, long j, long j2) {
        Handler handler = this.f10800a;
        if (handler != null) {
            handler.post(new lb4(this, str, j, j2));
        }
    }

    /* renamed from: b */
    public final void mo9165b(String str) {
        Handler handler = this.f10800a;
        if (handler != null) {
            handler.post(new kb4(this, str));
        }
    }

    /* renamed from: c */
    public final void mo9166c(cd3 cd3) {
        cd3.mo6126a();
        Handler handler = this.f10800a;
        if (handler != null) {
            handler.post(new gb4(this, cd3));
        }
    }

    /* renamed from: d */
    public final void mo9167d(int i, long j) {
        Handler handler = this.f10800a;
        if (handler != null) {
            handler.post(new cb4(this, i, j));
        }
    }

    /* renamed from: e */
    public final void mo9168e(cd3 cd3) {
        Handler handler = this.f10800a;
        if (handler != null) {
            handler.post(new hb4(this, cd3));
        }
    }

    /* renamed from: f */
    public final void mo9169f(C1574c0 c0Var, de3 de3) {
        Handler handler = this.f10800a;
        if (handler != null) {
            handler.post(new eb4(this, c0Var, de3));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo9170g(String str, long j, long j2) {
        nb4 nb4 = this.f10801b;
        int i = n13.f11236a;
        nb4.mo6753t(str, j, j2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo9171h(String str) {
        nb4 nb4 = this.f10801b;
        int i = n13.f11236a;
        nb4.mo6728C(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo9172i(cd3 cd3) {
        cd3.mo6126a();
        nb4 nb4 = this.f10801b;
        int i = n13.f11236a;
        nb4.mo6739k(cd3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo9173j(int i, long j) {
        nb4 nb4 = this.f10801b;
        int i2 = n13.f11236a;
        nb4.mo6737h(i, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo9174k(cd3 cd3) {
        nb4 nb4 = this.f10801b;
        int i = n13.f11236a;
        nb4.mo6735e(cd3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ void mo9175l(C1574c0 c0Var, de3 de3) {
        int i = n13.f11236a;
        this.f10801b.mo6730F(c0Var, de3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ void mo9176m(Object obj, long j) {
        nb4 nb4 = this.f10801b;
        int i = n13.f11236a;
        nb4.mo6754x(obj, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* synthetic */ void mo9177n(long j, int i) {
        nb4 nb4 = this.f10801b;
        int i2 = n13.f11236a;
        nb4.mo6733c(j, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo9178o(Exception exc) {
        nb4 nb4 = this.f10801b;
        int i = n13.f11236a;
        nb4.mo6738i(exc);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void mo9179p(ry0 ry0) {
        nb4 nb4 = this.f10801b;
        int i = n13.f11236a;
        nb4.mo6732b(ry0);
    }

    /* renamed from: q */
    public final void mo9180q(Object obj) {
        if (this.f10800a != null) {
            this.f10800a.post(new jb4(this, obj, SystemClock.elapsedRealtime()));
        }
    }

    /* renamed from: r */
    public final void mo9181r(long j, int i) {
        Handler handler = this.f10800a;
        if (handler != null) {
            handler.post(new db4(this, j, i));
        }
    }

    /* renamed from: s */
    public final void mo9182s(Exception exc) {
        Handler handler = this.f10800a;
        if (handler != null) {
            handler.post(new ib4(this, exc));
        }
    }

    /* renamed from: t */
    public final void mo9183t(ry0 ry0) {
        Handler handler = this.f10800a;
        if (handler != null) {
            handler.post(new fb4(this, ry0));
        }
    }
}
