package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.Iterator;

final class dy3 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, nb4, i14, p74, u44, n93, k53, iy3, a80, mm3 {

    /* renamed from: f */
    final /* synthetic */ gy3 f5989f;

    /* synthetic */ dy3(gy3 gy3, cy3 cy3) {
        this.f5989f = gy3;
    }

    /* renamed from: A */
    public final void mo6727A(Exception exc) {
        this.f5989f.f7909i.mo6727A(exc);
    }

    /* renamed from: C */
    public final void mo6728C(String str) {
        this.f5989f.f7909i.mo6728C(str);
    }

    /* renamed from: D */
    public final void mo6729D(long j) {
        this.f5989f.f7909i.mo6729D(j);
    }

    /* renamed from: F */
    public final void mo6730F(C1574c0 c0Var, de3 de3) {
        this.f5989f.f7915o = c0Var;
        this.f5989f.f7909i.mo6730F(c0Var, de3);
    }

    /* renamed from: N */
    public final void mo5159N(int i) {
        gy3.m10105E(this.f5989f);
    }

    /* renamed from: R */
    public final /* synthetic */ void mo5160R(int i) {
    }

    /* renamed from: X */
    public final void mo5161X(boolean z) {
    }

    /* renamed from: Y */
    public final /* synthetic */ void mo5162Y(e30 e30) {
    }

    /* renamed from: Z */
    public final void mo5163Z(boolean z, int i) {
        gy3.m10105E(this.f5989f);
    }

    /* renamed from: a */
    public final void mo6731a(boolean z) {
        if (this.f5989f.f7896B != z) {
            this.f5989f.f7896B = z;
            gy3.m10130z(this.f5989f);
        }
    }

    /* renamed from: a0 */
    public final /* synthetic */ void mo5164a0(ta0 ta0, ta0 ta02, int i) {
    }

    /* renamed from: b */
    public final void mo6732b(ry0 ry0) {
        this.f5989f.f7901G = ry0;
        this.f5989f.f7909i.mo6732b(ry0);
        Iterator it = this.f5989f.f7908h.iterator();
        while (it.hasNext()) {
            ((r80) it.next()).mo6732b(ry0);
        }
    }

    /* renamed from: b0 */
    public final /* synthetic */ void mo5165b0(ei0 ei0, int i) {
    }

    /* renamed from: c */
    public final void mo6733c(long j, int i) {
        this.f5989f.f7909i.mo6733c(j, i);
    }

    /* renamed from: c0 */
    public final /* synthetic */ void mo5166c0(boolean z, int i) {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo6734d(boolean z) {
    }

    /* renamed from: d0 */
    public final /* synthetic */ void mo5167d0(pw0 pw0) {
    }

    /* renamed from: e */
    public final void mo6735e(cd3 cd3) {
        this.f5989f.f7923w = cd3;
        this.f5989f.f7909i.mo6735e(cd3);
    }

    /* renamed from: e0 */
    public final /* synthetic */ void mo5168e0(z60 z60) {
    }

    /* renamed from: f0 */
    public final /* synthetic */ void mo5169f0(C1716fu fuVar) {
    }

    /* renamed from: g */
    public final void mo6736g(boolean z) {
        gy3.m10105E(this.f5989f);
    }

    /* renamed from: g0 */
    public final /* synthetic */ void mo5170g0(C2451zo zoVar, int i) {
    }

    /* renamed from: h */
    public final void mo6737h(int i, long j) {
        this.f5989f.f7909i.mo6737h(i, j);
    }

    /* renamed from: h0 */
    public final /* synthetic */ void mo5171h0(hm0 hm0, in0 in0) {
    }

    /* renamed from: i */
    public final void mo6738i(Exception exc) {
        this.f5989f.f7909i.mo6738i(exc);
    }

    /* renamed from: i0 */
    public final /* synthetic */ void mo5172i0(boolean z) {
    }

    /* renamed from: j0 */
    public final /* synthetic */ void mo5173j0(c10 c10) {
    }

    /* renamed from: k */
    public final void mo6739k(cd3 cd3) {
        this.f5989f.f7909i.mo6739k(cd3);
        this.f5989f.f7915o = null;
        this.f5989f.f7923w = null;
    }

    /* renamed from: l */
    public final void mo6740l(String str) {
        this.f5989f.f7909i.mo6740l(str);
    }

    /* renamed from: m */
    public final void mo6741m(cd3 cd3) {
        this.f5989f.f7924x = cd3;
        this.f5989f.f7909i.mo6741m(cd3);
    }

    /* renamed from: n */
    public final void mo6742n(Exception exc) {
        this.f5989f.f7909i.mo6742n(exc);
    }

    /* renamed from: o */
    public final /* synthetic */ void mo5174o() {
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        gy3.m10102B(this.f5989f, surfaceTexture);
        this.f5989f.m10109T(i, i2);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f5989f.m10112W((Object) null);
        this.f5989f.m10109T(0, 0);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f5989f.m10109T(i, i2);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* renamed from: p */
    public final void mo6747p(String str, long j, long j2) {
        this.f5989f.f7909i.mo6747p(str, j, j2);
    }

    /* renamed from: q */
    public final void mo6748q(cd3 cd3) {
        this.f5989f.f7909i.mo6748q(cd3);
        this.f5989f.f7916p = null;
        this.f5989f.f7924x = null;
    }

    /* renamed from: r */
    public final void mo6749r(int i, long j, long j2) {
        this.f5989f.f7909i.mo6749r(i, j, j2);
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f5989f.m10109T(i2, i3);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f5989f.m10109T(0, 0);
    }

    /* renamed from: t */
    public final void mo6753t(String str, long j, long j2) {
        this.f5989f.f7909i.mo6753t(str, j, j2);
    }

    /* renamed from: x */
    public final void mo6754x(Object obj, long j) {
        this.f5989f.f7909i.mo6754x(obj, j);
        if (this.f5989f.f7918r == obj) {
            Iterator it = this.f5989f.f7908h.iterator();
            while (it.hasNext()) {
                ((r80) it.next()).mo10224j();
            }
        }
    }

    /* renamed from: z */
    public final void mo6755z(C1574c0 c0Var, de3 de3) {
        this.f5989f.f7916p = c0Var;
        this.f5989f.f7909i.mo6755z(c0Var, de3);
    }
}
