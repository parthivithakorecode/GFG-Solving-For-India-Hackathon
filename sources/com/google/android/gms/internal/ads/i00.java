package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Collections;
import java.util.List;
import p048g2.C2635a;

public final class i00 extends C1683ey {

    /* renamed from: f */
    private m90 f8479f;

    /* renamed from: C3 */
    public final void mo6315C3(C2127qy qyVar) {
    }

    /* renamed from: J1 */
    public final void mo6316J1(C2635a aVar, String str) {
    }

    /* renamed from: L3 */
    public final void mo6317L3(dd0 dd0) {
    }

    /* renamed from: Q */
    public final void mo7436Q(String str) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo8050a() {
        m90 m90 = this.f8479f;
        if (m90 != null) {
            try {
                m90.mo8642K2(Collections.emptyList());
            } catch (RemoteException e) {
                io0.m11132h("Could not notify onComplete event.", e);
            }
        }
    }

    /* renamed from: a1 */
    public final void mo6318a1(n00 n00) {
    }

    /* renamed from: a4 */
    public final void mo6319a4(String str, C2635a aVar) {
    }

    /* renamed from: b */
    public final float mo7437b() {
        return 1.0f;
    }

    /* renamed from: d */
    public final String mo6320d() {
        return "";
    }

    /* renamed from: d3 */
    public final void mo6321d3(m90 m90) {
        this.f8479f = m90;
    }

    /* renamed from: e */
    public final List<f90> mo6322e() {
        return Collections.emptyList();
    }

    /* renamed from: h */
    public final void mo6323h() {
    }

    /* renamed from: i */
    public final void mo6324i() {
        io0.m11128d("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        bo0.f4987b.post(new h00(this));
    }

    /* renamed from: i4 */
    public final void mo6325i4(float f) {
    }

    /* renamed from: q */
    public final boolean mo7438q() {
        return false;
    }

    /* renamed from: v4 */
    public final void mo7439v4(String str) {
    }

    /* renamed from: x0 */
    public final void mo6326x0(boolean z) {
    }
}
