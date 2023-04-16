package com.google.android.gms.internal.ads;

import android.os.Handler;

public final class h14 {

    /* renamed from: a */
    private final Handler f7953a;

    /* renamed from: b */
    private final i14 f7954b;

    public h14(Handler handler, i14 i14) {
        this.f7953a = i14 == null ? null : handler;
        this.f7954b = i14;
    }

    /* renamed from: a */
    public final void mo7782a(Exception exc) {
        Handler handler = this.f7953a;
        if (handler != null) {
            handler.post(new c14(this, exc));
        }
    }

    /* renamed from: b */
    public final void mo7783b(Exception exc) {
        Handler handler = this.f7953a;
        if (handler != null) {
            handler.post(new d14(this, exc));
        }
    }

    /* renamed from: c */
    public final void mo7784c(String str, long j, long j2) {
        Handler handler = this.f7953a;
        if (handler != null) {
            handler.post(new f14(this, str, j, j2));
        }
    }

    /* renamed from: d */
    public final void mo7785d(String str) {
        Handler handler = this.f7953a;
        if (handler != null) {
            handler.post(new e14(this, str));
        }
    }

    /* renamed from: e */
    public final void mo7786e(cd3 cd3) {
        cd3.mo6126a();
        Handler handler = this.f7953a;
        if (handler != null) {
            handler.post(new a14(this, cd3));
        }
    }

    /* renamed from: f */
    public final void mo7787f(cd3 cd3) {
        Handler handler = this.f7953a;
        if (handler != null) {
            handler.post(new b14(this, cd3));
        }
    }

    /* renamed from: g */
    public final void mo7788g(C1574c0 c0Var, de3 de3) {
        Handler handler = this.f7953a;
        if (handler != null) {
            handler.post(new z04(this, c0Var, de3));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo7789h(Exception exc) {
        i14 i14 = this.f7954b;
        int i = n13.f11236a;
        i14.mo6727A(exc);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo7790i(Exception exc) {
        i14 i14 = this.f7954b;
        int i = n13.f11236a;
        i14.mo6742n(exc);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo7791j(String str, long j, long j2) {
        i14 i14 = this.f7954b;
        int i = n13.f11236a;
        i14.mo6747p(str, j, j2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo7792k(String str) {
        i14 i14 = this.f7954b;
        int i = n13.f11236a;
        i14.mo6740l(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ void mo7793l(cd3 cd3) {
        cd3.mo6126a();
        i14 i14 = this.f7954b;
        int i = n13.f11236a;
        i14.mo6748q(cd3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ void mo7794m(cd3 cd3) {
        i14 i14 = this.f7954b;
        int i = n13.f11236a;
        i14.mo6741m(cd3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* synthetic */ void mo7795n(C1574c0 c0Var, de3 de3) {
        int i = n13.f11236a;
        this.f7954b.mo6755z(c0Var, de3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo7796o(long j) {
        i14 i14 = this.f7954b;
        int i = n13.f11236a;
        i14.mo6729D(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void mo7797p(boolean z) {
        i14 i14 = this.f7954b;
        int i = n13.f11236a;
        i14.mo6731a(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final /* synthetic */ void mo7798q(int i, long j, long j2) {
        i14 i14 = this.f7954b;
        int i2 = n13.f11236a;
        i14.mo6749r(i, j, j2);
    }

    /* renamed from: r */
    public final void mo7799r(long j) {
        Handler handler = this.f7953a;
        if (handler != null) {
            handler.post(new y04(this, j));
        }
    }

    /* renamed from: s */
    public final void mo7800s(boolean z) {
        Handler handler = this.f7953a;
        if (handler != null) {
            handler.post(new g14(this, z));
        }
    }

    /* renamed from: t */
    public final void mo7801t(int i, long j, long j2) {
        Handler handler = this.f7953a;
        if (handler != null) {
            handler.post(new x04(this, i, j, j2));
        }
    }
}
