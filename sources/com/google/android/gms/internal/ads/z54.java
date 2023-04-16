package com.google.android.gms.internal.ads;

import java.io.IOException;

public final /* synthetic */ class z54 implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ c64 f18042f;

    /* renamed from: g */
    public final /* synthetic */ d64 f18043g;

    /* renamed from: h */
    public final /* synthetic */ k54 f18044h;

    /* renamed from: i */
    public final /* synthetic */ p54 f18045i;

    /* renamed from: j */
    public final /* synthetic */ IOException f18046j;

    /* renamed from: k */
    public final /* synthetic */ boolean f18047k;

    public /* synthetic */ z54(c64 c64, d64 d64, k54 k54, p54 p54, IOException iOException, boolean z) {
        this.f18042f = c64;
        this.f18043g = d64;
        this.f18044h = k54;
        this.f18045i = p54;
        this.f18046j = iOException;
        this.f18047k = z;
    }

    public final void run() {
        c64 c64 = this.f18042f;
        this.f18043g.mo5724v(c64.f5322a, c64.f5323b, this.f18044h, this.f18045i, this.f18046j, this.f18047k);
    }
}
