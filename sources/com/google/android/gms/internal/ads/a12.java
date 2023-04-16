package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.io.InputStream;
import p054h1.C2694t;
import p160x1.C4280b;

public final class a12 extends u02 {

    /* renamed from: g */
    private String f3879g;

    /* renamed from: h */
    private int f3880h = 1;

    public a12(Context context) {
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
                    int i = this.f3880h;
                    if (i == 2) {
                        this.f15304f.mo7641i0().mo8961T1(this.f15303e, new t02(this));
                    } else if (i == 3) {
                        this.f15304f.mo7641i0().mo8960T0(this.f3879g, new t02(this));
                    } else {
                        this.f15299a.mo5908f(new k12(1));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    bp0 = this.f15299a;
                    k12 = new k12(1);
                    bp0.mo5908f(k12);
                } catch (Throwable th) {
                    C2694t.m21607p().mo11034s(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                    bp0 = this.f15299a;
                    k12 = new k12(1);
                    bp0.mo5908f(k12);
                }
            }
        }
    }

    /* renamed from: b */
    public final cc3<InputStream> mo5059b(vi0 vi0) {
        synchronized (this.f15300b) {
            int i = this.f3880h;
            if (i != 1 && i != 2) {
                cc3<InputStream> h = rb3.m16130h(new k12(2));
                return h;
            } else if (this.f15301c) {
                bp0<InputStream> bp0 = this.f15299a;
                return bp0;
            } else {
                this.f3880h = 2;
                this.f15301c = true;
                this.f15303e = vi0;
                this.f15304f.mo186q();
                this.f15299a.mo5905b(new y02(this), wo0.f16891f);
                bp0<InputStream> bp02 = this.f15299a;
                return bp02;
            }
        }
    }

    /* renamed from: c */
    public final cc3<InputStream> mo5060c(String str) {
        synchronized (this.f15300b) {
            int i = this.f3880h;
            if (i != 1 && i != 3) {
                cc3<InputStream> h = rb3.m16130h(new k12(2));
                return h;
            } else if (this.f15301c) {
                bp0<InputStream> bp0 = this.f15299a;
                return bp0;
            } else {
                this.f3880h = 3;
                this.f15301c = true;
                this.f3879g = str;
                this.f15304f.mo186q();
                this.f15299a.mo5905b(new z02(this), wo0.f16891f);
                bp0<InputStream> bp02 = this.f15299a;
                return bp02;
            }
        }
    }

    /* renamed from: n0 */
    public final void mo196n0(C4280b bVar) {
        io0.m11126b("Cannot connect to remote service, fallback to local instance.");
        this.f15299a.mo5908f(new k12(1));
    }
}
