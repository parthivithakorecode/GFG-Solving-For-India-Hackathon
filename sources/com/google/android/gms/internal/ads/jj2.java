package com.google.android.gms.internal.ads;

import p054h1.C2694t;
import p069j1.C3202r1;

public final /* synthetic */ class jj2 implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ ij2 f9161f;

    /* renamed from: g */
    public final /* synthetic */ long f9162g;

    public /* synthetic */ jj2(ij2 ij2, long j) {
        this.f9161f = ij2;
        this.f9162g = j;
    }

    public final void run() {
        ij2 ij2 = this.f9161f;
        long j = this.f9162g;
        String canonicalName = ij2.getClass().getCanonicalName();
        long b = C2694t.m21592a().mo12463b();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 40);
        sb.append("Signal runtime : ");
        sb.append(canonicalName);
        sb.append(" = ");
        sb.append(b - j);
        C3202r1.m24015k(sb.toString());
    }
}
