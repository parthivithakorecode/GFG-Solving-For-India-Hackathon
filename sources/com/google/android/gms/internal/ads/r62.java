package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.concurrent.Executor;
import p034e2.C2555l;
import p061i1.C2807f;
import p061i1.C2824w;
import p061i1.C2826y;
import p095n.C3742c;

public final class r62 implements a52<ij1> {

    /* renamed from: a */
    private final Context f13521a;

    /* renamed from: b */
    private final gk1 f13522b;

    /* renamed from: c */
    private final Executor f13523c;

    /* renamed from: d */
    private final qr2 f13524d;

    public r62(Context context, Executor executor, gk1 gk1, qr2 qr2) {
        this.f13521a = context;
        this.f13522b = gk1;
        this.f13523c = executor;
        this.f13524d = qr2;
    }

    /* renamed from: d */
    private static String m16070d(rr2 rr2) {
        try {
            return rr2.f13917w.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final cc3<ij1> mo5105a(ds2 ds2, rr2 rr2) {
        String d = m16070d(rr2);
        return rb3.m16136n(rb3.m16131i(null), new q62(this, d != null ? Uri.parse(d) : null, ds2, rr2), this.f13523c);
    }

    /* renamed from: b */
    public final boolean mo5106b(ds2 ds2, rr2 rr2) {
        return (this.f13521a instanceof Activity) && C2555l.m21207a() && l20.m12506g(this.f13521a) && !TextUtils.isEmpty(m16070d(rr2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ cc3 mo10487c(Uri uri, ds2 ds2, rr2 rr2, Object obj) {
        try {
            C3742c a = new C3742c.C3743a().mo14951a();
            a.f21577a.setData(uri);
            C2807f fVar = new C2807f(a.f21577a, (C2824w) null);
            bp0 bp0 = new bp0();
            jj1 c = this.f13522b.mo7198c(new l71(ds2, rr2, (String) null), new nj1(new p62(bp0), (eu0) null));
            bp0.mo5907e(new AdOverlayInfoParcel(fVar, (C2420yu) null, c.mo5581h(), (C2826y) null, new po0(0, 0, false, false, false), (eu0) null, (pi1) null));
            this.f13524d.mo10373a();
            return rb3.m16131i(c.mo5582i());
        } catch (Throwable th) {
            io0.m11129e("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
