package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;
import p054h1.C2675a;
import p054h1.C2686l;
import p054h1.C2694t;
import p069j1.C3163g2;

@ParametersAreNonnullByDefault
public final class pa0 implements ha0, fa0 {

    /* renamed from: f */
    private final eu0 f12569f;

    public pa0(Context context, po0 po0, C1734gb gbVar, C2675a aVar) {
        C2694t.m21591A();
        eu0 a = ru0.m16446a(context, vv0.m18686a(), "", false, false, (C1734gb) null, (m20) null, po0, (b20) null, (C2686l) null, (C2675a) null, C1527ar.m6231a(), (rr2) null, (ur2) null);
        this.f12569f = a;
        ((View) a).setWillNotDraw(true);
    }

    /* renamed from: L */
    private static final void m14890L(Runnable runnable) {
        C2125qw.m15897b();
        if (bo0.m6992p()) {
            runnable.run();
        } else {
            C3163g2.f20465i.post(runnable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final /* synthetic */ void mo9997D(String str) {
        this.f12569f.loadData(str, "text/html", "UTF-8");
    }

    /* renamed from: Q */
    public final void mo7889Q(String str) {
        m14890L(new na0(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[]{str})));
    }

    /* renamed from: U */
    public final void mo9716U(String str, t70<? super ob0> t70) {
        this.f12569f.mo7080F0(str, new oa0(this, t70));
    }

    /* renamed from: V0 */
    public final void mo9717V0(String str, t70<? super ob0> t70) {
        this.f12569f.mo7148u0(str, new ja0(t70));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo7272a(String str, String str2) {
        ea0.m8397c(this, str, str2);
    }

    /* renamed from: b */
    public final void mo7273b(String str) {
        m14890L(new ka0(this, str));
    }

    /* renamed from: c */
    public final void mo7890c() {
        this.f12569f.destroy();
    }

    /* renamed from: c1 */
    public final /* synthetic */ void mo9998c1(String str, JSONObject jSONObject) {
        ea0.m8398d(this, str, jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo9999g(String str) {
        this.f12569f.mo7273b(str);
    }

    /* renamed from: h */
    public final boolean mo7891h() {
        return this.f12569f.mo7140r0();
    }

    /* renamed from: i */
    public final pb0 mo7892i() {
        return new pb0(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo10000k(String str) {
        this.f12569f.loadData(str, "text/html", "UTF-8");
    }

    /* renamed from: n0 */
    public final void mo7893n0(String str) {
        m14890L(new ma0(this, str));
    }

    /* renamed from: p0 */
    public final void mo7894p0(ra0 ra0) {
        this.f12569f.mo7077D0().mo9039Z0(new ia0(ra0, (byte[]) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final /* synthetic */ void mo10001r(String str) {
        this.f12569f.loadUrl(str);
    }

    /* renamed from: s */
    public final /* synthetic */ void mo6423s(String str, JSONObject jSONObject) {
        ea0.m8396b(this, str, jSONObject);
    }

    /* renamed from: t */
    public final /* synthetic */ void mo6424t(String str, Map map) {
        ea0.m8395a(this, str, map);
    }

    /* renamed from: z */
    public final void mo7895z(String str) {
        m14890L(new la0(this, str));
    }
}
