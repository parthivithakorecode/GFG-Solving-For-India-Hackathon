package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import p104o1.C3821c;

public final class gg0 extends C3821c.C3822a {

    /* renamed from: a */
    private final List<C3821c.C3823b> f7466a = new ArrayList();

    /* renamed from: b */
    private String f7467b;

    public gg0(g40 g40) {
        try {
            this.f7467b = g40.mo6381e();
        } catch (RemoteException e) {
            io0.m11129e("", e);
            this.f7467b = "";
        }
        try {
            for (n40 next : g40.mo6382f()) {
                n40 z5 = next instanceof IBinder ? m40.m13048z5((IBinder) next) : null;
                if (z5 != null) {
                    this.f7466a.add(new hg0(z5));
                }
            }
        } catch (RemoteException e2) {
            io0.m11129e("", e2);
        }
    }
}
