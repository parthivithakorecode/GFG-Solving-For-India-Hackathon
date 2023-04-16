package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import p003a2.C0092o;

public final class hq0 {

    /* renamed from: a */
    private final Context f8383a;

    /* renamed from: b */
    private final tq0 f8384b;

    /* renamed from: c */
    private final ViewGroup f8385c;

    /* renamed from: d */
    private gq0 f8386d;

    public hq0(Context context, ViewGroup viewGroup, eu0 eu0) {
        this.f8383a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f8385c = viewGroup;
        this.f8384b = eu0;
        this.f8386d = null;
    }

    /* renamed from: a */
    public final gq0 mo7988a() {
        C0092o.m309e("getAdVideoUnderlay must be called from the UI thread.");
        return this.f8386d;
    }

    /* renamed from: b */
    public final void mo7989b(int i, int i2, int i3, int i4) {
        C0092o.m309e("The underlay may only be modified from the UI thread.");
        gq0 gq0 = this.f8386d;
        if (gq0 != null) {
            gq0.mo7694m(i, i2, i3, i4);
        }
    }

    /* renamed from: c */
    public final void mo7990c(int i, int i2, int i3, int i4, int i5, boolean z, sq0 sq0) {
        if (this.f8386d == null) {
            t10.m17056a(this.f8384b.mo7134n().mo12128a(), this.f8384b.mo11070m(), "vpr2");
            Context context = this.f8383a;
            tq0 tq0 = this.f8384b;
            gq0 gq0 = new gq0(context, tq0, i5, z, tq0.mo7134n().mo12128a(), sq0);
            this.f8386d = gq0;
            this.f8385c.addView(gq0, 0, new ViewGroup.LayoutParams(-1, -1));
            int i6 = i;
            int i7 = i2;
            int i8 = i3;
            int i9 = i4;
            this.f8386d.mo7694m(i, i2, i3, i4);
            this.f8384b.mo11062X(false);
        }
    }

    /* renamed from: d */
    public final void mo7991d() {
        C0092o.m309e("onDestroy must be called from the UI thread.");
        gq0 gq0 = this.f8386d;
        if (gq0 != null) {
            gq0.mo7702v();
            this.f8385c.removeView(this.f8386d);
            this.f8386d = null;
        }
    }

    /* renamed from: e */
    public final void mo7992e() {
        C0092o.m309e("onPause must be called from the UI thread.");
        gq0 gq0 = this.f8386d;
        if (gq0 != null) {
            gq0.mo7673A();
        }
    }

    /* renamed from: f */
    public final void mo7993f(int i) {
        C0092o.m309e("setPlayerBackgroundColor must be called from the UI thread.");
        gq0 gq0 = this.f8386d;
        if (gq0 != null) {
            gq0.mo7690i(i);
        }
    }
}
