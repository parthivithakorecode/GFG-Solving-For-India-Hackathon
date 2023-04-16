package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import p048g2.C2637b;
import p048g2.C2638c;

public final class wg0 extends C2638c<ch0> {
    public wg0() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo8020a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof ch0 ? (ch0) queryLocalInterface : new ah0(iBinder);
    }

    /* renamed from: c */
    public final zg0 mo11651c(Activity activity) {
        try {
            IBinder zze = ((ch0) mo12521b(activity)).zze(C2637b.m21358Z2(activity));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return queryLocalInterface instanceof zg0 ? (zg0) queryLocalInterface : new xg0(zze);
        } catch (RemoteException e) {
            io0.m11132h("Could not create remote AdOverlay.", e);
            return null;
        } catch (C2638c.C2639a e2) {
            io0.m11132h("Could not create remote AdOverlay.", e2);
            return null;
        }
    }
}
