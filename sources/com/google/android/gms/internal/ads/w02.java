package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.io.InputStream;
import p054h1.C2694t;

public final class w02 extends u02 {
    public w02(Context context) {
        this.f15304f = new gi0(context, C2694t.m21612u().mo13974b(), this, this);
    }

    /* renamed from: C0 */
    public final void mo139C0(Bundle bundle) {
        bp0<InputStream> bp0;
        k12 k12;
        synchronized (this.f15300b) {
            if (!this.f15302d) {
                this.f15302d = true;
                try {
                    this.f15304f.mo7641i0().mo8959F0(this.f15303e, new t02(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    bp0 = this.f15299a;
                    k12 = new k12(1);
                } catch (Throwable th) {
                    C2694t.m21607p().mo11034s(th, "RemoteSignalsClientTask.onConnected");
                    bp0 = this.f15299a;
                    k12 = new k12(1);
                }
            }
        }
        bp0.mo5908f(k12);
    }
}
