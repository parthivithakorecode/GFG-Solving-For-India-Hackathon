package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.util.regex.Pattern;
import p054h1.C2694t;
import p069j1.C3163g2;

public final class u22 implements vf1, C2420yu, qb1, za1 {

    /* renamed from: f */
    private final Context f15358f;

    /* renamed from: g */
    private final ws2 f15359g;

    /* renamed from: h */
    private final ds2 f15360h;

    /* renamed from: i */
    private final rr2 f15361i;

    /* renamed from: j */
    private final o42 f15362j;

    /* renamed from: k */
    private Boolean f15363k;

    /* renamed from: l */
    private final boolean f15364l = ((Boolean) C2199sw.m17001c().mo8579b(m10.f10528j5)).booleanValue();

    /* renamed from: m */
    private final xw2 f15365m;

    /* renamed from: n */
    private final String f15366n;

    public u22(Context context, ws2 ws2, ds2 ds2, rr2 rr2, o42 o42, xw2 xw2, String str) {
        this.f15358f = context;
        this.f15359g = ws2;
        this.f15360h = ds2;
        this.f15361i = rr2;
        this.f15362j = o42;
        this.f15365m = xw2;
        this.f15366n = str;
    }

    /* renamed from: b */
    private final ww2 m17680b(String str) {
        ww2 b = ww2.m19233b(str);
        b.mo11747h(this.f15360h, (xn0) null);
        b.mo11745f(this.f15361i);
        b.mo11742a("request_id", this.f15366n);
        if (!this.f15361i.f13915u.isEmpty()) {
            b.mo11742a("ancn", this.f15361i.f13915u.get(0));
        }
        if (this.f15361i.f13897g0) {
            C2694t.m21608q();
            b.mo11742a("device_connectivity", true != C3163g2.m23934j(this.f15358f) ? "offline" : "online");
            b.mo11742a("event_timestamp", String.valueOf(C2694t.m21592a().mo12462a()));
            b.mo11742a("offline_ad", "1");
        }
        return b;
    }

    /* renamed from: e */
    private final void m17681e(ww2 ww2) {
        if (this.f15361i.f13897g0) {
            this.f15362j.mo9649n(new q42(C2694t.m21592a().mo12462a(), this.f15360h.f5904b.f5509b.f15729b, this.f15365m.mo5982b(ww2), 2));
            return;
        }
        this.f15365m.mo5981a(ww2);
    }

    /* renamed from: f */
    private final boolean m17682f() {
        if (this.f15363k == null) {
            synchronized (this) {
                if (this.f15363k == null) {
                    String str = (String) C2199sw.m17001c().mo8579b(m10.f10479e1);
                    C2694t.m21608q();
                    String d0 = C3163g2.m23924d0(this.f15358f);
                    boolean z = false;
                    if (!(str == null || d0 == null)) {
                        try {
                            z = Pattern.matches(str, d0);
                        } catch (RuntimeException e) {
                            C2694t.m21607p().mo11034s(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.f15363k = Boolean.valueOf(z);
                }
            }
        }
        return this.f15363k.booleanValue();
    }

    /* renamed from: L */
    public final void mo25L() {
        if (this.f15361i.f13897g0) {
            m17681e(m17680b("click"));
        }
    }

    /* renamed from: a */
    public final void mo8023a() {
        if (this.f15364l) {
            xw2 xw2 = this.f15365m;
            ww2 b = m17680b("ifts");
            b.mo11742a("reason", "blocked");
            xw2.mo5981a(b);
        }
    }

    /* renamed from: c */
    public final void mo8024c() {
        if (m17682f()) {
            this.f15365m.mo5981a(m17680b("adapter_shown"));
        }
    }

    /* renamed from: d */
    public final void mo8025d(C1605cv cvVar) {
        C1605cv cvVar2;
        if (this.f15364l) {
            int i = cvVar.f5529f;
            String str = cvVar.f5530g;
            if (cvVar.f5531h.equals("com.google.android.gms.ads") && (cvVar2 = cvVar.f5532i) != null && !cvVar2.f5531h.equals("com.google.android.gms.ads")) {
                C1605cv cvVar3 = cvVar.f5532i;
                i = cvVar3.f5529f;
                str = cvVar3.f5530g;
            }
            String a = this.f15359g.mo11702a(str);
            ww2 b = m17680b("ifts");
            b.mo11742a("reason", "adapter");
            if (i >= 0) {
                b.mo11742a("arec", String.valueOf(i));
            }
            if (a != null) {
                b.mo11742a("areec", a);
            }
            this.f15365m.mo5981a(b);
        }
    }

    /* renamed from: g */
    public final void mo8026g() {
        if (m17682f()) {
            this.f15365m.mo5981a(m17680b("adapter_impression"));
        }
    }

    /* renamed from: k */
    public final void mo5153k() {
        if (m17682f() || this.f15361i.f13897g0) {
            m17681e(m17680b("impression"));
        }
    }

    /* renamed from: q0 */
    public final void mo8027q0(ok1 ok1) {
        if (this.f15364l) {
            ww2 b = m17680b("ifts");
            b.mo11742a("reason", "exception");
            if (!TextUtils.isEmpty(ok1.getMessage())) {
                b.mo11742a("msg", ok1.getMessage());
            }
            this.f15365m.mo5981a(b);
        }
    }
}
