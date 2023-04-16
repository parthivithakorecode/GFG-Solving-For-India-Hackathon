package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import p048g2.C2638c;

public final class j60 extends C2638c<s40> {
    public j60() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo8020a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return queryLocalInterface instanceof s40 ? (s40) queryLocalInterface : new r40(iBinder);
    }
}
