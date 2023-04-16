package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import p034e2.C2547d;
import p069j1.C3202r1;

public final class l31 implements C2450zn {

    /* renamed from: f */
    private eu0 f9877f;

    /* renamed from: g */
    private final Executor f9878g;

    /* renamed from: h */
    private final x21 f9879h;

    /* renamed from: i */
    private final C2547d f9880i;

    /* renamed from: j */
    private boolean f9881j = false;

    /* renamed from: k */
    private boolean f9882k = false;

    /* renamed from: l */
    private final a31 f9883l = new a31();

    public l31(Executor executor, x21 x21, C2547d dVar) {
        this.f9878g = executor;
        this.f9879h = x21;
        this.f9880i = dVar;
    }

    /* renamed from: f */
    private final void m12556f() {
        try {
            JSONObject b = this.f9879h.mo8587a(this.f9883l);
            if (this.f9877f != null) {
                this.f9878g.execute(new k31(this, b));
            }
        } catch (JSONException e) {
            C3202r1.m24016l("Failed to call video active view js", e);
        }
    }

    /* renamed from: a */
    public final void mo8858a() {
        this.f9881j = false;
    }

    /* renamed from: b */
    public final void mo8859b() {
        this.f9881j = true;
        m12556f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo8860c(JSONObject jSONObject) {
        this.f9877f.mo9998c1("AFMA_updateActiveView", jSONObject);
    }

    /* renamed from: d */
    public final void mo8861d(boolean z) {
        this.f9882k = z;
    }

    /* renamed from: e */
    public final void mo8862e(eu0 eu0) {
        this.f9877f = eu0;
    }

    /* renamed from: m0 */
    public final void mo5653m0(C2376xn xnVar) {
        a31 a31 = this.f9883l;
        a31.f3922a = this.f9882k ? false : xnVar.f17256j;
        a31.f3925d = this.f9880i.mo12463b();
        this.f9883l.f3927f = xnVar;
        if (this.f9881j) {
            m12556f();
        }
    }
}
