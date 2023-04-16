package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p054h1.C2675a;
import p054h1.C2676b;

public final class rr1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final lr1 f13845a = new lr1((kr1) null);

    /* renamed from: b */
    private final C2675a f13846b;

    /* renamed from: c */
    private final ru0 f13847c;

    /* renamed from: d */
    private final Context f13848d;

    /* renamed from: e */
    private final wv1 f13849e;

    /* renamed from: f */
    private final xw2 f13850f;

    /* renamed from: g */
    private final Executor f13851g;

    /* renamed from: h */
    private final C1734gb f13852h;

    /* renamed from: i */
    private final po0 f13853i;

    /* renamed from: j */
    private final i80 f13854j;

    /* renamed from: k */
    private final o42 f13855k;

    /* renamed from: l */
    private final cy2 f13856l;

    /* renamed from: m */
    private cc3<eu0> f13857m;

    rr1(or1 or1) {
        this.f13848d = or1.f12163c;
        this.f13851g = or1.f12167g;
        this.f13852h = or1.f12168h;
        this.f13853i = or1.f12169i;
        this.f13846b = or1.f12161a;
        this.f13847c = or1.f12162b;
        this.f13854j = new i80();
        this.f13855k = or1.f12166f;
        this.f13856l = or1.f12170j;
        this.f13849e = or1.f12164d;
        this.f13850f = or1.f12165e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ eu0 mo10652a(eu0 eu0) {
        eu0 eu02 = eu0;
        eu02.mo7080F0("/result", this.f13854j);
        tv0 D0 = eu0.mo7077D0();
        lr1 lr1 = this.f13845a;
        C2676b bVar = r2;
        C2676b bVar2 = new C2676b(this.f13848d, (ml0) null, (ji0) null);
        D0.mo9053k0((C2420yu) null, lr1, lr1, lr1, lr1, false, (w70) null, bVar, (fg0) null, (ml0) null, this.f13855k, this.f13856l, this.f13849e, this.f13850f, (u70) null, (pi1) null);
        return eu02;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ cc3 mo10653c(String str, JSONObject jSONObject, eu0 eu0) {
        return this.f13854j.mo8114b(eu0, str, jSONObject);
    }

    /* renamed from: d */
    public final synchronized cc3<JSONObject> mo10654d(String str, JSONObject jSONObject) {
        cc3<eu0> cc3 = this.f13857m;
        if (cc3 == null) {
            return rb3.m16131i(null);
        }
        return rb3.m16136n(cc3, new er1(this, str, jSONObject), this.f13851g);
    }

    /* renamed from: e */
    public final synchronized void mo10655e(rr2 rr2, ur2 ur2) {
        cc3<eu0> cc3 = this.f13857m;
        if (cc3 != null) {
            rb3.m16140r(cc3, new jr1(this, rr2, ur2), this.f13851g);
        }
    }

    /* renamed from: f */
    public final synchronized void mo10656f() {
        cc3<eu0> cc3 = this.f13857m;
        if (cc3 != null) {
            rb3.m16140r(cc3, new fr1(this), this.f13851g);
            this.f13857m = null;
        }
    }

    /* renamed from: g */
    public final synchronized void mo10657g(String str, Map<String, ?> map) {
        cc3<eu0> cc3 = this.f13857m;
        if (cc3 != null) {
            rb3.m16140r(cc3, new ir1(this, "sendMessageToNativeJs", map), this.f13851g);
        }
    }

    /* renamed from: h */
    public final synchronized void mo10658h() {
        Context context = this.f13848d;
        po0 po0 = this.f13853i;
        e10 e10 = m10.f10579p2;
        cc3<eu0> m = rb3.m16135m(rb3.m16134l(new ou0(context, this.f13852h, po0, this.f13846b, (String) C2199sw.m17001c().mo8579b(e10)), wo0.f16890e), new dr1(this), this.f13851g);
        this.f13857m = m;
        zo0.m20769a(m, "NativeJavascriptExecutor.initializeEngine");
    }

    /* renamed from: i */
    public final synchronized void mo10659i(String str, t70<Object> t70) {
        cc3<eu0> cc3 = this.f13857m;
        if (cc3 != null) {
            rb3.m16140r(cc3, new gr1(this, str, t70), this.f13851g);
        }
    }

    /* renamed from: j */
    public final <T> void mo10660j(WeakReference<T> weakReference, String str, t70<T> t70) {
        mo10659i(str, new qr1(this, weakReference, str, t70, (pr1) null));
    }

    /* renamed from: k */
    public final synchronized void mo10661k(String str, t70<Object> t70) {
        cc3<eu0> cc3 = this.f13857m;
        if (cc3 != null) {
            rb3.m16140r(cc3, new hr1(this, str, t70), this.f13851g);
        }
    }
}
