package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.pc */
public final class C2068pc extends C2106qd {

    /* renamed from: i */
    private final Activity f12600i;

    /* renamed from: j */
    private final View f12601j;

    public C2068pc(C1735gc gcVar, String str, String str2, C1842j8 j8Var, int i, int i2, View view, Activity activity) {
        super(gcVar, "VJibBREzYucPjNukhWG65jB60OIZQrcDVR3W2JV3G5ynshQ4Nd74pHrZYUgRiYK0", "TiANcug5zndviERrHpzUihvZthrd+vHCK5ngnbrocVE=", j8Var, i, 62);
        this.f12601j = view;
        this.f12600i = activity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5238a() {
        if (this.f12601j != null) {
            boolean booleanValue = ((Boolean) C2199sw.m17001c().mo8579b(m10.f10355P1)).booleanValue();
            Object[] objArr = (Object[]) this.f13134f.invoke((Object) null, new Object[]{this.f12601j, this.f12600i, Boolean.valueOf(booleanValue)});
            synchronized (this.f13133e) {
                this.f13133e.mo8387U(((Long) objArr[0]).longValue());
                this.f13133e.mo8389W(((Long) objArr[1]).longValue());
                if (booleanValue) {
                    this.f13133e.mo8388V((String) objArr[2]);
                }
            }
        }
    }
}
