package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import p048g2.C2635a;
import p048g2.C2637b;
import p104o1.C3821c;

public final class hg0 extends C3821c.C3823b {

    /* renamed from: a */
    private final n40 f8214a;

    /* renamed from: b */
    private final Drawable f8215b;

    /* renamed from: c */
    private final Uri f8216c;

    /* renamed from: d */
    private final double f8217d;

    public hg0(n40 n40) {
        Drawable drawable;
        double d;
        this.f8214a = n40;
        Uri uri = null;
        try {
            C2635a d2 = n40.mo8871d();
            if (d2 != null) {
                drawable = (Drawable) C2637b.m21357C0(d2);
                this.f8215b = drawable;
                uri = this.f8214a.mo8869b();
                this.f8216c = uri;
                d = this.f8214a.mo8868a();
                this.f8217d = d;
                this.f8214a.mo8872g();
                this.f8214a.mo8870c();
            }
        } catch (RemoteException e) {
            io0.m11129e("", e);
        }
        drawable = null;
        this.f8215b = drawable;
        try {
            uri = this.f8214a.mo8869b();
        } catch (RemoteException e2) {
            io0.m11129e("", e2);
        }
        this.f8216c = uri;
        try {
            d = this.f8214a.mo8868a();
        } catch (RemoteException e3) {
            io0.m11129e("", e3);
            d = 1.0d;
        }
        this.f8217d = d;
        try {
            this.f8214a.mo8872g();
        } catch (RemoteException e4) {
            io0.m11129e("", e4);
        }
        try {
            this.f8214a.mo8870c();
        } catch (RemoteException e5) {
            io0.m11129e("", e5);
        }
    }
}
