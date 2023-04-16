package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.util.regex.Pattern;
import p054h1.C2694t;
import p069j1.C3163g2;
import p111p1.C3911o;

public final class hv1 implements vf1, C2420yu, qb1, za1 {

    /* renamed from: f */
    private final Context f8430f;

    /* renamed from: g */
    private final ws2 f8431g;

    /* renamed from: h */
    private final wv1 f8432h;

    /* renamed from: i */
    private final ds2 f8433i;

    /* renamed from: j */
    private final rr2 f8434j;

    /* renamed from: k */
    private final o42 f8435k;

    /* renamed from: l */
    private Boolean f8436l;

    /* renamed from: m */
    private final boolean f8437m = ((Boolean) C2199sw.m17001c().mo8579b(m10.f10528j5)).booleanValue();

    public hv1(Context context, ws2 ws2, wv1 wv1, ds2 ds2, rr2 rr2, o42 o42) {
        this.f8430f = context;
        this.f8431g = ws2;
        this.f8432h = wv1;
        this.f8433i = ds2;
        this.f8434j = rr2;
        this.f8435k = o42;
    }

    /* renamed from: b */
    private final vv1 m10786b(String str) {
        vv1 a = this.f8432h.mo11740a();
        a.mo11535d(this.f8433i.f5904b.f5509b);
        a.mo11534c(this.f8434j);
        a.mo11533b("action", str);
        if (!this.f8434j.f13915u.isEmpty()) {
            a.mo11533b("ancn", this.f8434j.f13915u.get(0));
        }
        if (this.f8434j.f13897g0) {
            C2694t.m21608q();
            a.mo11533b("device_connectivity", true != C3163g2.m23934j(this.f8430f) ? "offline" : "online");
            a.mo11533b("event_timestamp", String.valueOf(C2694t.m21592a().mo12462a()));
            a.mo11533b("offline_ad", "1");
        }
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10609s5)).booleanValue()) {
            boolean d = C3911o.m26067d(this.f8433i);
            a.mo11533b("scar", String.valueOf(d));
            if (d) {
                String b = C3911o.m26065b(this.f8433i);
                if (!TextUtils.isEmpty(b)) {
                    a.mo11533b("ragent", b);
                }
                String a2 = C3911o.m26064a(this.f8433i);
                if (!TextUtils.isEmpty(a2)) {
                    a.mo11533b("rtype", a2);
                }
            }
        }
        return a;
    }

    /* renamed from: e */
    private final void m10787e(vv1 vv1) {
        if (this.f8434j.f13897g0) {
            this.f8435k.mo9649n(new q42(C2694t.m21592a().mo12462a(), this.f8433i.f5904b.f5509b.f15729b, vv1.mo11536e(), 2));
            return;
        }
        vv1.mo11537f();
    }

    /* renamed from: f */
    private final boolean m10788f() {
        if (this.f8436l == null) {
            synchronized (this) {
                if (this.f8436l == null) {
                    String str = (String) C2199sw.m17001c().mo8579b(m10.f10479e1);
                    C2694t.m21608q();
                    String d0 = C3163g2.m23924d0(this.f8430f);
                    boolean z = false;
                    if (!(str == null || d0 == null)) {
                        try {
                            z = Pattern.matches(str, d0);
                        } catch (RuntimeException e) {
                            C2694t.m21607p().mo11034s(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.f8436l = Boolean.valueOf(z);
                }
            }
        }
        return this.f8436l.booleanValue();
    }

    /* renamed from: L */
    public final void mo25L() {
        if (this.f8434j.f13897g0) {
            m10787e(m10786b("click"));
        }
    }

    /* renamed from: a */
    public final void mo8023a() {
        if (this.f8437m) {
            vv1 b = m10786b("ifts");
            b.mo11533b("reason", "blocked");
            b.mo11537f();
        }
    }

    /* renamed from: c */
    public final void mo8024c() {
        if (m10788f()) {
            m10786b("adapter_shown").mo11537f();
        }
    }

    /* renamed from: d */
    public final void mo8025d(C1605cv cvVar) {
        C1605cv cvVar2;
        if (this.f8437m) {
            vv1 b = m10786b("ifts");
            b.mo11533b("reason", "adapter");
            int i = cvVar.f5529f;
            String str = cvVar.f5530g;
            if (cvVar.f5531h.equals("com.google.android.gms.ads") && (cvVar2 = cvVar.f5532i) != null && !cvVar2.f5531h.equals("com.google.android.gms.ads")) {
                C1605cv cvVar3 = cvVar.f5532i;
                i = cvVar3.f5529f;
                str = cvVar3.f5530g;
            }
            if (i >= 0) {
                b.mo11533b("arec", String.valueOf(i));
            }
            String a = this.f8431g.mo11702a(str);
            if (a != null) {
                b.mo11533b("areec", a);
            }
            b.mo11537f();
        }
    }

    /* renamed from: g */
    public final void mo8026g() {
        if (m10788f()) {
            m10786b("adapter_impression").mo11537f();
        }
    }

    /* renamed from: k */
    public final void mo5153k() {
        if (m10788f() || this.f8434j.f13897g0) {
            m10787e(m10786b("impression"));
        }
    }

    /* renamed from: q0 */
    public final void mo8027q0(ok1 ok1) {
        if (this.f8437m) {
            vv1 b = m10786b("ifts");
            b.mo11533b("reason", "exception");
            if (!TextUtils.isEmpty(ok1.getMessage())) {
                b.mo11533b("msg", ok1.getMessage());
            }
            b.mo11537f();
        }
    }
}
