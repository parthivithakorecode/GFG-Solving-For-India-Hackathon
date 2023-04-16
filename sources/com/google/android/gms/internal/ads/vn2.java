package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.Executor;

final class vn2 implements nb3<t41> {

    /* renamed from: a */
    final /* synthetic */ bd2 f16370a;

    /* renamed from: b */
    final /* synthetic */ ox2 f16371b;

    /* renamed from: c */
    final /* synthetic */ r51 f16372c;

    /* renamed from: d */
    final /* synthetic */ wn2 f16373d;

    vn2(wn2 wn2, bd2 bd2, ox2 ox2, r51 r51) {
        this.f16373d = wn2;
        this.f16370a = bd2;
        this.f16371b = ox2;
        this.f16372c = r51;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5436a(Object obj) {
        t41 t41 = (t41) obj;
        synchronized (this.f16373d) {
            this.f16373d.f16878k = null;
            this.f16373d.f16873f.removeAllViews();
            if (t41.mo6844i() != null) {
                ViewParent parent = t41.mo6844i().getParent();
                if (parent instanceof ViewGroup) {
                    String str = "";
                    if (t41.mo11409c() != null) {
                        str = t41.mo11409c().mo9702b();
                    }
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
                    sb.append("Banner view provided from ");
                    sb.append(str);
                    sb.append(" already has a parent view. Removing its old parent.");
                    io0.m11131g(sb.toString());
                    ((ViewGroup) parent).removeView(t41.mo6844i());
                }
            }
            e10 e10 = m10.f10407V5;
            if (((Boolean) C2199sw.m17001c().mo8579b(e10)).booleanValue()) {
                hf1 e = t41.mo11411e();
                e.mo7920a(this.f16373d.f16871d);
                e.mo7922c(this.f16373d.f16872e);
            }
            this.f16373d.f16873f.addView(t41.mo6844i());
            this.f16370a.mo5807a(t41);
            if (((Boolean) C2199sw.m17001c().mo8579b(e10)).booleanValue()) {
                Executor i = this.f16373d.f16869b;
                lc2 e2 = this.f16373d.f16871d;
                e2.getClass();
                i.execute(new tn2(e2));
            }
            this.f16373d.f16875h.mo9508S0(t41.mo6843h());
            if (this.f16371b != null) {
                qx2 h = this.f16373d.f16876i;
                ox2 ox2 = this.f16371b;
                ox2.mo9880d(t41.mo11413g().f5904b);
                ox2.mo9881e(t41.mo11409c().mo9702b());
                ox2.mo9883g(true);
                h.mo10426a(ox2.mo9885i());
            }
        }
    }

    /* renamed from: b */
    public final void mo5437b(Throwable th) {
        C1605cv a = this.f16372c.mo7443d().mo12172a(th);
        synchronized (this.f16373d) {
            this.f16373d.f16878k = null;
            this.f16372c.mo7444e().mo7808d(a);
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10407V5)).booleanValue()) {
                this.f16373d.f16869b.execute(new un2(this, a));
            }
            this.f16373d.f16875h.mo9508S0(60);
            zs2.m20831b(a.f5529f, th, "BannerAdLoader.onFailure");
            this.f16370a.zza();
            if (this.f16371b != null) {
                qx2 h = this.f16373d.f16876i;
                ox2 ox2 = this.f16371b;
                ox2.mo9879c(a);
                ox2.mo9883g(false);
                h.mo10426a(ox2.mo9885i());
            }
        }
    }
}
