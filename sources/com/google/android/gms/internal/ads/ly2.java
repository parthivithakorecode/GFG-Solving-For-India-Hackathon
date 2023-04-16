package com.google.android.gms.internal.ads;

import android.view.View;

public abstract class ly2 {
    /* renamed from: a */
    public static ly2 m12984a(my2 my2, ny2 ny2) {
        if (iy2.m11366b()) {
            return new py2(my2, ny2);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    /* renamed from: b */
    public abstract void mo9093b(View view, ry2 ry2, String str);

    /* renamed from: c */
    public abstract void mo9094c();

    /* renamed from: d */
    public abstract void mo9095d(View view);

    /* renamed from: e */
    public abstract void mo9096e();
}
