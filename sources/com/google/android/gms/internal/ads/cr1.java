package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

public final class cr1 implements t70<Object> {

    /* renamed from: a */
    private final o50 f5499a;

    /* renamed from: b */
    private final rr1 f5500b;

    /* renamed from: c */
    private final ev3<yq1> f5501c;

    public cr1(cn1 cn1, rm1 rm1, rr1 rr1, ev3<yq1> ev3) {
        this.f5499a = cn1.mo6229c(rm1.mo10585g0());
        this.f5500b = rr1;
        this.f5501c = ev3;
    }

    /* renamed from: a */
    public final void mo5150a(Object obj, Map<String, String> map) {
        String str = map.get("asset");
        try {
            this.f5499a.mo9131F2(this.f5501c.mo7166a(), str);
        } catch (RemoteException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(".");
            io0.m11132h(sb.toString(), e);
        }
    }

    /* renamed from: b */
    public final void mo6273b() {
        if (this.f5499a != null) {
            this.f5500b.mo10659i("/nativeAdCustomClick", this);
        }
    }
}
