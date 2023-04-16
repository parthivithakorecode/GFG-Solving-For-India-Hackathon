package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import p026d1.C2472d;
import p048g2.C2635a;
import p048g2.C2637b;

public final class o40 extends C2472d {

    /* renamed from: a */
    private final n40 f11875a;

    /* renamed from: b */
    private final Drawable f11876b;

    /* renamed from: c */
    private final Uri f11877c;

    /* renamed from: d */
    private final double f11878d;

    /* renamed from: e */
    private final int f11879e;

    /* renamed from: f */
    private final int f11880f;

    public o40(n40 n40) {
        Drawable drawable;
        double d;
        int i;
        this.f11875a = n40;
        Uri uri = null;
        try {
            C2635a d2 = n40.mo8871d();
            if (d2 != null) {
                drawable = (Drawable) C2637b.m21357C0(d2);
                this.f11876b = drawable;
                uri = this.f11875a.mo8869b();
                this.f11877c = uri;
                d = this.f11875a.mo8868a();
                this.f11878d = d;
                int i2 = -1;
                i = this.f11875a.mo8872g();
                this.f11879e = i;
                i2 = this.f11875a.mo8870c();
                this.f11880f = i2;
            }
        } catch (RemoteException e) {
            io0.m11129e("", e);
        }
        drawable = null;
        this.f11876b = drawable;
        try {
            uri = this.f11875a.mo8869b();
        } catch (RemoteException e2) {
            io0.m11129e("", e2);
        }
        this.f11877c = uri;
        try {
            d = this.f11875a.mo8868a();
        } catch (RemoteException e3) {
            io0.m11129e("", e3);
            d = 1.0d;
        }
        this.f11878d = d;
        int i22 = -1;
        try {
            i = this.f11875a.mo8872g();
        } catch (RemoteException e4) {
            io0.m11129e("", e4);
            i = -1;
        }
        this.f11879e = i;
        try {
            i22 = this.f11875a.mo8870c();
        } catch (RemoteException e5) {
            io0.m11129e("", e5);
        }
        this.f11880f = i22;
    }

    /* renamed from: a */
    public final Drawable mo9642a() {
        return this.f11876b;
    }

    /* renamed from: b */
    public final double mo9643b() {
        return this.f11878d;
    }

    /* renamed from: c */
    public final Uri mo9644c() {
        return this.f11877c;
    }

    /* renamed from: d */
    public final int mo9645d() {
        return this.f11880f;
    }

    /* renamed from: e */
    public final int mo9646e() {
        return this.f11879e;
    }
}
