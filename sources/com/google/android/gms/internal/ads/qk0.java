package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p124r1.C3971b;

public final class qk0 implements C3971b {

    /* renamed from: a */
    private final ck0 f13216a;

    public qk0(ck0 ck0) {
        this.f13216a = ck0;
    }

    /* renamed from: a */
    public final String mo10315a() {
        ck0 ck0 = this.f13216a;
        if (ck0 != null) {
            try {
                return ck0.mo5307d();
            } catch (RemoteException e) {
                io0.m11132h("Could not forward getType to RewardItem", e);
            }
        }
        return null;
    }

    /* renamed from: b */
    public final int mo10316b() {
        ck0 ck0 = this.f13216a;
        if (ck0 != null) {
            try {
                return ck0.mo5306b();
            } catch (RemoteException e) {
                io0.m11132h("Could not forward getAmount to RewardItem", e);
            }
        }
        return 0;
    }
}
