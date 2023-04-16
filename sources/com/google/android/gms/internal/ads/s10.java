package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import javax.annotation.ParametersAreNonnullByDefault;

@Deprecated
@ParametersAreNonnullByDefault
public final class s10 {
    /* renamed from: a */
    public static final void m16564a(r10 r10, p10 p10) {
        if (p10.mo9921a() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        } else if (!TextUtils.isEmpty(p10.mo9922b())) {
            r10.mo10451d(p10.mo9921a(), p10.mo9922b(), p10.mo9923c(), p10.mo9924d());
        } else {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
    }
}
