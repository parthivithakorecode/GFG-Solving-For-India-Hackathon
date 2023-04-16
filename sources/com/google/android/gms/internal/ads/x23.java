package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;

public final class x23 {

    /* renamed from: a */
    private final byte[] f17006a;

    /* renamed from: b */
    private int f17007b;

    /* renamed from: c */
    private int f17008c;

    /* renamed from: d */
    final /* synthetic */ y23 f17009d;

    /* synthetic */ x23(y23 y23, byte[] bArr, w23 w23) {
        this.f17009d = y23;
        this.f17006a = bArr;
    }

    /* renamed from: a */
    public final x23 mo11764a(int i) {
        this.f17008c = i;
        return this;
    }

    /* renamed from: b */
    public final x23 mo11765b(int i) {
        this.f17007b = i;
        return this;
    }

    /* renamed from: c */
    public final synchronized void mo11766c() {
        try {
            y23 y23 = this.f17009d;
            if (y23.f17576b) {
                y23.f17575a.mo5661w0(this.f17006a);
                this.f17009d.f17575a.mo5658R(this.f17007b);
                this.f17009d.f17575a.mo5657A(this.f17008c);
                this.f17009d.f17575a.mo5660l0((int[]) null);
                this.f17009d.f17575a.mo5659d();
            }
        } catch (RemoteException e) {
            Log.d("GASS", "Clearcut log failed", e);
        }
    }
}
