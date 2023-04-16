package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.PushbackInputStream;

/* renamed from: com.google.android.gms.internal.ads.tq */
final class C2230tq extends PushbackInputStream {

    /* renamed from: f */
    final /* synthetic */ C2267uq f15018f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2230tq(C2267uq uqVar, InputStream inputStream, int i) {
        super(inputStream, 1);
        this.f15018f = uqVar;
    }

    public final synchronized void close() {
        C2342wq.m19116e(this.f15018f.f15693c);
        super.close();
    }
}
