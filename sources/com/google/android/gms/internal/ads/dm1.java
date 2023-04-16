package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import p048g2.C2635a;
import p048g2.C2637b;

public final class dm1 extends j40 {

    /* renamed from: f */
    private final rm1 f5837f;

    /* renamed from: g */
    private C2635a f5838g;

    public dm1(rm1 rm1) {
        this.f5837f = rm1;
    }

    /* renamed from: z5 */
    private static float m7920z5(C2635a aVar) {
        Drawable drawable;
        if (aVar == null || (drawable = (Drawable) C2637b.m21357C0(aVar)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return ((float) drawable.getIntrinsicWidth()) / ((float) drawable.getIntrinsicHeight());
    }

    /* renamed from: C1 */
    public final void mo6506C1(s50 s50) {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10302I4)).booleanValue() && (this.f5837f.mo10564R() instanceof bv0)) {
            ((bv0) this.f5837f.mo10564R()).mo5964F5(s50);
        }
    }

    /* renamed from: V */
    public final void mo6507V(C2635a aVar) {
        this.f5838g = aVar;
    }

    /* renamed from: b */
    public final float mo6508b() {
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10294H4)).booleanValue()) {
            return 0.0f;
        }
        if (this.f5837f.mo10556J() != 0.0f) {
            return this.f5837f.mo10556J();
        }
        if (this.f5837f.mo10564R() != null) {
            try {
                return this.f5837f.mo10564R().mo5571b();
            } catch (RemoteException e) {
                io0.m11129e("Remote exception getting video controller aspect ratio.", e);
                return 0.0f;
            }
        } else {
            C2635a aVar = this.f5838g;
            if (aVar != null) {
                return m7920z5(aVar);
            }
            n40 U = this.f5837f.mo10567U();
            if (U == null) {
                return 0.0f;
            }
            float g = (U.mo8872g() == -1 || U.mo8870c() == -1) ? 0.0f : ((float) U.mo8872g()) / ((float) U.mo8870c());
            return g == 0.0f ? m7920z5(U.mo8871d()) : g;
        }
    }

    /* renamed from: d */
    public final float mo6509d() {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10302I4)).booleanValue() && this.f5837f.mo10564R() != null) {
            return this.f5837f.mo10564R().mo5572d();
        }
        return 0.0f;
    }

    /* renamed from: e */
    public final float mo6510e() {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10302I4)).booleanValue() && this.f5837f.mo10564R() != null) {
            return this.f5837f.mo10564R().mo5573e();
        }
        return 0.0f;
    }

    /* renamed from: f */
    public final C1609cz mo6511f() {
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10302I4)).booleanValue()) {
            return null;
        }
        return this.f5837f.mo10564R();
    }

    /* renamed from: h */
    public final C2635a mo6512h() {
        C2635a aVar = this.f5838g;
        if (aVar != null) {
            return aVar;
        }
        n40 U = this.f5837f.mo10567U();
        if (U == null) {
            return null;
        }
        return U.mo8871d();
    }

    /* renamed from: j */
    public final boolean mo6513j() {
        return ((Boolean) C2199sw.m17001c().mo8579b(m10.f10302I4)).booleanValue() && this.f5837f.mo10564R() != null;
    }
}
