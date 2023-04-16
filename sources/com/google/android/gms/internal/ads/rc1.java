package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

public final class rc1 extends lg1<o03> implements s60 {

    /* renamed from: g */
    private final Bundle f13586g = new Bundle();

    public rc1(Set<hi1<o03>> set) {
        super(set);
    }

    /* renamed from: S0 */
    public final synchronized Bundle mo10502S0() {
        return new Bundle(this.f13586g);
    }

    /* renamed from: t */
    public final synchronized void mo9006t(String str, Bundle bundle) {
        this.f13586g.putAll(bundle);
        mo8947Q0(qc1.f13125a);
    }
}
