package p061i1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.C2199sw;
import com.google.android.gms.internal.ads.C2420yu;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.pi1;
import com.google.android.gms.internal.ads.yg0;
import p048g2.C2635a;
import p054h1.C2694t;

/* renamed from: i1.x */
public final class C2825x extends yg0 {

    /* renamed from: f */
    private final AdOverlayInfoParcel f19517f;

    /* renamed from: g */
    private final Activity f19518g;

    /* renamed from: h */
    private boolean f19519h = false;

    /* renamed from: i */
    private boolean f19520i = false;

    public C2825x(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f19517f = adOverlayInfoParcel;
        this.f19518g = activity;
    }

    /* renamed from: a */
    private final synchronized void m22298a() {
        if (!this.f19520i) {
            C2818q qVar = this.f19517f.f3716h;
            if (qVar != null) {
                qVar.mo5643D(4);
            }
            this.f19520i = true;
        }
    }

    /* renamed from: K */
    public final void mo11829K(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f19519h);
    }

    /* renamed from: L */
    public final boolean mo11830L() {
        return false;
    }

    /* renamed from: V */
    public final void mo11831V(C2635a aVar) {
    }

    /* renamed from: f */
    public final void mo11832f() {
    }

    /* renamed from: k */
    public final void mo11833k() {
        if (this.f19518g.isFinishing()) {
            m22298a();
        }
    }

    /* renamed from: l */
    public final void mo11834l() {
        if (this.f19519h) {
            this.f19518g.finish();
            return;
        }
        this.f19519h = true;
        C2818q qVar = this.f19517f.f3716h;
        if (qVar != null) {
            qVar.mo5644M3();
        }
    }

    /* renamed from: m */
    public final void mo11835m() {
        C2818q qVar = this.f19517f.f3716h;
        if (qVar != null) {
            qVar.mo5655u5();
        }
        if (this.f19518g.isFinishing()) {
            m22298a();
        }
    }

    /* renamed from: n */
    public final void mo11836n() {
    }

    /* renamed from: p */
    public final void mo11837p() {
        if (this.f19518g.isFinishing()) {
            m22298a();
        }
    }

    /* renamed from: q */
    public final void mo11838q() {
        C2818q qVar = this.f19517f.f3716h;
        if (qVar != null) {
            qVar.mo5647b();
        }
    }

    /* renamed from: r2 */
    public final void mo11839r2(Bundle bundle) {
        C2818q qVar;
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10658y6)).booleanValue()) {
            this.f19518g.requestWindowFeature(1);
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f19517f;
        if (adOverlayInfoParcel != null && !z) {
            if (bundle == null) {
                C2420yu yuVar = adOverlayInfoParcel.f3715g;
                if (yuVar != null) {
                    yuVar.mo25L();
                }
                pi1 pi1 = this.f19517f.f3713D;
                if (pi1 != null) {
                    pi1.mo8182r();
                }
                if (!(this.f19518g.getIntent() == null || !this.f19518g.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) || (qVar = this.f19517f.f3716h) == null)) {
                    qVar.mo5646a();
                }
            }
            C2694t.m21601j();
            Activity activity = this.f19518g;
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f19517f;
            C2807f fVar = adOverlayInfoParcel2.f3714f;
            if (C2800a.m22247b(activity, fVar, adOverlayInfoParcel2.f3722n, fVar.f19476n)) {
                return;
            }
        }
        this.f19518g.finish();
    }

    /* renamed from: t */
    public final void mo11840t() {
    }

    /* renamed from: u4 */
    public final void mo11841u4(int i, int i2, Intent intent) {
    }

    /* renamed from: x */
    public final void mo11842x() {
    }
}
