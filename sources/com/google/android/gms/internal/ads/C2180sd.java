package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.sd */
public final /* synthetic */ class C2180sd implements PackageManager.OnChecksumsReadyListener {

    /* renamed from: a */
    public final /* synthetic */ kc3 f14406a;

    public /* synthetic */ C2180sd(kc3 kc3) {
        this.f14406a = kc3;
    }

    public final void onChecksumsReady(List list) {
        kc3 kc3 = this.f14406a;
        if (list == null) {
            kc3.mo7554w(null);
            return;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ApkChecksum apkChecksum = (ApkChecksum) list.get(i);
                if (apkChecksum.getType() == 8) {
                    kc3.mo7554w(C1846jc.m11553c(apkChecksum.getValue()));
                    return;
                }
            }
            kc3.mo7554w(null);
        } catch (Throwable unused) {
            kc3.mo7554w(null);
        }
    }
}
