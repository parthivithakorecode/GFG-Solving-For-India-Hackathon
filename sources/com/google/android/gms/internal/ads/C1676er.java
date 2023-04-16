package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.er */
public final class C1676er {

    /* renamed from: a */
    private final byte[] f6332a;

    /* renamed from: b */
    private int f6333b;

    /* renamed from: c */
    final /* synthetic */ C1713fr f6334c;

    /* synthetic */ C1676er(C1713fr frVar, byte[] bArr, C1638dr drVar) {
        this.f6334c = frVar;
        this.f6332a = bArr;
    }

    /* renamed from: a */
    public final C1676er mo7036a(int i) {
        this.f6333b = i;
        return this;
    }

    /* renamed from: b */
    public final synchronized void mo7037b() {
        try {
            C1713fr frVar = this.f6334c;
            if (frVar.f6893b) {
                frVar.f6892a.mo6132w0(this.f6332a);
                this.f6334c.f6892a.mo6128R(0);
                this.f6334c.f6892a.mo6127A(this.f6333b);
                this.f6334c.f6892a.mo6131l0((int[]) null);
                this.f6334c.f6892a.mo6129d();
            }
        } catch (RemoteException e) {
            io0.m11127c("Clearcut log failed", e);
        }
    }
}
